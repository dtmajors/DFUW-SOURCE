/*
 * Decompiled with CFR.
 */
public class iti {
    public static boolean a(ith ith2, ith ith3) {
        for (ith3 = ith3.dqI(); ith3 != null; ith3 = ith3.dqI()) {
            if (ith3 != ith2) continue;
            return true;
        }
        return false;
    }

    public static boolean b(ith ith2, ith ith3) {
        return ith2 == ith3 || iti.a(ith2, ith3);
    }
}

