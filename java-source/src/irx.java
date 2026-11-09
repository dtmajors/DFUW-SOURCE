/*
 * Decompiled with CFR.
 */
public class irx
extends ipx {
    private boolean mwr;
    private int mws;
    private lie lBo;

    public irx() {
        this.a(irl.dnr());
    }

    @Override
    public boolean du(int n, int n2) {
        super.du(n, n2);
        boolean bl = this.eL(n, n2);
        this.rS(true);
        return bl;
    }

    @Override
    public boolean dN(int n, int n2) {
        this.rS(false);
        this.doF();
        return super.dN(n, n2);
    }

    private boolean eL(int n, int n2) {
        if (this.djJ() == null || !(this.djJ() instanceof iru)) {
            return false;
        }
        iru iru2 = (iru)this.djJ();
        if (iru2.dor() == null) {
            return false;
        }
        this.mws = iru2.dlY() == ire.mul ? ((n2 += this.getY()) < iru2.dor().getY() ? -1 : 1) : ((n += this.getX()) < iru2.dor().getX() ? -1 : 1);
        this.mwr = true;
        iru2.Sw(iru2.getValue());
        this.dac();
        this.lBo = new lie(this, 0.5, false){
            final /* synthetic */ irx mwt;
            {
                this.mwt = irx2;
                super(d2, bl);
            }

            public void dh(double d2) {
                this.stop();
                irx.b(this.mwt);
                irx.a(this.mwt, new lie(this, 0.25, true){
                    final /* synthetic */ 1 mwu;
                    {
                        this.mwu = var1_1;
                        super(d2, bl);
                    }

                    public void dh(double d2) {
                        irx.b(this.mwu.mwt);
                    }
                });
                irx.c(this.mwt).e(this.mwt.djE().getMessageDelegator());
            }
        };
        this.lBo.e(this.djE().getMessageDelegator());
        return true;
    }

    private void dac() {
        if (this.djJ() == null || !(this.djJ() instanceof iru)) {
            return;
        }
        iru iru2 = (iru)this.djJ();
        iru2.setValue(iru2.getValue() + this.mws * iru2.dow());
    }

    private void doF() {
        if (!this.mwr) {
            return;
        }
        this.mwr = false;
        if (this.lBo != null) {
            this.lBo.stop();
            this.lBo = null;
        }
        iru iru2 = (iru)this.djJ();
        iru2.Sx(iru2.getValue());
    }

    static /* synthetic */ void b(irx irx2) {
        irx2.dac();
    }

    static /* synthetic */ lie a(irx irx2, lie lie2) {
        irx2.lBo = lie2;
        return irx2.lBo;
    }

    static /* synthetic */ lie c(irx irx2) {
        return irx2.lBo;
    }
}

