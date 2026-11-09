/*
 * Decompiled with CFR.
 */
public class jhr
extends ioa {
    private int nfo = -1;
    private int nfp;

    public jhr() {
        super("TrackerDropIndicatorWindow", "TrackerWindow.swf");
        this.OQ(-1);
        this.a(hyb.lmD);
        this.a(hya.lmt, false);
        this.a(hya.lmx, false);
        this.a(hya.lms, false);
        this.a(hya.lmv, false);
        this.a(hya.lmw, false);
        this.a(hya.lmr, false);
    }

    public void fy(int n, int n2) {
        this.nfo = n;
        this.nfp = n2;
        if (this.dhV()) {
            this.dGr();
        }
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.dhJ().a(iqo.dmS());
        this.dhJ().W(ipx.d(new ipb("feat_tracker_move_indicator_left")));
        this.dhJ().W(ipx.d(new ipb("feat_tracker_move_indicator_line")));
        this.dhJ().W(ipx.d(new ipb("feat_tracker_move_indicator_right")));
        this.pack();
        if (this.nfo != -1) {
            this.dGr();
        }
    }

    private void dGr() {
        this.R(this.nfo - 25, this.nfp - 12);
    }
}

