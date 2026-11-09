/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ari
 *  cug
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class mwm {
    private static final String TC = "SFQuestDefinitionValidationManager";

    public void eRE() {
        dua dua2 = lea.eoU();
        Map<Integer, dty> map = dua2.bAL();
        ArrayList<Integer> arrayList = null;
        for (dty dty2 : map.values()) {
            if (this.b(dty2)) continue;
            if (arrayList == null) {
                arrayList = lcn.emv();
            }
            arrayList.add(dty2.ID);
        }
        if (arrayList != null) {
            Iterator<dty> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                int n = (Integer)((Object)iterator.next());
                dua2.Cl(n);
            }
        }
    }

    private boolean b(dty dty2) {
        String string = dty2.Name;
        String string2 = dty2.FactionAvatar;
        int[] nArray = dty2.SubQuestIDs;
        String string3 = dty2.TileLocation;
        String string4 = dty2.Filename;
        if (string4 == null || string4.trim().equals("")) {
            lfn.b(5, TC, "isComplexQuestValid() *********************************************************************.");
            lfn.b(5, TC, "isComplexQuestValid() Filename for quest " + string + " not set.");
            return false;
        }
        if (string == null || string.trim().equals("")) {
            lfn.b(5, TC, "isComplexQuestValid() *********************************************************************.");
            lfn.b(5, TC, "isComplexQuestValid() Name for quest " + string4 + " not set.");
            return false;
        }
        if (string2 == null || string2.trim().equals("")) {
            lfn.b(5, TC, "isComplexQuestValid() *********************************************************************.");
            lfn.b(5, TC, "isComplexQuestValid() Faction avatar for quest " + string + " not set.");
            return false;
        }
        if (string3 == null || string3.trim().equals("")) {
            lfn.b(5, TC, "isComplexQuestValid() *********************************************************************.");
            lfn.b(5, TC, "isComplexQuestValid() Tile location for quest " + string + " not set.");
            return false;
        }
        if (!lea.eoS().containsKey(string3.toLowerCase())) {
            lfn.b(5, TC, "isComplexQuestValid() *********************************************************************.");
            lfn.b(5, TC, "isComplexQuestValid() Tile location for quest " + string + " not valid.");
            return false;
        }
        if (dty2.HighScoreRecording) {
            if (dty2.bAF().size() != 1) {
                lfn.b(5, TC, "isComplexQuestValid() *********************************************************************.");
                lfn.b(5, TC, "isComplexQuestValid() Highscore enabled quest [" + dty2.Name + "] contains more than one subquest");
                return false;
            }
            Object object = dty2.bAF().get(0);
            if (((due)object).Type != dud.hdQ) {
                lfn.b(5, TC, "isComplexQuestValid() *********************************************************************.");
                lfn.b(5, TC, "isComplexQuestValid() Highscore enabled quest [" + dty2.Name + "] with subquest different than a kill quest");
                return false;
            }
            int[] nArray2 = ((due)object).bAS();
            if (nArray2 == null || nArray2.length != 1) {
                lfn.b(5, TC, "isComplexQuestValid() *********************************************************************.");
                lfn.b(5, TC, "isComplexQuestValid() Highscore enabled quest [" + dty2.Name + "] contains a kill quest with no targets or more than one targets");
                return false;
            }
            if (((due)object).bAO() == null || ((due)object).bAO().trim().equals("")) {
                lfn.b(5, TC, "isComplexQuestValid() *********************************************************************.");
                lfn.b(5, TC, "isComplexQuestValid() Highscore enabled quest [" + dty2.Name + "] contains a kill quest with no time limit");
                return false;
            }
        }
        if (nArray == null || nArray.length == 0) {
            lfn.b(5, TC, "isComplexQuestValid() *********************************************************************.");
            lfn.b(5, TC, "isComplexQuestValid() No subquests for quest " + string + ".");
            return false;
        }
        for (int n : nArray) {
            due due2 = lea.eoU().Cg(n);
            if (due2 != null && this.c(due2)) continue;
            String string5 = due2 != null ? due2.Name : String.valueOf(n);
            lfn.b(5, TC, "isComplexQuestValid() *********************************************************************.");
            lfn.b(5, TC, "isComplexQuestValid() Sub quest " + string5 + " not valid for complex quest " + string + ".");
            return false;
        }
        return true;
    }

    private boolean c(due due2) {
        dud dud2 = due2.Type;
        if (!this.d(due2)) {
            return false;
        }
        if (!this.e(due2)) {
            return false;
        }
        if (!this.f(due2)) {
            return false;
        }
        if (!this.g(due2)) {
            return false;
        }
        if (due2.asP() && due2.Type != dud.hdS && due2.Type != dud.hdQ) {
            lfn.b(5, TC, "isSimpleQuestValid() *********************************************************************.");
            lfn.b(5, TC, "isSimpleQuestValid() Chain quest " + due2.Name + " is not a kill or a use skill on object quest.");
            return false;
        }
        due2.jJ(false);
        if (!this.m(due2)) {
            return false;
        }
        switch (dud2) {
            case hdO: {
                if (this.a(due2.bAS(), due2.Name)) break;
                return false;
            }
            case hdR: {
                break;
            }
            case hdN: {
                if (this.h(due2)) break;
                return false;
            }
            case hdQ: {
                if (this.i(due2)) break;
                return false;
            }
            case hdP: {
                if (this.j(due2)) break;
                return false;
            }
            case hdS: {
                if (!this.k(due2)) {
                    return false;
                }
                if (this.l(due2)) break;
                return false;
            }
            default: {
                return false;
            }
        }
        return true;
    }

    private boolean d(due due2) {
        int n = due2.ID;
        String string = due2.Filename;
        String string2 = due2.Name;
        String string3 = due2.QuestDiaryText;
        if (string == null || string.trim().equals("")) {
            lfn.b(5, TC, "checkSimpleQuestBasicStructure() *********************************************************************.");
            lfn.b(5, TC, "checkSimpleQuestBasicStructure() Filename for quest " + string2 + " not set.");
            return false;
        }
        if (string2 == null || string2.trim().equals("")) {
            lfn.b(5, TC, "checkSimpleQuestBasicStructure() *********************************************************************.");
            lfn.b(5, TC, "checkSimpleQuestBasicStructure() Name for quest " + string + " not set.");
            return false;
        }
        if (string3 == null || string3.trim().equals("")) {
            lfn.b(5, TC, "checkSimpleQuestBasicStructure() *********************************************************************.");
            lfn.b(5, TC, "checkSimpleQuestBasicStructure() Quest Diary for quest " + string2 + " not set.");
            return false;
        }
        if (!this.ag(n, string2)) {
            lfn.b(5, TC, "checkSimpleQuestBasicStructure() *********************************************************************.");
            lfn.b(5, TC, "checkSimpleQuestBasicStructure() Sub quest is a child to another complex quest also for quest " + string2 + ".");
            return false;
        }
        return true;
    }

    private boolean e(due due2) {
        dtz.b[] bArray = due2.Rewards;
        if (bArray == null || bArray.length == 0) {
            return true;
        }
        for (dtz.b b2 : bArray) {
            String string = b2.ResourceName;
            float f2 = b2.Amount;
            float f3 = b2.Probability;
            if (lea.enW().getType(string) == -1) {
                lfn.b(5, TC, "checkRewards() *********************************************************************.");
                lfn.b(5, TC, "checkRewards() Reward for quest " + due2.Name + " not valid.");
                lfn.b(5, TC, "checkRewards() 1) Reward Name : " + string + " Amount :" + f2 + " Probability : " + f3);
                return false;
            }
            if (f2 > 0.0f && !(f3 < 0.0f) && !(f3 > 1.0f)) continue;
            lfn.b(5, TC, "checkRewards() *********************************************************************.");
            lfn.b(5, TC, "checkRewards() Reward  for quest " + due2.Name + " not valid.");
            lfn.b(5, TC, "checkRewards() 2) Reward Name : " + string + " Amount :" + f2 + " Probability : " + f3);
            return false;
        }
        return true;
    }

    private boolean f(due due2) {
        String string = due2.TileLocation;
        if (string == null || string.trim().equals("")) {
            lfn.b(5, TC, "checkQuestTileLocation() *********************************************************************.");
            lfn.b(5, TC, "checkQuestTileLocation() Tile location " + due2.Name + " not set.");
            return false;
        }
        if (!lea.eoS().containsKey(string.toLowerCase())) {
            lfn.b(5, TC, "checkQuestTileLocation() *********************************************************************.");
            lfn.b(5, TC, "checkQuestTileLocation() Tile location " + string.toLowerCase() + " For Quest " + due2.Name + " not valid.");
            return false;
        }
        return true;
    }

    private boolean g(due due2) {
        String string = due2.QuestEndNpcName;
        if (due2.asP() && (due2.Type.ordinal() == dud.hdS.ordinal() || due2.Type.ordinal() == dud.hdQ.ordinal())) {
            if (string != null && !string.trim().equals("")) {
                lfn.b(5, TC, "checkTargetVendor() *********************************************************************.");
                lfn.b(5, TC, "checkTargetVendor() Chain Kill/Use skill quest with target vendor " + string + " for " + due2.Name + ".");
                return false;
            }
            return true;
        }
        if (string == null || string.trim().equals("")) {
            lfn.b(5, TC, "checkTargetVendor() *********************************************************************.");
            lfn.b(5, TC, "checkTargetVendor() Target vendor " + due2.Name + " not set.");
            return false;
        }
        if (due2.NonAliveTarget) {
            Map<String, mwu> map = lea.eph();
            if (!map.containsKey(string)) {
                lfn.b(5, TC, "checkTargetVendor() *********************************************************************.");
                lfn.b(5, TC, "checkTargetVendor() World quest object " + string + " for quest " + due2.Name + " not set in Darkfall.");
                return false;
            }
            ljq ljq2 = mws.DT(string);
            if (ljq2 == null) {
                lfn.b(5, TC, "checkTargetVendor() *********************************************************************.");
                lfn.b(5, TC, "checkTargetVendor() World quest object " + string + " position null for quest " + due2.Name + ".");
                return false;
            }
        } else {
            ljq ljq3 = mws.DR(string);
            if (ljq3 == null) {
                lfn.b(5, TC, "checkTargetVendor() *********************************************************************.");
                lfn.b(5, TC, "checkTargetVendor() Target vendor " + string + " position null for quest " + due2.Name + ".");
                return false;
            }
        }
        return true;
    }

    private boolean a(int[] nArray, String string) {
        for (int i = 0; i < nArray.length; ++i) {
            if (lea.enW().isDescendant(nArray[i], cug.fks)) continue;
            lfn.b(5, TC, "checkQuestItem() *********************************************************************.");
            lfn.b(5, TC, "checkQuestItem() Delivery quest item invalid " + string + ".");
        }
        return true;
    }

    private boolean h(due due2) {
        dtz.a[] aArray = due2.TargetedResources;
        for (int i = 0; i < aArray.length; ++i) {
            dtz.a a2 = aArray[i];
            if (lea.enW().getType(a2.ResourceName) == -1) {
                lfn.b(5, TC, "checkIfItemsForCreationAreValidResources() *********************************************************************.");
                lfn.b(5, TC, "checkIfItemsForCreationAreValidResources() Invalid item " + a2.ResourceName + " for quest " + due2.Name + ".");
                return false;
            }
            if (a2.Amount > 0) continue;
            lfn.b(5, TC, "checkIfItemsForCreationAreValidResources() *********************************************************************.");
            lfn.b(5, TC, "checkIfItemsForCreationAreValidResources() Invalid quantity " + a2.Amount + " for item " + a2.ResourceName + " for quest " + due2.Name + ".");
            return false;
        }
        return true;
    }

    private boolean i(due due2) {
        dtz.a[] aArray = due2.TargetedResources;
        for (int i = 0; i < aArray.length; ++i) {
            dtz.a a2 = aArray[i];
            int n = lea.enW().getType(a2.ResourceName);
            if (n == -1) {
                lfn.b(5, TC, "checkIfKillTargetsAreValidResources() *********************************************************************.");
                lfn.b(5, TC, "checkIfKillTargetsAreValidResources() Invalid kill target " + a2.ResourceName + " for quest " + due2.Name + ".");
                return false;
            }
            if (lea.enW().isDescendant(n, cug.fgJ)) continue;
            duc[] ducArray = due2.Markers;
            boolean bl = false;
            if (ducArray == null || ducArray.length <= 0) continue;
            for (duc duc2 : ducArray) {
                if (mqm.a.getValueByName(duc2.bAM()) == mqm.a.Eee) {
                    String string = duc2.getFileName();
                    if (string == null) {
                        assert (false) : "File name for Marker :" + duc2.Caption + " and quest :" + due2.Filename + " not specified.";
                        return false;
                    }
                    jxl jxl2 = new jxl();
                    ari ari2 = jxl2.vk(string);
                    if (ari2 == null) continue;
                    Map map = ari2.Rp();
                    for (Map.Entry entry : map.entrySet()) {
                        String string2 = (String)entry.getKey();
                        int n2 = lea.enW().getType(string2);
                        if (!lea.enW().isDescendant(n2, n)) continue;
                        bl = true;
                        break;
                    }
                    if (!bl) continue;
                    break;
                }
                if (mqm.a.getValueByName(duc2.bAM()) != mqm.a.Eej && mqm.a.getValueByName(duc2.bAM()) != mqm.a.Eel) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            lfn.b(5, TC, "checkIfKillTargetsAreValidResources() *********************************************************************.");
            lfn.b(5, TC, "checkIfKillTargetsAreValidResources() Kill target " + a2.ResourceName + " not found in any of the marked spawnpoints for quest " + due2.Name + ".");
            return false;
        }
        return true;
    }

    private boolean j(due due2) {
        duc[] ducArray = due2.Markers;
        dtz.a[] aArray = due2.TargetedResources;
        for (int i = 0; i < aArray.length; ++i) {
            dtz.a a2 = aArray[i];
            int n = lea.enW().getType(a2.ResourceName);
            if (n == -1) {
                lfn.b(5, TC, "checkIfGatherItemsAreValidResources() *********************************************************************.");
                lfn.b(5, TC, "checkIfGatherItemsAreValidResources() Invalid item " + a2.ResourceName + " for quest " + due2.Name + ".");
                return false;
            }
            boolean bl = false;
            if (ducArray == null || ducArray.length <= 0) continue;
            for (duc duc2 : ducArray) {
                if (mqm.a.getValueByName(duc2.bAM()) == mqm.a.Eee) {
                    String string = duc2.getFileName();
                    if (string == null) {
                        assert (false) : "File name for Marker :" + duc2.Caption + " and quest :" + due2.Filename + " not specified.";
                        return false;
                    }
                    jxl jxl2 = new jxl();
                    ari ari2 = jxl2.vk(string);
                    if (ari2 != null) {
                        Map map = ari2.Rp();
                        block2: for (Map.Entry entry : map.entrySet()) {
                            Object object;
                            int n2;
                            Object object2;
                            Object e2;
                            int n3;
                            String string2 = (String)entry.getKey();
                            int n4 = lea.enW().getType(string2);
                            if (lea.eoJ().isEmpty()) {
                                bl = true;
                                break;
                            }
                            ctq ctq2 = lea.eoJ().get(n4);
                            if (ctq2 == null) {
                                lfn.b(5, TC, "checkIfGatherItemsAreValidResources() *********************************************************************.");
                                lfn.b(5, TC, "checkIfGatherItemsAreValidResources() Loot inventory null " + due2.Name + " for monster :" + string2 + ":" + n4 + " and spawnpoint :" + ari2.getName());
                                assert (false);
                                return false;
                            }
                            List list = ctq2.fgc;
                            block3: for (n3 = 0; n3 < list.size(); ++n3) {
                                e2 = list.get(n3);
                                if (e2 instanceof cto) {
                                    object2 = (cto)e2;
                                    n2 = ((cto)object2).ResourceType;
                                    if (n == n2) {
                                        bl = true;
                                        break;
                                    }
                                    object = ((cto)object2).fgf;
                                    if (object == null || ((cto[])object).length <= 0) continue;
                                    for (cto cto2 : object) {
                                        if (n != cto2.ResourceType) continue;
                                        bl = true;
                                        continue block3;
                                    }
                                    continue;
                                }
                                if (e2 instanceof ArrayList) {
                                    object2 = (ArrayList)e2;
                                    Iterator iterator = ((ArrayList)object2).iterator();
                                    block5: while (iterator.hasNext()) {
                                        object = (cto)iterator.next();
                                        if (n == object.ResourceType) {
                                            bl = true;
                                            continue block3;
                                        }
                                        cto[] ctoArray = object.fgf;
                                        if (ctoArray == null || ctoArray.length <= 0) continue;
                                        for (cto cto3 : ctoArray) {
                                            if (n != cto3.ResourceType) continue;
                                            bl = true;
                                            continue block5;
                                        }
                                    }
                                    continue;
                                }
                                assert (false) : "Class : " + e2.getClass().getCanonicalName();
                            }
                            if (bl) break;
                            list = ctq2.fgg;
                            block7: for (n3 = 0; n3 < list.size(); ++n3) {
                                e2 = list.get(n3);
                                if (e2 instanceof cto) {
                                    object2 = (cto)e2;
                                    n2 = ((cto)object2).ResourceType;
                                    if (n != n2) continue;
                                    bl = true;
                                    continue block2;
                                }
                                if (e2 instanceof ArrayList) {
                                    object2 = (ArrayList)e2;
                                    Iterator iterator = ((ArrayList)object2).iterator();
                                    while (iterator.hasNext()) {
                                        object = (cto)iterator.next();
                                        if (n != object.ResourceType) continue;
                                        bl = true;
                                        continue block7;
                                    }
                                    continue;
                                }
                                assert (false) : "Class : " + e2.getClass().getCanonicalName();
                            }
                        }
                        if (bl) break;
                    }
                }
                if (mqm.a.getValueByName(duc2.bAM()) != mqm.a.Eel && mqm.a.getValueByName(duc2.bAM()) != mqm.a.Eej) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            lfn.b(5, TC, "checkIfGatherItemsAreValidResources() *********************************************************************.");
            lfn.b(5, TC, "checkIfKillTargetsAreValidResources() Item not found " + a2.ResourceName + " for quest " + due2.Name + ".");
            return false;
        }
        return true;
    }

    private boolean k(due due2) {
        String string = due2.SkillName;
        if (string == null || string.trim().equals("")) {
            lfn.b(5, TC, "checkSkill() *********************************************************************.");
            lfn.b(5, TC, "checkSkill() Skill not set " + due2.Name + ".");
            return false;
        }
        if (lea.enZ().getType(string) == -1) {
            lfn.b(5, TC, "checkSkill() *********************************************************************.");
            lfn.b(5, TC, "checkSkill() Skill " + string + " invalid for quest " + due2.Name + ".");
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean l(due due2) {
        duc[] ducArray = due2.Markers;
        dtz.a[] aArray = due2.TargetedResources;
        int n = 0;
        while (true) {
            block17: {
                if (n >= aArray.length) {
                    return true;
                }
                dtz.a a2 = aArray[n];
                int n2 = lea.enW().getType(a2.ResourceName);
                if (n2 == -1) {
                    lfn.b(5, TC, "checkIfTargetItemsAreValidResources() *********************************************************************.");
                    lfn.b(5, TC, "checkIfTargetItemsAreValidResources() Invalid item " + a2.ResourceName + " for quest " + due2.Name + ".");
                    return false;
                }
                boolean bl = false;
                if (ducArray == null || ducArray.length <= 0) break block17;
                for (duc duc2 : ducArray) {
                    Map<String, mwu> map;
                    block18: {
                        block16: {
                            Object object;
                            block19: {
                                block20: {
                                    if (mqm.a.getValueByName(duc2.bAM()) != mqm.a.Eee) break block18;
                                    map = duc2.getFileName();
                                    if (map == null) {
                                        assert (false) : "File name for Marker :" + duc2.Caption + " and quest :" + due2.Filename + " not specified.";
                                        return false;
                                    }
                                    if (!lea.enW().isDescendant(n2, cug.fqy)) break block19;
                                    object = mws.DQ((String)((Object)map));
                                    if (object == null) break block20;
                                    ljq ljq2 = mws.DT(a2.ResourceName);
                                    if (ljq2 != null) {
                                        if (((lfs)object).reX == null) {
                                            assert (false) : "Position for spawnpoint : " + (String)((Object)map) + " is : " + ((lfs)object).reX;
                                            break block16;
                                        } else if (ljq.b((ljq)((lfs)object).reX, ((Float)((lfs)object).reY).floatValue(), ljq2)) {
                                            bl = true;
                                            break;
                                        }
                                        break block16;
                                    } else {
                                        bl = true;
                                        break;
                                    }
                                }
                                bl = true;
                                break;
                            }
                            object = new jxl();
                            ari ari2 = ((jxl)object).vk((String)((Object)map));
                            if (ari2 != null) {
                                Map map2 = ari2.Rp();
                                for (Map.Entry entry : map2.entrySet()) {
                                    String string = (String)entry.getKey();
                                    int n3 = lea.enW().getType(string);
                                    if (!lea.enW().isDescendant(n3, n2)) continue;
                                    bl = true;
                                    break;
                                }
                            }
                        }
                        if (!bl) continue;
                        break;
                    }
                    if (mqm.a.getValueByName(duc2.bAM()) == mqm.a.Eei) {
                        map = lea.eph();
                        bl = map.containsKey(a2.ResourceName.toLowerCase()) || map.containsKey(a2.ResourceName.toLowerCase() + "_" + due2.TileLocation);
                        continue;
                    }
                    if (mqm.a.getValueByName(duc2.bAM()) != mqm.a.Eel && mqm.a.getValueByName(duc2.bAM()) != mqm.a.Eej) continue;
                    bl = true;
                    break;
                }
                if (!bl) {
                    lfn.b(5, TC, "checkIfTargetItemsAreValidResources() *********************************************************************.");
                    lfn.b(5, TC, "checkIfTargetItemsAreValidResources() Item " + a2.ResourceName + " not found for quest " + due2.Name + ".");
                    return false;
                }
            }
            ++n;
        }
    }

    private boolean m(due due2) {
        duc[] ducArray = due2.Markers;
        if (ducArray == null) {
            return true;
        }
        List<dub> list = due2.bAY();
        block7: for (dub dub2 : list) {
            bpk bpk2;
            String string = dub2.Caption;
            int n = dub2.aln;
            int n2 = dub2.Type;
            ljq ljq2 = dub2.Position;
            float f2 = dub2.Radius;
            if (string == null || string.trim().equals("")) {
                lfn.b(5, TC, "checkMarkers() Marker caption not set for quest " + due2.Name + ".");
            }
            if ((bpk2 = bpk.getValueByOrdinal(n2)) == null) {
                lfn.b(5, TC, "checkMarkers() *********************************************************************.");
                lfn.b(5, TC, "checkMarkers() Marker type invalid for quest " + due2.Name + ".");
                return false;
            }
            mqm.a a2 = mqm.a.getValueByOrdinal(n);
            if (a2 == null) {
                lfn.b(5, TC, "checkMarkers() *********************************************************************.");
                lfn.b(5, TC, "checkMarkers() Marker target type invalid for quest " + due2.Name + ".");
                return false;
            }
            switch (a2) {
                case Eee: {
                    if (ljq2 == null) {
                        lfn.b(5, TC, "checkMarkers() *********************************************************************.");
                        lfn.b(5, TC, "checkMarkers() Spawnpoint position is null for quest " + due2.Name + ".");
                        return false;
                    }
                    if (!(f2 <= 0.0f)) continue block7;
                    lfn.b(5, TC, "checkMarkers() *********************************************************************.");
                    lfn.b(5, TC, "checkMarkers() Spawnpoint radius is invalid for quest " + due2.Name + ".");
                    return false;
                }
                case Eei: {
                    if (ljq2 != null) continue block7;
                    lfn.b(5, TC, "checkMarkers() *********************************************************************.");
                    lfn.b(5, TC, "checkMarkers() World quest object position is null for quest " + due2.Name + ".");
                    return false;
                }
                case Eej: {
                    if (ljq2 != null) continue block7;
                    lfn.b(5, TC, "checkMarkers() *********************************************************************.");
                    lfn.b(5, TC, "checkMarkers() Portal position is null for quest " + due2.Name + ".");
                    return false;
                }
                case Eel: {
                    if (ljq2 != null) continue block7;
                    lfn.b(5, TC, "checkMarkers() *********************************************************************.");
                    lfn.b(5, TC, "checkMarkers() Free marker position is null for quest " + due2.Name + ".");
                    return false;
                }
                case Eed: {
                    if (ljq2 != null) continue block7;
                    lfn.b(5, TC, "checkMarkers() *********************************************************************.");
                    lfn.b(5, TC, "checkMarkers() Vendor position is null for quest " + due2.Name + ".");
                    return false;
                }
            }
            assert (false) : "Unhandled marker target type :" + (Object)((Object)a2);
        }
        return true;
    }

    private boolean ag(int n, String string) {
        Map<Integer, dty> map = lea.eoU().bAL();
        for (dty dty2 : map.values()) {
            int[] nArray;
            for (int n2 : nArray = dty2.SubQuestIDs) {
                if (n2 != n) continue;
                return true;
            }
        }
        lfn.b(5, TC, "isSubQuestAChildInCompexQuest() *********************************************************************.");
        lfn.b(5, TC, "isSubQuestAChildInCompexQuest() Simple quest with id :" + n + " is already a child in another complex quest. Quest name is :" + string + ".");
        return false;
    }
}

