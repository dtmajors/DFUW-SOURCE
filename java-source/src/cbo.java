/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  lcr
 */
public class cbo {
    private final cbx Qg;
    private boolean ejS = true;
    private ldv ejT = null;

    public cbo(cbx cbx2) {
        assert (cbx2 != null);
        this.Qg = cbx2;
    }

    public void cleanUp() {
        this.aHU();
    }

    public void m(ej ej2) {
        if (ej2.getType() != 1280) {
            return;
        }
        eq eq2 = (eq)ej2;
        this.setActive(eq2.getBooleanValue());
    }

    private void setActive(boolean bl) {
        if (bl) {
            if (!this.ejS) {
                this.aHS();
            }
            this.aHU();
        }
        if (!bl) {
            if (this.ejS) {
                this.aHR();
            }
            this.aHT();
        }
        this.ejS = bl;
    }

    private ldv b(int n, ljq ljq2, ldv ldv2) {
        ldv ldv3 = this.Qg.getMessageDelegator().lL(lcr.qzw);
        glh glh2 = (glh)this.Qg.getMessageDelegator().h(13057, this.Qg.getGUID(), lcr.qEa);
        glh2.setSpecialEffectType(n);
        glh2.o(0.0);
        glh2.setTargetPosition(ljq2);
        glh2.setTargetObjectGUID(ldv2);
        glh2.my(ldv3);
        glh2.mj(true);
        glh2.setPower(0.0f);
        this.Qg.getMessageDelegator().F(glh2);
        return ldv3;
    }

    private void aHR() {
        if (this.Qg.aAG() == null) {
            return;
        }
        this.b(del.giN, this.Qg.aAG().av(), this.Qg.aAG().getGUID());
    }

    private void aHS() {
        if (this.Qg.aAG() == null) {
            return;
        }
        this.b(del.giO, this.Qg.aAG().av(), this.Qg.aAG().getGUID());
    }

    private void aHT() {
        if (this.ejT != null) {
            return;
        }
        if (this.Qg.aAG() == null) {
            return;
        }
        this.ejT = this.b(del.giP, this.Qg.aAG().av(), this.Qg.aAG().getGUID());
    }

    private void aHU() {
        if (this.ejT == null) {
            return;
        }
        glj glj2 = (glj)this.Qg.getMessageDelegator().h(13058, this.Qg.getGUID(), lcr.qEa);
        glj2.jkV = 1;
        glj2.aUa = this.ejT;
        this.Qg.getMessageDelegator().F(glj2);
        this.ejT = null;
    }
}

