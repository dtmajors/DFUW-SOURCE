/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jfy
extends ipx {
    private jew mXm;
    private boolean mYq;
    private ipf mYr;
    private jfx mYs;
    private ipf mYt;
    private ipf mYu;
    private ipf mYv;
    private ipx mYw;

    public jfy(jew jew2, boolean bl) {
        this.mXm = jew2;
        this.mYq = bl;
        this.a(iqo.dmS());
        ipx ipx2 = ipx.h(new ipf[0]);
        this.W(ipx2);
        ipx2.W(this.dCa());
        ipx2.W(this.dCb());
        ipx2.W(this.dCc());
        ipx2.W(this.dCd());
        ipx2.W(this.dCe());
        ipx2.W(this.dCi());
    }

    public jew dBY() {
        return this.mXm;
    }

    public void tj(boolean bl) {
        this.mYs.hX(bl);
        this.mYv.setVisible(bl);
    }

    public void tk(boolean bl) {
        this.mYr.setVisible(bl);
    }

    public void sG(boolean bl) {
        this.mYs.ti(bl);
    }

    public void tl(boolean bl) {
        this.mYw.setVisible(bl);
    }

    public void dBZ() {
        this.tl(this.mXm.dAf());
    }

    @Override
    public void cWm() {
        if (this.mYq) {
            this.dCg();
        }
    }

    @Override
    public void cND() {
        this.mYt.setVisible(this.dkb());
        this.mYu.setVisible(this.dkb());
    }

    @Override
    public hyn dd(int n, int n2) {
        hyn hyn2 = super.dd(n, n2);
        if (hyn2 != null) {
            return hyn2;
        }
        return iae.oJ(this.mXm.getName());
    }

    private ipf dCa() {
        ipx ipx2 = ipx.j(new ipf[0]);
        this.mYr = ipx2;
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.l(new ipk(0x313131, 1, 20), ipx.c(new ipf[0])));
        ipx2.W(ipx.c(new ipf[0]));
        return ipx2;
    }

    private ipf dCb() {
        this.mYs = new jfx(this, this.mXm.dzY()){
            final /* synthetic */ jfy mYx;
            {
                this.mYx = jfy2;
                super(jey2);
            }

            public void cLq() {
                if (!jfy.a(this.mYx).isActive()) {
                    jfy.a(this.mYx).dAa();
                }
            }
        };
        return this.mYs;
    }

    private ipf dCc() {
        this.mYw = ipx.d(new ipf[0]);
        this.mYw.setVisible(false);
        this.mYw.a(ipn.msf);
        this.mYw.W(new ipb("role_blueprint_active_frame"));
        return this.mYw;
    }

    private ipf dCd() {
        ipx ipx2 = ipx.l(new ipf[0]);
        this.mYt = ipx2;
        ipx2.setVisible(false);
        ipx2.a(ipn.msf);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(new ipb("role_blueprint_active_bg_01"));
        return ipx2;
    }

    private ipf dCe() {
        ipx ipx2 = ipx.l(new ipf[0]);
        this.mYu = ipx2;
        ipx2.setVisible(false);
        ipx2.a(ipn.mse);
        ipx2.W(jfy.a(ipx.c(new ipf[0]), ipn.msf));
        ipx2.W(ipx.j(ipx.c(new ipf[0]), ipx.d(this.dCf()), ipx.c(new ipf[0]), ipx.d(this.daM()), ipx.c(new ipf[0])));
        return ipx2;
    }

    private ipf dCf() {
        iok iok2 = new iok(this, "button_blueprint_save_off_disabled", "button_blueprint_save_off_normal", "button_blueprint_save_off_hover", "button_blueprint_save_off_pushing"){
            final /* synthetic */ jfy mYx;
            {
                this.mYx = jfy2;
                super(string, string2, string3, string4);
            }

            public void cLq() {
                jfy.a(this.mYx).save();
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxx.tzT.bD(new Object[0]).exA());
            }
        };
        iok2.rg(false);
        iok2.setVisible(false);
        return iok2;
    }

    private ipf daM() {
        return new iok(this, "button_blueprint_options_off_disabled", "button_blueprint_options_off_normal", "button_blueprint_options_off_hover", "button_blueprint_options_off_pushing"){
            final /* synthetic */ jfy mYx;
            {
                this.mYx = jfy2;
                super(string, string2, string3, string4);
            }

            public void cLq() {
                jfy.b(this.mYx);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxx.tzU.bD(new Object[0]).exA());
            }
        };
    }

    private void dCg() {
        ioc ioc2 = this.eo(0, 0);
        jfz jfz2 = new jfz(this, this.djE(), new joa(ioc2.cf, ioc2.cg, this.getWidth(), this.getHeight()), this.mXm){
            final /* synthetic */ jfy mYx;
            {
                this.mYx = jfy2;
                super(ioa2, joa2, jew2);
            }

            public void b(String string, jey jey2) {
                jfy.a(this.mYx).a(string, jey2);
                jfy.c(this.mYx).a(jey2);
            }

            public void cGR() {
                super.cGR();
                jfy.d(this.mYx);
            }
        };
        jfz2.setGUID(this.djE().getMessageDelegator().bzv());
        this.djE().getMessageDelegator().a((amf)((Object)jfz2));
    }

    private void dCh() {
        if (this.mYq) {
            this.mYq = false;
            this.mXm.save();
        }
    }

    private ipf dCi() {
        ipx ipx2 = ipx.j(new ipf[0]);
        this.mYv = ipx2;
        ipx2.setVisible(false);
        ipx2.a(ipn.msf);
        ipx2.W(ipx.a(42, 49, new ipf[0]));
        ipx2.W(ipx.a(0, 0, 0, 5, ipx.d(new ipb("role_blueprint_active_bg_02_arrow"))));
        return ipx2;
    }

    static /* synthetic */ jew a(jfy jfy2) {
        return jfy2.mXm;
    }

    static /* synthetic */ void b(jfy jfy2) {
        jfy2.dCg();
    }

    static /* synthetic */ jfx c(jfy jfy2) {
        return jfy2.mYs;
    }

    static /* synthetic */ void d(jfy jfy2) {
        jfy2.dCh();
    }
}

