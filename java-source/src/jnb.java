/*
 * Decompiled with CFR.
 */
public class jnb
extends jmz {
    private loz iMb = null;
    private jns nDc = null;

    public loz bPu() {
        return this.iMb;
    }

    public jns dMV() {
        return this.nDc;
    }

    private jnb(double d2, long l, loz loz2, jns jns2) {
        super(jnd.nDk, d2, l);
        this.iMb = loz2;
        this.nDc = jns2;
    }

    public static jnb b(double d2, long l, loz loz2, jns jns2) {
        if (loz2 == null || jns2 == null) {
            return null;
        }
        return new jnb(d2, l, loz2, jns2);
    }
}

