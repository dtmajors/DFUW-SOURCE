/*
 * Decompiled with CFR.
 */
public class hjm {
    public static final lfo ct = hbe.jAM;
    private final lha<dxq, dxq> cdh;
    private final hjh kck;
    private final hjg kce;
    private final ldl kzx = new ldl();
    private final ldl kzy = new ldl();
    private final lbi<gap> kzz = new lbi<gap>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hjm kzD;
        {
            this.kzD = hjm2;
        }

        public void b(gap gap2) {
            if (!$assertionsDisabled && hjm.a(this.kzD) != null) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && gap2.fBi == -1) {
                throw new AssertionError();
            }
            hdx hdx2 = hdx.LX(gap2.fBi);
            hjm.a(this.kzD, gap2.aO(), hdx2);
        }

        public /* synthetic */ void m(Object object) {
            this.b((gap)object);
        }

        static {
            $assertionsDisabled = !hjm.class.desiredAssertionStatus();
        }
    };
    private final lbn klX = new lbn(this){
        final /* synthetic */ hjm kzD;
        {
            this.kzD = hjm2;
        }

        public final void W() {
            hjm.b(this.kzD);
        }
    };
    private ldv kzA;
    private hdx kzB;
    private boolean kzC;

    public hjm(lha<dxq, dxq> lha2, hjh hjh2, hjg hjg2) {
        this.cdh = lha2;
        this.kck = hjh2;
        this.kce = hjg2;
        this.mU(true);
    }

    public void dispose() {
        this.mU(false);
        assert (this.kzx.isEmpty());
    }

    public final boolean d(gbb gbb2) {
        if (this.kzA == null) {
            return false;
        }
        if (!gbb2.aO().equals(this.kzA)) {
            return false;
        }
        this.kzB = null;
        this.kzx.enp();
        return true;
    }

    public final boolean cnJ() {
        return this.kzB != null;
    }

    public final hdx cnK() {
        assert (this.cnJ());
        return this.kzB;
    }

    public final boolean b(lij<hdw> lij2, hea hea2, hdw hdw2) {
        hdw hdw3 = lij2.ab(hdw2);
        if (hdw3 == null) {
            return this.b(hea2, hdw2);
        }
        while (hdw3 != null) {
            if (this.b(lij2, hea2, hdw3)) {
                return true;
            }
            hdw3 = lij2.ac(hdw3);
        }
        return false;
    }

    public final boolean b(hea hea2, hdw hdw2) {
        return hea2 != null && hdw2 != null;
    }

    public final void cnL() {
        gbc gbc2 = gbc.m(this.cdh.rng, this.kck.hC);
        gbc2.jcN = true;
        this.cdh.rnh.m(gbc2);
    }

    public final lbl<lbn> cnM() {
        return this.kzx;
    }

    public final lbl<lbn> cnN() {
        return this.kzy;
    }

    public final void f(hdx hdx2) {
        gjt gjt2 = gjt.e(this.cdh.rng);
        gjt2.SkillType = hdx2.Type;
        gjt2.on(this.kck.hC);
        this.cdh.rnh.m(gjt2);
    }

    public final boolean cnO() {
        return this.kzC;
    }

    private void a(ldv ldv2, hdx hdx2) {
        this.kzA = ldv2;
        this.kzB = hdx2;
        this.kzx.enp();
    }

    private void cip() {
        boolean bl = false;
        hcf hcf2 = this.kce.cmX();
        if (hcf2.jFl && hcf2.jFk.kaW.b(hdx.kbI)) {
            bl = true;
        }
        if (bl != this.kzC) {
            this.kzC = bl;
            this.cnP();
        }
    }

    private void cnP() {
        this.kzy.enp();
    }

    private void mU(boolean bl) {
        this.cdh.rex.a(bl, gap.class, this.kzz);
        this.kce.cmW().a(bl, this.klX);
    }

    static /* synthetic */ hdx a(hjm hjm2) {
        return hjm2.kzB;
    }

    static /* synthetic */ void a(hjm hjm2, ldv ldv2, hdx hdx2) {
        hjm2.a(ldv2, hdx2);
    }

    static /* synthetic */ void b(hjm hjm2) {
        hjm2.cip();
    }
}

