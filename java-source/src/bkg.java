/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  lcr
 */
import java.util.Iterator;
import java.util.Map;

public class bkg
extends bkl {
    private fcq dsA = null;
    private boolean dsB = false;
    private Map<ldv, a> dsC = null;
    private int Qs = 1;
    private ldv dsD = null;

    public bkg() {
        this.dsy = bkd.a.drp;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            lfn.b(5, "SFAreaDurationEffectFO", "doFunction() FunctionMessage is null.");
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9224) {
            lfn.b(5, "SFAreaDurationEffectFO", "doFunction() FunctionMessage is not a SFFunctionAreaEffectMessage.");
            lfn.b(5, "SFAreaDurationEffectFO", "doFunction() FromGUID=" + fdo2.aO() + " Message is: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        this.bBt = this.MessageDelegator.arc().rgz;
        this.dsA = (fcq)fdo2;
        this.setRadius(this.dsA.Radius);
        this.aR(this.dsA.Position);
        this.hK(this.dsA.dsZ);
        this.r(this.dsA.dta);
        this.ds(this.dsA.dtb);
        if (this.dsA.eKm == -2.0) {
            this.dsB = true;
            this.aX(this.dsA.eKm);
        } else {
            if (this.dsA.eKm <= 0.0) {
                lfn.b(5, "SFAreaDurationEffectFO", "doFunction() Duration is invalid.");
                this.Vc();
                return;
            }
            this.aX(this.bBt + this.dsA.eKm);
            this.dsC = lcn.emw();
        }
        lhg lhg2 = (lhg)lea.enZ().acv(this.dsA.aYC);
        if (lhg2 != null && lhg2.erV() == cxd.g.fRc && lhg2.erW() == cxd.h.fRo) {
            this.dsD = this.dsA.dsD;
            lfn.b(5, "SFAreaDurationEffectFO", "doFunction() Skill : " + lhg2.getName() + " does not affect source player : " + this.dsD);
        }
        this.acf();
    }

    @Override
    public final void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.dsC == null || this.dsC.isEmpty()) {
            return;
        }
        assert (!this.dsB);
        Iterator<a> iterator = this.dsC.values().iterator();
        while (iterator.hasNext()) {
            a a2 = iterator.next();
            if (!(a2.dsE < this.bBt)) continue;
            bkz bkz2 = this.hL(a2.Ui);
            if (bkz2 == null) {
                iterator.remove();
                continue;
            }
            if (this.dsH) {
                if (this.dsD != null && this.dsD.equals(bkz2.Ui)) continue;
                this.b(bkz2.aqs, a2.Ui, bkz2.Position, bkz2.ResourceType);
                a2.dsE = this.bBt + this.dsA.gpI;
                continue;
            }
            iterator.remove();
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 9219: {
                this.a((fcs)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(fcs fcs2) {
        if (fcs2.bst <= 0) {
            lfn.b(5, "SFAreaDurationEffectFO", "handleFunctionCompletionResultMessage() FunctionType is invalid.");
            return;
        }
        if (fcs2.akX == null) {
            lfn.b(5, "SFAreaDurationEffectFO", "handleFunctionCompletionResultMessage() TargetObjectGUID is null.");
            return;
        }
        if (!fcs2.iJq) {
            bkz bkz2 = this.kX(fcs2.aqs);
            if (bkz2 == null) {
                lfn.b(5, "SFAreaDurationEffectFO", "handleFunctionCompletionResultMessage() No sensoredobjectinfo is mapped to messagetag " + fcs2.aqs);
                return;
            } else {
                this.hM(bkz2.Ui);
            }
            return;
        }
        if (this.dsB) {
            assert (this.dsC == null);
            bkz bkz3 = this.kX(fcs2.aqs);
            if (bkz3 == null) return;
        }
        if (!this.dsC.containsKey(fcs2.akX)) return;
        this.dsC.remove(fcs2.akX);
    }

    @Override
    protected void a(fdg fdg2) {
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
        bkz bkz2 = this.kX(fdg2.aqs);
        if (bkz2 == null) {
            lfn.b(5, "SFAreaDurationEffectFO", "handleFunctionObjectDataMessage() No sensoredobjectinfo mapped to messagetag " + fdg2.aqs);
            return;
        }
        assert (bkz2.dtD);
        assert (bkz2.dtj == null);
        bkz2.dtD = false;
        bkz2.dtj = fdg2.iJT;
        bkz2.dtB = fdg2.dtB;
        if (!bkz2.dti) {
            this.c(bkz2.dtj, bkz2.dtB);
            this.hM(bkz2.Ui);
        }
    }

    @Override
    protected final void a(fdp fdp2) {
        assert (this.dsB);
        assert (this.ark() == -2.0);
        this.dsH = false;
        if (this.Ud == null) {
            return;
        }
        this.acg();
        this.Ud = null;
        if (this.arl().isEmpty()) {
            return;
        }
        Iterator<bkz> iterator = this.arl().values().iterator();
        while (iterator.hasNext()) {
            bkz bkz2 = iterator.next();
            bkz2.dti = false;
            if (bkz2.dtD) continue;
            assert (bkz2.dtj != null);
            assert (bkz2.dtB != null);
            this.c(bkz2.dtj, bkz2.dtB);
            iterator.remove();
        }
    }

    @Override
    protected void b(int n, int n2, ldv ldv2, ldv ldv3) {
        super.b(n, n2, ldv2, ldv3);
        if (n2 != 9227) {
            lfn.b(5, "SFAreaDurationEffectFO", "handleSendingErrorMessage() Invalid failedmessagetype provided: " + n2);
            return;
        }
        assert (ldv2.equals(this.GUID));
        bkz bkz2 = this.hL(ldv3);
        if (bkz2 != null) {
            this.hM(ldv3);
        }
        if (!this.dsB && this.dsC.containsKey(ldv3)) {
            this.dsC.remove(ldv3);
        }
    }

    @Override
    protected void a(bkz bkz2) {
        assert (bkz2 != null);
        boolean bl2 = false;
        if (this.dsD != null && this.dsD.equals(bkz2.Ui)) {
            bl2 = true;
        }
        if (this.dsB) {
            bkz2.dtD = true;
            bkz2.aqs = this.Qs++;
        } else if (!bl2) {
            a a2 = this.dsC.get(bkz2.Ui);
            if (a2 != null) {
                return;
            }
            a2 = new a(this, null);
            a2.Ui = bkz2.Ui;
            a2.dsE = this.bBt + this.dsA.gpI;
            this.dsC.put(a2.Ui, a2);
        }
        if (!bl2) {
            this.b(bkz2.aqs, bkz2.Ui, bkz2.Position, bkz2.ResourceType);
        }
    }

    @Override
    protected void a(bkz bkz2, Iterator iterator) {
        assert (bkz2 != null);
        if (bkz2.dtD) {
            assert (bkz2.dtj == null);
            assert (bkz2.dtB == null);
        } else {
            if (this.dsB) {
                this.c(bkz2.dtj, bkz2.dtB);
            }
            if (iterator != null) {
                iterator.remove();
            }
        }
    }

    @Override
    protected final void arh() {
        if (this.dsA.bOs()) {
            this.a(this.dsA, false);
        }
        this.dsH = false;
    }

    private void b(int n, ldv ldv2, ljq ljq2, int n2) {
        assert (ldv2 != null);
        fcw fcw2 = (fcw)this.MessageDelegator.h(9227, this.GUID, this.MessageDelegator.getGUID());
        if (this.dsB) {
            fcw2.dul |= 2;
            fcw2.dul |= 8;
            fcw2.aqs = n;
        }
        cxd.f f2 = this.dsA.aCD();
        if (aqN.isDescendant(this.dsA.aYC, cxd.fJq) || aqN.isDescendant(this.dsA.aYC, cxd.fKG)) {
            f2 = cxd.f.fQW;
        }
        fcw2.bst = this.dsA.gbe;
        fcw2.aZG = this.dsA.aZG;
        fcw2.akX = ldv2;
        fcw2.aYF = this.dsA.aYF;
        fcw2.bsG = this.dsA.bsG;
        fcw2.aYC = this.dsA.aYC;
        fcw2.Magnitude = this.dsA.Magnitude;
        fcw2.eKm = this.dsA.eKm;
        fcw2.aSp = this.dsA.aSp;
        fcw2.dun = this.dsA.dun;
        fcw2.iJz = this.dsA.iJz;
        fcw2.bRw = this.dsA.bRw;
        fcw2.aYH = this.dsA.aYH;
        fcw2.aYG = this.dsA.aYG;
        fcw2.bsE = this.dsA.bsE;
        fcw2.bRD = this.dsA.bRD;
        fcw2.gpI = this.dsA.gpI;
        fcw2.dup = this.dsA.dup;
        fcw2.aZH = null;
        fcw2.duq = this.dsA.duq;
        fcw2.duq = this.dsA.iJy;
        fcw2.cRI = this.dsA.cRI;
        fcw2.iJA = this.dsA.iJA;
        fcw2.iJB = this.dsA.iJB;
        fcw2.a(f2);
        this.MessageDelegator.F(fcw2);
        if (lew.ak(fcw2.aSp, 1.0E-6f)) {
            return;
        }
        if (!cug.uq((int)n2)) {
            return;
        }
        if (this.dsD == null) {
            return;
        }
        bkz bkz2 = this.hL(this.dsD);
        if (bkz2 == null) {
            return;
        }
        float f3 = fcw2.aSp;
        ljq ljq3 = new ljq(ljq2);
        ljq3.et(bkz2.Position);
        if (this.dsA.bRw == 4) {
            ljq3.y = (float)((double)ljq3.y + 1.2);
        }
        ljq3.normalize();
        if (ljq3.isZero()) {
            ljq3 = new ljq(Math.random(), Math.random(), Math.random());
            ljq3.normalize();
        }
        if (f3 < 0.0f) {
            ljq3.esB();
            f3 = -f3;
        }
        gje gje2 = (gje)this.MessageDelegator.h(4622, this.GUID, lcr.qCt);
        gje2.Ui = ldv2;
        gje2.mx = ljq3;
        gje2.gen = f3;
        gje2.jiZ = this.dsA.aYF;
        this.MessageDelegator.F(gje2);
    }

    private void c(ldv ldv2, ldv[] ldvArray) {
        assert (ldv2 != null);
        assert (ldvArray != null);
        frk frk2 = (frk)this.MessageDelegator.h(5379, this.GUID, ldv2);
        frk2.iUQ = true;
        frk2.dtB = ldvArray;
        this.MessageDelegator.F(frk2);
    }
}

