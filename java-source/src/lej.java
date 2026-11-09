/*
 * Decompiled with CFR.
 */
public class lej {
    private int cf = 0;
    private int cg = 0;

    public lej() {
    }

    public lej(int n, int n2) {
        this.cf = n;
        this.cg = n2;
    }

    public lej(lej lej2) {
        this.cf = lej2.cf;
        this.cg = lej2.cg;
    }

    public boolean fU(int n, int n2) {
        return this.cf == n && this.cg == n2;
    }

    public int getX() {
        return this.cf;
    }

    public void RH(int n) {
        this.cf = n;
    }

    public int getY() {
        return this.cg;
    }

    public void RI(int n) {
        this.cg = n;
    }

    public String toString() {
        return null;
    }

    public boolean equals(Object object) {
        if (object instanceof lej) {
            lej lej2 = (lej)object;
            return lej2.cf == this.cf && lej2.cg == this.cg;
        }
        return false;
    }

    public int hashCode() {
        return this.cf * this.cg;
    }
}

