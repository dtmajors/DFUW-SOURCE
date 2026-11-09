/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jur {
    private static final String oSs = "area";
    private static final String oQd = "id";

    private jur() {
    }

    public static void dTt() {
        String string = "xml-files/quadtrees/quest_areas.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, jtn.class.getSimpleName(), "parseConfig() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            return;
        }
        NodeList nodeList = document.getElementsByTagName(oSs);
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node = nodeList.item(i2);
            if (node.getNodeType() != 1) continue;
            jur.y((Element)node);
        }
    }

    private static void y(Element element) {
        block7: {
            if (element == null) {
                return;
            }
            if (!element.getTagName().equals(oSs)) {
                return;
            }
            String string = element.getAttribute(oQd);
            try {
                int n = Integer.parseInt(string);
                String string2 = "";
                if (n < 1000) {
                    string2 = string2 + "0";
                }
                if (n < 100) {
                    string2 = string2 + "0";
                }
                if (n < 10) {
                    string2 = string2 + "0";
                }
                string2 = string2 + Integer.toString(n) + ".sfqt";
                yu yu2 = new yu(n);
                yu2.BP("xml-files/quadtrees/questareas/" + string2);
                lea.a(yu2);
            }
            catch (Exception exception) {
                if ($assertionsDisabled) break block7;
                throw new AssertionError();
            }
        }
    }
}

