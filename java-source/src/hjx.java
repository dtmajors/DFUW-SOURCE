/*
 * Decompiled with CFR.
 */
public class hjx {
    public static final lfo ct = hbe.jAM;
    private final lha<dxq, dxq> cdh;
    private final ldl kBd = new ldl();
    private final lbi<ffk> kBe = new lbi<ffk>(this){
        final /* synthetic */ hjx kBk;
        {
            this.kBk = hjx2;
        }

        public void a(ffk ffk2) {
            boolean bl = false;
            if (hjx.a(this.kBk) != ffk2.iKY) {
                hjx.a(this.kBk, ffk2.iKY);
                bl = true;
            }
            if (hjx.a(this.kBk)) {
                Object[] objectArray = ffk2.DR;
                if (!lin.a(objectArray, hjx.b(this.kBk))) {
                    hjx.a(this.kBk, (ej[])objectArray);
                    bl = true;
                }
                if (ffk2.ResourceType != (hjx.c(this.kBk) == null ? -1 : hjx.c((hjx)this.kBk).Type)) {
                    hjx.a(this.kBk, hdw.LW(ffk2.ResourceType));
                    bl = true;
                }
                if (!ldq.ai(ffk2.dNb, hjx.d(this.kBk))) {
                    hjx.a(this.kBk, ffk2.dNb);
                    bl = true;
                }
                if (ffk2.iKZ != hjx.e(this.kBk)) {
                    hjx.b(this.kBk, ffk2.iKZ);
                    bl = true;
                }
            }
            if (bl) {
                hjx.f(this.kBk).enp();
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((ffk)object);
        }
    };
    private boolean kBf;
    private ej[] kBg;
    private hdw kBh;
    private float kBi;
    private boolean kBj;

    public hjx(lha<dxq, dxq> lha2) {
        this.cdh = lha2;
        this.mU(true);
    }

    public void dispose() {
        this.mU(false);
        assert (this.kBd.isEmpty());
    }

    public final lbl<lbn> coy() {
        return this.kBd;
    }

    public final ej[] coz() {
        return this.kBg;
    }

    public final hdw coA() {
        return this.kBh;
    }

    public final boolean coB() {
        return this.kBj;
    }

    public final float coC() {
        return this.kBi;
    }

    public final boolean coD() {
        return this.kBf;
    }

    private void mU(boolean bl) {
        this.cdh.rex.a(bl, ffk.class, this.kBe);
    }

    static /* synthetic */ boolean a(hjx hjx2) {
        return hjx2.kBf;
    }

    static /* synthetic */ boolean a(hjx hjx2, boolean bl) {
        hjx2.kBf = bl;
        return hjx2.kBf;
    }

    static /* synthetic */ ej[] b(hjx hjx2) {
        return hjx2.kBg;
    }

    static /* synthetic */ ej[] a(hjx hjx2, ej[] ejArray) {
        hjx2.kBg = ejArray;
        return ejArray;
    }

    static /* synthetic */ hdw c(hjx hjx2) {
        return hjx2.kBh;
    }

    static /* synthetic */ hdw a(hjx hjx2, hdw hdw2) {
        hjx2.kBh = hdw2;
        return hjx2.kBh;
    }

    static /* synthetic */ float d(hjx hjx2) {
        return hjx2.kBi;
    }

    static /* synthetic */ float a(hjx hjx2, float f2) {
        hjx2.kBi = f2;
        return hjx2.kBi;
    }

    static /* synthetic */ boolean e(hjx hjx2) {
        return hjx2.kBj;
    }

    static /* synthetic */ boolean b(hjx hjx2, boolean bl) {
        hjx2.kBj = bl;
        return hjx2.kBj;
    }

    static /* synthetic */ ldl f(hjx hjx2) {
        return hjx2.kBd;
    }
}

