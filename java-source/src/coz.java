/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cph
 *  cug
 *  cxd
 *  lcr
 */
import java.util.Map;

public class coz
extends cox {
    public static final int eRs = 3;
    private cph eRt = null;
    private bfu elg = null;
    private ljq eRu = null;
    private lgl eRv = null;
    private cbq elf = null;
    private double eRw = 0.0;
    private boolean eRx = false;
    private boolean eRy = false;
    private static int[] eRz = null;
    private static int[] eRA = null;
    private boolean eRB = false;
    private float eRC = 0.0f;
    private int[] eRD = null;
    private int[] eRE = null;

    public coz() {
        super(true);
        this.aVo();
        this.elg = new bfu((cbx)this);
        if (eRz == null) {
            eRz = new int[]{cug.fgE, cug.fnJ, cug.fnc, cug.fpV};
        }
        if (eRA == null) {
            eRA = new int[]{cug.fnE};
        }
    }

    public final bfq aIv() {
        return this.elg;
    }

    protected void aVo() {
        this.eTh = false;
        this.eTf = true;
        this.eTg = false;
        this.eTi = 0.0f;
        this.eTj = 0.01f;
        this.eTm = 2.0;
        this.eTo = 3600.0;
    }

    @Override
    protected void aIw() {
        super.aIw();
    }

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.elg.doTick(ldz2);
        this.aqR();
        if (!this.aXX() && this.aXv()) {
            this.aXA();
        }
    }

    private void aqR() {
        if (this.ePI) {
            return;
        }
        if (this.aAG() == null) {
            return;
        }
        Map<String, eh> map = ei.ao(this.aAG().getFileName());
        assert (map != null);
        eh eh2 = map.get("AttachPoint_Gun Shoot");
        if (eh2 == null) {
            lfn.b(5, "SFGunServer", "setupAttachPoints() ATTACHPOINT_GUN_SHOOT is null for Filename=" + this.aAG().getFileName());
            assert (false);
            return;
        }
        this.eRu = eh2.fb();
        this.eRv = new lgl(eh2.getRotation());
        this.ePI = true;
    }

    private void u(lgl lgl2) {
        if (this.aAG() == null) {
            return;
        }
        if (this.aAG().getGUID() == null) {
            return;
        }
        knj knj2 = (knj)this.MessageDelegator.h(778);
        knj2.ehv = this.aSN();
        knj2.ehw = this.aAG().axa();
        knj2.ec = this.getGUID();
        knj2.dsK = false;
        knj2.iBr = false;
        knj2.hsP = false;
        knj2.doP = this.aSO();
        knj2.biF = lgl2;
        knj2.biE = this.aSK();
        knj2.ec = this.getGUID();
        knj2.pPN = 256;
        this.MessageDelegator.a(knj2);
        gyv gyv2 = (gyv)this.MessageDelegator.h(12047, this.getGUID(), lcr.qAI);
        gyv2.doP = this.aSQ();
        gyv2.biF = lgl2;
        gyv2.ija = 5;
        gyv2.biC = 256;
        this.MessageDelegator.F(gyv2);
    }

    public void n(ljq ljq2, lgl lgl2) {
        if (this.eQR == 0) {
            this.eRC = 0.0f;
            this.eRD = null;
            this.eRE = null;
            int n = this.eQU.aBV();
            assert (n > 0);
            this.z(n, false);
            return;
        }
        if (this.eQR > 0) {
            --this.eQR;
        }
        switch (this.eQU.aBX()) {
            case 1: {
                this.q(ljq2, lgl2);
                break;
            }
            case 2: {
                this.p(ljq2, lgl2);
                break;
            }
            case 3: {
                this.o(ljq2, lgl2);
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
        if (this.eQR == 0) {
            this.eTh = true;
            this.eTj *= 3.0f;
            if (this.eSW != null) {
                this.ly(this.eSW);
                this.lk(this.eSW);
            }
        }
    }

    private void o(ljq ljq2, lgl lgl2) {
        ljq ljq3 = new ljq(ljq2);
        ljq ljq4 = new ljq(this.eRu);
        ljq3.es(lgl2.eq(ljq4));
        ljq ljq5 = new ljq(0.0f, 0.0f, 1.0f);
        ljq ljq6 = lgl2.eq(ljq5);
        ljq6.normalize();
        ljq6.normalize();
        fcz fcz2 = (fcz)this.MessageDelegator.h(9230, this.GUID, this.MessageDelegator.getGUID());
        fcz2.gbh = this.eQU.aCb();
        fcz2.aZH = ljq3;
        fcz2.Position = ljq3;
        fcz2.mx = ljq6;
        fcz2.akO = this.eQU.aCc();
        fcz2.gfq = lgl2;
        fcz2.Radius = this.eQU.aBB();
        fcz2.bst = bkd.dqE;
        fcz2.aZG = this.GUID;
        fcz2.akX = this.GUID;
        fcz2.dsD = this.KY();
        if (this.aXq() != null) {
            fcz2.aYF = this.aXq();
        } else {
            assert (this.eSX != null);
            fcz2.aYF = this.eSX;
        }
        fcz2.bsG = this.az();
        fcz2.aYC = cxd.fJY;
        fcz2.Magnitude = this.eQU.aou() + this.eRC;
        fcz2.eKm = -3.0;
        fcz2.aSp = 1.0f;
        fcz2.gpI = 5.0;
        fcz2.eKm = 6.0;
        fcz2.aYH = 1;
        fcz2.aYG = this.eQU.aBA();
        fcz2.bsE = 0;
        fcz2.bRD = 1;
        fcz2.gpI = -3.0;
        fcz2.iJC = this.eRD;
        fcz2.iJD = this.eRE;
        fcz2.dta = !this.aWE() ? eRz : eRA;
        fcz2.iJH = bkd.dqy;
        this.MessageDelegator.H(fcz2);
    }

    private void p(ljq ljq2, lgl lgl2) {
        Cloneable cloneable;
        ljq ljq3 = new ljq(ljq2);
        lgl lgl3 = new lgl(lgl2);
        ljq ljq4 = new ljq(this.eRu);
        ljq3.es(lgl3.eq(ljq4));
        ljq ljq5 = new ljq(0.0f, 0.0f, 1.0f);
        ljq5 = lgl3.eq(ljq5);
        ljq5.normalize();
        ljq ljq6 = ljq5;
        if (this.eQU.aCb() > 0) {
            cloneable = this.aAG().getGUID();
            this.a(this.eQU.aCb(), (ldv)cloneable, ljq3, (ldv)cloneable, lgl2, this.eRu);
        }
        cloneable = (fdd)this.MessageDelegator.h(9233, this.GUID, this.MessageDelegator.getGUID());
        ((fdd)cloneable).akO = this.eQU.aBB();
        ((fdd)cloneable).bst = bkd.dqF;
        ((fdd)cloneable).aZG = this.GUID;
        ((fdd)cloneable).akX = this.GUID;
        if (this.aXq() != null) {
            ((fdd)cloneable).aYF = this.aXq();
        } else {
            assert (this.eSX != null);
            ((fdd)cloneable).aYF = this.eSX;
        }
        ((fdd)cloneable).bsG = this.az();
        ((fdd)cloneable).aYC = cxd.fJY;
        ((fdd)cloneable).Magnitude = this.eQU.aou() + this.eRC;
        ((fdd)cloneable).eKm = -3.0;
        ((fdd)cloneable).aSp = 1.0f;
        ((fdd)cloneable).aYH = 1;
        ((fdd)cloneable).aYG = this.eQU.aBA();
        ((fdd)cloneable).bsE = 0;
        ((fdd)cloneable).bRD = 1;
        ((fdd)cloneable).gpI = -3.0;
        ((fdd)cloneable).aZH = this.aAG().av();
        ((fdd)cloneable).mx = ljq6;
        ((fdd)cloneable).Position = ljq3;
        ((fdd)cloneable).iJC = this.eRD;
        ((fdd)cloneable).iJD = this.eRE;
        ((fdd)cloneable).dta = !this.aWE() ? eRz : eRA;
        ((fdd)cloneable).gbe = bkd.dqy;
        this.MessageDelegator.H((dxq)cloneable);
        if (this.eQU.aBK() > 0) {
            fdd fdd2 = (fdd)((dxq)cloneable).clone();
            ((fdd)cloneable).aYG = this.eQU.aBK();
            this.MessageDelegator.H(fdd2);
        }
    }

    private void q(ljq ljq2, lgl lgl2) {
        ljq ljq3 = new ljq(ljq2);
        ljq ljq4 = new ljq(this.eRu);
        ljq3.es(lgl2.eq(ljq4));
        ljq ljq5 = new ljq(0.0f, 0.0f, 1.0f);
        assert (this.eQU != null);
        bwo bwo2 = (bwo)lea.eoj().get(this.eQU.aBD());
        assert (bwo2 != null);
        bws bws2 = new bws();
        bws2.setGUID(this.MessageDelegator.lL(lcr.qAe));
        bws2.kb(this.GUID);
        bws2.ff(bwo2.getType());
        bws2.c(ljq3);
        bws2.a(new lgl(lgl2));
        bws2.v(this.MessageDelegator.arc().rgz);
        bws2.setStartDirection(ljq5);
        ldv[] ldvArray = new ldv[]{this.aAG().axa(), this.aSN()};
        bws2.c(ldvArray);
        this.MessageDelegator.a(bws2);
    }

    public boolean a(ldv ldv2, ldv ldv3, ldv ldv4, ldv ldv5, cph cph2) {
        assert (ldv2 != null);
        if (this.aWF()) {
            return false;
        }
        if (this.eQR == 0) {
            return false;
        }
        this.c(ldv2, ldv4, ldv5, ldv3);
        this.aXQ();
        this.fi().f(12544, true);
        if (this.eRt != null) {
            this.eRt.fi().f(12544, true);
            this.eRt.fi().b(10432, (String)null);
        } else {
            this.fi().b(10432, (String)null);
        }
        return true;
    }

    public void lk(ldv ldv2) {
        assert (ldv2 != null);
        assert (ldv2.equals(this.eSW));
        this.aXT();
        this.aWk();
        this.aWv();
        this.fi().f(12544, false);
        if (this.eRt != null) {
            this.eRt.fi().f(12544, false);
            this.eRt.fi().b(10432, (String)null);
        } else {
            this.fi().b(10432, (String)null);
        }
    }

    private void c(ldv ldv2, ldv ldv3, ldv ldv4, ldv ldv5) {
        this.eSW = ldv2;
        this.eSY = ldv5;
        this.eSZ = ldv3;
        this.eTa = ldv4;
        this.kU(ldv3);
        this.aWw();
        assert (this.getGUID() != null);
        exa exa2 = (exa)this.MessageDelegator.h(5121, this.getGUID(), ldv2);
        exa2.dcr = 8;
        exa2.Us = 3;
        exa2.Ur = this.getGUID();
        exa2.eoO = this.aAG().getGUID();
        exa2.eoP = this.az();
        exa2.eoQ = this.az();
        this.MessageDelegator.F(exa2);
        assert (this.aSQ() != null);
        this.T(this.aSQ(), ldv5);
    }

    private void aWv() {
        assert (this.aSQ() != null);
        this.U(this.aSQ(), this.eSY);
        this.lx(this.eSZ);
        this.aWx();
        assert (this.getGUID() != null);
        exa exa2 = (exa)this.MessageDelegator.h(5121, this.getGUID(), this.eSW);
        exa2.dcr = 9;
        exa2.Ur = this.getGUID();
        this.MessageDelegator.F(exa2);
        this.eSX = this.eSW;
        this.eSW = null;
        this.eSY = null;
        this.eSZ = null;
        this.eTa = null;
        this.eTb = null;
        this.eRC = 0.0f;
        this.eRD = null;
        this.eRE = null;
        this.u(this.aSL());
    }

    private void aWw() {
        assert (this.aAG().isReadyToRun());
        assert (this.aSN() != null);
        kni kni2 = (kni)this.MessageDelegator.h(782);
        kni2.biE = this.aWo();
        kni2.biF = this.aWp();
        kni2.ehv = this.aSN();
        kni2.ehw = this.eTa;
        kni2.ec = this.getGUID();
        kni2.dsK = true;
        kni2.iBr = true;
        kni2.doP = this.aSN();
        kni2.biD = true;
        kni2.pPN = 64;
        this.eTc = kni2.getGUID();
        this.MessageDelegator.a(kni2);
    }

    private void aWx() {
        if (this.eTb == null) {
            return;
        }
        assert (this.eTb != null);
        knj knj2 = (knj)this.MessageDelegator.h(778);
        knj2.biE = this.aWo();
        knj2.biF = this.aWp();
        knj2.ehv = this.getGUID();
        knj2.ehw = this.getGUID();
        knj2.ec = this.getGUID();
        knj2.dsK = true;
        knj2.iBr = false;
        knj2.hsP = false;
        knj2.doP = this.eTb;
        knj2.pPN = 1;
        this.MessageDelegator.a(knj2);
        this.aWz();
        this.eTb = null;
    }

    private void aWy() {
        assert (this.aSN() != null);
        assert (this.eSZ != null);
        assert (this.eTd == null);
        this.eTd = this.MessageDelegator.bzv();
        gef gef2 = (gef)this.MessageDelegator.h(775, this.getGUID(), lcr.qAI);
        gef2.qj(this.aSM());
        gef2.qk(this.eSZ);
        gef2.lQ(false);
        gef2.aH(true);
        gef2.fg(65);
        gef2.aO(true);
        gef2.gqN = 1282;
        gef2.setDeltaPos(this.aWo());
        gef2.setDeltaRot(this.aWp());
        gef2.kX(this.eTd);
        this.MessageDelegator.F(gef2);
    }

    private void aWz() {
        if (this.eTd == null) {
            return;
        }
        gem gem2 = (gem)this.MessageDelegator.h(770, this.getGUID(), lcr.qAI);
        gem2.gqN = 1282;
        gem2.doP = this.eTd;
        this.MessageDelegator.F(gem2);
        this.eTd = null;
        this.eTd = null;
    }

    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 768: {
                if (ktv2.dXg().equals(this.eTc)) {
                    ktu ktu2 = (ktu)ktv2;
                    if (ktu2.getResult() != 0) {
                        assert (false) : "Error in relation!";
                        if (this.eSW != null) {
                            this.ly(this.eSW);
                            this.lk(this.eSW);
                        }
                        return;
                    }
                    this.eTb = ktu2.axa();
                    if (this.eSZ == null) {
                        this.aWx();
                    } else {
                        this.aWy();
                        this.aXA();
                    }
                    this.aXT();
                    break;
                }
                super.receiveResponse(ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 8452: {
                if (!(this.eQV + this.eQS < this.MessageDelegator.arc().rgz)) break;
                this.eQV = this.MessageDelegator.arc().rgz;
                fga fga2 = (fga)dxq2;
                this.eRC = fga2.fZQ;
                this.eRD = fga2.iJC;
                this.eRE = fga2.iJD;
                this.n(fga2.Position, fga2.Rotation);
                break;
            }
            case 777: {
                if (!this.aIs() || !this.aXv()) {
                    return;
                }
                geo geo2 = (geo)dxq2;
                if (geo2.Rotation == null) {
                    return;
                }
                if (!geo2.Rotation.eqP()) {
                    return;
                }
                assert (geo2.Rotation != null);
                this.u(geo2.Rotation);
                break;
            }
            case 14081: {
                frf frf2 = (frf)dxq2;
                this.a(frf2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(frf frf2) {
        if (frf2.ipI == 2) {
            int n = this.eQU.aBS();
            if (n < 0) {
                return;
            }
            this.d(n, frf2.aZD, null);
            this.b(frf2);
        }
    }

    private void b(frf frf2) {
        fcq fcq2 = (fcq)this.MessageDelegator.h(9224, this.GUID, this.MessageDelegator.getGUID());
        fcq2.bst = bkd.dqC;
        fcq2.aZG = this.getGUID();
        fcq2.akX = frf2.dtj;
        if (this.aXq() != null) {
            fcq2.aYF = this.aXq();
        } else {
            assert (this.eSX != null);
            fcq2.aYF = this.eSX;
        }
        fcq2.bsG = this.az();
        fcq2.aYC = cxd.fJY;
        fcq2.Magnitude = this.eQU.aou() + this.eRC;
        fcq2.eKm = -3.0;
        fcq2.aSp = 1.0f;
        fcq2.aYH = 1;
        fcq2.aYG = this.eQU.aBA();
        fcq2.bsE = 0;
        fcq2.bRD = 1;
        fcq2.gpI = -3.0;
        fcq2.aZH = this.aAG().av();
        fcq2.Radius = this.eQU.aBB();
        fcq2.Position = frf2.aZD;
        fcq2.iJC = this.eRD;
        fcq2.iJD = this.eRE;
        fcq2.dta = !this.aWE() ? eRz : eRA;
        fcq2.gbe = bkd.dqy;
        fcq2.dtb = true;
        fcq2.dsZ = null;
        if (!fcq2.akX.equals(lcr.qEk)) {
            fcq2.dsL = frf2.Ui;
            fcq2.dhr = frf2.ResourceType;
        }
        this.MessageDelegator.H(fcq2);
        if (this.eQU.aBK() > 0) {
            fcq fcq3 = (fcq)fcq2.clone();
            fcq3.aYG = this.eQU.aBK();
            this.MessageDelegator.I(fcq3);
        }
    }

    public void d(et et2, float f2) {
        assert (this.dwG);
        if (et2.getType() != 352 || this.eSQ != null || !this.eTe) {
            // empty if block
        }
        if (this.elf != null) {
            this.elf.a((cbx)this, et2);
        }
        super.d(et2, f2);
    }

    public void gC(boolean bl) {
        if (!bl) {
            // empty if block
        }
    }

    public void aWA() {
        int n = this.eQU.aBU();
        assert (n > 0);
        this.z(n, false);
    }

    public void aWB() {
    }

    public void f(et et2) {
        if (et2.getType() == 352) {
            if (this.eTe) {
                return;
            }
            this.gD(false);
        }
        super.f(et2);
    }

    public void gD(boolean bl) {
        this.eTe = true;
        bfl bfl2 = (bfl)this.elg.aof();
        if (bfl2 != null) {
            this.elg.a(5, bfl2);
        }
        super.aXL();
        assert (this.elf != null);
        if (!bl) {
            this.elf.b((cbx)this);
        }
    }

    public cph aWC() {
        return this.eRt;
    }

    public void e(cph cph2) {
        this.eRt = cph2;
    }

    @Override
    public ldv aWs() {
        return this.eSX;
    }

    @Override
    public void lq(ldv ldv2) {
        this.eSX = ldv2;
    }

    public void a(cbq cbq2) {
        this.elf = cbq2;
    }

    public void aWe() {
        assert (this.aWr() != null);
        if (this.aWr().aBW() > 0) {
            this.z(this.aWr().aBW(), false);
        }
    }

    public double aWD() {
        return this.eRw;
    }

    public void bD(double d2) {
        this.eRw = d2;
    }

    public boolean aWE() {
        return lea.enW().isDescendant(this.az(), cug.fnN);
    }

    public final boolean aWF() {
        return this.eRB;
    }

    public final void gE(boolean bl) {
        this.eRB = bl;
    }
}

