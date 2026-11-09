/*
 * Decompiled with CFR.
 */
public class aga
extends afy {
    private int aXr = 0;
    private boolean bhz = false;

    public final void aG(boolean bl) {
        this.bhz = bl;
    }

    public aga() {
        super(ahu.b.blR);
        this.bhY = new agj.a[3];
        this.bhY[0] = new agj.a(this, 1);
        this.bhY[1] = new agj.a(this, 2);
        this.bhY[2] = new agj.a(this, 4);
    }

    public int AB() {
        return this.aXr;
    }

    public void eL(int n) {
        this.aXr = n;
    }

    @Override
    public vd eD(int n) {
        if (this.bhz && !this.eX(n) && this.Up < 604800.0) {
            return null;
        }
        ux ux2 = new ux();
        ux2.Uo = this.AJ();
        if (this.eT(1) > n && !this.bhX) {
            ux2.aXP = 1;
            ux2.SkillType = this.SkillType;
            ux2.aXq = this.aXq;
            ux2.Up = this.Up;
            ux2.aXr = this.aXr;
            return ux2;
        }
        if (this.eT(2) > n && !this.bhX) {
            ux2.aXP = 2;
            ux2.SkillType = this.SkillType;
            ux2.aXq = this.aXq;
            ux2.Up = this.Up;
            ux2.aXr = this.aXr;
            return ux2;
        }
        if (this.eT(4) > n && this.bhX) {
            if (this.eX(n)) {
                return null;
            }
            if (!this.bhz || this.Up > 604800.0) {
                ux2.aXP = 4;
                ux2.SkillType = this.SkillType;
                ux2.aXr = this.aXr;
                ux2.Up = this.Up;
                return ux2;
            }
        }
        lfn.b(5, "SFBlockingItemSingleEventProperty", "getEventPropertyUpdate() Should never happen: " + this.toString());
        lfn.b(5, "SFBlockingItemSingleEventProperty", "getEventPropertyUpdate() TimeSliceNumber=" + n);
        this.gt();
        assert (false);
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFBlockingItemSingleEventProperty: SkillType='");
        stringBuilder.append(this.eJ(this.SkillType));
        stringBuilder.append("' BlockingSkillType='");
        stringBuilder.append(this.eJ(this.aXr));
        stringBuilder.append("' Timeout=");
        stringBuilder.append(this.Up);
        return stringBuilder.toString();
    }
}

