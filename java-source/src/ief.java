/*
 * Decompiled with CFR.
 */
import java.text.DateFormat;
import java.util.Date;

class ief
extends ipz {
    public static final int lMK = 750;
    public static final int lML = 32;
    private static final int lMM = 5875524;
    private static final int lMN = 0xE20000;
    private static final int lMO = 0x797979;
    private static final int lMP = 0x797979;
    private static final int lMQ = 0xABABAB;
    private static final int lMR = 0x3A8AA8;
    private static final int lMS = 0x3A8AA8;
    private static final int lMT = 0x3A8AA8;
    private static final int lMU = 0x3A8AA8;
    private static final int lMV = 0x797979;
    private boolean lMW;
    private int _index;
    private ipf lMX;
    private ipf lMY;
    private ipb lMZ;
    private ipb lNa;
    private isi lNb;

    public ief(int n) {
        this._index = n;
        this.W(this.cGT());
    }

    private void d(bda bda2) {
    }

    public boolean cPi() {
        return this.lMY != null;
    }

    public void pX(boolean bl) {
        if (bl) {
            this.c(this.cPl(), 0);
        } else if (this.lMY != null) {
            this.lMY.removeFromParent();
            this.lMY = null;
        }
    }

    public String getText() {
        return this.lNb.getText();
    }

    public void setText(String string) {
        this.lNb.setText(string);
    }

    public void a(bda bda2, int n) {
        this._index = n;
        if (this.lMZ == null) {
            this.W(this.cPm());
            this.W(this.cPn());
        }
        if (this.lNb == null) {
            this.W(this.cPo());
        }
        lgw lgw2 = (lgw)lea.enW().acv(bda2.az());
        String string = "/dfdata/texture/dds/" + lgw2.enm();
        this.lNa.qP(string);
        this.e(bda2);
    }

    @Override
    public void cPj() {
        this.setSize(750, 32);
    }

    @Override
    public void cPk() {
        this.lMX.r(0, 5, this.getWidth(), 22);
        if (this.lMY != null) {
            this.lMY.r(0, 0, this.getWidth(), this.getHeight());
        }
        if (this.lMZ != null) {
            this.lMZ.r(0, 1, 30, 30);
            this.lNa.r(1, 2, 28, 28);
        }
        if (this.lNb != null) {
            this.lNb.r(33, 8, 717, 16);
        }
    }

    private ipf cGT() {
        this.lMX = new ipk(this, 0x181818){
            final /* synthetic */ ief lNc;
            {
                this.lNc = ief2;
                super(n);
            }

            public void kh(float f) {
                this.hz(f);
            }
        };
        return this.lMX;
    }

    private ipf cPl() {
        this.lMY = new ipm(this, 0x1C1C1C, 0x4C4C4C, ire.muk){
            final /* synthetic */ ief lNc;
            {
                this.lNc = ief2;
                super(n, n2, ire2);
            }

            public void kh(float f) {
                this.hz(f);
            }
        };
        this.lMY.setVisible(false);
        return this.lMY;
    }

    private ipf cPm() {
        this.lMZ = new ipb(this, "/dfdata/texture/gui/j2f/clan_vault_logs/clan_vault_log_entry_icon_bg.png"){
            final /* synthetic */ ief lNc;
            {
                this.lNc = ief2;
                super(string);
            }

            public void kh(float f) {
                this.hz(f);
            }
        };
        return this.lMZ;
    }

    private ipf cPn() {
        this.lNa = new ipb();
        this.lNa.rc(false);
        return this.lNa;
    }

    private ipf cPo() {
        this.lNb = new isi(isf.mwN, 12, 0xABABAB, "...");
        this.lNb.sw(true);
        this.lNb.sv(false);
        this.lNb.a(isx.myr);
        this.lNb.a(isu.mxO);
        return this.lNb;
    }

    private void e(bda bda2) {
        switch (bda2.alz()) {
            case cZT: {
                this.o(bda2);
                break;
            }
            case cZU: {
                this.p(bda2);
                break;
            }
            case cZV: {
                this.q(bda2);
                break;
            }
            case cZW: {
                this.r(bda2);
                break;
            }
            case cZX: {
                this.s(bda2);
                break;
            }
            case cZY: {
                this.t(bda2);
                break;
            }
            case cZZ: {
                this.u(bda2);
                break;
            }
            case daa: {
                this.v(bda2);
                break;
            }
            case dab: {
                this.w(bda2);
                break;
            }
            case dac: {
                this.x(bda2);
            }
        }
    }

    private static boolean f(bda bda2) {
        return bda2.vf() > 0;
    }

    private static String g(bda bda2) {
        return isg.J(lvm.sXa.bD(bda2.az()).exA(), 0x797979);
    }

    private static String h(bda bda2) {
        int n = Math.abs(bda2.vf());
        return n > 1 ? isg.J(lwo.tfF.bD(n).exA(), 0x797979) : "";
    }

    private static String i(bda bda2) {
        return isg.J(bda2.hl(), 0xABABAB);
    }

    private static String j(bda bda2) {
        return isg.J(lvm.sXg.bD(bda2.alB()).exA(), 0x3A8AA8);
    }

    private static String k(bda bda2) {
        return isg.J(lvm.sWZ.bD(bda2.alB()).exA(), 0x3A8AA8);
    }

    private static String l(bda bda2) {
        return isg.J(lvm.sXa.bD(bda2.alH()).exA(), 0x3A8AA8);
    }

    private static String m(bda bda2) {
        return isg.J(lvm.sWY.bD(bda2.alB()).exA(), 0x3A8AA8);
    }

    private static String n(bda bda2) {
        String string = DateFormat.getDateTimeInstance().format(new Date(bda2.alA()));
        return isg.J(string, 0x797979);
    }

    private static String a(bda bda2, String string) {
        return isg.J(string, ief.f(bda2) ? 5875524 : 0xE20000);
    }

    private static lox a(bda bda2, lox lox2, lox lox3) {
        return ief.f(bda2) ? lox2 : lox3;
    }

    private void o(bda bda2) {
        lox lox2 = ief.a(bda2, lwo.tfG, lwo.tfH);
        String string = ief.g(bda2);
        String string2 = ief.h(bda2);
        String string3 = ief.i(bda2);
        String string4 = ief.n(bda2);
        String string5 = lox2.bD(string, string2, string3, string4).exA();
        this.setText(ief.a(bda2, string5));
    }

    private void p(bda bda2) {
        String string = ief.g(bda2);
        String string2 = ief.h(bda2);
        String string3 = ief.j(bda2);
        String string4 = ief.n(bda2);
        String string5 = lwo.tfK.bD(string, string2, string3, string4).exA();
        this.d(bda2);
        this.setText(ief.a(bda2, string5));
    }

    private void q(bda bda2) {
        String string = ief.g(bda2);
        String string2 = ief.h(bda2);
        String string3 = ief.k(bda2);
        String string4 = ief.n(bda2);
        String string5 = lwo.tfI.bD(string, string2, string3, string4).exA();
        this.d(bda2);
        this.setText(ief.a(bda2, string5));
    }

    private void r(bda bda2) {
        String string = ief.g(bda2);
        String string2 = ief.h(bda2);
        String string3 = ief.k(bda2);
        String string4 = ief.n(bda2);
        String string5 = lwo.tfJ.bD(string, string2, string3, string4).exA();
        this.d(bda2);
        this.setText(ief.a(bda2, string5));
    }

    private void s(bda bda2) {
        String string = ief.g(bda2);
        String string2 = ief.h(bda2);
        String string3 = ief.l(bda2);
        String string4 = ief.m(bda2);
        String string5 = ief.n(bda2);
        String string6 = lwo.tfL.bD(string, string2, string3, string4, string5).exA();
        this.d(bda2);
        this.setText(ief.a(bda2, string6));
    }

    private void t(bda bda2) {
        String string = ief.g(bda2);
        String string2 = ief.h(bda2);
        String string3 = ief.m(bda2);
        String string4 = ief.n(bda2);
        lox lox2 = ief.a(bda2, lwo.tfM, lwo.tfN);
        String string5 = lox2.bD(string, string2, string3, string4).exA();
        this.d(bda2);
        this.setText(ief.a(bda2, string5));
    }

    private void u(bda bda2) {
        String string = ief.g(bda2);
        String string2 = ief.h(bda2);
        String string3 = ief.m(bda2);
        String string4 = ief.n(bda2);
        String string5 = lwo.tfO.bD(string, string2, string3, string4).exA();
        this.d(bda2);
        this.setText(ief.a(bda2, string5));
    }

    private void v(bda bda2) {
        String string = ief.g(bda2);
        String string2 = ief.h(bda2);
        String string3 = ief.m(bda2);
        String string4 = ief.n(bda2);
        String string5 = lwo.tfP.bD(string, string2, string3, string4).exA();
        this.d(bda2);
        this.setText(ief.a(bda2, string5));
    }

    private void w(bda bda2) {
        String string = ief.g(bda2);
        String string2 = ief.h(bda2);
        String string3 = ief.n(bda2);
        lox lox2 = ief.a(bda2, lwo.tfQ, lwo.tfR);
        String string4 = lox2.bD(string, string2, string3).exA();
        this.d(bda2);
        this.setText(ief.a(bda2, string4));
    }

    private void x(bda bda2) {
        String string = ief.g(bda2);
        String string2 = ief.h(bda2);
        String string3 = ief.n(bda2);
        String string4 = lwo.tfS.bD(string, string2, string3).exA();
        this.d(bda2);
        this.setText(ief.a(bda2, string4));
    }
}

