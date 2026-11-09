/*
 * Decompiled with CFR.
 */
public class adc
extends adt {
    public adc(wy wy2, acr acr2, int n, int n2) {
        super(wy2, acr2, n, n2);
    }

    public adc(wy wy2, acr acr2, int n, int n2, String string) {
        super(wy2, acr2, n, n2, string);
    }

    @Override
    public boolean yY() {
        return false;
    }

    @Override
    protected void c(gec gec2) {
        if (gec2 != null) {
            this.eq(gec2.bUh());
        }
    }

    @Override
    public acp b(wy wy2, acr acr2) {
        return super.a(new adc(wy2, acr2, this.getID(), this.xk()));
    }
}

