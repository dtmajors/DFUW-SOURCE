/*
 * Decompiled with CFR.
 */
public class alo
extends alm {
    private int bst = 0;

    public alo() {
        this.Type = 5;
    }

    public int getFunctionType() {
        return this.bst;
    }

    public void fZ(int n) {
        this.bst = n;
    }

    public String getFunctionName() {
        return lea.enU().getName(this.bst);
    }

    @Override
    public String toString() {
        return super.toString() + " '" + this.getFunctionName() + "'";
    }

    @Override
    protected void a(alm alm2) {
        assert (this.bst > 0);
        super.a(alm2);
        alo alo2 = (alo)alm2;
        alo2.fZ(this.bst);
    }
}

