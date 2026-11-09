/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class cve {
    private static final String fze = "SFDynamicLootInfo";
    private static final String fzf = "ResourceType";
    private static final String fzg = "AmountInWorld";
    private static final String fzh = "LootAliveTime";
    private static final String fzi = "MinimumTimeBetweenLoot";
    private static final String fzj = "Constraint";
    private static final lju fzk = new lju(0, 1);

    public List<cvd> bcs() {
        ArrayList<cvd> arrayList = lcn.emv();
        String string = "xml-files/server/dynamicloot/dynamiclootinfo.xml";
        string.toLowerCase();
        Document document = null;
        try {
            document = jsy.tJ(string);
            jsy.a(document, fzk);
        }
        catch (bg bg2) {
            assert (false);
            return arrayList;
        }
        NodeList nodeList = document.getElementsByTagName(fze);
        if (nodeList.getLength() == 0) {
            return arrayList;
        }
        cvd cvd2 = null;
        for (int i = 0; i < nodeList.getLength(); ++i) {
            Node node = nodeList.item(i);
            cvd2 = new cvd();
            NamedNodeMap namedNodeMap = node.getAttributes();
            Node node2 = null;
            node2 = namedNodeMap.getNamedItem(fzf);
            assert (node2 != null);
            int n = lea.enW().getType(node2.getNodeValue());
            assert (n > 0);
            cvd2.l(n);
            node2 = namedNodeMap.getNamedItem(fzg);
            assert (node2 != null);
            int n2 = Integer.parseInt(node2.getNodeValue());
            assert (n2 >= 0);
            cvd2.wT(n2);
            node2 = namedNodeMap.getNamedItem(fzh);
            assert (node2 != null);
            float f2 = Float.parseFloat(node2.getNodeValue());
            assert (f2 > 0.0f);
            cvd2.eY(f2);
            node2 = namedNodeMap.getNamedItem(fzi);
            assert (node2 != null);
            float f3 = Float.parseFloat(node2.getNodeValue());
            assert (f3 > 0.0f);
            cvd2.fa(f3);
            node2 = namedNodeMap.getNamedItem(fzj);
            assert (node2 != null);
            cvc cvc2 = cvc.getDynamicLootConstraintFromString(node2.getNodeValue());
            assert (cvc2 != null);
            cvd2.a(cvc2);
            arrayList.add(cvd2);
        }
        return arrayList;
    }
}

