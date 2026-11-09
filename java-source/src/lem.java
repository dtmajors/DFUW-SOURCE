/*
 * Decompiled with CFR.
 */
public class lem {
    private final lel riZ;
    private lgg rja;
    private lgg rjb;
    private final lbn kPh = new lbn(this){
        final /* synthetic */ lem rjc;
        {
            this.rjc = lem2;
        }

        public final void W() {
            lem.a(this.rjc, false);
        }
    };

    public lem(lbh lbh2) {
        this.riZ = new lel(lbh2);
    }

    public final lbl<lbn> eqf() {
        return this.riZ.eqf();
    }

    public final lbl<lbn> cmk() {
        return this.riZ.cmk();
    }

    public final void a(lgg lgg2, lgg lgg3, float f) {
        this.rja = lgg2;
        this.rjb = lgg3;
        if (!this.riZ.isStarted()) {
            this.mU(true);
        }
        this.riZ.e(0.0, 1.0, f);
    }

    public final void stop() {
        assert (this.riZ.isStarted());
        this.riZ.stop();
        this.mU(false);
    }

    public final lgg csu() {
        assert (this.riZ.isStarted());
        return this.rjb;
    }

    public final void cqs() {
        assert (this.riZ.isStarted());
        this.riZ.eqh();
        assert (!this.riZ.isStarted());
    }

    public final lgg aI() {
        assert (this.riZ.isStarted());
        return new lgg(this.q(ldb.reo), this.q(ldb.rep));
    }

    public final boolean isStarted() {
        return this.riZ.isStarted();
    }

    private int q(ldb ldb2) {
        int n = this.rja.r(ldb2);
        int n2 = this.rjb.r(ldb2);
        return n + (int)((double)(n2 - n) * this.riZ.cum());
    }

    private void mU(boolean bl) {
        this.riZ.cmk().a(bl, this.kPh);
    }

    static /* synthetic */ void a(lem lem2, boolean bl) {
        lem2.mU(bl);
    }
}

