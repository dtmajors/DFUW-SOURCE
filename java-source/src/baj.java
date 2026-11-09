/*
 * Decompiled with CFR.
 */
public class baj {
    private ldv aEF = null;
    private azh cMz = azh.cEi;
    private double cMA = 0.0;
    private double cMB = 0.0;
    private boolean cMC = false;
    private boolean aGk = false;
    private double cMD = 0.0;

    public ldv afl() {
        return this.aEF;
    }

    public azh abr() {
        return this.cMz;
    }

    public double ain() {
        return this.cMA;
    }

    public double aio() {
        return this.cMB;
    }

    public boolean aip() {
        return this.cMC;
    }

    public void cI(boolean bl) {
        this.cMC = bl;
        if (this.cMA == 0.0 && !this.cMC) {
            this.cMz = azh.cEi;
        }
    }

    public boolean aiq() {
        return this.aGk;
    }

    public double air() {
        return this.cMD;
    }

    public baj(ldv ldv2, azh azh2, boolean bl, boolean bl2, ldz ldz2) {
        this.aEF = ldv2;
        this.cMz = azh2;
        this.cMC = bl;
        this.aGk = bl2;
        this.cMA = azh2.getLength();
        this.cMB = ldz2.rgz;
    }

    public baj(ldv ldv2, azh azh2, double d2, boolean bl, boolean bl2, ldz ldz2) {
        this.aEF = ldv2;
        this.cMz = azh2;
        this.cMB = d2;
        this.cMA = (double)this.cMz.getLength() - (ldz2.rgz - this.cMB);
        this.cMC = bl;
        this.aGk = bl2;
        this.cMD = ldz2.rgz;
    }

    public boolean E(ldz ldz2) {
        if (this.cMA <= 0.0) {
            return false;
        }
        this.cMA -= ldz2.qwh;
        if (this.cMA < 0.0) {
            this.cMA = 0.0;
        }
        if (this.cMA == 0.0 && !this.cMC) {
            this.cMz = azh.cEi;
            this.aGk = false;
        }
        return this.cMA <= 0.0;
    }

    public double F(ldz ldz2) {
        return this.cMB + bad.agq() <= ldz2.rgz ? 0.0 : this.cMB + bad.agq();
    }

    public double G(ldz ldz2) {
        return this.cMA > 0.0 ? ldz2.rgz + this.cMA : 0.0;
    }

    public void a(azh azh2, boolean bl, boolean bl2, ldz ldz2) {
        this.cMz = azh2;
        this.cMC = bl;
        this.aGk = bl2;
        this.cMA = azh2.getLength();
        this.cMB = ldz2.rgz;
    }

    public void a(azh azh2, boolean bl, boolean bl2, ldz ldz2, double d2) {
        this.cMz = azh2;
        this.cMC = bl;
        this.aGk = bl2;
        this.cMA = (double)azh2.getLength() - d2;
        this.cMB = ldz2.rgz - d2;
    }

    public void ais() {
        this.cMC = false;
        this.aGk = false;
        this.cMA = 0.0;
    }
}

