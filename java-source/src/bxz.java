/*
 * Decompiled with CFR.
 */
public class bxz
extends bxv {
    public bxz(byw.b b2) {
        super(b2);
    }

    @Override
    public byw.a b(boolean[] blArray) {
        if (this.c(blArray)) {
            return byw.a.eaQ;
        }
        if (blArray[0]) {
            return byw.a.eaR;
        }
        if (blArray[4] || blArray[5]) {
            return byw.a.eaQ;
        }
        return byw.a.eaQ;
    }

    private boolean c(boolean[] blArray) {
        if (blArray[1]) {
            return true;
        }
        if (blArray[2]) {
            return true;
        }
        return blArray[3];
    }
}

