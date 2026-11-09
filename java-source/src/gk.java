/*
 * Decompiled with CFR.
 */
public class gk {
    public static final int WO = 1;
    public static final int WP = 2;
    public static final int WQ = 3;
    public static final int WR = 4;
    public static final int WS = 5;
    public static final int WT = 6;
    private static final int WU = 6;
    private static final String[] WV = new String[]{"Invalid Key", "Clan", "Explicit", "Party", "Private", "Public", "Relation"};

    public static String bH(int n) {
        if (n < 0 || n >= WV.length) {
            lfn.b(5, "SFKeyConstants", "SFKeyConstants() KeyType is invalid.");
            return null;
        }
        return WV[n];
    }

    public static int aG(String string) {
        if (string == null) {
            lfn.b(5, "SFKeyConstants", "getKeyType() KeyName is null.");
            return -1;
        }
        int n = WV.length;
        for (int i = 1; i < n; ++i) {
            if (!WV[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        lfn.b(5, "SFKeyConstants", "getKeyType() KeyName '" + string + "' is invalid.");
        return -1;
    }

    public static boolean bI(int n) {
        switch (n) {
            case 1: 
            case 2: 
            case 4: {
                return true;
            }
        }
        lfn.b(5, "SFKeyConstants", "isCreateItemSubscriptions() Invalid keytype provided: " + gk.bH(n) + "'");
        assert (false);
        return false;
    }

    public static boolean bJ(int n) {
        return n > 0 && n <= 6;
    }

    public static boolean bK(int n) {
        switch (n) {
            case 1: 
            case 3: {
                return true;
            }
        }
        return false;
    }

    private gk() {
    }
}

