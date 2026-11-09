/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hkb
extends hdj {
    private final a kBE;
    private final hcb kBF;
    private final hdj.a kBG = new hdj.a(this);
    private final lbn kBH = new lbn(this){
        final /* synthetic */ hkb kBJ;
        {
            this.kBJ = hkb2;
        }

        public final void W() {
            hkb.a(this.kBJ);
        }
    };
    private final lbn kBI = new lbn(this){
        final /* synthetic */ hkb kBJ;
        {
            this.kBJ = hkb2;
        }

        public final void W() {
            if (this.kBJ.cdi()) {
                return;
            }
            hkb.b(this.kBJ);
        }
    };

    private void coV() {
        this.nO(this.jLM.cbP().kcc.ccI().getValue());
    }

    private void nO(boolean bl) {
        if (this.kBF.isOpen() == bl) {
            return;
        }
        this.kBF.setOpen(bl);
        assert (this.kBF.isOpen() == bl);
        if (bl) {
            this.kBF.md(this.kBE.jHm);
        }
    }

    public hkb(hdm hdm2, a a2) {
        super(hdm2, a2.jLK, a2.jLL, 284, a2.jLO);
        this.kBE = a2;
        this.kBF = new hcb(hdm2);
        this.coV();
        this.cc(true);
    }

    @Override
    protected hen cdl() {
        this.nO(true);
        hen.f f2 = this.jLM.jXO;
        lhf lhf2 = this.kBE.kBL;
        lgg lgg2 = this.jLM.e(this.kBE.kBK, lhf2);
        hen hen2 = new hen(this.jLM, (String)null, lgg2, lhf2, f2, new hnu.e(this.jLM.jXk.jNS, this.jLM.jXk.jNR), new hen.d(this.kBE.kBM), new hnu.d(this.kBG), new hen.e(true), new hen.c(this.hasAttribute(256)));
        hen2.csR().a(true, this.kBH);
        hco hco2 = new hco(this.jLM, null, lgg.rlI, this.kBE.kBL.q(f2.keL.kKX.kPT.ctr()), this.jLM.jYs, this.kBF, this.kBF.cbG(), this.kBE.jHm);
        hen2.w(hco2);
        return hen2;
    }

    @Override
    protected void nf(boolean bl) {
        if (!bl) {
            this.cdh().csR().a(false, this.kBH);
        }
        super.nf(bl);
        if (!bl) {
            this.coV();
        }
    }

    @Override
    protected void cbg() {
        if (this.kBF.isOpen()) {
            this.kBF.setOpen(false);
        }
        assert (!this.kBF.isOpen());
        this.cc(false);
        super.cbg();
    }

    private final void coW() {
        hen hen2 = this.cdh();
        hco hco2 = (hco)hen2.csT();
        hfh hfh2 = hco2.jHf;
        boolean bl = hen2.csS();
        hfh2.nq(bl);
    }

    private void cc(boolean bl) {
        this.jLM.cbP().kcc.ccI().cec().a(bl, this.kBI);
    }

    static /* synthetic */ void a(hkb hkb2) {
        hkb2.coW();
    }

    static /* synthetic */ void b(hkb hkb2) {
        hkb2.coV();
    }
}

