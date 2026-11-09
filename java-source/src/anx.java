/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  anf
 */
import java.util.LinkedHashSet;

public class anx {
    private final float bHy = 0.5f;
    private final float bHz = 5.0f;
    private final float bHA = 30.0f;
    private anf bFP;
    private ljq bFZ;
    private ljq bHB;
    private LinkedHashSet<a> bHC = new LinkedHashSet();
    private LinkedHashSet<a> bHD = new LinkedHashSet();

    public anx(anf anf2) {
        this.bFP = anf2;
        this.bFZ = new ljq(0.0f, 0.0f, 0.0f);
        this.bHB = new ljq(0.0f, 0.0f, 0.0f);
    }

    public static float bw(float f) {
        float f2 = f;
        if ((double)f2 > Math.PI) {
            f2 = (float)((double)f2 - Math.PI * 2);
        } else if ((double)f2 < -Math.PI) {
            f2 = (float)((double)f2 + Math.PI * 2);
        }
        return f2;
    }

    public float d(ljq ljq2, ljq ljq3, float f) {
        ljq.e(ljq3, ljq2, this.bFZ);
        float f2 = arw.aA(this.bFZ);
        float f3 = anx.bw(f - f2);
        float f4 = 1.0f;
        if ((double)f3 < -0.0) {
            f4 = -1.0f;
        }
        float f5 = 1.5707964f;
        if (Math.abs(f3) > f5) {
            return f;
        }
        return anx.bw(f2 + f4 * f5);
    }

    public void clear() {
        for (a a2 : this.bHD) {
            this.bHC.remove(a2);
        }
        this.bHD.clear();
    }

    public float a(double d2, ljq ljq2, float f, ljq ljq3) {
        this.clear();
        if (this.bFP.bCL == null) {
            return f;
        }
        if (ljq2 == null) {
            return f;
        }
        if (this.bHC.size() == 0) {
            return f;
        }
        float f2 = Float.MAX_VALUE;
        for (a a2 : this.bHC) {
            float f3 = (float)Math.abs(a2.bHF - d2);
            float f4 = a2.bHE.ez(ljq2);
            if (f4 < 0.5f) continue;
            if (f3 > 30.0f) {
                this.bHD.add(a2);
                continue;
            }
            if (!((f4 *= 1.0f + f3 / 30.0f) < f2)) continue;
            this.bHB.ex(a2.bHE);
            f2 = f4;
        }
        if (f2 > 5.0f) {
            return f;
        }
        float f5 = 1.0f - f2 / 5.0f;
        float f6 = this.d(ljq2, this.bHB, arw.aA(ljq3));
        return anx.bw(f + f5 * anx.bw(f6 - f));
    }

    public boolean a(ljq ljq2, double d2) {
        if (this.bFP.bCL == null) {
            return false;
        }
        for (a a2 : this.bHC) {
            if (!(a2.bHE.ez(ljq2) < 0.25f)) continue;
            a2.bHF = d2;
            return false;
        }
        a a3 = new a(this);
        a3.bHE = ljq2.esF();
        a3.bHF = d2;
        this.bHC.add(a3);
        return true;
    }

    public void terminate() {
        this.bFP = null;
        this.bHC.clear();
        this.bHC = null;
        this.bHD.clear();
        this.bHD = null;
    }
}

