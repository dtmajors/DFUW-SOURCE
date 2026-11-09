/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class isb
extends ipx {
    private ipq mwG;
    private ipx mbe;
    private ist lUP;
    private ipf mwH;
    private ipx mct;
    private ios lXh;
    private ios lXf;
    private ipl mwI;
    private boolean mwJ;
    private boolean mwK;
    private static iqz mdv = new irl(){

        public void e(ipf ipf2) {
            isb isb2 = (isb)ipf2;
            if (isb.f(isb2) != null && isb.f(isb2).djL()) {
                isb.f(isb2).setSize(0, 0);
            }
            super.e(ipf2);
            if (isb.f(isb2) != null && isb.f(isb2).djL()) {
                isb2.setWidth(isb2.getWidth() + isb.f(isb2).dlQ() + isb.f(isb2).dlS());
            }
        }

        public void i(ipf ipf2) {
            isb isb2 = (isb)ipf2;
            if (isb.f(isb2) != null && isb.f(isb2).djL()) {
                ira.a(isb2, 1, 0, isb2.getWidth() - 2, isb2.getHeight() - 1);
                isb.f(isb2).r(0, 0, isb2.getWidth(), isb2.getHeight());
            } else {
                super.i(ipf2);
            }
        }
    };

    public isb() {
        this.setActive(false);
        this.a(mdv);
        this.mbe = ipx.l(new ipf[0]);
        this.W(this.mbe);
        this.mct = ipx.j(new ipf[0]);
        this.mbe.W(this.mct);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.mwK = false;
    }

    public ipx cZV() {
        return this.mbe;
    }

    public ipx dpi() {
        return this.mct;
    }

    public ipq dpj() {
        return this.mwG;
    }

    public void d(ipq ipq2) {
        if (ipq2 == this.mwG) {
            return;
        }
        if (this.mwG != null) {
            this.mwG.removeFromParent();
        }
        this.mwG = ipq2;
        if (this.mwG != null) {
            this.c(this.mwG, 0);
        }
    }

    public ist dan() {
        return this.lUP;
    }

    public void a(ist ist2) {
        if (ist2 == this.lUP) {
            return;
        }
        int n = itp.t(this.mwH);
        if (this.lUP != null) {
            n = this.mbe.V(this.lUP);
            this.lUP.removeFromParent();
        }
        this.lUP = ist2;
        if (this.lUP != null) {
            this.mbe.c(this.lUP, n);
        }
    }

    public ipf dpk() {
        return this.mwH;
    }

    public void ag(ipf ipf2) {
        if (ipf2 == this.mwH) {
            return;
        }
        if (this.mwH != null) {
            this.mwH.removeFromParent();
        }
        this.mwH = ipf2;
        if (this.mwH != null) {
            this.mbe.c(this.mwH, 0);
            if (this.mwH instanceof ipq) {
                ((ipq)this.mwH).setActive(this.djZ());
            }
        }
    }

    public String dpl() {
        return null;
    }

    public void rg(String string) {
    }

    public ios cYv() {
        return this.lXh;
    }

    public void d(ios ios2) {
        if (ios2 == this.lXh) {
            return;
        }
        if (this.lXh != null) {
            this.lXh.removeFromParent();
        }
        this.lXh = ios2;
        if (this.lXh != null) {
            this.mct.c(this.lXh, 0);
        }
    }

    public ios cYt() {
        return this.lXf;
    }

    public void e(ios ios2) {
        if (ios2 == this.lXf) {
            return;
        }
        if (this.lXf != null) {
            this.lXf.removeFromParent();
        }
        this.lXf = ios2;
        if (this.lXf != null) {
            this.mct.W(this.lXf);
        }
    }

    public ipl dpm() {
        return this.mwI;
    }

    public void a(ipl ipl2) {
        if (ipl2 == this.mwI) {
            return;
        }
        if (this.mwI != null) {
            this.mwI.removeFromParent();
        }
        this.mwI = ipl2;
        if (this.mwI != null) {
            this.W(this.mwI);
        }
    }

    public boolean dpn() {
        return this.mwJ;
    }

    public void sn(boolean bl) {
        if (bl == this.mwJ) {
            return;
        }
        this.mwJ = bl;
        this.dpp();
    }

    public void qm(boolean bl) {
        if (this.lXh != null) {
            this.lXh.rF(bl);
        }
    }

    public boolean isAnimated() {
        return false;
    }

    public void dpo() {
    }

    public void dbr() {
    }

    @Override
    public void kh(float f) {
        if (this.mwG != null) {
            this.mwG.hz(f);
        }
        if (this.lXh != null) {
            this.lXh.kh(f);
        }
        if (this.lXf != null) {
            this.lXf.kh(f);
        }
        if (this.mwI != null) {
            this.mwI.hz(f);
        }
    }

    public void cfZ() {
        if (this.mwK) {
            return;
        }
        this.mwK = true;
        this.dkg();
    }

    @Override
    public void cWm() {
        if (this.mwK) {
            this.mwK = false;
            if (this.lXf != null) {
                this.lXf.cLq();
            }
        }
    }

    @Override
    public boolean dK(int n, int n2) {
        if (this.mwG != null) {
            this.mwG.ri(true);
        }
        if (this.lUP != null) {
            this.lUP.ri(true);
        }
        return super.dK(n, n2);
    }

    @Override
    public boolean dL(int n, int n2) {
        if (this.mwG != null) {
            this.mwG.ri(false);
        }
        if (this.lUP != null) {
            this.lUP.ri(false);
        }
        return super.dL(n, n2);
    }

    @Override
    public boolean du(int n, int n2) {
        if (!this.mct.djL() || !this.mct.dF(n - this.mct.getX(), n2 - this.mct.getY())) {
            irz irz2 = (irz)this.djJ().djJ().djJ().djJ();
            irz2.SH(irz2.c(this));
            return true;
        }
        return super.du(n, n2);
    }

    @Override
    public boolean dx(int n, int n2) {
        return !this.mct.djL() || !this.mct.dF(n - this.mbe.getX() - this.mct.getX(), n2 - this.mbe.getY() - this.mct.getY());
    }

    public void dpp() {
    }

    public int dpq() {
        return itp.t(this.mwH);
    }

    @Override
    public void cPw() {
        super.cPw();
        if (this.djZ()) {
            this.dbr();
        }
    }

    @Override
    public hyn dd(int n, int n2) {
        hyn hyn2 = super.dd(n, n2);
        if (hyn2 != null) {
            return hyn2;
        }
        if (this.dan() != null) {
            return iae.oJ(this.dan().getText());
        }
        return null;
    }

    static /* synthetic */ ipl f(isb isb2) {
        return isb2.mwI;
    }
}

