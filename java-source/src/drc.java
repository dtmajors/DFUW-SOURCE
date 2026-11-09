/*
 * Decompiled with CFR.
 */
public class drc
extends dqv
implements bto {
    public static final int gRI = 1;
    public static final int dVl = 2;
    public static final int gpm = 3;
    public static final int gRJ = 4;
    private ljq tu;
    private ljq my;
    private float daN;
    private String[] gRK;

    public drc() {
        this.ObjectType = 51;
        this.gQo = bfb.dfQ;
        bew.d(this.gQo);
        this.buX();
    }

    private void buX() {
        this.tu = new ljq(0.0f, 0.0f, 0.0f);
        this.my = new ljq(0.0f, 0.0f, 0.0f);
        this.daN = 1.0f;
        this.gRK = new String[]{"clouds_gray_01.bmp", "clouds_gray_02.bmp", "clouds_gray_03.bmp", "clouds_gray_04.bmp", "clouds_gray_05.dds", "clouds_gray_06.dds", "clouds_gray_07.dds", "clouds_gray_08.dds"};
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            assert (this.GUID != null);
            super.initialize();
            this.iT(true);
            this.Initialized = true;
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.gPb != 0) {
            this.iT(false);
        }
    }

    public ljq fb() {
        return this.tu;
    }

    public void K(ljq ljq2) {
        this.tu = ljq2;
        this.gPb |= 2;
    }

    public ljq getRotation() {
        return this.my;
    }

    public void setRotation(ljq ljq2) {
        this.my = ljq2;
        this.gPb |= 4;
    }

    public float getScale() {
        return this.daN;
    }

    public void setScale(float f2) {
        this.daN = f2;
        this.gPb |= 8;
    }

    public String[] buY() {
        return this.gRK;
    }

    public void m(String[] stringArray) {
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1796: {
                this.a((fag)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fag fag2) {
        int n = fag2.bNM();
        if (n == 2) {
            this.MessageDelegator.hd(this.GUID);
            return;
        }
        if ((n & 8) != 0) {
            this.setRotation(fag2.getRotation());
        }
        if ((n & 0x10) != 0) {
            this.setScale(fag2.getScale());
        }
        if ((n & 4) != 0) {
            this.K(fag2.fb());
        }
        this.iT(false);
    }

    protected void iT(boolean bl) {
        kjt kjt2 = (kjt)this.MessageDelegator.h(1799);
        kjt2.tD(this.GUID);
        kjt2.ts(this.GUID);
        if (bl) {
            kjt2.Yp(1);
            kjt2.lQ(false);
            kjt2.wD(true);
            kjt2.K(this.tu);
            kjt2.setRotation(this.my);
            kjt2.setScale(this.daN);
            kjt2.m(this.gRK);
            kjt2.K(new ljq(0.0f, 0.0f, 0.0f));
            this.MessageDelegator.a(kjt2);
            this.gPb = 0;
            return;
        }
        if ((this.gPb & 2) != 0) {
            kjt2.Yp(kjt2.ebG() | 4);
            kjt2.K(this.tu);
        }
        if ((this.gPb & 4) != 0) {
            kjt2.Yp(kjt2.ebG() | 8);
            kjt2.setRotation(this.my);
        }
        if ((this.gPb & 8) != 0) {
            kjt2.Yp(kjt2.ebG() | 0x10);
            kjt2.setScale(this.daN);
        }
        if ((this.gPb & 0x10) != 0) {
            kjt2.m(this.gRK);
        }
        lfn.b(0, "SFWorldEnvironmentGlobalHemisphereObject", "sendGlobalHemisphereRequest() Modifying GlobalHemisphereObject " + this.GUID + " and RequestType=" + kjt2.ebG());
        this.MessageDelegator.a(kjt2);
        this.gPb = 0;
    }

    @Override
    public Object gG(int n) {
        return null;
    }

    @Override
    public void a(int n, Object object) {
    }
}

