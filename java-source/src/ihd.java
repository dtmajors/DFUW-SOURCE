/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ihd
extends ipz {
    private static final String lUR = "ConfigTag";
    private static final String lUS = "ConfigSorting";
    private static final String lUT = "ConfigSortingAscending";
    private iqa lUU;
    private ipx lUV;
    private izu lUW;
    private ipx lUD;
    private iox lUX;
    private ist lUY;
    private iza lUZ;
    private ios lVa;
    private ios lVb;
    private Set<igp> lVc = lcn.emx();
    private igo lVd = igo.lTp;
    private boolean lVe = true;

    public ihd() {
        this.setName("FeatWindowFilterBar");
        this.a(iqo.dmS());
        ipx ipx2 = ipx.h(new ipf[0]);
        this.W(ipx2);
        this.lUU = new iqa("filter_bar_bg", 1, 1, 1, 1, iqb.mtp);
        ipx2.W(this.lUU);
        ipx ipx3 = ipx.l(new ipf[0]);
        ipx2.W(ipx.c(1, 1, 1, 1, ipx3));
        this.lUV = ipx.d(ipx.a(150, 22, this.cWb()));
        ipx3.W(this.lUV);
        ipx3.W(ipx.a(2, 1, new ipf[0]));
        ipx3.W(ipx.j(ipx.a(1, 1, new ipf[0]), ipx.c(new ihh()), ipx.a(1, 1, new ipf[0])));
        ipx3.W(ipx.a(2, 1, new ipf[0]));
        ipx3.W(this.cVz());
        ipx3.W(this.cWc());
        ipx3.W(ipx.a(2, 1, new ipf[0]));
        ipx3.W(ipx.j(ipx.a(1, 1, new ipf[0]), ipx.c(new ihh()), ipx.a(1, 1, new ipf[0])));
        ipx3.W(ipx.a(2, 1, new ipf[0]));
        ipx3.W(this.cWd());
        ipx3.W(this.cWe());
        ipx3.W(ipx.a(2, 1, new ipf[0]));
        ipx3.W(ipx.j(ipx.a(1, 1, new ipf[0]), ipx.c(new ihh()), ipx.a(1, 1, new ipf[0])));
        ipx3.W(ipx.a(2, 1, new ipf[0]));
        ipx3.W(this.cWf());
        this.W(ipx.d(this.cWg()));
        this.W(ipx.a(16, 1, new ipf[0]));
        this.cWi();
        for (igp igp2 : igp.values()) {
            this.a(lUR + igp2.name(), hsu.ldg, false);
        }
        this.a(lUS, hsu.ldg, this.lVd.ordinal());
        this.a(lUT, hsu.ldg, this.lVe);
    }

    public String cVT() {
        return this.lUW.getText();
    }

    public Set<igp> cTQ() {
        return Collections.unmodifiableSet(this.lVc);
    }

    public void bg(List<igp> list) {
        this.lVc.clear();
        for (igp igp2 : igp.values()) {
            this.q(lUR + igp2.name(), false);
        }
        for (igp igp3 : list) {
            this.lVc.add(igp3);
            this.q(lUR + igp3.name(), true);
        }
        if (this.lUD != null) {
            this.lUD.removeAllChildren();
            for (igp igp4 : list) {
                this.lUD.W(new ihb(igp4));
            }
            this.lUX.hX(!list.isEmpty());
            if (!list.isEmpty()) {
                this.lVb.setVisible(true);
            }
        }
        this.cVX();
    }

    public igo cVU() {
        return this.lVd;
    }

    public boolean cVV() {
        return this.lVe;
    }

    public void a(igo igo2, boolean bl) {
        if (igo2 == this.lVd && bl == this.lVe) {
            return;
        }
        this.lVd = igo2;
        this.w(lUS, this.lVd.ordinal());
        this.lVe = bl;
        this.q(lUT, this.lVe);
        this.cWi();
        this.cVY();
    }

    public void qi(boolean bl) {
        this.lVa.rF(bl);
    }

    public void cVW() {
        this.lUW.setText("");
        this.lUD.removeAllChildren();
        this.lUX.hX(false);
        this.lUY.setText("");
        this.lVb.setVisible(false);
        this.lVc.clear();
        this.lVd = igo.lTp;
        this.lVe = true;
        this.cWi();
        this.pack();
    }

    @Override
    public void kh(float f) {
        if (this.lUU != null) {
            this.lUU.hz(f);
        }
        if (this.lVb != null) {
            this.lVb.kh(f);
        }
    }

    public void qj(String string) {
    }

    public void cVX() {
    }

    public void cVY() {
    }

    public void cVZ() {
    }

    public void cWa() {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cDZ() {
        void var2_5;
        super.cDZ();
        ArrayList<igp> arrayList = lcn.emv();
        for (igp igp2 : igp.values()) {
            if (!this.nk(lUR + igp2.name()).booleanValue()) continue;
            arrayList.add(igp2);
        }
        this.bg(arrayList);
        igo igo2 = this.lVd;
        int n = this.lVe ? 1 : 0;
        int n2 = this.nh(lUS);
        if (n2 >= 0 && n2 < igo.values().length) {
            igo igo3 = igo.values()[n2];
        }
        n = this.nk(lUT).booleanValue() ? 1 : 0;
        this.a((igo)var2_5, n != 0);
    }

    private ipf cWb() {
        this.lUW = new izu(this){
            final /* synthetic */ ihd lVf;
            {
                this.lVf = ihd2;
            }

            public void od(String string) {
                super.od(string);
                this.dqb().L();
                ihd.a(this.lVf).setVisible(true);
                this.lVf.qj(string);
            }
        };
        this.lUW.dqb().sp(false);
        return this.lUW;
    }

    private ipf cVz() {
        this.lUD = ipx.l(new ipf[0]);
        return this.lUD;
    }

    private ipf cWc() {
        this.lUX = new izc(this){
            final /* synthetic */ ihd lVf;
            {
                this.lVf = ihd2;
            }

            public void cLq() {
                ihd.a(this.lVf, this);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lww.tjP.bD(new Object[0]).exA());
            }
        };
        return this.lUX;
    }

    private ipf cWd() {
        this.lUY = new ist();
        this.lUY.a(isf.mwO, 15);
        this.lUY.Rk(0xABABAB);
        this.lUY.setVisible(false);
        return this.lUY;
    }

    private ipf cWe() {
        this.lUZ = new iza(this){
            final /* synthetic */ ihd lVf;
            {
                this.lVf = ihd2;
            }

            public void cLq() {
                ihd.a(this.lVf, this);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lww.tjQ.bD(new Object[0]).exA());
            }
        };
        return this.lUZ;
    }

    private ipf cWf() {
        this.lVa = new iyy(this){
            final /* synthetic */ ihd lVf;
            {
                this.lVf = ihd2;
            }

            public void cLq() {
                this.lVf.cVZ();
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lww.tjR.bD(new Object[0]).exA());
            }
        };
        this.lVa.rF(false);
        return this.lVa;
    }

    private ipf cWg() {
        this.lVb = new iyx(this, true){
            final /* synthetic */ ihd lVf;
            {
                this.lVf = ihd2;
                super(bl);
            }

            public void cLq() {
                ihd.b(this.lVf);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lww.sXT.bD(new Object[0]).exA());
            }
        };
        this.lVb.setVisible(false);
        return this.lVb;
    }

    private void a(izc izc2) {
        ioc ioc2 = izc2.eo(0, 0);
        ihj ihj2 = new ihj(this, this.djE(), new joa(ioc2.cf, ioc2.cg, izc2.getWidth(), izc2.getHeight()), Collections.unmodifiableSet(this.lVc)){
            final /* synthetic */ ihd lVf;
            {
                this.lVf = ihd2;
                super(ioa2, joa2, set);
            }

            public void bh(List<igp> list) {
                this.lVf.bg(list);
            }
        };
        ihj2.setGUID(this.djE().getMessageDelegator().bzv());
        this.djE().getMessageDelegator().a((amf)((Object)ihj2));
    }

    private void a(izb izb2) {
        ioc ioc2 = izb2.eo(0, 0);
        izr<igo> izr2 = new izr<igo>(this, this.djE(), new joa(ioc2.cf, ioc2.cg, izb2.getWidth(), izb2.getHeight()), this.lVd, this.lVe, igo.values(), "TagsBackgroundBitmap", 40, 1, 215, 85){
            final /* synthetic */ ihd lVf;
            {
                this.lVf = ihd2;
                super(ioa2, joa2, (Enum)igo2, bl, (Enum[])igoArray, string, n, n2, n3, n4);
            }

            public void b(igo igo2, boolean bl) {
                this.lVf.a(igo2, bl);
            }

            public /* synthetic */ void a(Enum enum_, boolean bl) {
                this.b((igo)enum_, bl);
            }
        };
        izr2.setGUID(this.djE().getMessageDelegator().bzv());
        this.djE().getMessageDelegator().a((amf)((Object)izr2));
    }

    private void cWh() {
        this.cVW();
        this.cWa();
    }

    private void cWi() {
        if (this.lUY != null) {
            this.lUY.setVisible(true);
            this.lUY.g(this.lVd != null ? this.lVd.cNq() : null);
            this.lUZ.hX(this.lVd != null);
            if (this.lVd != null) {
                this.lVb.setVisible(true);
            }
        } else {
            this.lUY.setVisible(false);
        }
        this.lUZ.sN(this.lVe);
        this.pack();
    }

    static /* synthetic */ ios a(ihd ihd2) {
        return ihd2.lVb;
    }

    static /* synthetic */ void a(ihd ihd2, izc izc2) {
        ihd2.a(izc2);
    }

    static /* synthetic */ void a(ihd ihd2, izb izb2) {
        ihd2.a(izb2);
    }

    static /* synthetic */ void b(ihd ihd2) {
        ihd2.cWh();
    }
}

