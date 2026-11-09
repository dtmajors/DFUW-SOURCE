/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
public class hga
extends hfy {
    private final hpg klO;
    private final hhx klP;
    private final hox klQ;
    private final hhx klR;
    private final hhx klS;
    private final hhx klT;
    private final hhx klU;
    private final hhx klV;
    private final hpg klW;
    private final lbn klX = new lbn(this){
        final /* synthetic */ hga kmc;
        {
            this.kmc = hga2;
        }

        public final void W() {
            hhx hhx2;
            hcf hcf2 = this.kmc.cbP().kce.cmX();
            hga.a(this.kmc, hcf2);
            hhx hhx3 = hhx2 = hcf2.jFm ? hga.a(this.kmc) : hga.b(this.kmc);
            if (hhx2 != null) {
                hhx2.nR(!hcf2.jFl);
            }
            hga.c(this.kmc).nR(!hcf2.jFd);
            hga.d(this.kmc).nR(!hcf2.jFg);
            hga.e(this.kmc).nR(!hcf2.jFq);
            hga.f(this.kmc).nR(!hcf2.jFt);
            hga.g(this.kmc).nR(!hcf2.jFw);
            hga.h(this.kmc).nR(!hcf2.jFz);
            if (hcf2.jFg) {
                hga.d(this.kmc).M(hcf2.jFh, hcf2.jFi);
                hga.d(this.kmc).cR(hcf2.jFj);
            }
            if (hcf2.jFd) {
                hga.c(this.kmc).a(hcf2.jFe, hcf2.jFe, hcf2.jFf);
            }
            if (hcf2.jFl && hhx2 != null) {
                hhx2.a(hcf2.jFn, hcf2.jFo, hcf2.jFp);
            }
            if (hcf2.jFq) {
                hga.e(this.kmc).a(hcf2.jFr, hcf2.jFr, hcf2.jFs);
            }
            if (hcf2.jFt) {
                hga.f(this.kmc).a(hcf2.jFu, hcf2.jFu, hcf2.jFv);
            }
            if (hcf2.jFw) {
                hga.g(this.kmc).a(hcf2.jFx, hcf2.jFx, hcf2.jFy);
            }
            if (hcf2.jFz) {
                hga.h(this.kmc).a(hcf2.jFA, hcf2.jFA, hcf2.jFB);
            }
        }
    };
    private final lbn klY = new lbn(this){
        final /* synthetic */ hga kmc;
        {
            this.kmc = hga2;
        }

        public final void W() {
            String string = this.kmc.cbP().ceI();
            hga.i(this.kmc).mV(string);
        }
    };
    private final lbn klZ = new lbn(this){
        final /* synthetic */ hga kmc;
        {
            this.kmc = hga2;
        }

        public final void W() {
            if (hga.j(this.kmc) != null) {
                hga.j(this.kmc).nR(true);
            }
        }
    };
    private final lbn kma = new lbn(this){
        final /* synthetic */ hga kmc;
        {
            this.kmc = hga2;
        }

        public final void W() {
            this.kmc.cbP().kck.cno();
        }
    };
    private boolean Initialized;
    private hen kmb;

    public hga(hdm hdm2, String string) {
        super(hdm2, string);
        lgs lgs2 = this.cqE();
        this.klO = new hpg((hnc)hdm2, null, lgs2.l(hdm2.jXk.jON).k(hdm2.jXk.jOO), hdm2.jXk.jON, hdm2.kIL, "");
        this.j(this.klO);
        this.klP = new hhx(hdm2, null, lgs2.l(hdm2.jXk.jQx).k(hdm2.jXk.jQw), hdm2.jXk.jQx, hdm2.jXu, 0.0, 0.0, 0.0, ljg.roH);
        this.j(this.klP);
        this.klP.nR(true);
        this.klQ = new hhv(hdm2, null, lgs2.l(hdm2.jXk.jQF).k(hdm2.jXk.jQE), hdm2.jXk.jQF, hdm2.jXv, 0.0f, 0.0f, 0.0f, ljg.roH);
        this.j(this.klQ);
        this.klQ.nR(true);
        this.klR = new hhx(hdm2, null, lgs2.l(hdm2.jXk.jQO).k(hdm2.jXk.jQN), hdm2.jXk.jQO, hdm2.jXy, 0.0, 0.0, 0.0, ljg.roH);
        this.j(this.klR);
        this.klR.nR(true);
        this.klW = new hpg((hnc)hdm2, null, lgs2.l(hdm2.jXk.jOS).k(hdm2.jXk.jOR), hdm2.jXk.jOS, hdm2.kIE, "");
        this.j(this.klW);
        this.klS = new hhx(hdm2, null, lgs2.l(hdm2.jXk.jQO).k(hdm2.jXk.jQN), hdm2.jXk.jQO, hdm2.jXy, 0.0, 0.0, 0.0, ljg.roH);
        this.j(this.klS);
        this.klS.nR(true);
        this.klT = new hhx(hdm2, null, lgs2.l(hdm2.jXk.jQO).k(hdm2.jXk.jQN), hdm2.jXk.jQO, hdm2.jXy, 0.0, 0.0, 0.0, ljg.roH);
        this.j(this.klT);
        this.klT.nR(true);
        this.klU = new hhx(hdm2, null, lgs2.l(hdm2.jXk.jQO).k(hdm2.jXk.jQN), hdm2.jXk.jQO, hdm2.jXy, 0.0, 0.0, 0.0, ljg.roH);
        this.j(this.klU);
        this.klU.nR(true);
        this.klV = new hhx(hdm2, null, lgs2.l(hdm2.jXk.jQO).k(hdm2.jXk.jQN), hdm2.jXk.jQO, hdm2.jXy, 0.0, 0.0, 0.0, ljg.roH);
        this.j(this.klV);
        this.klV.nR(true);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.mU(true);
        this.Initialized = true;
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    private void a(hcf hcf2) {
        boolean bl = hcf2.jFl && hcf2.jFm;
        if (bl == (this.kmb != null)) {
            return;
        }
        if (bl) {
            assert (this.kmb == null);
            hen.f f2 = this.cbO().jXJ;
            hfi hfi2 = new hfi(this.cbO(), (String)null, hcf2.jFk.cdY(), this.kma);
            lhf lhf2 = hfi2.cqv();
            lhf2 = lhf2.p(f2.keL.kKX.kPT.ctr());
            this.kmb = new hen(this.cbO(), (String)null, this.kLu.kND.cqE().l(lhf2), lhf2, f2, new hen.d(hcf2.jFk.cdY()), new hnu.d(this.klZ));
            this.kmb.w(hfi2);
            this.cbO().jZH.j(this.kmb);
        } else {
            assert (this.kmb != null);
            this.kmb.remove();
            this.kmb = null;
        }
    }

    private hhx ciF() {
        if (this.kmb == null) {
            return null;
        }
        hfi hfi2 = (hfi)this.kmb.csT();
        return hfi2.khI;
    }

    private void mU(boolean bl) {
        this.cbP().kce.cmW().a(bl, this.klX);
        this.cbP().ceP().a(bl, this.klY);
    }

    static /* synthetic */ void a(hga hga2, hcf hcf2) {
        hga2.a(hcf2);
    }

    static /* synthetic */ hhx a(hga hga2) {
        return hga2.ciF();
    }

    static /* synthetic */ hhx b(hga hga2) {
        return hga2.klP;
    }

    static /* synthetic */ hhx c(hga hga2) {
        return hga2.klR;
    }

    static /* synthetic */ hox d(hga hga2) {
        return hga2.klQ;
    }

    static /* synthetic */ hhx e(hga hga2) {
        return hga2.klS;
    }

    static /* synthetic */ hhx f(hga hga2) {
        return hga2.klT;
    }

    static /* synthetic */ hhx g(hga hga2) {
        return hga2.klU;
    }

    static /* synthetic */ hhx h(hga hga2) {
        return hga2.klV;
    }

    static /* synthetic */ hpg i(hga hga2) {
        return hga2.klW;
    }

    static /* synthetic */ hen j(hga hga2) {
        return hga2.kmb;
    }
}

