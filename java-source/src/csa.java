/*
 * Decompiled with CFR.
 */
public class csa
extends crj {
    public int eZt = Integer.MAX_VALUE;
    public int eZu = Integer.MAX_VALUE;
    public int eZv = Integer.MAX_VALUE;
    public int eZw = Integer.MAX_VALUE;

    @Override
    public Object clone() {
        return super.clone();
    }

    public void tR(int n) {
        if (this.eZt < n) {
            this.eZt = n;
        }
    }

    public void tS(int n) {
        if (this.eZu < n) {
            this.eZu = n;
        }
    }

    public void tT(int n) {
        if (this.eZv < n) {
            this.eZv = n;
        }
    }

    public void tU(int n) {
        if (this.eZw < n) {
            this.eZw = n;
        }
    }
}

