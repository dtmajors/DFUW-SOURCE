/*
 * Decompiled with CFR.
 */
public class drb
extends dqv
implements bto {
    public static final int gRx = 1;
    public static final int gRy = 2;
    public static final int gRz = 3;
    public static final int gRA = 4;
    private float gRB;
    private float gRC;
    private lcq gRD;
    private lcq gRE;
    private lcq gRF = null;
    private int gRG = 0;
    private float gRH = 0.5f;

    public drb() {
        this.ObjectType = 50;
        this.gQo = bfb.dfP;
        bew.d(this.gQo);
        this.gRB = 0.62f;
        this.gRC = 0.9f;
        this.gRD = new lcq(0.52156866f, 0.64705884f, 0.9372549f);
        this.gRE = new lcq(0.1f, 0.1f, 0.1f);
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            assert (this.GUID != null);
            super.initialize();
            this.iS(true);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.gPb != 0) {
            this.iS(false);
        }
    }

    public float buR() {
        return this.gRB;
    }

    public void bZ(float f2) {
        this.gRB = f2;
        this.gPb |= 2;
    }

    public float buS() {
        return this.gRC;
    }

    public void bY(float f2) {
        this.gRC = f2;
        this.gPb |= 4;
    }

    public lcq buT() {
        return this.gRD;
    }

    public void e(lcq lcq2) {
        this.gRD = lcq2;
        this.gPb |= 8;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1795: {
                this.a((fae)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fae fae2) {
        int n = fae2.bNL();
        if (n == 2) {
            this.MessageDelegator.hd(this.GUID);
            return;
        }
        if ((n & 8) != 0) {
            this.e(fae2.buT());
        }
        if ((n & 4) != 0) {
            this.bZ(fae2.buR());
        }
        if ((n & 0x10) != 0) {
            this.bY(fae2.buS());
        }
        if ((n & 0x20) != 0) {
            this.p(fae2.buU());
            this.gRF = new lcq(this.buU());
        }
        if ((n & 0x40) != 0) {
            float f2 = fae2.iGw;
            if (f2 < 0.0f || f2 > 1.0f) {
                lfn.b(5, this.getClass().getSimpleName(), "handleEnvironmentGlobalAtmosphereMessage() : Mulitplier is invalid = " + f2);
                return;
            }
            if (this.gRF == null) {
                this.gRF = new lcq(this.buU());
            }
            float f3 = this.gRF.a * f2;
            float f4 = this.gRF.r * f2;
            float f5 = this.gRF.g * f2;
            float f6 = this.gRF.b * f2;
            lcq lcq2 = new lcq(f4, f5, f6, f3);
            this.p(lcq2);
            n &= 0xFFFFFFBF;
            n |= 0x20;
        }
        if ((n & 0x80) != 0) {
            this.BA(fae2.buV());
        }
        if ((n & 0x100) != 0) {
            this.hu(fae2.buW());
        }
        this.iS(false);
    }

    private void iS(boolean bl) {
        kjq kjq2 = (kjq)this.MessageDelegator.h(1798);
        kjq2.tD(this.GUID);
        kjq2.ts(this.GUID);
        if (bl) {
            kjq2.FX(1);
            kjq2.lQ(false);
            kjq2.wD(true);
            kjq2.e(this.gRD);
            kjq2.bY(this.gRC);
            kjq2.bZ(this.gRB);
            kjq2.p(this.gRE);
            this.MessageDelegator.a(kjq2);
            this.gPb = 0;
            return;
        }
        kjq2.e(this.gRD);
        kjq2.bY(this.gRC);
        kjq2.bZ(this.gRB);
        kjq2.p(this.gRE);
        if ((this.gPb & 2) != 0) {
            kjq2.FX(kjq2.bNL() | 4);
            kjq2.bZ(this.gRB);
        }
        if ((this.gPb & 4) != 0) {
            kjq2.FX(kjq2.bNL() | 0x10);
            kjq2.bY(this.gRC);
        }
        if ((this.gPb & 8) != 0) {
            kjq2.FX(kjq2.bNL() | 8);
            kjq2.e(this.gRD);
        }
        if ((this.gPb & 0x10) != 0) {
            kjq2.FX(kjq2.bNL() | 0x20);
            kjq2.p(this.gRE);
        }
        this.MessageDelegator.a(kjq2);
        this.gPb = 0;
    }

    public lcq buU() {
        return this.gRE;
    }

    public void p(lcq lcq2) {
        this.gRE = lcq2;
        this.gPb |= 0x10;
    }

    @Override
    public Object gG(int n) {
        switch (n) {
            case 1: {
                return new Float(this.gRB);
            }
            case 2: {
                return new Float(this.gRC);
            }
            case 3: {
                return new lcq(this.gRD);
            }
            case 4: {
                return new lcq(this.gRE);
            }
        }
        lfn.b(4, this.getClass().getName(), "getPropertyValue() : Unknown PropertyID = " + n);
        assert (false);
        return null;
    }

    @Override
    public void a(int n, Object object) {
        switch (n) {
            case 1: {
                this.bZ(((Float)object).floatValue());
                break;
            }
            case 2: {
                this.bY(((Float)object).floatValue());
                break;
            }
            case 3: {
                this.e((lcq)object);
                break;
            }
            case 4: {
                this.p((lcq)object);
                break;
            }
            default: {
                lfn.b(4, this.getClass().getName(), "getPropertyValue() : Unknown PropertyID = " + n);
                assert (false);
                break;
            }
        }
    }

    public int buV() {
        return this.gRG;
    }

    public void BA(int n) {
        this.gRG = n;
    }

    public float buW() {
        return this.gRH;
    }

    public void hu(float f2) {
        this.gRH = f2;
    }
}

