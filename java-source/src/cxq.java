/*
 * Decompiled with CFR.
 */
public class cxq
extends cxo {
    private float fXg = 0.0f;
    private float fXi = 0.0f;
    private float fXh = 0.0f;
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

    public float bge() {
        return this.fXi;
    }

    public void fp(float f2) {
        this.fXi = f2;
    }

    public float bgd() {
        return this.fXh;
    }

    public void fo(float f2) {
        this.fXh = f2;
    }

    public float xo(int n2) {
        switch (n2) {
            case 2: {
                return this.fXg;
            }
            case 23: {
                return this.fXi;
            }
            case 13: {
                return this.fXh;
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
        cxq cxq2 = (cxq)((Object)cxc2);
        cxq2.fn(this.fXg);
        cxq2.fp(this.fXi);
        cxq2.fo(this.fXh);
        cxq2.fq(this.fXj);
        cxq2.fr(this.fXk);
        cxq2.fs(this.fXl);
        cxq2.ft(this.fXm);
        cxq2.fu(this.fXn);
        cxq2.fv(this.fXo);
        cxq2.fw(this.fXp);
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

