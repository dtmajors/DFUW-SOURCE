/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  mcs
 */
public class bld
extends bke {
    private fdm dtN = null;
    private cnh dtO = null;
    private cte[] dtP = null;

    public bld() {
        this.dsy = bkd.a.dsd;
    }

    @Override
    public void a(int n, fdo fdo2) {
        if (fdo2.bEz() != 9236) {
            lfn.b(5, "SFSkinningFO", "doFunction() Invalid message provided: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        this.dtN = (fdm)fdo2;
        boolean bl2 = this.hP(fdo2.akX);
        if (!bl2) {
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        this.dtO.gy(true);
        this.dtP = ctf.a(this.dtO.aUj(), this.dtN.iJY, this.dtN.iJZ, this.dtN.iKa);
        if (this.dtP == null || this.dtP.length == 0) {
            if (fdo2.bOs()) {
                this.a(fdo2, false);
            }
            this.Vc();
            return;
        }
        this.a(this.dtP, bqy.dGL);
        jts.a(bqy.dGL, this.dtP, this.dtO.aAG().azb(), this.MessageDelegator, this.GUID);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 9219: {
                this.b((fcs)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private boolean hP(ldv ldv2) {
        amf amf2 = this.MessageDelegator.d(ldv2);
        if (amf2 == null) {
            lfn.b(5, "SFSkinningFO", "checkCanBeSkinned() Could not find object " + ldv2);
            return false;
        }
        if (!(amf2 instanceof cnh)) {
            lfn.b(5, "SFSkinningFO", "checkCanBeSkinned() Object " + ldv2 + " is not a SFStorageObjectCorpse: " + amf2.getClass().getName());
            return false;
        }
        this.dtO = (cnh)((Object)amf2);
        if (this.dtO.aUk()) {
            if (this.dtN.aYF != null) {
                this.e(this.dtN.aYF, mcs.uzJ.bD(new Object[0]));
            }
            return false;
        }
        ctq ctq2 = lea.eoJ().get(this.dtO.aUj());
        if (ctq2 == null) {
            lfn.b(5, "SFSkinningFO", "checkCanBeSkinned() No monsterinventoryinfo found for resource '" + ResourceTree.getName(this.dtO.aUj()) + "'");
            return false;
        }
        return true;
    }

    private void b(fcs fcs2) {
        if (fcs2.iJq) {
            if (this.dtN.aYF != null && this.dtP != null && this.dtP.length > 0) {
                ldv ldv2 = lcr.abW((int)this.dtN.aYF.enw());
                ftf ftf2 = (ftf)this.MessageDelegator.h(30216, this.getGUID(), ldv2);
                ftf2.ResourceType = this.dtO.aUj();
                ftf2.iVG = this.dtP;
                this.MessageDelegator.F(ftf2);
            }
        } else {
            lfn.b(5, "SFSkinningFO", "handleFunctionCompletionResult() Equipment could not be created.");
        }
        if (this.dtN.bOs()) {
            this.a(this.dtN, fcs2.iJq);
        }
        this.Vc();
    }

    private void a(cte[] cteArray, bqy bqy2) {
        assert (this.dtN != null);
        assert (cteArray != null);
        assert (cteArray.length > 0);
        fcy fcy2 = (fcy)this.MessageDelegator.h(9229, this.GUID, this.MessageDelegator.getGUID());
        fcy2.dul = 8;
        fcy2.bst = bkd.dqO;
        fcy2.aZG = this.dtN.aZG;
        fcy2.akX = this.dtN.aZG;
        fcy2.dtP = cteArray;
        fcy2.iyH = false;
        fcy2.iJG = true;
        fcy2.b(bqy2);
        this.MessageDelegator.F(fcy2);
    }
}

