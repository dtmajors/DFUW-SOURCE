/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.Map;

public class ias
extends iho {
    private static final String lBY = "Expanded";
    private static final String lBZ = "NewChar";
    private boolean lBD;
    private Map<cfm, iat> lCa = lcn.emw();
    private Map<Integer, iau> lCb = lcn.emw();
    private int lCc = 0;
    private cfn lCd = null;
    private int lCe = 0;
    private boolean lCf = false;
    private boolean lCg = false;
    private boolean lCh = false;
    private boolean lCi = true;
    private ipx lCj;
    private ion lCk;
    private ipb lCl;
    private ist lCm;
    private izm lCn;
    private izz lCo;
    private ipb lCp;
    private ipx lCq;
    private ipx lCr;
    private ipb lCs;
    private ist lCt;
    private isn lCu;
    private iox lCv;
    private iox lCw;
    private ios lCx;
    private ist lCy;
    private ist lCz;
    private ios lCA;
    private ios lCB;

    public ias() {
        super("AdvisoryWindow", "J2FWindow.swf");
        this.OQ(jnz.nGe | jnz.nGi);
        this.R(150.0f, 100.0f);
        this.setResizable(false);
        this.a(lBY, hsu.ldh, (Boolean)this.lCf);
        this.a(lBZ, hsu.ldh, (Boolean)true);
        hso.cxK().cxP().cyJ().cJp().euB.a((jlg<Integer, Boolean>)new jls<ias, Integer, Boolean>(this, this){
            final /* synthetic */ ias lCC;
            {
                this.lCC = ias2;
                super(ias3);
            }

            public void b(ias ias2, Integer n, Boolean bl) {
                ias.a(ias2, n, bl);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.b((ias)object, (Integer)object2, (Boolean)object3);
            }
        });
    }

    @Override
    public boolean isOpen() {
        return this.lBD;
    }

    public void setOpen(boolean bl) {
        if (bl == this.lBD) {
            return;
        }
        this.lBD = bl;
        this.setVisible(bl);
        if (bl) {
            this.cqF();
            this.cFc();
        }
    }

    public void Pu(int n) {
        ias.cyJ().cHw().a(hyc.lmV, true);
        this.Px(n);
    }

    public void cyi() {
        super.cyi();
        this.lCf = this.nk(lBY);
        this.lCg = true;
        this.cLp();
    }

    public void cyj() {
        super.cyj();
        this.lCf = this.nk(lBY);
        this.lCg = true;
        this.cLp();
    }

    public void py(boolean bl) {
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.p(17, 0, 17, 17);
        this.cKJ();
        this.cXE().a(irl.dnr());
        this.cXE().W(this.cGT());
        this.cXE().W(this.cGU());
        this.pack();
    }

    @Override
    protected void cGo() {
        super.cGo();
        this.ql(true);
    }

    @Override
    protected ios cGS() {
        return null;
    }

    @Override
    protected void cKg() {
        super.cKg();
        this.lCh = true;
        this.cLp();
    }

    @Override
    protected void cGR() {
        ias.cyJ().cHw().a(hyc.lmV, false);
    }

    private void cKJ() {
        this.f(new ipb("/dfdata/texture/gui/j2f/advisory/title_header_advisory.png"));
        this.cXM().a(this.cKK(), 0);
    }

    private ioo cKK() {
        iwj iwj2 = new iwj(this){
            final /* synthetic */ ias lCC;
            {
                this.lCC = ias2;
            }

            public void pn(boolean bl) {
                ias.a(this.lCC, bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lvo.sXS.bD(new Object[0]).exA());
            }
        };
        this.lCk = iwj2;
        return iwj2;
    }

    private ipf cGT() {
        this.lCl = new ipb(this, this.lCf ? "/dfdata/texture/gui/j2f/advisory/backgrounds/advisory_background_expanded.png" : "/dfdata/texture/gui/j2f/advisory/backgrounds/advisory_background_collapsed.png"){
            final /* synthetic */ ias lCC;
            {
                this.lCC = ias2;
                super(string);
            }

            public void kh(float f) {
                this.hz(f);
            }
        };
        return ipx.a(this.cXH(), this.cXI(), this.dhN(), this.dhO(), this.lCl);
    }

    private ipf cGU() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(this.cKL());
        ipx2.W(this.cKS());
        return ipx2;
    }

    private ipf cKL() {
        this.lCj = ipx.l(ipx.a(4, 1, new ipf[0]), this.cKM());
        this.lCj.setVisible(false);
        return this.lCj;
    }

    private ipf cKM() {
        ipx ipx2 = ipx.a(193, 185, new ipf[0]);
        ipx2.W(this.cKN());
        return ipx2;
    }

    private ipf cKN() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(this.cKO());
        ipx2.W(ipx.c(this.cKV()));
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 193, 1)));
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(this.cKP());
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        return ipx2;
    }

    private ipf cKO() {
        this.lCm = new ist(isf.mwN, 12, 0x525252);
        this.lCm.setVisible(false);
        return this.lCm;
    }

    private ipf cKP() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.c(this.cKQ()));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cKR()));
        return ipx2;
    }

    private ipf cKQ() {
        izw izw2 = new izw(this){
            final /* synthetic */ ias lCC;
            {
                this.lCC = ias2;
            }

            public void od(String string) {
                super.od(string);
                ias.a(this.lCC, string);
            }
        };
        this.lCo = izw2;
        izw2.dqb().a(isf.mwN, 12);
        ist ist2 = new ist();
        ist2.a(isf.mwN, 12);
        ist2.ST(0x8B8B8B);
        ist2.o(lvo.sXQ.bD(new Object[0]));
        ipx ipx2 = ipx.l(ipx.a(3, 1, new ipf[0]), ipx.d(ipx.j(ist2, ipx.a(1, 1, new ipf[0]))), ipx.a(50, 1, new ipf[0]));
        izw2.al(ipx2);
        ((iqa)izw2.dip()).b("/dfdata/texture/gui/j2f/common/textfields/text_field_03.png", 4, 4, 4, 4);
        return izw2;
    }

    private ipf cKR() {
        iwi iwi2 = new iwi(this){
            final /* synthetic */ ias lCC;
            {
                this.lCC = ias2;
            }

            public void cLq() {
                ias.a(this.lCC);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lvo.sXT.bD(new Object[0]).exA());
            }
        };
        return iwi2;
    }

    private ipf cKS() {
        ipx ipx2 = ipx.a(432, 193, new ipf[0]);
        ipx2.W(this.cKT());
        ipx2.W(this.cKU());
        return ipx2;
    }

    private ipf cKT() {
        this.lCp = new ipb(this, "/dfdata/texture/gui/j2f/advisory/backgrounds/advisory_background_empty_page.png"){
            final /* synthetic */ ias lCC;
            {
                this.lCC = ias2;
                super(string);
            }

            public void kh(float f) {
                this.hz(f);
            }
        };
        this.lCp.rg(false);
        return this.lCp;
    }

    private ipf cKU() {
        ipx ipx2;
        this.lCq = ipx2 = ipx.l(new ipf[0]);
        this.lCq.setVisible(false);
        this.lCq.rg(false);
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cKX()));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(this.cKZ());
        return ipx2;
    }

    private ipf cKV() {
        this.lCn = new izm();
        this.lCn.dtS();
        this.lCn.Td(4);
        this.cKW();
        return this.lCn;
    }

    private void cKW() {
        for (cfm cfm2 : cfj.euw) {
            iat iat2 = new iat(cfm2);
            this.lCa.put(cfm2, iat2);
            this.lCn.c(iat2);
            boolean bl = false;
            for (int n : cfm2.aNw()) {
                iau iau2 = this.Pv(n);
                this.lCb.put(n, iau2);
                iat2.b(iau2);
                if (!ias.cyJ().cJp().aNs().contains(n)) continue;
                iau2.cKG();
                bl = true;
            }
            if (!bl) continue;
            iat2.cKG();
        }
    }

    private iau Pv(int n) {
        return new iau(this, n, n){
            final /* synthetic */ int lCD;
            final /* synthetic */ ias lCC;
            {
                this.lCC = ias2;
                this.lCD = n2;
                super(n);
            }

            public boolean du(int n, int n2) {
                if (super.du(n, n2)) {
                    return true;
                }
                ias.a(this.lCC, this.lCD);
                return false;
            }
        };
    }

    private ipf cKX() {
        ipx ipx2;
        this.lCr = ipx2 = ipx.h(new ipf[0]);
        ipx2.W(new ipt(0x313131));
        ipx2.W(ipx.a(173, 190, this.cKY()));
        return ipx2;
    }

    private ipf cKY() {
        this.lCs = new ipb(this){
            final /* synthetic */ ias lCC;
            {
                this.lCC = ias2;
            }

            public void kh(float f) {
                this.hz(Math.max(f, 0.25f));
            }
        };
        return this.lCs;
    }

    private ipf cKZ() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 2, new ipf[0]));
        ipx2.W(ipx.d(this.cLa()));
        ipx2.W(ipx.a(166, 144, ipx.h(this.cLb())));
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(new ipk(0x313131, 252, 1));
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(this.cLc());
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        return ipx2;
    }

    private ipf cLa() {
        this.lCt = new ist(isf.mwO, 14, 12357465);
        return this.lCt;
    }

    private ipf cLb() {
        this.lCu = new isn(isf.mwN, 12, 0xABABAB, null);
        return this.lCu;
    }

    private ipf cLc() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(174, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cLe()));
        ipx2.W(ipx.d(this.cLf()));
        ipx2.W(ipx.d(this.cLg()));
        ipx2.W(ipx.d(this.cLh()));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(new ipk(0x313131, 1, 19)));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(this.cLi()));
        return ipx2;
    }

    private ipf cLd() {
        this.lCw = new ion(this, "/dfdata/texture/gui/j2f/advisory/button_narration/button_narration_off_disabled.png", "/dfdata/texture/gui/j2f/advisory/button_narration/button_narration_off_normal.png", "/dfdata/texture/gui/j2f/advisory/button_narration/button_narration_off_hover.png", "/dfdata/texture/gui/j2f/advisory/button_narration/button_narration_off_pushing.png", "/dfdata/texture/gui/j2f/advisory/button_narration/button_narration_on_disabled.png", "/dfdata/texture/gui/j2f/advisory/button_narration/button_narration_on_normal.png", "/dfdata/texture/gui/j2f/advisory/button_narration/button_narration_on_hover.png", "/dfdata/texture/gui/j2f/advisory/button_narration/button_narration_on_pushing.png"){
            final /* synthetic */ ias lCC;
            {
                this.lCC = ias2;
                super(string, string2, string3, string4, string5, string6, string7, string8);
            }

            public void pn(boolean bl) {
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lvo.sXV.bD(new Object[0]).exA());
            }
        };
        return this.lCw;
    }

    private ipf cLe() {
        this.lCx = new iok(this, "/dfdata/texture/gui/j2f/advisory/button_page_previous/button_page_previous_disabled.png", "/dfdata/texture/gui/j2f/advisory/button_page_previous/button_page_previous_normal.png", "/dfdata/texture/gui/j2f/advisory/button_page_previous/button_page_previous_hover.png", "/dfdata/texture/gui/j2f/advisory/button_page_previous/button_page_previous_pushing.png"){
            final /* synthetic */ ias lCC;
            {
                this.lCC = ias2;
                super(string, string2, string3, string4);
            }

            public void cLq() {
                ias.b(this.lCC);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lvo.sXW.bD(new Object[0]).exA());
            }
        };
        return this.lCx;
    }

    private ipf cLf() {
        this.lCy = new ist(isf.mwN, 13, 0xABABAB);
        return this.lCy;
    }

    private ipf cLg() {
        this.lCz = new ist(isf.mwN, 13, 12357465);
        return this.lCz;
    }

    private ipf cLh() {
        this.lCA = new iok(this, "/dfdata/texture/gui/j2f/advisory/button_page_next/button_page_next_disabled.png", "/dfdata/texture/gui/j2f/advisory/button_page_next/button_page_next_normal.png", "/dfdata/texture/gui/j2f/advisory/button_page_next/button_page_next_hover.png", "/dfdata/texture/gui/j2f/advisory/button_page_next/button_page_next_pushing.png"){
            final /* synthetic */ ias lCC;
            {
                this.lCC = ias2;
                super(string, string2, string3, string4);
            }

            public void cLq() {
                ias.c(this.lCC);
            }

            public hyn dd(int n, int n2) {
                ioc ioc2 = this.eo(n, n2);
                return iae.k(lvo.sXX.bD(new Object[0]).exA(), ioc2.cf, ioc2.cg);
            }
        };
        return this.lCA;
    }

    private ipf cLi() {
        this.lCB = new iok(this, "/dfdata/texture/gui/j2f/advisory/button_next_entry/button_next_entry_disabled.png", "/dfdata/texture/gui/j2f/advisory/button_next_entry/button_next_entry_normal.png", "/dfdata/texture/gui/j2f/advisory/button_next_entry/button_next_entry_hover.png", "/dfdata/texture/gui/j2f/advisory/button_next_entry/button_next_entry_pushing.png"){
            final /* synthetic */ ias lCC;
            {
                this.lCC = ias2;
                super(string, string2, string3, string4);
            }

            public void cLq() {
                ias.d(this.lCC);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lvo.sXY.bD(new Object[0]).exA());
            }
        };
        return this.lCB;
    }

    private void pz(boolean bl) {
        this.lCf = bl;
        this.q(lBY, this.lCf);
        this.lCl.qP(bl ? "/dfdata/texture/gui/j2f/advisory/backgrounds/advisory_background_expanded.png" : "/dfdata/texture/gui/j2f/advisory/backgrounds/advisory_background_collapsed.png");
        this.lCj.setVisible(bl);
        this.lCk.hX(bl);
        this.pack();
    }

    private void cLj() {
        String string = this.lCo.dqb().getText();
        this.lCn.removeAllItems();
        if (string != null && !string.isEmpty()) {
            int n = 0;
            string = string.toLowerCase();
            for (Map.Entry<Integer, cfn> entry : cfj.euv.entrySet()) {
                String string2 = entry.getValue().aNA().exA().toLowerCase();
                if (!string2.contains(string)) continue;
                this.lCn.c(this.Pv(entry.getKey()));
                ++n;
            }
            this.lCm.setVisible(true);
            this.lCm.setText(lvo.sXR.bD(n).exA());
        } else {
            this.lCm.setVisible(false);
            this.cKW();
        }
    }

    private void oO(String string) {
        this.cLj();
    }

    private void cLk() {
        this.lCo.setText("");
        this.cLj();
    }

    private void Pw(int n) {
        ias.cyJ().cJo().Pt(n);
        iau iau2 = this.lCb.get(n);
        iau2.cKH();
        iat iat2 = (iat)iau2.dqR();
        if (iat2 != null) {
            boolean bl = true;
            for (int j = 0; j < iat2.dqT(); ++j) {
                iau iau3 = (iau)iat2.SW(j);
                if (iau3 == null || !iau3.cKI()) continue;
                bl = false;
            }
            if (bl) {
                iat2.cKH();
            }
        }
    }

    private void Px(int n) {
        this.a(n, cfj.euv.get(n));
    }

    private void a(int n, cfn cfn2) {
        this.lCc = n;
        this.lCd = cfn2;
        this.lCz.setText("/" + this.lCd.aNz().size());
        this.Py(0);
        this.cLl();
    }

    private void cLl() {
        if (this.lCB != null) {
            this.lCB.rF(ias.cyJ().cJp().aNs() != null && !ias.cyJ().cJp().aNs().isEmpty());
        }
    }

    private void Py(int n) {
        this.lCe = n;
        cfo cfo2 = this.lCd.aNz().get(n);
        cfp[] cfpArray = cfo2.aNB();
        cfq cfq2 = this.b(cfpArray);
        if (cfq2 != null) {
            this.lCr.setVisible(true);
            this.lCs.qP("/dfdata/" + cfq2.aNC());
        } else {
            this.lCr.setVisible(false);
        }
        cfr cfr2 = this.c(cfpArray);
        if (cfr2 != null) {
            this.lCt.setVisible(true);
            this.lCu.setVisible(true);
            this.lCt.o(this.lCd.aNA());
            this.lCu.o(cfr2.aND());
        } else {
            this.lCt.setVisible(false);
            this.lCu.setVisible(false);
        }
        this.lCy.setText("" + (this.lCe + 1));
        this.lCy.Rk(n == this.lCd.aNz().size() - 1 ? 12357465 : 0xABABAB);
        this.lCx.rF(this.lCe > 0);
        this.lCA.rF(this.lCe < this.lCd.aNz().size() - 1);
        this.lCp.setVisible(false);
        this.lCq.setVisible(true);
        this.pack();
    }

    private void cLm() {
        if (this.lCe > 0) {
            this.Py(this.lCe - 1);
        }
    }

    private void cLn() {
        if (this.lCe < this.lCd.aNz().size() - 1) {
            this.Py(this.lCe + 1);
        }
    }

    private void cLo() {
        ias.cyJ().cJo().cKF();
    }

    private cfq b(cfp[] cfpArray) {
        if (cfpArray != null) {
            for (cfp cfp2 : cfpArray) {
                if (!(cfp2 instanceof cfq)) continue;
                return (cfq)cfp2;
            }
        }
        return null;
    }

    private cfr c(cfp[] cfpArray) {
        if (cfpArray != null) {
            for (cfp cfp2 : cfpArray) {
                if (!(cfp2 instanceof cfr)) continue;
                return (cfr)cfp2;
            }
        }
        return null;
    }

    private void a(Integer n, Boolean bl) {
        if (!bl.booleanValue()) {
            this.cLl();
            iau iau2 = this.lCb.get(n);
            if (iau2 != null) {
                iau2.aTg();
                iau2.cKG();
                iat iat2 = (iat)iau2.dqR();
                if (iat2 != null) {
                    iat2.cKG();
                }
            }
        }
    }

    private void cLp() {
        if (this.lCh && this.lCg && this.lCi) {
            this.lCi = false;
            this.pack();
            this.pz(this.lCf);
            if (this.nk(lBZ).booleanValue()) {
                this.q(lBZ, false);
                hso.cxK().a(jnz.nFI);
                ias.cyJ().cHw().a(hyc.lmV, true);
                ias.cyJ().cJo().Pt(31);
                this.qU(true);
                this.qV(true);
                this.lCA.d(5, 6, 10.0);
                ias.cyJ().cHw().a(hyc.lmX, false);
                ias.cyJ().cHw().a(hyc.lnc, false);
            }
        }
    }

    static /* synthetic */ void a(ias ias2, Integer n, Boolean bl) {
        ias2.a(n, bl);
    }

    static /* synthetic */ void a(ias ias2, boolean bl) {
        ias2.pz(bl);
    }

    static /* synthetic */ void a(ias ias2, String string) {
        ias2.oO(string);
    }

    static /* synthetic */ void a(ias ias2) {
        ias2.cLk();
    }

    static /* synthetic */ void a(ias ias2, int n) {
        ias2.Pw(n);
    }

    static /* synthetic */ void b(ias ias2) {
        ias2.cLm();
    }

    static /* synthetic */ void c(ias ias2) {
        ias2.cLn();
    }

    static /* synthetic */ void d(ias ias2) {
        ias2.cLo();
    }
}

