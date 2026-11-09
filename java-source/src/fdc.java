/*
 * Decompiled with CFR.
 */
public class fdc
extends fdo {
    public int iJM = 0;
    public ldv dAu = null;
    public ldv aXQ = null;
    public ldv aCK = null;
    public lef dIW = null;
    private int gKV = bqy.dFL.ordinal();

    public bqy brE() {
        return bqy.getValueByOrdinal(this.gKV);
    }

    public void b(bqy bqy2) {
        this.gKV = bqy2 == null ? this.gKV : bqy2.ordinal();
    }

    fdc() {
        super(9232);
    }
}

