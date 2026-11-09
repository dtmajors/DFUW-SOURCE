/*
 * Decompiled with CFR.
 */
public class alr
extends alq {
    private boolean bsu = false;

    public boolean DR() {
        return this.bsu;
    }

    public void bc(boolean bl) {
        this.bsu = bl;
    }

    @Override
    protected void g(alt alt2) {
        super.g(alt2);
        alr alr2 = (alr)alt2;
        alr2.bc(this.bsu);
    }
}

