/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class ihs
extends iny
implements jmt {
    private static final String lWz = "Pinned";
    private static final String lWA = "ActionAlpha";
    private static final String lWB = "GUIAlpha";
    private ihx lWC = ihx.lXF;
    private iht lWD;
    private ipx lWE;
    private ipf lWF;
    private int lWG;
    private int lWH;
    private boolean lWI = true;
    private ipq lWJ;
    private int lWK;
    private int lWL;
    private boolean lWM = false;
    private boolean lWN = false;
    private int lWO = 3;
    private int lWP = 0;
    private float lWQ = 0.5f;
    private float lWR = 1.0f;
    private jmq lWS = null;
    private ire lWT = null;
    private boolean lWU = false;

    public ihs(String string, String string2) {
        super(string, string2);
        this.a(hyb.lmD);
        this.a(lWz, hsu.ldg, this.lWM);
        this.a(lWA, hsu.ldg, Float.valueOf(this.lWQ));
        this.a(lWB, hsu.ldg, Float.valueOf(this.lWR));
    }

    @Override
    public void initialize() {
        super.initialize();
        hso.cxK().cxR().dMc().a(this);
        if (this.lWN) {
            this.lWN = false;
            this.cYm();
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (hso.cxK() != null && hso.cxK().cxR() != null && hso.cxK().cxR().dMc() != null) {
            hso.cxK().cxR().dMc().b(this);
        }
    }

    public iht cXM() {
        return this.lWD;
    }

    public iph cXE() {
        return this.lWE;
    }

    public ipq cXN() {
        return this.lWJ;
    }

    public void close() {
        this.cGR();
    }

    public ihx cXO() {
        return this.lWC;
    }

    @Override
    public boolean d(int n, int n2, String string) {
        if (!super.d(n, n2, string)) {
            return false;
        }
        int n3 = n - (int)this.cEE() - (this.dhJ() != null ? this.dhJ().getX() : 0);
        int n4 = n2 - (int)this.cEF() - (this.dhJ() != null ? this.dhJ().getY() : 0);
        if (this.lWD != null && this.lWD.djL() && this.lWD.dF(n3 - this.lWD.getX(), n4 - this.lWD.getY())) {
            return true;
        }
        if (this.lWE != null && this.lWE.dF(n3 - this.lWE.getX(), n4 - this.lWE.getY())) {
            return true;
        }
        return this.lWJ != null && this.lWJ.djL() && this.lWJ.dF(n3 - this.lWJ.getX(), n4 - this.lWJ.getY());
    }

    public float cXP() {
        return this.lWQ;
    }

    public void kF(float f) {
        if (f == this.lWQ) {
            return;
        }
        this.lWQ = f;
        this.d(lWA, this.lWQ);
        if (this.lWC == ihx.lXF) {
            this.kH(this.lWQ);
        }
    }

    public float cXQ() {
        return this.lWR;
    }

    public void kG(float f) {
        if (f == this.lWR) {
            return;
        }
        this.lWR = f;
        this.d(lWB, this.lWR);
        if (this.lWC != ihx.lXF) {
            this.kH(this.lWR);
        }
    }

    public float cXR() {
        return this.lWC == ihx.lXF ? this.cXP() : this.cXQ();
    }

    public boolean isPinned() {
        return this.lWD != null && this.lWD.cYu() != null ? this.lWM : false;
    }

    public void ql(boolean bl) {
        if (bl == this.lWM) {
            return;
        }
        this.lWM = bl;
        if (this.isInitialized()) {
            this.cYm();
        } else {
            this.lWN = true;
        }
    }

    public void qm(boolean bl) {
        if (this.cXM() != null && this.cXM().cYv() != null) {
            this.cXM().cYv().rF(bl);
        }
    }

    @Override
    public void a(jmr jmr2) {
        if (jmr2.iMe == this.lWS) {
            this.cXM().b(jmr2);
        }
    }

    public int cXS() {
        return this.lWK;
    }

    public int cXT() {
        return this.lWL;
    }

    public void dG(int n, int n2) {
        this.lWK = n;
        this.lWL = n2;
    }

    public ire cXU() {
        return this.lWT;
    }

    public boolean isResizable() {
        return this.lWI;
    }

    public void setResizable(boolean bl) {
        if (bl == this.lWI) {
            return;
        }
        this.lWI = bl;
        if (this.lWJ != null) {
            this.lWJ.setVisible(bl);
        }
    }

    public void a(ire ire2) {
        this.lWT = ire2;
    }

    @Override
    public boolean cXV() {
        return this.lWT != ire.mul;
    }

    @Override
    public boolean cXW() {
        return this.lWT != ire.muk;
    }

    public int cXX() {
        return this.lWO;
    }

    public void QV(int n) {
        this.lWO = n;
    }

    public String cXY() {
        return this.aDa + "WindowFrameOptions";
    }

    public String cXZ() {
        return "ChatWindow.swf";
    }

    public int cYa() {
        return this.lWP;
    }

    public void QW(int n) {
        if (n == this.lWP) {
            return;
        }
        this.lWP = n;
        if (this.dhJ() != null) {
            this.dhJ().pack();
        }
    }

    public boolean isOpen() {
        return this.isVisible();
    }

    @Override
    protected void cBa() {
        super.cBa();
        this.lWM = this.nk(lWz);
        this.cYk();
    }

    protected void cEi() {
        super.cEi();
        if (!ihs.f(hso.cxK().cxN())) {
            this.a(ihx.lXD);
        }
    }

    @Override
    protected void cEj() {
        super.cEj();
        if (!ihs.f(hso.cxK().cxN())) {
            this.a(ihx.lXE);
        }
    }

    @Override
    protected void b(jnz jnz2, jnz jnz3) {
        super.b(jnz2, jnz3);
        if (ihs.f(jnz3)) {
            this.a(ihx.lXF);
        } else if (this.cFr()) {
            this.a(ihx.lXD);
        } else {
            this.a(ihx.lXE);
        }
        this.g(jnz3);
    }

    @Override
    protected void cEc() {
        if (this.isVisible() && !this.lWM && ihs.f(hso.cxK().cxN())) {
            this.setVisible(false);
            return;
        }
        super.cEc();
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.lWD = this.cYb();
        if (this.lWD != null) {
            this.dhJ().W(this.lWD);
            this.cYj();
            if (this.lWD != null && this.lWD.cYu() == null) {
                this.ql(true);
            }
        }
        this.lWE = ipx.h(new ipf[0]);
        this.dhJ().W(this.lWE);
        if (this.lWI) {
            this.lWJ = this.cGj();
            if (this.lWJ != null) {
                this.dhJ().W(this.lWJ);
            }
        }
    }

    @Override
    protected void cGQ() {
        super.cGQ();
        this.kF(this.ni(lWA).floatValue());
        this.kG(this.ni(lWB).floatValue());
    }

    protected iht cYb() {
        return new iht(this){
            final /* synthetic */ ihs lWV;
            {
                this.lWV = ihs2;
            }

            public void dH(int n, int n2) {
                ihs.a(this.lWV, n, n2);
            }

            public void dI(int n, int n2) {
                ihs.b(this.lWV, n, n2);
            }

            public void dJ(int n, int n2) {
                ihs.c(this.lWV, n, n2);
            }

            public void a(ios ios2) {
                ioc ioc2 = ios2.eo(0, 0);
                this.lWV.m(new joa(ioc2.cf, ioc2.cg, ios2.getWidth(), ios2.getHeight()));
            }

            public void qn(boolean bl) {
                this.lWV.qn(bl);
            }

            public void cGR() {
                this.lWV.cGR();
            }

            public ihv cXJ() {
                return this.lWV.cXJ();
            }

            public ihu cYn() {
                return this.lWV.cXK();
            }

            public ios cGS() {
                return this.lWV.cGs();
            }

            public iox cGl() {
                return this.lWV.cGl();
            }

            public ios cGk() {
                return this.lWV.cGk();
            }
        };
    }

    protected ihv cXJ() {
        return new ihv();
    }

    protected ihu cXK() {
        return new ihl();
    }

    protected ios cGs() {
        return new ivy(this){
            final /* synthetic */ ihs lWV;
            {
                this.lWV = ihs2;
            }

            public void cLq() {
                ioc ioc2 = this.eo(0, 0);
                this.lWV.m(new joa(ioc2.cf, ioc2.cg, this.getWidth(), this.getHeight()));
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lzb.tNi.bD(new Object[0]).exA());
            }
        };
    }

    protected iox cGl() {
        return new ivr(this){
            final /* synthetic */ ihs lWV;
            {
                this.lWV = ihs2;
            }

            public void pn(boolean bl) {
                this.lWV.qn(bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lzb.tNj.bD(new Object[0]).exA());
            }
        };
    }

    protected ios cGk() {
        return new ivc(this){
            final /* synthetic */ ihs lWV;
            {
                this.lWV = ihs2;
            }

            public void cLq() {
                this.lWV.cGR();
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lzb.tNk.bD(new Object[0]).exA());
            }
        };
    }

    protected ipq cGj() {
        return this.cYc();
    }

    protected ipq cYc() {
        this.dG(2, 1);
        return new izv(this, this.lWT){
            final /* synthetic */ ihs lWV;
            {
                this.lWV = ihs2;
                super(ire2);
            }

            public boolean dK(int n, int n2) {
                super.dK(n, n2);
                ihs.a(this.lWV);
                return true;
            }

            public boolean dL(int n, int n2) {
                super.dL(n, n2);
                this.lWV.b(hxv.llh);
                return true;
            }

            public boolean du(int n, int n2) {
                super.du(n, n2);
                ihs.a(this.lWV);
                ihs.d(this.lWV, ioa.cxP().bpb(), ioa.cxP().bpc());
                return true;
            }

            public boolean dM(int n, int n2) {
                super.dM(n, n2);
                if (this.dma()) {
                    ihs.e(this.lWV, ioa.cxP().bpb(), ioa.cxP().bpc());
                }
                return true;
            }

            public boolean dN(int n, int n2) {
                super.dN(n, n2);
                this.lWV.b(hxv.llh);
                ihs.f(this.lWV, ioa.cxP().bpb(), ioa.cxP().bpc());
                return true;
            }
        };
    }

    @Override
    protected void cYd() {
        this.cYi();
        super.cYd();
        if (this.lWF != null) {
            this.lWD.E(this.lWG, this.lWF.getWidth(), this.lWH);
        }
        this.kH(this.cXR());
    }

    protected void m(joa joa2) {
        ihy ihy2 = this.e(joa2);
        ihy2.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a((amf)((Object)ihy2));
    }

    protected ihy e(joa joa2) {
        return new ihy(this, this.cXY(), this.cXZ(), this, joa2, this.lWQ, this.lWR){
            final /* synthetic */ ihs lWV;
            {
                this.lWV = ihs2;
                super(string, string2, ihs3, joa2, f, f2);
            }

            protected void cNl() {
                this.lWV.a(this);
            }
        };
    }

    protected void a(ihy ihy2) {
        this.kF(ihy2.cXP());
        this.kG(ihy2.cXQ());
    }

    protected void qn(boolean bl) {
        this.ql(bl);
    }

    protected void cGR() {
        if (!this.lWU) {
            this.q("Valid", false);
        }
        this.MessageDelegator.hd(this.getGUID());
    }

    protected void cds() {
        int n;
        this.kH(this.lWC == ihx.lXF ? this.lWQ : this.lWR);
        boolean bl = this.lWC != ihx.lXF;
        boolean bl2 = this.lWC == ihx.lXD;
        int n2 = 0;
        int n3 = 0;
        int n4 = this.lWJ != null ? this.lWK : 0;
        int n5 = n = this.lWJ != null ? this.lWL : 0;
        if (this.lWD != null) {
            this.lWD.setVisible(bl);
            this.lWD.setActive(bl2);
            n3 += this.lWD.djL() ? this.lWD.cYq() : this.lWD.getHeight();
        }
        if (this.lWF != null) {
            this.lWF.setVisible(bl);
            this.lWF.setActive(bl2);
        }
        if (this.lWJ != null) {
            this.lWJ.setVisible(bl && this.cYe());
            this.lWJ.setActive(bl2);
        }
        this.q(n2, n3, n4, n);
    }

    protected boolean cYe() {
        return true;
    }

    @Override
    protected void cYf() {
        super.cYf();
        this.dhJ().setSize(this.cXE().getWidth(), this.lWD.getHeight() + this.lWO + this.cXE().getHeight());
    }

    @Override
    protected void cuf() {
        super.cuf();
        int n = this.cXH();
        int n2 = this.cXI();
        int n3 = this.dhJ().getWidth();
        int n4 = this.dhJ().getHeight();
        int n5 = n3 - this.cXH() - this.dhN();
        int n6 = n4 - this.cXI() - this.dhO();
        if (this.lWD.djL() || !this.dhs()) {
            this.lWD.r(n + this.lWP, n2, n5, this.lWD.getHeight());
            n2 = this.lWD.getY() + this.lWD.getHeight() + this.lWO;
            n6 = this.dhJ().getHeight() - this.dhO() - this.dhS() - n2;
        } else if (this.dhs()) {
            n2 += this.dhQ();
            n6 -= this.dhQ();
        }
        this.lWE.r(n, n2, n5, n6);
        if (this.lWF != null) {
            this.lWF.ek(this.lWG, 0);
        }
        if (this.lWJ != null) {
            this.lWJ.ek(this.dhJ().getWidth() - this.dhN() - this.lWJ.getWidth() + this.cXS(), this.dhJ().getHeight() - this.dhO() - this.lWJ.getHeight() + this.cXT());
        }
    }

    protected void ku(float f) {
        if (this.dhJ() != null) {
            this.dhJ().kh(f);
        }
    }

    protected ipf cYg() {
        return this.lWF;
    }

    protected void g(ipf ipf2) {
        if (ipf2 == this.lWF) {
            return;
        }
        if (this.lWF != null) {
            this.lWF.removeFromParent();
        }
        this.lWF = ipf2;
        if (this.lWF != null) {
            this.dhJ().W(this.lWF);
        }
    }

    public void a(ipf ipf2, int n, int n2, int n3, loz loz2, jmq jmq2) {
        this.g(ipf2);
        this.lWG = n;
        this.lWH = n2;
        this.cXM().a(n, n2, n3, loz2, jmq2);
    }

    public void a(ipf ipf2, int n, int n2, int n3, String string, jmq jmq2) {
        this.g(ipf2);
        this.lWG = n;
        this.lWH = n2;
        this.cXM().a(n, n2, n3, string, jmq2);
    }

    protected void a(ipf ipf2, int n, int n2, int n3, loz loz2) {
        this.a(ipf2, n, n2, n3, loz2, null);
    }

    protected boolean cYh() {
        return this.lWU;
    }

    protected void qo(boolean bl) {
        this.lWU = bl;
    }

    private static boolean f(jnz jnz2) {
        return jnz2 == jnz.nFE || jnz2 == jnz.nFW;
    }

    private void a(ihx ihx2) {
        if (ihx2 == this.lWC) {
            return;
        }
        this.lWC = ihx2;
        this.cYi();
    }

    private void cYi() {
        this.cds();
        this.cEq();
    }

    void kH(float f) {
        this.ku(f);
    }

    private void cYj() {
        if (this.lWD != null && this.lWD.cYu() != null) {
            this.lWD.cYu().hX(this.lWM);
        }
    }

    private void g(jnz jnz2) {
        if (ihs.f(jnz2)) {
            this.setVisible(this.isOpen() && this.lWM);
        } else if (jnz2 == jnz.nFI) {
            this.setVisible(this.isOpen());
        } else {
            int n;
            int n2 = this.cEX();
            int n3 = n2 & (n = 1 << jnz2.ordinal());
            this.setVisible(n3 == n);
        }
    }

    private void cYk() {
        this.g(hso.cxK().cxN());
    }

    private void cYl() {
        if (this.cXU() == null) {
            this.b(hxv.llq);
        } else if (this.cXU() == ire.mul) {
            this.b(hxv.llp);
        } else if (this.cXU() == ire.mul) {
            this.b(hxv.llr);
        }
    }

    private void cYm() {
        this.q(lWz, this.lWM);
        this.cYj();
        this.cYk();
    }

    static /* synthetic */ void a(ihs ihs2, int n, int n2) {
        ihs2.dH(n, n2);
    }

    static /* synthetic */ void b(ihs ihs2, int n, int n2) {
        ihs2.dI(n, n2);
    }

    static /* synthetic */ void c(ihs ihs2, int n, int n2) {
        ihs2.dJ(n, n2);
    }

    static /* synthetic */ void a(ihs ihs2) {
        ihs2.cYl();
    }

    static /* synthetic */ void d(ihs ihs2, int n, int n2) {
        ihs2.ee(n, n2);
    }

    static /* synthetic */ void e(ihs ihs2, int n, int n2) {
        ihs2.ef(n, n2);
    }

    static /* synthetic */ void f(ihs ihs2, int n, int n2) {
        ihs2.eg(n, n2);
    }
}

