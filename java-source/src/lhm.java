/*
 * Decompiled with CFR.
 */
public abstract class lhm {
    static final a[] rnK = new a[]{new a(1000, "M"), new a(900, "CM"), new a(500, "D"), new a(400, "CD"), new a(100, "C"), new a(90, "XC"), new a(50, "L"), new a(40, "XL"), new a(10, "X"), new a(9, "IX"), new a(5, "V"), new a(4, "IV"), new a(1, "I")};

    public static String acP(int n) {
        String string = Integer.toString(n);
        if (n > 10 && n < 14) {
            switch (n) {
                case 11: {
                    string = string + "th";
                    break;
                }
                case 12: {
                    string = string + "th";
                    break;
                }
                case 13: {
                    string = string + "th";
                }
            }
        } else {
            int n2 = n % 10;
            switch (n2) {
                case 0: {
                    string = string + "th";
                    break;
                }
                case 1: {
                    string = string + "st";
                    break;
                }
                case 2: {
                    string = string + "nd";
                    break;
                }
                case 3: {
                    string = string + "rd";
                    break;
                }
                default: {
                    string = string + "th";
                }
            }
        }
        return string;
    }

    public static String acQ(int n) {
        if (n >= 4000 || n < 0) {
            return null;
        }
        if (n == 0) {
            return "0";
        }
        StringBuffer stringBuffer = new StringBuffer(10);
        for (a a2 : rnK) {
            while (n >= a2.rnL) {
                n -= a2.rnL;
                stringBuffer.append(a2.rnM);
            }
        }
        return stringBuffer.toString();
    }
}

