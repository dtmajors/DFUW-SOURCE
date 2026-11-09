/*
 * Decompiled with CFR.
 */
import java.awt.Component;
import java.awt.Cursor;
import java.util.Vector;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class mxd {
    protected static final Cursor ESi = new Cursor(3);
    protected static final Cursor EEm = new Cursor(0);
    private static lju oZi = new lju(0, 3);

    public static Vector aU(String string, String string2) {
        Vector<Object> vector = new Vector<Object>();
        jrw jrw2 = new jrw(string);
        Document document = null;
        try {
            document = jsy.n(jrw2);
            Node node = jsy.a(string2, (Node)document);
            if (node != null) {
                if (string2.equals("SFInteractionInventory")) {
                    NodeList nodeList = node.getChildNodes();
                    for (int i = 0; i < nodeList.getLength(); ++i) {
                        Node node2 = nodeList.item(i);
                        if (!node2.getNodeName().equals("SFItemRepresentation")) continue;
                        node2 = jsy.a("SFResourceName", node2);
                        String string3 = jsy.m(node2);
                        vector.add(string3);
                    }
                } else if (string2.equals("SFLootInventory")) {
                    node = jsy.a(string2, (Node)document);
                    Node node3 = jsy.a("ResourceList", node);
                    NodeList nodeList = node3.getChildNodes();
                    for (int i = 0; i < nodeList.getLength(); ++i) {
                        node3 = nodeList.item(i);
                        NodeList nodeList2 = node3.getChildNodes();
                        for (int j = 0; j < nodeList2.getLength(); ++j) {
                            String string4 = nodeList2.item(j).getNodeName();
                            if (string4.equals("SFResourceName")) {
                                String string5 = jsy.m(nodeList2.item(j));
                                vector.add(string5);
                                continue;
                            }
                            if (string4.equals("ChanceOfDrop")) {
                                float f2 = jsy.o(nodeList2.item(j));
                                vector.add(String.valueOf(f2));
                                continue;
                            }
                            if (!string4.equals("Number")) continue;
                            int n = jsy.r(nodeList2.item(j));
                            vector.add(n);
                        }
                    }
                }
            }
        }
        catch (bo bo2) {
            // empty catch block
        }
        return vector;
    }

    public static void a(String string, Component component, String string2) {
        component.setCursor(ESi);
        jta jta2 = new jta();
        Document document = jta2.dSD();
        Element element = jta2.a(document, string2, oZi);
        document.appendChild(element);
        jsz.a(document, new jrw(string));
        component.setCursor(EEm);
    }

    public static void Ea(String string) {
    }

    public static boolean ae(jrw jrw2) {
        Document document = null;
        try {
            document = jsy.n(jrw2);
            Node node = jsy.a("SFResource", (Node)document);
            if (node != null) {
                return true;
            }
        }
        catch (bo bo2) {
            // empty catch block
        }
        return false;
    }
}

