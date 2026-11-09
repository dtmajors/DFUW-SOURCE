/*
 * Decompiled with CFR.
 */
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class icf {
    private static Map<ldj, lfs<lox, lox>> lHe = Collections.unmodifiableMap(icf.cNH());

    public static Map<ldj, lfs<lox, lox>> getMap() {
        return lHe;
    }

    private static Map<ldj, lfs<lox, lox>> cNH() {
        Map<ldj, lfs<lox, lox>> map = lcn.emw();
        Collection<ldj> collection = lea.eoE().values();
        for (ldj ldj2 : collection) {
            lox lox2 = icf.c(ldj2);
            lox lox3 = icf.d(ldj2);
            assert (lox2 != null);
            assert (lox3 != null);
            map.put(ldj2, new lfs<lox, lox>(lox3, lox2));
        }
        return map;
    }

    private static lox c(ldj ldj2) {
        Field[] fieldArray;
        String string = "EmoteMessage" + ldj2.ipt;
        for (Field field : fieldArray = mag.class.getDeclaredFields()) {
            String string2 = field.getName();
            if (!string2.equalsIgnoreCase(string)) continue;
            try {
                return (lox)field.get(mag.Instance);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                illegalArgumentException.printStackTrace();
            }
            catch (IllegalAccessException illegalAccessException) {
                illegalAccessException.printStackTrace();
            }
        }
        return null;
    }

    private static lox d(ldj ldj2) {
        Field[] fieldArray;
        String string = ldj2.ipt + "EmoteName";
        for (Field field : fieldArray = lwv.class.getDeclaredFields()) {
            String string2 = field.getName();
            if (!string2.equalsIgnoreCase(string)) continue;
            try {
                return (lox)field.get(lwv.tih);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                illegalArgumentException.printStackTrace();
            }
            catch (IllegalAccessException illegalAccessException) {
                illegalAccessException.printStackTrace();
            }
        }
        return null;
    }
}

