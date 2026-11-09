/*
 * Decompiled with CFR.
 */
public class wd
extends wf {
    public short aYu = 0;
    public short aYv = 0;

    public wd() {
        super((byte)6);
    }

    @Override
    protected void d(uk uk2) {
        super.d(uk2);
        uz uz2 = (uz)uk2;
        uz2.aXs = lbc.j(this.aYu);
        uz2.Pz = lbc.j(this.aYv);
    }

    @Override
    protected void c(uk uk2) {
        super.c(uk2);
        uz uz2 = (uz)uk2;
        this.aYu = lbc.mV(uz2.aXs);
        this.aYv = lbc.mV(uz2.Pz);
    }

    @Override
    public boolean e(uk uk2) {
        if (!super.e(uk2)) {
            return false;
        }
        uz uz2 = (uz)uk2;
        if (Math.abs(lbc.j(this.aYu) - uz2.aXs) > 0.005f) {
            return false;
        }
        return !(Math.abs(lbc.j(this.aYv) - uz2.Pz) > 0.005f);
    }
}

