/*
 * Decompiled with CFR.
 */
public class ina
extends ihm {
    private imn mlk;

    public ina(ioa ioa2, joa joa2, imn imn2) {
        super("InventorySortOptionsPopupWindow", "J2FWindow.swf", ioa2, joa2, 1, 3);
        this.mlk = imn2.dek();
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.p(40, 0, 40, 66);
        this.cXC().setVisible(false);
        this.cXE().a(iqo.dmT());
        this.cXE().W(ipx.a(1, 8, new ipf[0]));
        this.cXE().W(this.dfo());
        this.cXE().W(ipx.a(1, 8, new ipf[0]));
        this.cXE().W(this.cZm());
        this.cXE().W(ipx.a(1, 40, new ipf[0]));
        this.pack();
    }

    @Override
    protected ipf cMs() {
        return new iqa("/dfdata/texture/gui/j2f/inventory/sort/inv_bg_sort.png", 40, 3, 203, 66, iqb.mtp);
    }

    protected void b(imn imn2) {
    }

    private ipf dfo() {
        ipx ipx2 = ipx.l(new ipf[0]);
        for (int i = 0; i < 3; ++i) {
            if (i > 0) {
                ipx2.W(ipx.a(8, 1, new ipf[0]));
                ipx2.W(ipx.c(new ipk(0x313131, 1, 1)));
                ipx2.W(ipx.a(8, 1, new ipf[0]));
            }
            ipx2.W(this.Rt(i));
        }
        return ipx2;
    }

    private ipf Rt(int n) {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.d(new ist(isf.mwO, 18, 12357465, lxe.tnS.bD(Character.toString((char)(65 + n))).exA())));
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        iou<imp> iou2 = new iou<imp>(this, this.mlk.mjW[n], n){
            final /* synthetic */ int mhh;
            final /* synthetic */ ina mll;
            {
                this.mll = ina2;
                this.mhh = n;
                super(imp2);
            }

            public void a(imp imp2) {
                ina.a((ina)this.mll).mjW[this.mhh] = imp2;
            }

            public /* synthetic */ void S(Object object) {
                this.a((imp)((Object)object));
            }
        };
        for (imp imp2 : imp.values()) {
            if (imp2.ordinal() > 0) {
                // empty if block
            }
            ipx2.W(this.a(iou2, imp2));
        }
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        ipx2.W(new ipk(0x313131, 1, 1));
        ipx2.W(ipx.a(1, 8, new ipf[0]));
        iou<imo> iou3 = new iou<imo>(this, this.mlk.mjX[n], n){
            final /* synthetic */ int mhh;
            final /* synthetic */ ina mll;
            {
                this.mll = ina2;
                this.mhh = n;
                super(imo2);
            }

            public void a(imo imo2) {
                ina.a((ina)this.mll).mjX[this.mhh] = imo2;
            }

            public /* synthetic */ void S(Object object) {
                this.a((imo)((Object)object));
            }
        };
        for (imo imo2 : imo.values()) {
            if (imo2.ordinal() > 0) {
                // empty if block
            }
            ipx2.W(this.a(iou3, imo2));
        }
        return ipx2;
    }

    private ipf a(iou<imp> iou2, imp imp2) {
        return new iom<imp>(iou2, imp2, imp2.cQp().bD(new Object[0]).exA());
    }

    private ipf a(iou<imo> iou2, imo imo2) {
        return new iom<imo>(iou2, imo2, imo2.cQp().bD(new Object[0]).exA());
    }

    private ipf cZm() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(new iur(this){
            final /* synthetic */ ina mll;
            {
                this.mll = ina2;
            }

            public void cLq() {
                ina.b(this.mll);
                this.mll.b(ina.a(this.mll).dek());
            }
        }));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ivc(this){
            final /* synthetic */ ina mll;
            {
                this.mll = ina2;
            }

            public void cLq() {
                ina.c(this.mll);
            }
        }));
        ipx2.W(ipx.a(5, 1, new ipf[0]));
        return ipx2;
    }

    static /* synthetic */ imn a(ina ina2) {
        return ina2.mlk;
    }

    static /* synthetic */ void b(ina ina2) {
        ina2.cGR();
    }

    static /* synthetic */ void c(ina ina2) {
        ina2.cGR();
    }
}

