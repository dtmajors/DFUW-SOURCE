/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcw
 */
public class cil {
    public static boolean b(el el2, int n) {
        if (!lcw.emW() || !lcw.emX()) {
            return false;
        }
        if (el2 != null) {
            if (n == cug.fue) {
                ew ew2 = (ew)el2.ae(13152);
                return ew2 != null && ew2.fQ() > 0;
            }
            if (n == cug.fuf) {
                ew ew3 = (ew)el2.ae(13168);
                return ew3 != null && ew3.fQ() > 0;
            }
            if (n == cug.ftZ) {
                ew ew4 = (ew)el2.ae(12912);
                return ew4 != null && ew4.fQ() > 0;
            }
        }
        return false;
    }

    public static boolean c(el el2) {
        if (!lcw.emW() || !lcw.emX()) {
            return false;
        }
        if (el2 != null) {
            ew ew2 = (ew)el2.ae(13152);
            if (ew2 != null && ew2.fQ() > 0) {
                return true;
            }
            ew2 = (ew)el2.ae(13168);
            if (ew2 != null && ew2.fQ() > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(el el2, int n) {
        if (!lcw.emW() || !lcw.emX()) {
            return false;
        }
        if (!ep.b.isValidOrdinal(n)) {
            return false;
        }
        if (el2 != null) {
            if (!cil.c(el2)) {
                return false;
            }
            ew ew2 = (ew)el2.ae(13120);
            ew2.bi(n);
            return true;
        }
        return false;
    }

    public static float a(el el2, tv tv2, float f) {
        if (!lcw.emW() || !lcw.emX()) {
            return f;
        }
        if (el2 != null) {
            eq eq2 = (eq)el2.ae(13136);
            if (eq2 != null && eq2.getBooleanValue()) {
                cir cir2 = (cir)lea.epC().get(cug.fug);
                return cir2.a(tv2, f);
            }
            ew ew2 = (ew)el2.ae(13152);
            if (ew2 != null && ew2.fQ() > 0) {
                ciu ciu2 = (ciu)lea.epC().get(cug.fue);
                return ciu2.a(tv2, f);
            }
            ew ew3 = (ew)el2.ae(13168);
            if (ew3 != null && ew3.fQ() > 0) {
                cit cit2 = (cit)lea.epC().get(cug.fuf);
                return cit2.a(tv2, f);
            }
        }
        return f;
    }

    public static float d(el el2) {
        if (!lcw.emW() || !lcw.emX()) {
            return 1.0f;
        }
        if (el2 != null) {
            eq eq2 = (eq)el2.ae(13136);
            if (eq2 != null && eq2.getBooleanValue()) {
                cir cir2 = (cir)lea.epC().get(cug.fug);
                return cir2.aPy();
            }
            ew ew2 = (ew)el2.ae(13152);
            if (ew2 != null && ew2.fQ() > 0) {
                ciu ciu2 = (ciu)lea.epC().get(cug.fue);
                return ciu2.aPy();
            }
            ew ew3 = (ew)el2.ae(13168);
            if (ew3 != null && ew3.fQ() > 0) {
                cit cit2 = (cit)lea.epC().get(cug.fuf);
                return cit2.aPy();
            }
        }
        return 1.0f;
    }

    public static float a(el el2, float f) {
        if (!lcw.emW() || !lcw.emX()) {
            return f;
        }
        if (el2 != null) {
            ew ew2 = (ew)el2.ae(13152);
            if (ew2 != null && ew2.fQ() > 0) {
                ciu ciu2 = (ciu)lea.epC().get(cug.fue);
                return ciu2.es(f);
            }
            ew ew3 = (ew)el2.ae(13168);
            if (ew3 != null && ew3.fQ() > 0) {
                cit cit2 = (cit)lea.epC().get(cug.fuf);
                return cit2.es(f);
            }
        }
        return f;
    }

    public static int d(el el2, int n) {
        ew ew2;
        if (!lcw.emW() || !lcw.emX()) {
            return n;
        }
        if (el2 != null && (ew2 = (ew)el2.ae(13152)) != null && ew2.fQ() > 0) {
            ciu ciu2 = (ciu)lea.epC().get(cug.fue);
            return ciu2.qG(n);
        }
        return n;
    }

    public static float b(el el2, float f) {
        if (!lcw.emW() || !lcw.emX()) {
            return f;
        }
        if (el2 != null) {
            ew ew2 = (ew)el2.ae(13152);
            if (ew2 != null && ew2.fQ() > 0) {
                ciu ciu2 = (ciu)lea.epC().get(cug.fue);
                return ciu2.et(f);
            }
            ew ew3 = (ew)el2.ae(13168);
            if (ew3 != null && ew3.fQ() > 0) {
                cit cit2 = (cit)lea.epC().get(cug.fuf);
                return cit2.et(f);
            }
        }
        return f;
    }

    public static float e(el el2) {
        if (!lcw.emW() || !lcw.emX()) {
            return 0.0f;
        }
        if (el2 != null) {
            eq eq2 = (eq)el2.ae(13136);
            if (eq2 != null && eq2.getBooleanValue()) {
                cir cir2 = (cir)lea.epC().get(cug.fug);
                return cir2.aPv();
            }
            ew ew2 = (ew)el2.ae(13152);
            if (ew2 != null && ew2.fQ() > 0) {
                ciu ciu2 = (ciu)lea.epC().get(cug.fue);
                return ciu2.aPv();
            }
        }
        return 0.0f;
    }

    public static float f(el el2) {
        ew ew2;
        if (!lcw.emW() || !lcw.emX()) {
            return 0.0f;
        }
        if (el2 != null && (ew2 = (ew)el2.ae(13168)) != null && ew2.fQ() > 0) {
            cit cit2 = (cit)lea.epC().get(cug.fuf);
            return cit2.aPA();
        }
        return 0.0f;
    }

    public static float g(el el2) {
        if (el2 != null) {
            eq eq2 = (eq)el2.ae(13136);
            if (eq2 != null && eq2.getBooleanValue()) {
                cir cir2 = (cir)lea.epC().get(cug.fug);
                return cir2.aPw();
            }
            ew ew2 = (ew)el2.ae(13168);
            if (ew2 != null && ew2.fQ() > 0) {
                cit cit2 = (cit)lea.epC().get(cug.fuf);
                return cit2.aPw();
            }
        }
        return 0.0f;
    }

    public static float h(el el2) {
        ew ew2;
        if (el2 != null && (ew2 = (ew)el2.ae(13168)) != null && ew2.fQ() > 0) {
            cit cit2 = (cit)lea.epC().get(cug.fuf);
            return cit2.aPB();
        }
        return 0.0f;
    }

    public static float i(el el2) {
        if (el2 != null) {
            eq eq2 = (eq)el2.ae(13136);
            if (eq2 != null && eq2.getBooleanValue()) {
                cir cir2 = (cir)lea.epC().get(cug.fug);
                return cir2.aPx();
            }
            ew ew2 = (ew)el2.ae(13168);
            if (ew2 != null && ew2.fQ() > 0) {
                cit cit2 = (cit)lea.epC().get(cug.fuf);
                return cit2.aPx();
            }
        }
        return 1.0f;
    }
}

