/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ihf
extends ipz {
    private ipx lVq;
    private izw lVr;
    private iok lVs;
    private iug lVt;
    private Map<igm, igr> lCa = lcn.emw();
    private ihd lVu;
    private ipx lVv;
    private int lVw;
    private ipf lVx;
    private ipx lVy;
    private ipx lVz;
    private ist lVA;
    private ist lVB;
    private ist lVC;
    private ist lVD;
    private int lVE;
    private int lTN;
    private int lTO;
    private int lTP;
    private irr lVF;
    private int lVG;
    private int lVH;
    private int lVI;
    private ist lVJ;
    private ist lVK;
    private iug lVL;
    private Map<ign, igx> lVM = lcn.emw();
    private igx lVN;
    private int lVO = 0;
    private ipx lVP;
    private ist lVQ;
    private ipb lVR;
    private boolean lVS = true;

    public ihf() {
        this.a(iqo.dmS());
        this.W(this.cWn());
        this.W(ipx.a(8, 1, new ipf[0]));
        this.W(new iqa("VerticalGoldSeparatorBitmap", 0, 32, 0, 32));
        this.W(ipx.a(8, 1, new ipf[0]));
        this.W(ipx.c(this.cWt()));
        this.W(ipx.a(8, 1, new ipf[0]));
        this.cWX();
        this.cWY();
    }

    @Override
    public void a(ioa ioa2) {
        super.a(ioa2);
        igq.lTF.a((jli<List<ign>, List<ign>, List<ign>, Boolean>)new jlu<ihf, List<ign>, List<ign>, List<ign>, Boolean>(this, this){
            final /* synthetic */ ihf lVT;
            {
                this.lVT = ihf2;
                super(ihf3);
            }

            public void b(ihf ihf2, List<ign> list, List<ign> list2, List<ign> list3, Boolean bl) {
                ihf.a(this.lVT, list, list2, list3, bl);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3, Object object4, Object object5) {
                this.b((ihf)object, (List)object2, (List)object3, (List)object4, (Boolean)object5);
            }
        });
        igq.lTG.c((jlf<ign>)new jlr<ihf, ign>(this, this){
            final /* synthetic */ ihf lVT;
            {
                this.lVT = ihf2;
                super(ihf3);
            }

            public void c(ihf ihf2, ign ign2) {
                ihf.a(this.lVT, ign2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.c((ihf)object, (ign)object2);
            }
        });
    }

    public ihd cWl() {
        return this.lVu;
    }

    @Override
    public void kh(float f) {
        for (igr ipz2 : this.lCa.values()) {
            ipz2.kh(f);
        }
        this.lVr.kh(f);
        this.lVt.kh(f);
        this.lVL.kh(f);
        this.lVF.kh(f);
        this.lVu.kh(f);
        for (igx igx2 : this.lVM.values()) {
            igx2.kh(f);
        }
    }

    public void p(ign ign2) {
        if (!ign2.cTM()) {
            return;
        }
        igx igx2 = this.lVM.get(ign2);
        igx2.setSelected(true);
        if (!igx2.djL()) {
            igx2.setVisible(true);
            this.lVN = igx2;
            this.dkg();
        } else {
            this.a(igx2, false);
        }
    }

    public void q(ign ign2) {
        if (!ign2.cTM()) {
            return;
        }
        this.lVr.setText("");
        this.lVt.drW();
        this.a(new igv(this, ign2){
            final /* synthetic */ ign lUr;
            final /* synthetic */ ihf lVT;
            {
                this.lVT = ihf2;
                this.lUr = ign2;
            }

            public boolean e(ign ign2) {
                return ign2 == this.lUr && ihf.b(this.lVT, ign2);
            }
        });
    }

    @Override
    public void cCy() {
        super.cCy();
        this.cXe();
    }

    @Override
    public void cWm() {
        super.cWm();
        this.cXe();
    }

    void o(igm igm2) {
        this.lVr.setText("");
        igr igr2 = this.lCa.get((Object)igm2);
        this.lVt.drW();
        this.lVt.a(igr2, igr2, true);
        this.cWV();
    }

    private ipf cWn() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 16, new ipf[0]));
        ipx2.W(ipx.l(ipx.a(16, 1, new ipf[0]), ipx.a(224, 24, this.cWo()), ipx.a(16, 1, new ipf[0])));
        ipx2.W(ipx.a(1, 12, new ipf[0]));
        ipx2.W(ipx.l(ipx.a(16, 1, new ipf[0]), ipx.c(new ihh()), ipx.a(16, 1, new ipf[0])));
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx2.W(ipx.l(ipx.a(16, 1, new ipf[0]), ipx.d(this.cWp()), ipx.a(4, 1, new ipf[0]), ipx.d(this.cWq()), ipx.a(16, 1, new ipf[0]), ipx.c(new ipf[0]), ipx.d(this.cWr()), ipx.a(16, 1, new ipf[0])));
        ipx2.W(ipx.a(1, 12, new ipf[0]));
        ipx2.W(ipx.i(this.cWs()));
        ipx2.W(ipx.c(new ipf[]{ipx.r(new ipb("sidebar_footer"))}));
        ipx2.W(ipx.a(246, 12, new ipf[0]));
        return ipx2;
    }

    private ipf cWo() {
        this.lVr = new izw(this){
            final /* synthetic */ ihf lVT;
            {
                this.lVT = ihf2;
            }

            public void od(String string) {
                super.od(string);
                ihf.a(this.lVT);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lww.tjF.bD(new Object[0]).exA());
            }
        };
        this.lVr.dqb().sp(false);
        return this.lVr;
    }

    private ipf cWp() {
        return new iok(this, "SelectAllButtonBitmapDisabled", "SelectAllButtonBitmapNormal", "SelectAllButtonBitmapHover", "SelectAllButtonBitmapPushing"){
            final /* synthetic */ ihf lVT;
            {
                this.lVT = ihf2;
                super(string, string2, string3, string4);
            }

            public void cLq() {
                ihf.b(this.lVT);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lww.tjL.bD(new Object[0]).exA());
            }
        };
    }

    private ipf cWq() {
        iok iok2;
        this.lVs = iok2 = new iok(this, "DeselectAllButtonBitmapDisabled", "DeselectAllButtonBitmapNormal", "DeselectAllButtonBitmapHover", "DeselectAllButtonBitmapPushing"){
            final /* synthetic */ ihf lVT;
            {
                this.lVT = ihf2;
                super(string, string2, string3, string4);
            }

            public void cLq() {
                ihf.a(this.lVT, true);
                ihf.c(this.lVT);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lww.tjK.bD(new Object[0]).exA());
            }
        };
        iok2.rF(false);
        return iok2;
    }

    private ipf cWr() {
        ist ist2 = new ist();
        ist2.a(isf.mwO, 18);
        ist2.Rk(12357465);
        ist2.o(lww.tiY.bD(new Object[0]));
        return ist2;
    }

    private ipf cWs() {
        this.lVt = new izm(this){
            final /* synthetic */ ihf lVT;
            {
                this.lVT = ihf2;
            }

            public void cXg() {
                ihf.d(this.lVT);
            }
        };
        int n = 0;
        for (igm igm2 : igm.values()) {
            igr igr2 = new igr(igm2, !(n & true));
            this.lVt.c(igr2);
            this.lCa.put(igm2, igr2);
            ++n;
        }
        return this.lVt;
    }

    private ipf cWt() {
        ipx ipx2;
        this.lVq = ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.l(ipx.c(new ipf[0]), this.cKP()));
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        this.lVv = ipx.j(new ipf[0]);
        ipx2.W(this.lVv);
        this.lVv.setVisible(false);
        this.lVv.W(this.cWu());
        this.lVv.W(ipx.a(1, 4, new ipf[0]));
        this.lVv.W(ipx.l(ipx.a(8, 1, new ipf[0]), this.cWB(), ipx.c(new ipf[0])));
        ipx2.W(ipx.a(1, 16, new ipf[0]));
        ipx2.W(ipx.i(this.cWC()));
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(this.cWD());
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx2.W(ipx.c(new ipf[0]));
        return ipx2;
    }

    private ipf cKP() {
        this.lVu = new ihd(this){
            final /* synthetic */ ihf lVT;
            {
                this.lVT = ihf2;
            }

            public void qj(String string) {
                ihf.e(this.lVT);
            }

            public void cVX() {
                ihf.f(this.lVT);
            }

            public void cVY() {
                ihf.g(this.lVT);
            }

            public void cVZ() {
                ihf.h(this.lVT);
            }

            public void cWa() {
                ihf.i(this.lVT);
            }
        };
        this.lVu.setVisible(false);
        return this.lVu;
    }

    private ipf cWu() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(6, 1, new ipf[0]));
        this.lVy = ipx.l(new ipf[0]);
        ipx2.W(this.lVy);
        this.lVy.W(new iwv("IconFeatBitmap", lww.tkc.bD(new Object[0])));
        this.lVy.W(ipx.d(this.cWv()));
        this.lVy.W(ipx.d(this.cWw()));
        this.lVy.W(ipx.a(16, 1, new ipf[0]));
        this.lVy.W(new iwv("IconProwessBitmap", lww.tkd.bD(new Object[0])));
        this.lVy.W(ipx.d(this.cWx()));
        this.lVy.W(ipx.d(this.cWy()));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        this.lVx = new ihh();
        ipx2.W(ipx.j(ipx.a(1, 4, new ipf[0]), ipx.c(this.lVx), ipx.a(1, 4, new ipf[0])));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        this.lVz = ipx.l(new ipf[0]);
        ipx2.W(this.lVz);
        this.lVz.W(new iwv("icon_repeatables", lww.tke.bD(new Object[0])));
        this.lVz.W(ipx.d(this.cWz()));
        this.lVz.W(ipx.a(16, 1, new ipf[0]));
        this.lVz.W(new iwv("IconProwessBitmap", lww.tkf.bD(new Object[0])));
        this.lVz.W(ipx.d(this.cWA()));
        ipx2.W(ipx.c(new ipf[0]));
        return ipx2;
    }

    private ipf cWv() {
        ist ist2;
        this.lVA = ist2 = new ist();
        ist2.a(isf.mwO, 18);
        ist2.Rk(0xABABAB);
        this.cWH();
        return ist2;
    }

    private ipf cWw() {
        ist ist2;
        this.lVB = ist2 = new ist();
        ist2.a(isf.mwO, 18);
        ist2.Rk(12357465);
        this.cWI();
        return ist2;
    }

    private ipf cWx() {
        ist ist2;
        this.lVC = ist2 = new ist();
        ist2.a(isf.mwO, 18);
        ist2.Rk(0xABABAB);
        this.cWJ();
        return ist2;
    }

    private ipf cWy() {
        ist ist2;
        this.lVD = ist2 = new ist();
        ist2.a(isf.mwO, 18);
        ist2.Rk(12357465);
        this.cWK();
        return ist2;
    }

    private ipf cWz() {
        ist ist2;
        this.lVJ = ist2 = new ist();
        ist2.a(isf.mwO, 18);
        ist2.Rk(0xABABAB);
        this.cWL();
        return ist2;
    }

    private ipf cWA() {
        ist ist2;
        this.lVK = ist2 = new ist();
        ist2.a(isf.mwO, 18);
        ist2.Rk(0xABABAB);
        this.cWM();
        return ist2;
    }

    private ipf cWB() {
        irs irs2 = new irs();
        irs2.Sn(igm.values().length + 1);
        irs2.So(4);
        irs2.Sp(0x1B1B1B);
        irs2.qu("MainProgressBarBackgroundBitmap");
        irs2.ra("MainProgressBarBitmap");
        irs2.Sr(20);
        irs2.sk(true);
        this.lVF = new irr(this, irs2){
            final /* synthetic */ ihf lVT;
            {
                this.lVT = ihf2;
                super(irs2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lww.tjN.bD(new Object[0]).exA());
            }
        };
        this.cWP();
        this.cWO();
        return this.lVF;
    }

    private ipf cWC() {
        this.lVL = new izm(this){
            final /* synthetic */ ihf lVT;
            {
                this.lVT = ihf2;
            }

            public String cXf() {
                return "HorizontalFeatListSeparatorBitmap";
            }
        };
        this.lVL.a(iun.mAl);
        ((izh)this.lVL).W("feat_gradient_top", "feat_gradient_bottom");
        Collection<ign> collection = igq.cUh();
        for (ign ign2 : collection) {
            igx igx2 = new igx(this, ign2){
                final /* synthetic */ ihf lVT;
                {
                    this.lVT = ihf2;
                    super(ign2);
                }

                public void n(ign ign2) {
                    this.lVT.p(ign2);
                }

                public void cVa() {
                    if (this.djL()) {
                        ihf.a(this.lVT, this.getSelected() ? 1 : -1);
                        ihf.j(this.lVT);
                    }
                }
            };
            igx2.setVisible(false);
            this.lVL.c(igx2);
            this.lVM.put(ign2, igx2);
        }
        return this.lVL;
    }

    private ipf cWD() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(this.cWE());
        ipx2.W(ipx.d(this.cWF()));
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx2.W(this.cWG());
        this.cWR();
        return ipx2;
    }

    private ipf cWE() {
        this.lVP = ipx.a(1, 141, new ipf[0]);
        return this.lVP;
    }

    private ipf cWF() {
        ist ist2;
        this.lVQ = ist2 = new ist();
        ist2.a(isf.mwO, 14);
        ist2.Rk(0x5B5B5B);
        return ist2;
    }

    private ipf cWG() {
        ipx ipx2 = ipx.h(new ipf[0]);
        this.lVR = new ipb("title_icon_feats_03");
        this.lVR.hz(0.07f);
        ipx2.W(ipx.d(this.lVR));
        ipx2.W(ipx.d(new ipb("WindowFooterBitmap")));
        return ipx2;
    }

    private void p(igm igm2) {
        igr igr2 = this.lCa.get((Object)igm2);
        igr2.setProgress(igq.d(igm2));
    }

    private void cWH() {
        this.lVA.setText("" + this.lVE);
        if (this.lVE == this.lTN && this.lTN > 0) {
            this.lVA.Rk(12357465);
        } else {
            this.lVA.Rk(0xABABAB);
        }
    }

    private void cWI() {
        this.lVB.setText("/" + this.lTN);
    }

    private void cWJ() {
        this.lVC.setText("" + this.lTO);
        if (this.lTO == this.lTP && this.lTP > 0) {
            this.lVC.Rk(12357465);
        } else {
            this.lVC.Rk(0xABABAB);
        }
    }

    private void cWK() {
        this.lVD.setText("/" + this.lTP);
    }

    private void cWL() {
        this.lVJ.setText("" + this.lVG);
    }

    private void cWM() {
        this.lVK.setText("" + this.lVI);
    }

    private void cWN() {
        this.lVy.setVisible(this.lTN > 0);
        this.lVz.setVisible(this.lVH > 0);
        this.lVx.setVisible(this.lVy.djL() && this.lVz.djL());
    }

    private void cWO() {
        this.lVF.setProgress(this.lVE, 0, this.lTN);
    }

    private void cWP() {
        List<iua> list = this.lVt.drp();
        if (list != null) {
            if (list.size() == 1) {
                igr igr2 = (igr)list.get(0);
                this.lVF.OI(igr2.cTI().ordinal());
            } else {
                this.lVF.OI(igm.values().length);
            }
        }
    }

    private void t(ign ign2) {
        if (!ign2.cTT()) {
            if (ign2.isCompleted()) {
                ++this.lVE;
                this.lTO += ign2.cTF();
            }
        } else {
            this.lVG += ign2.cTX();
            this.lVI += ign2.cTY();
        }
        if (!ign2.cTT()) {
            ++this.lTN;
            this.lTP += ign2.cTF();
        } else {
            ++this.lVH;
        }
    }

    private void a(igv igv2) {
        this.cXc();
        this.lVO = 0;
        this.cXb();
        this.lVw = 0;
        Collection<igx> collection = this.lVM.values();
        for (igx igx2 : collection) {
            boolean bl = igv2.e(igx2.cUF()) && igx2.cUF().cTM();
            igx2.setVisible(bl);
            if (!bl) continue;
            ++this.lVw;
            this.t(igx2.cUF());
            if (!igx2.getSelected()) continue;
            ++this.lVO;
        }
        this.cXd();
        this.cWQ();
        this.qk(true);
    }

    private void qk(boolean bl) {
        this.cWH();
        this.cWI();
        this.cWJ();
        this.cWK();
        this.cWL();
        this.cWM();
        this.cWN();
        this.cWO();
        if (bl) {
            this.lVF.dnM();
        }
        this.cWP();
        this.lVv.setVisible(this.lVw > 0);
        this.cWR();
        this.lVs.rF(this.lVw > 0);
        this.lVq.pack();
    }

    private void cWQ() {
        this.lVu.qi(this.lVO > 0);
    }

    private void cWR() {
        if (this.lVw > 0) {
            this.lVP.setVisible(false);
            this.lVQ.setVisible(false);
            this.lVR.setVisible(false);
        } else {
            this.lVP.setVisible(true);
            this.lVQ.setVisible(true);
            this.lVQ.o(this.lVS ? lww.tkm.bD(new Object[0]) : lww.tkn.bD(new Object[0]));
            this.lVR.setVisible(true);
        }
        this.lVS = false;
    }

    private void cWS() {
        this.lVt.drW();
        String string = this.lVr.getText();
        this.lVr.dqb().L();
        if (string != null && !string.isEmpty()) {
            String string2 = string.toLowerCase();
            this.a(new igv(this, string2){
                final /* synthetic */ String lVU;
                final /* synthetic */ ihf lVT;
                {
                    this.lVT = ihf2;
                    this.lVU = string;
                }

                public boolean e(ign ign2) {
                    return ign2.qg(this.lVU) && ihf.b(this.lVT, ign2);
                }
            });
        } else {
            this.a(new igv(this){
                final /* synthetic */ ihf lVT;
                {
                    this.lVT = ihf2;
                }

                public boolean e(ign ign2) {
                    return false;
                }
            });
        }
    }

    private void cWT() {
        this.lVr.setText("");
        this.lVt.drV();
        this.a(new igv(this){
            final /* synthetic */ ihf lVT;
            {
                this.lVT = ihf2;
            }

            public boolean e(ign ign2) {
                return ihf.b(this.lVT, ign2);
            }
        });
    }

    private void cWU() {
        this.lVr.setText("");
        this.lVt.drW();
        this.a(new igv(this){
            final /* synthetic */ ihf lVT;
            {
                this.lVT = ihf2;
            }

            public boolean e(ign ign2) {
                return false;
            }
        });
    }

    private void cWV() {
        this.lVr.setText("");
        this.a(new igv(this){
            final /* synthetic */ ihf lVT;
            {
                this.lVT = ihf2;
            }

            public boolean e(ign ign2) {
                return ((igr)ihf.k(this.lVT).get((Object)((Object)ign2.cTI()))).getSelected() && ihf.b(this.lVT, ign2);
            }
        });
    }

    private void cWW() {
        String string = this.lVr.getText();
        if (string != null && !string.isEmpty()) {
            String string2 = string.toLowerCase();
            this.a(new igv(this, string2){
                final /* synthetic */ String lVU;
                final /* synthetic */ ihf lVT;
                {
                    this.lVT = ihf2;
                    this.lVU = string;
                }

                public boolean e(ign ign2) {
                    return ign2.qg(this.lVU) && ihf.b(this.lVT, ign2);
                }
            });
        } else {
            this.a(new igv(this){
                final /* synthetic */ ihf lVT;
                {
                    this.lVT = ihf2;
                }

                public boolean e(ign ign2) {
                    return ((igr)ihf.k(this.lVT).get((Object)((Object)ign2.cTI()))).getSelected() && ihf.b(this.lVT, ign2);
                }
            });
        }
    }

    private void cWX() {
        this.cWW();
    }

    private void cWY() {
        this.cXc();
        if (this.lVu.cVV()) {
            switch (this.lVu.cVU()) {
                case lTp: {
                    this.lVL.c(new Comparator<igx>(this){
                        final /* synthetic */ ihf lVT;
                        {
                            this.lVT = ihf2;
                        }

                        public int a(igx igx2, igx igx3) {
                            return igx2.cUF().getTitle().compareTo(igx3.cUF().getTitle());
                        }

                        public /* synthetic */ int compare(Object object, Object object2) {
                            return this.a((igx)object, (igx)object2);
                        }
                    });
                    break;
                }
                case lTq: {
                    this.lVL.c(new Comparator<igx>(this){
                        final /* synthetic */ ihf lVT;
                        {
                            this.lVT = ihf2;
                        }

                        public int a(igx igx2, igx igx3) {
                            return igx2.cUF().cTI().ordinal() - igx3.cUF().cTI().ordinal();
                        }

                        public /* synthetic */ int compare(Object object, Object object2) {
                            return this.a((igx)object, (igx)object2);
                        }
                    });
                    break;
                }
                case lTr: {
                    this.lVL.c(new Comparator<igx>(this){
                        final /* synthetic */ ihf lVT;
                        {
                            this.lVT = ihf2;
                        }

                        public int a(igx igx2, igx igx3) {
                            return igx2.cUF().cTF() - igx3.cUF().cTF();
                        }

                        public /* synthetic */ int compare(Object object, Object object2) {
                            return this.a((igx)object, (igx)object2);
                        }
                    });
                    break;
                }
                case lTs: {
                    this.lVL.c(new Comparator<igx>(this){
                        final /* synthetic */ ihf lVT;
                        {
                            this.lVT = ihf2;
                        }

                        public int a(igx igx2, igx igx3) {
                            int n = igx2.cUF().cTP() ? 1 : 0;
                            int n2 = igx3.cUF().cTP() ? 1 : 0;
                            return n - n2;
                        }

                        public /* synthetic */ int compare(Object object, Object object2) {
                            return this.a((igx)object, (igx)object2);
                        }
                    });
                    break;
                }
                case lTt: {
                    this.lVL.c(new Comparator<igx>(this){
                        final /* synthetic */ ihf lVT;
                        {
                            this.lVT = ihf2;
                        }

                        public int a(igx igx2, igx igx3) {
                            int n = igx2.cUF().cTv() - igx3.cUF().cTv();
                            if (n != 0) {
                                return n;
                            }
                            n = igx2.cUF().cTw() - igx3.cUF().cTw();
                            return n;
                        }

                        public /* synthetic */ int compare(Object object, Object object2) {
                            return this.a((igx)object, (igx)object2);
                        }
                    });
                }
            }
        } else {
            switch (this.lVu.cVU()) {
                case lTp: {
                    this.lVL.c(new Comparator<igx>(this){
                        final /* synthetic */ ihf lVT;
                        {
                            this.lVT = ihf2;
                        }

                        public int a(igx igx2, igx igx3) {
                            return igx3.cUF().getTitle().compareTo(igx2.cUF().getTitle());
                        }

                        public /* synthetic */ int compare(Object object, Object object2) {
                            return this.a((igx)object, (igx)object2);
                        }
                    });
                    break;
                }
                case lTq: {
                    this.lVL.c(new Comparator<igx>(this){
                        final /* synthetic */ ihf lVT;
                        {
                            this.lVT = ihf2;
                        }

                        public int a(igx igx2, igx igx3) {
                            return igx3.cUF().cTI().ordinal() - igx2.cUF().cTI().ordinal();
                        }

                        public /* synthetic */ int compare(Object object, Object object2) {
                            return this.a((igx)object, (igx)object2);
                        }
                    });
                    break;
                }
                case lTr: {
                    this.lVL.c(new Comparator<igx>(this){
                        final /* synthetic */ ihf lVT;
                        {
                            this.lVT = ihf2;
                        }

                        public int a(igx igx2, igx igx3) {
                            return igx3.cUF().cTF() - igx2.cUF().cTF();
                        }

                        public /* synthetic */ int compare(Object object, Object object2) {
                            return this.a((igx)object, (igx)object2);
                        }
                    });
                    break;
                }
                case lTs: {
                    this.lVL.c(new Comparator<igx>(this){
                        final /* synthetic */ ihf lVT;
                        {
                            this.lVT = ihf2;
                        }

                        public int a(igx igx2, igx igx3) {
                            int n = igx2.cUF().cTP() ? 1 : 0;
                            int n2 = igx3.cUF().cTP() ? 1 : 0;
                            return n2 - n;
                        }

                        public /* synthetic */ int compare(Object object, Object object2) {
                            return this.a((igx)object, (igx)object2);
                        }
                    });
                    break;
                }
                case lTt: {
                    this.lVL.c(new Comparator<igx>(this){
                        final /* synthetic */ ihf lVT;
                        {
                            this.lVT = ihf2;
                        }

                        public int a(igx igx2, igx igx3) {
                            int n = igx3.cUF().cTv() - igx2.cUF().cTv();
                            if (n != 0) {
                                return n;
                            }
                            n = igx3.cUF().cTw() - igx2.cUF().cTw();
                            return n;
                        }

                        public /* synthetic */ int compare(Object object, Object object2) {
                            return this.a((igx)object, (igx)object2);
                        }
                    });
                }
            }
        }
        this.cXd();
    }

    private void cWZ() {
        Collection<igx> collection = this.lVM.values();
        for (igx igx2 : collection) {
            igx2.setSelected(false);
        }
        this.lVO = 0;
        this.cWQ();
    }

    private void cXa() {
        String string = this.lVr.getText();
        if (string != null && !string.isEmpty()) {
            String string2 = string.toLowerCase();
            this.a(new igv(this, string2){
                final /* synthetic */ String lVU;
                final /* synthetic */ ihf lVT;
                {
                    this.lVT = ihf2;
                    this.lVU = string;
                }

                public boolean e(ign ign2) {
                    return ign2.qg(this.lVU);
                }
            });
        } else {
            this.a(new igv(this){
                final /* synthetic */ ihf lVT;
                {
                    this.lVT = ihf2;
                }

                public boolean e(ign ign2) {
                    return ((igr)ihf.k(this.lVT).get((Object)((Object)ign2.cTI()))).getSelected();
                }
            });
        }
    }

    private void a(List<ign> list, List<ign> list2, List<ign> list3, Boolean bl) {
        igx igx2;
        for (igm object2 : igm.values()) {
            this.p(object2);
        }
        Object object3 = this.lVr.getText();
        if (object3 != null) {
            object3 = ((String)object3).toLowerCase();
        }
        int n = object3 != null && !((String)object3).isEmpty() ? 1 : 0;
        int n2 = 0;
        Iterator<ign> iterator = list2.iterator();
        while (iterator.hasNext()) {
            ign ign2;
            boolean bl2 = (n != 0 ? ign2.qg((String)object3) : this.lCa.get((Object)ign2.cTI()).getSelected()) && this.v(ign2) && ign2.cTM();
            if (bl2 != (igx2 = this.lVM.get(ign2 = iterator.next())).djL()) {
                igx2.setVisible(bl2);
                int n3 = bl2 ? 1 : -1;
                n2 += n3;
                if (igx2.getSelected()) {
                    this.lVO += n3;
                }
            }
            igx2.cSv();
        }
        this.lVw += n2;
        for (ign ign2 : list3) {
            igx igx3 = this.lVM.get(ign2);
            if (igx3.djL()) {
                this.t(ign2);
            }
            if (ign2.cTU() == null) continue;
            igx2 = this.lVM.get(ign2.cTU());
            igx2.m(ign2);
            if (ign2.cTM()) continue;
            igx2.cVb();
        }
        for (ign ign2 : list) {
            if (ign2.cTU() == null) continue;
            igx igx4 = this.lVM.get(ign2.cTU());
            igx4.m(ign2);
        }
        this.cWQ();
        this.qk(false);
    }

    private void u(ign ign2) {
        igx igx2 = this.lVM.get(ign2);
        igx2.cUZ();
    }

    private boolean v(ign ign2) {
        String string = this.lVu.cVT();
        if (string != null && !string.isEmpty() && !ign2.qg(string.toLowerCase())) {
            return false;
        }
        Set<igp> set = this.lVu.cTQ();
        if (set != null && !set.isEmpty()) {
            boolean bl = false;
            for (igp igp2 : set) {
                if (!ign2.a(igp2)) continue;
                bl = true;
                break;
            }
            if (!bl) {
                return false;
            }
        }
        return true;
    }

    private void cXb() {
        this.lVE = 0;
        this.lTN = 0;
        this.lTO = 0;
        this.lTP = 0;
        this.lVG = 0;
        this.lVH = 0;
        this.lVI = 0;
    }

    private void a(igx igx2, boolean bl) {
        if (igx2.djL()) {
            this.lVL.e(igx2);
            if (igx2.getSelected()) {
                ++this.lVO;
                this.cWQ();
            }
            if (bl) {
                this.t(igx2.cUF());
                this.qk(false);
            }
        }
    }

    private void cXc() {
        List<ipf> list = ((iph)((Object)this.lVL.drN())).getChildren();
        for (int i = list.size() - 1; i >= 0; --i) {
            igx igx2;
            ipf ipf2 = list.get(i);
            if (!ipf2.djL() || !(ipf2 instanceof igx) || !(igx2 = (igx)ipf2).cUY()) continue;
            igx2.qh(false);
            break;
        }
    }

    private void cXd() {
        List<ipf> list = ((iph)((Object)this.lVL.drN())).getChildren();
        for (int i = list.size() - 1; i >= 0; --i) {
            ipf ipf2 = list.get(i);
            if (!ipf2.djL() || !(ipf2 instanceof igx)) continue;
            igx igx2 = (igx)ipf2;
            igx2.qh(true);
            break;
        }
    }

    private void cXe() {
        if (this.lVN != null) {
            if (this.lVN.djL()) {
                ++this.lVw;
                this.a(this.lVN, true);
            }
            this.lVN = null;
        }
    }

    static /* synthetic */ void a(ihf ihf2, List list, List list2, List list3, Boolean bl) {
        ihf2.a(list, list2, list3, bl);
    }

    static /* synthetic */ void a(ihf ihf2, ign ign2) {
        ihf2.u(ign2);
    }

    static /* synthetic */ boolean b(ihf ihf2, ign ign2) {
        return ihf2.v(ign2);
    }

    static /* synthetic */ void a(ihf ihf2) {
        ihf2.cWS();
    }

    static /* synthetic */ void b(ihf ihf2) {
        ihf2.cWT();
    }

    static /* synthetic */ boolean a(ihf ihf2, boolean bl) {
        ihf2.lVS = bl;
        return ihf2.lVS;
    }

    static /* synthetic */ void c(ihf ihf2) {
        ihf2.cWU();
    }

    static /* synthetic */ void d(ihf ihf2) {
        ihf2.cWV();
    }

    static /* synthetic */ void e(ihf ihf2) {
        ihf2.cWW();
    }

    static /* synthetic */ void f(ihf ihf2) {
        ihf2.cWX();
    }

    static /* synthetic */ void g(ihf ihf2) {
        ihf2.cWY();
    }

    static /* synthetic */ void h(ihf ihf2) {
        ihf2.cWZ();
    }

    static /* synthetic */ void i(ihf ihf2) {
        ihf2.cXa();
    }

    static /* synthetic */ int a(ihf ihf2, int n) {
        return ihf2.lVO += n;
    }

    static /* synthetic */ void j(ihf ihf2) {
        ihf2.cWQ();
    }

    static /* synthetic */ Map k(ihf ihf2) {
        return ihf2.lCa;
    }
}

