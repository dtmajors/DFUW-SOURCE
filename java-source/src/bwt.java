/*
 * Decompiled with CFR.
 */
public class bwt {
    public final int dWW;
    public final int SpecialEffectType;

    public bwt(int n, int n2) {
        this.dWW = n;
        this.SpecialEffectType = n2;
    }

    public String aCF() {
        return bwn.ny(this.dWW);
    }

    public String getSpecialEffectName() {
        return del.zU(this.SpecialEffectType);
    }

    public bwt aCG() {
        return new bwt(this.dWW, this.SpecialEffectType);
    }

    public String toString() {
        return "SFMissileSpecialEffect: MissileState='" + this.aCF() + "' SpecialEffect='" + this.getSpecialEffectName() + "'";
    }
}

