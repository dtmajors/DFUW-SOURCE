/*
 * Decompiled with CFR.
 */
import java.util.List;

public class hpa
extends hoy {
    private boolean Initialized;
    private lhu dzN;
    private float eir;
    private final ljp eis;
    private final lbg kQN;

    public hpa(hnc hnc2, String string, lgg lgg2, lhf lhf2, lhu lhu2) {
        this(hnc2, string, lgg2, lhf2, lhu2, null);
    }

    public hpa(hnc hnc2, String string, lgg lgg2, lhf lhf2, lhu lhu2, lbg lbg2) {
        super(hnc2, string, lgg2, lhf2 != null ? lhf2 : lhu2.kLY, hnc2.crL());
        this.dzN = lhu2;
        this.eis = new ljp(1.0f, 1.0f);
        this.eir = 0.0f;
        this.kQN = lbg2;
        this.cuI();
        this.cuG().a(this.dzN);
        this.cuG().n(this.eis);
        this.cuG().gu(this.eir);
    }

    public final hmg cuG() {
        return (hmg)this.cqc();
    }

    public final lhu atw() {
        return this.dzN;
    }

    public final void a(lhu lhu2) {
        if (lhu2.g(this.dzN)) {
            return;
        }
        this.dzN = lhu2;
        this.cuH();
    }

    public final ljp cfw() {
        return new ljp(this.eis);
    }

    public final void N(float f2, float f3) {
        if (ldq.ai(f2, this.eis.x) && ldq.ai(f3, this.eis.y)) {
            return;
        }
        this.eis.x = f2;
        this.eis.y = f3;
        this.cuG().n(this.eis);
    }

    public final void n(ljp ljp2) {
        this.N(ljp2.x, ljp2.y);
    }

    public final float bmQ() {
        return this.eir;
    }

    public final void gu(float f2) {
        if (ldq.ai(f2, this.eir)) {
            return;
        }
        this.eir = f2;
        this.cuG().gu(this.eir);
    }

    protected void cuH() {
        this.cuG().a(this.dzN);
        this.cuI();
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

    @Override
    protected void bd(List<lfg> list) {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void cce() {
        super.cce();
        this.cuI();
    }

    @Override
    protected boolean co(int n, int n2) {
        if (!super.co(n, n2)) {
            return false;
        }
        if (this.kQN != null) {
            int n3 = this.dzN.rnS ? (int)((float)n * this.eis.x) : n % this.dzN.kLY.rmN;
            int n4 = this.dzN.rnT ? (int)((float)n2 * this.eis.y) : n2 % this.dzN.kLY.H;
            return !this.kQN.fN(n3, n4);
        }
        return true;
    }

    private void cuI() {
        float f2 = this.dzN.rnS ? (float)this.getWidth() / (float)this.dzN.kLY.rmN : 1.0f;
        float f3 = this.dzN.rnT ? (float)this.getHeight() / (float)this.dzN.kLY.H : 1.0f;
        this.N(f2, f3);
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

