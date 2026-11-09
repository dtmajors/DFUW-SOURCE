/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class jai
extends ipz
implements iua {
    private jjh mGM;
    private iqa mGN;
    private ios mGO;
    private ist lCt;
    private ist mGP;
    private int mGQ;

    public jai(jjh jjh2) {
        this.mGM = jjh2;
        this.a(irl.dnr());
        this.mGN = new iqa("bg_map_search_hover_bg", 24, 0, 24, 0);
        this.mGN.setVisible(false);
        this.W(this.mGN);
        ipx ipx2 = ipx.j(new ipf[0]);
        this.W(ipx2);
        ipx2.W(this.duL());
        ipx2.W(ipx.d(new ipk(0x313131, 333, 1)));
        this.rG(false);
    }

    public jjh duI() {
        return this.mGM;
    }

    @Override
    public boolean getSelected() {
        return false;
    }

    @Override
    public void setSelected(boolean bl) {
    }

    public ist dbQ() {
        return this.lCt;
    }

    public ist duJ() {
        return this.mGP;
    }

    public int duK() {
        return this.mGQ;
    }

    @Override
    public void cND() {
        this.mGN.setVisible(this.dkb());
        this.mGO.ri(this.dkb());
        this.lCt.Rk(this.dkb() ? 12357465 : 0xABABAB);
        this.duO();
    }

    @Override
    public boolean du(int n, int n2) {
        this.mGM.dJH();
        return true;
    }

    @Override
    public hyn dd(int n, int n2) {
        jjs jjs2;
        StringBuilder stringBuilder = new StringBuilder();
        jjn.a(stringBuilder, this.mGM, 0);
        String string = stringBuilder.toString();
        if (string != null && !string.isEmpty()) {
            this.djE();
            int n3 = ioa.cxP().bpb();
            this.djE();
            jjs2 = new jjs(string, n3, ioa.cxP().bpc(), 0, 0);
        } else {
            jjs2 = null;
        }
        return jjs2;
    }

    private ipf duL() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(14, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(24, 24, this.cPn())));
        ipx2.W(ipx.a(2, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 16)));
        ipx2.W(ipx.a(235, 1, ipx.l(ipx.a(4, 1, new ipf[0]), ipx.d(this.duM()), ipx.c(new ipf[0]))));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 16)));
        ipx2.W(ipx.a(66, 1, ipx.d(this.duN())));
        return ipx2;
    }

    private ipf cPn() {
        String string = this.mGM.dJF();
        this.mGO = new iok("/dfdata/texture/gui/runtime/map/button_map_" + string + "/button_map_" + string + "_off_disabled.png", "/dfdata/texture/gui/runtime/map/button_map_" + string + "/button_map_" + string + "_off_normal.png", "/dfdata/texture/gui/runtime/map/button_map_" + string + "/button_map_" + string + "_off_hover.png", "/dfdata/texture/gui/runtime/map/button_map_" + string + "/button_map_" + string + "_off_pushing.png");
        return this.mGO;
    }

    private ipf duM() {
        this.lCt = new ist();
        this.lCt.a(isf.mwO, 13);
        this.lCt.Rk(0xABABAB);
        this.lCt.setText(jjn.I(this.mGM));
        return this.lCt;
    }

    private ipf duN() {
        this.mGP = new isi();
        this.duO();
        return this.mGP;
    }

    private void duO() {
        int n = this.dkb() ? 12357465 : 0xABABAB;
        int n2 = this.dkb() ? 12357465 : 0x666666;
        this.mGQ = hso.cxK().cxT().y(this.mGM);
        this.mGP.setText(isg.b(isf.mwO, 13, n, this.mGQ + "") + isg.b(isf.mwO, 11, n2, "m"));
    }
}

