/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jvp {
    private static final String oTQ = "territories";
    private static final String oTR = "territory";
    private static final String oTU = "territory_id";
    private static final String oTZ = "object_id";
    private static final String oUa = "object_type";
    private static final String oUb = "borders";
    private static final String oUc = "coverage";
    private static final String oUd = ",";
    private static Set<dml> oUe = null;

    public static Set<dml> dTA() {
        return oUe;
    }

    public static void load() {
        if (oUe != null) {
            return;
        }
        String string = "xml-files/gamelogicinfo/territories.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, jvp.class.getSimpleName(), "parseConfig() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            assert (false);
            throw new bo("territories.xml", bo2);
        }
        Element element = document.getDocumentElement();
        if (!element.getNodeName().equals(oTQ)) {
            lfn.b(5, jvp.class.getSimpleName(), "parseConfig() : Unexpected root node encountered! Expected 'territories', Found '" + element.getLocalName() + "'!");
            assert (false);
            throw new bo("territories.xml");
        }
        oUe = lcn.emx();
        NodeList nodeList = element.getElementsByTagName(oTR);
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            dml dml2;
            Node node = nodeList.item(i2);
            if (node.getNodeType() != 1 || (dml2 = jvp.B((Element)node)) == null) continue;
            oUe.add(dml2);
        }
    }

    private static dml B(Element element) {
        if (element == null) {
            return null;
        }
        String string = element.getAttribute(oTZ);
        String string2 = element.getAttribute(oUa);
        String string3 = element.getAttribute(oTU);
        String string4 = element.getAttribute(oUb);
        String string5 = element.getAttribute(oUc);
        if (string == null || string.trim().isEmpty() || string2 == null || string2.trim().isEmpty() || string3 == null || string3.trim().isEmpty()) {
            return null;
        }
        dmj dmj2 = dmj.getValueByOrdinal(Integer.parseInt(string2.trim()));
        if (dmj2 == null || dmj2 == dmj.gIf) {
            return null;
        }
        int n = Integer.parseInt(string3.trim());
        ArrayList<Integer> arrayList = lcn.emv();
        if (string4 != null && !string4.trim().isEmpty()) {
            String[] stringArray;
            for (String string6 : stringArray = string4.trim().split(oUd)) {
                arrayList.add(Integer.parseInt(string6));
            }
        }
        float f = Float.parseFloat(string5);
        return new dml(dmj2, string.trim(), n, arrayList, f);
    }
}

