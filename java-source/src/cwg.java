/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  ha
 *  lcr
 */
public class cwg
extends btk {
    protected final cwf.b fEJ;
    protected final int aYH;
    protected final boolean dwG;
    protected a fEK = a.fEM;
    private cwc fEL = null;

    public cwg(cwf.b b2, int n, boolean bl) {
        this.fEJ = b2;
        this.aYH = n;
        this.dwG = bl;
    }

    public final cwf.b bdr() {
        return this.fEJ;
    }

    public final int Ec() {
        return this.aYH;
    }

    public final a bds() {
        return this.fEK;
    }

    public final cwc bdt() {
        return this.fEL;
    }

    public final void a(cwc cwc2) {
        this.fEL = cwc2;
    }

    @Override
    public final void cleanUp() {
        super.cleanUp();
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 12294: {
                this.b((fvu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void Ci() {
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": ");
        stringBuilder.append((Object)this.fEJ);
        stringBuilder.append(" (");
        stringBuilder.append(this.aYH);
        stringBuilder.append(") GUID=");
        stringBuilder.append(this.GUID);
        stringBuilder.append(" PlayerObject=");
        if (this.fEL != null) {
            stringBuilder.append(this.fEL.aFh().getGUID());
        }
        return stringBuilder.toString();
    }

    protected final ldv bdk() {
        assert (this.dwG);
        assert (this.fEL != null);
        return this.fEL.aFh().jk().bhh();
    }

    protected final int jr() {
        assert (this.dwG);
        assert (this.fEL != null);
        return this.fEL.aFh().jk().jr();
    }

    protected final ldv bdu() {
        assert (this.dwG);
        assert (this.fEL != null);
        ldv ldv2 = this.gO();
        if (ldv2 != null) {
            return lcr.p((ldv)this.GUID, (int)this.jr(), (int)this.gO().enw());
        }
        return lcr.p((ldv)this.GUID, (int)this.jr(), (int)this.ayp().enw());
    }

    protected final amf d(ldv ldv2) {
        assert (ldv2 != null);
        return this.MessageDelegator.bzx().bzt().d(ldv2);
    }

    protected final ldv gO() {
        assert (this.dwG);
        assert (this.fEL != null);
        ha ha2 = ((cex)this.fEL.aFh()).mA();
        return ha2 != null ? ha2.getGUID() : null;
    }

    protected final ha mA() {
        assert (this.dwG);
        assert (this.fEL != null);
        return ((cex)this.fEL.aFh()).mA();
    }

    protected final ldv ayp() {
        assert (this.dwG);
        assert (this.fEL != null);
        return ((cex)this.fEL.aFh()).getGUID();
    }

    protected final String iU() {
        assert (this.dwG);
        assert (this.fEL != null);
        cex cex2 = (cex)this.fEL.aFh();
        ha ha2 = cex2.mA();
        if (ha2 != null) {
            return ha2.iU();
        }
        if (cex2.aJP() instanceof hy) {
            return cex2.pa();
        }
        return null;
    }

    protected final ldv bdv() {
        assert (!this.dwG);
        assert (this.fEL != null);
        return lcr.ak((ldv)this.GUID, (int)this.fEL.aFh().aJX().aso());
    }

    protected void lR(ldv ldv2) {
        lfn.b(4, "SFSessionHandler", "notifyObjectObserved() Object " + ldv2 + " was observed. Nothing done in " + this.getClass().getSimpleName());
    }

    protected final void bdw() {
        this.fEL.a(this);
    }

    protected final void f(ldv ldv2, loz loz2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, ldv2);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    protected final void iL(ldv ldv2) {
        assert (ldv2 != null);
        fvq fvq2 = (fvq)this.MessageDelegator.h(12292, this.GUID, lcr.qzp);
        fvq2.hcg = 1;
        fvq2.hch = ldv2;
        this.MessageDelegator.F(fvq2);
    }

    private void b(fvu fvu2) {
        if (fvu2.iXT == null) {
            return;
        }
        this.lR(fvu2.iXT);
    }
}

