/*
 * Decompiled with CFR.
 */
public class hvq
implements hvr {
    private double oV = 0.0;
    private double eNV = 0.0;

    public hvq(double d2) {
        this.eNV = d2;
    }

    @Override
    public void az(ldz ldz2) {
        this.oV = ldz2.rgz;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (ldz2.rgz >= this.oV + this.eNV) {
            this.czS();
        }
    }

    @Override
    public void aA(ldz ldz2) {
    }

    public void czS() {
    }
}

