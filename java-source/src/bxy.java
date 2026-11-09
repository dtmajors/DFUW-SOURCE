/*
 * Decompiled with CFR.
 */
public class bxy
extends bxv {
    public bxy(byw.b b2) {
        super(b2);
    }

    @Override
    public byw.a b(boolean[] blArray) {
        if (blArray[0] == blArray[1]) {
            if (blArray[2] == blArray[3]) {
                return byw.a.eaQ;
            }
            if (blArray[2]) {
                return byw.a.eaT;
            }
            return byw.a.eaX;
        }
        if (blArray[0]) {
            if (blArray[2] == blArray[3]) {
                return byw.a.eaR;
            }
            if (blArray[2]) {
                return byw.a.eaS;
            }
            return byw.a.eaY;
        }
        if (blArray[2] == blArray[3]) {
            return byw.a.eaV;
        }
        if (blArray[2]) {
            return byw.a.eaU;
        }
        return byw.a.eaW;
    }
}

