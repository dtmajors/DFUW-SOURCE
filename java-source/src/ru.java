/*
 * Decompiled with CFR.
 */
import java.util.List;

public class ru
extends qd {
    private long aQe;
    private static px[] aQf = new px[]{px.aKn, px.aKp, px.aKr, px.aJP, px.aJW, px.aKc, px.aKh, px.aKj, px.aKl, px.aKC, px.aKx, px.aKt, px.aKA, px.aKF};
    private td aQg;
    private rw aQh;
    private rx aQi;
    private rz aQj;
    private ry aQk;
    private sd aQl;
    private sd aQm;
    private sd aQn;
    private rv aQo;
    private mw aQp;
    private int aQq;
    private List<String> aQr;

    public ru(mw mw2) {
        super(mw2, me.axw);
        this.aQp = mw2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aQg = this.f(new td(this));
        this.aQh = this.f(new rw(this));
        if (ls.isEnabled()) {
            this.aQi = this.f(new rx(this));
        }
        if (aev.isEnabled()) {
            this.aQj = this.f(new rz(this));
        }
        this.aQo = this.f(new rv(this));
        this.aQk = this.f(new ry(this));
        this.aQl = this.f(new sd((md)this, "ProcDeleteSpawnables"));
        this.aQm = this.f(new sd((md)this, "ProcDeleteProwessMonoliths"));
        this.aQn = this.f(new sd((md)this, "updateLastSaveTime"));
        this.aQn.a(pw.aJE);
    }

    @Override
    public void cleanUp() {
        this.e(this.aQg);
        this.e(this.aQh);
        if (ls.isEnabled()) {
            this.e(this.aQi);
        }
        if (aev.isEnabled()) {
            this.e(this.aQj);
        }
        this.e(this.aQo);
        this.e(this.aQk);
        this.e(this.aQl);
        this.e(this.aQm);
        this.e(this.aQn);
        super.cleanUp();
    }

    @Override
    protected void sO() {
        lfn.b(2, "SFPersistenceWorkerSaveAll", "startWork: Starting Save All");
        this.aQq = 0;
        this.aQg.a(this.aQp.sh());
        this.b(aQf[this.aQq]);
    }

    private void b(px px2) {
        this.aQe = System.currentTimeMillis();
        switch (px2) {
            case aKE: {
                this.aQn.g(1);
                this.aQn.start();
                break;
            }
            case aKn: {
                this.aQh.start();
                break;
            }
            case aKp: {
                if (ls.isEnabled()) {
                    this.aQi.start();
                    break;
                }
                this.tL();
                break;
            }
            case aKr: {
                if (aev.isEnabled()) {
                    this.aQj.start();
                    break;
                }
                this.tL();
                break;
            }
            case aKA: {
                this.aQo.start();
                break;
            }
            case aKt: {
                this.aQk.start();
                break;
            }
            case aKj: {
                this.aQl.start();
                break;
            }
            case aKD: {
                this.aQm.start();
                break;
            }
            case aKF: {
                this.aQn.g(0);
                this.aQn.start();
                break;
            }
            default: {
                this.aQg.a(px2, null);
                this.aQg.start();
            }
        }
    }

    @Override
    protected void sP() {
        this.aQq = 0;
        this.aQr = null;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2.sS()) {
            if (this.aQr == null) {
                this.aQr = lcn.emA();
            }
            this.aQr.add((Object)((Object)aQf[this.aQq]) + ": " + qe2.getErrorMessage());
        }
        if (this.su() == 0) {
            this.tL();
        }
    }

    private void tL() {
        long l = System.currentTimeMillis();
        String string = ru.q(l - this.aQe);
        lfn.b(2, "SFPersistenceWorkerSaveAll", "endCurrentOperation: Operation " + (Object)((Object)aQf[this.aQq]) + " completed in " + string + "s");
        ++this.aQq;
        if (this.aQq < aQf.length) {
            this.b(aQf[this.aQq]);
            return;
        }
        if (this.aQr == null) {
            lfn.b(2, "SFPersistenceWorkerSaveAll", "endCurrentOperation: Save All completed in " + this.sN() + "s");
            this.ca(null);
        } else {
            for (String string2 : this.aQr) {
                lfn.b(5, "SFPersistenceWorkerSaveAll", "notifyChildCompleted: " + string2);
            }
            lfn.b(2, "SFPersistenceWorkerSaveAll", "endCurrentOperation: Save All failed after " + this.sN() + "s");
            this.ca("One or more operations failed");
        }
    }

    public void tM() {
        assert (false) : "Not Implemented";
    }
}

