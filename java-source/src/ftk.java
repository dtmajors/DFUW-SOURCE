/*
 * Decompiled with CFR.
 */
public class ftk
extends ftt {
    private ldv SA = null;
    private ldv iVJ = null;
    private String bc = null;
    private ldv iVK = null;
    private String add = null;
    private int iHV = bbs.NoRank.ordinal();
    private ldv iVL = null;
    private int iVM = 0;
    private ldv gbp = null;
    private int aYC = -1;
    private int iVN = -1;
    private double iVO = 0.0;

    public ldv bGF() {
        return this.SA;
    }

    public void oL(ldv ldv2) {
        this.SA = ldv2;
    }

    public ldv bRD() {
        return this.iVJ;
    }

    public void pR(ldv ldv2) {
        this.iVJ = ldv2;
    }

    public String hl() {
        return this.bc;
    }

    public void d(String string) {
        this.bc = string;
    }

    public ldv bRE() {
        return this.iVK;
    }

    public void pS(ldv ldv2) {
        this.iVK = ldv2;
    }

    public String iV() {
        return this.add;
    }

    public void cD(String string) {
        this.add = string;
    }

    public bbs bOf() {
        return bbs.getValueByOrdinal(this.iHV);
    }

    public void e(bbs bbs2) {
        this.iHV = bbs2 == null ? this.iHV : bbs2.ordinal();
    }

    public ldv bRF() {
        return this.iVL;
    }

    public void pT(ldv ldv2) {
        this.iVL = ldv2;
    }

    public int bRG() {
        return this.iVM;
    }

    public void HP(int n) {
        this.iVM = n;
    }

    public ldv bRC() {
        return this.gbp;
    }

    public void pQ(ldv ldv2) {
        this.gbp = ldv2;
    }

    public int Eb() {
        return this.aYC;
    }

    public void ge(int n) {
        this.aYC = n;
    }

    public int bRH() {
        return this.iVN;
    }

    public void HQ(int n) {
        this.iVN = n;
    }

    public double bRI() {
        return this.iVO;
    }

    public void cF(double d) {
        this.iVO = d;
    }

    ftk() {
        super(1050);
    }
}

