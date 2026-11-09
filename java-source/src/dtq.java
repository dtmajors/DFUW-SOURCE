/*
 * Decompiled with CFR.
 */
public class dtq {
    protected ldv hA = null;
    protected ldv eSR = null;
    protected int Type = 0;
    protected boolean hdh = false;

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

    public int getType() {
        return this.Type;
    }

    public void setType(int n) {
        this.Type = n;
    }

    public boolean bAy() {
        return this.hdh;
    }

    public void jH(boolean bl) {
        this.hdh = bl;
    }

    public boolean f(ldv ldv2, ldv ldv3, int n) {
        return this.hA.equals(ldv2) && this.eSR.equals(ldv3) && this.Type == n;
    }

    public boolean equals(Object object) {
        if (object instanceof dtq) {
            dtq dtq2 = (dtq)object;
            return this.f(dtq2.aO(), dtq2.amk(), dtq2.getType());
        }
        assert (false) : "Object is not a SFAccessControlEntry! It's a " + object.getClass().getName();
        return false;
    }
}

