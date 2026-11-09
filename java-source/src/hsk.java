/*
 * Decompiled with CFR.
 */
import java.util.List;

public class hsk
extends hsj
implements hmg {
    private boolean Initialized;
    private lhu dzN;
    private final ljp eis;
    private float eir;
    private hsc lcf;
    private lgg lcg = lgg.rlI;
    private lgs lch = new lgs();

    public hsk(hsh hsh2) {
        super(hsh2);
        this.dzN = lhu.rnR;
        this.eis = new ljp(1.0f, 1.0f);
    }

    @Override
    public final hmf cqc() {
        return this;
    }

    @Override
    public final void a(lhu lhu2) {
        if (lhu2.g(this.dzN)) {
            return;
        }
        this.dzN = lhu2;
        if (this.Initialized) {
            this.cuH();
        }
    }

    @Override
    public final void n(ljp ljp2) {
        if (ljp2.z(this.eis)) {
            return;
        }
        this.eis.u(ljp2);
        if (this.Initialized) {
            this.cko();
        }
    }

    @Override
    public void gu(float f2) {
        if (ldq.ai(f2, this.eir)) {
            return;
        }
        this.eir = f2;
        if (this.Initialized) {
            this.cxz();
        }
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
        this.cxC();
        this.cxD();
        this.cxE();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        if (this.lcf != null) {
            this.lcf.cleanup();
            this.lcf = null;
        }
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cxs() {
        this.cxC();
    }

    @Override
    protected void cxt() {
        assert (this.Initialized);
        if (this.cxE()) {
            this.lcf.c(this.cqv());
        }
    }

    @Override
    protected void chd() {
        this.cxD();
    }

    @Override
    protected void cxu() {
        assert (this.Initialized);
        if (this.cxE()) {
            this.lcf.oD(!this.cxx());
        }
    }

    @Override
    protected void cvu() {
        assert (this.Initialized);
        if (this.lcf != null) {
            this.lcf.H(this.cuw());
        }
    }

    @Override
    protected void cqZ() {
        assert (this.Initialized);
        if (this.lcf != null) {
            this.lcf.kc(this.cxy());
        }
    }

    @Override
    protected void cxv() {
        if (this.lcf != null) {
            this.lcf.Nd(this.cxr());
        }
    }

    @Override
    protected void bd(List<lfg> list) {
        super.bd(list);
        list.add(new lfg("Effective Position Absolute", this.lcg.toString()));
        list.add(new lfg("Effective Cliprect Local", this.lch.toString()));
    }

    public String toString() {
        return super.toString();
    }

    protected void cko() {
        assert (this.Initialized);
        if (this.lcf != null) {
            this.lcf.n(this.eis);
        }
    }

    protected void cxz() {
        assert (this.Initialized);
        if (this.lcf != null) {
            this.lcf.gu(this.eir);
        }
    }

    protected void cuH() {
        assert (this.Initialized);
        this.cxC();
        this.cxD();
        if (this.cxE()) {
            this.lcf.setTextureName(this.dzN.Name);
        }
    }

    protected void cxA() {
        assert (this.Initialized);
        if (this.cxE()) {
            this.lcf.w(this.lcg);
        }
    }

    protected final void cxB() {
        assert (this.Initialized);
        if (this.cxE()) {
            this.lcf.g(this.lch);
        }
    }

    private void cxC() {
        lgg lgg2 = this.cxw();
        lgg2 = new lgg(lgg2.cf - this.dzN.kec.cf, lgg2.cg - this.dzN.kec.cg);
        this.Q(lgg2);
    }

    private void Q(lgg lgg2) {
        if (lgg2.T(this.lcg)) {
            return;
        }
        this.lcg = lgg2;
        if (this.Initialized) {
            this.cxA();
        }
    }

    private void cxD() {
        lgs lgs2 = this.cqU();
        lgs2.cf += this.dzN.kec.cf;
        lgs2.cg += this.dzN.kec.cg;
        this.m(lgs2);
    }

    private void m(lgs lgs2) {
        if (lgs2.v(this.lch)) {
            return;
        }
        this.lch = lgs2;
        if (this.Initialized) {
            this.cxB();
        }
    }

    private boolean cxE() {
        assert (this.Initialized);
        boolean bl = this.cxF();
        if (bl == (this.lcf != null)) {
            return bl;
        }
        if (!bl) {
            this.lcf.cleanup();
            this.lcf = null;
            return false;
        }
        this.lcf = new hsc(this.lbq.jDE, null);
        this.lcf.setTextureName(this.dzN.Name);
        this.lcf.n(this.eis);
        this.lcf.H(this.cuw());
        this.lcf.gu(this.eir);
        this.lcf.w(this.lcg);
        this.lcf.c(this.cqv());
        this.lcf.oD(!this.cxx());
        this.lcf.kc(this.cxy());
        this.lcf.g(this.lch);
        return true;
    }

    private boolean cxF() {
        return this.dzN != lhu.rnR;
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

