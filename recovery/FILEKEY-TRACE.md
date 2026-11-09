# DFUW FileKey and launcher trace

Date: 2026-11-09. Static inspection only; no process launch, login, or network access.

## Finding

The traced normal game-client path receives archive key text from the connection.
It does not derive that text from the account/password or the launcher handoff.
Bypassing connection/authentication checks does not supply the missing key values.
No key was recovered and no additional file was decrypted by this inspection.

This establishes the receive/install/decrypt path, not the absence of every
possible hard-coded key, historical cache, or alternative implementation elsewhere.

## Binaries

Original input directory: C:/Df Stuff/pts/DFUWDeek

| File | SHA-256 |
| --- | --- |
| data/sfmw.dll | 9a33dc5cfac80464d5f0e5f2ca538eef7c8c74364c8b9356c5f469f9361de25c |
| DFUWLobby.exe | 26d8225d738cf0298998a9f4dafec7d2adb0755fd1f40efa787d9eb1995ff08a |

Addresses below are preferred-image virtual addresses: SFMW base 0x10000000;
lobby base 0x00400000. Names in the explanation are descriptive, not debug symbols.

## Game-client path

1. **Message declaration:** `sfmw.dll:0x10047690` references the `FileKey`
   string at `0x1121e208`. It registers message ID **0x0FDD / 4061** with
   a fixed **0x44 / 68-byte payload**. AuthenticationResponse is separately
   registered at `0x100475ec` as ID 0x0FDC; the two are not interchangeable.
2. **Receive dispatch:** `0x10024260` reads the incoming message ID at +0xC,
   subtracts 0xFDA, then 1, then 2. The resulting FileKey case extracts the
   received payload buffer and calls `0x10025420` at `0x1002428b/0x10024296`.
3. **Key extraction:** `0x10025420` reads a 32-bit group ID from payload +0,
   copies 64 bytes from payload +4 to a local buffer, appends a NUL, and makes
   a string from that buffer. Thus 64 is the field capacity, not evidence that
   all actual keys are 64 characters long.
4. **Store supplied key:** `0x100254a9` calls `0x1000afe0` with the received
   group ID and string. The latter inserts/updates a group-to-string map at
   connection-state +0xD0 and signals a state change. There is no cryptographic
   key derivation in this extraction/store path.
5. **Install in file manager:** `0x10015bb0` handles state changes and reads
   group strings through `0x1000b030`. Nonempty values are passed at
   `0x10015c33` to `0x10057820`. A similar initialization path exists at
   `0x100123f9`.
6. **Install in archive:** `0x10057820` retains the supplied string in the
   file-manager map at +0x40. If an archive is open (+0x9C), it calls
   `0x10064cb0` with the group byte, string data and string length.
   `0x10064cb0` copies these raw bytes into the archive key map at +0x64.
   The other call at `0x10056111` replays that same cached map when opening
   an archive; it does not create new keys.
7. **Decrypt file:** `0x10065b10` looks up the file's encryption-group byte in
   that archive map. If missing, it logs `Encryption key ...` and fails.
   Otherwise it initializes a working cipher state through `0x10069a10` and
   applies `0x10069b70`, whose byte-index updates, state swaps and XOR loop
   are the RC4 keystream operation.

The relevant payload is structurally:

```c
struct FileKeyPayload {
    uint32_t group;
    char key_text[64];
};
```

This describes the decoded message payload. It is not a complete wire-packet
specification; framing, connection authentication and transport are separate.

## Launcher handoff

- `DFUWLobby.exe:0x415d30` creates a **0x110 / 272-byte** mapping named
  `SFLOBBY_LOGININFO_DATA`, plus the LOGININFO and ATTACHED events.
- At `0x421df0` onward, the launcher populates connection/login fields.
  `0x415f50` copies a bounded string into mapping +0x1C (capacity 0x2C),
  `0x415fb0` into +0x48 (capacity 0x84), and `0x416010` into +0xCC
  (capacity 0x44). The callers select login/account credentials or provider
  alternatives; they do not iterate archive encryption groups.
- The game reads the mapping through `0x1003b460` and the accessor family
  beginning at `0x1003b680`; the controller copies it at `0x1002724e` onward.
- No `FileKey` or `AuthenticationResponse` message-name string appears in
  the launcher. Absence of a string alone is not proof; the decisive evidence
  is the game's explicit received-payload-to-archive-key path above.
- The launcher contains an AMS lobby endpoint string at `0x0087e014`.
  It was not contacted. No live service availability is assumed.

## Practical next inputs

The most direct route is matching, authorized DFUW server/lobby key configuration
or implementation, or an existing successful DFUW connection capture/memory dump
that contains these supplied values. A server without the correct archive keys
cannot manufacture them simply by sending a FileKey-shaped packet.

Offline known-plaintext/alternate-build recovery remains a separate option, but
the receive handler does not reveal a new password-to-key formula to exploit.
Do not repeat blind startup scans on the assumption that bypassing the connection
stage will generate keys.

## Reproduction

Read-only helper: ../tools/dfuw_trace_keys.py (pefile + Capstone).
Use `dump` for the listed entry addresses or `refs` for pointer/direct-call
references. Eight declaration/dispatch/store/install/RC4 instruction anchors
were checked against the input DLL. No original binaries or archives changed.
