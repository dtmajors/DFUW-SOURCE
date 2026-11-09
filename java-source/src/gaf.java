/*
 * Decompiled with CFR.
 */
public class gaf
extends gac {
    public static final int jcl = 1;
    public static final int jcm = 2;
    public static final int jcn = 4;
    public static final int jco = 8;
    public static final int jcp = 16;
    protected int jcq = 0;
    protected ljq jce = null;
    protected ljq jcr = null;
    protected lgl jcs = null;
    protected boolean fXZ = true;
    protected boolean fYa = false;
    protected boolean jcg = true;
    protected boolean jct = false;

    gaf() {
        super(6402);
    }

    public int bTe() {
        return this.jcq;
    }

    public void Iw(int n) {
        this.jcq = n;
    }

    public ljq bSW() {
        return this.jce;
    }

    public void cN(ljq ljq2) {
        this.jce = ljq2;
    }

    public ljq FX() {
        return this.jcr;
    }

    public void d(ljq ljq2) {
        this.jcr = ljq2;
    }

    public lgl bTf() {
        return this.jcs;
    }

    public void N(lgl lgl2) {
        this.jcs = lgl2;
    }

    public boolean bgI() {
        return this.fXZ;
    }

    public void ho(boolean bl) {
        this.fXZ = bl;
    }

    public boolean bgJ() {
        return this.fYa;
    }

    public void hp(boolean bl) {
        this.fYa = bl;
    }

    public boolean bSZ() {
        return this.jcg;
    }

    public void lE(boolean bl) {
        this.jcg = bl;
    }

    public boolean bTg() {
        return this.jct;
    }

    public void lG(boolean bl) {
        this.jct = bl;
    }
}

