/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  cxg
 */
public class czk
extends czj {
    private int fZR = 0;
    private float fXg = 0.0f;
    private float fXq = 0.0f;
    private float fZO = 0.0f;
    private float fXA = 0.0f;
    private float gak = 0.0f;
    private float fZP = 0.0f;
    private float fZQ = 0.0f;
    private float fXj = 0.0f;
    private float fXr = 0.0f;
    private float gal = 0.0f;
    private float fZU = 0.0f;
    private float fXk = 0.0f;
    private float fXl = 0.0f;
    private float fXm = 0.0f;
    private float fXn = 0.0f;
    private float fXo = 0.0f;
    private float fXp = 0.0f;
    private int gam = 0;

    public int bhA() {
        return this.fZR;
    }

    public void zi(int n2) {
        this.fZR = n2;
    }

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

    public float bhU() {
        return this.fZO;
    }

    public void fN(float f2) {
        this.fZO = f2;
    }

    public float bgq() {
        return this.fXA;
    }

    public void fz(float f2) {
        this.fXA = f2;
    }

    public float bhV() {
        return this.gak;
    }

    public void fW(float f2) {
        this.gak = f2;
    }

    public float bhW() {
        return this.fZP;
    }

    public void fO(float f2) {
        this.fZP = f2;
    }

    public float bhE() {
        return this.fZQ;
    }

    public void fP(float f2) {
        this.fZQ = f2;
    }

    public float bgg() {
        return this.fXj;
    }

    public void fq(float f2) {
        this.fXj = f2;
    }

    public float bhX() {
        return this.gal;
    }

    public void fX(float f2) {
        this.gal = f2;
    }

    public int bhY() {
        return this.gam;
    }

    public void zm(int n2) {
        this.gam = n2;
    }

    @Override
    public float xo(int n2) {
        switch (n2) {
            case 1: {
                return this.emI.bgQ().fi().al(this.fZR);
            }
            case 2: {
                return this.fXg;
            }
            case 3: {
                return this.fXq;
            }
            case 4: {
                return this.fZO;
            }
            case 5: {
                return this.fXA;
            }
            case 7: {
                return this.gak;
            }
            case 8: {
                return this.fZP;
            }
            case 9: {
                return this.fZQ;
            }
            case 10: {
                return this.fXj;
            }
            case 11: {
                return this.gal;
            }
            case 13: {
                return this.fXr;
            }
            case 22: {
                return this.fZU;
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
        ajo ajo2;
        boolean bl = lgp.erA().cS(this.bhS());
        ddc2.aZH = this.emI.bgQ().aAG() != null ? this.emI.bgQ().aAG().av() : ddc2.aZD;
        ddc2.biu = bl ? cxi.fk(this.getPower()) : this.getPower();
        ddc2.duq = bl ? 1.0f : 0.0f;
        ddc2.aYF = this.emI.bgQ().getGUID();
        ddc2.gdZ = this.emI.bgQ().getObjectType();
        ddc2.aYC = this.SkillType;
        ddc2.Magnitude = cxg.d((cxc)((Object)this), (int)this.bhT());
        ddc2.doT = this.xn(this.gam);
        if (this.bhM() != null && this.bhM() instanceof ddn && (ajo2 = this.bhZ()) != null) {
            ddc2.bpU = ajo2.CO();
        }
    }

    public final ajo bhZ() {
        if (this.fGe != null) {
            int n2 = this.fGe.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (this.fGe[i2].Cl() != ajb.b.boK) continue;
                return (ajo)this.fGe[i2];
            }
        }
        return null;
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        czk czk2 = (czk)((Object)cxc2);
        czk2.zi(this.fZR);
        czk2.fn(this.fXg);
        czk2.fx(this.fXq);
        czk2.fN(this.fZO);
        czk2.fz(this.fXA);
        czk2.fW(this.gak);
        czk2.fO(this.fZP);
        czk2.fP(this.fZQ);
        czk2.fq(this.fXj);
        czk2.fy(this.bgh());
        czk2.fX(this.gal);
        czk2.zm(this.gam);
        czk2.fR(this.fZU);
        czk2.fr(this.fXk);
        czk2.fs(this.fXl);
        czk2.ft(this.fXm);
        czk2.fu(this.fXn);
        czk2.fv(this.fXo);
        czk2.fw(this.fXp);
    }

    @Override
    protected final boolean bhu() {
        assert (cxd.xS((int)this.SkillType));
        if (!cxg.bp((int)0, (int)1288)) {
            lfn.b(5, "SFContainerSpell", "performSkillCheck() SkillFunction '" + cxh.fH(1288) + "' was not defined.");
            return false;
        }
        float f2 = cxg.d((cxc)((Object)this), (int)1288);
        return this.cS(f2);
    }

    @Override
    protected void bhJ() {
        if (this.fGh.gcx && this.gad.geh == cxd.s.fSB && this.emI.bgQ() instanceof cev) {
            this.fGh.dpi = lgl.b(this.fGh.dpi, lgl.eqL(), ((cev)this.emI.bgQ()).eq(this.fGl));
        }
        super.bhJ();
    }

    public final float bgh() {
        return this.fXr;
    }

    public final void fy(float f2) {
        this.fXr = f2;
    }

    public final void fR(float f2) {
        this.fZU = f2;
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

