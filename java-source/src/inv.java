/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class inv
extends ioa {
    private loz mni;
    private int mnj;
    private int mnk;
    private int lzn;
    private int lzo;
    private boolean mnl;

    public inv(loz loz2, int n, int n2, int n3, int n4) {
        super("J2FConfirmationWindow", "J2FConfirmationWindow.swf");
        this.OQ(-1);
        this.a(hya.lmp, true);
        this.mni = loz2;
        this.mnj = n;
        this.mnk = n2 - 14;
        this.lzn = n3;
        this.lzo = n4;
        joa joa2 = hso.cxK().cxY();
        int n5 = (int)(joa2.X + joa2.W / 2.0f);
        this.mnl = this.mnj >= n5;
    }

    public static void a(loz loz2, hyr hyr2) {
        hyn hyn2 = hso.cxK().cxP().czj();
        inv inv2 = new inv(loz2, hso.cxK().cxP().bpb(), hso.cxK().cxP().bpc(), 0, 0, hyr2, hyn2){
            final /* synthetic */ hyr lyF;
            final /* synthetic */ hyn mnm;
            {
                this.lyF = hyr2;
                this.mnm = hyn2;
                super(loz2, n, n2, n3, n4);
            }

            public void oH(boolean bl) {
                this.lyF.oH(bl);
                if (this.mnm != null) {
                    this.mnm.cFc();
                }
            }
        };
        inv2.setGUID(hso.cxK().cxP().cyJ().getMessageDelegator().bzv());
        hso.cxK().cxP().cyJ().getMessageDelegator().a((amf)((Object)inv2));
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.dhJ().a(iqo.dmS());
        if (!this.mnl) {
            this.dhJ().W(this.n("side_tooltip2", 20, 30));
        } else {
            this.dhJ().W(this.n("side_tooltip", 40, 10));
        }
        this.pack();
        this.cFc();
        this.cEZ();
    }

    @Override
    protected void cKg() {
        super.cKg();
        if (!this.mnl) {
            this.R(this.mnj + this.lzn, this.mnk + this.lzo / 2);
        } else {
            this.R((float)this.mnj - this.cFw() - (float)this.lzn, this.mnk + this.lzo / 2);
        }
    }

    @Override
    protected void b(jnz jnz2, jnz jnz3) {
        this.cKo();
    }

    @Override
    protected void g(int n, int n2, String string) {
        if (this.d(n, n2, string)) {
            super.g(n, n2, string);
        } else {
            this.cKo();
        }
    }

    @Override
    protected void j(int n, int n2, String string) {
        if (this.d(n, n2, string)) {
            super.j(n, n2, string);
        } else {
            this.cKo();
        }
    }

    protected void oH(boolean bl) {
    }

    @Override
    protected boolean oN(String string) {
        if (string.equals("Y") || string.equals("ENTER") || string.equals("RETURN")) {
            this.qT(true);
            return true;
        }
        if (string.equals("N") || string.equals("ESCAPE")) {
            this.qT(false);
            return true;
        }
        return false;
    }

    private ipf n(String string, int n, int n2) {
        ipx ipx2 = ipx.h(new ipf[0]);
        ipx2.W(new iqa(string, n, 0, n2, 0));
        ipx2.W(ipx.l(ipx.a(n, 1, new ipf[0]), ipx.j(ipx.a(1, 6, new ipf[0]), this.cPo()), ipx.a(8, 1, new ipf[0]), ipx.j(ipx.a(1, 8, new ipf[0]), this.cZn()), ipx.a(n2, 1, new ipf[0])));
        return ipx2;
    }

    private ipf cPo() {
        return new ist(isf.mwM, 12, 0xFFFFFF, this.mni);
    }

    private ipf cZn() {
        ios ios2 = new ios(this){
            final /* synthetic */ inv mnn;
            {
                this.mnn = inv2;
            }

            public void cLq() {
                inv.a(this.mnn, true);
            }
        };
        ios2.t(new iop(new ipb("background_disabled"), new ipb("foreground_disabled")));
        ios2.u(new iop(new ipb("background_up"), new ipb("foreground_up")));
        ios2.v(new iop(new ipb("background_over"), new ipb("foreground_over")));
        ios2.w(new iop(new ipb("background_down"), new ipb("foreground_down")));
        return ios2;
    }

    private void qT(boolean bl) {
        this.cFa();
        this.MessageDelegator.hd(this.getGUID());
        this.oH(bl);
    }

    private void cKo() {
        this.qT(false);
    }

    static /* synthetic */ void a(inv inv2, boolean bl) {
        inv2.qT(bl);
    }
}

