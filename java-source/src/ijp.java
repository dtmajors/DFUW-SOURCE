/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class ijp
extends ije {
    private ijm mer;
    private iou<ijo> mes;

    public ijp(ijm ijm2) {
        super(ijm2, ikd.mft);
        this.mer = ijm2;
        this.daS().o(lwx.tky.bD(new Object[0]));
        this.W(ipx.a(1, 4, new ipf[0]));
        this.W(this.daW());
        this.W(ipx.a(1, 8, new ipf[0]));
        this.W(new ikf(ijm2));
        this.W(ipx.a(1, 6, new ipf[0]));
        this.W(this.daW());
        this.W(ipx.a(1, 4, new ipf[0]));
        this.W(ipx.l(ipx.a(19, 1, new ipf[0]), new ist(isf.mwO, 14, 0xABABAB, lwx.tkB.bD(new Object[0])), ipx.c(new ipf[0])));
        this.W(ipx.a(1, 9, new ipf[0]));
        this.dbz();
        this.W(ipx.a(1, 11, new ipf[0]));
        this.W(this.daW());
        this.W(ipx.a(1, 6, new ipf[0]));
        this.W(ipx.l(ipx.a(22, 1, new ipf[0]), ipx.c(this.dbC()), ipx.a(16, 1, new ipf[0])));
        this.W(ipx.a(1, 3, new ipf[0]));
        this.W(ipx.l(ipx.a(22, 1, new ipf[0]), ipx.c(this.dbD()), ipx.a(16, 1, new ipf[0])));
        this.W(ipx.a(1, 3, new ipf[0]));
        this.W(ipx.l(ipx.a(22, 1, new ipf[0]), ipx.c(this.dbE()), ipx.a(16, 1, new ipf[0])));
        this.W(ipx.a(1, 3, new ipf[0]));
        this.W(ipx.l(ipx.a(22, 1, new ipf[0]), ipx.c(this.dbF()), ipx.a(16, 1, new ipf[0])));
        this.W(ipx.a(1, 3, new ipf[0]));
        this.W(ipx.l(ipx.a(22, 1, new ipf[0]), ipx.c(this.dbG()), ipx.a(16, 1, new ipf[0])));
        this.W(ipx.a(1, 8, new ipf[0]));
    }

    private void dbz() {
        this.mes = new iou<ijo>(this){
            final /* synthetic */ ijp met;
            {
                this.met = ijp2;
            }

            public void b(ijo ijo2) {
                ijp.a(this.met).a(ijo2);
            }

            public /* synthetic */ void S(Object object) {
                this.b((ijo)((Object)object));
            }
        };
        this.W(this.dbA());
        this.W(ipx.a(1, 11, new ipf[0]));
        this.W(this.dbB());
        this.mes.setInitialValue(this.mer.dbf());
    }

    private ipf dbA() {
        return this.ea(0, 4);
    }

    private ipf dbB() {
        return this.ea(5, 9);
    }

    private ipf ea(int n, int n2) {
        ipx ipx2 = ipx.l(new ipf[0]);
        ipx2.W(ipx.a(28, 1, new ipf[0]));
        for (int i = n; i <= n2; ++i) {
            if (i > n) {
                ipx2.W(ipx.a(20, 1, new ipf[0]));
            }
            ipx2.W(new ijn(this.mes, ijo.values()[i]));
        }
        ipx2.W(ipx.a(16, 1, new ipf[0]));
        return ipx2;
    }

    private ipf dbC() {
        return new iji(this, lwx.tkD.bD(new Object[0]), this.mer.dbj()){
            final /* synthetic */ ijp met;
            {
                this.met = ijp2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                ijp.a(this.met).qz(bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyu.tKn.bD(new Object[0]).exA());
            }
        };
    }

    private ipf dbD() {
        return new iji(this, lwx.tkE.bD(new Object[0]), this.mer.dbk()){
            final /* synthetic */ ijp met;
            {
                this.met = ijp2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                ijp.a(this.met).qA(bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyu.tKo.bD(new Object[0]).exA());
            }
        };
    }

    private ipf dbE() {
        return new iji(this, lwx.tkF.bD(new Object[0]), !this.mer.dbg()){
            final /* synthetic */ ijp met;
            {
                this.met = ijp2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                ijp.a(this.met).qw(!bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyu.tKp.bD(new Object[0]).exA());
            }
        };
    }

    private ipf dbF() {
        return new iji(this, lwx.tkG.bD(new Object[0]), this.mer.dbi()){
            final /* synthetic */ ijp met;
            {
                this.met = ijp2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                ijp.a(this.met).qy(bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyu.tKq.bD(new Object[0]).exA());
            }
        };
    }

    private ipf dbG() {
        return new iji(this, lwx.tkH.bD(new Object[0]), !this.mer.dbh()){
            final /* synthetic */ ijp met;
            {
                this.met = ijp2;
                super(loz2, bl);
            }

            public void pn(boolean bl) {
                ijp.a(this.met).qx(!bl);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lyu.tKr.bD(new Object[0]).exA());
            }
        };
    }

    static /* synthetic */ ijm a(ijp ijp2) {
        return ijp2.mer;
    }
}

