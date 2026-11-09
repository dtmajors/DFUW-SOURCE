/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 */
public class dqs
extends dqk {
    public static final int gPk = 1;
    public static final int gPl = 2;
    public static final int gPm = 4;
    public static final int gPn = 8;
    public static final int gPo = 16;
    public static final int gPp = 32;
    private int gPq;
    private float Radius;
    private float gPr;
    private float gPs;
    private float gPt;
    private float gPu;
    private int gPv;
    private int gPw;
    private int gPx;
    private int gPy;

    public dqs() {
        this.ObjectType = 54;
        this.gPs = 80.0f;
        this.gPt = 10.0f;
        this.gPu = 50.0f;
    }

    public void initialize() {
        if (!this.Initialized) {
            this.gOY = false;
            super.initialize();
            if (this.gPq != 0) {
                this.Bt(this.gPq);
                this.Initialized = true;
            } else {
                lfn.b(5, "SFWorldShapeObject", "initialize() : Invalid ObjectShapeType!");
            }
            this.eqa = true;
        }
    }

    public void cleanUp() {
        klb klb2 = (klb)this.MessageDelegator.h(1026);
        klb2.ts(this.GUID);
        klb2.HX(klb.iHB);
        klb2.hC(this.dJs);
        this.MessageDelegator.a(klb2);
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1027: {
                this.MessageDelegator.hd(this.GUID);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 1024) {
            this.ju(ktv2.axa());
        } else {
            super.receiveResponse(ktv2);
        }
    }

    private void Bt(int n) {
        klh klh2 = (klh)this.MessageDelegator.h(1033);
        klh2.wD(true);
        klh2.ts(this.GUID);
        klh2.hC(this.dJs);
        klh2.setWidth(this.gPs);
        klh2.hq(this.gPt);
        klh2.hr(this.gPu);
        klh2.setRadius(this.Radius);
        klh2.hp(this.gPr);
        klh2.Bu(this.gPv);
        klh2.Bv(this.gPw);
        klh2.Bw(this.gPx);
        klh2.Bx(this.gPy);
        klh2.Lj(n);
        klh2.c(this.Position);
        klh2.setRotation(this.FX());
        this.MessageDelegator.a(klh2);
    }

    protected void btH() {
    }

    protected void btC() {
    }

    protected void btD() {
    }

    public float getRadius() {
        return this.Radius;
    }

    public void setRadius(float f2) {
        this.Radius = f2;
    }

    public float buq() {
        return this.gPr;
    }

    public void hp(float f2) {
        this.gPr = f2;
    }

    public float getWidth() {
        return this.gPs;
    }

    public void setWidth(float f2) {
        this.gPs = f2;
    }

    public float getHeight() {
        return this.gPt;
    }

    public void hq(float f2) {
        this.gPt = f2;
    }

    public float bur() {
        return this.gPu;
    }

    public void hr(float f2) {
        this.gPu = f2;
    }

    public int bus() {
        return this.gPv;
    }

    public void Bu(int n) {
        this.gPv = n;
    }

    public int but() {
        return this.gPw;
    }

    public void Bv(int n) {
        this.gPw = n;
    }

    public int buu() {
        return this.gPx;
    }

    public void Bw(int n) {
        this.gPx = n;
    }

    public int buv() {
        return this.gPy;
    }

    public void Bx(int n) {
        this.gPy = n;
    }

    public int buw() {
        return this.gPq;
    }

    public void By(int n) {
        this.gPq = n;
    }
}

