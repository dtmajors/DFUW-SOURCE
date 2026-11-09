/*
 * Decompiled with CFR.
 */
public class myq {
    public static String[] EUy = new String[]{"ALT", "CTRL", "SHIFT"};
    public static final int EUz = 1;
    public static final int EUA = 2;
    public static final int EUB = 4;
    public static final int COUNT = 3;

    public static String getName(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = 1;
        for (int i = 0; i < EUy.length; ++i) {
            if ((n2 & n3) != 0) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append("+");
                }
                stringBuilder.append(EUy[i]);
                n2 &= ~n3;
            }
            n3 <<= 1;
        }
        assert (n2 == 0) : n2;
        return stringBuilder.toString();
    }

    public static int Eb(String string) {
        int n2 = 0;
        int n3 = string.length();
        int n4 = 0;
        while (n4 < n3) {
            String string2;
            int n5;
            int n6 = string.indexOf(43, n4);
            if (n6 == -1) {
                n6 = n3;
            }
            if ((n5 = myq.Ec(string2 = string.substring(n4, n6))) == -1) {
                return -1;
            }
            int n7 = 1 << n5;
            if ((n2 & n7) != 0) {
                // empty if block
            }
            n2 |= n7;
            n4 = n6 + 1;
        }
        return n2;
    }

    private static int Ec(String string) {
        for (int i = 0; i < EUy.length; ++i) {
            if (!EUy[i].equals(string)) continue;
            return i;
        }
        return -1;
    }
}

