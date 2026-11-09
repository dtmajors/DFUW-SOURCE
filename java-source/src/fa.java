/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cxd
 *  en
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class fa {
    private final en PS;
    private final boolean PT;
    private Map<ldv, fb> PU = lcn.emw();
    private lid<fb> PV = new lid();
    private List<alt> PW = lcn.abH(5);
    private int PX = 1;
    private static les DX = lea.enT();
    private boolean PY = false;

    public fa(en en2) {
        this.PS = en2;
        this.PT = this.PS.fp() instanceof cdb;
    }

    public boolean L(ldv ldv2) {
        return this.PU.containsKey(ldv2);
    }

    public boolean M(ldv ldv2) {
        fb fb2 = this.PU.get(ldv2);
        if (fb2 == null) {
            return false;
        }
        return fb2.Qd.gu();
    }

    public void doTick(ldz ldz2) {
        cdb cdb2;
        if (this.PT && !(cdb2 = (cdb)this.PS.fp()).aJD().aEP().isAlive()) {
            return;
        }
        this.q(ldz2);
        this.PY = false;
    }

    public fb N(ldv ldv2) {
        return this.PU.get(ldv2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean f(alt alt2) {
        fb fb2;
        block15: {
            block16: {
                als als2;
                block17: {
                    if (alt2 == null) {
                        lfn.b(5, "SFModifierManager", "registerModifier() Modifier to register is null.");
                        return false;
                    }
                    if (alt2.DV() <= 0.0 && !alt2.gu()) {
                        lfn.b(5, "SFModifierManager", "registerModifier() ExpirationTime of modifier is invalid.");
                        return false;
                    }
                    if (alt2.El() && alt2.DY() <= 0) {
                        lfn.b(5, "SFModifierManager", "registerModifier() NumberOfTicks of modifier is invalid.");
                        return false;
                    }
                    if (this.PU.containsKey(alt2.getGUID())) {
                        lfn.b(5, "SFModifierManager", "registerModifier() Modifier with GUID=" + alt2.getGUID() + " is already registered.");
                        alt alt3 = this.PU.get((Object)alt2.getGUID()).Qd;
                        lfn.b(5, "SFModifierManager", "registerModifier() Current: " + alt3);
                        lfn.b(5, "SFModifierManager", "registerModifier() New: " + alt2);
                        return false;
                    }
                    fb2 = new fb();
                    fb2.PZ = this.gs();
                    fb2.Qd = alt2;
                    fb2.oV = this.PS.fp().getMessageDelegator().arc().rgz;
                    if (!(alt2 instanceof als)) break block16;
                    als2 = (als)alt2;
                    if (als2.DY() <= 0) break block17;
                    if (als2.gu()) {
                        fb2.Qa = 0;
                        fb2.Qb = 1.0f / (float)(als2.DY() + 1);
                        fb2.Qc = fb2.oV + fb2.Qb;
                        break block15;
                    } else {
                        fb2.Qa = alt2.DY();
                        fb2.Qb = alt2.DV() / (double)(fb2.Qa + 1);
                        fb2.Qc = fb2.oV + fb2.Qb;
                    }
                    break block15;
                }
                if (als2.gu()) {
                    fb2.Qa = 0;
                    fb2.Qb = 0.0;
                    fb2.Qc = -2.0;
                    break block15;
                } else {
                    int n;
                    fb2.Qa = 0;
                    fb2.Qb = alt2.DV();
                    fb2.Qc = fb2.oV + fb2.Qb;
                    ldv ldv2 = this.a(alt2.Eb(), fb2.Qb, fb2.oV, fb2.Qc);
                    if (ldv2 != null && (n = this.bk(alt2.Eb())) >= cxd.xY((int)alt2.Eb())) {
                        fb fb3 = this.PU.get(ldv2);
                        if (fb3 != null) {
                            fb3 = this.PV.b(fb3.Qc, fb3);
                            this.a(fb3.Qd);
                            break block15;
                        } else {
                            assert (false);
                            return false;
                        }
                    }
                }
                break block15;
            }
            if (alt2.gu()) {
                fb2.Qa = 0;
                fb2.Qb = 0.0;
                fb2.Qc = -2.0;
            } else {
                fb2.Qa = 0;
                fb2.Qb = alt2.DV();
                fb2.Qc = fb2.oV + fb2.Qb;
            }
        }
        this.PU.put(alt2.getGUID(), fb2);
        if (!fb2.gu()) {
            this.PV.a(fb2.Qc, fb2);
        }
        this.PS.a(alt2, fb2.PZ);
        return true;
    }

    private int bk(int n) {
        if (!cxd.xW((int)n)) {
            return -1;
        }
        int n2 = 0;
        for (fb fb2 : this.PU.values()) {
            if (fb2.Qd.Eb() != n) continue;
            ++n2;
        }
        return n2;
    }

    private ldv a(int n, double d2, double d3, double d4) {
        if (!cxd.xX((int)n)) {
            return null;
        }
        ldv ldv2 = null;
        for (fb fb2 : this.PU.values()) {
            if (fb2.Qd.Eb() != n) continue;
            this.PV.b(fb2.Qc, fb2);
            fb2.Qb = d2;
            fb2.oV = d3;
            fb2.Qc = d4;
            this.PV.a(fb2.Qc, fb2);
            ldv2 = fb2.Qd.getGUID();
        }
        return ldv2;
    }

    public void gp() {
        this.bl(0);
    }

    public void bl(int n) {
        if (n < 0) {
            lfn.b(5, "SFModifierManager", "removeModifiersFromAttribute() AttributeType is invalid.");
            return;
        }
        if (this.PU.isEmpty()) {
            return;
        }
        if (n > 0) {
            // empty if block
        }
        Iterator<fb> iterator = this.PU.values().iterator();
        while (iterator.hasNext()) {
            fb fb2 = iterator.next();
            if (fb2.Qd.Ej()) continue;
            if (!(fb2.Qd instanceof alq)) {
                lfn.b(5, "SFModifierManager", "removeModifiersFromAttribute() Modifier is not an attributemodifier: " + fb2.Qd.getClass().getName());
                continue;
            }
            alq alq2 = (alq)fb2.Qd;
            if (n > 0 && alq2.BV() != n || n == 0 && alq2.Eb() == cxd.fLu) continue;
            iterator.remove();
            if (!fb2.gu()) {
                assert (fb2.Qc > 0.0);
                fb fb3 = this.PV.b(fb2.Qc, fb2);
                if (fb3 == null) {
                    this.PY = true;
                }
            }
            this.PS.b((alt)alq2, fb2.PZ);
            if (alq2 instanceof alr) {
                this.PS.a((alr)alq2, alq2.BV());
                continue;
            }
            if (alq2 instanceof als) {
                this.PS.a((als)alq2, alq2.BV());
                continue;
            }
            lfn.b(5, "SFModifierManager", "removeModifiersFromAttribute() Unhandled modifiertype: " + alq2.getClass().getName());
        }
    }

    public void gq() {
        if (this.PU.isEmpty()) {
            return;
        }
        Iterator<fb> iterator = this.PU.values().iterator();
        while (iterator.hasNext()) {
            Object object;
            fb fb2 = iterator.next();
            if (fb2.Qd.Eb() == cxd.fLu || fb2.Qd.Ej()) continue;
            iterator.remove();
            if (!fb2.gu()) {
                assert (fb2.Qc > 0.0);
                object = this.PV.b(fb2.Qc, fb2);
                if (object == null) {
                    lfn.b(5, "SFModifierManager", "removeModifiersOnDeath() Could not find timer for modifier " + fb2.Qd.getGUID());
                    assert (false);
                }
            }
            this.PS.b(fb2.Qd, fb2.PZ);
            if (fb2.Qd instanceof alr) {
                object = (alr)fb2.Qd;
                this.PS.a((alr)object, ((alq)object).BV());
            }
            if (!(fb2.Qd instanceof als)) continue;
            object = (als)fb2.Qd;
            this.PS.a((als)object, ((alq)object).BV());
        }
    }

    public void bm(int n) {
        if (n <= 0) {
            lfn.b(5, "SFModifierManager", "removeModifiersWithEffect() EffectType is invalid.");
            return;
        }
        if (this.PU.isEmpty()) {
            return;
        }
        Iterator<fb> iterator = this.PU.values().iterator();
        while (iterator.hasNext()) {
            alq alq2;
            fb fb2 = iterator.next();
            if (fb2.Qd.Ej() || !(fb2.Qd instanceof alq) || !DX.isDescendant((alq2 = (alq)fb2.Qd).CD(), n)) continue;
            iterator.remove();
            if (!fb2.gu()) {
                assert (fb2.Qc > 0.0);
                fb fb3 = this.PV.b(fb2.Qc, fb2);
                if (fb3 == null) {
                    lfn.b(5, "SFModifierManager", "removeModifiersWithEffect() Could not find timer for modifier " + alq2.getGUID());
                    assert (false);
                }
            }
            this.PS.b((alt)alq2, fb2.PZ);
            if (alq2 instanceof als) {
                this.PS.a((als)alq2, alq2.BV());
                continue;
            }
            if (!(alq2 instanceof alr)) continue;
            this.PS.a((alr)alq2, alq2.BV());
        }
    }

    public void bn(int n) {
        if (!this.PS.fp().UB()) {
            return;
        }
        if (n <= 0) {
            lfn.b(5, "SFModifierManager", "removeAllSelfModifiersFromSkill() EffectType is invalid.");
            return;
        }
        if (this.PU.isEmpty()) {
            return;
        }
        Iterator<fb> iterator = this.PU.values().iterator();
        while (iterator.hasNext()) {
            fb fb2 = iterator.next();
            if (fb2.Qd.Ej() || !(fb2.Qd instanceof alq)) continue;
            alq alq2 = (alq)fb2.Qd;
            if (!lea.enZ().isDescendant(alq2.Eb(), n) || !alq2.DZ().equals(this.PS.fp().getGUID())) continue;
            iterator.remove();
            if (!fb2.gu()) {
                assert (fb2.Qc > 0.0);
                fb fb3 = this.PV.b(fb2.Qc, fb2);
                if (fb3 == null) {
                    lfn.b(5, "SFModifierManager", "removeAllSelfModifiersFromSkill() Could not find timer for modifier " + alq2.getGUID());
                    assert (false);
                }
            }
            this.PS.b((alt)alq2, fb2.PZ);
            if (alq2 instanceof als) {
                this.PS.a((als)alq2, alq2.BV());
                continue;
            }
            if (!(alq2 instanceof alr)) continue;
            this.PS.a((alr)alq2, alq2.BV());
        }
    }

    public void gr() {
        if (this.PU.isEmpty()) {
            return;
        }
        for (fb fb2 : this.PU.values()) {
            als als2;
            if (!(fb2.Qd instanceof als) || (als2 = (als)fb2.Qd).BV() != 352 || als2.Ej() || DX.isDescendant(als2.CD(), bfk.dgm)) continue;
            als2.aq(0.0f);
            if (als2.El()) continue;
            als2.as(0.0f);
        }
    }

    public alq O(ldv ldv2) {
        fb fb2 = this.PU.remove(ldv2);
        if (fb2 == null) {
            lfn.b(5, "SFModifierManager", "unregisterModifier() No timer mapped to ModifierGUID " + ldv2);
            return null;
        }
        if (!fb2.gu()) {
            assert (fb2.Qc > 0.0);
            fb fb3 = this.PV.b(fb2.Qc, fb2);
            if (fb3 == null) {
                lfn.b(5, "SFModifierManager", "unregisterModifier() Could not find timer for modifier " + ldv2);
                assert (false);
            }
        }
        this.PS.b(fb2.Qd, fb2.PZ);
        return (alq)fb2.Qd;
    }

    private void q(ldz ldz2) {
        List<fb> list = this.PV.eh(ldz2.rgz);
        if (list == null) {
            return;
        }
        this.PW.clear();
        for (fb fb2 : list) {
            if (fb2.Qd instanceof als) {
                als als2 = (als)fb2.Qd;
                als2.nh();
                if (als2.gu()) {
                    fb2.Qc = ldz2.rgz + fb2.Qb;
                    this.PV.a(fb2.Qc, fb2);
                    this.PS.a(als2);
                } else if (fb2.Qa == 0) {
                    this.PW.add(als2);
                } else {
                    --fb2.Qa;
                    fb2.Qc = ldz2.rgz + fb2.Qb;
                    this.PV.a(fb2.Qc, fb2);
                    this.PS.a(als2);
                }
                if (!this.PY) continue;
                return;
            }
            this.PW.add(fb2.Qd);
        }
        int n = this.PW.size();
        for (int j = 0; j < n; ++j) {
            this.a(this.PW.get(j));
            if (!this.PY) continue;
            return;
        }
    }

    private void a(alt alt2) {
        fb fb2 = this.PU.remove(alt2.getGUID());
        if (fb2 == null) {
            lfn.b(5, "SFModifierManager", "handleModifierTimedOut() Could not find modifier " + alt2.getGUID());
            assert (false);
            return;
        }
        if (alt2 instanceof als && alt2.El()) {
            als als2 = (als)alt2;
            als2.aq(als2.DS() - als2.DT());
        }
        this.PS.a(alt2);
        this.PS.b(fb2.Qd, fb2.PZ);
    }

    private int gs() {
        int n = this.PX++;
        return n;
    }

    public void gt() {
        lfn.b(1, "SFModifierManager", "dumpContent() Dumps the content for object " + this.PS.fp().getGUID());
        lfn.b(1, "SFModifierManager", "dumpContent() ModifierGUIDToTimerMap:");
        for (Map.Entry<ldv, fb> entry : this.PU.entrySet()) {
            lfn.b(0, "SFModifierManager", "dumpContent() Modifier=" + entry.getKey());
            lfn.b(0, "SFModifierManager", "dumpContent() Timer=" + entry.getValue());
        }
        lfn.b(1, "SFModifierManager", "dumpContent() ");
        lfn.b(1, "SFModifierManager", "dumpContent() TimeToTimerMap:");
        this.PV.gt();
    }
}

