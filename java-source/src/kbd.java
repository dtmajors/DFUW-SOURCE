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
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kbd {
    public static final String oWs = "SFXML";
    public static final String pct = "PrimaryResourceType";
    public static final String pcu = "MineRegrowRate";
    public static final String pcv = "MineMaxQuantity";
    public static final String pcw = "PrimaryResourceTypeMaxDeliver";
    public static final String pcx = "MineResourceInitialValue";
    public static final String pcy = "SecondaryResourceTypesMaxDeliver";
    public static final String pcz = "SecondaryResourceTypeRandomChance";
    public static final String pcA = "SecondaryResourceType";
    public static final String pcB = "SFMineInfo";
    public static final lju oRy = new lju(0, 1, 0);

    public void wi(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        try {
            NodeList nodeList = document.getElementsByTagName(pcB);
            if (nodeList.getLength() == 0) {
                return;
            }
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                ame ame2 = null;
                String string2 = null;
                try {
                    ame2 = this.eE(nodeList.item(i2));
                    string2 = lea.enW().getName(ame2.FU());
                    int n = ame2.FW();
                    Map<Integer, ame> map = lea.acn(n);
                    if (map.containsKey(new Integer(ame2.FU()))) {
                        throw new bg("A Mine with ResourceName='" + string2 + "' already exists.");
                    }
                    int n2 = ame2.FU();
                    map.put(n2, ame2);
                    continue;
                }
                catch (bg bg2) {
                    if (ame2 != null && string2 != null) {
                        throw new bg("Parsing of Mine With ResourceName'" + string2 + "' failed.", bg2);
                    }
                    throw new bg("Parsing of Mine " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private ame eE(Node node) {
        int n;
        String string;
        String string2;
        Object object;
        String string3 = this.a(node, "SFResourceName", true, null);
        int n2 = lea.enW().getType(string3);
        if (n2 < 0) {
            throw new bj("Node 'SFResourceName' has invalid value [" + string3 + "]");
        }
        ame ame2 = new ame();
        ame2.gI(n2);
        int n3 = this.t(node, pcv);
        float f2 = this.s(node, pcu);
        float f3 = this.s(node, pcw);
        float f4 = this.s(node, pcx);
        float f5 = this.s(node, pcy);
        float f6 = this.s(node, pcz);
        String string4 = ((Element)node).getAttribute("ResourceAreaID");
        int n4 = 0;
        if (string4 != null && string4.length() > 0) {
            try {
                n4 = Integer.valueOf(string4);
            }
            catch (Exception exception) {
                lfn.b(5, this.getClass().getSimpleName(), "parseSFMineInfoNode:invalid resource area string value:" + string4);
                throw new bj("parseSFMineInfoNode:invalid resource area string value:" + string4);
            }
            ame2.gJ(n4);
        }
        assert (n3 != 0);
        assert (f2 != 0.0f);
        assert (f3 != 0.0f);
        assert (f4 != 0.0f);
        ame2.aO(n3);
        ame2.aL(f2);
        ame2.aK(f3);
        ame2.aJ(f4);
        int n5 = 0;
        ArrayList<Integer> arrayList = lcn.emv();
        lcc<Integer> lcc2 = new lcc<Integer>();
        int n6 = 0;
        for (object = node.getFirstChild(); object != null; object = object.getNextSibling()) {
            string2 = object.getNodeName();
            if (string2 == null || !string2.equals(pct)) continue;
            lcc2.value = 1;
            string = this.a(pct, (Node)object, false, lcc2);
            if (string == null) continue;
            n6 += ((Integer)lcc2.value).intValue();
            n = lea.enW().getType(string);
            for (int i2 = 0; i2 < (Integer)lcc2.value; ++i2) {
                arrayList.add(n);
            }
            ++n5;
        }
        assert (n5 > 0) : "Need ATLEAST 1 primary resourcetype!";
        ame2.O(arrayList);
        n5 = 0;
        object = lcn.emv();
        while ((string = this.a(node, string2 = pcA + n5, false, null)) != null) {
            n = lea.enW().getType(string);
            object.add(n);
            ++n5;
        }
        ame2.N((List<Integer>)object);
        if (!object.isEmpty()) {
            assert (f5 != 0.0f);
            assert (f6 != 0.0f);
        }
        ame2.aN(f5);
        ame2.aM(f6);
        return ame2;
    }

    private String a(Node node, String string, boolean bl, lcc<Integer> lcc2) {
        Node node2 = jsy.a(string, node);
        if (node2 == null) {
            if (bl) {
                throw new bj("Node '" + string + "' does not exist.");
            }
            return null;
        }
        return this.a(string, node2, bl, lcc2);
    }

    private String a(String string, Node node, boolean bl, lcc<Integer> lcc2) {
        Element element;
        String string2 = jsy.m(node);
        if ((string2 == null || string2.trim().equals("")) && bl) {
            throw new bj("Node '" + string + "' has invalid value.");
        }
        if (lcc2 != null && node.getNodeType() == 1 && (element = (Element)node).hasAttribute("Count")) {
            String string3 = element.getAttribute("Count");
            lcc2.value = Integer.valueOf(string3);
        }
        return string2;
    }

    private float s(Node node, String string) {
        Node node2 = jsy.d(string, node);
        float f2 = jsy.o(node2);
        return f2;
    }

    private int t(Node node, String string) {
        Node node2 = jsy.d(string, node);
        int n = jsy.r(node2);
        return n;
    }

    public boolean wj(String string) {
        String string2 = "xml-files/server/gamelogicinfo/mineinfotemplate.xml";
        Document document = jsy.tJ(string2);
        jsy.a(document, oRy);
        string2 = "xml-files/server/gamelogicinfo/mineinfolist.xml";
        Document document2 = jsy.tJ(string2);
        jsy.a(document2, oRy);
        try {
            if (this.b(string, document2)) {
                return false;
            }
            Node node = jsy.a(oWs, (Node)document);
            Node node2 = jsy.a(pcB, node);
            if (node2 == null) {
                return false;
            }
            Node node3 = jsy.a("SFResourceName", node2);
            if (node3 == null) {
                throw new bj("Node 'SFResourceName' does not exist.");
            }
            Node node4 = this.g(node3);
            node4.setNodeValue(string);
            Node node5 = jsy.a(oWs, (Node)document2);
            Node node6 = document2.importNode(node2, true);
            node5.appendChild(node6);
            jsz.b(document2, lcw.qLb + string2);
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string2 + "' failed.", bg2);
        }
        return true;
    }

    private boolean b(String string, Document document) {
        NodeList nodeList = document.getElementsByTagName(pcB);
        if (nodeList.getLength() == 0) {
            return false;
        }
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            try {
                String string2 = this.a(nodeList.item(i2), "SFResourceName", true, null);
                if (!string.equalsIgnoreCase(string2)) continue;
                return true;
            }
            catch (bg bg2) {
                throw new bg("Parsing of Mine " + i2 + " failed.", bg2);
            }
        }
        return false;
    }

    public Node g(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                node2 = nodeList.item(i2);
                if (!node2.getNodeName().equals("SFString")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("Value");
                return node;
            }
        }
        return null;
    }
}

