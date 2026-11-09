/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cph
 *  cug
 *  cxd
 *  lcr
 */
public class cpa
extends cph {
    protected amb eRF = null;
    protected double eRG = 0.0;
    protected bzp eRH = null;
    private boolean eRI = false;
    private static final int eRJ = 0;
    private static final int eRK = 1;
    private int eRL = 0;
    private int eRM = 0;
    private int eRN = 0;
    private a eRO;
    private cpn eRP = null;

    public cpa(boolean bl) {
        super(bl);
        this.ObjectType = 93;
        this.eRH = bl ? new bzr(this) : new bzq(this);
        this.eRP = new cpn(this);
        this.eRO = a.eRS;
    }

    private void aWG() {
        if (this.eRO != a.eRS) {
            return;
        }
        if (ResourceTree == null) {
            return;
        }
        this.eRO = ResourceTree.isDescendant(this.az(), cug.fnE) ? a.eRQ : a.eRR;
    }

    public final byx aJD() {
        return this.eRH;
    }

    public final boolean aIn() {
        this.aWG();
        return this.eRO == a.eRQ;
    }

    public final boolean aIo() {
        this.aWG();
        return this.eRO == a.eRR;
    }

    public final bzp aWH() {
        return this.eRH;
    }

    public amb aWI() {
        return this.eRF;
    }

    public void a(amb amb2) {
        this.eRF = amb2;
    }

    public float FZ() {
        if (this.eRF == null) {
            return 0.0f;
        }
        return this.eRF.Fp();
    }

    public void b(byv byv2, boolean bl) {
    }

    public void initialize() {
        if (!this.Initialized) {
            super.initialize();
            this.eRH.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.eRH);
            this.Initialized = true;
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

    public void receiveResourceResponse(ktf ktf2) {
        switch (ktf2.egN()) {
            default: 
        }
        super.receiveResourceResponse(ktf2);
    }

    public void receiveResponse(ktv ktv2) {
        super.receiveResponse(ktv2);
    }

    public void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        this.eRH.setActive(false);
        this.MessageDelegator.hd(this.eRH.getGUID());
    }

    protected void p(cbx cbx2) {
        super.p(cbx2);
        cpa cpa2 = (cpa)cbx2;
        if (this.eRH != null) {
            this.eRH.b(cpa2.aWH());
        }
    }

    protected final void a(float f2, float f3, int n) {
        assert (!this.dwG);
        assert (f2 > 0.0f);
        assert (f3 > 0.0f);
        assert (n > 0);
        assert (this.eRP != null);
        ftr ftr2 = (ftr)this.MessageDelegator.h(1042, this.GUID, this.aXC());
        ftr2.iWc = f2;
        ftr2.iWd = f3;
        ftr2.edq = n;
        this.MessageDelegator.F(ftr2);
        this.eRP.b(f2, f3, n);
    }

    protected final void a(float f2, float f3, int[] nArray) {
        assert (!this.dwG);
        assert (f2 > 0.0f);
        assert (f3 > 0.0f);
        assert (nArray != null);
        assert (nArray.length > 0);
        assert (this.eRP != null);
        if (nArray.length == 0) {
            return;
        }
        ftr ftr2 = (ftr)this.MessageDelegator.h(1042, this.GUID, this.aXC());
        ftr2.iWc = f2;
        ftr2.iWd = f3;
        ftr2.edr = nArray;
        this.MessageDelegator.F(ftr2);
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
            this.eRP.b(ftr2.iWc, ftr2.iWd, ftr2.edq);
        } else {
            assert (ftr2.edr != null);
            assert (ftr2.edr.length > 0);
            this.eRP.a(ftr2.iWc, ftr2.iWd, ftr2.edr);
            float f5 = this.eRP.a(ftr2.iWc, ftr2.iWd, ftr2.edr, f3, f4);
            if (f5 > 0.0f) {
                f5 = -f5;
                int n = 352;
                int n2 = bfk.dgC;
                int n3 = cxd.fHu;
                this.a(n, n2, this.az(), n3, f5, null);
            }
        }
    }

    private void pf(int n) {
        assert (n > 0);
        ldv ldv2 = lcr.qEa;
        Object var3_3 = null;
        if (this.dwG) {
            ldv2 = lcr.qEb;
        }
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, ldv2);
        glh2.SpecialEffectType = del.giD;
        glh2.akX = this.aAG().getGUID();
        glh2.aZD = this.aAG().av();
        glh2.gfs = var3_3;
        this.MessageDelegator.F(glh2);
    }
}

