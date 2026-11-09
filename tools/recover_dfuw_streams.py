"""Recover verified DFUW archive entries from byte-identical reference assets."""

import argparse
import bz2
from collections import Counter, defaultdict
import hashlib
import json
from pathlib import Path

from darkfall_roa_finish_class_recovery import validate_class
from extract_updated_sfads import destination, looks_like_xml


def xor(left, right):
    return bytes(a ^ b for a, b in zip(left, right))


def variants(data):
    yield data
    if b"\n" in data and b"\x00" not in data:
        lf = data.replace(b"\r\n", b"\n")
        if lf != data:
            yield lf
        crlf = lf.replace(b"\n", b"\r\n")
        if crlf != data:
            yield crlf


def unpack(record, encrypted, stream):
    if len(stream) < len(encrypted):
        raise ValueError("not enough verified stream bytes")
    packed = xor(encrypted, stream)
    if not packed.startswith((b"SFZM1AY&SY", b"SFZM\x17rE8P\x90")):
        raise ValueError("invalid SFZM framing")
    decoder = bz2.BZ2Decompressor()
    data = decoder.decompress(b"BZh9" + packed[4:], max_length=record["uncompressed_size"] + 1)
    if not decoder.eof or decoder.unused_data or len(data) != record["uncompressed_size"]:
        raise ValueError("incomplete stream or decoded size mismatch")
    name = record["name"]
    if name.endswith(".class"):
        declared = validate_class(data)
        if declared.casefold() != name.removeprefix("classes/").removesuffix(".class").casefold():
            raise ValueError("declared Java class does not match archive path")
    elif name.endswith(".xml") and not looks_like_xml(data):
        raise ValueError("decoded XML does not have an opening tag")
    return data


def payload(snapshot, record):
    data = destination(snapshot, record["output"]).read_bytes()
    if len(data) != record["stored_size"] or hashlib.sha256(data).hexdigest() != record["sha256"]:
        raise ValueError("stored DFUW payload does not match its extraction manifest: " + record["name"])
    return data


def streams_for(snapshot, rows, references, seeds):
    prefix = xor(payload(snapshot, rows[-1]), b"SFZM1AY&SY")
    best = b""
    sources = []
    for i, record in enumerate(rows):
        if record["stored_size"] <= len(best):
            break
        name = record["name"]
        candidates = [root / name for root in references] + seeds.get(name, [])
        for path in candidates:
            if not path.is_file():
                continue
            for original in variants(path.read_bytes()):
                if len(original) != record["uncompressed_size"]:
                    continue
                packed = b"SFZM" + bz2.compress(original)[4:]
                if len(packed) != record["stored_size"]:
                    continue
                stream = xor(payload(snapshot, record), packed)
                if not stream.startswith(prefix) or not stream.startswith(best):
                    continue
                others = [r for r in rows[i+1:] if r["stored_size"] <= len(stream)]
                samples = list({r["record"]:r for r in others[:8] + others[-8:]}.values())
                verified = []
                for other in samples:
                    try:
                        unpack(other, payload(snapshot, other), stream)
                    except (ValueError, OSError, EOFError):
                        continue
                    verified.append(other["stored_size"])
                if len(verified) < 2 or max(verified) < len(stream) // 3:
                    continue
                best = stream
                sources.append({"record": name, "reference": str(path), "bytes": len(best),
                                "independent_samples": len(verified)})
                break
            if len(best) == record["stored_size"]:
                break
    return best, sources


def extend_from_trailers(snapshot, rows, stream):
    extensions = []
    if len(stream) < 14:
        return stream, extensions
    for record in sorted(rows, key=lambda r: r["stored_size"]):
        missing = record["stored_size"] - len(stream)
        if missing <= 0:
            continue
        if missing > 10:
            break
        encrypted = payload(snapshot, record)
        packed = xor(encrypted, stream)
        if not packed.startswith(b"SFZM1AY&SY"):
            continue
        # A single-block bzip stream repeats its block CRC in the end marker.
        trailer = int.from_bytes(b"\x17rE8P\x90" + packed[10:14], "big")
        candidates = set()
        for padding in range(8):
            tail = (trailer << padding).to_bytes(10 + bool(padding), "big")
            overlap = len(tail) - missing
            if overlap:
                known = packed[-overlap:]
                mask = (1 << padding) - 1 if padding else 0xff
                if (known[0] ^ tail[0]) & mask or known[1:] != tail[1:overlap]:
                    continue
            candidate = stream + xor(encrypted[-missing:], tail[-missing:])
            try:
                unpack(record, encrypted, candidate)
            except (ValueError, OSError, EOFError):
                continue
            candidates.add(candidate)
        if len(candidates) == 1:
            stream = candidates.pop()
            extensions.append({"record": record["name"], "bytes_added": missing})
    return stream, extensions


