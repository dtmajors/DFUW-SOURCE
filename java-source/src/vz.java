/*
 * Decompiled with CFR.
 */
public class vz
extends wf {
    public vy aYs = null;

    public vz() {
        super((byte)4);
    }

    @Override
    public void c(uk uk2) {
        super.c(uk2);
        ut ut2 = (ut)uk2;
        this.aYs = ut2.aXo != null ? vy.a(ut2.aXo) : null;
    }

    @Override
    public void d(uk uk2) {
        super.d(uk2);
        ut ut2 = (ut)uk2;
        ut2.aXo = this.aYs != null ? vy.a(this.aYs) : null;
    }

    @Override
    public boolean e(uk uk2) {
        if (!super.e(uk2)) {
            return false;
        }
        ut ut2 = (ut)uk2;
        if (ut2.aXo == null) {
            return this.aYs == null;
        }
        return this.aYs.b(ut2.aXo);
    }
}

