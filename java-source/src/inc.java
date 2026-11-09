/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class inc
extends ihs {
    private static final String mlA = "NavigationTree";
    private boolean mlB;
    private int loG;
    private int loH;
    private boolean lBD;
    private imr mkM;
    private int mlC = 0;
    private int mlD = 0;
    private iox mlE;
    private ipx mlF;
    private inn mlG;
    private inb mlH;
    private inl mlI;
    private imw mlJ;
    private izf mlK;
    private static Map<ilq, inc> mlL = lcn.emw();

    @Override
    public void initialize() {
        super.initialize();
        mlL.put(this.mkM.dem(), this);
        ilw.ddy().miF.c((jlf<img>)new jlr<inc, img>(this, this){
            final /* synthetic */ inc mlM;
            {
                this.mlM = inc2;
                super(inc3);
            }

            public void c(inc inc2, img img2) {
                inc.a(inc2, img2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.c((inc)object, (img)object2);
            }
        });
        ilw.ddy().miG.c((jlf<img>)new jlr<inc, img>(this, this){
            final /* synthetic */ inc mlM;
            {
                this.mlM = inc2;
                super(inc3);
            }

            public void c(inc inc2, img img2) {
                inc.b(inc2, img2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.c((inc)object, (img)object2);
            }
        });
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        mlL.remove(this.mkM.dem());
    }

    public imr dfL() {
        return this.mkM;
    }

    @Override
    public boolean isOpen() {
        return this.lBD;
    }

    public void setOpen(boolean bl) {
        if (bl == this.lBD) {
            return;
        }
        this.lBD = bl;
        this.setVisible(bl);
        if (bl) {
            this.cqF();
            this.cFc();
        }
    }

    public static inc b(ilq ilq2) {
        inc inc2 = mlL.get(ilq2);
        if (inc2 == null) {
            inc2 = new inc(ilq2, ilq2);
            inc2.setGUID(hso.cxK().cxP().cyJ().getMessageDelegator().bzv());
            hso.cxK().cxP().cyJ().getMessageDelegator().a((amf)((Object)inc2));
        }
        inc2.setOpen(true);
        inc2.cqF();
        inc2.cFc();
        return inc2;
    }

    public static Map<ilq, inc> dfM() {
        return Collections.unmodifiableMap(mlL);
    }

    public hxd cBs() {
        return this.mkM.der().cBs();
    }

    protected inc(ilq ilq2, ilq ilq3, boolean bl) {
        super(hso.cxK().cxP().nQ("InventoryWindow" + ilq2.ddG()), "InventoryWindow.swf");
        this.OQ(jnz.nGe | jnz.nGi | jnz.nGp);
        this.mlB = bl;
        this.loG = hso.cxK().cxP().bpb() - 32;
        this.loH = hso.cxK().cxP().bpc() - 32;
        this.mkM = new imr(ilq2);
        this.mkM.mkt.b(new jlq<inc>(this, this){
            final /* synthetic */ inc mlM;
            {
                this.mlM = inc2;
                super(inc3);
            }

            public void c(inc inc2) {
                inc.a(inc2, inc.a(this.mlM).deu());
            }

            public /* synthetic */ void R(Object object) {
                this.c((inc)object);
            }
        });
        this.U(300.0f, 150.0f);
        this.qo(true);
        this.a(mlA, hsu.ldg, this.mkM.dem().ddi() || this.mkM.dem().ddk() || this.mkM.dem().auG());
        imm imm2 = inc.cyJ().cIG().cPZ();
        imq.a(this, imm2);
        this.mkM.b(imm2);
        ilw.ddy().miD.c((jlf<ilx>)new jlr<inc, ilx>(this, this){
            final /* synthetic */ inc mlM;
            {
                this.mlM = inc2;
                super(inc3);
            }

            public void b(inc inc2, ilx ilx2) {
                inc.a(inc2, ilx2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.b((inc)object, (ilx)object2);
            }
        });
        ilw.ddy().miC.a((jlg<ilq, ilx>)new jls<inc, ilq, ilx>(this, this){
            final /* synthetic */ inc mlM;
            {
                this.mlM = inc2;
                super(inc3);
            }

            public void b(inc inc2, ilq ilq2, ilx ilx2) {
                inc.a(inc2, ilq2, ilx2);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.b((inc)object, (ilq)object2, (ilx)object3);
            }
        });
    }

    protected inc(ilq ilq2, ilq ilq3) {
        this(ilq2, ilq3, false);
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.cKJ();
        this.Rz(3);
        this.RA(3);
        this.dG(3, 2);
        this.cXE().W(this.cGT());
        this.cXE().W(ipx.c(1, 1, 1, 1, this.cGU(), this.dfV()));
    }

    @Override
    protected void cGQ() {
        super.cGQ();
        this.dfX();
        this.qS(this.nk(mlA));
        if (this.mlB) {
            this.dfY();
        }
    }

    @Override
    protected void cGo() {
        super.cGo();
        if (!this.mlB) {
            hxd hxd2 = this.mkM.dem().cBs();
            if (hxd2 != null && hxd2.alX() != bqm.b.dEP) {
                if (hxd2.alX() != bqm.b.dEn) {
                    joa joa2 = inc.cyJ().cIA();
                    this.h(joa2.X + 64.0f, joa2.Y, joa2.W - 128.0f, joa2.H / 2.0f - 8.0f);
                    inc.cyJ().cJg().h(joa2.X + 64.0f, joa2.Y + joa2.H / 2.0f + 8.0f, joa2.W - 128.0f, joa2.H / 2.0f - 8.0f);
                } else {
                    joa joa3 = inc.cFj().cxY();
                    int n = 500;
                    int n2 = 400;
                    float f = joa3.W / 2.0f - (float)(n / 2);
                    float f2 = joa3.H / 2.0f - (float)(n2 / 2);
                    this.h(f, f2, n, n2);
                }
            }
        } else {
            this.dfY();
        }
    }

    @Override
    protected void b(jnz jnz2, jnz jnz3) {
        super.b(jnz2, jnz3);
        if (this != inc.cyJ().cJg() && jnz3 == jnz.nFE && this.mkM.dem().ddT()) {
            this.close();
        }
    }

    @Override
    protected void cGR() {
        hxd hxd2 = this.mkM.dem().cBs();
        if (hxd2 != null) {
            switch (hxd2.alX()) {
                case dEn: {
                    inc.cyJ().cHw().a(hyc.lmI, false);
                    break;
                }
                case dEP: {
                    super.cGR();
                    break;
                }
                default: {
                    this.mkM.dem().cBs().cCT();
                    break;
                }
            }
        } else {
            super.cGR();
        }
    }

    private void cKJ() {
        this.a(null, 0, 0, 0, this.mkM.dem().ddF(), null);
        this.cXM().cYp().b(new iqa("/dfdata/texture/gui/j2f/chat/header/window_header_chat.png", 1, 1, 110, 1));
        ivp ivp2 = new ivp(this){
            final /* synthetic */ inc mlM;
            {
                this.mlM = inc2;
            }

            public void pn(boolean bl) {
                inc.a(this.mlM, bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxb.tmW.bD(new Object[0]).exA().toUpperCase());
            }
        };
        this.mlE = ivp2;
        this.cXM().a(ivp2, 0);
    }

    private ipf cGT() {
        return ipx.h(new ipk(this, 0x161616){
            final /* synthetic */ inc mlM;
            {
                this.mlM = inc2;
                super(n);
            }

            public void kh(float f) {
                this.hz(f);
            }
        }, new iwy());
    }

    private ipf cGU() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.a(1, 2, new ipf[0]));
        ipx2.W(this.dfN());
        ipx2.W(ipx.a(1, 1, new ipf[0]));
        ipx2.W(ipx.l(ipx.a(3, 1, new ipf[0]), ipx.c(new ipk(0x313131, 200, 1)), ipx.a(3, 1, new ipf[0])));
        ipx2.W(ipx.a(1, 3, new ipf[0]));
        ipx2.W(ipx.c(this.dfO()));
        return ipx2;
    }

    private ipf dfN() {
        this.mlH = new inb(this, this.mkM){
            final /* synthetic */ inc mlM;
            {
                this.mlM = inc2;
                super(imr2);
            }

            public void b(imm imm2, boolean bl, boolean bl2) {
                inc.a(this.mlM, imm2, bl, bl2);
            }

            public void qC(String string) {
                inc.a(this.mlM, string);
            }
        };
        return this.mlH;
    }

    private ipf dfO() {
        irk irk2 = new irk(ire.muk, 2);
        irk2.RE(4);
        irk2.a(this.dfP(), new irh(128));
        irk2.b((ipf)ipx.c(this.dfR()), new irh(256));
        return irk2;
    }

    private ipf dfP() {
        ipx ipx2;
        this.mlF = ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.c(this.dfQ()));
        return ipx2;
    }

    private ipf dfQ() {
        this.mlG = new inn(this.mkM);
        return this.mlG;
    }

    private ipf cKP() {
        return ipx.a(256, 32, ipx.h(new ipk(0xFF0000), new ist(isf.mwO, 12, 0xABABAB, "TODO: Filters")));
    }

    private ipf dfR() {
        ipx ipx2 = ipx.j(new ipf[0]);
        ipx2.W(ipx.c(this.dfS()));
        ipx2.W(ipx.a(1, 3, new ipf[0]));
        ipx2.W(this.dfU());
        ipx2.W(ipx.a(1, 3, new ipf[0]));
        return ipx2;
    }

    private ipf dfS() {
        return ipx.c(3, 0, 3, 0, new ipk(this, this.mkM.dem().ddj()){
            final /* synthetic */ inc mlM;
            {
                this.mlM = inc2;
                super(n);
            }

            public void kh(float f) {
                this.hz(f);
            }
        }, this.dfT());
    }

    private ipf dfT() {
        this.mlI = new inl(this, this.mkM){
            final /* synthetic */ inc mlM;
            {
                this.mlM = inc2;
                super(imr2);
            }

            public void cXg() {
                inc.b(this.mlM);
            }
        };
        this.mlI.sA(true);
        this.mlI.Td(2);
        return this.mlI;
    }

    private ipf dfU() {
        this.mlJ = new imw(this.mkM);
        return this.mlJ;
    }

    private ipf dfV() {
        this.mlK = new izf();
        this.mlK.setVisible(false);
        return this.mlK;
    }

    private void dfW() {
        this.mlJ.bu(this.mlI.drp());
    }

    private void qS(boolean bl) {
        this.mlE.hX(bl);
        this.mlF.setVisible(bl);
        this.q(mlA, bl);
    }

    private void c(ilq ilq2, ilx ilx2) {
        if (this.mkM.dem().f(ilx2)) {
            this.close();
        }
    }

    private void c(imm imm2, boolean bl, boolean bl2) {
        this.mkM.b(imm2);
        this.mlI.pack();
        if (bl) {
            List list = inc.cxP().czz();
            for (inc inc2 : list) {
                inc2.c(imm2, false, false);
            }
        }
        if (bl2) {
            inc.cyJ().cIG().a(imm2);
        }
    }

    private void qF(String string) {
        this.mlI.qJ(string);
    }

    private void a(img img2) {
        if (this.mkM.der().f(img2)) {
            if (this.mlC == 1) {
                this.mlK.start();
            }
            ++this.mlC;
            this.mlK.dv((float)this.mlD / (float)this.mlC);
        }
    }

    private void b(img img2) {
        if (this.mkM.der().f(img2)) {
            ++this.mlD;
            this.mlK.dv((float)this.mlD / (float)this.mlC);
            if (this.mlD >= this.mlC) {
                this.mlK.stop();
                this.mlC = 0;
                this.mlD = 0;
            }
        }
    }

    private void dfX() {
        imm imm2 = new imm();
        imq.b(this, imm2);
        this.mkM.b(imm2);
    }

    private void c(imm imm2) {
        if (this.isInitialized()) {
            imq.c(this, imm2);
        }
    }

    private void g(ilx ilx2) {
        if (ilx2 == this.mkM.dem()) {
            this.cXM().A(ilx2.ddF());
        }
    }

    private void dfY() {
        this.Z(this.loG, this.loH);
    }

    static /* synthetic */ void a(inc inc2, img img2) {
        inc2.a(img2);
    }

    static /* synthetic */ void b(inc inc2, img img2) {
        inc2.b(img2);
    }

    static /* synthetic */ imr a(inc inc2) {
        return inc2.mkM;
    }

    static /* synthetic */ void a(inc inc2, imm imm2) {
        inc2.c(imm2);
    }

    static /* synthetic */ void a(inc inc2, ilx ilx2) {
        inc2.g(ilx2);
    }

    static /* synthetic */ void a(inc inc2, ilq ilq2, ilx ilx2) {
        inc2.c(ilq2, ilx2);
    }

    static /* synthetic */ void a(inc inc2, boolean bl) {
        inc2.qS(bl);
    }

    static /* synthetic */ void a(inc inc2, imm imm2, boolean bl, boolean bl2) {
        inc2.c(imm2, bl, bl2);
    }

    static /* synthetic */ void a(inc inc2, String string) {
        inc2.qF(string);
    }

    static /* synthetic */ void b(inc inc2) {
        inc2.dfW();
    }
}

