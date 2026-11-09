/*
 * Decompiled with CFR.
 */
import java.util.Collection;

public class anl {
    private static final int SYSTEM = -1;

    public static void a(aud.b b2, asv asv2, dxr dxr2, ldv ldv2, int n, String ... stringArray) {
        if (asv2 == null) {
            return;
        }
        if (asv2.qd() == null) {
            return;
        }
        egy egy2 = (egy)dxr2.h(2305, ldv2, asv2.qd());
        egy2.b(b2);
        egy2.ccR = n;
        egy2.ipJ = anl.e(stringArray);
        dxr2.F(egy2);
    }

    public static void a(aud.b b2, Collection<asv> collection, dxr dxr2, ldv ldv2, int n, String ... stringArray) {
        egy egy2 = (egy)dxr2.h(2305, ldv2, null);
        egy2.b(b2);
        switch (b2) {
            default: 
        }
        egy2.ccR = n;
        egy2.ipJ = anl.e(stringArray);
        anl.a(egy2, collection, dxr2);
    }

    private static lip[] e(String[] stringArray) {
        lip[] lipArray = new ljg[stringArray.length];
        for (int i = 0; i < lipArray.length; ++i) {
            lipArray[i] = new ljg(stringArray[i] == null ? "" : stringArray[i]);
        }
        return lipArray;
    }

    private static void a(egy egy2, Collection<asv> collection, dxr dxr2) {
        for (asv asv2 : collection) {
            egy egy3 = (egy)egy2.clone();
            egy3.on(asv2.qd());
            dxr2.F(egy3);
        }
    }

    private anl() {
    }

    public static String hq(int n) {
        if (n == -1) {
            return null;
        }
        String string = lea.enW().getName(n);
        if (string != null) {
            return string.toLowerCase();
        }
        return null;
    }

    public static String hr(int n) {
        if (n == -1) {
            return null;
        }
        String string = lea.enW().getName(lea.enW().uW(n));
        if (string != null) {
            return string.toLowerCase();
        }
        return null;
    }
}

