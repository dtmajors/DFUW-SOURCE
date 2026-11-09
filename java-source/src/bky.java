/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  lcr
 *  lcw
 */
public class bky
extends bke
implements bto {
    private fdk dty = null;
    private cex aaY = null;
    private String dtz = null;
    private boolean dtA = false;
    private ldv aTZ = null;

    public bky() {
        this.dsy = bkd.a.drY;
    }

    @Override
    public void a(int n, fdo fdo2) {
        assert (fdo2 != null);
        this.dty = (fdk)fdo2;
        if (this.dty.SkillLevel <= 0.0f) {
            lfn.b(5, "SFReviveCreatureFO", "doFunction() SkillLevel is invalid.");
            if (this.dty.bOs()) {
                this.a(this.dty, false);
            }
            this.Vc();
            return;
        }
        if (lcw.enb()) {
            if (!ctg.feM) {
                lfn.b(5, "SFReviveCreatureFO", "doFunction() Admin commands are currently disabled in standalone.");
                if (this.dty.bOs()) {
                    this.a(this.dty, false);
                }
                this.Vc();
                return;
            }
            fux fux2 = (fux)this.MessageDelegator.h(5639, this.GUID, this.GUID);
            fux2.bc = "testcharacter";
            this.MessageDelegator.F(fux2);
            return;
        }
        this.arr();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.aaY == null) {
            return;
        }
        if (this.aro()) {
            return;
        }
        if (this.dtA) {
            this.arp();
        }
        if (this.dty.bOs()) {
            this.a(this.dty, false);
        }
        this.aaY = null;
        this.Vc();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5639: {
                this.a((fux)dxq2);
                break;
            }
            case 18180: {
                this.b((esv)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private boolean aro() {
        Object object;
        assert (this.dty != null);
        if (this.aaY == null) {
            object = this.MessageDelegator.d(this.dty.akX);
            if (object == null) {
                lfn.b(5, "SFReviveCreatureFO", "canReviveObject() Could not find object " + this.dty.akX);
                return false;
            }
            if (!(object instanceof cex)) {
                lfn.b(5, "SFReviveCreatureFO", "canReviveObject() Object " + this.dty.akX + " is not a playerobjectserver but: " + object.getClass().getName());
                return false;
            }
            this.aaY = (cex)object;
        }
        return ((byv)(object = this.aaY.aLU().aEP())).vM() == 2;
    }

    private void b(esv esv2) {
        assert (this.dty != null);
        assert (this.aaY != null);
        if (esv2.iBx == null) {
            lfn.b(5, "SFReviveCreatureFO", "handleConfirmationResponse() ConfirmationRespose is null.");
            return;
        }
        this.dtA = false;
        boolean bl2 = true;
        bdv bdv2 = esv2.iBx;
        if (bdv2 instanceof bdw) {
            int n = ((bdw)bdv2).dbU;
            bdp.a a2 = bdp.a.getReviveButtonType(n);
            if (a2 == null) {
                lfn.b(5, "SFReviveCreatureFO", "handleConfirmationResponse() Invalid button ordinal provided: " + n);
                a2 = bdp.a.dbu;
            }
            switch (a2) {
                case dbt: {
                    this.ars();
                    bl2 = true;
                    break;
                }
                case dbu: {
                    bl2 = false;
                    break;
                }
                default: {
                    lfn.b(5, "SFReviveCreatureFO", "handleConfirmationResponse() Invalid buttontype provided: " + (Object)((Object)a2));
                    bl2 = false;
                    break;
                }
            }
        } else {
            bl2 = bdv2 instanceof bdx ? false : false;
        }
        if (this.dty.bOs()) {
            this.a(this.dty, bl2);
        }
        this.aaY = null;
        this.Vc();
    }

    private void a(fux fux2) {
        assert (this.dtz == null);
        if (fux2.bc == null) {
            lfn.b(5, "SFReviveCreatureFO", "handleObjectInfoNameLookupMessage() CharacterName is null.");
            if (this.dty.bOs()) {
                this.a(this.dty, false);
            }
            this.Vc();
            return;
        }
        this.dtz = fux2.bc;
        boolean bl2 = this.aro();
        if (!bl2) {
            if (this.dty.bOs()) {
                this.a(this.dty, false);
            }
            this.Vc();
            return;
        }
        this.arq();
    }

    private void arp() {
        assert (this.aaY != null);
        assert (this.dtz != null);
        assert (this.aTZ != null);
        assert (this.dtA);
        ess ess2 = (ess)this.MessageDelegator.h(18182, this.GUID, this.aTZ);
        this.MessageDelegator.F(ess2);
    }

    private void arq() {
        assert (this.aaY != null);
        assert (this.dtz != null);
        assert (this.aTZ == null);
        assert (!this.dtA);
        double d2 = this.MessageDelegator.arc().rgz + 20.0;
        int n = this.aaY.mA().hk().ib();
        this.aTZ = lcr.p((ldv)lcr.aTZ, (int)n, (int)this.GUID.enw());
        if (!lcw.qOR) {
            String string = "Do you accept revival by '" + this.dtz + "'";
            String[] stringArray = bdp.dbl;
            bdr bdr2 = new bdr(this.GUID, d2, string, stringArray);
            bdr2.Title = "";
            est est2 = (est)this.MessageDelegator.h(18179, this.GUID, this.aTZ);
            est2.iBv = bdr2;
            this.MessageDelegator.F(est2);
        } else {
            bdt bdt2 = new bdt();
            bdt2.bsD = d2;
            bdt2.dbD = bds.dbB.ordinal();
            bdt2.ev = this.GUID;
            bdt2.Ri = lcr.tQ((ldv)this.dty.aYF);
            bdt2.dbE = lwq.tfZ.bD(this.dtz);
            bdt2.ed = bdu.dbK.ordinal();
            esu esu2 = (esu)this.MessageDelegator.h(18183, this.getGUID(), this.aTZ);
            esu2.iBw = bdt2;
            this.MessageDelegator.F(esu2);
        }
        this.dtA = true;
    }

    private void arr() {
        assert (this.dty != null);
        ldv ldv2 = lcr.tQ((ldv)this.dty.aYF);
        fux fux2 = (fux)this.MessageDelegator.h(5639, this.GUID, lcr.hac);
        fux2.Ri = ldv2;
        this.MessageDelegator.F(fux2);
    }

    private void ars() {
        assert (this.dty != null);
        efc efc2 = (efc)this.MessageDelegator.h(12806, this.GUID, this.dty.akX);
        efc2.eW = 3;
        efc2.bpZ = 1;
        efc2.aYF = this.dty.aYF;
        efc2.bsG = this.dty.bsG;
        efc2.SkillLevel = this.dty.SkillLevel;
        efc2.dZq = this.dty.iGw;
        efc2.iom = this.dty.iGw;
        efc2.ion = this.dty.iGw;
        this.MessageDelegator.H(efc2);
        dxy dxy2 = (dxy)this.MessageDelegator.h(35587, this.GUID, this.dty.aZG);
        dxy2.Da(cfv.REVIVE_OTHER.ordinal());
        this.MessageDelegator.E(dxy2);
        dxy dxy3 = (dxy)this.MessageDelegator.h(35587, this.GUID, this.dty.akX);
        dxy3.Da(cfv.REVIVE_BY_OTHER.ordinal());
        this.MessageDelegator.E(dxy3);
    }
}

