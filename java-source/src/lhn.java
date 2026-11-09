/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;

public abstract class lhn {
    public static String b(String string, char c2) {
        assert (c2 == '\'' || c2 == '\"');
        assert (string != null);
        StringBuilder stringBuilder = new StringBuilder(string.length() * 6 + 2);
        int n = string.length();
        block10: for (int i = 0; i < n; ++i) {
            char c3 = string.charAt(i);
            if (c3 == c2) {
                stringBuilder.append('\\');
                stringBuilder.append(c2);
                continue;
            }
            if (c3 > '\u0fff') {
                stringBuilder.append("\\u" + Integer.toHexString(c3));
                continue;
            }
            if (c3 > '\u00ff') {
                stringBuilder.append("\\u0" + Integer.toHexString(c3));
                continue;
            }
            if (c3 > '\u007f') {
                stringBuilder.append("\\u00" + Integer.toHexString(c3));
                continue;
            }
            if (c3 < ' ') {
                switch (c3) {
                    case '\b': {
                        stringBuilder.append('\\');
                        stringBuilder.append('b');
                        break;
                    }
                    case '\n': {
                        stringBuilder.append('\\');
                        stringBuilder.append('n');
                        break;
                    }
                    case '\t': {
                        stringBuilder.append('\\');
                        stringBuilder.append('t');
                        break;
                    }
                    case '\f': {
                        stringBuilder.append('\\');
                        stringBuilder.append('f');
                        break;
                    }
                    case '\r': {
                        stringBuilder.append('\\');
                        stringBuilder.append('r');
                        break;
                    }
                    default: {
                        if (c3 > '\u000f') {
                            stringBuilder.append("\\u00" + Integer.toHexString(c3));
                            break;
                        }
                        stringBuilder.append("\\u000" + Integer.toHexString(c3));
                        break;
                    }
                }
                continue;
            }
            switch (c3) {
                case '\\': {
                    stringBuilder.append('\\');
                    stringBuilder.append('\\');
                    continue block10;
                }
                default: {
                    stringBuilder.append(c3);
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String Ah(String string) {
        assert (string != null);
        StringBuilder stringBuilder = new StringBuilder(string.length() * 7 + 2);
        int n = string.length();
        block7: for (int i = 0; i < n; ++i) {
            char c2 = string.charAt(i);
            if (c2 < ' ') {
                stringBuilder.append("&#");
                stringBuilder.append(Integer.toString(c2));
                stringBuilder.append(";");
                continue;
            }
            switch (c2) {
                case '\'': {
                    stringBuilder.append("&apos;");
                    continue block7;
                }
                case '\"': {
                    stringBuilder.append("&quot;");
                    continue block7;
                }
                case '<': {
                    stringBuilder.append("&lt;");
                    continue block7;
                }
                case '>': {
                    stringBuilder.append("&gt;");
                    continue block7;
                }
                case '&': {
                    stringBuilder.append("&amp;");
                    continue block7;
                }
                default: {
                    stringBuilder.append(c2);
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String Ai(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        while (n < string.length()) {
            char c2 = string.charAt(n);
            if (c2 != '&') {
                stringBuilder.append(c2);
                ++n;
                continue;
            }
            if (string.startsWith("apos;", n + 1)) {
                stringBuilder.append('\'');
                n += 6;
                continue;
            }
            if (string.startsWith("quot;", n + 1)) {
                stringBuilder.append('\"');
                n += 6;
                continue;
            }
            if (string.startsWith("lt;", n + 1)) {
                stringBuilder.append('<');
                n += 4;
                continue;
            }
            if (string.startsWith("gt;", n + 1)) {
                stringBuilder.append('>');
                n += 4;
                continue;
            }
            stringBuilder.append('&');
            ++n;
        }
        return stringBuilder.toString();
    }

    public static int a(String string, int n, StringBuilder stringBuilder, char c2) {
        StringBuilder stringBuilder2 = null;
        boolean bl = false;
        boolean bl2 = false;
        block11: while (true) {
            if (n >= string.length()) {
                if (c2 == '\u0000') break;
                throw new Exception();
            }
            char c3 = string.charAt(n++);
            if (bl2) {
                if (stringBuilder2 == null) {
                    stringBuilder2 = new StringBuilder(4);
                }
                stringBuilder2.append(c3);
                if (stringBuilder2.length() != 4) continue;
                int n2 = Integer.parseInt(stringBuilder2.toString(), 16);
                stringBuilder.append((char)n2);
                stringBuilder2.setLength(0);
                bl2 = false;
                bl = false;
                stringBuilder2.delete(0, 4);
                continue;
            }
            if (bl) {
                bl = false;
                switch (c3) {
                    case '\\': {
                        stringBuilder.append('\\');
                        continue block11;
                    }
                    case '\'': {
                        stringBuilder.append('\'');
                        continue block11;
                    }
                    case '\"': {
                        stringBuilder.append('\"');
                        continue block11;
                    }
                    case 'r': {
                        stringBuilder.append('\r');
                        continue block11;
                    }
                    case 'f': {
                        stringBuilder.append('\f');
                        continue block11;
                    }
                    case 't': {
                        stringBuilder.append('\t');
                        continue block11;
                    }
                    case 'n': {
                        stringBuilder.append('\n');
                        continue block11;
                    }
                    case 'b': {
                        stringBuilder.append('\b');
                        continue block11;
                    }
                    case 'u': {
                        bl2 = true;
                        continue block11;
                    }
                }
                throw new Exception();
            }
            if (c2 != '\u0000' && c3 == c2) break;
            if (c3 == '\\') {
                bl = true;
                continue;
            }
            stringBuilder.append(c3);
        }
        if (bl || bl2) {
            throw new Exception();
        }
        return n;
    }

    public static int a(String string, int n, StringBuilder stringBuilder) {
        char c2;
        if ((c2 = string.charAt(n++)) != '\'' && c2 != '\"') {
            throw new Exception();
        }
        return lhn.a(string, n, stringBuilder, c2);
    }

    public static String Aj(String string) {
        try {
            StringBuilder stringBuilder = new StringBuilder(string.length());
            lhn.a(string, 0, stringBuilder, '\u0000');
            return stringBuilder.toString();
        }
        catch (Exception exception) {
            return "";
        }
    }

    public static String p(String string, int n, int n2) {
        if (string == null || string.length() == 0) {
            return string;
        }
        try {
            return string.substring(n, n2);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            return string;
        }
    }

    public static String q(String string, int n, int n2) {
        if (string == null) {
            return null;
        }
        int n3 = string.length();
        string = lhn.p(string, n, n2);
        if (n > 0 && n <= n2) {
            string = "..." + string;
        }
        if (n2 < n3) {
            string = string + "...";
        }
        return string;
    }

    public static boolean isEmpty(String string) {
        return string == null || string.isEmpty();
    }

    public static String Ak(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); ++i) {
            char c2 = string.charAt(i);
            stringBuilder.append(String.format("%04X", (short)c2));
        }
        return stringBuilder.toString();
    }

    public static String Al(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i += 4) {
            String string2 = string.substring(i, i + 4);
            short s = Short.valueOf(string2, 16);
            char c2 = (char)s;
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static boolean equal(String string, String string2) {
        if (string == string2) {
            return true;
        }
        if (string == null || string2 == null) {
            return false;
        }
        return string.equals(string2);
    }

    public static boolean equalsIgnoreCase(String string, String string2) {
        if (string == string2) {
            return true;
        }
        if (string == null || string2 == null) {
            return false;
        }
        return string.equalsIgnoreCase(string2);
    }

    public static boolean aD(String string, String string2) {
        if (string == string2) {
            return true;
        }
        if (string == null) {
            return string2 == null;
        }
        if (string2 == null) {
            return false;
        }
        return string.equalsIgnoreCase(string2);
    }

    public static String[] a(String string, char c2, String string2, String string3) {
        ArrayList<String> arrayList = lcn.emv();
        int n = 0;
        int n2 = 0;
        block0: while (n2 < string.length()) {
            char c3 = string.charAt(n2);
            if (c3 == c2) {
                arrayList.add(string.substring(n, n2).trim());
                n = ++n2;
                continue;
            }
            if (string2.indexOf(c3) >= 0) {
                int n3 = 1;
                ++n2;
                while (n2 < string.length()) {
                    c3 = string.charAt(n2);
                    if (string2.indexOf(c3) >= 0) {
                        ++n2;
                        ++n3;
                        continue;
                    }
                    if (string3.indexOf(c3) >= 0) {
                        ++n2;
                        if (--n3 != 0) continue;
                        continue block0;
                    }
                    ++n2;
                }
                continue;
            }
            ++n2;
        }
        arrayList.add(string.substring(n).trim());
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean sH(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        if (!Character.isJavaIdentifierStart(string.charAt(0))) {
            return false;
        }
        for (int i = 1; i < string.length(); ++i) {
            if (Character.isJavaIdentifierPart(string.charAt(i))) continue;
            return false;
        }
        return true;
    }

    public static String acR(int n) {
        StringBuffer stringBuffer = new StringBuffer();
        while (n > 0) {
            stringBuffer.append(' ');
            --n;
        }
        return stringBuffer.toString();
    }
}

