/*
 * Decompiled with CFR.
 */
public class bzb {
    private int bpX = 0;
    private int ecZ = -1;
    private int eda = -1;
    private bza[] ede = null;
    private byw.d[] edf = null;
    private byw.c[] edg = null;

    public int CS() {
        return this.bpX;
    }

    public void fK(int n) {
        this.bpX = n;
    }

    public int aEU() {
        return this.ecZ;
    }

    public void of(int n) {
        this.ecZ = n;
    }

    public int aEV() {
        return this.eda;
    }

    public void og(int n) {
        this.eda = n;
    }

    public bza[] aEW() {
        return this.ede;
    }

    public void a(bza[] bzaArray) {
        this.ede = bzaArray;
    }

    public byw.d[] aEX() {
        return this.edf;
    }

    public void a(byw.d[] dArray) {
        this.edf = dArray;
    }

    public byw.c[] aEY() {
        return this.edg;
    }

    public void a(byw.c[] cArray) {
        this.edg = cArray;
    }

    public bzb aEZ() {
        int n;
        int n2;
        bza[] bzaArray;
        bzb bzb2 = new bzb();
        bzb2.fK(this.bpX);
        bzb2.of(this.ecZ);
        bzb2.og(this.eda);
        if (this.ede != null) {
            bzaArray = new bza[this.ede.length];
            n2 = bzaArray.length;
            for (n = 0; n < n2; ++n) {
                bzaArray[n] = this.ede[n].aET();
            }
            bzb2.a(bzaArray);
        }
        bzaArray = new byw.d[this.edf.length];
        n2 = bzaArray.length;
        for (n = 0; n < n2; ++n) {
            bzaArray[n] = this.edf[n];
        }
        bzb2.a((byw.d[])bzaArray);
        if (this.edg != null) {
            byw.c[] cArray = new byw.c[this.edg.length];
            int n3 = cArray.length;
            for (n2 = 0; n2 < n3; ++n2) {
                cArray[n2] = this.edg[n2];
            }
            bzb2.a(cArray);
        }
        return bzb2;
    }

    public boolean equals(Object object) {
        if (object instanceof bzb) {
            int n;
            int n2;
            bzb bzb2 = (bzb)object;
            if (this.bpX != bzb2.CS() || this.ecZ != bzb2.aEU() || this.eda != bzb2.aEV()) {
                return false;
            }
            if (this.ede != null) {
                n2 = this.ede.length;
                for (n = 0; n < n2; ++n) {
                    if (this.ede[n].equals(bzb2.aEW()[n])) continue;
                    return false;
                }
            }
            n2 = this.edf.length;
            for (n = 0; n < n2; ++n) {
                if (this.edf[n] == bzb2.aEX()[n]) continue;
                return false;
            }
            if (this.edg != null) {
                n2 = this.edg.length;
                for (n = 0; n < n2; ++n) {
                    if (this.edg[n] == bzb2.aEY()[n]) continue;
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final int g(int n, int n2, int n3) {
        int n4 = n3;
        n4 |= n2 << 8;
        return n4 |= n << 16;
    }

    public boolean g(byz byz2) {
        if (this.ede == null) {
            return true;
        }
        int n = this.ede.length;
        for (int i2 = 0; i2 < n; ++i2) {
            if (this.ede[i2].g(byz2)) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        assert (this.edf != null);
        int n = 0;
        if (this.ede != null) {
            n = this.ede.length;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFOperationRule: Mode='");
        stringBuilder.append(byw.nQ(this.bpX));
        stringBuilder.append("' PreviousValue='");
        stringBuilder.append(this.oh(this.ecZ));
        stringBuilder.append("' NewValue='");
        stringBuilder.append(this.oh(this.eda));
        stringBuilder.append("' RequirementCount=");
        stringBuilder.append(n);
        stringBuilder.append(" OperationCount=");
        stringBuilder.append(this.edf.length);
        stringBuilder.append(" EventCount=");
        if (this.edg != null) {
            stringBuilder.append(this.edf.length);
        } else {
            stringBuilder.append("0");
        }
        return stringBuilder.toString();
    }

    private String oh(int n) {
        if (n == 0) {
            return "Any Value";
        }
        return byw.az(this.bpX, n);
    }
}

