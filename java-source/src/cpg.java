/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cph
 *  cxd
 *  lcr
 *  lcw
 */
public class cpg
extends cpe
implements pb {
    private static final int eSF = 5;
    private static final double ePC = 10.0;
    private boolean ePv = false;
    private int aqs = -1;
    private ljq eSG = null;
    private lgl eSH = null;
    private ljq eSI = null;
    private ljq eSJ = null;
    private String eSK = null;
    private ldv emS = null;
    private double ePy = 0.0;
    private String ePz = null;
    private double ePA = -1.0;
    private double ePB = 120.0;
    private boolean eSL = false;
    private int eSM = 0;
    private int eSN = 0;
    private bxc eSO = null;
    private bfu elg = null;
    private boolean ePD = false;

    public cpg() {
        super(true);
        this.aVo();
        this.elg = new bfu((cbx)this);
        this.ePB = lcw.emW() ? 300.0 : 120.0;
    }

    public bfq aIv() {
        return this.elg;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.elg.doTick(ldz2);
        if (this.eSL) {
            this.aKr();
        }
        if (this.ePy > 0.0) {
            this.ePy -= ldz2.qwh;
            if (this.ePy <= 10.0 && !this.ePD) {
                if (this.eSW == null) {
                    this.a(mci.uuR.bD(this.az()));
                }
                this.ePD = true;
            }
        } else if (this.ePy <= 0.0 && this.eSW == null) {
            this.aWj();
        }
    }

    @Override
    public pa sv() {
        if (this.aAG() == null) {
            return null;
        }
        if (!this.aAG().ayZ()) {
            return null;
        }
        if (this.jm() == null) {
            return null;
        }
        if (this.aXX()) {
            return null;
        }
        if (this.aAG().axa() == null) {
            return null;
        }
        if (this.aAG().azb() == null) {
            return null;
        }
        if (this.aAG().azc() == null) {
            return null;
        }
        et et2 = this.jm().ah(352);
        et et3 = this.jm().ah(354);
        ff ff2 = (ff)this.fi().ae(1360);
        if (et2 == null || et3 == null) {
            return null;
        }
        if (et2.fN() <= 0.0f) {
            return null;
        }
        pa pa2 = new pa();
        pa2.aGw = this.getGUID();
        pa2.aGx = new pd();
        pa2.aGx.aGw = this.getGUID();
        pa2.aGx.ResourceName = this.pa();
        pa2.aGx.aGz = lea.enW().getName(((ew)this.fi().ae(13632)).fQ());
        pa2.aGx.aGr = et2.fN();
        pa2.aGx.aGA = et3.fN();
        pa2.aGx.aGB = ff2 != null ? ff2.toString() : null;
        pa2.aGx.Position = this.aAG().av();
        pa2.aGx.Rotation = this.aAG().aw();
        pa2.aGx.aGC = this.aXo();
        pa2.aGx.aCF = this.AQ();
        return pa2;
    }

    private void aKr() {
        if (!this.aIs()) {
            this.eSL = false;
            return;
        }
        if (this.aAG() == null) {
            this.eSL = false;
            return;
        }
        int n = mfz.ex(this.MessageDelegator.arc().rgz);
        if (this.eSM == n) {
            return;
        }
        lgj lgj2 = new lgj(n, this.aAG().av(), this.aAG().aw(), true);
        this.eSM = n;
        this.a(this.KY(), lgj2);
        --this.eSN;
        if (this.eSN <= 0) {
            this.eSL = false;
        }
    }

    protected void aVo() {
        this.eTh = false;
        this.eTf = false;
        this.eTg = false;
        this.eTi = 0.01f;
        this.eTj = 0.01f;
        this.eTm = 10.0;
        this.eTo = 900.0;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 20482: {
                fsg fsg2 = (fsg)dxq2;
                if (fsg2.dTY == null) {
                    return;
                }
                if (this.aAG() == null) {
                    return;
                }
                this.aAG().g(fsg2.dTY.eqI(), fsg2.dTY.eqK());
                break;
            }
            case 1039: {
                assert (false) : "Shouldn't be used";
                break;
            }
            case 11010: {
                this.a((grl)dxq2);
                break;
            }
            case 20481: {
                this.a((fse)dxq2);
                break;
            }
            case 6403: {
                this.a((gab)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gab gab2) {
        assert (this.dwG);
        ctl ctl2 = lea.eoX().get(gab2.edq);
        if (ctl2 == null) {
            if (this.emS != null) {
                this.jm().C(this.emS);
                this.MessageDelegator.oa(this.emS);
                this.emS = null;
            }
        } else {
            if (this.eTe) {
                return;
            }
            if (this.emS != null) {
                this.jm().C(this.emS);
                this.MessageDelegator.oa(this.emS);
                this.emS = null;
            }
            assert (this.emS == null);
            als als2 = new als();
            als2.setGUID(this.MessageDelegator.bzv());
            als2.x(-2.0);
            als2.ga(1);
            als2.gb(5);
            als2.gc(1);
            als2.cP(lcr.qAC);
            als2.gd(gab2.edq);
            als2.ge(cxd.fJU);
            als2.fJ(ctl2.aYG);
            als2.gf(1);
            als2.fC(352);
            als2.ar(ctl2.bKJ);
            als2.aq(0.0f);
            als2.as(0.0f);
            this.a(als2, this.aAG().av(), null, null);
            this.emS = als2.getGUID();
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 768) {
            ktu ktu2 = (ktu)ktv2;
            if (ktu2.dXg().equals(this.eTc)) {
                if (ktu2.getResult() == 0) {
                    this.eTb = ktu2.axa();
                    if (this.eSZ == null) {
                        this.aXd();
                    } else {
                        this.aXe();
                        this.aXA();
                        this.kU(this.eSZ);
                    }
                } else {
                    lfn.b(5, "SFMount", "receiveResponse() ERROR IN RELATION!");
                    assert (false) : "Error in relation!";
                    if (this.eSW != null) {
                        this.ly(this.eSW);
                        this.lk(this.eSW);
                        return;
                    }
                }
                this.aXT();
                this.eTc = null;
                return;
            }
        } else if (ktv2.egT() == 5380) {
            kvd kvd2 = (kvd)ktv2;
            if (this.aXv()) {
                return;
            }
            kni kni2 = (kni)this.MessageDelegator.h(782);
            kni2.dsK = true;
            kni2.biD = true;
        }
        super.receiveResponse(ktv2);
    }

    public boolean a(ldv ldv2, ldv ldv3, ldv ldv4, ldv ldv5, cph cph2) {
        assert (ldv2 != null);
        ldv ldv6 = lcr.tQ((ldv)ldv2);
        if (this.eTp != null && !this.eTp.equals(ldv6) && this.ePy > 0.0) {
            return false;
        }
        this.eSL = false;
        this.e(ldv2, ldv4, ldv5, ldv3);
        this.eTp = lcr.tQ((ldv)ldv2);
        this.aXQ();
        this.fi().f(12544, true);
        this.ePD = false;
        return true;
    }

    public void lk(ldv ldv2) {
        lmf lmf2;
        assert (ldv2 != null);
        assert (ldv2.equals(this.eSW));
        this.eSL = true;
        this.eSN = 5;
        this.eSM = -1;
        this.fi().f(12544, false);
        this.ePz = this.fi().ar(10432);
        this.aXT();
        this.aWk();
        this.aXb();
        if (this.aAG() != null && (lmf2 = lea.eg(this.aAG().azb())) != null && lmf2 == lmf.rEz) {
            this.ePy = this.ePB;
            this.fi().b(10432, this.ePz);
            this.fi().a(12384, this.MessageDelegator.arc().rgz + this.ePy);
        }
    }

    protected void aWk() {
        this.eTn = this.MessageDelegator.arc().rgz;
    }

    public void lm(ldv ldv2) {
        if (this.aAG() == null) {
            return;
        }
        lmf lmf2 = lea.eg(this.aAG().azb());
        if (lmf2 != null && lmf2 == lmf.rEz) {
            this.eTp = ldv2;
            this.ePy = this.ePB;
            this.fi().a(12384, this.MessageDelegator.arc().rgz + this.ePy);
            eef eef2 = (eef)this.MessageDelegator.h(12811, this.getGUID(), this.eTp);
            this.MessageDelegator.F(eef2);
        }
    }

    public boolean lo(ldv ldv2) {
        if (!this.aXt()) {
            return false;
        }
        return !(this.ePy > 0.0) || this.eTp == null || this.eTp.equals(ldv2);
    }

    protected void a(eeg eeg2) {
        if (this.eTp == null) {
            return;
        }
        if (eeg2.aP() == null) {
            return;
        }
        if (eeg2.iP() == null || eeg2.iR() == null) {
            return;
        }
        if (!this.eTp.equals(eeg2.aO())) {
            return;
        }
        this.fi().b(10432, cg.c(eeg2.iP(), eeg2.iR()));
    }

    private void e(ldv ldv2, ldv ldv3, ldv ldv4, ldv ldv5) {
        this.eSW = ldv2;
        this.eSY = ldv5;
        this.eSZ = ldv3;
        this.eTa = ldv4;
        this.aXc();
        assert (this.getGUID() != null);
        exa exa2 = (exa)this.MessageDelegator.h(5121, this.getGUID(), ldv2);
        exa2.dcr = 8;
        exa2.Us = 4;
        exa2.Ur = this.getGUID();
        exa2.eoO = this.aAG().getGUID();
        exa2.eoP = this.az();
        exa2.eoQ = 0;
        this.MessageDelegator.F(exa2);
        this.Q(this.aAG().getGUID(), ldv5);
        this.R(this.aAG().getGUID(), ldv5);
        if (lcw.enb()) {
            kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
            kmj2.Zf(1);
            kmj2.ts(this.GUID);
            kmj2.hC(this.aAG().axa());
            kmj2.aO(false);
            this.MessageDelegator.a(kmj2);
        }
    }

    private void aXb() {
        Object object;
        this.S(this.aAG().getGUID(), this.eSY);
        this.P(this.aAG().getGUID(), this.eSY);
        this.lx(this.eSZ);
        this.aXd();
        assert (this.getGUID() != null);
        exa exa2 = (exa)this.MessageDelegator.h(5121, this.getGUID(), this.eSW);
        exa2.dcr = 9;
        exa2.Ur = this.getGUID();
        this.MessageDelegator.F(exa2);
        this.eSW = null;
        this.eSY = null;
        this.eSZ = null;
        this.eTa = null;
        this.eTb = null;
        this.a(null);
        if (lcw.enb()) {
            object = (kmj)this.MessageDelegator.h(3329);
            ((kmj)object).Zf(1);
            ((khd)object).ts(this.GUID);
            ((kmn)object).hC(this.aAG().axa());
            ((kmj)object).aO(true);
            this.MessageDelegator.a((khd)object);
        }
        if ((object = this.aJD()) != null) {
            ((byx)object).aEP().dA(1);
        }
        this.eSt.aDc().aDh();
    }

    private void aXc() {
        kni kni2 = (kni)this.MessageDelegator.h(782);
        kni2.biE = this.aXl();
        kni2.biF = this.aXk();
        kni2.ehv = this.aAG().axa();
        kni2.ehw = this.eTa;
        kni2.ec = this.getGUID();
        kni2.dsK = true;
        kni2.iBr = true;
        kni2.biD = true;
        kni2.doP = this.aAG().axa();
        kni2.pPN = 64;
        this.eTc = kni2.getGUID();
        this.MessageDelegator.a(kni2);
    }

    private void aXd() {
        if (this.eTb == null) {
            return;
        }
        knj knj2 = (knj)this.MessageDelegator.h(778);
        knj2.biE = this.aXl();
        knj2.biF = this.aXk();
        knj2.ehv = this.getGUID();
        knj2.ehw = this.getGUID();
        knj2.ec = this.getGUID();
        knj2.dsK = true;
        knj2.iBr = true;
        knj2.doP = this.eTb;
        knj2.pPN = 1;
        this.MessageDelegator.a(knj2);
        this.eTb = null;
        this.aXf();
    }

    private void aXe() {
        this.eTd = this.MessageDelegator.bzv();
        gee gee2 = (gee)this.MessageDelegator.h(774, this.getGUID(), lcr.qAI);
        gee2.qj(this.aAG().getGUID());
        gee2.qk(this.eSZ);
        gee2.lQ(false);
        gee2.aH(true);
        gee2.Jd(1);
        gee2.gqN = 1281;
        gee2.aE(false);
        gee2.setFrameName(this.aXh());
        gee2.aj(this.aXj());
        gee2.ak(this.aXi());
        gee2.kX(this.eTd);
        this.MessageDelegator.F(gee2);
    }

    private void aXf() {
        if (this.eTd == null) {
            return;
        }
        gem gem2 = (gem)this.MessageDelegator.h(770, this.getGUID(), lcr.qAI);
        gem2.gqN = 1281;
        gem2.doP = this.eTd;
        this.MessageDelegator.F(gem2);
        this.eTd = null;
    }

    public void f(et et2) {
        if (et2.getType() == 352 && !this.eTe) {
            bfl bfl2;
            this.eTe = true;
            if (this.emS != null) {
                this.MessageDelegator.oa(this.emS);
                this.emS = null;
            }
            if ((bfl2 = (bfl)this.elg.aof()) != null) {
                this.elg.a(5, bfl2);
            }
            super.aXL();
            dzv dzv2 = (dzv)this.MessageDelegator.h(7425, this.getGUID(), this.aAG().getGUID());
            dzv2.dTs = 1442129;
            this.aAG().receiveMessage(dzv2);
            assert (this.eSO != null);
            this.eSt.a(byw.c.ech);
            this.eSO.a(this);
        }
        super.f(et2);
    }

    private void aXg() {
        if (this.aAG() == null) {
            return;
        }
        if (this.aAG().axa() == null) {
            return;
        }
        klv klv2 = (klv)this.MessageDelegator.h(3345);
        klv2.ts(this.getGUID());
        klv2.wD(true);
        klv2.hC(this.aAG().axa());
        klv2.YZ(1);
        klv2.xc(false);
        this.MessageDelegator.a(klv2);
    }

    public int aVk() {
        return this.aqs;
    }

    public void sk(int n) {
        this.aqs = n;
    }

    public String aXh() {
        return this.eSK;
    }

    public void hM(String string) {
        this.eSK = string;
    }

    public ljq aXi() {
        return this.eSJ;
    }

    public void bu(ljq ljq2) {
        this.eSJ = ljq2;
    }

    public ljq aXj() {
        return this.eSI;
    }

    public void bv(ljq ljq2) {
        this.eSI = ljq2;
    }

    public lgl aXk() {
        return this.eSH;
    }

    public void v(lgl lgl2) {
        this.eSH = lgl2;
    }

    public ljq aXl() {
        return this.eSG;
    }

    public void bw(ljq ljq2) {
        this.eSG = ljq2;
    }

    protected void aIw() {
        super.aIw();
        assert (this.aAG().ayZ());
    }

    protected void aIx() {
        super.aIx();
    }

    public bxc aXm() {
        return this.eSO;
    }

    public void a(bxc bxc2) {
        this.eSO = bxc2;
    }

    public double aXn() {
        return this.ePA;
    }

    public void bE(double d2) {
        this.ePA = d2;
    }

    private void a(fse fse2) {
        if (fse2.aWe <= 0) {
            return;
        }
        if (!this.eSt.aEP().isAlive()) {
            return;
        }
        dzv dzv2 = (dzv)this.MessageDelegator.h(7425, this.GUID, this.aAG().getGUID());
        dzv2.dTs = fse2.aWe;
        this.MessageDelegator.H(dzv2);
    }

    private void a(grl grl2) {
        byv byv2 = grl2.edV;
        if (byv2 == null) {
            return;
        }
        if (grl2.ecU == null) {
            return;
        }
        this.eSt.d(grl2.ecU);
        this.eSt.aEK().a(byv2, true, false);
    }

    public ldv aXo() {
        return this.eTp;
    }

    public boolean lu(ldv ldv2) {
        ljq ljq2 = this.aAG().azb();
        lmf lmf2 = lea.eg(ljq2);
        if (lmf2 == null || lmf2 != lmf.rEz) {
            return false;
        }
        ldv ldv3 = lcr.tQ((ldv)ldv2);
        return this.eTp != null && !this.eTp.equals(ldv3) && this.ePy > 0.0 || this.eSW != null;
    }

    public chz sl(int n) {
        if (this.eTu == null) {
            return null;
        }
        for (chz chz2 : this.eTu) {
            if (chz2.Bm() != n) continue;
            return chz2;
        }
        return null;
    }
}

