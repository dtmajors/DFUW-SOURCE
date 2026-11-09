/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cph
 *  lcr
 *  lcw
 */
import java.util.List;

public class cpc
extends cpa
implements pb {
    private cbq elf = null;
    private int aqs = -1;
    private List<cox> eQn = lcn.abH(20);
    private List<cph> eSg = lcn.abH(5);
    private cox eSh = null;
    private lga ePx = new lga();
    private int eQq = 0;
    private int eRN = 0;
    private double eRw = 0.0;
    private ljq eQu = null;
    private lgl eQv = null;
    private boolean eSi = false;
    private double eSj = 0.0;
    private static final float eSk = -0.05f;
    private static final float eSl = -0.1f;
    private static final float eSm = -0.5f;
    private int dXl = 1;
    private double eSn = 0.0;
    private bfu elg = null;

    public cpc() {
        super(true);
        this.aVo();
        this.elg = new bfu((cbx)this);
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
        this.eTo = 43200.0;
    }

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        lgj lgj2 = this.ePx.aJ(ldz2);
        if (lgj2 != null) {
            if (this.aAG() != null) {
                ljq ljq2 = lgj2.eqI();
                this.aAG().g(ljq2, lgj2.eqK());
                if (this.aXq() == null) {
                    this.a(this.KY(), lgj2);
                }
            }
            this.k(lgj2);
        }
        this.aWO();
        this.elg.doTick(ldz2);
    }

    private void aWO() {
        if (this.dXl == 1) {
            return;
        }
        if (this.eSn + 1.0 > this.MessageDelegator.arc().rgz) {
            return;
        }
        float f2 = 0.0f;
        switch (this.dXl) {
            case 2: {
                f2 = -0.05f;
                break;
            }
            case 3: {
                f2 = -0.1f;
                break;
            }
            case 4: {
                f2 = -0.5f;
                break;
            }
            default: {
                f2 = -0.5f;
            }
        }
        this.eSn = this.MessageDelegator.arc().rgz;
        this.eI(f2);
    }

    public int aVk() {
        return this.aqs;
    }

    public void sk(int n) {
        this.aqs = n;
    }

    public void b(cox cox2) {
        this.eQn.add(cox2);
    }

    public int aVS() {
        return this.eQq;
    }

    public void sp(int n) {
        this.eQq = n;
    }

    public boolean aWP() {
        if (this.eQq != this.eQn.size()) {
            return false;
        }
        return this.eRN == this.eSg.size();
    }

    @Override
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
            case 1040: {
                this.a((fun)dxq2);
                break;
            }
            case 8452: {
                fga fga2 = (fga)dxq2;
                this.a(fga2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fun fun2) {
        this.dXl = fun2.dXl;
    }

    private void k(lgj lgj2) {
        for (cox cox2 : this.eQn) {
            if (cox2.aAG() == null) continue;
            boolean bl = this.eSh != null && this.eSh.getGUID().equals(cox2.getGUID());
            cox2.a(lgj2, !bl);
        }
    }

    private void a(fga fga2) {
        if (this.eSh == null) {
            return;
        }
        this.eSh.receiveMessage(fga2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        ktu ktu2;
        if (ktv2.egT() == 768 && (ktu2 = (ktu)ktv2).dXg().equals(this.eTc)) {
            if (ktu2.getResult() == 0) {
                this.eTb = ktu2.axa();
                if (this.eSZ != null) {
                    this.aWQ();
                    this.kU(this.eSZ);
                    this.aXA();
                    this.aXT();
                } else {
                    this.lt(null);
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

    public ljq aVU() {
        return this.eQu;
    }

    public void bp(ljq ljq2) {
        this.eQu = ljq2;
    }

    public lgl aVV() {
        return this.eQv;
    }

    public void q(lgl lgl2) {
        this.eQv = lgl2;
    }

    private void aWQ() {
        this.eTd = this.MessageDelegator.bzv();
        gef gef2 = (gef)this.MessageDelegator.h(775, this.getGUID(), lcr.qAI);
        gef2.qj(this.aAG().getGUID());
        gef2.qk(this.eSZ);
        gef2.lQ(false);
        gef2.aH(true);
        gef2.fg(65);
        gef2.gqN = 1282;
        gef2.aO(true);
        gef2.setDeltaPos(this.aVU());
        gef2.setDeltaRot(this.aVV());
        gef2.kX(this.eTd);
        this.MessageDelegator.F(gef2);
    }

    private void aWR() {
        if (this.eTd == null) {
            return;
        }
        gem gem2 = (gem)this.MessageDelegator.h(770, this.getGUID(), lcr.qAI);
        gem2.gqN = 1282;
        gem2.doP = this.eTd;
        this.MessageDelegator.F(gem2);
        this.eTd = null;
    }

    public boolean a(ldv ldv2, ldv ldv3, ldv ldv4, ldv ldv5, cph cph2) {
        assert (ldv2 != null);
        this.d(ldv2, ldv4, ldv5, ldv3);
        this.ePx.start();
        this.eTp = lcr.tQ((ldv)ldv2);
        this.aXQ();
        return true;
    }

    public void lk(ldv ldv2) {
        assert (ldv2 != null);
        assert (ldv2.equals(this.eSW));
        this.aXT();
        this.aWk();
        this.aWS();
        this.ePx.stop();
    }

    private void d(ldv ldv2, ldv ldv3, ldv ldv4, ldv ldv5) {
        this.eSW = ldv2;
        this.eSY = ldv5;
        this.eSZ = ldv3;
        this.eTa = ldv4;
        this.aWT();
        assert (this.getGUID() != null);
        exa exa2 = (exa)this.MessageDelegator.h(5121, this.getGUID(), ldv2);
        exa2.dcr = 8;
        exa2.Us = 5;
        exa2.Ur = this.getGUID();
        exa2.eoO = this.aAG().getGUID();
        exa2.eoP = this.az();
        exa2.eoQ = this.aWU() != null ? this.aWU().az() : 0;
        this.MessageDelegator.F(exa2);
        this.Q(this.aAG().getGUID(), ldv5);
        if (this.eSh != null) {
            this.eSh.lv(this.eSW);
            this.eSh.lA(this.eSY);
            this.eSh.lC(this.eSZ);
            this.eSh.lB(this.eTa);
        }
        if (lcw.enb()) {
            kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
            kmj2.Zf(1);
            kmj2.ts(this.GUID);
            kmj2.hC(this.aAG().axa());
            kmj2.aO(false);
            this.MessageDelegator.a(kmj2);
        }
    }

    private void aWS() {
        this.P(this.aAG().getGUID(), this.eSY);
        this.lx(this.eSZ);
        this.lt(this.eTa);
        assert (this.getGUID() != null);
        exa exa2 = (exa)this.MessageDelegator.h(5121, this.getGUID(), this.eSW);
        exa2.dcr = 9;
        exa2.Ur = this.getGUID();
        this.MessageDelegator.F(exa2);
        if (this.eSh != null) {
            this.eSh.lq(this.eSW);
            this.eSh.lv(null);
            this.eSh.lA(null);
            this.eSh.lC(null);
            this.eSh.lB(null);
        }
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

    private void aWT() {
        kni kni2 = (kni)this.MessageDelegator.h(782);
        kni2.biE = this.aVU();
        kni2.biF = this.aVV();
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

    private void lt(ldv ldv2) {
        if (this.eTb == null) {
            return;
        }
        knj knj2 = (knj)this.MessageDelegator.h(778);
        knj2.biE = this.aVU();
        knj2.biF = this.aVV();
        knj2.ehv = this.getGUID();
        knj2.ehw = this.getGUID();
        knj2.ec = this.getGUID();
        knj2.dsK = true;
        knj2.iBr = true;
        knj2.doP = this.eTb;
        knj2.pPN = 1;
        this.MessageDelegator.a(knj2);
        this.eTb = null;
        this.aWR();
    }

    public cox aWU() {
        return this.eSh;
    }

    public void c(cox cox2) {
        this.eSh = cox2;
    }

    public void f(et et2) {
        if (et2.getType() == 352) {
            if (this.eTe) {
                return;
            }
            this.aVO();
        }
        super.f(et2);
    }

    public void aVN() {
        this.eTe = true;
        super.aXL();
    }

    private void aVO() {
        this.eTe = true;
        bfl bfl2 = (bfl)this.elg.aof();
        if (bfl2 != null) {
            this.elg.a(5, bfl2);
        }
        super.aXL();
        assert (this.elf != null);
        this.elf.b((cbx)this);
    }

    public void d(et et2, float f2) {
        assert (this.dwG);
        if (et2.getType() == 352) {
            // empty if block
        }
        super.d(et2, f2);
    }

    public void aVQ() {
    }

    public void aVR() {
        for (coz coz2 : this.eQn) {
            coz2.aSI();
            coz2.gC(true);
            this.MessageDelegator.hd(coz2.getGUID());
        }
        this.eQn.clear();
        for (cph cph2 : this.eSg) {
            cph2.aSI();
            this.MessageDelegator.hd(cph2.getGUID());
        }
        this.eSg.clear();
    }

    public void aWe() {
        assert (this.aWI() != null);
        if (this.eRF.ES() > 0) {
            this.z(this.eRF.ES(), false);
        }
    }

    public void aWf() {
        assert (this.aWI() != null);
        if (this.eRF.Fc() > 0) {
            this.z(this.eRF.Fc(), false);
        }
    }

    public List<cox> aVX() {
        return this.eQn;
    }

    public void a(cbq cbq2) {
        this.elf = cbq2;
    }

    public double aWD() {
        return this.eRw;
    }

    public void bD(double d2) {
        this.eRw = d2;
    }

    public int aWV() {
        return this.eRN;
    }

    public void sv(int n) {
        this.eRN = n;
    }

    public void f(cph cph2) {
        this.eSg.add(cph2);
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

