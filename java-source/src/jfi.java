/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jfi
extends ipx {
    private jew mXm;
    private ipb mcc;

    public jfi(jew jew2) {
        this.mXm = jew2;
        this.a(irl.dnr());
        this.W(new ipb("blueprint_dropdown_tileable"));
        this.mcc = new ipb(this.dAR());
        this.W(ipx.d(ipx.a(22, 22, this.mcc)));
        this.aTg();
    }

    public void aTg() {
        this.mcc.qP(this.dAR());
    }

    @Override
    public boolean dN(int n, int n2) {
        this.mXm.dAa();
        return true;
    }

    @Override
    public void cND() {
        this.aTg();
    }

    @Override
    public hyn dd(int n, int n2) {
        return iae.oJ(this.mXm.getName());
    }

    private String dAR() {
        return this.dkb() ? "button_blueprint_" + this.mXm.dzY().getId() + "_off_hover" : "button_blueprint_" + this.mXm.dzY().getId() + "_off_normal";
    }
}

