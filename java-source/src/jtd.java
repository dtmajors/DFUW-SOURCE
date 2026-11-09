/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class jtd {
    public String tN(String string) {
        if (!jry.tq(string)) {
            string = jry.tr(string);
        }
        assert (string != null);
        return this.tO(string);
    }

    public String tO(String string) {
        if (!jry.tq(string)) assert (false);
        String string2 = jry.tp(string);
        String string3 = null;
        if (jry.tj(string) && this.tP(string)) {
            Document document = null;
            try {
                document = jsy.tJ(string);
            }
            catch (bo bo2) {
                // empty catch block
            }
            if (document != null) {
                Element element = document.getDocumentElement();
                string3 = element.getNodeName();
            } else {
                string3 = "Not XML SFFile";
            }
        }
        return string3;
    }

    public boolean tP(String string) {
        return string.toLowerCase().endsWith(".xml");
    }

    public int dn(String string) {
        if (!jry.tq(string)) assert (false);
        int n = 0;
        if (jry.tj(string) && this.tP(string)) {
            Document document = null;
            try {
                document = jsy.tJ(string);
            }
            catch (bo bo2) {
                return n;
            }
            if (document != null) {
                NodeList nodeList = document.getElementsByTagName("ObjectType");
                if (nodeList == null) {
                    return 0;
                }
                String string2 = jsy.m(nodeList.item(0));
                for (int i = 0; i < amh.bxE.length; ++i) {
                    if (!string2.equals(amh.bxE[i])) continue;
                    return i;
                }
                return 0;
            }
            n = 0;
        }
        return n;
    }
}

