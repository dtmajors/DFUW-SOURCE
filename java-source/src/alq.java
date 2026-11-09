/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
public abstract class alq
extends alt {
    private int bnM = 0;

    public final int BV() {
        return this.bnM;
    }

    public final void fC(int n) {
        this.bnM = n;
    }

    public String getAttributeName() {
        return ep.aM((int)this.bnM);
    }

    @Override
    protected void g(alt alt2) {
        super.g(alt2);
        alq alq2 = (alq)alt2;
        alq2.fC(this.bnM);
    }
}

