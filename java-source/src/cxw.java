/*
 * Decompiled with CFR.
 */
public class cxw
extends cxv {
    private float fXg = 0.0f;
    private float fXq = 0.0f;
    private float fXj = 0.0f;
    private float fXr = 0.0f;
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

    public float bgf() {
        return this.fXq;
    }

    public void fx(float f2) {
        this.fXq = f2;
    }

    public float bgg() {
        return this.fXj;
    }

    public float bgh() {
        return this.fXr;
    }

    public void fy(float f2) {
        this.fXr = f2;
    }

    public void fq(float f2) {
        this.fXj = f2;
    }

    @Override
    public float xo(int n2) {
        switch (n2) {
            case 2: {
                return this.fXg;
            }
            case 3: {
                return this.fXq;
            }
            case 10: {
                return this.fXj;
            }
            case 13: {
                return this.fXr;
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
        cxw cxw2 = (cxw)((Object)cxc2);
        cxw2.fn(this.fXg);
        cxw2.fx(this.fXq);
        cxw2.fq(this.fXj);
        cxw2.fy(this.fXr);
        cxw2.fr(this.fXk);
        cxw2.fs(this.fXl);
        cxw2.ft(this.fXm);
        cxw2.fu(this.fXn);
        cxw2.fv(this.fXo);
        cxw2.fw(this.fXp);
    }

    @Override
    protected boolean c(gjt gjt2) {
        return super.c(gjt2);
    }

    @Override
    protected void bex() {
        super.bex();
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

