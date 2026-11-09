/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class jxw {
    public static final String oWL = "SFPlayerVillageList";
    public static final String oZZ = "PlayerVillage";
    public static final String paa = "Filename";
    public static final String pab = "ID";
    public static final String pac = "EnglishName";
    lju fzk = new lju(0, 1);

    public List<String> dUk() {
        String string = "xml-files/zones/filtered_playervillages.xml";
        if (!jry.tj(string)) {
            return this.dUl();
        }
        return this.uC(string);
    }

    public List<String> dUl() {
        String string = "xml-files/zones/playervillages.xml";
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
        List<Node> list = jsy.c(oZZ, node);
        for (Node node2 : list) {
            Object object;
            Object object2;
            NamedNodeMap namedNodeMap = node2.getAttributes();
            Node node3 = namedNodeMap.getNamedItem(paa);
            if (node3 != null) {
                object2 = node3.getNodeValue();
                arrayList.add((String)object2);
            } else assert (false);
            object2 = namedNodeMap.getNamedItem(pab);
            if (object2 != null) {
                object = object2.getNodeValue();
            }
            if ((object = namedNodeMap.getNamedItem(pac)) == null) continue;
            String string2 = object.getNodeValue();
        }
        return arrayList;
    }
}

