/*
 * Decompiled with CFR.
 */
public class dgd
extends dgb {
    public int gpQ = 0;
    public int gpR = 0;
    public int dTD = del.d.gmt.ordinal();
    public ljq gpS = new ljq(0.0f, 0.0f, 0.0f);
    public ljq gpT = new ljq(0.0f, 0.0f, 0.0f);
    public ljq gpU = new ljq(0.0f, 0.0f, 0.0f);
    public ljq gpV = new ljq(0.0f, 0.0f, 0.0f);

    public dgd() {
        this.gpB = 1;
    }

    @Override
    protected void updateAtom(float f2) {
        ljq ljq2 = new ljq();
        if (this.dTD == del.d.gmq.ordinal()) {
            ljq2.x = this.gpS.x;
            ljq2.y = this.gpS.y;
            ljq2.rlV = this.gpS.rlV;
        } else if (this.dTD == del.d.gmr.ordinal()) {
            float f3 = 1.0f - f2;
            ljq2.x = f3 * this.gpS.x + f2 * this.gpT.x;
            ljq2.y = f3 * this.gpS.y + f2 * this.gpT.y;
            ljq2.rlV = f3 * this.gpS.rlV + f2 * this.gpT.rlV;
        } else if (this.dTD == del.d.gms.ordinal()) {
            float f4 = 1.0f - f2;
            float f5 = f4 * f4;
            float f6 = 2.0f * f4 * f2;
            float f7 = f2 * f2;
            ljq2.x = f5 * this.gpS.x + f6 * this.gpT.x + f7 * this.gpU.x;
            ljq2.y = f5 * this.gpS.y + f6 * this.gpT.y + f7 * this.gpU.y;
            ljq2.rlV = f5 * this.gpS.rlV + f6 * this.gpT.rlV + f7 * this.gpU.rlV;
        } else if (this.dTD == del.d.gmt.ordinal()) {
            float f8 = 1.0f - f2;
            float f9 = f8 * f8 * f8;
            float f10 = 3.0f * f8 * f8 * f2;
            float f11 = 3.0f * f8 * f2 * f2;
            float f12 = f2 * f2 * f2;
            ljq2.x = this.gpS.x * f9 + this.gpT.x * f10 + this.gpU.x * f11 + this.gpV.x * f12;
            ljq2.y = this.gpS.y * f9 + this.gpT.y * f10 + this.gpU.y * f11 + this.gpV.y * f12;
            ljq2.rlV = this.gpS.rlV * f9 + this.gpT.rlV * f10 + this.gpU.rlV * f11 + this.gpV.rlV * f12;
        }
        this.updateAtomParameter(this.gpQ, ljq2);
        this.updateAtomParameter(this.gpR, ljq2);
    }

    private void updateAtomParameter(int n2, ljq ljq2) {
        if (n2 == 0) {
            return;
        }
        if (n2 == del.c.gmm.ordinal()) {
            if (gpG != null) {
                gpG.setDeltaPos(ljq2);
            } else {
                ljq ljq3 = cDQ.esF();
                ljq3.es(ljq2);
                dgb.setAtomPosition(gpF, ljq3);
            }
        } else if (n2 == del.c.gmn.ordinal()) {
            lgl lgl2 = new lgl();
            lgl2.ep(ljq2);
            if (gpG != null) {
                gpG.setDeltaRot(lgl2);
            } else {
                dgb.setAtomRotation(gpF, lgl2);
            }
        } else if (n2 == del.c.gmo.ordinal()) {
            if (gpF.blo() == 14) {
                dfo dfo2 = (dfo)gpF;
                dfo2.bQ(ljq2);
            } else {
                lfn.b(5, this.getClass().getName(), "updateAtomParameter() : parameter #" + n2 + " not supported for atom type " + gpF.blo());
            }
        }
    }

    public ljq getVal1() {
        return this.gpS;
    }

    public void setVal1(ljq ljq2) {
        this.gpS = ljq2;
    }

    public ljq getVal2() {
        return this.gpT;
    }

    public void setVal2(ljq ljq2) {
        this.gpT = ljq2;
    }

    public ljq getVal3() {
        return this.gpU;
    }

    public void setVal3(ljq ljq2) {
        this.gpU = ljq2;
    }

    public ljq getVal4() {
        return this.gpV;
    }

    public void setVal4(ljq ljq2) {
        this.gpV = ljq2;
    }

    public int getInterpolationType() {
        return this.dTD;
    }

    public void setInterpolationType(int n2) {
        this.dTD = n2;
    }

    public int getAtomParameterVector1() {
        return this.gpQ;
    }

    public void setAtomParameterVector1(int n2) {
        this.gpQ = n2;
    }

    public int getAtomParameterVector2() {
        return this.gpR;
    }

    public void setAtomParameterVector2(int n2) {
        this.gpR = n2;
    }
}

