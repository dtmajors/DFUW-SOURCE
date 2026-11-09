/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hzo
 *  lcr
 */
import java.util.Collections;
import java.util.Set;

public class iik
extends ioa {
    private static final String maw = "ASTAR";
    private static final String max = "LastActivatedModeBowStaff";
    private static final String may = "MeleeUnarmedModeIndex";
    private static final String maz = "BowStaffModeIndex";
    private static final int maA = 20;
    private static final int maB = 20;
    private static final int maC = 20;
    private static final int maD = 20;
    private boolean maE;
    private ipx maF;
    private ipx maG;
    private ipx maH;
    private iij maI;
    private ist maJ = null;
    private boolean maK = false;
    private Set<ija> maL = lcn.emx();
    private iiy maM;
    private ijk maN;
    private ijy maO;
    private ild maP;
    private ikk maQ;
    private iiw maR = null;
    private iiu maS = null;
    private ijq maT = null;
    private ilj maU = null;
    private ijt maV = null;
    private iin maW = null;
    private ikm maX = null;
    private ikt maY;
    private ila maZ;
    private ikw mba;

    public iik() {
        super("HudWindowNew", "HudNew.swf");
        this.OQ(jnz.nGe | jnz.nGi | jnz.nGy);
        this.a(hya.lmt, false);
        this.a(hya.lmv, false);
        this.a(hya.lmw, false);
        this.a(maw, hsu.ldg, true);
        this.a(hya.lmp, true);
        this.a(max, hsu.ldg, false);
        this.a(may, hsu.ldg, 0);
        this.a(maz, hsu.ldg, 0);
    }

    @Override
    public void initialize() {
        super.initialize();
        iik.cyJ().cJb();
    }

    @Override
    public void cFb() {
        super.cFb();
        ike.dca();
    }

    public Set<ija> cZq() {
        return Collections.unmodifiableSet(this.maL);
    }

    public void a(ija ija2) {
        this.maL.add(ija2);
    }

    public void b(ija ija2) {
        this.maL.remove(ija2);
    }

    public void cZr() {
        this.maE = true;
        this.a(hya.lmt, true);
        this.a(hya.lmv, true);
        this.a(hya.lmw, true);
        this.H(0x2E2E2E, 0.7f);
        this.maF.setVisible(false);
        this.maG.setVisible(false);
        this.maH.setVisible(true);
        this.cZO();
        this.maI.setVisible(true);
        if (this.maK) {
            this.maJ.setVisible(true);
        }
        iik.cyJ().cHw().b(hyc.lmZ, false);
        hso.cxK().a(jnz.nFY);
        for (ija ija2 : this.maL) {
            ija2.qu(true);
        }
    }

    public void cZs() {
        this.maE = false;
        this.a(hya.lmt, false);
        this.a(hya.lmv, false);
        this.a(hya.lmw, false);
        this.cGa();
        this.maF.setVisible(true);
        this.maG.setVisible(true);
        this.maH.setVisible(false);
        this.maI.setVisible(false);
        this.maJ.setVisible(false);
        hso.cxK().a(jnz.nFE);
        iik.cyJ().cHw().b(hyc.lmZ, false);
        for (ija ija2 : this.maL) {
            ija2.qu(false);
        }
        ike.dbZ();
    }

    public void a(ijc ijc2) {
        this.maH.W(ijc2);
        ijc2.mci.b(new jlq<iik>(this, this){
            final /* synthetic */ iik mbb;
            {
                this.mbb = iik2;
                super(iik3);
            }

            public void e(iik iik2) {
                iik.a(iik2);
            }

            public /* synthetic */ void R(Object object) {
                this.e((iik)object);
            }
        });
    }

    @Override
    public boolean cZt() {
        return this.nk(maw);
    }

    public void qs(boolean bl) {
        this.q(maw, bl);
    }

    public void py(boolean bl) {
        if (this.maW != null) {
            this.maW.update();
        }
    }

    public boolean cGb() {
        return true;
    }

    public boolean cFL() {
        return true;
    }

    public void c(boolean bl, int n, int n2) {
        this.q(max, bl);
        this.w(may, n);
        this.w(maz, n2);
    }

    @Override
    public void cDZ() {
        super.cDZ();
        jpy jpy2 = (jpy)this.MessageDelegator.bzx().bzt().d(lcr.qBQ);
        if (jpy2 != null) {
            jpy2.dQd().e(this.nk(max).booleanValue(), this.nh(may).intValue(), this.nh(maz).intValue());
        }
    }

    public ikm cZu() {
        return this.maX;
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.dhJ().a(ipn.mse);
        this.maF = new ipx();
        this.maF.a(ipn.msf);
        this.dhJ().W(this.maF);
        this.maG = new ipx();
        this.maG.a(ipn.mse);
        this.dhJ().W(this.maG);
        this.maH = new ipx();
        this.maH.setVisible(false);
        this.dhJ().W(this.maH);
        this.a(this.cZw());
        this.a(this.cZx());
        this.a(this.cZH());
        this.a(this.cZz());
        this.a(this.cZA());
        this.a(this.cZB());
        this.a(this.cZC());
        this.a(this.cZD());
        this.a(this.cZE());
        this.a(this.cZF());
        this.a(this.cZy());
        this.a(this.cZG());
        if (hzo.lyw) {
            this.a(this.cZI());
            this.a(this.cZJ());
            this.a(this.cZK());
        }
    }

    @Override
    protected void cuf() {
        super.cuf();
        this.maF.r(20, 20, this.dhJ().getWidth() - 20 - 20, this.dhJ().getHeight() - 20 - 20);
        this.maG.r(20, 20, this.dhJ().getWidth() - 20 - 20, this.dhJ().getHeight() - 20 - 20);
        this.maH.r(20, 20, this.dhJ().getWidth() - 20 - 20, this.dhJ().getHeight() - 20 - 20);
        this.cZP();
    }

    @Override
    protected void cZv() {
        joa joa2 = hso.cxK().cyc();
        this.g(0.0f, 0.0f, joa2.W, joa2.H);
        super.cZv();
    }

    @Override
    protected void b(jnz jnz2, jnz jnz3) {
        super.b(jnz2, jnz3);
        if (this.maF != null) {
            this.maF.setVisible(jnz3 == jnz.nFE);
        }
    }

    private ijd cZw() {
        this.maM = new iiy();
        this.a((ija)this.maM);
        return this.maM;
    }

    private ijd cZx() {
        this.maN = new ijk();
        this.a((ija)this.maN);
        return this.maN;
    }

    private ijd cZy() {
        this.maV = new ijt();
        this.a((ija)this.maV);
        return this.maV;
    }

    private ijd cZz() {
        this.maO = new ijy();
        this.a((ija)this.maO);
        return this.maO;
    }

    private ijd cZA() {
        this.maP = new ild();
        this.a((ija)this.maP);
        return this.maP;
    }

    private ijd cZB() {
        this.maQ = new ikk();
        this.a((ija)this.maQ);
        return this.maQ;
    }

    private ijd cZC() {
        this.maR = new iiw();
        this.a((ija)this.maR);
        return this.maR;
    }

    private ijd cZD() {
        this.maS = new iiu();
        this.a((ija)this.maS);
        return this.maS;
    }

    private ijd cZE() {
        this.maT = new ijq();
        this.a((ija)this.maT);
        return this.maT;
    }

    private ijd cZF() {
        this.maU = new ilj();
        this.a((ija)this.maU);
        return this.maU;
    }

    private ijd cZG() {
        this.maW = new iin();
        this.a((ija)this.maW);
        return this.maW;
    }

    private ijd cZH() {
        this.maX = new ikm();
        this.a((ija)this.maX);
        return this.maX;
    }

    private ijd cZI() {
        this.maY = new ikt();
        this.a((ija)this.maY);
        return this.maY;
    }

    private ijd cZJ() {
        this.maZ = new ila();
        this.a((ija)this.maZ);
        return this.maZ;
    }

    private ijd cZK() {
        this.mba = new ikw();
        this.a((ija)this.mba);
        return this.mba;
    }

    private void cZL() {
        ike.qF(this.cZt());
    }

    private void cZM() {
        ike.dbZ();
    }

    private void cZN() {
        if (ike.dcb() != null) {
            this.qs(ike.dcb().cZt());
        }
        for (ija ija2 : this.maL) {
            ija2.cNl();
        }
        this.cZs();
        this.maK = false;
    }

    private void cZO() {
        if (this.maI != null) {
            return;
        }
        this.maI = new iij(this){
            final /* synthetic */ iik mbb;
            {
                this.mbb = iik2;
            }

            public void cNl() {
                iik.b(this.mbb);
            }

            public void cGR() {
                this.mbb.cZs();
            }

            public void cZi() {
                iik.c(this.mbb);
            }

            public void cZj() {
                iik.d(this.mbb);
            }
        };
        this.maI.setVisible(false);
        this.dhJ().W(this.maI);
        this.maJ = new ist(lwx.tkZ);
        this.maJ.b(isf.mwO);
        this.maJ.zY(13);
        this.maJ.Rk(12685656);
        this.maJ.setVisible(false);
        this.dhJ().W(this.maJ);
    }

    private void cZP() {
        if (this.maI != null) {
            this.maI.ek(0, 0);
        }
        if (this.maJ != null) {
            this.maJ.ek(this.maI == null ? 5 : this.maI.getWidth() + 5, 0);
        }
    }

    private void a(ijd ijd2) {
        if (ijd2.cZX()) {
            this.maG.W(ijd2);
        } else {
            this.maF.W(ijd2);
        }
    }

    private void cZQ() {
        this.maJ.setVisible(true);
        this.maK = true;
    }

    static /* synthetic */ void a(iik iik2) {
        iik2.cZQ();
    }

    static /* synthetic */ void b(iik iik2) {
        iik2.cZN();
    }

    static /* synthetic */ void c(iik iik2) {
        iik2.cZL();
    }

    static /* synthetic */ void d(iik iik2) {
        iik2.cZM();
    }
}

