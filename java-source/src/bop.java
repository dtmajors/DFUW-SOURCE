/*
 * Decompiled with CFR.
 */
public abstract class bop {
    private String aGb = null;
    private ldv dxV = null;
    private int dxW = 0;
    private boolean dxX = false;
    private boolean dxY = false;
    private boolean dxZ = false;
    private ldv dxU = null;
    private boolean dya = false;

    public abstract int asH();

    public ldv asQ() {
        return this.dxV;
    }

    public void ij(ldv ldv2) {
        this.dxV = ldv2;
    }

    public String qM() {
        return this.aGb;
    }

    public void fT(String string) {
        this.aGb = string;
    }

    public int asR() {
        return this.dxW;
    }

    public void lr(int n) {
        this.dxW = n;
    }

    public boolean asS() {
        return this.dxX;
    }

    public void dC(boolean bl2) {
        this.dxX = bl2;
    }

    public boolean asT() {
        return this.dxY;
    }

    public void dD(boolean bl2) {
        this.dxY = bl2;
    }

    public boolean asU() {
        return this.dxZ;
    }

    public void dE(boolean bl2) {
        this.dxZ = bl2;
    }

    public ldv asN() {
        return this.dxU;
    }

    public void ii(ldv ldv2) {
        this.dxU = ldv2;
    }

    public boolean asV() {
        return this.dya;
    }

    public void dF(boolean bl2) {
        this.dya = bl2;
    }
}

