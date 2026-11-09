/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cph
 *  cug
 *  lcr
 *  lcw
 */
import java.util.Map;

public class coo
extends col
implements pb {
    private lga ePx = new lga();
    private double ePy = 0.0;
    private String ePz = null;
    private double ePA = -1.0;
    private double ePB = 120.0;
    private static final double ePC = 10.0;
    private boolean ePD = false;
    private int aqs = -1;
    private asz ePE;

    public coo() {
        super(true);
        this.aVo();
    }

    public int aVk() {
        return this.aqs;
    }

    public void sk(int n) {
        this.aqs = n;
    }

    public void a(asz asz2) {
        this.ePE = asz2;
    }

    private void a(ldv ldv2, ldv ldv3, ldv ldv4, ldv ldv5) {
        this.eSW = ldv2;
        this.eSY = ldv5;
        this.eSZ = ldv3;
        this.eTa = ldv4;
        this.aVl();
        assert (this.getGUID() != null);
        exa exa2 = (exa)this.MessageDelegator.h(5121, this.getGUID(), ldv2);
        exa2.dcr = 8;
        exa2.Us = 6;
        exa2.Ur = this.getGUID();
        exa2.eoO = this.aAG().getGUID();
        exa2.eoP = this.az();
        exa2.eoQ = 0;
        this.MessageDelegator.F(exa2);
        this.Q(this.aAG().getGUID(), ldv5);
    }

    private void aVl() {
        kni kni2 = (kni)this.MessageDelegator.h(782);
        kni2.biE = new ljq(0.0f, 0.0f, 0.0f);
        kni2.biF = new lgl(new ljq(0.0, 3.14, 0.0));
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

    private void aVm() {
        this.eTd = this.MessageDelegator.bzv();
        gef gef2 = (gef)this.MessageDelegator.h(775, this.getGUID(), lcr.qAI);
        gef2.qj(this.aAG().getGUID());
        gef2.qk(this.eSZ);
        gef2.lQ(false);
        gef2.aH(true);
        gef2.fg(65);
        gef2.gqN = 1282;
        gef2.aO(true);
        gef2.setDeltaPos(new ljq(0.0f, 0.0f, 0.0f));
        gef2.setDeltaRot(new lgl(new ljq(0.0, 3.14, 0.0)));
        gef2.kX(this.eTd);
        this.MessageDelegator.F(gef2);
    }

    public boolean a(ldv ldv2, ldv ldv3, ldv ldv4, ldv ldv5, cph cph2) {
        assert (ldv2 != null);
        this.a(ldv2, ldv4, ldv5, ldv3);
        this.ePx.start();
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
        this.aXT();
        this.aWk();
        this.aVn();
        this.ePx.stop();
        this.fi().f(12544, false);
        this.ePz = this.fi().ar(10432);
        if (this.aAG() != null && (lmf2 = lea.eg(this.aAG().azb())) != null && lmf2 == lmf.rEz) {
            this.ePy = this.ePB;
            this.fi().b(10432, this.ePz);
            this.fi().a(12384, this.MessageDelegator.arc().rgz + this.ePy);
        }
    }

    private void aVn() {
        this.P(this.aAG().getGUID(), this.eSY);
        this.lx(this.eSZ);
        this.ll(this.eTa);
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
        if (lcw.enb()) {
            kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
            kmj2.Zf(1);
            kmj2.ts(this.GUID);
            kmj2.hC(this.aAG().axa());
            kmj2.aO(true);
            this.MessageDelegator.a(kmj2);
        }
    }

    private void ll(ldv ldv2) {
        if (this.eTb == null) {
            return;
        }
        knj knj2 = (knj)this.MessageDelegator.h(778);
        knj2.biE = new ljq();
        knj2.biF = new lgl();
        knj2.ehv = this.getGUID();
        knj2.ehw = this.getGUID();
        knj2.ec = this.getGUID();
        knj2.dsK = true;
        knj2.iBr = true;
        knj2.doP = this.eTb;
        knj2.pPN = 1;
        this.MessageDelegator.a(knj2);
        this.eTb = null;
        if (this.eTd == null) {
            return;
        }
        gem gem2 = (gem)this.MessageDelegator.h(770, this.getGUID(), lcr.qAI);
        gem2.gqN = 1282;
        gem2.doP = this.eTd;
        this.MessageDelegator.F(gem2);
        this.eTd = null;
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

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        lgj lgj2 = this.ePx.aJ(ldz2);
        if (lgj2 != null && this.aAG() != null) {
            ljq ljq2 = lgj2.eqI();
            this.aAG().g(ljq2, lgj2.eqK());
            if (this.aXq() == null) {
                this.a(this.KY(), lgj2);
            }
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

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 20482: {
                fsg fsg2 = (fsg)dxq2;
                if (fsg2.dTY == null) {
                    return;
                }
                this.ePx.n(fsg2.dTY);
                break;
            }
            case 1039: {
                assert (false) : "Shouldn't be used";
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void receiveResponse(ktv ktv2) {
        ktu ktu2;
        if (ktv2.egT() == 768 && (ktu2 = (ktu)ktv2).dXg().equals(this.eTc)) {
            if (ktu2.getResult() == 0) {
                this.eTb = ktu2.axa();
                if (this.eSZ != null) {
                    this.aVm();
                    this.kU(this.eSZ);
                    this.aXA();
                    this.aXT();
                } else {
                    this.ll(null);
                }
            } else {
                assert (false) : "Error in relation!";
                if (this.eSW != null) {
                    this.ly(this.eSW);
                    this.lk(this.eSW);
                    return;
                }
            }
            this.eTc = null;
            return;
        }
        super.receiveResponse(ktv2);
    }

    public void f(et et2) {
        if (et2.getType() == 352 && !this.eTe) {
            amn amn2;
            Map<Integer, amn> map;
            this.eTe = true;
            int n = lea.enW().getType("r_ship ship of the line");
            if (n > 0 && (map = lea.eoQ()) != null && (amn2 = map.get(n)) != null) {
                this.z(amn2.GU(), true);
            }
            super.aXL();
            this.ePt.a(byw.c.ech);
            this.ePE.a(this);
        }
        super.f(et2);
    }

    protected void aVo() {
        this.eTh = false;
        this.eTf = false;
        this.eTg = false;
        this.eTi = 0.01f;
        this.eTj = 0.01f;
        this.eTm = 10.0;
        this.eTo = 300.0;
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
        pa2.aGx.aGz = lea.enW().getName(cug.fnt);
        pa2.aGx.aGr = et2.fN();
        pa2.aGx.aGA = et3.fN();
        pa2.aGx.aGB = ff2 != null ? ff2.toString() : null;
        pa2.aGx.Position = this.aAG().av();
        pa2.aGx.Rotation = this.aAG().aw();
        pa2.aGx.aGC = this.aXo();
        pa2.aGx.aCF = this.AQ();
        return pa2;
    }
}

