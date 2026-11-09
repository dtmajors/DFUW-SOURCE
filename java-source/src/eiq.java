/*
 * Decompiled with CFR.
 */
public class eiq
extends ejm {
    public static final int irt = 0;
    public static final int iru = 1;
    private ldv aDk = null;
    private String bhD = null;
    private int ctp = ayb.cvi.ordinal();
    private ljq bhF = null;
    private float bhG = 0.0f;
    private ldv azY = null;
    private float cCY = 0.0f;
    private float cCZ = 0.0f;
    private int bhB = 0;
    private int cCW = 0;
    private aze[] czW = null;
    private ldv aDp = null;
    private int irv = 1;

    public boolean bGT() {
        return this.irv == 0;
    }

    public void bGU() {
        this.irv = 0;
    }

    public ldv acm() {
        return this.aDk;
    }

    public void ci(ldv ldv2) {
        this.aDk = ldv2;
    }

    public String Xt() {
        return this.bhD;
    }

    public void cz(String string) {
        this.bhD = string;
    }

    public ayb Xz() {
        return ayb.getValueByOrdinal(this.ctp);
    }

    public void a(ayb ayb2) {
        this.ctp = ayb2 == null ? this.ctp : ayb2.ordinal();
    }

    public ljq Xv() {
        return this.bhF;
    }

    public void al(ljq ljq2) {
        this.bhF = ljq2;
    }

    public float Xu() {
        return this.bhG;
    }

    public void X(float f2) {
        this.bhG = f2;
    }

    public ldv acn() {
        return this.azY;
    }

    public void eM(ldv ldv2) {
        this.azY = ldv2;
    }

    public float acq() {
        return this.cCY;
    }

    public void ch(float f2) {
        this.cCY = f2;
    }

    public float acr() {
        return this.cCZ;
    }

    public void ci(float f2) {
        this.cCZ = f2;
    }

    public int aco() {
        return this.bhB;
    }

    public void eM(int n2) {
        this.bhB = n2;
    }

    public int acp() {
        return this.cCW;
    }

    public void jd(int n2) {
        this.cCW = n2;
    }

    public aze[] abo() {
        return this.czW;
    }

    public void b(aze[] azeArray) {
        this.czW = azeArray;
    }

    public ldv YS() {
        return this.aDp;
    }

    public void ds(ldv ldv2) {
        this.aDp = ldv2;
    }

    eiq() {
        super(18696);
    }
}

