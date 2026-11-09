/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  bri
 *  cex
 *  cug
 *  lcr
 *  lcw
 */
import java.util.List;

public class bqx
extends bqv
implements dni {
    private bri dFH = null;
    private dnk dBl = null;
    private boolean dFI = false;
    private List<flz> dFJ = null;
    private boolean dFK = false;

    @Override
    public final bqk asf() {
        return this.dFH;
    }

    public dnk atU() {
        return this.dBl;
    }

    @Override
    public final void b(bqk bqk2) {
        if (this.dFH == null) {
            assert (bqk2 != null);
            assert (bqk2 instanceof bri);
            this.dFH = (bri)bqk2;
        } else {
            assert (bqk2 == null);
            this.dFH = (bri)bqk2;
        }
    }

    public final void dW(boolean bl2) {
        this.dFI = bl2;
    }

    @Override
    public final void cleanUp() {
        super.cleanUp();
        if (this.dFH != null) {
            this.MessageDelegator.hd(this.dFH.getGUID());
        }
        this.MessageDelegator.hd(this.dBl.getGUID());
    }

    public void doTick(ldz ldz2) {
        if (this.dFJ == null || this.dFJ.isEmpty()) {
            return;
        }
        this.b(this.dFJ.remove(0));
    }

    @Override
    public final bqs iK(ldv ldv2) {
        assert (this.Initialized);
        assert (this.dFH != null);
        return this.dFH.iK(ldv2);
    }

    @Override
    public void initialize() {
        assert (this.dBP != null);
        super.initialize();
        this.MessageDelegator.a((amf)this.dFH);
        gel gel2 = (gel)this.MessageDelegator.h(776, this.GUID, this.MessageDelegator.getGUID());
        gel2.gqN = 1031;
        gel2.blo = this.GUID;
        gel2.blp = this.dFH.getGUID();
        this.MessageDelegator.F(gel2);
        this.dBl = new dnk(this);
        this.dBl.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.dBl);
        if (this.dBP instanceof cex) {
            this.dFJ = lcn.emv();
        }
    }

    @Override
    public final boolean isServerObject() {
        return true;
    }

    @Override
    protected void a(fmm fmm2) {
        if (this.dFK) {
            lfn.b(5, "SFInventoryManagerServer", "handleInventoryMessage: Inventory Message received after global lock. Possible dupe attempt? GUID=" + this.GUID.toString() + " message=" + fmm2.toString());
            kdt kdt2 = (kdt)this.MessageDelegator.i(290, this.GUID, lcr.qza);
            kdt2.e(bqy.dFQ);
            kdt2.r(0L);
            kdt2.eY(null);
            kdt2.do(1);
            kdt2.a(this.dBP);
            kdt2.a(this.asf() == null ? bqm.b.dEn : this.asf().alX());
            this.MessageDelegator.b(kdt2);
            return;
        }
        switch (fmm2.bEz()) {
            case 7960: {
                if (this.dFJ != null) {
                    this.dFJ.add((flz)fmm2);
                    break;
                }
                this.b((flz)fmm2);
                break;
            }
            case 7969: {
                this.a((fme)fmm2);
                break;
            }
            case 7985: {
                this.a((flj)fmm2);
                break;
            }
            case 7999: {
                this.a((fld)fmm2);
                break;
            }
            case 8007: {
                this.a((flh)fmm2);
                break;
            }
            case 8009: {
                this.a((flf)fmm2);
                break;
            }
            default: {
                super.a(fmm2);
            }
        }
    }

    private ldv jc(ldv ldv2) {
        assert (ldv2 != null);
        if (ldv2.ib() == this.GUID.ib()) {
            return ldv2;
        }
        return lcr.O((int)this.GUID.ib(), (ldv)ldv2);
    }

    private void a(flf flf2) {
        Object object;
        Object object2;
        ldv ldv2 = this.jc(flf2.awM());
        if ((flf2.getType() & 1) != 0) {
            object2 = new ew();
            ((ej)object2).setType(14096);
            ((ew)object2).bi(flf2.Hr());
            object = (eap)this.MessageDelegator.h(10757, this.GUID, ldv2);
            ((eap)object).bhp = object2;
            this.MessageDelegator.F((dxq)object);
        }
        if ((flf2.getType() & 2) != 0) {
            object2 = flf2.getText();
            if (((String)object2).length() > 15) {
                object2 = ((String)object2).substring(0, 15);
            }
            object = new ff();
            ((ej)object).setType(14112);
            ((ff)object).av((String)object2);
            eap eap2 = (eap)this.MessageDelegator.h(10757, this.GUID, ldv2);
            eap2.bhp = object;
            this.MessageDelegator.F(eap2);
        }
    }

    private void a(flh flh2) {
        if (flh2.iPs == null) {
            lfn.b(5, "SFInventoryManagerServer", "handleChangeGUISlotRequest: ItemGUIDs is null");
            return;
        }
        if (flh2.iPt == null) {
            lfn.b(5, "SFInventoryManagerServer", "handleChangeGUISlotRequest: GUISlots is null");
            return;
        }
        if (flh2.iPs.length != flh2.iPt.length) {
            lfn.b(5, "SFInventoryManagerServer", "handleChangeGUISlotRequest: ItemGUIDs and GUISlots length differs");
            return;
        }
        for (int i = 0; i < flh2.iPs.length; ++i) {
            ldv ldv2 = this.jc(flh2.iPs[i]);
            ew ew2 = new ew();
            ew2.setType(11280);
            ew2.bi(flh2.iPt[i]);
            eap eap2 = (eap)this.MessageDelegator.h(10757, this.GUID, ldv2);
            eap2.bhp = ew2;
            this.MessageDelegator.F(eap2);
        }
    }

    private void a(fld fld2) {
        Object object;
        if (fld2.aCK == null) {
            lfn.b(5, "SFInventoryManagerServer", "handleChangeContainerLabelNameRequest() ItemGUID is null.");
            return;
        }
        if (fld2.iPm == null) {
            lfn.b(5, "SFInventoryManagerServer", "handleChangeContainerLabelNameRequest() ContainerLabelName is null.");
            return;
        }
        if (fld2.iPm.length() > 100) {
            lfn.b(5, "SFInventoryManagerServer", "handleChangeContainerLabelNameRequest() ContainerLabelName is too long.");
            return;
        }
        fld2.aCK = this.jc(fld2.aCK);
        boolean bl2 = true;
        loz loz2 = null;
        if (!this.dFw) {
            lfn.b(5, "SFInventoryManagerServer", "handleChangeContainerLabelNameRequest() CanPerformInventoryOperations is false.");
            bl2 = false;
            loz2 = mce.usC.bD(new Object[0]);
        } else {
            object = this.dFH.iK(fld2.aCK);
            if (object == null) {
                lfn.b(5, "SFInventoryManagerServer", "handleChangeContainerLabelNameRequest() Could not find item " + fld2.aCK);
                bl2 = false;
                loz2 = mce.urX.bD(new Object[0]);
            }
        }
        if (bl2 && !(bl2 = this.gf(fld2.iPm))) {
            loz2 = mce.usC.bD(new Object[0]);
        }
        object = (fle)this.MessageDelegator.h(8000, this.GUID, fld2.aO());
        ((fle)object).iPn = bl2;
        ((fle)object).aCK = fld2.aCK;
        ((fle)object).iPm = fld2.iPm;
        if (bl2) {
            ff ff2 = new ff();
            ff2.setType(10368);
            ff2.av(fld2.iPm);
            eap eap2 = (eap)this.MessageDelegator.h(10757, this.GUID, fld2.aCK);
            eap2.bhp = ff2;
            this.MessageDelegator.F(eap2);
        } else {
            ((fle)object).s(loz2);
        }
        this.MessageDelegator.F((dxq)object);
    }

    private void a(flj flj2) {
        Object object;
        if (flj2.aCK == null) {
            lfn.b(5, "SFInventoryManagerServer", "handleChangeSlotRequest() ItemGUID is null.");
            return;
        }
        if (flj2.dJc < 0) {
            lfn.b(5, "SFInventoryManagerServer", "handleChangeSlotRequest() SlotNumber is invalid.");
            return;
        }
        flj2.aCK = this.jc(flj2.aCK);
        boolean bl2 = true;
        loz loz2 = null;
        if (!this.dFw) {
            lfn.b(5, "SFInventoryManagerServer", "handleChangeSlotRequest() CanPerformInventoryOperations is false.");
            bl2 = false;
            loz2 = mce.usC.bD(new Object[0]);
        } else if (this.avm()) {
            lfn.b(5, "SFInventoryManagerServer", "handleChangeSlotRequest() General inventory operation is blocked.");
            bl2 = false;
            loz2 = mce.usI.bD(new Object[0]);
        } else {
            object = this.dFH.iK(flj2.aCK);
            if (object == null) {
                lfn.b(5, "SFInventoryManagerServer", "handleChangeSlotRequest() Could not find item " + flj2.aCK);
                bl2 = false;
            } else if (((bqs)object).Uu()) {
                if (((bqs)object).AR() == flj2.dJc) {
                    lfn.b(5, "SFInventoryManagerServer", "handleChangeSlotRequest() Item " + flj2.aCK + " is already attached to slot " + flj2.dJc);
                    bl2 = false;
                } else if (this.avn()) {
                    lfn.b(5, "SFInventoryManagerServer", "handleChangeSlotRequest() Paperdoll inventory operation is blocked.");
                    bl2 = false;
                    loz2 = mce.usJ.bD(new Object[0]);
                } else {
                    this.dFB = this.MessageDelegator.arc().rgz;
                }
            } else if (((bqs)object).auV()) {
                if (((bqs)object).AS() == flj2.dJc) {
                    lfn.b(5, "SFInventoryManagerServer", "handleChangeSlotRequest() Item " + flj2.aCK + " is already deposited to slot " + flj2.dJc);
                    bl2 = false;
                } else if (this.avm()) {
                    lfn.b(5, "SFInventoryManagerServer", "handleChangeSlotRequest() General inventory operation is blocked.");
                    bl2 = false;
                    loz2 = mce.usI.bD(new Object[0]);
                } else {
                    this.dFA = this.MessageDelegator.arc().rgz;
                }
            }
        }
        if (bl2) {
            this.dBl.a(flj2.aO(), flj2);
        } else {
            object = (flk)this.MessageDelegator.h(7986, this.GUID, flj2.aO());
            ((flk)object).iPn = false;
            ((flk)object).aCK = flj2.aCK;
            ((flk)object).s(loz2 != null ? loz2 : mce.usK.bD(new Object[0]));
            this.MessageDelegator.F((dxq)object);
        }
    }

    private void b(flz flz2) {
        if (flz2.gLy == null) {
            lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() SourceContainerItemGUID is null.");
            return;
        }
        if (flz2.iPE == null) {
            lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() SourceItemGUID is null.");
            return;
        }
        if (flz2.iPF != null && flz2.gLz == null) {
            lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() TargetContainerItemGUID is null.");
            return;
        }
        flz2.gLy = this.jc(flz2.gLy);
        flz2.iPE = this.jc(flz2.iPE);
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        bqs bqs2 = null;
        brm brm2 = null;
        boolean bl6 = this.dBP instanceof cnf;
        boolean bl7 = flz2.iPF == null || !this.jc(flz2.iPF).equals(this.dFH.getGUID());
        boolean bl8 = true;
        loz loz2 = null;
        if (!this.dFw) {
            lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() CanPerformInventoryOperations is false.");
            bl8 = false;
            loz2 = mce.usC.bD(new Object[0]);
        } else if (this.mk(flz2.aO().ib()) && flz2.aO().ib() != this.GUID.ib()) {
            lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() The client needs a storagesession but doesn't have one.");
            bl8 = false;
            loz2 = mce.usD.bD(new Object[0]);
        } else if (bl6 && this.dFI && bl7 && !((cnf)this.dBP).ld(flz2.aO())) {
            lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() Permission check failed.");
            bl8 = false;
            loz2 = mce.urW.bD(new Object[0]);
        } else if (bl6 && this.dFI && !bl7 && !((cnf)this.dBP).le(flz2.aO())) {
            lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() Permission check failed.");
            bl8 = false;
            loz2 = mce.urW.bD(new Object[0]);
        } else if (flz2.iPF == null) {
            bl8 = this.a(flz2.iPE, null);
            if (!bl8) {
                loz2 = mce.usk.bD(new Object[0]);
            } else if (this.avl()) {
                lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() Delete inventory operation is blocked.");
                bl8 = false;
                loz2 = mce.usG.bD(new Object[0]);
            } else {
                this.dFz = this.MessageDelegator.arc().rgz;
                bl4 = true;
            }
        } else {
            int n;
            boolean bl9 = false;
            if (lcw.bcB == 2) {
                n = this.asf().alX().auH();
                bl9 = flz2.gLw && n != 0;
            }
            flz2.iPF = this.jc(flz2.iPF);
            flz2.gLz = this.jc(flz2.gLz);
            if (flz2.iPH != null) {
                flz2.iPH = this.jc(flz2.iPH);
            }
            if (flz2.iPF.equals(this.dFH.getGUID())) {
                if (flz2.gLy.equals(flz2.gLz)) {
                    if (this.dFH.aun().J(flz2.gLy, flz2.iPE)) {
                        flj flj2 = (flj)this.MessageDelegator.h(7985, this.GUID, this.GUID);
                        flj2.aCK = flz2.iPE;
                        flj2.dJc = flz2.dJc;
                        this.a(flj2);
                        return;
                    }
                    lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() SourceContainerItemGUID == TargetContainerItemGUID.");
                    bl8 = false;
                    loz2 = mce.usj.bD(new Object[0]);
                } else if (this.dFH.H(flz2.gLz, flz2.iPE)) {
                    lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() SourceItem is child of TargetContainerItem.");
                    bl8 = false;
                    loz2 = mce.urZ.bD(new Object[0]);
                } else {
                    int n2;
                    bqs2 = this.dFH.iK(flz2.iPE);
                    brm2 = this.dFH.iF(flz2.gLz);
                    if (bqs2 == null) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() SourceItem " + flz2.iPE + " was not found.");
                        bl8 = false;
                        loz2 = mce.usl.bD(new Object[0]);
                    } else if (brm2 == null) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() TargetContainerItem " + flz2.gLz + " was not found.");
                        bl8 = false;
                        loz2 = mce.usl.bD(new Object[0]);
                    } else if (bqs2.auU() && (n = brm2.avT().getDepth()) + (n2 = bqs2.avT().aws()) > 5) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() Max depth of subtree is exceeded.");
                        lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() TargetContainerDepth=" + n + " DepthOfSubTree=" + n2);
                        bl8 = false;
                        loz2 = mce.usy.bD(new Object[0]);
                    }
                }
                if (bl8) {
                    bl5 = this.I(flz2.gLy, flz2.gLz);
                    if (bl5) {
                        if (this.avn()) {
                            lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() Paperdoll inventory operation is blocked.");
                            bl8 = false;
                            loz2 = mce.usJ.bD(new Object[0]);
                        } else {
                            this.dFB = this.MessageDelegator.arc().rgz;
                            if (this.dFu != null && bqs2 != null && cug.vV((int)bqs2.az())) {
                                if (bqs2.Uu()) {
                                    if (this.dFu.i(bqs2)) {
                                        bl3 = true;
                                    } else {
                                        lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() Item can't be detached.");
                                        bl8 = false;
                                        loz2 = mce.usH.bD(new Object[0]);
                                    }
                                } else if (brm2 instanceof brz) {
                                    if (this.dFu.h(bqs2)) {
                                        bl2 = true;
                                    } else {
                                        lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() Item can't be attached.");
                                        bl8 = false;
                                        loz2 = mce.usF.bD(new Object[0]);
                                    }
                                }
                            }
                        }
                    } else if (this.avm() && !bl9) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() General inventory operation is blocked.");
                        bl8 = false;
                        loz2 = mce.usI.bD(new Object[0]);
                    } else {
                        this.dFA = this.MessageDelegator.arc().rgz;
                    }
                }
            } else {
                bqm.b b2 = bqm.b.getInventoryType(flz2.iPG);
                bl8 = this.a(flz2.iPE, b2);
                if (!bl8) {
                    loz2 = mce.usk.bD(new Object[0]);
                } else if (this.avm() && !bl9) {
                    lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() General inventory operation is blocked.");
                    bl8 = false;
                    loz2 = mce.usI.bD(new Object[0]);
                } else {
                    this.dFA = this.MessageDelegator.arc().rgz;
                }
            }
        }
        if (bl8 && bl5 && brm2 instanceof brz) {
            loz loz3 = loz2 = lcw.aQH() ? this.ja(flz2.iPE) : this.jb(flz2.iPE);
            if (this.dBP instanceof cex) {
                cex cex2 = (cex)this.auk();
                if (lcw.aQH() && cex2.aMP() && bqs2 != null && cug.wD((int)bqs2.az())) {
                    loz2 = mce.usZ.bD(new Object[0]);
                }
            }
            if (loz2 != null) {
                bl8 = false;
            }
        }
        if (!bl8) {
            fma fma2 = (fma)this.MessageDelegator.h(7961, this.GUID, flz2.aO());
            fma2.iPn = false;
            fma2.gLy = flz2.gLy;
            fma2.iPE = flz2.iPE;
            fma2.gLz = flz2.gLz;
            fma2.aqs = flz2.aqs;
            fma2.s(loz2 != null ? loz2 : mce.usK.bD(new Object[0]));
            this.MessageDelegator.F(fma2);
            return;
        }
        if (this.dBP instanceof cnf) {
            cnf cnf2 = (cnf)this.dBP;
            ldv ldv2 = cnf2.rX(flz2.aO().ib());
            if (ldv2 == null) {
                lfn.b(5, "SFInventoryManagerServer", "handleItemMoveRequest() SessionHandlerGUID is null for nodeID " + flz2.aO().ib());
                assert (false);
                return;
            }
            flz2.Tr = lcr.tQ((ldv)ldv2);
        }
        if (bl2) {
            this.dFu.a(flz2, bqs2);
        } else if (bl3) {
            this.dFu.b(flz2, bqs2);
        } else {
            this.dBl.a(flz2.aO(), flz2);
        }
    }

    private void a(fme fme2) {
        if (fme2.gLy == null) {
            lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest() SourceContainerItemGUID is null.");
            return;
        }
        if (fme2.iPE == null) {
            lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest() SourceItemGUID is null.");
            return;
        }
        fme2.gLy = this.jc(fme2.gLy);
        fme2.iPE = this.jc(fme2.iPE);
        bqs bqs2 = (bqs)this.dFH.iF(fme2.iPE);
        boolean bl2 = true;
        loz loz2 = null;
        if (!this.dFw) {
            lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest() CanPerformInventoryOperations is false.");
            bl2 = false;
            loz2 = mce.usC.bD(new Object[0]);
        } else if (this.mk(fme2.aO().ib())) {
            lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest() The client needs a storagesession but doesn't have one.");
            bl2 = false;
            loz2 = mce.usD.bD(new Object[0]);
        } else if (this.dFI && !((cnf)this.dBP).le(fme2.aO())) {
            lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest() Permission check failed.");
            bl2 = false;
            loz2 = mce.urW.bD(new Object[0]);
        } else if (bqs2 == null) {
            lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest() SourceItem " + fme2.iPE + " was not found.");
            bl2 = false;
        } else if (!bqs2.auW()) {
            lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest() Item " + fme2.iPE + " is not stackable.");
            bl2 = false;
        } else {
            switch (fme2.ilu) {
                case 1: {
                    if (fme2.iPF == null) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(MERGE) TargetInventoryGUID is null.");
                        bl2 = false;
                    } else if (fme2.gLz == null) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(MERGE) TargetContainerItemGUID is null.");
                        bl2 = false;
                    } else if (fme2.iPQ == null) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(MERGE) TargetItemGUID is null.");
                        bl2 = false;
                    } else if (fme2.iPQ.equals(fme2.iPE)) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(MERGE) SourceItem and TargetItem are the same.");
                        bl2 = false;
                    }
                    fme2.iPF = this.jc(fme2.iPF);
                    fme2.gLz = this.jc(fme2.gLz);
                    fme2.iPQ = this.jc(fme2.iPQ);
                    break;
                }
                case 2: {
                    if (fme2.iPP <= 0) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(SPLIT) SourceItemNewQuantity is invalid.");
                        bl2 = false;
                        break;
                    }
                    if (fme2.iPP >= bqs2.vf()) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(SPLIT) SourceItemNewQuantity >= SourceItem.Quantity.");
                        bl2 = false;
                        break;
                    }
                    if (fme2.gLC <= 0) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(SPLIT) SplitQuantity is invalid.");
                        bl2 = false;
                        break;
                    }
                    if (fme2.gLC >= bqs2.vf()) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(SPLIT) SplitQuantity is invalid.");
                        bl2 = false;
                        break;
                    }
                    if (fme2.iPF == null) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(SPLIT) TargetInventoryGUID is null.");
                        bl2 = false;
                        break;
                    }
                    if (fme2.gLz == null) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(SPLIT) TargetContainerItemGUID is null.");
                        bl2 = false;
                        break;
                    }
                    fme2.iPF = this.jc(fme2.iPF);
                    fme2.gLz = this.jc(fme2.gLz);
                    if (fme2.iPR != null) {
                        fme2.iPR = this.jc(fme2.iPR);
                    }
                    if (!this.dFH.getGUID().equals(fme2.iPF)) break;
                    if (this.dFH.aun().jo(fme2.gLz) && fme2.dJc < 0) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(SPLIT) SlotNumber is not specified.");
                        bl2 = false;
                        break;
                    }
                    if (this.dFH.aun().AN().size() >= 2000) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(SPLIT) Max number of items in inventory is reached.");
                        bl2 = false;
                        loz2 = mce.usA.bD(new Object[0]);
                        break;
                    }
                    if (this.dFH.aup().jg(fme2.iPE) < 999) break;
                    lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(SPLIT) Max number of equal items in inventory is reached.");
                    bl2 = false;
                    loz2 = mce.usz.bD(new Object[0]);
                    break;
                }
                case 4: {
                    if (fme2.iPP <= 0) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(SPLIT_AND_DROP) SourceItemNewQuantity is invalid.");
                        bl2 = false;
                        break;
                    }
                    if (fme2.iPP < bqs2.vf()) break;
                    lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(SPLIT_AND_DROP) SourceItemNewQuantity >= SourceItem.Quantity.");
                    bl2 = false;
                    break;
                }
                case 8: {
                    if (fme2.iPP <= 0) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(SPLIT_AND_MERGE) SourceItemNewQuantity is invalid.");
                        bl2 = false;
                    } else if (fme2.iPP >= bqs2.vf()) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(SPLIT_AND_MERGE) SourceItemNewQuantity >= SourceItem.Quantity.");
                        bl2 = false;
                    } else if (fme2.gLC <= 0) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(SPLIT_AND_MERGE) SplitQuantity is invalid.");
                        bl2 = false;
                    } else if (fme2.gLC >= bqs2.vf()) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(SPLIT_AND_MERGE) SplitQuantity is invalid.");
                        bl2 = false;
                    } else if (fme2.iPF == null) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(SPLIT_AND_MERGE) TargetInventoryGUID is null.");
                        bl2 = false;
                    } else if (fme2.gLz == null) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(SPLIT_AND_MERGE) TargetContainerItemGUID is null.");
                        bl2 = false;
                    } else if (fme2.iPQ == null) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(SPLIT_AND_MERGE) TargetItemGUID is null.");
                        bl2 = false;
                    } else if (fme2.iPQ.equals(fme2.iPE)) {
                        lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest(SPLIT_AND_MERGE) SourceItem and TargetItem are the same.");
                        bl2 = false;
                    }
                    fme2.iPF = this.jc(fme2.iPF);
                    fme2.gLz = this.jc(fme2.gLz);
                    fme2.iPQ = this.jc(fme2.iPQ);
                    break;
                }
                default: {
                    lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest() Invalid operationtype provided: " + fme2.ilu);
                    bl2 = false;
                }
            }
        }
        switch (fme2.ilu) {
            case 1: 
            case 2: 
            case 8: {
                if (this.avm()) {
                    lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest() General inventory operation is blocked.");
                    bl2 = false;
                    loz2 = mce.usI.bD(new Object[0]);
                    break;
                }
                this.dFA = this.MessageDelegator.arc().rgz;
                break;
            }
            case 4: {
                if (this.avl()) {
                    lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest() Delete inventory operation is blocked.");
                    bl2 = false;
                    loz2 = mce.usG.bD(new Object[0]);
                    break;
                }
                this.dFz = this.MessageDelegator.arc().rgz;
                break;
            }
            default: {
                lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest() Invalid operationtype provided: " + fme2.ilu);
                bl2 = false;
            }
        }
        if (bl2) {
            if (this.dBP instanceof cnf) {
                cnf cnf2 = (cnf)this.dBP;
                ldv ldv2 = cnf2.rX(fme2.aO().ib());
                if (ldv2 == null) {
                    lfn.b(5, "SFInventoryManagerServer", "handleItemSplitAndMergeRequest() SessionHandlerGUID is null for nodeID " + fme2.aO().ib());
                    return;
                }
                fme2.Tr = lcr.tQ((ldv)ldv2);
            }
            this.dBl.a(fme2.aO(), fme2);
        } else {
            fmf fmf2 = (fmf)this.MessageDelegator.h(7970, this.GUID, fme2.aO());
            this.MessageDelegator.b(fme2, fmf2);
            fmf2.ilu = fme2.ilu;
            fmf2.iPn = false;
            fmf2.gLy = fme2.gLy;
            fmf2.iPE = fme2.iPE;
            fmf2.gLz = fme2.gLz;
            fmf2.iPQ = fme2.iPQ;
            fmf2.s(loz2 != null ? loz2 : mce.usK.bD(new Object[0]));
            this.MessageDelegator.F(fmf2);
        }
    }

    private boolean mk(int n) {
        if (this.dBP instanceof cni) {
            return ((cni)this.dBP).sc(n) == null;
        }
        return false;
    }

    public void dX(boolean bl2) {
        this.dFK = bl2;
    }
}

