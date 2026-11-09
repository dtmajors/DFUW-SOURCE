/*
 * Decompiled with CFR.
 */
public class agh
extends ahh {
    private boolean bhQ = false;
    private boolean bhR = false;
    private boolean bhS = true;
    private double bhT = 0.0;
    private byv bhU = new byv();

    public agh() {
        super(8);
        this.bls = ahu.c.bmm;
    }

    public agh(int n) {
        super(n);
        this.bls = ahu.c.bmm;
    }

    public void aL(boolean bl) {
        this.bhR = bl;
    }

    public void aM(boolean bl) {
        this.bhQ = bl;
    }

    @Override
    public String eB(int n) {
        switch (n) {
            case 3: {
                return "AlternativeAttackEnabled";
            }
            case 5: {
                return "HelmetVisibility";
            }
            case 6: {
                return "NationalityFlag";
            }
            case 4: {
                return "ObjectState";
            }
            case 7: {
                return "CombatTimer";
            }
        }
        return super.eB(n);
    }

    @Override
    public void a(gym gym2, int n) {
        boolean bl;
        if (gym2 instanceof gyt) {
            super.a(gym2, n);
            return;
        }
        if (!(gym2 instanceof gyg)) {
            lfn.b(5, "SFCreatureObjectStateObject", "handleUpdateMessage() Invalid UpdateMessage received: " + gym2.getClass().getName());
            return;
        }
        boolean bl2 = false;
        gyg gyg2 = (gyg)gym2;
        if ((gyg2.ija & 1) > 0) {
            if (this.bhR == gyg2.bhR) {
                return;
            }
            this.bhR = gyg2.bhR;
            return;
        }
        if ((gyg2.ija & 8) > 0) {
            if (this.bhQ == gyg2.bhQ) {
                return;
            }
            this.bhQ = gyg2.bhQ;
            this.L(5, n);
            bl2 = true;
        }
        if ((gyg2.ija & 0x10) > 0) {
            if (this.bhS == gyg2.bhS) {
                return;
            }
            this.bhS = gyg2.bhS;
            this.L(6, n);
            bl2 = true;
        }
        if ((gyg2.ija & 2) > 0) {
            if (gyg2.bhU == null) {
                lfn.b(5, "SFCreatureObjectStateObject", "handleUpdateMessage() ObjectState is null.");
                return;
            }
            if (this.bhU.vM() == gyg2.bhU.vM()) {
                return;
            }
            this.bhU.dz(gyg2.bhU.vM());
            this.L(4, n);
            bl2 = true;
        }
        if ((gyg2.ija & 4) > 0) {
            if (gyg2.aXP <= 0) {
                lfn.b(5, "SFCreatureObjectStateObject", "handleUpdateMessage(BLOCKING_ITEM) EventType is invalid.");
                return;
            }
            bl = false;
            switch (gyg2.aXP) {
                case 1: {
                    if (gyg2.jul instanceof cyh) {
                        bl = this.a((cyh)gyg2.jul, n);
                        break;
                    }
                    bl = this.a((cyi)gyg2.jul, n);
                    break;
                }
                case 2: {
                    if (gyg2.jul instanceof cyh) {
                        bl = this.b((cyh)gyg2.jul, n);
                        break;
                    }
                    bl = this.b((cyi)gyg2.jul, n);
                    break;
                }
                default: {
                    lfn.b(5, "SFCreatureObjectStateObject", "handleUpdateMessage() Invalid EventType provided for blockingitem.");
                    lfn.b(5, "SFPhysicalObjectStateObject", "handleUpdateMessage() " + gyg2.jul);
                }
            }
            if (bl) {
                bl2 = true;
            }
        }
        if ((gyg2.ija & 0x20) > 0) {
            if (gyg2.aXP <= 0) {
                lfn.b(5, "SFCreatureObjectStateObject", "handleUpdateMessage(SKILL_EXTENSION) EventType is invalid.");
                return;
            }
            bl = false;
            switch (gyg2.aXP) {
                case 3: {
                    bl = this.a(gyg2.jum, n);
                    break;
                }
                case 5: {
                    bl = this.b(gyg2.jum, n);
                    break;
                }
                case 4: {
                    bl = this.c(gyg2.jum, n);
                    break;
                }
                default: {
                    lfn.b(5, "SFCreatureObjectStateObject", "handleUpdateMessage() Invalid EventType provided for perk.");
                    lfn.b(5, "SFPhysicalObjectStateObject", "handleUpdateMessage() " + gyg2.jum);
                }
            }
            bl2 = bl;
            if (bl2) {
                // empty if block
            }
        }
        if ((gyg2.ija & 0x80) > 0) {
            if (gyg2.aXP <= 0) {
                lfn.b(5, "SFCreatureObjectStateObject", "handleUpdateMessage(SKILL_EXTENSION) EventType is invalid.");
                return;
            }
            bl = false;
            switch (gyg2.aXP) {
                case 5: {
                    bl = this.a(gyg2.jun, n);
                    break;
                }
                case 6: {
                    bl = this.b(gyg2.jun, n);
                    break;
                }
                default: {
                    lfn.b(5, "SFCreatureObjectStateObject", "handleUpdateMessage() Invalid EventType provided for unlockable.");
                    lfn.b(5, "SFPhysicalObjectStateObject", "handleUpdateMessage() " + gyg2.jun);
                }
            }
            bl2 = bl;
            if (bl2) {
                // empty if block
            }
        }
        if ((gyg2.ija & 0x40) > 0) {
            if (gyg2.eFr == this.bhT) {
                return;
            }
            this.bhT = gyg2.eFr;
            this.L(7, n);
            bl2 = true;
        }
        if (bl2) {
            this.BE();
        } else {
            lfn.b(5, "SFCreatureObjectStateObject", "handleUpdateMessage() Nothing has changed for stateobject " + this.GUID);
        }
    }

    @Override
    public final void eE(int n) {
        agj agj2 = this.fw(n);
        if (agj2 == null) {
            lfn.b(5, "SFCreatureObjectStateObject", "notifyEventPropertyTimerTimedOut() Invalid PropertyID provided: " + n);
            return;
        }
        if (agj2 instanceof afy) {
            afy afy2 = (afy)agj2;
            this.b(afy2);
            this.d(afy2.AK());
        } else {
            super.eE(n);
        }
    }

    @Override
    protected uk G(int n, int n2) {
        switch (n) {
            case 3: {
                tz tz2 = new tz();
                tz2.Uo = n;
                tz2.Pp = this.bhR;
                return tz2;
            }
            case 5: {
                tz tz3 = new tz();
                tz3.Uo = n;
                tz3.Pp = this.bhQ;
                return tz3;
            }
            case 6: {
                tz tz4 = new tz();
                tz4.Uo = n;
                tz4.Pp = this.bhS;
                return tz4;
            }
            case 4: {
                ui ui2 = new ui();
                ui2.Uo = n;
                if (this.bhU != null) {
                    ui2.aWn = this.bhU.aEl();
                }
                return ui2;
            }
            case 7: {
                ud ud2 = new ud();
                ud2.Uo = n;
                ud2.Pq = this.bhT;
                return ud2;
            }
        }
        return super.G(n, n2);
    }

    private boolean a(cyh cyh2, int n) {
        assert (cyh2 != null);
        afz afz2 = this.a(cyh2.SkillType, cyh2.aXq, cyh2.Up, cyh2.fYc);
        if (afz2 != null) {
            afz2.t(cyh2.aXq);
            afz2.u(cyh2.Up);
            afz2.J(2, this.nN());
            this.a(afz2.AK(), (Integer)n);
            if (this.SW.i(this.getGUID(), afz2.AJ())) {
                this.SW.a(this, afz2.AJ());
            } else {
                lfn.b(5, "SFCreatureObjectStateObject", "createBlockingItemGroupProperty() Could not find eventpropertytimer for blockingitem for skill '" + cyh2.Bu() + "'");
                assert (false);
            }
            return true;
        }
        afz2 = new afz();
        afz2.eS(this.BK());
        afz2.eI(cyh2.SkillType);
        afz2.t(cyh2.aXq);
        afz2.u(cyh2.Up);
        afz2.eK(cyh2.fYc.ordinal());
        afz2.aF(cyh2.bhy);
        afz2.J(1, this.nN());
        this.a(afz2);
        this.a(afz2.AK(), (Integer)n);
        return true;
    }

    private afz a(int n, double d2, double d3, cxd.b b2) {
        assert (n > 0);
        assert (d2 > 0.0);
        assert (d3 > 0.0);
        assert (b2 != null);
        int n2 = b2.ordinal();
        for (agj agj2 : this.bmY.values()) {
            afz afz2;
            if (!(agj2 instanceof afz) || (afz2 = (afz)agj2).zg() != n || afz2.Ay() != d2 || afz2.Az() != d3 || afz2.AA() != n2) continue;
            return afz2;
        }
        return null;
    }

    private boolean b(cyh cyh2, int n) {
        assert (cyh2 != null);
        afz afz2 = this.a(cyh2.SkillType, cyh2.aXq, cyh2.Up, cyh2.fYc);
        if (afz2 == null) {
            lfn.b(5, "SFCreatureObjectStateObject", "removeBlockingItemGroupProperty() BlockingItem for skill '" + cyh2.Bu() + "' was not found.");
            return false;
        }
        afz2.J(4, this.nN());
        this.a(afz2.AK(), (Integer)n);
        this.SW.b(this, afz2.AJ());
        return true;
    }

    private boolean a(cyi cyi2, int n) {
        assert (cyi2 != null);
        aga aga2 = this.I(cyi2.SkillType, cyi2.aXr);
        if (aga2 != null) {
            aga2.t(cyi2.aXq);
            aga2.u(cyi2.Up);
            aga2.J(2, this.nN());
            this.a(aga2.AK(), (Integer)n);
            if (this.SW.i(this.getGUID(), aga2.AJ())) {
                this.SW.a(this, aga2.AJ());
            } else {
                lfn.b(5, "SFCreatureObjectStateObject", "createBlockingItemSingleProperty() Could not find eventpropertytimer for blockingitem for skill '" + cyi2.Bu() + "'");
                assert (false);
            }
            return true;
        }
        aga2 = new aga();
        aga2.eS(this.BK());
        aga2.eI(cyi2.SkillType);
        aga2.t(cyi2.aXq);
        aga2.u(cyi2.Up);
        aga2.eL(cyi2.aXr);
        aga2.aG(cyi2.bhy);
        aga2.J(1, this.nN());
        this.a(aga2);
        this.a(aga2.AK(), (Integer)n);
        return true;
    }

    private aga I(int n, int n2) {
        assert (n > 0);
        assert (n2 > 0);
        for (agj agj2 : this.bmY.values()) {
            aga aga2;
            if (!(agj2 instanceof aga) || (aga2 = (aga)agj2).zg() != n || aga2.AB() != n2) continue;
            return aga2;
        }
        return null;
    }

    private boolean b(cyi cyi2, int n) {
        assert (cyi2 != null);
        aga aga2 = this.I(cyi2.SkillType, cyi2.aXr);
        if (aga2 == null) {
            lfn.b(5, "SFCreatureObjectStateObject", "removeBlockingItemSingleProperty() BlockingItem for skill '" + cyi2.Bu() + "' was not found.");
            return false;
        }
        aga2.J(4, this.nN());
        this.a(aga2.AK(), (Integer)n);
        this.SW.b(this, aga2.AJ());
        return true;
    }

    private boolean a(chz chz2, int n) {
        assert (chz2 != null);
        ahg ahg2 = this.eQ(chz2.Bm());
        if (ahg2 != null) {
            ahg2.fl(chz2.Bm());
            ahg2.J(2, this.nN());
            this.a(ahg2.AK(), (Integer)n);
            if (this.SW.i(this.getGUID(), ahg2.AJ())) {
                this.SW.a(this, ahg2.AJ());
            } else {
                lfn.b(5, "SFCreatureObjectStateObject", "createPerkProperty() Could not find eventpropertytimer for perk '" + chz2.getName() + "'");
                assert (false);
            }
            return true;
        }
        ahg2 = new ahg();
        ahg2.eS(this.BK());
        ahg2.fl(chz2.Bm());
        ahg2.fm(chz2.aOH());
        ahg2.aT(chz2.isActive());
        ahg2.J(1, this.nN());
        this.a(ahg2);
        this.a(ahg2.AK(), (Integer)n);
        return true;
    }

    private boolean b(chz chz2, int n) {
        assert (chz2 != null);
        ahg ahg2 = this.eQ(chz2.Bm());
        if (ahg2 == null) {
            lfn.b(5, "SFCreatureObjectStateObject", "removePerkProperty()  Perk '" + chz2.getName() + "' was not found.");
            return false;
        }
        ahg2.J(4, this.nN());
        this.a(ahg2.AK(), (Integer)n);
        this.SW.b(this, ahg2.AJ());
        return true;
    }

    private ahg eQ(int n) {
        assert (n >= 0);
        for (agj agj2 : this.bmY.values()) {
            ahg ahg2;
            if (!(agj2 instanceof ahg) || (ahg2 = (ahg)agj2).Bm() != n) continue;
            return ahg2;
        }
        return null;
    }

    private boolean c(chz chz2, int n) {
        assert (chz2 != null);
        ahg ahg2 = this.eQ(chz2.Bm());
        if (ahg2 == null) {
            lfn.b(5, "SFCreatureObjectStateObject", "updatePerkProperty() perk '" + chz2.getName() + "' was not found.");
            return false;
        }
        ahg2.fl(chz2.Bm());
        ahg2.v(chz2.Bp());
        ahg2.fm(chz2.aOH());
        ahg2.aT(chz2.isActive());
        ahg2.J(8, this.nN());
        this.a(ahg2.AK(), (Integer)n);
        return true;
    }

    private boolean a(aim aim2, int n) {
        assert (aim2 != null);
        aig aig2 = this.eR(aim2.az());
        if (aig2 != null) {
            aig2.l(aim2.az());
            aig2.J(2, this.nN());
            this.a(aig2.AK(), (Integer)n);
            if (this.SW.i(this.getGUID(), aig2.AJ())) {
                this.SW.a(this, aig2.AJ());
            } else {
                lfn.b(5, "SFCreatureObjectStateObject", "createUnlockableProperty() Could not find eventpropertytimer for unlockable '" + aim2.pa() + "'");
                assert (false);
            }
            return true;
        }
        aig2 = new aig();
        aig2.eS(this.BK());
        aig2.l(aim2.az());
        aig2.setSelected(aim2.isSelected());
        aig2.J(1, this.nN());
        this.a(aig2);
        this.a(aig2.AK(), (Integer)n);
        return true;
    }

    private aig eR(int n) {
        assert (n >= 0);
        for (agj agj2 : this.bmY.values()) {
            aig aig2;
            if (!(agj2 instanceof aig) || (aig2 = (aig)agj2).az() != n) continue;
            return aig2;
        }
        return null;
    }

    private boolean b(aim aim2, int n) {
        assert (aim2 != null);
        aig aig2 = this.eR(aim2.az());
        if (aig2 == null) {
            lfn.b(5, "SFCreatureObjectStateObject", "updateUnlockableProperty() unlockable '" + aim2.pa() + "' was not found.");
            return false;
        }
        aig2.l(aim2.az());
        aig2.setSelected(aim2.isSelected());
        aig2.J(8, this.nN());
        this.a(aig2.AK(), (Integer)n);
        return true;
    }
}

