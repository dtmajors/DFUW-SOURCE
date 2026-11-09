/*
 * Decompiled with CFR.
 */
public class fmj
extends fmm {
    public ldv aXQ = null;
    public brv[] gKU = null;
    private int gKV = bqy.dFL.ordinal();

    public bqy brE() {
        return bqy.getValueByOrdinal(this.gKV);
    }

    public void b(bqy bqy2) {
        this.gKV = bqy2 == null ? this.gKV : bqy2.ordinal();
    }

    fmj() {
        super(7974);
    }
}

