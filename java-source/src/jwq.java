/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class jwq {
    public static final String oWL = "SFFortressSystemList";
    public static final String oXT = "FortressSystem";
    public static final String FILENAME = "Filename";
    lju fzk = new lju(0, 1);

    public List<String> dUk() {
        String string = "xml-files/zones/filtered_fortresssystems.xml";
        if (!jry.tj(string)) {
            return this.dUl();
        }
        return this.uC(string);
    }

    public List<String> dUl() {
        String string = "xml-files/zones/fortresssystems.xml";
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
        List<Node> list = jsy.c(oXT, node);
        for (Node node2 : list) {
            NamedNodeMap namedNodeMap = node2.getAttributes();
            Node node3 = namedNodeMap.getNamedItem(FILENAME);
            if (node3 != null) {
                String string2 = node3.getNodeValue();
                arrayList.add(string2);
                continue;
            }
            assert (false);
        }
        return arrayList;
    }
}

