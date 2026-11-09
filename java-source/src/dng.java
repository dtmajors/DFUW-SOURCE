/*
 * Decompiled with CFR.
 */
public class dng {
    public static final int gKt = 1;
    public static final int gKu = 2;
    public static final int gKv = 3;
    public static final int gKw = 4;
    public static final int gKx = 5;
    public static final int gKy = 6;
    public static final int gKz = 7;
    public static final int gKA = 8;
    public static final int gKB = 9;
    public static final int gKC = 10;
    public static final int gKD = 11;
    public static final int gKE = 12;
    public static final int gKF = 13;
    public static final int gKG = 14;
    public static final int gKH = 15;
    private static final String[] gKI = new String[]{"Undefined Transaction", "Transaction Add", "Transaction Change Slot", "Transaction Merge", "Transaction Merge Internally", "Transaction Remove", "Transaction Sell To Player", "Transaction Split", "Transaction Split And Drop", "Transaction Split And Merge", "Transaction Split And Merge Internally", "Transaction Split Internally", "Transaction Transfer", "Transaction Transfer Internally", "Transaction Add Starting Weapon", "Transaction Change Starting Weapon"};
    public static final boolean gKJ = true;
    public static boolean gKK = false;
    public static boolean gKL = true;

    public static final String AV(int n) {
        if (n <= 0 || n >= gKI.length) {
            lfn.b(5, "SFTransactionConstants", "getTransactionName() TransactionType is invalid.");
            return null;
        }
        return gKI[n];
    }

    public static final int iS(String string) {
        if (string == null) {
            lfn.b(5, "SFTransactionConstants", "getTransactionType() TransactionName is null.");
            return -1;
        }
        int n = gKI.length;
        for (int i = 0; i < n; ++i) {
            if (!gKI[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        lfn.b(5, "SFTransactionConstants", "getTransactionType() TransactionName '" + string + "' is invalid.");
        return -1;
    }

    public static final boolean AW(int n) {
        switch (n) {
            case 1: 
            case 2: 
            case 5: 
            case 8: 
            case 13: {
                return true;
            }
            case 3: 
            case 4: 
            case 6: 
            case 7: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 14: 
            case 15: {
                return false;
            }
        }
        lfn.b(5, "SFTransactionConstants", "isOneSided() Invalid TransactionType provided: " + n);
        assert (false);
        return false;
    }

    private dng() {
    }
}

