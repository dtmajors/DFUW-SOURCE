/*
 * Decompiled with CFR.
 */
public class ddg
extends dde {
    private ddb gef = null;
    private ldv aUa = null;

    public ddb bjY() {
        return this.gef;
    }

    public void a(ddb ddb2) {
        this.gef = ddb2;
    }

    public ldv bjZ() {
        return this.aUa;
    }

    public void my(ldv ldv2) {
        this.aUa = ldv2;
    }

    @Override
    public cxd.r bjR() {
        return cxd.r.fSv;
    }

    @Override
    protected void a(dde dde2) {
        assert (this.gef != null);
        super.a(dde2);
        ddg ddg2 = (ddg)dde2;
        ddg2.a(this.gef.bjI());
    }
}

