/*
 * Decompiled with CFR.
 */
public class dur {
    private int bhh = 0;
    private int eeC = 0;

    public dur(int n) {
        this.bhh = 0;
        this.eeC = n;
    }

    public dur(int n, int n2) {
        this.bhh = n;
        this.eeC = n2;
    }

    public int aFZ() {
        return this.bhh;
    }

    public int aFO() {
        return this.eeC;
    }

    public boolean equals(Object object) {
        dur dur2;
        return object instanceof dur && this.bhh == (dur2 = (dur)object).aFZ() && this.eeC == dur2.aFO();
    }

    public String toString() {
        return "SFMaterialKey: SubsetID = " + this.bhh + " MaterialID = " + this.eeC;
    }
}

