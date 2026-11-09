/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cxd
 */
public class bei
extends bej {
    private ldv dcb = null;

    public bei(cbx cbx2) {
        super(cbx2);
        this.dcr = 10;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.anf().isServerObject()) {
            return;
        }
        if (!this.dct && this.dcb == null) {
            this.amv();
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

    public void amv() {
        assert (null != this.MessageDelegator);
        kml kml2 = (kml)this.MessageDelegator.h(3342);
        kml2.wD(true);
        kml2.dsK = true;
        kml2.hC(this.ane());
        kml2.ts(this.getGUID());
        kml2.pNI = 523777;
        kml2.pNN = 1.0995574f;
        kml2.pNO = 10.0f;
        kml2.pNP = 1.0f;
        kml2.pNQ = 1.0f;
        kml2.pNR = 3.0f;
        kml2.pNS = 8.0f;
        kml2.byZ = 1.0471976f;
        kml2.pNT = 4.0f;
        kml2.pNU = 15.0f;
        kml2.pNV = this.anf() != null ? cxd.xO((int)this.anf().az()) : 3.0f;
        this.MessageDelegator.a(kml2);
        this.dcb = kml2.getGUID();
    }

    private void amu() {
        assert (this.amQ() != null);
        kml kml2 = (kml)this.MessageDelegator.h(3342);
        kml2.wD(false);
        kml2.jM(false);
        kml2.hC(this.amQ());
        kml2.ts(this.getGUID());
        kml2.pNI = 4;
        kml2.Active = this.Active;
        this.MessageDelegator.a(kml2);
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
            kml kml2 = (kml)this.MessageDelegator.h(3342);
            kml2.ts(this.getGUID());
            kml2.hC(this.amQ());
            kml2.pNK = false;
            kml2.pNJ = false;
            kml2.pNL = false;
            kml2.pNM = false;
            kml2.pMH = false;
            float f2 = 0.5f;
            if (ljq2.x < -f2) {
                kml2.pNM = true;
            }
            if (ljq2.x > f2) {
                kml2.pNL = true;
            }
            if (ljq2.y > f2) {
                kml2.pMH = true;
            }
            if (ljq2.rlV < f2) {
                kml2.pNJ = true;
            }
            if (ljq2.rlV > -f2) {
                kml2.pNK = true;
            }
            kml2.pNI = 496;
            this.MessageDelegator.a(kml2);
        } else {
            lfn.b(0, "SFMountSwimObjectController", "notifyDirectionVectorChanged() Controller not ready!");
        }
    }

    public void amY() {
        lfn.b(0, "SFMountSwimObjectController", "notifyJumpSkillTriggered() DUDE! You can't jump while swimming");
    }
}

