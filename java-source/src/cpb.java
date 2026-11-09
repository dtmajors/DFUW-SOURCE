/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cdb
 *  cph
 *  cug
 *  lcr
 *  lcw
 */
import java.util.Map;

public class cpb
extends cpa
implements cpt {
    private bem eRU = null;
    private boolean ePv = false;
    private boolean ePI = false;
    private coy eRV = null;
    private ldv eRW = null;
    private ldv eRX = null;
    private ljq ePM = null;
    private lgl ePN = null;
    private cmu eRY = null;
    private cdb eRZ = null;
    private ldv eSa = null;
    private bwc elc = null;
    private cpr eSb = null;
    private Map<ldv, Double> eSc = lcn.emw();
    private static final double eSd = (double)0.01f;
    private bzd enN = new bzd(this.eRH);
    private static final float eSe = 0.2f;
    private boolean eSf = false;

    public cpb() {
        super(false);
        if (!lcw.emZ() || lcw.enb() || lcw.ena()) {
            this.elc = new bwc(false);
        }
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    public void gF(boolean bl) {
        this.eSf = bl;
    }

    public joc aVr() {
        return joc.nGY;
    }

    public boolean aWu() {
        if (this.eRV == null) {
            return false;
        }
        return this.eRV.aWu();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 8452: {
                if (this.eRV == null) {
                    return;
                }
                this.eRV.receiveMessage(dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    protected void aIw() {
        super.aIw();
        amb amb2 = lea.eoO().get(new Integer(this.az()));
        if (amb2 == null) {
            assert (false) : "No landvehicleinfo for this: " + this.pa();
            return;
        }
        this.a(amb2);
        if (this.aIn()) {
            assert (this.aAG().axa() != null);
            this.eSb = new cpr(this, this.aAG().axa());
            this.eSb.setGUID(this.MessageDelegator.bzv());
            this.eSb.sz(cug.fsa);
            this.MessageDelegator.a(this.eSb);
        }
        if (this.elc != null) {
            this.elc.setMessageDelegator(this.MessageDelegator);
            this.elc.d(this.aAG());
            this.elc.eM(true);
            this.elc.f("AttachPoint_Vehicle Damage 01", 25, this.eRF.EP());
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

    @Override
    public float FZ() {
        if (this.fi() != null && this.fi().ad(352)) {
            float f2 = this.fi().ai(352);
            et et2 = this.fi().ah(352);
            float f3 = 0.0f;
            if (et2.fN() > 0.0f) {
                f3 = et2.fN() / f2;
            }
            f3 = lew.A(f3, 0.2f, 1.0f);
            float f4 = this.eRF.Fp() * f3;
            return f4;
        }
        return 0.0f;
    }

    private void aVy() {
        if (this.eRU != null && this.fi() != null && this.fi().ad(352)) {
            float f2 = this.fi().ai(352);
            et et2 = this.fi().ah(352);
            float f3 = 0.0f;
            if (et2.fN() > 0.0f) {
                f3 = et2.fN() / f2;
            }
            f3 = lew.A(f3, 0.2f, 1.0f);
            float f4 = this.eRF.Fp() * f3;
            this.cL(f4);
        }
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
            if (this.eRU == null) {
                this.aWJ();
            }
            if (this.eRY == null && (!lcw.emZ() || lcw.enb())) {
                this.aWK();
            }
            this.ePv = true;
        }
        this.aqR();
        this.eRU.doTick(ldz2);
        ((bzq)this.eRH).doTick(ldz2);
        this.aWM();
        this.enN.P(ldz2);
    }

    public void cleanUp() {
        super.cleanUp();
        if (this.eRY != null) {
            this.MessageDelegator.hd(this.eRY.getGUID());
            this.eRY = null;
        }
        if (this.elc != null) {
            this.elc.cleanUp();
        }
        if (this.eSb != null) {
            this.MessageDelegator.hd(this.eSb.getGUID());
            this.eSb = null;
        }
    }

    private void aWJ() {
        assert (this.eRF != null);
        this.eRU = new bem((cbx)this);
        this.eRU.cu(this.eRF.Fq());
        this.eRU.ct((float)Math.PI);
        this.eRU.cv(this.eRF.Fr());
        this.eRU.cw(this.eRF.Fs());
        this.eRU.cx(this.eRF.Ft());
        this.eRU.cy(this.eRF.Fu());
        this.eRU.cA(this.eRF.Fw());
        this.eRU.cz(this.eRF.Fv());
        this.eRU.cB(this.eRF.Fx());
        this.eRU.cC(this.eRF.Fy());
        this.eRU.cD(this.eRF.Fz());
        this.eRU.bg(this.eRF.FA());
        this.eRU.cE(this.eRF.FB());
        this.eRU.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eRU);
    }

    private void aWK() {
        assert (this.eRF != null);
        this.eRY = new cmu();
        if (this.eRF.Fe() != "") {
            this.eRY.de(this.eRF.Fe());
        }
        if (this.eRF.Fd() != "") {
            this.eRY.dd(this.eRF.Fd());
        }
        if (this.eRF.Fg() != "") {
            this.eRY.dg(this.eRF.Fg());
        }
        if (this.eRF.Fi() != "") {
            this.eRY.di(this.eRF.Fi());
        }
        if (this.eRF.Fh() != "") {
            this.eRY.dh(this.eRF.Fh());
        }
        if (this.eRF.Fj() != "") {
            this.eRY.dj(this.eRF.Fj());
        }
        if (this.eRF.Ff() != "") {
            this.eRY.df(this.eRF.Ff());
        }
        this.eRY.a((bvm)this.aAG());
        this.eRY.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eRY);
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
        this.eSV = new lgl(eh2.getRotation());
        eh2 = map.get("AttachPoint Vehicle Camera Distance");
        if (eh2 != null) {
            ljq ljq2 = new ljq(eh2.fb());
            ljq2.et(this.eSU);
            this.byT = ljq2.eqN();
        } else {
            this.byT = 0.0f;
        }
        eh2 = map.get("AttachPoint_Vehicle Steering Wheel Player");
        if (eh2 != null) {
            this.ePM = eh2.fb();
            this.ePN = new lgl(eh2.getRotation());
        } else {
            this.ePM = null;
            this.ePN = null;
        }
        this.ePI = true;
    }

    public void aVi() {
        assert (this.eRU != null);
        assert (!this.isServerObject());
        bvm bvm2 = (bvm)this.aAG();
        bvm2.aAj().aAA();
        this.eRU.setActive(true);
        this.aXy();
        if (this.eRV != null) {
            this.eRV.aVi();
        }
        bvm2.azx().aAV();
    }

    public void aVj() {
        assert (this.eRU != null);
        assert (!this.isServerObject());
        bvm bvm2 = (bvm)this.aAG();
        if (bvm2.aAj() != null) {
            bvm2.aAj().aAy();
        }
        this.eRU.setActive(false);
        if (this.eRV != null) {
            this.eRV.aVj();
        }
        if (bvm2.azx() != null) {
            bvm2.azx().aAW();
        }
    }

    public void aK(ljq ljq2) {
        if (this.eRU == null) {
            return;
        }
        if (this.eRU.isActive()) {
            this.eRU.aK(ljq2);
        }
    }

    public void b(ljq ljq2, ljq ljq3, ljq ljq4) {
        if (this.eRU == null) {
            return;
        }
        if (this.eRU.isActive() && this.eRV != null) {
            this.eRV.b(ljq2, ljq3, ljq4);
        }
    }

    public void su(int n) {
        if (!lcw.emZ()) {
            fun fun2 = (fun)this.MessageDelegator.h(1040, this.GUID, this.eRX);
            fun2.dXl = n;
            this.MessageDelegator.F(fun2);
        }
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

    public coy aWL() {
        return this.eRV;
    }

    public void a(coy coy2) {
        this.eRV = coy2;
    }

    public void fb(int n) {
        super.fb(n);
        if (!lcw.emZ()) {
            this.eRX = lcr.ak((ldv)this.getGUID(), (int)this.dj);
        }
    }

    @Override
    public void y(int n, ldv ldv2) {
        assert (this.aIn());
        if (!this.aIn()) {
            return;
        }
        if (this.eRZ == null) {
            return;
        }
        if (!this.eRZ.aJI()) {
            return;
        }
        Double d2 = this.eSc.get(ldv2);
        if (d2 != null && d2 + (double)0.01f > this.MessageDelegator.arc().rgz) {
            return;
        }
        this.eSc.put(ldv2, this.MessageDelegator.arc().rgz);
        gwd gwd2 = (gwd)this.MessageDelegator.h(27140, this.getGUID(), ldv2);
        this.MessageDelegator.F(gwd2);
    }

    public void a(cph cph2, ljq ljq2, lgl lgl2) {
        if (!(cph2 instanceof coy)) {
            return;
        }
        coy coy2 = (coy)cph2;
        if (!coy2.aBZ()) {
            return;
        }
        this.eRV = coy2;
        assert (this.dj >= 0);
        if (!lcw.emZ()) {
            this.eRW = lcr.ak((ldv)this.eRV.getGUID(), (int)this.dj);
        }
    }

    public void a(cdb cdb2, ljq ljq2, lgl lgl2) {
        if (this.ePM == null) {
            return;
        }
        assert (cdb2 != null);
        if (ljq2.equals(this.ePM)) {
            this.eRZ = cdb2;
            this.eSa = cdb2.getGUID();
            if (this.eRY != null) {
                this.eRY.aTJ();
            }
            if (this.eRV != null && cdb2.aJI()) {
                this.eRV.ls(this.KY());
            }
        }
        this.aVy();
        if (cdb2.aJI() && this.aIn() && this.eSb != null) {
            this.eSb.enable();
        }
    }

    public void g(cdb cdb2) {
        assert (cdb2 != null);
        if (cdb2 == this.eRZ) {
            this.aWN();
            if (this.eRV != null) {
                this.eRV.aWt();
            }
        }
        this.eSc.clear();
        if (cdb2.aJI() && this.aIn() && this.eSb != null) {
            this.eSb.disable();
        }
    }

    private void aWM() {
        if (this.eSa == null) {
            return;
        }
        if (this.MessageDelegator.bzx().bzt().d(this.eSa) == null) {
            this.aWN();
        }
    }

    private void aWN() {
        this.eRZ = null;
        this.eSa = null;
        if (this.eRY != null) {
            this.eRY.aTK();
        }
    }

    public void cL(float f2) {
        if (this.eRU == null) {
            return;
        }
        if (this.eRU.isActive()) {
            this.eRU.cL(f2);
        }
    }

    public void amY() {
    }

    public void aZ(ljq ljq2) {
        ((bzq)this.eRH).dF(ljq2.eqN());
    }

    public final void a(bzc bzc2) {
        this.enN.a(bzc2);
    }
}

