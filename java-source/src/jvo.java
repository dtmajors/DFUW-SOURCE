/*
 * Decompiled with CFR.
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jvo {
    private static final String oTQ = "territories";
    private static final String oTR = "territory";
    private static final String oTS = "border_points";
    private static final String oTT = "point";
    private static final String oTU = "id";
    private static final String oTV = "offset_x";
    private static final String oTW = "offset_y";
    private static final String oTX = "x";
    private static final String oTY = "y";

    public static dmk Wg(int n) {
        String string = "xml-files/client/territories/" + jvo.Wh(n);
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, jvo.class.getSimpleName(), "loadTerritoryImageInfo() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            assert (false);
            return null;
        }
        Element element = document.getDocumentElement();
        if (!element.getNodeName().equals(oTQ)) {
            lfn.b(5, jvo.class.getSimpleName(), "loadTerritoryImageInfo() : Unexpected root node encountered! Expected 'territories', Found '" + element.getLocalName() + "'!");
            assert (false);
            return null;
        }
        NodeList nodeList = element.getElementsByTagName(oTR);
        if (nodeList.getLength() != 1) {
            lfn.b(5, jvo.class.getSimpleName(), "loadTerritoryImageInfo() : Unexpected territories count! Expected 1, Found '" + nodeList.getLength() + "'!");
            assert (false);
            return null;
        }
        Node node = nodeList.item(0);
        if (node.getNodeType() != 1) {
            lfn.b(5, jvo.class.getSimpleName(), "loadTerritoryImageInfo() : Territory node is not an element!");
            assert (false);
            return null;
        }
        return jvo.z((Element)node);
    }

    private static dmk z(Element element) {
        if (element == null) {
            return null;
        }
        String string = element.getAttribute(oTU);
        String string2 = element.getAttribute(oTV);
        String string3 = element.getAttribute(oTW);
        int n = -1;
        ioc ioc2 = null;
        try {
            n = Integer.parseInt(string);
            ioc2 = new ioc(Integer.parseInt(string2), Integer.parseInt(string3));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, jvo.class.getSimpleName(), "parseTerritoryNode() : Territory attributes are not parsable integers!");
            assert (false);
            return null;
        }
        Map<Integer, List<ioc>> map = lcn.emw();
        NodeList nodeList = element.getElementsByTagName(oTS);
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node = nodeList.item(i2);
            if (node.getNodeType() != 1) continue;
            Element element2 = (Element)node;
            String string4 = element2.getAttribute(oTU);
            int n2 = 0;
            try {
                n2 = Integer.parseInt(string4);
            }
            catch (NumberFormatException numberFormatException) {
                lfn.b(5, jvo.class.getSimpleName(), "parseTerritoryNode() : Border territory ID attribute is not a parsable integer!");
                assert (false);
                return null;
            }
            LinkedList<ioc> linkedList = lcn.emA();
            map.put(n2, linkedList);
            NodeList nodeList2 = element2.getElementsByTagName(oTT);
            for (int i3 = 0; i3 < nodeList2.getLength(); ++i3) {
                ioc ioc3;
                Node node2 = nodeList2.item(i3);
                if (node2.getNodeType() != 1 || (ioc3 = jvo.A((Element)node2)) == null) continue;
                linkedList.add(ioc3);
            }
        }
        return new dmk(n, jvo.Wi(n), ioc2, map);
    }

    private static ioc A(Element element) {
        if (element == null) {
            return null;
        }
        String string = element.getAttribute(oTX);
        String string2 = element.getAttribute(oTY);
        try {
            return new ioc(Integer.parseInt(string), Integer.parseInt(string2));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, jvo.class.getSimpleName(), "parsePoint() : Point attributes are not parsable integers!");
            assert (false);
            return null;
        }
    }

    private static String Wh(int n) {
        if (n < 10) {
            return "00" + n + ".xml";
        }
        if (n < 100) {
            return "0" + n + ".xml";
        }
        return n + ".xml";
    }

    private static String Wi(int n) {
        if (n < 10) {
            return "00" + n + ".png";
        }
        if (n < 100) {
            return "0" + n + ".png";
        }
        return n + ".png";
    }
}

