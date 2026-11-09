/*
 * Decompiled with CFR.
 */
public abstract class lie
extends btk
implements bto {
    private double roi = 0.0;
    private boolean roj = false;
    private double rok = 0.0;
    private double lfT = 0.0;
    private boolean rol = false;

    public lie(double d2, boolean bl) {
        this.roi = d2;
        this.roj = bl;
    }

    public lie(double d2) {
        this(d2, false);
    }

    public void e(dxr dxr2) {
        if (this.MessageDelegator != null) {
            return;
        }
        this.rok = 0.0;
        this.lfT = 0.0;
        this.setGUID(dxr2.bzv());
        dxr2.a(this);
        if (this.roj) {
            this.dh(0.0);
        }
    }

    public void restart() {
        if (this.getMessageDelegator() != null) {
            this.lfT = this.rok = this.getMessageDelegator().arc().rgz;
        }
    }

    public void stop() {
        if (this.MessageDelegator != null) {
            this.rol = true;
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.rol) {
            if (this.MessageDelegator != null) {
                this.MessageDelegator.hd(this.GUID);
            }
            return;
        }
        if (this.rok > 0.0) {
            if (ldz2.rgz - this.rok >= this.roi) {
                this.dh(ldz2.rgz - this.lfT);
                if (!this.roj) {
                    this.stop();
                } else {
                    this.rok = ldz2.rgz;
                }
            }
        } else {
            this.lfT = this.rok = ldz2.rgz;
        }
    }

    public double Az() {
        return this.roi;
    }

    public void u(double d2) {
        this.roi = d2;
    }

    public abstract void dh(double var1);
}

