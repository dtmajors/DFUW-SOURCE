/*
 * Decompiled with CFR.
 */
public class fms
extends fmm {
    public bsa bqi = null;
    private int gKV = bqy.dFL.ordinal();

    public bqy brE() {
        return bqy.getValueByOrdinal(this.gKV);
    }

    public void b(bqy bqy2) {
        this.gKV = bqy2 == null ? this.gKV : bqy2.ordinal();
    }

    fms() {
        super(7983);
    }
}

