/*
 * Decompiled with CFR.
 */
public class cjb {
    private int adk = -1;
    private cjf eDE = null;
    private float aFv = -1.0f;

    public cjb(int n, float f, cjf cjf2) {
        this.adk = n;
        this.aFv = f;
        this.eDE = cjf2;
    }

    public final float aOx() {
        return this.aFv;
    }

    public void er(float f) {
        this.aFv += f;
    }

    public final boolean isCompleted() {
        return this.aFv >= (float)this.eDE.ayN;
    }

    public void qI(int n) {
        this.aFv = n;
    }

    public final int getIndex() {
        return this.adk;
    }

    public final void setIndex(int n) {
        this.adk = n;
    }

    public final cjb aPP() {
        return new cjb(this.adk, this.aFv, this.eDE);
    }

    public final cjf aPQ() {
        return this.eDE;
    }
}

