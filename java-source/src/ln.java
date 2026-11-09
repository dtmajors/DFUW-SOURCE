/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  ha
 *  lcw
 */
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class ln
extends btk {
    private static final String auh = "StateSaved";
    private static final String aui = "SkillChanged";
    private static final String auj = "SkillRemoved";
    private static final String auk = "PointsBought";
    private static final String aul = "PlayerOnline";
    private static final String aum = "PlayerOffline";
    private static final String aun = "SkillLevelAdjusted";
    private static final String auo = "SkillFreezed";
    private static final String aup = "PointsEarned";
    private static final int auq = 0;
    private static final int aur = 1;
    private final ha hF;
    private float aus = 0.0f;
    private boolean aut = false;
    private boolean auu = false;
    private boolean auv = true;
    private Map<String, lfs<Float, Boolean>> auw = lcn.emw();
    private double aux = 0.0;
    private boolean auy = true;
    private boolean auz = false;
    private float auA = 0.0f;
    private lo auB = null;
    private Map<Integer, lo> auC = lcn.emw();
    private static final cxm auD = new cxm();
    private static final Random DZ = new Random();
    private static final Map<String, ll> auE = lea.epb();

    public ln(ha ha2) {
        this.hF = ha2;
    }

    private void c(kdk kdk2) {
        lmn lmn2 = kdk2.dVr();
        if (lmn2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleSqlResultMessage()  Result NULL, Meditation will be disabled for player : " + this.hF.iU());
            this.auv = false;
            assert (false);
            return;
        }
        if (lmn2.getErrorCode() != 0) {
            lfn.b(5, this.getClass().getSimpleName(), "handleSqlResultMessage()  Result NULL, Meditation will be disabled for player : " + this.hF.iU());
            this.auv = false;
            assert (false);
            return;
        }
        if (kdk2.getContext() == 0 || kdk2.getContext() == 1) {
            return;
        }
        assert (false) : "Context :" + kdk2.getContext();
    }

    public void Y(boolean bl) {
        if (bl) {
            this.auz = true;
            this.b(true, false);
            this.a(aul, null, 0.0f, 0.0f, this.Z(true));
            this.pj();
            this.auC.clear();
            return;
        }
        this.a(aum, null, 0.0f, 0.0f, null);
        this.aux = this.MessageDelegator.arc().rgz;
    }

    public void pg() {
        Object object;
        Object object2;
        if (this.hF.jf() == null) {
            this.auz = false;
            return;
        }
        if (this.hF.jf().mp()) {
            this.auz = false;
            return;
        }
        Map map = this.hF.jl();
        if (map == null) {
            this.auz = false;
            return;
        }
        Map map2 = this.hF.getAttributeMap();
        if (map2 == null) {
            this.auz = false;
            return;
        }
        for (Object object3 : map.values()) {
            object2 = auE.get(((cxc)object3).Bu());
            if (object2 == null) continue;
            object = new lo(0, ((cxc)object3).zg(), ((cxc)object3).Bt());
            this.auC.put(((cxc)object3).zg(), (lo)object);
            if (this.auB == null || this.auB.az() != ((cxc)object3).zg()) continue;
            this.auB.H(((cxc)object3).Bt());
        }
        for (Object object3 : map2.values()) {
            if (!(object3 instanceof et) || (object = auE.get(((ej)(object2 = (et)object3)).getName())) == null) continue;
            lo lo2 = new lo(1, ((ej)object3).getType(), ((et)object2).fO());
            this.auC.put(((ej)object3).getType(), lo2);
            if (this.auB == null || this.auB.az() != ((ej)object2).getType()) continue;
            this.auB.H(((et)object2).fO());
        }
    }

    private int ph() {
        return 0;
    }

    public void ku() {
        if (this.ph() != 13) {
            return;
        }
        if (this.hF.iY()) {
            this.auw.clear();
            this.aa(true);
            return;
        }
        this.b(false, true);
        this.aa(false);
    }

    private void b(boolean bl, boolean bl2) {
        if (this.ph() != 13) {
            this.auA = 0.0f;
            this.aux = this.MessageDelegator.arc().rgz;
            return;
        }
        if (!this.auu) {
            this.auA = 0.0f;
            this.aux = this.MessageDelegator.arc().rgz;
            return;
        }
        if (!(this.hF.ja() || this.hF.iZ() || bl)) {
            this.auA = 0.0f;
            this.aux = this.MessageDelegator.arc().rgz;
            return;
        }
        if (this.auB == null) {
            this.auA = 0.0f;
            this.aux = this.MessageDelegator.arc().rgz;
            return;
        }
        ll ll2 = auE.get(this.auB.pa());
        if (ll2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "calculateXPGained() Skill : " + this.auB.pa() + " is not a meditation skill.");
            assert (false);
            this.auB = null;
            this.auA = 0.0f;
            this.aux = this.MessageDelegator.arc().rgz;
            return;
        }
        double d2 = this.MessageDelegator.arc().rgz;
        double d3 = ldz.dX(d2) - ldz.dX(this.aux);
        if (d3 > 180.0) {
            d3 = 180.0;
        }
        this.auA += ll2.pc() * (float)d3;
        int n = 0;
        if (this.auA >= 1.0f) {
            n = (int)Math.floor(this.auA);
            this.auA -= (float)((int)Math.floor(this.auA));
        }
        for (int i = 0; i < n; ++i) {
            if (this.auB.po() < ll2.pd()) {
                if (this.aus < ll2.pb()) {
                    this.auA = 0.0f;
                    break;
                }
                this.aus -= ll2.pb();
                float f = this.auB.po();
                float f2 = auD.F(f, ll2.pe());
                float f3 = lew.A(f + f2, 1.0f, ll2.pd());
                this.auB.H(f3);
            }
            if (!(this.auB.po() >= ll2.pd())) continue;
            lfs<Float, Boolean> lfs2 = new lfs<Float, Boolean>(Float.valueOf(this.auB.po()), Boolean.FALSE);
            this.auw.put(this.auB.pa(), lfs2);
            this.auB = bl2 ? this.pi() : null;
            this.auA = !bl2 ? 0.0f : this.auA;
            break;
        }
        this.aux = this.MessageDelegator.arc().rgz;
    }

    private lo pi() {
        if (this.ph() != 13) {
            this.auB = null;
            this.auA = 0.0f;
            return null;
        }
        if (this.aut) {
            ArrayList<lo> arrayList = lcn.emv();
            for (Map.Entry<String, ll> entry : auE.entrySet()) {
                lfs<Float, Boolean> lfs2;
                int n;
                ll ll2 = entry.getValue();
                int n2 = ll2.pf();
                lo lo2 = this.s(n2, n = ll2.az());
                if (lo2 == null || lo2.po() >= ll2.pd() || ll2.pb() > this.aus || (lfs2 = this.auw.get(ll2.pa())) != null && ((Float)lfs2.reX).floatValue() >= ll2.pd() || this.auB != null && this.auB.pa().equals(ll2.pa())) continue;
                arrayList.add(lo2);
            }
            if (arrayList.isEmpty()) {
                this.auB = null;
                this.auA = 0.0f;
                return null;
            }
            int n = DZ.nextInt(arrayList.size());
            if (n >= arrayList.size()) {
                --n;
            }
            return (lo)arrayList.get(n);
        }
        this.auB = null;
        this.auA = 0.0f;
        return null;
    }

    private int r(int n, int n2) {
        float f;
        lfs<Float, Boolean> lfs2;
        int n3 = this.ph();
        if (this.ph() != 13) {
            return n3;
        }
        lo lo2 = this.s(n, n2);
        if (lo2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "setMeditationObjectForTraining()  Player does not have meditation object with type :" + n + " and ResourceType :" + n2);
            return 4;
        }
        ll ll2 = auE.get(lo2.pa());
        if (ll2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "setMeditationObjectForTraining()  Skill : " + lo2.pa() + " is not available for offline training.");
            return 3;
        }
        if (lo2.po() >= ll2.pd()) {
            lfn.b(5, this.getClass().getSimpleName(), "SKILL : setMeditationObjectForTraining() Skill : " + lo2.pa() + " is maxed out.");
            return 5;
        }
        if ((this.hF.ja() || this.hF.iZ()) && (lfs2 = this.auw.get(lo2.pa())) != null && (f = ((Float)lfs2.reX).floatValue()) >= ll2.pd()) {
            return 5;
        }
        this.a(aui, lo2.pa(), lo2.po(), 0.0f, null);
        this.auB = lo2;
        this.auA = 0.0f;
        if (this.hF.ja() || this.hF.iZ()) {
            lfs2 = this.auw.get(this.auB.pa());
            if (lfs2 != null && this.auB.po() < ((Float)lfs2.reX).floatValue()) {
                f = lew.A(((Float)lfs2.reX).floatValue(), 1.0f, ll2.pd());
                this.a(aun, this.auB.pa(), f, 0.0f, null);
                this.auB.H(f);
            }
            this.auw.put(this.auB.pa(), new lfs<Float, Boolean>(Float.valueOf(this.auB.po()), Boolean.TRUE));
        }
        this.aux = this.MessageDelegator.arc().rgz;
        return 13;
    }

    public final String Z(boolean bl) {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.auB != null) {
            stringBuffer.append(this.auB.pa() + ":" + this.auB.po() + ":" + String.valueOf(1));
        }
        if (bl && !this.auw.isEmpty()) {
            for (Map.Entry<String, lfs<Float, Boolean>> entry : this.auw.entrySet()) {
                String string = entry.getKey();
                if (this.auB != null && this.auB.pa().equalsIgnoreCase(string)) continue;
                lfs<Float, Boolean> lfs2 = entry.getValue();
                float f = ((Float)lfs2.reX).floatValue();
                if (stringBuffer.length() > 0) {
                    stringBuffer.append("|" + string + ":" + f + ":" + String.valueOf(0));
                    continue;
                }
                stringBuffer.append(string + ":" + f + ":" + String.valueOf(0));
            }
        }
        return stringBuffer.toString();
    }

    private void aa(boolean bl) {
        if (this.ph() != 13) {
            return;
        }
        String string = this.Z(!bl);
        int n = bl ? 1 : 0;
        String string2 = "Insert Into meditation_player(GameID,WorldID,CharacterID,CurrentMeditationPoints,SkillProgressList,OfflineSkillingEnabled,ContinueSkilling) VALUES(" + lcw.qGe + "," + lcw.qGf + "," + this.hF.getGUID().enw() + "," + this.aus + "," + "'" + string + "'" + "," + (this.auu ? 1 : 0) + "," + (this.aut ? 1 : 0) + ")" + " On Duplicate Key Update CurrentMeditationPoints=" + this.aus + ",SkillProgressList=" + "'" + string + "'" + ",OfflineSkillingEnabled=" + (this.auu ? 1 : 0) + ",ContinueSkilling=" + (this.aut ? 1 : 0);
        this.a(string2, n, "Darkfall");
        this.a(auh, null, 0.0f, 0.0f, string);
    }

    private void a(String string, int n, String string2) {
        kdj kdj2 = (kdj)this.MessageDelegator.i(259, this.getGUID(), dxm.hpA);
        kdj2.wA(string2);
        kdj2.wB(string);
        kdj2.setContext(n);
        this.MessageDelegator.b(kdj2);
    }

    private void pj() {
        if (this.ph() != 13) {
            return;
        }
        if (this.auB != null) {
            switch (this.auB.getType()) {
                case 0: {
                    Object object;
                    if (this.hF.jk() == null || (object = this.hF.jk().ht(this.auB.az())) == null) break;
                    float f = ((cxc)object).Bt();
                    if (f < this.auB.po()) {
                        this.hF.c(mab.uag.bD(this.auB.az()));
                        ((cxc)object).ag(this.auB.po());
                        break;
                    }
                    if (!(f > this.auB.po())) break;
                    this.auB.H(f);
                    assert (false) : "Current skill level : " + f + " for skill : " + this.auB.pa() + " is higher than the one system calculated : " + this.auB.po();
                    break;
                }
                case 1: {
                    Object object;
                    if (this.hF.jm() == null || (object = this.hF.jm().ae(this.auB.az())) == null || !(object instanceof et)) break;
                    float f = ((et)object).fO();
                    if (f < this.auB.po()) {
                        this.hF.c(mab.uah.bD(this.auB.az()));
                        this.hF.jf().jm().c(this.auB.az(), this.auB.po());
                        break;
                    }
                    if (!(f > this.auB.po())) break;
                    this.auB.H(f);
                    assert (false) : "Current skill level : " + f + " for skill : " + this.auB.pa() + " is higher than the one system calculated : " + this.auB.po();
                    break;
                }
            }
        }
        block8: for (Map.Entry<String, lfs<Float, Boolean>> entry : this.auw.entrySet()) {
            String string = entry.getKey();
            ll ll2 = auE.get(string);
            if (ll2 == null) {
                assert (false) : "ResourceName :" + string + " is not a meditation object.";
                continue;
            }
            float f = ll2.pd();
            lfs<Float, Boolean> lfs2 = entry.getValue();
            float f2 = lew.A(((Float)lfs2.reX).floatValue(), 1.0f, f);
            int n = ll2.pf();
            int n2 = ll2.az();
            if (this.auB != null && this.auB.az() == n2) continue;
            switch (n) {
                case 0: {
                    if (this.hF.jk() == null) break;
                    Object object = this.hF.jk().ht(n2);
                    if (object == null) continue block8;
                    float f3 = ((cxc)object).Bt();
                    if (f3 < f2) {
                        this.hF.c(mab.uag.bD(this.auB.az()));
                        ((cxc)object).ag(f2);
                        break;
                    }
                    if (!(f3 > f2)) continue block8;
                    lfs2.reX = Float.valueOf(f2);
                    assert (false) : "Current skill level : " + f3 + " for skill : " + string + " is higher than the one system calculated : " + f2;
                    continue block8;
                }
                case 1: {
                    Object object;
                    if (this.hF.jm() == null || (object = this.hF.jm().ae(n2)) == null || !(object instanceof et)) break;
                    float f3 = ((et)object).fO();
                    if (f3 < f2) {
                        this.hF.c(mab.uah.bD(this.auB.az()));
                        this.hF.jf().jm().c(n2, f2);
                        break;
                    }
                    if (!(f3 > f2)) break;
                    lfs2.reX = Float.valueOf(f2);
                    assert (false) : "Current level : " + f3 + " for Attribute : " + ((ej)object).getName() + " is higher than the one system calculated : " + f2;
                    break;
                }
            }
        }
    }

    private void a(gak gak2) {
        lfs<Float, Boolean> lfs2;
        int n = this.ph();
        if (n != 13) {
            gal gal2 = (gal)this.MessageDelegator.h(27396, this.getGUID(), gak2.aO());
            this.MessageDelegator.b(gak2, gal2);
            gal2.ew = n;
            this.MessageDelegator.F(gal2);
            return;
        }
        int n2 = gak2.ed;
        switch (n2) {
            case 1: {
                if (this.auB == null) {
                    n = 15;
                    break;
                }
                if (this.hF.ja() || this.hF.iZ()) {
                    this.b(false, false);
                    if (this.auB != null && this.auB.po() > this.auB.pq()) {
                        lfs2 = new lfs<Float, Boolean>(Float.valueOf(this.auB.po()), Boolean.FALSE);
                        this.auw.put(this.auB.pa(), lfs2);
                    }
                }
                this.a(auj, null, 0.0f, 0.0f, null);
                this.auB = null;
                this.auA = 0.0f;
                n = 13;
                break;
            }
            case 2: {
                boolean bl = this.auu != gak2.jcF && this.auu;
                this.auu = gak2.jcF;
                this.aut = gak2.jcG;
                int n3 = gak2.dye;
                if (n3 != -1) {
                    int n4 = this.cD(n3);
                    if (n4 == -1) {
                        n = 4;
                        break;
                    }
                    if (this.auB == null) {
                        n = this.r(n4, n3);
                        break;
                    }
                    if (this.auB.az() != n3) {
                        if (this.hF.ja() || this.hF.iZ()) {
                            this.b(false, false);
                            if (this.auB != null && this.auB.po() > this.auB.pq()) {
                                lfs<Float, Boolean> lfs3 = new lfs<Float, Boolean>(Float.valueOf(this.auB.po()), Boolean.FALSE);
                                this.auw.put(this.auB.pa(), lfs3);
                            }
                        }
                        n = this.r(n4, n3);
                        break;
                    }
                    n = 16;
                } else if (bl && this.auB != null) {
                    if (this.hF.ja() || this.hF.iZ()) {
                        this.b(false, true);
                        if (this.auB != null && this.auB.po() > this.auB.pq()) {
                            lfs<Float, Boolean> lfs4 = new lfs<Float, Boolean>(Float.valueOf(this.auB.po()), Boolean.FALSE);
                            this.auw.put(this.auB.pa(), lfs4);
                        }
                    }
                    this.a(auo, null, 0.0f, 0.0f, null);
                }
                if (n != -1) break;
                n = 13;
                break;
            }
            case 3: {
                int n5;
                lfs2 = this.hF.jh();
                if (lfs2 == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "handlePlayerMeditationUpdateInfoRequestMessage() Player state not valid:" + this.hF.iY());
                    n = 11;
                    break;
                }
                if (gak2.jcH <= 0 || this.aus + (float)gak2.jcH > 100000.0f) {
                    lfn.b(5, this.getClass().getSimpleName(), "handlePlayerMeditationUpdateInfoRequestMessage() MeditationPoints=" + (this.aus + (float)gak2.jcH) + " exceed the maximum points :" + 100000);
                    n = 9;
                    break;
                }
                int n6 = ((brh)((Object)lfs2)).mp(cug.fkb);
                if (n6 < (n5 = 1 * gak2.jcH)) {
                    lfn.b(5, this.getClass().getSimpleName(), "handlePlayerMeditationUpdateInfoRequestMessage() Not enough gold in bank :" + n6 + " while the cost is :" + n5);
                    n = 10;
                    break;
                }
                boolean bl = ((brh)((Object)lfs2)).a(cug.fkb, n5, bqy.dHS);
                if (!bl) {
                    lfn.b(5, this.getClass().getSimpleName(), "handlePlayerMeditationUpdateInfoRequestMessage() [Removal Failed] Not enough gold in bank :" + n6 + " while the cost is :" + n5);
                    n = 10;
                    break;
                }
                this.a(auk, null, 0.0f, this.aus + (float)gak2.jcH, null);
                this.aus += (float)gak2.jcH;
                break;
            }
            case 4: {
                if (gak2.jcH <= 0 || this.aus + (float)gak2.jcH > 100000.0f) {
                    lfn.b(5, this.getClass().getSimpleName(), "handlePlayerMeditationUpdateInfoRequestMessage() [EARNED] MeditationPoints=" + (this.aus + (float)gak2.jcH) + " exceed the maximum points :" + 100000);
                    return;
                }
                this.a(aup, null, 0.0f, this.aus + (float)gak2.jcH, null);
                this.aus += (float)gak2.jcH;
                return;
            }
        }
        lfs2 = (gal)this.MessageDelegator.h(27396, this.getGUID(), gak2.aO());
        this.MessageDelegator.b(gak2, (dxq)((Object)lfs2));
        ((gal)((Object)lfs2)).ew = n;
        this.MessageDelegator.F((dxq)((Object)lfs2));
    }

    private void a(gag gag2) {
        Object object;
        Object object2;
        Object object4;
        if (this.ph() != 13) {
            this.a(null, null, null, 0L, null, false, null, null, 0L, gag2.aO());
            return;
        }
        Map<Integer, lo> map = lcn.emw();
        if (this.auB != null) {
            this.b(false, true);
            if (this.auB != null) {
                object4 = this.s(this.auB.getType(), this.auB.az());
                if (object4 == null) {
                    assert (false) : "CAN NOT HAPPEN : Player does not have meditation object with name :" + this.auB.pa();
                    this.a(null, null, null, 0L, null, false, null, null, 0L, gag2.aO());
                    return;
                }
                if (this.hF.iY()) {
                    this.auB.H(((lo)object4).po());
                }
                map.put(this.auB.az(), this.auB);
            }
        }
        for (Map.Entry<String, ll> object32 : auE.entrySet()) {
            float brh2;
            int fArray;
            object2 = object32.getKey();
            object = object32.getValue();
            int lArray = ((ll)object).pf();
            lo bl = this.s(lArray, fArray = ((ll)object).az());
            if (bl == null) continue;
            lfs<Float, Boolean> n = this.auw.get(object2);
            float f = brh2 = this.hF.iY() || n == null ? bl.po() : ((Float)n.reX).floatValue();
            if (map.containsKey(fArray)) continue;
            bl.H(brh2);
            map.put(bl.az(), bl);
        }
        object4 = new int[map.size()];
        float[] fArray = new float[map.size()];
        object2 = new boolean[map.size()];
        object = new long[map.size()];
        long[] lArray = new long[]{0L, 0L, 0L, 0L};
        float[] fArray2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        boolean bl = false;
        int n = 0;
        for (lo l : map.values()) {
            int n2 = l.az();
            String l2 = l.pa();
            float f = l.po();
            boolean bl2 = this.auB != null && l.az() == this.auB.az();
            ll ll2 = auE.get(l2);
            if (ll2 == null) {
                assert (false) : "CAN NOT HAPPEN : No meditation object for ResourceType:" + n2;
                continue;
            }
            float f2 = ll2.pe();
            float f3 = auD.a(0.5f, f2, f, ll2.pd());
            float f4 = f3 * ll2.pb();
            if (bl2) {
                float f5;
                if (l.po() < 25.0f) {
                    f5 = auD.a(0.5f, f2, f, 25.0f);
                    lArray[0] = (long)Math.ceil(f5 / ll2.pc() * 60.0f - this.auA / ll2.pc() * 60.0f);
                    fArray2[0] = f5;
                }
                if (l.po() < 50.0f) {
                    f5 = auD.a(0.5f, f2, f, 50.0f);
                    lArray[1] = (long)Math.ceil(f5 / ll2.pc() * 60.0f - this.auA / ll2.pc() * 60.0f);
                    fArray2[1] = f5;
                }
                if (l.po() < 75.0f) {
                    f5 = auD.a(0.5f, f2, f, 75.0f);
                    lArray[2] = (long)Math.ceil(f5 / ll2.pc() * 60.0f - this.auA / ll2.pc() * 60.0f);
                    fArray2[2] = f5;
                }
                lArray[3] = (long)Math.ceil(f3 / ll2.pc() * 60.0f - this.auA / ll2.pc() * 60.0f);
                fArray2[3] = f3;
                bl = this.aus >= ll2.pb() && (this.hF.ja() || this.hF.iZ());
            }
            object4[n] = n2;
            fArray[n] = f;
            object2[n] = bl2;
            object[n] = (long)Math.ceil(f4);
            ++n;
        }
        brh brh2 = this.hF.jh();
        long l = brh2 == null ? 0L : (long)brh2.mp(cug.fkb);
        long l2 = (long)Math.ceil(this.aus);
        this.a((int[])object4, fArray, (boolean[])object2, l2, (long[])object, bl, lArray, fArray2, l, gag2.aO());
    }

    private void a(int[] nArray, float[] fArray, boolean[] blArray, long l, long[] lArray, boolean bl, long[] lArray2, float[] fArray2, long l2, ldv ldv2) {
        gah gah2 = (gah)this.MessageDelegator.h(27394, this.getGUID(), ldv2);
        gah2.jcu = nArray;
        gah2.jcv = fArray;
        gah2.jcw = blArray;
        gah2.jcy = l;
        gah2.jcx = lArray;
        gah2.avz = bl;
        gah2.jcA = this.auu;
        gah2.jcB = this.aut;
        gah2.jcC = this.hF.kv();
        gah2.jcD = lArray2;
        gah2.jcE = fArray2;
        gah2.jcz = l2;
        this.MessageDelegator.F(gah2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 27395: {
                this.a((gak)dxq2);
                break;
            }
            case 27393: {
                this.a((gag)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 260: {
                this.c((kdk)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    private lo s(int n, int n2) {
        if (!this.hF.iY() || this.hF.jf() == null) {
            lo lo2 = this.auC.get(n2);
            if (lo2 != null) {
                return lo2.pp();
            }
            lfn.b(5, this.getClass().getSimpleName(), "getPlayerMeditationSkillAttributeInfo() Player :" + this.hF.getGUID() + " in cached map does not have skill/attribute type : " + n2);
            lfn.b(5, this.getClass().getSimpleName(), "getPlayerMeditationSkillAttributeInfo() Meditation Type Is :" + n);
            return null;
        }
        switch (n) {
            case 0: {
                ll ll2;
                cxc cxc2;
                Map map = this.hF.jl();
                if (map == null || (cxc2 = (cxc)map.get(n2)) == null || (ll2 = auE.get(cxc2.getName())) == null) break;
                return new lo(n, n2, cxc2.Bt());
            }
            case 1: {
                ej ej2;
                Map map = this.hF.getAttributeMap();
                if (map == null || (ej2 = (ej)map.get(n2)) == null || !(ej2 instanceof et)) break;
                et et2 = (et)ej2;
                ll ll3 = auE.get(ej2.getName());
                if (ll3 == null) break;
                return new lo(n, n2, et2.fO());
            }
            default: {
                assert (false) : "No valid entry for Type [" + n + "] And ResourceType [" + n2 + "]";
                break;
            }
        }
        return null;
    }

    private int cD(int n) {
        ej ej2;
        Object object;
        if (!this.hF.iY() || this.hF.jf() == null) {
            lo lo2 = this.auC.get(n);
            if (lo2 == null) {
                return -1;
            }
            return lo2.getType();
        }
        Map map = this.hF.jl();
        if (map != null && (object = (cxc)map.get(n)) != null) {
            return 0;
        }
        object = this.hF.getAttributeMap();
        if (object != null && (ej2 = (ej)object.get(n)) != null) {
            return 1;
        }
        return -1;
    }

    private void a(String string, String string2, float f, float f2, String string3) {
        String string4;
        String string5;
        if (lcw.enb()) {
            return;
        }
        if (this.ph() != 13) {
            return;
        }
        if (string.equals(aul)) {
            string = "'" + string + "'";
            String string6 = "Insert Into meditation_player_log(GameID,WorldID,CharacterID,Type,ProgressList,CurrentPoints) VALUES(" + lcw.qGe + "," + lcw.qGf + "," + this.hF.getGUID().enw() + "," + string + "," + "'" + string3 + "'" + "," + this.aus + ")";
            this.a(string6, 0, "Darkfall");
            return;
        }
        if (string.equals(aum)) {
            string = "'" + string + "'";
            String string7 = "''";
            if (this.auB != null) {
                string7 = "'" + this.auB.pa() + ":" + this.auB.po() + "'";
            }
            String string8 = "Insert Into meditation_player_log(GameID,WorldID,CharacterID,Type,CurrentSkill,CurrentPoints) VALUES(" + lcw.qGe + "," + lcw.qGf + "," + this.hF.getGUID().enw() + "," + string + "," + string7 + "," + this.aus + ")";
            this.a(string8, 0, "Darkfall");
            return;
        }
        if (string.equals(auh)) {
            if (!this.hF.iY() && this.auu && this.aus > 10.0f) {
                string = "'" + string + "'";
                String string9 = "Insert Into meditation_player_log(GameID,WorldID,CharacterID,Type,ProgressList,CurrentPoints) VALUES(" + lcw.qGe + "," + lcw.qGf + "," + this.hF.getGUID().enw() + "," + string + "," + "'" + string3 + "'" + "," + this.aus + ")";
                this.a(string9, 0, "Darkfall");
            }
            return;
        }
        if (string.equals(aui)) {
            string = "'" + string + "'";
            String string10 = "''";
            if (this.auB != null) {
                string10 = "'" + this.auB.pa() + ":" + this.auB.po() + "'";
            }
            String string11 = "";
            if (string2 != null) {
                string11 = "'" + string2 + ":" + f + "'";
            }
            String string12 = "Insert into meditation_player_log(GameID,WorldID,CharacterID,Type,CurrentSkill,NewSkill,CurrentPoints)  Values(" + lcw.qGe + "," + lcw.qGf + "," + this.hF.getGUID().enw() + "," + string + "," + string10 + "," + string11 + "," + this.aus + ")";
            this.a(string12, 0, "Darkfall");
            return;
        }
        if (string.equals(aun)) {
            string = "'" + string + "'";
            String string13 = "''";
            if (this.auB != null) {
                string13 = "'" + this.auB.pa() + ":" + this.auB.po() + "'";
            }
            String string14 = "";
            if (string2 != null) {
                string14 = "'" + string2 + ":" + f + "'";
            }
            String string15 = "Insert into meditation_player_log(GameID,WorldID,CharacterID,Type,CurrentSkill,NewSkill,CurrentPoints)  Values(" + lcw.qGe + "," + lcw.qGf + "," + this.hF.getGUID().enw() + "," + string + "," + string13 + "," + string14 + "," + this.aus + ")";
            this.a(string15, 0, "Darkfall");
            return;
        }
        if (string.equals(auo)) {
            string = "'" + string + "'";
            string5 = "''";
            if (this.auB != null) {
                string5 = "'" + this.auB.pa() + ":" + this.auB.po() + "'";
            }
            string4 = "Insert into meditation_player_log(GameID,WorldID,CharacterID,Type,CurrentSkill,CurrentPoints)  Values(" + lcw.qGe + "," + lcw.qGf + "," + this.hF.getGUID().enw() + "," + string + "," + string5 + "," + this.aus + ")";
            this.a(string4, 0, "Darkfall");
        }
        if (string.equals(auj)) {
            string = "'" + string + "'";
            string5 = "''";
            if (this.auB != null) {
                string5 = "'" + this.auB.pa() + ":" + this.auB.po() + "'";
            }
            string4 = "Insert into meditation_player_log(GameID,WorldID,CharacterID,Type,CurrentSkill,CurrentPoints)  Values(" + lcw.qGe + "," + lcw.qGf + "," + this.hF.getGUID().enw() + "," + string + "," + string5 + "," + this.aus + ")";
            this.a(string4, 0, "Darkfall");
            return;
        }
        if (string.equals(auk) || string.equals(aup)) {
            string = "'" + string + "'";
            string5 = "Insert into meditation_player_log(GameID,WorldID,CharacterID,Type,CurrentPoints,NewPoints)  Values(" + lcw.qGe + "," + lcw.qGf + "," + this.hF.getGUID().enw() + "," + string + "," + this.aus + "," + f2 + ")";
            this.a(string5, 0, "Darkfall");
            return;
        }
    }

    public final float pk() {
        return this.aus;
    }

    public final boolean pl() {
        return this.aut;
    }

    public final boolean pm() {
        return this.auu;
    }
}

