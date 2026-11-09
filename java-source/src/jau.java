/*
 * Decompiled with CFR.
 */
public abstract class jau
extends ipx {
    private static final int mcj = 16;
    private joa mLX;
    private boolean mnx;
    private boolean mny;
    private boolean mnz;
    private boolean mnA;

    @Override
    public void cCy() {
        super.cCy();
        this.mLX = new joa(this.djE().cEE(), this.djE().cEF(), this.djE().getWidth(), this.djE().getHeight());
        this.cGQ();
    }

    protected void cGQ() {
        Integer n;
        Integer n2 = this.djE().nh(this.getClass().getSimpleName() + "XPOS");
        if (n2 == -1) {
            n2 = this.cCz();
            this.djE().a(this.getClass().getSimpleName() + "XPOS", hsu.ldg, n2);
        }
        if ((n = this.djE().nh(this.getClass().getSimpleName() + "YPOS")) == -1) {
            n = this.cCA();
            this.djE().a(this.getClass().getSimpleName() + "YPOS", hsu.ldg, n);
        }
        Boolean bl = this.djE().nk(this.getClass().getSimpleName() + "SnapLeft");
        Boolean bl2 = this.djE().nk(this.getClass().getSimpleName() + "SnapRight");
        Boolean bl3 = this.djE().nk(this.getClass().getSimpleName() + "SnapTop");
        Boolean bl4 = this.djE().nk(this.getClass().getSimpleName() + "SnapBottom");
        this.qU(bl);
        this.qV(bl2);
        this.qW(bl3);
        this.qX(bl4);
        this.n(n2, n, 0, 0);
    }

    public void i(float f2, float f3, float f4, float f5) {
        this.mLX = new joa(this.djE().cEE(), this.djE().cEF(), this.djE().getWidth(), this.djE().getHeight());
        float f6 = (float)this.getX() * f3 / f2;
        float f7 = (float)this.getY() * f5 / f4;
        this.n(Math.round(f6), Math.round(f7), 0, 0);
        this.dvU();
    }

    @Override
    public boolean du(int n, int n2) {
        super.du(n, n2);
        this.ez(n, n2);
        return true;
    }

    @Override
    public boolean dN(int n, int n2) {
        this.eA(n, n2);
        for (int i = this.bfn() - 1; i >= 0; --i) {
            ipf ipf2 = this.RO(i);
            if (!ipf2.djL() || !(ipf2 instanceof ipq)) continue;
            ipq ipq2 = (ipq)ipf2;
            int n3 = n - ipq2.getX();
            int n4 = n2 - ipq2.getY();
            ipq2.dN(n3, n4);
            if (ipq2.dF(n3, n4)) continue;
            ipq2.ri(false);
            ipq2.dL(n3, n4);
        }
        this.dvU();
        return true;
    }

    @Override
    public boolean dM(int n, int n2) {
        if (!this.Ow()) {
            return super.dM(n, n2);
        }
        this.eH(n, n2);
        return true;
    }

    @Override
    public void n(int n, int n2, int n3, int n4) {
        if (this.mLX.W - (float)(n + this.getWidth()) <= 16.0f) {
            n = (int)(this.mLX.W - (float)this.getWidth());
            this.mnz = true;
        } else {
            this.mnz = false;
        }
        if (n <= 16) {
            n = 0;
            this.mnx = true;
        } else {
            this.mnx = false;
        }
        if (n2 <= 16) {
            n2 = 0;
            this.mny = true;
        } else {
            this.mny = false;
        }
        if (this.mLX.H - (float)(n2 + this.getHeight()) <= 16.0f) {
            n2 = (int)(this.mLX.H - (float)this.getHeight());
            this.mnA = true;
        } else {
            this.mnA = false;
        }
        if (!this.mLX.intersects((float)n + this.mLX.X, (float)n2 + this.mLX.Y)) {
            n = 0;
            n2 = 0;
            this.mnx = true;
            this.mny = true;
        }
        this.ek(n, n2);
    }

    public boolean dhr() {
        return this.mnx;
    }

    public void qU(boolean bl) {
        if (bl == this.mnx) {
            return;
        }
        this.mnx = bl;
    }

    public boolean dhs() {
        return this.mny;
    }

    public void qV(boolean bl) {
        if (bl == this.mny) {
            return;
        }
        this.mny = bl;
    }

    public boolean dht() {
        return this.mnz;
    }

    public void qW(boolean bl) {
        if (bl == this.mnz) {
            return;
        }
        this.mnz = bl;
    }

    public boolean dhu() {
        return this.mnA;
    }

    public void qX(boolean bl) {
        if (bl == this.mnA) {
            return;
        }
        this.mnA = bl;
    }

    public abstract int cCz();

    public abstract int cCA();

    public abstract boolean cCB();

    public abstract boolean cCC();

    public abstract boolean cCD();

    public abstract boolean cCE();

    private void dvU() {
        this.djE().w(this.getClass().getSimpleName() + "XPOS", this.getX());
        this.djE().w(this.getClass().getSimpleName() + "YPOS", this.getY());
        this.djE().q(this.getClass().getSimpleName() + "SnapLeft", this.dhr());
        this.djE().q(this.getClass().getSimpleName() + "SnapRight", this.dht());
        this.djE().q(this.getClass().getSimpleName() + "SnapTop", this.dhs());
        this.djE().q(this.getClass().getSimpleName() + "SnapBottom", this.dhu());
    }
}

