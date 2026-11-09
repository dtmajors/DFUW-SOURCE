/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  lcr
 */
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class bug
extends btk
implements bto {
    private Set<ldv> dNK = lcn.emx();
    private bui dNL = null;
    private boolean dNM = true;
    private boolean dNN = false;
    private Map<cew, ldv> dNO = lcn.emw();
    private Set<cew> dNP = lcn.emx();

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 17950: {
                this.a((fwn)dxq2);
                break;
            }
            case 17951: {
                this.a((fwi)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.dNP.isEmpty()) {
            Iterator<cew> iterator = this.dNP.iterator();
            while (iterator.hasNext()) {
                cew cew2 = iterator.next();
                if (cew2.aAG() == null || !cew2.aAG().ayZ() || cew2.aAG().axa() == null) continue;
                iterator.remove();
                if (!this.dNN && cew2.aJI()) continue;
                assert (!this.dNO.containsKey(cew2));
                ldv ldv2 = this.g(cew2);
                this.dNO.put(cew2, ldv2);
            }
        }
    }

    private void a(fwi fwi2) {
        boolean bl2 = this.dNM;
        boolean bl3 = this.dNM = !this.dNM;
        if (this.dNO != null && !this.dNO.isEmpty()) {
            Map<cew, ldv> map = lcn.emw();
            for (Map.Entry<cew, ldv> entry : this.dNO.entrySet()) {
                if (bl2) {
                    assert (entry.getValue() != null);
                    this.a(entry.getKey(), entry.getValue());
                    map.put(entry.getKey(), null);
                    continue;
                }
                assert (entry.getValue() == null);
                ldv ldv2 = this.g(entry.getKey());
                map.put(entry.getKey(), ldv2);
            }
            this.dNO = map;
        }
    }

    private void a(fwn fwn2) {
        if (fwn2.iZm) {
            this.ayb();
            return;
        }
        if (fwn2.afF == null) {
            return;
        }
        if (fwn2.ila) {
            if (this.dNK.contains(fwn2.afF)) {
                return;
            }
            this.jJ(fwn2.afF);
        } else {
            this.jK(fwn2.afF);
        }
    }

    private void ayb() {
        this.dNP.clear();
        for (Map.Entry<cew, ldv> entry : this.dNO.entrySet()) {
            if (entry.getValue() == null) continue;
            this.a(entry.getKey(), entry.getValue());
        }
        this.dNO.clear();
        this.dNK.clear();
    }

    private void jJ(ldv ldv2) {
        this.dNK.add(ldv2);
        cew cew2 = this.dNL.jL(ldv2);
        if (cew2 == null) {
            return;
        }
        this.dNP.add(cew2);
    }

    public void e(cew cew2) {
        if (cew2 == null) {
            return;
        }
        if (!this.dNK.contains(cew2.getGUID())) {
            return;
        }
        this.dNP.add(cew2);
    }

    public void f(cew cew2) {
        if (cew2 == null) {
            return;
        }
        this.dNP.remove(cew2);
        ldv ldv2 = this.dNO.remove(cew2);
        if (ldv2 != null) {
            this.a(cew2, ldv2);
        }
    }

    private void jK(ldv ldv2) {
        Object object;
        cew cew2 = this.dNP.iterator();
        while (cew2.hasNext()) {
            object = cew2.next();
            if (object == null || !ldv2.equals(object.getGUID())) continue;
            cew2.remove();
            break;
        }
        cew2 = null;
        object = this.dNO.keySet().iterator();
        while (object.hasNext()) {
            cew cew3 = (cew)object.next();
            if (cew3 == null || !ldv2.equals(cew3.getGUID())) continue;
            cew2 = cew3;
            break;
        }
        if (cew2 != null && (object = this.dNO.remove(cew2)) != null) {
            this.a(cew2, (ldv)object);
        }
        this.dNK.remove(ldv2);
    }

    public final bui ayc() {
        return this.dNL;
    }

    public final void a(bui bui2) {
        this.dNL = bui2;
    }

    private ldv g(cew cew2) {
        if (!this.dNM) {
            return null;
        }
        cew2.fS(false);
        ldv ldv2 = this.MessageDelegator.lL(lcr.qEa);
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEa);
        glh2.SpecialEffectType = del.gjd;
        glh2.aUa = ldv2;
        glh2.mj(false);
        glh2.mk(false);
        glh2.akX = cew2.aAG().getGUID();
        glh2.aZD = cew2.aAG().av();
        this.MessageDelegator.F(glh2);
        return ldv2;
    }

    private void a(cew cew2, ldv ldv2) {
        if (cew2 == null) {
            return;
        }
        if (ldv2 == null) {
            return;
        }
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.GUID, lcr.qEa);
        glj2.jkV = 1;
        glj2.aUa = ldv2;
        this.MessageDelegator.F(glj2);
        cew2.fS(true);
    }
}

