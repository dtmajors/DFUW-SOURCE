/*
 * Decompiled with CFR.
 */
public class dbq
extends dbo {
    private int aWe = 0;

    @Override
    public int aDI() {
        return this.aWe;
    }

    public void zC(int n2) {
        this.aWe = n2;
    }

    @Override
    protected void d(dbo dbo2) {
        super.d(dbo2);
        dbq dbq2 = (dbq)dbo2;
        dbq2.zC(this.aWe);
    }
}

