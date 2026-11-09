/*
 * Decompiled with CFR.
 */
public class drx
extends dqn
implements ami {
    public static final int dVk = 1;
    public static final int gVg = 2;
    public static final int gVh = 3;
    public static final int gVi = 4;
    public static final int gVj = 5;
    public static final int gVk = 6;
    public static final int gVl = 7;
    public static final int MINSIZE = 8;
    public static final int gVm = 9;
    public static final int gVn = 10;
    public static final int gVo = 11;
    public static final int gVp = 12;
    public static final int gVq = 13;
    public static final int gVr = 14;
    public static final int gVs = 15;
    public static final int gVt = 16;
    public static final int gVu = 17;
    public static final int gVv = 18;
    public static final int gVw = 19;
    protected ljq Position = new ljq();
    protected lgl Rotation = new lgl();
    protected ljq gVx = new ljq(0.0f, -9.0f, 0.0f);
    protected ljq gVy = new ljq(2.0f, 8.0f, 2.0f);
    protected lcq gVz = new lcq(1.0f, 1.0f, 1.0f, 1.0f);
    protected lcq gVA = new lcq(0.1f, 0.1f, 0.1f, 0.1f);
    protected float gVB = 500.0f;
    protected float gVC = 500.0f;
    protected float gVD = 1.2f;
    protected float gVE = 0.0f;
    protected float gVF = 0.0f;
    protected float gVG = 1.0f;
    protected float gPP = 2.0f;
    protected boolean gwF = true;
    protected int gVH = 5;
    protected int gVI = 100;
    protected String fFC = "partikkel2.bmp";
    protected boolean gVJ = false;
    protected float gVK = (float)Math.PI;
    protected float gVL = (float)Math.PI * 2;

    public drx() {
        this.ObjectType = 36;
    }

    @Override
    public ljq av() {
        return this.Position;
    }

    @Override
    public ljq FX() {
        if (this.Rotation == null) {
            return null;
        }
        return this.Rotation.eqT();
    }

    @Override
    public void d(ljq ljq2) {
        if (this.Rotation == null) {
            this.Rotation = new lgl(ljq2);
        } else {
            this.Rotation.ep(ljq2);
        }
    }

    @Override
    public lgl aw() {
        return this.Rotation;
    }

    @Override
    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    @Override
    public void c(ljq ljq2) {
        this.Position = ljq2;
        this.gPb |= 2;
    }

    public ljq bwA() {
        return this.gVx;
    }

    public void cu(ljq ljq2) {
        this.gVx = ljq2;
        this.gPb |= 4;
    }

    public ljq bwB() {
        return this.gVy;
    }

    public void cv(ljq ljq2) {
        this.gVy = ljq2;
        this.gPb |= 8;
    }

    public lcq bwC() {
        return this.gVz;
    }

    public void C(lcq lcq2) {
        this.gVz = lcq2;
        this.gPb |= 0x10;
    }

    public lcq bwD() {
        return this.gVA;
    }

    public void D(lcq lcq2) {
        this.gVA = lcq2;
        this.gPb |= 0x20;
    }

    public float bwE() {
        return this.gVB;
    }

    public void hK(float f2) {
        this.gVB = f2;
        this.gPb |= 0x40;
    }

    public float bwF() {
        return this.gVC;
    }

    public void hL(float f2) {
        this.gVC = f2;
        this.gPb |= 0x80;
    }

    public float bwG() {
        return this.gVD;
    }

    public void hM(float f2) {
        this.gVD = f2;
        this.gPb |= 0x100;
    }

    public float bwH() {
        return this.gVE;
    }

    public void hN(float f2) {
        this.gVE = f2;
        this.gPb |= 0x200;
    }

    public float bwI() {
        return this.gVF;
    }

    public void hO(float f2) {
        this.gVF = f2;
        this.gPb |= 0x400;
    }

    public float bwJ() {
        return this.gVG;
    }

    public void hP(float f2) {
        this.gVG = f2;
        this.gPb |= 0x800;
    }

    public float bwK() {
        return this.gPP;
    }

    public void hs(float f2) {
        this.gPP = f2;
        this.gPb |= 0x1000;
    }

    public boolean isConstantSize() {
        return this.gwF;
    }

    public void setConstantSize(boolean bl) {
        this.gwF = bl;
        this.gPb |= 0x2000;
    }

    public int bwL() {
        return this.gVH;
    }

    public void BF(int n) {
        this.gVH = n;
        this.gPb |= 0x4000;
    }

    public int bwM() {
        return this.gVI;
    }

    public void BG(int n) {
        this.gVI = n;
        this.gPb |= 0x8000;
    }

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
        this.gPb |= 0x10000;
    }

    public boolean bwN() {
        return this.gVJ;
    }

    public void jj(boolean bl) {
        this.gVJ = bl;
        this.gPb |= 0x20000;
    }

    public float bwO() {
        return this.gVK;
    }

    public void hQ(float f2) {
        this.gVK = f2;
        this.gPb |= 0x40000;
    }

    public float bwP() {
        return this.gVL;
    }

    public void hR(float f2) {
        this.gVL = f2;
        this.gPb |= 0x80000;
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            super.initialize();
            this.BI(1);
            this.Initialized = true;
        }
    }

    @Override
    public void cleanUp() {
        if (this.MessageDelegator != null) {
            this.BI(2);
        } else {
            lfn.b(4, "SFWorldParticleSystemObject", "cleanUp() Could not cleanup since MessageDelegator was null!");
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 6657) {
            this.a((fwe)dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 5888) {
            this.ju(ktv2.axa());
        } else {
            super.receiveResponse(ktv2);
        }
    }

    protected void a(fwe fwe2) {
        int n = fwe2.bSo();
        lfn.b(0, "SFWorldParticleSystemObject", "handleModifyParticleSystemMessage() Received SFModifyParticleSystemMessage for object " + fwe2.oq() + ". ModifyType=" + n);
        if (fwe2.bSo() == 2) {
            this.MessageDelegator.hd(this.GUID);
            return;
        }
        if ((fwe2.bSo() & 0x400) != 0) {
            this.setConstantSize(fwe2.isConstantSize());
        }
        if ((fwe2.bSo() & 0x100) != 0) {
            this.C(fwe2.bwC());
        }
        if ((fwe2.bSo() & 0x200) != 0) {
            this.D(fwe2.bwD());
        }
        if ((fwe2.bSo() & 0x20000) != 0) {
            this.hs(fwe2.bwK());
        }
        if ((fwe2.bSo() & 0x10) != 0) {
            this.cu(fwe2.bwA());
        }
        if ((fwe2.bSo() & 0x20) != 0) {
            this.BG(fwe2.bwM());
        }
        if ((fwe2.bSo() & 0x1000) != 0) {
            this.hL(fwe2.bwF());
        }
        if ((fwe2.bSo() & 0x2000) != 0) {
            this.hM(fwe2.bwG());
        }
        if ((fwe2.bSo() & 0x40000) != 0) {
            this.BF(fwe2.bwL());
        }
        if ((fwe2.bSo() & 0x800) != 0) {
            this.hK(fwe2.bwE());
        }
        if ((fwe2.bSo() & 4) != 0) {
            this.c(fwe2.av());
        }
        if ((fwe2.bSo() & 0x4000) != 0) {
            this.hN(fwe2.bwH());
        }
        if ((fwe2.bSo() & 0x8000) != 0) {
            this.hO(fwe2.bwI());
        }
        if ((fwe2.bSo() & 0x10000) != 0) {
            this.hP(fwe2.bwJ());
        }
        if ((fwe2.bSo() & 0x80) != 0) {
            this.cv(fwe2.bwB());
        }
        if ((fwe2.bSo() & 8) != 0) {
            this.setTextureName(fwe2.getTextureName());
        }
        if ((fwe2.bSo() & 0x80000) != 0) {
            this.jj(fwe2.bwN());
        }
        if ((fwe2.bSo() & 0x100000) != 0) {
            this.hQ(fwe2.bwO());
        }
        if ((fwe2.bSo() & 0x200000) != 0) {
            this.hR(fwe2.bwP());
        }
        this.BI(fwe2.bSo());
    }

    private void BH(int n) {
    }

    protected void a(gtn gtn2) {
        gtj gtj2 = (gtj)this.MessageDelegator.h(8964, this.GUID, gtn2.aO());
        gtj2.c(this.Position);
        gtj2.cu(this.gVx);
        gtj2.cv(this.gVy);
        gtj2.C(this.gVz);
        gtj2.D(this.gVA);
        gtj2.hK(this.gVB);
        gtj2.hL(this.gVC);
        gtj2.hM(this.gVD);
        gtj2.hN(this.gVE);
        gtj2.hO(this.gVF);
        gtj2.hP(this.gVG);
        gtj2.hs(this.gPP);
        gtj2.setConstantSize(this.gwF);
        gtj2.BF(this.gVH);
        gtj2.BG(this.gVI);
        gtj2.setTextureName(this.fFC);
        gtj2.jj(this.gVJ);
        gtj2.hQ(this.gVK);
        gtj2.hR(this.gVL);
        this.MessageDelegator.I(gtj2);
    }

    protected void BI(int n) {
        kls kls2 = (kls)this.MessageDelegator.h(2561);
        kls2.Ih(n);
        kls2.pV(this.dJs);
        kls2.ts(this.GUID);
        if (n == 1) {
            kls2.wD(true);
            if (this.dJs != null) {
                kls2.lQ(false);
            } else {
                kls2.lQ(true);
            }
        }
        if ((this.gPb & 2) != 0) {
            kls2.Ih(kls2.bSo() | 4);
            kls2.c(this.Position);
        }
        if ((this.gPb & 4) != 0) {
            kls2.Ih(kls2.bSo() | 0x10);
            kls2.cu(this.gVx);
        }
        if ((this.gPb & 8) != 0) {
            kls2.Ih(kls2.bSo() | 0x80);
            kls2.cv(this.gVy);
        }
        if ((this.gPb & 0x10) != 0) {
            kls2.Ih(kls2.bSo() | 0x100);
            kls2.C(this.gVz);
        }
        if ((this.gPb & 0x20) != 0) {
            kls2.Ih(kls2.bSo() | 0x200);
            kls2.D(this.gVA);
        }
        if ((this.gPb & 0x40) != 0) {
            kls2.Ih(kls2.bSo() | 0x800);
            kls2.hK(this.gVB);
        }
        if ((this.gPb & 0x80) != 0) {
            kls2.Ih(kls2.bSo() | 0x1000);
            kls2.hL(this.gVC);
        }
        if ((this.gPb & 0x100) != 0) {
            kls2.Ih(kls2.bSo() | 0x2000);
            kls2.hM(this.gVD);
        }
        if ((this.gPb & 0x200) != 0) {
            kls2.Ih(kls2.bSo() | 0x4000);
            kls2.hN(this.gVE);
        }
        if ((this.gPb & 0x400) != 0) {
            kls2.Ih(kls2.bSo() | 0x8000);
            kls2.hO(this.gVF);
        }
        if ((this.gPb & 0x800) != 0) {
            kls2.Ih(kls2.bSo() | 0x10000);
            kls2.hP(this.gVG);
        }
        if ((this.gPb & 0x1000) != 0) {
            kls2.Ih(kls2.bSo() | 0x20000);
            kls2.hs(this.gPP);
        }
        if ((this.gPb & 0x2000) != 0) {
            kls2.Ih(kls2.bSo() | 0x400);
            kls2.setConstantSize(this.gwF);
        }
        if ((this.gPb & 0x4000) != 0) {
            kls2.Ih(kls2.bSo() | 0x40000);
            kls2.BF(this.gVH);
        }
        if ((this.gPb & 0x8000) != 0) {
            kls2.Ih(kls2.bSo() | 0x20);
            kls2.BG(this.gVI);
        }
        if ((this.gPb & 0x10000) != 0) {
            kls2.Ih(kls2.bSo() | 8);
            kls2.setTextureName(this.fFC);
        }
        if ((this.gPb & 0x20000) != 0) {
            kls2.Ih(kls2.bSo() | 0x80000);
            kls2.jj(this.gVJ);
        }
        if ((this.gPb & 0x40000) != 0) {
            kls2.Ih(kls2.bSo() | 0x100000);
            kls2.hQ(this.gVK);
        }
        if ((this.gPb & 0x80000) != 0) {
            kls2.Ih(kls2.bSo() | 0x200000);
            kls2.hR(this.gVL);
        }
        lfn.b(0, "SFWorldParticleSystemObject", "sendParticleSystemRequest() Modifying ParticleSystemObject " + this.GUID + " and ModifyType [" + n + "]");
        this.MessageDelegator.a(kls2);
        this.gPb = 0;
    }
}

