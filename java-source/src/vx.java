/*
 * Decompiled with CFR.
 */
public class vx
extends wr {
    public vw[] aYo = null;

    public vx() {
        super((byte)1);
    }

    @Override
    public void c(uk uk2) {
        super.c(uk2);
        ty ty2 = (ty)uk2;
        if (ty2.aWi != null) {
            this.aYo = new vw[ty2.aWi.length];
            int n = ty2.aWi.length;
            for (int i = 0; i < n; ++i) {
                this.aYo[i] = vw.a(ty2.aWi[i]);
            }
        } else {
            this.aYo = null;
        }
    }

    @Override
    public void d(uk uk2) {
        super.d(uk2);
        ty ty2 = (ty)uk2;
        if (this.aYo != null) {
            ty2.aWi = new tx[this.aYo.length];
            int n = this.aYo.length;
            for (int i = 0; i < n; ++i) {
                ty2.aWi[i] = vw.a(this.aYo[i]);
            }
        } else {
            ty2.aWi = null;
        }
    }

    @Override
    public boolean e(uk uk2) {
        if (!super.e(uk2)) {
            return false;
        }
        ty ty2 = (ty)uk2;
        if (ty2.aWi == null) {
            return this.aYo == null;
        }
        if (ty2.aWi.length != this.aYo.length) {
            return false;
        }
        for (int i = 0; i < ty2.aWi.length; ++i) {
            if (this.aYo[i].b(ty2.aWi[i])) continue;
            return false;
        }
        return true;
    }
}

