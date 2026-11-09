/*
 * Decompiled with CFR.
 */
public class ihn
extends ipx {
    private jaa lWr;
    private ipx lWs;
    private ipx lWt;

    public ihn(itd itd2) {
        this.a(iqo.dmT());
        this.lWs = ipx.a(1, 6, new ipf[0]);
        this.W(this.lWs);
        ipx ipx2 = ipx.l(new ipf[0]);
        this.W(ipx2);
        this.lWt = ipx.a(8, 1, new ipf[0]);
        ipx2.W(this.lWt);
        ipx ipx3 = ipx.h(new ipf[0]);
        ipx2.W(ipx3);
        ipx3.W(new iqa("/dfdata/texture/gui/j2f/chat/popups/window_popup_bg_title.png", 32, 0, 73, 0));
        ipx ipx4 = ipx.l(new ipf[0]);
        ipx3.W(ipx4);
        ipx4.W(ipx.a(35, 1, new ipf[0]));
        this.lWr = new jaa();
        if (itd2 != null) {
            this.lWr.e(itd2);
        }
        ipx4.W(ipx.c(0, -3, 0, -2, this.lWr));
        ipx4.W(ipx.a(79, 1, new ipf[0]));
        ipx2.W(ipx.c(new ipf[0]));
    }

    public ihn(String string) {
        this(new itd(string){
            final /* synthetic */ String lWu;
            {
                this.lWu = string;
            }

            public String getText() {
                return this.lWu;
            }
        });
    }

    public ihn(lox lox2) {
        this(new itd(lox2){
            final /* synthetic */ lox lWv;
            {
                this.lWv = lox2;
            }

            public String getText() {
                return this.lWv.bD(new Object[0]).exA();
            }
        });
    }

    public ihn() {
        this((itd)null);
    }

    public String cXG() {
        return this.lWr.getText();
    }

    public void a(itd itd2) {
        this.lWr.e(itd2);
    }

    public void qk(String string) {
        this.lWr.setText(string);
    }

    public void f(lox lox2) {
        this.lWr.g(lox2);
    }

    public void z(loz loz2) {
        this.lWr.o(loz2);
    }

    public int cXH() {
        return ((iqu)this.lWt.djQ()).getWidth();
    }

    public void QT(int n) {
        this.lWt.a(new iqu(n, 1));
    }

    public int cXI() {
        return ((iqu)this.lWs.djQ()).getHeight();
    }

    public void QU(int n) {
        this.lWs.a(new iqu(1, n));
    }
}

