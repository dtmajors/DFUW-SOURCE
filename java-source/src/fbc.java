/*
 * Decompiled with CFR.
 */
public class fbc
extends fbd {
    private int iHS = jd.ajB.ordinal();
    private int iHT = je.ajN.ordinal();
    private int iHU = jb.aja.ordinal();
    private int iHV = bbs.NoRank.ordinal();
    private int iHW = ja.aiS.ordinal();
    private int bnM = -1;
    private int aYG = -1;
    private float Magnitude = 0.0f;
    private String iHX = null;
    private int iHY = -1;
    private ljq iHZ = null;
    private String dtz = null;
    private ldv iIa = null;

    public jd bOc() {
        return jd.getValueByOrdinal(this.iHS);
    }

    public void a(jd jd2) {
        this.iHS = jd2 == null ? this.iHS : jd2.ordinal();
    }

    public je bOd() {
        return je.getValueByOrdinal(this.iHT);
    }

    public void a(je je2) {
        this.iHT = je2 == null ? this.iHT : je2.ordinal();
    }

    public jb bOe() {
        return jb.getValueByOrdinal(this.iHU);
    }

    public void a(jb jb2) {
        this.iHU = jb2 == null ? this.iHU : jb2.ordinal();
    }

    public bbs bOf() {
        return bbs.getValueByOrdinal(this.iHV);
    }

    public void e(bbs bbs2) {
        this.iHV = bbs2 == null ? this.iHV : bbs2.ordinal();
    }

    public ja bOg() {
        return ja.getValueByOrdinal(this.iHW);
    }

    public void a(ja ja2) {
        this.iHW = ja2 == null ? this.iHW : ja2.ordinal();
    }

    public int BV() {
        return this.bnM;
    }

    public void fC(int n) {
        this.bnM = n;
    }

    public int CD() {
        return this.aYG;
    }

    public void fJ(int n) {
        this.aYG = n;
    }

    public float uO() {
        return this.Magnitude;
    }

    public void N(float f2) {
        this.Magnitude = f2;
    }

    public String bOh() {
        return this.iHX;
    }

    public void kB(String string) {
        this.iHX = string;
    }

    public int bOi() {
        return this.iHY;
    }

    public void Gl(int n) {
        this.iHY = n;
    }

    public ljq bOj() {
        return this.iHZ;
    }

    public void cH(ljq ljq2) {
        this.iHZ = ljq2;
    }

    public String bOk() {
        return this.dtz;
    }

    public void kC(String string) {
        this.dtz = string;
    }

    public ldv bOl() {
        return this.iIa;
    }

    public void pA(ldv ldv2) {
        this.iIa = ldv2;
    }

    fbc() {
        super(12551);
    }
}

