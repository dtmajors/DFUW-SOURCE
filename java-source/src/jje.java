/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class jje
extends ihs {
    private final a njD;
    private static final int lpw = 0x313131;
    private static final int njE = 12357465;
    private static final int njF = 0xABABAB;
    private static final int njG = 16;
    private static final int njH = 14;
    private static final int nbU = 431;
    private static final int nbV = 300;
    private static final String nbW = "WindowHeaderIcon";
    private static final String njI = "WindowHeaderLevyRequisitioning";
    private static final int njJ = 77;
    private static final int njK = 0;
    private static final String njL = "WindowHeaderBackgroundBitmap";
    private static final int nbX = 360;
    private static final int nbY = 28;
    private static final String njM = "WindowHeaderActionMode";
    private static final String lLC = "BackgroundBitmap";
    private static final String njN = "IconClan";
    private static final String njO = "IconVillage";
    private static final String njP = "IconHolding";
    private static final int njQ = 312;
    private static final int njR = 1;
    private static final int njS = 1;
    private static final int njT = 18;
    private static final int njU = 130;
    private static final int njV = 180;
    private static final int njW = 24;
    private static final int njX = 301;
    private static final int njY = 31;
    private static final int lpt = 2;
    private static final int lpv = 29;
    private static final int lpu = 3;
    private static final double lps = 2.0;
    private static final int ncc = 0;
    private static final int ncd = 10;
    private static final int ncf = 70;
    private static final int njZ = 25;
    private static final int nka = -7;
    private static final int nkb = 48;
    private static final int nkc = 48;
    private static final int nkd = 1;
    private static final int nke = 38;
    private static final int nkf = 0;
    private static final int nkg = 7;
    private static final int nkh = 1;
    private static final int nki = 70;
    private static final int nkj = 70;
    private static final int nkk = 80;
    private static final int nkl = 110;
    private static final int nkm = 25;
    private static final int nkn = 200;
    private static final int nko = 162;
    private static final int nkp = 2;
    private static final int nkq = 2;
    private static final int nkr = 190;
    private static final int nks = 4;
    private static final int nkt = 75;
    private static final int nku = 6;
    private ipb nkv = null;
    private ipb lLM = null;
    private ipb nkw = null;
    private ipb nkx = null;
    private ist nky = null;
    private ist nkz = null;
    private ist nkA = null;
    private ist nkB = null;
    private ipk nkC = null;
    private ipk nkD = null;
    private ipk nkE = null;
    private irr ljc = null;
    private ist nkF = null;
    private hyq lpI = null;
    private String nkG = null;
    private String nkH = null;
    private int nkI = 0;
    private int nkJ = 0;
    private int nkK = 0;
    private boolean nkL = false;
    private boolean nkM = false;

    public jje(hyq hyq2, a a2) {
        super("VillageRequisitioningWindow", "villagerequisitioningwindow.swf");
        this.OQ(-1);
        this.U(431.0f, 300.0f);
        this.qW(true);
        this.qX(true);
        this.ql(true);
        this.lpI = hyq2;
        this.njD = a2;
    }

    public void closeWindow() {
        if (this.lpI != null) {
            this.lpI.s(this);
        }
    }

    public void dIL() {
        this.nkG = null;
        this.nkH = null;
        this.setProgress(0, 0, 100);
    }

    public void sv(String string) {
        this.nkG = string;
        if (this.nkz != null) {
            switch (this.njD) {
                case nkO: {
                    this.nkz.setText(lvm.sWZ.bD(string).exA());
                    break;
                }
                case nkP: {
                    this.nkz.setText(lvm.sWY.bD(string).exA());
                }
            }
        }
    }

    public void cy(String string) {
        this.nkH = string;
        if (this.nkB != null) {
            this.nkB.setText(this.nkH);
        }
    }

    public void tX(boolean bl) {
        this.nkL = bl;
        if (this.ljc != null) {
            this.ljc.OI(bl ? 0 : 1);
        }
    }

    public void setProgress(int n, int n2, int n3) {
        this.nkK = n;
        this.nkI = n2;
        this.nkJ = n3;
        if (this.ljc != null) {
            this.ljc.setProgress(n, n2, n3);
        }
        if (this.nkF != null) {
            int n4 = n * 100 / n3;
            this.nkF.setText(n4 + "%");
        }
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.nkv = new ipb(njM);
        this.lLM = new ipb(lLC);
        this.nkw = new ipb(njN);
        lox lox2 = null;
        String string = null;
        switch (this.njD) {
            case nkP: {
                this.nkx = new ipb(njP);
                lox2 = lza.tNf;
                string = this.nkG == null ? "[Village Name]" : lvm.sWY.bD(this.nkG).exA();
                break;
            }
            default: {
                this.nkx = new ipb(njO);
                lox2 = lza.tNe;
                string = this.nkG == null ? "[Village Name]" : lvm.sWZ.bD(this.nkG).exA();
            }
        }
        this.nky = new ist(lox2);
        this.nky.Rk(12357465);
        this.nky.a(isu.mxQ);
        this.nky.a(isf.mwO, 16);
        this.nkz = new ist(string);
        this.nkz.Rk(0xABABAB);
        this.nkz.a(isu.mxP);
        this.nkz.a(isf.mwO, 14);
        this.nkA = new ist(lza.tNd);
        this.nkA.Rk(12357465);
        this.nkA.a(isu.mxQ);
        this.nkA.a(isf.mwO, 16);
        this.nkB = new ist(this.nkH == null ? "[Clan Name]" : this.nkH);
        this.nkB.Rk(0xABABAB);
        this.nkB.a(isu.mxP);
        this.nkB.a(isf.mwO, 14);
        this.nkC = new ipk();
        this.nkC.setColor(0x313131);
        this.nkC.a((iqz)null);
        this.nkD = new ipk();
        this.nkD.setColor(0x313131);
        this.nkD.a((iqz)null);
        this.nkE = new ipk();
        this.nkE.setColor(0x313131);
        this.nkE.a((iqz)null);
        irs irs2 = new irs();
        irs2.Sn(2);
        irs2.se(true);
        irs2.sg(true);
        irs2.sf(true);
        irs2.ds(2.0);
        irs2.So(3);
        irs2.Sr(29);
        this.ljc = new irr(irs2);
        this.nkF = new ist(this.nkK + "%");
        this.nkF.Rk(12357465);
        this.nkF.a(isu.mxR);
        this.nkF.a(isf.mwO, 16);
        if (this.nkK > 0 || this.nkI > 0 || this.nkJ > 0) {
            this.ljc.setProgress(this.nkK, this.nkI, this.nkJ);
            this.ljc.OI(this.nkL ? 0 : 1);
        }
        this.cXE().a((iqz)null);
        this.cXE().W(this.nkv);
        this.cXE().W(this.lLM);
        this.cXE().W(this.ljc);
        this.cXE().W(this.nkF);
        this.cXE().W(this.nkC);
        this.cXE().W(this.nky);
        this.cXE().W(this.nkx);
        this.cXE().W(this.nkD);
        this.cXE().W(this.nkz);
        this.cXE().W(this.nkA);
        this.cXE().W(this.nkw);
        this.cXE().W(this.nkE);
        this.cXE().W(this.nkB);
        loz loz2 = null;
        switch (this.njD) {
            case nkO: {
                loz2 = lza.sXP.bD(new Object[0]);
                this.a(new ipb(nbW), 22, 0, 55, loz2);
                break;
            }
            case nkP: {
                loz2 = lza.tNc.bD(cug.fpz);
                this.a(new ipb(njI), 0, 0, 43, loz2);
            }
        }
    }

    @Override
    public void cds() {
        super.cds();
        if (this.nkv != null) {
            this.nkv.setVisible(!this.cXM().djL());
        }
        this.QT(0);
        this.Rz(30);
        this.RA(70);
    }

    @Override
    protected void cuf() {
        super.cuf();
        if (this.nkM) {
            return;
        }
        this.nkv.ek(38, 0);
        this.lLM.ek(7, 1);
        this.nkF.r(75, 46, 301, 24);
        this.ljc.ek(7 + (this.lLM.dju() / 2 - this.ljc.getWidth() / 2), 6);
        this.nkC.r(70, 70, 312, 1);
        this.nky.r(25, 80, 130, 24);
        this.nkA.r(25, 110, 130, 24);
        this.nkx.ek(162, 82);
        this.nkw.ek(162, 112);
        this.nkD.r(190, 84, 1, 18);
        this.nkE.r(190, 114, 1, 18);
        this.nkz.r(200, 82, 180, 24);
        this.nkB.r(200, 112, 180, 24);
        this.nkM = true;
    }

    @Override
    protected void ku(float f2) {
        super.ku(f2);
        if (this.nkv != null) {
            this.nkv.hz(f2);
        }
        if (this.lLM != null) {
            this.lLM.hz(f2);
        }
        if (this.nkC != null) {
            this.nkC.hz(f2);
        }
        if (this.nkD != null) {
            this.nkD.hz(f2);
        }
        if (this.nkE != null) {
            this.nkE.hz(f2);
        }
    }

    @Override
    protected ipq cGj() {
        return null;
    }

    @Override
    protected ios cGk() {
        return null;
    }

    public void cEk() {
        super.cEk();
        if (this.nkz != null && this.nkG != null) {
            switch (this.njD) {
                case nkP: {
                    this.nkz.setText(lvm.sWY.bD(this.nkG).exA());
                    break;
                }
                default: {
                    this.nkz.setText(lvm.sWZ.bD(this.nkG).exA());
                }
            }
        }
    }
}

