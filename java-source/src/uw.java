/*
 * Decompiled with CFR.
 */
public abstract class uw
extends vd {
    public int SkillType = 0;
    public double aXq = 0.0;
    public double Up = 0.0;

    public uw(int n) {
        super(n);
    }

    private uw() {
        super(0);
    }

    @Override
    protected void b(uk uk2) {
        super.b(uk2);
        uw uw2 = (uw)uk2;
        uw2.SkillType = this.SkillType;
        uw2.aXq = this.aXq;
        uw2.Up = this.Up;
    }
}

