/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class ili
extends ije {
    private ilk mhD;

    public ili(ilk ilk2) {
        super(ilk2, ikd.mfA);
        this.mhD = ilk2;
        this.daS().o(lwx.tkW.bD(new Object[0]));
        this.W(ipx.a(1, 4, new ipf[0]));
        this.W(this.daW());
        this.W(ipx.a(1, 8, new ipf[0]));
        this.W(new ikf(ilk2));
        this.W(ipx.a(1, 6, new ipf[0]));
        this.W(this.daW());
        this.W(ipx.a(1, 8, new ipf[0]));
        this.W(ipx.l(ipx.a(22, 1, new ipf[0]), ipx.c(this.dcT()), ipx.a(16, 1, new ipf[0])));
        this.W(ipx.a(1, 8, new ipf[0]));
        this.W(ipx.l(ipx.a(22, 1, new ipf[0]), ipx.c(this.dcU()), ipx.a(16, 1, new ipf[0])));
        this.W(ipx.a(1, 8, new ipf[0]));
    }

    private ipf dcT() {
        return new iji(this, lwx.tkX.bD(new Object[0]), this.mhD.dcV()){
            final /* synthetic */ ili mhE;
            {
                this.mhE = ili2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                ili.a(this.mhE).qN(bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyu.tKC.bD(new Object[0]).exA());
            }
        };
    }

    private ipf dcU() {
        return new iji(this, lwx.tkY.bD(new Object[0]), this.mhD.dcW()){
            final /* synthetic */ ili mhE;
            {
                this.mhE = ili2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                ili.a(this.mhE).qO(bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyu.tKD.bD(new Object[0]).exA());
            }
        };
    }

    static /* synthetic */ ilk a(ili ili2) {
        return ili2.mhD;
    }
}

