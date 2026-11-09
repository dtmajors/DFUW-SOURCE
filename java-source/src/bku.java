/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class bku
extends bke {
    public bku() {
        this.dsy = bkd.a.drG;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9231) {
            this.Vc();
            return;
        }
        fdb fdb2 = (fdb)fdo2;
        boolean bl2 = true;
        if (fdb2.aYG <= 0) {
            bl2 = false;
        } else if (fdb2.SpecialEffectType <= 0) {
            bl2 = false;
        } else if (fdb2.Magnitude == 0.0f) {
            bl2 = false;
        } else if (fdb2.dsD == null) {
            bl2 = false;
        } else if (fdb2.aZH == null) {
            bl2 = false;
        } else if (fdb2.iJL == null) {
            bl2 = false;
        }
        if (!bl2) {
            this.Vc();
            return;
        }
        ldv[] ldvArray = fdb2.iJL;
        int n2 = ldvArray.length;
        for (int i = 0; i < n2; ++i) {
            if (ldvArray[i] == null) continue;
            this.b(ldvArray[i], fdb2);
            this.a(ldvArray[i], fdb2);
        }
        this.Vc();
    }

    private void a(ldv ldv2, fdb fdb2) {
        fcw fcw2 = (fcw)this.MessageDelegator.h(9227, this.GUID, this.MessageDelegator.getGUID());
        fcw2.bst = bkd.dqy;
        fcw2.aZG = fdb2.aZG;
        fcw2.akX = ldv2;
        fcw2.aYF = fdb2.aYF;
        fcw2.bsG = fdb2.bsG;
        fcw2.aYC = fdb2.aYC;
        fcw2.Magnitude = fdb2.Magnitude;
        fcw2.eKm = 0.0;
        fcw2.aSp = 0.0f;
        fcw2.a(cxd.f.fQX);
        fcw2.aYH = 1;
        fcw2.aYG = fdb2.aYG;
        fcw2.bsE = 0;
        fcw2.bRD = 1;
        fcw2.gpI = -3.0;
        fcw2.aZH = fdb2.aZH;
        this.MessageDelegator.H(fcw2);
        if (fdb2.iJK <= 0) {
            return;
        }
        fcw2 = (fcw)this.MessageDelegator.h(9227, this.GUID, this.MessageDelegator.getGUID());
        fcw2.bst = bkd.dqy;
        fcw2.aZG = fdb2.aZG;
        fcw2.akX = ldv2;
        fcw2.aYF = fdb2.aYF;
        fcw2.bsG = fdb2.bsG;
        fcw2.aYC = fdb2.aYC;
        fcw2.Magnitude = fdb2.Magnitude;
        fcw2.eKm = 0.0;
        fcw2.aSp = 0.0f;
        fcw2.a(cxd.f.fQX);
        fcw2.aYH = 1;
        fcw2.aYG = fdb2.iJK;
        fcw2.bsE = 0;
        fcw2.bRD = 1;
        fcw2.gpI = -3.0;
        fcw2.aZH = fdb2.aZH;
        this.MessageDelegator.H(fcw2);
    }

    private void b(ldv ldv2, fdb fdb2) {
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, lcr.qEb);
        glh2.setSpecialEffectType(fdb2.SpecialEffectType);
        ljq ljq2 = new ljq(fdb2.aZH);
        ljq2.y -= 10.0f;
        glh2.setTargetPosition(ljq2);
        glh2.o(0.0);
        glh2.mj(true);
        glh2.my(null);
        glh2.setTargetObjectGUID(ldv2);
        glh2.JQ(2);
        glh2.setSourcePosition(fdb2.aZH);
        this.MessageDelegator.F(glh2);
    }
}

