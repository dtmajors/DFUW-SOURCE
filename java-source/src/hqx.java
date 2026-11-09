/*
 * Decompiled with CFR.
 */
public class hqx
extends hqy {
    public final hmi kZG;
    public final a kZH;
    public final boolean kZI;
    public final boolean kZJ;
    private final lbn kgk = new lbn(this){
        final /* synthetic */ hqx kZL;
        {
            this.kZL = hqx2;
        }

        public final void W() {
            this.kZL.cbT();
        }
    };
    private final lbn kZK = new lbn(this){
        final /* synthetic */ hqx kZL;
        {
            this.kZL = hqx2;
        }

        public final void W() {
            this.kZL.cbU();
        }
    };
    private boolean Initialized;
    private boolean kjV;
    private hpx jGG;
    private hpx keu;

    public hqx(hnc hnc2, String string, hmi hmi2, a a2, boolean bl, boolean bl2) {
        super(hnc2, string, lgg.rlI, lhf.rnv, hpx.a.kXo, a2.jHz, hmi2.cgO());
        this.kZG = hmi2;
        this.kZH = a2;
        this.kZI = bl;
        this.kZJ = bl2;
    }

    public void mZ(boolean bl) {
        if (bl == this.kjV) {
            return;
        }
        this.kjV = bl;
        if (this.Initialized) {
            this.cwy();
        }
    }

    public boolean cwx() {
        return this.kjV;
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        assert (this.cqt() instanceof hpd);
        super.FF();
        this.Initialized = true;
        this.mU(true);
        this.ccm();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        this.Initialized = false;
        super.FG();
    }

    @Override
    protected void cbN() {
        hmt hmt2 = this.cqt();
        if (hmt2 instanceof hpd) {
            hpd hpd2 = (hpd)hmt2;
            hpd2.a(this.kZG, true);
        }
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        this.ccm();
    }

    @Override
    protected void cbM() {
        hpx hpx2 = this.cwz();
        if (hpx2 != null) {
            hpx2.cqK();
            return;
        }
        super.cbM();
    }

    @Override
    protected void cbv() {
        hpx hpx2 = this.cwz();
        if (hpx2 != null) {
            hpx2.cqL();
            return;
        }
        super.cbv();
    }

    protected void cwy() {
        assert (this.Initialized);
        if (this.cwx()) {
            if (this.kZI) {
                this.jGG = new hqz(this.kLu, null, lgg.rlI, null, hpx.a.kXm, this.kZH.kYw, this.kZH.kZM);
                this.jGG.cvC().a(true, this.kgk);
                this.j(this.jGG);
            }
            if (this.kZJ) {
                this.keu = new hqz(this.kLu, null, lgg.rlI, null, hpx.a.kXm, this.kZH.kYw, this.kZH.kZN);
                this.keu.cvC().a(true, this.kZK);
                this.j(this.keu);
            }
        } else {
            if (this.jGG != null) {
                this.jGG.remove();
                this.jGG = null;
            }
            if (this.keu != null) {
                this.keu.remove();
                this.keu = null;
            }
        }
        this.ccm();
    }

    protected void cbT() {
    }

    protected void cbU() {
    }

    private void ccm() {
        int n = this.getWidth() - this.kZH.kZO.cf;
        int n2 = this.kZH.kZO.cg;
        if (this.jGG != null) {
            this.jGG.cB(n -= this.jGG.getWidth(), n2);
            n -= this.kZH.kZP;
        }
        if (this.keu != null) {
            this.keu.cB(n -= this.keu.getWidth(), n2);
            n -= this.kZH.kZP;
        }
    }

    protected final hpx cwz() {
        if (this.jGG != null && this.jGG.cqQ()) {
            return this.jGG;
        }
        if (this.keu != null && this.keu.cqQ()) {
            return this.keu;
        }
        return null;
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

