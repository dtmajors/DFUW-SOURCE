/*
 * Decompiled with CFR.
 */
public class kvk
extends kvl {
    private float qef;
    private ljq qee;
    private boolean bWb;

    public kvk() {
        this.qbN = 5379;
    }

    public float ehf() {
        return this.qef;
    }

    public void mQ(float f) {
        this.qef = f;
    }

    public ljq ehe() {
        return this.qee;
    }

    public void dJ(ljq ljq2) {
        this.qee = ljq2;
    }

    public boolean ehn() {
        return this.bWb;
    }

    public void xI(boolean bl) {
        this.bWb = bl;
    }

    @Override
    public String toString() {
        return "BoundingSphereRadius = " + this.qef + ", BoundingSphereCenter = " + this.qee + ", CanWalkOnWater = " + this.bWb;
    }
}

