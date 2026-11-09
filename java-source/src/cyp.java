/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cwx
 *  cyt
 */
public class cyp {
    private final cyt emI;
    private ldz nx = new ldz();
    private final boolean fYj;
    private cwx fYk = null;
    private double fYl = 0.0;
    private double fYm = 0.0;
    private boolean fYn = false;
    private boolean fYo = false;

    public cwx bgL() {
        return this.fYk;
    }

    public cyp(cyt cyt2, ldz ldz2) {
        this.emI = cyt2;
        this.nx = ldz2;
        this.fYj = this.emI.bgQ() instanceof cew ? ((cew)this.emI.bgQ()).aJI() : false;
    }

    public double bgM() {
        return this.fYl;
    }

    public void doTick(ldz ldz2) {
        this.nx = ldz2;
        if (this.fYk == null || !this.fYo) {
            return;
        }
        if (this.nx.rgz >= this.fYm) {
            this.fYk.bfe();
            this.fYo = false;
        } else if (this.fYn && this.emI.bgQ().aJD().aEP().Ow()) {
            this.fYk.fe(this.bgP());
        }
    }

    public float bgN() {
        assert (this.fYk != null);
        return this.bgP();
    }

    public void bgO() {
        if (this.fYk == null) {
            lfn.b(5, "SFSkillChargingManager", "removeChargingTimer() ChargingSkill is null.");
            return;
        }
        if (this.fYj) {
            this.mc(this.fYk.getGUID());
        }
        this.reset();
    }

    public void a(cwx cwx2, double d2, float f2, boolean bl) {
        assert (cwx2 != null);
        assert (d2 > 0.0);
        assert (f2 >= 0.0f);
        if (this.fYk != null) {
            lfn.b(5, "SFSkillChargingManager", "startChargingTimer() Starting chargingtimer for skill '" + cwx2.getName() + "' while chargingtimer for skill '" + this.fYk.getName() + "' is running.");
            assert (false);
            return;
        }
        this.fYo = true;
        this.fYk = cwx2;
        this.fYl = d2;
        this.fYm = this.nx.rgz + this.fYl;
        this.fYn = bl;
        double d3 = d2 * (double)f2;
        if (this.fYj && d3 > 0.0) {
            this.a(this.fYk.getGUID(), this.nx.rgz, this.nx.rgz + d3, this.fYm);
        }
    }

    private float bgP() {
        float f2 = 1.0f;
        if (this.nx.rgz < this.fYm) {
            f2 = 1.0f - (float)((this.fYm - this.nx.rgz) / this.fYl);
        }
        return f2;
    }

    private void reset() {
        this.fYk = null;
        this.fYl = 0.0;
        this.fYm = 0.0;
        this.fYo = false;
    }

    private void a(ldv ldv2, double d2, double d3, double d4) {
        this.emI.bgQ().aJO().a(cxd.k.fRI, ldv2, d2, d3, d4, false);
    }

    private void mc(ldv ldv2) {
        this.emI.bgQ().aJO().c(cxd.k.fRI, ldv2);
    }
}

