/*
 * Decompiled with CFR.
 */
public class ioj
implements hvr {
    private isw moJ;
    private int moK;
    private int moL;
    private double lfU;
    private double lfT;
    private double moM;
    private double moN;
    private double moO;

    public ioj(isw isw2, int n, int n2, double d2) {
        this.moJ = isw2;
        this.moK = n;
        this.moL = n2;
        int n3 = n >> 16 & 0xFF;
        int n4 = n >> 8 & 0xFF;
        int n5 = n & 0xFF;
        int n6 = n2 >> 16 & 0xFF;
        int n7 = n2 >> 8 & 0xFF;
        int n8 = n2 & 0xFF;
        this.moM = n6 - n3;
        this.moN = n7 - n4;
        this.moO = n8 - n5;
    }

    @Override
    public void az(ldz ldz2) {
        this.lfT = ldz2.rgz;
        this.moJ.Rk(this.moK);
    }

    @Override
    public void aA(ldz ldz2) {
    }

    @Override
    public void doTick(ldz ldz2) {
        double d2 = ldz2.rgz - this.lfT;
        double d3 = d2 / this.lfU;
        if (d3 < 1.0) {
            int n = this.moK >> 16 & 0xFF;
            int n2 = this.moK >> 8 & 0xFF;
            int n3 = this.moK & 0xFF;
            int n4 = this.moL >> 16 & 0xFF;
            int n5 = this.moL >> 8 & 0xFF;
            int n6 = this.moL & 0xFF;
            int n7 = (int)((double)n + d3 * this.moM);
            int n8 = (int)((double)n2 + d3 * this.moN);
            int n9 = (int)((double)n3 + d3 * this.moO);
            n7 = n < n4 ? Math.max(n, Math.min(n7, n4)) : Math.max(n4, Math.min(n7, n));
            n8 = n2 < n5 ? Math.max(n2, Math.min(n7, n5)) : Math.max(n5, Math.min(n7, n2));
            n9 = n3 < n6 ? Math.max(n3, Math.min(n7, n6)) : Math.max(n6, Math.min(n7, n3));
            int n10 = n7 << 16 | n8 << 8 | n9;
            this.moJ.Rk(n10);
        } else {
            this.moJ.Rk(this.moL);
        }
    }
}

