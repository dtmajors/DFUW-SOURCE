/*
 * Decompiled with CFR.
 */
public class ldt {
    private double lW;
    private int rfb;
    private int rfc;

    public ldt(int n) {
        assert (n > 0);
        this.rfc = n;
    }

    public final int dR(double d2) {
        ++this.rfb;
        if (d2 < this.lW + 1.0 / (double)this.rfc) {
            return 0;
        }
        int n = this.rfb * this.rfc;
        this.lW = d2;
        this.rfb = 0;
        return n;
    }
}

