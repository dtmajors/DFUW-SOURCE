/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  lcr
 */
public class cpp
extends cpo {
    private static final String emX = "se_mount_watersplash";
    private static final String emY = "se_mount_watersplash";
    private static final String emZ = "se_mount_watersplash";
    private static final String ena = "se_mount_watersplash";
    private static final String enb = "se_mount_landimpact";

    public cpp(cpe cpe2) {
        super((cbx)cpe2);
        cpp.initialize();
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
        if (f2 < 1.0f) {
            return 0.0f;
        }
        float f6 = Math.abs(f3);
        if (f6 < 15.0f) {
            return 0.0f;
        }
        float f7 = 729.0f;
        float f8 = lew.A((float)Math.pow(f6, 2.0) / f7, 0.0f, 1.0f);
        return f8 *= 150.0f;
    }

    @Override
    protected void pf(int n) {
        assert (n > 0);
        assert (this.Qg instanceof cpe);
        ldv ldv2 = lcr.qEa;
        ldv ldv3 = null;
        cpe cpe2 = (cpe)this.Qg;
        if (cpe2.isServerObject()) {
            ldv2 = lcr.qEb;
            ldv3 = cpe2.aXq();
        }
        glh glh2 = (glh)cpe2.getMessageDelegator().h(13057, cpe2.getGUID(), ldv2);
        glh2.SpecialEffectType = n;
        glh2.akX = cpe2.aAG().getGUID();
        glh2.aZD = cpe2.aAG().av();
        glh2.gfs = ldv3;
        cpe2.getMessageDelegator().F(glh2);
    }
}

