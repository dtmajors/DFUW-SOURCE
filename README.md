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

# Legal Disclaimer & Notice

## Notice to Copyright Holders
This repository is dedicated to the historical preservation and educational study of the client-side architecture of **Darkfall: Rise of Agon**. 

If you are a copyright holder—including **Big Picture Games**, **Toxic Rain Studios**, or associated entities—and object to the hosting of these decompiled files or extracted assets, please contact the repository maintainer directly or submit a formal request. The material will be **removed immediately**. This project has no commercial intent and wishes to fully respect your intellectual property rights.

## Source & Scope of Material
* **Third-Party Provenance:** The repository maintainer is **merely sharing these files** as an archival resource. The maintainer **did not perform the reverse engineering, extraction, or decompilation** of the source code or assets contained herein. 
* **Client-Side Only:** The files consist strictly of extracted client-side configurations, assets, and decompiled Java source code from the public, end-user client. This repository does **not** contain server-side code or proprietary backend architecture.
* **Archival Purpose:** This code is shared strictly as a **static snapshot for educational research, archival purposes, and analysis** regarding MMO engine structures.

## No Affiliation or Endorsement
This project is an independent, third-party archival effort. It is **not** affiliated with, endorsed by, sponsored by, or officially connected to Big Picture Games, Toxic Rain Studios, Aventurine S.A., or any of their past or present affiliates. All trademarks, game titles, logos, and proprietary assets are the sole property of their respective owners.

## Non-Commercial & Educational Fair Use
All materials here are provided strictly for non-commercial, non-profit educational and research purposes under the principles of historical software preservation. This project does not offer any playable services, monetization, or commercial alternatives to official software. 

## "AS-IS" Warranty & Liability Waiver
The materials in this repository are provided **"AS IS," WITHOUT WARRANTY OF ANY KIND**, express or implied. In no event shall the authors, contributors, or repository maintainers be liable for any claim, damages, or other liability—whether in an action of contract, tort, or otherwise—arising from, out of, or in connection with the code, assets, or use of this repository. You are solely responsible for compliance with your local laws and the software's original agreements.
