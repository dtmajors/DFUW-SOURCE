/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqw
 *  bvf
 *  car
 *  cew
 *  lcr
 *  lcw
 */
public class cdu
extends cdt {
    private final cdo enM;
    private bqw enh = null;
    private car eed = null;
    private bzd enN = null;
    private boolean eni = false;
    final float enj = lcw.qGl * lcw.qGl;
    private int dj = 0;

    public cdu() {
        super(false);
        this.enM = new cdo(this);
        this.enN = new bzd(this.enL);
    }

    public final ccx aJM() {
        return this.enM;
    }

    public final bqv aJC() {
        return this.enh;
    }

    public final void b(bqv bqv2) {
        this.enh = (bqw)bqv2;
    }

    @Override
    public final caq aKu() {
        return this.eed;
    }

    @Override
    public final void a(caq caq2) {
        this.eed = (car)caq2;
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
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.enN.P(ldz2);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.enM.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.enM);
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
            case 16384: {
                if (this.eed == null) {
                    lfn.b(5, "SFGroundedMonsterClient", "receiveMessage() PaperdollManager is null.");
                    return;
                }
                this.eed.receiveMessage(dxq2);
                return;
            }
        }
        switch (dxq2.bEz()) {
            case 5123: {
                this.enM.receiveMessage(dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        if (this.enM != null) {
            this.MessageDelegator.hd(this.enM.getGUID());
        }
    }

    private void a(dya dya2) {
        assert (this.eni);
        if (!this.enL.aEP().isAlive()) {
            return;
        }
        if (dya2.iiz) {
            this.enL.aDc().nG(dya2.aWe);
        } else {
            this.enL.aDc().aDk();
        }
        dya2.f(this.GUID);
        dya2.on(this.getServerGUID());
        this.MessageDelegator.F(dya2);
    }

    private void b(dyk dyk2) {
        if (this.eni && dyk2.bEz() != 13334) {
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
            this.enM.aGx();
        }
        if (this.eed != null) {
            this.eed.aGx();
        }
    }

    @Override
    protected final void aIx() {
        super.aIx();
        if (this.eni && !this.isScheduledForRemoval()) {
            this.enM.aFm();
        }
        if (this.eed != null) {
            this.eed.aGy();
        }
    }

    @Override
    protected final void a(uk uk2) {
        switch (uk2.Uo) {
            case 8: {
                if (this.eni) {
                    return;
                }
                int n = ((uh)uk2).PC;
                if (this.enM.aKp() == null || n <= 0) break;
                this.enM.aKp().ph(n);
                break;
            }
            default: {
                super.a(uk2);
            }
        }
    }

    @Override
    public final void aKl() {
        super.aKl();
    }

    @Override
    public final void fH(boolean bl) {
        bvf bvf2;
        super.fH(bl);
        if (!this.enL.aEa() && (bvf2 = (bvf)this.aAG()) != null && bvf2.azx() != null) {
            ((bvf)this.aAG()).azx().aAW();
        }
    }

    public void aZ(ljq ljq2) {
        this.enM.aM(ljq2);
        ej ej2 = this.fi().ae(1488);
        if (ej2 != null) {
            fe fe2 = (fe)ej2;
            fe2.gw().Qe = new ljq(ljq2);
        }
    }

    public final void a(bzc bzc2) {
        this.enN.a(bzc2);
    }

    public void f(lgj lgj2) {
        if (!this.eni) {
            lfn.b(5, "SFGroundedMonsterClient", "notifyPositionalDataUpdated() Object is not locally controlled.");
            return;
        }
        this.enM.h(lgj2);
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

