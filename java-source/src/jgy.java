/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class jgy
extends ipx
implements iua {
    private jgw nbH;
    private a nbI;
    private b nbJ;
    private iwv nbK;
    private iso nbL;
    private ivs nbM;

    public jgy(jgw jgw2) {
        this.nbH = jgw2;
        this.a(new iqx(4, 4, 4, 4));
        this.W(ipx.a(358, 100, new ipf[0]));
        this.W(this.dFf());
        this.dFl();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        hso.cxK().cxT().sx(this.nbH.Name);
    }

    @Override
    public boolean getSelected() {
        return false;
    }

    @Override
    public void setSelected(boolean bl) {
    }

    public void dFg() {
        this.dFl();
        this.dFm();
    }

    public void dFh() {
        this.dFl();
    }

    public void dFi() {
        this.dFl();
    }

    private ipf dFf() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(this.dFj());
        ipx2.W(ipx.a(1, 10, new ipf[0]));
        ipx2.W(ipx.l(ipx.a(0, 1, new ipf[0]), this.cUv()));
        ipx2.W(ipx.a(1, 10, new ipf[0]));
        return ipx2;
    }

    private ipf dFj() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.d(this.cPn()));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(this.dwj());
        return ipx2;
    }

    private ipf cPn() {
        aex aex2 = aev.zi().get(this.nbH.Name);
        lox lox2 = aex2.zl();
        loz loz2 = lox2 != null ? lox2.bD(new Object[0]) : lvn.sXN.bD("Empty");
        this.nbK = new iwv("/dfdata/texture/gui/j2f/special_events/list_icons/" + aex2.zm(), loz2);
        return this.nbK;
    }

    private ipf dwj() {
        ipx ipx2 = ipx.j(new ipf[0]);
        this.nbM = this.dFk();
        ipx2.W(ipx.l(ipx.d(this.duM()), ipx.c(new ipf[0]), ipx.d(this.nbM)));
        ipx2.W(this.dwl());
        return ipx2;
    }

    private ipf duM() {
        aex aex2 = aev.zi().get(this.nbH.Name);
        this.nbJ = new b(this, isf.mwO, 16, 12357465, aex2, this.nbH.kgo);
        return this.nbJ;
    }

    private ivs dFk() {
        return new ivs(this){
            final /* synthetic */ jgy nbN;
            {
                this.nbN = jgy2;
            }

            public void pn(boolean bl) {
                if (bl) {
                    ArrayList<String> arrayList = lcn.emv();
                    aex aex2 = aev.zi().get(jgy.a((jgy)this.nbN).Name);
                    if (aex2 == null) {
                        return;
                    }
                    if (aex2.zn() == null || aex2.zn().size() <= jgy.a((jgy)this.nbN).kgo) {
                        return;
                    }
                    aez aez2 = aex2.zn().get(jgy.a((jgy)this.nbN).kgo);
                    afm afm2 = aez2.zz();
                    if (afm2 != afm.bgP) {
                        return;
                    }
                    afb afb2 = (afb)aez2;
                    List<Integer> list = afb2.zK();
                    if (list == null) {
                        return;
                    }
                    for (int n : list) {
                        String string = lvm.sXa.bD(n).exA();
                        arrayList.add(string);
                    }
                    hso.cxK().cxT().b(jgy.a((jgy)this.nbN).Name, arrayList);
                } else {
                    hso.cxK().cxT().sx(jgy.a((jgy)this.nbN).Name);
                }
            }
        };
    }

    private ipf dwl() {
        aex aex2 = aev.zi().get(this.nbH.Name);
        this.nbL = new iso(isf.mwN, 12, 0xABABAB, aex2.es(this.nbH.kgo) != null ? aex2.es(this.nbH.kgo).bD(new Object[0]) : lvn.sXN.bD("Empty"));
        this.nbL.sv(false);
        this.nbL.a(isu.mxP);
        this.nbL.setWidth(260);
        return this.nbL;
    }

    private ipf cUv() {
        irs irs2 = new irs();
        irs2.Sn(1);
        irs2.So(3);
        irs2.Sp(0x1B1B1B);
        irs2.qu("/dfdata/texture/gui/j2f/special_events/progressbar/progress_bar_bg.png");
        irs2.ra("/dfdata/texture/gui/j2f/special_events/progressbar/progress_bar_filling.png");
        aex aex2 = aev.zi().get(this.nbH.Name);
        aez aez2 = aex2.zn().get(this.nbH.kgo);
        this.nbI = new a(this, irs2, aez2.zB(), 0, aez2.getLimit());
        return this.nbI;
    }

    private void dFl() {
        aex aex2 = aev.zi().get(this.nbH.Name);
        aez aez2 = aex2.zn().get(this.nbH.kgo);
        this.nbI.setProgress(this.nbH.iIy, 0, aez2.getLimit());
        this.nbI.UC(this.nbH.iIy);
        afm afm2 = aez2.zz();
        if (afm2 != afm.bgP && this.nbM != null) {
            this.nbM.rF(false);
            this.nbM.setVisible(false);
        }
    }

    private void dFm() {
        if (this.nbH == null) {
            return;
        }
        aex aex2 = aev.zi().get(this.nbH.Name);
        if (aex2 == null) {
            return;
        }
        if (this.nbH.kgo < 0 || this.nbH.kgo >= aex2.zn().size()) {
            return;
        }
        aez aez2 = aex2.zn().get(this.nbH.kgo);
        if (aez2 == null) {
            return;
        }
        afm afm2 = aez2.zz();
        if (afm2 != afm.bgP) {
            this.nbM.rF(false);
            this.nbM.setVisible(false);
        }
        if (this.nbL != null) {
            this.nbL.g(aez2.zl());
        }
        if (this.nbJ != null) {
            this.nbJ.UD(this.nbH.kgo);
        }
        if (this.nbI != null) {
            this.nbI.setLimit(aez2.getLimit());
            this.nbI.i(aez2.zB());
            this.nbI.setProgress(this.nbH.iIy, 0, aez2.getLimit());
        }
    }

    static /* synthetic */ jgw a(jgy jgy2) {
        return jgy2.nbH;
    }
}

