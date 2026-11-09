/*
 * Decompiled with CFR.
 */
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class asy {
    private static final WeakHashMap<asx, WeakReference<asx>> bXZ = lcn.emJ();

    private asy() {
    }

    public static asx a(asx.a a2, boolean bl) {
        asx asx2 = new asx(bl, a2);
        if (!bXZ.containsKey(asx2)) {
            bXZ.put(asx2, new WeakReference<asx>(asx2));
        }
        return asx2;
    }

    public static asx a(asx.a a2, int n) {
        asx asx2 = new asx(n, a2);
        if (!bXZ.containsKey(asx2)) {
            bXZ.put(asx2, new WeakReference<asx>(asx2));
        }
        return asx2;
    }
}

