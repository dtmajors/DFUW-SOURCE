/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jie
extends ihs {
    private static final String ngG = "FilterOptions";
    private boolean lBD = false;
    private jhw ngH = new jhw();
    private ipb ngI;
    private izw lVr;
    private ipx ngJ;
    private ipx ngK;
    private jis ngL;
    private jit ngM;
    private iox ngN;
    private ipf ngO;

    public jie() {
        super("UnlockablesWindow", "UnlockablesWindow.swf");
        this.OQ(jnz.nGi | jnz.nGe);
        this.U(560.0f, 600.0f);
        this.setResizable(false);
        this.a(ngG, hsu.ldg, new jhw().dGL());
    }

    @Override
    public boolean isOpen() {
        return this.lBD;
    }

    public void setOpen(boolean bl) {
        if (bl == this.lBD) {
            return;
        }
        this.lBD = bl;
        this.setVisible(this.lBD);
        if (bl) {
            this.cqF();
            this.cFc();
        }
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.Rz(18);
        this.RA(80);
        this.a((ipf)new ipb("/dfdata/texture/gui/j2f/gearguise/main_icon_gear_guise.png"), 9, 0, 27, lyy.tLV.bD(new Object[0]), null);
        this.cXE().W(this.cGT());
        this.cXE().W(this.cGU());
        jid.dHb().ngx.c((jlf<jhx>)new jlr<jie, jhx>(this, this){
            final /* synthetic */ jie ngP;
            {
                this.ngP = jie2;
                super(jie3);
            }

            public void b(jie jie2, jhx jhx2) {
                jie.a(jie2, jhx2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((jie)object, (jhx)object2);
            }
        });
    }

    @Override
    protected void cGo() {
        super.cGo();
        this.dHr();
        joa joa2 = jie.cFj().cxY();
        this.R(joa2.X + joa2.W / 2.0f - this.cFw() / 2.0f, joa2.Y + joa2.H / 2.0f - this.cFx() / 2.0f);
    }

    @Override
    protected void cGQ() {
        super.cGQ();
        this.dHr();
        this.b(jhw.sl(this.nj(ngG)));
    }

    @Override
    protected ipq cGj() {
        return null;
    }

    @Override
    protected void cGR() {
        jie.cyJ().cHw().a(hyc.lna, false);
    }

    @Override
    protected void cds() {
        super.cds();
        if (this.ngI != null) {
            this.ngI.setVisible(this.cXO() == ihx.lXF);
        }
    }

    private ipf cGT() {
        ipb ipb2 = new ipb(this, "/dfdata/texture/gui/j2f/gearguise/gear_guise_bg_main.png"){
            final /* synthetic */ jie ngP;
            {
                this.ngP = jie2;
                super(string);
            }

            public void kh(float f2) {
                this.hz(f2);
            }
        };
        return ipx.l(ipx.a(6, 1, new ipf[0]), ipx.h(ipx.a(0, 0, 4, 100, ipb2), ipx.j(this.dHe())));
    }

    private ipf dHe() {
        this.ngI = new ipb("/dfdata/texture/gui/j2f/gearguise/gear_guise_gold_line.png");
        this.ngI.setVisible(false);
        return this.ngI;
    }

    private ipf cGU() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(46, 1, new ipf[0]));
        ipx2.W(this.dHf());
        ipx2.W(ipx.j(new ipb("/dfdata/texture/gui/j2f/gearguise/gear_guise_gold_line_separation.png")));
        ipx2.W(this.dHm());
        return ipx2;
    }

    private ipf dHf() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 16, new ipf[0]));
        ipx2.W(this.dHg());
        ipx2.W(ipx.a(1, 6, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x2F2F2F, 219, 1)));
        ipx2.W(ipx.a(1, 6, new ipf[0]));
        ipx2.W(ipx.l(new ist(isf.mwO, 18, 12357465, lyy.tLX.bD(new Object[0]))));
        ipx2.W(ipx.c(new ipf[]{ipx.h(this.dHj(), this.cXj())}));
        ipx2.W(ipx.a(1, 6, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x2F2F2F, 219, 1)));
        ipx2.W(ipx.a(1, 6, new ipf[0]));
        ipx2.W(this.dHk());
        return ipx2;
    }

    private ipf dHg() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(168, 24, this.cWo())));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.duS()));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x2F2F2F, 1, 22)));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dHh()));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        return ipx2;
    }

    private ipf cWo() {
        this.lVr = new izw(this){
            final /* synthetic */ jie ngP;
            {
                this.ngP = jie2;
            }

            public ipf dui() {
                return null;
            }

            public void od(String string) {
                super.od(string);
                jie.a(this.ngP);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyy.tjF.bD(new Object[0]).exA());
            }
        };
        return this.lVr;
    }

    private ipf duS() {
        return new iwg(this){
            final /* synthetic */ jie ngP;
            {
                this.ngP = jie2;
            }

            public void cLq() {
                jie.b(this.ngP);
            }
        };
    }

    private ipf dHh() {
        return new ivb(this){
            final /* synthetic */ jie ngP;
            {
                this.ngP = jie2;
            }

            public void cLq() {
                jie.c(this.ngP);
            }
        };
    }

    private ipf dHi() {
        this.ngN = new ion(this, "/dfdata/texture/gui/j2f/gearguise/button_filter/button_filter_off_disabled.png", "/dfdata/texture/gui/j2f/gearguise/button_filter/button_filter_off_normal.png", "/dfdata/texture/gui/j2f/gearguise/button_filter/button_filter_off_hover.png", "/dfdata/texture/gui/j2f/gearguise/button_filter/button_filter_off_pushing.png", "/dfdata/texture/gui/j2f/gearguise/button_filter/button_filter_on_disabled.png", "/dfdata/texture/gui/j2f/gearguise/button_filter/button_filter_on_normal.png", "/dfdata/texture/gui/j2f/gearguise/button_filter/button_filter_on_hover.png", "/dfdata/texture/gui/j2f/gearguise/button_filter/button_filter_on_pushing.png"){
            final /* synthetic */ jie ngP;
            {
                this.ngP = jie2;
                super(string, string2, string3, string4, string5, string6, string7, string8);
            }

            public void cLq() {
                jie.d(this.ngP);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyy.tMj.bD(new Object[0]).exA().toUpperCase());
            }
        };
        return this.ngN;
    }

    private ipf dHj() {
        this.ngK = ipx.d(new ist(isf.mwO, 16, 0x4A4A4A, lvn.sXM.bD(new Object[0]).exA()));
        return this.ngK;
    }

    private ipf cXj() {
        this.ngL = new jis();
        this.dyy();
        return this.ngL;
    }

    private ipf dHk() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dHi()));
        ipx2.W(ipx.a(3, 1, new ipf[0]));
        this.ngO = ipx.d(new ipk(0x2F2F2F, 1, 12));
        ipx2.W(this.ngO);
        ipx2.W(ipx.a(3, 1, new ipf[0]));
        ipx2.W(this.dHl());
        return ipx2;
    }

    private ipf dHl() {
        this.ngJ = ipx.l(new ipf[0]);
        this.dHn();
        return this.ngJ;
    }

    private ipf dHm() {
        this.ngM = new jit(this){
            final /* synthetic */ jie ngP;
            {
                this.ngP = jie2;
            }

            public void h(ain ain2) {
                jie.a(this.ngP, ain2);
            }
        };
        return this.ngM;
    }

    private void dHn() {
        this.ngJ.removeAllChildren();
        for (jhv enum_ : this.ngH.nfY) {
            this.ngJ.W(ipx.d(new jii(enum_)));
        }
        for (jia jia2 : this.ngH.mQq) {
            this.ngJ.W(ipx.d(new jil(jia2)));
        }
        for (jhz jhz2 : this.ngH.nfZ) {
            this.ngJ.W(ipx.d(new jik(jhz2)));
        }
        this.ngN.hX(!this.ngH.nfY.isEmpty() || !this.ngH.mQq.isEmpty() || !this.ngH.nfZ.isEmpty());
        this.ngO.setVisible(this.ngN.dir());
    }

    private void dyy() {
        int n = this.ngL.e(this.ngH);
        this.ngL.setVisible(n > 0);
        this.ngK.setVisible(n == 0);
    }

    protected void b(jhw jhw2) {
        this.ngH = jhw2.dGH();
        this.dHn();
        this.dyy();
        this.B(ngG, jhw2.dGL());
    }

    private void cWS() {
        this.sm(this.lVr.getText());
    }

    private void dHo() {
        this.cWS();
    }

    private void dHp() {
        this.lVr.setText("");
        this.sm("");
    }

    private void dHq() {
        ioc ioc2 = this.ngN.eo(0, 0);
        jim jim2 = new jim(this, this, new joa(ioc2.cf, ioc2.cg, this.ngN.getWidth(), this.ngN.getHeight()), this.ngH){
            final /* synthetic */ jie ngP;
            {
                this.ngP = jie2;
                super(ioa2, joa2, jhw2);
            }

            public void d(jhw jhw2) {
                jie.a(this.ngP, jhw2);
            }
        };
        jim2.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a((amf)((Object)jim2));
    }

    private void c(jhw jhw2) {
        this.B(ngG, jhw2.dGL());
        this.b(jhw2);
    }

    private void f(ain ain2) {
        this.g(ain2);
    }

    private void a(jhx jhx2) {
        this.dyy();
    }

    private void dHr() {
        this.T(this.cFy(), this.cFz());
    }

    private void sm(String string) {
        jib jib2 = new jib();
        jib2.ngs = string;
        this.b(jib2);
    }

    private void g(ain ain2) {
        String string = jid.dHb().e(ain2).dGY().exA();
        this.lVr.setText(string);
        jib jib2 = new jib();
        jib2.ngs = string;
        this.b(jib2);
    }

    private void b(jib jib2) {
        int n = this.ngL.a(new iub(this, jib2){
            final /* synthetic */ jib ngQ;
            final /* synthetic */ jie ngP;
            {
                this.ngP = jie2;
                this.ngQ = jib2;
            }

            public boolean a(iua iua2) {
                jio jio2 = (jio)iua2;
                return jio2.a(this.ngQ);
            }
        });
        this.ngL.setVisible(n > 0);
        this.ngK.setVisible(n == 0);
    }

    static /* synthetic */ void a(jie jie2, jhx jhx2) {
        jie2.a(jhx2);
    }

    static /* synthetic */ void a(jie jie2) {
        jie2.cWS();
    }

    static /* synthetic */ void b(jie jie2) {
        jie2.dHo();
    }

    static /* synthetic */ void c(jie jie2) {
        jie2.dHp();
    }

    static /* synthetic */ void d(jie jie2) {
        jie2.dHq();
    }

    static /* synthetic */ void a(jie jie2, ain ain2) {
        jie2.f(ain2);
    }

    static /* synthetic */ void a(jie jie2, jhw jhw2) {
        jie2.c(jhw2);
    }
}

