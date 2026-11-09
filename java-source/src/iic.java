/*
 * Decompiled with CFR.
 */
public class iic {
    public static bcm a(bcm[] bcmArray, ldv ldv2) {
        for (bcm bcm2 : bcmArray) {
            if (bcm2.qd().enw() != ldv2.enw()) continue;
            return bcm2;
        }
        return null;
    }

    public static Object c(ej[] ejArray, int n) {
        if (ejArray != null) {
            for (ej ej2 : ejArray) {
                if (ej2.getType() != n) continue;
                return ej2.getValue();
            }
        }
        return null;
    }

    public static String d(ej[] ejArray, int n) {
        String string = (String)iic.c(ejArray, n);
        return string != null ? string.trim() : "";
    }

    public static int e(ej[] ejArray, int n) {
        Integer n2 = (Integer)iic.c(ejArray, n);
        return n2 != null ? n2 : -1;
    }

    public static <T> T a(ej[] ejArray, int n, T t) {
        Integer n2 = (Integer)iic.c(ejArray, n);
        return (T)(n2 != null ? t.getClass().getEnumConstants()[n2] : t);
    }

    public static boolean f(ej[] ejArray, int n) {
        Boolean bl = (Boolean)iic.c(ejArray, n);
        return bl != null ? bl : false;
    }

    public static Float g(ej[] ejArray, int n) {
        Float f = (Float)iic.c(ejArray, n);
        return Float.valueOf(f != null ? f.floatValue() : -1.0f);
    }

    public static Double h(ej[] ejArray, int n) {
        Double d2 = (Double)iic.c(ejArray, n);
        return d2 != null ? d2 : -1.0;
    }

    public static ldv i(ej[] ejArray, int n) {
        return (ldv)iic.c(ejArray, n);
    }
}

