/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import spenefett.util.jni.SFJNIUtils;

public class jwm {
    private static final boolean bC = true;
    private final lju fzk = new lju(0, 1);
    private final Set<Integer> oXs = lcn.emx();
    private boolean oXt = false;
    private final String oWD = "Could not parse Node = ";

    public jwm() {
        if (lcw.enf() || lcw.enb()) {
            this.oXt = true;
        }
    }

    public void dUo() {
        Map<Integer, List<bsv>> map;
        String string;
        String string2;
        String string3 = "";
        int n = 0;
        if (this.oXt) {
            string3 = "filtered_";
        }
        if (lcw.enf() || lcw.ena() || lcw.eng() || lcw.enb()) {
            if (!lcw.qFC) {
                if (lcw.eng()) {
                    n = SFJNIUtils.Instance.globalMutexOpen("GenericObjects");
                    SFJNIUtils.Instance.globalMutexLock(n, -1);
                }
                fy.TN.clear();
                this.Q(fy.TN);
                if (lcw.eng()) {
                    SFJNIUtils.Instance.globalMutexUnlock(n);
                    SFJNIUtils.Instance.globalMutexClose(n);
                }
            }
            string2 = "xml-files/zones/";
            string = "xml-files/zones/dynamic_objects_teleport_chambers.xml";
            if (lcw.eng()) {
                n = SFJNIUtils.Instance.globalMutexOpen("TeleportChambers");
                SFJNIUtils.Instance.globalMutexLock(n, -1);
            }
            map = this.uK("xml-files/zones/dynamic_objects_teleport_chambers.xml");
            if (lcw.eng()) {
                SFJNIUtils.Instance.globalMutexUnlock(n);
                SFJNIUtils.Instance.globalMutexClose(n);
            }
            fy.TL.clear();
            fy.TL.putAll(map);
        }
        if (lcw.enc()) {
            return;
        }
        this.oXs.clear();
        string2 = "xml-files/zones/";
        if (!lcw.qFC && (lcw.ena() || lcw.enb() || lcw.eng())) {
            string = string2 + "dynamic_objects_effects.xml";
            if (lcw.eng()) {
                n = SFJNIUtils.Instance.globalMutexOpen("Effects");
                SFJNIUtils.Instance.globalMutexLock(n, -1);
            }
            map = this.uK(string);
            if (lcw.eng()) {
                SFJNIUtils.Instance.globalMutexUnlock(n);
                SFJNIUtils.Instance.globalMutexClose(n);
            }
            fy.TE.clear();
            fy.TE.putAll(map);
        }
        if (lcw.enf() || lcw.enb() || lcw.eng()) {
            string = string2 + string3 + "dynamic_objects_vendors.xml";
            if (!jry.tj(string)) {
                string = string2 + "dynamic_objects_vendors.xml";
            }
            if (lcw.eng()) {
                n = SFJNIUtils.Instance.globalMutexOpen("Vendors");
                SFJNIUtils.Instance.globalMutexLock(n, -1);
            }
            map = this.uK(string);
            if (lcw.eng()) {
                SFJNIUtils.Instance.globalMutexUnlock(n);
                SFJNIUtils.Instance.globalMutexClose(n);
            }
            fy.TG.clear();
            fy.TG.putAll(map);
        }
        if (lcw.emZ() || lcw.enb() || lcw.eng()) {
            string = string2 + string3 + "dynamic_objects_spawnpoints.xml";
            if (!jry.tj(string)) {
                string = string2 + "dynamic_objects_spawnpoints.xml";
            }
            if (lcw.eng()) {
                n = SFJNIUtils.Instance.globalMutexOpen("Spawnpoints");
                SFJNIUtils.Instance.globalMutexLock(n, -1);
            }
            map = this.uK(string);
            if (lcw.eng()) {
                SFJNIUtils.Instance.globalMutexUnlock(n);
                SFJNIUtils.Instance.globalMutexClose(n);
            }
            fy.TF.clear();
            fy.TF.putAll(map);
        }
        if (lcw.enf() || lcw.enb() || lcw.eng()) {
            string = string2 + string3 + "dynamic_objects_bindstones.xml";
            if (!jry.tj(string)) {
                string = string2 + "dynamic_objects_bindstones.xml";
            }
            if (lcw.eng()) {
                n = SFJNIUtils.Instance.globalMutexOpen("Bindstones");
                SFJNIUtils.Instance.globalMutexLock(n, -1);
            }
            map = this.uK(string);
            if (lcw.eng()) {
                SFJNIUtils.Instance.globalMutexUnlock(n);
                SFJNIUtils.Instance.globalMutexClose(n);
            }
            fy.TH.clear();
            fy.TH.putAll(map);
        }
        if (lcw.enf() || lcw.enb() || lcw.eng()) {
            string = string2 + "dynamic_objects_guardtowers.xml";
            if (lcw.eng()) {
                n = SFJNIUtils.Instance.globalMutexOpen("GuardTowers");
                SFJNIUtils.Instance.globalMutexLock(n, -1);
            }
            map = this.uK(string);
            if (lcw.eng()) {
                SFJNIUtils.Instance.globalMutexUnlock(n);
                SFJNIUtils.Instance.globalMutexClose(n);
            }
            fy.TI.clear();
            fy.TI.putAll(map);
        }
        if (lcw.enf() || lcw.enb() || lcw.eng()) {
            string = string2 + "dynamic_objects_portals.xml";
            if (lcw.eng()) {
                n = SFJNIUtils.Instance.globalMutexOpen("Portals");
                SFJNIUtils.Instance.globalMutexLock(n, -1);
            }
            map = this.uK(string);
            if (lcw.eng()) {
                SFJNIUtils.Instance.globalMutexUnlock(n);
                SFJNIUtils.Instance.globalMutexClose(n);
            }
            fy.TJ.clear();
            fy.TJ.putAll(map);
        }
        if (lcw.ena() || lcw.enb()) {
            string = string2 + "dynamic_objects_sound_emitters.xml";
            if (lcw.eng()) {
                n = SFJNIUtils.Instance.globalMutexOpen("SoundEmitters");
                SFJNIUtils.Instance.globalMutexLock(n, -1);
            }
            map = this.uK(string);
            if (lcw.eng()) {
                SFJNIUtils.Instance.globalMutexUnlock(n);
                SFJNIUtils.Instance.globalMutexClose(n);
            }
            fy.TK.clear();
            fy.TK.putAll(map);
        }
        if ((lcw.ena() || lcw.enb()) && !lcw.qFC) {
            if (lcw.eng()) {
                n = SFJNIUtils.Instance.globalMutexOpen("Lights");
                SFJNIUtils.Instance.globalMutexLock(n, -1);
            }
            fy.TM.clear();
            this.P(fy.TM);
            if (lcw.eng()) {
                SFJNIUtils.Instance.globalMutexUnlock(n);
                SFJNIUtils.Instance.globalMutexClose(n);
            }
        }
    }

