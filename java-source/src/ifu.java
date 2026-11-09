/*
 * Decompiled with CFR.
 */
public class ifu
extends ifs {
    private float lSf;
    private float lSg;

    public ifu(float f, float f2, float f3, float f4) {
        super(f3, f4);
        this.lSf = f;
        this.lSg = f2;
    }

    public float cTb() {
        return this.lSf;
    }

    public float cTc() {
        return this.lSg;
    }

    public String toString() {
        return "SkillAverage (MinSkillAverage=" + this.lSf + ", MaxSkillAverage=" + this.lSg + ", MinPlayerPoints=" + this.cSX() + ", maxPlayerPoints=" + this.cSY() + ")";
    }

    public boolean c(ign ign2, float f) {
        if (f >= this.lSf && f < this.lSg) {
            return super.j(ign2);
        }
        return false;
    }
}

