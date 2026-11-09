/*
 * Decompiled with CFR.
 */
public class epf
extends eqr {
    private ldv aEF = null;
    private int aGh = azh.cEi.ordinal();
    private double iwA = 0.0;
    private boolean aGj = false;
    private boolean aGk = false;

    public ldv afl() {
        return this.aEF;
    }

    public void fx(ldv ldv2) {
        this.aEF = ldv2;
    }

    public azh abr() {
        return azh.getValueByOrdinal(this.aGh);
    }

    public void b(azh azh2) {
        this.aGh = azh2 == null ? this.aGh : azh2.ordinal();
    }

    public double bKq() {
        return this.iwA;
    }

    public void cf(double d2) {
        this.iwA = d2;
    }

    public boolean abs() {
        return this.aGj;
    }

    public void kE(boolean bl) {
        this.aGj = bl;
    }

    public boolean aiq() {
        return this.aGk;
    }

    public void kF(boolean bl) {
        this.aGk = bl;
    }

    epf() {
        super(32060, 1036);
    }
}

