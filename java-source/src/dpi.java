/*
 * Decompiled with CFR.
 */
public class dpi
implements Comparable<dpi> {
    public final int cDO;
    public final int gMx;

    private dpi() {
        this.cDO = -1;
        this.gMx = -1;
    }

    public dpi(int n, int n2) {
        this.cDO = n;
        this.gMx = n2;
        assert (this.isValid());
    }

    public boolean isValid() {
        return this.cDO >= 0 && this.cDO < 10 && this.gMx >= 0 && this.gMx < 20;
    }

    public int e(dpi dpi2) {
        if (this.cDO < dpi2.cDO) {
            return -1;
        }
        if (this.cDO > dpi2.cDO) {
            return 1;
        }
        if (this.gMx < dpi2.gMx) {
            return -1;
        }
        if (this.gMx > dpi2.gMx) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        return "Category: " + this.cDO + " Slot: " + this.gMx;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.e((dpi)object);
    }
}

