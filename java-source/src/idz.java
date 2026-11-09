/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  hzo
 */
public abstract class idz {
    protected hzo lLk = null;
    protected jng leq = null;
    protected hyy lLm = null;
    protected hyy.c lLy = null;
    protected hyn lLz = null;
    protected hyy.a lLp = null;

    protected idz(hzo hzo2, jng jng2, hyy hyy2, hyy.c c2, hyn hyn2, hyy.a a2) {
        this.lLk = hzo2;
        this.leq = jng2;
        this.lLm = hyy2;
        this.lLy = c2;
        this.lLz = hyn2;
    }

    public void cON() {
        if (this.lLp != null) {
            this.lLm.a(this.lLp, false);
            this.lLm.b(this.lLp);
            this.lLp = null;
        }
        if (this.lLz.isVisible()) {
            hyy.a a2 = this.lLp = this.leq.dNh() ? hyy.a.lrA : hyy.a.lrz;
            if (this.lLp == null) {
                return;
            }
            this.lLm.a(this.lLp, true);
            this.lLm.a(this.lLp, this.lLy);
            this.d(this.lLp);
        }
    }

    public final void b(hyy.b b2, int n) {
        lfn.b(0, this.getClass().getSimpleName(), "notifyButtonStateChanged() : Button = " + (Object)((Object)b2) + ", State = " + n);
        switch (b2) {
            case ltp: 
            case ltl: {
                this.lLk.pq(false);
                return;
            }
            case ltn: {
                this.lLk.a(iee.lMu, false);
                return;
            }
            case ltz: 
            case lto: {
                this.lLk.a(iee.lMv, false);
                return;
            }
            case ltA: {
                this.lLk.ps(n > 0);
                return;
            }
            case ltB: {
                this.lLk.pt(n > 0);
                return;
            }
            case ltr: {
                idr idr2 = (idr)idx.a(iee.lMw);
                idr2.t(this.leq.dNi());
                this.lLk.a(iee.lMw, false);
                return;
            }
            case lts: {
                ido ido2 = (ido)idx.a(iee.lMB);
                ido2.e(this.leq.dNu());
                this.lLk.a(iee.lMB, false);
                return;
            }
            case ltu: {
                this.lLk.a(iee.lMz, false);
                return;
            }
            case ltv: {
                this.lLk.a(iee.lMA, false);
                return;
            }
            case ltw: {
                this.lLk.a(iee.lMC, false);
                return;
            }
            case ltx: {
                this.lLk.a(iee.lMD, false);
                return;
            }
            case lty: {
                this.lLk.a(iee.lMF, false);
                return;
            }
        }
        this.c(b2, n);
    }

    protected abstract void c(hyy.b var1, int var2);

    protected abstract void d(hyy.a var1);
}

