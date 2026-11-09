/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
public abstract class ans {
    protected aqu bHp;
    protected anf bFP;
    protected double bHq = 0.0;
    protected boolean bHr;
    protected boolean bHs;

    protected abstract aqu.b Mf();

    public ans(anf anf2) {
        this.bFP = anf2;
        this.bHp = null;
    }

    public void Mg() {
    }

    public void Mh() {
    }

    public void Mi() {
    }

    public void hv(int n) {
    }

    public void Mj() {
        if (this.bHp != null) {
            this.bHp.PA();
        }
    }

    public void t(asv asv2) {
        if (this.bHp == null) {
            return;
        }
        if (asv2.equals(this.bFP.IZ().Ly())) {
            this.bHp.PB();
        }
    }

    public void terminate() {
        this.bFP = null;
        if (this.bHp != null) {
            this.bHp.terminate();
        }
        this.bHp = null;
    }

    public void z(ldz ldz2) {
        if (this.bHp != null && !this.bHp.execute()) {
            this.end();
        }
    }

    public void b(ldz ldz2, boolean bl) {
        this.bHs = bl;
        if (ldz2.rgz < this.bHq) {
            return;
        }
        if (this.bHp != null) {
            this.bHp.end();
        }
        if (!this.bFP.IZ().HT()) {
            return;
        }
        this.bFP.IZ().x(this.bFP.Jp());
        this.bFP.IZ().Lv();
        aqu.b b2 = this.Mf();
        if (this.bHp == null || this.bHp.PI() != b2) {
            this.bHp = aqv.a(b2, this.bFP, this.bHp == null);
        }
        this.bHp.initialize();
        this.bHp.Qq();
        this.bHp.PP();
        double d2 = this.bHp.Pz() ? 0.0 : arw.Sw();
        this.bHq = ldz2.rgz + (d2 + 1.0) * this.bHp.PH();
        if (this.bHp.Pq()) {
            this.bFP.b(this.bHp.Pp(), false);
        } else if (this.bHp.Ps()) {
            this.bFP.b(this.bHp.Pp(), true);
        } else if (this.bHp.Py()) {
            this.bFP.bl(false);
        } else if (this.bHp.Pu()) {
            this.bFP.bl(true);
        }
    }

    public boolean c(ljq ljq2, boolean bl) {
        if (this.bHp == null) {
            return false;
        }
        return this.bHp.c(ljq2, bl);
    }

    public boolean Mk() {
        return this.bHr;
    }

    protected void end() {
        this.bHq = 0.0;
    }
}

