/*
 * Decompiled with CFR.
 */
public class bye
extends bxv {
    public bye(byw.b b2) {
        super(b2);
    }

    @Override
    public byw.a b(boolean[] blArray) {
        if (blArray[0] == blArray[1]) {
            return byw.a.eaQ;
        }
        if (blArray[0]) {
            return byw.a.eaR;
        }
        return byw.a.eaV;
    }
}

