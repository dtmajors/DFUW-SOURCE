/*
 * Decompiled with CFR.
 */
public class lz
implements Cloneable,
Comparable<lz> {
    public String hE;
    public int hB;
    public int di;
    public String bc;
    public ldv awE;
    public ldv Ri;

    public boolean qf() {
        return this.awE != null;
    }

    public String toString() {
        if (this.awE != null) {
            return "\"" + this.bc + "\": Account " + this.hE + "(" + this.hB + ") Online NodeID " + this.di + " PO " + this.awE + " PSO " + this.Ri;
        }
        return "\"" + this.bc + "\": Account " + this.hE + "(" + this.hB + ") Offline PSO " + this.Ri;
    }

    public boolean h(lz lz2) {
        return this.i(lz2) == 0;
    }

    public int i(lz lz2) {
        int n;
        if (this == lz2) {
            return 0;
        }
        if (this.hE != lz2.hE) {
            if (this.hE == null) {
                return -1;
            }
            if (lz2.hE == null) {
                return 1;
            }
            n = this.hE.compareTo(lz2.hE);
            if (n != 0) {
                return n;
            }
        }
        if (this.hB != lz2.hB) {
            return this.hB - lz2.hB;
        }
        if (this.di != lz2.di) {
            return this.di - lz2.di;
        }
        if (this.bc != lz2.bc) {
            if (this.bc == null) {
                return -1;
            }
            if (lz2.bc == null) {
                return 1;
            }
            n = this.bc.compareTo(lz2.bc);
            if (n != 0) {
                return n;
            }
        }
        if (this.awE != lz2.awE) {
            if (this.awE == null) {
                return -1;
            }
            if (lz2.awE == null) {
                return 1;
            }
            return this.awE.tX(lz2.awE);
        }
        if (this.Ri != lz2.Ri) {
            if (this.Ri == null) {
                return -1;
            }
            if (lz2.Ri == null) {
                return 1;
            }
            return this.Ri.tX(lz2.Ri);
        }
        return 0;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.i((lz)object);
    }
}

