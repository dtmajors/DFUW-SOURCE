/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.HashSet;
import java.util.Set;

public class dri
extends dqv
implements bto {
    public static final int gSE = 1;
    public static final int gSF = 2;
    dfu gSG;
    private boolean gSH = false;
    private float gSI = 1.0f;
    float gSJ = 48.0f;
    float gSK = 48.0f;
    int gSL = 100;
    int gSM = 600;
    float gSN = 0.1f;
    float gSO = 0.5f;
    float gSP = -1.8f;
    float gSQ = -2.7f;
    float gSR = 0.1f;
    float gSS = 2.0f;
    float gST = 0.1f;
    float gSU = 1.1f;
    private Set<abs> gSV = null;

    public dri() {
        this.gQo = bfb.dfV;
        this.ObjectType = 87;
    }

    @Override
    public void initialize() {
        if (lcw.eng()) {
            this.gPb = 2;
            this.gSH = true;
            this.bvu();
        }
        super.initialize();
    }

    private void bvt() {
        assert (this.gSG != null);
        if (this.gSG == null) {
            return;
        }
        this.gSG.setTextureRepeat(new ljp(1.0f, lew.o(this.gSJ, this.gSK, this.gSI)));
        this.gSG.setNumberOfRays(lew.d(this.gSL, this.gSM, this.gSI));
        this.gSG.setTextureScale(new ljp(0.18f, lew.o(this.gSN, this.gSO, this.gSI)));
        this.gSG.setTextureScrollSpeed(new ljp(0.0f, lew.o(this.gSP, this.gSQ, this.gSI)));
        this.gSG.setMaxParticleSwingFrequency(lew.o(this.gST, this.gSU, this.gSI));
        this.gSG.setMaxParticleSwingRadius(lew.o(this.gSR, this.gSS, this.gSI));
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.gPb != 0) {
            this.bvu();
        }
    }

    public void bvu() {
        if (this.gPb == 0) {
            return;
        }
        if ((this.gPb & 2) != 0) {
            if (this.gSH) {
                if (this.gSG != null) {
                    return;
                }
                this.gSG = new dfu();
                this.gSG.setGUID(this.MessageDelegator.bzv());
                this.gSG.hW(true);
                this.gSG.gw(3.0f);
                this.gSG.gv(20.0f);
                this.gSG.setRenderBoxUsageType(0);
                this.gSG.setMainTexture("sfx_rain_drip_04.dds");
                this.gSG.setImpactTexture("sfx_rain_splash_03.dds");
                this.gSG.setUseImpact(true);
                this.gSG.setMainColor(new lcq(0.572f, 0.5764f, 0.61567f));
                this.gSG.setStartingDirection(new ljq(0.0f, -1.0f, 0.0f));
                this.gSG.setUseWindInfluence(false);
                this.gSG.setMaxWindLerp(0.5f);
                this.gSG.setTextureRepeat(new ljp(1.0f, 60.0f));
                this.gSG.setNumberOfRays(500);
                this.gSG.setTextureScale(new ljp(0.18f, 12.01f));
                this.gSG.setTextureScrollSpeed(new ljp(0.0f, -1.0E-4f));
                this.gSG.setMaxParticleSwingFrequency(1.0f);
                this.gSG.setMaxParticleSwingRadius(5.1f);
                this.gSG.setImpactLifeTime(3.0f);
                this.gSG.setImpactTextureStartScale(new ljp(0.1f, 0.1f));
                this.gSG.setImpactTextureEndScale(new ljp(0.25f, 0.25f));
                this.gSG.gx(1.0f);
                this.gSG.setOffsetValues(new ljq(30.0f, 300.0f, 30.0f));
                this.gSG.setImpactStartColor(lcq.BRIGHT_WHITE);
                this.gSG.setImpactEndColor(lcq.BRIGHT_WHITE_TRANSPARENT);
                this.gSG.setUpdateAllLinesEveryFrame(false);
                this.gSG.c(new ljq());
                this.gSG.setUseCollisionTest(true);
                this.gSG.setNumParticlesPerLine(1);
                this.gSG.setAttachToCamera(true);
                this.bvt();
                this.MessageDelegator.a(this.gSG);
                this.iZ(true);
            } else {
                if (this.gSG == null) {
                    return;
                }
                this.MessageDelegator.hd(this.gSG.getGUID());
                this.gSG = null;
                this.iZ(false);
            }
        }
        if ((this.gPb & 4) != 0) {
            // empty if block
        }
        this.gPb = 0;
    }

    @Override
    public void cleanUp() {
        if (this.gSG != null) {
            this.MessageDelegator.hd(this.gSG.getGUID());
            this.iZ(false);
        }
        super.cleanUp();
    }

    public dfu bvv() {
        return this.gSG;
    }

    @Override
    public Object gG(int n) {
        switch (n) {
            case 1: {
                return this.gSH;
            }
            case 2: {
                return Float.valueOf(this.gSI);
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
                this.iY((Boolean)object);
                break;
            }
            case 2: {
                this.hC(((Float)object).floatValue());
                break;
            }
            default: {
                lfn.b(4, this.getClass().getName(), "setPropertyValue() : Unknown PropertyID = " + n);
                assert (false);
                break;
            }
        }
    }

    public boolean bvw() {
        return this.gSH;
    }

    public void iY(boolean bl) {
        this.gPb |= 2;
        this.gSH = bl;
        this.xu();
    }

    public void hC(float f2) {
        f2 = lew.A(f2, 0.0f, 1.0f);
        this.gPb |= 4;
        this.gSI = f2;
        if (this.gSG != null) {
            this.bvt();
        }
    }

    private void iZ(boolean bl) {
        kfu kfu2 = (kfu)this.MessageDelegator.BV(20);
        kfu2.ts(this.GUID);
        kfu2.Hl(1);
        kfu2.vh(bl);
        kfu2.tr(this.GUID);
        this.MessageDelegator.b(kfu2);
    }

    public void a(abs abs2) {
        if (abs2 == null) {
            return;
        }
        if (this.gSV == null) {
            this.gSV = lcn.emx();
        }
        this.gSV.add(abs2);
    }

    private void xu() {
        if (this.gSV == null) {
            return;
        }
        for (abs abs2 : new HashSet<abs>(this.gSV)) {
            abs2.xu();
        }
    }

    public void b(abs abs2) {
        if (abs2 == null) {
            return;
        }
        if (this.gSV == null) {
            return;
        }
        this.gSV.remove(abs2);
        if (this.gSV.isEmpty()) {
            this.gSV = null;
        }
    }
}

