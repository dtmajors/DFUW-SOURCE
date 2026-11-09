/*
 * Decompiled with CFR.
 */
public class aei
extends ado {
    public aei(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, n, n2);
    }

    public aei(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, n, n2, string);
    }

    @Override
    public boolean yY() {
        return false;
    }

    @Override
    public acp b(wy wy2, acr acr2) {
        return super.a(new aei(wy2, acr2, this.getID(), this.xk()));
    }
}

