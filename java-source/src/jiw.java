/*
 * Decompiled with CFR.
 */
public class jiw
extends hys {
    private brt nhv;

    public jiw(ier ier2, brt brt2) {
        super("SplitItemsWindow", "SplitItemsWindow.swf", ier2);
        this.nhv = brt2;
    }

    public void ty(boolean bl) {
        this.a("setArrowPos", new Object[]{bl});
    }

    @Override
    protected void cHc() {
        this.a("setupSlider", new Object[]{0, 1, this.nhv.vf() - 1});
        this.a("setupItemType", new Object[]{this.nhv.vf(), 16766720});
    }

    protected boolean cFD() {
        return true;
    }

    @llk
    private void _accept(int n) {
        this.cGf().b(this.nhv, n);
    }
}

