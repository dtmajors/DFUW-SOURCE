/*
 * Decompiled with CFR.
 */
class gd {
    public int Uo = 0;
    public double Up = 0.0;

    public boolean equals(Object object) {
        if (object instanceof gd) {
            gd gd2 = (gd)object;
            if (gd2.Uo == this.Uo) {
                return true;
            }
        }
        return false;
    }

    public void reset() {
        this.Uo = 0;
        this.Up = 0.0;
    }

    public String toString() {
        return "SFEventPropertyTimer: PropertyID=" + this.Uo + " Timeout=" + this.Up;
    }
}

