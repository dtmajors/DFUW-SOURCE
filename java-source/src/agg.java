/*
 * Decompiled with CFR.
 */
public class agg
extends agt {
    private int aXx = 0;
    private float aXy = 0.0f;

    public agg(boolean bl) {
        super(ahu.b.blS);
        if (bl) {
            this.bhY = new agj.a[1];
            this.bhY[0] = new agj.a(this, 256);
        } else {
            this.bhY = new agj.a[3];
            this.bhY[0] = new agj.a(this, 1);
            this.bhY[1] = new agj.a(this, 4);
            this.bhY[2] = new agj.a(this, 256);
        }
    }

    public void eP(int n) {
        this.aXx = n;
    }

    public float getWeight() {
        return this.aXy;
    }

    public void setWeight(float f) {
        this.aXy = f;
    }

    @Override
    public vd eD(int n) {
        va va2 = new va();
        va2.Uo = this.AJ();
        if (this.aXx != 4) {
            if (this.eT(1) > n && !this.bhX) {
                va2.aXP = 1;
                va2.aXx = this.aXx;
                va2.GUID = this.GUID;
                return va2;
            }
            if (this.eT(4) > n && this.bhX) {
                va2.aXP = 4;
                va2.aXx = this.aXx;
                va2.GUID = this.GUID;
                return va2;
            }
        }
        if (this.eT(256) > n) {
            va2.aXP |= 0x108;
            va2.GUID = this.GUID;
            va2.aXy = this.aXy;
        }
        if (va2.GUID == null) {
            return null;
        }
        return va2;
    }

    public String toString() {
        return "SFContainerItemEventProperty: ContainerType=" + this.aXx + " GUID=" + this.GUID;
    }
}

