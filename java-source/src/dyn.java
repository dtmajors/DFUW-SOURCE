/*
 * Decompiled with CFR.
 */
public class dyn
extends dyk {
    public int eW;
    public int iiK;
    public float mB;

    dyn() {
        super(13323);
    }

    public static int jQ(String string) {
        if (string == null) {
            return -1;
        }
        for (b b2 : b.Values) {
            if (!string.equalsIgnoreCase(b2.name())) continue;
            return b.Values.indexOf((Object)b2);
        }
        return -1;
    }

    public static String Dd(int n2) {
        if (n2 < 0) {
            return null;
        }
        return b.Values.get(n2).name();
    }

    public static int jR(String string) {
        if (string == null) {
            return -1;
        }
        for (a a2 : a.Values) {
            if (!string.equalsIgnoreCase(a2.name())) continue;
            return a.Values.indexOf((Object)a2);
        }
        return -1;
    }

    public static String De(int n2) {
        if (n2 < 0) {
            return null;
        }
        return a.Values.get(n2).name();
    }
}

