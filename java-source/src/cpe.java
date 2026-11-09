/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cph
 *  cxd
 *  lcr
 */
public class cpe
extends cph {
    private static final String eSs = "aaa_mount_collscheme_dead.static.SFSPHERECOLLECTIONCOLLISIONSCHEME.sfc";
    protected byq eSt = null;
    private cpp eSu = null;

    public cpe(boolean bl) {
        super(bl);
        this.ObjectType = 86;
        this.eSt = bl ? new bys((cpg)this) : new byr((cpf)this);
        this.eSu = new cpp(this);
    }

    public final byq aWW() {
        return this.eSt;
    }

    public final byx aJD() {
        return this.eSt;
    }

    public final boolean Uy() {
        return true;
    }

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.eSt.doTick(ldz2);
    }

    public void initialize() {
        super.initialize();
        this.eSt.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eSt);
    }

    public final void aWX() {
        if (!this.Initialized || this.ScheduledForRemoval) {
            return;
        }
        if (this.aAG() == null) {
            return;
        }
        kmq kmq2 = (kmq)this.MessageDelegator.h(3353);
        kmq2.ts(this.GUID);
        kmq2.hC(this.aAG().axa());
        kmq2.pOb = eSs;
        kmq2.pOc = eSs;
        kmq2.pOd = "dummy.sfc";
        kmq2.pOa = true;
        this.MessageDelegator.a(kmq2);
        if (this.dwG) {
            gyo gyo2 = (gyo)this.MessageDelegator.h(12054, this.GUID, lcr.qAI);
            gyo2.ija = 1;
            gyo2.biA = true;
            this.MessageDelegator.F(gyo2);
        }
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1042: {
                this.a((ftr)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 5385: {
                this.a((kvm)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    public void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        this.eSt.setActive(false);
        this.MessageDelegator.hd(this.eSt.getGUID());
    }

    protected void p(cbx cbx2) {
        super.p(cbx2);
        cpe cpe2 = (cpe)cbx2;
        if (this.eSt != null) {
            this.eSt.b(cpe2.aWW());
        }
    }

    private void a(kvm kvm2) {
        if (!kvm2.qeH) {
            return;
        }
    }

    protected final void a(float f2, float f3, int n) {
        assert (!this.dwG);
        assert (f2 > 0.0f);
        assert (f3 > 0.0f);
        assert (n > 0);
        assert (this.eSu != null);
        ftr ftr2 = (ftr)this.MessageDelegator.h(1042, this.GUID, this.aXC());
        ftr2.iWc = f2;
        ftr2.iWd = f3;
        ftr2.edq = n;
        this.MessageDelegator.F(ftr2);
        this.eSu.b(f2, f3, n);
    }

    protected final void a(float f2, float f3, int[] nArray) {
        assert (!this.dwG);
        assert (f2 > 0.0f);
        assert (f3 > 0.0f);
        assert (nArray != null);
        assert (this.eSu != null);
        if (nArray.length == 0) {
            return;
        }
        ftr ftr2 = (ftr)this.MessageDelegator.h(1042, this.GUID, this.aXC());
        ftr2.iWc = f2;
        ftr2.iWd = f3;
        ftr2.edr = nArray;
        this.MessageDelegator.F(ftr2);
        this.eSu.a(f2, f3, nArray);
    }

    public void b(byv byv2, boolean bl) {
    }

    private void a(ftr ftr2) {
        assert (this.dwG);
        if (this.aAG() == null) {
            return;
        }
        if (ftr2.iWc <= 0.0f) {
            return;
        }
        if (ftr2.iWd <= 0.0f) {
            return;
        }
        float f2 = 0.0f;
        float f3 = this.fi().al(352);
        float f4 = this.fi().ai(352);
        if (ftr2.edq > 0) {
            this.eSu.b(ftr2.iWc, ftr2.iWd, ftr2.edq);
        } else {
            assert (ftr2.edr != null);
            assert (ftr2.edr.length > 0);
            this.eSu.a(ftr2.iWc, ftr2.iWd, ftr2.edr);
            float f5 = this.eSu.a(ftr2.iWc, ftr2.iWd, ftr2.edr, f3, f4);
            if (f5 > 0.0f) {
                f5 = -f5;
                int n = 352;
                int n2 = bfk.dgC;
                int n3 = cxd.fHu;
                this.a(n, n2, this.az(), n3, f5, null);
                cpg cpg2 = (cpg)this;
                ldv ldv2 = cpg2.aXq();
                this.c(-f5 * 0.3f, ldv2);
            }
        }
    }

    private void c(float f2, ldv ldv2) {
        fcw fcw2 = (fcw)this.MessageDelegator.h(9227, this.GUID, this.MessageDelegator.getGUID());
        fcw2.bst = bkd.dqy;
        fcw2.aZG = this.GUID;
        fcw2.akX = ldv2;
        fcw2.aYF = this.getGUID();
        fcw2.bsG = this.az();
        fcw2.aYC = cxd.fHA;
        fcw2.Magnitude = f2;
        fcw2.eKm = 0.0;
        fcw2.aSp = 0.0f;
        fcw2.aYH = 1;
        fcw2.aYG = bfk.dgC;
        fcw2.bsE = 0;
        fcw2.bRD = 1;
        fcw2.gpI = -3.0;
        fcw2.aZH = this.aAG().av();
        fcw2.a(cxd.f.fQW);
        this.MessageDelegator.F(fcw2);
    }
}

