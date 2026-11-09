/*
 * Decompiled with CFR.
 */
public class krs
extends ksl {
    public static final int pYq = 1;
    public static final int pYr = 2;
    public static final int pYw = 16;
    public static final int pYx = 32;
    protected int pYH = 0;
    protected int pYI = 0;
    protected boolean pYC;
    protected ldv Rs = null;
    protected String pYD = null;
    protected String pYE = null;
    protected String pYF = null;
    protected int ObjectType = 0;
    protected boolean dsK = false;
    protected ldv aCE = null;
    protected kli dTr = null;

    krs() {
        this.pZN = 10;
    }

    public int egr() {
        return this.pYH;
    }

    public void aaB(int n) {
        this.pYH = n;
    }

    public int egs() {
        return this.pYI;
    }

    public void aaC(int n) {
        this.pYI = n;
    }

    public boolean egm() {
        return this.pYC;
    }

    public void xC(boolean bl) {
        this.pYC = bl;
    }

    public ldv oq() {
        return this.Rs;
    }

    public void hC(ldv ldv2) {
        this.Rs = ldv2;
    }

    public String egn() {
        return this.pYD;
    }

    public void xc(String string) {
        this.pYD = string;
    }

    public String ego() {
        return this.pYE;
    }

    public void xd(String string) {
        this.pYE = string;
    }

    public String egp() {
        return this.pYF;
    }

    public void xe(String string) {
        this.pYF = string;
    }

    public int getObjectType() {
        return this.ObjectType;
    }

    public void setObjectType(int n) {
        this.ObjectType = n;
    }

    public boolean bUm() {
        return this.dsK;
    }

    public void lQ(boolean bl) {
        this.dsK = bl;
    }

    public kli egt() {
        return this.dTr;
    }

    public void b(kli kli2) {
        this.dTr = kli2;
    }

    public ldv sV() {
        return this.aCE;
    }

    @Override
    public void ts(ldv ldv2) {
        super.ts(ldv2);
        this.aCE = this.ec;
    }

    public void jv(ldv ldv2) {
        this.aCE = ldv2;
    }
}

