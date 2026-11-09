/*
 * Decompiled with CFR.
 */
public class csi
extends cso {
    private boolean fbq = false;
    public static final boolean fbr = false;
    public static final float fbs = 10.0f;
    public static final float fbt = 0.0f;
    public static final float fbu = 10.0f;
    private float fbv = 10.0f;
    public static final float fbw = 0.1f;
    public static final float fbx = 0.0f;
    public static final float fby = 1.0f;
    private float fbz = 0.1f;

    @Override
    public void a(cqu cqu2) {
        if (cqu2.aYX().getValue() != this.baf()) {
            this.gK(cqu2.aYX().getValue());
        }
        if (cqu2.aYY().getValue() != this.bad()) {
            this.eL(cqu2.aYY().getValue());
        }
        if (cqu2.aYZ().getValue() != this.bae()) {
            this.eM(cqu2.aYZ().getValue());
        }
    }

    @Override
    public void b(cqu cqu2) {
        cqu2.aYX().yP(this.baf());
        cqu2.aYY().nH(this.bad());
        cqu2.aYZ().nH(this.bae());
    }

    public float bad() {
        return this.fbv;
    }

    public float eL(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 10.0f) {
            f2 = 10.0f;
        }
        this.fbv = f2;
        return this.fbv;
    }

    public float bae() {
        return this.fbz;
    }

    public float eM(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.fbz = f2;
        return this.fbz;
    }

    public boolean baf() {
        return this.fbq;
    }

    public void gK(boolean bl) {
        this.fbq = bl;
    }
}

