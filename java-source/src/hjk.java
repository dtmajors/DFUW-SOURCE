/*
 * Decompiled with CFR.
 */
public class hjk {
    public static final lfo ct = hbe.jAM;
    private final lha<dxq, dxq> cdh;
    private final hjh kck;
    private final ldl kzl = new ldl();
    private final lbi<ffr> kzm = new lbi<ffr>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hjk kzo;
        {
            this.kzo = hjk2;
        }

        public void a(ffr ffr2) {
            if (!$assertionsDisabled && hjk.a(this.kzo) != null) {
                throw new AssertionError();
            }
            hjk.a(this.kzo, ffr2.iLk);
            hjk.b(this.kzo).enp();
        }

        public /* synthetic */ void m(Object object) {
            this.a((ffr)object);
        }

        static {
            $assertionsDisabled = !hjk.class.desiredAssertionStatus();
        }
    };
    private final lbi<gaz> kzn = new lbi<gaz>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hjk kzo;
        {
            this.kzo = hjk2;
        }

        public void a(gaz gaz2) {
            if (!$assertionsDisabled && !lda.by(gaz2)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && hjk.a(this.kzo) == null) {
                throw new AssertionError();
            }
            hjk.a(this.kzo, null);
            hjk.b(this.kzo).enp();
        }

        public /* synthetic */ void m(Object object) {
            this.a((gaz)object);
        }

        static {
            $assertionsDisabled = !hjk.class.desiredAssertionStatus();
        }
    };
    private hcn[] iLk;

    public hjk(lha<dxq, dxq> lha2, hjh hjh2) {
        this.cdh = lha2;
        this.kck = hjh2;
        this.mU(true);
    }

    public void dispose() {
        this.mU(false);
        assert (this.kzl.isEmpty());
    }

    public final boolean cnA() {
        return this.iLk != null;
    }

    public final hcn[] bOT() {
        assert (this.cnA());
        return this.iLk;
    }

    public final lbl<lbn> cnB() {
        return this.kzl;
    }

    public final void MT(int n) {
        assert (this.cnA());
        gaw gaw2 = gaw.d(this.cdh.rng);
        gaw2.on(this.kck.hC);
        gaw2.jcL = n;
        this.cdh.rnh.m(gaw2);
    }

    public final void cnC() {
        assert (this.cnA());
        gba gba2 = gba.l(this.cdh.rng, this.kck.hC);
        this.cdh.rnh.m(gba2);
    }

    private void mU(boolean bl) {
        this.cdh.rex.a(bl, ffr.class, this.kzm);
        this.cdh.rex.a(bl, gaz.class, this.kzn);
    }

    static /* synthetic */ hcn[] a(hjk hjk2) {
        return hjk2.iLk;
    }

    static /* synthetic */ hcn[] a(hjk hjk2, hcn[] hcnArray) {
        hjk2.iLk = hcnArray;
        return hcnArray;
    }

    static /* synthetic */ ldl b(hjk hjk2) {
        return hjk2.kzl;
    }
}

