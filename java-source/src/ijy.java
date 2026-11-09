/*
 * Decompiled with CFR.
 */
public class ijy
extends ijh {
    private ipb mew = null;
    private irr lBr;
    private ipg<Boolean> meV = new ipg<Boolean>(this, (ipf)this, "showPercent", hsu.ldg, true){
        final /* synthetic */ ijy meW;
        {
            this.meW = ijy2;
            super(ipf2, string, hsu2, bl);
        }

        public void dak() {
            ijy.a(this.meW).sd((Boolean)this.get());
        }

        public Boolean dQ(int n, int n2) {
            return false;
        }

        public /* synthetic */ Object dR(int n, int n2) {
            return this.dQ(n, n2);
        }
    };

    public ijy() {
        super("HealthBar");
        this.cZZ();
        this.setVisible(false);
    }

    public boolean dbV() {
        return this.meV.get();
    }

    public void qE(boolean bl) {
        this.meV.set(bl);
    }

    @Override
    public Integer dP(int n, int n2) {
        return n2 / 2 + 20;
    }

    @Override
    public ijg dS(int n, int n2) {
        return ijg.mcR;
    }

    @Override
    public void cZZ() {
        if (this.lBr != null) {
            this.lBr.removeFromParent();
        }
        irs irs2 = new irs();
        irs2.Sn(1);
        irs2.sm(true);
        irs2.Ss(11);
        if (this.mew == null) {
            this.mew = new ipb();
            this.W(ipx.d(this.mew));
        }
        switch (this.daD()) {
            case mcL: {
                this.mew.qP("ti_small_health_bg_noise");
                irs2.qu("ti_small_health_bg");
                irs2.ra("ti_small_health_bar");
                irs2.re("ti_small_health_bar_percentage");
                break;
            }
            case mcM: {
                this.mew.qP("ti_normal_health_bg_noise");
                irs2.qu("ti_normal_health_bg");
                irs2.ra("ti_normal_health_bar");
                irs2.re("ti_normal_health_bar_percentage");
                break;
            }
            case mcN: {
                this.mew.qP("ti_large_health_bg_noise");
                irs2.qu("ti_large_health_bg");
                irs2.ra("ti_large_health_bar");
                irs2.re("ti_large_health_bar_percentage");
            }
        }
        this.lBr = new irr(irs2);
        this.c(this.lBr, this.getChildren().size() - 1);
        this.lBr.sd(this.meV.get());
        this.cUp();
    }

    @Override
    public void daa() {
        if (this.mew != null) {
            this.mew.hz(this.daE());
        }
        if (this.lBr != null) {
            this.lBr.hz(this.daE());
        }
    }

    @Override
    public void c(iif iif2) {
        super.c(iif2);
        this.cUp();
    }

    @Override
    public ijc cZY() {
        return new ijz();
    }

    @Override
    public void dah() {
        super.dah();
        ijz ijz2 = (ijz)this.daw();
        ijz2.qE(this.dbV());
        ijz2.kI(this.daE());
    }

    @Override
    public void dai() {
        super.dai();
        ijz ijz2 = (ijz)this.daw();
        this.qE(ijz2.dbV());
        this.kI(ijz2.daE());
        this.cUp();
    }

    private void cUp() {
        iif iif2 = iie.cZe().cZf();
        if (iif2 != null && iif2.lYB >= 0.0f) {
            if (this.lBr != null) {
                this.lBr.setProgress(iif2.lYB);
            }
        } else {
            this.setVisible(false);
        }
    }

    static /* synthetic */ irr a(ijy ijy2) {
        return ijy2.lBr;
    }
}

