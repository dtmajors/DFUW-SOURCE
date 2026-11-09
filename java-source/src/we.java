/*
 * Decompiled with CFR.
 */
public class we
extends wf {
    public ldv GUID = null;
    public byte aYw = 0;
    public float aXy = 0.0f;

    public we() {
        super((byte)5);
    }

    @Override
    protected void d(uk uk2) {
        super.d(uk2);
        va va2 = (va)uk2;
        va2.GUID = this.GUID;
        va2.aXx = this.aYw;
        va2.aXy = this.aXy;
    }

    @Override
    protected void c(uk uk2) {
        super.c(uk2);
        va va2 = (va)uk2;
        this.GUID = va2.GUID;
        this.aYw = (byte)va2.aXx;
        this.aXy = va2.aXy;
    }

    @Override
    public boolean e(uk uk2) {
        if (!super.e(uk2)) {
            return false;
        }
        va va2 = (va)uk2;
        if (!(this.GUID != null && va2.GUID != null || va2.GUID == null && this.GUID == null)) {
            return false;
        }
        if (!this.GUID.equals(va2.GUID)) {
            return false;
        }
        if (this.aYw != va2.aXx) {
            return false;
        }
        return this.aXy == va2.aXy;
    }
}

