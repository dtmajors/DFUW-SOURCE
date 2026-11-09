/*
 * Decompiled with CFR.
 */
public class ahr
extends ahz {
    private float SkillLevel = 0.0f;

    public ahr() {
        super(2);
        this.bls = ahu.c.bmG;
    }

    public float Bt() {
        return this.SkillLevel;
    }

    public void ag(float f) {
        this.SkillLevel = f;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 1: {
                return "SkillLevel";
            }
        }
        return super.eB(n);
    }

    @Override
    public void a(gym gym2, int n) {
        if (gym2.bEz() != 12048) {
            return;
        }
        gyw gyw2 = (gyw)gym2;
        boolean bl = false;
        if ((gyw2.ija & 1) > 0 && this.SkillLevel != gyw2.SkillLevel) {
            this.SkillLevel = gyw2.SkillLevel;
            this.L(1, n);
            bl = true;
        }
        if (bl) {
            this.BE();
        }
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 1: {
                ue ue2 = new ue();
                ue2.Uo = n;
                ue2.Pz = this.SkillLevel;
                return ue2;
            }
        }
        return super.G(n, n2);
    }
}

