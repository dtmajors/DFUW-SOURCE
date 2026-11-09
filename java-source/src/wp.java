/*
 * Decompiled with CFR.
 */
public class wp
extends wr {
    public wo aZi = null;

    public wp() {
        super((byte)15);
    }

    @Override
    protected void d(uk uk2) {
        super.d(uk2);
        uj uj2 = (uj)uk2;
        uj2.aWo = this.aZi == null ? null : wo.a(this.aZi);
    }

    @Override
    protected void c(uk uk2) {
        super.c(uk2);
        uj uj2 = (uj)uk2;
        this.aZi = uj2.aWo == null ? null : wo.a(uj2.aWo);
    }

    @Override
    public boolean e(uk uk2) {
        if (!super.e(uk2)) {
            return false;
        }
        uj uj2 = (uj)uk2;
        if (this.aZi == null != (uj2.aWo == null)) {
            return false;
        }
        if (this.aZi == null) {
            return true;
        }
        return wo.a(this.aZi, uj2.aWo);
    }
}

