/*
 * Decompiled with CFR.
 */
public class hna {
    public static final hbe jzX = hbe.jAM;
    private final lbh kAz;
    protected final hmr jEN;
    private final float kMU;
    private final float kMV;
    private final lbn jEL = new lbn(this){
        final /* synthetic */ hna kMY;
        {
            this.kMY = hna2;
        }

        public final void W() {
            if (!hna.a(this.kMY)) {
                return;
            }
            double d2 = hna.b(this.kMY).emc();
            float f2 = hna.c(this.kMY) > hna.d(this.kMY) ? hna.e(this.kMY) : hna.f(this.kMY);
            float f3 = (float)((double)f2 * d2);
            hna.a(this.kMY, f3);
        }
    };
    private boolean jLT;
    private float kMW = 1.0f;
    private float kMX = 1.0f;
    private boolean aME;

    public hna(lbh lbh2, hmr hmr2, float f2, float f3) {
        this.kAz = lbh2;
        this.jEN = hmr2;
        this.kMU = f2;
        this.kMV = f3;
        this.mU(true);
        this.jLT = true;
    }

    public final void dispose() {
        assert (this.jLT);
        this.kb(this.kMW);
        this.crF();
        this.mU(false);
        this.jLT = false;
    }

    public final void nX(boolean bl) {
        assert (this.jLT);
        this.jZ(bl ? 1.0f : 0.0f);
    }

    public final boolean isVisible() {
        assert (this.jLT);
        return this.kMW == 1.0f;
    }

    private void jZ(float f2) {
        if (ldq.ai(f2, this.kMW)) {
            return;
        }
        this.kMW = f2;
        this.crD();
    }

    private void crD() {
        this.crF();
    }

    private void ka(float f2) {
        float f3 = f2 >= Math.abs(this.kMW - this.kMX) ? this.kMW : (this.kMW < this.kMX ? this.kMX - f2 : this.kMX + f2);
        this.kb(f3);
    }

    private void kb(float f2) {
        if (ldq.ai(f2, this.kMX)) {
            return;
        }
        this.kMX = f2;
        this.crE();
    }

    private void crE() {
        this.jEN.J(new lcq(1.0f, 1.0f, 1.0f, this.kMX));
        this.crF();
    }

    private void crF() {
        if (!ldq.ai(this.kMX, this.kMW)) {
            if (!this.aME) {
                this.kAz.eme().a(true, this.jEL);
                this.aME = true;
            }
        } else if (this.aME) {
            this.kAz.eme().a(false, this.jEL);
            this.aME = false;
        }
        assert (this.kAz.eme().a(this.jEL) == !ldq.ai(this.kMX, this.kMW));
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }

    static /* synthetic */ boolean a(hna hna2) {
        return hna2.jLT;
    }

    static /* synthetic */ lbh b(hna hna2) {
        return hna2.kAz;
    }

    static /* synthetic */ float c(hna hna2) {
        return hna2.kMW;
    }

    static /* synthetic */ float d(hna hna2) {
        return hna2.kMX;
    }

    static /* synthetic */ float e(hna hna2) {
        return hna2.kMU;
    }

    static /* synthetic */ float f(hna hna2) {
        return hna2.kMV;
    }

    static /* synthetic */ void a(hna hna2, float f2) {
        hna2.ka(f2);
    }
}

