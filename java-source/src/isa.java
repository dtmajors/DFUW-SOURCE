/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.List;

public class isa
extends ipx {
    private static final int mwz = 40;
    private ipz muM;
    private isc mwA;
    private ios mwB;
    private ios mwC;
    private List<isb> lXe = lcn.emv();
    private boolean mwD = false;
    private ipf mwE;
    private ipf lMX;
    private ipf mwF;
    private static iqz mdv = new iqz(){

        public void e(ipf ipf2) {
            isa isa2 = (isa)ipf2;
            int n = 0;
            int n2 = 0;
            for (int i = 0; i < isa2.bfn(); ++i) {
                ipf ipf3 = isa2.RO(i);
                if (!ipf3.djL() || ipf3 == isa.b(isa2) || ipf3 == isa.c(isa2) || ipf3 == isa.d(isa2)) continue;
                n += ipf3.getWidth();
                n2 = Math.max(n2, ipf3.getHeight());
            }
            if (isa.b(isa2) != null) {
                n2 += isa2.dpc();
            }
            isa2.setSize(n, n2);
        }

        public void i(ipf ipf2) {
            ipf ipf3;
            ipf ipf4;
            int n;
            ipf ipf5;
            int n2;
            isa isa2 = (isa)ipf2;
            boolean bl = hso.cxK().cxN() == jnz.nFE;
            boolean bl2 = isa2.doR() && !bl;
            int n3 = isa.b(isa2) != null ? isa2.dpc() : 0;
            int n4 = isa2.getHeight() - n3;
            if (isa.c(isa2) != null) {
                if (!bl) {
                    isa.c(isa2).r(0, n3, isa2.getWidth(), n4);
                } else {
                    isa.c(isa2).r(0, n3, Math.min(isa.e(isa2).getWidth(), isa2.getWidth()), n4);
                }
            }
            if (isa.d(isa2) != null) {
                ipf ipf6 = null;
                if (isa.e(isa2) != null) {
                    for (n2 = isa.e(isa2).bfn() - 1; n2 >= 0; --n2) {
                        ipf5 = isa.e(isa2).RO(n2);
                        if (!(ipf5 instanceof iwx)) continue;
                        ipf6 = (iwx)ipf5;
                        break;
                    }
                }
                if (isa.d(isa2).djL()) {
                    isa.d(isa2).ek(isa.e(isa2).getWidth(), n3);
                    if (ipf6 != null) {
                        ipf6.setVisible(false);
                    }
                } else if (ipf6 != null) {
                    ipf6.setVisible(true);
                }
            }
            if (isa.f(isa2) != null) {
                isa.f(isa2).setVisible(bl2);
            }
            if (isa.g(isa2) != null) {
                isa.g(isa2).setVisible(bl2);
            }
            for (n = isa2.bfn() - 5; n >= 0 && (ipf4 = isa2.RO(n)) != isa.h(isa2); --n) {
                ipf4.setVisible(bl2);
            }
            n = isa2.dpd();
            for (n2 = 0; n2 < isa2.bfn() && (ipf5 = isa2.RO(n2)) != isa.h(isa2); ++n2) {
                if (!ipf5.djL() || ipf5 == isa.c(isa2) || ipf5 == isa.d(isa2) || ipf5 == isa.b(isa2)) continue;
                ipf5.r(n, n3, ipf5.getWidth(), n4);
                n += ipf5.getWidth();
            }
            n2 = isa2.getWidth() - isa2.dpe();
            for (int i = isa2.bfn() - 1; i >= 0 && (ipf3 = isa2.RO(i)) != isa.h(isa2); --i) {
                if (!ipf3.djL() || ipf3 == isa.c(isa2) || ipf3 == isa.d(isa2) || ipf3 == isa.b(isa2)) continue;
                ipf3.r(n2 -= ipf3.getWidth(), n3, ipf3.getWidth(), n4);
            }
            if (!bl) {
                isa.h(isa2).r(n, n3, n2 - n, n4);
            } else {
                isa.h(isa2).r(0, n3, Math.min(isa.e(isa2).getWidth(), isa2.getWidth()), n4);
            }
            if (isa.b(isa2) != null) {
                if (!bl) {
                    isa.b(isa2).r(0, 0, isa2.getWidth(), isa2.getHeight());
                } else {
                    isa.b(isa2).r(0, 0, Math.min(isa.e(isa2).getWidth() + (isa.d(isa2) != null ? isa.d(isa2).getWidth() : 0), isa2.getWidth()), isa2.getHeight());
                }
            }
        }
    };
    private static iqz muQ = new iqv(){

        public void i(ipf ipf2) {
            ipz ipz2 = (ipz)ipf2;
            if (ipz2.djJ() == null || !(ipz2.djJ() instanceof isa)) {
                return;
            }
            isa isa2 = (isa)ipz2.djJ();
            if (isa.e(isa2) == null) {
                return;
            }
            int n = isa.e(isa2).getX();
            if (isa.i(isa2)) {
                isa.a(isa2, false);
                n = isa.a(isa2, (ipf)isa.e(isa2).dpr(), n);
            }
            if (isa.e(isa2).getWidth() > ipz2.getWidth()) {
                if (n + isa.e(isa2).getWidth() < ipz2.getWidth()) {
                    n = ipz2.getWidth() - isa.e(isa2).getWidth();
                }
                if (n > 0) {
                    n = 0;
                }
            } else {
                n = 0;
            }
            isa.e(isa2).r(n, 0, isa.e(isa2).getWidth(), ipz2.getHeight());
            isa.j(isa2);
        }
    };

    public isa() {
        this.a(mdv);
        this.muM = new ipz(muQ);
        this.muM.sa(true);
        this.W(this.muM);
    }

    public ipz doL() {
        return this.muM;
    }

    public isc doM() {
        return this.mwA;
    }

    public void a(isc isc2) {
        if (isc2 == this.mwA) {
            return;
        }
        if (this.mwA != null) {
            this.mwA.removeFromParent();
        }
        this.mwA = isc2;
        if (this.mwA != null) {
            this.muM.W(this.mwA);
        }
    }

    public ios doN() {
        return this.mwB;
    }

    public void b(ios ios2) {
        if (ios2 == this.mwB) {
            return;
        }
        if (this.mwB != null) {
            this.mwB.removeFromParent();
        }
        this.mwB = ios2;
        if (this.mwB != null) {
            this.mwB.ra(true);
            this.mwB.setVisible(false);
            this.W(this.mwB);
        }
    }

    public ios doO() {
        return this.mwC;
    }

    public void c(ios ios2) {
        if (ios2 == this.mwC) {
            return;
        }
        if (this.mwC != null) {
            this.mwC.removeFromParent();
        }
        this.mwC = ios2;
        if (this.mwC != null) {
            this.mwC.ra(true);
            this.mwC.setVisible(false);
            this.W(this.mwC);
        }
    }

    public int doP() {
        return this.getWidth();
    }

    public ipq doQ() {
        return null;
    }

    public boolean doR() {
        return this.mwA != null && this.mwA.getWidth() > this.doP();
    }

    public void doS() {
        this.LO(-40);
    }

    public void doT() {
        this.LO(40);
    }

    public void LO(int n) {
        this.mwA.RH(this.mwA.getX() - n);
        this.dpf();
    }

    public List<isb> cGD() {
        return Collections.unmodifiableList(this.lXe);
    }

    public int doU() {
        return this.lXe.size();
    }

    public isb SE(int n) {
        return this.lXe.get(n);
    }

    public void a(isb isb2, int n) {
        this.lXe.add(n, isb2);
        this.mwA.a(isb2, this.SN(n));
    }

    public void d(isb isb2) {
        this.a(isb2, this.doU());
    }

    public void e(isb isb2) {
        this.lXe.remove(isb2);
        this.mwA.X(isb2);
    }

    public void SM(int n) {
        this.e(this.SE(n));
    }

    public ipf doV() {
        return this.mwE;
    }

    public void ad(ipf ipf2) {
        if (ipf2 == this.mwE) {
            return;
        }
        if (this.mwE != null) {
            this.mwE.removeFromParent();
        }
        this.mwE = ipf2;
        if (this.mwE != null) {
            this.W(this.mwE);
        }
    }

    public ipf dip() {
        return this.lMX;
    }

    public void h(ipf ipf2) {
        if (ipf2 == this.lMX) {
            return;
        }
        if (this.lMX != null) {
            this.lMX.removeFromParent();
        }
        this.lMX = ipf2;
        if (this.lMX != null) {
            this.W(this.lMX);
        }
    }

    public ipf doW() {
        return this.mwF;
    }

    public void ae(ipf ipf2) {
        if (ipf2 == this.mwF) {
            return;
        }
        if (this.mwF != null) {
            this.mwF.removeFromParent();
        }
        this.mwF = ipf2;
        if (this.mwF != null) {
            this.W(this.mwF);
        }
    }

    @Override
    public void kh(float f) {
        if (this.mwB != null) {
            this.mwB.hz(f);
        }
        if (this.mwC != null) {
            this.mwC.hz(f);
        }
        if (this.mwE != null) {
            this.mwE.hz(f);
        }
        if (this.lMX != null) {
            this.lMX.hz(f);
        }
        if (this.mwF != null) {
            this.mwF.hz(f);
        }
        if (this.mwA != null) {
            this.mwA.kh(f);
        }
        for (isb isb2 : this.lXe) {
            isb2.kh(f);
        }
    }

    public void doX() {
        this.mwD = true;
        this.pack();
    }

    public void SK(int n) {
        this.lXe.get(n).dpo();
    }

    public void SL(int n) {
        this.lXe.get(n).dbr();
    }

    public void doY() {
    }

    public void doZ() {
    }

    public void dpa() {
    }

    public void dpb() {
    }

    public int dpc() {
        return 0;
    }

    public int dpd() {
        return 0;
    }

    public int dpe() {
        return 0;
    }

    public int SN(int n) {
        return n;
    }

    public void d(joa joa2) {
    }

    private int af(ipf ipf2) {
        ipf ipf3;
        int n = 0;
        for (int i = 0; i < this.mwA.bfn() && (ipf3 = this.mwA.RO(i)) != ipf2; ++i) {
            if (!ipf3.djL()) continue;
            n += ipf3.getWidth();
        }
        return n;
    }

    private int f(ipf ipf2, int n) {
        if (ipf2 == null) {
            return n;
        }
        int n2 = this.af(ipf2);
        int n3 = n2 + n;
        if (n3 + ipf2.getWidth() > this.muM.getWidth()) {
            n -= n3 + ipf2.getWidth() - this.muM.getWidth();
        }
        if (n3 < 0) {
            n -= n3;
        }
        return n;
    }

    private void dpf() {
        if (this.mwB != null) {
            this.mwB.rF(this.mwA.getX() < 0);
            if (this.mwB.djR() && this.dpg()) {
                this.doY();
            } else {
                this.doZ();
            }
        }
        if (this.mwC != null) {
            this.mwC.rF(this.mwA.getX() > this.muM.getWidth() - this.mwA.getWidth());
            if (this.mwC.djR() && this.dph()) {
                this.dpa();
            } else {
                this.dpb();
            }
        }
    }

    private boolean dpg() {
        for (int i = 0; i < this.lXe.size(); ++i) {
            isb isb2 = this.lXe.get(i);
            if (isb2.getX() + isb2.getWidth() + this.mwA.getX() >= 0 || !isb2.isAnimated()) continue;
            return true;
        }
        return false;
    }

    private boolean dph() {
        for (int i = this.lXe.size() - 1; i >= 0; --i) {
            isb isb2 = this.lXe.get(i);
            if (isb2.getX() + this.mwA.getX() < this.muM.getWidth() || !isb2.isAnimated()) continue;
            return true;
        }
        return false;
    }

    static /* synthetic */ ipf b(isa isa2) {
        return isa2.mwE;
    }

    static /* synthetic */ ipf c(isa isa2) {
        return isa2.lMX;
    }

    static /* synthetic */ ipf d(isa isa2) {
        return isa2.mwF;
    }

    static /* synthetic */ isc e(isa isa2) {
        return isa2.mwA;
    }

    static /* synthetic */ ios f(isa isa2) {
        return isa2.mwB;
    }

    static /* synthetic */ ios g(isa isa2) {
        return isa2.mwC;
    }

    static /* synthetic */ ipz h(isa isa2) {
        return isa2.muM;
    }

    static /* synthetic */ boolean i(isa isa2) {
        return isa2.mwD;
    }

    static /* synthetic */ boolean a(isa isa2, boolean bl) {
        isa2.mwD = bl;
        return isa2.mwD;
    }

    static /* synthetic */ int a(isa isa2, ipf ipf2, int n) {
        return isa2.f(ipf2, n);
    }

    static /* synthetic */ void j(isa isa2) {
        isa2.dpf();
    }
}

