/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  cug
 *  dta
 *  dtc
 *  lcr
 *  lcw
 */
import java.util.ArrayList;

public class hz
extends btk {
    public static final String aeO = "special\\tombstone_wildlife_small_01.xml";
    public static final String aeP = "special\\tombstone_wildlife_small_01.xml";
    private ldv Sy = null;
    private ldv Xe = null;
    private int aeQ = 0;
    private ljq aeR = null;
    private lgl aeS = null;
    private cqa aeT;
    private boolean aeU = true;
    public float aeV = 0.0f;
    public float aeW = 0.0f;
    private static les ResourceTree = lea.enW();

    public ldv hk() {
        return this.Sy;
    }

    public void ae(ldv ldv2) {
        this.Sy = ldv2;
    }

    public void aX(ldv ldv2) {
        this.Xe = ldv2;
    }

    public boolean mR() {
        return this.aeU;
    }

    public float mS() {
        return this.aeV;
    }

    public float mT() {
        return this.aeW;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.a(true, this.Sy, this.GUID.bFk());
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11015: {
                this.a((gqg)dxq2);
                break;
            }
            case 11030: {
                this.a((grw)dxq2);
                break;
            }
            case 11028: {
                this.a((gpb)dxq2);
                break;
            }
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            case 6161: {
                this.a((gfj)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void mU() {
        assert (this.Xe != null);
        assert (this.aeT.vM() == 4);
        et et2 = (et)this.aeT.fi().ae(10992);
        if (et2 == null || Math.random() < (double)et2.fN()) {
            gfi gfi2 = (gfi)this.MessageDelegator.h(6160, this.GUID, lcr.qBb);
            ff ff2 = (ff)this.aeT.fi().ae(1328);
            gfi2.jgh = ff2.getStringValue();
            gfi2.jgi = this.MessageDelegator.bzy().getTimeInMillis();
            this.MessageDelegator.F(gfi2);
        } else {
            this.mV();
        }
    }

    private final void a(gfj gfj2) {
        dta dta2;
        ljq ljq2 = this.aeT.aAG().av();
        cnh cnh2 = this.mX();
        cnh2.aAG().c(ljq2);
        cnh2.aAG().a(new lgl());
        cte[] cteArray = ctf.c(this.aeT.az(), 1.0f, 1.0f);
        ArrayList<cte> arrayList = lcn.emv();
        if (gfj2 != null && (dta2 = gfj2.jgj) != null && ((cto[])dta2).length != 0) {
            for (dta dta3 : dta2) {
                ctf.a((cto)dta3, arrayList);
            }
        }
        if (cteArray != null) {
            for (int j = 0; j < cteArray.length; ++j) {
                cte cte2 = cteArray[j];
                arrayList.add(cte2);
            }
        }
        cnh2.c(arrayList.toArray(new cte[arrayList.size()]));
        if (lcw.enb() && lcw.qGX) {
            dta2 = new dta();
            dta2.setActive(true);
            dta2.Ca(0);
            dtc dtc2 = ((dta)this.MessageDelegator).bzt();
            ldw ldw2 = ldx.enG().enI();
            dta2.setGUID(ldw2.bzv());
            dtc2.c(dta2);
            cnh2.setGUID(dta2.bzv());
            cnh2.aAG().setGUID(dta2.bzv());
            cnh2.aJC().asf().setGUID(dta2.bzv());
            dta2.a((amf)((Object)cnh2));
        } else {
            this.MessageDelegator.a((amf)((Object)cnh2));
        }
        this.mV();
    }

    private void mV() {
        this.MessageDelegator.hd(this.aeT.getGUID());
        this.mz();
        this.a(false, this.hk(), this.GUID.bFk());
        this.MessageDelegator.hd(this.GUID);
        grx grx2 = (grx)this.MessageDelegator.h(11031, this.GUID, lcr.qAH);
        grx2.ija = 2;
        grx2.jqt = false;
        grx2.jqu = true;
        grx2.Sy = this.hk();
        this.MessageDelegator.F(grx2);
    }

    public final void mW() {
        assert (this.aeT.vM() == 3);
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        switch (gre2.jqc) {
            case 13315: {
                break;
            }
            default: {
                super.handleSystemMessageSendingErrorMessage(gre2);
            }
        }
    }

    private cnh mX() {
        cnh cnh2 = new cnh();
        cnh2.setGUID(this.MessageDelegator.lL(lcr.qzY));
        cnh2.l(cug.fgF);
        cnh2.gx(true);
        cnh2.rY(this.aeQ);
        if (ctg.ffl) {
            cnh2.by(15.0);
        } else {
            cnh2.by(420.0);
        }
        ew ew2 = new ew();
        ew2.setType(12592);
        ew2.bi(this.aeQ);
        cnh2.fi().b(ew2);
        ff ff2 = new ff();
        ff2.setType(12608);
        ff2.av("");
        cnh2.fi().b(ff2);
        ff ff3 = new ff();
        ff3.setType(12624);
        ff3.av("");
        cnh2.fi().b(ff3);
        bvu bvu2 = (bvu)bvt.c(bve.a.dQx);
        bvu2.setGUID(this.MessageDelegator.lL(cnh2.getGUID()));
        if (ResourceTree != null && ResourceTree.isDescendant(this.aeQ, cug.fgQ)) {
            bvu2.setFileName("special\\tombstone_wildlife_small_01.xml");
        } else {
            bvu2.setFileName("special\\tombstone_wildlife_small_01.xml");
        }
        cnh2.setSpecialEffectType(del.gks);
        bvu2.eF(true);
        cnh2.d(bvu2);
        brk brk2 = new brk();
        brk2.setGUID(this.MessageDelegator.lL(cnh2.getGUID()));
        brk2.a(bqm.b.dEq);
        cnh2.aJC().setGUID(this.MessageDelegator.lL(cnh2.getGUID()));
        cnh2.aJC().b((bqk)brk2);
        cnh2.aJC().asf().setObjectType(95);
        return cnh2;
    }

    private void a(gpb gpb2) {
        grx grx2 = (grx)this.MessageDelegator.h(11031, this.GUID, lcr.qAH);
        grx2.ija = 1;
        grx2.jqt = false;
        grx2.jqu = true;
        grx2.Sy = this.Sy;
        this.MessageDelegator.F(grx2);
        this.MessageDelegator.a((amf)((Object)this.aeT));
        this.g(this.aeT.aAG().getGUID(), true);
    }

    private void a(gqg gqg2) {
        if (gqg2.Za <= 0) {
            lfn.b(5, "SFSessionObjectWildlife", "handleCreateCharacterMessage() CharacterResourceType is invalid.");
            return;
        }
        if (gqg2.bc == null) {
            lfn.b(5, "SFSessionObjectWildlife", "handleCreateCharacterMessage() CharacterName is null.");
            return;
        }
        if (gqg2.jjc == null) {
            lfn.b(5, "SFSessionObjectWildlife", "handleCreateCharacterMessage() CharacterPosition is null.");
            return;
        }
        if (gqg2.jph == null) {
            lfn.b(5, "SFSessionObjectWildlife", "handleCreateCharacterMessage() CharacterRotation is null.");
            return;
        }
        if (!gqg2.aO().equals(this.Sy)) {
            lfn.b(5, "SFSessionObjectWildlife", "handleCreateCharacterMessage() SystemOS " + this.Sy + " not " + gqg2.aO() + " can send this message.");
            return;
        }
        assert (this.aeT == null);
        this.aeQ = gqg2.Za;
        this.aeR = gqg2.jjc;
        this.aeS = gqg2.jph;
        this.aeU = gqg2.aeU;
        if (this.aeU) {
            if (gqg2.aeV > 0.0f) {
                this.aeV = gqg2.aeV;
            }
            if (gqg2.aeW > 0.0f) {
                this.aeW = gqg2.aeW;
            }
        }
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.GUID, lcr.qCq);
        gfm2.ResourceType = this.aeQ;
        gfm2.iSi = 1;
        gfm2.Yc = this.GUID;
        this.MessageDelegator.I(gfm2);
    }

    private void a(gfn gfn2) {
        assert (this.aeT == null);
        if (gfn2.dtF == null) {
            lfn.b(5, "SFSessionObjectWildlife", "handleResourceCreateResponse() Resource could not be created. MessageTag=" + gfn2.aVk());
            return;
        }
        this.aeT = (cqa)gfn2.dtF;
        cbv cbv2 = this.aeT.aIh();
        assert (cbv2.aza() != null);
        assert (bve.a(cbv2.aza()));
        assert (this.aeT.aAG() != null);
        this.aeT.a(this);
        bvr bvr2 = (bvr)this.aeT.aAG();
        bvr2.c(this.aeR);
        bvr2.a(this.aeS);
        bvr2.l(this.aeT.az());
        cbv cbv3 = this.aeT.aIh();
        cbv3.c(bvr2.av());
        cbv3.a(bvr2.aw());
        this.mY();
    }

    private void a(grw grw2) {
        if (this.aeT != null) {
            this.MessageDelegator.hd(this.aeT.getGUID());
        }
        this.MessageDelegator.hd(this.GUID);
        this.mz();
        this.a(false, this.Sy, this.GUID.bFk());
        grx grx2 = (grx)this.MessageDelegator.h(11031, this.GUID, lcr.qAH);
        grx2.ija = 2;
        grx2.jqt = false;
        grx2.jqu = true;
        grx2.Sy = this.Sy;
        this.MessageDelegator.F(grx2);
    }

    private void mz() {
        assert (this.Xe != null);
        dye dye2 = (dye)this.MessageDelegator.h(13315, this.GUID, this.Xe);
        dye2.hsP = true;
        this.MessageDelegator.F(dye2);
    }

    private void mY() {
        assert (this.Sy != null);
        assert (this.aeT != null);
        assert (this.aeT.aAG() != null);
        gpa gpa2 = (gpa)this.MessageDelegator.h(11027, this.GUID, this.Sy);
        gpa2.hsP = true;
        gpa2.ilE = 8;
        gpa2.aea = this.aeT.az();
        gpa2.jot = this.aeT.getGUID();
        gpa2.aTc = this.aeT.aAG().getGUID();
        gpa2.jou = null;
        gpa2.jov = null;
        gpa2.eFu = 0;
        this.MessageDelegator.E(gpa2);
    }

    private void a(boolean bl, ldv ldv2, ldv ldv3) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        gsk gsk2 = (gsk)this.MessageDelegator.h(11049, this.GUID, lcr.qAS);
        gsk2.ija = bl ? 4 : 5;
        gsk2.adA = ldv2;
        gsk2.Rr = ldv3;
        this.MessageDelegator.F(gsk2);
    }

    private void g(ldv ldv2, boolean bl) {
        assert (ldv2 != null);
        int[] nArray = new int[]{5, 7};
        gom gom2 = (gom)this.MessageDelegator.h(21765, this.GUID, lcr.qAJ);
        gom2.adA = this.Sy;
        gom2.Rs = ldv2;
        gom2.jof = nArray;
        gom2.ija = bl ? 1 : 2;
        this.MessageDelegator.F(gom2);
    }
}

