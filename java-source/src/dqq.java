/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  lcr
 */
import java.util.List;
import java.util.Map;

public class dqq {
    private int dUl = 0;
    private int dUm = 0;
    private int dUn = 0;
    private ldv[] dUo = null;
    private List<Integer> gPf = null;
    private boolean dUq = false;
    private dqk gPe = null;
    private dxr MessageDelegator = null;
    private boolean dUr = false;
    private int dUs = -1;
    private int dUt = 0;
    private int dUu = 0;

    public void e(String string, int n, int n2) {
        eh eh2;
        assert (this.gPe != null);
        this.dUu = 0;
        this.dUs = n2;
        if (this.dUs <= 0) {
            return;
        }
        assert (this.dUs > 0);
        this.dUr = true;
        Map<String, eh> map = ei.ao(this.gPe.getMeshXML());
        if (map == null) {
            this.dUu = 0;
            return;
        }
        String[] stringArray = ei.fg();
        this.dUt = ei.an(string);
        if (this.dUt < 0) {
            this.dUu = 0;
            return;
        }
        for (int i = 0; i < n && (eh2 = map.get(stringArray[this.dUt + i])) != null; ++i) {
            this.dUu = i + 1;
        }
    }

    public void b(String string, int n, List<Integer> list) {
        eh eh2;
        assert (this.gPe != null);
        this.gPf = list;
        this.dUm = 0;
        Map<String, eh> map = ei.ao(this.gPe.getMeshXML());
        if (map == null) {
            this.dUm = 0;
            return;
        }
        String[] stringArray = ei.fg();
        this.dUn = ei.an(string);
        if (this.dUn < 0) {
            this.dUm = 0;
            return;
        }
        for (int i = 0; i < n && (eh2 = map.get(stringArray[this.dUn + i])) != null; ++i) {
            this.dUm = i + 1;
        }
    }

    private int dr(float f2) {
        if (this.gPf == null) {
            return -1;
        }
        if (this.gPf.size() == 0) {
            return -1;
        }
        if (this.dUq) {
            int n = (int)((float)this.gPf.size() * f2);
            return this.gPf.get(n);
        }
        return this.gPf.get(0);
    }

    public void b(et et2, float f2) {
        float f3 = et2.fN();
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > f2) {
            f3 = f2;
        }
        float f4 = f3 / f2;
        float f5 = 1.0f - f4;
        float f6 = this.dUm;
        int n = (int)(f6 * f5);
        int n2 = this.dUl;
        if (n > this.dUm) {
            n = this.dUm;
        }
        if (n2 == n) {
            return;
        }
        int n3 = 0;
        int n4 = 0;
        boolean bl = true;
        if (n > n2) {
            n3 = n - n2;
            n4 = n2 + n3;
            assert (n4 <= this.dUm);
        } else {
            n3 = n2 - n;
            n4 = n2 - n3;
            assert (n4 >= 0);
            bl = false;
        }
        assert (n3 != 0);
        if (bl) {
            int n5 = 0;
            for (int i = this.dUl; i < n4; ++i) {
                ++n5;
                this.p(i, f4);
            }
            this.dUl += n5;
        } else {
            int n6 = 0;
            for (int i = this.dUl; i > 0 && i > n4; --i) {
                ++n6;
                this.ns(i - 1);
            }
            this.dUl -= n6;
        }
    }

    private void p(int n, float f2) {
        ldv ldv2 = this.MessageDelegator.lL(lcr.qzw);
        if (this.dUo == null) {
            this.dUo = new ldv[this.dUm];
            for (int i = 0; i < this.dUm; ++i) {
                this.dUo[i] = null;
            }
        }
        ldv ldv3 = null;
        Map<String, eh> map = null;
        ldv3 = this.gPe.getGUID();
        map = ei.ao(this.gPe.getMeshXML());
        this.dUo[n] = ldv2;
        assert (map != null);
        assert (ldv3 != null);
        String[] stringArray = ei.fg();
        int n2 = this.dUn;
        eh eh2 = map.get(stringArray[n2 + n]);
        assert (eh2 != null);
        int n3 = this.dr(f2);
        assert (n3 > 0);
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.gPe.getGUID(), lcr.qEa);
        glh2.setSpecialEffectType(n3);
        glh2.setSourceObjectGUID(null);
        glh2.setTargetObjectGUID(ldv3);
        ljq ljq2 = new ljq(eh2.fb());
        glh2.setTargetPosition(ljq2);
        glh2.my(ldv2);
        this.MessageDelegator.F(glh2);
    }

    private void ns(int n) {
        assert (this.dUo != null);
        ldv ldv2 = null;
        ldv2 = this.dUo[n];
        assert (ldv2 != null);
        this.dUo[n] = null;
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.gPe.getGUID(), lcr.qEa);
        glj2.jkV = 1;
        glj2.aUa = ldv2;
        this.MessageDelegator.F(glj2);
    }

    public void kill() {
        if (!this.dUr) {
            return;
        }
        Map<String, eh> map = null;
        map = ei.ao(this.gPe.getMeshXML());
        assert (map != null);
        String[] stringArray = ei.fg();
        for (int i = 0; i < this.dUu; ++i) {
            eh eh2 = map.get(stringArray[this.dUt + i]);
            assert (eh2 != null);
            assert (this.dUs > 0);
            glh glh2 = (glh)this.MessageDelegator.h(13057, this.gPe.getGUID(), lcr.qEa);
            glh2.setSpecialEffectType(this.dUs);
            glh2.setSourceObjectGUID(null);
            glh2.setTargetObjectGUID(null);
            ljq ljq2 = new ljq(eh2.fb());
            ljq2.es(this.gPe.azb());
            glh2.setTargetPosition(ljq2);
            this.MessageDelegator.F(glh2);
        }
    }

    public void cleanUp() {
        if (this.dUo != null) {
            for (int i = 0; i < this.dUo.length; ++i) {
                if (this.dUo[i] == null) continue;
                glj glj2 = (glj)this.MessageDelegator.h(13058, this.gPe.getGUID(), lcr.qEa);
                glj2.jkV = 1;
                glj2.aUa = this.dUo[i];
                this.MessageDelegator.F(glj2);
                this.dUo[i] = null;
            }
            this.dUo = null;
        }
        this.kill();
    }

    public dqk buo() {
        return this.gPe;
    }

    public void b(dqk dqk2) {
        this.gPe = dqk2;
    }

    public dxr getMessageDelegator() {
        return this.MessageDelegator;
    }

    public void setMessageDelegator(dxr dxr2) {
        this.MessageDelegator = dxr2;
    }
}

