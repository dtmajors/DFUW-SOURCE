/*
 * Decompiled with CFR.
 */
public class irk
extends ipx {
    private ipf mus;
    private ipf mut;
    private int muu = 2;
    private ire msb = ire.mul;
    private int muv = -1;
    private irj muw;
    private irj mux;
    private int muy;
    private int muz;
    private int muA = -1;
    private int muB = -1;
    private static iqz mdv = new iqz(){

        public void e(ipf ipf2) {
            irk irk2 = (irk)ipf2;
            int n = 0;
            int n2 = 0;
            if (irk.a(irk2) == ire.mul) {
                if (irk.b(irk2) != null && irk.b(irk2).djO()) {
                    n = Math.max(n, irk.b(irk2).getWidth());
                    n2 += irk.b(irk2).getHeight();
                }
                if (irk.c(irk2) != null && irk.c(irk2).djO()) {
                    n = Math.max(n, irk.c(irk2).getWidth());
                    n2 += irk.c(irk2).getHeight();
                }
                n2 += irk.d(irk2);
            } else {
                if (irk.b(irk2) != null && irk.b(irk2).djO()) {
                    n += irk.b(irk2).getWidth();
                    n2 = Math.max(n2, irk.b(irk2).getHeight());
                }
                if (irk.c(irk2) != null && irk.c(irk2).djO()) {
                    n += irk.c(irk2).getWidth();
                    n2 = Math.max(n2, irk.c(irk2).getHeight());
                }
                n += irk.d(irk2);
            }
            irk2.setSize(n, n2);
        }

        public void i(ipf ipf2) {
            irk irk2 = (irk)ipf2;
            if (irk.a(irk2) == ire.mul) {
                irk.a(irk2, irk.e(irk2) != null ? irk.e(irk2).getSize(irk2.getHeight()) : 0);
                irk.b(irk2, irk.f(irk2) != null ? irk.f(irk2).getSize(irk2.getHeight()) : 0);
            } else {
                irk.a(irk2, irk.e(irk2) != null ? irk.e(irk2).getSize(irk2.getWidth()) : 0);
                irk.b(irk2, irk.f(irk2) != null ? irk.f(irk2).getSize(irk2.getWidth()) : 0);
            }
            if (irk.b(irk2) != null && irk.b(irk2).djO() && irk.c(irk2) != null && irk.c(irk2).djO()) {
                int n;
                boolean bl;
                boolean bl2 = irk.b(irk2).djQ() != null && irk.b(irk2).dkj();
                boolean bl3 = bl = irk.c(irk2).djQ() != null && irk.c(irk2).dkj();
                if (irk.g(irk2) == -1) {
                    if (bl2 == bl) {
                        irk.c(irk2, irk.a(irk2) == ire.mul ? irk2.getHeight() / 2 - irk.d(irk2) / 2 : irk2.getWidth() / 2 - irk.d(irk2) / 2);
                    } else if (bl2) {
                        irk.c(irk2, irk.a(irk2) == ire.mul ? irk2.getHeight() - irk.c(irk2).getHeight() - irk.d(irk2) : irk2.getWidth() - irk.c(irk2).getWidth() - irk.d(irk2));
                    } else {
                        irk.c(irk2, irk.a(irk2) == ire.mul ? irk.b(irk2).getHeight() : irk.b(irk2).getWidth());
                    }
                }
                if (irk2.getWidth() != irk.h(irk2) || irk2.getHeight() != irk.i(irk2)) {
                    if (bl2 == bl) {
                        double d2;
                        if (irk.a(irk2) == ire.mul) {
                            d2 = irk.i(irk2) != -1 ? Math.min((double)irk.g(irk2) / (double)irk.i(irk2), 1.0) : 0.5;
                            irk.c(irk2, (int)((double)irk2.getHeight() * d2));
                        } else {
                            d2 = irk.h(irk2) != -1 ? Math.min((double)irk.g(irk2) / (double)irk.h(irk2), 1.0) : 0.5;
                            irk.c(irk2, (int)((double)irk2.getWidth() * d2));
                        }
                    } else if (bl2) {
                        if (irk.a(irk2) == ire.mul) {
                            if (irk.g(irk2) + irk.d(irk2) + irk.c(irk2).getHeight() != irk2.getHeight()) {
                                irk.c(irk2, irk2.getHeight() - irk.c(irk2).getHeight() - irk.d(irk2));
                            }
                        } else if (irk.g(irk2) + irk.d(irk2) + irk.c(irk2).getWidth() != irk2.getWidth()) {
                            irk.c(irk2, irk2.getWidth() - irk.c(irk2).getWidth() - irk.d(irk2));
                        }
                    }
                    irk.d(irk2, irk2.getWidth());
                    irk.e(irk2, irk2.getHeight());
                }
                int n2 = n = irk.a(irk2) == ire.mul ? irk2.getHeight() : irk2.getWidth();
                if (irk.g(irk2) > n - irk.d(irk2) - irk.j(irk2)) {
                    irk.c(irk2, n - irk.d(irk2) - irk.j(irk2));
                }
                if (irk.g(irk2) < irk.k(irk2)) {
                    irk.c(irk2, irk.k(irk2));
                }
                if (irk.a(irk2) == ire.mul) {
                    irk.b(irk2).r(0, 0, irk2.getWidth(), irk.g(irk2));
                    irk.c(irk2).r(0, irk.g(irk2) + irk.d(irk2), irk2.getWidth(), irk2.getHeight() - irk.g(irk2) - irk.d(irk2));
                } else {
                    irk.b(irk2).r(0, 0, irk.g(irk2), irk2.getHeight());
                    irk.c(irk2).r(irk.g(irk2) + irk.d(irk2), 0, irk2.getWidth() - irk.g(irk2) - irk.d(irk2), irk2.getHeight());
                }
            } else if (irk.b(irk2) != null && irk.b(irk2).djO()) {
                irk.b(irk2).r(0, 0, irk2.getWidth(), irk2.getHeight());
            } else if (irk.c(irk2) != null && irk.c(irk2).djO()) {
                irk.c(irk2).r(0, 0, irk2.getWidth(), irk2.getHeight());
            }
            irk2.dnq();
        }
    };

    public irk() {
        this(ire.mul, 2);
    }

    public irk(ire ire2, int n) {
        this.a(mdv);
        this.msb = ire2;
        this.muu = n;
    }

    public ipf dnn() {
        return this.mus;
    }

    public void a(ipf ipf2, irj irj2) {
        if (ipf2 == this.mus) {
            return;
        }
        if (this.mus != null) {
            this.mus.removeFromParent();
        }
        this.mus = ipf2;
        if (this.mus != null) {
            this.muv = -1;
            this.muw = irj2;
            this.W(this.mus);
        }
    }

    public ipf dno() {
        return this.mut;
    }

    public void b(ipf ipf2, irj irj2) {
        if (ipf2 == this.mut) {
            return;
        }
        if (this.mut != null) {
            this.mut.removeFromParent();
        }
        this.mut = ipf2;
        if (this.mut != null) {
            this.muv = -1;
            this.mux = irj2;
            this.W(this.mut);
        }
    }

    public int dnp() {
        return this.muu;
    }

    public void RE(int n) {
        if (n < 0) {
            n = 0;
        }
        if (n == this.muu) {
            return;
        }
        this.muu = n;
        this.pack();
    }

    public ire dlY() {
        return this.msb;
    }

    public void b(ire ire2) {
        if (ire2 == this.msb) {
            return;
        }
        this.msb = ire2;
        this.pack();
    }

    @Override
    public boolean du(int n, int n2) {
        if (super.du(n, n2)) {
            return true;
        }
        if (this.mus != null && this.mus.djO() && this.mut != null && this.mut.djO()) {
            if (this.msb == ire.mul) {
                if (n2 >= this.mus.getHeight() && n2 < this.mut.getY()) {
                    this.ez(n, n2);
                }
            } else if (n >= this.mus.getWidth() && n < this.mut.getX()) {
                this.ez(n, n2);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean dN(int n, int n2) {
        if (!this.Ow()) {
            return super.dN(n, n2);
        }
        this.eA(n, n2);
        this.djE().b(hxv.llh);
        return true;
    }

    @Override
    public boolean dM(int n, int n2) {
        if (!this.Ow()) {
            if (super.dM(n, n2)) {
                return true;
            }
            if (this.mus != null && this.mus.djO() && this.mut != null && this.mut.djO()) {
                hxv hxv2 = this.djE().cFg();
                if (this.msb == ire.mul) {
                    if (n2 >= this.mus.getHeight() && n2 < this.mut.getY()) {
                        hxv2 = hxv.llp;
                    } else if (hxv2 == hxv.llp) {
                        hxv2 = hxv.llh;
                    }
                } else if (n >= this.mus.getWidth() && n < this.mut.getX()) {
                    hxv2 = hxv.llr;
                } else if (hxv2 == hxv.llr) {
                    hxv2 = hxv.llh;
                }
                this.djE().b(hxv2);
            }
        } else {
            this.eH(n, n2);
        }
        return true;
    }

    @Override
    public boolean dL(int n, int n2) {
        if (!this.Ow()) {
            this.djE().b(hxv.llh);
            return super.dL(n, n2);
        }
        return false;
    }

    @Override
    public void n(int n, int n2, int n3, int n4) {
        if (!this.Ow()) {
            return;
        }
        if (this.msb == ire.mul) {
            if (this.mus.getHeight() + n4 >= this.muy && this.mut.getHeight() - n4 >= this.muz) {
                this.muv += n4;
                this.mus.setHeight(this.mus.getHeight() + n4);
                this.mut.setHeight(this.mut.getHeight() - n4);
            }
        } else if (this.mus.getWidth() + n3 >= this.muy && this.mut.getWidth() - n3 >= this.muz) {
            this.muv += n3;
            this.mus.setWidth(this.mus.getWidth() + n3);
            this.mut.setWidth(this.mut.getWidth() - n3);
        }
        this.dnq();
    }

    protected void dnq() {
    }

    static /* synthetic */ ire a(irk irk2) {
        return irk2.msb;
    }

    static /* synthetic */ ipf b(irk irk2) {
        return irk2.mus;
    }

    static /* synthetic */ ipf c(irk irk2) {
        return irk2.mut;
    }

    static /* synthetic */ int d(irk irk2) {
        return irk2.muu;
    }

    static /* synthetic */ int a(irk irk2, int n) {
        irk2.muy = n;
        return irk2.muy;
    }

    static /* synthetic */ irj e(irk irk2) {
        return irk2.muw;
    }

    static /* synthetic */ int b(irk irk2, int n) {
        irk2.muz = n;
        return irk2.muz;
    }

    static /* synthetic */ irj f(irk irk2) {
        return irk2.mux;
    }

    static /* synthetic */ int g(irk irk2) {
        return irk2.muv;
    }

    static /* synthetic */ int c(irk irk2, int n) {
        irk2.muv = n;
        return irk2.muv;
    }

    static /* synthetic */ int h(irk irk2) {
        return irk2.muA;
    }

    static /* synthetic */ int i(irk irk2) {
        return irk2.muB;
    }

    static /* synthetic */ int d(irk irk2, int n) {
        irk2.muA = n;
        return irk2.muA;
    }

    static /* synthetic */ int e(irk irk2, int n) {
        irk2.muB = n;
        return irk2.muB;
    }

    static /* synthetic */ int j(irk irk2) {
        return irk2.muz;
    }

    static /* synthetic */ int k(irk irk2) {
        return irk2.muy;
    }
}

