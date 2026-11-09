/*
 * Decompiled with CFR.
 */
public abstract class don
extends btk {
    protected dnk gLO = null;
    protected dnj gLP = null;
    protected boolean gLQ = false;
    protected loz bok = null;

    public final dnk brJ() {
        return this.gLO;
    }

    public final void a(dnk dnk2) {
        this.gLO = dnk2;
    }

    public final dnj brK() {
        return this.gLP;
    }

    public final void a(dnj dnj2) {
        this.gLP = dnj2;
    }

    public final void brL() {
        this.gLQ = true;
    }

    public abstract dxq is(boolean var1);

    @Override
    public final void initialize() {
        assert (!this.Initialized);
        assert (this.gLO != null);
        assert (this.gLP != null);
        super.initialize();
        this.brI();
    }

    protected final void nw(ldv ldv2) {
        assert (ldv2 != null);
        fmp fmp2 = (fmp)this.MessageDelegator.h(7971, this.GUID, ldv2);
        fmp2.hsP = true;
        this.MessageDelegator.F(fmp2);
    }

    protected final void a(ldv ldv2, dny dny2) {
        assert (ldv2 != null);
        assert (dny2 != null);
        assert (dny2.GUID != null);
        assert (dny2.dAy != null);
        flw flw2 = (flw)this.MessageDelegator.h(7952, this.GUID, ldv2);
        flw2.iPs = new ldv[]{dny2.GUID};
        flw2.dJh = new lef[]{dny2.dAy};
        this.MessageDelegator.F(flw2);
    }

    protected final void Z(ldv ldv2, ldv ldv3) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        flx flx2 = (flx)this.MessageDelegator.h(7949, this.GUID, ldv2);
        flx2.hsP = true;
        flx2.iPs = new ldv[]{ldv3};
        this.MessageDelegator.F(flx2);
    }

    protected final void a(ldv ldv2, ldv ldv3, int n, int n2, int n3, int n4) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        assert (n > 0);
        assert (n2 > 0);
        assert (n3 > 0);
        fmg fmg2 = (fmg)this.MessageDelegator.h(7988, this.GUID, ldv2);
        fmg2.hsP = true;
        fmg2.aXQ = ldv3;
        fmg2.gLD = n;
        fmg2.gLE = n2;
        fmg2.aRX = n3;
        fmg2.ccY = n4;
        this.MessageDelegator.F(fmg2);
    }

    protected final void a(ldv ldv2, int[] nArray, int[] nArray2, boolean bl) {
        assert (ldv2 != null);
        assert (nArray != null);
        assert (nArray2 != null);
        fmt fmt2 = (fmt)this.MessageDelegator.h(7964, this.GUID, ldv2);
        fmt2.hsP = true;
        fmt2.bqd = nArray;
        fmt2.iIY = nArray2;
        fmt2.iQw = bqm.c.dEV.ordinal();
        fmt2.iQx = bl;
        this.MessageDelegator.F(fmt2);
    }

    protected abstract void brI();
}

