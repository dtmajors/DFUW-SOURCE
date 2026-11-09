/*
 * Decompiled with CFR.
 */
public class bxx
extends bxv {
    public bxx(byw.b b2) {
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
            return byw.a.eaR;
        }
        return byw.a.eaV;
    }
}

