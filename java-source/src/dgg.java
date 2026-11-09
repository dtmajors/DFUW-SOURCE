/*
 * Decompiled with CFR.
 */
public class dgg
extends dgb {
    private int gpK = 0;
    private int gpL = 0;
    private float gpY = 0.5f;
    private float gpZ = 0.5f;
    private float gqa = 0.01f;
    private boolean gqb = false;
    private float eoa = -1.0f;

    public dgg() {
        this.gpB = (short)2;
    }

    @Override
    public void updateAtom(float f2) {
        if (this.eoa < 0.0f || gpJ - this.eoa > this.gqa) {
            this.eoa = gpJ;
            float f3 = this.gpY + 2.0f * ((float)Math.random() - 0.5f) * this.gpZ;
            if (this.gqb) {
                float f4 = dgg.getAtomValueFloat(gpF, this.gpK);
                dgg.setAtomValueFloat(gpF, this.gpK, f4 + f3);
                f4 = dgg.getAtomValueFloat(gpF, this.gpL);
                dgg.setAtomValueFloat(gpF, this.gpL, f4 + f3);
            } else {
                dgg.setAtomValueFloat(gpF, this.gpK, f3);
                dgg.setAtomValueFloat(gpF, this.gpL, f3);
            }
        }
    }

    public float getCenterValue() {
        return this.gpY;
    }

    public void setCenterValue(float f2) {
        this.gpY = f2;
    }

    public float getRange() {
        return this.gpZ;
    }

    public void setRange(float f2) {
        this.gpZ = f2;
    }

    public float getPeriod() {
        return this.gqa;
    }

    public void setPeriod(float f2) {
        this.gqa = f2;
    }

    public boolean isAdd() {
        return this.gqb;
    }

    public void setAdd(boolean bl) {
        this.gqb = bl;
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

