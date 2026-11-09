/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  lcr
 */
import java.util.Map;

public class cdf
extends btk {
    private final boolean dwG;
    private cdb aeg = null;
    private Map<ldv, cde> end = lcn.emw();
    private Map<ldv, ldv> ene = lcn.emw();

    public cdf(boolean bl) {
        this.dwG = bl;
        this.ObjectType = 128;
    }

    public void d(cdb cdb2) {
        this.aeg = cdb2;
        if (this.aeg != null && !this.dwG && !this.end.isEmpty()) {
            for (cde cde2 : this.end.values()) {
                this.kx(cde2.enc);
            }
        }
    }

    public Map<ldv, cde> aKg() {
        return this.end;
    }

    public void b(cde cde2) {
        if (cde2 == null) {
            lfn.b(5, "SFSkillRelationManager", "addSkillRelation() Relation is null.");
            return;
        }
        cde cde3 = this.end.get(cde2.enc);
        if (cde3 != null) {
            lfn.b(5, "SFSkillRelationManager", "addSkillRelation() SkillRelation already exists. Old: " + cde3);
            lfn.b(5, "SFSkillRelationManager", "addSkillRelation() New: " + cde2);
            assert (false);
            return;
        }
        this.end.put(cde2.enc, cde2);
        if (this.dwG) {
            if (this.Initialized) {
                this.c(cde2.aKf(), 1);
            }
        } else {
            if (this.aeg == null) {
                return;
            }
            this.kx(cde2.enc);
        }
    }

    public void kw(ldv ldv2) {
        cde cde2 = this.end.remove(ldv2);
        if (cde2 == null) {
            lfn.b(5, "SFSkillRelationManager", "removeSkillRelation() failed to find skill relation for skill guid = " + ldv2);
            assert (false);
            return;
        }
        if (this.dwG) {
            if (this.Initialized) {
                this.c(cde2.aKf(), 2);
            }
        } else {
            if (this.aeg == null) {
                return;
            }
            this.ky(ldv2);
        }
    }

    public void R(ldv ldv2, int n) {
        if (ldv2 == null) {
            lfn.b(5, "SFSkillRelationManager", "createSkillRelation() SkillGUID is null.");
            return;
        }
        if (n <= 0) {
            lfn.b(5, "SFSkillRelationManager", "createSkillRelation() SkillType is invalid.");
            return;
        }
        this.b(new cde(ldv2, n));
    }

    @Override
    public final void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11033: {
                this.b((gsl)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void b(gsl gsl2) {
        uk[] ukArray = gsl2.joY;
        if (ukArray == null) {
            lfn.b(5, "SFSkillRelationManager", "handleSystemSubscriptionEventMessage() PropertyUpdates array is null.");
            return;
        }
        int n = this.GUID.ib();
        int n2 = ukArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            vp vp2 = (vp)ukArray[i2];
            ldv ldv2 = lcr.ak((ldv)vp2.aYj.enc, (int)n);
            if (vp2.vG() == 1) {
                this.b(new cde(ldv2, vp2.aYj.SkillType));
                continue;
            }
            if (vp2.vG() == 4) {
                this.kw(ldv2);
                continue;
            }
            lfn.b(5, "SFSkillRelationManager", "handleSystemSubscriptionEventMessage() unknown propery event for skill " + ldv2);
            assert (false);
        }
    }

    private void kx(ldv ldv2) {
        assert (this.aeg != null);
        assert (ldv2 != null);
        ldv ldv3 = this.MessageDelegator.bzv();
        if (this.ene.containsKey(ldv2)) {
            lfn.b(5, "SFSkillRelationManager", "addSkillRelation() skill guid already exists in map");
            assert (false);
            return;
        }
        this.ene.put(ldv2, ldv3);
        geg geg2 = (geg)this.MessageDelegator.h(769, this.GUID, this.MessageDelegator.getGUID());
        geg2.doP = ldv3;
        geg2.gqN = 1028;
        geg2.blo = this.aeg.getGUID();
        geg2.blp = ldv2;
        this.MessageDelegator.F(geg2);
    }

    private void ky(ldv ldv2) {
        assert (this.aeg != null);
        ldv ldv3 = this.ene.remove(ldv2);
        if (ldv3 == null) {
            lfn.b(5, "SFSkillRelationManager", "removeSkillRelation() no relation found to remove");
            assert (false);
            return;
        }
        gem gem2 = (gem)this.MessageDelegator.h(770, this.GUID, this.MessageDelegator.getGUID());
        gem2.doP = ldv3;
        gem2.gqN = 1028;
        this.MessageDelegator.F(gem2);
        this.MessageDelegator.oa(ldv3);
    }

    private void c(cde cde2, int n) {
        assert (this.aeg != null);
        assert (cde2 != null);
        gyx gyx2 = (gyx)this.MessageDelegator.h(12055, this.GUID, lcr.qAI);
        gyx2.aXP = n;
        gyx2.blq = cde2;
        this.MessageDelegator.F(gyx2);
    }
}

