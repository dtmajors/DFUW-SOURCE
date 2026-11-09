/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class ijx
extends ije {
    private ijz meT;

    public ijx(ijz ijz2) {
        super(ijz2, ikd.mfv);
        this.meT = ijz2;
        this.daS().o(lwx.tkS.bD(new Object[0]));
        this.W(ipx.a(1, 4, new ipf[0]));
        this.W(this.daW());
        this.W(ipx.a(1, 8, new ipf[0]));
        this.W(new ikf(ijz2));
        this.W(ipx.a(1, 6, new ipf[0]));
        this.W(this.daW());
        this.W(ipx.a(1, 4, new ipf[0]));
        this.W(ipx.l(ipx.a(22, 1, new ipf[0]), ipx.c(this.dbU()), ipx.a(16, 1, new ipf[0])));
        this.W(ipx.a(1, 8, new ipf[0]));
    }

    private ipf dbU() {
        return new iji(this, lwx.tkT.bD(new Object[0]), this.meT.dbV()){
            final /* synthetic */ ijx meU;
            {
                this.meU = ijx2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                ijx.a(this.meU).qE(bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyu.tKs.bD(new Object[0]).exA());
            }
        };
    }

    static /* synthetic */ ijz a(ijx ijx2) {
        return ijx2.meT;
    }
}

