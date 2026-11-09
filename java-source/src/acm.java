/*
 * Decompiled with CFR.
 */
public class acm
extends acl {
    private ljq bdR = null;

    public acm(int n, int n2, ldv ldv2, ljq ljq2) {
        super(n, n2, ldv2);
        this.bdR = ljq2;
    }

    @Override
    public boolean a(gdx gdx2) {
        return super.a(gdx2) && this.bdR.ew(gdx2.bUb());
    }
}

