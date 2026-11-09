/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  lcr
 */
public class ceo
extends btk {
    final cew baO;
    private ldv eqw;

    public ceo(cew cew2) {
        this.baO = cew2;
    }

    public void c(eq eq2) {
        if (eq2.getBooleanValue() && this.eqw == null) {
            this.pt(this.aLD());
        } else if (!eq2.getBooleanValue() && this.eqw != null) {
            this.aLE();
        }
    }

    private int aLD() {
        int n = cg.s(this.baO.az());
        switch (n) {
            case 1: 
            case 3: 
            case 5: {
                return del.gjm;
            }
        }
        return del.gjn;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.aLE();
    }

    private void pt(int n) {
        assert (this.eqw == null);
        if (this.baO.aAG() == null) {
            return;
        }
        this.eqw = this.MessageDelegator.lL(lcr.qEa);
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, lcr.qEa);
        glh2.SpecialEffectType = n;
        glh2.aUa = this.eqw;
        glh2.akX = this.baO.aAG().getGUID();
        glh2.aZD = this.baO.aAG().av();
        this.MessageDelegator.F(glh2);
    }

    private void aLE() {
        if (this.eqw == null) {
            return;
        }
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.GUID, lcr.qEa);
        glj2.jkV = 1;
        glj2.aUa = this.eqw;
        this.MessageDelegator.F(glj2);
        this.eqw = null;
    }
}

