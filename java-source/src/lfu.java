/*
 * Decompiled with CFR.
 */
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public abstract class lfu {
    protected static final lfr Out = lfr.rkC;

    public final lfu zC(String string) {
        return this.zD(string);
    }

    public final boolean a(String string, lbr lbr2) {
        assert (string != null);
        assert (lbr2 != null);
        lfu lfu2 = this.zD(string);
        return lbr2.a(lfu2);
    }

    public final <X extends lbq> X a(String string, X x, lbs<X> lbs2) {
        lfu lfu2 = this.zD(string);
        return lbs2.a(lfu2, x);
    }

    public final boolean eqA() {
        return this.eqC();
    }

    public final boolean eqB() {
        return !this.eqC();
    }

    public final boolean V(String string, boolean bl) {
        Boolean bl2 = new Boolean(bl);
        if ((bl2 = (Boolean)this.f(string, bl2)) == null) {
            return bl;
        }
        return bl2;
    }

    public final int ad(String string, int n) {
        Integer n2 = new Integer(n);
        if ((n2 = (Integer)this.f(string, n2)) == null) {
            return n;
        }
        return n2;
    }

    public final int ae(String string, int n) {
        String string2 = Integer.toHexString(n);
        if ((string2 = (String)this.f(string, string2)) == null) {
            return n;
        }
        try {
            return (int)Long.parseLong(string2, 16);
        }
        catch (Exception exception) {
            return Integer.parseInt(string2, 10);
        }
    }

    public final long b(String string, long l) {
        Long l2 = new Long(l);
        if ((l2 = (Long)this.f(string, l2)) == null) {
            return l;
        }
        return l2;
    }

    public final <E extends Enum<E>> E b(String string, E e2) {
        assert (e2 != null);
        String string2 = e2.toString();
        if ((string2 = this.aA(string, string2)) == null) {
            return e2;
        }
        try {
            return Enum.valueOf(e2.getDeclaringClass(), string2);
        }
        catch (Exception exception) {
            return e2;
        }
    }

    public final float e(String string, float f) {
        Float f2 = new Float(f);
        if ((f2 = (Float)this.f(string, f2)) == null) {
            return f;
        }
        return f2.floatValue();
    }

    public final double c(String string, double d2) {
        Double d3 = new Double(d2);
        if ((d3 = (Double)this.f(string, d3)) == null) {
            return d2;
        }
        return d3;
    }

    public final String aA(String string, String string2) {
        return (String)this.b(string, string2, String.class);
    }

    public final boolean a(Object object, Class<?> clazz, boolean bl, boolean bl2) {
        boolean bl3 = false;
        Field[] fieldArray = clazz.getDeclaredFields();
        for (int i = 0; i < fieldArray.length; ++i) {
            Class<?> clazz2;
            Object object2;
            Field field = fieldArray[i];
            int n = field.getModifiers();
            if (Modifier.isTransient(n) || (Modifier.isStatic(n) ? !bl : !bl2)) continue;
            String string = fieldArray[i].getName();
            field.setAccessible(true);
            try {
                object2 = field.get(object);
            }
            catch (Exception exception) {
                assert (false);
                continue;
            }
            Class<?> clazz3 = clazz2 = object2 == null ? fieldArray[i].getType() : object2.getClass();
            if (lbr.class.isAssignableFrom(clazz2)) {
                bl3 |= this.a(string, (lbr)object2);
                continue;
            }
            Object object3 = this.b(string, object2, clazz2);
            if (!this.eqA() || lin.i(object2, object3)) continue;
            try {
                field.set(object, object3);
            }
            catch (Exception exception) {
                assert (false) : exception;
                continue;
            }
            assert (lfu.a(field, object, object3));
            bl3 = true;
        }
        return bl3;
    }

    public final Object a(String string, Object object, Class<?> clazz) {
        assert (lin.An(string));
        try {
            object = this.b(string, object, clazz);
        }
        catch (Throwable throwable) {
            assert (false);
            Out.c(throwable);
        }
        return object;
    }

    public final Object f(String string, Object object) {
        assert (object != null);
        return this.a(string, object, object.getClass());
    }

    protected abstract Object b(String var1, Object var2, Class<?> var3);

    protected abstract lfu zD(String var1);

    protected abstract boolean eqC();

    private static boolean a(Field field, Object object, Object object2) {
        Object object3;
        try {
            object3 = field.get(object);
        }
        catch (Exception exception) {
            assert (false);
            return false;
        }
        return lin.i(object2, object3);
    }
}

