/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.List;

public class imx
extends ihm {
    private List<ims> mkW;
    private ilu mkX;
    private izz mkY;
    private ivd lHt;

    public imx(ioa ioa2, joa joa2, List<ims> list) {
        super("InventoryItemCustomizeWindow", "J2FWindow.swf", ioa2, joa2, 3, 2);
        this.mkW = list;
        this.mkX = list.get(0).dey().ddr();
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.p(32, 4, 32, 80);
        this.cXC().setVisible(false);
        this.cXE().a(iqo.dmT());
        this.cXE().W(new ist(isf.mwO, 18, 12357465, this.mkW.size() == 1 ? lxb.tmz.bD(new Object[0]) : lxb.tmA.bD(new Object[0])));
        this.cXE().W(this.deV());
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(this.deY());
        this.cXE().W(ipx.a(1, 8, new ipf[0]));
        this.cXE().W(this.dfb());
        this.cXE().W(ipx.a(1, 52, new ipf[0]));
    }

    @Override
    protected ipf cMs() {
        return new iqa("/dfdata/texture/gui/j2f/inventory/customize_item/inv_bg_customize.png", 62, 4, 166, 80, iqb.mtp);
    }

    protected void a(ilu ilu2) {
    }

    private ipf deV() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.d(new ist(isf.mwO, 14, 0xABABAB, lxb.tmB.bD(new Object[0]).exA())));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(125, 20, this.deW())));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.deX()));
        return ipx2;
    }

    private ipf deW() {
        izz izz2 = new izz(this, this.mkX.mip){
            final /* synthetic */ imx mkZ;
            {
                this.mkZ = imx2;
                super(string);
            }

            public void od(String string) {
                super.od(string);
                imx.a((imx)this.mkZ).mip = string;
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tnf.bD(new Object[0]).exA().toUpperCase());
            }
        };
        izz2.dqb().b(isr.eN(0, 15), 0, false);
        izz2.dqb().L();
        izz2.dqb().a(isf.mwN, 12);
        izz2.dqb().st(true);
        this.mkY = izz2;
        return izz2;
    }

    private ipf deX() {
        return new ivb(this){
            final /* synthetic */ imx mkZ;
            {
                this.mkZ = imx2;
            }

            public void cLq() {
                imx.a((imx)this.mkZ).mip = "";
                imx.b(this.mkZ).dqb().setText(imx.a((imx)this.mkZ).mip);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tng.bD(new Object[0]).exA().toUpperCase());
            }
        };
    }

    private ipf deY() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.d(new ist(isf.mwO, 14, 0xABABAB, lxb.tmC.bD(new Object[0]).exA())));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        ipx2.W(ipx.d(ipx.a(64, 20, this.deZ())));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(this.dfa()));
        return ipx2;
    }

    private ipf deZ() {
        this.lHt = new ivd(this, this.mkX.color, lxc.tmC){
            final /* synthetic */ imx mkZ;
            {
                this.mkZ = imx2;
                super(n, lox2);
            }

            public void PW(int n) {
                imx.a((imx)this.mkZ).color = n;
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tni.bD(new Object[0]).exA().toUpperCase());
            }
        };
        return this.lHt;
    }

    private ipf dfa() {
        return new ivb(this){
            final /* synthetic */ imx mkZ;
            {
                this.mkZ = imx2;
            }

            public void cLq() {
                imx.a((imx)this.mkZ).color = 0xFFFFFF;
                imx.c(this.mkZ).setColor(imx.a((imx)this.mkZ).color);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tnj.bD(new Object[0]).exA().toUpperCase());
            }
        };
    }

    private ipf dfb() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(new iur(this){
            final /* synthetic */ imx mkZ;
            {
                this.mkZ = imx2;
            }

            public void cLq() {
                imx.d(this.mkZ);
                this.mkZ.a(imx.a(this.mkZ));
            }
        }));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ivc(this){
            final /* synthetic */ imx mkZ;
            {
                this.mkZ = imx2;
            }

            public void cLq() {
                imx.e(this.mkZ);
            }
        }));
        return ipx2;
    }

    static /* synthetic */ ilu a(imx imx2) {
        return imx2.mkX;
    }

    static /* synthetic */ izz b(imx imx2) {
        return imx2.mkY;
    }

    static /* synthetic */ ivd c(imx imx2) {
        return imx2.lHt;
    }

    static /* synthetic */ void d(imx imx2) {
        imx2.cGR();
    }

    static /* synthetic */ void e(imx imx2) {
        imx2.cGR();
    }
}

