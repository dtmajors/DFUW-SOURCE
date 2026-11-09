/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cdb
 *  cex
 *  lcr
 */
public class cdc
extends cpo {
    private static final String emX = "se_pe_watersplash";
    private static final String emY = "se_pe_watersplash";
    private static final String emZ = "se_pe_watersplash";
    private static final String ena = "se_pe_watersplash";
    private static final String enb = "se_pe_landimpact";

    public cdc(cdb cdb2) {
        super((cbx)cdb2);
        cdc.initialize();
    }

    private static void initialize() {
        int n;
        if (Initialized) {
            return;
        }
        for (n = 1; n < 6; ++n) {
            eUb.add(del.dr("se_pe_watersplash" + n));
            eUc.add(del.dr("se_pe_watersplash" + n));
            eUd.add(del.dr("se_pe_watersplash" + n));
            eUe.add(del.dr("se_pe_watersplash" + n));
        }
        for (n = 1; n < 6; ++n) {
            eUf.add(del.dr(enb + n));
        }
        Initialized = true;
    }

    @Override
    public final float a(float f2, float f3, int[] nArray, float f4, float f5) {
        float f6 = Math.abs(f3);
        if (f6 < 0.01f) {
            return 0.0f;
        }
        float f7 = 625.0f;
        float f8 = lew.A((float)Math.pow(f6, 2.0) / f7, 0.0f, 1.0f);
        f8 *= 150.0f;
        if (this.Qg.UB()) {
            f8 = cer.a((cex)this.Qg, f8);
        }
        return f8;
    }

    @Override
    protected void pf(int n) {
        if (this.Qg.aAG() == null) {
            return;
        }
        assert (n > 0);
        ldv ldv2 = lcr.qEa;
        ldv ldv3 = null;
        if (this.Qg.isServerObject()) {
            ldv2 = lcr.qEb;
            ldv3 = ((cdb)this.Qg).aJP().hk();
        }
        glh glh2 = (glh)this.Qg.getMessageDelegator().h(13057, this.Qg.getGUID(), ldv2);
        glh2.SpecialEffectType = n;
        glh2.akX = this.Qg.aAG().getGUID();
        glh2.aZD = this.Qg.aAG().av();
        glh2.gfs = ldv3;
        this.Qg.getMessageDelegator().F(glh2);
    }
}

