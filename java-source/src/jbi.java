/*
 * Decompiled with CFR.
 */
public class jbi
extends jbj {
    float mNF;
    float mNG;

    jbi(String string) {
        try {
            String[] stringArray = string.split(";");
            this.index = Integer.valueOf(stringArray[1]);
            this.mNF = Float.valueOf(stringArray[2]).floatValue();
            this.mNG = Float.valueOf(stringArray[3]).floatValue();
        }
        catch (Exception exception) {
            this.index = -1;
        }
    }
}

