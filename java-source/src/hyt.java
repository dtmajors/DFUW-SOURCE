/*
 * Decompiled with CFR.
 */
public class hyt
extends ioa {
    public hyt() {
        super("DebugIndicatorWindow", "J2FWindow.swf");
        this.OQ(-1);
        this.a(hya.lmt, false);
        this.a(hya.lmv, false);
        this.a(hya.lmw, false);
        this.a(hya.lmp, true);
    }

    @Override
    protected void cCu() {
        super.cCu();
        this.dhJ().a(irl.dnr());
        this.dhJ().W(new ipb("/dfdata/texture/gui/j2f/debug/debug.png"));
        this.pack();
    }
}

