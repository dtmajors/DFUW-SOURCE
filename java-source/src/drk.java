/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
public class drk
extends dqv
implements bto {
    public static final int gTe = 1;
    public static final int gTf = 2;
    public static final int gTg = 3;
    public static final int gTh = 4;
    public static final int gTi = 5;
    public static final int gTj = 6;
    public static final int gTk = 7;
    public static final int gTl = 8;
    public static final int gTm = 9;
    public static final int gTn = 1;
    public static final int gTo = 2;
    public static final int gTp = 3;
    public static final int gTq = 4;
    public static final int gTr = 5;
    protected lcq gTs;
    protected lcq gTt;
    protected float evg;
    protected float evh;
    protected float gTu = 1.0f;
    protected boolean gTv;
    protected boolean gTw;
    protected int gTx = 1;
    protected boolean gTy;
    protected boolean gTz = false;
    private boolean gTA = false;

    public drk() {
        this.ObjectType = 33;
        this.gQo = bfb.dfR;
        bew.d(this.gQo);
        this.bvA();
    }

    private void bvA() {
        this.gTx = 1;
        this.gTu = 1.0f;
        this.evg = 0.03f;
        this.evh = 0.98f;
        this.gTv = true;
        this.gTw = true;
        this.gTs = new lcq(0.454f, 0.415f, 0.678f, 1.0f);
        this.gTt = new lcq(0.23f, 0.59f, 0.97f, 1.0f);
    }

    @Override
    public void initialize() {
        if (this.Initialized) {
            lfn.b(5, this.getClass().getSimpleName(), "initialize() : Alread initialized.");
            return;
        }
        assert (this.MessageDelegator != null) : "MessageDelegator is null.";
        super.initialize();
        if (!this.gQn) {
            return;
        }
        if (lcw.eng()) {
            if (lcr.rg != null && lcw.qFS) {
                this.bvB();
            } else {
                lfn.b(4, this.getClass().getName(), "initialize() : CameraObjectGUID = null. Gonna retry in Tick.");
            }
            return;
        }
        this.iL(lcr.rg);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.gTA) {
            if (lcr.rg != null && lcw.qFS) {
                this.bvB();
            }
            return;
        }
        if (this.gPb != 0) {
            this.bvD();
        }
    }

    private void bvB() {
        if (this.gTA) {
            lfn.b(4, this.getClass().getSimpleName(), "sendFogInitRequest() : Already sent Fog Init Request. <!>");
            return;
        }
        kka kka2 = (kka)this.MessageDelegator.h(1794);
        kka2.Ge(1);
        kka2.wD(true);
        kka2.lQ(false);
        kka2.tD(this.GUID);
        kka2.ts(this.GUID);
        kka2.s(this.gTt);
        kka2.d(this.gTs);
        kka2.cb(this.evg);
        kka2.ca(this.evh);
        kka2.bX(this.gTu);
        kka2.jc(this.gTv);
        kka2.jd(this.gTw);
        kka2.Gf(this.gTx);
        kka2.je(this.gTy);
        if (this.gTv) {
            kka2.oG(lcr.rg);
            kka2.wV(true);
        }
        this.gPb = 0;
        this.MessageDelegator.a(kka2);
        this.gTA = true;
    }

    @Override
    public void cleanUp() {
        if (this.MessageDelegator != null) {
            kka kka2 = (kka)this.MessageDelegator.h(1794);
            kka2.tD(this.GUID);
            kka2.Ge(2);
            kka2.ts(this.GUID);
            this.MessageDelegator.a(kka2);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1793: {
                this.b((far)dxq2);
                break;
            }
            case 12294: {
                this.a((fvu)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(fvu fvu2) {
        assert (!lcw.eng());
        this.bvB();
    }

    private void iL(ldv ldv2) {
        assert (ldv2 != null);
        fvq fvq2 = (fvq)this.MessageDelegator.h(12292, this.GUID, lcr.qzp);
        fvq2.hcg = 1;
        fvq2.hch = ldv2;
        lfn.b(0, "SFCameraManager", "sendObserverAddStatusObserverMessage() Sending ObserverAddStatusObserverMessage.");
        this.MessageDelegator.F(fvq2);
    }

    private boolean a(far far2) {
        if (far2.bNS()) {
            this.gTz = false;
            this.gPb = 510;
            return true;
        }
        if (far2.bNR()) {
            this.gTz = true;
            kka kka2 = (kka)this.MessageDelegator.h(1794);
            kka2.ts(this.GUID);
            kka2.tD(this.GUID);
            kka2.Ge(1020);
            kka2.d(far2.bvE());
            kka2.cb(far2.bvG());
            kka2.ca(far2.bvH());
            kka2.bX(far2.bvI());
            kka2.jc(far2.bvJ());
            kka2.jd(far2.bvK());
            kka2.Gf(far2.bNU());
            kka2.je(far2.bvM());
            if (far2.bvJ()) {
                kka2.oG(lcr.rg);
                kka2.wV(true);
            }
            this.MessageDelegator.a(kka2);
            return true;
        }
        return false;
    }

    private void b(far far2) {
        if (this.a(far2)) {
            return;
        }
        int n = far2.bNT();
        if ((n & 4) != 0) {
            this.d(far2.bvE());
        }
        if ((n & 0x40) != 0) {
            this.bX(far2.bvI());
        }
        if ((n & 8) != 0) {
            this.cb(far2.bvG());
        }
        if ((n & 0x10) != 0) {
            this.ca(far2.bvH());
        }
        if ((n & 0x200) != 0) {
            this.BB(far2.bNU());
        }
        if ((n & 0x20) != 0) {
            this.je(far2.bvM());
        }
        if ((n & 4) != 0) {
            this.d(far2.bvE());
        }
        if ((n & 0x80) != 0) {
            this.jc(far2.bvJ());
        }
        if ((n & 0x100) != 0) {
            this.jd(far2.bvK());
        }
        if ((n & 0x400) != 0) {
            this.s(far2.bvF());
        }
        this.bvD();
    }

    protected void bvC() {
        gti gti2 = (gti)this.MessageDelegator.h(8963, this.GUID, this.GUID);
        gti2.d(this.gTs);
        gti2.cb(this.evg);
        gti2.ca(this.evh);
        gti2.bX(this.gTu);
        gti2.jc(this.gTv);
        gti2.jd(this.gTw);
        gti2.BB(this.gTx);
        gti2.je(this.gTy);
        this.MessageDelegator.I(gti2);
    }

    private void bvD() {
        if (this.gTz) {
            return;
        }
        if (!this.Initialized) {
            return;
        }
        if (!this.gQn) {
            this.gPb = 0;
            return;
        }
        if (!this.gTA) {
            this.gPb = 0;
            return;
        }
        kka kka2 = (kka)this.MessageDelegator.h(1794);
        kka2.ts(this.GUID);
        kka2.tD(this.GUID);
        if ((this.gPb & 2) != 0) {
            kka2.Ge(kka2.bNT() | 4);
            kka2.d(this.gTs);
        }
        if ((this.gPb & 4) != 0) {
            kka2.Ge(kka2.bNT() | 8);
            kka2.cb(this.evg);
        }
        if ((this.gPb & 8) != 0) {
            kka2.Ge(kka2.bNT() | 0x10);
            kka2.ca(this.evh);
        }
        if ((this.gPb & 0x10) != 0) {
            kka2.Ge(kka2.bNT() | 0x40);
            kka2.bX(this.gTu);
        }
        if ((this.gPb & 0x20) != 0) {
            kka2.Ge(kka2.bNT() | 0x80);
            kka2.jc(this.gTv);
        }
        if ((this.gPb & 0x40) != 0) {
            kka2.Ge(kka2.bNT() | 0x100);
            kka2.jd(this.gTw);
        }
        if ((this.gPb & 0x80) != 0) {
            kka2.Ge(kka2.bNT() | 0x200);
            kka2.Gf(this.gTx);
        }
        if ((this.gPb & 0x100) != 0) {
            kka2.Ge(kka2.bNT() | 0x20);
            kka2.je(this.gTy);
        }
        if ((this.gPb & 0x200) != 0) {
            kka2.Ge(kka2.bNT() | 0x400);
            kka2.s(this.gTt);
        }
        if (this.gTv) {
            kka2.oG(lcr.rg);
            kka2.wV(true);
        }
        this.MessageDelegator.a(kka2);
        if (this.evg >= this.evh) {
            lfn.b(5, this.getClass().getSimpleName(), "sendLinearFogRequest() : FogStart is bigger than end. FogStart = " + this.evg + ", FogEnd = " + this.evh);
        }
        this.gPb = 0;
    }

    @Override
    public Object gG(int n) {
        switch (n) {
            case 1: {
                return new lcq(this.gTs);
            }
            case 2: {
                return new Float(this.evg);
            }
            case 3: {
                return new Float(this.evh);
            }
            case 4: {
                return new Float(this.gTu);
            }
            case 5: {
                return this.gTv;
            }
            case 6: {
                return this.gTw;
            }
            case 7: {
                return new Integer(this.gTx);
            }
            case 8: {
                return this.gTy;
            }
            case 9: {
                return new lcq(this.gTt);
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
                this.d((lcq)object);
                break;
            }
            case 2: {
                this.cb(((Float)object).floatValue());
                break;
            }
            case 3: {
                this.ca(((Float)object).floatValue());
                break;
            }
            case 4: {
                this.bX(((Float)object).floatValue());
                break;
            }
            case 5: {
                this.jc((Boolean)object);
                break;
            }
            case 6: {
                this.jd(((lch)object).booleanValue());
                break;
            }
            case 7: {
                this.BB((Integer)object);
                break;
            }
            case 8: {
                this.je(((lch)object).booleanValue());
                break;
            }
            case 9: {
                this.s((lcq)object);
                break;
            }
            default: {
                lfn.b(4, this.getClass().getName(), "setPropertyValue() : Unknown PropertyID = " + n);
                assert (false);
                break;
            }
        }
    }

    public lcq bvE() {
        return this.gTs;
    }

    public lcq bvF() {
        return this.gTt;
    }

    public void d(lcq lcq2) {
        this.gTs = lcq2;
        this.gPb |= 2;
    }

    public void s(lcq lcq2) {
        this.gTt = lcq2;
        this.gPb |= 0x200;
    }

    public float bvG() {
        return this.evg;
    }

    public void cb(float f2) {
        this.evg = f2;
        this.gPb |= 4;
        this.bvN();
    }

    public float bvH() {
        return this.evh;
    }

    public void ca(float f2) {
        this.evh = f2;
        this.gPb |= 8;
        this.bvN();
    }

    public float bvI() {
        return this.gTu;
    }

    public void bX(float f2) {
        this.gTu = f2;
        this.gPb |= 0x10;
    }

    public boolean bvJ() {
        return this.gTv;
    }

    public void jc(boolean bl) {
        this.gTv = bl;
        this.gPb |= 0x20;
    }

    public boolean bvK() {
        return this.gTw;
    }

    public void jd(boolean bl) {
        this.gTw = bl;
        this.gPb |= 0x40;
    }

    public int bvL() {
        return this.gTx;
    }

    public void BB(int n) {
        this.gTx = n;
        this.gPb |= 0x80;
    }

    public boolean bvM() {
        return this.gTy;
    }

    public void je(boolean bl) {
        this.gTy = bl;
        this.gPb |= 0x100;
    }

    private void bvN() {
        this.evg = lew.A(this.evg, 0.0f, 1.0f);
        this.evh = lew.A(this.evh, 0.0f, 1.0f);
        if (this.evg < this.evh) {
            return;
        }
        float f2 = this.evg - this.evh;
        this.evg -= f2;
        this.evg -= 0.05f;
        this.evh += 0.05f;
        this.evg = lew.A(this.evg, 0.01f, 1.0f);
        this.evh = lew.A(this.evh, 0.01f, 1.0f);
        if (this.evg >= this.evh) assert (false);
    }
}

