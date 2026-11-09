/*
 * Decompiled with CFR.
 */
public class hvo
implements hvr {
    private hvr lgb;
    private double lgc;
    private boolean lgd;
    private double lfT;

    public hvo(hvr hvr2, double d2) {
        this.lgb = hvr2;
        this.lgc = d2;
    }

    @Override
    public void az(ldz ldz2) {
        this.lfT = ldz2.rgz;
    }

    @Override
    public void aA(ldz ldz2) {
        this.lgb.aA(ldz2);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (ldz2.rgz - this.lfT >= this.lgc) {
            if (!this.lgd) {
                this.lgd = true;
                this.lgb.az(ldz2);
            }
            this.lgb.doTick(ldz2);
        }
    }
}

