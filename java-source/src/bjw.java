/*
 * Decompiled with CFR.
 */
public class bjw {
    private float Probability;
    private int dpS;
    private int dpT;
    private int dpU;

    public lfs<Integer, Integer> cP(float f) {
        if (!lgp.erA().cS(this.Probability * f)) {
            return null;
        }
        if (this.dpS > this.dpT) {
            assert (false);
            return null;
        }
        if (this.dpS == 0 && this.dpT == 0) {
            assert (false);
            return null;
        }
        if (this.dpS < 0) {
            assert (false);
            return null;
        }
        if (this.dpT < 0) {
            assert (false);
            return null;
        }
        lfs<Integer, Integer> lfs2 = new lfs<Integer, Integer>();
        lfs2.reX = this.dpU;
        if (this.dpS == this.dpT) {
            lfs2.reY = this.dpS;
            return lfs2;
        }
        int n = this.dpS + (int)((float)(this.dpT - this.dpS + 1) * lgp.erA().nextFloat());
        if (n <= 0) {
            return null;
        }
        lfs2.reY = n;
        return lfs2;
    }

    public final float aqG() {
        return this.Probability;
    }

    public final void cQ(float f) {
        this.Probability = f;
    }

    public final int aqH() {
        return this.dpS;
    }

    public final void kQ(int n) {
        this.dpS = n;
    }

    public final int aqI() {
        return this.dpT;
    }

    public final void kR(int n) {
        this.dpT = n;
    }

    public final int aqJ() {
        return this.dpU;
    }

    public final void kS(int n) {
        this.dpU = n;
    }
}

