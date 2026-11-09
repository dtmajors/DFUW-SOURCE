/*
 * Decompiled with CFR.
 */
public class dgc
extends dgb {
    private int gpK = del.b.glF.ordinal();
    private int gpL = del.b.glF.ordinal();
    private int dTD = del.d.gmt.ordinal();
    private float gpM = 0.0f;
    private float gpN = 0.3f;
    private float gpO = 0.7f;
    private float gpP = 1.0f;

    public dgc() {
        this.gpB = 0;
    }

    @Override
    protected void updateAtom(float f2) {
        float f3 = 0.0f;
        if (this.dTD == del.d.gmq.ordinal()) {
            f3 = this.gpM;
        } else if (this.dTD == del.d.gmr.ordinal()) {
            f3 = this.gpM * (1.0f - f2) + f2 * this.gpN;
        } else if (this.dTD == del.d.gms.ordinal()) {
            float f4 = 1.0f - f2;
            f3 = this.gpM * f4 * f4 + 2.0f * f4 * f2 * this.gpN + f2 * f2 * this.gpO;
        } else if (this.dTD == del.d.gmt.ordinal()) {
            float f5 = 1.0f - f2;
            float f6 = f5 * f5 * f5;
            float f7 = 3.0f * f5 * f5 * f2;
            float f8 = 3.0f * f5 * f2 * f2;
            float f9 = f2 * f2 * f2;
            f3 = this.gpM * f6 + this.gpN * f7 + this.gpO * f8 + this.gpP * f9;
        }
        if (this.gpK != del.b.glF.ordinal()) {
            dgc.setAtomValueFloat(gpF, this.gpK, f3);
        }
        if (this.gpL != del.b.glF.ordinal()) {
            dgc.setAtomValueFloat(gpF, this.gpL, f3);
        }
    }

    public float getVal1() {
        return this.gpM;
    }

    public void setVal1(float f2) {
        this.gpM = f2;
    }

    public float getVal2() {
        return this.gpN;
    }

    public void setVal2(float f2) {
        this.gpN = f2;
    }

    public float getVal3() {
        return this.gpO;
    }

    public void setVal3(float f2) {
        this.gpO = f2;
    }

    public float getVal4() {
        return this.gpP;
    }

    public void setVal4(float f2) {
        this.gpP = f2;
    }

    public int getInterpolationType() {
        return this.dTD;
    }

    public void setInterpolationType(int n2) {
        this.dTD = n2;
    }

    public int getAtomParameterFloat1() {
        return this.gpK;
    }

    public void setAtomParameterFloat1(int n2) {
        this.gpK = n2;
    }

    public int getAtomParameterFloat2() {
        return this.gpL;
    }

    public void setAtomParameterFloat2(int n2) {
        this.gpL = n2;
    }
}

