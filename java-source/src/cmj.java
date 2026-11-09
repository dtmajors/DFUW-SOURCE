/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  axx
 *  lcr
 */
public class cmj
extends cmh
implements cmg {
    private static final String TC = "SFRelicAltarServer";
    private bfu elg = new bfu(this);
    private dlk eLa;
    private gex eLb;
    private boolean eLc;

    private void a(gex gex2) {
        gey gey2 = (gey)this.MessageDelegator.h(35078, this.getGUID(), gex2.aO());
        if (this.eLb != null) {
            gey2.Jj(1);
            this.MessageDelegator.F(gey2);
            return;
        }
        if (gex2.bUB()) {
            if (this.abO == -1) {
                gey2.Jj(3);
                this.MessageDelegator.F(gey2);
                return;
            }
            if (this.isProtected()) {
                gey2.Jj(0);
                this.MessageDelegator.F(gey2);
                return;
            }
            boolean bl = false;
            ldv ldv2 = gex2.ack();
            if (ldv2 != null && this.eLa != null && this.eLa.XQ() != null) {
                ldv ldv3 = this.eLa.XQ().Xw();
                bl = ldv2.equals(ldv3);
            }
            if (!this.eLc && !bl) {
                gey2.Jj(2);
                this.MessageDelegator.F(gey2);
                return;
            }
            this.eLb = gex2;
            gey2.Jj(5);
            this.MessageDelegator.F(gey2);
            return;
        }
        if (this.abO != -1) {
            gey2.Jj(4);
            this.MessageDelegator.F(gey2);
            return;
        }
        this.eLb = gex2;
        gey2.Jj(5);
        this.MessageDelegator.F(gey2);
    }

    private void a(gfc gfc2) {
        if (this.eLb == null) {
            lfn.b(5, TC, "handleRelicReleaseAltarMessage() received a release lock request from : " + gfc2.aO() + " but there is no lock.");
            assert (false);
            return;
        }
        if (!this.eLb.aO().equals(gfc2.aO())) {
            lfn.b(5, TC, "handleRelicReleaseAltarMessage() received a release lock request from : " + gfc2.aO() + " but the lock is from : " + this.eLb.aO());
            assert (false);
            return;
        }
        this.eLb = null;
    }

    private void a(gfb gfb2) {
        ldv ldv2 = gfb2.aO();
        if (this.eLb == null) {
            assert (false);
            return;
        }
        if (!this.eLb.aO().equals(gfb2.aO())) {
            assert (false);
            return;
        }
        if (this.abO != -1) {
            assert (false);
            return;
        }
        this.abO = gfb2.lF();
        this.jm().i(13696, this.abO);
        this.a(this.abO, gfg.a.jfY.ordinal(), gfb2.qd(), gfb2.iU(), gfb2.acl());
        this.eLb = null;
        ayc.a a2 = lea.epQ().iK(this.abO);
        if (a2 == null) {
            assert (false);
            return;
        }
        this.eLa.aF(a2.GG());
        this.rK(this.abO);
    }

    private void a(gfe gfe2) {
        ldv ldv2 = gfe2.aO();
        if (this.eLb == null) {
            assert (false);
            this.U(ldv2, 0);
            return;
        }
        if (!this.eLb.aO().equals(gfe2.aO())) {
            assert (false);
            this.U(ldv2, 0);
            return;
        }
        if (this.abO == -1) {
            this.eLb = null;
            this.U(ldv2, 1);
            return;
        }
        if (this.isProtected()) {
            this.eLb = null;
            this.U(ldv2, 2);
            return;
        }
        this.U(ldv2, 3);
        ayc.a a2 = lea.epQ().iK(this.abO);
        this.a(this.abO, gfg.a.jfZ.ordinal(), gfe2.qd(), gfe2.iU(), gfe2.acl());
        this.abO = -1;
        this.eLa.aG(a2.GG());
        this.jm().i(13696, this.abO);
        this.eLb = null;
        this.rK(this.abO);
    }

    private void a(int n, int n2, ldv ldv2, String string, String string2) {
        gfg gfg2 = (gfg)this.MessageDelegator.h(35083, this.getGUID(), lcr.qAY);
        gfg2.Eh(n2);
        gfg2.gO(n);
        gfg2.kV(string2);
        gfg2.fm(string);
        gfg2.oH(ldv2);
        gfg2.ci(this.eLa.XQ().getGUID());
        gfg2.cA(this.eLa.XQ().Xy());
        gfg2.ks(this.eLa.XQ().Xt());
        gfg2.c(this.aAG() != null ? this.aAG().azb() : null);
        this.MessageDelegator.F(gfg2);
    }

    private void U(ldv ldv2, int n) {
        gff gff2 = (gff)this.MessageDelegator.h(35082, this.getGUID(), ldv2);
        gff2.Jl(n);
        gff2.gO(this.abO);
        this.MessageDelegator.F(gff2);
    }

    public void a(int n, float f, boolean bl) {
        this.abO = n;
        this.jm().i(13696, n);
        if (bl) {
            this.jm().c(352, f);
        }
        if (n != -1) {
            ayc.a a2 = lea.epQ().iK(n);
            if (a2 == null) {
                assert (false) : "Invalid RelicID : " + n;
                return;
            }
            this.eLa.aF(a2.GG());
            if (bl) {
                this.a(n, gfg.a.jgc.ordinal(), null, null, null);
            }
        }
        this.rK(n);
    }

    private void aqx() {
        ej ej2 = this.fi().ae(352);
        if (ej2 == null) {
            lfn.b(5, "SFStructure", "enableAttributeNotification() No Health Attribute!");
            return;
        }
        if (ej2 instanceof ez) {
            ez ez2 = (ez)ej2;
            ez2.y(true);
        } else {
            lfn.b(5, "SFStructure", "enableAttributeNotification() Attribute class type : " + ej2.getClass());
            assert (false);
        }
    }

    public void f(et et2) {
        super.f(et2);
        if (et2.getType() != 352) {
            return;
        }
        this.aqx();
        if (this.eLc) {
            return;
        }
        this.eLc = true;
    }

    public void d(et et2, float f) {
        super.d(et2, f);
        if (et2.getType() != 352) {
            return;
        }
        if (!this.eLc) {
            return;
        }
        float f2 = this.jm().ai(352);
        float f3 = this.jm().al(352);
        if (f3 / f2 >= 0.99f) {
            this.eLc = false;
        }
    }

    public void aTi() {
        this.rK(this.abO);
    }

    private void rK(int n) {
        axo axo2 = this.eLa.bpz();
        if (axo2 == null) {
            return;
        }
        axx axx2 = axo2.XQ();
        if (axx2 == null) {
            return;
        }
        if (!axx2.Zu()) {
            return;
        }
        axx2.iI(this.abO);
    }

    public int lF() {
        return this.abO;
    }

    public ldv aIY() {
        return null;
    }

    public ldv acm() {
        return null;
    }

    private boolean isProtected() {
        if (this.eLa == null) {
            return false;
        }
        if (this.eLa.XQ() == null) {
            return false;
        }
        if (this.eLa.bpz() == null) {
            return false;
        }
        return this.eLa.bpz().XM();
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 35077: {
                this.a((gex)dxq2);
                break;
            }
            case 35079: {
                this.a((gfc)dxq2);
                break;
            }
            case 35080: {
                this.a((gfb)dxq2);
                break;
            }
            case 35081: {
                this.a((gfe)dxq2);
                break;
            }
            case 1028: {
                if (this.aAG() == null) break;
                this.aAG().receiveMessage(dxq2);
            }
        }
    }

    public cmj() {
        super(true);
        this.aqx();
    }

    public final bfq aIv() {
        return this.elg;
    }

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.elg.doTick(ldz2);
    }

    public void initialize() {
        super.initialize();
    }

    public gex aTj() {
        return this.eLb;
    }

    public void b(gex gex2) {
        this.eLb = gex2;
    }

    public dlk aTk() {
        return this.eLa;
    }

    @Override
    public void b(dlk dlk2) {
        this.eLa = dlk2;
    }

    @Override
    public void g(bfn bfn2) {
        this.fi().f(5552, false);
        this.a(this.abO, gfg.a.jgb.ordinal(), bfn2 != null ? bfn2.aYF : null, null, null);
    }

    @Override
    public void aTf() {
        this.fi().f(5552, false);
    }

    @Override
    public void gr(boolean bl) {
        this.fi().f(1280, bl);
    }

    @Override
    public void gs(boolean bl) {
        this.jm().f(12432, bl);
    }
}

