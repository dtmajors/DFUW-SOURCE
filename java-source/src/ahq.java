/*
 * Decompiled with CFR.
 */
public class ahq
extends agt {
    private int SkillType = 0;
    private float SkillLevel = 0.0f;
    private float aXV = 0.0f;

    public ahq() {
        super(ahu.b.bmc);
        this.bhY = new agj.a[3];
        this.bhY[0] = new agj.a(this, 1);
        this.bhY[1] = new agj.a(this, 4);
        this.bhY[2] = new agj.a(this, 8);
    }

    public int zg() {
        return this.SkillType;
    }

    public void eI(int n) {
        this.SkillType = n;
    }

    public float Bt() {
        return this.SkillLevel;
    }

    public void ag(float f) {
        this.SkillLevel = f;
    }

    public float Bb() {
        return this.aXV;
    }

    public void aa(float f) {
        this.aXV = f;
    }

    @Override
    public vd eD(int n) {
        vq vq2 = new vq();
        vq2.Uo = this.AJ();
        if (this.eT(1) > n && !this.bhX) {
            vq2.aXP = 1;
            vq2.GUID = this.GUID;
            vq2.aXV = this.aXV;
            vq2.SkillType = this.SkillType;
            vq2.SkillLevel = this.SkillLevel;
            return vq2;
        }
        if (this.eT(8) > n) {
            vq2.aXP |= 8;
            vq2.GUID = this.GUID;
            vq2.aXV = this.aXV;
            vq2.SkillLevel = this.SkillLevel;
        }
        if (this.eT(4) > n && this.bhX) {
            if (this.eX(n)) {
                return null;
            }
            vq2.aXP = 4;
            vq2.GUID = this.GUID;
        }
        if (vq2.GUID == null) {
            return null;
        }
        return vq2;
    }

    public String Bu() {
        return lea.enZ().getName(this.SkillType);
    }

    public String toString() {
        return "SFSkillRepresentationEventProperty: GUID=" + this.GUID + " SkillName='" + this.Bu() + "'";
    }
}

