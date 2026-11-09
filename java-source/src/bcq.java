/*
 * Decompiled with CFR.
 */
public class bcq {
    private ldv ade = null;
    private String add = null;
    private int aEU = -1;
    private int aEV = -1;
    private long aEW = 0L;
    private double cXc = 0.0;
    private long cXd = 0L;

    public ldv iG() {
        return this.ade;
    }

    void ch(ldv ldv2) {
        this.ade = ldv2;
    }

    public String iV() {
        return this.add;
    }

    public void cD(String string) {
        this.add = string;
    }

    public bcr ali() {
        return bcr.getValueByOrdinal(this.aEU);
    }

    public void a(bcr bcr2) {
        this.aEU = bcr2 == null ? this.aEU : bcr2.ordinal();
    }

    public bcr alj() {
        return bcr.getValueByOrdinal(this.aEV);
    }

    public void b(bcr bcr2) {
        this.aEV = bcr2 == null ? this.aEV : bcr2.ordinal();
    }

    public boolean alk() {
        return this.aEU == this.aEV;
    }

    public boolean all() {
        return this.aEU == bcr.cXi.ordinal() && this.alk();
    }

    public boolean alm() {
        return this.aEU == bcr.cXe.ordinal() && this.alk();
    }

    void c(bcr bcr2) {
        if (bcr2 == null) {
            return;
        }
        this.aEU = bcr2.ordinal();
        this.aEV = bcr2.ordinal();
    }

    public long getTimeStamp() {
        return this.aEW;
    }

    void setTimeStamp(long l) {
        this.aEW = l;
    }

    public double aln() {
        return this.cXc;
    }

    void aO(double d2) {
        this.cXc = d2;
    }

    long alo() {
        return this.cXd;
    }

    void B(long l) {
        this.cXd = l;
    }

    public bcq() {
    }

    public bcq(ldv ldv2, String string, bcr bcr2, bcr bcr3, long l) {
        this.ade = ldv2;
        this.add = string;
        this.aEU = bcr2.ordinal();
        this.aEV = bcr3.ordinal();
        this.aEW = l;
    }

    public boolean f(bcq bcq2) {
        return bcq2 != null && this.ade.equals(bcq2.ade) && this.aEU == bcq2.aEU && this.aEV == bcq2.aEV && this.aEW == bcq2.aEW;
    }

    public bcq alp() {
        return new bcq(this.ade, this.add, this.ali(), this.alj(), this.aEW);
    }

    public /* synthetic */ Object clone() {
        return this.alp();
    }
}

