/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class der
extends btk {
    private Map<ldv, det> gna = lcn.emw();
    private static Map<Integer, det> gmH = lea.eod();

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13057: {
                this.a((glh)dxq2);
                break;
            }
            case 13058: {
                this.a((glj)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private dek a(det det2, glh glh2) {
        assert (det2 != null);
        assert (glh2 != null);
        dek dek2 = new dek();
        dek2.SpecialEffectType = det2.SpecialEffectType;
        dek2.doT = det2.doT;
        if (det2.gnd) {
            if (glh2.getTargetObjectGUID() != null) {
                return null;
            }
            dek2.akX = this.MessageDelegator.bzv();
        } else {
            if (glh2.getTargetObjectGUID() == null) {
                return null;
            }
            dek2.akX = glh2.getTargetObjectGUID();
        }
        if (glh2.getTargetPosition() == null) {
            return null;
        }
        dek2.aZD = glh2.getTargetPosition();
        dek2.oV = this.MessageDelegator.arc().rgz;
        if (glh2.bVL() > 0) {
            int n2;
            dek2.aZF = n2 = glh2.bVL();
            if ((n2 & 1) > 0) {
                if (glh2.getSourceObjectGUID() == null) {
                    return null;
                }
                dek2.aZG = glh2.getSourceObjectGUID();
            }
            if ((n2 & 2) > 0) {
                if (glh2.getSourcePosition() == null) {
                    return null;
                }
                dek2.aZH = glh2.getSourcePosition();
            }
            if ((n2 & 4) > 0) {
                if (glh2.getSourceRotation() == null) {
                    return null;
                }
                dek2.gfq = new lgl(glh2.getSourceRotation());
            }
            if ((n2 & 8) > 0) {
                if ((double)glh2.getDuration() <= 0.0 && glh2.getDuration() != -2.0f) {
                    return null;
                }
                dek2.doT = glh2.getDuration();
            }
            if ((n2 & 0x10) > 0) {
                if (glh2.getPower() <= 0.0f || glh2.getPower() > 1.0f) {
                    return null;
                }
                if (glh2.getPowerRadius() < 0.0f || glh2.getPowerRadius() > 30.0f) {
                    return null;
                }
                dek2.biu = glh2.getPower();
                dek2.gfr = glh2.getPowerRadius();
            }
            if ((n2 & 0x20) > 0) {
                dek2.aZM = true;
            }
        }
        return dek2;
    }

    private void a(glh glh2) {
        boolean bl;
        det det2 = gmH.get(glh2.SpecialEffectType);
        if (det2 == null) {
            return;
        }
        dek dek2 = this.a(det2, glh2);
        if (dek2 == null) {
            return;
        }
        ldv ldv2 = null;
        if (glh2.aUa != null) {
            if (!glh2.aUa.tV(this.GUID)) {
                return;
            }
            ldv2 = glh2.aUa;
        } else {
            ldv2 = this.MessageDelegator.bzv();
        }
        if (glh2.bVM() != null) {
            dek2.gfs = glh2.bVM();
        }
        boolean bl2 = bl = dek2.doT == -2.0f;
        if (bl) {
            Cloneable cloneable;
            det det3 = det2.bla();
            det3.GUID = ldv2;
            det3.blr = dek2;
            this.gna.put(det3.GUID, det3);
            if (dek2.aZM) {
                cloneable = lcr.ak((ldv)lcr.qAI, (int)65534);
                gkz gkz2 = (gkz)this.MessageDelegator.h(13063, this.GUID, (ldv)cloneable);
                gkz2.aUa = ldv2;
                gkz2.jkO = dek2;
                this.MessageDelegator.F(gkz2);
                gkz2 = (gkz)this.MessageDelegator.h(13063, this.GUID, lcr.qAI);
                gkz2.aUa = ldv2;
                gkz2.jkO = dek2;
                this.MessageDelegator.F(gkz2);
            } else {
                cloneable = lcr.ak((ldv)lcr.qAI, (int)dek2.akX.ib());
                gkz gkz3 = (gkz)this.MessageDelegator.h(13063, this.GUID, (ldv)cloneable);
                gkz3.aUa = ldv2;
                gkz3.jkO = dek2;
                this.MessageDelegator.F(gkz3);
            }
            if (glh2.bVK()) {
                cloneable = (glb)this.MessageDelegator.h(13059, this.GUID, glh2.aO());
                this.MessageDelegator.b(glh2, (dxq)cloneable);
                ((glb)cloneable).aUa = det3.GUID;
                if (det3.gnd) {
                    ((glb)cloneable).gxp = det3.blr.akX;
                }
                this.MessageDelegator.F((dxq)cloneable);
            }
        } else if (dek2.aZM || this.GUID.tV(dek2.akX)) {
            ldv ldv3 = lcr.ak((ldv)lcr.qAR, (int)65534);
            glf glf2 = (glf)this.MessageDelegator.h(13060, this.GUID, ldv3);
            glf2.aUa = ldv2;
            glf2.jkO = dek2;
            this.MessageDelegator.F(glf2);
            glf2 = (glf)this.MessageDelegator.h(13060, this.GUID, lcr.qAR);
            glf2.aUa = ldv2;
            glf2.jkO = dek2;
            this.MessageDelegator.F(glf2);
            this.MessageDelegator.oa(ldv2);
        } else {
            if (dek2.akX != null) {
                ldv ldv4 = lcr.ak((ldv)lcr.qAJ, (int)dek2.akX.ib());
                glg glg2 = (glg)this.MessageDelegator.h(13061, this.GUID, ldv4);
                glg2.aUa = ldv2;
                glg2.jkO = dek2;
                this.MessageDelegator.F(glg2);
            }
            this.MessageDelegator.oa(ldv2);
        }
    }

    private void a(glj glj2) {
        switch (glj2.jkV) {
            case 1: {
                this.jW(glj2.aUa);
                break;
            }
            case 2: {
                for (det det2 : this.gna.values()) {
                    this.MessageDelegator.hd(det2.GUID);
                }
                this.gna.clear();
                break;
            }
            default: {
                return;
            }
        }
    }

    private void jW(ldv ldv2) {
        if (ldv2 == null) {
            return;
        }
        det det2 = this.gna.remove(ldv2);
        if (det2 == null) {
            return;
        }
        if (det2.blr.aZM) {
            ldv ldv3 = lcr.ak((ldv)lcr.qAI, (int)65534);
            gle gle2 = (gle)this.MessageDelegator.h(13064, this.GUID, ldv3);
            gle2.aUa = ldv2;
            this.MessageDelegator.F(gle2);
            gle2 = (gle)this.MessageDelegator.h(13064, this.GUID, lcr.qAI);
            gle2.aUa = ldv2;
            this.MessageDelegator.F(gle2);
        } else {
            ldv ldv4 = lcr.ak((ldv)lcr.qAI, (int)det2.blr.akX.ib());
            gle gle3 = (gle)this.MessageDelegator.h(13064, this.GUID, ldv4);
            gle3.aUa = ldv2;
            this.MessageDelegator.F(gle3);
        }
    }
}

