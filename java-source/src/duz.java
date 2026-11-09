/*
 * Decompiled with CFR.
 */
public class duz
extends duy {
    private alt Qd = null;

    public alt bBv() {
        return this.Qd;
    }

    public void h(alt alt2) {
        this.Qd = alt2;
    }

    @Override
    public String toString() {
        return "SFEnchantingModifierFunction:" + super.toString() + " " + this.Qd;
    }

    @Override
    protected void a(dvc dvc2) {
        super.a(dvc2);
        duz duz2 = (duz)dvc2;
        duz2.h(this.Qd.Ef());
    }
}

