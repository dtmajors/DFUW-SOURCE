/*
 * Decompiled with CFR.
 */
public class arj {
    private static int ayN;
    public static int bPG;

    public static boolean hA(int n) {
        return ayN + n > bPG;
    }

    public static void a(a a2) {
        switch (a2) {
            case bPI: {
                --ayN;
                break;
            }
            case bPJ: {
                ++ayN;
            }
        }
    }

    private arj() {
    }

    static {
        bPG = 120;
    }
}