def bzip_crc(data):
    table = []
    for value in range(256):
        crc = value << 24
        for _ in range(8):
            crc = ((crc << 1) ^ (0x04c11db7 if crc & 0x80000000 else 0)) & 0xffffffff
        table.append(crc)
    crc = 0xffffffff
    for value in data:
        crc = ((crc << 8) & 0xffffffff) ^ table[(crc >> 24) ^ value]
    return crc ^ 0xffffffff


def first_verified_block(snapshot, record, stream):
    packed = xor(payload(snapshot, record), stream)
    if not packed.startswith(b"SFZM1AY&SY"):
        return None
    decoder = bz2.BZ2Decompressor()
    try:
        data = decoder.decompress(b"BZh9" + packed[4:], max_length=record["uncompressed_size"])
    except (OSError, ValueError, EOFError):
        return None
    if not data or decoder.eof or len(data) >= record["uncompressed_size"]:
        return None
    return data if bzip_crc(data) == int.from_bytes(packed[10:14], "big") else None


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("snapshot", type=Path)
    parser.add_argument("--reference", type=Path, action="append", default=[])
    parser.add_argument("--seed", nargs=2, action="append", default=[], metavar=("ARCHIVE_PATH", "REFERENCE_FILE"))
    parser.add_argument("--partial-blocks", action="store_true")
    args = parser.parse_args()
    root = args.snapshot.resolve()
    seeds = defaultdict(list)
    for name, path in args.seed:
        seeds[name].append(Path(path))
    groups = defaultdict(list)
    with (root / "manifest.jsonl").open(encoding="utf-8") as manifest:
        for line in manifest:
            row = json.loads(line)
            if row["status"] == "encrypted_unknown_key":
                groups[row["key_id"]].append(row)
    counts = Counter()
    summary = {}
    partial = []
    with (root / "protected-recovery.jsonl").open("w", encoding="utf-8") as log:
        for group, rows in sorted(groups.items()):
            rows.sort(key=lambda r: (-r["stored_size"], r["name"]))
            stream, sources = streams_for(root, rows, args.reference, seeds)
            stream, extensions = extend_from_trailers(root, rows, stream)
            status = Counter()
            for record in rows:
                row = {"name": record["name"], "key_id": group, "record": record["record"]}
                if not stream or record["stored_size"] > len(stream):
                    row["status"] = "not_covered"
                    if args.partial_blocks and stream and record["name"].endswith(".xml"):
                        block = first_verified_block(root, record, stream)
                        if block:
                            target = destination(root / "partial-verified", record["name"] + ".partial")
                            target.parent.mkdir(exist_ok=True, parents=True)
                            if not target.is_file():
                                with target.open("xb") as output:
                                    output.write(block)
                            if target.read_bytes() != block:
                                raise ValueError("partial data conflicts with " + str(target))
                            row["partial_first_block"] = dict(output=str(target.relative_to(root)), bytes=len(block),
                                full_size=record["uncompressed_size"], sha256=hashlib.sha256(block).hexdigest())
                            partial.append({"name": row["name"], **row["partial_first_block"]})
                else:
                    encrypted = payload(root, record)
                    try:
                        data = unpack(record, encrypted, stream)
                    except (ValueError, OSError, EOFError) as error:
                        row.update(status="not_verified", reason=str(error))
                    else:
                        target = destination(root / "assets", record["name"])
                        target.parent.mkdir(exist_ok=True, parents=True)
                        if not target.is_file():
                            with target.open("xb") as output:
                                output.write(data)
                        if target.read_bytes() != data:
                            raise ValueError("decoded data conflicts with " + str(target))
                        row.update(status="recovered", bytes=len(data), sha256=hashlib.sha256(data).hexdigest())
                        counts[Path(record["name"]).suffix.lower()] += 1
                status[row["status"]] += 1
                log.write(json.dumps(row) + "\n")
            summary[group] = {"entries": len(rows), "stream_bytes": len(stream), **status,
                              "references": sources, "trailer_extensions": extensions}
            print("Group", group, dict(status), flush=True)
    recovered = sum(counts.values())
    report = {"recovered": recovered, "remaining": sum(map(len, groups.values())) - recovered,
              "by_extension": dict(counts), "groups": summary, "keys_recovered": 0,
              "partial_first_blocks": partial}
    (root / "protected-recovery.json").write_text(json.dumps(report, indent=2) + "\n", encoding="utf-8")
    print(f"Verified {recovered} decoded files. Still protected: {report['remaining']}.", flush=True)


if __name__ == "__main__":
    main()
