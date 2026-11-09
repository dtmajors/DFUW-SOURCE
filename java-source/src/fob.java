/*
 * Decompiled with CFR.
 */
public class fob
extends fof
implements dxu {
    private boolean iRF = false;
    private int aqs = -1;
    private ldv iRG = null;
    private ljq Position = null;
    private ljq my = null;
    private boolean iRH = false;
    private ldv iRI = null;
    private boolean iRJ;
    private boolean dwG = true;
    private ldv hac;
    private boolean iRK = true;
    private bve.a dQn = null;

    fob() {
        super(11521);
    }

    fob(int n) {
        super(n);
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public ldv bQp() {
        return this.iRG;
    }

    public void pL(ldv ldv2) {
        this.iRG = ldv2;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public ljq getRotation() {
        return this.my;
    }

    public void setRotation(ljq ljq2) {
        this.my = ljq2;
    }

    public boolean bQq() {
        return this.iRH;
    }

    public void lh(boolean bl) {
        this.iRH = bl;
    }

    public ldv bQr() {
        return this.iRI;
    }

    public void pM(ldv ldv2) {
        this.iRI = ldv2;
    }

    public boolean bQs() {
        return this.iRJ;
    }

    public void li(boolean bl) {
        this.iRJ = bl;
    }

    public boolean isServerObject() {
        return this.dwG;
    }

    public void setServerObject(boolean bl) {
        this.dwG = bl;
    }

    public ldv bQt() {
        return this.hac;
    }

    public void ob(ldv ldv2) {
        this.hac = ldv2;
    }

    public boolean bQu() {
        return this.iRK;
    }

    public void lj(boolean bl) {
        this.iRK = bl;
    }

    public bve.a aza() {
        return this.dQn;
    }

    public void d(bve.a a2) {
        this.dQn = a2;
    }

    public boolean bQv() {
        return this.iRF;
    }

    public void lk(boolean bl) {
        this.iRF = bl;
    }
}

