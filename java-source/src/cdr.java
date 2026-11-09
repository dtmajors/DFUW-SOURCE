/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqw
 *  cew
 *  lcr
 *  lcw
 */
public class cdr
extends cdq {
    private final cdm enJ;
    private bqw enh = null;
    private boolean eni = false;
    final float enj = lcw.qGl * lcw.qGl;
    private int dj = 0;

    public cdr() {
        super(false);
        this.enJ = new cdm(this);
    }

    public final ccx aJM() {
        return this.enJ;
    }

    public final bqv aJC() {
        return this.enh;
    }

    public final void b(bqv bqv2) {
        this.enh = (bqw)bqv2;
    }

    public final boolean aJI() {
        return this.eni;
    }

    public final void fI(boolean bl) {
        this.eni = bl;
    }

    public final void fb(int n) {
        this.dj = n;
    }

    @Override
    public void initialize() {
        super.initialize();
        if (this.eni) {
            this.enJ.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.enJ);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bED()) {
            case 13312: {
                switch (dxq2.bEz()) {
                    case 13332: {
                        this.a((dya)dxq2);
                        break;
                    }
                    default: {
                        this.b((dyk)dxq2);
                    }
                }
                return;
            }
        }
        switch (dxq2.bEz()) {
            default: 
        }
        super.receiveMessage(dxq2);
    }

    @Override
    public void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        if (this.eni) {
            this.MessageDelegator.hd(this.enJ.getGUID());
        }
    }

    private void a(dya dya2) {
        assert (this.eni);
        if (!this.enI.aEP().isAlive()) {
            return;
        }
        if (dya2.iiz) {
            this.enI.aDc().nG(dya2.aWe);
        } else {
            this.enI.aDc().aDk();
        }
        dya2.f(this.GUID);
        dya2.on(this.getServerGUID());
        this.MessageDelegator.F(dya2);
    }

    private void b(dyk dyk2) {
        if (this.eni && dyk2.bEz() == 13335) {
            boolean bl = false;
            if (this.enJ != null) {
                dym dym2 = (dym)dyk2;
                bl = dym2.iiJ != null ? this.enJ.j(dym2.iiH, dym2.iiJ) : this.enJ.l(dym2.iiH, dym2.iiI);
            }
        } else if (this.eni && dyk2.bEz() != 13334) {
            dyk2.f(this.GUID);
            dyk2.on(this.enQ);
            this.MessageDelegator.F(dyk2);
        } else {
            dyk2.f(this.GUID);
            dyk2.on(lcr.al((ldv)this.GUID, (int)this.dj));
            this.MessageDelegator.F(dyk2);
        }
    }

    @Override
    protected final void aIw() {
        super.aIw();
        if (this.eni) {
            this.enJ.aGx();
        }
    }

    @Override
    protected final void aIx() {
        super.aIx();
        if (this.eni && !this.isScheduledForRemoval()) {
            this.enJ.aFm();
        }
    }

    @Override
    public final void aKl() {
        super.aKl();
    }

    @Override
    public final void fH(boolean bl) {
        super.fH(bl);
    }

    public void aZ(ljq ljq2) {
        this.enJ.aM(ljq2);
        ((byk)this.enI).aM(ljq2);
        ej ej2 = this.fi().ae(1488);
        if (ej2 != null) {
            fe fe2 = (fe)ej2;
            fe2.gw().Qe = new ljq(ljq2);
        }
    }

    public final void a(bzc bzc2) {
        ((byk)this.enI).b(bzc2);
    }

    public void f(lgj lgj2) {
        if (!this.eni) {
            lfn.b(5, "SFFlyingMonsterClient", "notifyPositionalDataUpdated() Object is not locally controlled.");
            return;
        }
        this.enJ.h(lgj2);
    }

    public void l(ljq ljq2, lgl lgl2) {
        ej ej2 = this.fi().ae(1488);
        if (ej2 != null) {
            this.fi().a(2, ej2);
        }
        this.m(ljq2, lgl2);
    }

    private void m(ljq ljq2, lgl lgl2) {
        cew cew2 = this.nY();
        if (cew2 == null) {
            return;
        }
        bvd bvd2 = cew2.aAG();
        if (bvd2 == null) {
            return;
        }
        if (ljq2.eA(cew2.aAG().av()) > this.enj) {
            this.ayd();
        } else {
            this.v(ljq2, lgl2.eqU());
        }
    }
}

