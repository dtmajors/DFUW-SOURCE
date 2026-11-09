/*
 * Decompiled with CFR.
 */
public class ibq
extends ihy {
    private boolean lGg;

    public ibq(ihs ihs2, joa joa2, float f, float f2) {
        super("ChatWindowFrameOptions", "ChatWindow.swf", ihs2, joa2, f, f2);
    }

    public boolean cNm() {
        return this.lGg;
    }

    @Override
    public void cCu() {
        super.cCu();
        this.cYJ().W(new izx(lvw.tbp.bD(new Object[0]).exA() + ":"));
        this.cYJ().W(ipx.a(1, 2, new ipf[0]));
        ipx ipx2 = ipx.l(new ipf[0]);
        this.cYJ().W(ipx2);
        ipx2.W(ipx.a(12, 1, new ipf[0]));
        ipx2.W(new izy(lvw.tbr));
        ipx2.W(ipx.c(new ipf[0]));
        ipx2.W(new iwx(1, 24));
        ipx2.W(ipx.a(8, 1, new ipf[0]));
        ipx2.W(new iuy(this){
            final /* synthetic */ ibq lGh;
            {
                this.lGh = ibq2;
            }

            public void pn(boolean bl) {
                ibq.a(this.lGh, bl);
            }
        });
        ipx2.W(ipx.a(12, 1, new ipf[0]));
        this.cYJ().W(ipx.a(1, 8, new ipf[0]));
        this.cYK().setVisible(true);
    }

    static /* synthetic */ boolean a(ibq ibq2, boolean bl) {
        ibq2.lGg = bl;
        return ibq2.lGg;
    }
}

