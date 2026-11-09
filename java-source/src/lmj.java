/*
 * Decompiled with CFR.
 */
public class lmj {
    public static final int rEH = 0;
    public static final int rEI = 1;
    public static final int rEJ = 2;
    public static final int rEK = 3;
    public static final int rEL = 4;
    public static final int rEM = 5;
    public static final int rEN = 6;

    public static int adz(int n) {
        switch (n) {
            case 0: 
            case 1: {
                return 0;
            }
            case 2: 
            case 3: {
                return 2;
            }
        }
        return n;
    }

    public static String adA(int n) {
        switch (n) {
            case 0: {
                return "INTEGER";
            }
            case 1: {
                return "UINTEGER";
            }
            case 2: {
                return "LONG";
            }
            case 3: {
                return "ULONG";
            }
            case 4: {
                return "FLOAT";
            }
            case 5: {
                return "DOUBLE";
            }
            case 6: {
                return "STRING";
            }
        }
        return "" + n;
    }
}

