/*
 * Decompiled with CFR.
 */
public class jny {
    private static final char nFz = '.';

    public static String dB(double d2) {
        double d3;
        String string = "";
        if (d2 < 1000.0) {
            d3 = d2;
        } else if (d2 < 1000000.0) {
            d3 = d2 / 1000.0;
            string = "" + lvm.sXA.bD(new Object[0]).exA();
        } else if (d2 < 1.0E9) {
            d3 = d2 / 1000000.0;
            string = "" + lvm.sXB.bD(new Object[0]).exA();
        } else {
            d3 = d2 / 1.0E9;
            string = "" + lvm.sXC.bD(new Object[0]).exA();
        }
        d3 = (double)Math.round(d3 * 100.0) / 100.0;
        String string2 = String.valueOf(d3);
        int n = string2.indexOf(46);
        if (n >= 0) {
            int n2;
            for (n2 = string2.length() - 1; n2 > n && string2.charAt(n2) == '0'; --n2) {
            }
            if (string2.charAt(n2) == '.') {
                --n2;
            }
            string2 = string2.substring(0, n2 + 1);
        }
        string2 = string2 + string;
        return string2;
    }

    public static String dC(double d2) {
        String string = String.valueOf(d2 = (double)Math.round(d2 * 100.0) / 100.0);
        int n = string.indexOf(46);
        if (n >= 0) {
            int n2;
            for (n2 = string.length() - 1; n2 > n && string.charAt(n2) == '0'; --n2) {
            }
            if (string.charAt(n2) == '.') {
                --n2;
            }
            string = string.substring(0, n2 + 1);
        }
        return string;
    }

    public static void main(String[] stringArray) {
        assert (jny.dB(12.0).equals("12"));
        assert (jny.dB(12000.0).equals("12 K"));
        assert (jny.dB(1.2E7).equals("12 M"));
        assert (jny.dB(1200.0).equals("1.2 K"));
        assert (jny.dB(2135.0).equals("2.13 K"));
        assert (jny.dB(2109.0).equals("2.11 K"));
        assert (jny.dB(2001.0).equals("2 K"));
    }
}

