/*
 * Decompiled with CFR.
 */
public class jiy
extends hys {
    private brt nhI;
    private int nhJ;

    public jiy(ier ier2, brt brt2, int n) {
        super("VendorBuyMultipleWindow", "VendorBuyMultipleWindow.swf", ier2);
        this.nhI = brt2;
        this.nhJ = n;
    }

    @Override
    protected void cHc() {
        this.a("setLabelText", new Object[]{lyz.trF.bD(new Object[0]).exA()});
        this.a("setupSlider", new Object[]{0, 1, this.nhJ});
        this.a("setupItemType", new Object[]{(int)this.nhI.Bb(), 16766720});
    }

    protected boolean cFD() {
        return true;
    }

    @llk
    private void _accept(int n) {
        this.cGf().b(this.nhI, n);
    }
}

