/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;

public class bwb {
    private int dUa = -1;
    private ldv[] dUb = null;
    private ldv[] dUc = null;
    private ldv dUd = null;
    private bvd Uk = null;
    private dxr MessageDelegator = null;
    private int dUe = -1;
    private int dUf = -1;
    private int dUg = -1;
    private int dUh = 0;
    private int dUi = 0;
    private int dUj = 0;
    private int dUk = 0;

    public bvd aAG() {
        return this.Uk;
    }

    public void d(bvd bvd2) {
        this.Uk = bvd2;
    }

    public void k(String string, int n) {
        this.dUi = 0;
        if (string != null && n > 0) {
            this.dUk = ei.an(string);
            this.dUi = ei.a(this.Uk.getFileName(), string, n, this.dUk);
            if (this.dUi > 0) {
                this.dUc = new ldv[this.dUi];
            }
        }
    }

    public void l(String string, int n) {
        assert (string != null);
        this.dUh = 0;
        this.dUj = ei.an(string);
        if (this.dUj < 0) {
            lfn.b(5, "SFMeshObjectAnimatorEffectManager", "setupKillEffects() Could not get start for this: " + this.Uk.getFileName());
            assert (false);
            return;
        }
        this.dUh = ei.a(this.Uk.getFileName(), string, n, this.dUj);
        if (this.dUh > 0) {
            this.dUb = new ldv[this.dUh];
        }
    }

    public void i(ljq ljq2, lgl lgl2) {
        ldv ldv2;
        ljq ljq3;
        glh glh2;
        Comparable comparable;
        int n;
        lfn.b(0, "SFMeshObjectAnimatorEffectManager", "startAnimating() Starting the animationeffects: " + this.dUh);
        Map<String, eh> map = null;
        map = ei.ao(this.Uk.getFileName());
        if (map == null) {
            return;
        }
        String[] stringArray = ei.fg();
        for (n = 0; n < this.dUh; ++n) {
            comparable = map.get(stringArray[this.dUj + n]);
            assert (comparable != null);
            assert (this.dUe > 0);
            glh2 = (glh)this.MessageDelegator.h(13057, this.Uk.getGUID(), lcr.qEa);
            glh2.setSpecialEffectType(this.dUe);
            glh2.setSourceObjectGUID(null);
            glh2.setTargetObjectGUID(null);
            ljq3 = new ljq(((eh)comparable).fb());
            ljq3 = lgl2.eq(ljq3);
            ljq3.es(ljq2);
            glh2.setTargetPosition(ljq3);
            ldv2 = this.MessageDelegator.lL(lcr.qzw);
            glh2.my(ldv2);
            this.MessageDelegator.F(glh2);
            this.dUb[n] = ldv2;
        }
        for (n = 0; n < this.dUi; ++n) {
            comparable = map.get(stringArray[this.dUk + n]);
            assert (comparable != null);
            assert (this.dUf > 0);
            glh2 = (glh)this.MessageDelegator.h(13057, this.Uk.getGUID(), lcr.qEa);
            glh2.setSpecialEffectType(this.dUf);
            glh2.setSourceObjectGUID(null);
            glh2.setTargetObjectGUID(null);
            ljq3 = new ljq(((eh)comparable).fb());
            ljq3 = lgl2.eq(ljq3);
            ljq3.es(ljq2);
            glh2.setTargetPosition(ljq3);
            ldv2 = this.MessageDelegator.lL(lcr.qzw);
            glh2.my(ldv2);
            this.MessageDelegator.F(glh2);
            this.dUc[n] = ldv2;
        }
        assert (this.dUg > 0);
        glh glh3 = (glh)this.MessageDelegator.h(13057, this.Uk.getGUID(), lcr.qEa);
        glh3.setSpecialEffectType(this.dUg);
        glh3.setSourceObjectGUID(null);
        glh3.setTargetObjectGUID(null);
        glh3.setTargetPosition(new ljq(ljq2));
        comparable = this.MessageDelegator.lL(lcr.qzw);
        glh3.my((ldv)comparable);
        this.MessageDelegator.F(glh3);
        this.dUd = comparable;
    }

    public void cleanUp() {
        this.aAN();
        this.aAO();
        this.aAP();
    }

    private void aAN() {
        if (this.dUb == null) {
            return;
        }
        for (int i = 0; i < this.dUh; ++i) {
            assert (this.dUb != null);
            if (this.dUb[i] == null) continue;
            glj glj2 = (glj)this.MessageDelegator.h(13058, this.Uk.getGUID(), lcr.qEa);
            glj2.jkV = 1;
            glj2.aUa = this.dUb[i];
            this.MessageDelegator.F(glj2);
        }
        this.dUb = null;
    }

    private void aAO() {
        if (this.dUc == null) {
            return;
        }
        for (int i = 0; i < this.dUi; ++i) {
            assert (this.dUc != null);
            if (this.dUc[i] == null) continue;
            glj glj2 = (glj)this.MessageDelegator.h(13058, this.Uk.getGUID(), lcr.qEa);
            glj2.jkV = 1;
            glj2.aUa = this.dUc[i];
            this.MessageDelegator.F(glj2);
        }
        this.dUc = null;
    }

    private void aAP() {
        if (this.dUd == null) {
            return;
        }
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.Uk.getGUID(), lcr.qEa);
        glj2.jkV = 1;
        glj2.aUa = this.dUd;
        this.MessageDelegator.F(glj2);
        this.dUd = null;
    }

    public void be(ljq ljq2) {
        this.aAN();
        this.aAO();
        this.aAP();
        if (this.dUa <= 0) {
            return;
        }
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.Uk.getGUID(), lcr.qEa);
        glh2.setSpecialEffectType(this.dUa);
        glh2.setSourceObjectGUID(null);
        glh2.setTargetObjectGUID(null);
        glh2.setTargetPosition(new ljq(ljq2));
        this.MessageDelegator.F(glh2);
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

    public int aAS() {
        return this.dUg;
    }

    public void nq(int n) {
        this.dUg = n;
    }

    public int aAT() {
        return this.dUf;
    }

    public void nr(int n) {
        this.dUf = n;
    }
}

