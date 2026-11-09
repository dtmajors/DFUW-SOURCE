/*
 * Decompiled with CFR.
 */
public class lek {
    public int cf = 0;
    public int cg = 0;
    public int riS = 0;

    public lek() {
    }

    public lek(int n, int n2, int n3) {
        this.cf = n;
        this.cg = n2;
        this.riS = n3;
    }

    public lek(lek lek2) {
        this.cf = lek2.cf;
        this.cg = lek2.cg;
        this.riS = lek2.riS;
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

    public int eqe() {
        return this.riS;
    }

    public void acs(int n) {
        this.riS = n;
    }

    public String toString() {
        return null;
    }

    public boolean equals(Object object) {
        if (object instanceof lek) {
            lek lek2 = (lek)object;
            return lek2.cf == this.cf && lek2.cg == this.cg && lek2.riS == this.riS;
        }
        return false;
    }
}

