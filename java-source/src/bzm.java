/*
 * Decompiled with CFR.
 */
public class bzm {
    private int bpX = 0;
    private int eda = 0;

    public int CS() {
        return this.bpX;
    }

    public void fK(int n) {
        this.bpX = n;
    }

    public int aEV() {
        return this.eda;
    }

    public void og(int n) {
        this.eda = n;
    }

    public bzm aFp() {
        bzm bzm2 = new bzm();
        bzm2.fK(this.bpX);
        bzm2.og(this.eda);
        return bzm2;
    }

    public boolean equals(Object object) {
        if (object instanceof bzm) {
            bzm bzm2 = (bzm)object;
            return this.bpX == bzm2.CS() && this.eda == bzm2.aEV();
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFStateChange: Mode='");
        stringBuilder.append(byw.nQ(this.bpX));
        stringBuilder.append("' NewModeValue='");
        stringBuilder.append(byw.az(this.bpX, this.eda));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

