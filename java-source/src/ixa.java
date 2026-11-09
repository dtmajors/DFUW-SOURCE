/*
 * Decompiled with CFR.
 */
public abstract class ixa
extends iro {
    private ipf mBa = new iqa("/dfdata/texture/gui/j2f/common/gradients/list_gradient_top.png");
    private ipf mBb;

    public ixa() {
        this.mBa.hz(0.0f);
        this.W(this.mBa);
        this.mBb = new iqa("/dfdata/texture/gui/j2f/common/gradients/list_gradient_bottom.png");
        this.mBb.hz(0.0f);
        this.W(this.mBb);
    }

    @Override
    public void cPk() {
        super.cPk();
        int n = this.dnx();
        this.mBa.r(0, 0, this.getWidth() - this.dnv(), this.mBa.getHeight());
        this.mBa.hz(n > 0 ? 0.5f : 0.0f);
        this.mBb.r(0, this.getHeight() - this.mBb.getHeight(), this.getWidth() - this.dnv(), this.mBb.getHeight());
        this.mBb.hz(n < this.dny() - 1 ? 0.5f : 0.0f);
    }
}

