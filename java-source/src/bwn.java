/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class bwn {
    public static final int dWn = 1;
    public static final int dWo = 2;
    public static final int dWp = 3;
    public static final int dWq = 100;
    public static final int dWr = 100;
    public static final int dWs = 100;
    public static final int dWt = 1000;
    public static final int dWu = 500;
    public static final int dWv = 1000;
    private static final String[] dWw = new String[]{"Undefined MissileState", "MissileState Impact", "MissileState Max Distance Travelled", "MissileState Missile Fired"};

    public static int gE(String string) {
        if (string == null) {
            lfn.b(5, "SFMissileConstants", "getMissileState() MissileStateName is null.");
            return -1;
        }
        int n = dWw.length;
        for (int i = 0; i < n; ++i) {
            if (!dWw[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        lfn.b(5, "SFMissileConstants", "getMissileState() MissileStateName '" + string + "' is invalid.");
        return -1;
    }

    public static String ny(int n) {
        if (n <= 0 || n >= dWw.length) {
            lfn.b(5, "SFMissileConstants", "getMissileStateName() MissileState " + n + " is invalid.");
            return null;
        }
        return dWw[n];
    }

    private bwn() {
    }

    public static String a(String string, int n, boolean bl) {
        if (bl) {
            if (n == cug.fqr || n == cug.fqo) {
                return string + "_splash";
            }
            if (n == cug.fqk || n == cug.fqm || n == cug.fqp) {
                return string + "_sizzle";
            }
            if (lea.enW().isDescendant(n, cug.fki) || lea.enW().isDescendant(n, cug.frM) || lea.enW().isDescendant(n, cug.fmZ)) {
                return string + "_magic";
            }
            return string;
        }
        if (lea.enW().isDescendant(n, cug.fnO) || lea.enW().isDescendant(n, cug.fkK) || lea.enW().isDescendant(n, cug.fqD)) {
            return string + "_wood";
        }
        if (lea.enW().isDescendant(n, cug.fpp) || lea.enW().isDescendant(n, cug.fph) || lea.enW().isDescendant(n, cug.fsg) || lea.enW().isDescendant(n, cug.fnK) || lea.enW().isDescendant(n, cug.fqB)) {
            return string + "_stone";
        }
        if (lea.enW().isDescendant(n, cug.fnx) || lea.enW().isDescendant(n, cug.fkN) || lea.enW().isDescendant(n, cug.fnw) || lea.enW().isDescendant(n, cug.fpc) || lea.enW().isDescendant(n, cug.fnx) || lea.enW().isDescendant(n, cug.fqC)) {
            return string + "_metal";
        }
        if (lea.enW().isDescendant(n, cug.fnJ)) {
            return string + "_stone_wood";
        }
        if (n == cug.fqk || n == cug.fqm || n == cug.fqp) {
            return string + "_burned";
        }
        if (n == cug.fqr || n == cug.fqo) {
            return string + "_water";
        }
        if (lea.enW().isDescendant(n, cug.fki) || lea.enW().isDescendant(n, cug.frM) || lea.enW().isDescendant(n, cug.fmZ)) {
            return string + "_magic";
        }
        if (n == cug.fqq) {
            return string + "_crystal";
        }
        if (n == cug.fkr) {
            return string + "_dirt";
        }
        return string;
    }
}

