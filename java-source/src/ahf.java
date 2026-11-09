/*
 * Decompiled with CFR.
 */
public class ahf
extends aia {
    private amo[] biG = new amo[3];

    public ahf() {
        super(2);
        this.bls = ahu.c.bmA;
        this.biG[0] = new amo();
        this.biG[0].setType(1);
        this.biG[0].setColor(0);
        this.biG[1] = new amo();
        this.biG[1].setType(1);
        this.biG[1].setColor(1);
        this.biG[2] = new amo();
        this.biG[2].setType(1);
        this.biG[2].setColor(2);
    }

    private boolean a(boolean bl, boolean bl2, boolean bl3, alu[] aluArray, ldv ldv2, boolean bl4, int n, int n2, ldv ldv3, int n3, int n4, int n5) {
        assert (n2 > 0);
        assert (ldv3 != null);
        assert (n4 > 0);
        ahe ahe2 = this.fk(n2);
        if (ahe2 != null) {
            ahe2.aQ(bl3);
            ahe2.a(aluArray);
            ahe2.cL(ldv2);
            ahe2.setAlignment(n3);
            ahe2.aP(bl4);
            ahe2.fj(n);
            ahe2.aR(bl2);
            ahe2.aS(bl);
            ahe2.J(2, this.nN());
            this.a(ahe2.AK(), (Integer)n5);
            if (this.SW.i(this.getGUID(), ahe2.AJ())) {
                this.SW.a(this, ahe2.AJ());
            } else {
                lfn.b(5, "SFPartyStateObject", "createMemberProperty() Could not find eventpropertytimer for member " + ahe2.Bi());
                assert (false);
            }
            return true;
        }
        ahe2 = new ahe();
        ahe2.eS(this.BK());
        ahe2.aQ(bl3);
        ahe2.a(aluArray);
        ahe2.cL(ldv2);
        ahe2.fi(n2);
        ahe2.cK(ldv3);
        ahe2.setAlignment(n3);
        ahe2.l(n4);
        ahe2.aP(bl4);
        ahe2.fj(n);
        ahe2.aR(bl2);
        ahe2.aS(bl);
        ahe2.J(1, this.nN());
        this.a(ahe2);
        this.a(ahe2.AK(), (Integer)n5);
        return true;
    }

    private ahe fk(int n) {
        for (agj agj2 : this.bmY.values()) {
            ahe ahe2;
            if (!(agj2 instanceof ahe) || (ahe2 = (ahe)agj2).Bi() != n) continue;
            return ahe2;
        }
        return null;
    }

    private boolean K(int n, int n2) {
        assert (n > 0);
        ahe ahe2 = this.fk(n);
        if (ahe2 == null) {
            lfn.b(5, "SFPartyStateObject", "removeMemberProperty() A memberproperty for member " + n + " was not found.");
            return false;
        }
        ahe2.J(4, this.nN());
        this.a(ahe2.AK(), (Integer)n2);
        this.SW.b(this, ahe2.AJ());
        return true;
    }

    private boolean a(boolean bl, boolean bl2, boolean bl3, alu[] aluArray, boolean bl4, int n, int n2, int n3, int n4) {
        assert (n2 > 0);
        ahe ahe2 = this.fk(n2);
        if (ahe2 == null) {
            lfn.b(5, "SFPartyStateObject", "updateMemberProperty() A memberproperty for member " + n2 + " was not found.");
            return false;
        }
        ahe2.aQ(bl3);
        ahe2.a(aluArray);
        ahe2.setAlignment(n3);
        ahe2.aP(bl4);
        ahe2.fj(n);
        ahe2.aR(bl2);
        ahe2.aS(bl);
        ahe2.J(8, this.nN());
        this.a(ahe2.AK(), (Integer)n4);
        return true;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 1: {
                return "WaypointPosition";
            }
        }
        return super.eB(n);
    }

    @Override
    public void a(gym gym2, int n) {
        boolean bl = false;
        switch (gym2.bEz()) {
            case 12043: {
                gyr gyr2 = (gyr)gym2;
                boolean bl2 = false;
                int n2 = gyr2.aXP;
                if ((n2 & 1) > 0) {
                    bl2 = this.a(gyr2.aYe, gyr2.RoundRobinExcluded, gyr2.aXX, gyr2.aXY, gyr2.aO(), gyr2.aYb, gyr2.aYc, gyr2.aYa, gyr2.afF, gyr2.Qw, gyr2.ResourceType, n);
                }
                if ((n2 & 2) > 0) {
                    bl2 = this.a(gyr2.aYe, gyr2.RoundRobinExcluded, gyr2.aXX, gyr2.aXY, gyr2.aYb, gyr2.aYc, gyr2.aYa, gyr2.Qw, n);
                }
                if ((n2 & 4) > 0) {
                    bl2 = this.K(gyr2.aYa, n);
                }
                if (!bl2) break;
                bl = true;
                break;
            }
            case 12044: {
                gys gys2 = (gys)gym2;
                if ((gys2.ija & 1) <= 0) break;
                this.biG = gys2.juZ;
                this.L(1, n);
                bl = true;
                break;
            }
            default: {
                lfn.b(5, "SFPartyStateObject", "handleUpdateMessage() Invalid updatemessage provided: " + gym2.getClass().getName());
                return;
            }
        }
        if (bl) {
            this.BE();
        } else {
            lfn.b(5, "SFPartyStateObject", "handleUpdateMessage() Nothing has changed for stateobject " + this.GUID);
        }
    }

    @Override
    public void eE(int n) {
        agj agj2 = this.fw(n);
        if (agj2 == null) {
            lfn.b(5, "SFPartyStateObject", "notifyEventPropertyTimerTimedOut() EventProperty " + n + " was not found.");
            return;
        }
        this.b(agj2);
        this.d(n);
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 1: {
                ur ur2 = new ur();
                ur2.Uo = n;
                ur2.aXm = this.biG;
                return ur2;
            }
        }
        return super.G(n, n2);
    }
}

