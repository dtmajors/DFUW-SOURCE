/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class jwv {
    public static final String oWL = "SFHouseUpgradeDefinitions";
    public static final String oYu = "SFUpgradeAliasDefinition";
    public static final String oYv = "SFRealUpgrade";
    public static final String oYw = "ResourceType";
    public static final String oYx = "ExtensionResourceType";
    public static final String oYy = "SFUpgradeDefinition";
    public static final String nWI = "AttachPointName";
    public static final String oYz = "SFPreReqList";
    public static final String nZB = "SFResource";
    public static final String oYA = "SFHouseResourceType";
    public static lju fzk = new lju(0, 1);

    public clm uU(String string) {
        if (!(string = string.toLowerCase()).endsWith(".xml")) {
            string = string + ".xml";
        }
        if (!jry.tj(string = "xml-files/server/playerhouse/" + string)) {
            return null;
        }
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            return null;
        }
        return this.l(document, string);
    }

    private clm l(Document document, String string) {
        Node node = jsy.a(oWL, (Node)document);
        if (node == null) {
            assert (false);
            return null;
        }
        lju lju2 = jsy.c(document);
        if (!lju2.equals(fzk)) {
            return null;
        }
        clm clm2 = new clm();
        List<Node> list = jsy.c(oYu, node);
        cln cln2 = this.bO(list);
        clm2.a(cln2);
        List<Node> list2 = jsy.c(oYA, node);
        for (Node node2 : list2) {
            NamedNodeMap namedNodeMap = node2.getAttributes();
            Node node3 = namedNodeMap.getNamedItem(oYw);
            assert (node3 != null);
            int n = lea.enW().getType(node3.getNodeValue());
            assert (n > 0);
            list = jsy.c(oYy, node2);
            for (Node node4 : list) {
                cll cll2 = this.bi(node4);
                clm2.a(n, cll2);
            }
        }
        return clm2;
    }

    private cln bO(List<Node> list) {
        cln cln2 = new cln();
        for (Node node : list) {
            NamedNodeMap namedNodeMap = node.getAttributes();
            Node node2 = namedNodeMap.getNamedItem(oYw);
            assert (node2 != null);
            String string = node2.getNodeValue();
            int n = lea.enW().getType(string);
            assert (n > 0);
            ArrayList<Integer> arrayList = lcn.emv();
            List<Node> list2 = jsy.c(oYv, node);
            if (list2 != null && !list2.isEmpty()) {
                for (Node node3 : list2) {
                    namedNodeMap = node3.getAttributes();
                    node2 = namedNodeMap.getNamedItem(oYx);
                    assert (node2 != null);
                    String string2 = node2.getNodeValue();
                    int n2 = lea.enW().getType(string2);
                    arrayList.add(n2);
                }
            }
            if (arrayList.isEmpty()) continue;
            cln2.g(n, arrayList);
        }
        return cln2;
    }

    private cll bi(Node node) {
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node2 = namedNodeMap.getNamedItem(oYw);
        assert (node2 != null);
        int n = lea.enW().getType(node2.getNodeValue());
        if (n <= 0) {
            // empty if block
        }
        assert (n > 0);
        node2 = namedNodeMap.getNamedItem(oYx);
        assert (node2 != null);
        int n2 = lea.enW().getType(node2.getNodeValue());
        if (n2 <= 0) {
            // empty if block
        }
        assert (n2 > 0);
        assert (n != n2);
        node2 = namedNodeMap.getNamedItem(nWI);
        assert (node2 != null);
        String string = node2.getNodeValue();
        assert (string != null);
        ArrayList<Integer> arrayList = lcn.emv();
        List<Node> list = jsy.c(oYz, node);
        for (Node node3 : list) {
            namedNodeMap = node3.getAttributes();
            node2 = namedNodeMap.getNamedItem(oYw);
            assert (node2 != null);
            int n3 = lea.enW().getType(node2.getNodeValue());
            assert (n3 > 0);
            arrayList.add(n3);
        }
        cll cll2 = new cll();
        cll2.l(n);
        cll2.rz(n2);
        cll2.setAttachPointName(string);
        cll2.aw(arrayList);
        return cll2;
    }
}

