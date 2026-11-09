/*
 * Decompiled with CFR.
 */
public class cgo {
    private int adk = -1;
    private boolean bdP = true;
    private float aFv = 0.0f;
    private float bVE = 0.0f;
    private long aFx = -1L;
    private int aFy = 0;

    public cgo(int n, boolean bl, float f2, float f3) {
        this.adk = n;
        this.bdP = bl;
        this.aFv = f2;
        this.bVE = f3;
    }

    public void er(float f2) {
        if (this.aFv < this.bVE) {
            this.aFv += f2;
        }
    }

    public boolean isCompleted() {
        return this.aFv >= this.bVE;
    }

    public void reset() {
        this.aFv = 0.0f;
    }

    public void aOw() {
        this.aFv = this.bVE;
    }

    public final boolean isLocked() {
        return this.bdP;
    }

    public final void aB(boolean bl) {
        this.bdP = bl;
    }

    public final int getIndex() {
        return this.adk;
    }

    public final float aOx() {
        return this.aFv;
    }

    public final float aOy() {
        if (this.aFv > this.bVE) {
            return this.bVE;
        }
        return this.aFv;
    }

    public final float aOz() {
        return this.bVE;
    }

    public final long aOA() {
        return this.aFx;
    }

    public final void T(long l2) {
        this.aFx = l2;
    }

    public final double bs(double d2) {
        return ((double)this.aFx - d2) / 1000.0;
    }

    public final int aOB() {
        return this.aFy;
    }

    public final void qa(int n) {
        this.aFy = n;
    }
}

