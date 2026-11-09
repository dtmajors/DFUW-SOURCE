/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  lcr
 */
public class cpn
extends cpo {
    private static final String emX = "se_mount_watersplash";
    private static final String emY = "se_mount_watersplash";
    private static final String emZ = "se_mount_watersplash";
    private static final String ena = "se_mount_watersplash";
    private static final String enb = "se_mount_landimpact";
    private static final float eTY = 5.0f;
    private static final float eTZ = 0.01f;
    private static final float eUa = 0.1f;

    public cpn(cpa cpa2) {
        super((cbx)cpa2);
        cpn.initialize();
    }

    private static void initialize() {
        int n;
        if (Initialized) {
            return;
        }
        for (n = 1; n < 6; ++n) {
            eUb.add(del.dr("se_mount_watersplash" + n));
            eUc.add(del.dr("se_mount_watersplash" + n));
            eUd.add(del.dr("se_mount_watersplash" + n));
            eUe.add(del.dr("se_mount_watersplash" + n));
        }
        for (n = 1; n < 6; ++n) {
            eUf.add(del.dr(enb + n));
        }
        Initialized = true;
    }

    @Override
    public final float a(float f2, float f3, int[] nArray, float f4, float f5) {
        if (f4 <= 5.0f) {
            return 0.0f;
        }
        int n = this.A(f2, f3);
        if (n < 3) {
            return 0.0f;
        }
        float f6 = 0.0f;
        f6 = n < 4 ? f5 * 0.01f : f5 * 0.1f;
        if (f4 - f6 <= 5.0f) {
            f6 = f4 - 5.0f;
        }
        return f6;
    }

    @Override
    protected void pf(int n) {
        assert (n > 0);
        assert (this.Qg instanceof cpa);
        ldv ldv2 = lcr.qEa;
        ldv ldv3 = null;
        cpa cpa2 = (cpa)this.Qg;
        if (cpa2.isServerObject()) {
            ldv2 = lcr.qEb;
            ldv3 = cpa2.aXq();
        }
        glh glh2 = (glh)cpa2.getMessageDelegator().h(13057, cpa2.getGUID(), ldv2);
        glh2.SpecialEffectType = n;
        glh2.akX = cpa2.aAG().getGUID();
        glh2.aZD = cpa2.aAG().av();
        glh2.gfs = ldv3;
        cpa2.getMessageDelegator().F(glh2);
    }
}

