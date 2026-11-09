/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jfz
extends ihm {
    private jew mXm;
    private iou<jey> mYy;
    private itg mYz;
    private ios lIr;
    private hzz lIt;
    private boolean mYA = true;

    public jfz(ioa ioa2, joa joa2, jew jew2) {
        super("ConfigurationOptionsWindow", "RolesWindow.swf", ioa2, joa2, 2, 3);
        this.mXm = jew2;
    }

    @Override
    public void cCu() {
        super.cCu();
        this.cXC().f(lxx.tzJ);
        this.cXC().QT(0);
        this.cXC().QU(1);
        this.cXE().W(ipx.a(1, 16, new ipf[0]));
        this.cXE().W(this.dgp());
        this.cXE().W(ipx.a(1, 16, new ipf[0]));
        this.cXE().W(ipx.d(new ipk(0x313131, 254, 1)));
        this.cXE().W(ipx.a(1, 8, new ipf[0]));
        this.cXE().W(ipx.l(ipx.a(10, 1, new ipf[0]), this.dCk()));
        this.dbz();
        this.cXE().W(ipx.a(1, 20, new ipf[0]));
        this.cXE().W(this.cZm());
        this.cXE().W(ipx.a(1, 50, new ipf[0]));
        this.dCm();
        this.mYz.dqb().L();
        this.cFc();
    }

    @Override
    protected ipf cMs() {
        return new ipb("bg_role_blueprint_popup_bg");
    }

    @Override
    protected ipx cNG() {
        return ipx.a(25, 1, new ipf[0]);
    }

    @Override
    protected ipx cXB() {
        return ipx.a(25, 1, new ipf[0]);
    }

    protected void b(String string, jey jey2) {
    }

    private ipf dgp() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(10, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dCj()));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(ipx.a(176, 22, this.dgq())));
        ipx2.W(ipx.a(13, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dCj() {
        return ist.a(isf.mwO, 14, 0xABABAB, lxx.tnp.bD(new Object[0]));
    }

    private ipf dgq() {
        this.mYz = new itg(this, "text_field_shorter_02", 4, 4, 4, 4){
            final /* synthetic */ jfz mYB;
            {
                this.mYB = jfz2;
                super(string, n, n2, n3, n4);
            }

            public void v(String string, boolean bl) {
                jfz.a(this.mYB, bl);
                jfz.a(this.mYB);
            }

            public void od(String string) {
                super.od(string);
                jfz.a(this.mYB);
            }
        };
        this.mYz.dqb().a(isf.mwN, 15);
        this.mYz.dqb().st(true);
        this.mYz.setText(this.mXm.getName());
        this.mYz.al(ipx.l(ipx.a(3, 1, new ipf[0]), ipx.d(ipx.j(ist.a(isf.mwN, 15, 0x8B8B8B, lxx.tbj.bD(3, 12)), ipx.a(1, 1, new ipf[0]))), ipx.c(new ipf[0])));
        this.mYz.dqb().b(isr.eN(3, 12), 1, true);
        return this.mYz;
    }

    private ipf dCk() {
        return ist.a(isf.mwO, 14, 0xABABAB, lxx.tkB.bD(new Object[0]));
    }

    private void dbz() {
        this.cXE().W(ipx.a(1, 9, new ipf[0]));
        this.mYy = new iou();
        int n = 0;
        while (n < jey.values().length) {
            if (n > 0) {
                this.cXE().W(ipx.a(1, 18, new ipf[0]));
            }
            ipx ipx2 = ipx.l(new ipf[0]);
            this.cXE().W(ipx2);
            ipx2.W(ipx.a(14, 1, new ipf[0]));
            int n2 = 0;
            while (n2 < jey.values().length / 2) {
                ipx2.W(ipx.a(n2 > 0 ? 20 : 5, 1, new ipf[0]));
                jgb jgb2 = new jgb(this.mYy, jey.values()[n]);
                ipx2.W(jgb2);
                ++n2;
                ++n;
            }
            ipx2.W(ipx.a(20, 1, new ipf[0]));
        }
        this.mYy.setValue(this.mXm.dzY());
    }

    private ipf cZm() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(12, 1, new ipf[0]));
        ipx2.W(ipx.j(ipx.a(1, 18, new ipf[0]), this.dCl()));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.j(ipx.a(1, 8, new ipf[0]), ipx.l(ipx.d(this.cZn()), ipx.a(5, 1, new ipf[0]), ipx.d(this.cZo()), ipx.a(2, 1, new ipf[0])), ipx.c(new ipf[0])));
        return ipx2;
    }

    private ipf cZn() {
        this.lIr = new iur(this){
            final /* synthetic */ jfz mYB;
            {
                this.mYB = jfz2;
            }

            public void cLq() {
                jey jey2 = (jey)((Object)jfz.b(this.mYB).getValue());
                if (jey2 == null) {
                    jey2 = jfz.c(this.mYB).dzY();
                }
                this.mYB.b(jfz.d(this.mYB).getText(), jey2);
                this.mYB.close();
            }
        };
        return this.lIr;
    }

    private ipf cZo() {
        return new ivc(this){
            final /* synthetic */ jfz mYB;
            {
                this.mYB = jfz2;
            }

            public void cLq() {
                this.mYB.close();
            }
        };
    }

    private ipf dCl() {
        iok iok2 = new iok(this, "button_blueprint_delete_disabled", "button_blueprint_delete_normal", "button_blueprint_delete_hover", "button_blueprint_delete_pushing"){
            final /* synthetic */ jfz mYB;
            {
                this.mYB = jfz2;
                super(string, string2, string3, string4);
            }

            public void cLq() {
                this.mYB.dCn();
            }

            public hyn dd(int n, int n2) {
                return null;
            }
        };
        iok2.rF(this.mXm.dAb());
        return iok2;
    }

    private void dCm() {
        boolean bl = jen.dzL().dzN().a(this.mXm, this.mYz.getText()) && this.mYA;
        this.lIr.rF(bl);
        if (bl) {
            this.mYz.dqb().Rk(0);
            this.lIr.rF(true);
            if (this.lIt != null) {
                this.lIt.getMessageDelegator().hd(this.lIt.getGUID());
                this.lIt = null;
            }
        } else {
            this.mYz.dqb().Rk(0xFF0000);
            this.lIr.rF(false);
            if (this.lIt == null) {
                ioc ioc2 = this.mYz.eo(0, 0);
                this.lIt = new hzz(ioc2.cf, ioc2.cg, this.mYz.getWidth(), this.mYz.getHeight(), true, lxx.tzK.bD(new Object[0]).exA().toUpperCase());
                jfz.cxP().k((hyn)this.lIt);
            }
        }
    }

    public void dCn() {
        inv.a(lxx.tAD.bD(new Object[0]), new hyr(this){
            final /* synthetic */ jfz mYB;
            {
                this.mYB = jfz2;
            }

            public void oH(boolean bl) {
                if (bl) {
                    this.mYB.close();
                    jen.dzL().dzN().f(jfz.c(this.mYB));
                }
            }
        });
    }

    static /* synthetic */ boolean a(jfz jfz2, boolean bl) {
        jfz2.mYA = bl;
        return jfz2.mYA;
    }

    static /* synthetic */ void a(jfz jfz2) {
        jfz2.dCm();
    }

    static /* synthetic */ iou b(jfz jfz2) {
        return jfz2.mYy;
    }

    static /* synthetic */ jew c(jfz jfz2) {
        return jfz2.mXm;
    }

    static /* synthetic */ itg d(jfz jfz2) {
        return jfz2.mYz;
    }
}

