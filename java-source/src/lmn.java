/*
 * Decompiled with CFR.
 */
public class lmn {
    private lmg[] rEP = null;
    private lmo[] rEQ = null;
    private int iXS = 0;
    private int rER = 0;

    public String toString() {
        String string = this.rEP == null ? "Columns=null" : "" + this.rEP.length + " columns";
        string = this.rEQ == null ? string + " Rows=null" : string + " " + this.rEQ.length + " rows";
        string = string + " ErrorCode=" + this.iXS;
        string = string + " RowsAffected=" + this.rER;
        return string;
    }

    public lmg[] euS() {
        return this.rEP;
    }

    public void a(lmg[] lmgArray) {
        this.rEP = lmgArray;
    }

    public lmo[] euT() {
        return this.rEQ;
    }

    public void a(lmo[] lmoArray) {
        this.rEQ = lmoArray;
    }

    public int getErrorCode() {
        return this.iXS;
    }

    public void JY(int n) {
        this.iXS = n;
    }

    public int euU() {
        return this.rER;
    }

    public void adB(int n) {
        this.rER = n;
    }
}

