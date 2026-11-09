/*
 * Decompiled with CFR.
 */
public class jkw
extends jkx {
    private float ntG;
    private jky ntH = jky.ntK;
    private jkz ntI = jkz.ntP;
    private float doR = 1.0f;

    public float dLy() {
        return this.ntG;
    }

    public void kZ(float f2) {
        if (f2 == this.ntG) {
            return;
        }
        this.ntG = f2;
        this.a("setOverlayLineThickness", this.getId(), Float.valueOf(this.ntG));
    }

    public jky dLz() {
        return this.ntH;
    }

    public void a(jky jky2) {
        if (jky2 == null || this.ntH == jky2) {
            return;
        }
        this.ntH = jky2;
        this.a("setOverlayLineCapsStyle", this.getId(), this.ntH.getValue());
    }

    public jkz dLA() {
        return this.ntI;
    }

    public void a(jkz jkz2) {
        if (jkz2 == null || this.ntI == jkz2) {
            return;
        }
        this.ntI = jkz2;
        this.a("setOverlayLineJointStyle", this.getId(), this.ntI.getValue());
    }

    public float dLw() {
        return this.doR;
    }

    public void hz(float f2) {
        if (this.doR == f2) {
            return;
        }
        this.doR = f2;
        this.a("setOverlayLineAlpha", this.getId(), Float.valueOf(this.doR));
    }

    public jkw(int n, int[] nArray, int[] nArray2, int[] nArray3) {
        super(n, nArray, nArray2, nArray3);
    }

    @Override
    public void create() {
        this.a("createOverlayLine", this.dLC().getId(), this.hf, this.mqR, this.mqS, this.dLx(), this.lSN, Float.valueOf(this.doR), this.mxb, this.ntW, Float.valueOf(this.ntG), this.ntH.getValue(), this.ntI.getValue());
    }
}

