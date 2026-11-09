/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.List;

public class jfq
extends ihm {
    private jeo mXW;

    public jfq(ioa ioa2, joa joa2, jeo jeo2) {
        super("PurchaseBoosterWindow", "RolesWindow.swf", ioa2, joa2, 2, 3);
        this.mXW = jeo2;
        this.a(iod.moE);
    }

    @Override
    public void cCu() {
        super.cCu();
        this.p(36, 0, 36, 70);
        this.cXC().f(lxx.tzh);
        this.cXC().QT(8);
        this.cXC().QU(2);
        this.cXE().W(ipx.a(1, 2, new ipf[0]));
        ipx ipx2 = ipx.j(new ipf[0]);
        this.cXE().W(ipx2);
        ipx2.W(ipx.l(ist.a(isf.mwO, 18, 12357465, this.mXW.dzO().aNA()), ipx.c(new ipf[0])));
        ipx ipx3 = ipx.l(new ipf[0]);
        ipx2.W(ipx3);
        ipx3.W(ipx.c(this.dBJ()));
        ipx3.W(ipx.a(8, 1, new ipf[0]));
        ipx3.W(ipx.d(new ipk(0x313131, 1, 53)));
        ipx3.W(ipx.a(8, 1, new ipf[0]));
        ipx3.W(ipx.a(60, 53, ipx.d(this.dBK())));
        iur iur2 = new iur(this){
            final /* synthetic */ jfq mXX;
            {
                this.mXX = jfq2;
            }

            public void cLq() {
                this.mXX.close();
                this.mXX.cNl();
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxx.tAz.bD(new Object[0]).exA());
            }
        };
        ipx2.W(ipx.l(ipx.c(new ipf[0]), iur2, ipx.a(0, 1, new ipf[0])));
        ipx2.W(ipx.a(1, 75, new ipf[0]));
    }

    @Override
    protected ipf cMs() {
        return new ipb("bg_booster_popup_bg");
    }

    protected void cNl() {
    }

    private ipf dBJ() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(ist.a(isf.mwO, 18, 12357465, this.mXW.dzP().aNA())));
        ipx2.W(ipx.c(new ipf[0]));
        List<String> list = this.mXW.dzS();
        if (list.size() >= 1) {
            ipx2.W(ipx.d(ist.c(isf.mwO, 13, 0xABABAB, list.get(0))));
        }
        if (list.size() >= 2) {
            ipx2.W(ipx.d(ist.c(isf.mwO, 13, 0xABABAB, list.get(1))));
        }
        return ipx2;
    }

    private ipf dBK() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.d(new ipb("icon_prowess_02")));
        ipx2.W(ipx.a(1, 4, new ipf[0]));
        ipx2.W(ipx.d(ist.c(isf.mwO, 16, 12357465, "" + this.mXW.cl())));
        return ipx2;
    }
}

