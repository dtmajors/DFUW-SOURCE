/*
 * Decompiled with CFR.
 */
public class fmb
extends fmm {
    public ldv aCK = null;
    public lef dIW = null;
    public int iPI = 0;
    public boolean iPJ = false;
    private int gKV = bqy.dFL.ordinal();

    public bqy brE() {
        return bqy.getValueByOrdinal(this.gKV);
    }

    public void b(bqy bqy2) {
        this.gKV = bqy2 == null ? this.gKV : bqy2.ordinal();
    }

    fmb() {
        super(7953);
    }
}

