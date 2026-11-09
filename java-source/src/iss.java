/*
 * Decompiled with CFR.
 */
public class iss {
    public static String rr(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        while (n < string.length()) {
            int n2 = string.indexOf(91, n);
            if (n2 >= 0) {
                if (n2 > 0) {
                    stringBuilder.append(string.substring(n, n2));
                }
                if ((n2 = iss.a(stringBuilder, string, n2 + 1)) >= 0) {
                    n = n2;
                    continue;
                }
                stringBuilder.append(string.substring(n, string.length()));
                break;
            }
            stringBuilder.append(string.substring(n, string.length()));
            break;
        }
        return stringBuilder.toString();
    }

    private static int a(StringBuilder stringBuilder, String string, int n) {
        if (n < string.length()) {
            if (iss.d(string, n, "b]")) {
                stringBuilder.append("<b>");
                return n + 2;
            }
            if (iss.d(string, n, "/b]")) {
                stringBuilder.append("</b>");
                return n + 3;
            }
            if (iss.d(string, n, "i]")) {
                stringBuilder.append("<i>");
                return n + 2;
            }
            if (iss.d(string, n, "/i]")) {
                stringBuilder.append("</i>");
                return n + 3;
            }
            if (iss.d(string, n, "u]")) {
                stringBuilder.append("<u>");
                return n + 2;
            }
            if (iss.d(string, n, "/u]")) {
                stringBuilder.append("</u>");
                return n + 3;
            }
            if (iss.d(string, n, "br]")) {
                stringBuilder.append("<br>");
                return n + 3;
            }
            lfs<Integer, Integer> lfs2 = iss.e(string, n, "color");
            if (lfs2 != null) {
                stringBuilder.append("<font color='#" + Integer.toHexString((Integer)lfs2.reX) + "'>");
                return (Integer)lfs2.reY;
            }
            if (iss.d(string, n, "/color]")) {
                stringBuilder.append("</font>");
                return n + 7;
            }
            lfs<Integer, Integer> lfs3 = iss.f(string, n, "size");
            if (lfs3 != null) {
                stringBuilder.append("<font size='" + lfs3.reX + "'>");
                return (Integer)lfs3.reY;
            }
            if (iss.d(string, n, "/size]")) {
                stringBuilder.append("</font>");
                return n + 6;
            }
            lfs<Integer, Integer> lfs4 = iss.f(string, n, "font");
            if (lfs4 != null) {
                if ((Integer)lfs4.reX >= 0 && (Integer)lfs4.reX < isf.values().length) {
                    isf isf2 = isf.values()[(Integer)lfs4.reX];
                    stringBuilder.append("<font face='" + isf2.getFontFamily() + "'>");
                    return (Integer)lfs4.reY;
                }
                stringBuilder.append("<font>");
                return n + 6;
            }
            if (iss.d(string, n, "/font]")) {
                stringBuilder.append("</font>");
                return n + 6;
            }
            lfs<String, Integer> lfs5 = iss.g(string, n, "img");
            if (lfs5 != null) {
                stringBuilder.append("<img src='img://" + (String)lfs5.reX + "'>");
                return (Integer)lfs5.reY;
            }
            return -1;
        }
        return -1;
    }

    private static boolean d(String string, int n, String string2) {
        return string.startsWith(string2, n);
    }

    private static lfs<Integer, Integer> e(String string, int n, String string2) {
        int n2;
        if (string.startsWith(string2, n) && (n2 = string.indexOf(93, n + string2.length())) >= 0) {
            String string3 = "0x" + string.substring(n + string2.length(), n2).trim();
            try {
                int n3 = Integer.decode(string3);
                return new lfs<Integer, Integer>(n3, n2 + 1);
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        return null;
    }

    private static lfs<Integer, Integer> f(String string, int n, String string2) {
        int n2;
        if (string.startsWith(string2, n) && (n2 = string.indexOf(93, n + string2.length())) >= 0) {
            String string3 = string.substring(n + string2.length(), n2).trim();
            try {
                int n3 = Integer.decode(string3);
                return new lfs<Integer, Integer>(n3, n2 + 1);
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        return null;
    }

    private static lfs<String, Integer> g(String string, int n, String string2) {
        int n2;
        if (string.startsWith(string2, n) && (n2 = string.indexOf(93, n + string2.length())) >= 0) {
            String string3 = string.substring(n + string2.length(), n2).trim();
            try {
                return new lfs<String, Integer>(string3, n2 + 1);
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        return null;
    }
}

