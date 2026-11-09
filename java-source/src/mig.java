/*
 * Decompiled with CFR.
 */
public class mig
extends mii {
    public static final int DxI = 1;
    public static final int DxJ = 2;
    public static final int DxK = 4;
    public static final int DxL = 8;
    private int DxM;
    private boolean lfe;
    private boolean DxN;
    private int DxO;
    public int DxP;
    public int DxQ;

    public static mig n(lbm<mii> lbm2) {
        return (mig)lbm2.ik(2);
    }

    mig() {
    }

    public boolean ezj() {
        return this.DxN;
    }

    public void yX(boolean bl) {
        this.DxN = bl;
    }

    public int ezk() {
        return this.DxM;
    }

    public void aer(int n) {
        this.DxM = n;
    }

    public int getCursorType() {
        return this.DxO;
    }

    public void aes(int n) {
        this.DxO = n;
    }

    public boolean ezl() {
        return this.lfe;
    }

    public void yY(boolean bl) {
        this.lfe = bl;
    }
}

