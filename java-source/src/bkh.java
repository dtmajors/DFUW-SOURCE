/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
import java.util.Iterator;
import java.util.Map;

public class bkh
extends bke
implements bkm,
bto {
    private bkk dsG = null;
    private boolean dsH = false;
    private int Qs = 1;
    private fcq dsA = null;
    private Map<ldv, bkn> dsI = lcn.emw();
    private Map<Integer, bkn> dsJ = lcn.emw();

    public bkh() {
        this.dsy = bkd.a.drq;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            lfn.b(5, "SFAreaInfiniteEffectFO", "doFunction() FunctionMessage is null.");
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9224) {
            lfn.b(5, "SFAreaInfiniteEffectFO", "doFunction() FunctionMessage is not a SFFunctionAreaEffectMessage.");
            lfn.b(5, "SFAreaInfiniteEffectFO", "doFunction() FromGUID=" + fdo2.aO() + " Message is: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        this.dsA = (fcq)fdo2;
        this.dsG = new bkk(this);
        this.dsG.setGUID(this.MessageDelegator.bzv());
        this.dsG.setRadius(this.dsA.Radius);
        this.dsG.aR(this.dsA.Position);
        this.dsG.hK(this.dsA.dsZ);
        this.dsG.r(this.dsA.dta);
        this.dsG.ds(this.dsA.dtb);
        this.MessageDelegator.a(this.dsG);
        this.dsH = true;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.dsH) {
            return;
        }
        if (!this.dsJ.isEmpty()) {
            return;
        }
        Iterator<bkn> iterator = this.dsI.values().iterator();
        while (iterator.hasNext()) {
            bkn bkn2 = iterator.next();
            if (!bkn2.arm()) continue;
            iterator.remove();
            this.b(bkn2);
        }
        if (this.dsI.isEmpty()) {
            if (this.dsA.bOs()) {
                this.a(this.dsA, true);
            }
            this.Vc();
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 9219: {
                this.a((fcs)dxq2);
                break;
            }
            case 11034: {
                this.g((gre)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void a(fdg fdg2) {
        if (fdg2.aqs == -1) {
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleFunctionObjectDataMessage() MessageTag is invalid.");
            return;
        }
        if (fdg2.iJT == null) {
            lfn.b(5, "SFAreaDurationEffectFO", "handleFunctionObjectDataMessage() TargetPhysicalObjectGUID is null.");
            return;
        }
        if (fdg2.dsL == null) {
            lfn.b(5, "SFAreaDurationEffectFO", "handleFunctionObjectDataMessage() TargetMeshObjectGUID is null.");
            return;
        }
        if (fdg2.dtB == null || fdg2.dtB.length == 0) {
            lfn.b(5, "SFAreaDurationEffectFO", "handleFunctionObjectDataMessage() ModifierGUIDs array is null or empty.");
            return;
        }
        int n = fdg2.aqs;
        bkn bkn2 = this.dsJ.get(n);
        if (bkn2 == null) {
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleFunctionObjectDataMessage() No areatargetinfo mapped to " + n);
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleFunctionObjectDataMessage() PhysicalObjectGUID=" + fdg2.iJT + " MeshObjectGUID=" + fdg2.dsL);
            assert (false);
            this.c(fdg2.iJT, fdg2.dtB);
            return;
        }
        if (bkn2.dtl == n) {
            bkn2.dtl = 0;
            bkn2.dtm = fdg2.dtB;
        } else if (bkn2.dto == n) {
            bkn2.dto = 0;
            bkn2.dtp = fdg2.dtB;
        } else {
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleFunctionObjectDataMessage() Invalid messagetag received: " + n);
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleFunctionObjectDataMessage() " + bkn2);
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleFunctionObjectDataMessage() OneMT=" + bkn2.dtl + " TwoMT=" + bkn2.dto);
            assert (false);
            this.c(fdg2.iJT, fdg2.dtB);
            return;
        }
        if (bkn2.dtj == null) {
            bkn2.dtj = fdg2.iJT;
        }
        if (bkn2.arm() && !bkn2.dti) {
            this.dsI.remove(bkn2.Ui);
            this.b(bkn2);
        }
    }

    @Override
    protected final void a(fdp fdp2) {
        if (!this.dsH) {
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleFunctionStopMessage() AreaSensor is not active for " + this.GUID);
            return;
        }
        this.dsG.arj();
        this.dsG = null;
        this.dsH = false;
        if (this.dsJ.isEmpty() && this.dsI.isEmpty()) {
            if (this.dsA.bOs()) {
                this.a(this.dsA, true);
            }
            this.Vc();
        }
    }

    private void g(gre gre2) {
        if (gre2.iHL <= 0) {
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleSystemSendingErrorMessage() ErrorType is invalid.");
            return;
        }
        if (gre2.jqc <= 0) {
            lfn.b(5, "SFFunctionObject", "handleSystemSendingErrorMessage() FailedMessageType is invalid.");
            return;
        }
        if (gre2.jqd <= 0) {
            lfn.b(5, "SFFunctionObject", "handleSystemSendingErrorMessage() FailedMessageTag is invalid.");
            return;
        }
        if (gre2.jqe == null) {
            lfn.b(5, "SFFunctionObject", "handleSystemSendingErrorMessage() FailedFromGUID is null.");
            return;
        }
        if (gre2.jqf == null) {
            lfn.b(5, "SFFunctionObject", "handleSystemSendingErrorMessage() FailedToGUID is null.");
            return;
        }
        if (gre2.jqc != 9227) {
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleSystemSendingErrorMessage() Invalid failedmessagetype provided: " + gre2.jqc);
            return;
        }
        int n = gre2.jqd;
        bkn bkn2 = this.dsJ.remove(n);
        if (bkn2 == null) {
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleSystemSendingErrorMessage() No areatargetinfo mapped to " + n);
            assert (false);
            return;
        }
        if (bkn2.dtl == n) {
            bkn2.dtk = 0;
            bkn2.dtl = 0;
            bkn2.dtm = null;
        } else if (bkn2.dto == n) {
            bkn2.dtn = 0;
            bkn2.dto = 0;
            bkn2.dtp = null;
        } else {
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleSystemSendingErrorMessage() Invalid messagetag received: " + n);
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleSystemSendingErrorMessage() " + bkn2);
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleSystemSendingErrorMessage() OneMT=" + bkn2.dtl + " TwoMT=" + bkn2.dto);
            assert (false);
            return;
        }
    }

    private void a(fcs fcs2) {
        if (fcs2.aqs == -1) {
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleFunctionCompletionResultMessage() MessageTag is invalid.");
            return;
        }
        if (fcs2.bst <= 0) {
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleFunctionCompletionResultMessage() FunctionType is invalid.");
            return;
        }
        if (fcs2.akX == null) {
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleFunctionCompletionResultMessage() TargetObjectGUID is null.");
            return;
        }
        int n = fcs2.aqs;
        bkn bkn2 = this.dsJ.remove(n);
        if (bkn2 == null) {
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleFunctionCompletionResultMessage() No areatargetinfo mapped to " + n);
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleFunctionCompletionResultMessage() TargetObjectGUID=" + fcs2.akX);
            assert (false);
            return;
        }
        if (bkn2.dtk == n) {
            bkn2.dtk = 0;
            if (!fcs2.iJq) {
                assert (bkn2.dtl > 0);
                assert (bkn2.dtm == null);
                bkn2.dtl = 0;
            }
        } else if (bkn2.dtn == n) {
            bkn2.dtn = 0;
            if (!fcs2.iJq) {
                assert (bkn2.dto > 0);
                assert (bkn2.dtp == null);
                bkn2.dto = 0;
            }
        } else {
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleFunctionCompletionResultMessage() Invalid messagetag received: " + n);
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleFunctionCompletionResultMessage() " + bkn2);
            lfn.b(5, "SFAreaInfiniteEffectFO", "handleFunctionCompletionResultMessage() OneMT=" + bkn2.dtk + " TwoMT=" + bkn2.dtn);
            assert (false);
            return;
        }
    }

    private void a(bkn bkn2) {
        assert (bkn2 != null);
        cxd.f f2 = this.dsA.aCD();
        if (aqN.isDescendant(this.dsA.aYC, cxd.fJq)) {
            f2 = cxd.f.fQW;
        }
        bkn2.dtl = bkn2.dtk = this.Qs++;
        this.dsJ.put(bkn2.dtk, bkn2);
        fcw fcw2 = (fcw)this.MessageDelegator.h(9227, this.GUID, this.MessageDelegator.getGUID());
        fcw2.hsP = true;
        fcw2.aqs = bkn2.dtk;
        fcw2.dul |= 2;
        fcw2.dul |= 8;
        fcw2.bst = this.dsA.gbe;
        fcw2.aZG = this.dsA.aZG;
        fcw2.akX = bkn2.Ui;
        fcw2.aYF = this.dsA.aYF;
        fcw2.bsG = this.dsA.bsG;
        fcw2.aYC = this.dsA.aYC;
        fcw2.Magnitude = this.dsA.Magnitude;
        fcw2.cRI = this.dsA.cRI;
        fcw2.dun = this.dsA.dun;
        fcw2.iJz = this.dsA.iJz;
        fcw2.eKm = this.dsA.eKm;
        fcw2.aSp = this.dsA.aSp;
        fcw2.aYH = this.dsA.aYH;
        fcw2.aYG = this.dsA.aYG;
        fcw2.bsE = this.dsA.bsE;
        fcw2.bRD = this.dsA.bRD;
        fcw2.gpI = this.dsA.gpI;
        fcw2.dup = this.dsA.dup;
        fcw2.aZH = null;
        fcw2.duq = this.dsA.duq;
        fcw2.duq = this.dsA.iJy;
        fcw2.iJA = this.dsA.iJA;
        fcw2.iJB = this.dsA.iJB;
        fcw2.a(f2);
        this.MessageDelegator.F(fcw2);
    }

    private void b(bkn bkn2) {
        assert (bkn2 != null);
        assert (bkn2.arm());
        if (bkn2.dtm != null) {
            this.c(bkn2.dtj, bkn2.dtm);
        }
        if (bkn2.dtp != null) {
            this.c(bkn2.dtj, bkn2.dtp);
        }
    }

    private void c(ldv ldv2, ldv[] ldvArray) {
        assert (ldv2 != null);
        assert (ldvArray != null);
        frk frk2 = (frk)this.MessageDelegator.h(5379, this.GUID, ldv2);
        frk2.iUQ = true;
        frk2.dtB = ldvArray;
        this.MessageDelegator.F(frk2);
    }

    @Override
    public void c(bkn bkn2) {
        bkn bkn3 = this.dsI.get(bkn2.Ui);
        if (bkn3 != null) {
            if (!bkn3.dti) {
                bkn3.dti = true;
            }
            return;
        }
        this.dsI.put(bkn2.Ui, bkn2);
        this.a(bkn2);
    }

    @Override
    public void hJ(ldv ldv2) {
        bkn bkn2 = this.dsI.get(ldv2);
        if (bkn2 == null) {
            lfn.b(5, "SFAreaInfiniteEffectFO", "notifyObjectLeftArea() Could not find areatargetinfo for " + ldv2);
            return;
        }
        if (bkn2.arm()) {
            this.dsI.remove(bkn2.Ui);
            this.b(bkn2);
        } else {
            bkn2.dti = false;
        }
    }

    @Override
    public void arh() {
        if (this.dsA.bOs()) {
            this.a(this.dsA, false);
        }
        this.dsG = null;
        this.dsH = false;
        this.Vc();
    }
}

