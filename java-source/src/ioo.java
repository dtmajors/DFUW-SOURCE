/*
 * Decompiled with CFR.
 */
public class ioo
extends ipx {
    private boolean moP;
    private boolean moQ;
    private lie moR;
    private double moS = 0.25;
    private double moT = 0.1;
    private ipf moU;
    private hvr moV;

    public ioo() {
        this.a(irl.dnr());
        this.rG(false);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.dio();
    }

    public boolean dil() {
        return this.moP;
    }

    public void qZ(boolean bl) {
        if (bl == this.moP) {
            return;
        }
        this.moP = bl;
        this.aTg();
    }

    public boolean dim() {
        return this.moQ;
    }

    public void ra(boolean bl) {
        this.moQ = bl;
    }

    public ipf din() {
        return this.moU;
    }

    public void r(ipf ipf2) {
        if (ipf2 == this.moU) {
            return;
        }
        if (ipf2 != null && ipf2.djJ() != this) {
            assert (false);
            return;
        }
        if (this.moU != null) {
            this.moU.setVisible(false);
        }
        this.moU = ipf2;
        if (this.moU != null) {
            this.moU.setVisible(true);
        }
    }

    public void aTg() {
    }

    @Override
    public boolean du(int n, int n2) {
        this.rS(true);
        this.qZ(true);
        if (this.moQ) {
            this.cLq();
            this.moR = new lie(this, this.moS, true){
                final /* synthetic */ ioo moW;
                {
                    this.moW = ioo2;
                    super(d2, bl);
                }

                public void dh(double d2) {
                    this.moW.cLq();
                    this.u(ioo.d(this.moW));
                }
            };
            this.moR.e(this.djE().getMessageDelegator());
        }
        return true;
    }

    @Override
    public boolean dN(int n, int n2) {
        this.qZ(false);
        if (!this.dma()) {
            return false;
        }
        this.rS(false);
        if (!this.moQ) {
            if (this.dF(n, n2)) {
                hso.cxK().cxP().czx().czM();
                this.cLq();
            }
        } else if (this.moR != null) {
            this.moR.stop();
            this.moR = null;
        }
        return true;
    }

    @Override
    public boolean dK(int n, int n2) {
        super.dK(n, n2);
        this.aTg();
        return true;
    }

    @Override
    public boolean dL(int n, int n2) {
        this.aTg();
        return true;
    }

    @Override
    public void cPv() {
        this.aTg();
    }

    @Override
    public void cPw() {
        this.aTg();
    }

    @Override
    public void cND() {
        this.aTg();
    }

    public void cLq() {
    }

    @Override
    public void a(ipf ipf2, int n) {
        super.a(ipf2, n);
        if (ipf2 == this.moU) {
            this.moU = null;
        }
    }

    private void b(ipf ipf2, ipf ipf3) {
        this.dio();
        this.moV = new hvt(ipf2, ipf3, 0.25);
        hso.cxK().cxP().czy().a(this.moV);
    }

    private void dio() {
        if (this.moV != null) {
            hso.cxK().cxP().czy().b(this.moV);
            this.moV = null;
        }
    }

    static /* synthetic */ double d(ioo ioo2) {
        return ioo2.moT;
    }
}

