/*
 * Decompiled with CFR.
 */
public class iyj
extends isc {
    private static iqz mdv = new iqz(){

        public void e(ipf ipf2) {
            iph iph2 = (iph)ipf2;
            int n = 0;
            for (int i = 0; i < iph2.bfn(); ++i) {
                ipf ipf3 = iph2.RO(i);
                if (!ipf3.djL()) continue;
                n += ipf3.getWidth();
            }
            iph2.setSize(n, 24);
        }

        public void i(ipf ipf2) {
            iph iph2 = (iph)ipf2;
            int n = 0;
            for (int i = 0; i < iph2.bfn(); ++i) {
                ipf ipf3 = iph2.RO(i);
                if (!ipf3.djL()) continue;
                if (ipf3 instanceof isb) {
                    ipf3.ek(n, 0);
                } else {
                    ipf3.r(n, 0, ipf3.getWidth(), iph2.getHeight());
                }
                n += ipf3.getWidth();
            }
        }
    };

    public iyj() {
        this.a(mdv);
    }

    @Override
    public final void a(isb isb2, int n) {
        if (n < this.bfn() && this.RO(n) instanceof iwx) {
            ++n;
        }
        super.a(isb2, n);
    }

    @Override
    public void kh(float f2) {
        super.kh(f2);
        for (int i = 0; i < this.bfn(); ++i) {
            ipf ipf2 = this.RO(i);
            if (!(ipf2 instanceof iwx)) continue;
            ipf2.hz(f2);
        }
    }

    @Override
    public void d(ipf ipf2, int n) {
        super.d(ipf2, n);
        if (ipf2 instanceof isb) {
            this.Ti(n + 1);
        }
    }

    @Override
    public void a(ipf ipf2, int n) {
        super.a(ipf2, n);
        if (ipf2 instanceof isb) {
            this.Tj(n);
        }
    }

    private static iwx dsQ() {
        return new iwx(1, 0);
    }

    private boolean Th(int n) {
        return n < this.bfn() ? this.RO(n) instanceof iwx : false;
    }

    private void Ti(int n) {
        if (this.Th(n)) {
            return;
        }
        this.c(iyj.dsQ(), n);
    }

    private void Tj(int n) {
        if (!this.Th(n)) {
            return;
        }
        this.RP(n);
    }
}

