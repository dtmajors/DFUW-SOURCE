/*
 * Decompiled with CFR.
 */
public enum icc {
    lGT(hc.aaz, lvw.taZ, new jmy[]{jmy.nCw, jmy.nCy, jmy.nCP, jmy.nCQ}),
    lGU(hc.aaz, lvw.tba, new jmy[]{jmy.nCI, jmy.nCJ}),
    lGV(hc.aaz, lvw.tbb, new jmy[]{jmy.nCA, jmy.nCG, jmy.nCK}),
    lGW(hc.aaz, lvw.tbc, new jmy[]{jmy.nCL, jmy.nCM}),
    lGX(hc.aaz, lvw.tbd, new jmy[]{jmy.nCN, jmy.nCO}),
    lGY(hc.aaB, lvw.tbe, new jmy[]{jmy.nCR, jmy.nCS, jmy.nCT, jmy.nCU, jmy.nCV});

    private hc lGZ;
    private lox lGm;
    private jmy[] lHa;

    private icc(hc hc2, lox lox2, jmy[] jmyArray) {
        this.lGZ = hc2;
        this.lGm = lox2;
        this.lHa = jmyArray;
    }

    public hc cNE() {
        return this.lGZ;
    }

    public lox cNq() {
        return this.lGm;
    }

    public jmy[] cNF() {
        return this.lHa;
    }
}

