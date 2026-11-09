/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class jwp {
    public static final String oWL = "SFFortressSystem";
    public static final String oXO = "Name";
    public static final String oXP = "Type";
    public static final String oXQ = "ElementInfoList";
    public static final String oXR = "ElementInfo";
    public static final String oWV = "ResourceTypeName";
    public static final lju fzk = new lju(0, 1);
    private int oXS = -1;

    private ldv Wl(int n) {
        assert (this.oXS != -1);
        assert (n != -1);
        return new ldv(0, this.oXS, n);
    }

    public bjr uQ(String string) {
        if (!(string = string.toLowerCase()).endsWith(".xml")) {
            string = string + ".xml";
        }
        if (!jry.tj(string = "xml-files/server/fortresssystem/" + string)) {
            return null;
        }
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            return null;
        }
        return this.k(document, jry.tn(string));
    }

    private bjr k(Document document, String string) {
        bjr bjr2 = new bjr();
        Node node = jsy.a(oWL, (Node)document);
        if (node == null) {
            assert (false);
            return null;
        }
        lju lju2 = jsy.c(document);
        if (!lju2.equals(fzk)) {
            return null;
        }
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node2 = namedNodeMap.getNamedItem(oXP);
        if (node2 != null) {
            int n = Integer.parseInt(node2.getNodeValue());
            bjr2.a(bjy.getValueByOrdinal(n));
        } else assert (false);
        bjr2.fM(string);
        node2 = namedNodeMap.getNamedItem(oXO);
        if (node2 != null) {
            String string2 = node2.getNodeValue();
            bjr2.fL(string2);
        } else assert (false);
        Node node3 = jsy.a("ObjectSpaceGuid", node);
        assert (node3 != null);
        this.oXS = jsy.r(node3);
        Node node4 = jsy.a("Guid", node);
        assert (node4 != null);
        ldv ldv2 = this.Wl(jsy.r(node4));
        bjr2.cj(ldv2);
        ArrayList<bjp> arrayList = lcn.emv();
        Node node5 = jsy.a(oXQ, node);
        assert (node5 != null);
        List<Node> list = jsy.c(oXR, node5);
        for (Node node6 : list) {
            bjp bjp2 = this.be(node6);
            assert (bjp2 != null);
            arrayList.add(bjp2);
        }
        bjr2.ag(arrayList);
        return bjr2;
    }

    private bjp be(Node node) {
        Object object;
        bjp bjp2 = new bjp();
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node2 = namedNodeMap.getNamedItem(oWV);
        if (node2 != null) {
            object = node2.getNodeValue();
            object = ((String)object).toLowerCase();
            bjp2.fK((String)object);
            bjp2.l(lea.enW().getType((String)object));
        } else assert (false);
        object = jsy.a("SFPosition", node);
        ljq ljq2 = jsy.w((Node)object);
        bjp2.aQ(ljq2);
        Node node3 = jsy.a("SFRotation", node);
        lgl lgl2 = jsy.E(node3);
        bjp2.d(lgl2);
        Node node4 = jsy.a("Guid", node);
        assert (node4 != null);
        ldv ldv2 = this.Wl(jsy.r(node4));
        bjp2.hC(ldv2);
        return bjp2;
    }
}

