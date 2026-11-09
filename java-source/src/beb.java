/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 */
public class beb
extends bej {
    private ldv dcb = null;
    private float byZ = 0.4f;
    private float bza = 1.0f;
    private float bzc = 1.0f;
    private float bzd = 0.75f;
    private float bze = 0.35f;
    private float bzf = 0.0f;
    private int dcq = 0;

    public beb(cbx cbx2) {
        super(cbx2);
        this.dcr = 4;
        this.bzb = 3.5f;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.anf().isServerObject()) {
            return;
        }
        if (!this.dct && this.dcb == null) {
            lfn.b(0, "SFBoatController", "doTick() Creating controller in engine");
            this.amv();
        } else {
            this.amL();
        }
        super.doTick(ldz2);
    }

    @Override
    public void setActive(boolean bl) {
        super.setActive(bl);
        if (this.dct) {
            this.amu();
        }
    }

    private void amu() {
        assert (this.amQ() != null);
        kmc kmc2 = (kmc)this.MessageDelegator.h(3337);
        kmc2.wD(false);
        kmc2.jM(false);
        kmc2.hC(this.amQ());
        kmc2.ts(this.getGUID());
        kmc2.pLD = 4;
        kmc2.Active = this.Active;
        this.MessageDelegator.a(kmc2);
        if (this.Active) {
            this.amR();
        } else {
            this.amS();
        }
    }

    public void amv() {
        assert (null != this.MessageDelegator);
        lfn.b(0, "SFBoatController", "createControllerInEngine() Creating BoatController in Engine!");
        kmc kmc2 = (kmc)this.MessageDelegator.h(3337);
        kmc2.dsK = true;
        kmc2.wD(true);
        assert (this.ane() != null);
        kmc2.hC(this.ane());
        kmc2.ts(this.getGUID());
        kmc2.pLD = 59265;
        kmc2.byZ = this.byZ;
        kmc2.bza = this.bza;
        kmc2.pLE = this.bzb;
        kmc2.pLF = this.bzc;
        kmc2.bzd = this.bzd;
        kmc2.dcn = this.bze;
        kmc2.bzf = this.bzf;
        this.MessageDelegator.a(kmc2);
        this.dcb = kmc2.getGUID();
    }

    @Override
    public void aK(ljq ljq2) {
        if (this.isActive()) {
            assert (null != this.amQ());
            kmc kmc2 = (kmc)this.MessageDelegator.h(3337);
            kmc2.ts(this.getGUID());
            kmc2.hC(this.amQ());
            kmc2.pKf = false;
            kmc2.pKg = false;
            kmc2.pKh = false;
            kmc2.pKi = false;
            float f2 = 0.5f;
            if (ljq2.rlV > -f2) {
                kmc2.pKf = true;
            }
            if (ljq2.rlV < f2) {
                kmc2.pKg = true;
            }
            if (ljq2.x > -f2) {
                kmc2.pKh = true;
            }
            if (ljq2.x < f2) {
                kmc2.pKi = true;
            }
            kmc2.pLD = 120;
            this.MessageDelegator.a(kmc2);
        } else {
            lfn.b(0, "SFBoatController", "notifyDirectionVectorChanged() CONTROLLER NOT ACTIVE!");
        }
    }

    private void amL() {
        if (this.dcq == 0) {
            return;
        }
        if (this.isActive() && this.amQ() != null) {
            kmc kmc2 = (kmc)this.MessageDelegator.h(3337);
            kmc2.ts(this.getGUID());
            kmc2.hC(this.amQ());
            kmc2.pLD = this.dcq;
            kmc2.byZ = this.byZ;
            kmc2.bza = this.bza;
            kmc2.pLE = this.bzb;
            kmc2.pLF = this.bzc;
            kmc2.bzd = this.bzd;
            kmc2.dcn = this.bze;
            kmc2.bzf = this.bzf;
            this.MessageDelegator.a(kmc2);
            this.dcq = 0;
        }
    }

    public void amw() {
        this.cX(false);
        this.amS();
    }

    public void amx() {
        lfn.b(0, "SFBoatController", "notifyWorldObjectRemoved() BOATY BOATY SLINGSLING");
        this.cX(false);
    }

    @Override
    protected void a(kvl kvl2) {
        if (kvl2.dXg().equals(this.dcb)) {
            assert (kvl2.getResult() == 0);
            assert (!this.dct);
            this.hf(kvl2.axa());
            this.dct = true;
            this.dcb = null;
            lfn.b(0, "SFBoatController", "handlePhysicsResponse() Controller Created");
        } else {
            super.a(kvl2);
        }
    }

    public float GX() {
        return this.byZ;
    }

    public void be(float f2) {
        if (this.byZ == f2) {
            return;
        }
        this.byZ = f2;
        this.dcq |= 0x80;
    }

    public float GY() {
        return this.bza;
    }

    public void bf(float f2) {
        if (this.bza == f2) {
            return;
        }
        this.bza = f2;
        this.dcq |= 0x100;
    }

    public float GZ() {
        return this.bzd;
    }

    public void bg(float f2) {
        if (this.bzd == f2) {
            return;
        }
        this.bzd = f2;
        this.dcq |= 0x2000;
    }

    public float Ha() {
        return this.bze;
    }

    public void bh(float f2) {
        if (this.bze == f2) {
            return;
        }
        this.bze = f2;
        this.dcq |= 0x4000;
    }

    public float Hb() {
        return this.bzf;
    }

    public void bi(float f2) {
        if (this.bzf == f2) {
            return;
        }
        this.bzf = f2;
        this.dcq |= 0x8000;
    }

    public float Hk() {
        return this.bzc;
    }

    public void bn(float f2) {
        if (this.bzc == f2) {
            return;
        }
        this.bzc = f2;
        this.dcq |= 0x400;
    }

    @Override
    public void setMaxVelocity(float f2) {
        super.setMaxVelocity(f2);
        this.dcq |= 0x200;
    }
}

