/*
 * Decompiled with CFR.
 */
public class cqr
extends cqi {
    public cqr(hc hc2, int n, String string, boolean bl, lip lip2) {
        super(hc2, n, string, bl, null, lhh.class, lip2);
    }

    @Override
    protected Object hQ(String string) {
        ldv ldv2 = ldv.zq(string);
        if (ldv2 == null) {
            throw new NumberFormatException(string);
        }
        return new lhh(ldv2);
    }

    @Override
    public final lip x(Object object) {
        assert (object instanceof lhh);
        lhh lhh2 = (lhh)object;
        return new ljg(lhh2.ib() + "," + lhh2.enw() + "," + lhh2.enx());
    }

    @Override
    protected uk aYJ() {
        return null;
    }

    @Override
    protected Object y(Object object) {
        return new lhh((lhh)object);
    }
}

