/*
 * Decompiled with CFR.
 */
public class lgj {
    public final int aZa;
    public final boolean aZb;
    public final int aZc;
    public final int aZd;
    public final int aZe;
    public final float rlK;
    public final float rlL;
    public final float rlM;
    public final float rlN;
    public int aWg = 0;

    public lgj(int n, int n2, int n3, int n4, float f, float f2, float f3, float f4, boolean bl) {
        this.aZa = n;
        this.aZc = n2;
        this.aZd = n3;
        this.aZe = n4;
        this.rlK = f;
        this.rlL = f2;
        this.rlM = f3;
        this.rlN = f4;
        this.aZb = bl;
    }

    public lgj(lgj lgj2, int n, boolean bl) {
        this.aZa = n;
        this.aWg = lgj2.aWg;
        this.aZc = lgj2.aZc;
        this.aZd = lgj2.aZd;
        this.aZe = lgj2.aZe;
        this.rlK = lgj2.rlK;
        this.rlL = lgj2.rlL;
        this.rlM = lgj2.rlM;
        this.rlN = lgj2.rlN;
        this.aZb = bl;
    }

    public lgj(int n, ljw ljw2, lgl lgl2, boolean bl) {
        this.aZa = n;
        this.aZc = ljw2.x;
        this.aZd = ljw2.y;
        this.aZe = ljw2.rpO;
        this.rlK = lgl2.x;
        this.rlL = lgl2.y;
        this.rlM = lgl2.rlV;
        this.rlN = lgl2.rlW;
        this.aZb = bl;
    }

    public lgj(int n, ljq ljq2, lgl lgl2, boolean bl) {
        this.aZa = n;
        this.aZc = (int)(65536.0f * ljq2.x);
        this.aZd = (int)(65536.0f * ljq2.y);
        this.aZe = (int)(65536.0f * ljq2.rlV);
        this.rlK = lgl2.x;
        this.rlL = lgl2.y;
        this.rlM = lgl2.rlV;
        this.rlN = lgl2.rlW;
        this.aZb = bl;
    }

    public ljq eqI() {
        return new ljq((float)this.aZc / 65536.0f, (float)this.aZd / 65536.0f, (float)this.aZe / 65536.0f);
    }

    public ljw eqJ() {
        return new ljw(this.aZc, this.aZd, this.aZe);
    }

    public lgl eqK() {
        return new lgl(this.rlK, this.rlL, this.rlM, this.rlN);
    }

    public lgj() {
        this.aZa = 0;
        this.aZb = false;
        this.aWg = 0;
        this.aZe = 0;
        this.aZd = 0;
        this.aZc = 0;
        this.rlN = 0.0f;
        this.rlM = 0.0f;
        this.rlL = 0.0f;
        this.rlK = 0.0f;
    }

    public String toString() {
        return "PhysicsStepNumber=" + this.aZa + ", px=" + this.aZc + ", py=" + this.aZd + ", pz=" + this.aZe + ", rx=" + this.rlK + ", ry=" + this.rlL + ", rz=" + this.rlM + ", rw=" + this.rlN + ", ObjectStopped=" + this.aZb + ", TimeSliceNumber=" + this.aWg;
    }

    public String art() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFPositionalData: Position=");
        stringBuilder.append(new ljq(this.aZc, this.aZd, this.aZe));
        stringBuilder.append(" Rotation=");
        stringBuilder.append(new lgl(this.rlK, this.rlL, this.rlM, this.rlN));
        stringBuilder.append(" PhysicsStepNumber=");
        stringBuilder.append(this.aZa);
        stringBuilder.append(" ObjectStopped=");
        stringBuilder.append(this.aZb);
        return stringBuilder.toString();
    }
}

