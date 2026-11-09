/*
 * Decompiled with CFR.
 */
public class sa
extends qd {
    private long aQe;
    public final mw aQp;
    private static px[] aQf = new px[]{px.aJK, px.aJM, px.aKG, px.aJN, px.aJS, px.aJZ, px.aKk, px.aJT, px.aJU, px.aJV, px.aKe, px.aKu, px.aKB, px.aKm, px.aKo, px.aKq, px.aKz, px.aKs, px.aJL};
    private int aQx;
    private td aQy;
    private rn aQz;
    private rl aQA;
    private ro aQB;
    private rm aQC;
    private tg aQD;
    private rq aQE;
    private rr aQF;
    private rt aQG;
    private rp aQH;
    private rs aQI;
    private sf aQJ;
    private sd aQK;
    private int aBH;

    public sa(mw mw2) {
        super(mw2, me.axj);
        this.aQp = mw2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aQz = this.f(new rn(this));
        this.aQA = this.f(new rl(this));
        this.aQB = this.f(new ro(this));
        this.aQC = this.f(new rm(this));
        this.aQy = this.f(new td(this));
        this.aQD = this.f(new tg(this));
        this.aQE = this.f(new rq(this));
        if (ls.isEnabled()) {
            this.aQF = this.f(new rr(this));
        }
        if (aev.isEnabled()) {
            this.aQG = this.f(new rt(this));
        }
        this.aQH = this.f(new rp(this));
        this.aQI = this.f(new rs(this));
        this.aQJ = this.f(new sf(this));
        this.aQK = this.f(new sd((md)this, "synchronizeMarketDatabase"));
        this.aQK.a(pw.aJE);
    }

    @Override
    public void cleanUp() {
        this.e(this.aQz);
        this.aQz = null;
        this.e(this.aQA);
        this.aQA = null;
        this.e(this.aQB);
        this.aQB = null;
        this.e(this.aQC);
        this.aQC = null;
        this.e(this.aQy);
        this.aQy = null;
        this.e(this.aQD);
        this.aQD = null;
        this.e(this.aQE);
        this.aQE = null;
        if (ls.isEnabled()) {
            this.e(this.aQF);
            this.aQF = null;
        }
        if (aev.isEnabled()) {
            this.e(this.aQG);
            this.aQG = null;
        }
        this.e(this.aQH);
        this.aQH = null;
        this.e(this.aQI);
        this.aQI = null;
        this.e(this.aQJ);
        this.aQJ = null;
        this.e(this.aQK);
        this.aQK = null;
        super.cleanUp();
    }

    @Override
    protected void sO() {
        this.aQy.a(this.aQp.sh());
        this.aQz.a(this.aQp.sh());
        this.aQA.a(this.aQp.sh());
        this.aQB.a(this.aQp.sh());
        this.aQC.a(this.aQp.sh());
        this.aQD.a(this.aQp.sh());
        this.aQx = 0;
        this.b(aQf[this.aQx]);
    }

    @Override
    protected void sP() {
        this.aQx = -1;
        this.aBH = -1;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            lfn.b(2, "SFPersistenceWorkerStartupDistributor", "endCurrentOperation: Startup failed after " + this.sN() + "s");
            this.ca("Child worker failed: " + qe2.getErrorMessage());
            return;
        }
        if (qe2 == this.aQz) {
            ps[] psArray = this.aQp.sh();
            for (int i = 0; i < psArray.length; ++i) {
                psArray[i].aHP = this.aQz.cT(i);
                psArray[i].aHQ = this.aQz.cU(i);
            }
        } else if (qe2 == this.aQJ) {
            this.aBH = this.aQJ.tN();
        }
        if (this.su() == 0) {
            this.tL();
        }
    }

    private void tL() {
        long l = System.currentTimeMillis();
        String string = sa.q(l - this.aQe);
        lfn.b(2, "SFPersistenceWorkerStartupDistributor", "endCurrentOperation: Operation " + (Object)((Object)aQf[this.aQx]) + " completed in " + string + "s");
        ++this.aQx;
        if (this.aQx >= aQf.length) {
            lfn.b(2, "SFPersistenceWorkerStartupDistributor", "endCurrentOperation: Startup completed in " + this.sN() + "s");
            this.ca(null);
        } else {
            if (aQf[this.aQx] == px.aKo && !ls.isEnabled()) {
                ++this.aQx;
            }
            if (aQf[this.aQx] == px.aKq && !aev.isEnabled()) {
                ++this.aQx;
            }
            this.b(aQf[this.aQx]);
        }
    }

    private void b(px px2) {
        this.aQe = System.currentTimeMillis();
        switch (px2) {
            case aJK: {
                this.aQy.a(px.aJK, null);
                this.aQy.start();
                break;
            }
            case aJM: {
                this.aQJ.start();
                break;
            }
            case aKG: {
                this.aQK.start();
                break;
            }
            case aJN: {
                this.aQz.start();
                break;
            }
            case aJS: {
                this.aQy.a(px.aJS, null);
                this.aQy.start();
                break;
            }
            case aJZ: {
                this.aQA.start();
                break;
            }
            case aKk: {
                this.aQy.a(px.aKk, null);
                this.aQy.start();
                break;
            }
            case aJT: {
                this.aQy.a(px.aJT, null);
                this.aQy.start();
                break;
            }
            case aJU: {
                this.aQy.a(px.aJU, null);
                this.aQy.start();
                break;
            }
            case aJV: {
                this.aQy.a(px.aJV, null);
                this.aQy.start();
                break;
            }
            case aKe: {
                this.aQB.start();
                break;
            }
            case aKu: {
                this.aQC.start();
                break;
            }
            case aKB: {
                this.aQy.a(px.aKB, null);
                this.aQy.start();
                break;
            }
            case aKm: {
                this.aQE.start();
                break;
            }
            case aKo: {
                if (!ls.isEnabled()) break;
                this.aQF.start();
                break;
            }
            case aKq: {
                if (!aev.isEnabled()) break;
                this.aQG.start();
                break;
            }
            case aKz: {
                this.aQH.start();
                break;
            }
            case aKs: {
                this.aQI.start();
                break;
            }
            case aJL: {
                this.aQD.start();
                break;
            }
            default: {
                lfn.b(5, "SFPersistenceWorkerStartupDistributor", "startOperation: Unhandled operation " + (Object)((Object)px2));
                assert (false);
                break;
            }
        }
    }

    public final int tN() {
        return this.aBH;
    }
}

