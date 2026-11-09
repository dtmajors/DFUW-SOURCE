/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class jwo {
    private static final boolean bC = false;
    public static final String oWL = "EnvironmentConfig";
    public static final String oXH = "EnvironmentOS";
    public static final String oXI = "AllowedEffect";
    public static final String oXD = "File";
    public static final String oXJ = "StartTime";
    public static final String oXK = "InterpolationTime";
    public static final String oXL = "CharacterCreatorEnv";
    private lju fzk = new lju(0, 1);
    private jxd oXG = new jxd();
    private ber.a ddu;

    public List<bes> uO(String string) {
        Document document = null;
        try {
            document = jsy.m(new jrw(string));
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
            return null;
        }
        Node node = jsy.a(oWL, (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "SFANIMATIONPART_TEMPLATE [" + string + "] is invalid!");
            return null;
        }
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node22 = namedNodeMap.getNamedItem(oXI);
        if (node22 == null) {
            assert (false) : "No AllowedEffect attrib";
            return null;
        }
        int n = Integer.parseInt(node22.getNodeValue());
        this.ddu = ber.a.values()[n];
        lju lju2 = jsy.c(document);
        if (!lju2.equals(this.fzk)) {
            lfn.b(5, this.getClass().getName(), "Cannot Load. Wrong Version: " + lju2);
            return null;
        }
        ArrayList<bes> arrayList = lcn.emv();
        List<Node> list = jsy.c(oXH, node);
        for (Node node22 : list) {
            namedNodeMap = node22.getAttributes();
            if ((node22 = namedNodeMap.getNamedItem(oXD)) == null) {
                assert (false) : "No File attrib";
                return null;
            }
            String string2 = node22.getNodeValue();
            node22 = namedNodeMap.getNamedItem(oXJ);
            if (node22 == null) {
                assert (false) : "No StartTime attrib";
                return null;
            }
            int n2 = Integer.parseInt(node22.getNodeValue());
            node22 = namedNodeMap.getNamedItem(oXK);
            if (node22 == null) {
                assert (false) : "No EndTime attrib";
                return null;
            }
            int n3 = Integer.parseInt(node22.getNodeValue());
            bew.e(bfb.dfP);
            bew.e(bfb.dfR);
            bew.e(bfb.dga);
            bes bes2 = new bes(n2, n3, string2);
            arrayList.add(bes2);
        }
        return arrayList;
    }

    public ber uP(String string) {
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
            return null;
        }
        ber ber2 = new ber();
        Map<a, Map<ldv, amf>> map = this.a(document, string, ber2);
        return this.a(map, ber2);
    }

    public void a(String string, ber ber2) {
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
            return;
        }
        Map<a, Map<ldv, amf>> map = this.a(document, string, ber2);
        this.a(map, ber2);
    }

    private ber a(Map<a, Map<ldv, amf>> map, ber ber2) {
        bfj bfj2 = new bfj();
        for (a a2 : map.keySet()) {
            Map<ldv, amf> map2 = map.get(a2);
            for (amf amf2 : map2.values()) {
                if (!(amf2 instanceof dqv)) continue;
                bfj2.a(ber2, (dqv)amf2, a2.det, a2.oXM);
            }
        }
        return ber2;
    }

    private Map<a, Map<ldv, amf>> a(Document document, String string, ber ber2) {
        Node node = jsy.a(oWL, (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "SFANIMATIONPART_TEMPLATE [" + string + "] is invalid!");
            return null;
        }
        lju lju2 = jsy.c(document);
        if (lju2 != null && !lju2.equals(this.fzk)) {
            lfn.b(5, this.getClass().getName(), "Cannot Load. Wrong Version: " + lju2);
            return null;
        }
        Node node2 = jsy.a(oXL, node);
        if (node2 != null) {
            boolean bl = jsy.t(node2);
            ber2.db(bl);
        }
        return this.bd(node);
    }

    private Map<a, Map<ldv, amf>> bd(Node node) {
        Map<a, Map<ldv, amf>> map = lcn.emw();
        List<Node> list = jsy.c(oXH, node);
        for (Node node2 : list) {
            NamedNodeMap namedNodeMap = node2.getAttributes();
            if ((node2 = namedNodeMap.getNamedItem(oXD)) == null) {
                assert (false) : "No File attrib";
                return map;
            }
            String string = node2.getNodeValue();
            node2 = namedNodeMap.getNamedItem(oXJ);
            if (node2 == null) {
                assert (false) : "No StartTime attrib";
                return map;
            }
            int n = Integer.parseInt(node2.getNodeValue());
            node2 = namedNodeMap.getNamedItem(oXK);
            if (node2 == null) {
                assert (false) : "No EndTime attrib";
                return map;
            }
            int n2 = Integer.parseInt(node2.getNodeValue());
            jrw jrw2 = new jrw(lcw.qLb + "xml-files/objectspace/" + "environment/" + string);
            bew.e(bfb.dfP);
            bew.e(bfb.dfR);
            bew.e(bfb.dga);
            Map<ldv, amf> map2 = this.oXG.c(jrw2, "environment/" + string, false);
            map.put(new a(this, n, n2), map2);
        }
        return map;
    }

    public ber.a ant() {
        return this.ddu;
    }
}

