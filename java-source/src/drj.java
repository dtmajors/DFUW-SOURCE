/*
 * Decompiled with CFR.
 */
import java.util.HashSet;
import java.util.Set;

public class drj
extends dqv
implements bto {
    public static final int gSW = 1;
    public static final int gSX = 2;
    dfu gSG;
    private boolean gSY;
    private float gSZ = 0.0f;
    float gTa = 0.2f;
    float gTb = 0.25f;
    float gST = 0.2f;
    float gSU = 0.4f;
    int gTc = 4;
    int gTd = 40;
    float gSR = 5.0f;
    float gSS = 7.0f;
    private Set<abs> gSV = null;

    public drj() {
        this.gQo = bfb.dfW;
        this.ObjectType = 88;
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.gPb != 0) {
            this.bvu();
        }
    }

    private void bvt() {
        this.gSG.setTextureScale(new ljp(lew.o(this.gTa, this.gTb, this.gSZ), lew.o(this.gTa, this.gTb, this.gSZ)));
        this.gSG.setMaxParticleSwingFrequency(lew.o(this.gST, this.gSU, this.gSZ));
        this.gSG.setNumParticlesPerLine(lew.d(this.gTc, this.gTd, this.gSZ));
        this.gSG.setMaxParticleSwingRadius(lew.o(this.gSR, this.gSS, this.gSZ));
    }

    public void bvu() {
        if (this.gPb == 0) {
            return;
        }
        if ((this.gPb & 2) != 0) {
            if (this.gSY) {
                if (this.gSG != null) {
                    return;
                }
                this.bvx();
                this.bvt();
                this.MessageDelegator.a(this.gSG);
                this.jb(true);
            } else {
                if (this.gSG == null) {
                    return;
                }
                this.MessageDelegator.hd(this.gSG.getGUID());
                this.gSG = null;
                this.jb(false);
            }
        }
        if ((this.gPb & 4) != 0) {
            // empty if block
        }
        this.gPb = 0;
    }

    private void bvx() {
        this.gSG = new dfu();
        this.gSG.setGUID(this.MessageDelegator.bzv());
        this.gSG.setRenderBoxUsageType(1);
        this.gSG.hW(true);
        this.gSG.gw(3.0f);
        this.gSG.gv(20.0f);
        this.gSG.setMainTexture("sfx_snow_flake_01.dds");
        this.gSG.setNumberOfRays(800);
        this.gSG.setUseImpact(false);
        this.gSG.setMainColor(lcq.BRIGHT_WHITE);
        this.gSG.setStartingDirection(new ljq(0.0f, -1.0f, 0.0f));
        this.gSG.setUseWindInfluence(false);
        this.gSG.setMaxWindLerp(0.5f);
        this.gSG.gx(0.2f);
        this.gSG.setOffsetValues(new ljq(40.0f, 200.0f, 40.0f));
        this.gSG.setTextureRepeat(new ljp(1.0f, 1.0f));
        this.gSG.setTextureScale(new ljp(0.2f, 0.2f));
        this.gSG.setTextureScrollSpeed(new ljp(0.4f, -0.01f));
        this.gSG.setUpdateAllLinesEveryFrame(false);
        this.gSG.c(new ljq());
        this.gSG.setUseCollisionTest(true);
        this.gSG.setMaxParticleSwingFrequency(0.5f);
        this.gSG.setNumParticlesPerLine(20);
        this.gSG.setMaxParticleSwingRadius(10.1f);
        this.gSG.setAttachToCamera(true);
    }

    @Override
    public void cleanUp() {
        if (this.gSG != null) {
            this.MessageDelegator.hd(this.gSG.getGUID());
            this.jb(false);
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
                return this.gSY;
            }
            case 2: {
                return Float.valueOf(this.gSZ);
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
                this.ja((Boolean)object);
                break;
            }
            case 2: {
                this.hD(((Float)object).floatValue());
                break;
            }
            default: {
                lfn.b(4, this.getClass().getName(), "setPropertyValue() : Unknown PropertyID = " + n);
                assert (false);
                break;
            }
        }
    }

    public void ja(boolean bl) {
        this.gPb |= 2;
        this.gSY = bl;
        this.xu();
    }

    public void hD(float f2) {
        f2 = lew.A(f2, 0.0f, 1.0f);
        this.gPb |= 4;
        this.gSZ = f2;
        if (this.gSG != null) {
            this.bvt();
        }
    }

    public final boolean bvy() {
        return this.gSY;
    }

    public final float bvz() {
        return this.gSZ;
    }

    private void jb(boolean bl) {
        kfu kfu2 = (kfu)this.MessageDelegator.BV(20);
        kfu2.ts(this.GUID);
        kfu2.Hl(2);
        kfu2.vi(bl);
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

