/*
 * Decompiled with CFR.
 */
public class hwl {
    public int cck = -1;
    public int lir = 0;
    public int lis = 0;
    public int cf = 0;
    public int cg = 0;

    public hwl(String string) {
        String[] stringArray = string.split(";");
        for (int i = 0; i < stringArray.length; ++i) {
            int n = -1;
            try {
                n = (int)Float.valueOf(stringArray[i]).floatValue();
            }
            catch (Exception exception) {
                continue;
            }
            if (i == 0) {
                this.cck = n;
                continue;
            }
            if (i == 1) {
                this.lir = n;
                continue;
            }
            if (i == 2) {
                this.lis = n;
                continue;
            }
            if (i == 3) {
                this.cf = n;
                continue;
            }
            if (i != 4) continue;
            this.cg = n;
        }
    }
}

