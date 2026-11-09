/*
 * Decompiled with CFR.
 */
public class mfx {
    public ljq mx = new ljq();
    public ljq mw = new ljq();
    public float dum = 0.0f;

    public mfx() {
    }

    public mfx(ljq ljq2, ljq ljq3, float f) {
        assert (ljq2 != null);
        assert (ljq3 != null);
        this.mx.ex(ljq2);
        this.mw.ex(ljq3);
        this.dum = f;
    }

    public mfx(ljq ljq2, ljq ljq3) {
        assert (ljq2 != null);
        assert (ljq3 != null);
        this.mw.ex(ljq2);
        this.mx.ex(ljq3);
        this.mx.et(ljq2);
        this.dum = this.mx.eqN();
        this.mx.normalize();
    }

    public String toString() {
        return "O:" + this.mw + "D:" + this.mx + "Length:" + this.dum;
    }

    public ljq bpa() {
        return this.mx;
    }

    public void cq(ljq ljq2) {
        this.mx = ljq2;
    }

    public float getLength() {
        return this.dum;
    }

    public void setLength(float f) {
        this.dum = f;
    }

    public ljq boZ() {
        return this.mw;
    }

    public void ca(ljq ljq2) {
        this.mw = ljq2;
    }

    public static float g(ljq ljq2, ljq ljq3, ljq ljq4) {
        ljq ljq5 = new ljq(ljq2);
        ljq5.et(ljq3);
        ljq ljq6 = new ljq(ljq4);
        ljq6.et(ljq3);
        float f = ljq.u(ljq5, ljq6);
        if (f <= 0.0f) {
            return ljq5.eqN();
        }
        float f2 = ljq.u(ljq6, ljq6);
        if (f2 <= f) {
            ljq5.ex(ljq2);
            ljq5.et(ljq4);
            return ljq5.eqN();
        }
        float f3 = f / f2;
        ljq6.nm(f3);
        ljq6.es(ljq3);
        ljq5.ex(ljq2);
        ljq5.et(ljq6);
        return ljq5.eqN();
    }
}

