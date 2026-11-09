/*
 * Decompiled with CFR.
 */
public class evt
extends evv {
    private int aEh = bab.cIN.ordinal();
    private double aEl = 0.0;
    private double aEm = 0.0;
    private double cIJ = 0.0;
    private ldv aEF = null;
    private int cIv = ayb.cvi.ordinal();
    private ljq cIw = null;
    private float cIx = 0.0f;
    private String aEG = null;
    private int iDW = 0;
    private int iDX = 0;
    private int iDY = 0;
    private float iDZ = 0.0f;
    private float iEa = 0.0f;
    private ldv aEs = null;
    private String cGO = null;
    private bao[] iEb = null;
    private ldv[] iEc = null;
    private String[] iEd = null;
    private int[] iEe = null;
    private ldv[] iEf = null;
    private String[] iEg = null;
    private int[] iEh = null;
    private ljq[] iEi = null;
    private float[] iEj = null;
    private float[] iEk = null;
    private int[] iEl = null;
    private bao[] iEm = null;

    public bab aeP() {
        return bab.getPhaseFromOrdinal(this.aEh);
    }

    public void d(bab bab2) {
        this.aEh = bab2 == null ? this.aEh : bab2.ordinal();
    }

    public double aeQ() {
        return this.aEl;
    }

    public void av(double d2) {
        this.aEl = d2;
    }

    public double aeR() {
        return this.aEm;
    }

    public void aw(double d2) {
        this.aEm = d2;
    }

    public double afJ() {
        return this.cIJ;
    }

    public void aC(double d2) {
        this.cIJ = d2;
    }

    public ldv afl() {
        return this.aEF;
    }

    public void fx(ldv ldv2) {
        this.aEF = ldv2;
    }

    public ayb afx() {
        return ayb.getValueByOrdinal(this.cIv);
    }

    public void h(ayb ayb2) {
        this.cIv = ayb2 == null ? this.cIv : ayb2.ordinal();
    }

    public ljq afy() {
        return this.cIw;
    }

    public void aH(ljq ljq2) {
        this.cIw = ljq2;
    }

    public float afz() {
        return this.cIx;
    }

    public void cp(float f) {
        this.cIx = f;
    }

    public String afw() {
        return this.aEG;
    }

    public void fb(String string) {
        this.aEG = string;
    }

    public int bMB() {
        return this.iDW;
    }

    public void Fr(int n) {
        this.iDW = n;
    }

    public int bMC() {
        return this.iDX;
    }

    public void Fs(int n) {
        this.iDX = n;
    }

    public int bMD() {
        return this.iDY;
    }

    public void Ft(int n) {
        this.iDY = n;
    }

    public float bME() {
        return this.iDZ;
    }

    public void iP(float f) {
        this.iDZ = f;
    }

    public float bMF() {
        return this.iEa;
    }

    public void iQ(float f) {
        this.iEa = f;
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

    public bao[] adL() {
        return this.iEb;
    }

    public void c(bao[] baoArray) {
        this.iEb = baoArray;
    }

    public ldv[] bMG() {
        return this.iEc;
    }

    public void B(ldv[] ldvArray) {
        this.iEc = ldvArray;
    }

    public String[] bMH() {
        return this.iEd;
    }

    public void s(String[] stringArray) {
        this.iEd = stringArray;
    }

    public int[] bMI() {
        return this.iEe;
    }

    public void ab(int[] nArray) {
        this.iEe = nArray;
    }

    public ldv[] bMJ() {
        return this.iEf;
    }

    public void C(ldv[] ldvArray) {
        this.iEf = ldvArray;
    }

    public String[] bMK() {
        return this.iEg;
    }

    public void t(String[] stringArray) {
        this.iEg = stringArray;
    }

    public int[] bML() {
        return this.iEh;
    }

    public void ac(int[] nArray) {
        this.iEh = nArray;
    }

    public ljq[] bMM() {
        return this.iEi;
    }

    public void g(ljq[] ljqArray) {
        this.iEi = ljqArray;
    }

    public float[] bMN() {
        return this.iEj;
    }

    public void g(float[] fArray) {
        this.iEj = fArray;
    }

    public float[] bMO() {
        return this.iEk;
    }

    public void h(float[] fArray) {
        this.iEk = fArray;
    }

    public int[] bMP() {
        return this.iEl;
    }

    public void ad(int[] nArray) {
        this.iEl = nArray;
    }

    public bao[] bMQ() {
        return this.iEm;
    }

    public void d(bao[] baoArray) {
        this.iEm = baoArray;
    }

    evt() {
        super(20044, bba.cPH.ordinal());
    }
}

