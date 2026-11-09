/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class iki
extends ije {
    private ikl mfW;

    public iki(ikl ikl2) {
        super(ikl2, ikd.mfw);
        this.mfW = ikl2;
        this.daS().o(lwx.tkU.bD(new Object[0]));
        this.W(ipx.a(1, 4, new ipf[0]));
        this.W(this.daW());
        this.W(ipx.a(1, 8, new ipf[0]));
        this.W(new ikf(ikl2));
        this.W(ipx.a(1, 6, new ipf[0]));
        this.W(this.daW());
        this.W(ipx.a(1, 6, new ipf[0]));
        this.W(ipx.l(ipx.a(22, 1, new ipf[0]), ipx.c(this.dcn()), ipx.a(16, 1, new ipf[0])));
        this.W(ipx.a(1, 3, new ipf[0]));
        this.W(ipx.l(ipx.a(22, 1, new ipf[0]), ipx.c(this.dco()), ipx.a(16, 1, new ipf[0])));
        this.W(ipx.a(1, 8, new ipf[0]));
    }

    private ipf dcn() {
        return new iji(this, lwx.tkV.bD(new Object[0]), this.mfW.dcr()){
            final /* synthetic */ iki mfX;
            {
                this.mfX = iki2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                iki.a(this.mfX).qH(bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyu.tKx.bD(new Object[0]).exA());
            }
        };
    }

    private ipf dco() {
        return new iji(this, lwx.teH.bD(new Object[0]), this.mfW.dcs()){
            final /* synthetic */ iki mfX;
            {
                this.mfX = iki2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                iki.a(this.mfX).qI(bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyu.tKy.bD(new Object[0]).exA());
            }
        };
    }

    static /* synthetic */ ikl a(iki iki2) {
        return iki2.mfW;
    }
}

