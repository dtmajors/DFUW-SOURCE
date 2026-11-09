/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jxh {
    private lju fzk = new lju(0, 1);
    private final String oWD = "Could not parse Node = ";

    public void dUo() {
        Map<Integer, List<bsv>> map;
        Map<Integer, List<bsv>> map2;
        Map<Integer, List<bsv>> map3;
        String string = "";
        String string2 = "xml-files/zones/";
        String string3 = "xml-files/zones/dynamic_objects_vendors.xml";
        if (!jry.tj(string3)) {
            string3 = "xml-files/zones/dynamic_objects_vendors.xml";
        }
        if ((map3 = this.uK(string3)) != null) {
            fy.TG.clear();
            fy.TG.putAll(map3);
        }
        if (!jry.tj(string3 = "xml-files/zones/dynamic_objects_spawnpoints.xml")) {
            string3 = "xml-files/zones/dynamic_objects_spawnpoints.xml";
        }
        if ((map2 = this.uK(string3)) != null) {
            fy.TF.clear();
            fy.TF.putAll(map2);
        }
        if ((map = this.uK(string3 = "xml-files/zones/dynamic_objects_portals.xml")) != null) {
            fy.TJ.clear();
            fy.TJ.putAll(map);
        }
    }

    private Map<Integer, List<bsv>> uK(String string) {
        Document document;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            assert (false);
            return null;
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
            lfn.b(5, this.getClass().getName(), "SFLEVEL_INFO_FILE [" + string + "] is invalid!");
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
        String string = "SFLevelObjectSpawnPoint";
        List<Node> list = jsy.c(string, node);
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
        string = "SFLevelObjectPortal";
        list = jsy.c(string, node);
        if (list == null) {
            assert (false);
            throw new bp("Could noe parse [" + string + "] Node");
        }
        for (Node node2 : list) {
            arrayList.add(this.aY(node2));
        }
        return arrayList;
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
        btb2.dKx = arrayList.toArray(new ljq[arrayList.size()]);
        assert (!arrayList.isEmpty()) : "Portal [" + btb2.dKs + "] has no targets!";
        return btb2;
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
}

