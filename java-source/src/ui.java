/*
 * Decompiled with CFR.
 */
public class ui
extends uk {
    public byv aWn = null;

    public ui() {
        super(9);
    }

    @Override
    public Object vC() {
        if (this.aWn != null) {
            return this.aWn.aEl();
        }
        return null;
    }

    @Override
    protected void b(uk uk2) {
        super.b(uk2);
        ui ui2 = (ui)uk2;
        if (this.aWn != null) {
            ui2.aWn = this.aWn.aEl();
        }
    }
}

