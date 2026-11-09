/*
 * Decompiled with CFR.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class agv
extends agt {
    private int ResourceType = 0;
    private int asi = 0;
    private float aXV = 0.0f;
    private float aXy = 0.0f;

    public agv() {
        super(ahu.b.blV);
        this.bhY = new agj.a[4];
        this.bhY[0] = new agj.a(this, 1);
        this.bhY[1] = new agj.a(this, 4);
        this.bhY[2] = new agj.a(this, 128);
        this.bhY[3] = new agj.a(this, 16);
    }

    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    public int vf() {
        return this.asi;
    }

    public void do(int n) {
        this.asi = n;
    }

    public float Bb() {
        return this.aXV;
    }

    public void aa(float f) {
        this.aXV = f;
    }

    public float getWeight() {
        return this.aXy;
    }

    public void setWeight(float f) {
        this.aXy = f;
    }

    public String pa() {
        return lea.enW().getName(this.ResourceType);
    }

    @Override
    public vd eD(int n) {
        vj vj2 = new vj();
        vj2.Uo = this.AJ();
        if (this.eT(1) > n && !this.bhX) {
            vj2.aXP = 1;
            vj2.GUID = this.GUID;
            vj2.ResourceType = this.ResourceType;
            vj2.asi = this.asi;
            vj2.aXV = this.aXV;
            vj2.aXy = this.aXy;
            return vj2;
        }
        if (this.eT(128) > n) {
            vj2.aXP |= 0x88;
            vj2.GUID = this.GUID;
            vj2.asi = this.asi;
        }
        if (this.eT(16) > n) {
            vj2.aXP |= 0x18;
            vj2.GUID = this.GUID;
            vj2.aXV = this.aXV;
        }
        if (this.eT(4) > n && this.bhX) {
            if (this.eX(n)) {
                return null;
            }
            vj2.aXP = 4;
            vj2.GUID = this.GUID;
        }
        if (vj2.GUID == null) {
            return null;
        }
        return vj2;
    }

    public String toString() {
        return "SFItemRepresentationEventProperty: GUID=" + this.GUID + " ResourceType='" + this.pa() + "'";
    }
}

