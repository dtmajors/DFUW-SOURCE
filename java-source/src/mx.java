/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class mx
extends my {
    private static mx aBJ;
    private fze aBK;
    private fze aBL;
    private qm aBM;
    private fze aBN;
    private qz aBO;
    private fze aBP;
    private ql aBQ;
    private fze aBR;
    private qy aBS;
    private fze aBT;
    private int aBU;
    private String aBV;
    private fze aBW;
    private int aBX;
    private String aBY;
    private fze aBZ;
    private int aCa;
    private String aCb;
    private rh aCc;
    private py<qo> aCd;
    private qc<qo> aCe;
    private py<st> aCf;
    private qc<st> aCg;
    private py<rb> aCh;
    private qc<rb> aCi;
    private py<qt> aCj;
    private qc<qt> aCk;
    private py<sv> aCl;
    private qc<sv> aCm;
    private py<rg> aCn;
    private qc<rg> aCo;
    private py<qq> aCp;
    private qc<qq> aCq;
    private py<su> aCr;
    private qc<su> aCs;
    private py<rd> aCt;
    private qc<rd> aCu;
    private static final long aCv = 1000000000000000L;
    private long aCw;
    private boolean UK = false;

    public mx() {
        this.setGUID(lcr.qAV);
        this.aCw = lcw.enb() ? 0L : -1L;
        aBJ = this;
    }

    public static long si() {
        return aBJ.sj();
    }

    public static long a(int n, long l2) {
        return (long)n * 1000000000000000L + l2;
    }

    private long sj() {
        if (this.aCw < 0L) {
            lfn.b(5, "SFGLPersistenceManager", "allocateItemId: NextAvailableItemId not initialized");
            assert (false);
            return 0L;
        }
        return mx.a(this.getGUID().ib(), this.aCw++);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aCc = this.f(new rh(this));
        this.aCe = new qc<qo>(this){
            final /* synthetic */ mx aCx;
            {
                this.aCx = mx2;
            }

            public void a(qo qo2, fze fze2) {
                qo2.ci(fze2.oq());
            }

            public void a(qo qo2) {
                this.aCx.e(qo2);
            }

            public qo sk() {
                return this.aCx.f(new qo(this.aCx));
            }

            public /* synthetic */ void e(qe qe2) {
                this.a((qo)qe2);
            }

            public /* synthetic */ qe sl() {
                return this.sk();
            }
        };
        this.aCg = new qc<st>(this){
            final /* synthetic */ mx aCx;
            {
                this.aCx = mx2;
            }

            public st sm() {
                return this.aCx.f(new st(this.aCx));
            }

            public void a(st st2, fze fze2) {
                st2.cc(fze2.bSR());
            }

            public void a(st st2) {
                this.aCx.e(st2);
            }

            public /* synthetic */ void e(qe qe2) {
                this.a((st)qe2);
            }

            public /* synthetic */ qe sl() {
                return this.sm();
            }
        };
        this.aCi = new qc<rb>(this){
            final /* synthetic */ mx aCx;
            {
                this.aCx = mx2;
            }

            public rb sn() {
                return this.aCx.f(new rb(this.aCx));
            }

            public void a(rb rb2, fze fze2) {
                rb2.ci(fze2.oq());
            }

            public void a(rb rb2) {
                this.aCx.e(rb2);
            }

            public /* synthetic */ void e(qe qe2) {
                this.a((rb)qe2);
            }

            public /* synthetic */ qe sl() {
                return this.sn();
            }
        };
        this.aCk = new qc<qt>(this){
            final /* synthetic */ mx aCx;
            {
                this.aCx = mx2;
            }

            public void a(qt qt2, fze fze2) {
                qt2.cl(fze2.oq());
            }

            public void a(qt qt2) {
                this.aCx.e(qt2);
            }

            public qt so() {
                return this.aCx.f(new qt(this.aCx));
            }

            public /* synthetic */ void e(qe qe2) {
                this.a((qt)qe2);
            }

            public /* synthetic */ qe sl() {
                return this.so();
            }
        };
        this.aCm = new qc<sv>(this){
            final /* synthetic */ mx aCx;
            {
                this.aCx = mx2;
            }

            public sv sp() {
                return this.aCx.f(new sv(this.aCx));
            }

            public void a(sv sv2, fze fze2) {
                sv2.ce(fze2.bSR());
            }

            public void a(sv sv2) {
                this.aCx.e(sv2);
            }

            public /* synthetic */ void e(qe qe2) {
                this.a((sv)qe2);
            }

            public /* synthetic */ qe sl() {
                return this.sp();
            }
        };
        this.aCo = new qc<rg>(this){
            final /* synthetic */ mx aCx;
            {
                this.aCx = mx2;
            }

            public rg sq() {
                return this.aCx.f(new rg(this.aCx));
            }

            public void a(rg rg2, fze fze2) {
                rg2.cl(fze2.oq());
            }

            public void a(rg rg2) {
                this.aCx.e(rg2);
            }

            public /* synthetic */ void e(qe qe2) {
                this.a((rg)qe2);
            }

            public /* synthetic */ qe sl() {
                return this.sq();
            }
        };
        this.aCq = new qc<qq>(this){
            final /* synthetic */ mx aCx;
            {
                this.aCx = mx2;
            }

            public void a(qq qq2, fze fze2) {
                qq2.cj(fze2.oq());
            }

            public void a(qq qq2) {
                this.aCx.e(qq2);
            }

            public qq sr() {
                return this.aCx.f(new qq(this.aCx));
            }

            public /* synthetic */ void e(qe qe2) {
                this.a((qq)qe2);
            }

            public /* synthetic */ qe sl() {
                return this.sr();
            }
        };
        this.aCs = new qc<su>(this){
            final /* synthetic */ mx aCx;
            {
                this.aCx = mx2;
            }

            public su ss() {
                return this.aCx.f(new su(this.aCx));
            }

            public void a(su su2, fze fze2) {
                su2.cd(fze2.bSR());
            }

            public void a(su su2) {
                this.aCx.e(su2);
            }

            public /* synthetic */ void e(qe qe2) {
                this.a((su)qe2);
            }

            public /* synthetic */ qe sl() {
                return this.ss();
            }
        };
        this.aCu = new qc<rd>(this){
            final /* synthetic */ mx aCx;
            {
                this.aCx = mx2;
            }

            public rd st() {
                return this.aCx.f(new rd(this.aCx));
            }

            public void a(rd rd2, fze fze2) {
                rd2.cj(fze2.oq());
            }

            public void a(rd rd2) {
                this.aCx.e(rd2);
            }

            public /* synthetic */ void e(qe qe2) {
                this.a((rd)qe2);
            }

            public /* synthetic */ qe sl() {
                return this.st();
            }
        };
        this.aCd = new py<qo>(this.aCe, 5);
        this.aCd.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.aCd);
        this.aCf = new py<st>(this.aCg, 2);
        this.aCf.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.aCf);
        this.aCh = new py<rb>(this.aCi, 5);
        this.aCh.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.aCh);
        this.aCj = new py<qt>(this.aCk, 2);
        this.aCj.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.aCj);
        this.aCl = new py<sv>(this.aCm, 2);
        this.aCl.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.aCl);
        this.aCn = new py<rg>(this.aCo, 2);
        this.aCn.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.aCn);
        this.aCp = new py<qq>(this.aCq, 5);
        this.aCp.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.aCp);
        this.aCr = new py<su>(this.aCs, 2);
        this.aCr.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.aCr);
        this.aCt = new py<rd>(this.aCu, 5);
        this.aCt.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.aCt);
        this.aBM = this.f(new qm(this));
        this.aBO = this.f(new qz(this));
        this.aBQ = this.f(new ql(this));
        this.aBS = this.f(new qy(this));
    }

    @Override
    public void cleanUp() {
        this.e(this.aCc);
        this.e(this.aBM);
        this.e(this.aBO);
        this.e(this.aBQ);
        this.aCc = null;
        this.aBM = null;
        this.aBO = null;
        this.aBQ = null;
        this.MessageDelegator.hd(this.aCd.getGUID());
        this.MessageDelegator.hd(this.aCf.getGUID());
        this.MessageDelegator.hd(this.aCh.getGUID());
        this.MessageDelegator.hd(this.aCj.getGUID());
        this.MessageDelegator.hd(this.aCl.getGUID());
        this.MessageDelegator.hd(this.aCn.getGUID());
        super.cleanUp();
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.UK) {
            this.UK = false;
            throw new RuntimeException("requested by external command");
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7197: {
                this.g((fze)dxq2);
                break;
            }
            case 7198: {
                this.a((fzf)dxq2);
                break;
            }
            case 7170: {
                this.a((fyv)dxq2);
                break;
            }
            case 11119: {
                this.UK = true;
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2 == this.aCc) {
            if (!this.aCc.sS()) {
                this.aCw = this.aCc.tD();
            }
            fzf fzf2 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), this.aBK.aO());
            this.MessageDelegator.b(this.aBK, fzf2);
            fzf2.a(this.aBK.uk());
            fzf2.aMH = qe2.getErrorMessage();
            this.MessageDelegator.E(fzf2);
        } else if (qe2 == this.aBM) {
            if (this.aBL == null) {
                lfn.b(5, "SFGLPersistenceManager", "notifyChildCompleted: No Load All Spawnables request");
                assert (false);
                return;
            }
            fzf fzf3 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), this.aBL.aO());
            this.MessageDelegator.b(this.aBL, fzf3);
            fzf3.a(this.aBL.uk());
            fzf3.aMH = qe2.getErrorMessage();
            this.MessageDelegator.E(fzf3);
            this.aBL = null;
        } else if (qe2 == this.aBO) {
            if (this.aBN == null) {
                lfn.b(5, "SFGLPersistenceManager", "notifyChildCompleted: No Save All Spawnables request");
                assert (false);
                return;
            }
            fzf fzf4 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), this.aBN.aO());
            this.MessageDelegator.b(this.aBN, fzf4);
            fzf4.a(this.aBN.uk());
            fzf4.aMH = qe2.getErrorMessage();
            this.MessageDelegator.E(fzf4);
            this.aBN = null;
        } else if (qe2 == this.aBQ) {
            if (this.aBP == null) {
                lfn.b(5, "SFGLPersistenceManager", "notifyChildCompleted: No Load All prowess monoliths request");
                assert (false);
                return;
            }
            fzf fzf5 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), this.aBP.aO());
            this.MessageDelegator.b(this.aBP, fzf5);
            fzf5.a(this.aBP.uk());
            fzf5.aMH = qe2.getErrorMessage();
            this.MessageDelegator.E(fzf5);
            this.aBP = null;
        } else if (qe2 == this.aBS) {
            if (this.aBR == null) {
                lfn.b(5, "SFGLPersistenceManager", "notifyChildCompleted: No Save All prowess monoliths request");
                assert (false);
                return;
            }
            fzf fzf6 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), this.aBR.aO());
            this.MessageDelegator.b(this.aBR, fzf6);
            fzf6.a(this.aBR.uk());
            fzf6.aMH = qe2.getErrorMessage();
            this.MessageDelegator.E(fzf6);
            this.aBR = null;
        } else if (qe2.aMr == me.axN) {
            this.aCd.i((qo)qe2);
        } else if (qe2.aMr == me.ayr) {
            this.aCf.i((st)qe2);
        } else if (qe2.aMr == me.axO) {
            this.aCj.i((qt)qe2);
        } else if (qe2.aMr == me.ays) {
            this.aCl.i((sv)qe2);
        } else if (qe2.aMr == me.axX) {
            this.aCn.i((rg)qe2);
        } else if (qe2.aMr == me.axQ) {
            this.aCp.i((qq)qe2);
        } else if (qe2.aMr == me.ayt) {
            this.aCr.i((su)qe2);
        } else if (qe2.aMr == me.aya) {
            this.aCt.i((rd)qe2);
        } else if (qe2.aMr == me.axW) {
            this.aCh.i((rb)qe2);
        }
    }

    private void g(fze fze2) {
        switch (fze2.uk()) {
            case aJK: {
                this.m(fze2);
                break;
            }
            case aJO: 
            case aJP: {
                fze2.on(lcr.qAW);
                this.MessageDelegator.F(fze2);
                break;
            }
            case aJS: 
            case aJW: 
            case aJT: 
            case aJU: 
            case aJV: {
                fze2.on(lcr.qAX);
                this.MessageDelegator.F(fze2);
                break;
            }
            case aKc: {
                this.n(fze2);
                break;
            }
            case aKb: {
                this.aCd.u(fze2);
                break;
            }
            case aKa: {
                this.aCf.u(fze2);
                break;
            }
            case aKd: {
                this.aCh.u(fze2);
                break;
            }
            case aKh: {
                this.s(fze2);
                break;
            }
            case aKg: {
                this.aCj.u(fze2);
                break;
            }
            case aKf: {
                this.aCl.u(fze2);
                break;
            }
            case aKi: {
                this.aCn.u(fze2);
                break;
            }
            case aKk: {
                this.o(fze2);
                break;
            }
            case aKl: {
                this.p(fze2);
                break;
            }
            case aKB: {
                this.q(fze2);
                break;
            }
            case aKC: {
                this.r(fze2);
                break;
            }
            case aKx: {
                this.t(fze2);
                break;
            }
            case aKw: {
                this.aCp.u(fze2);
                break;
            }
            case aKv: {
                this.aCr.u(fze2);
                break;
            }
            case aKy: {
                this.aCt.u(fze2);
                break;
            }
            default: {
                lfn.b(5, "SFGLPersistenceManager", "handlePersistenceManagerOperationRequestMessage: Unhandled operation " + (Object)((Object)fze2.uk()));
                assert (false);
                break;
            }
        }
    }

    private void m(fze fze2) {
        this.aBK = fze2;
        this.aCc.start();
    }

    private void a(fyv fyv2) {
        ArrayList<eu> arrayList = lcn.abH(fyv2.iPs.length);
        for (ldv ldv2 : fyv2.iPs) {
            amf amf2 = this.MessageDelegator.bzx().bzt().d(ldv2);
            if (amf2 == null) {
                lfn.b(5, "SFGLPersistenceManager", "handlePersistenceManagerItemAttributeRequest(): Object with GUID " + ldv2 + " doesn't exist");
                continue;
            }
            if (!(amf2 instanceof cbx)) {
                lfn.b(5, "SFGLPersistenceManager", "handlePersistenceManagerItemAttributeRequest(): Object with GUID " + ldv2 + " is not a PhysicalObject");
                continue;
            }
            cbx cbx2 = (cbx)amf2;
            if (cbx2.getGUID() == null) {
                lfn.b(5, "SFGLPersistenceManager", "handlePersistenceManagerItemAttributeRequest(): Object " + cbx2 + " doesn't have a GUID");
                continue;
            }
            ej[] ejArray = gy.a(this.getMessageDelegator(), ldv2);
            eu eu2 = new eu();
            eu2.DR = ejArray;
            eu2.GUID = cbx2.getGUID();
            arrayList.add(eu2);
        }
        fyw fyw2 = (fyw)this.MessageDelegator.h(7171, this.getGUID(), fyv2.aO());
        fyw2.jba = arrayList.toArray(new eu[arrayList.size()]);
        fyw2.aqs = fyv2.aqs;
        this.MessageDelegator.E(fyw2);
    }

    private void n(fze fze2) {
        if (this.aBT != null) {
            lfn.b(5, "SFGLPersistenceManager", "handleOperationSaveAllCities: Already saving cities");
            fzf fzf2 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf2);
            fzf2.a(fze2.uk());
            fzf2.kP(fze2.bSR());
            fzf2.aMH = "Already saving cities";
            this.MessageDelegator.E(fzf2);
            return;
        }
        axv axv2 = (axv)this.MessageDelegator.bzx().bzt().d(lcr.qCn);
        Set<ldv> set = axv2.YM();
        if (set.isEmpty()) {
            fzf fzf3 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf3);
            fzf3.a(fze2.uk());
            fzf3.kP(fze2.bSR());
            this.MessageDelegator.E(fzf3);
            return;
        }
        this.aBT = fze2;
        this.aBU = set.size();
        this.aBV = null;
        for (ldv ldv2 : set) {
            fze fze3 = (fze)this.MessageDelegator.h(7197, this.getGUID(), this.getGUID());
            fze3.a(px.aKd);
            fze3.hC(ldv2);
            this.MessageDelegator.F(fze3);
        }
    }

    private void b(fzf fzf2) {
        if (this.aBT == null) {
            lfn.b(5, "SFGLPersistenceManager", "handleOperationSaveCityResponse: No SaveAllCitiesRequest");
            assert (false);
            return;
        }
        --this.aBU;
        if (fzf2.aMH != null && this.aBV == null) {
            this.aBV = fzf2.aMH;
        }
        if (this.aBU == 0) {
            fzf fzf3 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), this.aBT.aO());
            this.MessageDelegator.b(this.aBT, fzf3);
            fzf3.a(this.aBT.uk());
            fzf3.kP(this.aBT.bSR());
            fzf3.aMH = this.aBV;
            this.MessageDelegator.E(fzf3);
            this.aBV = null;
            this.aBT = null;
        }
    }

    private void a(fzf fzf2) {
        switch (fzf2.uk()) {
            case aKd: {
                this.b(fzf2);
                break;
            }
            case aKi: {
                this.c(fzf2);
                break;
            }
            case aKy: {
                this.d(fzf2);
                break;
            }
            default: {
                lfn.b(5, "SFGLPersistenceManager", "handlePersistenceManagerOperationResponseMessage: Unhandled operation " + (Object)((Object)fzf2.uk()));
            }
        }
    }

    private void o(fze fze2) {
        if (this.aBL != null) {
            lfn.b(5, "SFGLPersistenceManager", "handleOperationLoadAllSpawnables: Already loading spawnables");
            fzf fzf2 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf2);
            fzf2.a(fze2.uk());
            fzf2.kP(fze2.bSR());
            fzf2.aMH = "Already loading spawnables";
            this.MessageDelegator.E(fzf2);
            return;
        }
        this.aBL = fze2;
        this.aBM.start();
    }

    private void p(fze fze2) {
        if (this.aBN != null) {
            lfn.b(5, "SFGLPersistenceManager", "handleOperationSaveAllSpawnables: Already saving spawnables");
            fzf fzf2 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf2);
            fzf2.a(fze2.uk());
            fzf2.kP(fze2.bSR());
            fzf2.aMH = "Already saving spawnables";
            this.MessageDelegator.E(fzf2);
            return;
        }
        this.aBN = fze2;
        this.aBO.start();
    }

    private void q(fze fze2) {
        if (this.aBP != null) {
            lfn.b(5, "SFGLPersistenceManager", "handleOperationLoadAllProwessMonoliths: Already loading prowess monoliths");
            fzf fzf2 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf2);
            fzf2.a(fze2.uk());
            fzf2.kP(fze2.bSR());
            fzf2.aMH = "Already loading prowess monoliths";
            this.MessageDelegator.E(fzf2);
            return;
        }
        this.aBP = fze2;
        this.aBQ.start();
    }

    private void r(fze fze2) {
        if (this.aBR != null) {
            lfn.b(5, "SFGLPersistenceManager", "handleOperationSaveAllProwessMonoliths: Already saving prowess monoliths");
            fzf fzf2 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf2);
            fzf2.a(fze2.uk());
            fzf2.kP(fze2.bSR());
            fzf2.aMH = "Already saving prowess monoliths";
            this.MessageDelegator.E(fzf2);
            return;
        }
        this.aBR = fze2;
        this.aBS.start();
    }

    private void s(fze fze2) {
        if (this.aBW != null) {
            lfn.b(5, "SFGLPersistenceManager", "handleOperationSaveAllVillages: Already saving villages");
            fzf fzf2 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf2);
            fzf2.a(fze2.uk());
            fzf2.kP(fze2.bSR());
            fzf2.aMH = "Already saving villages";
            this.MessageDelegator.E(fzf2);
            return;
        }
        List<ldv> list = ((dps)this.MessageDelegator.bzx().bzt().d(lcr.qBE)).bso();
        if (list.isEmpty()) {
            fzf fzf3 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf3);
            fzf3.a(fze2.uk());
            fzf3.kP(fze2.bSR());
            this.MessageDelegator.E(fzf3);
            return;
        }
        this.aBW = fze2;
        this.aBX = list.size();
        this.aBY = null;
        for (ldv ldv2 : list) {
            fze fze3 = (fze)this.MessageDelegator.h(7197, this.getGUID(), this.getGUID());
            fze3.a(px.aKi);
            fze3.hC(ldv2);
            this.MessageDelegator.F(fze3);
        }
    }

    private void c(fzf fzf2) {
        if (this.aBW == null) {
            lfn.b(5, "SFGLPersistenceManager", "handleOperationSaveVillageResponse: No SaveAllVillagesRequest");
            assert (false);
            return;
        }
        --this.aBX;
        if (fzf2.aMH != null && this.aBY == null) {
            this.aBY = fzf2.aMH;
        }
        if (this.aBX == 0) {
            fzf fzf3 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), this.aBW.aO());
            this.MessageDelegator.b(this.aBW, fzf3);
            fzf3.a(this.aBW.uk());
            fzf3.kP(this.aBW.bSR());
            fzf3.aMH = this.aBY;
            this.MessageDelegator.E(fzf3);
            this.aBY = null;
            this.aBW = null;
        }
    }

    private void t(fze fze2) {
        if (this.aBZ != null) {
            lfn.b(5, "SFGLPersistenceManager", "handleOperationSaveAllFortresses: Already saving fortresses");
            fzf fzf2 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf2);
            fzf2.a(fze2.uk());
            fzf2.kP(fze2.bSR());
            fzf2.aMH = "Already saving fortresses";
            this.MessageDelegator.E(fzf2);
            return;
        }
        bjv bjv2 = (bjv)this.MessageDelegator.bzx().bzt().d(lcr.qBG);
        List<ldv> list = bjv2.aqF();
        if (list.isEmpty()) {
            fzf fzf3 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
            this.MessageDelegator.b(fze2, fzf3);
            fzf3.a(fze2.uk());
            fzf3.kP(fze2.bSR());
            this.MessageDelegator.E(fzf3);
            return;
        }
        this.aBZ = fze2;
        this.aCa = list.size();
        this.aCb = null;
        for (ldv ldv2 : list) {
            fze fze3 = (fze)this.MessageDelegator.h(7197, this.getGUID(), this.getGUID());
            fze3.a(px.aKy);
            fze3.hC(ldv2);
            this.MessageDelegator.F(fze3);
        }
    }

    private void d(fzf fzf2) {
        if (this.aBZ == null) {
            lfn.b(5, "SFGLPersistenceManager", "handleOperationSaveFortressResponse: No SaveAllFortressesRequest");
            assert (false);
            return;
        }
        --this.aCa;
        if (fzf2.aMH != null && this.aCb == null) {
            this.aCb = fzf2.aMH;
        }
        if (this.aCa == 0) {
            fzf fzf3 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), this.aBZ.aO());
            this.MessageDelegator.b(this.aBZ, fzf3);
            fzf3.a(this.aBZ.uk());
            fzf3.kP(this.aBZ.bSR());
            fzf3.aMH = this.aCb;
            this.MessageDelegator.E(fzf3);
            this.aCb = null;
            this.aBZ = null;
        }
    }
}

