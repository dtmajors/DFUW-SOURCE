/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public abstract class iqe
extends lie {
    private a mtw = a.mtE;
    private ipq mtx;
    private int mty;
    private int mtz;
    private double lfU;
    private hyn mtA;
    private float mtB = 0.0f;
    private float mtC = 0.0f;
    private double lfT = 0.0;

    public iqe(ipq ipq2, int n, int n2, double d2) {
        super(1.0, true);
        this.mtx = ipq2;
        this.mty = n;
        this.mtz = n2;
        this.lfU = d2;
    }

    @Override
    public void dh(double d2) {
        switch (this.mtw) {
            case mtE: {
                if (!this.mtx.djE().dhM() || this.mtx.djE().dhJ().dky()) break;
                this.mtA = this.mtx.dd(this.mty, this.mtz);
                if (this.mtA != null) {
                    this.mtw = a.mtF;
                    ioc ioc2 = this.mtx.eo(this.mty, this.mtz);
                    this.mtA.db(ioc2.cf, ioc2.cg);
                    this.mtA.setGUID(this.getMessageDelegator().bzv());
                    this.getMessageDelegator().a((amf)this.mtA);
                    break;
                }
                this.cGR();
                break;
            }
            case mtF: {
                if (!this.mtA.cFm()) break;
                this.mtw = a.mtG;
                this.mtB = this.mtx.djE().cEE();
                this.mtC = this.mtx.djE().cEF();
                this.lfT = d2;
                break;
            }
            case mtG: {
                if (!(d2 - this.lfT >= this.lfU) && this.mtx.djE().cEE() == this.mtB && this.mtx.djE().cEF() == this.mtC && this.mtx.djN()) break;
                this.mtA.getMessageDelegator().hd(this.mtA.getGUID());
                this.cGR();
            }
        }
    }

    public void close() {
        this.stop();
        if (this.mtA != null) {
            this.mtA.getMessageDelegator().hd(this.mtA.getGUID());
        }
    }

    public abstract void cGR();
}

