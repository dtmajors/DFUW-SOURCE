/*
 * Decompiled with CFR.
 */
class cxl {
    public final int fWT;
    public final int fWU;

    public cxl(int n2, int n3) {
        assert (n2 > 0);
        assert (n3 > 0);
        this.fWT = n2;
        this.fWU = n3;
    }

    public String bfU() {
        assert (this.fWT > 0);
        return lea.enW().getName(this.fWT);
    }

    public String bfV() {
        assert (this.fWU > 0);
        return lea.enZ().getName(this.fWU);
    }
}

