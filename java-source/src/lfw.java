/*
 * Decompiled with CFR.
 */
import java.lang.reflect.Array;

public class lfw
extends lfu {
    public final lht rkG;

    public lfw(lht lht2) {
        assert (lht2 != null);
        this.rkG = lht2;
    }

    @Override
    protected Object b(String string, Object objectArray, Class<?> clazz) {
        String string2;
        assert (lin.An(string));
        assert (!clazz.isAssignableFrom(lbr.class));
        lht lht2 = this.zE(string);
        if (lht2 == null) {
            return objectArray;
        }
        if (this.rkG.size() == 0) {
            return null;
        }
        if (objectArray == null) {
            try {
                objectArray = clazz.newInstance();
            }
            catch (Exception exception) {
                assert (false);
                return null;
            }
        }
        if (clazz.isArray()) {
            assert (false);
            Class<?> clazz2 = clazz.getComponentType();
            Object[] objectArray2 = objectArray;
            int n = objectArray2.length;
            lfw lfw2 = new lfw(lht2);
            if ((n = lfw2.ad("Count", n)) != objectArray2.length) {
                Object[] objectArray3 = objectArray2;
                objectArray = objectArray2 = (Object[])Array.newInstance(clazz2, n);
                int n2 = Math.min(n, objectArray2.length);
                for (int i = 0; i < n2; ++i) {
                    objectArray2[i] = objectArray3[i];
                }
            }
            for (int i = 0; i < n; ++i) {
                objectArray2[i] = ((lfu)lfw2).b("Element" + i, objectArray2[i], clazz2);
            }
            return objectArray;
        }
        if (lht2.size() == 0) {
            string2 = null;
        } else {
            lht lht3 = (lht)lht2.get(0);
            if (lht2.size() != 1) {
                throw new Error("\"" + string + "\"/\"" + lht3.aFo + "\" is not a name-value pair because value has children!");
            }
            if (lht3.size() != 0) {
                throw new Error("\"" + string + "\"/\"" + lht3.aFo + "\" is not a name-value pair because value has siblings!");
            }
            string2 = lht3.aFo;
        }
        if (objectArray instanceof String) {
            objectArray = string2;
        } else if (objectArray instanceof Boolean) {
            objectArray = Boolean.valueOf(string2);
        } else if (objectArray instanceof Integer) {
            objectArray = Integer.valueOf(string2);
        } else if (objectArray instanceof Long) {
            objectArray = Long.valueOf(string2);
        } else if (objectArray instanceof Float) {
            objectArray = Float.valueOf(string2);
        } else if (objectArray instanceof Double) {
            objectArray = Double.valueOf(string2);
        } else if (objectArray instanceof Enum) {
            objectArray = this.e(objectArray, string2);
        } else {
            assert (false);
            return null;
        }
        return objectArray;
    }

    @Override
    protected lfu zD(String string) {
        assert (lin.An(string));
        lht lht2 = this.zE(string);
        if (lht2 == null) {
            lht2 = new lht(string);
            this.rkG.add(lht2);
        }
        return new lfw(lht2);
    }

    @Override
    protected boolean eqC() {
        return true;
    }

    public String toString() {
        return null;
    }

    private Object e(Object object, String string) {
        Enum enum_ = (Enum)object;
        Class clazz = enum_.getDeclaringClass();
        return Enum.valueOf(clazz, string);
    }

    private lht zE(String string) {
        for (lht lht2 : this.rkG) {
            if (!lht2.aFo.equals(string)) continue;
            return lht2;
        }
        return null;
    }
}

