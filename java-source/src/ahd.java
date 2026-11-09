/*
 * Decompiled with CFR.
 */
public class ahd
extends aia {
    private int ResourceType = 0;
    private lcq HairColor = new lcq(1.0f, 1.0f, 1.0f);
    private lcq aCT = new lcq(1.0f, 1.0f, 1.0f);

    public ahd() {
        super(4);
        this.bls = ahu.c.bmz;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    public void a(lcq lcq2) {
        this.aCT = lcq2;
    }

    public void b(lcq lcq2) {
        this.HairColor = lcq2;
    }

    private boolean a(bzs bzs2, int n) {
        assert (bzs2 != null);
        assert (bzs2.GUID != null);
        afv afv2 = this.t(bzs2.GUID, bzs2.ResourceType);
        if (afv2 != null) {
            afv2.c(bzs2);
            afv2.J(2, this.nN());
            this.a(afv2.AK(), (Integer)n);
            if (this.SW.i(this.getGUID(), afv2.AJ())) {
                this.SW.a(this, afv2.AJ());
            } else {
                lfn.b(5, "SFPaperdollManagerStateObject", "createApparelItemProperty() Could not find eventpropertytimer for itemproperty " + afv2.Am().GUID);
                assert (false);
            }
            return true;
        }
        afv2 = new afv();
        afv2.eS(this.BK());
        afv2.c(bzs2);
        afv2.J(1, this.nN());
        this.a(afv2);
        this.a(afv2.AK(), (Integer)n);
        return true;
    }

    private afv t(ldv ldv2, int n) {
        assert (ldv2 != null);
        for (agj agj2 : this.bmY.values()) {
            if (!(agj2 instanceof afv)) continue;
            afv afv2 = (afv)agj2;
            if (!afv2.Am().GUID.equals(ldv2) || afv2.Am().ResourceType != n) continue;
            return afv2;
        }
        return null;
    }

    private boolean b(bzs bzs2, int n) {
        assert (bzs2 != null);
        assert (bzs2.GUID != null);
        afv afv2 = this.t(bzs2.GUID, bzs2.ResourceType);
        if (afv2 == null) {
            lfn.b(5, "SFPaperdollManagerStateObject", "removeApparelItemProperty() ApparelItem for item " + bzs2.GUID + " was not found.");
            return false;
        }
        afv2.J(4, this.nN());
        this.a(afv2.AK(), (Integer)n);
        this.SW.b(this, afv2.AJ());
        return true;
    }

    private boolean c(bzs bzs2, int n) {
        assert (bzs2 != null);
        assert (bzs2.GUID != null);
        afv afv2 = this.t(bzs2.GUID, bzs2.ResourceType);
        if (afv2 == null) {
            lfn.b(5, "SFPaperdollManagerStateObject", "updateApparelItemProperty() ApparelItem for item " + bzs2.GUID + " was not found.");
            return false;
        }
        afv2.c(bzs2);
        afv2.J(32, this.nN());
        this.a(afv2.AK(), (Integer)n);
        return true;
    }

    private boolean a(cad cad2, int n) {
        assert (cad2 != null);
        assert (cad2.bpW != null);
        assert (cad2.ResourceType > 0);
        agk agk2 = this.a(cad2.bpW);
        if (agk2 == null) {
            agk2 = new agk();
            agk2.eS(this.BK());
            agk2.a(cad2);
            agk2.J(1, this.nN());
            this.a(agk2);
            this.a(agk2.AK(), (Integer)n);
        } else {
            agk2.a(cad2);
            agk2.J(8, this.nN());
            this.a(agk2.AK(), (Integer)n);
        }
        return true;
    }

    private agk a(cak.c c2) {
        assert (c2 != null);
        for (agj agj2 : this.bmY.values()) {
            if (!(agj2 instanceof agk)) continue;
            agk agk2 = (agk)agj2;
            if (agk2.AM().bpW != c2) continue;
            return agk2;
        }
        return null;
    }

    private boolean b(cad cad2, int n) {
        assert (cad2 != null);
        assert (cad2.bpW != null);
        assert (cad2.ResourceType > 0);
        agk agk2 = this.a(cad2.bpW);
        if (agk2 == null) {
            lfn.b(5, "SFPaperdollManagerStateObject", "removeFeatureItemProperty() FeatureItem for layer '" + cad2.Eg() + " was not found.");
            return false;
        }
        agk2.J(4, this.nN());
        this.a(agk2.AK(), (Integer)n);
        this.SW.b(this, agk2.AJ());
        return true;
    }

    private boolean a(cba cba2, int n) {
        assert (cba2 != null);
        assert (cba2.GUID != null);
        aij aij2 = this.u(cba2.GUID, cba2.ResourceType);
        if (aij2 != null) {
            aij2.BO().aXT = cba2.aXT;
            aij2.eU(2048);
            if (aij2.BO().aXT) {
                aij2.eU(4096);
            }
            aij2.J(2, this.nN());
            this.a(aij2.AK(), (Integer)n);
            if (this.SW.i(this.getGUID(), aij2.AJ())) {
                this.SW.a(this, aij2.AJ());
            } else {
                lfn.b(5, "SFPaperdollManagerStateObject", "createWeaponItemProperty() Could not find eventpropertytimer for itemproperty " + aij2.BO().GUID);
                assert (false);
            }
            return true;
        }
        aij2 = new aij();
        aij2.eS(this.BK());
        aij2.a(cba2);
        aij2.J(1, this.nN());
        this.a(aij2);
        this.a(aij2.AK(), (Integer)n);
        return true;
    }

    private aij u(ldv ldv2, int n) {
        assert (ldv2 != null);
        for (agj agj2 : this.bmY.values()) {
            if (!(agj2 instanceof aij)) continue;
            aij aij2 = (aij)agj2;
            if (!aij2.BO().GUID.equals(ldv2) || aij2.BO().ResourceType != n) continue;
            return aij2;
        }
        return null;
    }

    private boolean b(cba cba2, int n) {
        assert (cba2 != null);
        assert (cba2.GUID != null);
        aij aij2 = this.u(cba2.GUID, cba2.ResourceType);
        if (aij2 == null) {
            lfn.b(5, "SFPaperdollManagerStateObject", "removeWeaponItemProperty() WeaponItem for item " + cba2.GUID + " was not found.");
            return false;
        }
        aij2.J(4, this.nN());
        this.a(aij2.AK(), (Integer)n);
        this.SW.b(this, aij2.AJ());
        return true;
    }

    private boolean c(cba cba2, int n) {
        assert (cba2 != null);
        assert (cba2.GUID != null);
        aij aij2 = this.u(cba2.GUID, cba2.ResourceType);
        if (aij2 == null) {
            lfn.b(5, "SFPaperdollManagerStateObject", "updateWeaponItemProperty() WeaponItem for item " + cba2.GUID + " was not found.");
            return false;
        }
        if (aij2.BO().aXT != cba2.aXT) {
            aij2.a(cba2);
            if (cba2.aXT) {
                aij2.J(2048, this.nN());
                aij2.eU(4096);
            } else {
                aij2.J(4096, this.nN());
                aij2.eU(2048);
            }
            this.a(aij2.AK(), (Integer)n);
        } else if (aij2.BO().edX != cba2.edX) {
            aij2.a(cba2);
            aij2.J(32, this.nN());
            this.a(aij2.AK(), (Integer)n);
        } else {
            lfn.b(5, "SFPaperdollManagerStateObject", "updateWeaponItemProperty() Item has no changes: " + cba2);
            return false;
        }
        return true;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 1: {
                return "ResourceType";
            }
            case 2: {
                return "HairColor";
            }
            case 3: {
                return "SkinColor";
            }
        }
        return super.eB(n);
    }

    @Override
    public void a(gym gym2, int n) {
        int n2;
        boolean bl;
        if (gym2.bEz() != 12042) {
            lfn.b(5, "SFPaperdollManagerStateObject", "handleUpdateMessage() Invalid UpdateMessage received: " + gym2.getClass().getName());
            return;
        }
        boolean bl2 = false;
        gyq gyq2 = (gyq)gym2;
        if ((gyq2.ija & 1) > 0) {
            this.HairColor = gyq2.HairColor;
            this.L(2, n);
            bl2 = true;
        }
        if ((gyq2.ija & 0x20) > 0) {
            this.ResourceType = gyq2.ResourceType;
            this.L(1, n);
            bl2 = true;
        }
        if ((gyq2.ija & 2) > 0) {
            this.aCT = gyq2.aCT;
            this.L(3, n);
            bl2 = true;
        }
        if ((gyq2.ija & 4) > 0) {
            bl = false;
            n2 = gyq2.aXP;
            switch (n2) {
                case 1: {
                    bl = this.a(gyq2.eet, n);
                    break;
                }
                case 2: {
                    bl = this.b(gyq2.eet, n);
                    break;
                }
                case 3: {
                    bl = this.c(gyq2.eet, n);
                    break;
                }
                default: {
                    lfn.b(5, "SFPaperdollManagerStateObject", "handleUpdateMessage() Invalid eventtype for apparelitem provided: " + n2);
                }
            }
            if (bl) {
                bl2 = true;
            }
        }
        if ((gyq2.ija & 8) > 0) {
            bl = false;
            n2 = gyq2.aXP;
            switch (n2) {
                case 4: {
                    bl = this.a(gyq2.eeB, n);
                    break;
                }
                case 5: {
                    bl = this.b(gyq2.eeB, n);
                    break;
                }
                default: {
                    lfn.b(5, "SFPaperdollManagerStateObject", "handleUpdateMessage() Invalid eventtype for featureitem provided: " + n2);
                }
            }
            if (bl) {
                bl2 = true;
            }
        }
        if ((gyq2.ija & 0x10) > 0) {
            bl = false;
            n2 = gyq2.aXP;
            switch (n2) {
                case 6: {
                    bl = this.a(gyq2.eej, n);
                    break;
                }
                case 7: {
                    bl = this.b(gyq2.eej, n);
                    break;
                }
                case 8: {
                    bl = this.c(gyq2.eej, n);
                    break;
                }
                default: {
                    lfn.b(5, "SFPaperdollManagerStateObject", "handleUpdateMessage() Invalid eventtype for weaponitem provided: " + n2);
                }
            }
            if (bl) {
                bl2 = true;
            }
        }
        if (bl2) {
            this.BE();
        }
    }

    @Override
    public void eE(int n) {
        Integer n2 = new Integer(n);
        agj agj2 = this.fw(n);
        if (agj2 == null) {
            lfn.b(5, "SFPaperdollManagerStateObject", "notifyEventPropertyTimerTimedOut() EventProperty " + n + " was not found.");
            return;
        }
        this.b(agj2);
        this.d(n2);
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 1: {
                uh uh2 = new uh();
                uh2.Uo = n;
                uh2.PC = this.ResourceType;
                return uh2;
            }
            case 2: {
                uc uc2 = new uc();
                uc2.Uo = n;
                uc2.aWl = this.HairColor;
                return uc2;
            }
            case 3: {
                uc uc3 = new uc();
                uc3.Uo = n;
                uc3.aWl = this.aCT;
                return uc3;
            }
        }
        return super.G(n, n2);
    }
}

