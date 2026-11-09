"""Focused, read-only PE instruction/xref inspection for the DFUW key path."""
import argparse
import re
import struct
from pathlib import Path

import capstone
import pefile


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("binary", type=Path)
    parser.add_argument("mode", choices=["dump", "refs"])
    parser.add_argument("addresses", nargs="+", type=lambda x: int(x, 16))
    parser.add_argument("--length", type=int, default=350)
    args = parser.parse_args()
    raw = args.binary.read_bytes()
    pe = pefile.PE(data=raw)
    base = pe.OPTIONAL_HEADER.ImageBase
    dis = capstone.Cs(capstone.CS_ARCH_X86, capstone.CS_MODE_32)
    for va in args.addresses:
        print("\n===", args.binary.name, hex(va))
        if args.mode == "dump":
            off = pe.get_offset_from_rva(va - base)
            for i in dis.disasm(raw[off:off + args.length], va):
                print(hex(i.address), i.mnemonic, i.op_str)
        else:
            for match in re.finditer(re.escape(struct.pack("<I", va)), raw):
                print("pointer", hex(base + pe.get_rva_from_offset(match.start())))
            for sec in pe.sections:
                if not sec.Characteristics & 0x20000000:
                    continue
                data = sec.get_data()
                secva = base + sec.VirtualAddress
                for match in re.finditer(b"[\xe8\xe9]", data):
                    pos = match.start()
                    if pos + 5 <= len(data):
                        target = secva + pos + 5 + struct.unpack_from("<i", data, pos + 1)[0]
                        if target == va:
                            print("relative", hex(secva + pos), "call" if data[pos] == 0xe8 else "jmp")


if __name__ == "__main__":
    main()
