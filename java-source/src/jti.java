/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  kah
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jti {
    private les dqt = lea.enU();

    public Object T(String string, int n) {
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, new lju(0, 2, 0));
            NodeList nodeList = document.getElementsByTagName("SFFunctionObject");
            if (nodeList.getLength() == 0) {
                throw new bg("SFFile '" + string + "' contains no '" + "SFFunctionObject" + "' node.");
            }
            if (n == this.dqt.getType("f_Spawn Resource") || n == this.dqt.getType("f_Spawn Weapon") || n == this.dqt.getType("f_Spawn Ammunition")) {
                return this.H(nodeList.item(0));
            }
            return null;
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }

    private Object H(Node node) {
        List<Node> list = jsy.c("SFResourceName", node);
        if (list.isEmpty()) {
            throw new bj("No 'SFResourceName' nodes found.");
        }
        int[] nArray = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            nArray[i] = kah.dv((Node)list.get(i));
            if (nArray[i] > 0) continue;
            throw new bj("'SFResourceName' node " + i + " has invalid value.");
        }
        return nArray;
    }

    private Node f(Document document) {
        NodeList nodeList = document.getElementsByTagName("SFFunctionObject");
        if (nodeList.getLength() == 1) {
            return nodeList.item(0);
        }
        return null;
    }

    private boolean f(String string, Node node) {
        String string2 = this.i(string, node);
        return string2 != null && string2.equalsIgnoreCase("true");
    }

    private float g(String string, Node node) {
        String string2 = this.i(string, node);
        if (string2 != null) {
            return new Float(string2).floatValue();
        }
        return -1.0f;
    }

    private int h(String string, Node node) {
        String string2 = this.i(string, node);
        if (string2 != null) {
            return new Integer(string2);
        }
        return -1;
    }

    private String i(String string, Node node) {
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node2 = namedNodeMap.getNamedItem(string);
        if (node2 != null) {
            return node2.getNodeValue();
        }
        return null;
    }
}

