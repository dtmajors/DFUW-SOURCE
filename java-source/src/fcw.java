/*
 * Decompiled with CFR.
 */
public class fcw
extends fdo {
    public float Magnitude = 0.0f;
    public double eKm = 0.0;
    public float aSp = 0.0f;
    public int bRw = -1;
    private int iJx = 0;
    private float dus = 0.0f;
    public int aYH = 0;
    public int aYG = 0;
    public int bsE = 0;
    public int bRD = 0;
    public double gpI = 0.0;
    public boolean dup = false;
    public float duq = 0.0f;
    public float iJy = 0.0f;
    public float dun = 0.0f;
    public float iJz = 0.0f;
    public ljq aZH = null;
    public ljq aZD = null;
    public ldv dsL = null;
    public float dum = 0.0f;
    public ldv cRI = null;
    public boolean iJA = false;
    public float iJB = 0.0f;
    public int[] iJC = null;
    public int[] iJD = null;

    fcw() {
        super(9227);
    }

    fcw(int n) {
        super(n);
    }

    public final cxd.f aCD() {
        return cxd.f.getHitLocationType(this.iJx);
    }

    public final void a(cxd.f f2) {
        this.iJx = f2.ordinal();
    }

    public final float bOo() {
        return this.dus;
    }

    public final void iV(float f2) {
        this.dus = f2;
    }
}

