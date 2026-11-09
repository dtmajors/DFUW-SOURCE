/*
 * Decompiled with CFR.
 */
public class jlb
extends jlc {
    private float ntR;
    private jky ntS = jky.ntK;
    private jkz ntT = jkz.ntP;

    public jlb(int n) {
        this.hf = n;
    }

    public float dLy() {
        return this.ntR;
    }

    public void kZ(float f2) {
        if (f2 == this.ntR) {
            return;
        }
        this.ntR = f2;
        this.a("setOverlayLineThickness", this.getId(), Float.valueOf(this.ntR));
    }

    public jky dLz() {
        return this.ntS;
    }

    public void a(jky jky2) {
        if (jky2 == this.ntS) {
            return;
        }
        this.ntS = jky2;
        this.a("setOverlayLineCapsStyle", this.getId(), this.ntS.getValue());
    }

    public jkz dLA() {
        return this.ntT;
    }

    public void a(jkz jkz2) {
        if (jkz2 == this.ntT) {
            return;
        }
        this.ntT = jkz2;
        this.a("setOverlayLineJointStyle", this.getId(), this.ntT.getValue());
    }

    @Override
    public void create() {
        this.a("createOverlayLine", this.dLC().getId(), this.getId(), this.getX(), this.getY(), this.dLx(), this.Hr(), Float.valueOf(1.0f), this.djL(), this.dLD(), Float.valueOf(this.dLy()), this.dLz().getValue(), this.dLA().getValue());
    }
}

