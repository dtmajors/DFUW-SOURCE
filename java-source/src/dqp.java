/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  lcr
 */
import java.util.Map;

public class dqp {
    private int dUa = -1;
    private ldv[] dUb = null;
    private dqk gPe = null;
    private dxr MessageDelegator = null;
    private int dUe = -1;
    private int dUh = 0;
    private int dUj = 0;

    public void p(String string, int n) {
        eh eh2;
        this.dUh = 0;
        Map<String, eh> map = ei.ao(this.gPe.getMeshXML());
        if (map == null) {
            lfn.b(0, "SFWorldObjectDamageEffectManager", "setupKillEffects() NO attachpointmap for this: " + this.gPe.getMeshXML());
            assert (false);
            return;
        }
        String[] stringArray = ei.fg();
        this.dUj = ei.an(string);
        if (this.dUj < 0) {
            lfn.b(5, "SFWorldObjectDamageEffectManager", "setupKillEffects() Could not get start for this: " + this.gPe.getMeshXML());
            assert (false);
            return;
        }
        for (int i = 0; i < n && (eh2 = map.get(stringArray[this.dUj + i])) != null; ++i) {
            this.dUh = i + 1;
        }
        if (this.dUh > 0) {
            this.dUb = new ldv[this.dUh];
        }
    }

    public void cj(ljq ljq2) {
        lfn.b(0, "SFWorldObjectAnimatorEffectManager", "startAnimating() Starting the animationeffects: " + this.dUh);
        Map<String, eh> map = null;
        map = ei.ao(this.gPe.getMeshXML());
        assert (map != null);
        String[] stringArray = ei.fg();
        for (int i = 0; i < this.dUh; ++i) {
            eh eh2 = map.get(stringArray[this.dUj + i]);
            assert (eh2 != null);
            assert (this.dUe > 0);
            glh glh2 = (glh)this.MessageDelegator.h(13057, this.gPe.getGUID(), lcr.qEa);
            glh2.setSpecialEffectType(this.dUe);
            glh2.setSourceObjectGUID(null);
            glh2.setTargetObjectGUID(null);
            ljq ljq3 = new ljq(eh2.fb());
            ljq3.es(ljq2);
            glh2.setTargetPosition(ljq3);
            lfn.b(0, "SFWorldObjectAnimatorEffectManager", "startAnimating() Setting Up at this pos:" + eh2.fb());
            ldv ldv2 = this.MessageDelegator.lL(lcr.qzw);
            glh2.my(ldv2);
            this.MessageDelegator.F(glh2);
            this.dUb[i] = ldv2;
        }
    }

    public void cleanUp() {
        this.aAN();
    }

    private void aAN() {
        if (this.dUb == null) {
            return;
        }
        for (int i = 0; i < this.dUh; ++i) {
            assert (this.dUb != null);
            assert (this.dUb[i] != null);
            glj glj2 = (glj)this.MessageDelegator.h(13058, this.gPe.getGUID(), lcr.qEa);
            glj2.jkV = 1;
            glj2.aUa = this.dUb[i];
            this.MessageDelegator.F(glj2);
        }
        this.dUb = null;
    }

    public void be(ljq ljq2) {
        this.aAN();
        if (this.dUa <= 0) {
            return;
        }
        Map<String, eh> map = null;
        map = ei.ao(this.gPe.getMeshXML());
        assert (map != null);
        String[] stringArray = ei.fg();
        for (int i = 0; i < this.dUh; ++i) {
            eh eh2 = map.get(stringArray[this.dUj + i]);
            assert (eh2 != null);
            assert (this.dUa > 0);
            glh glh2 = (glh)this.MessageDelegator.h(13057, this.gPe.getGUID(), lcr.qEa);
            glh2.setSpecialEffectType(this.dUa);
            glh2.setSourceObjectGUID(null);
            glh2.setTargetObjectGUID(null);
            ljq ljq3 = new ljq(eh2.fb());
            ljq3.es(ljq2);
            glh2.setTargetPosition(ljq3);
            this.MessageDelegator.F(glh2);
        }
    }

    public int aAQ() {
        return this.dUe;
    }

    public void no(int n) {
        this.dUe = n;
    }

    public dxr getMessageDelegator() {
        return this.MessageDelegator;
    }

    public void setMessageDelegator(dxr dxr2) {
        this.MessageDelegator = dxr2;
    }

    public int aAR() {
        return this.dUa;
    }

    public void np(int n) {
        this.dUa = n;
    }

    public dqk buo() {
        return this.gPe;
    }

    public void b(dqk dqk2) {
        this.gPe = dqk2;
    }
}

