/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public abstract class ijc
extends ijb {
    public jlk mci = new jlk();
    private static final int mcj = 8;
    private int mck;
    private int mcl;
    private ijg mcm = ijg.mcP;
    private ijg mcn = ijg.mcP;
    private ijf mbt = ijf.mcM;
    private float mco = 1.0f;
    private boolean mcp = false;
    private boolean mcq = false;
    private boolean mcr = false;
    private ipx mcs;
    private ipx mct;
    private ios lXf;
    private ipf mcu = null;
    private ipt mcv;
    private ipt mcw;
    private iph lWn;
    private lox lne = null;

    public ijc(boolean bl, boolean bl2, lox lox2) {
        this.mcp = bl;
        this.mcq = bl2;
        this.lne = lox2;
        this.mcv = new ipt(bl ? 0xC4C4C4 : 0xA8A8A8);
        this.W(this.mcv);
        this.mcw = new ipt(0xE4E4E4);
        this.mcw.setVisible(false);
        this.W(this.mcw);
        if (bl) {
            this.W(this.daK());
        }
        this.lWn = this.cXA();
        if (this.lWn != null) {
            this.W(ipx.c(this.daF(), this.daF(), this.daF(), this.daF(), this.lWn));
        }
        if (bl2) {
            this.W(this.daL());
        }
    }

    @Override
    public int day() {
        return this.mck;
    }

    @Override
    public void Rd(int n) {
        if (n == this.mck) {
            return;
        }
        this.mck = n;
        this.pack();
        this.mci.dLF();
    }

    @Override
    public int daA() {
        return this.mcl;
    }

    @Override
    public void Rf(int n) {
        if (n == this.mcl) {
            return;
        }
        this.mcl = n;
        this.pack();
        this.mci.dLF();
    }

    @Override
    public ijg daB() {
        return this.mcm;
    }

    @Override
    public void a(ijg ijg2) {
        if (ijg2 == this.mcm) {
            return;
        }
        this.mcm = ijg2;
        this.pack();
        this.mci.dLF();
    }

    @Override
    public ijg daC() {
        return this.mcn;
    }

    @Override
    public void b(ijg ijg2) {
        if (ijg2 == this.mcn) {
            return;
        }
        this.mcn = ijg2;
        this.pack();
        this.mci.dLF();
    }

    @Override
    public ijf daD() {
        return this.mbt;
    }

    @Override
    public void a(ijf ijf2) {
        this.mbt = ijf2;
        this.cZZ();
        this.mci.dLF();
    }

    @Override
    public float daE() {
        return this.mco;
    }

    @Override
    public void kI(float f) {
        this.mco = f;
        this.daa();
        this.mci.dLF();
    }

    public boolean daH() {
        return this.mcp;
    }

    public abstract ije dae();

    @Override
    public boolean cZt() {
        return this.mcr;
    }

    public void qs(boolean bl) {
        this.mcr = bl;
    }

    public iph cXE() {
        return this.lWn;
    }

    public boolean daI() {
        return this.mcq;
    }

    public abstract ikd daf();

    public iph daJ() {
        return this.mct;
    }

    @Override
    public boolean du(int n, int n2) {
        this.cqF();
        if (super.du(n, n2)) {
            return true;
        }
        if (this.daH()) {
            this.ez(n, n2);
        }
        return true;
    }

    @Override
    public boolean dM(int n, int n2) {
        if (super.dM(n, n2)) {
            return true;
        }
        this.eH(n, n2);
        return true;
    }

    @Override
    public boolean dN(int n, int n2) {
        if (super.dN(n, n2)) {
            return true;
        }
        if (this.daH()) {
            this.eA(n, n2);
        }
        return true;
    }

    @Override
    public void cND() {
        this.daN();
        if (this.dkb()) {
            this.mcv.setVisible(false);
            this.mcw.setVisible(true);
            if (this.lXf != null) {
                this.lXf.setVisible(true);
            }
            if (this.mcu != null) {
                this.mcu.setVisible(true);
            }
            for (ipf ipf2 : this.getChildren()) {
                if (this.j(ipf2)) continue;
                ipf2.hz(0.6f);
            }
            if (this.mct != null) {
                this.mct.cqF();
            }
        } else {
            this.mcv.setVisible(true);
            this.mcw.setVisible(false);
            if (this.lXf != null) {
                this.lXf.setVisible(false);
            }
            if (this.mcu != null) {
                this.mcu.setVisible(false);
            }
            for (ipf ipf3 : this.getChildren()) {
                if (this.j(ipf3)) continue;
                ipf3.hz(1.0f);
            }
        }
    }

    @Override
    public void n(int n, int n2, int n3, int n4) {
        if (iij.mat) {
            if (n <= 8) {
                this.a(ijg.mcQ);
            } else if (n + this.getWidth() >= this.djJ().getWidth() - 8) {
                this.a(ijg.mcS);
            } else if (n + this.getWidth() / 2 <= this.djJ().getWidth() / 2 + 4 && n + this.getWidth() / 2 >= this.djJ().getWidth() / 2 - 4) {
                this.a(ijg.mcR);
            } else {
                this.Rd(n);
                this.a(ijg.mcP);
            }
            if (n2 <= 8) {
                this.b(ijg.mcQ);
            } else if (n2 + this.getHeight() >= this.djJ().getHeight() - 8) {
                this.b(ijg.mcS);
            } else if (n2 + this.getHeight() / 2 <= this.djJ().getHeight() / 2 + 4 && n2 + this.getHeight() / 2 >= this.djJ().getHeight() / 2 - 4) {
                this.b(ijg.mcR);
            } else {
                this.Rf(n2);
                this.b(ijg.mcP);
            }
        } else {
            this.Rd(n);
            this.a(ijg.mcP);
            this.Rf(n2);
            this.b(ijg.mcP);
        }
    }

    @Override
    public void o(int n, int n2, int n3, int n4) {
        this.daN();
    }

    @Override
    public void daa() {
        if (this.lWn != null) {
            this.lWn.hz(this.daE());
        }
    }

    @Override
    public int daF() {
        return 4;
    }

    public iph cXA() {
        return ipx.h(new ipf[0]);
    }

    @Override
    public hyn dd(int n, int n2) {
        return this.lne == null ? super.dd(n, n2) : iae.oJ(this.lne.bD(new Object[0]).exA());
    }

    private ipf daK() {
        ipx ipx2;
        this.mcs = ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 2, new ipf[0]));
        ipx2.W(ipx.l(ipx.a(2, 1, new ipf[0]), new ipb("component_corner_01"), ipx.c(new ipf[0]), new ipb("component_corner_03"), ipx.a(2, 1, new ipf[0])));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.l(ipx.a(2, 1, new ipf[0]), new ipb("component_corner_02"), ipx.c(new ipf[0]), new ipb("component_corner_04"), ipx.a(2, 1, new ipf[0])));
        ipx2.W(ipx.a(1, 2, new ipf[0]));
        return ipx2;
    }

    private ipf daL() {
        this.mcu = new ipk(0, 10, 10);
        this.daM();
        this.mct = ipx.h(ipx.d(this.mcu), ipx.d(this.lXf));
        this.mct.a(ipn.mse);
        this.lXf.setVisible(false);
        this.mcu.setVisible(false);
        return this.mct;
    }

    private ipf daM() {
        this.lXf = new ios(this){
            final /* synthetic */ ijc mcx;
            {
                this.mcx = ijc2;
            }

            public void cLq() {
                ike.a(this.mcx.dax().cZt(), this.mcx.daf());
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyu.tKE.bD(new Object[0]).exA());
            }
        };
        this.lXf.t(new ipb("button_options_01_off_disabled", 10, 10));
        this.lXf.u(new ipb("button_options_01_off_normal", 10, 10));
        this.lXf.v(new ipb("button_options_01_off_hover", 10, 10));
        this.lXf.w(new ipb("button_options_01_off_pushing", 10, 10));
        return this.lXf;
    }

    private void daN() {
        this.djE().b(this.dkb() && this.daH() && (this.lXf == null || !this.lXf.djL() || !this.lXf.dkb()) ? hxv.llj : hxv.llh);
    }

    private boolean j(ipf ipf2) {
        return ipf2 == this.mcv || ipf2 == this.mcw || ipf2 == this.mcs || ipf2 == this.mct || ipf2 == this.mcu;
    }
}

