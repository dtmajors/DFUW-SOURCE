/*
 * Decompiled with CFR.
 */
public class ift
extends ifs {
    private float lSd;
    private float lSe;

    public ift(float f, float f2, float f3, float f4) {
        super(f3, f4);
        this.lSd = f;
        this.lSe = f2;
    }

    public float cSZ() {
        return this.lSd;
    }

    public float cTa() {
        return this.lSe;
    }

    public String toString() {
        return "ProwessTotal (MinProwessTotal=" + this.lSd + ", MaxProwessTotal=" + this.lSe + ", MinPlayerPoints=" + this.cSX() + ", maxPlayerPoints=" + this.cSY() + ")";
    }

    public boolean c(ign ign2, float f) {
        if (f >= this.lSd && f < this.lSe) {
            return super.j(ign2);
        }
        return false;
    }
}

