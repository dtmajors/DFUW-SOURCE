/*
 * Decompiled with CFR.
 */
public abstract class afy
extends agj {
    protected int SkillType = 0;
    protected double aXq = 0.0;
    protected double Up = 0.0;

    public afy(ahu.b b2) {
        super(b2);
    }

    public final int zg() {
        return this.SkillType;
    }

    public final void eI(int n) {
        this.SkillType = n;
    }

    public final double Ay() {
        return this.aXq;
    }

    public final void t(double d2) {
        this.aXq = d2;
    }

    public final double Az() {
        return this.Up;
    }

    public final void u(double d2) {
        this.Up = d2;
    }

    public final String eJ(int n) {
        return lea.enZ().getName(n);
    }
}

