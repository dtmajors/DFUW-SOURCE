/*
 * Decompiled with CFR.
 */
public class afz
extends afy {
    private int aXp = -1;
    private boolean bhy = false;

    public afz() {
        super(ahu.b.blQ);
        this.bhY = new agj.a[3];
        this.bhY[0] = new agj.a(this, 1);
        this.bhY[1] = new agj.a(this, 2);
        this.bhY[2] = new agj.a(this, 4);
    }

    public int AA() {
        return this.aXp;
    }

    public void eK(int n) {
        this.aXp = n;
    }

    public void aF(boolean bl) {
        this.bhy = bl;
    }

    @Override
    public vd eD(int n) {
        if (this.bhy && !this.eX(n)) {
            return null;
        }
        uv uv2 = new uv();
        uv2.Uo = this.AJ();
        if (this.eT(1) > n && !this.bhX) {
            uv2.aXP = 1;
            uv2.SkillType = this.SkillType;
            uv2.aXq = this.aXq;
            uv2.Up = this.Up;
            uv2.aXp = this.aXp;
            return uv2;
        }
        if (this.eT(2) > n && !this.bhX) {
            uv2.aXP = 2;
            uv2.SkillType = this.SkillType;
            uv2.aXq = this.aXq;
            uv2.Up = this.Up;
            uv2.aXp = this.aXp;
            return uv2;
        }
        if (this.eT(4) > n && this.bhX) {
            if (this.eX(n)) {
                return null;
            }
            if (!this.bhy) {
                uv2.aXP = 4;
                uv2.SkillType = this.SkillType;
                uv2.aXp = this.aXp;
                return uv2;
            }
        }
        lfn.b(5, "SFBlockingItemGroupEventProperty", "getEventPropertyUpdate() Should never happen: " + this.toString());
        lfn.b(5, "SFBlockingItemGroupEventProperty", "getEventPropertyUpdate() TimeSliceNumber=" + n);
        this.gt();
        assert (false);
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFBlockingItemGroupEventProperty: SkillType='");
        stringBuilder.append(this.eJ(this.SkillType));
        stringBuilder.append("' BlockingGroupType='");
        stringBuilder.append((Object)cxd.b.getBlockingGroupType(this.aXp));
        stringBuilder.append("' Timeout=");
        stringBuilder.append(this.Up);
        return stringBuilder.toString();
    }
}

