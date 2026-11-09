/*
 * Decompiled with CFR.
 */
public class dcd
extends dbw {
    private static final float gcF = 1.0f;
    private int SkillType = 0;
    private double gcH = 0.0;

    public dcd() {
        super(cxd.j.fRB);
    }

    public void eI(int n2) {
        this.SkillType = n2;
    }

    @Override
    public void nh() {
        if (this.gcH == 0.0) {
            return;
        }
        double d2 = this.boj.getMessageDelegator().arc().rgz;
        while (d2 >= this.gcH) {
            this.gcH += 1.0;
            this.boj.jk().yZ(this.SkillType);
        }
    }

    @Override
    public void bjk() {
        assert (this.boj.bfF());
        this.gcH = this.boj.getMessageDelegator().arc().rgz + 1.0;
    }

    @Override
    public void beQ() {
        assert (this.boj.bfF());
        this.gcH = 0.0;
    }

    @Override
    protected void a(dbw dbw2) {
        super.a(dbw2);
        dcd dcd2 = (dcd)dbw2;
        dcd2.eI(this.SkillType);
    }
}

