/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hlv
 *  lcr
 *  lcw
 *  lcy
 */
public class hbm
extends hlv {
    private boolean bC = false;
    public final hpe.c jBp = new hpe.d(hbo.jDg, hbo.jCX, hpe.a.kUQ, hpe.b.kUU, true);
    public final hpi.a jBq;
    public final hpe.c jBr;
    public final hpi.a jBs;
    public final hpi.a jBt;
    public final hpe.c jBu;
    private boolean Initialized;
    public static final int jBv = 40;
    public static final int jBw = 314;
    public static final int jBx = 36;
    public static final int fbl = lcw.qFT;
    public static final int fbm = lcw.qFU;
    public static final int jBy = 6;
    public static final int jBz = 4;
    public static final int jBA = 20;
    private int jBB;
    private int jBC;
    public static lhu jBD = new lhu(128, 64, "gui/cc_button_3p_middle.dds");
    public static lhu jBE = new lhu(128, 32, "gui/character_creator/chr_cr_button_select_middle.dds");
    public static lhu jBF = new lhu(256, 45, "gui/char_textfield_middle_back.dds");
    public static lhu jBG = new lhu(51, 45, "gui/char_textfield_cap_left.dds");
    public static lhu jBH = new lhu(51, 45, "gui/char_textfield_cap_right.dds");
    private hpv jBI;
    hbf jBJ;
    public final hpi.a jBK;
    public final hpe.c jBL;
    public final hpf.c jBM;
    public final hpf.c jBN;
    public final hqm.a jBO;
    private lgs jBP;
    private lgs jBQ;
    public final hqw.a jBR;
    public final hqw.a jBS;
    public final hqy.a jBT;
    public final hqy.a jBU;
    public final hpe.c jBV;
    public final hpe.c jBW;
    public final hpe.c jBX;
    public final hpe.c jBY;
    public final hpe.c jBZ;
    public final hpi.a jCa;
    public final hpe.c jCb;
    public final hpe.c jCc;
    public final hpe.c jCd;
    private hnu jCe;
    hbr jCf;
    hqy jCg;
    hqy jCh;
    private lgq RC;
    private final lbn jCi;
    private final hnz.d jCj;
    public static lhu jCk = new lhu(76, 41, "gui/character_creator/chr_cr_rotate_background_left.dds");
    public static lhu jCl = new lhu(292, 41, "gui/character_creator/chr_cr_rotate_background_middle.dds");
    public static lhu jCm = new lhu(73, 41, "gui/character_creator/chr_cr_rotate_background_right.dds");
    public static lcq jCn = new lcq(1.0f, 1.0f, 1.0f, 1.0f);
    public static lhu jCo = new lhu(17, 41, "gui/character_creator/chr_cr_rotate_handle.dds");
    public static lhf jCp = new lhf(320, 320);
    public final hqh.b jCq;
    public final hlt jCr;
    private final lbn jCs;
    private final lbn jCt;
    private static final hoz.a jCu = new hoz.a(lcy.qQB);

    public hbm(hbp hbp2, hsi hsi2, lbn lbn2, lhf lhf2) {
        super((hsg)hbp2, hsi2, lhf2);
        this.jBq = new hpi.a(this.jBp, this.kIn.kFj);
        this.jBr = new hpe.d(hbo.jCZ, hbo.jCX, hpe.a.kUQ, hpe.b.kUU, true);
        this.jBs = new hpi.a(this.jBp, jBD);
        this.jBt = new hpi.a(this.jBr, jBE);
        this.jBu = new hpe.d(hbo.jCY, hbo.jCX, hpe.a.kUP, hpe.b.kUU, true);
        this.jBB = 100;
        this.jBC = 32;
        this.jBJ = null;
        this.jBK = new hpi.a(this.jBp, jBF);
        this.jBL = new hpe.e(hbo.jDg, hbo.jCX, hpe.a.kUQ, hpe.b.kUS);
        lhu lhu2 = this.kIn.kFE;
        lhu lhu3 = this.kIn.kHJ;
        this.kIn.getClass();
        this.kIn.getClass();
        this.jBM = new hpf.c(hpw.kWV, this.jBu, lhu2, lhu3, 2, 2, this.kIn.kDs, this.kIn.kFH);
        lhu lhu4 = this.kIn.kFE;
        lhu lhu5 = this.kIn.kHJ;
        this.kIn.getClass();
        this.kIn.getClass();
        this.jBN = new hpf.c(hpw.kWV, this.jBu, lhu4, lhu5, 2, 2, this.kIn.kDs, this.kIn.kFH);
        this.jBO = new hqm.a(this.jHw, this.kJG, this.jBN, this.kJH, this.kIn.kHC, this.kIn.kHB);
        this.jBP = null;
        this.jBQ = null;
        this.jBR = new hqw.a(this.kJH, hbo.jDj, false);
        this.jBS = new hqw.a(this.kJH, hbo.jDi, false);
        this.kIn.getClass();
        this.kIn.getClass();
        this.kIn.getClass();
        this.kIn.getClass();
        this.jBT = new hqy.a(this.jBR, this.kIY, 8 + 22, 8, 8, 8, this.kIn.kEi);
        this.kIn.getClass();
        this.kIn.getClass();
        this.kIn.getClass();
        this.kIn.getClass();
        this.jBU = new hqy.a(this.jBS, this.kIY, 8, 8, 8 + 22, 8, this.kIn.kEi);
        this.jBV = new hpe.e(hbo.jDg, hbo.jCX, hpe.a.kUO, hpe.b.kUS);
        this.jBW = new hpe.e(hbo.jDa, hbo.jCX, hpe.a.kUQ, hpe.b.kUS);
        this.jBX = new hpe.e(hbo.jDb, hbo.jCX, hpe.a.kUO, hpe.b.kUS);
        this.jBY = new hpe.e(hbo.jDe, hbo.jCX, hpe.a.kUO, hpe.b.kUS);
        this.jBZ = new hpe.e(hbo.jDf, hbo.jCX, hpe.a.kUP, hpe.b.kUS);
        this.jCa = new hpi.a(this.jBL, this.kIn.kFj);
        this.jCb = new hpe.d(hbo.jDh, hbo.jCX, hpe.a.kUO, hpe.b.kUS, true);
        this.jCc = new hpe.e(hbo.jDe, hbo.jCX, hpe.a.kUQ, hpe.b.kUS);
        this.jCd = new hpe.e(hbo.jDf, hbo.jCX, hpe.a.kUQ, hpe.b.kUS);
        this.jCe = null;
        this.jCf = null;
        this.RC = new lgq();
        this.jCj = new hnz.d(0, 0, 0, 0, 0, 440, 0, 0, new hnz.e.a[]{new hnz.e.a(hnz.f.kQT, hbn.jCB, null, hnz.e.a.a.kQP), new hnz.e.a(hnz.f.kQU, hbn.jCT, null, hnz.e.a.a.kQP), new hnz.e.a(hnz.f.kQV, hbn.jCG, null, hnz.e.a.a.kQP), new hnz.e.a(hnz.f.kQW, hbn.jCV, null, hnz.e.a.a.kQP), new hnz.e.a(hnz.f.kQX, hbn.jCC, null, hnz.e.a.a.kQP), new hnz.e.a(hnz.f.kQY, hbn.jCS, null, hnz.e.a.a.kQP), new hnz.e.a(hnz.f.kQZ, hbn.jCF, null, hnz.e.a.a.kQP), new hnz.e.a(hnz.f.kRa, hbn.jCQ, null, hnz.e.a.a.kQP), new hnz.e.a(hnz.f.kRb, hbn.jCA, null, hnz.e.a.a.kQP), new hnz.e.a(hnz.f.kRc, hbn.jCJ, null, hnz.e.a.a.kQP), new hnz.e.a(hnz.f.kRd, hbn.jCD, null, hnz.e.a.a.kQP), new hnz.e.a(hnz.f.kRe, hbn.jCH, null, hnz.e.a.a.kQP), new hnz.e.a(hnz.f.kRf, hbn.jCz, null, hnz.e.a.a.kQP), new hnz.e.a(hnz.f.kRg, hbn.jCM, null, hnz.e.a.a.kQP), new hnz.e.a(hnz.f.kRh, hbn.jCE, null, hnz.e.a.a.kQP), new hnz.e.a(hnz.f.kRi, hbn.jCO, null, hnz.e.a.a.kQP)});
        this.jCq = new hqh.b(this.jHw, ldb.reo, jCk, jCl, jCm, jCn, jCo, jCp);
        this.jCs = new lbn(this){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ hbm jCv;
            {
                this.jCv = hbm2;
            }

            public final void W() {
                if (!$assertionsDisabled && !hbm.a(this.jCv)) {
                    throw new AssertionError();
                }
            }

            static {
                $assertionsDisabled = !hbm.class.desiredAssertionStatus();
            }
        };
        this.jCt = new lbn(this){
            static final /* synthetic */ boolean $assertionsDisabled;
            final /* synthetic */ hbm jCv;
            {
                this.jCv = hbm2;
            }

            public final void W() {
                if (!$assertionsDisabled && !hbm.a(this.jCv)) {
                    throw new AssertionError();
                }
                hbm.a(this.jCv, null);
            }

            static {
                $assertionsDisabled = !hbm.class.desiredAssertionStatus();
            }
        };
        this.jCi = lbn2;
        this.Initialized = true;
        this.jCr = new hlt(this, "desktop", false);
        this.kND.j(this.jCr);
        hbp2.ot(true);
        hbp2.ou(true);
    }

    private void LF(int n) {
        if (n == 2564) {
            this.jCh.og(true);
            this.jCg.og(true);
        }
        efx efx2 = (efx)this.jWV.cdh.rng.ik(14341);
        efx2.Ea(n);
        efx2.b(null);
        efx2.on(lcr.qEp);
        this.jWV.cdh.rnh.m(efx2);
    }

    public void lX(String string) {
        this.jCe = this.a(string, null, new hoz.a[]{jCu}, null, jCu, jCu, this.jCt);
    }

    public void a(efq efq2) {
        switch (efq2.bEz()) {
            case 14337: {
                this.cba();
                this.caZ();
                this.a(new Object[]{((egb)efq2).ipi}, 0);
                this.caY();
                break;
            }
            case 14339: {
                this.a((efv)efq2);
                break;
            }
            case 14342: {
                this.a((efy)efq2);
                break;
            }
            case 14345: {
                this.a((efu)efq2);
                break;
            }
            default: {
                assert (false) : "Invalid Message Received: " + efq2.getClass().getName();
                break;
            }
        }
    }

    private void caY() {
        this.jWV.cdh.rnh.m(fez.d(this.jWV.cdh.rng, lcr.qEp));
    }

    private void a(efu efu2) {
        this.lX(efu2.ioR);
    }

    private void a(efy efy2) {
        switch (efy2.bGA()) {
            case 1: {
                if (this.jBI == null || !(this.jBI instanceof hbt)) break;
                int n = efy2.bGz();
                ((hbt)this.jBI).a(efy2.bGD());
                break;
            }
            case 2: {
                if (this.jBI == null || !(this.jBI instanceof hbs)) break;
                ((hbs)this.jBI).ma(cg.u(efy2.bGB()));
                int n = efy2.bGB();
                if (n == 2) {
                    ((hbs)this.jBI).mY(false);
                    break;
                }
                ((hbs)this.jBI).mY(true);
                break;
            }
            case 3: {
                if (this.bC) {
                    // empty if block
                }
                this.jCi.W();
                break;
            }
            case 5: {
                this.c(new lcu(lcu.a.qEW));
                if (this.jBI != null && this.jBI instanceof hbt) {
                    ((hbt)this.jBI).mV(true);
                } else if (this.jBI != null && this.jBI instanceof hbs) {
                    ((hbs)this.jBI).mV(true);
                }
                if (this.jBJ == null) break;
                this.jBJ.mV(true);
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
    }

    private void caZ() {
        if (lcw.qGR) {
            lhf lhf2 = this.kND.cqv();
            b b2 = new b(this, 257);
            lgs lgs2 = new lgs(100, lhf2.H - 36, this.jBB, this.jBC);
            hqy hqy2 = new hqy((hnc)((Object)this), "", lgs2.aI(), lgs2.cqv(), hpx.a.kXm, this.jBU, "QuickStart");
            hqy2.cvC().a(true, b2);
            this.jCr.j(hqy2);
        }
    }

    private void cba() {
        lgg lgg2 = new lgg(0, 0);
        lhf lhf2 = this.kND.cqv();
        hnz hnz2 = new hnz((hnc)((Object)this), "LOLBORDER!", lgg2, lhf2, this.jCj);
        this.jCr.j(hnz2);
    }

    public void a(efv efv2) {
        this.cbb();
        this.cba();
        this.caZ();
        switch (efv2.bGw()) {
            case 1: {
                this.cbe();
                return;
            }
            case 2: {
                this.a(efv2.bGv(), efv2.bGx());
                return;
            }
            case 3: {
                this.bp(efv2.bGv());
                return;
            }
            case 4: {
                this.b(efv2.bGv(), efv2.bGx());
                return;
            }
            case 5: {
                this.bq(efv2.bGv());
                return;
            }
            case 9: {
                this.br(efv2.bGv());
                return;
            }
        }
        assert (false);
    }

    private void cbb() {
        int n;
        int n2 = this.jCr.crn().size();
        hms[] hmsArray = new hms[n2];
        for (n = 0; n < n2; ++n) {
            hmsArray[n] = this.jCr.crn().get(n);
        }
        for (n = 0; n < hmsArray.length; ++n) {
            hmsArray[n].remove();
        }
    }

    public void cbc() {
        a a2 = new a(this, 1051);
        int n = 441;
        int n2 = this.kND.cqv().H - 43;
        int n3 = (this.kND.cqv().rmN - n) / 2;
        if (this.kND.cqv().rmN <= 800) {
            n3 = 50;
        }
        lgg lgg2 = new lgg(n3, n2);
        hqh hqh2 = new hqh((hnc)((Object)this), null, lgg2, new lhf(441, 41), this.jCq, 0.0, 1.0, false, 0.5, 0.1f, a2);
        this.jCr.j(hqh2);
        a2.a(hqh2);
    }

    public lhf cbd() {
        return this.kND.cqv();
    }

    public hbf I(int n, boolean bl) {
        int n2 = this.kND.cqv().H - 36;
        int n3 = this.kND.cqv().rmN - 314;
        lgg lgg2 = new lgg(n3, n2);
        this.jBJ = new hbf(this, lgg2, n, bl);
        return this.jBJ;
    }

    public void a(int n, hmt hmt2, lgg lgg2, boolean bl) {
        lgg lgg3 = null;
        lgg lgg4 = null;
        if (lgg2 != null) {
            if (!bl) {
                lgg3 = this.jBP.aI().R(lgg2);
                lgg4 = this.jBQ.aI().R(lgg2);
            } else {
                lgg3 = lgg2;
                lgg4 = new lgg(lgg2.cf + 122, lgg2.cg);
            }
        } else {
            lgg3 = this.jBP.aI();
            lgg4 = this.jBQ.aI();
        }
        b b2 = new b(this, n | 4);
        hqy hqy2 = new hqy((hnc)((Object)this), "", lgg4, this.jBQ.cqv(), hpx.a.kXm, this.jBU, lcx.qQC.esy());
        hqy2.cvC().a(true, b2);
        hmt2.j(hqy2);
        b2 = new b(this, n | 5);
        hqy2 = new hqy((hnc)((Object)this), "", lgg3, this.jBP.cqv(), hpx.a.kXm, this.jBT, lcx.qQD.esy());
        hqy2.cvC().a(true, b2);
        hmt2.j(hqy2);
    }

    public void cbe() {
        lhf lhf2 = this.kND.cqv();
        b b2 = new b(this, 257);
        lgs lgs2 = new lgs(lhf2.rmN - 6 - this.jBB, lhf2.H - 4 - this.jBC, this.jBB, this.jBC);
        hqy hqy2 = new hqy((hnc)((Object)this), "", lgs2.aI(), lgs2.cqv(), hpx.a.kXm, this.jBU, "Start");
        hqy2.cvC().a(true, b2);
        this.jCr.j(hqy2);
        String string = lcx.qQG.esy();
        lgs lgs3 = new lgs(0, 20, 10, 10);
        hbi hbi2 = new hbi(this, lgs3, string);
        this.jCr.j(hbi2);
    }

    public void a(Object[] objectArray, int n) {
        lhf lhf2 = this.kND.cqv();
        this.jBP = new lgs(258, 465, 100, 32);
        this.jBQ = new lgs(380, 465, 100, 32);
        assert (objectArray[0] instanceof cp) : "Not SFCharacterCreatorRaceConfig. Class = " + objectArray[0].getClass().getSimpleName();
        cp cp2 = (cp)objectArray[0];
        lgg lgg2 = new lgg(lhf2.rmN - hbo.jDr.kLY.rmN, 0);
        hbt hbt2 = new hbt(this, lgg2);
        this.jCr.j(hbt2);
        if (n == 3) {
            hbt2.mV(false);
        }
        hbt2.a(cp2);
        this.jBI = hbt2;
    }

    public void bp(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        lhf lhf2 = this.kND.cqv();
        lgg lgg2 = new lgg(lhf2.rmN - hbo.jDr.kLY.rmN, 0);
        hbs hbs2 = new hbs(this, lgg2);
        this.jCr.j(hbs2);
        if (n == 2) {
            hbs2.mY(false);
        } else {
            hbs2.mY(true);
        }
        hbs2.ma(cg.u(n));
        hbs2.mV(false);
        this.jBI = hbs2;
    }

    public void b(Object[] objectArray, int n) {
        lhf lhf2 = this.kND.cqv();
        lhu lhu2 = null;
        if (objectArray.length <= 2) {
            lhu2 = hbo.jDx;
        } else if (objectArray.length == 3) {
            lhu2 = hbo.jDy;
        } else if (objectArray.length == 4) {
            lhu2 = hbo.jDz;
        } else if (objectArray.length == 5) {
            lhu2 = hbo.jDA;
        } else if (objectArray.length >= 6) {
            lhu2 = hbo.jDB;
        }
        assert (lhu2 != null);
        lgg lgg2 = new lgg(lhf2.rmN - lhu2.kLY.rmN, 0);
        hbq hbq2 = new hbq(this, "", lgg2, objectArray, lhu2);
        if (n != 5) {
            hbq2.mX(false);
        }
        this.jCr.j(hbq2);
    }

    public void bq(Object[] objectArray) {
        Object object;
        String string = null;
        String string2 = null;
        int n = 0;
        int n2 = 0;
        if (objectArray != null) {
            n = (Integer)objectArray[2];
            n2 = (Integer)objectArray[3];
            for (int j = 0; j < objectArray.length; ++j) {
                if (!(objectArray[j] instanceof cv)) continue;
                object = (cv)objectArray[j];
                assert (object != null);
                if (((cv)object).cy().intValue() == ct.kq.intValue()) {
                    string = (String)((cv)object).cx();
                    continue;
                }
                if (((cv)object).cy().intValue() != ct.kr.intValue()) continue;
                string2 = (String)((cv)object).cx();
            }
            assert (string != null && string2 != null);
        }
        lhf lhf2 = this.kND.cqv();
        object = new lgg(lhf2.rmN - hbo.jDr.kLY.rmN, 0);
        this.jCf = new hbr(this, (lgg)object);
        this.jCr.j(this.jCf);
        if (string != null && string2 != null) {
            this.jCf.lY(string);
            this.jCf.lZ(string2);
            this.jCf.a(this.RC);
            this.jCf.LH(n);
            this.jCf.LI(n2);
        }
    }

    public void br(Object[] objectArray) {
        cz cz2 = (cz)objectArray[0];
        Integer n = (Integer)objectArray[1];
        lhf lhf2 = this.kND.cqv();
        lgg lgg2 = new lgg((lhf2.rmN - hbo.jDr.kLY.rmN) / 2, 70);
        hbu hbu2 = new hbu(this, lgg2, cz2, n);
        this.jBI = hbu2;
        this.jCr.j(this.jBI);
        this.jBI.cqV();
        hbu2.cbt();
    }

    public final hpi.a cbf() {
        assert (this.Initialized);
        return this.jBq;
    }

    protected void cbg() {
        assert (this.Initialized);
        super.cbg();
        this.Initialized = false;
    }

    protected boolean cbh() {
        return true;
    }

    protected boolean cbi() {
        return true;
    }

    public lbn cbj() {
        return this.jCs;
    }

    protected void cbk() {
        this.cpB();
    }

    protected void cbl() {
        loi.exd().shutdown();
    }

    public b LG(int n) {
        return new b(this, n);
    }

    protected hoc cbm() {
        return this.jCr;
    }

    static /* synthetic */ void a(hbm hbm2, int n) {
        hbm2.LF(n);
    }

    static /* synthetic */ boolean a(hbm hbm2) {
        return hbm2.Initialized;
    }

    static /* synthetic */ hnu a(hbm hbm2, hnu hnu2) {
        hbm2.jCe = hnu2;
        return hbm2.jCe;
    }

    static /* synthetic */ boolean b(hbm hbm2) {
        return hbm2.bC;
    }
}

