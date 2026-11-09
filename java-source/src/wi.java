/*
 * Decompiled with CFR.
 */
public class wi
extends wf {
    public ldv GUID = null;
    public int ResourceType = 0;
    public int asi = 0;
    public short aYA = 0;
    public short aYB = 0;

    public wi() {
        super((byte)10);
    }

    @Override
    protected void d(uk uk2) {
        super.d(uk2);
        vj vj2 = (vj)uk2;
        vj2.GUID = this.GUID;
        vj2.ResourceType = this.ResourceType;
        vj2.asi = this.asi;
        vj2.aXV = this.b(this.aYA);
        vj2.aXy = this.b(this.aYB);
    }

    @Override
    protected void c(uk uk2) {
        super.c(uk2);
        vj vj2 = (vj)uk2;
        this.GUID = vj2.GUID;
        this.ResourceType = vj2.ResourceType;
        this.asi = vj2.asi;
        this.aYA = lbc.mV(vj2.aXV);
        this.aYB = lbc.mV(vj2.aXy);
    }

    @Override
    public boolean e(uk uk2) {
        if (!super.e(uk2)) {
            return false;
        }
        vj vj2 = (vj)uk2;
        if (!this.GUID.equals(vj2.GUID)) {
            return false;
        }
        if (this.ResourceType != vj2.ResourceType) {
            return false;
        }
        if (this.asi != vj2.asi) {
            return false;
        }
        if (Math.abs(this.b(this.aYA) - vj2.aXV) > 0.001f) {
            return false;
        }
        return !(Math.abs(this.b(this.aYB) - vj2.aXy) > 0.001f);
    }

    private float b(short s) {
        float f2 = lbc.j(s);
        int n = (int)(f2 * 1000.0f + 0.5f);
        return (float)n / 1000.0f;
    }
}

