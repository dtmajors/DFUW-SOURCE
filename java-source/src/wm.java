/*
 * Decompiled with CFR.
 */
public class wm
extends wr {
    public wl aYT = null;

    public wm() {
        super((byte)14);
    }

    @Override
    protected void d(uk uk2) {
        super.d(uk2);
        ui ui2 = (ui)uk2;
        if (this.aYT == null) {
            ui2.aWn = null;
        } else {
            ui2.aWn = new byv();
            this.aYT.b(ui2.aWn);
        }
    }

    @Override
    protected void c(uk uk2) {
        super.c(uk2);
        ui ui2 = (ui)uk2;
        if (ui2.aWn == null) {
            this.aYT = null;
        } else {
            this.aYT = new wl();
            this.aYT.a(ui2.aWn);
        }
    }

    @Override
    public boolean e(uk uk2) {
        if (!super.e(uk2)) {
            return false;
        }
        ui ui2 = (ui)uk2;
        if (this.aYT == null != (ui2.aWn == null)) {
            return false;
        }
        if (this.aYT == null) {
            return true;
        }
        return this.aYT.c(ui2.aWn);
    }
}

