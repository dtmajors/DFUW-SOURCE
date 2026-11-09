/*
 * Decompiled with CFR.
 */
public class fmd
extends fmm {
    public ldv aCK = null;
    public lef dIW = null;
    public int iPK = 0;
    private int gKV = bqy.dFL.ordinal();

    public bqy brE() {
        return bqy.getValueByOrdinal(this.gKV);
    }

    public void b(bqy bqy2) {
        this.gKV = bqy2 == null ? this.gKV : bqy2.ordinal();
    }

    fmd() {
        super(7995);
    }
}

