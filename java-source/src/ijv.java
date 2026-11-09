/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class ijv
extends ije {
    private iju meP;

    public ijv(iju iju2) {
        super(iju2, ikd.mfB, false);
        this.meP = iju2;
        this.daS().o(lwx.tld.bD(new Object[0]));
        this.W(ipx.a(1, 4, new ipf[0]));
        this.W(this.daW());
        this.W(ipx.a(1, 8, new ipf[0]));
        this.W(new ikf(iju2));
        this.W(ipx.a(1, 6, new ipf[0]));
        this.W(this.daW());
        this.W(ipx.a(1, 4, new ipf[0]));
        this.W(ipx.l(ipx.a(22, 1, new ipf[0]), ipx.c(this.dbM()), ipx.a(16, 1, new ipf[0])));
        this.W(ipx.a(1, 3, new ipf[0]));
        this.W(ipx.l(ipx.a(22, 1, new ipf[0]), ipx.c(this.dbN()), ipx.a(16, 1, new ipf[0])));
        this.W(ipx.a(1, 3, new ipf[0]));
        this.W(ipx.l(ipx.a(22, 1, new ipf[0]), ipx.c(this.dbO()), ipx.a(16, 1, new ipf[0])));
        this.W(ipx.a(1, 8, new ipf[0]));
    }

    private ipf dbM() {
        return new iji(this, lwx.tlf.bD(new Object[0]), this.meP.dbJ()){
            final /* synthetic */ ijv meQ;
            {
                this.meQ = ijv2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                ijv.a(this.meQ).qB(bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyu.tKZ.bD(new Object[0]).exA());
            }
        };
    }

    private ipf dbN() {
        return new iji(this, lwx.tlg.bD(new Object[0]), this.meP.dbK()){
            final /* synthetic */ ijv meQ;
            {
                this.meQ = ijv2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                ijv.a(this.meQ).qC(bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyu.tLa.bD(new Object[0]).exA());
            }
        };
    }

    private ipf dbO() {
        return new iji(this, lwx.tlh.bD(new Object[0]), this.meP.dbL()){
            final /* synthetic */ ijv meQ;
            {
                this.meQ = ijv2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                ijv.a(this.meQ).qD(bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyu.tLb.bD(new Object[0]).exA());
            }
        };
    }

    static /* synthetic */ iju a(ijv ijv2) {
        return ijv2.meP;
    }
}

