/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class ick
extends ipx {
    private ipx lvF;
    private icn lHh;
    private ici lHi;
    private icp lHj;
    private ico lHk;
    private isq lHl;
    private ipx lHm;
    private isy lHn;
    private iwy lHo;
    private boolean lHp = true;

    public ick() {
        this.a(irl.dnr());
        ipx ipx2 = ipx.o(new ipf[0]);
        this.W(ipx2);
        this.lvF = ipx.l(new ipf[0]);
        ipx2.W(this.lvF);
        iqu iqu2 = new iqu(24, 24);
        this.lHh = new icn(this){
            final /* synthetic */ ick lHq;
            {
                this.lHq = ick2;
            }

            public void cLq() {
                ioc ioc2 = this.eo(0, 0);
                this.lHq.i(new joa(ioc2.cf, ioc2.cg, this.getWidth(), this.getHeight()));
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lvw.tbD.bD(new Object[0]).exA());
            }
        };
        this.lHh.a(iqu2);
        this.lvF.W(this.lHh);
        this.lvF.W(new iwx(1, 0));
        this.lHi = new ici(this){
            final /* synthetic */ ick lHq;
            {
                this.lHq = ick2;
            }

            public void cLq() {
                ioc ioc2 = this.eo(0, 0);
                this.lHq.j(new joa(ioc2.cf, ioc2.cg, this.getWidth(), this.getHeight()));
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lvw.tbE.bD(new Object[0]).exA());
            }
        };
        this.lvF.W(this.lHi);
        this.lvF.W(new iwx(1, 0));
        ipx ipx3 = ipx.c(new ipf[0]);
        this.lvF.W(ipx3);
        ipx3.W(new iqa("/dfdata/texture/gui/j2f/chat/text_field.png", 4, 4, 4, 4));
        ipx ipx4 = ipx.l(new ipf[0]);
        ipx3.W(ipx4);
        this.lHm = new ipx(this, new iqx(4, 4, 0, 4)){
            final /* synthetic */ ick lHq;
            {
                this.lHq = ick2;
                super(iqz2);
            }

            public boolean du(int n, int n2) {
                if (super.du(n, n2)) {
                    return true;
                }
                ick.a(this.lHq).L();
                return true;
            }
        };
        ipx4.W(this.lHm);
        this.lHm.setVisible(false);
        this.lHm.W(new iqa("/dfdata/texture/gui/j2f/chat/whisper_bg.png", 1, 1, 2, 2, iqb.mtp));
        ipx ipx5 = ipx.l(new ipf[0]);
        this.lHm.W(ipx.c(3, 0, 4, 0, ipx5));
        this.lHn = new isy(this){
            final /* synthetic */ ick lHq;
            {
                this.lHq = ick2;
            }

            public void m(int n, int n2, int n3, int n4) {
                super.m(n, n2, n3, n4);
                ick.b(this.lHq).pack();
            }

            public void od(String string) {
                super.od(string);
                this.lHq.pC(string);
            }

            public void dA(int n, int n2) {
                super.dA(n, n2);
                this.djE().b("addFinalSpaceHandler", new Object[]{this.getId()});
            }

            public void cEj() {
                super.cEj();
                this.dpv();
            }
        };
        this.lHn.a(isf.mwN, 15);
        this.lHn.ST(0x424242);
        this.lHn.a(isu.mxP);
        this.lHn.a(ite.myE);
        this.lHn.sp(false);
        this.lHn.SQ(cu.c.cv() + 1 + cu.c.cw());
        ipx5.W(ipx.c(new ipf[]{this.lHn}));
        ipx ipx6 = ipx.j(new ipf[0]);
        ipx4.W(ipx.c(new ipf[]{ipx6}));
        ipx6.W(ipx.a(1, 4, new ipf[0]));
        this.lHl = new icl(this){
            final /* synthetic */ ick lHq;
            {
                this.lHq = ick2;
            }

            public void od(String string) {
                super.od(string);
                this.lHq.pB(string);
            }

            public void pI(String string) {
                this.od(string);
            }

            public hyn dd(int n, int n2) {
                hyn hyn2 = super.dd(n, n2);
                return hyn2 != null ? hyn2 : iae.oJ(lvw.tbF.bD(new Object[0]).exA());
            }

            public void c(int n, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
                this.lHq.b(n, bl, bl2, bl3, bl4);
            }

            public void C(String string, int n) {
                this.lHq.B(string, n);
            }

            public void dA(int n, int n2) {
                super.dA(n, n2);
                this.djE().b("addBackspaceHandler", new Object[]{this.getId()});
            }
        };
        this.lHl.a(isf.mwN, 15);
        this.lHl.ST(0x424242);
        this.lHl.sp(false);
        this.lHl.SQ(300);
        ipx6.W(ipx.c(new ipf[]{this.lHl}));
        this.lvF.W(new iwx(1, 0));
        this.lHj = new icp(this){
            final /* synthetic */ ick lHq;
            {
                this.lHq = ick2;
            }

            public void cLq() {
                ick.c(this.lHq).dpv();
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lvw.tbG.bD(new Object[0]).exA());
            }
        };
        this.lHj.a(iqu2);
        this.lvF.W(this.lHj);
        this.lvF.W(new iwx(1, 0));
        this.lHk = new ico(this){
            final /* synthetic */ ick lHq;
            {
                this.lHq = ick2;
            }

            public void cLq() {
                ioc ioc2 = this.eo(0, 0);
                this.lHq.k(new joa(ioc2.cf, ioc2.cg, this.getWidth(), this.getHeight()));
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lvw.tbH.bD(new Object[0]).exA());
            }
        };
        this.lHk.a(iqu2);
        this.lvF.W(this.lHk);
        this.lHo = new iwy();
        this.W(this.lHo);
        this.setVisible(false);
    }

    public boolean cNI() {
        return this.lHp;
    }

    public void pL(boolean bl) {
        if (bl == this.lHp) {
            return;
        }
        this.lHp = bl;
        this.djE();
        this.e(ioa.cxN());
    }

    public String cNJ() {
        return this.lHn.getText();
    }

    public String cNK() {
        return this.lHl.getText();
    }

    public void u(String string, boolean bl) {
        this.lHl.setText(string);
        if (bl) {
            this.lHl.L();
        }
    }

    public void pF(String string) {
        this.lHl.setText(string);
    }

    public void d(ibu ibu2) {
        this.e(ibu2);
        if (ibu2 == ibv.lGA) {
            this.lHm.setVisible(true);
            this.cNP();
        } else {
            this.lHm.setVisible(false);
        }
    }

    public void cNL() {
        if (!this.cNP()) {
            this.lHl.L();
        }
    }

    public void cNM() {
        this.lHl.L();
    }

    public void cNN() {
        this.lHn.L();
    }

    @Override
    public void kh(float f) {
        for (int j = 0; j < this.lvF.bfn(); ++j) {
            ipf ipf2 = this.lvF.RO(j);
            if (ipf2.R(this.lHl) || ipf2.R(this.lHh) || ipf2.R(this.lHi) || ipf2.R(this.lHj) || ipf2.R(this.lHk)) continue;
            ipf2.hz(f);
        }
        this.lHh.kh(f);
        this.lHi.kh(f);
        this.lHj.kh(f);
        this.lHk.kh(f);
        this.lHo.hz(f);
    }

    public void pG(String string) {
        this.e(ibv.lGA);
        this.lHm.setVisible(true);
        this.lHn.setText(isg.b(isf.mwN, 15, 0x424242, string));
        this.lHl.setText("");
        if (string != null && !string.isEmpty()) {
            this.lHl.L();
        } else {
            this.lHn.L();
        }
    }

    public void cNO() {
        this.lHl.dpv();
    }

    @Override
    public void b(jnz jnz2, jnz jnz3) {
        super.b(jnz2, jnz3);
        this.e(jnz3);
    }

    public void pB(String string) {
    }

    public void pC(String string) {
    }

    public void b(int n, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
    }

    public void B(String string, int n) {
    }

    protected void i(joa joa2) {
    }

    protected void j(joa joa2) {
    }

    protected void k(joa joa2) {
    }

    private void pM(boolean bl) {
        this.setVisible(this.lHp && bl);
    }

    private void e(jnz jnz2) {
        this.pM(jnz2 != jnz.nFE);
    }

    private boolean cNP() {
        String string;
        if (this.lHm.djL() && ((string = this.lHn.getText()) == null || string.isEmpty() || this.pH(string) == 0)) {
            this.lHn.L();
            return true;
        }
        return false;
    }

    private void e(ibu ibu2) {
        this.lHi.setText(ibu2.cNw().substring(1).toUpperCase());
    }

    private int pH(String string) {
        int n = 0;
        int n2 = 0;
        while (n2 < string.length()) {
            if (string.charAt(n2) != '<') {
                ++n;
                ++n2;
                continue;
            }
            n2 = string.indexOf(62, n2 + 1) + 1;
        }
        return n;
    }

    static /* synthetic */ isy a(ick ick2) {
        return ick2.lHn;
    }

    static /* synthetic */ ipx b(ick ick2) {
        return ick2.lHm;
    }

    static /* synthetic */ isq c(ick ick2) {
        return ick2.lHl;
    }
}

