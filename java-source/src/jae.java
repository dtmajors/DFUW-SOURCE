/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class jae
extends jac {
    private static final isf mFT = isf.mwO;
    private static final int mFU = 12;
    private static final int mFV = 0xABABAB;
    private static final int mFz = 30;
    private static final int mFA = 180;
    private static final int mFW = 70;
    private static final int mFX = 70;
    private static final int mFY = 50;
    private static final int mFC = 150;
    private static final int mFD = 100;
    private static final int mFE = 153;
    private ist mFZ = null;
    private ist mGa = null;
    private ist mGb = null;
    private ist mGc = null;
    private ist mGd = null;
    private ist mGe = null;
    private ist mGf = null;

    @Override
    public loz aNA() {
        return lxh.tpH.bD(new Object[0]);
    }

    @Override
    protected String duk() {
        return "/dfdata/texture/gui/j2f/leaderboards/seasons/";
    }

    public jae(jab jab2) {
        super(jab2);
    }

    @Override
    protected void dum() {
        this.a(irl.dnr());
        ipx ipx2 = ipx.j(ipx.dmu());
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx ipx3 = ipx.l(new ipf[0]);
        ipx3.W(ipx.a(8, 1, new ipf[0]));
        this.mFZ = new ist(mFT, 12, 0xABABAB, this.To(7));
        ipx3.W(this.mFZ);
        ipx3.W(ipx.c(new ipf[0]));
        ipx3.W(ipx.d(new ipk(0x313131, 1, 18)));
        ipx3.W(ipx.a(8, 1, new ipf[0]));
        this.mFn = new jac.f(this);
        ipx3.W(ipx.d(this.mFn));
        ipx3.W(ipx.a(16, 1, new ipf[0]));
        ipx2.W(ipx3);
        ipx ipx4 = ipx.l(new ipf[0]);
        ipx4.W(ipx.a(8, 1, new ipf[0]));
        ist ist2 = new ist(mEG, 16, 12357465, lxh.tpM.bD(new Object[0]));
        ipx4.W(ist2);
        ipx4.W(ipx.c(new ipf[0]));
        ipx2.W(ipx4);
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx ipx5 = ipx.l(new ipf[0]);
        ipx5.W(ipx.a(4, 1, new ipf[0]));
        ist ist3 = new ist(mEJ, 13, 12357465, lxh.tpT.bD(new Object[0]));
        ipx5.W(ipx.a(30, 1, ipx.d(ist3)));
        ipx5.W(ipx.d(new ipk(0x313131, 1, 20)));
        ist ist4 = new ist(mEJ, 13, 12357465, lxh.tpS.bD(new Object[0]));
        ipx5.W(ipx.a(180, 1, ipx.d(ist4)));
        ipx5.W(ipx.d(new ipk(0x313131, 1, 20)));
        ist ist5 = new ist(mEJ, 13, 12357465, lxh.tqd.bD(new Object[0]));
        ipx5.W(ipx.a(70, 1, ipx.d(ist5)));
        ipx5.W(ipx.d(new ipk(0x313131, 1, 20)));
        ist ist6 = new ist(mEJ, 13, 12357465, lxh.tqe.bD(new Object[0]));
        ipx5.W(ipx.a(70, 1, ipx.d(ist6)));
        ipx5.W(ipx.d(new ipk(0x313131, 1, 20)));
        ist ist7 = new ist(mEJ, 13, 12357465, lxh.tpU.bD(new Object[0]));
        ipx5.W(ipx.a(50, 1, ipx.d(ist7)));
        ipx2.W(ipx5);
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(this.duq());
        for (int i = 0; i < 10; ++i) {
            this.mFo.c(new a(this, i));
        }
        ipx ipx6 = ipx.j(new ipf[0]);
        ipx ipx7 = ipx.l(new ipf[0]);
        ipx7.W(ipx.a(150, 20, new ipf[0]));
        ist ist8 = new ist(mFa, 12, 12357465, lxh.tqi.bD(new Object[0]));
        ipx7.W(ipx.a(100, 20, ipx.d(ist8)));
        ipx7.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.dur();
        ipx7.W(ipx.a(153, 20, ipx.d(ipx.a(136, 22, this.mFp))));
        ipx6.W(ipx7);
        ipx6.W(ipx.a(1, 4, new ipf[0]));
        ipx ipx8 = ipx.l(new ipf[0]);
        ist ist9 = new ist(mFd, 12, 12357465);
        ist9.o(lxh.tqf.bD(new Object[0]));
        ipx8.W(ipx.a(150, 20, ipx.l(ipx.c(new ipf[0]), ist9, ipx.a(8, 1, new ipf[0]))));
        ipx8.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mGa = new ist(mFd, 12, 0xABABAB);
        this.mGa.setText("-");
        ipx8.W(ipx.a(100, 20, ipx.d(this.mGa)));
        ipx8.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mGb = new ist(mFd, 12, 0xABABAB);
        this.mGb.setText("-");
        ipx8.W(ipx.a(153, 20, ipx.d(this.mGb)));
        ipx6.W(ipx.h(this.dus(), ipx8));
        ipx6.W(ipx.a(1, 4, new ipf[0]));
        ipx ipx9 = ipx.l(new ipf[0]);
        ist ist10 = new ist(mFd, 12, 12357465);
        ist10.o(lxh.tqg.bD(new Object[0]));
        ipx9.W(ipx.a(150, 20, ipx.l(ipx.c(new ipf[0]), ist10, ipx.a(8, 1, new ipf[0]))));
        ipx9.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mGc = new ist(mFd, 12, 0xABABAB);
        this.mGc.setText("-");
        ipx9.W(ipx.a(100, 20, ipx.d(this.mGc)));
        ipx9.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mGd = new ist(mFd, 12, 0xABABAB);
        this.mGd.setText("-");
        ipx9.W(ipx.a(153, 20, ipx.d(this.mGd)));
        ipx6.W(ipx9);
        ipx6.W(ipx.a(1, 4, new ipf[0]));
        ipx ipx10 = ipx.l(new ipf[0]);
        ist ist11 = new ist(mFd, 12, 12357465);
        ist11.o(lxh.tqh.bD(new Object[0]));
        ipx10.W(ipx.a(150, 20, ipx.l(ipx.c(new ipf[0]), ist11, ipx.a(8, 1, new ipf[0]))));
        ipx10.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mGe = new ist(mFd, 12, 0xABABAB);
        this.mGe.setText("-");
        ipx10.W(ipx.a(100, 20, ipx.d(this.mGe)));
        ipx10.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mGf = new ist(mFd, 12, 0xABABAB);
        this.mGf.setText("-");
        ipx10.W(ipx.a(153, 20, ipx.d(this.mGf)));
        ipx6.W(ipx.h(this.dus(), ipx10));
        ipx6.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(ipx6);
        this.W(ipx2);
    }

    private void Tl(int n) {
        String string = lxh.sXM.bD(new Object[0]).exA();
        for (int i = 0; i < 10; ++i) {
            ((a)this.mFo.SY(i)).c(i == 0 ? string : null, -1, 0, 0);
        }
    }

    private void a(String[] stringArray, int[] nArray, int[] nArray2, int[] nArray3) {
        for (int i = 0; i < 10; ++i) {
            if (i < stringArray.length) {
                ((a)this.mFo.SY(i)).c(stringArray[i], nArray[i], nArray2[i], nArray3[i]);
                continue;
            }
            ((a)this.mFo.SY(i)).c(null, -1, 0, 0);
        }
    }

    private void Tm(int n) {
        String string = "!";
        this.mGa.setText(string);
        this.mGc.setText(string);
        this.mGe.setText(string);
        this.mGa.Rk(0xFF0000);
        this.mGc.Rk(0xFF0000);
        this.mGe.Rk(0xFF0000);
    }

    private void H(int n, int n2, int n3) {
        this.mGa.setText(String.format("%d", n));
        this.mGc.setText(String.format("%d", n2));
        this.mGe.setText(String.format("%d", n3));
        this.mGa.Rk(0xABABAB);
        this.mGc.Rk(0xABABAB);
        this.mGe.Rk(0xABABAB);
    }

    private void Tn(int n) {
        String string = "!";
        this.mGb.setText(string);
        this.mGd.setText(string);
        this.mGf.setText(string);
        this.mGb.Rk(0xFF0000);
        this.mGd.Rk(0xFF0000);
        this.mGf.Rk(0xFF0000);
    }

    private void I(int n, int n2, int n3) {
        this.mGb.setText(String.format("%d", n));
        this.mGd.setText(String.format("%d", n2));
        this.mGf.setText(String.format("%d", n3));
        this.mGb.Rk(0xABABAB);
        this.mGd.Rk(0xABABAB);
        this.mGf.Rk(0xABABAB);
    }

    @Override
    protected void dun() {
        this.dux();
        if (hso.cxK() != null && hso.cxK().bAn() != null) {
            this.fb(hso.cxK().bAn().SN, 1);
        }
    }

    @Override
    protected void duo() {
        this.P(this.mFp.getText(), 2);
    }

    private loz To(int n) {
        return lxh.tpQ.bD(n);
    }

    private gna duw() {
        if (this.mFl == null || this.mFl.getMessageDelegator() == null || this.mFl.getGUID() == null) {
            return null;
        }
        return (gna)this.mFl.getMessageDelegator().h(3615, this.mFl.getGUID(), lcr.qEl);
    }

    private void dux() {
        gna gna2 = this.duw();
        if (gna2 == null) {
            return;
        }
        gna2.Jv(0);
        gna2.Ke(10);
        this.mFl.getMessageDelegator().F(gna2);
    }

    private void fb(int n, int n2) {
        gna gna2 = this.duw();
        if (gna2 == null) {
            return;
        }
        gna2.sk(n2);
        gna2.Jv(1);
        gna2.cS(n);
        this.mFl.getMessageDelegator().F(gna2);
    }

    private void P(String string, int n) {
        gna gna2 = this.duw();
        if (gna2 == null) {
            return;
        }
        gna2.sk(n);
        gna2.Jv(1);
        gna2.d(string);
        this.mFl.getMessageDelegator().F(gna2);
    }

    @Override
    public boolean l(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3616: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3616: {
                this.a((gnb)dxq2);
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
    }

    private void a(gnb gnb2) {
        block0 : switch (gnb2.bUV()) {
            case 0: {
                if (gnb2.getErrorCode() != 0) {
                    this.Tl(gnb2.getErrorCode());
                    break;
                }
                this.mFZ.o(this.To(gnb2.bWm()));
                this.a(gnb2.bWj(), gnb2.bWq(), gnb2.bWr(), gnb2.bWs());
                break;
            }
            case 1: {
                switch (gnb2.aVk()) {
                    case 1: {
                        if (gnb2.getErrorCode() != 0) {
                            this.Tm(gnb2.getErrorCode());
                            break block0;
                        }
                        this.H(gnb2.bWn(), gnb2.bWo(), gnb2.bWp());
                        break block0;
                    }
                    case 2: {
                        if (gnb2.getErrorCode() != 0) {
                            this.Tn(gnb2.getErrorCode());
                            break block0;
                        }
                        this.I(gnb2.bWn(), gnb2.bWo(), gnb2.bWp());
                    }
                }
            }
        }
        this.dup();
    }
}

