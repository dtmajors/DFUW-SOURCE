/*
 * Decompiled with CFR.
 */
import java.util.List;

public class hsj
implements hmf {
    protected final hsh lbq;
    private boolean Initialized;
    private lgg lcd = lgg.rlI;
    private lhf kLY = lhf.rnv;
    private final lgs kLQ = new lgs();
    private boolean lce;
    private lcq kfb = lcq.COLORSHIFT_NEUTRAL;
    private float lbi;
    private int aFg = 0;

    public hsj(hsh hsh2) {
        this.lbq = hsh2;
    }

    @Override
    public final void initialize() {
        assert (!this.Initialized);
        this.FF();
    }

    @Override
    public final void cleanup() {
        assert (this.Initialized);
        this.FG();
    }

    @Override
    public final void w(lgg lgg2) {
        if (lgg2.T(this.lcd)) {
            return;
        }
        this.lcd = lgg2;
        if (this.Initialized) {
            this.cxs();
        }
    }

    @Override
    public final void c(lhf lhf2) {
        if (lhf2.r(this.kLY)) {
            return;
        }
        this.kLY = lhf2;
        if (this.Initialized) {
            this.cxt();
        }
    }

    @Override
    public final void g(lgs lgs2) {
        if (lgs2.v(this.kLQ)) {
            return;
        }
        this.kLQ.t(lgs2);
        if (this.Initialized) {
            this.chd();
        }
    }

    @Override
    public final void nQ(boolean bl) {
        if (bl == this.lce) {
            return;
        }
        this.lce = bl;
        if (this.Initialized) {
            this.cxu();
        }
    }

    @Override
    public final void H(lcq lcq2) {
        if (lcq2.X(this.kfb)) {
            return;
        }
        this.kfb = lcq2;
        if (this.Initialized) {
            this.cvu();
        }
    }

    @Override
    public final void bc(List<lfg> list) {
        this.bd(list);
    }

    @Override
    public final void jY(float f2) {
        assert (this.Initialized);
        if (ldq.ai(f2, this.lbi)) {
            return;
        }
        this.lbi = f2;
        this.cqZ();
    }

    @Override
    public final void Nd(int n) {
        if (n == this.aFg) {
            return;
        }
        this.aFg = n;
        if (this.Initialized) {
            this.cxv();
        }
    }

    public final int cxr() {
        return this.aFg;
    }

    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        this.mU(true);
    }

    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        this.Initialized = false;
    }

    protected void cxs() {
    }

    protected void cxt() {
    }

    protected void chd() {
    }

    protected void cxu() {
    }

    protected void cvu() {
    }

    protected void cqZ() {
    }

    protected void cxv() {
    }

    protected void bd(List<lfg> list) {
        list.add(new lfg("Position Absolute", this.lcd.toString()));
        list.add(new lfg("Cliprect Local", this.kLQ.toString()));
        list.add(new lfg("Z-Order", lda.zj("#0.00000").format(this.lbi)));
    }

    protected final lcq cuw() {
        return this.kfb;
    }

    protected final lgg cxw() {
        return this.lcd;
    }

    protected final lhf cqv() {
        return this.kLY;
    }

    protected final boolean cxx() {
        return this.lce;
    }

    protected final float cxy() {
        return this.lbi;
    }

    protected final lgs cqU() {
        return new lgs(this.kLQ);
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

