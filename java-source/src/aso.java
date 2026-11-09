/*
 * Decompiled with CFR.
 */
public final class aso {
    private boolean Active;
    private double bVG;
    private double bVH;
    private double bVI;

    public aso(double d2) {
        this.ai(d2);
        this.Active = true;
    }

    public boolean isActive() {
        return this.Active;
    }

    public boolean ag(double d2) {
        if (!this.Active) {
            return false;
        }
        if (this.bVH == 0.0) {
            return true;
        }
        if (d2 >= this.bVG) {
            this.bVG = d2 + this.bVH + arw.e(-this.bVI, this.bVI);
            return true;
        }
        return false;
    }

    public void TO() {
        this.bVG = 0.0;
    }

    public void setActive(boolean bl) {
        this.Active = bl;
    }

    public void ah(double d2) {
        this.bVI = d2 > this.bVH ? this.bVH : d2;
    }

    public void ai(double d2) {
        if (d2 > 0.0) {
            double d3;
            this.bVH = 1.0 / d2;
            this.bVI = this.bVH * 0.2;
            this.bVI = d3 > 0.05 ? this.bVI : 0.05;
        } else if (d2 == 0.0) {
            this.bVH = 0.0;
        } else assert (false) : "Invalid updates per second: " + d2;
    }

    public String toString() {
        return null;
    }
}

