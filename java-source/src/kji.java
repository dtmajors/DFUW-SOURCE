/*
 * Decompiled with CFR.
 */
public class kji
extends kjb {
    public static final int pEB = 1;
    public static final int pEC = 2;
    public static final int pED = 1;
    public static final int pEE = 2;
    public static final int pEF = 4;
    private int pEG = 0;
    private int pEH = 0;
    private float dum = 0.0f;
    private boolean pEI = true;
    private boolean pEJ = false;
    private int iED = -1;
    private int iEE = -1;
    private ljq mw = null;
    private ljq mx = null;
    private lgl Rotation = null;
    private boolean pEK = true;
    public boolean pEL = false;
    public boolean pEM = false;
    public int pEr = 0;
    public boolean pEN = false;

    kji() {
        this.Jv(2818);
    }

    public int ebj() {
        return this.pEG;
    }

    public void Yg(int n) {
        this.pEG = n;
    }

    public int ebk() {
        return this.pEH;
    }

    public void Yh(int n) {
        this.pEH = n;
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

    public lgl aw() {
        return this.Rotation;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public float getLength() {
        return this.dum;
    }

    public void setLength(float f) {
        this.dum = f;
    }

    public boolean ebl() {
        return this.pEI;
    }

    public void wS(boolean bl) {
        this.pEI = bl;
    }

    public boolean ebm() {
        return this.pEJ;
    }

    public void wT(boolean bl) {
        this.pEJ = bl;
    }

    public boolean ebn() {
        return this.pEK;
    }

    public void wU(boolean bl) {
        this.pEK = bl;
    }

    public int ebo() {
        return this.pEr;
    }

    public void Yi(int n) {
        this.pEr = n;
    }
}

