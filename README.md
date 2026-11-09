# DFUW SOURCE
ORIGINAL **DFUW STEAM FILES** Google Drive 7.77gb https://drive.google.com/file/d/1iXpDu7PiSjbrWiWsdKzVC8oNGA8Mmac6/view?usp=sharing
Recovered **Darkfall Unholy Wars** client files and decompiled Java, from the
DFUWDeek archive snapshot. This is not an official source-code release, a complete
server implementation, or a verified buildable game project.

## Download Everything

The complete ZIP contains all **182,900 available decoded archive assets**, the
full Java recovery directory (selected source, alternate decompiler output,
bytecode catalog and recovery logs), partial recoveries, and extraction reports.

Get the numbered ZIP parts and `release-manifest.json` from
[the release](https://github.com/dtmajors/DFUW-SOURCE/releases/tag/recovered-2026-11-09).
Put the downloads together in one directory, then run:

```sh
python tools/join-download.py --directory /path/to/downloads
```

The helper verifies every part and reconstructs **DFUW-SOURCE-complete.zip**,
then verifies the complete ZIP's SHA-256. The ZIP is split only because of
GitHub's per-file release upload limit. It is one ordinary ZIP64 archive once
joined. Extract it with a ZIP64-capable archive application.

## Browse the Repository

| Directory | Contents |
| --- | --- |
| `java-source/src/` | 15,086 selected decompiled Java files; original obfuscated names retained |
| `java-source/catalog/` | Bytecode members, dependencies and strings |
| `assets/classes/` | Recovered bytecode and accompanying class resources |
| `assets/xml/`, `assets/xml-files/` | Available definitions, UI/configuration and related text files |
| `partial-verified/` | Two explicitly incomplete XML recoveries; not drop-in replacements |
| `recovery/` | Extraction manifests, recovery status and FileKey trace |

Large binary collections (models, textures, animations, audio, levels, collision,
GUI art and shader caches) are in the complete ZIP rather than Git history.
All repository source/definitions are also present in that ZIP.

## Completeness and Verification

- Original archive: **183,143 records**.
- Fully recovered protected records: **19,916**; actual encryption keys recovered: **0**.
- Still unavailable: **243 records**: 148 Java classes, 44 XML/quadtree files,
  28 shader files and 23 scripts. See `recovery/protected-recovery.jsonl` for
  exact names and status. These encrypted originals are **not** included as
  falsely labeled decoded content.
- The first Java decompilation pass covered 15,085 classes; the supplemental
  recovery report accounts for the additional `mvg` class, giving **15,086**.
- Extraction/recovery reports describe hash, structure and decompression checks.
  Java decompilation does **not** establish compilability or behavioral identity.
- The complete ZIP is read back with every member's CRC checked before upload.
  Release parts and the reconstructed archive have SHA-256 checksums.

No live account credentials, memory dumps, runtime diagnostic clients, encrypted
unknown payloads or unrelated Darkfall Eternal files are included. The original
game installation is not modified by preparing this snapshot.

## Rights

Game code and assets retain their existing owners' rights. No new license to
third-party game material is granted by this repository. Preserve embedded
copyright and license notices.
