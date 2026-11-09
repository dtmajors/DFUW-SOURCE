/*
 * Decompiled with CFR.
 */
public class wv
extends wf {
    public ldv GUID = null;
    public int SkillType = 0;
    public short aZC = 0;
    public short aYA = 0;

    public wv() {
        super((byte)13);
    }

    @Override
    protected void d(uk uk2) {
        super.d(uk2);
        vq vq2 = (vq)uk2;
        vq2.GUID = this.GUID;
        vq2.SkillType = this.SkillType;
        vq2.SkillLevel = lbc.j(this.aZC);
        vq2.aXV = lbc.j(this.aYA);
    }

    @Override
    protected void c(uk uk2) {
        super.c(uk2);
        vq vq2 = (vq)uk2;
        this.GUID = vq2.GUID;
        this.SkillType = vq2.SkillType;
        this.aZC = lbc.mV(vq2.SkillLevel);
        this.aYA = lbc.mV(vq2.aXV);
    }

    @Override
    public boolean e(uk uk2) {
        if (!super.e(uk2)) {
            return false;
        }
        vq vq2 = (vq)uk2;
        if (!this.k(this.GUID, vq2.GUID)) {
            return false;
        }
        if (this.SkillType != vq2.SkillType) {
            return false;
        }
        if (Math.abs(lbc.j(this.aZC) - vq2.SkillLevel) > 0.01f) {
            return false;
        }
        return !(Math.abs(lbc.j(this.aYA) - vq2.aXV) > 0.01f);
    }

    private boolean k(ldv ldv2, ldv ldv3) {
        if (ldv2 == null != (ldv3 == null)) {
            return false;
        }
        if (ldv2 == null) {
            return true;
        }
        return ldv2.equals(ldv3);
    }
}

