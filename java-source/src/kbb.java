/*
 * Decompiled with CFR.
 */
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kbb {
    public static final String oWs = "SFXML";
    public static final String pbB = "SFHouseInfo";
    public static final String pbC = "SFDoorXML";
    public static final String pbD = "SFDoorOpenSpecialEffect";
    public static final String pbE = "SFDoorCloseSpecialEffect";
    public static final String pbF = "DeedResourceType";
    public static final lju oRy = new lju(0, 1, 0);

    public void wg(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        try {
            NodeList nodeList = document.getElementsByTagName(pbB);
            if (nodeList.getLength() == 0) {
                return;
            }
            Map<Integer, clf> map = lea.eoZ();
            clf clf2 = null;
            String string2 = null;
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                clf2 = null;
                try {
                    clf2 = this.eC(nodeList.item(i2));
                    string2 = lea.enW().getName(clf2.oY());
                    if (map.containsKey(new Integer(clf2.oY()))) {
                        throw new bg("A House with ResourceName='" + string2 + "' already exists.");
                    }
                    map.put(new Integer(clf2.oY()), clf2);
                    continue;
                }
                catch (bg bg2) {
                    if (clf2 != null && string2 != null) {
                        throw new bg("Parsing of HouseInfo With ResourceName'" + string2 + "' failed.", bg2);
                    }
                    throw new bg("Parsing of HouseInfo " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private clf eC(Node node) {
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node2 = namedNodeMap.getNamedItem(pbF);
        int n = lea.enW().getType(node2.getNodeValue());
        if (n <= 0) {
            throw new bj("Attribute 'DeedResourceType' has invalid value [" + node2.getNodeValue() + "]");
        }
        String string = this.e(node, "SFResourceName", true);
        int n2 = lea.enW().getType(string);
        if (n2 <= 0) {
            throw new bj("Node 'SFResourceName' has invalid value [" + string + "]");
        }
        clf clf2 = new clf();
        clf2.ru(n2);
        clf2.rv(n);
        String string2 = this.e(node, pbD, true);
        String string3 = this.e(node, pbE, true);
        String string4 = this.e(node, pbC, true);
        clf2.hD(string4);
        int n3 = del.dr(string2);
        if (n3 <= 0) {
            throw new bj("Node 'SFDoorOpenSpecialEffect' has invalid value [" + string2 + "]");
        }
        int n4 = del.dr(string3);
        if (n4 <= 0) {
            throw new bj("Node 'SFDoorCloseSpecialEffect' has invalid value [" + string3 + "]");
        }
        clf2.rs(n3);
        clf2.rt(n4);
        return clf2;
    }

    private String e(Node node, String string, boolean bl) {
        Node node2 = jsy.a(string, node);
        if (node2 == null) {
            if (bl) {
                throw new bj("Node '" + string + "' does not exist.");
            }
            return null;
        }
        String string2 = jsy.m(node2);
        if ((string2 == null || string2.trim().equals("")) && bl) {
            throw new bj("Node '" + string + "' has invalid value.");
        }
        return string2;
    }
}

