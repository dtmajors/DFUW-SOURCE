/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 */
import java.util.List;

public abstract class hes
extends hen {
    private final lbn kfO = new lbn(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ hes kfR;
        {
            this.kfR = hes2;
        }

        public final void W() {
            if (!$assertionsDisabled && !hes.a(this.kfR)) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && hes.b(this.kfR) == null) {
                throw new AssertionError();
            }
            hes.a(this.kfR, false);
            hes.a(this.kfR, null);
        }

        static {
            $assertionsDisabled = !hes.class.desiredAssertionStatus();
        }
    };
    private final lbn kfP = new lbn(this){
        final /* synthetic */ hes kfR;
        {
            this.kfR = hes2;
        }

        public void W() {
            hes.c(this.kfR);
        }
    };
    private boolean Initialized;
    private hen kfQ;

    public hes(hdm hdm2, String string, lgg lgg2, lhf lhf2, hnu.b ... bArray) {
        this(hdm2, string, lgg2, lhf2, hes.a(bArray));
    }

    protected hes(hdm hdm2, String string, lgg lgg2, lhf lhf2, List<hnu.b> list) {
        super(hdm2, string, lgg2, lhf2, hdm2.jXO, hes.a(list, new hen.e(true), new hen.c(true)));
    }

    public final void cfZ() {
        int n;
        assert (this.Initialized);
        this.kfQ = new hen(this.cbO(), (String)null, lgg.rlI, new lhf(100, 100), this.cbO().jXL, new hen.d(this.cga()), new hnu.d(this.kfP));
        hof hof2 = new hof(this.kLu, (String)null, lgg.rlI, this.kfQ.csW(), this.cbO().kKm, true, true, false, true, this.kfP, null);
        this.kfQ.w(hof2);
        hde hde2 = this.cgb();
        hml hml2 = new hml(hof2, hde2, true);
        hof2.a(hml2);
        hde hde3 = (hde)hml2.cqe();
        hcx hcx2 = this.a(hde3);
        hof2.a(hcx2);
        hof2.ctV();
        this.kfQ.csY();
        lgg[] lggArray = new lgg[4];
        lhf[] lhfArray = this.cqw();
        lggArray[0] = new lgg(lhfArray.cf, lhfArray.cg + this.getHeight());
        lggArray[1] = new lgg(lhfArray.cf + this.getWidth(), lhfArray.cg);
        lggArray[2] = new lgg(lhfArray.cf - this.kfQ.getWidth(), lhfArray.cg);
        lggArray[3] = new lgg(lhfArray.cf, lhfArray.cg - this.kfQ.getHeight());
        lhfArray = new lhf[4];
        lgs lgs2 = this.kLu.kND.cqE();
        for (n = 0; n < lggArray.length; ++n) {
            lgs lgs3 = new lgs(lggArray[n], this.kfQ.cqv());
            lgs lgs4 = lgs2.w(lgs3);
            lhfArray[n] = lgs4.cqv();
        }
        n = 0;
        for (int i = 1; i < lhfArray.length; ++i) {
            if (lhfArray[i].s(lhfArray[n]) <= 0) continue;
            n = i;
        }
        this.kfQ.z(lggArray[n]);
        this.nm(true);
        this.kLu.a((String)null, (hms)this.kfQ);
        this.kfQ.cqV();
        this.kfQ.cqt().a((hms)this.kfQ, (float)this.kLu.crO());
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    protected abstract hcx a(hde var1);

    protected abstract lip cga();

    protected abstract hde cgb();

    protected final hdm cbO() {
        return (hdm)this.kLu;
    }

    private void nm(boolean bl) {
        this.kfQ.cql().a(bl, this.kfO);
    }

    private void cgc() {
        assert (this.Initialized);
        assert (this.kfQ != null);
        this.kLu.t(this.kfQ);
        assert (this.kfQ == null);
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }

    static /* synthetic */ boolean a(hes hes2) {
        return hes2.Initialized;
    }

    static /* synthetic */ hen b(hes hes2) {
        return hes2.kfQ;
    }

    static /* synthetic */ void a(hes hes2, boolean bl) {
        hes2.nm(bl);
    }

    static /* synthetic */ hen a(hes hes2, hen hen2) {
        hes2.kfQ = hen2;
        return hes2.kfQ;
    }

    static /* synthetic */ void c(hes hes2) {
        hes2.cgc();
    }
}

