/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class cqn
extends cqp {
    public cqn(hc hc2, int n, String string, boolean bl, ldq ldq2, float f2, float f3, lip lip2) {
        super(hc2, n, string, bl, ldq.class, ldq2, new ldq(f2), new ldq(f3), lip2);
    }

    @Override
    protected Object hQ(String string) {
        float f2 = Float.parseFloat(string);
        return new ldq(f2);
    }

    @Override
    public final lip x(Object object) {
        assert (object instanceof ldq);
        return new ljg(Float.toString(((ldq)object).floatValue()));
    }

    @Override
    protected uk aYJ() {
        return new ue();
    }

    @Override
    protected Object y(Object object) {
        assert (object instanceof ldq);
        return new ldq(((ldq)object).floatValue());
    }

    @Override
    protected boolean aYK() {
        return true;
    }

    @Override
    protected Object f(Object object, Object object2) {
        ldq ldq2 = (ldq)object;
        ldq ldq3 = (ldq)object2;
        ldq ldq4 = new ldq(lcw.ah((float)ldq2.floatValue(), (float)ldq3.floatValue()));
        return ldq4;
    }

    @Override
    protected boolean aYM() {
        return true;
    }

    @Override
    protected Object b(Object[] objectArray, float[] fArray) {
        float f2 = 0.0f;
        for (int i = 0; i < objectArray.length; ++i) {
            ldq ldq2 = (ldq)objectArray[i];
            if (ldq2 == null) {
                return null;
            }
            f2 += ldq2.floatValue() * fArray[i];
        }
        return new ldq(f2);
    }

    @Override
    protected boolean aYL() {
        return true;
    }

    @Override
    protected Object c(Object object, Object object2, float f2) {
        return this.a((ldq)object, (ldq)object2, f2);
    }

    private final ldq a(ldq ldq2, ldq ldq3, float f2) {
        float f3 = ldq2.floatValue();
        float f4 = ldq3.floatValue();
        ldq ldq4 = new ldq(f3 + (f4 - f3) * f2);
        return ldq4;
    }
}

