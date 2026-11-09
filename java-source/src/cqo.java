/*
 * Decompiled with CFR.
 */
public class cqo
extends cqp {
    public cqo(hc hc2, int n, String string, boolean bl, lei lei2, int n2, int n3, lip lip2) {
        super(hc2, n, string, bl, lei.class, lei2, new lei(n2), new lei(n3), lip2);
    }

    @Override
    protected Object hQ(String string) {
        try {
            int n = Integer.parseInt(string);
            return new lei(n);
        }
        catch (Exception exception) {
            return null;
        }
    }

    @Override
    public final lip x(Object object) {
        assert (object instanceof lei);
        return new ljg(Integer.toString(((lei)object).intValue()));
    }

    @Override
    protected uk aYJ() {
        return new uh();
    }

    @Override
    protected Object y(Object object) {
        assert (object instanceof lei);
        return new lei(((lei)object).intValue());
    }
}

