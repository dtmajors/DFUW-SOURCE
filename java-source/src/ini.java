/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class ini
extends ihm {
    private imi mmc;
    private boolean mmd;
    private iuy mme;
    private iuy mmf;
    private iuy mmg;
    private iuy mmh;
    private iuy mmi;
    private iuy mmj;
    private izu mmk;
    private izm mml;

    public ini(ioa ioa2, joa joa2, imi imi2, boolean bl) {
        super("InventoryFilterSearchOptionsPopupWindow", "J2FWindow.swf", ioa2, joa2, 1, 3);
        this.mmc = imi2.ded();
        this.mmd = bl;
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.p(40, 0, 40, 100);
        this.cXC().z(this.mmd ? lxc.tnm.bD(new Object[0]) : lxc.tnn.bD(new Object[0]));
        this.cXE().a(irl.dnr());
        this.cXE().W(this.cGU());
        this.pack();
    }

    @Override
    protected ipf cMs() {
        return ipx.j(ipx.a(1, 29, new ipf[0]), ipx.c(new iqa("/dfdata/texture/gui/j2f/inventory/filter/inv_bg_filter.png", 66, 4, 191, 66, iqb.mtp)));
    }

    protected void b(imi imi2) {
    }

    private ipf cGU() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(this.dgo());
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx2.W(new ipk(0x313131, 1, 1));
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(this.dgI());
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx2.W(this.dfb());
        ipx2.W(ipx.a(1, 39, new ipf[0]));
        return ipx2;
    }

    private ipf dgo() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(new ist(isf.mwO, 18, 12357465, lxc.tno.bD(new Object[0])));
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(this.dgp());
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(this.deV());
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(this.dgw());
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(this.dgA());
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(this.dgE());
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(this.deY());
        return ipx2;
    }

    private ipf dgp() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ist(isf.mwO, 14, 0xABABAB, lxc.tnp.bD(new Object[0]))));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(118, 20, this.dgq())));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 20)));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dgr()));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dgq() {
        izz izz2 = new izz(this){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
            }

            public void od(String string) {
                super.od(string);
                ini.a((ini)this.mmm).mjd = string;
                ini.a((ini)this.mmm).mjo = !string.isEmpty();
                ini.b(this.mmm).hX(ini.a((ini)this.mmm).mjo);
            }
        };
        izz2.dqb().a(isf.mwN, 12);
        izz2.dqb().st(true);
        izz2.dqb().rp(isr.eN(0, bqv.avo()));
        izz2.setText(this.mmc.mjd);
        izz2.dqb().setText(this.mmc.mjd);
        izz2.dqb().L();
        return izz2;
    }

    private ipf dgr() {
        this.mme = new iuy(this, this.mmc.mjo){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
                super(bl);
            }

            public void pn(boolean bl) {
                ini.a((ini)this.mmm).mjo = bl;
            }
        };
        return this.mme;
    }

    private ipf deV() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ist(isf.mwO, 14, 0xABABAB, lxc.tmB.bD(new Object[0]))));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(118, 20, this.deW())));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 20)));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dgs()));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        return ipx2;
    }

    private ipf deW() {
        izz izz2 = new izz(this){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
            }

            public void od(String string) {
                super.od(string);
                ini.a((ini)this.mmm).mje = string;
                ini.a((ini)this.mmm).mjp = !string.isEmpty();
                ini.c(this.mmm).hX(ini.a((ini)this.mmm).mjp);
            }
        };
        izz2.dqb().a(isf.mwN, 12);
        izz2.dqb().st(true);
        izz2.dqb().rp(isr.eN(0, 15));
        izz2.dqb().setText(this.mmc.mje);
        return izz2;
    }

    private ipf dgs() {
        this.mmf = new iuy(this, this.mmc.mjp){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
                super(bl);
            }

            public void pn(boolean bl) {
                ini.a((ini)this.mmm).mjp = bl;
            }
        };
        return this.mmf;
    }

    private ipf deY() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ist(isf.mwO, 14, 0xABABAB, lxc.tmC.bD(new Object[0]))));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(51, 20, this.dgt())));
        ipx2.W(ipx.d(new ipb("/dfdata/texture/gui/j2f/inventory/from_to_dash.png")));
        ipx2.W(ipx.d(ipx.a(51, 20, this.dgu())));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 20)));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dgv()));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dgt() {
        return new ivd(this, this.mmc.mjf, lxc.tnq){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
                super(n, lox2);
            }

            public void PW(int n) {
                ini.a((ini)this.mmm).mjf = n;
                ini.a((ini)this.mmm).mjq = ini.a((ini)this.mmm).mjf <= ini.a((ini)this.mmm).mjg;
                ini.d(this.mmm).hX(ini.a((ini)this.mmm).mjq);
            }
        };
    }

    private ipf dgu() {
        return new ivd(this, this.mmc.mjg, lxc.tnr){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
                super(n, lox2);
            }

            public void PW(int n) {
                ini.a((ini)this.mmm).mjg = n;
                ini.a((ini)this.mmm).mjq = ini.a((ini)this.mmm).mjf <= ini.a((ini)this.mmm).mjg;
                ini.d(this.mmm).hX(ini.a((ini)this.mmm).mjq);
            }
        };
    }

    private ipf dgv() {
        this.mmg = new iuy(this, this.mmc.mjq){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
                super(bl);
            }

            public void pn(boolean bl) {
                ini.a((ini)this.mmm).mjq = bl;
            }
        };
        return this.mmg;
    }

    private ipf dgw() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ist(isf.mwO, 14, 0xABABAB, lxc.tnu.bD(new Object[0]))));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(51, 20, this.dgx())));
        ipx2.W(ipx.d(new ipb("/dfdata/texture/gui/j2f/inventory/from_to_dash.png")));
        ipx2.W(ipx.d(ipx.a(51, 20, this.dgy())));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 20)));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dgz()));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dgx() {
        izz izz2 = new izz(this){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
            }

            public void od(String string) {
                super.od(string);
                int n = Integer.valueOf(string);
                if (n != ini.a((ini)this.mmm).mjh) {
                    ini.a((ini)this.mmm).mjh = n;
                    ini.a((ini)this.mmm).mjr = !string.isEmpty() && ini.a((ini)this.mmm).mjh <= ini.a((ini)this.mmm).mji;
                    ini.e(this.mmm).hX(ini.a((ini)this.mmm).mjr);
                }
            }
        };
        izz2.dqb().a(isf.mwN, 12);
        izz2.dqb().st(true);
        izz2.dqb().b(isr.dqa(), 0, false);
        izz2.dqb().setText("" + this.mmc.mjh);
        return izz2;
    }

    private ipf dgy() {
        izz izz2 = new izz(this){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
            }

            public void od(String string) {
                super.od(string);
                int n = Integer.valueOf(string);
                if (n != ini.a((ini)this.mmm).mji) {
                    ini.a((ini)this.mmm).mji = n;
                    ini.a((ini)this.mmm).mjr = !string.isEmpty() && ini.a((ini)this.mmm).mjh <= ini.a((ini)this.mmm).mji;
                    ini.e(this.mmm).hX(ini.a((ini)this.mmm).mjr);
                }
            }
        };
        izz2.dqb().a(isf.mwN, 12);
        izz2.dqb().st(true);
        izz2.dqb().b(isr.dqa(), 0, false);
        izz2.dqb().setText("" + this.mmc.mji);
        return izz2;
    }

    private ipf dgz() {
        this.mmh = new iuy(this, this.mmc.mjr){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
                super(bl);
            }

            public void pn(boolean bl) {
                ini.a((ini)this.mmm).mjr = bl;
            }
        };
        return this.mmh;
    }

    private ipf dgA() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ist(isf.mwO, 14, 0xABABAB, lxc.tnv.bD(new Object[0]))));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(51, 20, this.dgB())));
        ipx2.W(ipx.d(new ipb("/dfdata/texture/gui/j2f/inventory/from_to_dash.png")));
        ipx2.W(ipx.d(ipx.a(51, 20, this.dgC())));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 20)));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dgD()));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dgB() {
        izz izz2 = new izz(this){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
            }

            public void od(String string) {
                super.od(string);
                int n = Integer.valueOf(string);
                if (n != ini.a((ini)this.mmm).mjj) {
                    ini.a((ini)this.mmm).mjj = n;
                    ini.a((ini)this.mmm).mjs = !string.isEmpty() && ini.a((ini)this.mmm).mjj <= ini.a((ini)this.mmm).mjk;
                    ini.f(this.mmm).hX(ini.a((ini)this.mmm).mjs);
                }
            }
        };
        izz2.dqb().a(isf.mwN, 12);
        izz2.dqb().st(true);
        izz2.dqb().b(isr.dqa(), 0, false);
        izz2.setText("" + this.mmc.mjj);
        return izz2;
    }

    private ipf dgC() {
        izz izz2 = new izz(this){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
            }

            public void od(String string) {
                super.od(string);
                int n = Integer.valueOf(string);
                if (n != ini.a((ini)this.mmm).mjk) {
                    ini.a((ini)this.mmm).mjk = n;
                    ini.a((ini)this.mmm).mjs = !string.isEmpty() && ini.a((ini)this.mmm).mjj <= ini.a((ini)this.mmm).mjk;
                    ini.f(this.mmm).hX(ini.a((ini)this.mmm).mjs);
                }
            }
        };
        izz2.dqb().a(isf.mwN, 12);
        izz2.dqb().st(true);
        izz2.dqb().b(isr.dqa(), 0, false);
        izz2.setText("" + this.mmc.mjk);
        return izz2;
    }

    private ipf dgD() {
        this.mmi = new iuy(this, this.mmc.mjs){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
                super(bl);
            }

            public void pn(boolean bl) {
                ini.a((ini)this.mmm).mjs = bl;
            }
        };
        return this.mmi;
    }

    private ipf dgE() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ist(isf.mwO, 14, 0xABABAB, lxc.tnw.bD(new Object[0]))));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(51, 20, this.dgF())));
        ipx2.W(ipx.d(new ipb("/dfdata/texture/gui/j2f/inventory/from_to_dash.png")));
        ipx2.W(ipx.d(ipx.a(51, 20, this.dgG())));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 20)));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dgH()));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dgF() {
        izz izz2 = new izz(this){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
            }

            public void od(String string) {
                super.od(string);
                int n = Integer.valueOf(string);
                if (n != ini.a((ini)this.mmm).mjl) {
                    ini.a((ini)this.mmm).mjl = n;
                    ini.a((ini)this.mmm).mjt = !string.isEmpty() && ini.a((ini)this.mmm).mjl <= ini.a((ini)this.mmm).mjm;
                    ini.g(this.mmm).hX(ini.a((ini)this.mmm).mjt);
                }
            }
        };
        izz2.dqb().a(isf.mwN, 12);
        izz2.dqb().st(true);
        izz2.dqb().b(isr.dqa(), 0, false);
        izz2.setText("" + this.mmc.mjl);
        return izz2;
    }

    private ipf dgG() {
        izz izz2 = new izz(this){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
            }

            public void od(String string) {
                super.od(string);
                int n = Integer.valueOf(string);
                if (n != ini.a((ini)this.mmm).mjm) {
                    ini.a((ini)this.mmm).mjm = n;
                    ini.a((ini)this.mmm).mjt = !string.isEmpty() && ini.a((ini)this.mmm).mjl <= ini.a((ini)this.mmm).mjm;
                    ini.g(this.mmm).hX(ini.a((ini)this.mmm).mjt);
                }
            }
        };
        izz2.dqb().a(isf.mwN, 12);
        izz2.dqb().st(true);
        izz2.dqb().b(isr.dqa(), 0, false);
        izz2.setText("" + this.mmc.mjm);
        return izz2;
    }

    private ipf dgH() {
        this.mmj = new iuy(this, this.mmc.mjt){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
                super(bl);
            }

            public void pn(boolean bl) {
                ini.a((ini)this.mmm).mjt = bl;
            }
        };
        return this.mmj;
    }

    private ipf dgI() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(new ist(isf.mwO, 18, 12357465, lxc.tny.bD(new Object[0])));
        ipx2.W(this.dgJ());
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(ipx.a(256, 128, this.dgL()));
        return ipx2;
    }

    private ipf dgJ() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.d(ipx.a(260, 24, this.dgK())));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(new iwi(this){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
            }

            public void cLq() {
                ini.h(this.mmm).setText("");
                ini.a(this.mmm, "");
            }
        }));
        ipx2.W(ipx.a(14, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dgK() {
        izu izu2;
        this.mmk = izu2 = new izu(this){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
            }

            public void od(String string) {
                super.od(string);
                ini.b(this.mmm, string);
            }
        };
        this.mmk.due().o(lxc.tnz.bD(new Object[0]));
        this.mmk.dqb().a(isf.mwN, 12);
        this.mmk.due().a(isf.mwN, 12);
        return izu2;
    }

    private ipf dgL() {
        this.mml = new izm();
        this.mml.dtS();
        this.p(this.mmc.mjn);
        return this.mml;
    }

    private ipf dfb() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(new iur(this){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
            }

            public void cLq() {
                ini.i(this.mmm);
                this.mmm.b(ini.a(this.mmm).ded());
            }
        }));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ivc(this){
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
            }

            public void cLq() {
                ini.j(this.mmm);
            }
        }));
        ipx2.W(ipx.a(5, 1, new ipf[0]));
        return ipx2;
    }

    private void oO(String string) {
        this.qH(string);
    }

    private void qH(String string) {
        this.mml.removeAllItems();
        if (string == null || string.isEmpty()) {
            return;
        }
        string = string.toLowerCase();
        lgw lgw2 = (lgw)lea.enX().eqq();
        lgw lgw3 = (lgw)lea.enX().g(lgw2);
        while (lgw3 != null) {
            this.a(lgw3, string);
            lgw3 = (lgw)lea.enX().h(lgw3);
        }
    }

    private void a(lgw lgw2, String string) {
        String string2 = lvm.sXa.bD(lgw2.getType()).exA().toLowerCase();
        if (string2.contains(string)) {
            this.a(lgw2, (inh)null);
        } else {
            lgw lgw3 = (lgw)lea.enX().g(lgw2);
            while (lgw3 != null) {
                this.a(lgw3, string);
                lgw3 = (lgw)lea.enX().h(lgw3);
            }
        }
    }

    private inh a(lgw lgw2, inh inh2) {
        inh inh3 = new inh(this, lgw2){
            final /* synthetic */ lgw mmn;
            final /* synthetic */ ini mmm;
            {
                this.mmm = ini2;
                this.mmn = lgw2;
            }

            public void cVa() {
                if (this.getSelected()) {
                    ini.a((ini)this.mmm).mjn.add(this.mmn.getType());
                } else {
                    ini.a((ini)this.mmm).mjn.remove(this.mmn.getType());
                }
            }
        };
        inh3.drd().o(lvm.sXa.bD(lgw2.getType()));
        if (inh2 != null) {
            inh2.b(inh3);
        } else {
            this.mml.c(inh3);
        }
        lgw lgw3 = (lgw)lea.enX().g(lgw2);
        while (lgw3 != null) {
            this.a(lgw3, inh3);
            lgw3 = (lgw)lea.enX().h(lgw3);
        }
        return inh3;
    }

    private void p(Set<Integer> set) {
        for (int n : set) {
            lgw lgw2 = (lgw)lea.enX().acv(n);
            this.a(lgw2, (inh)null).setSelected(true);
        }
    }

    static /* synthetic */ imi a(ini ini2) {
        return ini2.mmc;
    }

    static /* synthetic */ iuy b(ini ini2) {
        return ini2.mme;
    }

    static /* synthetic */ iuy c(ini ini2) {
        return ini2.mmf;
    }

    static /* synthetic */ iuy d(ini ini2) {
        return ini2.mmg;
    }

    static /* synthetic */ iuy e(ini ini2) {
        return ini2.mmh;
    }

    static /* synthetic */ iuy f(ini ini2) {
        return ini2.mmi;
    }

    static /* synthetic */ iuy g(ini ini2) {
        return ini2.mmj;
    }

    static /* synthetic */ izu h(ini ini2) {
        return ini2.mmk;
    }

    static /* synthetic */ void a(ini ini2, String string) {
        ini2.qH(string);
    }

    static /* synthetic */ void b(ini ini2, String string) {
        ini2.oO(string);
    }

    static /* synthetic */ void i(ini ini2) {
        ini2.cGR();
    }

    static /* synthetic */ void j(ini ini2) {
        ini2.cGR();
    }
}

