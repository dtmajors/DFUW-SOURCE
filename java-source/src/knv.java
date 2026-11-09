/*
 * Decompiled with CFR.
 */
public class knv
extends knt {
    public String pRf = "";
    public String[] pRg = null;
    public String[] pRh = null;
    public int[] pRi = null;
    public float[] pRj = null;

    public knv() {
        this.Jv(269);
    }

    public boolean b(knv knv2) {
        int n;
        if (!this.pRf.equals(knv2.pRf)) {
            return false;
        }
        if (this.pRg.length != knv2.pRg.length) {
            return false;
        }
        for (n = 0; n < this.pRg.length; ++n) {
            if (this.pRg[n].equals(knv2.pRg[n])) continue;
            return false;
        }
        if (this.pRh.length != knv2.pRh.length) {
            return false;
        }
        for (n = 0; n < this.pRh.length; ++n) {
            if (this.pRh[n].equals(knv2.pRh[n])) continue;
            return false;
        }
        if (this.pRi.length != knv2.pRi.length) {
            return false;
        }
        for (n = 0; n < this.pRi.length; ++n) {
            if (this.pRi[n] == knv2.pRi[n]) continue;
            return false;
        }
        if (this.pRj.length != knv2.pRj.length) {
            return false;
        }
        for (n = 0; n < this.pRj.length; ++n) {
            if (this.pRj[n] == knv2.pRj[n]) continue;
            return false;
        }
        return true;
    }
}

