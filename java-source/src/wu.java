/*
 * Decompiled with CFR.
 */
public class wu
extends wr {
    public wt aZB = null;

    public wu() {
        super((byte)16);
    }

    @Override
    protected void d(uk uk2) {
        super.d(uk2);
        um um2 = (um)uk2;
        um2.aXj = this.aZB == null ? null : wt.a(this.aZB);
    }

    @Override
    protected void c(uk uk2) {
        super.c(uk2);
        um um2 = (um)uk2;
        this.aZB = um2.aXj == null ? null : wt.c(um2.aXj);
    }

    @Override
    public boolean e(uk uk2) {
        if (!super.e(uk2)) {
            return false;
        }
        um um2 = (um)uk2;
        if (um2.aXj == null != (this.aZB == null)) {
            return false;
        }
        if (this.aZB == null) {
            return true;
        }
        return wt.a(um2.aXj, this.aZB);
    }
}

