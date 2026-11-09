/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Map;

public class lgb {
    public static final int rkS = 1;
    public static final int rkT = 2;
    public static final int rkU = 4;
    public static final int rkV = 8;
    public static final int rkW = 16;
    public static final int rkX = 32;
    public static final int rkY = 64;
    public static final int rkZ = 128;
    public static final int rla = 256;
    public static final int rlb = 512;
    public static final int rlc = 1024;
    public static final int rld = 2048;
    public static final int rle = 4096;
    public static final int rlf = 8192;
    public static final int rlg = 16384;
    public static final int rlh = 32768;
    public static final int rli = 65536;
    public static final int rlj = 131072;
    public static final int rlk = 262144;
    public static final int rll = 524288;
    public static final int rlm = 0x100000;
    public static final int rln = -1;
    public static final int rlo = -1966273;
    public static final int rlp = 2015168;
    public static final int rlq = 40480;
    public static final int rlr = 14;
    public static final int rls = 1966238;
    public static final int rlt = 0x1E000E;
    public static final int rlu = 786496;
    public static final int rlv = 786624;
    public static final int rlw = 4800;
    public static final int rlx = 2040030;
    public static final int rly = 0;
    public static final int rlz = 1;
    public static final int rlA = 2;
    public static final int rlB = 3;
    public static final int rlC = 4;
    private static Map<Integer, Integer> rlD = lcn.emw();
    private static boolean rlE = true;

    public static final int acF(int n) {
        if (rlE) {
            Integer n2 = rlD.get(n);
            if (n2 != null) {
                return n2;
            }
            int n3 = lgb.acG(n);
            rlD.put(n, n3);
            return n3;
        }
        return lgb.acG(n);
    }

    private static final int acG(int n) {
        if (lea.enW().isDescendant(n, cug.fnD)) {
            return 2;
        }
        if (lea.enW().isDescendant(n, cug.fnO)) {
            return 3;
        }
        if (lea.enW().isDescendant(n, cug.fgH)) {
            return 1;
        }
        if (lea.enW().isDescendant(n, cug.fgA)) {
            return 1;
        }
        if (lea.enW().isDescendant(n, cug.fgw)) {
            return 1;
        }
        if (lea.enW().isDescendant(n, cug.fgP)) {
            return 4;
        }
        if (lea.enW().isDescendant(n, cug.fgz)) {
            return 0;
        }
        if (lea.enW().isDescendant(n, cug.fnP)) {
            return 2;
        }
        if (lea.enW().isDescendant(n, cug.fnQ)) {
            return 2;
        }
        assert (false) : "Unknown ResourceType for enums: " + lea.enW().getName(n);
        return 1;
    }
}

