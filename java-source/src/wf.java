/*
 * Decompiled with CFR.
 */
public class wf
extends wr {
    public short aYx = 0;

    protected wf() {
    }

    public wf(byte by) {
        super(by);
    }

    @Override
    protected void d(uk uk2) {
        super.d(uk2);
        vd vd2 = (vd)uk2;
        vd2.aXP = this.aYx;
    }

    @Override
    protected void c(uk uk2) {
        super.c(uk2);
        vd vd2 = (vd)uk2;
        this.aYx = (short)vd2.aXP;
    }

    @Override
    public boolean e(uk uk2) {
        if (!super.e(uk2)) {
            return false;
        }
        vd vd2 = (vd)uk2;
        return this.aYx == vd2.aXP;
    }
}

