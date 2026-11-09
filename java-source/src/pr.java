/*
 * Decompiled with CFR.
 */
import java.util.LinkedList;
import java.util.List;

public class pr {
    public static final <T> String a(char c2, T[] TArray) {
        if (TArray == null) {
            return "";
        }
        String string = "\\" + c2;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < TArray.length; ++i) {
            String string2 = TArray[i].toString();
            string2 = pr.k(string2, string);
            if (i > 0) {
                stringBuilder.append(c2);
            }
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    public static final String b(char c2, Object ... objectArray) {
        return pr.a(c2, objectArray);
    }

    public static final List<String> a(char c2, String string) {
        if (string == null) {
            return null;
        }
        LinkedList<String> linkedList = lcn.emA();
        if (string.isEmpty()) {
            return linkedList;
        }
        int n = 0;
        boolean bl = false;
        StringBuilder stringBuilder = new StringBuilder();
        while (n < string.length()) {
            char c3 = string.charAt(n);
            if (c3 == '\\' && n + 1 < string.length()) {
                c3 = string.charAt(++n);
            } else if (c3 == c2) {
                String string2 = stringBuilder.toString();
                stringBuilder.delete(0, stringBuilder.length());
                ++n;
                linkedList.add(string2);
                continue;
            }
            stringBuilder.append(c3);
            ++n;
        }
        String string3 = stringBuilder.toString();
        linkedList.add(string3);
        return linkedList;
    }

    private static final String k(String string, String string2) {
        StringBuilder stringBuilder = null;
        for (int i = 0; i < string.length(); ++i) {
            char c2 = string.charAt(i);
            if (string2.indexOf(c2) >= 0) {
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(string.substring(0, i));
                }
                stringBuilder.append('\\');
            }
            if (stringBuilder == null) continue;
            stringBuilder.append(c2);
        }
        if (stringBuilder == null) {
            return string;
        }
        return stringBuilder.toString();
    }

    public static String a(ej[] ejArray) {
        String[] stringArray = new String[ejArray.length];
        for (int i = 0; i < ejArray.length; ++i) {
            stringArray[i] = ejArray[i].fk();
        }
        return pr.a('|', stringArray);
    }

    public static ej[] bZ(String string) {
        List<String> list = pr.a('|', string);
        if (list == null) {
            return null;
        }
        ej[] ejArray = new ej[list.size()];
        int n = 0;
        for (String string2 : list) {
            ejArray[n] = ej.ar(string2);
            if (ejArray[n] == null) assert (false);
            ++n;
        }
        return ejArray;
    }
}

