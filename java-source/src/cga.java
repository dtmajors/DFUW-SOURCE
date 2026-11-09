/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  cex
 *  cug
 *  ha
 *  lcr
 */
public class cga
extends btk {
    private static final String TC = "SFPlayerDuelingManagerServer";
    private final cex abN;
    private final b eww;
    private boolean bRO = true;
    private ldv ewx = null;
    private ldv Ri = null;
    private boolean ewy = false;

    public cga(cex cex2) {
        this.abN = cex2;
        this.eww = new b(this);
    }

    public void jw() {
        this.ewx = null;
        this.Ri = null;
        this.bRO = true;
        if (this.abN.mA() != null) {
            this.Ri = this.abN.mA().getGUID();
            this.ewx = lcr.p((ldv)lcr.qCk, (int)this.abN.mA().jr(), (int)this.Ri.enw());
        }
    }

    private void a(ezp ezp2) {
        if (this.ewx == null || this.Ri == null) {
            lfn.b(5, TC, "handleDuelingClientChallengerInfoRequestMessage() Player : " + this.abN.getGUID() + " can not initiate a duel.");
            assert (false);
            return;
        }
        ldv ldv2 = ezp2.bNw();
        if (ldv2 == null) {
            lfn.b(5, TC, "handleDuelingClientChallengerInfoRequestMessage() ChallengeeGUID : " + ldv2);
            this.abN.c(mbs.ulU.bD(new Object[0]));
            assert (false);
            return;
        }
        if (!this.abN.mA().iY()) {
            lfn.b(5, TC, "handleDuelingClientChallengerInfoRequestMessage() Player : " + this.abN.getGUID() + " is not logged in.");
            return;
        }
        if (this.abN.aMP()) {
            lfn.b(5, TC, "handleDuelingClientChallengerInfoRequestMessage() Player : " + this.abN.getGUID() + " is in combat mode.");
            this.abN.c(mbs.ulW.bD(new Object[0]));
            return;
        }
        if (this.eww.aNY() != a.ewz) {
            this.abN.c(mbs.ulV.bD(new Object[0]));
            return;
        }
        if (this.abN.mA().aD(ldv2)) {
            this.abN.c(mbs.umb.bD(new Object[0]));
            return;
        }
        if (this.abN.aAG() == null || this.abN.aAG().azb() == null) {
            lfn.b(5, TC, "handleDuelingClientChallengerInfoRequestMessage() Player : " + this.abN.getGUID() + " can not get a valid position.");
            assert (false);
            return;
        }
        byv byv2 = this.abN.aJD().aEP();
        if (byv2.vK() != 3 || byv2.vN() != 1 || byv2.vO() != 6) {
            this.abN.c(mbs.ulY.bD(new Object[0]));
            return;
        }
        this.eww.ewJ = true;
        this.eww.diQ = ezp2.bNw();
        ljq ljq2 = this.abN.aAG().av();
        ljq ljq3 = this.abN.aAG().aw().eqT();
        ljq3.rlV = 0.0f;
        ljq3.x = 0.0f;
        lgl lgl2 = new lgl(ljq3);
        ljq ljq4 = new ljq(0.0, 0.0, 0.5);
        ljq4 = lgl2.eq(ljq4);
        ljq2.es(ljq4);
        this.eww.ewg = ljq2;
        this.eww.a(a.ewA);
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), this.eww.diQ);
        eef2.jM(true);
        this.MessageDelegator.E(eef2);
    }

    private void a(eeg eeg2) {
        ldv ldv2 = eeg2.aO();
        if (this.eww.aNY() != a.ewA) {
            lfn.b(5, TC, "handleCharacterNamedPropertiesResponceMessage() There is no pending duel for player : " + this.Ri + ". Response came from : " + ldv2 + " Duel : " + this.eww.toString());
            assert (this.eww.aNY() == a.ewz);
            return;
        }
        if (!this.eww.diQ.equals(ldv2)) {
            lfn.b(5, TC, "handleCharacterNamedPropertiesResponceMessage() Player : " + this.Ri + " got response from : " + ldv2 + ". DuelData : " + this.eww.toString());
            assert (false);
            return;
        }
        if (!eeg2.qf()) {
            this.eww.fY(false);
            this.abN.c(mbs.ulZ.bD(new Object[0]));
            return;
        }
        if (this.abN.aMP()) {
            lfn.b(5, TC, "handleDuelingInitiateRequestMessage() Player : " + this.abN.getGUID() + " is in combat mode.");
            this.eww.fY(false);
            this.abN.c(mbs.ulW.bD(new Object[0]));
            return;
        }
        if (this.jh() == null) {
            lfn.b(5, TC, "handleDuelingInitiateRequestMessage() Player : " + this.Ri + " can not have access in inventory.");
            this.eww.fY(false);
            assert (false);
            return;
        }
        int n = this.jh().mp(cug.fkb);
        this.eww.YL = eeg2.iP() + " " + eeg2.iR();
        this.eww.ewK = eeg2.jr();
        this.eww.ewL = eeg2.aP();
        this.eww.ewM = eeg2.abF();
        this.eww.a(a.ewB);
        ezq ezq2 = (ezq)this.MessageDelegator.h(33282, this.getGUID(), this.ewx);
        ezq2.hh(this.eww.diQ);
        ezq2.jM(true);
        ezq2.hh(this.eww.diQ);
        ezq2.FR(n);
        ezq2.fm(this.eww.YL);
        ezq2.FP(this.eww.ewM);
        this.MessageDelegator.E(ezq2);
    }

    private void a(ezr ezr2) {
        Object object;
        ldv ldv2 = ezr2.bNw();
        if (ldv2 == null) {
            lfn.b(5, TC, "handleDuelingClientInitiateRequestMessage() Invalid data");
            assert (false);
            return;
        }
        if (this.eww.aNY() != a.ewB) {
            lfn.b(5, TC, "handleDuelingClientInitiateRequestMessage() There is no pending duel for player : " + this.Ri + ". Response came from : " + ldv2 + ". DuelData : " + this.eww.toString());
            assert (this.eww.aNY() == a.ewz);
            return;
        }
        if (!this.eww.diQ.equals(ldv2)) {
            lfn.b(5, TC, "handleDuelingClientInitiateRequestMessage() Player : " + this.Ri + " got response from : " + ldv2 + ". DuelData : " + this.eww.toString());
            assert (false);
            return;
        }
        cfx cfx2 = cfx.getValueByOrdinal(ezr2.getResult());
        switch (cfx2) {
            case evy: {
                break;
            }
            case evz: {
                this.eww.fY(false);
                return;
            }
            default: {
                this.eww.fY(false);
                this.abN.c(mbs.ulU.bD(new Object[0]));
                assert (false);
                return;
            }
        }
        if (this.abN.aMP()) {
            lfn.b(5, TC, "handleDuelingClientInitiateRequestMessage() Player : " + this.abN.getGUID() + " is in combat mode.");
            this.eww.fY(false);
            this.abN.c(mbs.ulW.bD(new Object[0]));
            return;
        }
        if (this.jh() == null) {
            lfn.b(5, TC, "handleDuelingClientInitiateRequestMessage() Player : " + this.Ri + " can not have access in inventory.");
            this.eww.fY(false);
            this.abN.c(mbs.ulU.bD(new Object[0]));
            assert (false);
            return;
        }
        int n = ezr2.aNM();
        if (n > 0) {
            object = this.jh().a(cug.fkb, n, bqm.c.dEV, true);
            if (object == null) {
                this.eww.fY(false);
                this.abN.c(mbs.uma.bD(new Object[0]));
                return;
            }
            this.eww.ewN = object;
        }
        this.eww.a(a.ewC);
        object = (ezw)this.MessageDelegator.h(33284, this.getGUID(), this.eww.diQ);
        ((ezw)object).FU(this.abN.mA().jr());
        ((ezw)object).py(this.abN.getGUID());
        ((ezw)object).pv(this.abN.mA().getGUID());
        ((ezw)object).kA(this.abN.mA().iU());
        ((ezw)object).FT((int)this.abN.mA().kA());
        ((dxq)object).jM(true);
        ((ezw)object).pQ(this.eww.ewN != null ? this.eww.ewN.vf() : 0);
        ((ezw)object).cG(this.eww.ewg);
        this.MessageDelegator.E((dxq)object);
    }

    private void a(ezw ezw2) {
        if (this.ewx == null || this.Ri == null) {
            lfn.b(5, TC, "handleDuelingRequestMessage() Player : " + this.abN.getGUID() + " can not participate in a duel.");
            assert (false);
            return;
        }
        if (this.eww.aNY() != a.ewz) {
            this.x(cfx.evC.ordinal(), ezw2.aO());
            return;
        }
        if (!this.aNU()) {
            lfn.b(5, TC, "handleDuelingRequestMessage() Player state is not valid : " + this.Ri);
            this.x(cfx.evE.ordinal(), ezw2.aO());
            return;
        }
        if (this.abN.aMP()) {
            this.x(cfx.evF.ordinal(), ezw2.aO());
            return;
        }
        ldv ldv2 = ezw2.bNv();
        ldv ldv3 = ezw2.bND();
        String string = ezw2.bNA();
        int n = ezw2.bNz();
        int n2 = ezw2.aNM();
        if (ldv3 == null || ldv2 == null || string == null || n < 0 || n2 < 0) {
            lfn.b(5, TC, "handleDuelingRequestMessage() Player : " + this.Ri + ". ChallengerPSOGUID : " + ldv2 + ". ChallengerName : " + string + ". ChallengerProwess : " + n + ". DuelFee : " + n2);
            this.x(cfx.evD.ordinal(), ezw2.aO());
            assert (false);
            return;
        }
        boolean bl = this.abN.mA().aD(ldv2);
        if (bl) {
            this.x(cfx.evB.ordinal(), ezw2.aO());
            return;
        }
        if (this.jh() == null) {
            lfn.b(5, TC, "handleDuelingRequestMessage() Challengee Player : " + this.Ri + " can not have access in inventory.");
            this.x(cfx.evE.ordinal(), ezw2.aO());
            return;
        }
        bsa bsa2 = null;
        if (n2 > 0 && (bsa2 = this.jh().a(cug.fkb, n2, bqm.c.dEV, true)) == null) {
            this.x(cfx.evG.ordinal(), ezw2.aO());
            return;
        }
        this.eww.ewJ = false;
        this.eww.diQ = ldv2;
        this.eww.ewL = ldv3;
        this.eww.YL = string;
        this.eww.ewg = ezw2.bNB();
        this.eww.ewN = bsa2;
        this.eww.ewM = n;
        this.eww.ewK = ezw2.bNC();
        this.eww.a(a.ewD);
        int n3 = this.jh().mp(cug.fkb);
        ezn ezn2 = (ezn)this.MessageDelegator.h(33286, this.getGUID(), this.ewx);
        ezn2.jM(true);
        ezn2.pQ(this.eww.ewN != null ? this.eww.ewN.vf() : 0);
        ezn2.fm(string);
        ezn2.hh(this.eww.diQ);
        ezn2.FP(n);
        ezn2.FQ(n3);
        this.MessageDelegator.E(ezn2);
    }

    private void a(ezo ezo2) {
        ldv ldv2 = ezo2.bNv();
        if (ldv2 == null) {
            lfn.b(5, TC, "handleDuelingClientChallengeeDuelResponseMessage() Player : " + this.Ri + ". ChallengerPSOGUID : " + ldv2);
            assert (false);
            return;
        }
        if (this.eww.aNY() != a.ewD) {
            lfn.b(5, TC, "handleDuelingClientChallengeeDuelResponseMessage() There is no active duel request for player : " + this.Ri);
            assert (this.eww.aNY() == a.ewz);
            return;
        }
        if (!this.eww.diQ.equals(ldv2)) {
            lfn.b(5, TC, "handleDuelingClientChallengeeDuelResponseMessage() ChallengerPSOGUID : " + ldv2 + ". Player :  " + this.Ri + ". Duel : " + this.eww.toString());
            assert (false);
            return;
        }
        if (this.abN.aMP()) {
            lfn.b(5, TC, "handleDuelingClientChallengeeDuelResponseMessage() Challengee Player : " + this.abN.getGUID() + " is in combat mode.");
            this.x(cfx.evF.ordinal(), this.eww.diQ);
            this.eww.fY(false);
            return;
        }
        cfx cfx2 = cfx.getValueByOrdinal(ezo2.X());
        switch (cfx2) {
            case evy: {
                this.eww.a(a.ewE);
                this.eww.oV = this.MessageDelegator.arc().rgz + 5.0;
                this.x(cfx2.ordinal(), this.eww.diQ);
                break;
            }
            case evA: {
                this.abN.mA().c(ldv2, this.eww.YL);
                this.x(cfx2.ordinal(), this.eww.diQ);
                this.eww.fY(false);
                break;
            }
            case evz: {
                this.x(cfx2.ordinal(), this.eww.diQ);
                this.eww.fY(false);
                break;
            }
            default: {
                this.x(cfx.evH.ordinal(), this.eww.diQ);
                this.eww.fY(false);
                assert (false) : "Result : " + cfx2.ordinal();
                break;
            }
        }
    }

    private void a(ezx ezx2) {
        ldv ldv2 = ezx2.qd();
        if (ldv2 == null) {
            lfn.b(5, TC, "handleDuelingResponseMessage() ChallengeeGUID : " + ldv2);
            assert (false);
            return;
        }
        if (this.eww.aNY() != a.ewC) {
            lfn.b(5, TC, "handleDuelingResponseMessage() There is no active duel request for player : " + this.Ri);
            assert (this.eww.aNY() == a.ewz);
            return;
        }
        if (!this.eww.diQ.equals(ldv2)) {
            lfn.b(5, TC, "handleDuelingResponseMessage()  Player : " + this.Ri + ". ChallengeeGUID : " + ldv2 + ". Duel : " + this.eww.toString());
            assert (false);
            return;
        }
        cfx cfx2 = cfx.getValueByOrdinal(ezx2.getResult());
        switch (cfx2) {
            case evy: {
                this.eww.a(a.ewE);
                this.eww.oV = ezx2.aAw();
                break;
            }
            case evD: {
                this.abN.c(mbs.ulU.bD(new Object[0]));
                this.eww.fY(false);
                break;
            }
            case evB: {
                this.abN.c(mbs.umk.bD(new Object[0]));
                this.eww.fY(false);
                break;
            }
            case evC: {
                this.abN.c(mbs.ume.bD(new Object[0]));
                this.eww.fY(false);
                break;
            }
            case evA: {
                this.abN.c(mbs.umj.bD(new Object[0]));
                this.eww.fY(false);
                break;
            }
            case evz: {
                this.abN.c(mbs.umi.bD(new Object[0]));
                this.eww.fY(false);
                break;
            }
            case evG: {
                this.abN.c(mbs.umg.bD(new Object[0]));
                this.eww.fY(false);
                break;
            }
            case evE: {
                this.abN.c(mbs.umf.bD(new Object[0]));
                this.eww.fY(false);
                break;
            }
            case evF: {
                this.abN.c(mbs.ulX.bD(new Object[0]));
                this.eww.fY(false);
                break;
            }
            case evH: {
                this.abN.c(mbs.uml.bD(new Object[0]));
                this.eww.fY(false);
            }
        }
    }

    private void a(ezz ezz2) {
        ldv ldv2 = ezz2.bNE();
        if (ldv2 == null) {
            lfn.b(5, TC, "handleDuelingUpdateInfoMessage() Player : " + this.Ri + ". OppenentPSOGUID : " + ldv2);
            assert (false);
            return;
        }
        switch (this.eww.aNY()) {
            case ewz: {
                return;
            }
            case ewF: {
                if (!this.eww.diQ.equals(ldv2)) {
                    lfn.b(5, TC, "handleDuelingUpdateInfoMessage()  Player : " + this.Ri + " Received update info message from OpponentPSOGUID : " + ldv2 + ". Duel : " + this.eww.toString());
                    assert (false);
                    return;
                }
                int n = ezz2.bHc();
                switch (n) {
                    case 3: {
                        if (this.eww.ewJ || this.ewy) break;
                        this.eww.j(1, 3, 0);
                        break;
                    }
                    case 0: 
                    case 1: 
                    case 2: {
                        loz loz2 = mbs.umo.bD(new Object[0]);
                        this.abN.c(loz2);
                        loz2 = mbs.umn.bD(new Object[0]);
                        ldv ldv3 = new ldv(this.eww.ewK, lcr.acL.enw(), lcr.acL.enx());
                        this.eww.d(loz2, ldv3);
                        if (this.eww.ewJ || this.ewy) break;
                        this.eww.j(1, n, this.Ri.enw());
                        break;
                    }
                }
                this.eww.fY(true);
                break;
            }
            default: {
                if (!this.eww.diQ.equals(ldv2)) {
                    lfn.b(5, TC, "handleDuelingUpdateInfoMessage() Player : " + this.Ri + " Received update info message from OppenentPSOGUID : " + ldv2 + ". Duel : " + this.eww.toString());
                    assert (false);
                    return;
                }
                this.eww.fY(false);
            }
        }
    }

    public void aLH() {
        this.bRO = false;
    }

    public void aNS() {
        this.bRO = true;
    }

    public void aNT() {
        this.ewy = true;
    }

    public void doTick(ldz ldz2) {
        if (this.Ri == null || this.ewx == null) {
            return;
        }
        if (this.eww.aNY() == a.ewz) {
            return;
        }
        boolean bl = this.abN.mA().iY();
        boolean bl2 = this.bRO;
        switch (this.eww.aNY()) {
            case ewB: {
                if (!bl || !bl2 || this.ewy) {
                    this.eww.fY(false);
                }
                return;
            }
            case ewA: {
                if (!bl || !bl2 || this.ewy) {
                    this.eww.fY(false);
                }
                return;
            }
            case ewC: {
                if (!bl || !bl2 || this.ewy) {
                    if (!this.ewy) {
                        this.pR(!bl ? 0 : 2);
                    } else {
                        this.pR(3);
                    }
                    this.eww.fY(false);
                }
                return;
            }
            case ewD: {
                if (!bl || !bl2 || this.ewy) {
                    this.x(cfx.evE.ordinal(), this.eww.diQ);
                    this.eww.fY(false);
                }
                return;
            }
            case ewE: {
                if (ldz2.rgz >= this.eww.oV) {
                    this.eww.a(a.ewF);
                }
                if (!bl || !bl2 || this.ewy) {
                    if (!this.ewy) {
                        this.pR(!bl ? 0 : 2);
                    } else {
                        this.pR(3);
                    }
                    this.eww.fY(false);
                    return;
                }
                return;
            }
            case ewF: {
                if (!bl || !bl2 || this.ewy) {
                    if (!this.ewy) {
                        this.pR(!bl ? 0 : 2);
                        if (!this.eww.ewJ) {
                            this.eww.j(1, !bl ? 0 : 2, this.eww.diQ.enw());
                        }
                    } else {
                        this.pR(3);
                    }
                    this.eww.fY(false);
                    return;
                }
                this.bq(ldz2.rgz);
                this.br(ldz2.rgz);
                return;
            }
        }
    }

    private void bq(double d2) {
        float f2;
        float f3 = f2 = this.abN.aAG() != null && this.abN.aAG().azb() != null ? ljq.s(this.abN.aAG().azb(), this.eww.ewg) : 71.0f;
        if (f2 > 70.0f) {
            if (this.eww.ewO) {
                return;
            }
            this.eww.ewO = true;
            this.eww.ewP = d2;
            this.abN.c(mbs.umc.bD(5.0));
        } else {
            if (!this.eww.ewO) {
                return;
            }
            this.eww.ewO = false;
            this.eww.ewP = -1.0;
            this.abN.c(mbs.umd.bD(new Object[0]));
        }
    }

    private void br(double d2) {
        if (this.eww.ewO && d2 > this.eww.ewP + 5.0) {
            this.pR(1);
            if (!this.eww.ewJ) {
                this.eww.j(1, 1, this.eww.diQ.enw());
            }
            this.eww.fY(false);
            return;
        }
    }

    private void x(int n, ldv ldv2) {
        ezx ezx2 = (ezx)this.MessageDelegator.h(33285, this.getGUID(), ldv2);
        ezx2.DR(n);
        ezx2.oH(this.Ri);
        ezx2.o(this.eww.oV);
        this.MessageDelegator.F(ezx2);
    }

    private boolean aNU() {
        if (!this.abN.mA().iN()) {
            return false;
        }
        return this.jh() != null;
    }

    private bqk ji() {
        ha ha2 = this.abN.mA();
        if (ha2 == null) {
            return null;
        }
        return ha2.jg();
    }

    private brh jh() {
        return this.ji() != null ? this.ji().aup() : null;
    }

    private void pR(int n) {
        ezz ezz2 = (ezz)this.MessageDelegator.h(33288, this.getGUID(), this.eww.diQ);
        ezz2.pz(this.abN.mA().getGUID());
        ezz2.Eh(n);
        this.MessageDelegator.F(ezz2);
    }

    public boolean kI(ldv ldv2) {
        if (ldv2 == null) {
            return false;
        }
        if (this.eww.aNY() != a.ewF) {
            return false;
        }
        return this.eww.diQ != null && this.eww.diQ.equals(ldv2);
    }

    public boolean aNV() {
        return this.eww.aNY() == a.ewF;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 33281: {
                this.a((ezp)dxq2);
                break;
            }
            case 12812: {
                this.a((eeg)dxq2);
                break;
            }
            case 33283: {
                this.a((ezr)dxq2);
                break;
            }
            case 33285: {
                this.a((ezx)dxq2);
                break;
            }
            case 33284: {
                this.a((ezw)dxq2);
                break;
            }
            case 33287: {
                this.a((ezo)dxq2);
                break;
            }
            case 33288: {
                this.a((ezz)dxq2);
                break;
            }
            case 33290: {
                ezv ezv2 = (ezv)this.MessageDelegator.h(33291, dxq2.amk(), dxq2.aO());
                ezv2.px(this.eww.ewI == a.ewF ? this.eww.diQ : null);
                this.MessageDelegator.F(ezv2);
                break;
            }
            case 11034: {
                this.c((gre)dxq2);
            }
        }
    }

    private void c(gre gre2) {
        if (this.eww.aNY() == a.ewz) {
            return;
        }
        int n = gre2.jqc;
        int n2 = gre2.iHL;
        int n3 = gre2.jqd;
        ldv ldv2 = gre2.jqf;
        switch (n) {
            case 12811: {
                assert (this.eww.aNY() == a.ewA);
                this.eww.fY(false);
                break;
            }
            case 33282: {
                assert (this.eww.aNY() == a.ewB);
                this.eww.fY(false);
                break;
            }
            case 33284: {
                assert (this.eww.aNY() == a.ewC);
                this.eww.fY(false);
                break;
            }
            case 33286: {
                assert (this.eww.aNY() == a.ewD);
                this.x(cfx.evE.ordinal(), this.eww.diQ);
                this.eww.fY(false);
                break;
            }
            case 33285: {
                assert (this.eww.aNY() == a.ewE || this.eww.aNY() == a.ewF);
                this.eww.fY(true);
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
    }

    static /* synthetic */ boolean a(cga cga2) {
        return cga2.ewy;
    }

    static /* synthetic */ ldv b(cga cga2) {
        return cga2.Ri;
    }

    static /* synthetic */ b c(cga cga2) {
        return cga2.eww;
    }

    static /* synthetic */ bqk d(cga cga2) {
        return cga2.ji();
    }

    static /* synthetic */ cex e(cga cga2) {
        return cga2.abN;
    }

    static /* synthetic */ ldv f(cga cga2) {
        return cga2.GUID;
    }

    static /* synthetic */ dxr g(cga cga2) {
        return cga2.MessageDelegator;
    }

    static /* synthetic */ dxr h(cga cga2) {
        return cga2.MessageDelegator;
    }

    static /* synthetic */ dxr i(cga cga2) {
        return cga2.MessageDelegator;
    }

    static /* synthetic */ ldv j(cga cga2) {
        return cga2.GUID;
    }

    static /* synthetic */ dxr k(cga cga2) {
        return cga2.MessageDelegator;
    }

    static /* synthetic */ dxr l(cga cga2) {
        return cga2.MessageDelegator;
    }

    static /* synthetic */ dxr m(cga cga2) {
        return cga2.MessageDelegator;
    }

    static /* synthetic */ dxr n(cga cga2) {
        return cga2.MessageDelegator;
    }

    static /* synthetic */ ldv o(cga cga2) {
        return cga2.ewx;
    }

    static /* synthetic */ dxr p(cga cga2) {
        return cga2.MessageDelegator;
    }

    static /* synthetic */ dxr q(cga cga2) {
        return cga2.MessageDelegator;
    }
}

