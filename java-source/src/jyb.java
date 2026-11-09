/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lkv
 */
import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jyb {
    public static void a(String string, ArrayList<lkc> arrayList, ArrayList<lkb> arrayList2) {
        if (arrayList == null) {
            return;
        }
        if (arrayList2 == null) {
            return;
        }
        Document document = null;
        try {
            document = jsy.tJ("xml-files/object/animation/aac/" + string);
        }
        catch (bo bo2) {
            lfn.b(5, "SFAnimationAACParser", "Document Parse Exception: " + bo2);
            return;
        }
        jyb.a(document, jry.tn(string), arrayList, arrayList2);
    }

    private static void a(Document document, String string, ArrayList<lkc> arrayList, ArrayList<lkb> arrayList2) {
        Node node = jsy.a("SFAnimationAACTemplate", (Node)document);
        if (node == null) {
            lfn.b(5, "SFAnimationAACParser", "SFANIMATIONAAC_TEMPLATE [" + string + "] is invalid!");
            assert (false);
            return;
        }
        NodeList nodeList = node.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Object object;
            Node node2 = nodeList.item(i2);
            if (node2.getNodeName().equals("StateGroup") && (object = jyb.cn(node2)) != null) {
                arrayList.add((lkc)object);
            }
            if (!node2.getNodeName().equals("MaterialGroup") || (object = jyb.cm(node2)) == null) continue;
            arrayList2.add((lkb)object);
        }
    }

    private static lkb cm(Node node) {
        NodeList nodeList;
        NamedNodeMap namedNodeMap = node.getAttributes();
        lkb lkb2 = new lkb();
        Node node2 = namedNodeMap.getNamedItem("Category");
        if (node2 != null) {
            lkb2.nBN = node2.getNodeValue();
        }
        if ((node2 = namedNodeMap.getNamedItem("Type")) != null) {
            lkb2.Type = Integer.parseInt(node2.getNodeValue());
        }
        if ((nodeList = node.getChildNodes()).getLength() < 1) {
            return null;
        }
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node3 = nodeList.item(i2);
            if (!node3.getNodeName().equals("Sound") || (node2 = (namedNodeMap = node3.getAttributes()).getNamedItem("Name")) == null) continue;
            lkb2.rqa.add(node2.getNodeValue());
        }
        return lkb2;
    }

    private static lkc cn(Node node) {
        NodeList nodeList;
        NamedNodeMap namedNodeMap = node.getAttributes();
        lkc lkc2 = new lkc();
        Node node2 = namedNodeMap.getNamedItem("Left");
        if (node2 != null) {
            lkc2.rqd = Float.parseFloat(node2.getNodeValue());
        }
        if ((node2 = namedNodeMap.getNamedItem("Right")) != null) {
            lkc2.rqe = Float.parseFloat(node2.getNodeValue());
        }
        if ((node2 = namedNodeMap.getNamedItem("Left2")) != null) {
            lkc2.rqf = Float.parseFloat(node2.getNodeValue());
        }
        if ((node2 = namedNodeMap.getNamedItem("Right2")) != null) {
            lkc2.rqg = Float.parseFloat(node2.getNodeValue());
        }
        if ((node2 = namedNodeMap.getNamedItem("Left3")) != null) {
            lkc2.rqh = Float.parseFloat(node2.getNodeValue());
        }
        if ((node2 = namedNodeMap.getNamedItem("Right3")) != null) {
            lkc2.rqi = Float.parseFloat(node2.getNodeValue());
        }
        if ((node2 = namedNodeMap.getNamedItem("Probability")) != null) {
            lkc2.ddW = Integer.parseInt(node2.getNodeValue());
        }
        if ((node2 = namedNodeMap.getNamedItem("Type")) != null) {
            lkc2.Type = Integer.parseInt(node2.getNodeValue());
        }
        if ((nodeList = node.getChildNodes()).getLength() < 1) {
            return null;
        }
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            int n;
            Node node3 = nodeList.item(i2);
            if (!node3.getNodeName().equals("Set") || (node2 = (namedNodeMap = node3.getAttributes()).getNamedItem("Name")) == null || (n = lkv.AG((String)node2.getNodeValue())) < 0) continue;
            n = lkv.adq((int)n);
            lkc2.rqc.add(new Integer(n));
        }
        return lkc2;
    }
}

