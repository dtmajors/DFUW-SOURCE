/*
 * Decompiled with CFR.
 */
public class cxp
extends cxo {
    private float fXg = 0.0f;
    private float fXh = 0.0f;
    private float fXi = 0.0f;
    private float fXj = 0.0f;
    private float fXk = 0.0f;
    private float fXl = 0.0f;
    private float fXm = 0.0f;
    private float fXn = 0.0f;
    private float fXo = 0.0f;
    private float fXp = 0.0f;

    public float bgc() {
        return this.fXg;
    }

    public void fn(float f2) {
        this.fXg = f2;
    }

    public float bgd() {
        return this.fXh;
    }

    public void fo(float f2) {
        this.fXh = f2;
    }

    public float bge() {
        return this.fXi;
    }

    public void fp(float f2) {
        this.fXi = f2;
    }

    public float xo(int n2) {
        switch (n2) {
            case 2: {
                return this.fXg;
            }
            case 13: {
                return this.fXh;
            }
            case 23: {
                return this.fXi;
            }
            case 10: {
                return this.fXj;
            }
            case 26: {
                return this.fXk;
            }
            case 27: {
                return this.fXl;
            }
            case 28: {
                return this.fXm;
            }
            case 29: {
                return this.fXn;
            }
            case 30: {
                return this.fXo;
            }
            case 31: {
                return this.fXp;
            }
        }
        return super.xo(n2);
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        cxp cxp2 = (cxp)((Object)cxc2);
        cxp2.fn(this.fXg);
        cxp2.fo(this.fXh);
        cxp2.fp(this.fXi);
        cxp2.fq(this.fXj);
        cxp2.fr(this.fXk);
        cxp2.fs(this.fXl);
        cxp2.ft(this.fXm);
        cxp2.fu(this.fXn);
        cxp2.fv(this.fXo);
        cxp2.fw(this.fXp);
    }

    public final void fq(float f2) {
        this.fXj = f2;
    }

    public final void fr(float f2) {
        this.fXk = f2;
    }

    public final void fs(float f2) {
        this.fXl = f2;
    }

    public final void ft(float f2) {
        this.fXm = f2;
    }

    public final void fu(float f2) {
        this.fXn = f2;
    }

    public final void fv(float f2) {
        this.fXo = f2;
    }

    public final void fw(float f2) {
        this.fXp = f2;
    }
}

