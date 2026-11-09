/*
 * Decompiled with CFR.
 */
public class lef {
    private final int ID;

    private lef() {
        this.ID = 0;
    }

    public lef(int n) {
        this.ID = n;
    }

    public int intValue() {
        return this.ID;
    }

    public boolean equals(Object object) {
        if (object instanceof lef) {
            lef lef2 = (lef)object;
            return this.ID == lef2.intValue();
        }
        assert (false);
        return false;
    }

    public int hashCode() {
        return 31 + this.ID;
    }

    public String toString() {
        return "[" + this.ID + "]";
    }
}

