/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ari
 *  cug
 *  lcw
 */
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class mwj
implements FileFilter {
    private static final jrw EPg = new jrw(lcw.qLb + "xml-files/gamelogicinfo/quests/simple/");
    private static final jrw EPh = new jrw("C:/DarkFall/Build/All/");
    private static final String EPi = "quest_report.txt";
    private List<dty> EPj = lcn.emv();
    private List<due> EPk = lcn.emv();
    private final List<Integer> EPl = lcn.emv();
    private final List<a> EPm = lcn.emv();
    private final List<a> EPn = lcn.emv();
    private final mwl EPo;
    private List<String> EPp = lcn.emv();

    public String eRl() {
        return EPh + File.separator + EPi;
    }

    public mwj() {
        this.EPo = new mwl();
        boolean bl = this.EPo.ekc();
        if (!bl) {
            assert (false) : "Connection to db failed.";
            return;
        }
        this.EPj = this.EPo.eRA();
        this.EPk = this.EPo.eRB();
        this.eRm();
        this.eRn();
    }

    private void eRm() {
        for (int i = 0; i < this.EPj.size(); ++i) {
            Object object;
            dty dty2 = this.EPj.get(i);
            int n = dty2.Type.ordinal();
            assert (n == dud.hdM.ordinal()) : "Wrong Quest Type [" + dty2.Type.name() + "]";
            String string = dty2.Name;
            String string2 = dty2.FactionAvatar;
            int n2 = dty2.ID;
            String string3 = dty2.QuestEndText;
            String string4 = dty2.QuestStartText;
            String string5 = dty2.ShortDescription;
            int[] nArray = dty2.SubQuestIDs;
            String string6 = dty2.TileLocation;
            String string7 = dty2.Filename;
            a a2 = new a(this, dud.hdM, n2);
            if (string7 == null || string7.trim().equals("")) {
                a2.DJ("FileName is not set");
                a2.Filename = "FileName is Not Set";
            } else {
                a2.Filename = string7;
            }
            if (string == null || string.trim().equals("")) {
                a2.DJ("Quest name missing");
            } else {
                a2.Name = string;
            }
            if (string2 == null || string2.trim().equals("")) {
                a2.DJ("Faction avatar missing");
            }
            if (string5 == null || string5.trim().equals("")) {
                a2.DK("Quest short description missing");
            }
            if (string4 == null || string4.trim().equals("")) {
                a2.DK("Quest start text missing");
            }
            if (string3 == null || string3.trim().equals("")) {
                a2.DK("Quest end text missing");
            }
            if (string6 == null || string6.trim().equals("")) {
                a2.DJ("Source tile missing");
            } else if (!lea.eoS().containsKey(string6.toLowerCase())) {
                a2.DJ("Tile [" + string6 + "] doesn't exist in tile info map under SFGamelogicInfo");
            }
            if (dty2.HighScoreRecording) {
                if (dty2.bAF().size() != 1) {
                    a2.DJ("A highscore quest must contains a subquest only.");
                }
                if ((object = (Object)dty2.bAF().get(0)) != null) {
                    int[] nArray2;
                    if (((due)object).Type != dud.hdQ) {
                        a2.DJ("A highscore quest must contains a subquest which is a kill quest only. SubQuest :" + ((due)object).Name + " is a " + ((due)object).Type.toString() + " quest.");
                    }
                    if ((nArray2 = ((due)object).bAS()) == null || nArray2.length != 1) {
                        a2.DJ("Kill SubQuest :" + ((due)object).Name + " does not have any targets.");
                    }
                    if (((due)object).bAO() == null || ((due)object).bAO().trim().equals("")) {
                        a2.DJ("Kill SubQuest :" + ((due)object).Name + " must have a time limit.");
                    }
                } else {
                    a2.DJ("Complex Quest :" + dty2.Name + " does not have any subquests.");
                }
            }
            if (nArray == null || nArray.length == 0) {
                a2.DJ("Complex quest doesn't contain any subQuests");
            } else {
                object = nArray;
                int n3 = ((int[])object).length;
                for (int j = 0; j < n3; ++j) {
                    String string8;
                    int n4 = object[j];
                    if (!this.afP(n4)) {
                        string8 = lea.eoU().Ci(n4);
                        a2.DJ("Quest Contains A Sub Quest [" + string8 + "]  With ID [" + n4 + "] Which Doesn't Exist In Database");
                        continue;
                    }
                    if (!this.EPl.contains(n4)) {
                        this.EPl.add(n4);
                        continue;
                    }
                    string8 = lea.eoU().Ci(n4);
                    a2.DJ("Sub Quest [" + string8 + "] With ID [" + n4 + "] Already Used In A Complex Quest.");
                }
            }
            if (a2.eRs()) continue;
            this.EPm.add(a2);
        }
    }

    private void eRn() {
        Object object;
        int n;
        for (n = 0; n < this.EPk.size(); ++n) {
            object = this.EPk.get(n);
            dud dud2 = ((due)object).Type;
            a a2 = new a(this, dud2, ((due)object).ID);
            ((due)object).jJ(false);
            this.a((due)object, a2);
            this.b((due)object, a2);
            this.c((due)object, a2);
            this.d((due)object, a2);
            if (((due)object).asP() && ((due)object).Type != dud.hdS && ((due)object).Type != dud.hdQ) {
                a2.DJ("Quest [" + ((due)object).Name + "] tagged as chain quest but isn't a kill or a use skill quest");
            }
            this.j((due)object, a2);
            switch (dud2) {
                case hdO: {
                    this.a(((due)object).bAS(), a2);
                    break;
                }
                case hdR: {
                    break;
                }
                case hdN: {
                    this.e((due)object, a2);
                    break;
                }
                case hdQ: {
                    this.f((due)object, a2);
                    break;
                }
                case hdP: {
                    this.g((due)object, a2);
                    break;
                }
                case hdS: {
                    this.h((due)object, a2);
                    this.i((due)object, a2);
                    break;
                }
                default: {
                    assert (false) : "Quest Name :" + ((due)object).Name;
                    break;
                }
            }
            if (a2.eRs()) continue;
            this.EPn.add(a2);
        }
        for (n = 0; n < EPg.dRT().length; ++n) {
            object = EPg.dRT()[n].getName();
            boolean bl = false;
            if (!((String)object).endsWith(".xml")) continue;
            for (int i = 0; i < this.EPk.size(); ++i) {
                if (!((String)object).equals(this.EPk.get((int)i).Filename)) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            lfn.b(5, this.getClass().getName(), "checkSimpleQuests Simple Quest :" + (String)object + " Doesn't Exist In Database Although Exist Under The Local File System");
            this.EPp.add((String)object);
        }
    }

    private void a(due due2, a a2) {
        int n = due2.ID;
        String string = due2.Filename;
        String string2 = due2.Name;
        String string3 = due2.ShortDescription;
        String string4 = due2.QuestStartText;
        String string5 = due2.QuestFinishedText;
        String string6 = due2.QuestDiaryText;
        String string7 = due2.QuestEndText;
        if (string == null || string.trim().equals("")) {
            a2.DJ("Filename missing");
            a2.Filename = "FileName missing";
        } else {
            a2.Filename = string;
        }
        if (string2 == null || string2.trim().equals("")) {
            a2.DJ("Complex Quest name missing");
        } else {
            a2.Name = string2;
        }
        if (string3 == null || string3.trim().equals("")) {
            a2.DK("Short Description missing");
        }
        if (string4 == null || string4.trim().equals("")) {
            a2.DK("Quest Start Text missing");
        }
        if (string5 == null || string5.trim().equals("")) {
            a2.DK("Quest Finished Text missing");
        }
        if (string6 == null || string6.trim().equals("")) {
            a2.DJ("Quest Diary Text missing");
        }
        if (string7 == null || string7.trim().equals("")) {
            a2.DK("Quest End Text missing");
        }
        if (!this.afQ(n)) {
            a2.DJ("Quest is not a child in any complex quest");
        }
    }

    private void b(due due2, a a2) {
        dtz.b[] bArray = due2.Rewards;
        if (bArray == null || bArray.length == 0) {
            a2.DK("Rewards missing");
            return;
        }
        if (bArray != null) {
            for (dtz.b b2 : bArray) {
                String string = b2.ResourceName;
                float f2 = b2.Amount;
                float f3 = b2.Probability;
                if (lea.enW().getType(string) == -1) {
                    a2.DJ("Resource [" + string + "] is invalid");
                    continue;
                }
                if (f2 > 0.0f && !(f3 < 0.0f) && !(f3 > 1.0f)) continue;
                a2.DJ("Resource [" + string + "] quantity [" + f2 + "] is invalid");
            }
        }
    }

    private void c(due due2, a a2) {
        String string = due2.TileLocation;
        if (string == null || string.trim().equals("")) {
            a2.DJ("Source Tile missing");
            return;
        }
        if (!lea.eoS().containsKey(string.toLowerCase())) {
            a2.DJ("Source Tile [" + string + "] Doesn't Exist In Tile Info Map Under SFGamelogicInfo");
        }
    }

    private void d(due due2, a a2) {
        String string = due2.QuestEndNpcName;
        if (due2.asP() && (due2.Type.ordinal() == dud.hdS.ordinal() || due2.Type.ordinal() == dud.hdQ.ordinal())) {
            if (string != null && !string.trim().equals("")) {
                a2.DJ("Can not have target vendor when a quest is set as a chain quest.");
            }
            return;
        }
        if (string == null || string.trim().equals("")) {
            a2.DJ("Quest needs an end target npc.");
            return;
        }
        if (due2.NonAliveTarget) {
            ljq ljq2 = mws.DT(string);
            if (ljq2 == null) {
                a2.DJ("Quest Item  [" + string + "] has not been set in world of Agon So We Can Not Use It As A Target Item.");
            }
        } else {
            ljq ljq3 = mws.DR(string);
            if (ljq3 == null) {
                a2.DJ("NPC  [" + string + "] has not been set in world of Agon So We Can Not Use It As A Target Vendor.");
            }
        }
    }

    private void a(int[] nArray, a a2) {
        for (int i = 0; i < nArray.length; ++i) {
            if (lea.enW().isDescendant(nArray[i], cug.fks)) continue;
            a2.DJ("Resource [" + nArray[i] + "] is not a quest item");
        }
    }

    private void e(due due2, a a2) {
        dtz.a[] aArray = due2.TargetedResources;
        for (int i = 0; i < aArray.length; ++i) {
            dtz.a a3 = aArray[i];
            if (lea.enW().getType(a3.ResourceName) == -1) {
                a2.DJ("Object [" + a3.ResourceName + "] is not a valid resource");
                continue;
            }
            if (a3.Amount > 0) continue;
            a2.DJ("Object [" + a3.ResourceName + "] Amount is not valid");
        }
    }

    private void f(due due2, a a2) {
        duc[] ducArray = due2.Markers;
        List<dub> list = due2.bAX();
        if (list == null || list.isEmpty()) {
            a2.DK("Does not have any markers.");
            return;
        }
        dtz.a[] aArray = due2.TargetedResources;
        for (int i = 0; i < aArray.length; ++i) {
            dtz.a a3 = aArray[i];
            int n = lea.enW().getType(a3.ResourceName);
            if (n == -1) {
                a2.DJ("Object [" + a3.ResourceName + "] is not a valid resource");
                continue;
            }
            if (lea.enW().isDescendant(n, cug.fgJ)) continue;
            boolean bl = false;
            if (ducArray == null) continue;
            for (duc duc2 : ducArray) {
                if (mqm.a.getValueByName(duc2.bAM()) == mqm.a.Eee) {
                    String string = duc2.getFileName();
                    assert (string != null);
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
            a2.DJ("Monster [" + a3.ResourceName + "] does not spawn in any of the spawnpoints where markers are binded.");
        }
    }

    private void g(due due2, a a2) {
        duc[] ducArray = due2.Markers;
        List<dub> list = due2.bAW();
        if (list == null || list.isEmpty()) {
            a2.DK("Does not have any markers.");
            return;
        }
        dtz.a[] aArray = due2.TargetedResources;
        for (int i = 0; i < aArray.length; ++i) {
            dtz.a a3 = aArray[i];
            int n = lea.enW().getType(a3.ResourceName);
            if (n == -1) {
                a2.DJ("Items [" + a3.ResourceName + "] is not a valid resource");
                continue;
            }
            boolean bl = false;
            if (ducArray == null) continue;
            for (duc duc2 : ducArray) {
                if (mqm.a.getValueByName(duc2.bAM()) == mqm.a.Eee) {
                    String string = duc2.getFileName();
                    assert (string != null);
                    jxl jxl2 = new jxl();
                    ari ari2 = jxl2.vk(string);
                    if (ari2 == null) continue;
                    Map map = ari2.Rp();
                    block2: for (Map.Entry entry : map.entrySet()) {
                        Object object;
                        int n2;
                        Object object2;
                        Object e2;
                        int n3;
                        String string2 = (String)entry.getKey();
                        int n4 = lea.enW().getType(string2);
                        ctq ctq2 = lea.eoJ().get(n4);
                        assert (ctq2 != null);
                        List list2 = ctq2.fgc;
                        block3: for (n3 = 0; n3 < list2.size(); ++n3) {
                            e2 = list2.get(n3);
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
                        list2 = ctq2.fgg;
                        block7: for (n3 = 0; n3 < list2.size(); ++n3) {
                            e2 = list2.get(n3);
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
                    if (!bl) continue;
                    break;
                }
                if (mqm.a.getValueByName(duc2.bAM()) != mqm.a.Eel && mqm.a.getValueByName(duc2.bAM()) != mqm.a.Eej) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            a2.DJ("Item [" + a3.ResourceName + "] does not exist in any of the associated with quest spawnpoints.");
        }
    }

    private void h(due due2, a a2) {
        String string = due2.SkillName;
        if (string == null || string.trim().equals("")) {
            a2.DJ("Skill is not setted");
            return;
        }
        if (lea.enZ().getType(string) == -1) {
            a2.DJ("Skill [" + string + "] Doesn't Exist In Skill Tree");
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void i(due due2, a a2) {
        duc[] ducArray = due2.Markers;
        List<dub> list = due2.bAW();
        if (list == null || list.isEmpty()) {
            a2.DK("Does not have any markers.");
            return;
        }
        dtz.a[] aArray = due2.TargetedResources;
        int n = 0;
        while (true) {
            block17: {
                int n2;
                dtz.a a3;
                block16: {
                    if (n >= aArray.length) {
                        return;
                    }
                    a3 = aArray[n];
                    n2 = lea.enW().getType(a3.ResourceName);
                    if (n2 != -1) break block16;
                    a2.DJ("Items [" + a3.ResourceName + "] is not a valid resource");
                    break block17;
                }
                boolean bl = false;
                if (ducArray == null) break block17;
                for (duc duc2 : ducArray) {
                    Map<String, mwu> map;
                    block18: {
                        block15: {
                            Object object;
                            block19: {
                                block20: {
                                    if (mqm.a.getValueByName(duc2.bAM()) != mqm.a.Eee) break block18;
                                    map = duc2.getFileName();
                                    assert (map != null);
                                    if (!lea.enW().isDescendant(n2, cug.fqy)) break block19;
                                    object = mws.DQ((String)((Object)map));
                                    if (object == null) break block20;
                                    ljq ljq2 = mws.DT(a3.ResourceName);
                                    if (ljq2 != null) {
                                        if (((lfs)object).reX == null) {
                                            assert (false) : "Position for spawnpoint : " + (String)((Object)map) + " is : " + ((lfs)object).reX;
                                            break block15;
                                        } else if (ljq.b((ljq)((lfs)object).reX, ((Float)((lfs)object).reY).floatValue(), ljq2)) {
                                            bl = true;
                                            break;
                                        }
                                        break block15;
                                    } else {
                                        a2.DJ("There is no quest item with name :" + a3.ResourceName + " in quest targets.");
                                        bl = true;
                                        break;
                                    }
                                }
                                a2.DJ("Item [" + a3.ResourceName + "] there is no quest item with name :" + a3.ResourceName);
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
                        bl = map.containsKey(a3.ResourceName.toLowerCase()) || map.containsKey(a3.ResourceName.toLowerCase() + "_" + due2.TileLocation);
                        continue;
                    }
                    if (mqm.a.getValueByName(duc2.bAM()) != mqm.a.Eel && mqm.a.getValueByName(duc2.bAM()) != mqm.a.Eej) continue;
                    bl = true;
                    break;
                }
                if (!bl) {
                    a2.DJ("Item [" + a3.ResourceName + "] does not exist in any of the associated with quest spawnpoints or quest items.");
                }
            }
            ++n;
        }
    }

    private void j(due due2, a a2) {
        duc[] ducArray = due2.Markers;
        if (ducArray == null) {
            a2.DK("Does not have any markers.");
            return;
        }
        List<dub> list = due2.bAY();
        for (dub dub2 : list) {
            mqm.a a3;
            bpk bpk2;
            String string = dub2.Caption;
            int n = dub2.aln;
            int n2 = dub2.Type;
            ljq ljq2 = dub2.Position;
            float f2 = dub2.Radius;
            if (string == null || string.trim().equals("")) {
                a2.DJ("Invalid marker.Caption not specified.");
            }
            if ((bpk2 = bpk.getValueByOrdinal(n2)) == null) {
                a2.DJ("Invalid marker.Quest marker type not specified.");
            }
            if ((a3 = mqm.a.getValueByOrdinal(n)) == null) {
                a2.DJ("Invalid marker.Target type not specified.");
                return;
            }
            switch (a3) {
                case Eee: {
                    if (ljq2 == null) {
                        a2.DJ("Invalid marker.Position for " + string + " spawnpoint marker position is null.");
                    }
                    if (!(f2 <= 0.0f)) break;
                    a2.DJ("Invalid marker.Radius for " + string + " spawnpoint marker radius is " + f2);
                    break;
                }
                case Eei: {
                    if (ljq2 != null) break;
                    a2.DJ("Invalid marker.Position for " + string + " questtarget marker position is null.");
                    break;
                }
                case Eej: {
                    if (ljq2 != null) break;
                    a2.DJ("Invalid marker.Position for " + string + " portal marker position is null.");
                    break;
                }
                case Eel: {
                    if (ljq2 != null) break;
                    a2.DJ("Invalid marker.Position for " + string + " free marker position is null.");
                    break;
                }
                case Eed: {
                    if (ljq2 != null) break;
                    a2.DJ("Invalid marker.Position for target marker type " + n + " for target vendor " + string + " is invalid.");
                }
            }
        }
    }

    public boolean eRo() {
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/gamelogicinfo/quests/complex/");
        for (int i = 0; i < jrw2.dRT().length; ++i) {
            String string = jrw2.a(this)[i].getName();
            for (int j = 0; j < this.EPj.size(); ++j) {
                if (!string.equals(this.EPj.get((int)j).Filename)) continue;
                return true;
            }
        }
        return false;
    }

    private boolean afP(int n) {
        for (int i = 0; i < this.EPk.size(); ++i) {
            if (this.EPk.get((int)i).ID != n) continue;
            return true;
        }
        return false;
    }

    private boolean afQ(int n) {
        for (int i = 0; i < this.EPj.size(); ++i) {
            int[] nArray;
            for (int n2 : nArray = this.EPj.get((int)i).SubQuestIDs) {
                if (n2 != n) continue;
                return true;
            }
        }
        return false;
    }

    public void eRp() {
        boolean bl;
        jrw jrw2;
        block4: {
            jrw2 = new jrw(EPh + "\\" + EPi);
            bl = true;
            if (!jrw2.exists()) {
                try {
                    bl = jrw2.createNewFile();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                    if ($assertionsDisabled) break block4;
                    throw new AssertionError();
                }
            }
        }
        if (bl) {
            this.ad(jrw2);
        }
    }

    private void ad(jrw jrw2) {
        block8: {
            String string = System.getProperty("line.separator");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(jrw2);
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                dataOutputStream.writeChars("**  Complex Quests **" + string);
                for (a a2 : this.EPm) {
                    dataOutputStream.writeChars("----" + string);
                    dataOutputStream.writeChars("Name [" + a2.Name + "]\n");
                    dataOutputStream.writeChars("Errors\n");
                    for (String string2 : a2.EPq) {
                        dataOutputStream.writeChars("- [" + string2 + "]\n");
                    }
                    dataOutputStream.writeChars("Warnings\n");
                    for (String string2 : a2.EPr) {
                        dataOutputStream.writeChars("- [" + string2 + "]\n");
                    }
                    dataOutputStream.writeChars("----" + string);
                }
                dataOutputStream.writeChars("**  Simple Quests  **" + string);
                for (a a2 : this.EPn) {
                    dataOutputStream.writeChars("----" + string);
                    dataOutputStream.writeChars("Name [" + a2.Name + "]\n");
                    dataOutputStream.writeChars("Errors\n");
                    for (String string2 : a2.EPq) {
                        dataOutputStream.writeChars("- [" + string2 + "]\n");
                    }
                    dataOutputStream.writeChars("Warnings\n");
                    for (String string2 : a2.EPr) {
                        dataOutputStream.writeChars("- [" + string2 + "]\n");
                    }
                    dataOutputStream.writeChars("----" + string);
                }
                dataOutputStream.flush();
                fileOutputStream.flush();
                dataOutputStream.close();
                fileOutputStream.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                if ($assertionsDisabled) break block8;
                throw new AssertionError();
            }
        }
    }

    @Override
    public boolean accept(File file) {
        return file.isDirectory() && !file.getName().toLowerCase().contains("svn") || file.getName().toLowerCase().endsWith(".xml") && file.getName().toLowerCase().contains("quest_targets");
    }

    public String getDescription() {
        return "Xml files.";
    }

    public List<a> eRq() {
        return this.EPm;
    }

    public List<a> eRr() {
        return this.EPn;
    }

    public a DI(String string) {
        for (a a2 : this.EPm) {
            if (!a2.Name.equalsIgnoreCase(string)) continue;
            return a2;
        }
        for (a a2 : this.EPn) {
            if (!a2.Name.equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }
}

