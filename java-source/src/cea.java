/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 *  lcr
 */
public abstract class cea
extends btk {
    protected bzf eot = null;
    protected dld eou = null;
    protected boolean eov = true;

    public final void a(bzf bzf2) {
        this.eot = bzf2;
    }

    public final boolean aKE() {
        return this.eov;
    }

    public final void fJ(boolean bl) {
        this.eov = bl;
    }

    public abstract cea aKA();

    public void doTick(ldz ldz2) {
    }

    @Override
    public void initialize() {
        super.initialize();
        this.setActive(false);
        this.aKJ();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 12294: {
                this.a((fvu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void fK(boolean bl) {
    }

    private void a(fvu fvu2) {
        this.dY();
        if (this.eou != null) {
            this.setActive(true);
        }
    }

    public void a(eq eq2) {
    }

    public void c(et et2, float f2) {
    }

    public void b(ew ew2, int n) {
    }

    public void aFl() {
    }

    public void P(ldv ldv2, int n) {
    }

    public void oU(int n) {
    }

    public void dN(float f2) {
    }

    public void pk(int n) {
    }

    public void oV(int n) {
    }

    public void fo(boolean bl) {
    }

    public void a(dbo dbo2, float f2) {
    }

    public void a(dbo dbo2) {
    }

    protected final int aKF() {
        return this.eot.aFh().aJC().asf().aup().g(cak.c.efF);
    }

    protected final ljq aKG() {
        return this.eou.bpf();
    }

    protected final lgl aKH() {
        return this.eou.bpg();
    }

    protected void dY() {
        assert (this.eou == null);
        this.eou = (dld)((dta)this.MessageDelegator).bzt().d(lcr.rg);
        if (this.eou == null) {
            // empty if block
        }
    }

    protected final ldv aKI() {
        return lcr.gpg;
    }

    private void aKJ() {
        assert (this.Initialized);
        assert (this.MessageDelegator != null);
        int n = 1;
        fvq fvq2 = (fvq)this.MessageDelegator.h(12292, this.GUID, lcr.qzp);
        fvq2.hcg = n;
        fvq2.hch = lcr.rg;
        this.MessageDelegator.F(fvq2);
    }
}

