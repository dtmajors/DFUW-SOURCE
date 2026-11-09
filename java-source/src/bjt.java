/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 *  lcr
 */
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class bjt
extends btk
implements bto,
cbq {
    private final bjx dpf;
    private ckx dpj;
    private ccs dpz;
    private ckx dpA;
    private ckx dpB;
    private static final int dpC = 1;
    private static final int dpD = 2;
    private static final int dpE = 3;
    private static final int dpF = 4;
    private static final int dpG = 5;
    private static final int dpH = 6;
    private double dpI = 0.0;
    private ldv dpw = null;
    private bfl dpJ = null;
    private static final float dpr = 1.0f;
    public double dpK = 2700.0;
    private double dpL = 300.0;
    private double aFe = 0.0;
    private double dpM = 0.0;
    private ljq dpN;
    private lgl dpO;
    private ldv aUa = null;
    private boolean dpP = false;
    private boolean bWS = true;

    public bjt(bjx bjx2) {
        this.dpf = bjx2;
    }

    private boolean aqj() {
        return this.bWS;
    }

    public double aqk() {
        return this.dpK;
    }

    public void aR(double d2) {
        this.dpK = d2;
    }

    public final void a(ckx ckx2) {
        this.dpj = ckx2;
        this.aql();
    }

    private void aql() {
        Map<String, eh> map = ei.ao(this.dpj.aAG().getFileName());
        if (map == null) {
            assert (false);
            return;
        }
        eh eh2 = map.get("AttachPoint Fortress Main");
        if (eh2 == null) {
            assert (false);
            return;
        }
        ljq ljq2 = new ljq();
        lgl lgl2 = new lgl();
        eh2.a(this.dpj.aAG().azb(), this.dpj.aAG().azc(), ljq2, lgl2);
        this.dpN = ljq2;
        this.dpO = lgl2;
    }

    public void aqm() {
        assert (this.dpN != null);
        assert (this.dpO != null);
        if (this.dpM + this.dpL > this.MessageDelegator.arc().rgz) {
            this.dp(true);
        } else if (this.aqj()) {
            this.do(true);
        } else {
            this.dq(true);
        }
    }

    private void do(boolean bl2) {
        assert (this.dpj != null);
        String string = this.dpj.pa();
        string = string.replace(" Base", " Invulnerable");
        int n = lea.enW().getType(string);
        assert (n > 0);
        assert (this.dpN != null);
        assert (this.dpO != null);
        fem fem2 = (fem)this.MessageDelegator.h(25345, this.getGUID(), lcr.qBI);
        fem2.sk(bl2 ? 4 : 3);
        fem2.l(n);
        fem2.c(this.dpN);
        fem2.a(this.dpO);
        fem2.jS(true);
        fem2.oF(this.getGUID());
        this.MessageDelegator.F(fem2);
    }

    private void dp(boolean bl2) {
        assert (this.dpj != null);
        String string = this.dpj.pa();
        string = string.replace(" Base", " Main Rubble");
        int n = lea.enW().getType(string);
        assert (n > 0);
        assert (this.dpN != null);
        assert (this.dpO != null);
        fem fem2 = (fem)this.MessageDelegator.h(25345, this.getGUID(), lcr.qBI);
        fem2.sk(bl2 ? 2 : 1);
        fem2.l(n);
        fem2.c(this.dpN);
        fem2.a(this.dpO);
        fem2.jS(true);
        fem2.oF(this.getGUID());
        this.MessageDelegator.F(fem2);
        if (!bl2) {
            this.dpM = this.MessageDelegator.arc().rgz;
        }
    }

    private void dq(boolean bl2) {
        assert (this.dpj != null);
        String string = this.dpj.pa();
        string = string.replace(" Base", " Main");
        int n = lea.enW().getType(string);
        assert (n > 0);
        assert (this.dpN != null);
        assert (this.dpO != null);
        ecr ecr2 = (ecr)this.MessageDelegator.h(19457, this.getGUID(), lcr.qBq);
        ecr2.sk(bl2 ? 6 : 5);
        ecr2.l(n);
        ecr2.c(this.dpN);
        ecr2.a(this.dpO);
        ecr2.jS(true);
        ecr2.oF(this.getGUID());
        this.MessageDelegator.F(ecr2);
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.dpP) {
            if (this.MessageDelegator.bzx().bzt().dVA() == kdw.a.phY) {
                this.aqn();
                this.dpP = true;
            }
            return;
        }
        if (this.aFe > 0.0) {
            this.aFe -= ldz2.qwh;
            this.aqz();
        }
        this.aqy();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 19458: {
                this.a((ecs)dxq2);
                break;
            }
            case 25346: {
                this.a((fen)dxq2);
                break;
            }
            case 12812: {
                this.a((eeg)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void aqn() {
        bbi bbi2 = new bbi();
        bbi2.setGUID(this.dpf.getGUID());
        bbi2.c(this.dpj.aAG().av());
        if (this.aqC()) {
            bbi2.ao(this.dpM + this.dpL);
            bbi2.aJ(bbi2.acU() - this.dpL);
        } else if (this.aqj()) {
            if (this.aFe > 0.0) {
                bbi2.ao(this.MessageDelegator.arc().rgz + this.aFe);
                bbi2.aJ(bbi2.acU() - this.dpK);
            } else {
                bbi2.ao(-1.0);
                bbi2.aJ(0.0);
            }
        } else {
            bbi2.ao(0.0);
            bbi2.aJ(0.0);
        }
        bbi2.cN(this.aqB());
        bbi2.ch(this.dpf.abj());
        bbi2.fk(this.dpf.akc().replace(' ', '_').toLowerCase());
        bjz bjz2 = lea.epc().get(this.dpf.akc().toLowerCase());
        bbi2.aL(bjz2.ara());
        bbi2.aK(this.MessageDelegator.arc().rgz - this.dpf.aqV());
        gur gur2 = (gur)this.MessageDelegator.h(32270, this.dpf.getGUID(), lcr.qEx);
        gur2.e(bbi2);
        this.MessageDelegator.F(gur2);
    }

    private void aqo() {
        guq guq2 = (guq)this.MessageDelegator.h(32271, this.dpf.getGUID(), lcr.qEx);
        guq2.cj(this.dpf.getGUID());
        guq2.jv(this.dpf.abj());
        this.MessageDelegator.F(guq2);
    }

    private void aqp() {
        gus gus2 = (gus)this.MessageDelegator.h(32272, this.dpf.getGUID(), lcr.qEx);
        gus2.cj(this.dpf.getGUID());
        if (this.aqC()) {
            gus2.ao(this.dpM + this.dpL);
            gus2.aJ(gus2.acU() - this.dpL);
        } else if (this.aqj()) {
            if (this.aFe > 0.0) {
                gus2.ao(this.MessageDelegator.arc().rgz + this.aFe);
                gus2.aJ(gus2.acU() - this.dpK);
            } else {
                gus2.ao(-1.0);
                gus2.aJ(0.0);
            }
        } else {
            gus2.ao(0.0);
            gus2.aJ(0.0);
        }
        gus2.cN(this.aqB());
        bjz bjz2 = lea.epc().get(this.dpf.akc().toLowerCase());
        gus2.aL(bjz2.ara());
        gus2.aK(this.MessageDelegator.arc().rgz - this.dpf.aqV());
        this.MessageDelegator.F(gus2);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    private void a(ecs ecs2) {
        glc glc2;
        assert (ecs2.bFA() != null);
        this.dpz = ecs2.bFA();
        this.MessageDelegator.a((amf)((Object)this.dpz));
        this.dpz.a(this);
        this.bWS = false;
        if (ecs2.aVk() == 5) {
            assert (del.gjy > 0);
            this.dpz.l(del.gjy, this.dpf.aqU());
        } else {
            assert (ecs2.aVk() == 6);
            this.aFe = 0.0;
            this.aqu();
        }
        if (this.aUa != null) {
            glc2 = (glj)this.MessageDelegator.h(13058, this.GUID, lcr.qEb);
            glc2.aUa = this.aUa;
            glc2.jkV = 1;
            this.MessageDelegator.F(glc2);
        }
        this.aUa = this.MessageDelegator.lL(lcr.qEb);
        glc2 = (glh)this.MessageDelegator.h(13057, this.GUID, lcr.qEb);
        ((glh)glc2).SpecialEffectType = del.glp;
        ((glh)glc2).aZG = null;
        ((glh)glc2).akX = this.dpz.KY();
        ((glh)glc2).aZD = this.dpN;
        ((glh)glc2).aUa = this.aUa;
        this.MessageDelegator.F(glc2);
        this.i(this.dpz);
        this.i(this.dpj);
        if (this.dpP) {
            this.aqp();
        }
    }

    private void a(fen fen2) {
        assert (fen2.bOM() != null);
        if (fen2.aVk() == 1 || fen2.aVk() == 2) {
            this.dpA = fen2.bOM();
            this.MessageDelegator.a((amf)((Object)this.dpA));
            this.dpA.l(del.glo, this.dpf.aqU());
            this.bWS = true;
            this.i(this.dpA);
        } else if (fen2.aVk() == 3) {
            glc glc2;
            this.dpB = fen2.bOM();
            this.MessageDelegator.a((amf)((Object)this.dpB));
            assert (del.gjx > 0);
            this.dpB.l(del.gjx, this.dpf.aqU());
            if (this.aUa != null) {
                glc2 = (glj)this.MessageDelegator.h(13058, this.GUID, lcr.qEb);
                glc2.aUa = this.aUa;
                glc2.jkV = 1;
                this.MessageDelegator.F(glc2);
            }
            this.aUa = this.MessageDelegator.lL(lcr.qEb);
            glc2 = (glh)this.MessageDelegator.h(13057, this.GUID, lcr.qEb);
            ((glh)glc2).SpecialEffectType = del.gln;
            ((glh)glc2).aZG = null;
            ((glh)glc2).akX = this.dpB.KY();
            ((glh)glc2).aZD = this.dpN;
            ((glh)glc2).aUa = this.aUa;
            this.MessageDelegator.F(glc2);
            this.bWS = true;
            this.i(this.dpB);
            this.dpf.aqi();
        } else if (fen2.aVk() == 4) {
            this.dpB = fen2.bOM();
            this.MessageDelegator.a((amf)((Object)this.dpB));
            this.aqu();
            this.aUa = this.MessageDelegator.lL(lcr.qEb);
            glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, lcr.qEb);
            glh2.SpecialEffectType = del.gln;
            glh2.aZG = null;
            glh2.akX = this.dpB.KY();
            glh2.aZD = this.dpN;
            glh2.aUa = this.aUa;
            this.MessageDelegator.F(glh2);
            this.bWS = true;
            this.i(this.dpB);
        } else assert (false);
        this.i(this.dpj);
        if (this.dpP) {
            this.aqp();
        }
    }

    private void aqq() {
        if (this.dpz == null) {
            return;
        }
        ecx ecx2 = (ecx)this.MessageDelegator.h(19459, this.getGUID(), lcr.qBq);
        ecx2.elQ = this.dpz.getGUID();
        ecx2.ilY = true;
        this.MessageDelegator.F(ecx2);
        this.MessageDelegator.hd(this.dpz.getGUID());
        this.dpz = null;
    }

    private void aqr() {
        if (this.dpA == null) {
            return;
        }
        feq feq2 = (feq)this.MessageDelegator.h(25347, this.getGUID(), lcr.qBI);
        feq2.iKB = this.dpA.getGUID();
        feq2.iFu = true;
        this.MessageDelegator.F(feq2);
        this.MessageDelegator.hd(this.dpA.getGUID());
        this.dpA = null;
    }

    private void aqs() {
        if (this.dpB == null) {
            return;
        }
        feq feq2 = (feq)this.MessageDelegator.h(25347, this.getGUID(), lcr.qBI);
        feq2.iKB = this.dpB.getGUID();
        feq2.iFu = true;
        this.MessageDelegator.F(feq2);
        this.MessageDelegator.hd(this.dpB.getGUID());
        this.dpB = null;
    }

    @Override
    public void b(cbx cbx2) {
        assert (cbx2 == this.dpz);
    }

    @Override
    public boolean b(cbx cbx2, et et2) {
        if (cbx2 != this.dpz) {
            return true;
        }
        if (et2.getType() != 352) {
            return true;
        }
        bfl bfl2 = (bfl)this.dpz.aIv().aof();
        if (bfl2 == null) {
            lfn.b(5, "SFFortressSystemMainElementManager", "handleFloatAttributeBelowMin() LastEventOccured is null.");
            lfn.b(5, "SFFortressSystemMainElementManager", "handleFloatAttributeBelowMin() Either a bug or someone changed the health through a chatcommand.");
            return false;
        }
        assert (bfl2.aYF != null);
        if (this.dpw != null) {
            return false;
        }
        if (bfl2.aYF == null) {
            this.aqx();
            et2.o(1.0f);
            return false;
        }
        this.dpJ = bfl2;
        if (lea.enW().isDescendant(bfl2.bsG, cug.fgG)) {
            this.aqx();
            et2.o(1.0f);
            return false;
        }
        this.dpw = lcr.tQ((ldv)bfl2.aYF);
        eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), this.dpw);
        this.MessageDelegator.F(eef2);
        return false;
    }

    private void a(eeg eeg2) {
        fcn fcn2;
        if (!ldv.tU(eeg2.iG())) {
            this.d(this.dpw, maw.ufG.bD(new Object[0]));
            this.dpw = null;
            this.dpJ = null;
            et et2 = (et)this.dpz.fi().ae(352);
            this.aqx();
            et2.o(1.0f);
            return;
        }
        if (eeg2.kv() && !iw.nE()) {
            this.d(this.dpw, mdc.uEO.bD(new Object[0]));
            this.dpw = null;
            this.dpJ = null;
            et et3 = (et)this.dpz.fi().ae(352);
            this.aqx();
            et3.o(1.0f);
            return;
        }
        if (this.dpJ != null) {
            this.dpz.aIv().a(5, this.dpJ);
        }
        this.aqw();
        this.dr(true);
        if (this.dpf.abj() != null && !this.dpf.abj().equals(eeg2.iG())) {
            fcn2 = (fcb)this.MessageDelegator.h(24838, this.getGUID(), this.dpf.abj());
            ((fcb)fcn2).aET = eeg2.iV();
            ((fcb)fcn2).iFf = 2;
            ((fcb)fcn2).cQE = this.dpf.getGUID();
            this.MessageDelegator.F(fcn2);
        }
        fcn2 = (fca)this.MessageDelegator.h(24837, this.getGUID(), eeg2.iG());
        fcn2.iFc = this.dpw;
        fcn2.cQE = this.dpf.getGUID();
        fcn2.cQG = this.dpf.akc();
        fcn2.cQF = this.dpz.aAG().av();
        fcn2.gKV = this.dpf.abj() != null && this.dpf.abj().equals(eeg2.iG()) ? 1 : 2;
        this.MessageDelegator.F(fcn2);
        this.dpw = null;
        this.dpI = this.MessageDelegator.arc().rgz;
        this.b(eeg2.iG(), eeg2.iV(), eeg2.iP(), eeg2.iR());
    }

    public void aqt() {
        this.aFe = this.dpK;
        this.aqu();
        if (this.MessageDelegator != null) {
            if (this.dpz != null) {
                this.i(this.dpz);
            }
            if (this.dpB != null) {
                this.i(this.dpB);
            }
            this.i(this.dpj);
        }
        if (this.dpP) {
            this.aqp();
        }
    }

    private void aqu() {
    }

    private void aqv() {
        this.aFe = 0.0;
        if (this.dpz != null && this.MessageDelegator != null) {
            this.i(this.dpz);
            this.i(this.dpj);
        }
        if (this.dpP) {
            this.aqp();
        }
    }

    private void b(ldv ldv2, String string, String string2, String string3) {
        this.dpf.c(string, ldv2);
        this.aqq();
        this.dp(false);
    }

    public void d(ldv ldv2, loz loz2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, ldv2);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    private void dr(boolean bl2) {
        ez ez2 = (ez)this.dpz.fi().ae(352);
        assert (ez2 != null);
        if (bl2) {
            ez2.a(ep.a.Pe);
        } else {
            ez2.a(ep.a.Pg);
        }
    }

    private void aqw() {
        this.aqx();
        ((ez)this.dpz.jm().ah(352)).ga();
    }

    protected void aqx() {
        ej ej2 = this.dpz.fi().ae(352);
        if (ej2 == null) {
            lfn.b(5, "SFFortressSystemMainElementManager", "enableAttributeNotification() No Health Attribute!");
            return;
        }
        if (!(ej2 instanceof ex)) {
            lfn.b(5, "SFFortressSystemMainElementManager", "enableAttributeNotification() Health NOT limited float attribute");
            return;
        }
        ex ex2 = (ex)ej2;
        ex2.y(true);
    }

    @Override
    public void a(cbx cbx2, et et2) {
        if (et2.getType() != 352) {
            return;
        }
        if (cbx2.jm() != null) {
            float f = et2.fN() / cbx2.jm().ai(352);
        }
    }

    private void aqy() {
        if (this.dpA == null) {
            return;
        }
        if (this.dpM + this.dpL > this.MessageDelegator.arc().rgz) {
            return;
        }
        this.aqr();
        this.do(false);
    }

    private void aqz() {
        if (this.dpB == null) {
            return;
        }
        if (this.aFe > 0.0) {
            return;
        }
        this.aqv();
        assert (this.dpB != null);
        this.aqs();
        this.dpf.aqN();
        this.dq(false);
        if (this.dpf.abj() != null) {
            fcd fcd2 = (fcd)this.MessageDelegator.h(24839, this.getGUID(), this.dpf.abj());
            fcd2.ija = 1;
            fcd2.cQE = this.getGUID();
            this.MessageDelegator.F(fcd2);
        }
    }

    public final double aqA() {
        return this.aFe;
    }

    public final void aS(double d2) {
        this.aFe = d2;
        if (this.MessageDelegator != null) {
            if (this.dpz != null) {
                this.i(this.dpz);
            }
            if (this.dpB != null) {
                this.i(this.dpB);
            }
            this.i(this.dpj);
        }
        if (this.dpP) {
            this.aqp();
        }
    }

    public boolean aaW() {
        return !this.aqj();
    }

    public boolean aqB() {
        return this.dpA != null;
    }

    public boolean aqC() {
        return this.MessageDelegator.arc().rgz < this.dpM + this.dpL;
    }

    public void c(double d2, boolean bl2) {
        if (this.aaW() || this.aqB()) {
            return;
        }
        this.aFe = bl2 ? d2 : (this.aFe += d2);
        if (this.aFe < 0.0) {
            this.aFe = 60.0;
        }
        if (this.MessageDelegator != null) {
            if (this.dpz != null) {
                this.i(this.dpz);
            }
            if (this.dpB != null) {
                this.i(this.dpB);
            }
            this.i(this.dpj);
        }
        this.aqu();
        if (this.dpP) {
            this.aqp();
        }
    }

    public void b(String string, ldv ldv2) {
        if (this.dpz != null) {
            this.i(this.dpz);
        }
        if (this.dpB != null) {
            this.i(this.dpB);
        }
        this.i(this.dpj);
        this.aqo();
    }

    public void apO() {
        if (this.dpz != null) {
            this.i(this.dpz);
        }
        if (this.dpB != null) {
            this.i(this.dpB);
        }
        this.i(this.dpj);
    }

    private void i(cbx cbx2) {
        if (cbx2 == null) {
            return;
        }
        cbx2.fi().a(12384, this.MessageDelegator.arc().rgz + this.aFe);
        cbx2.fi().f(12416, this.aaW());
        cbx2.fi().f(12704, this.aqB());
        cbx2.fi().b(12304, this.dpf.abj());
        cbx2.fi().b(12320, this.dpf.abk());
    }

    public void fN(String string) {
        if (string == null) {
            return;
        }
        bjz bjz2 = lea.epc().get(string.toLowerCase());
        this.dpK = bjz2.aqY();
    }

    public double aqD() {
        return this.dpL;
    }

    public void aT(double d2) {
        this.dpL = d2;
    }

    public double aqE() {
        return this.dpM;
    }

    public void aU(double d2) {
        this.dpM = d2;
    }
}

