/*
 * Decompiled with CFR.
 */
public class iqp
extends irl {
    private ire msb;
    private static iqp mtR = new iqp();
    private static iqp mtS = new iqp(ire.muk);
    private static iqp mtT = new iqp(ire.mul);

    public iqp() {
    }

    public iqp(ire ire2) {
        this.msb = ire2;
    }

    @Override
    public void i(ipf ipf2) {
        iph iph2 = (iph)ipf2;
        if (this.msb == null) {
            ira.c(iph2);
        } else if (this.msb == ire.muk) {
            ira.d(iph2);
        } else {
            ira.e(iph2);
        }
    }

    public static iqp dmW() {
        return mtR;
    }

    public static iqp dmX() {
        return mtS;
    }

    public static iqp dmY() {
        return mtT;
    }
}

