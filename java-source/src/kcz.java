/*
 * Decompiled with CFR.
 */
public abstract class kcz {
    private int jpq = 0;
    private ldv hA = null;
    private ldv eSR = null;

    private kcz() {
        this.setMessageType(256);
    }

    protected kcz(int n) {
        this.jpq = n;
    }

    public int getMessageType() {
        return this.jpq;
    }

    public void setMessageType(int n) {
        this.jpq = n;
    }

    public ldv aO() {
        return this.hA;
    }

    public void f(ldv ldv2) {
        this.hA = ldv2;
    }

    public ldv amk() {
        return this.eSR;
    }

    public void on(ldv ldv2) {
        this.eSR = ldv2;
    }
}

