/*
 * Decompiled with CFR.
 */
public class fnc
extends fmm {
    public int[] bqd = null;
    public int[] iIY = null;
    private int gKV = bqy.dFL.ordinal();

    public bqy brE() {
        return bqy.getValueByOrdinal(this.gKV);
    }

    public void b(bqy bqy2) {
        this.gKV = bqy2 == null ? this.gKV : bqy2.ordinal();
    }

    fnc() {
        super(8005);
    }
}

