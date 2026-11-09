/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cew
 *  cph
 *  cug
 *  cxd
 *  ep
 *  lcr
 */
import java.util.HashSet;
import java.util.Set;

public class cwd
extends cwc {
    private cew dLR = null;
    private int Qs = 1;
    private cvr fDO = null;
    private ljq fDP = null;
    private final les ResourceTree = lea.enW();
    private Set<abz> fDQ = null;

    @Override
    public cev aFh() {
        return this.dLR;
    }

    public void b(cew cew2) {
        this.dLR = cew2;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4866: {
                this.a((gan)dxq2);
                break;
            }
            case 4871: {
                this.a((gau)dxq2);
                break;
            }
            case 4873: {
                this.a((gaw)dxq2);
                break;
            }
            case 4875: {
                this.a((gay)dxq2);
                break;
            }
            case 4877: {
                this.a((gba)dxq2);
                break;
            }
            case 4879: {
                this.a((gbc)dxq2);
                break;
            }
            case 27650: {
                this.a((gaa)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void a(gaq gaq2) {
        cwa cwa2 = (cwa)this.a(cwf.b.fEH, gaq2);
        this.fDM.add(cwa2);
        this.MessageDelegator.a(cwa2);
        cwa2.receiveMessage(gaq2);
    }

    @Override
    protected void a(gam gam2) {
        if (gam2.aYH <= 0) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginBankMessage() SessionID is invalid.");
            return;
        }
        cvo cvo2 = (cvo)this.xa(gam2.aYH);
        if (cvo2 != null) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginBankMessage() A sessionhandler with sessionID=" + gam2.aYH + " already exists.");
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginBankMessage() " + cvo2);
            return;
        }
        cvo2 = (cvo)this.a(cwf.b.fEy, gam2);
        this.fDM.add(cvo2);
        this.MessageDelegator.a(cvo2);
        cvo2.receiveMessage(gam2);
    }

    @Override
    protected void a(gao gao2) {
        if (gao2.aYH <= 0) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginCraftingMessage() SessionID is invalid.");
            return;
        }
        cvt cvt2 = (cvt)this.xa(gao2.aYH);
        if (cvt2 != null) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginCraftingMessage() A sessionhandler with sessionID=" + gao2.aYH + " already exists.");
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginCraftingMessage() " + cvt2);
            return;
        }
        cvt2 = (cvt)this.a(cwf.b.fEA, gao2);
        this.fDM.add(cvt2);
        this.MessageDelegator.a(cvt2);
        cvt2.receiveMessage(gao2);
    }

    @Override
    protected void a(gap gap2) {
        if (gap2.aYH <= 0) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginEnchantingMessage() SessionID is invalid.");
            return;
        }
        cvw cvw2 = (cvw)this.xa(gap2.aYH);
        if (cvw2 != null) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginEnchantingMessage() A sessionhandler with sessionID=" + gap2.aYH + " already exists.");
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginEnchantingMessage() " + cvw2);
            return;
        }
        cvw2 = (cvw)this.a(cwf.b.fEB, gap2);
        this.fDM.add(cvw2);
        this.MessageDelegator.a(cvw2);
        cvw2.receiveMessage(gap2);
    }

    @Override
    protected void a(gat gat2) {
        if (gat2.aYH <= 0) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginStorageMessage() SessionID is invalid.");
            return;
        }
        cwi cwi2 = (cwi)this.xa(gat2.aYH);
        if (cwi2 != null) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginStorageMessage() A sessionhandler with sessionID=" + gat2.aYH + " already exists.");
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginStorageMessage() " + cwi2);
            return;
        }
        cwi2 = (cwi)this.a(cwf.b.fED, gat2);
        this.fDM.add(cwi2);
        this.MessageDelegator.a(cwi2);
        cwi2.receiveMessage(gat2);
    }

    @Override
    protected void a(gav gav2) {
        if (gav2.aYH <= 0) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginVendorMessage() SessionID is invalid.");
            return;
        }
        cwo cwo2 = (cwo)this.xa(gav2.aYH);
        if (cwo2 != null) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginVendorMessage() A sessionhandler with sessionID=" + gav2.aYH + " already exists.");
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginVendorMessage() " + cwo2);
            return;
        }
        cwo2 = (cwo)this.a(cwf.b.fEF, gav2);
        this.fDM.add(cwo2);
        this.MessageDelegator.a(cwo2);
        cwo2.receiveMessage(gav2);
    }

    private cwg a(cwf.b b2, gar gar2) {
        assert (b2 != null);
        assert (gar2 != null);
        assert (gar2.aYH > 0);
        cwg cwg2 = null;
        switch (b2) {
            case fEy: {
                cwg2 = new cvo(gar2.aYH);
                break;
            }
            case fEA: {
                cwg2 = new cvt(gar2.aYH);
                break;
            }
            case fEB: {
                cwg2 = new cvw(gar2.aYH);
                break;
            }
            case fED: {
                cwg2 = new cwi(gar2.aYH);
                break;
            }
            case fEE: {
                cwg2 = new cwl(gar2.aYH);
                ((cwl)cwg2).gZ(((gau)gar2).fEY);
                ((cwl)cwg2).Y(((gau)gar2).atc);
                ((cwl)cwg2).ru(((gau)gar2).atf);
                ((cwl)cwg2).I(((gau)gar2).fEZ);
                break;
            }
            case fEF: {
                cwg2 = new cwo(gar2.aYH);
                break;
            }
            case fEH: {
                cwg2 = new cwa(gar2.aYH);
                break;
            }
            default: {
                lfn.b(5, "SFPlayerSessionManagerClient", "createSessionHandler() Unhandled sessiontype provided: " + (Object)((Object)b2));
                return null;
            }
        }
        cwg2.setGUID(lcr.ak((ldv)gar2.aO(), (int)this.GUID.ib()));
        cwg2.a(this);
        return cwg2;
    }

    private ldv bdd() {
        return this.dLR.getServerGUID();
    }

    private void a(gau gau2) {
        if (gau2.aYH <= 0) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginTradingMessage() SessionID is invalid.");
            return;
        }
        cwl cwl2 = (cwl)this.xa(gau2.aYH);
        if (cwl2 != null) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginTradingMessage() A sessionhandler with sessionID=" + gau2.aYH + " already exists.");
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginTradingMessage() " + cwl2);
            return;
        }
        cwl2 = (cwl)this.a(cwf.b.fEE, gau2);
        this.fDM.add(cwl2);
        this.MessageDelegator.a(cwl2);
        cwl2.receiveMessage(gau2);
    }

    private void a(gbc gbc2) {
        if (gbc2.jcM) {
            cwg cwg2 = this.b(cwf.b.fEA);
            if (cwg2 == null) {
                lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionEndRequest() Could not find a crafting sessionhandler.");
                return;
            }
            cwg2.receiveMessage(gbc2);
        } else if (gbc2.jcN) {
            cwg cwg3 = this.b(cwf.b.fEB);
            if (cwg3 == null) {
                lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionEndRequest() Could not find an enchanting sessionhandler.");
                return;
            }
            cwg3.receiveMessage(gbc2);
        } else {
            lfn.b(5, "SFPlayerSessionManagerClient", "sendSessionContextEndMessage() Unknown session requested ended.");
            return;
        }
    }

    @Override
    protected final void lU(ldv ldv2) {
        assert (this.fDO != null);
        assert (ldv2 != null);
        lfn.b(5, "SFPlayerSessionManagerClient", "handleMeshObjectNotFound() MeshObject " + ldv2 + " was not found.");
        this.fDO.fAT = false;
        this.bde();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void bG(ljq ljq2) {
        if (this.fDO == null) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleMeshObjectPosition() ContextSession is null.");
            assert (false);
            return;
        }
        this.fDO.fAT = false;
        if (ljq2 == null) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleMeshObjectPosition() Position is null for meshobject " + this.fDO.Ui);
            this.bde();
            return;
        }
        if (this.fDO.fAU) {
            this.bde();
            return;
        }
        if (!this.xb(this.fDO.ResourceType)) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleMeshObjectPosition() PlayerObject has invalid objectstate.");
            this.bde();
            return;
        }
        this.h(this.fDO.ResourceType, this.fDO.dtj);
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null && hso.cxK().cxP().cyZ().kv() && !iw.cw(this.fDO.ResourceType)) {
            if (lea.enW().isDescendant(this.fDO.ResourceType, cug.fnw)) {
                hso.cxK().cxP().v(mdc.uEU.bD(new Object[0]));
            } else if (this.fDO.ResourceType == cug.fnG) {
                hso.cxK().cxP().v(mdc.uET.bD(new Object[0]));
            } else if (this.fDO.ResourceType == cug.fnS) {
                hso.cxK().cxP().v(mdc.uEY.bD(new Object[0]));
            } else {
                hso.cxK().cxP().v(mdc.uFb.bD(this.fDO.ResourceType));
            }
            this.bde();
            return;
        }
        switch (this.fDO.fAQ) {
            case fAY: {
                if (cug.wi((int)this.fDO.ResourceType)) {
                    cvq.a a2 = cvq.a.fAx;
                    this.fDO.fAQ = cvr.a.fAW;
                    this.fDO.fAR = new int[]{cvq.a.fAx.ordinal()};
                    this.H(this.fDO.fAR);
                    this.b(a2);
                    return;
                }
                if (cug.ux((int)this.fDO.ResourceType)) {
                    if (this.fDO.dtj != null && this.lo(this.fDO.dtj) && !this.ResourceTree.isDescendant(this.fDO.ResourceType, cug.fnO) && !this.ResourceTree.isDescendant(this.fDO.ResourceType, cug.fnQ)) {
                        this.fDO.fAQ = cvr.a.fAW;
                        this.fDO.fAR = new int[]{cvq.a.fAx.ordinal(), cvq.a.fAl.ordinal()};
                        this.H(this.fDO.fAR);
                    } else {
                        this.fDO = null;
                    }
                    return;
                }
                if (lea.enW().isDescendant(this.fDO.ResourceType, cug.fpp) && !cug.wf((int)this.fDO.ResourceType)) {
                    this.fDO.fAQ = cvr.a.fAW;
                    this.fDO.fAR = new int[]{cvq.a.fAM.ordinal()};
                    this.H(this.fDO.fAR);
                    return;
                }
                if (cug.vl((int)this.fDO.ResourceType)) {
                    this.fDO.fAQ = cvr.a.fAW;
                    hc hc2 = hc.getAccessLevelType(hso.cxK().cxP().cyZ().cAv());
                    this.fDO.fAR = hc2 != null && hc2.li() && cug.vl((int)this.fDO.ResourceType) ? new int[]{cvq.a.fAx.ordinal(), cvq.a.fAm.ordinal()} : new int[]{cvq.a.fAx.ordinal()};
                    this.H(this.fDO.fAR);
                    return;
                }
                if (lea.enW().isDescendant(this.fDO.ResourceType, cug.fia)) {
                    ff ff2;
                    amf amf2 = this.MessageDelegator.bzx().bzt().d(this.fDO.dtj);
                    if (amf2 != null && amf2 instanceof cbx && (ff2 = ((cbx)amf2).aIj().aq(12720)) != null && dpk.iU(ff2.getStringValue())) {
                        hso.cxK().cxP().c(mdd.uFw.bD(ff2.getStringValue()), true);
                        this.bde();
                        return;
                    }
                    this.fDO.fAQ = cvr.a.fAW;
                    this.fDO.fAR = new int[]{cvq.a.fAy.ordinal()};
                    this.H(this.fDO.fAR);
                    return;
                }
                if (lea.enW().isDescendant(this.fDO.ResourceType, cug.fjJ)) {
                    this.fDO.fAQ = cvr.a.fAW;
                    this.fDO.fAR = new int[]{cvq.a.fAB.ordinal()};
                    this.H(this.fDO.fAR);
                    return;
                }
                if (this.fDO.ResourceType == cug.fgF || this.fDO.ResourceType == cug.fgI) {
                    this.fDO.fAQ = cvr.a.fAW;
                    this.fDO.fAR = new int[]{cvq.a.fAC.ordinal()};
                    this.H(this.fDO.fAR);
                    return;
                }
                if (this.fDO.ResourceType == cug.fgB) {
                    int[] nArray;
                    boolean bl = this.aFh() != null && this.aFh().aJF() != null && this.aFh().aJF().avx() != null && this.aFh().aJF().avx().auX();
                    int n = bl ? this.aFh().aJF().avx().az() : -1;
                    this.fDO.fAQ = cvr.a.fAW;
                    if (bl) {
                        int[] nArray2 = new int[2];
                        nArray2[0] = cvq.a.fAz.ordinal();
                        nArray = nArray2;
                        nArray2[1] = cvq.a.fAA.ordinal();
                    } else {
                        int[] nArray3 = new int[1];
                        nArray = nArray3;
                        nArray3[0] = cvq.a.fAz.ordinal();
                    }
                    this.fDO.fAR = nArray;
                    this.H(this.fDO.fAR);
                    return;
                }
                if (lea.enW().isDescendant(this.fDO.ResourceType, cug.fqz)) {
                    cvq.a a3 = cvq.a.fAx;
                    this.fDO.fAQ = cvr.a.fAW;
                    this.fDO.fAR = new int[]{cvq.a.fAx.ordinal()};
                    this.H(this.fDO.fAR);
                    this.b(a3);
                    return;
                }
                this.fDO.fAQ = cvr.a.fAX;
                gax gax2 = (gax)this.MessageDelegator.h(4874, this.GUID, this.bdd());
                gax2.aqs = this.fDO.aqs;
                gax2.Ui = this.fDO.Ui;
                gax2.dtj = this.fDO.dtj;
                gax2.ResourceType = this.fDO.ResourceType;
                this.MessageDelegator.F(gax2);
                break;
            }
            case fAZ: {
                Object object;
                cvq.a a4 = cvq.a.getContextCommandType(this.fDO.fAV.jcL);
                if (a4 == null) {
                    lfn.b(5, "SFPlayerSessionManagerClient", "handleMeshObjectPosition() Invalid contextcommandtype provided: " + this.fDO.fAV.jcL);
                    this.bde();
                    return;
                }
                this.b(a4);
                if (!this.bdb().isEmpty()) {
                    for (cwg object22 : this.bdb()) {
                        switch (object22.fEJ) {
                            case fEA: {
                                if (hso.cxK().cxP() == null || hso.cxK().cxP().cyJ() == null || hso.cxK().cxP().cyJ().cHQ() == null) break;
                                hso.cxK().cxP().cyJ().cHQ().cQP();
                                break;
                            }
                        }
                    }
                }
                if (a4 == cvq.a.fAl && cug.ux((int)this.fDO.ResourceType)) {
                    if (lea.enW().isDescendant(this.fDO.ResourceType, cug.fnI)) {
                        object = (fzz)this.MessageDelegator.h(27649, this.GUID, this.fDO.dtj);
                        this.MessageDelegator.F((dxq)object);
                        this.fDP = ljq2;
                        return;
                    }
                    object = (gjt)this.MessageDelegator.h(4617, this.GUID, this.GUID);
                    ((gjt)object).SkillType = cxd.fJI;
                    ((gjt)object).aZF = 12;
                    ((gjt)object).akX = this.fDO.dtj;
                    ((gjt)object).dsL = this.fDO.Ui;
                    ((gjt)object).dhr = this.fDO.ResourceType;
                    ((gjt)object).aZD = ljq2;
                    this.dLR.receiveMessage((dxq)object);
                } else if (a4 == cvq.a.fAM) {
                    object = (gjt)this.MessageDelegator.h(4617, this.GUID, this.GUID);
                    ((gjt)object).SkillType = cxd.fLt;
                    ((gjt)object).aZF = 12;
                    ((gjt)object).akX = this.fDO.dtj;
                    ((gjt)object).dsL = this.fDO.Ui;
                    ((gjt)object).dhr = this.fDO.ResourceType;
                    ((gjt)object).aZD = ljq2;
                    this.dLR.receiveMessage((dxq)object);
                } else if (a4 == cvq.a.fAx && (lea.enW().isDescendant(this.fDO.ResourceType, cug.fkP) || lea.enW().isDescendant(this.fDO.ResourceType, cug.fpr))) {
                    if (lea.enW().isDescendant(this.fDO.ResourceType, cug.fpr)) {
                        object = (gjt)this.MessageDelegator.h(4617, this.GUID, this.GUID);
                        ((gjt)object).aZF = 12;
                        ((gjt)object).akX = this.fDO.dtj;
                        ((gjt)object).dsL = this.fDO.Ui;
                        ((gjt)object).dhr = this.fDO.ResourceType;
                        ((gjt)object).aZD = ljq2;
                        ((gjt)object).SkillType = cxd.fHm;
                        this.dLR.receiveMessage((dxq)object);
                    } else if (lea.enW().isDescendant(this.fDO.ResourceType, cug.fro)) {
                        object = (gjt)this.MessageDelegator.h(4617, this.GUID, this.GUID);
                        ((gjt)object).aZF = 12;
                        ((gjt)object).akX = this.fDO.dtj;
                        ((gjt)object).dsL = this.fDO.Ui;
                        ((gjt)object).dhr = this.fDO.ResourceType;
                        ((gjt)object).aZD = ljq2;
                        ((gjt)object).SkillType = cxd.fHm;
                        this.dLR.receiveMessage((dxq)object);
                    } else if (lea.enW().isDescendant(this.fDO.ResourceType, cug.fkP)) {
                        object = (ffi)this.MessageDelegator.h(2580, this.GUID, lcr.acL);
                        ((ffi)object).iKX = this.fDO.ResourceType;
                        ((ffi)object).fBd = this.fDO.Ui;
                        ((ffi)object).fBe = this.fDO.dtj;
                        ((ffi)object).bpJ = ljq2.esF();
                        this.MessageDelegator.F((dxq)object);
                    }
                } else if (a4 == cvq.a.fAx || a4 == cvq.a.fAy || a4 == cvq.a.fAz || a4 == cvq.a.fAA || a4 == cvq.a.fAC || a4 == cvq.a.fAB) {
                    object = (gjt)this.MessageDelegator.h(4617, this.GUID, this.GUID);
                    ((gjt)object).aZF = 12;
                    ((gjt)object).akX = this.fDO.dtj;
                    ((gjt)object).dsL = this.fDO.Ui;
                    ((gjt)object).dhr = this.fDO.ResourceType;
                    ((gjt)object).aZD = ljq2;
                    switch (a4) {
                        case fAC: 
                        case fAx: 
                        case fAB: {
                            ((gjt)object).SkillType = cxd.fHm;
                            break;
                        }
                        case fAz: {
                            ((gjt)object).SkillType = cxd.fJA;
                            break;
                        }
                        case fAA: {
                            ((gjt)object).SkillType = cxd.fHR;
                            break;
                        }
                        case fAy: {
                            ((gjt)object).SkillType = cxd.fHm;
                            if (hso.cxK().cxP() == null || hso.cxK().cxP().cyI() == null || !hso.cxK().cxP().cyI().dIa()) break;
                            hso.cxK().cxP().cyI().close();
                        }
                    }
                    this.dLR.receiveMessage((dxq)object);
                    gjv n = (gjv)this.MessageDelegator.h(4618, this.GUID, this.GUID);
                    n.SkillType = ((gjt)object).SkillType;
                    this.dLR.receiveMessage((dxq)n);
                } else if (a4 == cvq.a.fAx && lea.enW().isDescendant(this.fDO.ResourceType, cug.fqz)) {
                    object = (gjt)this.MessageDelegator.h(4617, this.GUID, this.GUID);
                    ((gjt)object).aZF = 12;
                    ((gjt)object).akX = this.fDO.dtj;
                    ((gjt)object).dsL = this.fDO.Ui;
                    ((gjt)object).dhr = this.fDO.ResourceType;
                    ((gjt)object).aZD = ljq2;
                    ((gjt)object).SkillType = cxd.fHm;
                    this.dLR.receiveMessage((dxq)object);
                    gjv gjv2 = (gjv)this.MessageDelegator.h(4618, this.GUID, this.GUID);
                    gjv2.SkillType = ((gjt)object).SkillType;
                    this.dLR.receiveMessage((dxq)gjv2);
                } else if (a4 == cvq.a.fAm) {
                    object = hc.getAccessLevelType(hso.cxK().cxP().cyZ().cAv());
                    if (object != null && ((hc)((Object)object)).li() && cug.vl((int)this.fDO.ResourceType)) {
                        int n = lcr.abO((int)this.fDO.dtj.enw());
                        ldv ldv2 = lcr.O((int)n, (ldv)this.fDO.dtj);
                        ewq ewq2 = (ewq)this.MessageDelegator.h(29699, this.GUID, lcr.qCF);
                        ewq2.akV = kd.a.anF.name().toLowerCase();
                        ewq2.akW = new mhk[]{new mhr(ep.aM((int)352)), new mhr("-1")};
                        ewq2.akX = ldv2;
                        this.MessageDelegator.F(ewq2);
                    }
                } else {
                    void var4_21;
                    object = this.fDO.fAV;
                    ((dxq)object).f(this.GUID);
                    ((dxq)object).on(this.bdd());
                    ((gaw)object).Ui = this.fDO.Ui;
                    ((gaw)object).dtj = this.fDO.dtj;
                    ((gaw)object).ResourceType = this.fDO.ResourceType;
                    ((gaw)object).Position = ljq2;
                    Object var4_16 = null;
                    switch (a4) {
                        case fAb: {
                            bqm.b b2 = bqm.b.dEo;
                            break;
                        }
                        case fzX: {
                            bqm.b b3 = bqm.b.dEp;
                            break;
                        }
                        case fzY: {
                            bqm.b b4 = bqm.b.dER;
                            break;
                        }
                        case fzZ: {
                            bqm.b b5 = bqm.b.dES;
                        }
                    }
                    if (var4_21 != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyJ() != null && hso.cxK().cxP().cyJ().a((gaw)object, (bqm.b)var4_21)) {
                        this.bde();
                        return;
                    }
                    this.MessageDelegator.F((dxq)object);
                }
                this.bde();
                break;
            }
            default: {
                lfn.b(5, "SFPlayerSessionManagerClient", "handleMeshObjectPosition() Unhandled state of contextsession found: " + (Object)((Object)this.fDO.fAQ));
                assert (false);
                return;
            }
        }
    }

    private boolean lo(ldv ldv2) {
        amf amf2 = this.MessageDelegator.bzx().bzt().d(ldv2);
        if (amf2 == null) {
            lfn.b(5, "SFPlayerSessionManagerClient", "canBeUnspawned() Could not find object " + ldv2);
            return true;
        }
        if (!(amf2 instanceof cph)) {
            return false;
        }
        cph cph2 = (cph)amf2;
        return cph2.aXW();
    }

    private void bde() {
        if (this.fDO == null) {
            lfn.b(5, "SFPlayerSessionManagerClient", "endContextSession() ContextSession is null.");
            return;
        }
        this.bdf();
        if (this.fDO.fAT) {
            lfn.b(5, "SFPlayerSessionManagerClient", "endContextSession() Ending contextsession while awaiting meshobject position.");
            lfn.b(5, "SFPlayerSessionManagerClient", "endContextSession() " + this.fDO);
        }
        this.fDO = null;
    }

    private void a(gan gan2) {
        if (gan2.Ui == null) {
            lfn.b(5, "SFPlayerSessionManagerServer", "handleSessionBeginContextMessage() MeshObjectGUID is null.");
            return;
        }
        if (gan2.ResourceType <= 0) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginContextMessage() ResourceType is invalid.");
            return;
        }
        if (this.fDO != null) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginContextMessage() A contextsession already exists.");
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginContextMessage() " + this.fDO);
            return;
        }
        if (!this.dLR.aJD().aEP().isAlive()) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionBeginContextMessage() PlayerObject is not alive.");
            return;
        }
        this.fDO = new cvr();
        this.fDO.fAQ = cvr.a.fAY;
        this.fDO.Ui = gan2.Ui;
        this.fDO.dtj = gan2.dtj;
        this.fDO.ResourceType = gan2.ResourceType;
        this.fDO.aqs = this.Qs++;
        this.fDO.fAT = true;
        if (this.fDO.dtj != null && this.fDO.dtj.equals(lcr.qAC)) {
            this.lW(this.fDO.Ui);
        } else {
            this.lV(this.fDO.Ui);
        }
    }

    private void a(gaw gaw2) {
        if (this.fDO == null) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionContextCommandMessage() No context session is created.");
            return;
        }
        if (gaw2.jcL < 0) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionContextCommandMessage() ContextCommandType is invalid.");
            return;
        }
        if (gaw2.jcL >= cvq.a.values().length) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionContextCommandMessage() ContextCommandType is invalid.");
            return;
        }
        if (this.fDO == null) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionContextCommandMessage() No contextsession exists.");
            return;
        }
        if (this.fDO.fAT) {
            return;
        }
        assert (this.fDO.fAR != null);
        assert (!this.fDO.fAT);
        this.fDO.fAQ = cvr.a.fAZ;
        this.fDO.fAV = gaw2;
        this.fDO.fAT = true;
        if (this.fDO.dtj != null && this.fDO.dtj.equals(lcr.qAC)) {
            this.lW(this.fDO.Ui);
        } else {
            this.lV(this.fDO.Ui);
        }
    }

    private void a(gay gay2) {
        if (this.fDO == null) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionContextCommandsResponse() No contextsession exists.");
            return;
        }
        if (this.fDO.aqs != gay2.aqs) {
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionContextCommandsResponse() ContextSession.MessageTag=" + this.fDO.aqs);
            lfn.b(5, "SFPlayerSessionManagerClient", "handleSessionContextCommandsResponse() Message.MessageTag=" + gay2.aqs);
            return;
        }
        assert (this.fDO.fAQ == cvr.a.fAX);
        this.fDO.fAQ = cvr.a.fAW;
        if (gay2.fAR == null || gay2.fAR.length == 0) {
            this.bde();
            return;
        }
        if (gay2.fAR.length == 1) {
            cvq.a a2 = cvq.a.getContextCommandType(gay2.fAR[0]);
            switch (a2) {
                case fAk: {
                    if (hso.cxK() != null && hso.cxK().cxP() != null) {
                        hso.cxK().cxP().v(may.ugO.bD(new Object[0]));
                    }
                    this.bde();
                    return;
                }
                case fAj: {
                    if (hso.cxK() != null && hso.cxK().cxP() != null) {
                        hso.cxK().cxP().v(mat.uez.bD(new Object[0]));
                    }
                    this.bde();
                    return;
                }
                case fAK: {
                    if (hso.cxK() != null && hso.cxK().cxP() != null) {
                        hso.cxK().cxP().v(may.uga.bD(new Object[0]));
                    }
                    this.bde();
                    return;
                }
                case fAJ: {
                    if (hso.cxK() != null && hso.cxK().cxP() != null) {
                        hso.cxK().cxP().v(may.ufZ.bD(new Object[0]));
                    }
                    this.bde();
                    return;
                }
                case fAL: {
                    if (hso.cxK() != null && hso.cxK().cxP() != null) {
                        hso.cxK().cxP().v(may.ufY.bD(new Object[0]));
                    }
                    this.bde();
                    return;
                }
                case fAH: {
                    if (hso.cxK() != null && hso.cxK().cxP() != null) {
                        hso.cxK().cxP().v(may.ugb.bD(new Object[0]));
                    }
                    this.bde();
                    return;
                }
                case fAI: {
                    if (hso.cxK() != null && hso.cxK().cxP() != null) {
                        hso.cxK().cxP().v(may.ugc.bD(new Object[0]));
                    }
                    this.bde();
                    return;
                }
            }
        }
        this.fDO.fAR = gay2.fAR;
        this.H(this.fDO.fAR);
    }

    private void a(gba gba2) {
        if (this.fDO != null && this.fDO.fAT) {
            this.fDO.fAU = true;
            return;
        }
        this.bde();
    }

    private void bdf() {
        gaz gaz2 = (gaz)this.MessageDelegator.h(4876, this.GUID, lcr.acL);
        this.MessageDelegator.F(gaz2);
    }

    private void H(int[] nArray) {
        assert (nArray != null);
        assert (nArray.length > 0);
        if (nArray.length == 1) {
            boolean bl = false;
            cvq.a a2 = cvq.a.getContextCommandType(nArray[0]);
            switch (a2) {
                case fAz: 
                case fAi: {
                    bl = true;
                    break;
                }
                default: {
                    bl = false;
                }
            }
            if (!bl) {
                gaw gaw2 = (gaw)this.MessageDelegator.h(4873, this.GUID, this.GUID);
                gaw2.jcL = nArray[0];
                this.receiveMessage(gaw2);
                return;
            }
        }
        hcn[] hcnArray = new hcn[nArray.length];
        int n = hcnArray.length;
        for (int i = 0; i < n; ++i) {
            cvq.a a3 = cvq.a.getContextCommandType(nArray[i]);
            hcnArray[i] = new hcn(a3.ordinal(), a3.bcD().bD(new Object[0]), false);
        }
        this.fDO.fAS = true;
        ffr ffr2 = (ffr)this.MessageDelegator.h(2567, this.GUID, lcr.acL);
        ffr2.a(hcnArray);
        ffr2.dtj = this.fDO.dtj;
        this.MessageDelegator.F(ffr2);
    }

    private void a(gaa gaa2) {
        Object object;
        int n = cug.uI((int)gaa2.bSS());
        if (lea.enW().isDescendant(n, cug.fno) && this.aFh() instanceof cew && ((cew)this.aFh()).aMu() != null && (object = ((cew)this.aFh()).aMu().oB()) != null && !lea.b((ljq)object, lea.enW().getName(n))) {
            hso.cxK().cxP().v(lzz.tZt.bD(lea.enW().getName(n).replace("r_Figurine ", "r_")));
            this.fDP = null;
            this.bde();
            return;
        }
        object = (gjt)this.MessageDelegator.h(4617, this.GUID, this.GUID);
        ((gjt)object).SkillType = cxd.fJI;
        ((gjt)object).aZF = 12;
        ((gjt)object).akX = gaa2.bST();
        ((gjt)object).dsL = gaa2.bSU();
        ((gjt)object).dhr = gaa2.bSS();
        ((gjt)object).aZD = this.fDP;
        this.dLR.receiveMessage((dxq)object);
        this.fDP = null;
        this.bde();
    }

    private int bdg() {
        int n = 0;
        int n2 = this.fDM.size();
        for (int i = 0; i < n2; ++i) {
            if (!(this.fDM.get(i) instanceof cwl)) continue;
            ++n;
        }
        return n;
    }

    public boolean bdh() {
        return this.bdg() > 0;
    }

    public boolean bdi() {
        return this.fDO != null;
    }

    private void b(cvq.a a2) {
        int n;
        int n2;
        if (hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null && (n2 = hso.cxK().cxP().cyZ().czY()) != -1) {
            return;
        }
        if (this.fDO.ResourceType == cug.fwz || this.fDO.ResourceType == cug.fwy || cug.vq((int)this.fDO.ResourceType)) {
            return;
        }
        if (a2 == cvq.a.fAx) {
            int[] nArray = new int[]{cug.fkP, cug.fkV, cug.fps};
            for (n = 0; n < nArray.length; ++n) {
                if (!lea.enW().isDescendant(this.fDO.ResourceType, nArray[n])) continue;
                hso.cxK().a(jnz.nFI);
                return;
            }
            if (cug.we((int)this.fDO.ResourceType)) {
                hso.cxK().a(jnz.nFI);
                return;
            }
        }
        cvq.a[] aArray = new cvq.a[]{cvq.a.fAb, cvq.a.fAa, cvq.a.fzX, cvq.a.fzY, cvq.a.fzZ, cvq.a.fAy, cvq.a.fAC};
        for (n = 0; n < aArray.length; ++n) {
            if (a2 != aArray[n]) continue;
            hso.cxK().a(jnz.nFI);
            return;
        }
    }

    public void a(abz abz2) {
        if (abz2 == null) {
            return;
        }
        if (this.fDQ == null) {
            this.fDQ = lcn.emx();
        }
        this.fDQ.add(abz2);
    }

    public void b(abz abz2) {
        if (abz2 == null) {
            return;
        }
        if (this.fDQ == null) {
            return;
        }
        this.fDQ.remove(abz2);
        if (this.fDQ.isEmpty()) {
            this.fDQ = null;
        }
    }

    private void h(int n, ldv ldv2) {
        if (this.fDQ == null) {
            return;
        }
        for (abz abz2 : new HashSet<abz>(this.fDQ)) {
            abz2.h(n, ldv2);
        }
    }
}

