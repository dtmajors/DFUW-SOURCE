/*
 * Decompiled with CFR.
 */
public class dvf
extends btk {
    dvf() {
    }

    public static String aT(String string) {
        if (string == null || string.trim().equals("")) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char[] cArray = string.toCharArray();
        block3: for (int i = 0; i < cArray.length; ++i) {
            switch (cArray[i]) {
                case '\"': 
                case '\'': 
                case '\\': {
                    stringBuffer.append("\\" + cArray[i]);
                    continue block3;
                }
                default: {
                    stringBuffer.append(cArray[i]);
                }
            }
        }
        return stringBuffer.toString();
    }
}

