/*
 * Decompiled with CFR.
 */
public class bst {
    private bss dJC;
    private String dJD;
    private int dJE;

    public bst(String string, int n) {
        this.dJD = string;
        this.dJE = n;
    }

    public String axf() {
        return this.dJD;
    }

    public int axg() {
        return this.dJE;
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + this.dJE;
        n2 = 31 * n2 + (this.dJD == null ? 0 : this.dJD.hashCode());
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        bst bst2 = (bst)object;
        if (this.dJE != bst2.dJE) {
            return false;
        }
        return !(this.dJD == null ? bst2.dJD != null : !this.dJD.equals(bst2.dJD));
    }

    public String toString() {
        return ":Level: Filename = " + this.dJD + ", LevelID = " + this.dJE;
    }

    public bss axh() {
        return this.dJC;
    }

    public void a(bss bss2) {
        this.dJC = bss2;
    }
}

