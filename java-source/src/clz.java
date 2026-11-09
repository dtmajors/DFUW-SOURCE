/*
 * Decompiled with CFR.
 */
public class clz
extends cly {
    public clz() {
        super(false);
    }

    public final void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11033: {
                this.c((gsl)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    protected void a(uk uk2) {
        switch (uk2.Uo) {
            case 3: {
                this.cB(((uo)uk2).Value);
                break;
            }
            default: {
                super.a(uk2);
            }
        }
    }

    private void c(gsl gsl2) {
        if (gsl2.joY == null) {
            return;
        }
        uk[] ukArray = gsl2.joY;
        int n = ukArray.length;
        for (int i = 0; i < n; ++i) {
            this.a(ukArray[i]);
        }
    }
}

