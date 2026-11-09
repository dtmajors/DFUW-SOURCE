/*
 * Decompiled with CFR.
 */
public class dux {
    private int bhh = 0;
    private String fem = null;

    public int aFZ() {
        return this.bhh;
    }

    public void eA(int n) {
        this.bhh = n;
    }

    public String bBt() {
        return this.fem;
    }

    public void jC(String string) {
        this.fem = string;
    }

    public dux bBu() {
        dux dux2 = new dux();
        dux2.eA(this.bhh);
        dux2.jC(this.fem);
        return dux2;
    }

    public String toString() {
        return "SFSubsetMesh: SubsetID=" + this.bhh + " MeshFileName'" + this.fem + "'";
    }
}

