/*
 * Decompiled with CFR.
 */
public class hpi
extends hmt {
    private final hpe kVp;
    private final hpa jHl;
    private boolean Initialized;

    public hpi(hnc hnc2, String string, lgg lgg2, lhf lhf2, a a2, lgg lgg3, String string2) {
        super(hnc2, string, lgg2, lhf2);
        assert (a2 != null);
        assert (lgg3 != null);
        assert (string2 != null);
        this.jHl = new hpa(hnc2, (String)null, lgg3, lhf2, a2.ktG);
        this.j(this.jHl);
        this.kVp = new hpe(hnc2, null, lgg.rlI, lhf2, a2.kiK, string2);
        this.j(this.kVp);
    }

    public final String getText() {
        assert (this.Initialized);
        return this.kVp.getText();
    }

    public final void setText(String string) {
        assert (this.Initialized);
        this.kVp.mV(string);
    }

    public final void c(hpe.c c2) {
        assert (this.Initialized);
        this.kVp.a(c2);
    }

    public final lcq cuw() {
        return this.kVp.cuw();
    }

    public final void H(lcq lcq2) {
        this.kVp.H(lcq2);
        this.jHl.H(lcq2);
    }

    public final lhu cvf() {
        assert (this.Initialized);
        return this.jHl.atw();
    }

    public final void d(lhu lhu2) {
        assert (this.Initialized);
        this.jHl.a(lhu2);
    }

    public final lgg cvg() {
        assert (this.Initialized);
        return this.jHl.cqw();
    }

    public final void N(lgg lgg2) {
        assert (this.Initialized);
        assert (lgg2.cf >= 0);
        assert (lgg2.cg >= 0);
        lgs lgs2 = new lgs(this.cqE());
        lgs2.cf -= lgg2.cf;
        lgs2.rmN += lgg2.cf;
        lgs2.cg -= lgg2.cg;
        lgs2.H += lgg2.cg;
        this.jHl.j(lgs2);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.mU(true);
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        this.Initialized = false;
        super.FG();
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        lhf lhf2 = this.cqv();
        this.jHl.d(lhf2);
        this.kVp.d(lhf2);
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

