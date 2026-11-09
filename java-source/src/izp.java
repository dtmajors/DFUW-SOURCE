/*
 * Decompiled with CFR.
 */
public class izp
extends ihm {
    private lox lGm;
    private loz mAK = null;
    private int lSN;
    ipk mDs;

    public izp(ioa ioa2, joa joa2, lox lox2, int n) {
        super(ioa2.aDa + "ColorSelectionWindow", ioa2.loi, ioa2, joa2, 2, 3);
        this.OQ(-1);
        this.lGm = lox2;
        this.lSN = n;
    }

    public izp(ioa ioa2, joa joa2, loz loz2, int n) {
        super(ioa2.aDa + "ColorSelectionWindow", ioa2.loi, ioa2, joa2, 2, 3);
        this.OQ(-1);
        this.mAK = loz2;
        this.lSN = n;
    }

    @Override
    public void cCu() {
        super.cCu();
        this.p(35, 0, 35, 110);
        if (this.lGm != null) {
            this.cXC().f(this.lGm);
        } else {
            this.cXC().z(this.mAK);
        }
        this.cXC().QU(5);
        this.cXC().QT(10);
        this.cXE().W(ipx.a(1, 16, new ipf[0]));
        ipx ipx2 = ipx.l(new ipf[0]);
        this.cXE().W(ipx2);
        ipx ipx3 = ipx.j(new ipf[0]);
        ipx2.W(ipx.c(new ipf[]{ipx3}));
        ixk[] ixkArray = new ixk[1];
        itg[] itgArray = new itg[1];
        ixk[] ixkArray2 = new ixk[1];
        itg[] itgArray2 = new itg[1];
        ixk[] ixkArray3 = new ixk[1];
        itg[] itgArray3 = new itg[1];
        int n = 170;
        ipx ipx4 = ipx.l(new ipf[0]);
        ipx3.W(ipx4);
        ipx4.W(ipx.a(6, 1, new ipf[0]));
        ipx4.W(ipx.d(new izy(lvw.tbs)));
        ipx4.W(ipx.a(8, 1, new ipf[0]));
        ipx4.W(ipx.c(new ipf[0]));
        ixkArray[0] = new ixk(this, 0xFFFFFF, 0xFF0000, ire.muk, itgArray){
            final /* synthetic */ itg[] mDt;
            final /* synthetic */ izp mDu;
            {
                this.mDu = izp2;
                this.mDt = itgArray;
                super(n, n2, ire2);
            }

            public void Rb(int n) {
                this.mDt[0].setText(n + "");
                izp.a(this.mDu, n, izp.a(this.mDu) >> 8 & 0xFF, izp.a(this.mDu) & 0xFF);
            }
        };
        ixkArray[0].a(0, this.lSN >> 16 & 0xFF, 255, 1, 16, false);
        ipx4.W(ipx.d(ipx.a(n, 12, ixkArray[0])));
        ipx4.W(ipx.a(8, 1, new ipf[0]));
        itgArray[0] = new itg(this, "/dfdata/texture/gui/j2f/common/textfields/text_field_shorter_02.png", 4, 4, 4, 4, itgArray, ixkArray){
            final /* synthetic */ itg[] mDt;
            final /* synthetic */ ixk[] mDv;
            final /* synthetic */ izp mDu;
            {
                this.mDu = izp2;
                this.mDt = itgArray;
                this.mDv = ixkArray;
                super(string, n, n2, n3, n4);
            }

            public void od(String string) {
                int n = Integer.valueOf(string);
                if (n > 255) {
                    n = 255;
                    this.mDt[0].setText("255");
                }
                this.mDv[0].setValue(n);
                izp.a(this.mDu, n, izp.a(this.mDu) >> 8 & 0xFF, izp.a(this.mDu) & 0xFF);
            }
        };
        itgArray[0].setText((this.lSN >> 16 & 0xFF) + "");
        itgArray[0].dqb().h(0, 255, false);
        itgArray[0].dqb().st(true);
        ipx4.W(ipx.d(ipx.a(40, 22, itgArray[0])));
        ipx3.W(ipx.a(1, 5, new ipf[0]));
        ipx ipx5 = ipx.l(new ipf[0]);
        ipx3.W(ipx5);
        ipx5.W(ipx.a(6, 1, new ipf[0]));
        ipx5.W(ipx.d(new izy(lvw.tbt)));
        ipx5.W(ipx.a(8, 1, new ipf[0]));
        ipx5.W(ipx.c(new ipf[0]));
        ixkArray2[0] = new ixk(this, 0xFFFFFF, 65280, ire.muk, itgArray2){
            final /* synthetic */ itg[] mDw;
            final /* synthetic */ izp mDu;
            {
                this.mDu = izp2;
                this.mDw = itgArray;
                super(n, n2, ire2);
            }

            public void Rb(int n) {
                this.mDw[0].setText(n + "");
                izp.a(this.mDu, izp.a(this.mDu) >> 16 & 0xFF, n, izp.a(this.mDu) & 0xFF);
            }
        };
        ixkArray2[0].a(0, this.lSN >> 8 & 0xFF, 255, 1, 16, false);
        ipx5.W(ipx.d(ipx.a(n, 12, ixkArray2[0])));
        ipx5.W(ipx.a(8, 1, new ipf[0]));
        itgArray2[0] = new itg(this, "/dfdata/texture/gui/j2f/common/textfields/text_field_shorter_02.png", 4, 4, 4, 4, itgArray2, ixkArray2){
            final /* synthetic */ itg[] mDw;
            final /* synthetic */ ixk[] mDx;
            final /* synthetic */ izp mDu;
            {
                this.mDu = izp2;
                this.mDw = itgArray;
                this.mDx = ixkArray;
                super(string, n, n2, n3, n4);
            }

            public void od(String string) {
                int n = Integer.valueOf(string);
                if (n > 255) {
                    n = 255;
                    this.mDw[0].setText("255");
                }
                this.mDx[0].setValue(n);
                izp.a(this.mDu, izp.a(this.mDu) >> 16 & 0xFF, n, izp.a(this.mDu) & 0xFF);
            }
        };
        itgArray2[0].setText((this.lSN >> 8 & 0xFF) + "");
        itgArray2[0].dqb().h(0, 255, false);
        itgArray2[0].dqb().st(true);
        ipx5.W(ipx.d(ipx.a(40, 22, itgArray2[0])));
        ipx3.W(ipx.a(1, 5, new ipf[0]));
        ipx ipx6 = ipx.l(new ipf[0]);
        ipx3.W(ipx6);
        ipx6.W(ipx.a(6, 1, new ipf[0]));
        ipx6.W(ipx.d(new izy(lvw.tbu)));
        ipx6.W(ipx.a(8, 1, new ipf[0]));
        ipx6.W(ipx.c(new ipf[0]));
        ixkArray3[0] = new ixk(this, 0xFFFFFF, 255, ire.muk, itgArray3){
            final /* synthetic */ itg[] mDy;
            final /* synthetic */ izp mDu;
            {
                this.mDu = izp2;
                this.mDy = itgArray;
                super(n, n2, ire2);
            }

            public void Rb(int n) {
                this.mDy[0].setText(n + "");
                izp.a(this.mDu, izp.a(this.mDu) >> 16 & 0xFF, izp.a(this.mDu) >> 8 & 0xFF, n);
            }
        };
        ixkArray3[0].a(0, this.lSN & 0xFF, 255, 1, 16, false);
        ipx6.W(ipx.d(ipx.a(n, 12, ixkArray3[0])));
        ipx6.W(ipx.a(8, 1, new ipf[0]));
        itgArray3[0] = new itg(this, "/dfdata/texture/gui/j2f/common/textfields/text_field_shorter_02.png", 4, 4, 4, 4, itgArray3, ixkArray3){
            final /* synthetic */ itg[] mDy;
            final /* synthetic */ ixk[] mDz;
            final /* synthetic */ izp mDu;
            {
                this.mDu = izp2;
                this.mDy = itgArray;
                this.mDz = ixkArray;
                super(string, n, n2, n3, n4);
            }

            public void od(String string) {
                int n = Integer.valueOf(string);
                if (n > 255) {
                    n = 255;
                    this.mDy[0].setText("255");
                }
                this.mDz[0].setValue(n);
                izp.a(this.mDu, izp.a(this.mDu) >> 16 & 0xFF, izp.a(this.mDu) >> 8 & 0xFF, n);
            }
        };
        itgArray3[0].setText((this.lSN & 0xFF) + "");
        itgArray3[0].dqb().h(0, 255, false);
        itgArray3[0].dqb().st(true);
        ipx6.W(ipx.d(ipx.a(40, 22, itgArray3[0])));
        ipx2.W(ipx.a(12, 1, new ipf[0]));
        ipx2.W(new iwx());
        ipx2.W(ipx.a(12, 1, new ipf[0]));
        ipx ipx7 = ipx.h(new ipf[0]);
        this.mDs = new ipk(this.lSN);
        ipx7.W(this.mDs);
        ipx7.W(new iqa("/dfdata/texture/gui/j2f/chat/color_selection/color_selection_shadow_normal.png", 5, 5, 5, 5));
        ipx7.W(new ipt(0x898989));
        ipx2.W(ipx7);
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        this.cXE().W(ipx.a(1, 5, new ipf[0]));
        ipx ipx8 = ipx.l(new ipf[0]);
        this.cXE().W(ipx8);
        ipx8.W(ipx.a(338, 1, new ipf[0]));
        ipx8.W(new iur(this){
            final /* synthetic */ izp mDu;
            {
                this.mDu = izp2;
            }

            public void cLq() {
                this.mDu.close();
                this.mDu.Qd(izp.a(this.mDu));
            }
        });
        ipx8.W(ipx.a(8, 1, new ipf[0]));
        ipx8.W(ipx.d(new ivc(this){
            final /* synthetic */ izp mDu;
            {
                this.mDu = izp2;
            }

            public void cLq() {
                this.mDu.close();
            }
        }));
        ipx8.W(ipx.a(2, 1, new ipf[0]));
    }

    @Override
    public ipf cMs() {
        return new ipb("/dfdata/texture/gui/j2f/chat/popups/window_popup_bg_channel_rgb.png");
    }

    public void Qd(int n) {
    }

    private void G(int n, int n2, int n3) {
        this.lSN = (n & 0xFF) << 16 | (n2 & 0xFF) << 8 | n3 & 0xFF;
        this.mDs.setColor(this.lSN);
    }

    static /* synthetic */ int a(izp izp2) {
        return izp2.lSN;
    }

    static /* synthetic */ void a(izp izp2, int n, int n2, int n3) {
        izp2.G(n, n2, n3);
    }
}

