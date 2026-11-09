/*
 * Decompiled with CFR.
 */
public class igr
extends ipz
implements iua {
    private ipf lMX;
    private ist lTZ;
    private iox lUa;
    private ist lUb;
    private igm lTe;
    private boolean lMW = false;

    public igr(igm igm2, boolean bl) {
        this.lTe = igm2;
        this.a(iqo.dmT());
        ipx ipx2 = ipx.h(new ipf[0]);
        this.W(ipx2);
        if (bl) {
            this.lMX = new ipk(0x181818);
            ipx2.W(this.lMX);
        }
        ipx2.W(this.k(igm2));
        this.rG(false);
    }

    public igm cTI() {
        return this.lTe;
    }

    @Override
    public boolean getSelected() {
        return this.lMW;
    }

    @Override
    public void setSelected(boolean bl) {
        if (bl == this.lMW) {
            return;
        }
        this.lMW = bl;
        iul.b(this, bl);
        this.cUp();
    }

    public void setProgress(int n) {
        this.lUb.setText(n + "%");
        if (n < 100) {
            this.lUb.Rk(0x808080);
        } else {
            this.lUb.Rk(12357465);
        }
    }

    @Override
    public void kh(float f) {
        if (this.lMX != null) {
            this.lMX.hz(f);
        }
    }

    @Override
    public void cND() {
        this.cUp();
    }

    private ipf k(igm igm2) {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.d(this.l(igm2)));
        ipx2.W(ipx.a(5, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(48, 48, this.m(igm2))));
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        ipx2.W(ipx.j(ipx.a(1, 6, new ipf[0]), ipx.c(new ihh()), ipx.a(1, 6, new ipf[0])));
        ipx2.W(ipx.a(47, 24, ipx.d(this.cUo())));
        return ipx2;
    }

    private ipf l(igm igm2) {
        this.lTZ = new ist();
        this.lTZ.a(isf.mwO, 16);
        this.lTZ.sv(false);
        this.lTZ.setSize(140, 27);
        this.lTZ.a(isu.mxQ);
        this.lTZ.Rk(0xABABAB);
        this.lTZ.o(igm2.cNq().bD(new Object[0]));
        return this.lTZ;
    }

    private ipf m(igm igm2) {
        String string = igm2.cTm();
        this.lUa = new ion("/dfdata/texture/gui/runtime/featsnew/category_icons_main_" + string + "/category_icons_main_" + string + "_off_disabled.png", "/dfdata/texture/gui/runtime/featsnew/category_icons_main_" + string + "/category_icons_main_" + string + "_off_normal.png", "/dfdata/texture/gui/runtime/featsnew/category_icons_main_" + string + "/category_icons_main_" + string + "_off_hover.png", "/dfdata/texture/gui/runtime/featsnew/category_icons_main_" + string + "/category_icons_main_" + string + "_off_pushing.png", null, "/dfdata/texture/gui/runtime/featsnew/category_icons_main_" + string + "/category_icons_main_" + string + "_on_normal.png", "/dfdata/texture/gui/runtime/featsnew/category_icons_main_" + string + "/category_icons_main_" + string + "_on_hover.png", "/dfdata/texture/gui/runtime/featsnew/category_icons_main_" + string + "/category_icons_main_" + string + "_on_pushing.png");
        return this.lUa;
    }

    private ipf cUo() {
        this.lUb = new ist();
        this.lUb.a(isf.mwO, 12);
        this.lUb.Rk(0x808080);
        this.setProgress(igq.d(this.lTe));
        return this.lUb;
    }

    private void cUp() {
        if (this.dkb()) {
            if (this.lMW) {
                this.lUa.ri(true);
                this.lUa.hX(true);
                this.lTZ.Rk(13087385);
            } else {
                this.lUa.ri(true);
                this.lUa.hX(false);
                this.lTZ.Rk(0xC0C0C0);
            }
        } else if (this.lMW) {
            this.lUa.ri(false);
            this.lUa.hX(true);
            this.lTZ.Rk(12357465);
        } else {
            this.lUa.ri(false);
            this.lUa.hX(false);
            this.lTZ.Rk(0xABABAB);
        }
    }
}

