/*
 * Decompiled with CFR.
 */
public class kjm
extends kjb {
    public static final int iEA = 1;
    public static final int iEB = 2;
    public static final int pFa = 4;
    public static final int pFb = 8;
    public static final int iYX = 16;
    public static final int iGX = 32;
    public static final int pFc = 1;
    public static final int pFd = 2;
    public static final int pFe = 4;
    protected int pFf = -1;
    protected int pFg = -1;
    protected int iED = 0;
    protected int iEE = 0;
    protected ljq mw = null;
    protected ljq mx = null;
    protected ldv Rs = null;

    kjm() {
        this.Jv(2817);
    }

    public int ebv() {
        return this.pFf;
    }

    public void Yk(int n) {
        this.pFf = n;
    }

    public int ebw() {
        return this.pFg;
    }

    public void Yl(int n) {
        this.pFg = n;
    }

    public int getScreenX() {
        return this.iED;
    }

    public void Fy(int n) {
        this.iED = n;
    }

    public int getScreenY() {
        return this.iEE;
    }

    public void Fz(int n) {
        this.iEE = n;
    }

    public ljq boZ() {
        return this.mw;
    }

    public void ca(ljq ljq2) {
        this.mw = ljq2;
    }

    public ljq bpa() {
        return this.mx;
    }

    public void cq(ljq ljq2) {
        this.mx = ljq2;
    }

    public ldv oq() {
        return this.Rs;
    }

    public void hC(ldv ldv2) {
        this.Rs = ldv2;
    }
}

