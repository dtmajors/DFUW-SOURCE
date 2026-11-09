/*
 * Decompiled with CFR.
 */
public class gmg
extends gnh {
    public static final int jlx = 0;
    public static final int jly = 1;
    public static final int jlz = 2;
    public static final int jlA = 3;
    public static final int jlB = 4;
    public static final int jlC = 5;
    public static final int jlD = 6;
    public static final int jlE = 7;
    public static final int jlF = 8;
    private int ija = -1;
    private ldv aEs = null;
    private String cGO = null;
    private int cGM = -1;
    private ldv iCh = null;
    private String jlG = null;
    private int jlr = -1;
    private gmd jlH = null;
    private gme jlI = null;
    private gmf jlJ = null;
    private bge[] jlK = null;
    private bgd[] jlL = null;

    public int bHc() {
        return this.ija;
    }

    public void Eh(int n) {
        this.ija = n;
    }

    public ldv adE() {
        return this.aEs;
    }

    public void eX(ldv ldv2) {
        this.aEs = ldv2;
    }

    public String adF() {
        return this.cGO;
    }

    public void eZ(String string) {
        this.cGO = string;
    }

    public int bLJ() {
        return this.cGM;
    }

    public void jl(int n) {
        this.cGM = n;
    }

    public ldv bLw() {
        return this.iCh;
    }

    public void pn(ldv ldv2) {
        this.iCh = ldv2;
    }

    public String bVW() {
        return this.jlG;
    }

    public void le(String string) {
        this.jlG = string;
    }

    public dxl.c bVX() {
        return dxl.c.getValueByOrdinal(this.jlr);
    }

    public void c(dxl.c c2) {
        this.jlr = c2.ordinal();
    }

    public gmd bVY() {
        return this.jlH;
    }

    public void a(gmd gmd2) {
        this.jlH = gmd2;
    }

    public gme bVZ() {
        return this.jlI;
    }

    public void a(gme gme2) {
        this.jlI = gme2;
    }

    public gmf bWa() {
        return this.jlJ;
    }

    public void a(gmf gmf2) {
        this.jlJ = gmf2;
    }

    public bge[] bWb() {
        return this.jlK;
    }

    public void b(bge[] bgeArray) {
        this.jlK = bgeArray;
    }

    public bgd[] bWc() {
        return this.jlL;
    }

    public void c(bgd[] bgdArray) {
        this.jlL = bgdArray;
    }

    gmg() {
        super(3602);
    }
}

