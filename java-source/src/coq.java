/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cdb
 *  lcw
 */
import java.util.Map;

public class coq
extends cop {
    private static final float ePG = 0.1f;
    private beb ePH = null;
    private boolean ePv = false;
    private boolean ePI = false;
    private bwc elc = null;
    private bzd enN = new bzd(this.ePF);
    private cmv ePJ = null;
    private cdb ePK = null;
    private ldv ePL = null;
    private ljq ePM = null;
    private lgl ePN = null;

    public coq() {
        super(false);
        if (!lcw.emZ() || lcw.enb()) {
            this.elc = new bwc(false);
        }
    }

    public void cleanUp() {
        super.cleanUp();
        if (this.elc != null) {
            this.elc.cleanUp();
        }
        if (this.ePJ != null) {
            this.MessageDelegator.hd(this.ePJ.getGUID());
            this.ePJ = null;
        }
    }

    public joc aVr() {
        return joc.nGX;
    }

    protected void aIw() {
        super.aIw();
        amn amn2 = lea.eoQ().get(new Integer(this.az()));
        if (amn2 == null) {
            assert (false);
            return;
        }
        this.a(amn2);
        if (this.elc != null) {
            this.elc.setMessageDelegator(this.MessageDelegator);
            this.elc.d(this.aAG());
            this.elc.f("AttachPoint_Vehicle Damage 01", 25, amn2.EP());
            float f2 = this.fi().ai(352);
            et et2 = this.fi().ah(352);
            if (et2 != null) {
                this.elc.b(et2, f2);
            }
        }
    }

    public void d(et et2, float f2) {
        if (et2.getType() == 352) {
            this.g(et2);
        }
        super.d(et2, f2);
    }

    private void g(et et2) {
        float f2 = this.fi().ai(352);
        if (this.elc != null) {
            this.elc.b(et2, f2);
        }
        this.aVy();
    }

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (!this.ePv) {
            if (this.aAG() == null) {
                return;
            }
            if (!this.aAG().isReadyToRun()) {
                return;
            }
            if (this.ePH == null) {
                this.aVv();
            }
            if (this.ePJ == null && (!lcw.emZ() || lcw.enb())) {
                this.aVs();
            }
            this.ePv = true;
        }
        this.aqR();
        this.ePH.doTick(ldz2);
        this.aVt();
        this.enN.P(ldz2);
    }

    private void aVs() {
        assert (this.eMU != null);
        if (this.eMU == null) {
            return;
        }
        this.ePJ = new cmv(this.aVq());
        if (!this.eMU.Fe().equals("")) {
            this.ePJ.de(this.eMU.Fe());
        }
        if (!this.eMU.Fd().equals("")) {
            this.ePJ.dd(this.eMU.Fd());
        }
        if (!this.eMU.Fg().equals("")) {
            this.ePJ.dg(this.eMU.Fg());
        }
        if (!this.eMU.Fi().equals("")) {
            this.ePJ.di(this.eMU.Fi());
        }
        if (!this.eMU.Fh().equals("")) {
            this.ePJ.dh(this.eMU.Fh());
        }
        if (!this.eMU.Fj().equals("")) {
            this.ePJ.dj(this.eMU.Fj());
        }
        if (!this.eMU.Ff().equals("")) {
            this.ePJ.df(this.eMU.Ff());
        }
        if (!this.eMU.GV().equals("")) {
            this.ePJ.du(this.eMU.GV());
        }
        if (!this.eMU.GW().equals("")) {
            this.ePJ.dv(this.eMU.GW());
        }
        this.ePJ.a((bvm)this.aAG());
        this.ePJ.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.ePJ);
    }

    public boolean Ow() {
        return this.ePJ != null && this.ePJ.Ow();
    }

    public void a(cdb cdb2, ljq ljq2, lgl lgl2) {
        if (this.ePM == null) {
            return;
        }
        assert (cdb2 != null);
        this.aVy();
        if (ljq2.equals(this.ePM)) {
            this.ePK = cdb2;
            this.ePL = cdb2.getGUID();
            this.aVw();
            this.aVx();
            if (this.ePJ != null) {
                this.ePJ.aTJ();
            }
        }
    }

    public void g(cdb cdb2) {
        assert (cdb2 != null);
        if (cdb2 == this.ePK) {
            this.aVu();
        }
    }

    private void aVt() {
        if (this.ePL == null) {
            return;
        }
        if (this.MessageDelegator.bzx().bzt().d(this.ePL) == null) {
            this.aVu();
        }
    }

    private void aVu() {
        this.ePK = null;
        this.ePL = null;
        this.aVw();
        this.aVx();
        if (this.ePJ != null) {
            this.ePJ.aTK();
        }
    }

    private void aVv() {
        assert (this.eMU != null);
        this.ePH = new beb((cbx)this);
        this.ePH.setGUID(this.MessageDelegator.bzv());
        this.ePH.be(this.eMU.GX());
        this.ePH.bf(this.eMU.GY());
        this.ePH.setMaxVelocity(this.eMU.getMaxVelocity());
        this.ePH.bn(this.eMU.Hk());
        this.ePH.bg(this.eMU.GZ());
        this.ePH.bh(this.eMU.Ha());
        this.ePH.bi(this.eMU.Hb());
        this.MessageDelegator.a(this.ePH);
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
        eh eh2 = map.get("AttachPoint Vehicle Camera");
        assert (eh2 != null);
        this.eSU = eh2.fb();
        eh2 = map.get("AttachPoint Vehicle Camera Distance");
        assert (eh2 != null);
        ljq ljq2 = new ljq(eh2.fb());
        ljq2.et(this.eSU);
        this.byT = ljq2.eqN();
        if (this.eMU.Hq() > 0.0f) {
            this.byT = this.eMU.Hq();
        }
        if ((eh2 = map.get("AttachPoint_Vehicle Steering Wheel Player")) != null) {
            this.ePM = eh2.fb();
            this.ePN = new lgl(eh2.getRotation());
        } else {
            this.ePM = null;
            this.ePN = null;
        }
        this.ePI = true;
    }

    public void aVi() {
        assert (this.ePH != null);
        assert (!this.isServerObject());
        bvm bvm2 = (bvm)this.aAG();
        bvm2.aAj().aAA();
        ((bxt)this.ePF).aDR();
        this.ePH.setActive(true);
        this.aXy();
        bvm2.azx().aAV();
    }

    public void aVj() {
        assert (this.ePH != null);
        assert (!this.isServerObject());
        this.ePH.setActive(false);
        bvm bvm2 = (bvm)this.aAG();
        if (bvm2 == null) {
            return;
        }
        bvm2.aAj().aAy();
        if (bvm2.azx() != null) {
            bvm2.azx().aAW();
        }
    }

    public void aK(ljq ljq2) {
        if (this.ePH == null) {
            return;
        }
        if (this.ePH.isActive()) {
            this.ePH.aK(ljq2);
        }
    }

    public void b(ljq ljq2, ljq ljq3, ljq ljq4) {
    }

    public void f(lgj lgj2) {
        super.f(lgj2);
    }

    public void l(ljq ljq2, lgl lgl2) {
        ej ej2 = this.fi().ae(1488);
        if (ej2 != null) {
            this.fi().a(2, ej2);
        }
    }

    @Override
    public void b(byv byv2, boolean bl) {
        assert (this.eSY != null);
        if (bl) {
            eeh eeh2 = (eeh)this.MessageDelegator.h(12814, this.GUID, this.eSY);
            eeh2.bhU = byv2.aEl();
            this.MessageDelegator.F(eeh2);
        }
    }

    public final void a(bzc bzc2) {
        this.enN.a(bzc2);
    }

    public chz sl(int n) {
        return null;
    }

    public void aVw() {
        assert (this.ePH != null);
        if (this.ePH == null) {
            return;
        }
        float f2 = cie.f(this.ePK);
        if (f2 != 0.0f) {
            this.ePH.be(f2 * this.eMU.GX() + this.eMU.GX());
            this.ePH.bf(f2 * this.eMU.GY() + this.eMU.GY());
            this.ePH.bg(f2 * this.eMU.GZ() + this.eMU.GZ());
            this.ePH.bh(f2 * this.eMU.Ha() + this.eMU.Ha());
            this.ePH.bi(f2 * this.eMU.Hb() + this.eMU.Hb());
        }
    }

    public void aVx() {
        if (this.ePH == null) {
            return;
        }
        float f2 = this.aEe();
        float f3 = this.eMU.getMaxVelocity() * f2;
        float f4 = this.eMU.Hk() * f2;
        f3 = cie.a(this.ePK, f3);
        f4 = cie.a(this.ePK, f4);
        this.ePH.setMaxVelocity(f3);
        this.ePH.bn(f4);
    }

    private void aVy() {
        if (this.ePH == null) {
            return;
        }
        float f2 = this.aEe();
        float f3 = this.eMU.getMaxVelocity() * f2;
        float f4 = this.eMU.Hk() * f2;
        f3 = cie.a(this.ePK, f3);
        f4 = cie.a(this.ePK, f4);
        this.ePH.setMaxVelocity(f3);
        this.ePH.bn(f4);
    }

    private float aEe() {
        if (this.fi() == null) {
            return 1.0f;
        }
        if (!this.fi().ad(352)) {
            return 1.0f;
        }
        float f2 = this.fi().ai(352);
        et et2 = this.fi().ah(352);
        float f3 = 0.0f;
        if (et2.fN() > 0.0f) {
            f3 = et2.fN() / f2;
        }
        f3 = lew.A(f3, 0.1f, 1.0f);
        return f3;
    }

    public final cdb aVz() {
        return this.ePK;
    }
}

