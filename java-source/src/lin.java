/*
 * Decompiled with CFR.
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;

public class lin {
    private static final lfo ct = new lfo("Util");

    public static final String Am(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        char c2 = Character.toUpperCase(string.charAt(0));
        if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ_".indexOf(c2) == -1) {
            c2 = '_';
        }
        stringBuilder.append(c2);
        for (int i = 1; i < string.length(); ++i) {
            c2 = Character.toUpperCase(string.charAt(i));
            if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ_0123456789".indexOf(c2) == -1) {
                c2 = '_';
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static final boolean An(String string) {
        assert (string != null);
        char c2 = Character.toUpperCase(string.charAt(0));
        if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ_".indexOf(c2) == -1) {
            return false;
        }
        for (int i = 1; i < string.length(); ++i) {
            c2 = Character.toUpperCase(string.charAt(i));
            if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ_0123456789".indexOf(c2) != -1) continue;
            return false;
        }
        return true;
    }

    public static boolean i(Object object, Object object2) {
        if (object == object2) {
            return true;
        }
        if (object == null || object2 == null) {
            return false;
        }
        return object.equals(object2);
    }

    public static boolean a(Object[] objectArray, Object[] objectArray2) {
        if (objectArray == objectArray2) {
            return true;
        }
        if (objectArray == null || objectArray2 == null) {
            return false;
        }
        assert (objectArray.getClass().getComponentType() == objectArray2.getClass().getComponentType());
        if (objectArray.length != objectArray2.length) {
            return false;
        }
        for (int i = 0; i < objectArray.length; ++i) {
            if (lin.i(objectArray[i], objectArray2[i])) continue;
            return false;
        }
        return true;
    }

    public static void a(int n, byte[] byArray, int n2) {
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            byArray[n2 + i] = (byte)(n >> n3 & 0xFF);
            n3 += 8;
        }
    }

    public static int acU(int n) {
        int n2 = 1;
        int n3 = 0;
        for (int i = 0; i < 32; ++i) {
            if ((n & n2) != 0) {
                ++n3;
            }
            n2 <<= 1;
        }
        return n3;
    }

    public static final Object a(Class<?> clazz, Object[] objectArray, Class<?>[] classArray) {
        try {
            Constructor<?> constructor = clazz.getDeclaredConstructor(classArray);
            return constructor.newInstance(objectArray);
        }
        catch (Exception exception) {
            assert (false);
            return null;
        }
    }

    public static final String b(Class<?> clazz, int n) {
        Field[] fieldArray = clazz.getFields();
        for (int i = 0; i < fieldArray.length; ++i) {
            int n2;
            block3: {
                if (fieldArray[i].getType() != Integer.TYPE || !Modifier.isStatic(fieldArray[i].getModifiers())) continue;
                n2 = 0;
                try {
                    n2 = fieldArray[i].getInt(null);
                }
                catch (IllegalAccessException illegalAccessException) {
                    if ($assertionsDisabled) break block3;
                    throw new AssertionError((Object)illegalAccessException);
                }
            }
            if (n2 != n) continue;
            return fieldArray[i].getName();
        }
        return null;
    }

    public static <E> Collection<E> a(Class<?> clazz, Class<E> clazz2, Object object, boolean bl, boolean bl2, boolean bl3) {
        ArrayList arrayList = new ArrayList();
        lin.a(clazz, clazz2, object, bl, bl2, bl3, arrayList);
        return arrayList;
    }

    public static <E> void a(Class<?> clazz, Class<E> clazz2, Object object, boolean bl, boolean bl2, boolean bl3, Collection<E> collection) {
        Field[] fieldArray;
        for (Field field : fieldArray = bl3 ? clazz.getFields() : clazz.getDeclaredFields()) {
            Object object2;
            int n = field.getModifiers();
            if ((!Modifier.isStatic(n) ? !bl2 : !bl) || !clazz2.isAssignableFrom(field.getType())) continue;
            field.setAccessible(true);
            try {
                object2 = field.get(object);
            }
            catch (IllegalAccessException illegalAccessException) {
                assert (false) : illegalAccessException.getMessage();
                continue;
            }
            if (object2 == null) continue;
            collection.add(object2);
        }
    }

    public static void a(boolean bl, lha<dxq, dxq> lha2, ldv ldv2, int n, int n2) {
        if (bl) {
            lha2.rnh.m(fvp.c(lha2.rng, ldv2, n, n2));
        } else {
            lha2.rnh.m(fvv.e(lha2.rng, ldv2, n));
        }
    }

    public static <E, C extends E> Collection<C> a(Collection<E> collection, Class<C> clazz) {
        lba<E> lba2 = new lba<E>(collection, new lbb<C>(clazz));
        laz laz2 = new laz(lba2);
        return laz2;
    }

    public static <E, C extends E> Collection<E> b(Collection<E> collection, Class<C> clazz) {
        return new lba<E>(collection, new lbb<C>(clazz, true));
    }
}

