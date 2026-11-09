/*
 * Decompiled with CFR.
 */
public class ade
extends adx {
    public ade(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, n, n2);
    }

    public ade(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, n, n2, string);
    }

    @Override
    public boolean yY() {
        return false;
    }

    @Override
    protected void c(gec gec2) {
        if (gec2 != null) {
            this.W(gec2.bUi());
        }
    }

    @Override
    public acp b(wy wy2, acr acr2) {
        return super.a(new ade(wy2, acr2, this.getID(), this.xk()));
    }
}

