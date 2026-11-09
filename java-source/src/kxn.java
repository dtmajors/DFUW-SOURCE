/*
 * Decompiled with CFR.
 */
public abstract class kxn {
    public int[] qgJ = null;
    public a qgK = null;
    public kxt[] qgL = null;

    public final boolean aaR(int n) {
        assert (n != 0);
        assert (this.qgL != null);
        int n2 = this.qgL.length;
        for (int i = 0; i < n2; ++i) {
            if (!this.qgL[i].aaR(n)) continue;
            return true;
        }
        return false;
    }

    public final boolean aaS(int n) {
        assert (n != 0);
        if (this.qgJ != null) {
            int n2 = this.qgJ.length;
            for (int i = 0; i < n2; ++i) {
                if (this.qgJ[i] != n) continue;
                return true;
            }
        }
        return false;
    }

    public final boolean eik() {
        assert (this.qgL != null);
        int n = 0;
        int n2 = this.qgL.length;
        for (int i = 0; i < n2; ++i) {
            if (!this.qgL[i].qgQ) continue;
            ++n;
        }
        return n > 0;
    }

    public final boolean eil() {
        assert (this.qgL != null);
        int n = this.qgL.length;
        for (int i = 0; i < n; ++i) {
            if (!(this.qgL[i] instanceof kxu)) continue;
            return true;
        }
        return false;
    }

    public final String fQ(int n) {
        return lea.enW().getName(n);
    }

    public final int eim() {
        assert (this.qgL != null);
        int n = 0;
        int n2 = this.qgL.length;
        for (int i = 0; i < n2; ++i) {
            if (!(this.qgL[i] instanceof kxr)) continue;
            ++n;
        }
        return n;
    }

    public String toString() {
        int n;
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ExceptionResources=[");
        if (this.qgJ != null) {
            n2 = this.qgJ.length;
            for (n = 0; n < n2; ++n) {
                if (n > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append("'");
                stringBuilder.append(lea.enW().getName(this.qgJ[n]));
                stringBuilder.append("'");
            }
        }
        stringBuilder.append("] Properties=[");
        if (this.qgL != null) {
            n2 = this.qgL.length;
            for (n = 0; n < n2; ++n) {
                if (n > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append("'");
                stringBuilder.append(this.qgL[n].getPropertyName());
                stringBuilder.append("'");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

