/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class iz
implements iy {
    @Override
    public lfs<String, Boolean> a(String string, String[] stringArray, Map<String, String> map) {
        if (string == null || string.trim().isEmpty()) {
            return new lfs<String, Boolean>("", false);
        }
        return this.a(string, stringArray);
    }

    private lfs<String, Boolean> a(String string, String[] stringArray) {
        Object object;
        String string2 = string.toLowerCase();
        boolean bl = false;
        for (int i = 0; i < stringArray.length; ++i) {
            object = stringArray[i];
            if (!string2.contains((CharSequence)object)) continue;
            String string3 = ((String)object).replaceAll(".", "*");
            string2 = string2.replace((CharSequence)object, string3);
            bl = true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        object = string2.toCharArray();
        for (int i = 0; i < ((Object)object).length; ++i) {
            Object object2 = object[i];
            if (object2 != 42) continue;
            stringBuilder.setCharAt(i, (char)object2);
        }
        return new lfs<String, Boolean>(stringBuilder.toString(), bl);
    }

    private lfs<String, Boolean> b(String string, String[] stringArray, Map<String, String> map) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray2 = string.split(" ");
        boolean bl = false;
        for (String string2 : stringArray2) {
            String string3 = string2.toLowerCase();
            boolean bl2 = false;
            String string4 = map.get(string2);
            if (string4 != null) {
                stringBuilder.append(string4 + " ");
                continue;
            }
            for (int i = 0; i < stringArray.length; ++i) {
                String string5 = stringArray[i];
                if (!string3.contains(string5)) continue;
                String string6 = string5.replaceAll(".", "*");
                string3 = string3.replace(string5, string6);
                bl2 = true;
                bl = true;
            }
            stringBuilder.append(string3 + " ");
            if (!bl2) continue;
            map.put(string2, string3);
        }
        return new lfs<String, Boolean>(stringBuilder.toString(), bl);
    }
}

