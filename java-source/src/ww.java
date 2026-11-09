/*
 * Decompiled with CFR.
 */
public class ww {
    public int SpecialEffectType = 0;
    public ldv akX = null;
    public ljq aZD = null;
    public float aZE = 0.0f;
    public int aZF = 0;
    public ldv aZG = null;
    public ljq aZH = null;
    public wt aZI = null;
    public short aZJ = 0;
    public short aZK = 0;
    public short aZL = 0;
    public boolean aZM = false;

    public static ww a(dek dek2) {
        ww ww2 = new ww();
        ww2.SpecialEffectType = dek2.SpecialEffectType;
        ww2.akX = dek2.akX;
        ww2.aZD = dek2.aZD;
        ww2.aZE = (float)dek2.oV;
        ww2.aZF = dek2.aZF;
        ww2.aZG = dek2.aZG;
        ww2.aZH = dek2.aZH;
        ww2.aZI = wt.c(dek2.gfq);
        ww2.aZJ = lbc.mV(dek2.doT);
        ww2.aZK = lbc.mV(dek2.biu);
        ww2.aZL = lbc.mV(dek2.gfr);
        ww2.aZM = dek2.aZM;
        return ww2;
    }

    public static dek a(ww ww2) {
        dek dek2 = new dek();
        dek2.SpecialEffectType = ww2.SpecialEffectType;
        dek2.akX = ww2.akX;
        dek2.aZD = ww2.aZD;
        dek2.oV = ww2.aZE;
        dek2.aZF = ww2.aZF;
        dek2.aZG = ww2.aZG;
        dek2.aZH = ww2.aZH;
        dek2.gfq = wt.a(ww2.aZI);
        dek2.doT = lbc.j(ww2.aZJ);
        dek2.biu = lbc.j(ww2.aZK);
        dek2.gfr = lbc.j(ww2.aZL);
        dek2.aZM = ww2.aZM;
        return dek2;
    }

    public static boolean a(ww ww2, dek dek2) {
        if (ww2.SpecialEffectType != dek2.SpecialEffectType) {
            return false;
        }
        if (!ww.k(ww2.akX, dek2.akX)) {
            return false;
        }
        if (!ww2.aZD.equals(dek2.aZD)) {
            return false;
        }
        if (Math.abs(ww2.aZE - (float)dek2.oV) > 0.001f) {
            return false;
        }
        if (!ww.k(ww2.aZG, dek2.aZG)) {
            return false;
        }
        if (!ww2.aZH.equals(dek2.aZH)) {
            return false;
        }
        if (!wt.a(dek2.gfq, ww2.aZI)) {
            return false;
        }
        if (Math.abs(dek2.doT - lbc.j(ww2.aZJ)) > 0.01f) {
            return false;
        }
        if (Math.abs(dek2.biu - lbc.j(ww2.aZK)) > 0.01f) {
            return false;
        }
        if (Math.abs(dek2.gfr - lbc.j(ww2.aZL)) > 0.01f) {
            return false;
        }
        return ww2.aZM == dek2.aZM;
    }

    private static boolean k(ldv ldv2, ldv ldv3) {
        if (ldv2 == null != (ldv3 == null)) {
            return false;
        }
        if (ldv2 == null) {
            return true;
        }
        return ldv2.equals(ldv3);
    }
}

