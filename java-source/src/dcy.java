/*
 * Decompiled with CFR.
 */
public class dcy
extends dcx {
    private boolean gdJ = false;
    private boolean gdK = false;

    public boolean beV() {
        return this.gdJ;
    }

    public void hG(boolean bl) {
        this.gdJ = bl;
    }

    public boolean bjE() {
        return this.gdK;
    }

    public void hH(boolean bl) {
        this.gdK = bl;
    }

    @Override
    protected void b(dcx dcx2) {
        super.b(dcx2);
        dcy dcy2 = (dcy)dcx2;
        dcy2.hG(this.gdJ);
    }
}

