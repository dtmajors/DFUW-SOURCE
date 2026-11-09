/*
 * Decompiled with CFR.
 */
import java.util.LinkedList;
import java.util.List;

public abstract class hoy
extends hms {
    private final hmf kTz;
    private boolean Initialized;
    private List<hmr> kTA;
    private lcq kTB;
    private lcq kTC;

    public hoy(hnc hnc2, String string, lgg lgg2, lhf lhf2, hmf hmf2) {
        super(hnc2, string, lgg2, lhf2);
        this.kTz = hmf2;
        this.kTB = lcq.COLORSHIFT_NEUTRAL;
        this.kTC = lcq.COLORSHIFT_NEUTRAL;
    }

    public final hmf cqc() {
        return this.kTz;
    }

    public final lcq cuw() {
        assert (this.Initialized);
        return this.kTB;
    }

    public final void H(lcq lcq2) {
        this.kTB = lcq2;
        this.cuB();
    }

    public final lcq cux() {
        return this.kTC;
    }

    public final void c(boolean bl, hmr hmr2) {
        assert (hmr2.b(this) == bl);
        if (bl) {
            assert (this.kTA == null || !this.kTA.contains(hmr2));
            if (this.kTA == null) {
                this.kTA = new LinkedList<hmr>();
            }
            this.kTA.add(hmr2);
        } else {
            assert (this.kTA != null);
            assert (this.kTA.contains(hmr2));
            this.kTA.remove(hmr2);
            if (this.kTA.isEmpty()) {
                this.kTA = null;
            }
        }
        if (this.Initialized) {
            this.cuB();
        }
    }

    public final void cuy() {
        this.cuB();
    }

    public final void cuz() {
        this.cuE();
        this.cuD();
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
        this.kTC = this.cuC();
        this.cuD();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.cuE();
        this.mU(false);
        super.FG();
        this.Initialized = false;
        assert (this.kTA == null);
    }

    @Override
    protected void cfS() {
        assert (this.Initialized);
        super.cfS();
        this.kTz.w(this.y(lgg.rlI));
    }

    @Override
    protected void chd() {
        assert (this.Initialized);
        super.chd();
        this.kTz.g(this.cqU());
    }

    @Override
    protected void cce() {
        super.cce();
        this.kTz.c(this.cqv());
    }

    @Override
    protected void cqW() {
        assert (this.Initialized);
        super.cqW();
        this.kTz.nQ(!this.cqC());
    }

    @Override
    protected void bd(List<lfg> list) {
    }

    @Override
    protected void b(boolean bl, hmr hmr2) {
        assert (this.Initialized);
        hmr2.a(bl, this);
    }

    protected void cuA() {
        assert (this.Initialized);
        this.kTz.H(this.cux());
    }

    private void cuB() {
        lcq lcq2 = this.cuC();
        if (lcq2.X(this.kTC)) {
            return;
        }
        this.kTC = lcq2;
        if (this.Initialized) {
            this.cuA();
        }
    }

    private final lcq cuC() {
        lcq lcq2 = this.kTB;
        if (this.kTA != null) {
            for (hmr hmr2 : this.kTA) {
                lcq lcq3 = hmr2.getColor();
                lcq2 = lcq2.V(lcq3);
            }
        }
        lcq2 = lcq2.V(this.kLu.kNi.kNU);
        return lcq2;
    }

    private void cuD() {
        this.kTz.w(this.y(lgg.rlI));
        this.kTz.c(this.cqv());
        this.kTz.g(this.cqU());
        this.kTz.nQ(!this.cqC());
        this.kTz.H(this.kTC);
        this.kTz.initialize();
    }

    private void cuE() {
        this.kTz.cleanup();
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

