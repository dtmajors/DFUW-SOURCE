/*
 * Decompiled with CFR.
 */
import java.util.TreeMap;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jtq {
    public static void dSN() {
        awe awe2 = lea.rhC;
        String string = "xml-files/client/chat/chatfilters.xml";
        Document document = jsy.tJ(string);
        NodeList nodeList = document.getElementsByTagName("Filter");
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node = nodeList.item(i2);
            awt awt2 = jtq.K(node);
            awe2.a(awt2);
        }
    }

    private static String getAttribute(Node node, String string) {
        if (node == null) {
            throw new bo("Can't get attribute " + string + " from null node");
        }
        Node node2 = node.getAttributes().getNamedItem(string);
        if (node2 == null) {
            throw new bo("Attribute " + string + " not found");
        }
        return node2.getNodeValue();
    }

    private static awt K(Node node) {
        awt awt2 = new awt(lea.rhC, jtq.getAttribute(node, "TableName"));
        NodeList nodeList = node.getChildNodes();
        TreeMap<Integer, awr> treeMap = lcn.emG();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Object object = nodeList.item(i2);
            if (!object.getNodeName().equals("Rule")) continue;
            awr awr2 = jtq.L((Node)object);
            int n = Integer.parseInt(jtq.getAttribute((Node)object, "Index"));
            treeMap.put(n, awr2);
        }
        for (Object object : treeMap.values()) {
            awt2.a((awr)object);
        }
        return awt2;
    }

    private static awr L(Node node) {
        aws aws2 = aws.valueOf(jtq.getAttribute(node, "Option"));
        awr awr2 = new awr(aws2);
        NodeList nodeList = node.getChildNodes();
        TreeMap<Integer, Object> treeMap = lcn.emG();
        TreeMap<Integer, Object> treeMap2 = lcn.emG();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            int n;
            Object object;
            Object object2 = nodeList.item(i2);
            if (object2.getNodeName().equals("Match")) {
                object = jtq.N((Node)object2);
                n = Integer.parseInt(jtq.getAttribute((Node)object2, "Index"));
                treeMap2.put(n, object);
                continue;
            }
            if (!object2.getNodeName().equals("Action")) continue;
            object = jtq.M((Node)object2);
            n = Integer.parseInt(jtq.getAttribute((Node)object2, "Index"));
            treeMap.put(n, object);
        }
        for (Object object2 : treeMap.values()) {
            awr2.Xs().a((awb)object2);
        }
        for (Object object2 : treeMap2.values()) {
            awr2.Xr().a((awf)object2);
        }
        return awr2;
    }

    private static awb M(Node node) {
        awd awd2 = awd.valueOf(jtq.getAttribute(node, "Type"));
        String string = jtq.getAttribute(node, "Variable");
        awm awm2 = string.isEmpty() ? null : awm.valueOf(string);
        String string2 = jtq.getAttribute(node, "Value");
        if (awd2 == null) {
            throw new bo("Invalid Type in Rule Action node");
        }
        return new awb(lea.rhC, awd2, awm2, string2);
    }

    private static awf N(Node node) {
        awh awh2 = awh.valueOf(jtq.getAttribute(node, "Type"));
        boolean bl = Boolean.parseBoolean(jtq.getAttribute(node, "Inverted"));
        boolean bl2 = Boolean.parseBoolean(jtq.getAttribute(node, "CheckAllInSet"));
        String string = jtq.getAttribute(node, "Value");
        awm awm2 = awm.valueOf(jtq.getAttribute(node, "Variable"));
        return new awf(awh2, bl, awm2, string, bl2);
    }
}

