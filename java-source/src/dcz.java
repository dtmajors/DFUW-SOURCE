/*
 * Decompiled with CFR.
 */
public class dcz
extends dcy {
    private int gdL = 0;

    public int bjF() {
        return this.gdL;
    }

    public void zH(int n2) {
        this.gdL = n2;
    }

    @Override
    protected void b(dcx dcx2) {
        super.b(dcx2);
        dcz dcz2 = (dcz)dcx2;
        dcz2.zH(this.gdL);
    }
}

