/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class jad
extends jac {
    private static final int mFz = 30;
    private static final int mFA = 260;
    private static final int mFB = 110;
    private static final int mFC = 150;
    private static final int mFD = 100;
    private static final int mFE = 153;
    private ist mFF = null;
    private ist mFG = null;
    private ist mFH = null;
    private ist mFI = null;
    private ist mFJ = null;
    private ist mFK = null;
    private ist mFL = null;
    private ist mFM = null;
    private ist mFN = null;
    private ist mFO = null;

    @Override
    public loz aNA() {
        return lxh.tpF.bD(new Object[0]);
    }

    @Override
    protected String duk() {
        return "/dfdata/texture/gui/j2f/leaderboards/lifetime_kills/";
    }

    public jad(jab jab2) {
        super(jab2);
    }

    @Override
    protected void dum() {
        this.a(irl.dnr());
        ipx ipx2 = ipx.j(ipx.dmu());
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx ipx3 = ipx.l(new ipf[0]);
        ipx3.W(ipx.a(8, 1, new ipf[0]));
        ist ist2 = new ist(mEG, 16, 12357465, lxh.tpK.bD(new Object[0]));
        ipx3.W(ist2);
        ipx3.W(ipx.c(new ipf[0]));
        ipx3.W(ipx.d(new ipk(0x313131, 1, 18)));
        ipx3.W(ipx.a(8, 1, new ipf[0]));
        this.mFn = new jac.f(this);
        ipx3.W(ipx.d(this.mFn));
        ipx3.W(ipx.a(16, 1, new ipf[0]));
        ipx2.W(ipx3);
        ipx ipx4 = ipx.l(new ipf[0]);
        ipx4.W(ipx.a(4, 1, new ipf[0]));
        ist ist3 = new ist(mEJ, 13, 12357465, lxh.tpT.bD(new Object[0]));
        ipx4.W(ipx.a(30, 1, ipx.d(ist3)));
        ipx4.W(ipx.d(new ipk(0x313131, 1, 20)));
        ist ist4 = new ist(mEJ, 13, 12357465, lxh.tpS.bD(new Object[0]));
        ipx4.W(ipx.a(260, 1, ipx.d(ist4)));
        ipx4.W(ipx.d(new ipk(0x313131, 1, 20)));
        ist ist5 = new ist(mEJ, 13, 12357465, lxh.tpV.bD(new Object[0]));
        ipx4.W(ipx.a(110, 1, ipx.d(ist5)));
        ipx2.W(ipx4);
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(this.duq());
        for (int i = 0; i < 10; ++i) {
            this.mFo.c(new a(this, i));
        }
        ipx ipx5 = ipx.j(new ipf[0]);
        ipx ipx6 = ipx.l(new ipf[0]);
        ipx6.W(ipx.a(150, 20, new ipf[0]));
        ist ist6 = new ist(mFa, 12, 12357465, lxh.tqi.bD(new Object[0]));
        ipx6.W(ipx.a(100, 20, ipx.d(ist6)));
        ipx6.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.dur();
        ipx6.W(ipx.a(153, 20, ipx.d(ipx.a(136, 22, this.mFp))));
        ipx5.W(ipx6);
        ipx5.W(ipx.a(1, 4, new ipf[0]));
        ipx ipx7 = ipx.l(new ipf[0]);
        ist ist7 = new ist(mFd, 12, 12357465);
        ist7.o(lxh.tpW.bD(new Object[0]));
        ipx7.W(ipx.a(150, 20, ipx.l(ipx.c(new ipf[0]), ist7, ipx.a(8, 1, new ipf[0]))));
        ipx7.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mFF = new ist(mFd, 12, 0xABABAB);
        this.mFF.setText("-");
        ipx7.W(ipx.a(100, 20, ipx.d(this.mFF)));
        ipx7.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mFG = new ist(mFd, 12, 0xABABAB);
        this.mFG.setText("-");
        ipx7.W(ipx.a(153, 20, ipx.d(this.mFG)));
        ipx5.W(ipx.h(this.dus(), ipx7));
        ipx5.W(ipx.a(1, 4, new ipf[0]));
        ipx ipx8 = ipx.l(new ipf[0]);
        ist ist8 = new ist(mFd, 12, 12357465);
        ist8.o(lxh.tpX.bD(new Object[0]));
        ipx8.W(ipx.a(150, 20, ipx.l(ipx.c(new ipf[0]), ist8, ipx.a(8, 1, new ipf[0]))));
        ipx8.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mFH = new ist(mFd, 12, 0xABABAB);
        this.mFH.setText("-");
        ipx8.W(ipx.a(100, 20, ipx.d(this.mFH)));
        ipx8.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mFI = new ist(mFd, 12, 0xABABAB);
        this.mFI.setText("-");
        ipx8.W(ipx.a(153, 20, ipx.d(this.mFI)));
        ipx5.W(ipx8);
        ipx5.W(ipx.a(1, 4, new ipf[0]));
        ipx ipx9 = ipx.l(new ipf[0]);
        ist ist9 = new ist(mFd, 12, 12357465);
        ist9.o(lxh.tpY.bD(new Object[0]));
        ipx9.W(ipx.a(150, 20, ipx.l(ipx.c(new ipf[0]), ist9, ipx.a(8, 1, new ipf[0]))));
        ipx9.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mFJ = new ist(mFd, 12, 0xABABAB);
        this.mFJ.setText("-");
        ipx9.W(ipx.a(100, 20, ipx.d(this.mFJ)));
        ipx9.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mFK = new ist(mFd, 12, 0xABABAB);
        this.mFK.setText("-");
        ipx9.W(ipx.a(153, 20, ipx.d(this.mFK)));
        ipx5.W(ipx.h(this.dus(), ipx9));
        ipx5.W(ipx.a(1, 4, new ipf[0]));
        ipx ipx10 = ipx.l(new ipf[0]);
        ist ist10 = new ist(mFd, 12, 12357465);
        ist10.o(lxh.tpZ.bD(new Object[0]));
        ipx10.W(ipx.a(150, 20, ipx.l(ipx.c(new ipf[0]), ist10, ipx.a(8, 1, new ipf[0]))));
        ipx10.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mFL = new ist(mFd, 12, 0xABABAB);
        this.mFL.setText("-");
        ipx10.W(ipx.a(100, 20, ipx.d(this.mFL)));
        ipx10.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mFM = new ist(mFd, 12, 0xABABAB);
        this.mFM.setText("-");
        ipx10.W(ipx.a(153, 20, ipx.d(this.mFM)));
        ipx5.W(ipx10);
        ipx5.W(ipx.a(1, 4, new ipf[0]));
        ipx ipx11 = ipx.l(new ipf[0]);
        ist ist11 = new ist(mFd, 12, 12357465);
        ist11.o(lxh.tqa.bD(new Object[0]));
        ipx11.W(ipx.a(150, 20, ipx.l(ipx.c(new ipf[0]), ist11, ipx.a(8, 1, new ipf[0]))));
        ipx11.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mFN = new ist(mFd, 12, 0xABABAB);
        this.mFN.setText("-");
        ipx11.W(ipx.a(100, 20, ipx.d(this.mFN)));
        ipx11.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mFO = new ist(mFd, 12, 0xABABAB);
        this.mFO.setText("-");
        ipx11.W(ipx.a(153, 20, ipx.d(this.mFO)));
        ipx5.W(ipx.h(this.dus(), ipx11));
        ipx5.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(ipx5);
        this.W(ipx2);
    }

    private void Tl(int n) {
        String string = lxh.sXM.bD(new Object[0]).exA();
        for (int i = 0; i < 10; ++i) {
            ((a)this.mFo.SY(i)).O(i == 0 ? string : null, -1);
        }
    }

    private void a(String[] stringArray, int[] nArray) {
        for (int i = 0; i < 10; ++i) {
            if (i < stringArray.length) {
                ((a)this.mFo.SY(i)).O(stringArray[i], nArray[i]);
                continue;
            }
            ((a)this.mFo.SY(i)).O(null, -1);
        }
    }

    private void Tm(int n) {
        String string = "!";
        this.mFF.setText(string);
        this.mFH.setText(string);
        this.mFJ.setText(string);
        this.mFL.setText(string);
        this.mFN.setText(string);
        this.mFF.Rk(0xFF0000);
        this.mFH.Rk(0xFF0000);
        this.mFJ.Rk(0xFF0000);
        this.mFL.Rk(0xFF0000);
        this.mFN.Rk(0xFF0000);
    }

    private void a(int n, int n2, int n3, int n4, int n5) {
        this.mFF.setText(String.format("%d", n));
        this.mFH.setText(String.format("%d", n2));
        this.mFJ.setText(String.format("%d", n3));
        this.mFL.setText(String.format("%d", n4));
        this.mFN.setText(String.format("%d", n5));
        this.mFF.Rk(0xABABAB);
        this.mFH.Rk(0xABABAB);
        this.mFJ.Rk(0xABABAB);
        this.mFL.Rk(0xABABAB);
        this.mFN.Rk(0xABABAB);
    }

    private void Tn(int n) {
        String string = "!";
        this.mFG.setText(string);
        this.mFI.setText(string);
        this.mFK.setText(string);
        this.mFM.setText(string);
        this.mFO.setText(string);
        this.mFG.Rk(0xFF0000);
        this.mFI.Rk(0xFF0000);
        this.mFK.Rk(0xFF0000);
        this.mFM.Rk(0xFF0000);
        this.mFO.Rk(0xFF0000);
    }

    private void b(int n, int n2, int n3, int n4, int n5) {
        this.mFG.setText(String.format("%d", n));
        this.mFI.setText(String.format("%d", n2));
        this.mFK.setText(String.format("%d", n3));
        this.mFM.setText(String.format("%d", n4));
        this.mFO.setText(String.format("%d", n5));
        this.mFG.Rk(0xABABAB);
        this.mFI.Rk(0xABABAB);
        this.mFK.Rk(0xABABAB);
        this.mFM.Rk(0xABABAB);
        this.mFO.Rk(0xABABAB);
    }

    @Override
    protected void dun() {
        this.duv();
        if (hso.cxK() != null && hso.cxK().bAn() != null) {
            this.fa(hso.cxK().bAn().SN, 1);
        }
    }

    @Override
    protected void duo() {
        this.N(this.mFp.getText(), 2);
    }

    private gmu duu() {
        if (this.mFl == null || this.mFl.getMessageDelegator() == null || this.mFl.getGUID() == null) {
            return null;
        }
        return (gmu)this.mFl.getMessageDelegator().h(3611, this.mFl.getGUID(), lcr.qEl);
    }

    private void duv() {
        gmu gmu2 = this.duu();
        if (gmu2 == null) {
            return;
        }
        gmu2.Jv(0);
        gmu2.Ke(10);
        this.mFl.getMessageDelegator().F(gmu2);
    }

    private void fa(int n, int n2) {
        gmu gmu2 = this.duu();
        if (gmu2 == null) {
            return;
        }
        gmu2.sk(n2);
        gmu2.Jv(1);
        gmu2.cS(n);
        this.mFl.getMessageDelegator().F(gmu2);
    }

    private void N(String string, int n) {
        gmu gmu2 = this.duu();
        if (gmu2 == null) {
            return;
        }
        gmu2.sk(n);
        gmu2.Jv(1);
        gmu2.d(string);
        this.mFl.getMessageDelegator().F(gmu2);
    }

    @Override
    public boolean l(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3612: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3612: {
                this.a((gmv)dxq2);
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
    }

    private void a(gmv gmv2) {
        block0 : switch (gmv2.bUV()) {
            case 0: {
                if (gmv2.getErrorCode() != 0) {
                    this.Tl(gmv2.getErrorCode());
                    break;
                }
                this.a(gmv2.bWj(), gmv2.bWk());
                break;
            }
            case 1: {
                switch (gmv2.aVk()) {
                    case 1: {
                        if (gmv2.getErrorCode() != 0) {
                            this.Tm(gmv2.getErrorCode());
                            break block0;
                        }
                        this.a(gmv2.bWi(), gmv2.bWh(), gmv2.bWg(), gmv2.bWf(), gmv2.bWe());
                        break block0;
                    }
                    case 2: {
                        if (gmv2.getErrorCode() != 0) {
                            this.Tn(gmv2.getErrorCode());
                            break block0;
                        }
                        this.b(gmv2.bWi(), gmv2.bWh(), gmv2.bWg(), gmv2.bWf(), gmv2.bWe());
                    }
                }
            }
        }
        this.dup();
    }
}

