/*
 * Decompiled with CFR.
 */
public class jbj {
    int index = -1;

    jbj() {
    }

    jbj(String string) {
        try {
            String[] stringArray = string.split(";");
            this.index = Integer.valueOf(stringArray[1]);
        }
        catch (Exception exception) {
            this.index = -1;
        }
    }
}

