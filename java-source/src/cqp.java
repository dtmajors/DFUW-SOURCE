/*
 * Decompiled with CFR.
 */
public abstract class cqp
extends cqi {
    public static final int eUT = 3;
    public static final int eUU = 4;
    public static final int eUP = 5;
    private Object eUV;
    private Object eUW;

    public cqp(hc hc2, int n, String string, boolean bl, Class clazz, Object object, Object object2, Object object3, lip lip2) {
        super(hc2, n, string, bl, object, clazz, lip2);
        assert (bl || object != null);
        assert (object2 != null);
        assert (object3 != null);
        assert (object2.getClass() == object3.getClass());
        if (object != null) {
            assert (object.getClass() == object2.getClass());
            assert (object instanceof Comparable);
            assert (((Comparable)object2).compareTo(object) <= 0);
            assert (((Comparable)object).compareTo(object3) <= 0);
        }
        this.eUV = object2;
        this.eUW = object3;
    }

    public final Object aYO() {
        return this.eUV;
    }

    public final Object aYP() {
        return this.eUW;
    }

    @Override
    protected int w(Object object) {
        int n = super.w(object);
        if (n != 0) {
            return n;
        }
        if (object != null) {
            if (((Comparable)this.eUV).compareTo(object) > 0) {
                return 3;
            }
            if (((Comparable)object).compareTo(this.eUW) > 0) {
                return 4;
            }
        }
        return 0;
    }

    @Override
    protected String sE(int n) {
        switch (n) {
            case 3: {
                return "VALIDITY_BELOW_MIN";
            }
            case 4: {
                return "VALIDITY_ABOVE_MAX";
            }
        }
        return super.sE(n);
    }
}

