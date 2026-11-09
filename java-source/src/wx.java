/*
 * Decompiled with CFR.
 */
public class wx
extends wr {
    public ww aZN = null;

    public wx() {
        super((byte)17);
    }

    @Override
    protected void d(uk uk2) {
        super.d(uk2);
        un un2 = (un)uk2;
        un2.aXk = this.aZN == null ? null : ww.a(this.aZN);
    }

    @Override
    protected void c(uk uk2) {
        super.c(uk2);
        un un2 = (un)uk2;
        this.aZN = un2.aXk == null ? null : ww.a(un2.aXk);
    }

    @Override
    public boolean e(uk uk2) {
        if (!super.e(uk2)) {
            return false;
        }
        un un2 = (un)uk2;
        if (un2.aXk == null != (this.aZN == null)) {
            return false;
        }
        if (this.aZN == null) {
            return true;
        }
        return ww.a(this.aZN, un2.aXk);
    }
}

