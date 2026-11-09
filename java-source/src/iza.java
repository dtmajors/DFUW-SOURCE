/*
 * Decompiled with CFR.
 */
public class iza
extends izb {
    private ipf mCP = null;
    private ipf mCQ = null;
    private ipf mCR = null;
    private ipf mCS = null;
    private ipf mCT = ipx.d(new ipb("SortSelectionOnDescendingDisabled"));
    private ipf mCU = ipx.d(new ipb("SortSelectionOnDescendingNormal"));
    private ipf mCV = ipx.d(new ipb("SortSelectionOnDescendingHover"));
    private ipf mCW = ipx.d(new ipb("SortSelectionOnDescendingPushing"));
    private boolean mCX = true;

    public iza() {
        super("SortSelectionOffDisabled", "SortSelectionOffNormal", "SortSelectionOffHover", "SortSelectionOffPushing", "SortSelectionOnAscendingDisabled", "SortSelectionOnAscendingNormal", "SortSelectionOnAscendingHover", "SortSelectionOnAscendingPushing");
        this.mCP = this.djd();
        this.mCQ = this.dje();
        this.mCR = this.djf();
        this.mCS = this.djg();
    }

    public boolean dtK() {
        return this.mCX;
    }

    public void sN(boolean bl) {
        if (this.mCX == bl) {
            return;
        }
        this.mCX = bl;
        if (this.mCX) {
            this.J(this.mCP);
            this.K(this.mCQ);
            this.L(this.mCR);
            this.M(this.mCS);
        } else {
            this.J(this.mCT);
            this.K(this.mCU);
            this.L(this.mCV);
            this.M(this.mCW);
        }
    }
}

