/*
 * Decompiled with CFR.
 */
public class jfx
extends iox {
    private jey mWo;
    private boolean mWr = false;

    public jfx(jey jey2) {
        this.mWo = jey2;
        this.F(new iop(ipx.a(44, 49, new ipf[0]), new ipb("button_blueprint_" + jey2.getId() + "_off_disabled")));
        this.G(new iop(ipx.a(44, 49, new ipf[0]), new ipb("button_blueprint_" + jey2.getId() + "_off_normal")));
        this.H(new iop(new ipb("role_blueprint_active_bg_02"), new ipb("button_blueprint_" + jey2.getId() + "_off_hover")));
        this.I(new iop(new ipb("role_blueprint_active_bg_02"), new ipb("button_blueprint_" + jey2.getId() + "_off_pushing")));
        this.J(new iop(new ipb("role_blueprint_active_bg_02"), new ipb("button_blueprint_" + jey2.getId() + "_on_disabled")));
        this.K(new iop(new ipb("role_blueprint_active_bg_02"), new ipb("button_blueprint_" + jey2.getId() + "_on_normal")));
        this.L(new iop(new ipb("role_blueprint_active_bg_02"), new ipb("button_blueprint_" + jey2.getId() + "_on_hover")));
        this.M(new iop(new ipb("role_blueprint_active_bg_02"), new ipb("button_blueprint_" + jey2.getId() + "_on_pushing")));
    }

    public void a(jey jey2) {
        if (jey2 == this.mWo) {
            return;
        }
        this.mWo = jey2;
        this.dAT();
    }

    public boolean dBX() {
        return this.mWr;
    }

    public void ti(boolean bl) {
        if (bl == this.mWr) {
            return;
        }
        this.mWr = bl;
        this.dAT();
    }

    @Override
    public boolean du(int n, int n2) {
        return super.du(n, n2);
    }

    private void dAT() {
        String string = this.mWr ? "modified" : "off";
        String string2 = this.mWr ? "modified" : "on";
        ((ipb)((iop)this.diZ()).diq()).qP("button_blueprint_" + this.mWo.getId() + "_" + string + "_disabled");
        ((ipb)((iop)this.dja()).diq()).qP("button_blueprint_" + this.mWo.getId() + "_" + string + "_normal");
        ((ipb)((iop)this.djb()).diq()).qP("button_blueprint_" + this.mWo.getId() + "_" + string + "_hover");
        ((ipb)((iop)this.djc()).diq()).qP("button_blueprint_" + this.mWo.getId() + "_" + string + "_pushing");
        ((ipb)((iop)this.djd()).diq()).qP("button_blueprint_" + this.mWo.getId() + "_" + string2 + "_disabled");
        ((ipb)((iop)this.dje()).diq()).qP("button_blueprint_" + this.mWo.getId() + "_" + string2 + "_normal");
        ((ipb)((iop)this.djf()).diq()).qP("button_blueprint_" + this.mWo.getId() + "_" + string2 + "_hover");
        ((ipb)((iop)this.djg()).diq()).qP("button_blueprint_" + this.mWo.getId() + "_" + string2 + "_pushing");
    }
}

