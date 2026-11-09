/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.List;

public class jbt
extends ihs {
    private static final String TC = "SFProwessMonolithWindow";
    private static final double lCG = 1.0;
    private static final int lCH = 12357465;
    private static final int lCI = 10881803;
    private static final int lCJ = 0xABABAB;
    private final hyq lpI;
    private ipb lLM;
    private ipb mPt;
    private ipb mPu;
    private ipb mPv;
    private ipb mPw;
    private ist mPx;
    private ist mPy;
    private ist mPz;
    private ist mPA;
    private ist mPB;
    private ist mPC;
    private ist mPD;
    private ljq Position;
    private ldv err;
    private int erv;
    private double erw;
    private double erx;
    private int ery;
    private boolean lpP = false;
    private List<dxq> lpQ = lcn.emv();
    private double abo = 0.0;
    private static final int mPE = 16;
    private static final int mPF = 2;
    private static final int mPG = 25;
    private static final int mPH = 150;
    private static final int mPI = 24;
    private static final int mPJ = 190;
    private static final int mPK = 210;
    private static final int mPL = 40;

    public jbt(hyq hyq2) {
        super("ProwessMonolithWindow", "ProwessMonolithWindow.swf");
        this.a(hya.lmp, true);
        this.OQ(-1);
        this.U(420.0f, 220.0f);
        this.qW(true);
        this.qX(true);
        this.ql(true);
        this.lpI = hyq2;
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.lLM = new ipb("BackgroundBitmap");
        this.mPt = new ipb("Cooldown");
        this.mPu = new ipb("Cooldown");
        this.mPv = new ipb("Player");
        int n = cmf.getTier(this.ery);
        this.mPw = new ipb("IconTier" + n);
        this.mPx = new ist();
        this.mPx.Rk(12357465);
        this.mPx.a(isu.mxR);
        this.mPx.a(isf.mwO, 16);
        this.mPy = new ist();
        this.mPy.Rk(12357465);
        this.mPy.a(isu.mxQ);
        this.mPy.a(isf.mwO, 16);
        this.mPy.setText(lxt.txz.bD(new Object[0]).exA());
        this.mPz = new ist();
        this.mPz.Rk(0xABABAB);
        this.mPz.a(isu.mxR);
        this.mPz.a(isf.mwO, 16);
        this.mPA = new ist();
        this.mPA.Rk(12357465);
        this.mPA.a(isu.mxQ);
        this.mPA.a(isf.mwO, 16);
        this.mPA.setText(lxt.txA.bD(new Object[0]).exA());
        this.mPB = new ist();
        this.mPB.Rk(0xABABAB);
        this.mPB.a(isu.mxR);
        this.mPB.a(isf.mwO, 16);
        this.mPC = new ist();
        this.mPC.Rk(12357465);
        this.mPC.a(isu.mxQ);
        this.mPC.a(isf.mwO, 16);
        this.mPC.setText(lxt.txB.bD(new Object[0]).exA());
        this.mPD = new ist();
        this.mPD.Rk(0xABABAB);
        this.mPD.a(isu.mxR);
        this.mPD.a(isf.mwO, 16);
        this.cXE().a((iqz)null);
        this.cXE().W(this.lLM);
        this.cXE().W(this.mPw);
        this.cXE().W(this.mPx);
        this.cXE().W(this.mPt);
        this.cXE().W(this.mPu);
        this.cXE().W(this.mPv);
        this.cXE().W(this.mPy);
        this.cXE().W(this.mPz);
        this.cXE().W(this.mPA);
        this.cXE().W(this.mPB);
        this.cXE().W(this.mPC);
        this.cXE().W(this.mPD);
        this.a(new ipb("Monolith"), 3, 0, 24, lvm.sXg.bD(new ljq(0.0f, 0.0f, 0.0f)));
        this.cEk();
    }

    @Override
    public void cds() {
        super.cds();
        this.QT(0);
        this.Rz(46);
        this.RA(20);
    }

    @Override
    protected void cuf() {
        super.cuf();
        if (this.lpP) {
            return;
        }
        this.lLM.RH(12);
        int n = 25;
        int n2 = 16;
        this.mPy.r(n, n2, 150, 24);
        this.mPu.ek(190, n2);
        this.mPz.r(210, n2 - 3, 40, 24);
        this.mPA.r(n, n2 += 24, 150, 24);
        this.mPt.ek(190, n2);
        this.mPB.r(210, n2 - 3, 40, 24);
        this.mPC.r(n, n2 += 24, 150, 24);
        this.mPv.ek(189, n2);
        this.mPD.r(210, n2 - 3, 40, 24);
        this.mPw.ek((int)(this.getWidth() - 160.0f), 5);
        this.mPx.r(this.mPw.getX() + 25, this.mPw.getY() + this.mPw.getHeight(), 40, 24);
        this.lpP = true;
        if (!this.lpQ.isEmpty()) {
            for (dxq dxq2 : this.lpQ) {
                this.receiveMessage(dxq2);
            }
            this.lpQ.clear();
        }
    }

    public void cEk() {
        if (this.cXM() != null && this.Position != null) {
            this.cXM().A(lvm.sXa.bD(cug.fso));
        }
    }

    private void a(gcj gcj2) {
        jpy jpy2;
        if (this.err != null) {
            lfn.b(5, TC, "handleMonolithRegisterMessage() Player is already registered with monolith : " + this.err);
            assert (false);
            return;
        }
        if (gcj2.bTt() <= 0 || gcj2.bTu() <= 0 || gcj2.bTw() < 0.0 || gcj2.bTv() < 0.0) {
            lfn.b(5, TC, "handleMonolithRegisterMessage() for monolith : " + gcj2.aO() + " RegisteredPlayer : " + gcj2.bTt() + " ProwessLimit : " + gcj2.bTu() + " BlastTimer : " + gcj2.bTw() + " RewardTimer : " + gcj2.bTv());
            assert (false);
            return;
        }
        this.Position = new ljq(0.0f, 0.0f, 0.0f);
        if (this.MessageDelegator.bzx() != null && this.MessageDelegator.bzx().bzt() != null && (jpy2 = (jpy)this.MessageDelegator.bzx().bzt().d(lcr.qBQ)) != null && jpy2.dQf() != null && jpy2.dQf().axF() != null && jpy2.dQf().axF().aAG() != null) {
            this.Position = jpy2.dQf().axF().aAG().av();
        }
        double d2 = this.MessageDelegator.arc().rgz;
        this.err = gcj2.aO();
        this.erv = gcj2.bTt();
        this.ery = gcj2.bTu();
        this.erw = gcj2.bTv();
        this.erx = gcj2.bTw();
        int n = cmf.getTier(this.ery);
        this.mPw.qP("IconTier" + n);
        if (n == 2) {
            this.mPx.setText(lxt.txG.bD(new Object[0]).exA());
        } else if (n == 3) {
            this.mPx.setText(lxt.txH.bD(new Object[0]).exA());
        } else {
            this.mPx.setText(lxt.txF.bD(new Object[0]).exA());
        }
        this.cXM().A(lvm.sXa.bD(cug.fso));
        this.mPD.setText(String.valueOf(this.erv));
    }

    private void b(gcp gcp2) {
        if (this.err == null) {
            lfn.b(5, TC, "handleMonolithUpdateRewardTimerMessage() Player is not registered with monolith : " + gcp2.aO());
            assert (false);
            return;
        }
        if (!this.err.equals(gcp2.aO())) {
            lfn.b(5, TC, "handleMonolithUpdateRewardTimerMessage() Player is not registered with monolith : " + gcp2.aO() + " but with monolith : " + this.err);
            assert (false);
            return;
        }
        this.erw = gcp2.bTv();
    }

    private void b(gcn gcn2) {
        if (this.err == null) {
            lfn.b(5, TC, "handleMonolithUpdateBlastTimerMessage() Player is not registered with monolith : " + gcn2.aO());
            assert (false);
            return;
        }
        if (!this.err.equals(gcn2.aO())) {
            lfn.b(5, TC, "handleMonolithUpdateBlastTimerMessage() Player is not registered with monolith : " + gcn2.aO() + " but with monolith : " + this.err);
            assert (false);
            return;
        }
        this.erx = gcn2.bTw();
    }

    private void b(gco gco2) {
        if (this.err == null) {
            lfn.b(5, TC, "handleMonolithUpdateRegisteredPlayersMessage() Player is not registered with monolith : " + gco2.aO());
            assert (false);
            return;
        }
        if (!this.err.equals(gco2.aO())) {
            lfn.b(5, TC, "handleMonolithUpdateRegisteredPlayersMessage() Player is not registered with monolith : " + gco2.aO() + " but with monolith : " + this.err);
            assert (false);
            return;
        }
        this.erv = gco2.bTt();
        this.mPD.setText(String.valueOf(this.erv));
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (!this.lpP) {
            return;
        }
        if (this.erw <= 0.0 || this.erx <= 0.0) {
            return;
        }
        double d2 = ldz2.rgz;
        double d3 = d2 - this.abo;
        if (d3 <= 1.0) {
            return;
        }
        this.abo = d2;
        double d4 = this.erw - d2;
        double d5 = this.erx - d2;
        if (d4 < 0.0 || d5 < 0.0) {
            return;
        }
        this.mPz.setText(lxt.txC.bD(d4).exA());
        this.mPB.setText(lxt.txC.bD(d5).exA());
    }

    @Override
    protected void ku(float f) {
        super.ku(f);
        if (this.lLM != null) {
            this.lLM.hz(f);
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

    public void receiveMessage(dxq dxq2) {
        if (!this.lpP) {
            this.lpQ.add(dxq2);
            return;
        }
        int n = dxq2.bEz();
        switch (n) {
            case 32770: {
                this.lpI.s(this);
                break;
            }
            case 32771: {
                this.lpI.s(this);
                break;
            }
            case 32776: {
                this.a((gcj)dxq2);
                break;
            }
            case 32773: {
                this.b((gcp)dxq2);
                break;
            }
            case 32774: {
                this.b((gcn)dxq2);
                break;
            }
            case 32775: {
                this.b((gco)dxq2);
                break;
            }
            default: {
                assert (false);
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected iox cGl() {
        return null;
    }
}

