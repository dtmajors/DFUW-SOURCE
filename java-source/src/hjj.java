/*
 * Decompiled with CFR.
 */
public class hjj {
    public static final lfo ct = hbe.jAM;
    private final lha<dxq, dxq> cdh;
    private final ldl kzh = new ldl();
    private final lbi<esp> kzi = new lbi<esp>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hjj kzk;
        {
            this.kzk = hjj2;
        }

        public void a(esp esp2) {
            if (!$assertionsDisabled && !hjj.a(this.kzk)) {
                throw new AssertionError();
            }
            hjj.a(this.kzk, esp2.iBt);
            hjj.b(this.kzk).enp();
        }

        public /* synthetic */ void m(Object object) {
            this.a((esp)object);
        }

        static {
            $assertionsDisabled = !hjj.class.desiredAssertionStatus();
        }
    };
    private boolean Initialized;
    private bdq[] kzj = new bdq[0];

    public hjj(lha<dxq, dxq> lha2) {
        this.cdh = lha2;
        this.mU(true);
        this.Initialized = true;
    }

    public void dispose() {
        assert (this.Initialized);
        this.mU(false);
        assert (this.kzh.isEmpty());
        this.Initialized = false;
    }

    public final lbl<lbn> cny() {
        return this.kzh;
    }

    public final void a(bdv bdv2) {
        this.cdh.rnh.m(esw.a(this.cdh.rng, bdv2));
    }

    public final bdq[] cnz() {
        return this.kzj;
    }

    private void mU(boolean bl) {
        this.cdh.rex.a(bl, esp.class, this.kzi);
    }

    static /* synthetic */ boolean a(hjj hjj2) {
        return hjj2.Initialized;
    }

    static /* synthetic */ bdq[] a(hjj hjj2, bdq[] bdqArray) {
        hjj2.kzj = bdqArray;
        return bdqArray;
    }

    static /* synthetic */ ldl b(hjj hjj2) {
        return hjj2.kzh;
    }
}

