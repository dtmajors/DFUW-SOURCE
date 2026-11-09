/*
 * Decompiled with CFR.
 */
public class ihq
extends ihu {
    private ipx lUt;

    public ihq() {
        this.a(irl.dnr());
        this.W(new ihp());
        this.lUt = ipx.l(new ipf[0]);
        this.W(ipx.j(ipx.a(1, 2, new ipf[0]), this.lUt));
    }

    @Override
    public void a(ioo ioo2, int n) {
        if (n == this.bfn() && n - 1 >= 0) {
            a a2 = (a)this.lUt.RO(n - 1);
            a2.lWy.setVisible(true);
        }
        this.lUt.c(new a(ioo2, n < this.bfn()), n);
    }

    @Override
    public void QS(int n) {
        if (n == this.bfn() - 1 && n - 1 >= 0) {
            a a2 = (a)this.lUt.RO(n - 1);
            a2.lWy.setVisible(false);
        }
        this.lUt.RP(n);
    }
}

