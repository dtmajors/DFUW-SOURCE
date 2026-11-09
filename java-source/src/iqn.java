/*
 * Decompiled with CFR.
 */
public class iqn
extends irl {
    private static iqn mtL = new iqn();

    public static iqn dmR() {
        return mtL;
    }

    @Override
    public void i(ipf ipf2) {
        iph iph2 = (iph)ipf2;
        for (int i = 0; i < iph2.bfn(); ++i) {
            ipf ipf3 = iph2.RO(i);
            if (!ipf3.djL() && ipf3.djP()) continue;
            ipf3.ek(iph2.getWidth() - ipf3.getWidth(), iph2.getHeight() - ipf3.getHeight());
        }
    }
}

