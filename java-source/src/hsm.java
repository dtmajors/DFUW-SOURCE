/*
 * Decompiled with CFR.
 */
public class hsm
extends hsj
implements hmh {
    public static final hbe jzX = hbe.jAM;
    private boolean Initialized;
    private String aFo = "";
    private int fFM = 1;
    private hnb jFE = hnb.kMZ;
    private lcq dMT = lcq.BRIGHT_WHITE;
    private hse lck;

    public hsm(hsh hsh2) {
        super(hsh2);
    }

    @Override
    public final hmf cqc() {
        return this;
    }

    @Override
    public final boolean mV(String string) {
        if (string.equals(this.aFo)) {
            return false;
        }
        this.aFo = string;
        if (this.Initialized) {
            this.cxG();
        }
        return true;
    }

    @Override
    public final void a(hpe.c c2) {
        this.g(c2.jFE);
        this.setColor(c2.dMT);
        this.xf(hsm.d(c2));
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.mU(true);
        this.cxE();
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        if (this.lck != null) {
            this.lck.cleanup();
            this.lck = null;
        }
        this.mU(false);
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void cxs() {
        assert (this.Initialized);
        if (this.cxE()) {
            this.lck.w(this.cxw());
        }
    }

    @Override
    protected void cxt() {
        assert (this.Initialized);
        if (this.lck != null) {
            this.lck.c(this.cqv());
        }
    }

    @Override
    protected void cxu() {
        assert (this.Initialized);
        if (this.cxE()) {
            this.lck.eq(!this.cxx());
        }
    }

    @Override
    protected void cvu() {
        assert (this.Initialized);
        if (this.lck != null) {
            this.lck.setColor(this.dMT.V(this.cuw()));
        }
    }

    @Override
    protected void chd() {
        assert (this.Initialized);
        if (this.cxE()) {
            this.lck.g(this.cqU());
        }
    }

    protected void cxG() {
        assert (this.Initialized);
        if (this.cxE()) {
            this.lck.setText(this.aFo);
        }
    }

    protected void cxH() {
        assert (this.Initialized);
        if (this.lck != null) {
            this.lck.xf(this.fFM);
        }
    }

    protected void cxI() {
        assert (this.Initialized);
        if (this.lck != null) {
            this.lck.ma(this.f(this.jFE));
        }
    }

    protected void cxJ() {
        assert (this.Initialized);
        if (this.lck != null) {
            this.lck.setColor(this.dMT.V(this.cuw()));
        }
    }

    @Override
    protected void cqZ() {
        assert (this.Initialized);
        if (this.lck != null) {
            this.lck.kc(this.cxy());
        }
    }

    @Override
    protected void cxv() {
        if (this.lck != null) {
            this.lck.Nd(this.cxr());
        }
    }

    public String toString() {
        return super.toString();
    }

    private boolean cxE() {
        assert (this.Initialized);
        boolean bl = this.cxF();
        if (bl == (this.lck != null)) {
            return bl;
        }
        if (!bl) {
            this.lck.cleanup();
            this.lck = null;
            return false;
        }
        this.lck = new hse(this.lbq.jDE, null);
        this.lck.xf(this.fFM);
        this.lck.setText(this.aFo);
        this.lck.setColor(this.dMT.V(this.cuw()));
        this.lck.ma(this.f(this.jFE));
        this.lck.w(this.cxw());
        this.lck.c(this.cqv());
        this.lck.eq(!this.cxx());
        this.lck.kc(this.cxy());
        this.lck.g(this.cqU());
        return true;
    }

    private boolean cxF() {
        if (this.aFo.length() == 0) {
            return false;
        }
        if (this.cxx()) {
            return false;
        }
        lgs lgs2 = this.cqU();
        lgg lgg2 = this.cxw();
        lgs2.cf += lgg2.cf;
        lgs2.cg += lgg2.cg;
        return lgs2.x(this.lbq.kND.cqD());
    }

    private ldv f(hnb hnb2) {
        hsb hsb2 = this.lbq.e(hnb2);
        return hsb2.getGUID();
    }

    private static int d(hpe.c c2) {
        int n = 0;
        if (c2 instanceof hpe.d) {
            hpe.d d2 = (hpe.d)c2;
            n |= hsm.b(d2);
        } else if (c2 instanceof hpe.e) {
            hpe.e e2 = (hpe.e)c2;
            n |= 0x10;
            n |= hsm.b(e2);
        } else assert (false);
        return n;
    }

    private static int b(hpe.e e2) {
        int n = 0;
        switch (e2.kUX) {
            case kUO: {
                n |= 4;
                break;
            }
            case kUP: {
                n |= 8;
                break;
            }
            case kUQ: {
                n |= 0x20;
                break;
            }
            default: {
                assert (false) : e2.kUX;
                break;
            }
        }
        switch (e2.kUY) {
            case kUS: {
                n |= 0x40;
                break;
            }
            case kUT: {
                n |= 2;
                break;
            }
            case kUU: {
                n |= 0x100;
                break;
            }
            default: {
                assert (false) : e2.kUY;
                break;
            }
        }
        return n;
    }

    private void g(hnb hnb2) {
        if (hnb2.c(this.jFE)) {
            return;
        }
        this.jFE = hnb2;
        if (this.Initialized) {
            this.cxI();
        }
    }

    private void setColor(lcq lcq2) {
        if (lcq2.X(this.dMT)) {
            return;
        }
        this.dMT = lcq2;
        if (this.Initialized) {
            this.cxJ();
        }
    }

    private void xf(int n) {
        if (n == this.fFM) {
            return;
        }
        this.fFM = n;
        if (this.Initialized) {
            this.cxH();
        }
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

