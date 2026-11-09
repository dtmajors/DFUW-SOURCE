/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  lcw
 */
public class bkt
extends bke {
    protected boolean dts = false;

    public bkt() {
        this.dsy = bkd.a.drF;
    }

    @Override
    public void a(int n, fdo fdo2) {
        dxq dxq2;
        efc efc2;
        assert (fdo2 != null);
        this.dts = false;
        boolean bl2 = this.b(fdo2);
        if (bl2) {
            efc2 = (efc)this.MessageDelegator.h(12806, this.GUID, fdo2.akX);
            efc2.eW = 3;
            efc2.bpZ = 3;
            efc2.aYF = fdo2.aYF;
            efc2.bsG = fdo2.bsG;
            this.MessageDelegator.H(efc2);
            dxq2 = (dxy)this.MessageDelegator.h(35587, this.GUID, fdo2.akX);
            dxq2.Da(cfv.GANKED.ordinal());
            this.MessageDelegator.E(dxq2);
            dxy dxy2 = (dxy)this.MessageDelegator.h(35587, this.GUID, fdo2.aZG);
            dxy2.Da(cfv.GANK_PLAYER.ordinal());
            this.MessageDelegator.E(dxy2);
        }
        if (this.dts) {
            efc2 = (efc)this.MessageDelegator.h(12806, this.GUID, fdo2.akX);
            efc2.eW = 3;
            efc2.bpZ = 1;
            efc2.aYF = fdo2.aYF;
            efc2.bsG = fdo2.bsG;
            efc2.SkillLevel = 1.0f;
            efc2.dZq = 0.2f;
            efc2.iom = 0.2f;
            efc2.ion = 0.2f;
            this.MessageDelegator.E(efc2);
            dxq2 = (gsp)this.getMessageDelegator().h(11048, this.getGUID(), fdo2.akX);
            ((gsp)dxq2).gcK = true;
            ((gsp)dxq2).jpN = true;
            this.MessageDelegator.E(dxq2);
        }
        if (fdo2.bOs()) {
            this.a(fdo2, bl2);
        }
        this.Vc();
    }

    private boolean b(fdo fdo2) {
        amf amf2 = this.MessageDelegator.d(fdo2.akX);
        if (amf2 == null) {
            lfn.b(5, "SFGankCreatureFO", "canGankObject() Could not find object " + fdo2.akX);
            return false;
        }
        if (!(amf2 instanceof cex)) {
            lfn.b(5, "SFGankCreatureFO", "canGankObject() Object " + fdo2.akX + " is not a playerobjectserver but: " + amf2.getClass().getName());
            return false;
        }
        byv byv2 = ((cex)amf2).aLU().aEP();
        if (byv2.vM() != 2) {
            return false;
        }
        cex cex2 = (cex)amf2;
        if (cex2.fi().ad(10928) && cex2.fi().ag(10928)) {
            lfn.b(2, "SFGankCreatureFO", "canGankObject() Object " + fdo2.akX + " has newbie protection.");
            return false;
        }
        if (lcw.emW()) {
            int n;
            boolean bl2 = (fdo2.dhr & 0x1000) != 0;
            int n2 = fdo2.dhr & 0xFFFFEFFF;
            boolean bl3 = cex2.mA().kA() <= (float)cg.gW;
            ew ew2 = (ew)cex2.fi().ae(12256);
            int n3 = n = ew2 == null ? 0 : ew2.fQ();
            if (n2 == n && (bl3 || bl2)) {
                lmf lmf2 = lea.eg(cex2.aAG().av());
                if (bl3 && (lmf2 == lmf.rEz || lmf2 == lmf.rEu || lmf2 == lmf.rEv)) {
                    this.e(fdo2.aYF, mcl.uwf.bD(cg.gW));
                    this.dts = true;
                    return false;
                }
                if (bl2 && (lcw.qQb || lmf2 == lmf.rEz || lmf2 == lmf.rEu || lmf2 == lmf.rEv)) {
                    this.e(fdo2.aYF, mcl.uwg.bD(cg.gW));
                    return false;
                }
            }
        }
        return true;
    }
}

