/*
 * Decompiled with CFR.
 */
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class lda {
    private static final lfr Out = lfr.rkC;
    private static final DecimalFormatSymbols rem = new DecimalFormatSymbols(Locale.US);
    private static Exception ren = new Exception();

    public static String X(Object object) {
        return lda.a(object, object.getClass());
    }

    public static final DecimalFormat zj(String string) {
        return new DecimalFormat(string, rem);
    }

    public static final String aca(int n) {
        ren.fillInStackTrace();
        StackTraceElement[] stackTraceElementArray = ren.getStackTrace();
        return stackTraceElementArray[n].toString();
    }

    public static final List<String> acb(int n) {
        ren.fillInStackTrace();
        StackTraceElement[] stackTraceElementArray = ren.getStackTrace();
        ArrayList<String> arrayList = new ArrayList<String>(stackTraceElementArray.length);
        for (int i = n; i < stackTraceElementArray.length; ++i) {
            arrayList.add(stackTraceElementArray[i].toString());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static final boolean yk(boolean bl) {
        assert (bl != !bl);
        return true;
    }

    public static final boolean acc(int n) {
        assert (n != n + 1);
        return true;
    }

    public static final boolean ng(float f) {
        assert (f != f + 1.0f);
        return true;
    }

    public static final boolean dQ(double d2) {
        assert (d2 != d2 + 1.0);
        return true;
    }

    public static final boolean by(Object ... objectArray) {
        return true;
    }

    public static final boolean yl(boolean bl) {
        return bl;
    }

    private static String a(Object object, Class<?> clazz) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        stringBuilder.append(clazz.getName());
        Class<?> clazz2 = clazz.getSuperclass();
        if (clazz2 != Object.class) {
            stringBuilder.append(" super=");
            stringBuilder.append(lda.a(object, clazz2));
        }
        stringBuilder.append(lda.b(object, clazz));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private static String b(Object object, Class<?> clazz) {
        StringBuilder stringBuilder = new StringBuilder(4096);
        Field[] fieldArray = clazz.getDeclaredFields();
        boolean bl = false;
        for (int i = 0; i < fieldArray.length; ++i) {
            boolean bl2;
            Object object2;
            String string;
            Field field;
            block5: {
                field = fieldArray[i];
                int n = field.getModifiers();
                if (Modifier.isStatic(n)) continue;
                string = fieldArray[i].getName();
                object2 = null;
                bl2 = field.isAccessible();
                field.setAccessible(true);
                try {
                    object2 = fieldArray[i].get(object);
                }
                catch (Exception exception) {
                    if ($assertionsDisabled) break block5;
                    throw new AssertionError();
                }
            }
            field.setAccessible(bl2);
            if (!bl) {
                stringBuilder.append(": ");
            } else {
                stringBuilder.append(", ");
            }
            stringBuilder.append(string + "=" + object2);
            bl = true;
        }
        return stringBuilder.toString();
    }
}

