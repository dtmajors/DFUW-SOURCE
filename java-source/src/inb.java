/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  lcw
 */
public class inb
extends ipx {
    private imr mkM;
    private htx mlm;
    private itc mln;
    private izz lCo;
    private ios mlo;
    private ios mlp;
    private ios mlq;
    private ios mlr;
    private ipf mls;
    private ipk mlt;
    private ios mlu;
    private iox mlv;
    private ios mlw;
    private izu mlx;
    private ing mly;

    public inb(imr imr2) {
        this.mkM = imr2;
        this.a(irl.dnr());
        this.W(this.cGU());
        this.mkM.mkr.b(new jlq<inb>(this, this){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
                super(inb3);
            }

            public void j(inb inb2) {
                inb.a(inb2);
            }

            public /* synthetic */ void R(Object object) {
                this.j((inb)object);
            }
        });
        ilw.ddy().miD.c((jlf<ilx>)new jlr<inb, ilx>(this, this){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
                super(inb3);
            }

            public void b(inb inb2, ilx ilx2) {
                inb.a(inb2, inb2, ilx2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((inb)object, (ilx)object2);
            }
        });
        this.mkM.mks.b(new jlq<inb>(this, this){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
                super(inb3);
            }

            public void j(inb inb2) {
                inb.b(inb2);
            }

            public /* synthetic */ void R(Object object) {
                this.j((inb)object);
            }
        });
        this.mkM.mku.b(new jlq<inb>(this, this){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
                super(inb3);
            }

            public void j(inb inb2) {
                inb.c(inb2);
            }

            public /* synthetic */ void R(Object object) {
                this.j((inb)object);
            }
        });
        this.mkM.mkw.b(new jlq<inb>(this, this){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
                super(inb3);
            }

            public void j(inb inb2) {
                inb.d(inb2);
            }

            public /* synthetic */ void R(Object object) {
                this.j((inb)object);
            }
        });
        if (this.dfJ()) {
            hso.cxK().cxP().czb().a(this.dfK());
        }
        this.cGB();
        this.deU();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (this.mlm != null) {
            hso.cxK().cxP().czb().b(this.mlm);
        }
        if (this.mly != null) {
            this.mly.close();
        }
    }

    public void dfp() {
        this.m(this.mlu);
    }

    public void b(imm imm2, boolean bl, boolean bl2) {
    }

    public void qC(String string) {
    }

    @Override
    public boolean qD(String string) {
        if (hso.cxK().cxR().dMl() && string.equals("F")) {
            this.mlx.dqb().L();
            return true;
        }
        return super.qD(string);
    }

    @Override
    public void qQ(boolean bl) {
        super.qQ(bl);
        if (!bl && this.mly != null) {
            this.mly.close();
            this.mly = null;
        }
    }

    private ipf cGU() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dfq()));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 18)));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dfr()));
        ipx2.W(ipx.d(this.dfs()));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 18)));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.c(this.dft()));
        ipx2.W(ipx.d(this.dfu()));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        this.mls = new ipk(0x313131, 1, 18);
        ipx2.W(ipx.d(this.mls));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dfv()));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 18)));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(this.cKQ());
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 18)));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dfz()));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 18)));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(this.dfA());
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 18)));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(this.dfB());
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 18)));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(this.daM()));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dfq() {
        this.mlo = new iwt(this){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
            }

            public void cLq() {
                inb.e(this.mlz).des();
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tmE.bD(new Object[0]).exA());
            }
        };
        return this.mlo;
    }

    private ipf dfr() {
        this.mlp = new iwc(this){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
            }

            public void cLq() {
                inb.e(this.mlz).dep();
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tmF.bD(new Object[0]).exA());
            }
        };
        return this.mlp;
    }

    private ipf dfs() {
        this.mlq = new ivv(this){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
            }

            public void cLq() {
                inb.e(this.mlz).deq();
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tmG.bD(new Object[0]).exA());
            }
        };
        return this.mlq;
    }

    private ipf dft() {
        this.mln = new itc(this, null){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
                super(string);
            }

            public void qE(String string) {
                inb.e(this.mlz).qz(string);
            }
        };
        return this.mln;
    }

    private void a(StringBuilder stringBuilder, ilx ilx2) {
        if (ilx2 != this.mkM.dem()) {
            this.a(stringBuilder, (ilx)ilx2.ddA());
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.append("/");
        }
        stringBuilder.append(ilx2.ddF().exA());
    }

    private ipf dfu() {
        this.mlr = new iwu(this){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
            }

            public void cLq() {
                inb.f(this.mlz);
            }
        };
        return this.mlr;
    }

    private ipf dfv() {
        return new ive(this){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
            }

            public void cLq() {
                inb.a(this.mlz, (ipf)this);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tmH.bD(new Object[0]).exA());
            }
        };
    }

    private ipf cKQ() {
        ipx ipx2 = ipx.h(new ipf[0]);
        ipx2.W(this.dfw());
        ipx2.W(this.dfx());
        return ipx2;
    }

    private ipf dfw() {
        this.mlt = new ipk(3232041);
        this.mlt.setVisible(false);
        return this.mlt;
    }

    private ipf dfx() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.d(this.dfy()));
        ipx2.W(ipx.d(this.cKR()));
        return ipx2;
    }

    private ipf dfy() {
        this.mlu = new ivk(this){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
            }

            public void cLq() {
                inb.b(this.mlz, (ipf)this);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tmI.bD(new Object[0]).exA());
            }
        };
        return this.mlu;
    }

    private ipf cKR() {
        this.mlw = new iwh(this){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
            }

            public void cLq() {
                inb.g(this.mlz);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tmJ.bD(new Object[0]).exA());
            }
        };
        this.mlw.setVisible(false);
        return this.mlw;
    }

    private ipf dfz() {
        return new iwo(this){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
            }

            public void cLq() {
                inb.c(this.mlz, (ipf)this);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tmK.bD(new Object[0]).exA());
            }
        };
    }

    private ipf dfA() {
        this.mlv = new iox(this, this.mkM.dev()){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
                super(bl);
            }

            public void pn(boolean bl) {
                inb.a(this.mlz, bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tmL.bD(new Object[0]).exA());
            }
        };
        this.mlv.F(ipx.d(new ipb("/dfdata/texture/gui/j2f/common/buttons/button_list_small/button_list_small_off_disabled.png")));
        this.mlv.G(ipx.d(new ipb("/dfdata/texture/gui/j2f/common/buttons/button_list_small/button_list_small_off_normal.png")));
        this.mlv.H(ipx.d(new ipb("/dfdata/texture/gui/j2f/common/buttons/button_list_small/button_list_small_off_hover.png")));
        this.mlv.I(ipx.d(new ipb("/dfdata/texture/gui/j2f/common/buttons/button_list_small/button_list_small_off_pushing.png")));
        this.mlv.J(ipx.h(new ipk(3232041), ipx.d(new ipb("/dfdata/texture/gui/j2f/common/buttons/button_list_small/button_list_small_off_disabled.png"))));
        this.mlv.K(ipx.h(new ipk(3232041), ipx.d(new ipb("/dfdata/texture/gui/j2f/common/buttons/button_list_small/button_list_small_off_normal.png"))));
        this.mlv.L(ipx.h(new ipk(3232041), ipx.d(new ipb("/dfdata/texture/gui/j2f/common/buttons/button_list_small/button_list_small_off_hover.png"))));
        this.mlv.M(ipx.h(new ipk(3232041), ipx.d(new ipb("/dfdata/texture/gui/j2f/common/buttons/button_list_small/button_list_small_off_pushing.png"))));
        return this.mlv;
    }

    private ipf daM() {
        return new iux(this){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
            }

            public void cLq() {
                inb.d(this.mlz, (ipf)this);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tmM.bD(new Object[0]).exA());
            }
        };
    }

    private ipf dfB() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.d(ipx.a(128, 20, this.dfC())));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dfD()));
        return ipx2;
    }

    private ipf dfC() {
        izu izu2 = new izu(this){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
            }

            public void od(String string) {
                super.od(string);
                this.mlz.qC(string);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tnd.bD(new Object[0]).exA().toUpperCase());
            }
        };
        izu2.dqb().a(isf.mwN, 12);
        izu2.dqb().b(isr.eN(0, lcw.emW() ? 12 : 24), 0, false);
        izu2.due().a(isf.mwN, 12);
        izu2.due().Rk(0x8B8B8B);
        izu2.due().o(lxb.tmD.bD(new Object[0]));
        this.mlx = izu2;
        return izu2;
    }

    private ipf dfD() {
        return new iwh(this){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
            }

            public void cLq() {
                inb.h(this.mlz).setText("");
                this.mlz.qC("");
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tne.bD(new Object[0]).exA().toUpperCase());
            }
        };
    }

    private void dfE() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, (ilx)this.mkM.der());
        this.mln.setPath(stringBuilder.toString());
    }

    private void deU() {
        this.dfE();
        this.mlo.rF(this.mkM.der() != this.mkM.dem());
        this.mlp.rF(this.mkM.den());
        this.mlq.rF(this.mkM.deo());
    }

    private void a(inb inb2, ilx ilx2) {
        if (ilx2.a(this.mkM.dem(), this.mkM.der())) {
            this.dfE();
        }
    }

    private void cWW() {
        this.lCo.setText(this.mkM.det().deb());
    }

    private void qR(boolean bl) {
        this.mkM.qP(bl);
    }

    private void dfF() {
        this.djE();
        ioa.cyJ().pt(true);
    }

    private void k(ipf ipf2) {
        ioc ioc2 = ipf2.eo(0, 0);
        imz imz2 = new imz(this, this.djE(), new joa(ioc2.cf, ioc2.cg, ipf2.getWidth(), ipf2.getHeight()), this.mkM.deu()){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
                super(ioa2, joa2, imm2);
            }

            protected void a(imm imm2, boolean bl, boolean bl2) {
                this.mlz.b(imm2, bl, bl2);
            }
        };
        imz2.setGUID(this.djE().getMessageDelegator().bzv());
        this.djE().getMessageDelegator().a((amf)((Object)imz2));
    }

    private void dfG() {
        this.mlv.hX(this.mkM.dev());
    }

    private void l(ipf ipf2) {
        ioc ioc2 = ipf2.eo(0, 0);
        ina ina2 = new ina(this, this.djE(), new joa(ioc2.cf, ioc2.cg, ipf2.getWidth(), ipf2.getHeight()), this.mkM.dew()){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
                super(ioa2, joa2, imn2);
            }

            protected void b(imn imn2) {
                inb.e(this.mlz).a(imn2);
            }
        };
        ina2.setGUID(this.djE().getMessageDelegator().bzv());
        this.djE().getMessageDelegator().a((amf)((Object)ina2));
    }

    private void m(ipf ipf2) {
        ioc ioc2 = ipf2.eo(0, 0);
        ini ini2 = new ini(this, this.djE(), new joa(ioc2.cf, ioc2.cg, ipf2.getWidth(), ipf2.getHeight()), this.mkM.dex(), true){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
                super(ioa2, joa2, imi2, bl);
            }

            protected void b(imi imi2) {
                inb.e(this.mlz).a(imi2);
            }
        };
        ini2.setGUID(this.djE().getMessageDelegator().bzv());
        this.djE().getMessageDelegator().a((amf)((Object)ini2));
    }

    private void dfH() {
        this.mkM.a(new imi());
    }

    private void dfI() {
        boolean bl = !this.mkM.dex().isEmpty();
        this.mlt.setVisible(bl);
        this.mlt.cqG();
        this.mlw.setVisible(bl);
    }

    private void n(ipf ipf2) {
        if (this.mly == null) {
            this.mly = new ing(this, this.mkM){
                final /* synthetic */ inb mlz;
                {
                    this.mlz = inb2;
                    super(imr2);
                }

                public void cGR() {
                    super.cGR();
                    inb.a(this.mlz, null);
                }
            };
            this.mly.setGUID(this.djE().getMessageDelegator().bzv());
            this.djE().getMessageDelegator().a((amf)((Object)this.mly));
        }
        this.mly.cqF();
        this.mly.cFc();
    }

    private boolean dfJ() {
        hxd hxd2 = this.mkM.dem().cBs();
        return hxd2 != null && hxd2.cCN().auG();
    }

    private void cGB() {
        jng jng2 = hso.cxK().cxP().czb();
        this.mlr.djJ().setVisible(this.dfJ() && jng2.i(bca.cUb));
        this.mls.setVisible(this.mlr.djJ().djL());
    }

    private htx dfK() {
        return new htx(this){
            final /* synthetic */ inb mlz;
            {
                this.mlz = inb2;
            }

            public void oi() {
            }

            public void oj() {
            }

            public void cyy() {
                inb.i(this.mlz);
            }
        };
    }

    static /* synthetic */ void a(inb inb2) {
        inb2.deU();
    }

    static /* synthetic */ void a(inb inb2, inb inb3, ilx ilx2) {
        inb2.a(inb3, ilx2);
    }

    static /* synthetic */ void b(inb inb2) {
        inb2.cWW();
    }

    static /* synthetic */ void c(inb inb2) {
        inb2.dfG();
    }

    static /* synthetic */ void d(inb inb2) {
        inb2.dfI();
    }

    static /* synthetic */ imr e(inb inb2) {
        return inb2.mkM;
    }

    static /* synthetic */ void f(inb inb2) {
        inb2.dfF();
    }

    static /* synthetic */ void a(inb inb2, ipf ipf2) {
        inb2.n(ipf2);
    }

    static /* synthetic */ void b(inb inb2, ipf ipf2) {
        inb2.m(ipf2);
    }

    static /* synthetic */ void g(inb inb2) {
        inb2.dfH();
    }

    static /* synthetic */ void c(inb inb2, ipf ipf2) {
        inb2.l(ipf2);
    }

    static /* synthetic */ void a(inb inb2, boolean bl) {
        inb2.qR(bl);
    }

    static /* synthetic */ void d(inb inb2, ipf ipf2) {
        inb2.k(ipf2);
    }

    static /* synthetic */ izu h(inb inb2) {
        return inb2.mlx;
    }

    static /* synthetic */ ing a(inb inb2, ing ing2) {
        inb2.mly = ing2;
        return inb2.mly;
    }

    static /* synthetic */ void i(inb inb2) {
        inb2.cGB();
    }
}

