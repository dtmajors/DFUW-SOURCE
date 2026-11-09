/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.Map;

public class jga
extends ipx {
    private ios mYC;
    private ipx mYD;
    private Map<jew, jfy> mYE = lcn.emw();
    private jfy mYF;

    public jga() {
        this.a(iqo.dmS());
        this.W(ipx.a(15, 1, new ipf[0]));
        this.W(ipx.d(this.dCo()));
        this.W(ipx.a(15, 1, new ipf[0]));
        this.W(new ipk(0x313131, 1, 49));
        this.W(this.dCp());
        this.W(ipx.c(new ipf[0]));
        jen.dzL().mVd.a((jlg<jew, Integer>)new jls<jga, jew, Integer>(this, this){
            final /* synthetic */ jga mYG;
            {
                this.mYG = jga2;
                super(jga3);
            }

            public void e(jga jga2, jew jew2, Integer n) {
                jga.a(jga2, jew2, n);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.e((jga)object, (jew)object2, (Integer)object3);
            }
        });
        jen.dzL().mVg.a((jlg<jew, Integer>)new jls<jga, jew, Integer>(this, this){
            final /* synthetic */ jga mYG;
            {
                this.mYG = jga2;
                super(jga3);
            }

            public void e(jga jga2, jew jew2, Integer n) {
                jga.b(jga2, jew2, n);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.e((jga)object, (jew)object2, (Integer)object3);
            }
        });
        jen.dzL().mVe.a((jlg<jew, Integer>)new jls<jga, jew, Integer>(this, this){
            final /* synthetic */ jga mYG;
            {
                this.mYG = jga2;
                super(jga3);
            }

            public void e(jga jga2, jew jew2, Integer n) {
                jga.c(jga2, jew2, n);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.e((jga)object, (jew)object2, (Integer)object3);
            }
        });
        jen.dzL().mVj.a((jlg<jew, Integer>)new jls<jga, jew, Integer>(this, this){
            final /* synthetic */ jga mYG;
            {
                this.mYG = jga2;
                super(jga3);
            }

            public void e(jga jga2, jew jew2, Integer n) {
                jga.d(jga2, jew2, n);
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.e((jga)object, (jew)object2, (Integer)object3);
            }
        });
        jen.dzL().mVk.a((jlg<jew, Integer>)new jls<jga, jew, Integer>(this, this){
            final /* synthetic */ jga mYG;
            {
                this.mYG = jga2;
                super(jga3);
            }

            public void e(jga jga2, jew jew2, Integer n) {
                ((jfy)jga.a(this.mYG).get(jew2)).sG(jew2.dzG());
            }

            public /* synthetic */ void a(Object object, Object object2, Object object3) {
                this.e((jga)object, (jew)object2, (Integer)object3);
            }
        });
        for (int i = 0; i < 10; ++i) {
            jew jew2 = jen.dzL().dzN().Uj(i);
            if (jew2 == null) continue;
            this.c(jew2, (Integer)i);
        }
        if (jen.dzL().dzN().dAk() != null) {
            this.e(jen.dzL().dzN().dAk(), (Integer)jen.dzL().dzN().dAk().dzZ());
        }
    }

    public void dBZ() {
        for (jfy jfy2 : this.mYE.values()) {
            jfy2.dBZ();
        }
    }

    private ipf dCo() {
        this.mYC = new jfw(this){
            final /* synthetic */ jga mYG;
            {
                this.mYG = jga2;
            }

            public void cLq() {
                jga.b(this.mYG);
            }

            public hyn dd(int n, int n2) {
                return iae.oJ(lxx.tzS.bD(new Object[0]).exA());
            }
        };
        return this.mYC;
    }

    private ipf dCp() {
        this.mYD = ipx.l(new ipf[0]);
        return this.mYD;
    }

    private void a(jew jew2, boolean bl) {
        jfy jfy2 = new jfy(jew2, bl);
        this.mYE.put(jew2, jfy2);
        this.mYD.W(jfy2);
        this.dCr();
        this.dCs();
    }

    private void dCq() {
        jew jew2 = new jew();
        jen.dzL().dzN().e(jew2);
        jen.dzL().dzN().h(jew2);
    }

    private void b(jew jew2, Integer n) {
        this.a(jew2, true);
    }

    private void c(jew jew2, Integer n) {
        this.a(jew2, false);
    }

    private void d(jew jew2, Integer n) {
        jfy jfy2 = this.mYE.remove(jew2);
        jfy2.removeFromParent();
        this.dCs();
        if (jfy2 == this.mYF) {
            this.mYF = null;
        }
        this.dCr();
    }

    private void dCr() {
        boolean bl = true;
        jfy jfy2 = null;
        jfy jfy3 = null;
        for (int i = 0; i < this.mYD.bfn(); ++i) {
            ipf ipf2 = this.mYD.RO(i);
            if (!(ipf2 instanceof jfy)) continue;
            jfy jfy4 = (jfy)ipf2;
            if (jfy4.dBY().isActive()) {
                jfy2 = jfy4;
            }
            if (bl) {
                jfy4.tk(false);
                bl = false;
            } else {
                jfy4.tk(jfy3 != jfy2);
            }
            jfy3 = jfy4;
        }
    }

    private void e(jew jew2, Integer n) {
        jfy jfy2;
        jfy jfy3 = jfy2 = jew2 != null ? this.mYE.get(jew2) : null;
        if (jfy2 == this.mYF) {
            return;
        }
        if (this.mYF != null) {
            this.mYF.tj(false);
        }
        this.mYF = jfy2;
        if (this.mYF != null) {
            this.mYF.tj(true);
        }
        this.dCr();
    }

    private void dCs() {
        this.mYC.rF(jen.dzL().dzN().dAj() < 10);
    }

    static /* synthetic */ void a(jga jga2, jew jew2, Integer n) {
        jga2.b(jew2, n);
    }

    static /* synthetic */ void b(jga jga2, jew jew2, Integer n) {
        jga2.c(jew2, n);
    }

    static /* synthetic */ void c(jga jga2, jew jew2, Integer n) {
        jga2.d(jew2, n);
    }

    static /* synthetic */ void d(jga jga2, jew jew2, Integer n) {
        jga2.e(jew2, n);
    }

    static /* synthetic */ Map a(jga jga2) {
        return jga2.mYE;
    }

    static /* synthetic */ void b(jga jga2) {
        jga2.dCq();
    }
}

