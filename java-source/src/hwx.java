/*
 * Decompiled with CFR.
 */
public class hwx
extends ioa {
    private float liW = -1.0f;
    private float liX = -1.0f;
    private jax liY = null;
    private hwz liZ;
    private final boolean DEBUG = false;
    private ipt lja;

    public hwx() {
        super("HudNew", "HudNew.swf");
        this.OQ(-1);
        this.a(hya.lmp, true);
        this.a(jax.class.getSimpleName() + "XPOS", hsu.ldg, -1);
        this.a(jax.class.getSimpleName() + "YPOS", hsu.ldg, -1);
        this.a(jax.class.getSimpleName() + "SnapLeft", hsu.ldg, false);
        this.a(jax.class.getSimpleName() + "SnapRight", hsu.ldg, false);
        this.a(jax.class.getSimpleName() + "SnapTop", hsu.ldg, false);
        this.a(jax.class.getSimpleName() + "SnapBottom", hsu.ldg, false);
        this.a(hwz.class.getSimpleName() + "XPOS", hsu.ldg, -1);
        this.a(hwz.class.getSimpleName() + "YPOS", hsu.ldg, -1);
        this.a(hwz.class.getSimpleName() + "SnapLeft", hsu.ldg, false);
        this.a(hwz.class.getSimpleName() + "SnapRight", hsu.ldg, false);
        this.a(hwz.class.getSimpleName() + "SnapTop", hsu.ldg, false);
        this.a(hwz.class.getSimpleName() + "SnapBottom", hsu.ldg, false);
    }

    @Override
    public void cCu() {
        super.cCu();
    }

    public void f(float f2, float f3, float f4, float f5) {
        this.T(hso.cxK().cxY().dOj() - (f4 + f5), hso.cxK().cxY().TG() - (f2 + f3));
        this.R(f4, f2);
        this.cqF();
    }

    public void kg(float f2) {
        if (f2 != -1.0f) {
            if (this.liZ == null) {
                this.liZ = new hwz();
                this.dhJ().W(this.liZ);
            }
            this.liZ.setProgress(f2);
            return;
        }
        if (this.liZ != null) {
            this.liZ.removeFromParent();
            this.liZ = null;
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        hso.cxK().cxP().cyZ().lgu.c(new jlr<hwx, Double>(this, this){
            final /* synthetic */ hwx ljb;
            {
                this.ljb = hwx2;
                super(hwx3);
            }

            public void a(hwx hwx2, Double d2) {
                hwx.a(hwx2, d2);
            }

            public /* synthetic */ void h(Object object, Object object2) {
                this.a((hwx)object, (Double)object2);
            }
        });
        hso.cxK().cxP().cyZ().lgv.b(new jlq<hwx>(this, this){
            final /* synthetic */ hwx ljb;
            {
                this.ljb = hwx2;
                super(hwx3);
            }

            public void b(hwx hwx2) {
                hwx.a(hwx2);
            }

            public /* synthetic */ void R(Object object) {
                this.b((hwx)object);
            }
        });
    }

    @Override
    public boolean d(int n, int n2, String string) {
        int n3 = n - (int)this.cEE();
        int n4 = n2 - (int)this.cEF();
        ipf ipf2 = this.dhJ().ey(n3, n4);
        return ipf2 instanceof jau;
    }

    private void db(double d2) {
        assert (d2 > 0.0);
        if (this.dhJ() == null) {
            return;
        }
        if (this.liY == null) {
            this.liY = new jax();
            this.liY.ek(-100, -100);
            this.dhJ().W(this.liY);
        }
    }

    private void cCv() {
        if (this.liY != null) {
            this.liY.removeFromParent();
            this.liY = null;
        }
    }

    @Override
    protected void cCw() {
        super.cCw();
        if (this.liW == -1.0f) {
            this.liW = this.getWidth();
        }
        if (this.liX == -1.0f) {
            this.liX = this.getHeight();
        }
        this.cCx();
    }

    private void cCx() {
        if (this.liY != null) {
            this.liY.i(this.liW, this.getWidth(), this.liX, this.getHeight());
        }
        if (this.liZ != null) {
            this.liZ.i(this.liW, this.getWidth(), this.liX, this.getHeight());
        }
        this.liW = this.getWidth();
        this.liX = this.getHeight();
    }

    static /* synthetic */ void a(hwx hwx2, double d2) {
        hwx2.db(d2);
    }

    static /* synthetic */ void a(hwx hwx2) {
        hwx2.cCv();
    }
}

