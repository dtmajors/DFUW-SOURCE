/*
 * Decompiled with CFR.
 */
public class irp
extends ipx {
    private ipz muM;
    private ipz muF;
    private iru muK;
    private int muN = 32;
    private ipw muO;
    private ipw muP;
    private static iqz mdv = new iqz(){

        public void e(ipf ipf2) {
            irp irp2 = (irp)ipf2;
            irp2.setSize(irp.a(irp2).getWidth(), irp.a(irp2).getHeight());
        }

        public void i(ipf ipf2) {
            boolean bl;
            irp irp2 = (irp)ipf2;
            boolean bl2 = bl = irp.b(irp2).getHeight() > irp2.getHeight();
            if (bl) {
                if (irp.c(irp2) != null) {
                    irp.a(irp2).r(0, 0, irp2.getWidth() - irp.c(irp2).getWidth(), irp2.getHeight());
                    irp.c(irp2).setVisible(true);
                    irp.c(irp2).r(irp2.getWidth() - irp.c(irp2).getWidth(), 0, irp.c(irp2).getWidth(), irp2.getHeight());
                } else {
                    irp.a(irp2).r(0, 0, irp2.getWidth(), irp2.getHeight());
                }
            } else if (irp.c(irp2) != null) {
                irp.a(irp2).r(0, 0, irp2.getWidth() - irp.c(irp2).getWidth(), irp2.getHeight());
                irp.c(irp2).setVisible(false);
            } else {
                irp.a(irp2).r(0, 0, irp2.getWidth(), irp2.getHeight());
            }
            irp.d(irp2);
            if (bl) {
                irp.e(irp2);
            }
        }
    };
    private static iqz muQ = new iqz(){

        public void e(ipf ipf2) {
            irp irp2 = (irp)ipf2.djJ();
            if (irp.b(irp2) != null) {
                ipf2.setHeight(1);
                ipf2.setSize(irp.b(irp2).getWidth(), irp.b(irp2).getHeight());
            }
        }

        public void i(ipf ipf2) {
            irp irp2 = (irp)ipf2.djJ();
            if (irp.b(irp2) != null) {
                irp.b(irp2).setWidth(irp.a(irp2).getWidth());
            }
            if (irp.f(irp2).djL()) {
                irp.f(irp2).r(0, 0, ipf2.getWidth(), 32);
            }
            if (irp.g(irp2).djL()) {
                irp.g(irp2).r(0, ipf2.getHeight() - 32, ipf2.getWidth(), 32);
            }
        }
    };

    public irp() {
        this.a(mdv);
        this.muM = new ipz(muQ);
        this.muM.sa(true);
        this.W(this.muM);
        this.muF = new ipz(iqo.dmT());
        this.muM.W(this.muF);
        this.muO = new ipw(ire.mul, true);
        this.muM.W(this.muO);
        this.muP = new ipw(ire.mul, false);
        this.muM.W(this.muP);
    }

    public ipz dnA() {
        return this.muF;
    }

    public void a(ipz ipz2) {
        if (ipz2 == this.muF) {
            return;
        }
        if (this.muF != null) {
            this.muF.removeFromParent();
        }
        this.muF = ipz2;
        if (this.muF != null) {
            this.muM.W(this.muF);
        }
    }

    public iru dnw() {
        return this.muK;
    }

    public void a(iru iru2) {
        if (iru2 == this.muK) {
            return;
        }
        if (this.muK != null) {
            this.muK.removeFromParent();
        }
        this.muK = iru2;
        if (this.muK != null) {
            this.W(this.muK);
        }
    }

    public int dnx() {
        return this.muF.getY();
    }

    public void Sg(int n) {
        this.muF.RI(n);
    }

    public void LO(int n) {
        this.Sg(this.muF.getY() + n);
    }

    public void Z(ipf ipf2) {
        this.muF.W(ipf2);
    }

    public void aa(ipf ipf2) {
        this.muF.X(ipf2);
    }

    public void removeAllItems() {
        this.muF.removeAllChildren();
    }

    @Override
    public boolean c(int n, int n2, float f) {
        this.LO((int)(f * (float)this.muN));
        return true;
    }

    private void dnB() {
        if (this.muF == null) {
            return;
        }
        if (this.muF.getHeight() > this.muM.getHeight()) {
            int n = this.muF.getY();
            if (n < this.muM.getHeight() - this.muF.getHeight()) {
                n = this.muM.getHeight() - this.muF.getHeight();
            }
            if (n > 0) {
                n = 0;
            }
            this.muF.RI(n);
        } else {
            this.muF.RI(0);
            this.muO.setVisible(false);
            this.muP.setVisible(false);
        }
    }

    private void dnC() {
        boolean bl;
        if (this.muF == null || this.muK == null) {
            return;
        }
        boolean bl2 = bl = this.muF.getHeight() > this.muM.getHeight();
        if (bl) {
            this.muK.setVisible(true);
            int n = -this.muF.getY();
            int n2 = this.muF.getHeight() - this.muM.getHeight();
            this.muK.a(0, n, this.muF.getHeight() - this.muM.getHeight(), 1, this.muM.getHeight(), false);
            if (n > 0) {
                this.muO.setVisible(true);
                this.muO.hz((float)(Math.max(0.0, Math.min((double)((float)n / (float)(n2 / 3)), 1.0)) * 0.5));
            } else {
                this.muO.setVisible(false);
            }
            if (n < n2) {
                this.muP.setVisible(true);
                this.muP.hz((float)(Math.max(0.0, Math.min((double)((float)(n2 - n - 1) / (float)(n2 / 3)), 1.0)) * 0.5));
            } else {
                this.muP.setVisible(false);
            }
        } else {
            this.muK.setVisible(false);
            this.muO.setVisible(false);
            this.muP.setVisible(false);
        }
    }

    static /* synthetic */ ipz a(irp irp2) {
        return irp2.muM;
    }

    static /* synthetic */ ipz b(irp irp2) {
        return irp2.muF;
    }

    static /* synthetic */ iru c(irp irp2) {
        return irp2.muK;
    }

    static /* synthetic */ void d(irp irp2) {
        irp2.dnB();
    }

    static /* synthetic */ void e(irp irp2) {
        irp2.dnC();
    }

    static /* synthetic */ ipw f(irp irp2) {
        return irp2.muO;
    }

    static /* synthetic */ ipw g(irp irp2) {
        return irp2.muP;
    }
}

