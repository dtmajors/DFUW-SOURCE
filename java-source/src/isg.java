/*
 * Decompiled with CFR.
 */
public class isg {
    private static StringBuilder mwQ = new StringBuilder();

    public static String b(isf isf2, int n, int n2, String string) {
        mwQ.delete(0, mwQ.length());
        mwQ.append("<font");
        if (isf2 != null) {
            mwQ.append(" face='");
            mwQ.append(isf2.getFontFamily());
            mwQ.append("'");
        }
        if (n >= 0) {
            mwQ.append(" size='");
            mwQ.append(n);
            mwQ.append("'");
        }
        if (n2 >= 0) {
            mwQ.append(" color='#");
            mwQ.append(String.format("%x", n2));
            mwQ.append("'");
        }
        mwQ.append('>');
        mwQ.append(string);
        mwQ.append("</font>");
        return mwQ.toString();
    }

    public static String F(int n, String string) {
        mwQ.delete(0, mwQ.length());
        mwQ.append("<font");
        if (n >= 0) {
            mwQ.append(" size='");
            mwQ.append(n);
            mwQ.append("'");
        }
        mwQ.append('>');
        mwQ.append(string);
        mwQ.append("</font>");
        return mwQ.toString();
    }

    public static String J(String string, int n) {
        mwQ.delete(0, mwQ.length());
        mwQ.append("<font");
        mwQ.append(" color='#");
        mwQ.append(String.format("%x", n));
        mwQ.append("'");
        mwQ.append('>');
        mwQ.append(string);
        mwQ.append("</font>");
        return mwQ.toString();
    }

    public static String a(ish ish2, String string) {
        mwQ.delete(0, mwQ.length());
        mwQ.append("<p align='");
        mwQ.append(ish2.dpu());
        mwQ.append("'p>");
        mwQ.append(string);
        mwQ.append("</p>");
        return mwQ.toString();
    }

    public static String rh(String string) {
        return "<u>" + string + "</u>";
    }

    public static String ri(String string) {
        return "<img src='" + string + "'/>";
    }

    public static String S(String string, String string2) {
        return "<a href='event:" + string + "'>" + string2 + "</a>";
    }

    public static String rj(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); ++i) {
            int n = string.indexOf(60, i);
            if (n == -1) {
                stringBuilder.append(string.substring(i));
                break;
            }
            stringBuilder.append(string.substring(i, n));
            i = string.indexOf(62, n + 1);
            if (i != -1) continue;
            stringBuilder.append(string.substring(n + 1));
            break;
        }
        return stringBuilder.toString();
    }
}

