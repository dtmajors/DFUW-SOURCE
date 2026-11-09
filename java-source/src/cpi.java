/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cph
 *  cxd
 *  lcr
 */
public class cpi
extends cph {
    protected amj eTv = null;
    protected double eRG = 0.0;
    protected bzj eTw = null;
    private boolean eRI = false;
    private static final int eRJ = 0;
    private static final int eRK = 1;
    private int eRL = 0;
    private int eRM = 0;
    private int eRN = 0;
    private cpq eTx = null;

    public cpi(boolean bl) {
        super(bl);
        this.ObjectType = 162;
        this.eTw = bl ? new bzl(this) : new bzk(this);
        this.eTx = new cpq(this);
    }

    public final byx aJD() {
        return this.eTw;
    }

    public final bzj aXY() {
        return this.eTw;
    }

    public amj aXZ() {
        return this.eTv;
    }

    public void a(amj amj2) {
        this.eTv = amj2;
    }

    public float FZ() {
        if (this.eTv == null) {
            return 0.0f;
        }
        return this.eTv.FZ();
    }

    public void b(byv byv2, boolean bl) {
    }

    public void initialize() {
        if (!this.Initialized) {
            super.initialize();
            this.eTw.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.eTw);
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
        this.eTw.setActive(false);
        this.MessageDelegator.hd(this.eTw.getGUID());
    }

    protected void p(cbx cbx2) {
        super.p(cbx2);
        cpi cpi2 = (cpi)cbx2;
        if (this.eTw != null) {
            this.eTw.b(cpi2.aXY());
        }
    }

    public final void a(float f2, float f3, int n) {
        assert (!this.dwG);
        assert (f2 > 0.0f);
        assert (f3 > 0.0f);
        assert (n > 0);
        assert (this.eTx != null);
        ftr ftr2 = (ftr)this.MessageDelegator.h(1042, this.GUID, this.aXC());
        ftr2.iWc = f2;
        ftr2.iWd = f3;
        ftr2.edq = n;
        this.MessageDelegator.F(ftr2);
        this.eTx.b(f2, f3, n);
    }

    public final void a(float f2, float f3, int[] nArray) {
        assert (!this.dwG);
        assert (f2 > 0.0f);
        assert (f3 > 0.0f);
        assert (nArray != null);
        assert (nArray.length > 0);
        assert (this.eTx != null);
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
            this.eTx.b(ftr2.iWc, ftr2.iWd, ftr2.edq);
        } else {
            assert (ftr2.edr != null);
            assert (ftr2.edr.length > 0);
            this.eTx.a(ftr2.iWc, ftr2.iWd, ftr2.edr);
            float f5 = this.eTx.a(ftr2.iWc, ftr2.iWd, ftr2.edr, f3, f4);
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

