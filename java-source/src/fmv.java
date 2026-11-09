/*
 * Decompiled with CFR.
 */
public class fmv
extends fmm {
    public ldv aCK = null;
    public lef dIW = null;
    public boolean iQA = false;
    public boolean iQB = false;
    public boolean iQC = false;
    public boolean gLj = false;
    private int gKV = bqy.dFL.ordinal();
    public int iQD = bqm.b.dEm.ordinal();

    public bqy brE() {
        return bqy.getValueByOrdinal(this.gKV);
    }

    public void b(bqy bqy2) {
        this.gKV = bqy2 == null ? this.gKV : bqy2.ordinal();
    }

    fmv() {
        super(7940);
    }
}

