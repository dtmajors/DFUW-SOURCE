/*
 * Decompiled with CFR.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class dry
extends dqn
implements ami {
    public static final int gVt = 1;
    public static final int dVk = 2;
    public static final int gVM = 3;
    public static final int gVN = 4;
    public static final int gVO = 5;
    public static final int gVP = 6;
    public static final int gVQ = 7;
    public static final int gVR = 8;
    public static final int gVS = 9;
    public static final int gVT = 10;
    public static final int gVU = 11;
    public static final int gVV = 12;
    public static final int gVW = 13;
    public static final int gVX = 14;
    public static final int gVY = 15;
    public static final int gVZ = 16;
    public static final int gWa = 17;
    public static final int gWb = 18;
    public static final int gWc = 19;
    public static final int gWd = 20;
    public static final int gWe = 21;
    public static final int gWf = 22;
    public static final int gWg = 23;
    public static final int gWh = 24;
    public static final int gWi = 25;
    public static final int gWj = 26;
    public static final int gWk = 27;
    public static final int gWl = 28;
    public static final int gWm = 29;
    private String fFC;
    private ljq Position;
    private lgl Rotation;
    private float gWn;
    private float gWo;
    private float gWp;
    private float gWq;
    private float gWr;
    private float gWs;
    private float gWt;
    private float gWu;
    private float gWv;
    private float gWw;
    private float gWx;
    private float gWy;
    private float gWz;
    private float gWA;
    private float gWB;
    private float gWC;
    private float gWD;
    private float gWE;
    private float gWF;
    private float gWG;
    private float gWH;
    private float gWI;
    private ljr gWJ;
    private ljr gWK;
    private int gtp;
    private ljq mw;
    private ldv gWL = null;

    public dry() {
        this.ObjectType = 47;
        this.fFC = "particle_4.tga";
        this.gWn = 6.0f;
        this.gWo = 2.0f;
        this.gWp = 0.95f;
        this.gWq = 4.0f;
        this.gWr = 8.0f;
        this.gWs = 0.0f;
        this.gWt = 200.0f;
        this.gWu = 2.0f;
        this.gWv = 1.0f;
        this.gWw = 1.67f;
        this.gWx = 0.4f;
        this.gWy = 1.33f;
        this.gWz = 0.0f;
        this.gWA = 6.0f;
        this.gWB = 0.6f;
        this.gWC = 20.21f;
        this.gWD = 0.0f;
        this.gWE = 1.93f;
        this.gWF = 10.0f;
        this.gWG = 0.73f;
        this.gWH = 0.1f;
        this.gWI = 0.2f;
        this.gtp = 200;
        this.gWJ = new ljr(1.0f, 1.0f, 1.0f, 1.0f);
        this.gWK = new ljr(0.2f, 0.2f, 0.1f, 0.0f);
        this.mw = new ljq(0.0f, 0.0f, 0.0f);
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

    public String getTextureName() {
        return this.fFC;
    }

    public void setTextureName(String string) {
        this.fFC = string;
        this.gPb |= 2;
    }

    @Override
    public ljq av() {
        return this.Position;
    }

    @Override
    public void c(ljq ljq2) {
        this.Position = ljq2;
        this.gPb |= 4;
    }

    public float bwQ() {
        return this.gWn;
    }

    public void hS(float f2) {
        this.gWn = f2;
        this.gPb |= 8;
    }

    public float bwR() {
        return this.gWo;
    }

    public void hT(float f2) {
        this.gWo = f2;
        this.gPb |= 0x10;
    }

    public float bwS() {
        return this.gWp;
    }

    public void hU(float f2) {
        this.gWp = f2;
        this.gPb |= 0x20;
    }

    public float bwT() {
        return this.gWq;
    }

    public void hV(float f2) {
        this.gWq = f2;
        this.gPb |= 0x40;
    }

    public float bwU() {
        return this.gWr;
    }

    public void hW(float f2) {
        this.gWr = f2;
        this.gPb |= 0x80;
    }

    public float bwV() {
        return this.gWs;
    }

    public void hX(float f2) {
        this.gWs = f2;
        this.gPb |= 0x100;
    }

    public float bwW() {
        return this.gWt;
    }

    public void hY(float f2) {
        this.gWt = f2;
        this.gPb |= 0x200;
    }

    public float bwX() {
        return this.gWu;
    }

    public void hZ(float f2) {
        this.gWu = f2;
        this.gPb |= 0x400;
        lfn.b(0, "SFWorldTri1ParticleSystemObject", "setWind_heading() New WindHeading is: " + f2);
    }

    public float bwY() {
        return this.gWv;
    }

    public void ia(float f2) {
        this.gWv = f2;
        this.gPb |= 0x800;
    }

    public float bwZ() {
        return this.gWw;
    }

    public void ib(float f2) {
        this.gWw = f2;
        this.gPb |= 0x1000;
    }

    public float bxa() {
        return this.gWx;
    }

    public void ic(float f2) {
        this.gWx = f2;
        this.gPb |= 0x2000;
    }

    public float bxb() {
        return this.gWy;
    }

    public void id(float f2) {
        this.gWy = f2;
        this.gPb |= 0x4000;
    }

    public float bxc() {
        return this.gWz;
    }

    public void ie(float f2) {
        this.gWz = f2;
        this.gPb |= 0x8000;
    }

    public float bxd() {
        return this.gWA;
    }

    public void if(float f2) {
        this.gWA = f2;
        this.gPb |= 0x10000;
    }

    public float bxe() {
        return this.gWB;
    }

    public void ig(float f2) {
        this.gWB = f2;
        this.gPb |= 0x20000;
    }

    public float bxf() {
        return this.gWC;
    }

    public void ih(float f2) {
        this.gWC = f2;
        this.gPb |= 0x40000;
    }

    public float bxg() {
        return this.gWD;
    }

    public void ii(float f2) {
        this.gWD = f2;
        this.gPb |= 0x80000;
    }

    public float bxh() {
        return this.gWE;
    }

    public void ij(float f2) {
        this.gWE = f2;
        this.gPb |= 0x100000;
    }

    public float bxi() {
        return this.gWF;
    }

    public void ik(float f2) {
        this.gWF = f2;
        this.gPb |= 0x200000;
    }

    public float bxj() {
        return this.gWG;
    }

    public void il(float f2) {
        this.gWG = f2;
        this.gPb |= 0x400000;
    }

    public float bxk() {
        return this.gWH;
    }

    public void im(float f2) {
        this.gWH = f2;
        this.gPb |= 0x800000;
    }

    public float bxl() {
        return this.gWI;
    }

    public void in(float f2) {
        this.gWI = f2;
        this.gPb |= 0x1000000;
    }

    public lcq getStartColor() {
        return new lcq(this.gWJ.x, this.gWJ.y, this.gWJ.rlV, this.gWJ.rlW);
    }

    public void setStartColor(lcq lcq2) {
        this.gWJ.x = lcq2.r;
        this.gWJ.y = lcq2.g;
        this.gWJ.rlV = lcq2.b;
        this.gWJ.rlW = lcq2.a;
        this.gPb |= 0x2000000;
    }

    public lcq getEndColor() {
        return new lcq(this.gWK.getX(), this.gWK.getY(), this.gWK.bdV(), this.gWK.eqM());
    }

    public void setEndColor(lcq lcq2) {
        this.gWK.x = lcq2.r;
        this.gWK.y = lcq2.g;
        this.gWK.rlV = lcq2.b;
        this.gWK.rlW = lcq2.a;
        this.gPb |= 0x4000000;
    }

    public int getNumParticles() {
        return this.gtp;
    }

    public void setNumParticles(int n) {
        this.gtp = n;
        this.gPb |= 0x8000000;
    }

    public ljq boZ() {
        return this.mw;
    }

    public void ca(ljq ljq2) {
        this.mw = ljq2;
        this.gPb |= 0x10000000;
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            super.initialize();
            if (this.MessageDelegator != null) {
                this.gWL = this.MessageDelegator.bzv();
                this.BJ(1);
                this.Initialized = true;
            } else {
                lfn.b(4, "SFWorldTri1ParticleSystemObject", "initialize() Could not initialize. MessageDelegator was null!");
            }
        }
    }

    @Override
    public void cleanUp() {
        if (this.MessageDelegator != null) {
            this.BJ(2);
        } else {
            lfn.b(4, "SFWorldTri1ParticleSystemObject", "cleanUp() Could not cleanUp. MessageDelegator was null!");
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 6658) {
            this.a((fwf)dxq2);
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

    private void a(fwf fwf2) {
        int n = fwf2.bSq();
        lfn.b(0, "SFWorldTri1ParticleSystemObject", "receiveModifyParticleSystemMessage() Received SFModifyTri1ParticleSystemMessage for GUID [" + this.GUID + "] and ModifyType[" + n + "]");
        if (n == 2) {
            this.MessageDelegator.hd(this.GUID);
            return;
        }
        if ((n & 0x2000000) != 0) {
            this.setEndColor(fwf2.getEndColor());
        }
        if ((n & 0x100) != 0) {
            this.hY(fwf2.bwW());
        }
        if ((n & 0x40) != 0) {
            this.hW(fwf2.bwU());
        }
        if ((n & 0x20000) != 0) {
            this.ih(fwf2.bxf());
        }
        if ((n & 0x4000) != 0) {
            this.ie(fwf2.bxc());
        }
        if ((n & 0x8000) != 0) {
            this.if(fwf2.bxd());
        }
        if ((n & 0x10000) != 0) {
            this.ig(fwf2.bxe());
        }
        if ((n & 8) != 0) {
            this.hU(fwf2.bwS());
        }
        if ((n & 0x10) != 0) {
            this.hT(fwf2.bwR());
        }
        if ((n & 4) != 0) {
            this.hS(fwf2.bwQ());
        }
        if ((n & 0x100000) != 0) {
            this.ik(fwf2.bxi());
        }
        if ((n & 0x800000) != 0) {
            this.in(fwf2.bxl());
        }
        if ((n & 0x40000) != 0) {
            this.ii(fwf2.bxg());
        }
        if ((n & 0x80000) != 0) {
            this.ij(fwf2.bxh());
        }
        if ((n & 0x400000) != 0) {
            this.im(fwf2.bxk());
        }
        if ((n & 0x200000) != 0) {
            this.il(fwf2.bxj());
        }
        if ((n & 0x4000000) != 0) {
            this.setNumParticles(fwf2.getNumParticles());
        }
        if ((n & 0x10000000) != 0) {
            this.ca(fwf2.boZ());
        }
        if ((n & 0x1000000) != 0) {
            this.setStartColor(fwf2.getStartColor());
        }
        if ((n & 0x80) != 0) {
            this.hX(fwf2.bwV());
        }
        if ((n & 0x20) != 0) {
            this.hV(fwf2.bwT());
        }
        if ((n & 0x8000000) != 0) {
            this.setTextureName(fwf2.getTextureName());
        }
        if ((n & 0x2000) != 0) {
            this.id(fwf2.bxb());
        }
        if ((n & 0x200) != 0) {
            this.hZ(fwf2.bwX());
        }
        if ((n & 0x400) != 0) {
            this.ia(fwf2.bwY());
        }
        if ((n & 0x800) != 0) {
            this.ib(fwf2.bwZ());
        }
        if ((n & 0x1000) != 0) {
            this.ic(fwf2.bxa());
        }
        this.BJ(n);
    }

    protected void BJ(int n) {
        klt klt2 = (klt)this.MessageDelegator.h(2562);
        klt2.Ij(n);
        klt2.pV(this.dJs);
        klt2.ts(this.GUID);
        if (n == 1) {
            klt2.wD(true);
            if (this.dJs != null) {
                klt2.lQ(false);
            } else {
                klt2.lQ(true);
            }
        }
        if ((this.gPb & 2) != 0) {
            klt2.Ij(klt2.bSq() | 0x8000000);
            klt2.setTextureName(this.fFC);
        }
        if ((this.gPb & 4) != 0) {
            // empty if block
        }
        if ((this.gPb & 8) != 0) {
            klt2.Ij(klt2.bSq() | 4);
            klt2.hS(this.gWn);
        }
        if ((this.gPb & 0x10) != 0) {
            klt2.Ij(klt2.bSq() | 0x10);
            klt2.hT(this.gWo);
        }
        if ((this.gPb & 0x20) != 0) {
            klt2.Ij(klt2.bSq() | 8);
            klt2.hU(this.gWp);
        }
        if ((this.gPb & 0x40) != 0) {
            klt2.Ij(klt2.bSq() | 0x20);
            klt2.hV(this.gWq);
        }
        if ((this.gPb & 0x80) != 0) {
            klt2.Ij(klt2.bSq() | 0x40);
            klt2.hW(this.gWr);
        }
        if ((this.gPb & 0x100) != 0) {
            klt2.Ij(klt2.bSq() | 0x80);
            klt2.hX(this.gWs);
        }
        if ((this.gPb & 0x200) != 0) {
            klt2.Ij(klt2.bSq() | 0x100);
            klt2.hY(this.gWt);
        }
        if ((this.gPb & 0x400) != 0) {
            klt2.Ij(klt2.bSq() | 0x200);
            klt2.hZ(this.gWu);
        }
        if ((this.gPb & 0x800) != 0) {
            klt2.Ij(klt2.bSq() | 0x400);
            klt2.ia(this.gWv);
        }
        if ((this.gPb & 0x1000) != 0) {
            klt2.Ij(klt2.bSq() | 0x800);
            klt2.ib(this.gWw);
        }
        if ((this.gPb & 0x2000) != 0) {
            klt2.Ij(klt2.bSq() | 0x1000);
            klt2.ic(this.gWx);
        }
        if ((this.gPb & 0x4000) != 0) {
            klt2.Ij(klt2.bSq() | 0x2000);
            klt2.id(this.gWy);
        }
        if ((this.gPb & 0x8000) != 0) {
            klt2.Ij(klt2.bSq() | 0x4000);
            klt2.ie(this.gWz);
        }
        if ((this.gPb & 0x10000) != 0) {
            klt2.Ij(klt2.bSq() | 0x8000);
            klt2.if(this.gWA);
        }
        if ((this.gPb & 0x20000) != 0) {
            klt2.Ij(klt2.bSq() | 0x10000);
            klt2.ig(this.gWB);
        }
        if ((this.gPb & 0x40000) != 0) {
            klt2.Ij(klt2.bSq() | 0x20000);
            klt2.ih(this.gWC);
        }
        if ((this.gPb & 0x80000) != 0) {
            klt2.Ij(klt2.bSq() | 0x40000);
            klt2.ii(this.gWD);
        }
        if ((this.gPb & 0x100000) != 0) {
            klt2.Ij(klt2.bSq() | 0x80000);
            klt2.ij(this.gWE);
        }
        if ((this.gPb & 0x200000) != 0) {
            klt2.Ij(klt2.bSq() | 0x100000);
            klt2.ik(this.gWF);
        }
        if ((this.gPb & 0x400000) != 0) {
            klt2.Ij(klt2.bSq() | 0x200000);
            klt2.il(this.gWG);
        }
        if ((this.gPb & 0x800000) != 0) {
            klt2.Ij(klt2.bSq() | 0x400000);
            klt2.im(this.gWH);
        }
        if ((this.gPb & 0x1000000) != 0) {
            klt2.Ij(klt2.bSq() | 0x800000);
            klt2.in(this.gWI);
        }
        if ((this.gPb & 0x2000000) != 0) {
            klt2.Ij(klt2.bSq() | 0x1000000);
            klt2.i(this.gWJ);
        }
        if ((this.gPb & 0x4000000) != 0) {
            klt2.Ij(klt2.bSq() | 0x2000000);
            klt2.j(this.gWK);
        }
        if ((this.gPb & 0x8000000) != 0) {
            klt2.Ij(klt2.bSq() | 0x4000000);
            klt2.setNumParticles(this.gtp);
        }
        if ((this.gPb & 0x10000000) != 0) {
            klt2.Ij(klt2.bSq() | 0x10000000);
            klt2.ca(this.mw);
        }
        lfn.b(0, "SFWorldTri1ParticleSystemObject", "sendTri1ParticleSystemRequest() Modifying Tri1ParticleSystemObject " + this.GUID + " and ModifyType [" + n + "]");
        this.MessageDelegator.a(klt2);
        this.gPb = 0;
    }
}

