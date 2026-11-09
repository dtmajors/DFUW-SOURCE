/*
 * Decompiled with CFR.
 */
public class iap {
    public final int lBT;
    public final int index;

    public iap() {
        this.lBT = -1;
        this.index = -1;
    }

    public iap(int n, int n2) {
        this.lBT = n;
        this.index = n2;
    }

    public boolean isValid() {
        return ial.dq(this.lBT, this.index);
    }

    public String toString() {
        return ial.dr(this.lBT, this.index);
    }
}

