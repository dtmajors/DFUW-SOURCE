/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  ha
 *  lcr
 *  lcw
 */
public class li
extends mm {
    protected boolean asW = false;
    private boolean asX = false;
    private static final float asY = 20.0f;
    private static final float asZ = 20.0f;
    private static final int ata = 10;
    private ldv atb = null;
    private ljq atc = null;
    private String atd = null;
    private ljq ate = null;
    private int atf = -1;
    private boolean atg = false;
    private ljq ath = null;
    private static final int ati = 1;
    private static final int atj = 2;
    private static final int atk = 3;
    private lk atl = null;
    private lj atm = null;
    private fho atn = null;
    private fih ato = null;
    private atf atp = null;
    private static final int atq = 1;
    private static final int atr = 2;
    private int ats = -1;

    public li(ha ha2) {
        super(ha2);
    }

    public boolean oO() {
        return this.atb != null && !this.atg;
    }

    public boolean oP() {
        return this.atb != null;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bED() == 23808) {
            this.j(dxq2);
        }
        switch (dxq2.bEz()) {
            case 5636: {
                this.a((fuu)dxq2);
                break;
            }
            case 11034: {
                this.b((gre)dxq2);
                break;
            }
            case 23815: {
                this.a((fhf)dxq2);
                break;
            }
            case 23819: {
                this.a((fio)dxq2);
                break;
            }
            case 23822: {
                this.a((fgz)dxq2);
                break;
            }
            case 23823: {
                this.a((fhv)dxq2);
                break;
            }
            case 23824: {
                this.a((fhw)dxq2);
                break;
            }
            case 23836: {
                this.a((fii)dxq2);
                break;
            }
            case 23835: {
                this.a((fih)dxq2);
                break;
            }
            case 23833: {
                this.a((fhk)dxq2);
                break;
            }
            case 23832: {
                this.a((fig)dxq2);
                break;
            }
            case 23839: {
                this.a((fhi)dxq2);
                break;
            }
            case 23841: {
                this.a((fho)dxq2);
                break;
            }
            case 23842: {
                this.a((fhp)dxq2);
                break;
            }
            case 23827: {
                this.a((fik)dxq2);
                break;
            }
            case 23828: {
                this.a((fij)dxq2);
                break;
            }
            case 23816: {
                this.a((fhm)dxq2);
                break;
            }
            case 22788: {
                this.a((eaf)dxq2);
                break;
            }
            case 23846: {
                this.a((fhh)dxq2);
                break;
            }
            case 23834: 
            case 23850: {
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 4866: {
                this.handleLineContainmentResponse((kuj)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private void j(dxq dxq2) {
        int n = this.hF.jr();
        if (n == 0) {
            return;
        }
        dxq dxq3 = (dxq)dxq2.clone();
        dxq3.f(this.getGUID());
        dxq3.on(lcr.p((ldv)lcr.acL, (int)n, (int)this.hF.getGUID().enw()));
        this.MessageDelegator.F(dxq3);
    }

    public void d(ljq ljq2, lgl lgl2) {
        if (this.hF.kv() && !iw.nA()) {
            this.hF.c(mbx.uoz.bD(new Object[0]));
            return;
        }
        if (this.oO()) {
            this.hF.c(mbx.uoA.bD(new Object[0]));
            return;
        }
        if (this.asW) {
            return;
        }
        this.asW = true;
        this.e(ljq2, lgl2);
    }

    public void c(int n, ljq ljq2) {
        this.ats = n;
        if (this.hF.ja()) {
            return;
        }
        if (!this.oO()) {
            this.hF.c(mbx.uoB.bD(new Object[0]));
            return;
        }
        if (this.asX) {
            this.hF.c(mbx.uoC.bD(new Object[0]));
            return;
        }
        ljq ljq3 = new ljq(ljq2);
        ljq3.et(this.atc);
        float f = ljq3.eqN();
        if (f > 20.0f) {
            this.hF.c(mbx.uoD.bD(new Object[0]));
            return;
        }
        assert (this.atb != null);
        this.asX = true;
        fin fin2 = (fin)this.MessageDelegator.h(23818, this.getGUID(), this.atb);
        fin2.iNg = n;
        fin2.RB = this.hF.jr();
        fin2.hsP = true;
        fin2.diQ = this.hF.getGUID();
        fin2.sk(10);
        this.MessageDelegator.F(fin2);
        if (this.atl != null) {
            this.atl.oZ();
        }
    }

    private void a(fio fio2) {
        this.asX = false;
        if (fio2.bPK().vA()) {
            this.d(this.ats, this.atc);
        }
        this.hF.c(fio2.bPK().Zv().bD(new Object[0]));
    }

    private void e(ljq ljq2, lgl lgl2) {
        this.ath = ljq2;
        ljq ljq3 = new ljq(0.0f, 0.0f, 1.0f);
        ljq ljq4 = lgl.a(lgl2, ljq3);
        ljq4.normalize();
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.wS(true);
        kji2.wT(false);
        kji2.ec = this.GUID;
        kji2.pDY = 0;
        kji2.Yg(2);
        kji2.Yh(2);
        kji2.ca(ljq2);
        kji2.cq(ljq4);
        kji2.setLength(20.0f);
        this.MessageDelegator.a(kji2);
    }

    private void handleLineContainmentResponse(kuj kuj2) {
        if (this.ath == null) {
            this.asW = false;
            return;
        }
        float f = Float.MAX_VALUE;
        int n = -1;
        if (kuj2.bqd != null && kuj2.bqd.length > 0) {
            for (int i = 0; i < kuj2.bqd.length; ++i) {
                float f2;
                if (!lea.enW().isDescendant(kuj2.bqd[i], cug.fqP) || ldv.rfd.equals(kuj2.qdO[i]) || lcw.enb() && !lcw.abY((int)kuj2.qdO[i].ib()) || !((f2 = kuj2.pJh[i]) < f)) continue;
                f = f2;
                n = i;
            }
        }
        if (n < 0) {
            this.asW = false;
            return;
        }
        if (kuj2.qdO == null || kuj2.qdO.length <= n || kuj2.qdO[n] == null) {
            this.asW = false;
            return;
        }
        this.bG(kuj2.qdO[n]);
    }

    private final void bG(ldv ldv2) {
        assert (ldv2 != null);
        assert (!ldv2.equals(this.GUID));
        fut fut2 = (fut)this.MessageDelegator.h(5635, this.GUID, ldv2);
        fut2.jM(true);
        fut2.Ib(1);
        this.MessageDelegator.F(fut2);
    }

    private void a(fuu fuu2) {
        if (fuu2.dtj == null) {
            this.asW = false;
            return;
        }
        fhe fhe2 = (fhe)this.MessageDelegator.h(23814, this.getGUID(), fuu2.dtj);
        fhe2.diQ = this.hF.getGUID();
        fhe2.YU = this.hF.iP();
        fhe2.YV = this.hF.iR();
        fhe2.hsP = true;
        this.MessageDelegator.F(fhe2);
    }

    private void a(fhf fhf2) {
        this.asW = false;
        if (fhf2.bPD().vA()) {
            this.b(fhf2);
        }
        this.hF.c(fhf2.bPD().Zv().bD(new Object[0]));
    }

    private void b(fhf fhf2) {
        dxq dxq2;
        assert (fhf2.oS() != null);
        assert (fhf2.oT() != null);
        assert (fhf2.oR() != null);
        assert (fhf2.oY() > 0);
        if (this.atb != null) {
            assert (this.atg);
            dxq2 = (fih)this.MessageDelegator.h(23835, this.getGUID(), this.atb);
            dxq2.iML = this.hF.getGUID();
            dxq2.sk(1);
            this.MessageDelegator.F(dxq2);
        }
        this.atb = fhf2.oS();
        this.Y(fhf2.oT());
        this.ate = fhf2.oR();
        this.atf = fhf2.oY();
        this.atg = false;
        this.oV();
        dxq2 = (fth)this.MessageDelegator.h(30218, this.getGUID(), this.hF.getGUID());
        ((fth)dxq2).Position = this.ate;
        ((fth)dxq2).ResourceType = this.atf;
        this.MessageDelegator.I(dxq2);
    }

    private void b(gre gre2) {
        this.asW = false;
        this.asX = false;
    }

    private void a(fgz fgz2) {
        if (!this.oP()) {
            return;
        }
        if (fgz2.aGQ == null) {
            return;
        }
        if (!fgz2.aGQ.equals(this.atb)) {
            return;
        }
        fgz2.on(this.atb);
        fgz2.f(this.hF.getGUID());
        this.MessageDelegator.F(fgz2);
    }

    public void a(ldv ldv2, hc hc2) {
        fhv fhv2 = (fhv)this.MessageDelegator.h(23823, this.getGUID(), ldv2);
        fhv2.YU = this.hF.iP();
        fhv2.YV = this.hF.iR();
        fhv2.diQ = this.hF.getGUID();
        fhv2.ccY = hc2.ordinal();
        this.MessageDelegator.F(fhv2);
    }

    private void a(fhv fhv2) {
        this.a(this.atb, hc.getAccessLevelType(fhv2.ccY));
    }

    private void a(fhw fhw2) {
        switch (fhw2.bPF()) {
            case eIK: {
                this.hF.c(fhw2.bPF().Zv().bD(fhw2.bPG(), cug.fkb));
                break;
            }
            case eIO: {
                this.hF.c(fhw2.bPF().Zv().bD(fhw2.bPG(), cug.fkb));
                this.a(cgz.ezv);
                break;
            }
            default: {
                this.hF.c(fhw2.bPF().Zv().bD(new Object[0]));
            }
        }
    }

    public void bH(ldv ldv2) {
        if (!this.oO()) {
            return;
        }
        if (this.atm == null) {
            this.atm = new lj(this);
            this.atm.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.atm);
        }
        this.atm.bH(ldv2);
    }

    public void a(ldv ldv2, cnd cnd2) {
        if (!this.oO()) {
            return;
        }
        if (this.atl == null) {
            this.atl = new lk(this);
            this.atl.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.atl);
        }
        this.atl.a(ldv2, cnd2);
    }

    private void a(fii fii2) {
        if (fii2.aVk() == 1) {
            assert (fii2.ew == 2);
            return;
        }
        if (fii2.aVk() == 2) {
            assert (fii2.ew == 2);
            return;
        }
        if (fii2.aVk() == 3) {
            assert (this.ato != null);
            fii fii3 = (fii)this.MessageDelegator.h(23836, this.getGUID(), this.ato.aO());
            this.MessageDelegator.b(this.ato, fii3);
            fii3.ew = fii2.ew;
            this.MessageDelegator.F(fii3);
            if (fii2.ew == 2) {
                this.oQ();
                this.hF.c(mcb.urt.bD(new Object[0]));
            }
            this.ato = null;
        }
    }

    private void a(fih fih2) {
        if (this.ato != null) {
            fii fii2 = (fii)this.MessageDelegator.h(23836, this.getGUID(), fih2.aO());
            this.MessageDelegator.b(fih2, fii2);
            fii2.ew = 3;
            this.MessageDelegator.F(fii2);
            return;
        }
        if (this.atb == null) {
            fii fii3 = (fii)this.MessageDelegator.h(23836, this.getGUID(), fih2.aO());
            this.MessageDelegator.b(fih2, fii3);
            fii3.ew = 1;
            this.MessageDelegator.F(fii3);
            return;
        }
        if (!this.atg) {
            fii fii4 = (fii)this.MessageDelegator.h(23836, this.getGUID(), fih2.aO());
            this.MessageDelegator.b(fih2, fii4);
            fii4.ew = 1;
            this.MessageDelegator.F(fii4);
            return;
        }
        this.ato = fih2;
        fih fih3 = (fih)this.MessageDelegator.h(23835, this.getGUID(), this.atb);
        fih3.iML = this.hF.getGUID();
        fih3.sk(3);
        this.MessageDelegator.F(fih3);
    }

    protected void bI(ldv ldv2) {
        if (this.oP()) {
            return;
        }
        if (this.asW) {
            return;
        }
        fif fif2 = (fif)this.MessageDelegator.h(23831, this.getGUID(), ldv2);
        fif2.iMW = this.hF.iP();
        fif2.iMX = this.hF.iR();
        fif2.iML = this.hF.getGUID();
        this.MessageDelegator.F(fif2);
    }

    private void a(fhk fhk2) {
        if (this.oP() || this.asW) {
            fhl fhl2 = (fhl)this.MessageDelegator.h(23834, this.getGUID(), fhk2.aO());
            this.MessageDelegator.b(fhk2, fhl2);
            fhl2.ew = 1;
            this.MessageDelegator.F(fhl2);
            return;
        }
        if (!this.hF.iY()) {
            fhl fhl3 = (fhl)this.MessageDelegator.h(23834, this.getGUID(), fhk2.aO());
            this.MessageDelegator.b(fhk2, fhl3);
            fhl3.ew = 2;
            this.MessageDelegator.F(fhl3);
            return;
        }
        if (this.atm == null) {
            this.atm = new lj(this);
            this.atm.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.atm);
        }
        this.atm.a(fhk2);
    }

    private void a(fig fig2) {
        if (!fig2.bPJ().vA()) {
            this.hF.c(fig2.bPJ().Zv().bD(new Object[0]));
            return;
        }
        assert (fig2.oS() != null);
        assert (fig2.oT() != null);
        assert (fig2.oY() > 0);
        assert (fig2.oR() != null);
        if (this.oP()) {
            assert (false);
            fih fih2 = (fih)this.MessageDelegator.h(23835, this.getGUID(), fig2.oS());
            fih2.iML = this.hF.getGUID();
            fih2.sk(2);
            this.MessageDelegator.F(fih2);
            return;
        }
        this.atb = fig2.oS();
        this.Y(fig2.oT());
        this.ate = fig2.oR();
        this.atf = fig2.oY();
        this.atg = true;
        this.oV();
        this.hF.c(fig2.bPJ().Zv().bD(new Object[0]));
        this.a(cgz.ezx);
    }

    private void a(fhi fhi2) {
        fhj fhj2 = (fhj)this.MessageDelegator.h(23840, this.hF.getGUID(), fhi2.aO());
        this.MessageDelegator.b(fhi2, fhj2);
        fhj2.aGQ = this.atb;
        fhj2.atc = this.atc;
        fhj2.atd = this.atd;
        fhj2.atf = this.atf;
        fhj2.atg = this.atg;
        fhj2.YU = this.hF.iP();
        fhj2.YV = this.hF.iR();
        this.MessageDelegator.F(fhj2);
    }

    private void a(fho fho2) {
        if (this.oO() || this.asW) {
            if (this.asW) {
                // empty if block
            }
            fhp fhp2 = (fhp)this.MessageDelegator.h(23842, this.getGUID(), fho2.aO());
            this.MessageDelegator.b(fho2, fhp2);
            fhp2.ew = 1;
            this.MessageDelegator.F(fhp2);
            return;
        }
        if (this.hF.kv() && !iw.nA()) {
            fhp fhp3 = (fhp)this.MessageDelegator.h(23842, this.getGUID(), fho2.aO());
            this.MessageDelegator.b(fho2, fhp3);
            fhp3.ew = 4;
            this.MessageDelegator.F(fhp3);
            return;
        }
        this.asW = true;
        this.atn = fho2;
        fho fho3 = (fho)this.MessageDelegator.h(23841, this.getGUID(), fho2.aGQ);
        fho3.aGQ = fho2.aGQ;
        fho3.iMt = fho2.iMt;
        fho3.iMv = this.hF.iP();
        fho3.iMw = this.hF.iR();
        fho3.iMu = this.hF.getGUID();
        this.MessageDelegator.F(fho3);
    }

    private void a(fhp fhp2) {
        assert (this.atn != null);
        this.MessageDelegator.b(this.atn, fhp2);
        fhp2.on(this.atn.aO());
        this.MessageDelegator.F(fhp2);
        this.atn = null;
        this.asW = false;
        if (fhp2.ew != 5) {
            return;
        }
        if (this.atb != null && !this.atb.equals(fhp2.atb)) {
            assert (this.atg);
            fih fih2 = (fih)this.MessageDelegator.h(23835, this.getGUID(), this.atb);
            fih2.iML = this.hF.getGUID();
            fih2.sk(1);
            this.MessageDelegator.F(fih2);
        }
        this.atb = fhp2.atb;
        this.Y(fhp2.atc);
        this.ate = fhp2.ate;
        this.atf = fhp2.atf;
        this.atg = false;
        this.oV();
        this.hF.c(mcc.urK.bD(new Object[0]));
    }

    private void a(fik fik2) {
        assert (this.oO());
        assert (this.atb.equals(fik2.aGQ));
        if (this.atd == null) {
            this.atd = "Unknown";
        }
        switch (fik2.gKV) {
            case 1: {
                this.hF.c(mbx.uoE.bD(new Object[0]));
                break;
            }
            case 2: {
                this.hF.c(mbx.uoF.bD(new Object[0]));
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
        this.oQ();
    }

    private void a(fij fij2) {
        assert (this.atg);
        assert (this.oP());
        if (this.atd == null) {
            this.atd = "Unknown";
        }
        switch (fij2.gKV) {
            case 1: {
                this.hF.c(mcb.urx.bD(new Object[0]));
                break;
            }
            case 2: {
                this.hF.c(mcb.urw.bD(new Object[0]));
                break;
            }
            case 3: {
                this.hF.c(mcb.uru.bD(new Object[0]));
                break;
            }
            case 4: {
                this.hF.c(mcb.urv.bD(new Object[0]));
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
        this.oQ();
    }

    private void a(fhm fhm2) {
        fhn fhn2 = (fhn)this.MessageDelegator.h(23817, this.getGUID(), fhm2.aO());
        this.MessageDelegator.b(fhm2, fhn2);
        fhn2.YU = this.hF.iP();
        fhn2.YV = this.hF.iR();
        fhn2.diQ = this.hF.getGUID();
        if (!fhm2.iMq) {
            if (this.oO()) {
                fhn2.ew = 2;
                this.MessageDelegator.F(fhn2);
                return;
            }
            if (this.atb != null) {
                assert (false) : "Already owning a house?";
                assert (this.atg);
                fih fih2 = (fih)this.MessageDelegator.h(23835, this.getGUID(), this.atb);
                fih2.iML = this.hF.getGUID();
                fih2.sk(1);
                this.MessageDelegator.F(fih2);
            }
            this.atb = fhm2.atb;
            this.Y(fhm2.atc);
            this.ate = fhm2.ate;
            this.atf = fhm2.atf;
            this.atg = false;
            fhn2.ew = 1;
            this.MessageDelegator.F(fhn2);
        } else {
            if (this.oO()) {
                fhn2.ew = 2;
                this.MessageDelegator.F(fhn2);
                return;
            }
            if (this.atb != null) {
                assert (false) : "Already a tenant";
                assert (this.atg);
                fhn2.ew = 3;
                this.MessageDelegator.F(fhn2);
                return;
            }
            this.atb = fhm2.atb;
            this.Y(fhm2.atc);
            this.ate = fhm2.ate;
            this.atf = fhm2.atf;
            this.atg = true;
            fhn2.ew = 1;
            this.MessageDelegator.F(fhn2);
        }
    }

    private void oQ() {
        this.atb = null;
        this.Y(null);
        this.ate = null;
        this.atf = -1;
        this.atg = false;
        this.oW();
        if (this.aQ().jf() != null && this.aQ().jf().aMz() != null) {
            this.aQ().jf().aMz().a(cwf.a.fEi);
        }
    }

    public final ljq oR() {
        return this.ate;
    }

    public final void X(ljq ljq2) {
        this.ate = ljq2;
    }

    public final ldv oS() {
        return this.atb;
    }

    public final ljq oT() {
        return this.atc;
    }

    public final void Y(ljq ljq2) {
        this.atc = ljq2;
        if (this.atc != null) {
            lej lej2 = lcw.dW((ljq)this.atc);
            this.atd = lcw.f((lej)lej2);
            this.atd = lea.eoS().get(this.atd.toLowerCase());
        }
    }

    public final String oU() {
        return this.atd;
    }

    private void oV() {
        if (!this.hF.iY()) {
            return;
        }
        if (this.atb == null || this.atc == null) {
            return;
        }
        if (this.MessageDelegator == null) {
            return;
        }
        this.oW();
        assert (this.MessageDelegator != null) : "MessageDelegator is null!. GUID = " + this.GUID;
        assert (this.hF != null);
        eaa eaa2 = (eaa)this.MessageDelegator.h(22785, this.getGUID(), this.hF.getGUID());
        eaa2.Position = this.atc;
        eaa2.aFo = this.atd;
        eaa2.ResourceType = cug.fri;
        eaa2.aFp = false;
        eaa2.aqs = 1;
        this.hF.receiveMessage((dxq)eaa2);
    }

    private void oW() {
        if (this.atp == null) {
            return;
        }
        eae eae2 = (eae)this.MessageDelegator.h(22786, this.getGUID(), this.hF.getGUID());
        eae2.iks = this.atp.ID;
        eae2.aqs = 2;
        this.hF.receiveMessage((dxq)eae2);
        this.atp = null;
    }

    private void a(eaf eaf2) {
        if (eaf2.aVk() == 2) {
            if (eaf2.ex != 3) {
                return;
            }
            return;
        }
        if (eaf2.aVk() == 1) {
            this.oW();
            if (eaf2.ex != 2) {
                assert (false);
                return;
            }
            if (eaf2.Zn == null) {
                lfn.b(5, "SFPlayerHousePersistenceInfo", "handleAnnotationResponseMessage() Annotations == null");
                assert (false);
                return;
            }
            if (eaf2.Zn.length != 1) {
                lfn.b(5, "SFPlayerHousePersistenceInfo", "handleAnnotationResponseMessage() Annotations.length != 1: " + eaf2.Zn.length);
                assert (false);
                return;
            }
            this.atp = eaf2.Zn[0];
            return;
        }
        assert (false);
    }

    public void lx() {
        this.atp = null;
    }

    public void lw() {
        this.oV();
    }

    private void oX() {
    }

    public void lM() {
        if (this.atb == null) {
            this.oX();
            return;
        }
        if (this.MessageDelegator == null) {
            this.oX();
            return;
        }
        fhg fhg2 = (fhg)this.MessageDelegator.h(23845, this.getGUID(), this.atb);
        fhg2.diQ = this.hF.getGUID();
        this.MessageDelegator.F(fhg2);
    }

    private void a(fhh fhh2) {
        switch (fhh2.ew) {
            case 1: {
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                break;
            }
        }
        this.oX();
    }

    public void a(cgz cgz2) {
        fsu fsu2 = (fsu)this.MessageDelegator.h(30219, this.getGUID(), this.hF.getGUID());
        fsu2.eAd = cgz2;
        this.MessageDelegator.I(fsu2);
    }

    private void d(int n, ljq ljq2) {
        fth fth2 = (fth)this.MessageDelegator.h(30218, this.getGUID(), this.hF.getGUID());
        fth2.Position = ljq2;
        fth2.ResourceType = n;
        this.MessageDelegator.I(fth2);
    }

    public final int oY() {
        return this.atf;
    }
}

