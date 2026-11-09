/*
 * Decompiled with CFR.
 */
public class dvb
extends duy {
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
        return "SFEnchantingUseFunction:" + super.toString() + " FunctionType=" + this.bst + " FunctionName='" + this.getFunctionName() + "'";
    }

    @Override
    protected void a(dvc dvc2) {
        super.a(dvc2);
        dvb dvb2 = (dvb)dvc2;
        dvb2.fZ(this.bst);
    }
}

