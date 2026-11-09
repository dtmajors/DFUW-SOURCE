/*
 * Decompiled with CFR.
 */
public class ahp
extends aia {
    public ahp() {
        super(0);
        this.bls = ahu.c.bmH;
    }

    public boolean a(cde cde2, int n) {
        assert (cde2 != null);
        aho aho2 = this.cO(cde2.enc);
        if (aho2 != null) {
            lfn.b(5, "SFSkillRelationManagerStateObject", "createSkillRelationProperty() Relation already exists for " + cde2);
            assert (false);
            return false;
        }
        aho2 = new aho();
        aho2.eS(this.BK());
        aho2.a(cde2);
        aho2.J(1, this.nN());
        this.a(aho2);
        this.a(aho2.AK(), (Integer)n);
        return true;
    }

    public void b(cde cde2, int n) {
        aho aho2 = this.cO(cde2.enc);
        if (aho2 == null) {
            lfn.b(5, "SFSkillRelationManagerStateObject", "createSkillRelationProperty() could not find relation for " + cde2);
            assert (false);
            return;
        }
        aho2.J(4, this.nN());
        this.a(aho2.AK(), (Integer)n);
        this.SW.b(this, aho2.AJ());
    }

    @Override
    public void a(gym gym2, int n) {
        if (gym2.bEz() != 12055) {
            lfn.b(5, "SFSkillRelationManagerStateObject", "handleUpdateMessage() Invalid UpdateMessage received: " + gym2.getClass().getName());
            assert (false);
            return;
        }
        gyx gyx2 = (gyx)gym2;
        if (gyx2.blq == null) {
            lfn.b(5, "SFSkillRelationManagerStateObject", "handleUpdateMessage() Relation is null.");
            assert (false);
            return;
        }
        if (gyx2.aXP == 1) {
            boolean bl = this.a(gyx2.blq, n);
            if (!bl) {
                lfn.b(5, "SFSkillRelationManagerStateObject", "handleUpdateMessage() Relation was not added: " + gyx2.blq);
                return;
            }
        } else if (gyx2.aXP == 2) {
            this.b(gyx2.blq, n);
        }
        this.BE();
    }

    private aho cO(ldv ldv2) {
        assert (ldv2 != null);
        for (agj agj2 : this.bmY.values()) {
            if (!(agj2 instanceof aho)) continue;
            aho aho2 = (aho)agj2;
            if (!aho2.Bs().enc.equals(ldv2)) continue;
            return aho2;
        }
        return null;
    }
}

