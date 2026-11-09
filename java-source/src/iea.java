/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cim
 *  cug
 */
public class iea
extends ioa
implements htc {
    private static final int lLA = 0x333333;
    private static final float lLB = 0.3f;
    private static final String lLC = "BackgroundBitmap";
    private static final String lLD = "ClanNameChangeIcon";
    private static final int lLE = 10881803;
    private static final int lLF = 14;
    private static final int lLG = 12357465;
    private static final int lLH = 14;
    private static final int lLI = 0x424242;
    private static final int lLJ = 15;
    private ipx lLK = null;
    private ipk lLL = null;
    private ipb lLM = null;
    private jaa lLN = null;
    private ipb lLO = null;
    private ist lLP = null;
    private izz lLQ = null;
    private iso lLR = null;
    private ios lLS = null;
    private ios lLT = null;
    private hyq lpI = null;
    private String itp = "";
    private String ito = "";
    private boolean lLU = false;

    public iea(hyq hyq2) {
        super("ClanNameChangeWindow", "clannamechange.swf");
        this.lpI = hyq2;
        this.a(hya.lmp, true);
        this.OQ(jnz.nGi);
        this.a(hyb.lmC);
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().czb() != null) {
            hso.cxK().cxP().czb().a(this);
        }
    }

    public void closeWindow() {
        if (this.lLU) {
            return;
        }
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().czb() != null) {
            hso.cxK().cxP().czb().b(this);
        }
        if (this.lpI != null) {
            this.lpI.s(this);
        }
    }

    @Override
    protected void cCu() {
        super.cCu();
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().czb() != null) {
            this.ito = hso.cxK().cxP().czb().acl();
        }
        if (this.ito == null || this.ito.isEmpty()) {
            this.ito = "";
        }
        this.lLL = new ipk(0x333333);
        this.lLL.hz(0.3f);
        this.lLK = new e(this, null);
        this.lLK.W(this.lLL);
        this.dhJ().W(this.lLK);
        this.lLM = new ipb(lLC);
        this.dhJ().W(this.lLM);
        this.lLN = new jaa(lwj.sXP.bD(cug.fui));
        this.lLN.a(isu.mxP);
        this.dhJ().W(this.lLN);
        this.lLO = new ipb(lLD);
        this.dhJ().W(this.lLO);
        this.lLP = new ist(lwj.teh.bD(new Object[0]));
        this.lLP.a(isu.mxQ);
        this.lLP.Rk(12357465);
        this.lLP.a(isf.mwO, 14);
        this.dhJ().W(this.lLP);
        this.lLQ = new c(this, null);
        this.lLQ.st(true);
        this.lLQ.setText(this.ito);
        this.lLQ.dqb().Rk(0x424242);
        this.lLQ.dqb().a(isf.mwN, 15);
        this.dhJ().W(this.lLQ);
        this.lLR = new iso();
        this.lLR.Rk(10881803);
        this.lLR.a(isf.mwN, 14);
        this.dhJ().W(this.lLR);
        this.lLS = new b(this, null);
        this.dhJ().W(this.lLS);
        this.lLT = new a(this, null);
        this.lLT.rF(false);
        this.dhJ().W(this.lLT);
        this.T(hso.cxK().cxY().W, hso.cxK().cxY().H);
    }

    @Override
    protected void cuf() {
        super.cCw();
        int n = (int)this.getWidth();
        int n2 = (int)this.getHeight();
        this.lLK.r(0, 0, n, n2);
        this.lLL.r(0, 0, n, n2);
        this.lLM.ek(n / 2 - this.lLM.getWidth() / 2, n2 / 2 - this.lLM.getHeight() / 2);
        this.lLN.r(this.lLM.getX() + 37, this.lLM.getY() - 2, 100, 24);
        this.lLO.ek(this.lLM.getX() + 45, this.lLM.getY() + 57);
        this.lLP.r(this.lLO.getX() + this.lLO.getWidth() + 15, this.lLO.getY() + this.lLO.getHeight() / 2 - 12, 100, 24);
        this.lLQ.r(this.lLP.getX() + this.lLP.getWidth() + 15, this.lLP.getY() + 1, 160, 22);
        this.lLR.r(this.lLP.getX(), this.lLP.getY() + this.lLP.getHeight() + 5, this.lLQ.getX() + this.lLQ.getWidth() - this.lLP.getX(), 48);
        this.lLT.ek(this.lLM.getX() + 353, this.lLM.getY() + 155);
        this.lLS.ek(this.lLM.getX() + 383, this.lLM.getY() + 155);
        this.R(0.0f, 0.0f);
    }

    private void cPb() {
        if (this.lLU) {
            return;
        }
        hzr hzr2 = new hzr();
        hzr2.oq("SFYesNoDialogSelentine");
        hzr2.pu(false);
        hzr2.setVisible(true);
        hzr2.setGUID(this.MessageDelegator.bzv());
        hzr2.G(lxz.tBG.bD((int)(cim.aPj() / 86400.0), cug.fui).exA(), lxz.tBM.bD(new Object[0]).exA());
        hzr2.a(new d(this, null));
        this.MessageDelegator.a((amf)((Object)hzr2));
    }

    private void cPc() {
        boolean bl = false;
        this.itp = this.lLQ.getText();
        if (this.itp == null) {
            this.itp = "";
        }
        this.itp = this.itp.replace("&quot;", "\"");
        this.itp = this.itp.replace("&amp;", "&");
        this.itp = this.itp.replace("&apos;", "'");
        this.itp = this.itp.replace("&lt;", "<");
        this.itp = this.itp.replace("&gt;", ">");
        if (this.itp.length() >= 3) {
            if (this.ito.compareToIgnoreCase(this.itp) != 0) {
                ayi.c c2 = ayi.eQ(this.itp);
                switch (c2) {
                    case cyX: {
                        this.lLR.setText("");
                        bl = true;
                        break;
                    }
                    case cyR: {
                        this.lLR.o(c2.aaO().YF().bD(3));
                        break;
                    }
                    case cyS: {
                        this.lLR.o(c2.aaO().YF().bD(ayi.aaK()));
                        break;
                    }
                    default: {
                        this.lLR.o(c2.aaO().YF().bD(new Object[0]));
                        break;
                    }
                }
            } else {
                this.lLR.setText("");
            }
        }
        this.lLT.rF(bl);
    }

    public void a(cin cin2) {
        this.lLU = false;
        switch (cin2) {
            case eCf: {
                this.lLR.o(mbi.ujD.bD(new Object[0]));
                break;
            }
            case eCe: {
                this.lLR.o(mbi.tYU.bD(this.itp));
                break;
            }
            case eCo: {
                this.lLR.o(mbi.ubr.bD(new Object[0]));
                break;
            }
            case eCg: {
                this.lLR.o(mbi.ujA.bD(new Object[0]));
                break;
            }
            case eCp: {
                this.lLR.o(mcr.uyj.bD(new Object[0]));
                break;
            }
            case eCm: {
                this.closeWindow();
                break;
            }
            default: {
                this.lLR.o(mbi.rXy.bD(new Object[0]));
            }
        }
    }

    @Override
    public void oj() {
    }

    @Override
    public void oi() {
        this.closeWindow();
    }

    @Override
    public void cyu() {
        this.closeWindow();
    }

    @Override
    public void cyv() {
    }

    @Override
    public void cyw() {
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().czb() != null) {
            this.ito = hso.cxK().cxP().czb().acl();
        }
        if (this.ito == null || this.ito.isEmpty()) {
            this.ito = "";
        }
        this.cPc();
    }

    private void cPd() {
        ghg ghg2 = (ghg)this.MessageDelegator.h(32513, this.GUID, hso.cxK().bAn().gYX);
        ghg2.cZn = cio.eCL.ordinal();
        ghg2.SkillType = -1;
        ghg2.jht = true;
        ghg2.ResourceType = -1;
        ghg2.YL = this.itp;
        this.MessageDelegator.E(ghg2);
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 32514: {
                this.a((ghh)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(ghh ghh2) {
        this.a(cin.getValueByOrdinal(ghh2.ew));
    }

    static /* synthetic */ ipb a(iea iea2) {
        return iea2.lLM;
    }

    static /* synthetic */ void b(iea iea2) {
        iea2.cPc();
    }

    static /* synthetic */ void c(iea iea2) {
        iea2.cPb();
    }

    static /* synthetic */ void d(iea iea2) {
        iea2.cPd();
    }
}

