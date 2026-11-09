/*
 * Decompiled with CFR.
 */
public class dvd
extends dvc {
    private int bst = 0;

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
        return "SFSpecialFunction:" + super.toString() + " FunctionType=" + this.bst + " FunctionName='" + this.getFunctionName() + "'";
    }

    @Override
    protected void a(dvc dvc2) {
        super.a(dvc2);
        dvd dvd2 = (dvd)dvc2;
        dvd2.fZ(this.bst);
    }
}

