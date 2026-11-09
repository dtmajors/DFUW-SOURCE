/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  lcr
 */
public class cen
extends btk {
    private final cew baO;
    private ldv eqv = null;

    public cen(cew cew2) {
        this.baO = cew2;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.aLC();
    }

    public void b(eq eq2) {
        if (eq2.getBooleanValue() && this.eqv == null) {
            this.ps(del.gjM);
        } else if (!eq2.getBooleanValue() && this.eqv != null) {
            this.aLC();
        }
    }

    private void ps(int n) {
        assert (this.eqv == null);
        if (this.baO.aAG() == null) {
            return;
        }
        this.eqv = this.MessageDelegator.lL(lcr.qEa);
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, lcr.qEa);
        glh2.SpecialEffectType = n;
        glh2.aUa = this.eqv;
        glh2.akX = this.baO.aAG().getGUID();
        glh2.aZD = this.baO.aAG().av();
        this.MessageDelegator.F(glh2);
    }

    private void aLC() {
        if (this.eqv == null) {
            return;
        }
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.GUID, lcr.qEa);
        glj2.jkV = 1;
        glj2.aUa = this.eqv;
        this.MessageDelegator.F(glj2);
        this.eqv = null;
    }
}

