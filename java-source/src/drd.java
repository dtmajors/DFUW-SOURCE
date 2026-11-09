/*
 * Decompiled with CFR.
 */
public class drd
extends dqv
implements bto {
    private static final boolean bC = false;
    public static final int gRL = 2;
    public static final int gRM = 3;
    public static final int gRN = 4;
    public static final int gRO = 5;
    public static final int gRP = 6;
    public static final int gRQ = 7;
    public static final int gRR = 8;
    public static final int gRS = 9;
    public static final int gRT = 10;
    public static final int gRU = 11;
    public static final int gRV = 12;
    public static final int gRW = 13;
    public static final int gRX = 14;
    public static final int gRY = 15;
    public static final int gRZ = 16;
    private String gSa;
    private ljq gSb;
    private lgl gSc;
    private lgl gSd;
    private ljq gSe;
    private ljq gSf;
    private lgl gSg;
    private lcq gSh;
    private lcq gSi = lcq.BRIGHT_WHITE;
    private float gsO;
    private float gSj;
    private float gSk;
    private boolean Visible;
    private boolean gSl;
    private float gSm = 1.0f;
    private ljq gSn = new ljq(0.0f, 0.0f, 0.0f);
    private ljq gSo = new ljq(0.0f, 0.0f, 0.0f);

    public drd(bfb bfb2) {
        this.gQo = bfb2;
        this.ObjectType = 58;
    }

    @Override
    public void initialize() {
        bew.d(this.gQo);
        if (this.Initialized) assert (false) : "Already initialized.";
        super.initialize();
        this.gSg = new lgl();
        this.gSf = new ljq(1.0f, 1.0f, 1.0f);
        this.hv(0.0f);
        this.iU(true);
        this.Initialized = true;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.gPb != 0) {
            this.iU(false);
            this.gPb = 0;
        }
    }

    public ljq buZ() {
        return this.gSb;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1797: {
                this.a((fah)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fah fah2) {
        int n = fah2.bNN();
        if (n == 2) {
            this.MessageDelegator.hd(this.GUID);
            return;
        }
        if ((n & 0x200) != 0) {
            this.iV(fah2.isActive());
        }
        if ((n & 4) != 0) {
            this.cm(fah2.buZ());
        }
        if ((n & 0x80) != 0) {
            this.hx(fah2.bvj());
        }
        if ((n & 0x40) != 0) {
            this.r(fah2.bvi());
        }
        if ((n & 0x20) != 0) {
            this.co(fah2.bvf());
        }
        if ((n & 8) != 0) {
            this.hw(fah2.bvh());
        }
        if ((n & 0x10) != 0) {
            this.cn(fah2.bve());
        }
        if ((n & 0x400) != 0) {
            this.cp(fah2.bvg());
        }
        if ((n & 0x100) != 0) {
            this.setVisible(fah2.isVisible());
        }
        if ((n & 0x800) != 0) {
            this.cl(fah2.bvd());
        }
        if ((n & 0x1000) != 0) {
            this.ck(fah2.bvl());
        }
    }

    protected void iU(boolean bl) {
        if (!this.gQn) {
            this.gPb = 0;
            return;
        }
        int n = 0;
        kju kju2 = (kju)this.MessageDelegator.h(1800);
        kju2.tD(this.GUID);
        kju2.ts(this.GUID);
        if (bl) {
            kju2.lQ(false);
            kju2.wD(true);
            kju2.FZ(1);
            kju2.cm(this.gSb);
            kju2.hw(this.gSj);
            kju2.I(this.gSc);
            kju2.J(this.gSd);
            kju2.r(this.gSh);
            kju2.hx(this.gsO);
            kju2.setVisible(this.Visible);
            kju2.setActive(this.gSl);
            kju2.H(this.gSg);
            kju2.cp(this.gSe);
            kju2.q(this.gSi);
            kju2.bM(this.gSf);
            kju2.iL(this.gSa);
            this.MessageDelegator.a(kju2);
            this.gPb = 0;
            return;
        }
        if ((this.gPb & 4) != 0 || bl) {
            n |= 4;
            kju2.cm(this.gSb);
        }
        if ((this.gPb & 8) != 0 || bl) {
            n |= 8;
            kju2.hw(this.gSj);
        }
        if ((this.gPb & 0x10) != 0 || bl) {
            n |= 0x10;
            kju2.I(this.gSc);
        }
        if ((this.gPb & 0x20) != 0 || bl) {
            n |= 0x20;
            kju2.J(this.gSd);
        }
        if ((this.gPb & 0x40) != 0 || bl) {
            n |= 0x40;
            kju2.r(this.gSh);
        }
        if ((this.gPb & 0x80) != 0 || bl) {
            n |= 0x80;
            kju2.hx(this.gsO);
        }
        if ((this.gPb & 0x100) != 0 || bl) {
            n |= 0x100;
            kju2.setVisible(this.Visible);
        }
        if ((this.gPb & 0x200) != 0 || bl) {
            n |= 0x200;
            kju2.setActive(this.gSl);
        }
        if ((this.gPb & 0x400) != 0 || bl) {
            n |= 0x400;
            kju2.cp(this.gSe);
        }
        if ((this.gPb & 0x800) != 0 || bl) {
            kju2.iL(this.gSa);
        }
        if ((this.gPb & 0x2000) != 0 || bl) {
            n |= 0x1000;
            kju2.hv(this.gSk);
        }
        if ((this.gPb & 0x1000) != 0 || bl) {
            n |= 0x800;
            kju2.q(this.gSi);
        }
        if ((this.gPb & 0x4000) != 0 || bl) {
            n |= 0x2000;
            kju2.H(this.gSg);
        }
        if ((this.gPb & 0x8000) != 0 || bl) {
            n |= 0x4000;
            kju2.bM(this.gSf);
        }
        kju2.FZ(n);
        this.MessageDelegator.a(kju2);
        this.gPb = 0;
    }

    public final float bva() {
        return this.gSk;
    }

    public final void hv(float f2) {
        this.gPb |= 0x2000;
        this.gSk = f2;
    }

    public final lcq bvb() {
        return this.gSi;
    }

    public final void q(lcq lcq2) {
        this.gPb |= 0x1000;
        this.gSi = new lcq(lcq2.r, lcq2.g, lcq2.b, this.gSm);
    }

    public final lgl bvc() {
        return this.gSg;
    }

    public final void H(lgl lgl2) {
        this.gPb |= 0x4000;
        this.gSg = lgl2;
    }

    public final ljq blS() {
        return this.gSf;
    }

    public final void bM(ljq ljq2) {
        this.gPb |= 0x8000;
        this.gSf = ljq2;
    }

    public final void ck(ljq ljq2) {
        this.gPb |= 0x8000;
        this.gSo = ljq2;
    }

    public final ljq bvd() {
        return this.gSn;
    }

    public final void cl(ljq ljq2) {
        this.gSn = ljq2;
    }

    @Override
    public Object gG(int n) {
        switch (n) {
            case 2: {
                return new ljq(this.gSb);
            }
            case 3: {
                return new Float(this.gSj);
            }
            case 4: {
                return this.gSc.eqT();
            }
            case 5: {
                return this.gSd.eqT();
            }
            case 6: {
                return new lcq(this.gSh);
            }
            case 7: {
                return new Float(this.gsO);
            }
            case 16: {
                return new Float(this.gSm);
            }
        }
        lfn.b(4, this.getClass().getName(), "getPropertyValue() : Unknown PropertyID = " + n);
        assert (false);
        return null;
    }

    @Override
    public void a(int n, Object object) {
        switch (n) {
            case 2: {
                this.cm((ljq)object);
                break;
            }
            case 3: {
                this.hw(((Float)object).floatValue());
                break;
            }
            case 4: {
                this.cn((ljq)object);
                break;
            }
            case 5: {
                this.co((ljq)object);
                break;
            }
            case 6: {
                this.r((lcq)object);
                break;
            }
            case 7: {
                this.hx(((Float)object).floatValue());
                break;
            }
            case 16: {
                this.hy(((Float)object).floatValue());
                break;
            }
            default: {
                lfn.b(4, this.getClass().getName(), "getPropertyValue() : Unknown PropertyID = " + n);
                assert (false);
                break;
            }
        }
    }

    public void cm(ljq ljq2) {
        this.gSb = ljq2;
        this.gPb |= 4;
    }

    public ljq bve() {
        return this.gSc.eqT();
    }

    public void cn(ljq ljq2) {
        this.gSc = new lgl(ljq2);
        this.gPb |= 0x10;
    }

    public void I(lgl lgl2) {
        this.gSc = lgl2;
        this.gPb |= 0x10;
    }

    public ljq bvf() {
        return this.gSd.eqT();
    }

    public void co(ljq ljq2) {
        this.gSd = new lgl(ljq2);
        this.gPb |= 0x20;
    }

    public void J(lgl lgl2) {
        this.gSd = lgl2;
        this.gPb |= 0x20;
    }

    public ljq bvg() {
        return this.gSe;
    }

    public void cp(ljq ljq2) {
        this.gSe = ljq2;
        this.gPb |= 0x400;
    }

    public float bvh() {
        return this.gSj;
    }

    public void hw(float f2) {
        this.gSj = f2;
        this.gPb |= 8;
    }

    public lcq bvi() {
        return this.gSh;
    }

    public void r(lcq lcq2) {
        this.gSh = lcq2;
        this.gPb |= 0x40;
    }

    public float bvj() {
        return this.gsO;
    }

    public void hx(float f2) {
        if (this.gsO == f2) {
            return;
        }
        this.gsO = f2;
        this.gPb |= 0x80;
    }

    public String blU() {
        return this.gSa;
    }

    public void iL(String string) {
        this.gSa = string;
        this.gPb |= 0x800;
    }

    public boolean isVisible() {
        return this.Visible;
    }

    public void setVisible(boolean bl) {
        if (this.Visible == bl) {
            return;
        }
        this.Visible = bl;
        this.gPb |= 0x100;
    }

    public boolean bvk() {
        return this.gSl;
    }

    public void iV(boolean bl) {
        if (this.gSl == bl) {
            return;
        }
        this.gPb |= 0x200;
        this.gSl = bl;
    }

    public ljq bvl() {
        return this.gSo;
    }

    public float bvm() {
        return this.gSm;
    }

    public void hy(float f2) {
        this.gSm = f2;
        this.q(this.gSi);
    }
}

