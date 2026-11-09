/*
 * Decompiled with CFR.
 */
public class cqm
extends cqp {
    public cqm(hc hc2, int n, String string, boolean bl, ldf ldf2, double d2, double d3, lip lip2) {
        super(hc2, n, string, bl, ldf.class, ldf2, new ldf(d2), new ldf(d3), lip2);
    }

    @Override
    protected Object hQ(String string) {
        double d2 = Double.parseDouble(string);
        return new ldf(d2);
    }

    @Override
    public final lip x(Object object) {
        assert (object instanceof ldf);
        return new ljg(Double.toString(((ldf)object).doubleValue()));
    }

    @Override
    protected uk aYJ() {
        return new ud();
    }

    @Override
    protected Object y(Object object) {
        assert (object instanceof ldf);
        return new ldf((ldf)object);
    }
}

