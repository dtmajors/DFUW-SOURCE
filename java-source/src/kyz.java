/*
 * Decompiled with CFR.
 */
public class kyz {
    public boolean qns = false;
    public int qmV = 0;
    public String pnB = null;
    public String FileName = null;
    public boolean qnt = false;
    public boolean qnp = true;

    public boolean validate() {
        if (this.qns) {
            if (this.pnB == null || this.pnB.trim().equals("")) {
                return false;
            }
            return this.FileName != null && !this.FileName.trim().equals("");
        }
        return this.qmV >= 10000;
    }
}

