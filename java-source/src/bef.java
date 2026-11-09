/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public class bef
extends bej {
    private ldv dcb = null;
    private float dcc = 2.25f;
    private float dcd = 0.0f;
    private float dda = 0.15f;
    private float ddb = 2.0f;
    private float ddc = 1.0f;
    private float ddd = 1.0f;
    private float dde = 0.3f;
    private float ddf = 0.6f;
    private float ddg = 1.2f;
    private float ddh = 0.6f;
    private float ddi = 0.4f;
    private float ddj = 0.3f;
    private float ddk = 0.523599f;
    private float ddl = 0.3f;
    private int dcq = 0;

    public bef(cbx cbx2) {
        super(cbx2);
        this.dcr = 2;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.anf().isServerObject()) {
            return;
        }
        if (!this.dct && this.dcb == null) {
            this.amv();
        } else {
            this.amL();
        }
        super.doTick(ldz2);
    }

    private void amL() {
        if (this.dcq == 0) {
            return;
        }
        if (this.isActive() && this.amQ() != null) {
            kmg kmg2 = (kmg)this.MessageDelegator.h(3334);
            kmg2.ts(this.getGUID());
            kmg2.hC(this.amQ());
            kmg2.pMG = this.dcq;
            kmg2.dcc = this.dcc;
            kmg2.dda = this.dda;
            kmg2.ddb = this.ddb;
            kmg2.ddh = this.ddh;
            kmg2.ddi = this.ddi;
            this.MessageDelegator.a(kmg2);
            this.dcq = 0;
        }
    }

    @Override
    public void setActive(boolean bl) {
        super.setActive(bl);
        if (this.dct) {
            this.amu();
        }
    }

    public void amv() {
        int n;
        assert (null != this.MessageDelegator);
        kmg kmg2 = (kmg)this.MessageDelegator.h(3334);
        kmg2.wD(true);
        kmg2.dsK = true;
        kmg2.hC(this.ane());
        kmg2.ts(this.getGUID());
        kmg2.pMG = n = 4194049;
        kmg2.dcc = this.dcc;
        kmg2.dcd = this.dcd;
        kmg2.dda = this.dda;
        kmg2.ddb = this.ddb;
        kmg2.ddc = this.ddc;
        kmg2.ddd = this.ddd;
        kmg2.dde = this.dde;
        kmg2.ddf = this.ddf;
        kmg2.ddg = this.ddg;
        kmg2.ddh = this.ddh;
        kmg2.ddi = this.ddi;
        kmg2.ddj = this.ddj;
        kmg2.ddk = this.ddk;
        kmg2.ddl = this.ddl;
        this.MessageDelegator.a(kmg2);
        this.dcb = kmg2.getGUID();
    }

    private void amu() {
        assert (this.amQ() != null);
        kmg kmg2 = (kmg)this.MessageDelegator.h(3334);
        kmg2.wD(false);
        kmg2.jM(false);
        kmg2.hC(this.amQ());
        kmg2.ts(this.getGUID());
        kmg2.pMG = 4;
        kmg2.Active = this.Active;
        this.MessageDelegator.a(kmg2);
        if (this.Active) {
            this.amR();
        } else {
            this.amS();
        }
    }

    @Override
    protected void a(kvl kvl2) {
        if (kvl2.dXg().equals(this.dcb)) {
            assert (kvl2.getResult() == 0);
            assert (!this.dct);
            this.hf(kvl2.axa());
            this.dct = true;
            this.dcb = null;
        } else {
            super.a(kvl2);
        }
    }

    @Override
    public void aK(ljq ljq2) {
        if (this.HT() && this.isActive()) {
            assert (null != this.amQ());
            kmg kmg2 = (kmg)this.MessageDelegator.h(3334);
            kmg2.ts(this.getGUID());
            kmg2.hC(this.amQ());
            kmg2.pKf = false;
            kmg2.pKg = false;
            kmg2.pKh = false;
            kmg2.pKi = false;
            float f2 = 0.5f;
            if (ljq2.rlV < -f2) {
                kmg2.pKf = true;
            }
            if (ljq2.rlV > f2) {
                kmg2.pKg = true;
            }
            if (ljq2.x < -f2) {
                kmg2.pKh = true;
            }
            if (ljq2.x > f2) {
                kmg2.pKi = true;
            }
            kmg2.pMG = 120;
            this.MessageDelegator.a(kmg2);
        } else {
            lfn.b(0, "notifyDirectionVectorChanged", "controller not ready!");
        }
    }

    public void amY() {
        if (this.HT() && this.isActive()) {
            kmg kmg2 = (kmg)this.MessageDelegator.h(3334);
            kmg2.pMG = 128;
            kmg2.ts(this.getGUID());
            kmg2.hC(this.amQ());
            kmg2.pMH = true;
            this.MessageDelegator.a(kmg2);
        } else {
            lfn.b(0, "notifyJumpSkillTriggered : ", "controller not ready!");
        }
    }

    public final float amz() {
        return this.dcc;
    }

    public final void cu(float f2) {
        if (this.dcc == f2) {
            return;
        }
        this.dcc = f2;
        this.dcq |= 0x100;
    }

    public final float ana() {
        return this.dda;
    }

    public final void cH(float f2) {
        if (this.dda == f2) {
            return;
        }
        this.dda = f2;
        this.dcq |= 0x400;
    }

    public final float anb() {
        return this.ddb;
    }

    public final void cI(float f2) {
        if (this.ddb == f2) {
            return;
        }
        this.ddb = f2;
        this.dcq |= 0x800;
    }

    public final float anc() {
        return this.ddh;
    }

    public final void cJ(float f2) {
        if (this.ddh == f2) {
            return;
        }
        this.ddh = f2;
        this.dcq |= 0x20000;
    }

    public final float and() {
        return this.ddi;
    }

    public final void cK(float f2) {
        if (this.ddi == f2) {
            return;
        }
        this.ddi = f2;
        this.dcq |= 0x40000;
    }
}

