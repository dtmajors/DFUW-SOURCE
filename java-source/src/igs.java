/*
 * Decompiled with CFR.
 */
public class igs
extends ipz
implements iua {
    private igm lTe;
    private ipf lMX;
    private ist lUc;
    private iox lUa;
    private ist lUd;
    private irr lBr;
    private ist lUb;
    private ist lUe;

    public igs(igm igm2, boolean bl) {
        this.lTe = igm2;
        this.a(irl.dnr());
        this.W(this.cGT());
        ipx ipx2 = ipx.j(new ipf[0]);
        this.W(ipx2);
        ipx2.W(ipx.d(new ipb("feats_separation_line_horizontal_04")));
        ipx2.W(ipx.a(1, 1, new ipf[0]));
        ipx2.W(this.cKi());
        ipx2.W(ipx.a(1, 1, new ipf[0]));
        if (bl) {
            ipx2.W(ipx.d(new ipb("feats_separation_line_horizontal_04")));
        }
        this.rG(false);
    }

    public igm cTI() {
        return this.lTe;
    }

    @Override
    public boolean getSelected() {
        return false;
    }

    @Override
    public void setSelected(boolean bl) {
    }

    @Override
    public void kh(float f) {
        if (this.lMX != null) {
            this.lMX.hz(f);
        }
        if (this.lBr != null) {
            this.lBr.hz(f);
        }
    }

    public void cUq() {
        this.cUu();
        this.cUw();
        this.cUz();
        this.cUD();
    }

    @Override
    public boolean du(int n, int n2) {
        this.cLq();
        return true;
    }

    @Override
    public void cND() {
        this.lMX.setVisible(this.dkb());
        this.lUc.Rk(this.dkb() ? 12357465 : 0xABABAB);
        this.lUa.ri(this.dkb());
    }

    public void cLq() {
    }

    private ipf cGT() {
        this.lMX = new ihi();
        this.lMX.setVisible(false);
        return this.lMX;
    }

    private ipf cKi() {
        ipx ipx2 = ipx.l(new ipf[0]);
        int n = 36;
        ipx2.W(ipx.a(0, 50, new ipf[0]));
        ipx2.W(ipx.a(2, 1, new ipf[0]));
        ipx2.W(ipx.a(115, n, ipx.d(this.cUr())));
        ipx2.W(ipx.a(2, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(48, 48, this.cUs())));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(1, 36, new ihh())));
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        ipx2.W(ipx.a(32, n, ipx.d(this.cUt())));
        ipx2.W(ipx.a(7, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cUv()));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(1, 36, new ihh())));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.a(62, n, ipx.d(this.cUx())));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(1, 36, new ihh())));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.a(92, n, ipx.d(this.cUB())));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        return ipx2;
    }

    private ipf cUr() {
        this.lUc = new ist();
        this.lUc.a(isf.mwO, 15);
        this.lUc.Rk(0xABABAB);
        this.lUc.sv(false);
        this.lUc.a(isu.mxQ);
        this.lUc.setSize(115, 20);
        this.lUc.o(this.lTe.cNq().bD(new Object[0]));
        return this.lUc;
    }

    private ipf cUs() {
        String string = this.lTe.cTm();
        this.lUa = new ion("/dfdata/texture/gui/runtime/featsnew/category_icons_main_" + string + "/category_icons_main_" + string + "_on_disabled.png", "/dfdata/texture/gui/runtime/featsnew/category_icons_main_" + string + "/category_icons_main_" + string + "_on_normal.png", "/dfdata/texture/gui/runtime/featsnew/category_icons_main_" + string + "/category_icons_main_" + string + "_on_hover.png", "/dfdata/texture/gui/runtime/featsnew/category_icons_main_" + string + "/category_icons_main_" + string + "_on_pushing.png", null, "/dfdata/texture/gui/runtime/featsnew/category_icons_main_" + string + "/category_icons_main_" + string + "_on_normal.png", "/dfdata/texture/gui/runtime/featsnew/category_icons_main_" + string + "/category_icons_main_" + string + "_on_hover.png", "/dfdata/texture/gui/runtime/featsnew/category_icons_main_" + string + "/category_icons_main_" + string + "_on_pushing.png");
        return this.lUa;
    }

    private ipf cUt() {
        this.lUd = new ist();
        this.lUd.a(isf.mwO, 12);
        this.lUd.Rk(0x808080);
        this.lUd.sv(false);
        this.lUd.a(isu.mxR);
        this.lUd.setSize(32, 20);
        this.cUu();
        return this.lUd;
    }

    private void cUu() {
        this.lUd.setText(igq.d(this.lTe) + "%");
    }

    private ipf cUv() {
        irs irs2 = new irs();
        irs2.Sn(igm.values().length);
        irs2.So(4);
        irs2.Sp(0x1B1B1B);
        irs2.qu("feat_progress_bar_statistics_frame");
        irs2.ra("feat_progress_bar_statistics_");
        irs2.Sr(20);
        irs2.sk(true);
        this.lBr = new irr(irs2);
        this.lBr.OI(this.lTe.ordinal());
        this.cUw();
        return this.lBr;
    }

    private void cUw() {
        this.lBr.setProgress(igq.c(this.lTe), 0, igq.e(this.lTe));
    }

    private ipf cUx() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.d(this.cUy()));
        ipx2.W(ipx.d(this.cUA()));
        return ipx2;
    }

    private ipf cUy() {
        this.lUb = new ist();
        this.lUb.a(isf.mwO, 12);
        this.lUb.Rk(0xABABAB);
        this.cUz();
        return this.lUb;
    }

    private void cUz() {
        this.lUb.setText("" + igq.c(this.lTe));
    }

    private ipf cUA() {
        ist ist2 = new ist();
        ist2.a(isf.mwO, 12);
        ist2.Rk(12357465);
        ist2.setText("" + igq.e(this.lTe));
        return ist2;
    }

    private ipf cUB() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.d(this.cUC()));
        ipx2.W(ipx.d(this.cUE()));
        return ipx2;
    }

    private ipf cUC() {
        this.lUe = new ist();
        this.lUe.a(isf.mwO, 12);
        this.lUe.Rk(0xABABAB);
        this.cUD();
        return this.lUe;
    }

    private void cUD() {
        this.lUe.setText("" + igq.f(this.lTe));
    }

    private ipf cUE() {
        ist ist2 = new ist();
        ist2.a(isf.mwO, 12);
        ist2.Rk(12357465);
        ist2.setText("" + igq.g(this.lTe));
        return ist2;
    }
}

