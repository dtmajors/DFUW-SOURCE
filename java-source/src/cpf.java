/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  cbx
 *  cdb
 *  lcr
 */
import java.util.Map;

public class cpf
extends cpe
implements cow {
    private boolean eSv = false;
    private boolean ePv = false;
    private bef eSw = null;
    private bei eSx = null;
    private boolean ePI = false;
    private cmq eSy = null;
    private cdb eSz = null;
    private final ljq eSA = new ljq(0.0f, 2.0f, 0.0f);
    private final lgl eSB = new lgl();
    private ldv eSC = null;
    private boolean eSD = false;
    private bzd enN = new bzd(this.eSt);
    private float eSE = -1.0f;

    public cpf() {
        super(false);
    }

    public joc aVr() {
        return joc.nGX;
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            super.initialize();
            this.eSw = new bef((cbx)this);
            this.eSw.setActive(false);
            this.eSw.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.eSw);
            this.eSx = new bei((cbx)this);
            this.eSx.setActive(false);
            this.eSx.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.eSx);
            this.eSC = this.MessageDelegator.bzv();
        }
    }

    public void cleanUp() {
        if (this.eSy != null) {
            this.MessageDelegator.hd(this.eSy.getGUID());
            this.eSy = null;
        }
        if (this.eSw != null) {
            this.MessageDelegator.hd(this.eSw.getGUID());
            this.eSw = null;
        }
        if (this.eSx != null) {
            this.MessageDelegator.hd(this.eSx.getGUID());
            this.eSx = null;
        }
        super.cleanUp();
        this.aWZ();
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (!this.ePv) {
            if (this.aAG() == null) {
                return;
            }
            if (!this.aAG().isReadyToRun()) {
                return;
            }
            this.ePv = true;
        }
        this.enN.P(ldz2);
        this.eSw.doTick(ldz2);
        this.eSx.doTick(ldz2);
        this.aqR();
        if (this.eSy != null) {
            this.eSy.doTick(ldz2);
        }
    }

    public void oW(int n) {
        if (!this.eSv) {
            return;
        }
        switch (n) {
            case 2: {
                if (this.eSw.isActive()) break;
                if (this.eSx.isActive()) {
                    this.eSx.setActive(false);
                }
                this.eSw.setActive(true);
                break;
            }
            case 10: {
                if (this.eSx.isActive()) break;
                if (this.eSw.isActive()) {
                    this.eSw.setActive(false);
                }
                this.eSx.setActive(true);
                break;
            }
        }
    }

    public void a(cdb cdb2, ljq ljq2, ljq ljq3) {
        super.a(cdb2, ljq2, ljq3);
        if (cdb2 == null) {
            assert (false);
            return;
        }
        this.eSz = cdb2;
        if (!cdb2.aJI()) {
            this.aWY();
        }
        this.aVw();
        this.aVx();
        this.eH(0.1f);
    }

    void eH(float f2) {
        bvf bvf2;
        lka lka2;
        if (this.eSz != null && this.eSz.aJI() && this.aAG() != null && this.aAG() instanceof bvf && (lka2 = (bvf2 = (bvf)this.aAG()).azu()) != null) {
            lka2.lT(f2);
        }
    }

    public void g(cdb cdb2) {
        super.g(cdb2);
        this.aWZ();
        this.eH(1.5f);
        if (this.eSz == null) {
            return;
        }
        ljq ljq2 = this.aAG().av().esF();
        ljq2.y += 2.2f;
        if (this.eSz.aAG() == null) {
            return;
        }
        this.eSz.aAG().c(ljq2);
        this.eSz = null;
        this.aVw();
        this.aVx();
    }

    private void aWY() {
        if (this.eSD) {
            this.aWZ();
        }
        assert (this.eSz != null);
        assert (this.eSz.aAG() != null);
        assert (this.eSz.aAG().axa() != null);
        assert (this.aAG() != null);
        assert (this.aAG().axa() != null);
        kni kni2 = (kni)this.MessageDelegator.h(782);
        kni2.hsP = false;
        kni2.iBr = false;
        kni2.dsK = false;
        kni2.pPN = 64;
        kni2.ehv = this.aAG().axa();
        kni2.ehw = this.eSz.aAG().axa();
        kni2.doP = this.eSC;
        kni2.biE = this.eSA;
        kni2.biF = this.eSB;
        kni2.ec = this.getGUID();
        kni2.biD = true;
        this.MessageDelegator.a(kni2);
        this.eSD = true;
    }

    private void aWZ() {
        if (!this.eSD) {
            return;
        }
        knj knj2 = (knj)this.MessageDelegator.h(778);
        knj2.pPN = 1;
        knj2.hsP = false;
        knj2.iBr = false;
        knj2.dsK = false;
        knj2.doP = this.eSC;
        knj2.ec = this.getGUID();
        knj2.ehv = this.getGUID();
        knj2.ehw = this.getGUID();
        this.MessageDelegator.a(knj2);
        this.eSD = false;
    }

    @Override
    public void b(byv byv2, boolean bl) {
        assert (this.eSY != null);
        if (bl) {
            eeh eeh2 = (eeh)this.MessageDelegator.h(12814, this.GUID, this.eSY);
            eeh2.bhU = byv2.aEl();
            this.MessageDelegator.F(eeh2);
            grl grl2 = (grl)this.MessageDelegator.h(11010, this.GUID, lcr.ak((ldv)this.GUID, (int)this.dj));
            grl2.edV = byv2;
            grl2.ecU = this.eSt.aEM();
            this.MessageDelegator.F(grl2);
        }
    }

    public void aK(ljq ljq2) {
        if (this.eSw == null || this.eSx == null) {
            return;
        }
        if (this.eSw.isActive()) {
            this.eSw.aK(ljq2);
        } else if (this.eSx.isActive()) {
            this.eSx.aK(ljq2);
        }
    }

    public void cL(float f2) {
        if (this.eSw == null || this.eSx == null) {
            return;
        }
        if (this.eSw.isActive()) {
            this.eSw.cL(f2);
        } else if (this.eSx.isActive()) {
            this.eSx.cL(f2);
        } else {
            this.eSE = f2;
        }
    }

    public void amY() {
        if (this.eSw == null || this.eSx == null) {
            return;
        }
        if (this.eSw.isActive()) {
            this.eSw.amY();
        } else if (this.eSx.isActive()) {
            this.eSx.amY();
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
        eh eh2 = map.get("AttachPoint Mount Camera");
        assert (eh2 != null);
        this.eSU = eh2.fb();
        eh2 = map.get("AttachPoint Mount Camera Distance");
        assert (eh2 != null);
        ljq ljq2 = new ljq(eh2.fb());
        ljq2.et(this.eSU);
        this.byT = eh2.fb().eqN();
        this.ePI = true;
    }

    public void aVi() {
        if (this.isCleanedUp()) {
            return;
        }
        assert (this.eSw != null);
        assert (!this.isServerObject());
        bvj bvj2 = (bvj)((Object)this.aAG());
        bvj2.aAj().aAA();
        ((byr)this.eSt).aDR();
        if (this.eSt.aEP().aEy()) {
            this.eSx.setActive(true);
            if (this.eSE != -1.0f) {
                this.eSx.cL(this.eSE);
            }
        } else {
            this.eSw.setActive(true);
            if (this.eSE != -1.0f) {
                this.eSw.cL(this.eSE);
            }
        }
        this.eSE = -1.0f;
        this.eSv = true;
        bvj2.azx().aAV();
    }

    public void aVj() {
        if (this.isCleanedUp()) {
            return;
        }
        assert (this.eSw != null);
        assert (!this.isServerObject());
        bvj bvj2 = (bvj)((Object)this.aAG());
        bvj2.aAj().aAy();
        this.eSw.setActive(false);
        this.eSx.setActive(false);
        this.eSv = false;
        bvj2.azx().aAW();
        boolean bl = this.eSt.aEK().aEP().Ow();
        if (this.eSt.aEN() != 0 || bl) {
            if (this.eSt.aEN() != 0) {
                this.eSt.nF(this.eSt.aEN());
            }
            this.eSt.aEK().aA(4, 1);
            this.eSt.aDc().aDh();
        }
    }

    public void aZ(ljq ljq2) {
        ((byr)this.eSt).dF(-ljq2.y);
    }

    @Override
    public final void a(bzc bzc2) {
        this.enN.a(bzc2);
    }

    public void f(lgj lgj2) {
        super.f(lgj2);
    }

    @Override
    public void h(ljq ljq2, lgl lgl2) {
        this.aAG().aX(ljq2);
        this.aAG().h(lgl2);
    }

    protected void aIw() {
        super.aIw();
        this.eSy = new cmq();
        this.eSy.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eSy);
        this.eSy.b(this);
    }

    protected void aIx() {
        super.aIx();
        if (this.eSy != null) {
            this.MessageDelegator.hd(this.eSy.getGUID());
            this.eSy = null;
        }
    }

    protected void a(uk uk2) {
        switch (uk2.Uo) {
            case 3: {
                tz tz2 = (tz)uk2;
                if (!tz2.Pp) break;
                this.aWX();
                break;
            }
            default: {
                super.a(uk2);
            }
        }
    }

    public cdb aXa() {
        return this.eSz;
    }

    public chz sl(int n) {
        return null;
    }

    public void aVw() {
        assert (this.eSw != null);
        if (this.eSw == null) {
            return;
        }
    }

    public void aVx() {
        byr byr2 = (byr)this.aWW();
        if (byr2 == null) {
            return;
        }
        float f2 = byr2.FZ();
        this.cL(f2);
    }

    public void d(et et2, float f2) {
        super.d(et2, f2);
        if (et2.getType() == 352) {
            float f3 = et2.fN();
            float f4 = ((et)this.fi().ae(354)).fN();
            float f5 = f3 / f4;
            byr byr2 = (byr)this.aWW();
            byr2.dH(f5);
            this.cL(byr2.FZ());
        }
    }
}

