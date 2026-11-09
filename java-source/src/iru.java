/*
 * Decompiled with CFR.
 */
public class iru
extends ipx
implements irt {
    private ire msb;
    private irx mwd;
    private irw mwe;
    private int mwf = 0;
    private int mgI = 0;
    private int mwg = 99;
    private int mwh = 1;
    private int mwi = 50;
    private int mwj;
    private int mwk;
    private static iqz mwl = new iqz(){

        public void e(ipf ipf2) {
            iru iru2 = (iru)ipf2;
            int n = 0;
            int n2 = 0;
            if (iru2.dlY() == ire.mul) {
                if (iru.b(iru2) != null && iru.b(iru2).djQ() != null) {
                    n = iru.b(iru2).getWidth() + iru.c(iru2) * 2 - iru.d(iru2) * 2;
                }
            } else if (iru.b(iru2) != null && iru.b(iru2).djQ() != null) {
                n2 = iru.b(iru2).getHeight() + iru.c(iru2) * 2 - iru.d(iru2) * 2;
            }
            iru2.setSize(n, n2);
        }

        public void i(ipf ipf2) {
            iru iru2 = (iru)ipf2;
            if (iru2.dlY() == ire.mul) {
                if (iru.e(iru2) != null) {
                    iru.e(iru2).r(iru.b(iru2).getWidth() % 2, 0, iru2.getWidth(), iru2.getHeight());
                }
                if (iru.b(iru2) != null) {
                    int n;
                    int n2;
                    int n3 = iru.a(iru2, iru2.getHeight() - iru.c(iru2) * 2, iru.f(iru2));
                    int n4 = iru.a(iru2, iru2.getHeight() - iru.c(iru2) * 2, iru.f(iru2) + iru.g(iru2) - 1);
                    int n5 = n4 - n3 + 1;
                    if (n5 < (n2 = iru.b(iru2).ctw())) {
                        n5 = n2;
                        n = iru2.getHeight() - n2 - iru.c(iru2) * 2;
                        if (n3 > n) {
                            n3 = n;
                        }
                    }
                    if (n5 > (n = iru.b(iru2).doE())) {
                        n5 = n;
                        int n6 = iru2.getHeight() - n - iru.c(iru2) * 2;
                        if (n3 > n6) {
                            n3 = n6;
                        }
                    }
                    if (iru.f(iru2) == iru.h(iru2)) {
                        n3 = 0;
                    } else if (iru.f(iru2) == iru.i(iru2)) {
                        n3 = iru2.getHeight() - n5 - iru.c(iru2) * 2;
                    }
                    iru.b(iru2).r(iru2.getWidth() / 2 - iru.b(iru2).getWidth() / 2 - iru.c(iru2) % 2, n3 + iru.c(iru2), iru.b(iru2).getWidth(), n5);
                }
            } else {
                if (iru.e(iru2) != null) {
                    iru.e(iru2).r(0, iru.b(iru2).getHeight() % 2, iru2.getWidth(), iru2.getHeight());
                }
                if (iru.b(iru2) != null) {
                    int n;
                    int n7;
                    int n8 = iru.a(iru2, iru2.getWidth() - iru.c(iru2) * 2, iru.f(iru2));
                    int n9 = iru.a(iru2, iru2.getWidth() - iru.c(iru2) * 2, iru.f(iru2) + iru.g(iru2) - 1);
                    int n10 = n9 - n8 + 1;
                    if (n10 < (n7 = iru.b(iru2).ctv())) {
                        n10 = n7;
                        n = iru2.getWidth() - n7 - iru.c(iru2) * 2;
                        if (n8 > n) {
                            n8 = n;
                        }
                    }
                    if (n10 > (n = iru.b(iru2).doD())) {
                        n10 = n;
                        int n11 = iru2.getWidth() - n - iru.c(iru2) * 2;
                        if (n8 > n11) {
                            n8 = n11;
                        }
                    }
                    if (iru.f(iru2) == iru.h(iru2)) {
                        n8 = 0;
                    } else if (iru.f(iru2) == iru.i(iru2)) {
                        n8 = iru2.getWidth() - n10 - iru.c(iru2) * 2;
                    }
                    iru.b(iru2).r(n8 + iru.c(iru2), iru2.getHeight() / 2 - iru.b(iru2).getHeight() / 2 - iru.c(iru2) % 2, n10, iru.b(iru2).getHeight());
                }
            }
            iru.b(iru2).cqF();
        }
    };

    public iru() {
        this.b(ire.mul);
        this.a(mwl);
    }

    @Override
    public ire dlY() {
        return this.msb;
    }

    @Override
    public void b(ire ire2) {
        if (ire2 == this.msb) {
            return;
        }
        this.msb = ire2;
        this.pack();
        this.dox();
    }

    public irx dop() {
        return this.mwd;
    }

    public void a(irx irx2) {
        if (irx2 == this.mwd) {
            return;
        }
        if (this.mwd != null) {
            this.X(this.mwd);
        }
        this.mwd = irx2;
        if (this.mwd != null) {
            this.mwd.rF(this.doz());
            if (this.mwe != null) {
                this.c(this.mwd, this.V(this.mwe));
            } else {
                this.W(irx2);
            }
        }
    }

    public int doq() {
        return this.mwj;
    }

    public void Su(int n) {
        if (n == this.mwj) {
            return;
        }
        this.mwj = n;
        this.pack();
    }

    public irw dor() {
        return this.mwe;
    }

    public void a(irw irw2) {
        if (irw2 == this.mwe) {
            return;
        }
        if (this.mwe != null) {
            this.X(this.mwe);
        }
        this.mwe = irw2;
        if (this.mwe != null) {
            this.doA();
            this.W(this.mwe);
        }
    }

    public int dos() {
        return this.mwk;
    }

    public void Sv(int n) {
        if (n == this.mwk) {
            return;
        }
        this.mwk = n;
        this.pack();
    }

    public int dot() {
        return this.mwf;
    }

    public int getValue() {
        return this.mgI;
    }

    public int dou() {
        return this.mwg;
    }

    public int dov() {
        return this.mwh;
    }

    public int dow() {
        return this.mwi;
    }

    public void setValue(int n) {
        if (n < this.mwf) {
            n = this.mwf;
        }
        if (n > this.mwg) {
            n = this.mwg;
        }
        if (n == this.mgI) {
            return;
        }
        this.mgI = n;
        this.doA();
        this.Rb(n);
    }

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, boolean bl) {
        if (n > n3) {
            n3 = n + 1;
        }
        if (n2 < n) {
            n2 = n;
        }
        if (n2 > n3) {
            n2 = n3;
        }
        if (n4 < 1) {
            n4 = 1;
        }
        if (n5 < 1) {
            n5 = 1;
        }
        this.mwf = n;
        this.mgI = n2;
        this.mwg = n3;
        this.mwh = n4;
        this.mwi = n5;
        this.doA();
        if (this.mwd != null) {
            this.mwd.rF(this.doz());
        }
        if (bl) {
            this.Rb(n2);
        }
    }

    @Override
    public void kh(float f) {
        this.hz(f);
    }

    @Override
    public boolean dF(int n, int n2) {
        return super.dF(n, n2) || this.mwe != null && this.mwe.dF(n - this.mwe.getX(), n2 - this.mwe.getY());
    }

    public void Rb(int n) {
    }

    public void dox() {
    }

    public void Sw(int n) {
    }

    public void Sx(int n) {
    }

    public void Sy(int n) {
        this.setValue(n);
    }

    public int Sz(int n) {
        return this.dlY() == ire.mul ? this.eJ(this.getHeight(), n) : this.eJ(this.getWidth(), n);
    }

    private int doy() {
        return this.mwg - this.mwf + 1;
    }

    private boolean doz() {
        return this.mwf < this.mwg;
    }

    private int eJ(int n, int n2) {
        long l = this.doy();
        l += (long)this.mwi;
        l *= (long)n2;
        int n3 = (int)(l /= (long)Math.max(n, 1));
        return n3;
    }

    private int eK(int n, int n2) {
        long l = n;
        l *= (long)n2;
        int n3 = (int)(l /= (long)(this.doy() + this.mwi));
        return n3;
    }

    private void doA() {
        if (this.mwe == null) {
            return;
        }
        if (this.doz()) {
            this.mwe.setVisible(true);
        } else {
            this.mwe.setVisible(false);
        }
        this.djQ().i(this);
    }

    static /* synthetic */ irw b(iru iru2) {
        return iru2.mwe;
    }

    static /* synthetic */ int c(iru iru2) {
        return iru2.mwk;
    }

    static /* synthetic */ int d(iru iru2) {
        return iru2.mwj;
    }

    static /* synthetic */ irx e(iru iru2) {
        return iru2.mwd;
    }

    static /* synthetic */ int f(iru iru2) {
        return iru2.mgI;
    }

    static /* synthetic */ int a(iru iru2, int n, int n2) {
        return iru2.eK(n, n2);
    }

    static /* synthetic */ int g(iru iru2) {
        return iru2.mwi;
    }

    static /* synthetic */ int h(iru iru2) {
        return iru2.mwf;
    }

    static /* synthetic */ int i(iru iru2) {
        return iru2.mwg;
    }
}

