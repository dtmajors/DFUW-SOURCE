/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class iit
extends ije {
    private iis mbI;
    private lox mbJ = null;

    public iit(iis iis2, ikd ikd2, loz loz2, boolean bl, lox lox2) {
        super(iis2, ikd2);
        this.daS().o(loz2);
        this.mbI = iis2;
        this.mbJ = lox2;
        if (bl) {
            this.W(ipx.a(1, 4, new ipf[0]));
            this.W(this.daW());
            this.W(ipx.a(1, 8, new ipf[0]));
            this.W(new ikf(iis2));
        }
        this.W(ipx.a(1, 4 + (bl ? 2 : 0), new ipf[0]));
        this.W(this.daW());
        this.W(ipx.a(1, 8, new ipf[0]));
        this.W(ipx.l(ipx.a(22, 1, new ipf[0]), ipx.c(this.dao()), ipx.a(16, 1, new ipf[0])));
        this.W(ipx.a(1, 8, new ipf[0]));
    }

    private ipf dao() {
        return new iji(this, lwx.tkK.bD(new Object[0]), this.mbI.dag()){
            final /* synthetic */ iit mbK;
            {
                this.mbK = iit2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                iit.a(this.mbK).qt(bl);
            }

            public hyn dd(int n, int n2) {
                return iit.b(this.mbK) == null ? super.dd(n, n2) : iae.oJ(iit.b(this.mbK).bD(new Object[0]).exA());
            }
        };
    }

    static /* synthetic */ iis a(iit iit2) {
        return iit2.mbI;
    }

    static /* synthetic */ lox b(iit iit2) {
        return iit2.mbJ;
    }
}

