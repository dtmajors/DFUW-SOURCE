/*
 * Decompiled with CFR.
 */
public class fmz
extends fmm {
    public int[] bqd = null;
    public int[] iIY = null;
    public ek[] iQG = null;
    public boolean iQH = false;
    public ldv iJE = null;
    public int aFD = -1;
    public boolean iJG = true;
    public long[] iQI = new long[0];
    private int gKV = bqy.dFL.ordinal();
    public int iQJ = 0;

    public bqy brE() {
        return bqy.getValueByOrdinal(this.gKV);
    }

    public void b(bqy bqy2) {
        this.gKV = bqy2 == null ? this.gKV : bqy2.ordinal();
    }

    fmz() {
        super(7955);
    }
}

