/*
 * Decompiled with CFR.
 */
public abstract class hvp
implements hvr {
    private int lge;
    private int lgf;
    private int lgg;
    private int lgh;
    private int lgi;
    private int lgj;
    private double lfT;
    private double lfU;

    public hvp(int n, int n2, int n3, int n4, double d2) {
        this.lge = n;
        this.lgf = n2;
        this.lgi = n3;
        this.lgj = n4;
        this.lfU = d2;
    }

    @Override
    public void az(ldz ldz2) {
        this.lfT = ldz2.rgz;
        this.lgg = this.lge;
        this.lgh = this.lgf;
    }

    @Override
    public void aA(ldz ldz2) {
    }

    @Override
    public void doTick(ldz ldz2) {
        double d2 = (ldz2.rgz - this.lfT) / this.lfU;
        if (d2 <= 1.0) {
            this.lgg = (int)((double)this.lge + (double)(this.lgi - this.lge) * d2);
            this.lgh = (int)((double)this.lgf + (double)(this.lgj - this.lgf) * d2);
            this.setSize(this.lgg, this.lgh);
        } else if (this.lgg != this.lgi || this.lgh != this.lgj) {
            this.lgg = this.lgi;
            this.lgh = this.lgj;
            this.setSize(this.lgi, this.lgj);
        }
    }

    public int czT() {
        return this.lge;
    }

    public int czU() {
        return this.lgf;
    }

    public abstract void setSize(int var1, int var2);
}

