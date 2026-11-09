/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class jwi {
    public static final String oWL = "SFCityList";
    public static final String oGJ = "City";
    public static final String oWM = "Filename";
    lju fzk = new lju(0, 1);

    public List<String> dUk() {
        String string = "xml-files/zones/filtered_cities.xml";
        if (!jry.tj(string)) {
            return this.dUl();
        }
        return this.uC(string);
    }

    public List<String> dUl() {
        String string = "xml-files/zones/cities.xml";
        return this.uC(string);
    }

    private List<String> uC(String string) {
        assert (jry.tj(string));
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            return null;
        }
        return this.i(document, jry.tn(string));
    }

    private List<String> i(Document document, String string) {
        ArrayList<String> arrayList = lcn.emv();
        Node node = jsy.a(oWL, (Node)document);
        if (node == null) {
            assert (false);
            return null;
        }
        lju lju2 = jsy.c(document);
        if (!lju2.equals(this.fzk)) {
            return arrayList;
        }
        List<Node> list = jsy.c(oGJ, node);
        for (Node node2 : list) {
            NamedNodeMap namedNodeMap = node2.getAttributes();
            Node node3 = namedNodeMap.getNamedItem(oWM);
            if (node3 != null) {
                String string2 = node3.getNodeValue();
                arrayList.add(string2);
                continue;
            }
            assert (false);
        }
        return arrayList;
    }

    public Map<String, List<axs>> dUm() {
        String string = "xml-files/zones/cities.xml";
        return this.uI(string);
    }

    public List<axs> dUn() {
        String string = "xml-files/zones/extra_cities.xml";
        jwj jwj2 = new jwj();
        ArrayList<axs> arrayList = lcn.emv();
        if (!jry.tj(string)) {
            return arrayList;
        }
        List<String> list = this.uC(string);
        if (list == null) {
            return arrayList;
        }
        for (String string2 : list) {
            axs axs2 = jwj2.uJ(string2);
            if (axs2 == null) continue;
            arrayList.add(axs2);
        }
        return arrayList;
    }

    private Map<String, List<axs>> uI(String string) {
        jwj jwj2 = new jwj();
        Map<String, List<axs>> map = lcn.emw();
        List<String> list = this.uC(string);
        if (list == null) {
            return map;
        }
        for (String string2 : list) {
            axs axs2 = jwj2.uJ(string2);
            if (axs2 == null) continue;
            lej lej2 = lcw.dW((ljq)axs2.Xv());
            String string3 = lcw.f((lej)lej2).toLowerCase();
            List<axs> list2 = map.get(string3);
            if (list2 == null) {
                list2 = lcn.emv();
                map.put(string3, list2);
            }
            list2.add(axs2);
        }
        return map;
    }
}

