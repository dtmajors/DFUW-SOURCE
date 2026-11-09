/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
public class hwh
extends hyn {
    private hwi lii;

    public hwh(hwi hwi2) {
        super("CustomCursorWindow", "CustomCursorWindow.swf");
        this.a(hyb.lmD);
        this.a(hya.lmp, true);
        this.a(hya.lmr, false);
        this.a(hya.lms, false);
        this.a(hya.lmt, false);
        this.a(hya.lmu, false);
        this.a(hya.lmv, false);
        this.a(hya.lmw, false);
        assert (hwi2 != null);
        this.lii = hwi2;
    }

    public void Q(float f2, float f3) {
        this.R(f2 - (float)this.lii.cBc(), f3 - (float)this.lii.cBd());
    }

    public void a(hwi hwi2) {
        if (hwi.a(this.lii, hwi2)) {
            return;
        }
        this.lii = hwi2;
        if (this.cDj()) {
            this.cBb();
        }
    }

    protected void cBa() {
        super.cBa();
        this.cBb();
    }

    protected boolean d(int n, int n2, String string) {
        return false;
    }

    private void cBb() {
        this.a("setCursorResource", new Object[]{this.lii.pa()});
    }
}

