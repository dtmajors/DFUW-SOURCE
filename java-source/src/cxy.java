/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hzo
 */
public class cxy
extends cxv {
    private float fXA = 0.0f;
    private float fXB = 0.0f;
    private float fXC = 0.0f;
    private float fXD = 0.0f;
    private float fXE = 0.0f;

    public final float bgq() {
        return this.fXA;
    }

    public final void fz(float f2) {
        this.fXA = f2;
    }

    public final float bgr() {
        return this.fXB;
    }

    public final void fA(float f2) {
        this.fXB = f2;
    }

    public final float bgs() {
        return this.fXC;
    }

    public final void fB(float f2) {
        this.fXC = f2;
    }

    public final float bgt() {
        return this.fXD;
    }

    public final void fC(float f2) {
        this.fXD = f2;
    }

    public final float bgu() {
        return this.fXE;
    }

    public final void fD(float f2) {
        this.fXE = f2;
    }

    public void bew() {
        this.fXd = false;
        this.bex();
    }

    @Override
    protected void bex() {
        lfn.b(5, "SFSalvagingSkillClient", "resetSkill() SkillSucceed : " + this.fXd);
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cxO() != null && hso.cxK().cxP().cxO() instanceof hzo && ((hzo)hso.cxK().cxP().cxO()).cIr() != null) {
            ((hzo)hso.cxK().cxP().cxO()).cIr().qc(this.fXd);
        }
        super.bex();
    }

    @Override
    public float xo(int n2) {
        switch (n2) {
            case 5: {
                return this.fXA;
            }
            case 6: {
                return this.fXB;
            }
            case 20: {
                return this.fXC;
            }
            case 19: {
                return this.fXD;
            }
            case 21: {
                return this.fXE;
            }
        }
        return super.xo(n2);
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        cxy cxy2 = (cxy)((Object)cxc2);
        cxy2.fz(this.fXA);
        cxy2.fA(this.fXB);
        cxy2.fB(this.fXC);
        cxy2.fC(this.fXD);
        cxy2.fD(this.fXE);
    }
}

