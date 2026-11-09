/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public final class asp {
    private asp() {
    }

    public static void a(int n, ldv ldv2, ljq ljq2, ldv ldv3, dxr dxr2) {
        if (ldv2 == null || ljq2 == null) {
            return;
        }
        glh glh2 = (glh)dxr2.h(13057, ldv3, lcr.qEb);
        glh2.setSpecialEffectType(n);
        ljq ljq3 = new ljq(ljq2);
        ljq3.y -= 1.0f;
        glh2.setTargetPosition(ljq3);
        glh2.o(0.0);
        glh2.mj(true);
        glh2.my(null);
        glh2.setTargetObjectGUID(ldv2);
        glh2.JQ(2);
        glh2.setSourcePosition(ljq2);
        dxr2.F(glh2);
    }

    public static void a(int n, ljq ljq2, ldv ldv2, ljq ljq3, ldv ldv3, dxr dxr2) {
        if (ldv2 == null || ljq3 == null) {
            return;
        }
        glh glh2 = (glh)dxr2.h(13057, ldv3, lcr.qEb);
        glh2.SpecialEffectType = n;
        glh2.aZD = ljq3;
        glh2.akX = ldv3;
        glh2.aZH = ljq2;
        glh2.aZG = ldv2;
        glh2.jkS = 2;
        glh2.oV = 0.0;
        glh2.jkR = true;
        glh2.aUa = null;
        dxr2.F(glh2);
    }

    public static void a(int n, ljq ljq2, ldv ldv2, dxr dxr2) {
        if (ljq2 == null) {
            return;
        }
        glh glh2 = (glh)dxr2.h(13057, ldv2, lcr.qEb);
        glh2.SpecialEffectType = n;
        glh2.aZG = null;
        glh2.akX = null;
        glh2.aZD = ljq2.esF();
        dxr2.F(glh2);
    }

    public static void a(int n, ljq ljq2, float f2, ldv ldv2, dxr dxr2) {
        if (ljq2 == null) {
            return;
        }
        glh glh2 = (glh)dxr2.h(13057, ldv2, lcr.qEb);
        glh2.SpecialEffectType = n;
        glh2.aZG = null;
        glh2.akX = null;
        glh2.aZD = ljq2.esF();
        glh2.doT = f2;
        dxr2.F(glh2);
    }

    public static void b(int n, ljq ljq2, ldv ldv2, dxr dxr2) {
        if (ldv2 == null || ljq2 == null) {
            return;
        }
        glh glh2 = (glh)dxr2.h(13057, ldv2, lcr.qEb);
        glh2.SpecialEffectType = n;
        glh2.akX = ldv2;
        glh2.aZD = ljq2.esF();
        dxr2.F(glh2);
    }
}

