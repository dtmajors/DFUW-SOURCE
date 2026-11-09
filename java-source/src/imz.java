/*
 * Decompiled with CFR.
 */
public class imz
extends ihm {
    private imm mkD;
    private boolean mlh;
    private boolean mli;

    public imz(ioa ioa2, joa joa2, imm imm2) {
        super("InventoryOptionsPopupWindow", "J2FWindow.swf", ioa2, joa2, 1, 3);
        this.mkD = imm2.dej();
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.p(16, 2, 16, 76);
        this.cXC().setVisible(false);
        this.cXE().a(iqo.dmT());
        this.cXE().W(ipx.a(1, 8, new ipf[0]));
        this.cXE().W(new ist(isf.mwO, 18, 12357465, lxd.tnB.bD(new Object[0])));
        iou<imj> iou2 = new iou<imj>(this, this.mkD.mjN){
            final /* synthetic */ imz mlj;
            {
                this.mlj = imz2;
                super(imj2);
            }

            public void a(imj imj2) {
                imz.a((imz)this.mlj).mjN = imj2;
            }

            public /* synthetic */ void S(Object object) {
                this.a((imj)((Object)object));
            }
        };
        for (imj imj2 : imj.values()) {
            this.cXE().W(ipx.a(1, 4, new ipf[0]));
            this.cXE().W(this.a(iou2, imj2));
        }
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(new ipk(0x313131, 200, 1));
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(new ist(isf.mwO, 18, 12357465, lxd.tnF.bD(new Object[0])));
        iou<iml> iou3 = new iou<iml>(this, this.mkD.mjO){
            final /* synthetic */ imz mlj;
            {
                this.mlj = imz2;
                super(iml2);
            }

            public void a(iml iml2) {
                imz.a((imz)this.mlj).mjO = iml2;
            }

            public /* synthetic */ void S(Object object) {
                this.a((iml)((Object)object));
            }
        };
        for (iml iml2 : iml.values()) {
            this.cXE().W(ipx.a(1, 4, new ipf[0]));
            this.cXE().W(this.a(iou3, iml2));
        }
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(new ipk(0x313131, 200, 1));
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(new ist(isf.mwO, 18, 12357465, lxd.tnG.bD(new Object[0])));
        iou<imk> iou4 = new iou<imk>(this, this.mkD.mjP){
            final /* synthetic */ imz mlj;
            {
                this.mlj = imz2;
                super(imk2);
            }

            public void a(imk imk2) {
                imz.a((imz)this.mlj).mjP = imk2;
            }

            public /* synthetic */ void S(Object object) {
                this.a((imk)((Object)object));
            }
        };
        for (imk imk2 : imk.values()) {
            this.cXE().W(ipx.a(1, 4, new ipf[0]));
            this.cXE().W(this.a(iou4, imk2));
        }
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(new ipk(0x313131, 200, 1));
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(new ist(isf.mwO, 18, 12357465, lxd.tnH.bD(new Object[0])));
        this.cXE().W(this.dfh());
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(this.dfi());
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(this.dfj());
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(this.dfk());
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(this.dfl());
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(new ipk(0x313131, 200, 1));
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(this.dfm());
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(this.dfn());
        this.cXE().W(ipx.a(1, 8, new ipf[0]));
        this.cXE().W(this.dfb());
        this.cXE().W(ipx.a(1, 51, new ipf[0]));
    }

    @Override
    protected ipf cMs() {
        return new iqa("/dfdata/texture/gui/j2f/inventory/options/inv_bg_options.png", 46, 4, 166, 76, iqb.mtp);
    }

    protected void a(imm imm2, boolean bl, boolean bl2) {
    }

    private ipf a(iou<imj> iou2, imj imj2) {
        return new iom<imj>(iou2, imj2, imj2.cQp().bD(new Object[0]).exA());
    }

    private ipf a(iou<iml> iou2, iml iml2) {
        return new iom<iml>(iou2, iml2, iml2.cQp().bD(new Object[0]).exA());
    }

    private ipf a(iou<imk> iou2, imk imk2) {
        return new iom<imk>(iou2, imk2, imk2.cQp().bD(new Object[0]).exA());
    }

    private ipf dfh() {
        return new iuz(this, lxd.tnK.bD(new Object[0]), this.mkD.mjQ){
            final /* synthetic */ imz mlj;
            {
                this.mlj = imz2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                imz.a((imz)this.mlj).mjQ = bl;
            }
        };
    }

    private ipf dfi() {
        return new iuz(this, lxd.tnL.bD(new Object[0]), this.mkD.mjR){
            final /* synthetic */ imz mlj;
            {
                this.mlj = imz2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                imz.a((imz)this.mlj).mjR = bl;
            }
        };
    }

    private ipf dfj() {
        return new iuz(this, lxd.tnM.bD(new Object[0]), this.mkD.mjS){
            final /* synthetic */ imz mlj;
            {
                this.mlj = imz2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                imz.a((imz)this.mlj).mjS = bl;
            }
        };
    }

    private ipf dfk() {
        return new iuz(this, lxd.tnN.bD(new Object[0]), this.mkD.mjT){
            final /* synthetic */ imz mlj;
            {
                this.mlj = imz2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                imz.a((imz)this.mlj).mjT = bl;
            }
        };
    }

    private ipf dfl() {
        return new iuz(this, lxd.tnO.bD(new Object[0]), this.mkD.mjU){
            final /* synthetic */ imz mlj;
            {
                this.mlj = imz2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                imz.a((imz)this.mlj).mjU = bl;
            }
        };
    }

    private ipf dfm() {
        return new iuz(this, lxd.tnP.bD(new Object[0]), false){
            final /* synthetic */ imz mlj;
            {
                this.mlj = imz2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                imz.a(this.mlj, bl);
            }
        };
    }

    private ipf dfn() {
        return new iuz(this, lxd.tnQ.bD(new Object[0]), false){
            final /* synthetic */ imz mlj;
            {
                this.mlj = imz2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                imz.b(this.mlj, bl);
            }
        };
    }

    private ipf dfb() {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(ipx.d(new iur(this){
            final /* synthetic */ imz mlj;
            {
                this.mlj = imz2;
            }

            public void cLq() {
                imz.b(this.mlj);
                this.mlj.a(imz.a(this.mlj).dej(), imz.c(this.mlj), imz.d(this.mlj));
            }
        }));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(ipx.d(new ivc(this){
            final /* synthetic */ imz mlj;
            {
                this.mlj = imz2;
            }

            public void cLq() {
                imz.e(this.mlj);
            }
        }));
        return ipx2;
    }

    static /* synthetic */ imm a(imz imz2) {
        return imz2.mkD;
    }

    static /* synthetic */ boolean a(imz imz2, boolean bl) {
        imz2.mlh = bl;
        return imz2.mlh;
    }

    static /* synthetic */ boolean b(imz imz2, boolean bl) {
        imz2.mli = bl;
        return imz2.mli;
    }

    static /* synthetic */ void b(imz imz2) {
        imz2.cGR();
    }

    static /* synthetic */ boolean c(imz imz2) {
        return imz2.mlh;
    }

    static /* synthetic */ boolean d(imz imz2) {
        return imz2.mli;
    }

    static /* synthetic */ void e(imz imz2) {
        imz2.cGR();
    }
}

