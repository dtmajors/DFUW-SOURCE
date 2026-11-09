/*
 * Decompiled with CFR.
 */
public abstract class gic
extends dxq {
    protected float fFy = 0.0f;
    protected boolean Visible = false;
    protected ldv Rs = null;

    gic() {
        super(256);
    }

    gic(int n) {
        super(n);
    }

    public void fb(float f) {
        this.fFy = f;
    }

    public float bdV() {
        return this.fFy;
    }

    public void setVisible(boolean bl) {
        this.Visible = bl;
    }

    public boolean isVisible() {
        return this.Visible;
    }

    public ldv oq() {
        return this.Rs;
    }

    public void hC(ldv ldv2) {
        this.Rs = ldv2;
    }
}

