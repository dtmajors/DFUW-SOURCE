/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;

public class ihg
extends ipz {
    static final int lVW = 171;
    static final int lVX = 470;
    static final int lVY = 70;
    static final int lVZ = 100;
    static final int lWa = 262;
    static final int lWb = 315;
    static final int lWc = 210;
    private izh lWd;
    private ist lWe;
    private ist lWf;
    private ist lWg;
    private ist lWh;
    private Map<igm, igs> lWi = lcn.emw();

    public ihg() {
        this.a(iqo.dmT());
        this.W(ipx.a(1, 8, new ipf[0]));
        this.W(this.cVc());
        this.W(ipx.a(1, 4, new ipf[0]));
        this.W(ipx.i(this.cXj()));
        this.W(ipx.a(1, 10, new ipf[0]));
        this.W(this.cXk());
        this.W(ipx.a(1, 8, new ipf[0]));
        this.W(ipx.c(new ipf[0]));
    }

    @Override
    public void a(ioa ioa2) {
        super.a(ioa2);
        igq.lTF.a((jli<List<ign>, List<ign>, List<ign>, Boolean>)new jlu<ihg, List<ign>, List<ign>, List<ign>, Boolean>(this, this){
            final /* synthetic */ ihg lWj;
            {
                this.lWj = ihg2;
                super(ihg3);
            }

            public void a(ihg ihg2, List<ign> list, List<ign> list2, List<ign> list3, Boolean bl) {
                this.lWj.b(list, list2, list3, bl);
            }
        });
    }

    @Override
    public void kh(float f) {
        if (this.lWd != null) {
            this.lWd.kh(f);
        }
        for (igs igs2 : this.lWi.values()) {
            igs2.kh(f);
        }
    }

    public void n(igm igm2) {
    }

    private ipf cVc() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(1, 32, new ipf[0]));
        ipx2.W(ipx.a(171, 25, ipx.d(this.cXh())));
        ipx2.W(new ihh());
        ipx2.W(ipx.a(470, 25, ipx.d(this.cXi())));
        ipx2.W(new ihh());
        ipx2.W(ipx.a(70, 25, ipx.d(new ipb("icon_feats_gold"))));
        ipx2.W(new ihh());
        ipx2.W(ipx.a(100, 25, ipx.d(new ipb("icon_prowess_gold"))));
        return ipx2;
    }

    private ipf cXh() {
        ist ist2 = new ist();
        ist2.a(isf.mwO, 18);
        ist2.Rk(12357465);
        ist2.g(lww.tiY);
        return ist2;
    }

    private ipf cXi() {
        ist ist2 = new ist();
        ist2.a(isf.mwO, 18);
        ist2.Rk(12357465);
        ist2.g(lww.tja);
        return ist2;
    }

    private ipf cXj() {
        izm izm2 = new izm(this){
            final /* synthetic */ ihg lWj;
            {
                this.lWj = ihg2;
            }

            public String cXf() {
                return "feats_separation_line_horizontal_03";
            }
        };
        this.lWd = izm2;
        izm2.a(iun.mAh);
        izm2.W("feat_gradient_top", "feat_gradient_bottom");
        this.a(izm2);
        return izm2;
    }

    private void a(izh izh2) {
        int n = 1;
        for (igm igm2 : igm.values()) {
            igs igs2 = new igs(this, igm2, n == igm.values().length){
                final /* synthetic */ ihg lWj;
                {
                    this.lWj = ihg2;
                    super(igm2, bl);
                }

                public void cLq() {
                    this.lWj.n(this.cTI());
                }
            };
            this.lWi.put(igm2, igs2);
            izh2.c(igs2);
            ++n;
        }
    }

    private ipf cXk() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.d(this.cXl()));
        ipx2.W(new ihh());
        ipx2.W(ipx.d(this.cXr()));
        ipx2.W(new ihh());
        ipx2.W(ipx.c(new ipf[]{ipx.d(new iwv("icon_total", lww.tki.bD(new Object[0])))}));
        return ipx2;
    }

    private ipf cXl() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(0, 55, new ipf[0]));
        ipx2.W(ipx.a(16, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cXm()));
        ipx2.W(ipx.a(16, 1, new ipf[0]));
        ipx2.W(new iwv("icon_repeatables", lww.tke.bD(new Object[0])));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.j(ipx.a(1, 17, new ipf[0]), ipx.c(new ihh()), ipx.a(1, 17, new ipf[0])));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cXn()));
        ipx2.W(ipx.a(16, 1, new ipf[0]));
        ipx2.W(new iwv("IconProwessBitmap", lww.tkf.bD(new Object[0])));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.j(ipx.a(1, 17, new ipf[0]), ipx.c(new ihh()), ipx.a(1, 17, new ipf[0])));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cXp()));
        ipx2.W(ipx.a(16, 1, new ipf[0]));
        return ipx2;
    }

    private ipf cXm() {
        ist ist2 = new ist();
        ist2.a(isf.mwO, 18);
        ist2.Rk(12357465);
        ist2.o(lww.tkk.bD(new Object[0]));
        return ist2;
    }

    private ipf cXn() {
        this.lWg = new ist();
        this.lWg.a(isf.mwO, 18);
        this.lWg.Rk(0xABABAB);
        this.cXo();
        return this.lWg;
    }

    private void cXo() {
        this.lWg.setText("" + igq.cUl());
    }

    private ipf cXp() {
        this.lWh = new ist();
        this.lWh.a(isf.mwO, 18);
        this.lWh.Rk(0xABABAB);
        this.cXq();
        return this.lWh;
    }

    private void cXq() {
        this.lWh.setText("" + igq.cUm());
    }

    private ipf cXr() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(0, 55, new ipf[0]));
        ipx2.W(ipx.a(16, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cXs()));
        ipx2.W(ipx.a(16, 1, new ipf[0]));
        ipx2.W(new iwv("IconFeatBitmap", lww.tkg.bD(new Object[0])));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.j(ipx.a(1, 17, new ipf[0]), ipx.c(new ihh()), ipx.a(1, 17, new ipf[0])));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cXt()));
        ipx2.W(ipx.d(this.cXv()));
        ipx2.W(ipx.a(16, 1, new ipf[0]));
        ipx2.W(new iwv("IconProwessBitmap", lww.tkh.bD(new Object[0])));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.j(ipx.a(1, 17, new ipf[0]), ipx.c(new ihh()), ipx.a(1, 17, new ipf[0])));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cXw()));
        ipx2.W(ipx.d(this.cXy()));
        ipx2.W(ipx.a(16, 1, new ipf[0]));
        return ipx2;
    }

    private ipf cXs() {
        ist ist2 = new ist();
        ist2.a(isf.mwO, 18);
        ist2.Rk(12357465);
        ist2.o(lww.tkl.bD(new Object[0]));
        return ist2;
    }

    private ipf cXt() {
        this.lWe = new ist();
        this.lWe.a(isf.mwO, 18);
        this.lWe.Rk(0xABABAB);
        this.cXu();
        return this.lWe;
    }

    private void cXu() {
        this.lWe.setText("" + igq.cUi());
    }

    private ipf cXv() {
        ist ist2 = new ist();
        ist2.a(isf.mwO, 18);
        ist2.Rk(12357465);
        ist2.setText("/" + igq.cUj());
        return ist2;
    }

    private ipf cXw() {
        this.lWf = new ist();
        this.lWf.a(isf.mwO, 18);
        this.lWf.Rk(0xABABAB);
        this.cXx();
        return this.lWf;
    }

    private void cXx() {
        this.lWf.setText("" + igq.cUk());
    }

    private ipf cXy() {
        ist ist2 = new ist();
        ist2.a(isf.mwO, 18);
        ist2.Rk(12357465);
        ist2.setText("/" + igq.cTF());
        return ist2;
    }

    private ipf cXz() {
        ist ist2 = new ist();
        ist2.a(isf.mwO, 18);
        ist2.Rk(12357465);
        ist2.g(lww.tiZ);
        return ist2;
    }

    private void q(igm igm2) {
        igs igs2 = this.lWi.get((Object)igm2);
        igs2.cUq();
    }

    protected void b(List<ign> list, List<ign> list2, List<ign> list3, Boolean bl) {
        for (igm igm2 : igm.values()) {
            this.q(igm2);
        }
        this.cXu();
        this.cXx();
        this.cXo();
        this.cXq();
    }
}

