/*
 * Decompiled with CFR.
 */
public class cry
extends crj {
    public int eZl = Integer.MIN_VALUE;
    public int eZm = Integer.MIN_VALUE;
    public int eZn = Integer.MIN_VALUE;

    @Override
    public Object clone() {
        return super.clone();
    }

    public void tK(int n) {
        if (this.eZl < n) {
            this.eZl = n;
        }
    }

    public void tL(int n) {
        if (this.eZm < n) {
            this.eZm = n;
        }
    }

    public void tM(int n) {
        if (this.eZn < n) {
            this.eZn = n;
        }
    }
}

