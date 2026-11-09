/*
 * Decompiled with CFR.
 */
class mqi
implements Comparable {
    public String Filename;
    public kte EcY = null;

    mqi() {
    }

    public int compareTo(Object object) {
        mqi mqi2 = (mqi)object;
        if (this.EcY == null || mqi2.EcY == null) {
            return -1;
        }
        if (this.EcY.qbe > mqi2.EcY.qbe) {
            return 1;
        }
        if (this.EcY.qbe < mqi2.EcY.qbe) {
            return -1;
        }
        return 0;
    }
}

