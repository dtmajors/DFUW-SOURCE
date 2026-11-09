/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  dta
 *  dtn
 *  lcr
 *  lcw
 */
import java.util.List;

public class dtp
extends dtn {
    public static final int dvW = 1;
    private static boolean fE = true;
    private boolean hcV = false;
    private boolean hcW = false;
    private boolean hcX = false;
    private boolean hcY = false;
    private boolean hcZ = false;
    private boolean hda = true;
    private int dvZ = 5;
    private lez dvX = new lez();
    private boolean hdb;
    private ljq hdc;
    private int hdd = 0;
    private final int hde = 1000;
    private static final ljq hdf = new ljq();
    private boolean aex = false;
    private dtk hdg = null;

    public dtp(ag ag2) {
        super(ag2);
        if (lcw.enb() && !lcw.bn) {
            this.hda = false;
        }
    }

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        switch (this.hct) {
            case hcJ: 
            case hcI: 
            case hcK: {
                break;
            }
            case hcH: {
                if (fE && lcw.bn) {
                    this.aS(hdf);
                    fE = false;
                }
                if (this.hda) {
                    return;
                }
                this.bAr();
                this.hda = true;
                break;
            }
            case hcL: {
                if (this.dvZ == 0) {
                    this.hcv.V();
                    this.dvZ = -1;
                    break;
                }
                if (this.dvZ <= 0) break;
                --this.dvZ;
            }
        }
        if (this.hdb) {
            ++this.hdd;
            if (this.hdd == 1000) {
                this.bAt();
            }
        }
    }

    private void bAr() {
        assert (lcw.enb()) : "Not standalone";
        fp fp2 = new fp(hc.aaP);
        fp2.di = 1024;
        fp2.hB = 666;
        fp2.SN = 666;
        fp2.hE = dsv.byP().getUserName();
        fp2.SP = "";
        gpo gpo2 = (gpo)this.fy.h(11059, this.GUID, lcr.Wu);
        gpo2.joL = true;
        gpo2.joK = fp2;
        this.fy.E((dxq)gpo2);
    }

    public void aMF() {
        assert (this.alW != null);
        assert (this.alW.Ts != null);
        gqv gqv2 = (gqv)this.h(11042, this.GUID, this.alW.Ts);
        this.F(gqv2);
    }

    private void bAs() {
        this.alW.aFG = 4;
        this.lj(1);
        gqz gqz2 = (gqz)this.fy.h(11023, this.GUID, lcr.Wu);
        gqz2.qw(this.GUID);
        this.fy.E((dxq)gqz2);
    }

    private void bAt() {
        assert (this.hdb && this.hdc != null);
        this.jt(lcw.qGO);
        this.hdb = false;
        this.hdc = null;
        this.hdd = 0;
    }

    protected void a(fvr fvr2) {
        block0 : switch (fvr2.bEz()) {
            case 12289: {
                fvp fvp2 = (fvp)fvr2;
                switch (fvp2.iTm) {
                    case 1: {
                        if (fvp2.dTe <= 0) {
                            return;
                        }
                        if (fvp2.iTm <= 0) {
                            return;
                        }
                        if (this.dvX.ug(fvp2.aO())) {
                            return;
                        }
                        lex lex2 = new lex();
                        lex2.iHR = fvp2.aO();
                        lex2.dTe = fvp2.dTe;
                        this.dvX.a(lex2);
                        break block0;
                    }
                }
                return;
            }
            case 12290: {
                fvv fvv2 = (fvv)fvr2;
                switch (fvv2.iTm) {
                    case 1: {
                        if (fvv2.iTm <= 0) {
                            return;
                        }
                        if (!this.dvX.ug(fvv2.aO())) {
                            return;
                        }
                        this.dvX.uh(fvv2.aO());
                        break block0;
                    }
                }
                return;
            }
            default: {
                super.a(fvr2);
            }
        }
    }

    protected final void receiveMessage(dxq dxq2) {
        switch (dxq2.bED()) {
            case 16384: {
                this.a((fpj)dxq2);
                return;
            }
            case 26624: {
                dxq2.on(lcr.qCj);
                this.F(dxq2);
                return;
            }
        }
        switch (dxq2.bEz()) {
            case 11040: {
                assert (false);
                break;
            }
            case 11011: {
                this.a((gpq)dxq2);
                break;
            }
            case 3843: {
                this.b((fov)dxq2);
                break;
            }
            case 11017: {
                this.a((gqj)dxq2);
                break;
            }
            case 11019: {
                assert (false) : "No longer handled";
                break;
            }
            case 11035: {
                this.a((gqx)dxq2);
                break;
            }
            case 11057: {
                this.a((grs)dxq2);
                break;
            }
            case 11024: {
                this.a((gra)dxq2);
                break;
            }
            case 11530: {
                this.a((foa)dxq2);
                break;
            }
            case 11023: {
                this.bAs();
                break;
            }
            case 11041: {
                this.a((gqs)dxq2);
                break;
            }
            case 11037: {
                this.a((gpv)dxq2);
                break;
            }
            case 11027: {
                this.a((gpa)dxq2);
                break;
            }
            case 5890: {
                this.a((fav)dxq2);
                break;
            }
            case 2566: {
                this.bAu();
                break;
            }
            case 17946: {
                this.a((fxs)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gqj gqj2) {
        dst dst2;
        if (gqj2.jns) {
            assert (gqj2.Ts != null);
            assert (gqj2.Xe != null);
            dst2 = this.M(gqj2.Xe, true);
            if (dst2 != null) {
                lfn.b(5, "SFSystemObjectSpaceClient", "handleCreateSessionResponse() Characterobjectinfo with NotifyObjectGUID=" + gqj2.Xe + " already exists.");
                return;
            }
        } else {
            return;
        }
        this.hdg = new dtk();
        this.hdg.Ts = this.alW.Ts;
        this.hdg.Tr = this.alW.Tr;
        this.hdg.Tu = this.alW.Tu;
        this.hdg.afF = this.alW.gYY;
        this.hdg.Ui = this.alW.gYZ;
        this.hdg.gYJ = this.alW.gZa;
        this.hdg.dAu = this.alW.gZb;
        this.hdg.eFu = this.alW.eFu;
        dst2 = new dst();
        dst2.Ts = gqj2.Ts;
        dst2.Xe = gqj2.Xe;
        dst2.Yc = this.nU(dst2.Ts.bFk());
        this.b(dst2);
        gqg gqg2 = (gqg)this.h(11015, this.GUID, dst2.Ts);
        gqg2.jpg = false;
        gqg2.Xe = this.GUID;
        gqg2.bc = "PlayerMonster";
        gqg2.Za = lea.enW().getType("r_Goblin Fighter");
        gqg2.jjc = new ljq();
        gqg2.jph = new lgl(0.0f, 0.0f, 0.0f);
        gqg2.aeh = 1.0f;
        gqg2.ijb = 0.0f;
        this.F(gqg2);
        this.aex = true;
        this.hcZ = false;
    }

    private void a(fpj fpj2) {
        block0 : switch (fpj2.bEz()) {
            case 16385: {
                fpi fpi2 = (fpi)fpj2;
                switch (fpi2.iTm) {
                    case 1: {
                        if (fpi2.iTm <= 0) {
                            return;
                        }
                        if (this.dvX.ug(fpi2.aO())) {
                            return;
                        }
                        lex lex2 = new lex();
                        lex2.iHR = fpi2.aO();
                        this.dvX.a(lex2);
                        break block0;
                    }
                }
                return;
            }
            case 16386: {
                fpl fpl2 = (fpl)fpj2;
                switch (fpl2.iTm) {
                    case 1: {
                        if (fpl2.iTm <= 0) {
                            return;
                        }
                        if (!this.dvX.ug(fpl2.aO())) {
                            return;
                        }
                        this.dvX.uh(fpl2.aO());
                        break block0;
                    }
                }
                return;
            }
            default: {
                return;
            }
        }
    }

    private void a(gpq gpq2) {
        this.E(gpq2.aVk(), gpq2.aO());
    }

    private void lj(int n) {
        if (n == 1) {
            List<lex> list = this.dvX.eqs();
            int n2 = list.size();
            for (int i = 0; i < n2; ++i) {
                lex lex2 = list.get(i);
                this.E(-1, lex2.iHR);
                lex2.rjR = this.arc().lpr;
            }
        }
    }

    private void a(gqx gqx2) {
        cew cew2;
        Object object;
        if (gqx2.jpS && this.alW == null) {
            this.hct = dtn.a.hcI;
            this.alW = new dsu();
            this.alW.SN = gqx2.SN;
            this.alW.Tr = gqx2.Ri;
            this.alW.Ts = gqx2.Ts;
            this.alW.Tu = this.nU(this.alW.Ts.bFk());
            lcw.SP = gqx2.SP;
            lcw.qPe = gqx2.jpT;
            lcw.qPf = gqx2.jpU;
            lcw.qPg = gqx2.jpV;
            dsv.byP().aQ(gqx2.ZQ);
            dsv.byP().fm(gqx2.YL);
            object = new dst();
            ((dst)object).Ts = this.alW.Ts;
            ((dst)object).Yc = this.alW.Tu;
            ((dst)object).Xe = ((dst)object).Ts;
            this.b((dst)object);
            this.lj(1);
        } else if (this.aex) {
            this.alW.Tr = null;
            this.alW.Ts = gqx2.Ts;
            this.alW.Tu = this.nU(this.alW.Ts.bFk());
        } else {
            this.alW.Tr = gqx2.Ri;
            this.alW.Ts = gqx2.Ts;
            this.alW.Tu = this.nU(this.alW.Ts.bFk());
        }
        assert (this.alW != null);
        assert (this.alW.Ts != null);
        if (gqx2.dKN == null || gqx2.dKN.trim().equals("")) {
            return;
        }
        if (gqx2.diS == null) {
            return;
        }
        if (!this.hcX) {
            this.aS(gqx2.diS);
        }
        lcw.qGO = gqx2.dKN;
        if (!lcw.qGK) {
            object = (fov)this.h(3843, this.GUID, this.GUID);
            ((fov)object).ll(true);
            this.receiveMessage((dxq)object);
            return;
        }
        this.jt(gqx2.dKN);
        object = (edc)this.fy.h(2049, this.GUID, lcr.rg);
        ((edc)object).DH(268);
        ((edc)object).c(gqx2.diS);
        ((edc)object).a(new lgl());
        this.I((dxq)object);
        if (this.alW != null && this.alW.gYY != null && (cew2 = (cew)this.bzx().bzt().d(this.alW.gYY)) != null) {
            cew2.aMs();
        }
    }

    private void a(grs grs2) {
        grt grt2 = (grt)this.h(11058, this.GUID, grs2.aO());
        this.F(grt2);
    }

    private void b(fov fov2) {
        cew cew2;
        assert (this.alW != null);
        assert (this.alW.Ts != null);
        if (!fov2.bQF()) {
            this.hcv.V();
            return;
        }
        this.om(this.alW.Ts);
        if (this.alW.gYY != null && (cew2 = (cew)this.bzx().bzt().d(this.alW.gYY)) != null) {
            cew2.aMt();
        }
    }

    private void a(gpa gpa2) {
        assert (this.alW != null);
        switch (gpa2.ilE) {
            case 1: {
                this.b(gpa2);
                break;
            }
            case 2: {
                this.c(gpa2);
                break;
            }
            case 4: {
                this.hcv.V();
                return;
            }
            default: {
                return;
            }
        }
        this.ok(gpa2.aO());
    }

    private void bAu() {
        gjd gjd2 = (gjd)this.h(4623, this.GUID, lcr.qCu);
        gjd2.hC = this.alW.gYY;
        gjd2.jja = new ljq(0.0f, -1.0f, 0.0f);
        this.bAv();
        this.bAw();
    }

    private void bAv() {
        kgq kgq2 = new kgq();
        kgq2.tr(this.getGUID());
        kgq2.ts(this.getGUID());
        kgq2.Xi(8);
        this.b(kgq2);
    }

    private void a(fxs fxs2) {
        assert (lcr.mOy == null);
        lcr.mOy = fxs2.aO();
        boolean bl = false;
        switch (this.alW.aFG) {
            case 1: 
            case 3: {
                bl = true;
            }
        }
        fxt fxt2 = (fxt)this.h(17947, this.GUID, fxs2.aO());
        fxt2.dOL = bl;
        this.F(fxt2);
    }

    private void a(fav fav2) {
        this.hcv.V();
    }

    private void b(gpa gpa2) {
        assert (!this.hcZ);
        assert (gpa2 != null);
        assert (gpa2.aea > 0);
        assert (gpa2.jot != null);
        assert (gpa2.aTc != null);
        assert (gpa2.jou != null);
        assert (gpa2.jov != null);
        assert (gpa2.eFu > 0);
        if (!this.aex) assert (gpa2.jow != null);
        dst dst2 = this.M(gpa2.aO(), false);
        if (dst2 == null) {
            this.hcv.V();
            return;
        }
        dst2.afK = this.nU(gpa2.jot);
        dst2.Ui = this.nU(gpa2.aTc);
        dst2.gYJ = this.nU(gpa2.jou);
        dst2.dAu = this.nU(gpa2.jov);
        dst2.eFu = gpa2.eFu;
        dst2.gYK = false;
        dst2.gYL = false;
        dst2.gYM = false;
        dst2.gYN = false;
        dst2.gYO = false;
        dst2.gYP = false;
        dst2.gYQ = false;
        dst2.gYR = false;
        dst2.gYS = 0;
        this.alW.Za = gpa2.aea;
        this.alW.gYX = gpa2.jot;
        this.alW.aTc = gpa2.aTc;
        this.alW.gYY = dst2.afK;
        this.alW.gYZ = dst2.Ui;
        this.alW.gZa = dst2.gYJ;
        this.alW.gZb = dst2.dAu;
        this.alW.eFu = dst2.eFu;
        if (!this.aex) {
            this.alW.gZc = this.nU(gpa2.jow);
        }
        this.hcV = true;
        this.hcY = false;
        this.hcW = false;
        juf juf2 = new juf();
        juf2.We(gpa2.aea);
    }

    private void c(gpa gpa2) {
        assert (this.hcZ);
        assert (this.hcW);
        assert (this.alW != null);
        assert (this.alW.Ts != null);
        assert (gpa2 != null);
        assert (gpa2.aTc != null);
        dst dst2 = new dst();
        dst2.Ts = this.alW.Ts;
        dst2.Yc = this.alW.Tu;
        dst2.Xe = dst2.Ts;
        dst2.afK = this.alW.gYY;
        dst2.Ui = this.nU(gpa2.aTc);
        dst2.gYJ = this.alW.gZa;
        dst2.dAu = this.alW.gZb;
        dst2.eFu = gpa2.eFu;
        dst2.gYK = false;
        dst2.gYL = false;
        dst2.gYM = false;
        dst2.gYN = false;
        dst2.gYO = false;
        dst2.gYP = false;
        dst2.gYR = false;
        dst2.gYS = 0;
        this.b(dst2);
        this.alW.aTc = gpa2.aTc;
        this.alW.gYZ = dst2.Ui;
        this.alW.gYX = gpa2.jot;
        this.hcV = true;
        this.hcY = false;
    }

    private void a(gpv gpv2) {
        assert (this.alW != null);
        assert (this.alW.Ts != null);
        this.alW.aFG = 2;
        this.lj(1);
        switch (gpv2.joR) {
            case 1: {
                this.hcu.dQi();
                break;
            }
            case 2: {
                if (this.aex) {
                    this.alW.Ts = this.hdg.Ts;
                    this.alW.Tr = this.hdg.Tr;
                    this.alW.Tu = this.hdg.Tu;
                    this.alW.gYY = this.hdg.afF;
                    this.alW.gYZ = this.hdg.Ui;
                    this.alW.gZa = this.hdg.gYJ;
                    this.alW.gZb = this.hdg.dAu;
                    this.alW.eFu = this.hdg.eFu;
                    this.aex = false;
                    this.hdg = null;
                }
                this.hcu.dQj();
                break;
            }
            case 3: {
                this.hcu.dQj();
                break;
            }
            default: {
                return;
            }
        }
        if (lcr.qEf != null) {
            this.N(lcr.qEf, false);
        }
        if (lcr.mOy != null) {
            this.N(lcr.mOy, false);
        }
        if (lcr.qCa != null) {
            this.N(lcr.qCa, false);
        }
        this.bAl();
    }

    private void a(gqs gqs2) {
        assert (this.alW != null);
        assert (this.alW.Ts != null);
        if (gqs2.jpK) {
            this.b(gqs2);
            return;
        }
        if (gqs2.jpI <= 0.0) {
            return;
        }
        if (gqs2.jpJ <= 0.0) {
            return;
        }
        this.hcu.b(gqs2.jpI, gqs2.jpJ, gqs2.ResourceType, gqs2.jpL);
    }

    private void b(gqs gqs2) {
        assert (this.alW != null);
        assert (this.alW.Ts != null);
        if (gqs2.jpI <= 0.0) {
            return;
        }
        this.hcu.f(gqs2.jpI, gqs2.ResourceType);
    }

    private void a(gra gra2) {
        this.hct = gra2.bWQ() ? dtn.a.hcL : dtn.a.hcI;
        this.dvZ = 5;
    }

    private void aS(ljq ljq2) {
        assert (!this.hcX);
        assert (ljq2 != null);
        dld dld2 = this.aj();
        dld2.setGUID(lcr.rg);
        dld2.c(new ljq(ljq2));
        dld2.a(new lgl());
        this.a(dld2);
        dle dle2 = this.bAj();
        dle2.setGUID(lcr.qBT);
        dle2.c(new ljq(ljq2));
        dle2.a(dld2.aw());
        this.a(dle2);
        this.hcX = true;
    }

    protected void a(dst dst2) {
        assert (dst2 != null);
        if (!dst2.Yc.equals(this.alW.Tu)) {
            lfn.b(5, "SFSystemObjectSpaceClient", "notifyCharacterAssembled() FIXME FOR TESTING. Notify Lars Erik...");
            assert (false);
            return;
        }
        assert (this.hcV);
        assert (!this.hcY);
        bql bql2 = (bql)((Object)this.fy.d(this.alW.gZb));
        assert (bql2 != null);
        this.alW.gZd = bql2.aun().awa().getGUID();
        assert (this.alW.gZd != null);
        this.alW.gZe = bql2.aun().awc().getGUID();
        assert (this.alW.gZe != null);
        dta dta2 = this.fy.of(dst2.Yc);
        cew cew2 = (cew)dta2.d(dst2.afK);
        assert (cew2 != null);
        this.hcw.b(cew2);
        lea.rhC.crm = cew2;
        if (!this.hcZ) {
            assert (!this.hcW);
            if (cew2.aJI() && cew2.aAG().aza() != bve.a.dQG) {
                lfn.b(5, "SFSystemObjectSpaceClient", "notifyCharacterAssembled() MeshObject has wrong meshtype: " + (Object)((Object)cew2.aAG().aza()));
                lfn.b(5, "SFSystemObjectSpaceClient", "notifyCharacterAssembled() " + cew2.aAG());
                assert (false);
            }
            dta2.a((dsy)((Object)this.d(lcr.qBU)));
            float f2 = cew2.aJz().bgU();
            float f3 = cew2.aJz().bgX();
            assert (f2 > 0.0f);
            assert (f3 > 0.0f);
            this.gFC.iA(f2);
            this.gFC.iz(f3);
            this.gFC.cz(new ljq(0.0f, f2, 0.0f));
            if (this.aex) {
                this.hcu.o(cew2);
            } else {
                this.hcu.dPx();
                this.hcu.n(cew2);
            }
            this.alW.aFG = 1;
            this.gFC.bT(this.alW.Za);
            this.lj(1);
            bun bun2 = (bun)this.d(lcr.qBP);
            assert (bun2 != null);
            if (this.aex) {
                bun2.jO(this.alW.gYY);
                bun2.jS(this.alW.gYZ);
            } else {
                bun2.cK(this.alW.gYY);
                bun2.setDeltaPos(this.gFC.byU());
                bun2.jT(this.alW.gYZ);
            }
            this.hcZ = true;
            this.hcW = true;
        } else {
            assert (this.hcW);
            float f4 = cew2.aJz().bgU();
            float f5 = cew2.aJz().bgX();
            assert (f4 > 0.0f);
            assert (f5 > 0.0f);
            this.gFC.cz(new ljq(0.0f, f4, 0.0f));
            this.gFC.iA(f4);
            this.gFC.iz(f5);
            this.hcu.o(cew2);
            this.alW.aFG = 3;
            this.lj(1);
            bun bun3 = (bun)this.nY(lcr.qBP);
            bun3.jS(this.alW.gYZ);
        }
        this.bAx();
        cew2.aMr();
        this.hcV = false;
        this.hcY = true;
        if (lcr.qEf != null) {
            this.N(lcr.qEf, true);
        }
        if (lcr.mOy != null) {
            this.N(lcr.mOy, true);
        }
        if (lcr.qCa != null) {
            this.N(lcr.qCa, true);
        }
    }

    private void bAw() {
        grg grg2 = (grg)this.h(11072, this.GUID, lcr.qAG);
        grg2.jqh = false;
        this.F(grg2);
    }

    private void ol(ldv ldv2) {
        egk egk2 = (egk)this.h(2321, this.GUID, ldv2);
        egk2.Tr = this.alW.Tr;
        egk2.afF = this.alW.gYY;
        egk2.cdD = this.alW.gYX;
        this.F(egk2);
    }

    private void bAx() {
        this.ol(lcr.qDi);
        this.ol(lcr.qDk);
        this.ol(lcr.qCW);
        this.ol(lcr.qDl);
        this.ol(lcr.qDm);
        this.ol(lcr.qCY);
        this.ol(lcr.qCR);
        this.ol(lcr.qDn);
        this.ol(lcr.qDo);
        this.ol(lcr.qCS);
        this.ol(lcr.qDb);
        this.ol(lcr.qDj);
        this.ol(lcr.qDx);
        this.ol(lcr.qDe);
    }

    private void E(int n, ldv ldv2) {
        if (!lcw.qOR && ldv2.equals(lcr.acL) && (this.alW == null || this.alW.aFG == 0)) {
            return;
        }
        gpr gpr2 = (gpr)this.h(11012, this.GUID, ldv2);
        gpr2.aqs = n;
        gpr2.alW = this.alW;
        this.E(gpr2);
    }

    private void N(ldv ldv2, boolean bl) {
        assert (ldv2 != null);
        ffj ffj2 = (ffj)this.h(2574, this.GUID, ldv2);
        ffj2.dOL = bl;
        this.F(ffj2);
    }

    private void jt(String string) {
        fpb fpb2 = (fpb)this.h(3842, this.GUID, lcr.qEn);
        fpb2.Hi(1);
        fpb2.gl(string);
        fpb2.lm(true);
        this.F(fpb2);
    }

    private void om(ldv ldv2) {
        gqy gqy2 = (gqy)this.h(11036, this.GUID, ldv2);
        this.F(gqy2);
    }

    public void jG(boolean bl) {
        assert (lcw.enb()) : "Only allowed on standalone.";
        this.hda = bl;
    }

    public void F(int n, ldv ldv2) {
        cew cew2 = (cew)this.bzx().bzt().d(this.alW.gYY);
        if (cew2 != null) {
            cew2.s(n, ldv2);
        }
    }

    public void G(int n, ldv ldv2) {
        cew cew2 = (cew)this.bzx().bzt().d(this.alW.gYY);
        if (cew2 != null) {
            cew2.t(n, ldv2);
        }
    }
}

