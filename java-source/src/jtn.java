/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jtn {
    private static final String oQb = "area";
    private static final String oQc = "name";
    private static final String oQd = "id";
    private static final String oQe = "reveal_mode";

    private jtn() {
    }

    public static void dSJ() {
        String string = "xml-files/quadtrees/auto_explore_areas.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, jtn.class.getSimpleName(), "parseConfig() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            return;
        }
        NodeList nodeList = document.getElementsByTagName(oQb);
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node = nodeList.item(i2);
            if (node.getNodeType() != 1) continue;
            jtn.s((Element)node);
        }
    }

    private static void s(Element element) {
        block8: {
            if (element == null) {
                return;
            }
            if (!element.getTagName().equals(oQb)) {
                return;
            }
            String string = element.getAttribute(oQd);
            String string2 = element.getAttribute(oQc);
            String string3 = element.getAttribute(oQe);
            try {
                int n = Integer.parseInt(string);
                int n2 = Integer.parseInt(string3);
                lf lf2 = lf.getValueByOrdinal(n2);
                if (lf2 == null) {
                    return;
                }
                String string4 = "";
                if (n < 1000) {
                    string4 = string4 + "0";
                }
                if (n < 100) {
                    string4 = string4 + "0";
                }
                if (n < 10) {
                    string4 = string4 + "0";
                }
                string4 = string4 + Integer.toString(n) + ".sfqt";
                ld ld2 = new ld(n, string2, lf2);
                ld2.BP("xml-files/quadtrees/autoexploreareas/" + string4);
                ky.a(ld2);
            }
            catch (Exception exception) {
                if ($assertionsDisabled) break block8;
                throw new AssertionError();
            }
        }
    }
}

