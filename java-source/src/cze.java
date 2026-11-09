/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxg
 */
public class cze
extends czj {
    private float fXg = 0.0f;
    private float fZO = 0.0f;
    private float fXA = 0.0f;
    private float fZP = 0.0f;
    private float fZQ = 0.0f;
    private float fXh = 0.0f;
    private float fXi = 0.0f;
    private float fXj = 0.0f;
    private float fXk = 0.0f;
    private float fXl = 0.0f;
    private float fXm = 0.0f;
    private float fXn = 0.0f;
    private float fXo = 0.0f;
    private float fXp = 0.0f;

    public float bge() {
        return this.fXi;
    }

    public void fp(float f2) {
        this.fXi = f2;
    }

    public void fn(float f2) {
        this.fXg = f2;
    }

    public void fN(float f2) {
        this.fZO = f2;
    }

    public void fz(float f2) {
        this.fXA = f2;
    }

    public void fO(float f2) {
        this.fZP = f2;
    }

    public void fP(float f2) {
        this.fZQ = f2;
    }

    public void fo(float f2) {
        this.fXh = f2;
    }

    @Override
    public float xo(int n2) {
        switch (n2) {
            case 2: {
                return this.fXg;
            }
            case 4: {
                return this.fZO;
            }
            case 5: {
                return this.fXA;
            }
            case 8: {
                return this.fZP;
            }
            case 9: {
                return this.fZQ;
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
    protected void c(ddc ddc2) {
        ddc2.aZH = this.emI.bgQ().aAG() != null ? this.emI.bgQ().aAG().av() : ddc2.aZD;
        ddc2.aYF = this.emI.bgQ().getGUID();
        ddc2.gdZ = this.emI.bgQ().getObjectType();
        ddc2.aYC = this.SkillType;
        ddc2.Magnitude = cxg.d((cxc)((Object)this), (int)this.bhT());
        ddc2.doT = 0.0f;
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        cze cze2 = (cze)((Object)cxc2);
        cze2.fn(this.fXg);
        cze2.fN(this.fZO);
        cze2.fz(this.fXA);
        cze2.fO(this.fZP);
        cze2.fq(this.fXj);
        cze2.fP(this.fZQ);
        cze2.fo(this.fXh);
        cze2.fp(this.fXi);
        cze2.fr(this.fXk);
        cze2.fs(this.fXl);
        cze2.ft(this.fXm);
        cze2.fu(this.fXn);
        cze2.fv(this.fXo);
        cze2.fw(this.fXp);
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

