/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bpr
 *  cug
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class bot
extends btk {
    private final bpr dyh;
    private Map<ldv, dty> dyi = null;
    private final Map<ldv, lfs<bok, ldv>> dyj = lcn.emG();
    private bou dyk = null;
    private box dyl = null;
    private final Map<ldv, Map<Integer, lil<Integer, Integer, Integer>>> dym = lcn.emw();
    private final Map<Integer, lfs<Integer, Integer>> dyn = lcn.emw();
    private int dyo = 0;
    private final Map<ldv, ldv> dyp = lcn.emw();

    public bot(bpr bpr2) {
        this.dyh = bpr2;
    }

    public String a(bok bok2) {
        assert (bok2 != null);
        if (bok2 != null) {
            dty dty2 = this.dyi.get(bok2.asB());
            assert (dty2 != null);
            if (dty2 != null) {
                due due2 = dty2.Ce(bok2.asy());
                assert (due2 != null);
                if (due2 != null && due2.QuestEndNpcName != null) {
                    return due2.QuestEndNpcName;
                }
            }
        }
        return "";
    }

    public void a(bok bok2, ldv ldv2, ldv ldv3, String string, boolean bl2, int n) {
        if (this.C(bok2.asz(), bok2.asB())) {
            return;
        }
        lfs<bok, ldv> lfs2 = new lfs<bok, ldv>(bok2, ldv3);
        this.dyj.put(bok2.asw(), lfs2);
        this.a(bok2, ldv2, string, n, 0);
        this.a(bok2, bl2);
    }

    public boolean C(ldv ldv2, ldv ldv3) {
        for (lfs<bok, ldv> lfs2 : this.dyj.values()) {
            bok bok2 = lfs2.getFirst();
            ldv ldv4 = bok2.asB();
            ldv ldv5 = bok2.asz();
            if (!ldv4.equals(ldv3) || !ldv5.equals(ldv2)) continue;
            return true;
        }
        return false;
    }

    private void a(bok bok2, boolean bl2) {
        bop bop2 = bok2.lp(bok2.asy());
        if (bop2 == null) {
            lfn.b(5, "SFActiveQuestManager", "sendQuestInfoToPO() Quest For Questnumber: " + bok2.asy() + " Is NULL!!");
            assert (false);
            return;
        }
        dud dud2 = dud.getValueByOrdinal(bop2.asH());
        ldv ldv2 = bop2.asN();
        switch (dud2) {
            case hdR: {
                if (ldv2 == null) {
                    lfn.b(5, "SFActiveQuestManager", "sendQuestInfoToPO() Target Vendor GUID is NULL for Quest :" + bop2.qM());
                    assert (false);
                    return;
                }
                this.a(bok2, ldv2, false);
                bop2.dE(true);
                this.a(this.a(bok2, bpk.dzQ.ordinal()), bok2);
                bok2.dx(false);
                return;
            }
            case hdO: {
                if (ldv2 == null) {
                    lfn.b(5, "SFActiveQuestManager", "sendQuestInfoToPO() Target Vendor GUID is NULL for Quest :" + bop2.qM());
                    assert (false);
                    return;
                }
                this.a(bok2, ldv2, false);
                bop2.dE(true);
                if (!bok2.asF()) {
                    this.b(bok2);
                }
                this.a(this.a(bok2, bpk.dzR.ordinal()), bok2);
                bok2.dx(false);
                return;
            }
            case hdN: {
                if (ldv2 == null) {
                    lfn.b(5, "SFActiveQuestManager", "sendQuestInfoToPO() Target Vendor GUID is NULL for Quest :" + bop2.qM());
                    assert (false);
                    return;
                }
                if (bl2) {
                    this.b(bok2);
                } else {
                    this.a(bok2, ldv2, true);
                    bop2.dE(true);
                }
                bok2.dx(false);
                return;
            }
            case hdP: {
                assert (ldv2 != null);
                this.b(bok2);
                this.a(this.f(bok2), bok2);
                bok2.dx(false);
                return;
            }
            case hdQ: {
                if (bl2) {
                    this.b(bok2);
                    this.a(this.f(bok2), bok2);
                } else {
                    if (ldv2 == null) {
                        lfn.b(5, "SFActiveQuestManager", "sendQuestInfoToPO() Target Vendor GUID is NULL for Quest :" + bop2.qM());
                        assert (false);
                        return;
                    }
                    this.a(bok2, ldv2, true);
                    bop2.dE(true);
                }
                bok2.dx(false);
                return;
            }
            case hdS: {
                if (bl2) {
                    this.b(bok2);
                    this.a(this.f(bok2), bok2);
                } else {
                    if (ldv2 == null) {
                        lfn.b(5, "SFActiveQuestManager", "sendQuestInfoToPO() Target Vendor GUID is NULL for Quest :" + bop2.qM());
                        assert (false);
                        return;
                    }
                    this.a(bok2, ldv2, true);
                    bop2.dE(true);
                }
                bok2.dx(false);
                return;
            }
        }
        assert (false) : "Unknown questtype " + bop2.getClass().getName();
    }

    private void b(bok bok2) {
        if (bok2 == null) {
            lfn.b(5, "SFActiveQuestManager", "registerKillQuestTargets() Complex Quest is NULL");
            assert (false);
            return;
        }
        bop bop2 = bok2.lp(bok2.asy());
        if (bop2 == null) {
            lfn.b(5, "SFActiveQuestManager", "registerKillQuestTargets() CurrentSimpleQuest for Number " + bok2.asy() + " is NULL");
            assert (false);
            return;
        }
        dud dud2 = dud.getValueByOrdinal(bop2.asH());
        switch (dud2) {
            case hdN: {
                bol bol2 = (bol)bop2;
                Map<Integer, Integer> map = bol2.asW();
                int[] nArray = new int[map.size()];
                int n = 0;
                Object object = map.keySet().iterator();
                while (object.hasNext()) {
                    int n2;
                    nArray[n] = n2 = object.next().intValue();
                    ++n;
                }
                object = (gdd)this.MessageDelegator.h(10262, this.getGUID(), bok2.asz());
                ((gdd)object).ap(nArray);
                ((gdd)object).iy(bok2.asw());
                ((gdd)object).qd(bok2.asA());
                ((gdd)object).IP(1);
                ((gdd)object).IQ(dud.hdN.ordinal());
                this.MessageDelegator.F((dxq)object);
                break;
            }
            case hdP: {
                bon bon2 = (bon)bop2;
                Map<Integer, Integer> map = bon2.asW();
                int[] nArray = new int[map.size()];
                int n = 0;
                Object object = map.keySet().iterator();
                while (object.hasNext()) {
                    int n3;
                    nArray[n] = n3 = object.next().intValue();
                    ++n;
                }
                object = (gdd)this.MessageDelegator.h(10262, this.getGUID(), bok2.asz());
                ((gdd)object).ap(nArray);
                ((gdd)object).iy(bok2.asw());
                ((gdd)object).qd(bok2.asA());
                ((gdd)object).IP(1);
                ((gdd)object).IQ(dud.hdP.ordinal());
                ((gdd)object).lI(bok2.asF());
                this.MessageDelegator.F((dxq)object);
                break;
            }
            case hdQ: {
                boo boo2 = (boo)bop2;
                Map<Integer, Integer> map = boo2.asW();
                int[] nArray = new int[map.size()];
                int n = 0;
                Object object = map.keySet().iterator();
                while (object.hasNext()) {
                    int n4;
                    nArray[n] = n4 = object.next().intValue();
                    ++n;
                }
                object = (gdd)this.MessageDelegator.h(10262, this.getGUID(), bok2.asz());
                ((gdd)object).ap(nArray);
                ((gdd)object).iy(bok2.asw());
                ((gdd)object).qd(bok2.asA());
                ((gdd)object).IP(1);
                ((gdd)object).IQ(dud.hdQ.ordinal());
                this.MessageDelegator.F((dxq)object);
                break;
            }
            case hdS: {
                bos bos2 = (bos)bop2;
                int n = bos2.ata();
                int n5 = bos2.atb();
                gdd gdd2 = (gdd)this.MessageDelegator.h(10262, this.getGUID(), bok2.asz());
                gdd2.eI(n);
                gdd2.ap(new int[]{n5});
                gdd2.iy(bok2.asw());
                gdd2.qd(bok2.asA());
                gdd2.IP(1);
                gdd2.IQ(dud.hdS.ordinal());
                this.MessageDelegator.F(gdd2);
                break;
            }
            case hdO: {
                this.dyk.g(bok2);
                break;
            }
            default: {
                assert (false) : "Unhandling quest type :" + (Object)((Object)dud2);
                break;
            }
        }
    }

    public void a(bok bok2, ldv ldv2, int[] nArray, int[] nArray2, gdl gdl2) {
        this.dyl.b(bok2, ldv2, nArray, nArray2, gdl2);
    }

    public void ik(ldv ldv2) {
        lfs<bok, ldv> lfs2 = this.dyj.get(ldv2);
        if (lfs2 == null) {
            assert (false);
            return;
        }
        bok bok2 = lfs2.getFirst();
        if (bok2 == null) {
            assert (false);
            return;
        }
        this.dyk.h(bok2);
    }

    public void il(ldv ldv2) {
        lfs<bok, ldv> lfs2 = this.dyj.get(ldv2);
        if (lfs2 == null) {
            lfn.b(5, "SFActiveQuestManager", "setActiveQuestSolved() No active quest with guid " + ldv2);
            assert (false);
            return;
        }
        bok bok2 = lfs2.getFirst();
        if (bok2 == null) {
            lfn.b(5, "SFActiveQuestManager", "setActiveQuestSolved() Pair null for quest with guid " + ldv2);
            assert (false);
            return;
        }
        bop bop2 = bok2.lp(bok2.asy());
        if (bop2 == null) {
            lfn.b(5, "SFActiveQuestManager", "setActiveQuestSolved() No simple quest for quest guid " + ldv2 + " with index :" + bok2.asy());
            assert (false);
            return;
        }
        bop2.dC(true);
    }

    public void a(bok bok2, ldv ldv2, String string, int n, int n2) {
        if (bok2 == null) {
            lfn.b(5, "SFActiveQuestManager", "sendSetQuestStateToActiveMessage() Complex Quest NULL.");
            assert (false);
            return;
        }
        bop bop2 = bok2.lp(bok2.asy());
        if (bop2 == null) {
            lfn.b(5, "SFActiveQuestManager", "sendSetQuestStateToActiveMessage() No simple quest for quest guid " + bok2.asB() + " with index :" + bok2.asy());
            assert (false);
            return;
        }
        boolean bl2 = bop2.asH() == dud.hdQ.ordinal() && bop2.asT();
        int n3 = bok2.asB().enx();
        ldv ldv3 = bok2.asw();
        gdf gdf2 = (gdf)this.MessageDelegator.h(10244, this.getGUID(), bok2.asz());
        gdf2.IS(n3);
        gdf2.qe(ldv3);
        gdf2.qf(ldv2);
        gdf2.lJ(bl2);
        gdf2.fS(string);
        gdf2.IR(n2);
        gdf2.IT(n);
        this.MessageDelegator.F(gdf2);
    }

    public void e(int n, ldv ldv2, ldv ldv3) {
        gdf gdf2 = (gdf)this.MessageDelegator.h(10244, this.getGUID(), ldv3);
        gdf2.IS(n);
        gdf2.qf(ldv2);
        gdf2.IR(5);
        this.MessageDelegator.F(gdf2);
    }

    public void f(int n, ldv ldv2, ldv ldv3) {
        gdf gdf2 = (gdf)this.MessageDelegator.h(10244, this.getGUID(), ldv3);
        gdf2.IS(n);
        gdf2.qf(ldv2);
        gdf2.IR(6);
        this.MessageDelegator.F(gdf2);
    }

    public void a(bok bok2, ldv ldv2, String string, ldv ldv3) {
        if (bok2 == null) {
            lfn.b(5, "SFActiveQuestManager", "sendSetComplexQuestActiveIndexMessage() Complex Quest NULL.");
            assert (false);
            return;
        }
        bop bop2 = bok2.lp(bok2.asy());
        if (bop2 == null) {
            lfn.b(5, "SFActiveQuestManager", "sendSetComplexQuestActiveIndexMessage() No simple quest for quest guid " + bok2.asB() + " with index :" + bok2.asy());
            assert (false);
            return;
        }
        boolean bl2 = bop2.asH() == dud.hdQ.ordinal() && bop2.asT();
        gde gde2 = (gde)this.MessageDelegator.h(10253, this.getGUID(), ldv3);
        gde2.azg = bok2.asB().enx();
        gde2.jed = bok2.asy();
        gde2.ayB = string;
        gde2.jee = bl2;
        gde2.jec = ldv2;
        gde2.ComplexQuestGUID = bok2.asw();
        this.MessageDelegator.F(gde2);
    }

    public void c(bok bok2) {
        this.a(bok2, true);
    }

    public void D(ldv ldv2, ldv ldv3) {
        lfs<bok, ldv> lfs2 = this.dyj.remove(ldv2);
        if (lfs2 == null) {
            lfn.b(5, "SFActiveQuestManager", "deregisterComplexQuest() There is no entry in Active Map For ComplexQuestGUID " + ldv2 + " For PlayerGUID " + ldv3);
            return;
        }
        bok bok2 = lfs2.getFirst();
        if (bok2 == null) {
            lfn.b(5, "SFActiveQuestManager", "deregisterComplexQuest() ERROR Quest for ComplexQuestGUID " + ldv2 + " for PlayerGUID " + ldv3 + " is NULL");
            return;
        }
    }

    public void im(ldv ldv2) {
        lfs<bok, ldv> lfs2 = this.dyj.get(ldv2);
        if (lfs2 == null) {
            lfn.b(5, "SFActiveQuestManager", "removeCurrentSubQuestAnnotations() There is no Active Quest With GUID " + ldv2);
            return;
        }
        bok bok2 = lfs2.getFirst();
        if (bok2 == null) {
            lfn.b(5, "SFActiveQuestManager", "removeCurrentSubQuestAnnotations() Active Quest With GUID " + ldv2 + " is NULL!!!");
            return;
        }
        this.e(bok2);
    }

    private void a(List<dub> list, bok bok2) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (dub dub2 : list) {
            if (!dub2.Visible) {
                return;
            }
            ldv ldv2 = bok2.asB();
            dty dty2 = this.dyi.get(ldv2);
            due due2 = dty2.Ce(bok2.asy());
            assert (dub2.Caption != null);
            assert (dub2.Position != null);
            if (dub2.Caption == null || dub2.Position == null || dub2.Type == -1 || dub2.Type == 0) continue;
            eaa eaa2 = (eaa)this.MessageDelegator.h(22785, this.getGUID(), bok2.asz());
            eaa2.Position = dub2.Position;
            eaa2.ResourceType = cug.uO((int)dub2.Type);
            eaa2.aFo = dub2.Caption;
            eaa2.aFp = false;
            eaa2.aqs = this.dyo;
            this.MessageDelegator.F(eaa2);
            this.dyn.put(this.dyo, new lfs<Integer, Integer>(due2.ID, bok2.asB().enx()));
            ++this.dyo;
        }
    }

    private void d(bok bok2) {
        if (bok2 == null) {
            lfn.b(5, "SFActiveQuestManager", "removeTargetRewardSubQuestAnnotation() Complex Quest NULL.");
            assert (false);
            return;
        }
        ldv ldv2 = bok2.asB();
        dty dty2 = this.dyi.get(ldv2);
        if (dty2 == null) {
            lfn.b(5, "SFActiveQuestManager", "removeTargetRewardSubQuestAnnotation() ComplexQuestDef NULL.");
            assert (false);
            return;
        }
        due due2 = dty2.Ce(bok2.asy());
        if (due2 == null) {
            lfn.b(5, "SFActiveQuestManager", "removeTargetRewardSubQuestAnnotation() SimpleDef NULL.");
            assert (false);
            return;
        }
        if (!this.dym.isEmpty()) {
            for (ldv ldv3 : this.dym.keySet()) {
                Map<Integer, lil<Integer, Integer, Integer>> map = this.dym.get(ldv3);
                if (map == null || map.isEmpty()) continue;
                for (Integer n : map.keySet()) {
                    lil<Integer, Integer, Integer> lil2 = map.get(n);
                    int n2 = lil2.getFirst();
                    int n3 = lil2.esw();
                    int n4 = lil2.eqz();
                    bpk bpk2 = cug.uZ((int)n4);
                    if (!ldv3.equals(bok2.asz()) || n2 != due2.ID || n3 != bok2.asB().enx() || bpk2 != bpk.dzP) continue;
                    this.a(n, n2, n3, ldv3);
                    return;
                }
            }
        }
    }

    private void a(int n, int n2, int n3, ldv ldv2) {
        eae eae2 = (eae)this.MessageDelegator.h(22786, this.getGUID(), ldv2);
        eae2.iks = n;
        eae2.aqs = this.dyo;
        this.MessageDelegator.F(eae2);
        this.dyn.put(this.dyo, new lfs<Integer, Integer>(n2, n3));
        ++this.dyo;
    }

    private void e(bok bok2) {
        if (this.dym.isEmpty()) {
            return;
        }
        if (bok2 == null) {
            lfn.b(5, "SFActiveQuestManager", "removeAnnotationsFromMap() Complex Quest NULL.");
            assert (false);
            return;
        }
        ldv ldv2 = bok2.asB();
        dty dty2 = this.dyi.get(ldv2);
        if (dty2 == null) {
            lfn.b(5, "SFActiveQuestManager", "removeAnnotationsFromMap() ComplexQuestDef For ComplexQDefGUID " + ldv2 + " is NULL!!!");
            return;
        }
        due due2 = dty2.Ce(bok2.asy());
        if (due2 == null) {
            lfn.b(5, "SFActiveQuestManager", "removeAnnotationsFromMap() SimpleDef For Number " + bok2.asy() + " And for ComplexQDefGUID " + ldv2 + " is NULL!!!");
            return;
        }
        for (Map.Entry<ldv, Map<Integer, lil<Integer, Integer, Integer>>> entry : this.dym.entrySet()) {
            ldv ldv3 = entry.getKey();
            Map<Integer, lil<Integer, Integer, Integer>> map = entry.getValue();
            for (Map.Entry<Integer, lil<Integer, Integer, Integer>> entry2 : map.entrySet()) {
                boolean bl2;
                Integer n = entry2.getKey();
                lil<Integer, Integer, Integer> lil2 = entry2.getValue();
                int n2 = lil2.getFirst();
                int n3 = lil2.esw();
                int n4 = lil2.eqz();
                bpk bpk2 = cug.uZ((int)n4);
                boolean bl3 = bpk2 == bpk.dzP;
                boolean bl4 = n3 == bok2.asB().enx();
                boolean bl5 = bl2 = n2 == due2.ID;
                boolean bl6 = ldv3.equals(bok2.asz());
                if (!bl6 || !bl2 || !bl4 || bl3) continue;
                this.a(n, n2, n3, ldv3);
            }
        }
    }

    private void a(eaf eaf2) {
        ldv ldv2 = eaf2.aO();
        int n = eaf2.ex;
        int n2 = eaf2.aqs;
        if (!this.dyn.containsKey(n2)) {
            lfn.b(5, "SFActiveQuestManager", "handleAnnotationResponseMessage MessageTag [" + n2 + "] Unknown");
            return;
        }
        lfs<Integer, Integer> lfs2 = this.dyn.remove(n2);
        int n3 = (Integer)lfs2.reX;
        int n4 = (Integer)lfs2.reY;
        switch (n) {
            case 2: {
                if (this.dym.containsKey(ldv2)) {
                    this.dym.get(ldv2).put(eaf2.Zn[0].ID, new lil<Integer, Integer, Integer>(n3, eaf2.Zn[0].ResourceType, n4));
                } else {
                    Map<Integer, lil<Integer, Integer, Integer>> map = lcn.emw();
                    map.put(eaf2.Zn[0].ID, new lil<Integer, Integer, Integer>(n3, eaf2.Zn[0].ResourceType, n4));
                    this.dym.put(eaf2.aO(), map);
                }
                return;
            }
            case 4: {
                lfn.b(5, "SFActiveQuestManager", "handleAnnotationResponseMessage Add Annotation [" + n2 + "] Failed");
                return;
            }
            case 3: {
                if (!this.dym.isEmpty()) {
                    Map<Integer, lil<Integer, Integer, Integer>> map = this.dym.get(ldv2);
                    map.remove(eaf2.Zn[0].ID);
                    if (map.isEmpty()) {
                        this.dym.remove(ldv2);
                    }
                }
                return;
            }
            case 5: {
                if (n == 5) {
                    lfn.b(5, "SFActiveQuestManager", "handleAnnotationResponseMessage Remove Annotation [" + n2 + "] Failed");
                    return;
                }
                return;
            }
        }
        lfn.b(5, "SFActiveQuestManager", "handleAnnotationResponseMessage Unknown Response Type [" + n + "]");
        assert (false) : "Unknown Response Type [" + n + "]";
    }

    private List<dub> a(bok bok2, int n) {
        if (bok2 == null) {
            lfn.b(5, "SFActiveQuestManager", "findAppropriateMarker() Complex Quest NULL.");
            assert (false);
            return null;
        }
        if (!bpk.isValidOrdinal(n)) {
            lfn.b(5, "SFActiveQuestManager", "findAppropriateMarker Invalid Marker Type [" + n + "]");
            return null;
        }
        ldv ldv2 = bok2.asB();
        dty dty2 = this.dyi.get(ldv2);
        due due2 = dty2.Ce(bok2.asy());
        return due2.Co(n);
    }

    private List<dub> f(bok bok2) {
        if (bok2 == null) {
            lfn.b(5, "SFActiveQuestManager", "findMarkers() Complex Quest NULL.");
            assert (false);
            return null;
        }
        ldv ldv2 = bok2.asB();
        dty dty2 = this.dyi.get(ldv2);
        if (dty2 == null) {
            lfn.b(5, "SFActiveQuestManager", "findMarkers() ComplexQuestDef NULL.");
            assert (false);
            return null;
        }
        due due2 = dty2.Ce(bok2.asy());
        if (due2 == null) {
            lfn.b(5, "SFActiveQuestManager", "findMarkers() SimpleDef NULL.");
            assert (false);
            return null;
        }
        return due2.bAW();
    }

    public boolean a(gdl gdl2) {
        ldv ldv2 = gdl2.nS();
        ldv ldv3 = gdl2.qH();
        assert (ldv2 != null);
        assert (ldv3 != null);
        if (this.dyp.containsKey(ldv3)) {
            return false;
        }
        lfs<bok, ldv> lfs2 = this.dyj.get(ldv3);
        if (lfs2 == null) {
            lfn.b(5, "SFActiveQuestManager", "verifyTargetQuestMessage() Quest :" + ldv3 + " For target vendor : " + ldv2 + " Its not an ACTIVE QUEST!!!");
            assert (false);
            return false;
        }
        bok bok2 = lfs2.getFirst();
        if (bok2 == null) {
            lfn.b(5, "SFActiveQuestManager", "verifyTargetQuestMessage() COULD NOT FIND QUEST IN THE ACTIVE QUESTS. CAN NOT HAPPEN");
            assert (false);
            return false;
        }
        bop bop2 = bok2.lp(bok2.asy());
        if (bop2 == null) {
            lfn.b(5, "SFActiveQuestManager", "verifyTargetQuestMessage() Quest For Number " + bok2.asy() + " is NULL!!!!");
            assert (false);
            return false;
        }
        if (bop2.asS()) {
            lfn.b(5, "SFActiveQuestManager", "verifyTargetQuestMessage() This Quest is already solved!");
            return false;
        }
        ldv ldv4 = bop2.asN();
        if (ldv4 == null) {
            lfn.b(5, "SFActiveQuestManager", "verifyTargetQuestMessage() TargetQuestVendorGUID " + ldv4 + " is NULL!!!");
            assert (false);
            return false;
        }
        if (!ldv4.equals(ldv2)) {
            return false;
        }
        assert (dud.isValidOrdinal(bop2.asH())) : "Can not happen.Update Code";
        dud dud2 = dud.getValueByOrdinal(bop2.asH());
        switch (dud2) {
            case hdR: 
            case hdO: {
                return true;
            }
            case hdQ: {
                boo boo2 = (boo)bop2;
                if (!boo2.asM()) {
                    lfn.b(5, "SFActiveQuestManager", "verifyTargetQuestMessage() Got a target verify for kill, but it wasn't finished");
                    return false;
                }
                return true;
            }
            case hdS: {
                bos bos2 = (bos)bop2;
                if (!bos2.asZ()) {
                    lfn.b(5, "SFActiveQuestManager", "verifyTargetQuestMessage() Got a Use Object Verify Message, but it wasn't finished");
                    return false;
                }
                return true;
            }
            case hdP: {
                bon bon2 = (bon)bop2;
                if (!bon2.asX()) {
                    lfn.b(5, "SFActiveQuestManager", "verifyTargetQuestMessage() Got a Gather Object Verify Message, but it wasn't finished");
                    return false;
                }
                return true;
            }
            case hdN: {
                bol bol2 = (bol)bop2;
                if (!bol2.asX()) {
                    lfn.b(5, "SFActiveQuestManager", "verifyTargetQuestMessage() Got a Create Object Verify Message, but it wasn't finished");
                    return false;
                }
                return true;
            }
        }
        lfn.b(5, "SFActiveQuestManager", "verifyTargetQuestMessage() Unknown quest type! UPDATE CODE");
        assert (false);
        return true;
    }

    public void E(ldv ldv2, ldv ldv3) {
        this.dyp.put(ldv2, ldv3);
    }

    public void in(ldv ldv2) {
        ldv ldv3 = this.dyp.remove(ldv2);
        if (ldv3 == null) {
            lfn.b(5, "SFActiveQuestManager", "removeQuestFromVerificationProcess QuestGUID : " + ldv2 + " was not in verification process list");
        }
    }

    public boolean J(ldv ldv2, int n) {
        assert (ldv2 != null);
        lfs<bok, ldv> lfs2 = this.dyj.get(ldv2);
        if (lfs2 == null) {
            lfn.b(5, "SFActiveQuestManager", "verifyQuestMessage() No Entry For QuestGUID [" + ldv2 + "]");
            assert (false);
            return false;
        }
        bok bok2 = lfs2.getFirst();
        if (bok2 == null) {
            lfn.b(5, "SFActiveQuestManager", "verifyQuestMessage() COULD NOT FIND QUEST IN THE ACTIVE QUESTS. CAN NOT HAPPEN");
            assert (false);
            return false;
        }
        bop bop2 = bok2.lp(bok2.asy());
        if (bop2 == null) {
            lfn.b(5, "SFActiveQuestManager", "verifyQuestMessage() QuestNumber [" + bok2.asy() + "] In Complex Quest [" + bok2.qM() + "] Doesn't Exist");
            assert (false);
            return false;
        }
        if (bop2.asS()) {
            lfn.b(5, "SFActiveQuestManager", "verifyQuestMessage() This Quest is already solved!");
            return false;
        }
        return true;
    }

    public boolean io(ldv ldv2) {
        lfs<bok, ldv> lfs2 = this.dyj.get(ldv2);
        if (lfs2 == null) {
            lfn.b(5, "SFActiveQuestManager", "isLastQuest() COULD NOT FIND QUEST IN THE ACTIVE QUESTS. CAN NOT HAPPEN");
            assert (false);
            return true;
        }
        bok bok2 = lfs2.getFirst();
        if (bok2 == null) {
            lfn.b(5, "SFActiveQuestManager", "isLastQuest() Complex Quest NULL.");
            assert (false);
            return false;
        }
        int n = bok2.asy();
        return ++n >= bok2.asv();
    }

    public boolean ip(ldv ldv2) {
        lfs<bok, ldv> lfs2 = this.dyj.get(ldv2);
        if (lfs2 == null) {
            lfn.b(5, "SFActiveQuestManager", "advanceQuest() COULD NOT FIND QUEST IN THE ACTIVE QUESTS. CAN NOT HAPPEN");
            assert (false);
            return true;
        }
        bok bok2 = lfs2.getFirst();
        if (bok2 == null) {
            lfn.b(5, "SFActiveQuestManager", "advanceQuest() COULD NOT FIND QUEST IN THE ACTIVE QUESTS. CAN NOT HAPPEN");
            assert (false);
            return false;
        }
        int n = bok2.asy();
        if (++n >= bok2.asv()) {
            return false;
        }
        bok2.lo(n);
        return true;
    }

    public bok iq(ldv ldv2) {
        lfs<bok, ldv> lfs2 = this.dyj.get(ldv2);
        if (lfs2 == null) {
            lfn.b(5, "SFActiveQuestManager", "getComplexQuest() No Entry For QuestGUID " + ldv2);
            assert (false);
            return null;
        }
        bok bok2 = lfs2.getFirst();
        return bok2;
    }

    public void a(bok bok2, ldv ldv2, boolean bl2) {
        if (bok2 == null) {
            lfn.b(5, "SFActiveQuestManager", "registerTheTargetVendor() ComplexQuest is NULL");
            assert (false);
            return;
        }
        ldv ldv3 = bok2.asA();
        gdk gdk2 = (gdk)this.MessageDelegator.h(10243, this.getGUID(), bok2.asz());
        gdk2.qd(ldv3);
        gdk2.iy(bok2.asw());
        gdk2.qg(ldv2);
        gdk2.IV(1);
        this.MessageDelegator.F(gdk2);
        if (bl2) {
            List<dub> list = this.a(bok2, bpk.dzP.ordinal());
            if (list == null) {
                lfn.b(5, "SFActiveQuestManager", "registerTheTargetVendor() Target Reward Marker Doesn't EXIST!!!!!");
                return;
            }
            if (list.isEmpty()) {
                lfn.b(5, "SFActiveQuestManager", "registerTheTargetVendor() Target Reward Marker Doesn't EXIST. List is empty");
                return;
            }
            this.a(list, bok2);
        }
    }

    public void a(bok bok2, ldv ldv2) {
        if (bok2 == null) {
            lfn.b(5, "SFActiveQuestManager", "unregisterTheTargetVendor() ComplexQuest is NULL");
            assert (false);
            return;
        }
        ldv ldv3 = bok2.asA();
        gdk gdk2 = (gdk)this.MessageDelegator.h(10243, this.getGUID(), bok2.asz());
        gdk2.qd(ldv3);
        gdk2.iy(bok2.asw());
        gdk2.qg(ldv2);
        gdk2.IV(2);
        this.MessageDelegator.F(gdk2);
        this.d(bok2);
    }

    public void a(bop bop2, bok bok2) {
        if (bok2 == null) {
            lfn.b(5, "SFActiveQuestManager", "cleanComplexQuestInfoFromSystem() ComplexQuest is NULL");
            assert (false);
            return;
        }
        if (bop2 == null) {
            lfn.b(5, "SFActiveQuestManager", "cleanComplexQuestInfoFromSystem() CurrentActiveQuest is NULL");
            assert (false);
            return;
        }
        ldv ldv2 = bok2.asw();
        ldv ldv3 = bok2.asz();
        if (bop2.asH() == dud.hdO.ordinal()) {
            this.ik(ldv2);
        }
        if (bop2.asU()) {
            this.a(bok2, bop2.asN());
        }
        this.im(ldv2);
        this.D(ldv2, ldv3);
        this.in(ldv2);
    }

    public void ir(ldv ldv2) {
        Map<Integer, lil<Integer, Integer, Integer>> map = this.dym.remove(ldv2);
        if (map == null) {
            return;
        }
        ArrayList<Integer> arrayList = lcn.emv();
        block8: for (Map.Entry<Integer, lil<Integer, Integer, Integer>> entry : map.entrySet()) {
            dty dty2;
            lil<Integer, Integer, Integer> lil2 = entry.getValue();
            int n = (Integer)lil2.reX;
            int n2 = (Integer)lil2.reZ;
            if (arrayList.contains(n) || (dty2 = lea.eoU().Cf(n2)) == null) continue;
            ldv ldv3 = dty2.bAE();
            for (lfs<bok, ldv> lfs2 : this.dyj.values()) {
                bok bok2 = (bok)lfs2.reX;
                if (!bok2.asB().equals(ldv3) || !ldv2.equals(bok2.asz())) continue;
                arrayList.add(n);
                bop bop2 = bok2.lp(bok2.asy());
                int n3 = bop2.asH();
                assert (dud.isValidOrdinal(n3));
                switch (dud.getValueByOrdinal(n3)) {
                    case hdR: {
                        this.a(this.a(bok2, bpk.dzQ.ordinal()), bok2);
                        continue block8;
                    }
                    case hdO: {
                        this.a(this.a(bok2, bpk.dzR.ordinal()), bok2);
                        continue block8;
                    }
                    case hdQ: {
                        if (!bop2.asU()) {
                            this.a(this.f(bok2), bok2);
                            continue block8;
                        }
                        this.a(this.a(bok2, bpk.dzP.ordinal()), bok2);
                        continue block8;
                    }
                    case hdS: {
                        if (!bop2.asU()) {
                            this.a(this.f(bok2), bok2);
                            continue block8;
                        }
                        this.a(this.a(bok2, bpk.dzP.ordinal()), bok2);
                        continue block8;
                    }
                    case hdP: {
                        if (!bop2.asU()) {
                            this.a(this.f(bok2), bok2);
                            continue block8;
                        }
                        this.a(this.a(bok2, bpk.dzP.ordinal()), bok2);
                        continue block8;
                    }
                    case hdN: {
                        if (!bop2.asU()) continue block8;
                        this.a(this.a(bok2, bpk.dzP.ordinal()), bok2);
                        continue block8;
                    }
                }
                continue block8;
            }
        }
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            super.initialize();
            this.dyk = new bou(this);
            this.dyl = new box(this, this.dyh);
            this.dyk.setGUID(this.MessageDelegator.bzv());
            this.dyl.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.dyk);
            this.MessageDelegator.a(this.dyl);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 22788: {
                this.a((eaf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    public Map<ldv, lfs<bok, ldv>> atc() {
        return this.dyj;
    }

    public void v(Map<ldv, dty> map) {
        this.dyi = map;
    }

    @Override
    public void setScheduledForRemoval() {
        this.MessageDelegator.hd(this.dyk.getGUID());
        this.MessageDelegator.hd(this.dyl.getGUID());
    }
}

