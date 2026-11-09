/*
 * Decompiled with CFR.
 */
public class irw
extends ipx {
    private int mwn = 3;
    private int mwo = 3;
    private int mwp = Integer.MAX_VALUE;
    private int mwq = Integer.MAX_VALUE;
    private static iqz mdv = new irl(){

        public void e(ipf ipf2) {
            irw irw2 = (irw)ipf2;
            super.e(irw2);
            irw2.setSize(lew.R(irw.b(irw2), irw2.getWidth(), irw.c(irw2)), lew.R(irw.d(irw2), irw2.getHeight(), irw.e(irw2)));
        }

        public void i(ipf ipf2) {
            irw irw2 = (irw)ipf2;
            irw2.setSize(lew.R(irw.b(irw2), irw2.getWidth(), irw.c(irw2)), lew.R(irw.d(irw2), irw2.getHeight(), irw.e(irw2)));
            super.i(irw2);
        }
    };

    public irw() {
        this.a(mdv);
    }

    public int ctv() {
        return this.mwn;
    }

    public void SA(int n) {
        if (n == this.mwn) {
            return;
        }
        this.mwn = n;
        this.pack();
    }

    public int ctw() {
        return this.mwo;
    }

    public void SB(int n) {
        if (n == this.mwo) {
            return;
        }
        this.mwo = n;
        this.pack();
    }

    public int doD() {
        return this.mwp;
    }

    public void SC(int n) {
        if (n == this.mwp) {
            return;
        }
        this.mwp = n;
        this.pack();
    }

    public int doE() {
        return this.mwq;
    }

    public void SD(int n) {
        if (n == this.mwq) {
            return;
        }
        this.mwq = n;
        this.pack();
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
    public void x(int n, int n2, int n3, int n4) {
        iru iru2;
        if (this.djJ() == null || !(this.djJ() instanceof iru)) {
            return;
        }
        iru2.Sw((iru2 = (iru)this.djJ()).dlY() == ire.mul ? iru2.Sz(n2) : iru2.Sz(n));
    }

    @Override
    public void n(int n, int n2, int n3, int n4) {
        iru iru2;
        if (this.djJ() == null || !(this.djJ() instanceof iru)) {
            return;
        }
        iru2.Sy((iru2 = (iru)this.djJ()).dlY() == ire.mul ? iru2.Sz(n2) : iru2.Sz(n));
    }

    @Override
    public void o(int n, int n2, int n3, int n4) {
        iru iru2;
        if (this.djJ() == null || !(this.djJ() instanceof iru)) {
            return;
        }
        iru2.Sx((iru2 = (iru)this.djJ()).dlY() == ire.mul ? iru2.Sz(n2) : iru2.Sz(n));
    }

    static /* synthetic */ int b(irw irw2) {
        return irw2.mwn;
    }

    static /* synthetic */ int c(irw irw2) {
        return irw2.mwp;
    }

    static /* synthetic */ int d(irw irw2) {
        return irw2.mwo;
    }

    static /* synthetic */ int e(irw irw2) {
        return irw2.mwq;
    }
}

