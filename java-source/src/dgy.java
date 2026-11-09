/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
public class dgy
extends dgj {
    private float gtD = 1.0f;

    public dgy() {
        this.gqB = 96;
    }

    public void initializeSpecialEffect() {
        super.initializeSpecialEffect();
    }

    public void overideParentAtomParameters(dey dey2) {
        if (dey2 != null && dey2.blo() == 14) {
            dfo dfo2 = (dfo)dey2;
            dfo2.setScaleY(this.gtD);
        }
    }

    public void copyValues(dgj dgj2) {
        super.copyValues(dgj2);
        dgy dgy2 = (dgy)dgj2;
        dgy2.setScaleY(this.gtD);
    }

    public void setDefaultValues() {
        super.setDefaultValues();
        this.setInheritDuration(true);
        this.gtD = 1.0f;
    }

    public void setScaleY(float f2) {
        this.gtD = f2;
    }

    public float getScaleY() {
        return this.gtD;
    }
}

