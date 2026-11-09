/*
 * Decompiled with CFR.
 */
public class ipe {
    public float mqH = 1.0f;
    public float mqI = 0.0f;
    public float mqJ = 1.0f;
    public float mqK = 0.0f;
    public float mqL = 1.0f;
    public float mqM = 0.0f;
    public float mqN = 1.0f;
    public float mqO = 0.0f;

    public ipe() {
    }

    public ipe(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.mqJ = f;
        this.mqL = f2;
        this.mqN = f3;
        this.mqH = f4;
        this.mqK = f5;
        this.mqM = f6;
        this.mqO = f7;
        this.mqI = f8;
    }

    public ipe djB() {
        ipe ipe2 = new ipe();
        ipe2.mqH = this.mqH;
        ipe2.mqI = this.mqI;
        ipe2.mqJ = this.mqJ;
        ipe2.mqK = this.mqK;
        ipe2.mqL = this.mqL;
        ipe2.mqM = this.mqM;
        ipe2.mqN = this.mqN;
        ipe2.mqO = this.mqO;
        return ipe2;
    }

    public /* synthetic */ Object clone() {
        return this.djB();
    }
}

