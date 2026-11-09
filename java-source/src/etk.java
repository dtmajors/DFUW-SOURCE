/*
 * Decompiled with CFR.
 */
public class etk
extends euk
implements dxu {
    public static final int iCr = 0;
    public static final int iCs = 1;
    public static final int iCt = 2;
    public static final int iCu = 3;
    public static final int iCv = 4;
    public static final int iCw = 5;
    public static final int iCx = 6;
    public static final int iCy = 7;
    public static final int iCz = 8;
    public static final int iCA = 9;
    public static final int iCB = 10;
    public static final int iCC = 11;
    private int aqs = -1;
    private int iCD = 0;
    private ldv aEs = null;
    private String cGO = null;
    private ldv cGP = null;
    private int cGM = -1;
    private double QM = 0.0;
    private int iCE = 0;
    private int cIa = 0;
    private int iCF = 0;
    private int aEt = 0;
    private int iCG = 0;
    private int iCH = bab.cIN.ordinal();
    private double iCI = 0.0;
    private double iCJ = 0.0;
    private double iCK = 0.0;

    public etk() {
        super(19985);
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public int bLH() {
        return this.iCD;
    }

    public void Fd(int n) {
        this.iCD = n;
    }

    public ldv adE() {
        return this.aEs;
    }

    public String adF() {
        return this.cGO;
    }

    public void x(ldv ldv2, String string) {
        this.aEs = ldv2;
        this.cGO = string;
    }

    public ldv bLI() {
        return this.cGP;
    }

    public void eY(ldv ldv2) {
        this.cGP = ldv2;
    }

    public int bLJ() {
        return this.cGM;
    }

    public void jl(int n) {
        this.cGM = n;
    }

    public double bLK() {
        return this.QM;
    }

    public void cm(double d2) {
        this.QM = d2;
    }

    public int bLL() {
        return this.iCE;
    }

    public void Fe(int n) {
        this.iCE = n;
    }

    public int aeU() {
        return this.cIa;
    }

    public int aeV() {
        return this.iCF;
    }

    public int ahN() {
        return this.aEt;
    }

    public void t(int n, int n2, int n3) {
        this.cIa = n;
        this.iCF = n2;
        this.aEt = n3;
    }

    public int bLM() {
        return this.iCG;
    }

    public void Ff(int n) {
        this.iCG = n;
    }

    public bab bLN() {
        return bab.getPhaseFromOrdinal(this.iCH);
    }

    public void c(bab bab2) {
        this.iCH = bab2 == null ? this.iCH : bab2.ordinal();
    }

    public double bLO() {
        return this.iCI;
    }

    public void cn(double d2) {
        this.iCI = d2;
    }

    public double bLP() {
        return this.iCJ;
    }

    public void co(double d2) {
        this.iCJ = d2;
    }

    public double bLQ() {
        return this.iCK;
    }

    public void cp(double d2) {
        this.iCK = d2;
    }

    public boolean bLR() {
        return this.iCD == 0;
    }

    public bat bLS() {
        switch (this.iCD) {
            case 0: {
                return bat.cON;
            }
            case 1: {
                return bat.cOt;
            }
            case 2: {
                return bat.cOq;
            }
            case 3: {
                return bat.cOD;
            }
            case 4: {
                return bat.cOy;
            }
            case 5: {
                return bat.cOG;
            }
            case 6: {
                return bat.cOz;
            }
            case 7: {
                return bat.cOw;
            }
            case 8: {
                return bat.cOA;
            }
            case 9: {
                return bat.cOv;
            }
            case 10: {
                return bat.cOH;
            }
            case 11: {
                return bat.cOB;
            }
        }
        return bat.cOo;
    }
}

