/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jfj
extends iqf {
    private jey mWo;
    private ipb[] mXn = new ipb[4];
    private ipb mXo;
    private boolean mWr = false;

    public jfj(jey jey2) {
        this.mWo = jey2 != null ? jey2 : jey.mWP;
        this.t(new iop(new ipb("role_blueprint_active_bg"), this.H(0, "button_blueprint_" + this.mWo.getId() + "_on_disabled")));
        this.u(new iop(new ipb("role_blueprint_active_bg"), this.H(1, "button_blueprint_" + this.mWo.getId() + "_on_normal")));
        this.v(new iop(new ipb("role_blueprint_active_bg"), this.H(2, "button_blueprint_" + this.mWo.getId() + "_on_hover")));
        this.w(new iop(new ipb("role_blueprint_active_bg"), this.H(3, "button_blueprint_" + this.mWo.getId() + "_on_pushing")));
        this.W(this.dAS());
        this.setActive(true);
    }

    public void a(jey jey2, boolean bl, boolean bl2) {
        if (jey2 == this.mWo && bl == this.mXo.djL() && bl2 == this.mWr) {
            return;
        }
        boolean bl3 = false;
        if (jey2 != this.mWo) {
            this.mWo = jey2;
            bl3 = true;
        }
        this.mXo.setVisible(bl);
        if (bl2 != this.mWr) {
            this.mWr = bl2;
            bl3 = true;
        }
        if (bl3) {
            this.dAT();
        }
    }

    @Override
    public hyn dd(int n, int n2) {
        jew jew2 = jen.dzL().dzN().dAk();
        return jew2 != null ? iae.oJ(jew2.getName()) : null;
    }

    @Override
    public iqg dmM() {
        ioc ioc2 = this.eo(0, 0);
        return new jfh(this, this.djE(), new joa(ioc2.cf, ioc2.cg, this.getWidth(), this.getHeight())){
            final /* synthetic */ jfj mXp;
            {
                this.mXp = jfj2;
                super(ioa2, joa2);
            }

            public void cGR() {
                super.cGR();
                this.mXp.dN(0, 0);
            }
        };
    }

    private ipf H(int n, String string) {
        ipx ipx2 = ipx.j(new ipf[0]);
        this.mXn[n] = new ipb(string);
        ipx2.W(ipx.d(this.mXn[n]));
        ipx2.W(ipx.a(1, 5, new ipf[0]));
        return ipx2;
    }

    private ipf dAS() {
        this.mXo = new ipb("role_blueprint_active_bg_frame");
        this.mXo.setVisible(false);
        return this.mXo;
    }

    private void dAT() {
        String string = this.mWr ? "modified" : "on";
        this.mXn[0].qP("button_blueprint_" + this.mWo.getId() + "_" + string + "_disabled");
        this.mXn[1].qP("button_blueprint_" + this.mWo.getId() + "_" + string + "_normal");
        this.mXn[2].qP("button_blueprint_" + this.mWo.getId() + "_" + string + "_hover");
        this.mXn[3].qP("button_blueprint_" + this.mWo.getId() + "_" + string + "_pushing");
    }
}

