"""Join and verify the DFUW SOURCE release parts; Python standard library only."""
import argparse
import hashlib
import json
from pathlib import Path


def sha256(path):
    value = hashlib.sha256()
    with path.open("rb") as stream:
        for chunk in iter(lambda: stream.read(8 * 1024 * 1024), b""):
            value.update(chunk)
    return value.hexdigest()


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--directory", type=Path, default=Path.cwd())
    args = parser.parse_args()
    directory = args.directory.resolve()
    manifest = json.loads((directory / "release-manifest.json").read_text())
    name = manifest["archive"]["name"]
    if Path(name).name != name:
        raise SystemExit("Invalid archive name.")
    destination = directory / name
    if destination.exists():
        if sha256(destination) == manifest["archive"]["sha256"]:
            print(f"Already complete and verified: {destination}")
            return
        raise SystemExit("An existing archive does not match; refusing to overwrite it.")
    for part in manifest["parts"]:
        if Path(part["name"]).name != part["name"]:
            raise SystemExit("Invalid part name.")
        path = directory / part["name"]
        if not path.is_file() or path.stat().st_size != part["bytes"] or sha256(path) != part["sha256"]:
            raise SystemExit(f"Missing or damaged part: {path.name}")
    with destination.open("xb") as output:
        for part in manifest["parts"]:
            print(f"Joining {part['name']}...", flush=True)
            with (directory / part["name"]).open("rb") as stream:
                for chunk in iter(lambda: stream.read(8 * 1024 * 1024), b""):
                    output.write(chunk)
    if destination.stat().st_size != manifest["archive"]["bytes"] or sha256(destination) != manifest["archive"]["sha256"]:
        raise SystemExit("Complete archive verification failed; do not extract it.")
    print(f"Complete and verified: {destination}")


if __name__ == "__main__":
    main()
