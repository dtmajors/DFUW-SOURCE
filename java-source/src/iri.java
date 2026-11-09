/*
 * Decompiled with CFR.
 */
public class iri
extends iqp {
    private ire msb;
    private static iri muq = new iri(ire.muk);
    private static iri mur = new iri(ire.mul);

    public iri(ire ire2) {
        this.msb = ire2;
    }

    @Override
    public void i(ipf ipf2) {
        if (ipf2 instanceof iph) {
            int n;
            int n2;
            int n3;
            iph iph2 = (iph)ipf2;
            if (this.msb == ire.muk) {
                n3 = iph2.getWidth();
                n2 = 0;
                n = (iph2.getHeight() - n3) / 2;
            } else {
                n3 = iph2.getHeight();
                n2 = (iph2.getWidth() - n3) / 2;
                n = 0;
            }
            ira.b(iph2, n2, n, n3, n3);
        }
    }

    public static iri dnl() {
        return muq;
    }

    public static iri dnm() {
        return mur;
    }
}

