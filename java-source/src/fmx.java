/*
 * Decompiled with CFR.
 */
public class fmx
extends fmm {
    public int ResourceType = 0;
    public int asi = 0;
    public ldv aXQ = null;
    private int gKV = bqy.dFL.ordinal();

    public bqy brE() {
        return bqy.getValueByOrdinal(this.gKV);
    }

    public void b(bqy bqy2) {
        this.gKV = bqy2 == null ? this.gKV : bqy2.ordinal();
    }

    fmx() {
        super(7993);
    }
}

