/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  ibp
 */
public class icx
extends ihm {
    private icw lIo;
    private boolean lIp;
    private boolean lGg;
    private boolean lIq = true;
    private ios lIr;
    private isv lIs;
    private hzz lIt;

    public icx(ibp ibp2, joa joa2, icw icw2) {
        super("ChatOptionsWindow", "ChatWindow.swf", (ioa)ibp2, joa2, 2, 3);
        this.lIo = icw2;
        ibp2.cMU().doG().doQ().rF(true);
    }

    @Override
    public void cCu() {
        iox iox2;
        Object object2;
        super.cCu();
        this.p(34, 0, 32, 70);
        this.cXC().f(lvw.tbi);
        this.cXC().QT(8);
        this.cXC().QU(6);
        this.cXE().W(ipx.a(1, 11, new ipf[0]));
        this.cXE().W(new izx(lvw.rUn.bD(new Object[0]).exA() + ":"));
        this.cXE().W(ipx.a(1, 2, new ipf[0]));
        ipx ipx2 = ipx.l(new ipf[0]);
        this.cXE().W(ipx2);
        ipx2.W(ipx.a(11, 1, new ipf[0]));
        izy izy2 = new izy(lvw.lOI);
        izy2.a(ite.myG);
        ipx2.W(izy2);
        izy izy3 = new izy(lvw.tbj.bD(3, 20).exA());
        izy3.zY(10);
        ipx2.W(ipx.d(izy3));
        ipx2.W(ipx.a(4, 1, new ipf[0]));
        this.lIs = new itg(this, "/dfdata/texture/gui/j2f/common/textfields/text_field_shorter_01.png", 4, 4, 4, 4){
            final /* synthetic */ icx lIu;
            {
                this.lIu = icx2;
                super(string, n, n2, n3, n4);
            }

            public void od(String string) {
                icx.a((icx)this.lIu).name = string;
            }

            public void v(String string, boolean bl) {
                this.lIu.pO(bl);
            }
        };
        this.lIs.setText(this.lIo.name);
        ipx2.W(ipx.c(new ipf[]{this.lIs}));
        ipx2.W(ipx.a(16, 1, new ipf[0]));
        this.lIs.dqb().b(isr.eN(3, 20), 1, true);
        this.lIs.dqb().sp(true);
        this.lIs.dqb().L();
        this.cFc();
        this.cXE().W(ipx.a(1, 7, new ipf[0]));
        this.cOc();
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        ipx ipx3 = ipx.l(new ipf[0]);
        this.cXE().W(ipx3);
        ipx3.W(ipx.a(11, 1, new ipf[0]));
        izy izy4 = new izy(lvw.tbk);
        ipx3.W(izy4);
        this.cXE().W(ipx.a(1, 9, new ipf[0]));
        iou<icu> iou2 = new iou<icu>(this){
            final /* synthetic */ icx lIu;
            {
                this.lIu = icx2;
            }

            public void a(icu icu2) {
                icx.a((icx)this.lIu).lIi = icu2;
            }

            public /* synthetic */ void S(Object object) {
                this.a((icu)((Object)object));
            }
        };
        int n = 0;
        while (n < icu.values().length) {
            if (n > 0) {
                this.cXE().W(ipx.a(1, 11, new ipf[0]));
            }
            object2 = ipx.l(new ipf[0]);
            this.cXE().W((ipf)object2);
            ((iph)object2).W(ipx.a(14, 1, new ipf[0]));
            int n2 = 0;
            while (n2 < 7) {
                if (n2 > 0) {
                    ((iph)object2).W(ipx.a(13, 1, new ipf[0]));
                }
                iox2 = new icv(iou2, icu.values()[n]);
                ((iph)object2).W(iox2);
                ++n2;
                ++n;
            }
            ((iph)object2).W(ipx.a(20, 1, new ipf[0]));
        }
        iou2.setValue(this.lIo.lIi);
        this.cXE().W(ipx.a(1, 17, new ipf[0]));
        this.cOc();
        this.cXE().W(ipx.a(1, 6, new ipf[0]));
        ipx ipx4 = ipx.l(new ipf[0]);
        this.cXE().W(ipx4);
        ipx4.W(ipx.a(11, 1, new ipf[0]));
        ipx4.W(new izy(lvw.tbl));
        ipx4.W(ipx.c(new ipf[0]));
        object2 = new iou<idb>(this){
            final /* synthetic */ icx lIu;
            {
                this.lIu = icx2;
            }

            public void a(idb idb2) {
                icx.a((icx)this.lIu).lIj = idb2;
            }

            public /* synthetic */ void S(Object object) {
                this.a((idb)((Object)object));
            }
        };
        ipx4.W(ipx.d(new icz(this, (iou)object2){
            final /* synthetic */ icx lIu;
            {
                this.lIu = icx2;
                super(iou2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lvw.tbM.bD(new Object[0]).exA());
            }
        }));
        ipx4.W(ipx.a(8, 1, new ipf[0]));
        ipx4.W(ipx.d(new icy(this, (iou)object2){
            final /* synthetic */ icx lIu;
            {
                this.lIu = icx2;
                super(iou2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lvw.tbL.bD(new Object[0]).exA());
            }
        }));
        ipx4.W(ipx.a(8, 1, new ipf[0]));
        ipx4.W(ipx.d(new ida(this, (iou)object2){
            final /* synthetic */ icx lIu;
            {
                this.lIu = icx2;
                super(iou2);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lvw.tbN.bD(new Object[0]).exA());
            }
        }));
        ipx4.W(ipx.a(16, 1, new ipf[0]));
        ((iou)object2).setValue(this.lIo.lIj);
        this.cXE().W(ipx.a(1, 6, new ipf[0]));
        ipx ipx5 = ipx.l(new ipf[0]);
        this.cXE().W(ipx5);
        ipx5.W(ipx.a(11, 1, new ipf[0]));
        ipx5.W(new izy(lvw.tbm));
        ipx5.W(ipx.c(new ipf[0]));
        ipx5.W(new iwx(1, 24));
        ipx5.W(ipx.a(8, 1, new ipf[0]));
        iox2 = new iuy(this, this.lIo.lIk){
            final /* synthetic */ icx lIu;
            {
                this.lIu = icx2;
                super(bl);
            }

            public void pn(boolean bl) {
                icx.a((icx)this.lIu).lIk = bl;
            }
        };
        ipx5.W(iox2);
        ipx5.W(ipx.a(16, 1, new ipf[0]));
        this.cXE().W(ipx.a(1, 6, new ipf[0]));
        ipx ipx6 = ipx.l(new ipf[0]);
        this.cXE().W(ipx6);
        ipx6.W(ipx.a(11, 1, new ipf[0]));
        ipx6.W(new izy(lvw.tbn));
        ipx6.W(ipx.c(new ipf[0]));
        ipx6.W(new iwx(1, 24));
        ipx6.W(ipx.a(8, 1, new ipf[0]));
        iuy iuy2 = new iuy(this, this.lIo.lIl){
            final /* synthetic */ icx lIu;
            {
                this.lIu = icx2;
                super(bl);
            }

            public void pn(boolean bl) {
                icx.a((icx)this.lIu).lIl = bl;
            }
        };
        ipx6.W(iuy2);
        ipx6.W(ipx.a(16, 1, new ipf[0]));
        this.cXE().W(ipx.a(1, 8, new ipf[0]));
        this.cOc();
        this.cXE().W(ipx.a(1, 10, new ipf[0]));
        ipx ipx7 = ipx.l(new ipf[0]);
        this.cXE().W(ipx7);
        ipx7.W(ipx.a(11, 1, new ipf[0]));
        ipx7.W(new izy(lvw.tbo));
        ipx7.W(ipx.c(new ipf[0]));
        ivd ivd2 = new ivd(this, this.lIo.lIn, lvw.tbw){
            final /* synthetic */ icx lIu;
            {
                this.lIu = icx2;
                super(n, lox2);
            }

            public void PW(int n) {
                icx.a((icx)this.lIu).lIn = n;
            }
        };
        ipx7.W(ivd2);
        ipx7.W(ipx.a(8, 1, new ipf[0]));
        ipx7.W(new iwx(1, 24));
        ipx7.W(ipx.a(8, 1, new ipf[0]));
        iuy iuy3 = new iuy(this, this.lIo.lIm){
            final /* synthetic */ icx lIu;
            {
                this.lIu = icx2;
                super(bl);
            }

            public void pn(boolean bl) {
                icx.a((icx)this.lIu).lIm = bl;
            }
        };
        ipx7.W(iuy3);
        ipx7.W(ipx.a(16, 1, new ipf[0]));
        this.cXE().W(ipx.a(1, 9, new ipf[0]));
        this.cOc();
        this.cXE().W(ipx.a(1, 3, new ipf[0]));
        this.cXE().W(new izx(lvw.tbf.bD(new Object[0]).exA() + ":"));
        ixd ixd2 = new ixd();
        this.cXE().W(ipx.a(new a(null), ixd2));
        for (ibs object3 : ibz.cNn()) {
            if (!object3.cNv()) continue;
            icr icr2 = this.lIo.lGf.get(object3);
            ixd2.Z(new icq(object3, this.lIo));
        }
        this.cXE().W(ipx.a(1, 7, new ipf[0]));
        this.cOc();
        this.cXE().W(ipx.a(1, 4, new ipf[0]));
        this.cXE().W(new izx(lvw.tbp.bD(new Object[0]).exA() + ":"));
        ipx ipx8 = ipx.l(new ipf[0]);
        this.cXE().W(ipx8);
        ipx8.W(ipx.a(12, 1, new ipf[0]));
        ipx8.W(new izy(lvw.tbq));
        ipx8.W(ipx.c(new ipf[0]));
        ipx8.W(new iwx(1, 24));
        ipx8.W(ipx.a(8, 1, new ipf[0]));
        iuy iuy4 = new iuy(this){
            final /* synthetic */ icx lIu;
            {
                this.lIu = icx2;
            }

            public void pn(boolean bl) {
                icx.a(this.lIu, bl);
            }
        };
        ipx8.W(iuy4);
        ipx8.W(ipx.a(16, 1, new ipf[0]));
        this.cXE().W(ipx.a(1, 2, new ipf[0]));
        ipx ipx9 = ipx.l(new ipf[0]);
        this.cXE().W(ipx9);
        ipx9.W(ipx.a(12, 1, new ipf[0]));
        ipx9.W(new izy(lvw.tbr));
        ipx9.W(ipx.c(new ipf[0]));
        ipx9.W(new iwx(1, 24));
        ipx9.W(ipx.a(8, 1, new ipf[0]));
        ipx9.W(new iuy(this, iuy4){
            final /* synthetic */ iuy lIv;
            final /* synthetic */ icx lIu;
            {
                this.lIu = icx2;
                this.lIv = iuy2;
            }

            public void pn(boolean bl) {
                if (bl) {
                    this.lIv.hX(true);
                }
                icx.b(this.lIu, bl);
            }
        });
        ipx9.W(ipx.a(16, 1, new ipf[0]));
        this.cXE().W(ipx.a(1, 6, new ipf[0]));
        ipx ipx10 = ipx.l(new ipf[0]);
        this.cXE().W(ipx10);
        ipx10.W(ipx.c(new ipf[0]));
        this.lIr = new iur(this){
            final /* synthetic */ icx lIu;
            {
                this.lIu = icx2;
            }

            public void cLq() {
                if (icx.b(this.lIu)) {
                    this.lIu.close();
                    this.lIu.a(icx.a(this.lIu), icx.c(this.lIu), icx.d(this.lIu));
                }
            }
        };
        ipx10.W(ipx.d(this.lIr));
        ipx10.W(ipx.a(3, 1, new ipf[0]));
        ipx10.W(ipx.d(new ivc(this){
            final /* synthetic */ icx lIu;
            {
                this.lIu = icx2;
            }

            public void cLq() {
                this.lIu.close();
            }
        }));
        ipx10.W(ipx.a(3, 1, new ipf[0]));
        this.cXE().W(ipx.a(1, 101, new ipf[0]));
    }

    @Override
    protected ipf cMs() {
        iqa iqa2 = new iqa("/dfdata/texture/gui/j2f/chat/popups/window_popup_bg_tab_options.png", 36, 30, 227, 132);
        iqa2.a(iqb.mtp);
        return iqa2;
    }

    protected void a(icw icw2, boolean bl, boolean bl2) {
    }

    private void cOc() {
        ipx ipx2 = ipx.l(new ipf[0]);
        this.cXE().W(ipx2);
        ipx2.W(ipx.a(5, 1, new ipf[0]));
        ipx2.W(ipx.a(305, 1, new iwx()));
        ipx2.W(ipx.a(12, 1, new ipf[0]));
    }

    protected void pO(boolean bl) {
        this.lIq = bl;
        this.lIr.rF(bl);
        if (bl) {
            this.lIq = true;
            this.lIs.dqb().Rk(0);
            this.lIr.rF(true);
            if (this.lIt != null) {
                this.lIt.getMessageDelegator().hd(this.lIt.getGUID());
                this.lIt = null;
            }
        } else {
            this.lIq = false;
            this.lIs.dqb().Rk(0xFF0000);
            this.lIr.rF(false);
            if (this.lIt == null) {
                ioc ioc2 = this.lIs.eo(0, 0);
                this.lIt = new hzz(ioc2.cf, ioc2.cg, this.lIs.getWidth(), this.lIs.getHeight(), true, lvw.tbP.bD(new Object[0]).exA().toUpperCase());
                icx.cxP().k((hyn)this.lIt);
            }
        }
    }

    static /* synthetic */ icw a(icx icx2) {
        return icx2.lIo;
    }

    static /* synthetic */ boolean a(icx icx2, boolean bl) {
        icx2.lIp = bl;
        return icx2.lIp;
    }

    static /* synthetic */ boolean b(icx icx2, boolean bl) {
        icx2.lGg = bl;
        return icx2.lGg;
    }

    static /* synthetic */ boolean b(icx icx2) {
        return icx2.lIq;
    }

    static /* synthetic */ boolean c(icx icx2) {
        return icx2.lIp;
    }

    static /* synthetic */ boolean d(icx icx2) {
        return icx2.lGg;
    }
}

