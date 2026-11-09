/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  cxg
 */
public class czf
extends czj {
    private int fZR = 0;
    private int fZS = 0;
    private float fXg = 0.0f;
    private float fZT = 0.0f;
    private float fZU = 0.0f;
    private float fZQ = 0.0f;
    private float fZV = 0.0f;
    private float fZW = 0.0f;
    private float fXD = 0.0f;
    private float fXi = 0.0f;
    private float fXh = 0.0f;
    private float fXj = 0.0f;
    private float fZX = 0.0f;
    private float fZO = 0.0f;
    private float fXA = 0.0f;
    private float fXk = 0.0f;
    private float fXl = 0.0f;
    private float fXm = 0.0f;
    private float fXn = 0.0f;
    private float fXo = 0.0f;
    private float fXp = 0.0f;

    public int bhA() {
        return this.fZR;
    }

    public void zi(int n2) {
        this.fZR = n2;
    }

    public int bhB() {
        return this.fZS;
    }

    public void zj(int n2) {
        this.fZS = n2;
    }

    public float bgc() {
        return this.fXg;
    }

    public void fn(float f2) {
        this.fXg = f2;
    }

    public float bhC() {
        return this.fZT;
    }

    public void fQ(float f2) {
        this.fZT = f2;
    }

    public float bhD() {
        return this.fZU;
    }

    public void fR(float f2) {
        this.fZU = f2;
    }

    public float bhE() {
        return this.fZQ;
    }

    public void fP(float f2) {
        this.fZQ = f2;
    }

    public float bhF() {
        return this.fZV;
    }

    public void fS(float f2) {
        this.fZV = f2;
    }

    public float bhG() {
        return this.fZW;
    }

    public void fT(float f2) {
        this.fZW = f2;
    }

    public float bgt() {
        return this.fXD;
    }

    public void fC(float f2) {
        this.fXD = f2;
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

    public float bhH() {
        return this.fZX;
    }

    public void fU(float f2) {
        this.fZX = f2;
    }

    @Override
    public float xo(int n2) {
        switch (n2) {
            case 1: {
                return this.emI.bgQ().fi().al(this.fZR);
            }
            case 25: {
                return this.emI.bgQ().fi().al(this.fZS);
            }
            case 2: {
                return this.fXg;
            }
            case 14: {
                return this.fZT;
            }
            case 22: {
                return this.fZU;
            }
            case 9: {
                return this.fZQ;
            }
            case 15: {
                return this.fZV;
            }
            case 16: {
                return this.fZW;
            }
            case 19: {
                return this.fXD;
            }
            case 23: {
                return this.fXi;
            }
            case 13: {
                return this.fXh;
            }
            case 17: {
                return this.fZX;
            }
            case 10: {
                return this.fXj;
            }
            case 4: {
                return this.fZO;
            }
            case 5: {
                return this.fXA;
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
        ddc2.duq = this.bhS();
        if (aqN.isDescendant(this.SkillType, cxd.fIk) || aqN.isDescendant(this.SkillType, cxd.fKF)) {
            int n2;
            ddx ddx2;
            ddc2.Magnitude = cxg.d((cxc)((Object)this), (int)this.bhT());
            if (this.SkillType == cxd.fId && (ddx2 = this.emI.bgQ().aJB()) != null && ResourceTree.isDescendant(ddx2.aRX, cug.fiA)) {
                ddc2.Magnitude = cxg.d((cxc)((Object)this), (int)540);
            }
            if (this.emI.bgQ().aJD().aEP().Uv()) {
                ddc2.Magnitude += 10.0f;
                ddc2.duq += 0.15f;
                if (!aqN.isDescendant(this.SkillType, cxd.fKa)) {
                    ddc2.Magnitude += 10.0f;
                }
            }
            if ((n2 = this.emI.bgQ().fi().ap(10400)) == 3 && cug.vJ((int)ddc2.dhr)) {
                ddc2.duq = 1.0f;
            }
        } else if (aqN.isDescendant(this.SkillType, cxd.fIm)) {
            ddc2.Magnitude = cxg.d((cxc)((Object)this), (int)this.bhT());
        } else {
            lfn.b(5, "SFContainerMeleeSkill", "configureSubSkillParams() Unhandled melee skill '" + this.getName() + "'");
            ddc2.Magnitude = 0.0f;
        }
        ddc2.doT = 0.0f;
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        czf czf2 = (czf)((Object)cxc2);
        czf2.zi(this.fZR);
        czf2.zj(this.fZS);
        czf2.fn(this.fXg);
        czf2.fQ(this.fZT);
        czf2.fR(this.fZU);
        czf2.fP(this.fZQ);
        czf2.fS(this.fZV);
        czf2.fT(this.fZW);
        czf2.fC(this.fXD);
        czf2.fp(this.fXi);
        czf2.fo(this.fXh);
        czf2.fq(this.fXj);
        czf2.fU(this.fZX);
        czf2.fN(this.fZO);
        czf2.fz(this.fXA);
        czf2.fr(this.fXk);
        czf2.fs(this.fXl);
        czf2.ft(this.fXm);
        czf2.fu(this.fXn);
        czf2.fv(this.fXo);
        czf2.fw(this.fXp);
    }

    public final void fq(float f2) {
        this.fXj = f2;
    }

    public final void fN(float f2) {
        this.fZO = f2;
    }

    public final void fz(float f2) {
        this.fXA = f2;
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