    public Map<Integer, List<bsv>> uK(String string) {
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            return lcn.emw();
        }
        try {
            return this.a(document, jry.tn(string));
        }
        catch (bp bp2) {
            throw new bo("Error Parsing SFFile [" + string + "]", bp2);
        }
    }

    private Map<Integer, List<bsv>> a(Document document, String string) {
        Map<Integer, List<bsv>> map = lcn.emw();
        Node node = jsy.a("SFLevelInfoFile", (Node)document);
        if (node == null) {
            assert (false);
            throw new bp("Could noe parse file [" + string + "]. Rootnode is invalid");
        }
        lju lju2 = jsy.c(document);
        if (!lju2.equals(this.fzk)) {
            assert (false);
            throw new bp("Could noe parse file [" + string + "]. Vrong Version [" + lju2 + "]. Supported Version = " + this.fzk);
        }
        String string2 = "Level";
        List<Node> list = this.aS(node);
        if (list == null) {
            assert (false);
            throw new bp("Could noe parse [" + string2 + "] Node");
        }
        Node node2 = null;
        Iterator<Node> iterator = list.iterator();
        while (iterator.hasNext()) {
            string2 = "Guid";
            node2 = iterator.next();
            Node node3 = jsy.a(string2, node2);
            if (node3 == null) {
                // empty if block
            }
            Integer n = jsy.r(node3);
            string2 = "LevelObjectList";
            if ((node2 = jsy.a(string2, node2)) == null) {
                // empty if block
            }
            List<bsv> list2 = this.aT(node2);
            List<bsv> list3 = map.get(n);
            if (list3 == null) {
                map.put(n, list2);
                continue;
            }
            list3.addAll(list2);
        }
        return map;
    }

    private List<Node> aS(Node node) {
        ArrayList<Node> arrayList = lcn.emv();
        String string = "Group";
        List<Node> list = jsy.c(string, node);
        if (!list.isEmpty()) {
            for (Node node2 : list) {
                string = "Level";
                arrayList.addAll(jsy.c(string, node2));
            }
        } else {
            string = "Level";
            arrayList.addAll(jsy.c(string, node));
        }
        return arrayList;
    }

    private List<bsv> aT(Node node) {
        ArrayList<bsv> arrayList = lcn.emv();
        String string = "SFLevelObjectSpecialEffect";
        List<Node> list = jsy.c(string, node);
        if (list == null) {
            assert (false);
            throw new bp("Could noe parse [" + string + "] Node");
        }
        for (Node node2 : list) {
            arrayList.add(this.aU(node2));
        }
        string = "SFLevelObjectSpawnPoint";
        list = jsy.c(string, node);
        if (list == null) {
            assert (false);
            throw new bp("Could noe parse [" + string + "] Node");
        }
        for (Node node2 : list) {
            arrayList.add(this.ba(node2));
        }
        string = "SFLevelObjectInteraction";
        list = jsy.c(string, node);
        if (list == null) {
            assert (false);
            throw new bp("Could noe parse [" + string + "] Node");
        }
        for (Node node2 : list) {
            arrayList.add(this.aV(node2));
        }
        string = "SFLevelObjectBindstone";
        list = jsy.c(string, node);
        if (list == null) {
            assert (false);
            throw new bp("Could noe parse [" + string + "] Node");
        }
        for (Node node2 : list) {
            arrayList.add(this.aW(node2));
        }
        string = "SFLevelObjectGuardTower";
        list = jsy.c(string, node);
        if (list == null) {
            assert (false);
            throw new bp("Could noe parse [" + string + "] Node");
        }
        for (Node node2 : list) {
            arrayList.add(this.aX(node2));
        }
        string = "SFLevelObjectPortal";
        list = jsy.c(string, node);
        if (list == null) {
            assert (false);
            throw new bp("Could noe parse [" + string + "] Node");
        }
        for (Node node2 : list) {
            arrayList.add(this.aY(node2));
        }
        string = "SFLevelObjectSoundEmitter";
        list = jsy.c(string, node);
        if (list == null) {
            assert (false);
            throw new bp("Could noe parse [" + string + "] Node");
        }
        for (Node node2 : list) {
            arrayList.add(this.bb(node2));
        }
        string = "SFLevelObjectTeleportChamber";
        list = jsy.c(string, node);
        if (list == null) {
            assert (false);
            throw new bp("Could noe parse [" + string + "] Node");
        }
        for (Node node2 : list) {
            arrayList.add(this.aZ(node2));
        }
        return arrayList;
    }

    private bte aU(Node node) {
        String string;
        int n;
        bte bte2 = new bte();
        String string2 = "SFEffectType";
        Node node2 = jsy.a(string2, node);
        if (node2 == null) {
            // empty if block
        }
        if ((n = del.dr(string = jsy.m(node2))) < 0) {
            assert (false);
            throw new bp("Could not parse Node = " + string2 + ": Invalid Effect Name = " + string);
        }
        bte2.fJ(n);
        string2 = "TargetPosition";
        node2 = jsy.a(string2, node);
        if (node2 == null) {
            assert (false);
            throw new bp("Could not parse Node = " + string2);
        }
        bte2.setTargetPosition(jsy.w(node2));
        string2 = "SourcePosition";
        node2 = jsy.a(string2, node);
        if (node2 != null) {
            bte2.setSourcePosition(jsy.w(node2));
        }
        return bte2;
    }

    private bta aV(Node node) {
        bta bta2 = new bta();
        String string = "DescriptionFilename";
        Node node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        bta2.gi(jsy.m(node2));
        string = "SFGUID";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        ldv ldv2 = jsy.D(node2);
        bta2.setGUID(lcr.ak((ldv)ldv2, (int)ldx.enG().ib()));
        string = "Position";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        bta2.c(jsy.w(node2));
        string = "Rotation";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        bta2.setRotation(jsy.w(node2));
        return bta2;
    }

    private bsw aW(Node node) {
        bsw bsw2 = new bsw();
        String string = "SFResourceName";
        Node node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        bsw2.eY(jsy.m(node2));
        string = "ID";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        bsw2.setID(jsy.m(node2));
        string = "EnglishName";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        bsw2.gh(jsy.m(node2));
        string = "Position";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        bsw2.c(jsy.w(node2));
        string = "Rotation";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        bsw2.setRotation(jsy.w(node2));
        return bsw2;
    }

    private bsy aX(Node node) {
        bsy bsy2 = new bsy();
        String string = "SFResourceName";
        Node node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        bsy2.eY(jsy.m(node2));
        string = "Position";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        bsy2.c(jsy.w(node2));
        string = "Rotation";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        bsy2.setRotation(jsy.w(node2));
        return bsy2;
    }

    private btb aY(Node node) {
        btb btb2 = new btb();
        String string = "SFResourceName";
        Node node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        btb2.ResourceName = jsy.m(node2);
        string = "Position";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        btb2.Position = jsy.w(node2);
        string = "Rotation";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        btb2.my = jsy.w(node2);
        string = "ID";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        btb2.ID = jsy.m(node2);
        string = "EnglishName";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        btb2.dKs = jsy.m(node2);
        string = "KeyResource";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        btb2.dKz = jsy.m(node2);
        string = "NeedsKey";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        btb2.dKy = jsy.t(node2);
        ArrayList<ljq> arrayList = lcn.emv();
        string = "Targets";
        node2 = jsy.a(string, node);
        NodeList nodeList = node2.getChildNodes();
        Node node3 = null;
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            node3 = nodeList.item(i2);
            if (!node3.getNodeName().equals("Target")) continue;
            arrayList.add(jsy.w(node3));
        }
        string = "Folder";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        if (node2 != null) {
            btb2.dKA = jsy.m(node2);
        }
        btb2.dKx = arrayList.toArray(new ljq[arrayList.size()]);
        assert (!arrayList.isEmpty()) : "Portal [" + btb2.dKs + "] has no targets!";
        return btb2;
    }

    private btf aZ(Node node) {
        btf btf2 = new btf();
        String string = "SFResourceName";
        Node node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        btf2.ResourceName = jsy.m(node2);
        string = "Position";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        btf2.Position = jsy.w(node2);
        string = "Rotation";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        btf2.my = jsy.w(node2);
        string = "ID";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        btf2.ID = jsy.m(node2);
        string = "EnglishName";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        btf2.dKs = jsy.m(node2);
        return btf2;
    }

    private btd ba(Node node) {
        btd btd2 = new btd();
        String string = "DescriptionFilename";
        Node node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        btd2.gi(jsy.m(node2));
        string = "SFGUID";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        ldv ldv2 = jsy.D(node2);
        if (lcw.enb()) {
            btd2.setGUID(lcr.ak((ldv)ldv2, (int)7000));
        } else if (lcw.emZ()) {
            btd2.setGUID(null);
        } else {
            btd2.setGUID(lcr.ak((ldv)ldv2, (int)ldx.enG().ib()));
        }
        string = "Position";
        node2 = jsy.a(string, node);
        if (node2 == null) {
            // empty if block
        }
        btd2.c(jsy.w(node2));
        return btd2;
    }

    private btc bb(Node node) {
        btc btc2 = new btc();
        btc2.b(node);
        return btc2;
    }

    public void P(Map<Integer, List<dfq>> map) {
        byte[] byArray = null;
        byArray = loi.exd().readFile("level/dynamic_objects_lights.bin");
        if (byArray == null) {
            lfn.b(5, "SFDynamicObjectsParser", "readDynamicLightsFile() :Failed to open dynamic lights file for reading!");
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        lhd lhd2 = new lhd(new DataInputStream(byteArrayInputStream));
        jyl.a(lhd2, map);
    }

    public void Q(Map<Integer, Map<Integer, List<bsx>>> map) {
        byte[] byArray = null;
        byArray = loi.exd().readFile("level/dynamic_objects_generic.bin");
        if (byArray == null) {
            lfn.b(5, "SFDynamicObjectsParser", "readDynamicObjectsGenericFile() :Failed to open dynamic object generic file for reading!");
            return;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        lhd lhd2 = new lhd(new DataInputStream(byteArrayInputStream));
        jyl.b(lhd2, map);
    }
}

