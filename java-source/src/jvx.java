/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class jvx {
    private static final lju avd = new lju(1, 0);
    private static final String ave = "xp_gain_config";
    private static final String oVD = "modifier";
    private static final String avv = "version_major";
    private static final String avw = "version_minor";
    private static final String oVE = "category";
    private static final String oVF = "value";

    private jvx() {
    }

    public static void adj() {
        String string = "xml-files/server/gamelogicinfo/xp_gain_config.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, jvx.class.getSimpleName(), "loadConfiguration() : Exception encountered while creating XML document object!!! Exception Message = " + bo2.getMessage());
            assert (false);
            return;
        }
        Element element = document.getDocumentElement();
        String string2 = element.getAttribute(avv);
        String string3 = element.getAttribute(avw);
        int n = 0;
        int n2 = 0;
        try {
            n = Integer.parseInt(string2);
            n2 = Integer.parseInt(string3);
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, jvx.class.getSimpleName(), "loadConfiguration() : Error parsing version number from document! Document Version[" + string2 + "," + string3 + "]");
            assert (false);
            return;
        }
        lju lju2 = new lju(n, n2);
        if (!lju2.b(avd)) {
            lfn.b(5, jvx.class.getSimpleName(), "loadConfiguration() : Version number mismatch! Parser " + avd.toString() + ", Document " + lju2.toString());
            assert (false);
            return;
        }
        NodeList nodeList = element.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            if (nodeList.item(i2).getNodeType() != 1) continue;
            Element element2 = (Element)nodeList.item(i2);
            if (element2.getTagName().compareTo(oVD) != 0) {
                lfn.b(5, jvx.class.getSimpleName(), "loadConfiguration() : Unexpected Element Node Encountered!!!... Node Tag = " + element2.getTagName());
                continue;
            }
            cxn cxn2 = cxn.valueOf(element2.getAttribute(oVE));
            if (cxn2 == null) {
                lfn.b(5, jvx.class.getSimpleName(), "loadConfiguration() : Bad Category Attribute Encountered!!!... Node Tag = " + element2.getTagName() + ", Category Attribute = " + element2.getAttribute(oVE));
                continue;
            }
            try {
                float f = Float.parseFloat(element2.getAttribute(oVF));
                if (f <= 0.0f) {
                    lfn.b(5, jvx.class.getSimpleName(), "loadConfiguration() : Invalid Value Encountered!!!... Node Tag = " + element2.getTagName() + ", Category = " + (Object)((Object)cxn2) + ", Value = " + f);
                    continue;
                }
                cxd.a((cxn)cxn2, (float)f);
                continue;
            }
            catch (NumberFormatException numberFormatException) {
                lfn.b(5, jvx.class.getSimpleName(), "loadConfiguration() : Bad Value Attribute Encountered!!!... Node Tag = " + element2.getTagName() + ", Category = " + (Object)((Object)cxn2) + ", Value Attribute = " + element2.getAttribute(oVF));
            }
        }
    }
}

