/*
 * Decompiled with CFR.
 */
public class drf
extends dqv
implements bto {
    private static final boolean bC = false;
    public static final int gSt = 1;
    public static final int Ei = 2;
    public static final int gSu = 3;
    public static final int gSv = 4;
    public static final int gSw = 5;
    private float gSx;
    private float bWP;
    private float gSy;
    private float fXV;
    private ljq mx;

    public drf() {
        this.ObjectType = 59;
        this.gQo = bfb.dfO;
        bew.d(this.gQo);
        this.buX();
    }

    private void buX() {
        this.gSx = 0.33f;
        this.bWP = 0.26f;
        this.gSy = 0.2f;
        this.fXV = 0.15f;
        this.mx = new ljq(0.2f, 0.0f, -0.2f);
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            assert (this.GUID != null);
            super.initialize();
            this.iX(true);
            this.Initialized = true;
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.gPb != 0) {
            this.iX(false);
        }
    }

    public float bvp() {
        return this.gSx;
    }

    public void hA(float f2) {
        this.gSx = f2;
        this.gPb |= 2;
    }

    public float bnS() {
        return this.bWP;
    }

    public void gL(float f2) {
        this.bWP = f2;
        this.gPb |= 4;
    }

    public float bvq() {
        return this.gSy;
    }

    public void hB(float f2) {
        this.gSy = f2;
        this.gPb |= 8;
    }

    public float getSpeed() {
        return this.fXV;
    }

    public void setSpeed(float f2) {
        this.fXV = f2;
        this.gPb |= 0x10;
    }

    public ljq bpa() {
        return this.mx;
    }

    public void cq(ljq ljq2) {
        this.mx = ljq2;
        this.gPb |= 0x20;
    }

    @Override
    public void cleanUp() {
        if (this.MessageDelegator == null) {
            lfn.b(4, "SFWorldEnvironmentGlobalWindObject", "cleanUp() Could not cleanUp. MessageDelegator was null!");
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1798: {
                this.a((faj)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(faj faj2) {
        int n = faj2.bNO();
        if ((n & 8) != 0) {
            this.cq(faj2.bpa());
        }
        if ((n & 0x10) != 0) {
            this.hB(faj2.bvq());
        }
        if ((n & 0x20) != 0) {
            this.setSpeed(faj2.getSpeed());
        }
        if ((n & 4) != 0) {
            this.gL(faj2.bnS());
        }
        if ((n & 2) != 0) {
            this.hA(faj2.bvp());
        }
        this.iX(false);
    }

    private void iX(boolean bl) {
        kjw kjw2 = (kjw)this.MessageDelegator.h(1802);
        kjw2.tD(this.GUID);
        kjw2.ts(this.GUID);
        if (bl) {
            kjw2.Ga(1);
            kjw2.lQ(false);
            kjw2.wD(true);
            kjw2.hA(this.gSx);
            kjw2.gL(this.bWP);
            kjw2.hB(this.gSy);
            kjw2.setSpeed(this.fXV);
            kjw2.cq(this.mx);
            this.MessageDelegator.a(kjw2);
            this.gPb = 0;
            return;
        }
        if ((this.gPb & 2) != 0) {
            kjw2.Ga(kjw2.bNO() | 2);
            kjw2.hA(this.gSx);
        }
        if ((this.gPb & 4) != 0) {
            kjw2.Ga(kjw2.bNO() | 4);
            kjw2.gL(this.bWP);
        }
        if ((this.gPb & 8) != 0) {
            kjw2.Ga(kjw2.bNO() | 0x10);
            kjw2.hB(this.gSy);
        }
        if ((this.gPb & 0x10) != 0) {
            kjw2.Ga(kjw2.bNO() | 0x20);
            kjw2.setSpeed(this.fXV);
        }
        if ((this.gPb & 0x20) != 0) {
            kjw2.Ga(kjw2.bNO() | 8);
            kjw2.cq(this.mx);
        }
        this.MessageDelegator.a(kjw2);
        this.gPb = 0;
    }

    @Override
    public void a(int n, Object object) {
    }

    @Override
    public Object gG(int n) {
        return null;
    }
}

