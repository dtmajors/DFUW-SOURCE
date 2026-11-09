/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class cmi
extends cmh
implements bto {
    protected boolean avz = false;
    protected boolean eKW = false;
    protected boolean eKX = true;
    private static final String TC = "SFRelicAltarClient";
    private ldv eKG = null;
    private ldv ejT = null;
    private boolean eKY = false;
    private boolean eKZ = false;

    public void c(ew ew2, int n) {
        int n2 = ew2.getType();
        switch (n2) {
            case 13696: {
                this.abO = ew2.fQ();
                break;
            }
            default: {
                super.c(ew2, n);
                return;
            }
        }
        this.aTg();
    }

    public void b(eq eq2, boolean bl) {
        int n = eq2.getType();
        switch (n) {
            case 1280: {
                this.avz = eq2.getBooleanValue();
                break;
            }
            case 12432: {
                this.eKW = eq2.getBooleanValue();
                break;
            }
            case 5552: {
                this.eKX = eq2.getBooleanValue();
                break;
            }
            default: {
                super.b(eq2, bl);
                return;
            }
        }
        this.aTg();
    }

    private void aTg() {
        this.uZ();
        this.uY();
    }

    private void uZ() {
        if (this.ejT != null) {
            glj glj2 = (glj)this.MessageDelegator.h(13058, this.getGUID(), lcr.qEa);
            glj2.aUa = this.ejT;
            glj2.jkV = 1;
            this.MessageDelegator.F(glj2);
            this.ejT = null;
            return;
        }
        if (this.eKG != null) {
            glj glj3 = (glj)this.MessageDelegator.h(13058, this.getGUID(), lcr.qEa);
            glj3.aUa = this.eKG;
            glj3.jkV = 1;
            this.MessageDelegator.F(glj3);
            this.eKG = null;
            return;
        }
    }

    private void uY() {
        if (this.aAG() == null) {
            this.eKY = true;
            return;
        }
        if (this.abO == -1) {
            return;
        }
        if (!this.eKX) {
            return;
        }
        ayc.a a2 = lea.epQ().iK(this.abO);
        if (a2 == null) {
            assert (false) : "RelicID : " + this.abO;
            return;
        }
        if (this.avz) {
            if (this.eKG != null) {
                return;
            }
            this.eKG = this.MessageDelegator.lL(lcr.qEa);
        } else {
            if (this.ejT != null) {
                return;
            }
            this.ejT = this.MessageDelegator.lL(lcr.qEa);
        }
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEa);
        glh2.SpecialEffectType = this.avz ? a2.ZF() : a2.ZG();
        glh2.aUa = this.avz ? this.eKG : this.ejT;
        glh2.akX = this.aAG().getGUID();
        glh2.aZD = this.aAG().av();
        this.MessageDelegator.F(glh2);
    }

    public cmi() {
        super(false);
    }

    public void initialize() {
        super.initialize();
        this.aTh();
        this.aTg();
    }

    private void aTh() {
        if (this.aIj() == null) {
            this.eKZ = true;
            return;
        }
        this.avz = this.aIj().ag(1280);
        this.eKW = this.aIj().ag(12432);
        this.abO = this.aIj().ap(13696);
        this.eKX = this.aIj().ag(5552);
    }

    public void cleanUp() {
        ldv ldv2;
        ldv ldv3 = ldv2 = this.ejT != null ? this.ejT : this.eKG;
        if (ldv2 != null) {
            glj glj2 = (glj)this.MessageDelegator.h(13058, this.getGUID(), lcr.qEa);
            glj2.aUa = ldv2;
            glj2.jkV = 1;
            this.MessageDelegator.F(glj2);
        }
        this.ejT = null;
        this.eKG = null;
        super.cleanUp();
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.eKY) {
            this.eKY = false;
            this.aTg();
        }
        if (this.eKZ) {
            this.eKZ = false;
            this.aTh();
        }
    }
}

