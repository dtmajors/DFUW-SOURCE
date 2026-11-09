/*
 * Decompiled with CFR.
 */
public class irg
extends iqz {
    private static irg muo = new irg();

    @Override
    public void e(ipf ipf2) {
        ipf2.setSize(0, 0);
    }

    @Override
    public void i(ipf ipf2) {
        iph iph2 = (iph)ipf2;
        for (int i = 0; i < iph2.bfn(); ++i) {
            ipf ipf3 = iph2.RO(i);
            ipf3.ek(iph2.getWidth() / 2 - ipf3.getWidth() / 2, iph2.getHeight() / 2 - ipf3.getHeight() / 2);
        }
    }

    public static irg dnk() {
        return muo;
    }
}

