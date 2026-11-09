/*
 * Decompiled with CFR.
 */
public class jic {
    private ain ngd;
    private aim ngt;

    public jic(ain ain2) {
        this.ngd = ain2;
    }

    public ain BP() {
        return this.ngd;
    }

    public boolean isActive() {
        return this.ngt != null;
    }

    public aim dHa() {
        return this.ngt;
    }

    public void d(aim aim2) {
        this.ngt = aim2;
        jid.dHb().ngy.V(this);
    }
}

