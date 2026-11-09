/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.List;
import java.util.Map;

public class iav
extends ihs {
    private static final double lCG = 1.0;
    private static final int lCH = 12357465;
    private static final int lCI = 10881803;
    private static final int lCJ = 0xABABAB;
    private final hyq lpI;
    private ist lCK;
    private ipx lCL;
    private iow lCM;
    private a lCN = null;
    private gon lCO;
    private boolean lpP = false;
    private Map<ldv, bsh> lCP;
    private List<dxq> lpQ = lcn.emv();

    public iav(hyq hyq2) {
        super("SummoningAltarWindow", "SummoningAltarWindow.swf");
        this.a(hya.lmp, true);
        this.OQ(-1);
        this.U(420.0f, 220.0f);
        this.cFN();
        this.lpI = hyq2;
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.cXE().a(irl.dnr());
        ipb ipb2 = new ipb("BackgroundBitmap");
        this.cXE().W(ipb2);
        this.lCK = new ist("Altar");
        ipx ipx2 = ipx.d(this.lCK);
        this.lCL = new ipx(iqo.dmT());
        ipx ipx3 = ipx.d(this.lCL);
        this.lCM = new icm(this, "Commence Ritual"){
            final /* synthetic */ iav lCQ;
            {
                this.lCQ = iav2;
                super(string);
            }

            public boolean dv(int n, int n2) {
                this.lCQ.cLs();
                return false;
            }
        };
        this.lCM.rF(false);
        ipx ipx4 = ipx.d(this.lCM);
        ipx ipx5 = ipx.j(ipx2, ipx3, ipx4);
        this.cXE().W(ipx5);
    }

    protected void cLs() {
        lfn.b(2, this.getClass().getSimpleName(), "handleCommenceRitualButtonClicked");
        if (this.lCN != null) {
            assert (this.lCN.lCS) : "commenceRitualButton is mouse enabled when player has no required materials for preset";
            if (!this.lCN.lCS) {
                lfn.b(5, this.getClass().getSimpleName(), "handleCommenceRitualButtonClicked commenceRitualButton is mouse enabled when player has no required materials for preset");
                return;
            }
            this.c(true, this.lCN.lCR.Name);
            this.closeWindow();
        } else assert (false) : "commenceRitualButton is mouse enabled when no preset is selected";
    }

    @Override
    protected void cuf() {
        super.cuf();
        if (this.lpP) {
            return;
        }
        this.lpP = true;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (!this.lpP) {
            return;
        }
        if (!this.lpQ.isEmpty()) {
            for (dxq dxq2 : this.lpQ) {
                this.receiveMessage(dxq2);
            }
            this.lpQ.clear();
        }
    }

    @Override
    protected ipq cGj() {
        return null;
    }

    public void receiveMessage(dxq dxq2) {
        if (!this.lpP) {
            this.lpQ.add(dxq2);
            return;
        }
        int n = dxq2.bEz();
        switch (n) {
            case 33540: {
                this.a((gon)dxq2);
                break;
            }
            default: {
                assert (false);
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gon gon2) {
        if (gon2.jog) {
            this.lCO = gon2;
            this.lCP = iav.cxP().cza().cCH().cCO();
            dls dls2 = lea.epP().get(this.lCO.gGQ);
            assert (dls2 != null) : "No altar " + this.lCO.gGQ;
            if (dls2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "No altar " + this.lCO.gGQ);
                this.c(false, "");
                this.closeWindow();
                return;
            }
            Map<String, dlt> map = dls2.gGS;
            assert (dls2.gGS != null && dls2.gGS.size() > 0) : "Altar '" + dls2.gGQ + "' has no presets";
            if (dls2.gGS == null || dls2.gGS.size() < 1) {
                lfn.b(5, this.getClass().getSimpleName(), "Altar '" + dls2.gGQ + "' has no presets");
                this.c(false, "");
                this.closeWindow();
                return;
            }
            if (this.lCK != null) {
                this.lCK.setText("Altar: " + dls2.gGQ);
            }
            if (this.lCL != null) {
                this.lCL.removeAllChildren();
                for (dlt dlt2 : dls2.gGS.values()) {
                    this.lCL.W(new a(this, dlt2));
                }
            }
            if (this.lCM != null) {
                this.lCM.rF(false);
            }
            this.pack();
        } else {
            this.c(false, "");
            this.closeWindow();
        }
    }

    public void closeWindow() {
        this.close();
    }

    @Override
    protected iox cGl() {
        return null;
    }

    private void c(boolean bl, String string) {
        ldv ldv2 = this.lCO.aO();
        ldv ldv3 = iav.cxP().cyJ().getGUID();
        goo goo2 = (goo)this.MessageDelegator.h(33541, ldv3, ldv2);
        goo2.jer = bl;
        goo2.joh = string;
        this.MessageDelegator.F(goo2);
    }

    @Override
    protected ios cGk() {
        return new ivc(this){
            final /* synthetic */ iav lCQ;
            {
                this.lCQ = iav2;
            }

            public void cLq() {
                iav.a(this.lCQ, false, "");
                this.lCQ.cGR();
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lzb.tNk.bD(new Object[0]).exA());
            }
        };
    }

    @Override
    protected void cGR() {
        if (this.lpI != null) {
            this.lpI.s(this);
        }
    }

    private void a(a a2) {
        lfn.b(2, this.getClass().getSimpleName(), "notifyPresetSelected: '" + a2.lCR.DisplayName + "'");
        this.lCN = a2;
        this.lCM.rF(a2.lCS);
    }

    static /* synthetic */ void a(iav iav2, boolean bl, String string) {
        iav2.c(bl, string);
    }

    static /* synthetic */ void a(iav iav2, a a2) {
        iav2.a(a2);
    }

    static /* synthetic */ Map a(iav iav2) {
        return iav2.lCP;
    }
}

