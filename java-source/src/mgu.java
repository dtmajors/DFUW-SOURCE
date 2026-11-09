/*
 * Decompiled with CFR.
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class mgu {
    public static final Method a(Class<?> clazz, String string, Class<?> ... classArray) {
        if (string == null) {
            throw new IllegalArgumentException("Method name needs to be provided!");
        }
        if (clazz == null) {
            throw new NoSuchMethodException("Method " + string + " was not found!");
        }
        try {
            return clazz.getDeclaredMethod(string, classArray);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return mgu.a(clazz.getSuperclass(), string, classArray);
        }
    }

    public static final Field getDeclaredField(Class<?> clazz, String string) {
        if (string == null) {
            throw new IllegalArgumentException("Field name needs to be provided!");
        }
        if (clazz == null) {
            throw new NoSuchFieldException("Field " + string + " was not found!");
        }
        try {
            return clazz.getDeclaredField(string);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            return mgu.getDeclaredField(clazz.getSuperclass(), string);
        }
    }
}

