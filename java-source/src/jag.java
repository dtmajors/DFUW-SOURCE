/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class jag
extends jac {
    private static final isf mGn = isf.mwO;
    private static final int mGo = 12;
    private static final int mGp = 0xABABAB;
    private static final int mFz = 30;
    private static final int mFA = 190;
    private static final int mGq = 100;
    private static final int mFW = 80;
    private static final int mFC = 150;
    private static final int mFD = 100;
    private static final int mFE = 153;
    private ist mGr = null;
    private ist mGa = null;
    private ist mGb = null;
    private ist mGs = null;
    private ist mGt = null;
    private ist mGu = null;
    private ist mGv = null;
    private ist mGw = null;
    private ist mGx = null;
    private ist mGy = null;
    private ist mGz = null;

    @Override
    public loz aNA() {
        return lxh.tpG.bD(new Object[0]);
    }

    @Override
    protected String duk() {
        return "/dfdata/texture/gui/j2f/leaderboards/terms/";
    }

    public jag(jab jab2) {
        super(jab2);
    }

    @Override
    protected void dum() {
        this.a(irl.dnr());
        ipx ipx2 = ipx.j(ipx.dmu());
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx ipx3 = ipx.l(new ipf[0]);
        ipx3.W(ipx.a(8, 1, new ipf[0]));
        this.mGr = new ist(mGn, 12, 0xABABAB, this.To(7));
        ipx3.W(this.mGr);
        ipx3.W(ipx.c(new ipf[0]));
        ipx3.W(ipx.d(new ipk(0x313131, 1, 18)));
        ipx3.W(ipx.a(8, 1, new ipf[0]));
        this.mFn = new jac.f(this);
        ipx3.W(ipx.d(this.mFn));
        ipx3.W(ipx.a(16, 1, new ipf[0]));
        ipx2.W(ipx3);
        ipx ipx4 = ipx.l(new ipf[0]);
        ipx4.W(ipx.a(8, 1, new ipf[0]));
        ist ist2 = new ist(mEG, 16, 12357465, lxh.tpL.bD(new Object[0]));
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
        ipx5.W(ipx.a(190, 1, ipx.d(ist4)));
        ipx5.W(ipx.d(new ipk(0x313131, 1, 20)));
        ist ist5 = new ist(mEJ, 13, 12357465, lxh.toj.bD(new Object[0]));
        ipx5.W(ipx.a(100, 1, ipx.d(ist5)));
        ipx5.W(ipx.d(new ipk(0x313131, 1, 20)));
        ist ist6 = new ist(mEJ, 13, 12357465, lxh.tqd.bD(new Object[0]));
        ipx5.W(ipx.a(80, 1, ipx.d(ist6)));
        ipx2.W(ipx5);
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(this.duq());
        for (int i = 0; i < 10; ++i) {
            this.mFo.c(new a(this, i));
        }
        ipx ipx6 = ipx.j(new ipf[0]);
        ipx ipx7 = ipx.l(new ipf[0]);
        ipx7.W(ipx.a(150, 20, new ipf[0]));
        ist ist7 = new ist(mFa, 12, 12357465, lxh.tqi.bD(new Object[0]));
        ipx7.W(ipx.a(100, 20, ipx.d(ist7)));
        ipx7.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.dur();
        ipx7.W(ipx.a(153, 20, ipx.d(ipx.a(136, 22, this.mFp))));
        ipx6.W(ipx7);
        ipx6.W(ipx.a(1, 4, new ipf[0]));
        ipx ipx8 = ipx.l(new ipf[0]);
        ist ist8 = new ist(mFd, 12, 12357465);
        ist8.o(lxh.tqf.bD(new Object[0]));
        ipx8.W(ipx.a(150, 20, ipx.l(ipx.c(new ipf[0]), ist8, ipx.a(8, 1, new ipf[0]))));
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
        ist ist9 = new ist(mFd, 12, 12357465);
        ist9.o(lxh.tqg.bD(new Object[0]));
        ipx9.W(ipx.a(150, 20, ipx.l(ipx.c(new ipf[0]), ist9, ipx.a(8, 1, new ipf[0]))));
        ipx9.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mGs = new ist(mFd, 12, 0xABABAB);
        this.mGs.setText("-");
        ipx9.W(ipx.a(100, 20, ipx.d(this.mGs)));
        ipx9.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mGt = new ist(mFd, 12, 0xABABAB);
        this.mGt.setText("-");
        ipx9.W(ipx.a(153, 20, ipx.d(this.mGt)));
        ipx6.W(ipx9);
        ipx6.W(ipx.a(1, 4, new ipf[0]));
        ipx ipx10 = ipx.l(new ipf[0]);
        ist ist10 = new ist(mFd, 12, 12357465);
        ist10.o(lxh.tqh.bD(new Object[0]));
        ipx10.W(ipx.a(150, 20, ipx.l(ipx.c(new ipf[0]), ist10, ipx.a(8, 1, new ipf[0]))));
        ipx10.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mGu = new ist(mFd, 12, 0xABABAB);
        this.mGu.setText("-");
        ipx10.W(ipx.a(100, 20, ipx.d(this.mGu)));
        ipx10.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mGv = new ist(mFd, 12, 0xABABAB);
        this.mGv.setText("-");
        ipx10.W(ipx.a(153, 20, ipx.d(this.mGv)));
        ipx6.W(ipx.h(this.dus(), ipx10));
        ipx6.W(ipx.a(1, 4, new ipf[0]));
        ipx ipx11 = ipx.l(new ipf[0]);
        ist ist11 = new ist(mFd, 12, 12357465);
        ist11.o(lxh.tqb.bD(new Object[0]));
        ipx11.W(ipx.a(150, 20, ipx.l(ipx.c(new ipf[0]), ist11, ipx.a(8, 1, new ipf[0]))));
        ipx11.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mGw = new ist(mFd, 12, 0xABABAB);
        this.mGw.setText("-");
        ipx11.W(ipx.a(100, 20, ipx.d(this.mGw)));
        ipx11.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mGx = new ist(mFd, 12, 0xABABAB);
        this.mGx.setText("-");
        ipx11.W(ipx.a(153, 20, ipx.d(this.mGx)));
        ipx6.W(ipx11);
        ipx6.W(ipx.a(1, 4, new ipf[0]));
        ipx ipx12 = ipx.l(new ipf[0]);
        ist ist12 = new ist(mFd, 12, 12357465);
        ist12.o(lxh.tqc.bD(new Object[0]));
        ipx12.W(ipx.a(150, 20, ipx.l(ipx.c(new ipf[0]), ist12, ipx.a(8, 1, new ipf[0]))));
        ipx12.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mGy = new ist(mFd, 12, 0xABABAB);
        this.mGy.setText("-");
        ipx12.W(ipx.a(100, 20, ipx.d(this.mGy)));
        ipx12.W(ipx.d(new ipk(0x313131, 1, 16)));
        this.mGz = new ist(mFd, 12, 0xABABAB);
        this.mGz.setText("-");
        ipx12.W(ipx.a(153, 20, ipx.d(this.mGz)));
        ipx6.W(ipx.h(this.dus(), ipx12));
        ipx6.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(ipx6);
        this.W(ipx2);
    }

    private void Tl(int n) {
        String string = lxh.sXM.bD(new Object[0]).exA();
        for (int i = 0; i < 10; ++i) {
            ((a)this.mFo.SY(i)).a(i == 0 ? string : null, (dwl)null, -1.0f);
        }
    }

    private void a(String[] stringArray, dwl[] dwlArray, float[] fArray) {
        for (int i = 0; i < 10; ++i) {
            if (i < stringArray.length) {
                ((a)this.mFo.SY(i)).a(stringArray[i], dwlArray[i], fArray[i]);
                continue;
            }
            ((a)this.mFo.SY(i)).a((String)null, (dwl)null, -1.0f);
        }
    }

    private void Tm(int n) {
        String string = "!";
        this.mGa.setText(string);
        this.mGs.setText(string);
        this.mGu.setText(string);
        this.mGw.setText(string);
        this.mGy.setText(string);
        this.mGa.Rk(0xFF0000);
        this.mGs.Rk(0xFF0000);
        this.mGu.Rk(0xFF0000);
        this.mGw.Rk(0xFF0000);
        this.mGy.Rk(0xFF0000);
    }

    private void a(float f2, float f3, float f4, dwl dwl2, dwl dwl3) {
        this.mGa.setText(String.format("%.2f", Float.valueOf(f2)));
        this.mGs.setText(String.format("%.2f", Float.valueOf(f3)));
        this.mGu.setText(String.format("%.2f", Float.valueOf(f4)));
        this.mGw.o(dwl2.bCQ());
        this.mGy.o(dwl3.bCQ());
        this.mGa.Rk(0xABABAB);
        this.mGs.Rk(0xABABAB);
        this.mGu.Rk(0xABABAB);
        this.mGw.Rk(0xABABAB);
        this.mGy.Rk(0xABABAB);
    }

    private void Tn(int n) {
        String string = "!";
        this.mGb.setText(string);
        this.mGt.setText(string);
        this.mGv.setText(string);
        this.mGx.setText(string);
        this.mGz.setText(string);
        this.mGb.Rk(0xFF0000);
        this.mGt.Rk(0xFF0000);
        this.mGv.Rk(0xFF0000);
        this.mGx.Rk(0xFF0000);
        this.mGz.Rk(0xFF0000);
    }

    private void b(float f2, float f3, float f4, dwl dwl2, dwl dwl3) {
        this.mGb.setText(String.format("%.2f", Float.valueOf(f2)));
        this.mGt.setText(String.format("%.2f", Float.valueOf(f3)));
        this.mGv.setText(String.format("%.2f", Float.valueOf(f4)));
        this.mGx.o(dwl2.bCQ());
        this.mGz.o(dwl3.bCQ());
        this.mGb.Rk(0xABABAB);
        this.mGt.Rk(0xABABAB);
        this.mGv.Rk(0xABABAB);
        this.mGx.Rk(0xABABAB);
        this.mGz.Rk(0xABABAB);
    }

    @Override
    protected void dun() {
        this.duB();
        if (hso.cxK() != null && hso.cxK().bAn() != null) {
            this.fc(hso.cxK().bAn().SN, 1);
        }
    }

    @Override
    protected void duo() {
        this.Q(this.mFp.getText(), 2);
    }

    private loz To(int n) {
        return lxh.tpO.bD(n);
    }

    private gne duA() {
        if (this.mFl == null || this.mFl.getMessageDelegator() == null || this.mFl.getGUID() == null) {
            return null;
        }
        return (gne)this.mFl.getMessageDelegator().h(3613, this.mFl.getGUID(), lcr.qEl);
    }

    private void duB() {
        gne gne2 = this.duA();
        if (gne2 == null) {
            return;
        }
        gne2.Jv(0);
        gne2.Ke(10);
        this.mFl.getMessageDelegator().F(gne2);
    }

    private void fc(int n, int n2) {
        gne gne2 = this.duA();
        if (gne2 == null) {
            return;
        }
        gne2.sk(n2);
        gne2.Jv(1);
        gne2.cS(n);
        this.mFl.getMessageDelegator().F(gne2);
    }

    private void Q(String string, int n) {
        gne gne2 = this.duA();
        if (gne2 == null) {
            return;
        }
        gne2.sk(n);
        gne2.Jv(1);
        gne2.d(string);
        this.mFl.getMessageDelegator().F(gne2);
    }

    @Override
    public boolean l(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3614: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 3614: {
                this.a((gnf)dxq2);
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
    }

    private void a(gnf gnf2) {
        block0 : switch (gnf2.bUV()) {
            case 0: {
                if (gnf2.getErrorCode() != 0) {
                    this.Tl(gnf2.getErrorCode());
                    break;
                }
                this.mGr.o(this.To(gnf2.bWv()));
                dwl[] dwlArray = new dwl[gnf2.bWB().length];
                for (int i = 0; i < dwlArray.length; ++i) {
                    dwlArray[i] = dwl.getValueByOrdinal(gnf2.bWB()[i]);
                }
                this.a(gnf2.bWj(), dwlArray, gnf2.bWC());
                break;
            }
            case 1: {
                switch (gnf2.aVk()) {
                    case 1: {
                        if (gnf2.getErrorCode() != 0) {
                            this.Tm(gnf2.getErrorCode());
                            break block0;
                        }
                        this.a(gnf2.bWw(), gnf2.bWx(), gnf2.bWy(), dwl.getValueByOrdinal(gnf2.bWz()), dwl.getValueByOrdinal(gnf2.bWA()));
                        break block0;
                    }
                    case 2: {
                        if (gnf2.getErrorCode() != 0) {
                            this.Tn(gnf2.getErrorCode());
                            break block0;
                        }
                        this.b(gnf2.bWw(), gnf2.bWx(), gnf2.bWy(), dwl.getValueByOrdinal(gnf2.bWz()), dwl.getValueByOrdinal(gnf2.bWA()));
                    }
                }
            }
        }
        this.dup();
    }
}

