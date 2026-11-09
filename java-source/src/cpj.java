/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  cbx
 *  cdb
 *  cew
 *  cph
 *  cug
 *  lcr
 *  lcw
 */
import java.util.List;
import java.util.Map;

public class cpj
extends cpi
implements cpt {
    private bek eTy = null;
    private boolean ePv = false;
    private boolean ePI = false;
    private coy eRV = null;
    private ldv eRW = null;
    private ldv eTz = null;
    private ljq ePM = null;
    private lgl ePN = null;
    private cmu eRY = null;
    private cdb eTA = null;
    private ldv eTB = null;
    private bwc elc = null;
    private cpr eSb = null;
    private Map<ldv, Double> eSc = lcn.emw();
    private static final double eSd = (double)0.01f;
    private bzd enN = null;
    private static final float eTC = 0.2f;
    private boolean eSf = false;
    private float eTD = 0.0f;
    List<lfs<bvd, dtj>> eTE = lcn.emv();
    ljq eQg = null;

    public cpj() {
        super(false);
        this.enN = new bzd(this.eTw);
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

    protected void aIw() {
        super.aIw();
        amj amj2 = lea.eoP().get(new Integer(this.az()));
        if (amj2 == null) {
            assert (false) : "No siegeengineinfo for this: " + this.pa();
            return;
        }
        this.a(amj2);
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
            this.elc.f("AttachPoint_Vehicle Damage 01", 25, this.eTv.EP());
            float f2 = this.fi().ai(352);
            et et2 = this.fi().ah(352);
            if (et2 != null) {
                this.elc.b(et2, f2);
            }
        }
        this.aYb();
    }

    public void d(et et2, float f2) {
        if (et2.getType() == 352) {
            this.g(et2);
        } else if (et2.getType() == 160) {
            et et3 = et2;
            this.eTD = et3.fN();
            this.cL(this.FZ());
        }
        super.d(et2, f2);
    }

    private void g(et et2) {
        float f2 = this.fi().ai(352);
        if (this.elc != null) {
            this.elc.b(et2, f2);
        }
    }

    @Override
    public float FZ() {
        float f2 = this.eTv.Gm() * (this.eTD * 0.7f + 0.7f);
        return f2;
    }

    private void aVy() {
        if (this.eTy != null && this.fi() != null && this.fi().ad(352)) {
            float f2 = this.fi().ai(352);
            et et2 = this.fi().ah(352);
            float f3 = 0.0f;
            if (et2.fN() > 0.0f) {
                f3 = et2.fN() / f2;
            }
            f3 = lew.A(f3, 0.2f, 1.0f);
            float f4 = this.eTv.Gm() * f3;
            this.cL(f4);
        }
    }

    private void eJ(float f2) {
        if (this.eTy != null) {
            float f3 = this.eTv.Gm() * f2;
            this.cL(f3);
        }
    }

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.aYc();
        if (!this.ePv) {
            if (this.aAG() == null) {
                return;
            }
            if (!this.aAG().isReadyToRun()) {
                return;
            }
            if (this.eTy == null) {
                this.aYa();
            }
            if (this.eRY == null && (!lcw.emZ() || lcw.enb())) {
                this.aWK();
            }
            this.ePv = true;
        }
        this.aqR();
        this.eTy.doTick(ldz2);
        ((bzk)this.eTw).doTick(ldz2);
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
        for (lfs<bvd, dtj> lfs2 : this.eTE) {
            dsx dsx2 = (dsx)this.MessageDelegator.bzx().bzt().d(lcr.qCe);
            if (lfs2.eqz() != null) {
                dsx2.nT(lfs2.eqz().GUID);
            }
            this.MessageDelegator.hd(lfs2.getFirst().axa());
        }
    }

    private void aYa() {
        assert (this.eTv != null);
        this.eTy = new bek((cbx)this);
        this.eTy.cu(this.eTv.Ga());
        this.eTy.ct((float)Math.PI);
        this.eTy.cv(this.eTv.Gb());
        this.eTy.cw(this.eTv.Gc());
        this.eTy.cx(this.eTv.Gd());
        this.eTy.cy(this.eTv.Ge());
        this.eTy.cA(this.eTv.Gg());
        this.eTy.cz(this.eTv.Gf());
        this.eTy.cB(this.eTv.Gh());
        this.eTy.cC(this.eTv.Gi());
        this.eTy.cD(this.eTv.Gj());
        this.eTy.bg(this.eTv.Gk());
        this.eTy.cE(this.eTv.Gl());
        this.eTy.setMaxVelocity(0.0f);
        this.eTy.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eTy);
    }

    private void aWK() {
        assert (this.eTv != null);
        this.eRY = new cmu();
        if (this.eTv.Fe() != "") {
            this.eRY.de(this.eTv.Fe());
        }
        if (this.eTv.Fd() != "") {
            this.eRY.dd(this.eTv.Fd());
        }
        if (this.eTv.Fg() != "") {
            this.eRY.dg(this.eTv.Fg());
        }
        if (this.eTv.Fi() != "") {
            this.eRY.di(this.eTv.Fi());
        }
        if (this.eTv.Fh() != "") {
            this.eRY.dh(this.eTv.Fh());
        }
        if (this.eTv.Fj() != "") {
            this.eRY.dj(this.eTv.Fj());
        }
        if (this.eTv.Ff() != "") {
            this.eRY.df(this.eTv.Ff());
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
        assert (this.eTy != null);
        assert (!this.isServerObject());
        bvm bvm2 = (bvm)this.aAG();
        bvm2.aAj().aAA();
        this.eTy.setActive(true);
        this.aXy();
        if (this.eRV != null) {
            this.eRV.aVi();
        }
        bvm2.azx().aAV();
    }

    public void aVj() {
        assert (this.eTy != null);
        assert (!this.isServerObject());
        bvm bvm2 = (bvm)this.aAG();
        if (bvm2.aAj() != null) {
            bvm2.aAj().aAy();
        }
        this.eTy.setActive(false);
        if (this.eRV != null) {
            this.eRV.aVj();
        }
        if (bvm2.azx() != null) {
            bvm2.azx().aAW();
        }
    }

    public void aK(ljq ljq2) {
        if (this.eTy == null) {
            return;
        }
        if (this.eTy.isActive()) {
            this.eTy.aK(ljq2);
        }
    }

    public void b(ljq ljq2, ljq ljq3, ljq ljq4) {
        if (this.eTy == null) {
            return;
        }
        if (this.eTy.isActive() && this.eRV != null) {
            this.eRV.b(ljq2, ljq3, ljq4);
        }
    }

    public void su(int n) {
        if (!lcw.emZ()) {
            fun fun2 = (fun)this.MessageDelegator.h(1040, this.GUID, this.eTz);
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
            this.eTz = lcr.ak((ldv)this.getGUID(), (int)this.dj);
        }
    }

    @Override
    public void y(int n, ldv ldv2) {
        assert (this.aIn());
        if (!this.aIn()) {
            return;
        }
        if (this.eTA == null) {
            return;
        }
        if (!this.eTA.aJI()) {
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

    protected void a(cbx cbx2, ljq ljq2) {
        bvf bvf2;
        if (this.eTv == null) {
            assert (false);
            return;
        }
        if (cbx2.aAG() == null || !(cbx2.aAG() instanceof bvc)) {
            return;
        }
        amj.a a2 = null;
        for (amj.a a3 : this.eTv.Gp()) {
            bvf2 = ei.ao(this.aAG().getFileName());
            eh eh2 = bvf2.get(a3.bxZ);
            if (eh2 == null || !eh2.fb().equals(ljq2)) continue;
            a2 = a3;
            break;
        }
        if (a2 == null) {
            return;
        }
        if (this.eRY != null) {
            bvc bvc2 = (bvc)cbx2.aAG();
            this.eRY.a(bvc2, a2.bya, a2.byb);
            if (cbx2 instanceof cew) {
                amj.a a3;
                a3 = (cew)cbx2;
                a3.aLU().aFi().setActive(false);
                bvf2 = (bvf)a3.aAG();
                bvf2.ez(true);
            } else {
                this.eRY.f(cbx2.aAG());
            }
        }
    }

    protected void v(cbx cbx2) {
        if (cbx2.aAG() == null || !(cbx2.aAG() instanceof bvc)) {
            return;
        }
        if (this.eRY != null) {
            this.eRY.a((bvc)cbx2.aAG());
            if (cbx2 instanceof cew) {
                cew cew2 = (cew)cbx2;
                cew2.aLU().aFi().setActive(true);
                bvf bvf2 = (bvf)cew2.aAG();
                bvf2.ez(false);
            }
        }
    }

    public void a(cph cph2, ljq ljq2, lgl lgl2) {
        this.a((cbx)cph2, ljq2);
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

    public void h(cph cph2) {
        this.v((cbx)cph2);
    }

    public void a(cdb cdb2, ljq ljq2, lgl lgl2) {
        this.a((cbx)cdb2, ljq2);
        if (this.ePM == null) {
            return;
        }
        assert (cdb2 != null);
        if (ljq2.equals(this.ePM)) {
            this.eTA = cdb2;
            this.eTB = cdb2.getGUID();
            if (this.eRY != null) {
                this.eRY.aTJ();
            }
            if (this.eRV != null && cdb2.aJI()) {
                this.eRV.ls(this.KY());
            }
        }
        if (cdb2.aJI() && this.aIn() && this.eSb != null) {
            this.eSb.enable();
        }
    }

    public void g(cdb cdb2) {
        this.v((cbx)cdb2);
        assert (cdb2 != null);
        if (cdb2 == this.eTA) {
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
        if (this.eTB == null) {
            return;
        }
        if (this.MessageDelegator.bzx().bzt().d(this.eTB) == null) {
            this.aWN();
        }
    }

    private void aWN() {
        this.eTA = null;
        this.eTB = null;
        if (this.eRY != null) {
            this.eRY.aTK();
        }
    }

    public void cL(float f2) {
        if (this.eTy == null) {
            return;
        }
        if (this.eTy.isActive()) {
            this.eTy.cL(f2);
        }
    }

    public void amY() {
    }

    public void aZ(ljq ljq2) {
        ((bzk)this.eTw).dF(ljq2.eqN());
    }

    public final void a(bzc bzc2) {
        this.enN.a(bzc2);
    }

    private void aYb() {
        Map<String, eh> map = ei.ao(this.aAG().getFileName());
        int n = ei.an("AttachPoint_Wheel 01");
        for (Map.Entry<String, String> entry : this.eTv.Go().entrySet()) {
            eh eh2 = map.get(entry.getKey());
            if (eh2 == null) {
                lfn.b(5, "SFSiegeEngineClient", "createWheels() could not find attachpoint " + entry.getKey());
                continue;
            }
            bvm bvm2 = new bvm(bve.a.dQv);
            bvm2.setGUID(this.MessageDelegator.bzv());
            bvm2.setFileName(entry.getValue());
            bvm2.c(this.aAG().av());
            bvm2.a(this.aAG().aw());
            this.MessageDelegator.a(bvm2);
            this.eTE.add(new lfs<bvm, Object>(bvm2, null));
        }
    }

    private void aYc() {
        if (this.aAG() == null) {
            return;
        }
        dsx dsx2 = (dsx)this.MessageDelegator.bzx().bzt().d(lcr.qCe);
        float f2 = 0.0f;
        if (this.eQg != null) {
            ljq ljq2 = this.aAG().aw().eq(new ljq(0.0f, 0.0f, 1.0f));
            ljq2.normalize();
            ljq ljq3 = this.aAG().av();
            ljq3.et(this.eQg);
            f2 = ljq.u(ljq3, ljq2);
        }
        this.eQg = this.aAG().av();
        int n = 0;
        for (lfs<bvd, dtj> lfs2 : this.eTE) {
            if (lfs2.reY != null) {
                if (((dtj)lfs2.reY).gZw == dsw.a.gZz && f2 != 0.0f) {
                    ((dtj)lfs2.reY).biF.Y(new lgl(f2 * 0.5f, 0.0f, 0.0f));
                    ((dtj)lfs2.reY).biF.normalize();
                    ((dtj)lfs2.reY).biC = 256;
                    dsx2.f((dsw)lfs2.reY);
                }
            } else if (((bvd)lfs2.reX).isReadyToRun()) {
                Map<String, eh> map = ei.ao(this.aAG().getFileName());
                int n2 = ei.an("AttachPoint_Wheel 01");
                eh eh2 = map.get(ei.fe()[n2 + n]);
                dtj dtj2 = new dtj();
                dtj2.gqN = 1282;
                dtj2.GUID = this.MessageDelegator.bzv();
                dtj2.eSR = ((bvd)lfs2.reX).axa();
                dtj2.hA = this.aAG().axa();
                dtj2.biE = eh2.fb();
                dtj2.biF = eh2.fc();
                dtj2.biB = 64;
                dsx2.a(dtj2);
                lfs2.reY = dtj2;
            }
            ++n;
        }
    }

    public boolean Ow() {
        return this.eRY.Ow();
    }
}

