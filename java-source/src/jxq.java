/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class jxq {
    public static final String oWL = "SFTradeRouteSystem";
    public static final String oZp = "Name";
    public static final String oZq = "Type";
    public static final String oZr = "ElementInfoList";
    public static final String oZs = "ElementInfo";
    public static final String oWV = "ResourceTypeName";
    public static final lju fzk = new lju(0, 1);
    private int oXS = -1;

    private ldv Wl(int n) {
        assert (this.oXS != -1);
        assert (n != -1);
        return new ldv(0, this.oXS, n);
    }

    public dna vt(String string) {
        if (!(string = string.toLowerCase()).endsWith(".xml")) {
            string = string + ".xml";
        }
        if (!jry.tj(string = "xml-files/server/traderoutesystem/" + string)) {
            return null;
        }
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            return null;
        }
        return this.p(document, jry.tn(string));
    }

    private dna p(Document document, String string) {
        dna dna2 = new dna();
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
        Node node2 = namedNodeMap.getNamedItem(oZq);
        if (node2 != null) {
            int n = Integer.parseInt(node2.getNodeValue());
            dna2.a(dne.getValueByOrdinal(n));
        } else assert (false);
        dna2.iP(string);
        node2 = namedNodeMap.getNamedItem(oZp);
        if (node2 != null) {
            String string2 = node2.getNodeValue();
            dna2.iQ(string2);
        } else assert (false);
        Node node3 = jsy.a("ObjectSpaceGuid", node);
        assert (node3 != null);
        this.oXS = jsy.r(node3);
        Node node4 = jsy.a("Guid", node);
        assert (node4 != null);
        ldv ldv2 = this.Wl(jsy.r(node4));
        dna2.nu(ldv2);
        ArrayList<dmz> arrayList = lcn.emv();
        Node node5 = jsy.a(oZr, node);
        assert (node5 != null);
        List<Node> list = jsy.c(oZs, node5);
        for (Node node6 : list) {
            dmz dmz2 = this.cj(node6);
            assert (dmz2 != null);
            arrayList.add(dmz2);
        }
        dna2.aH(arrayList);
        return dna2;
    }

    private dmz cj(Node node) {
        Object object;
        dmz dmz2 = new dmz();
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node2 = namedNodeMap.getNamedItem(oWV);
        if (node2 != null) {
            object = node2.getNodeValue();
            object = ((String)object).toLowerCase();
            dmz2.fK((String)object);
            dmz2.l(lea.enW().getType((String)object));
        } else assert (false);
        object = jsy.a("SFPosition", node);
        ljq ljq2 = jsy.w((Node)object);
        dmz2.aQ(ljq2);
        Node node3 = jsy.a("SFRotation", node);
        lgl lgl2 = jsy.E(node3);
        dmz2.d(lgl2);
        Node node4 = jsy.a("Guid", node);
        assert (node4 != null);
        ldv ldv2 = this.Wl(jsy.r(node4));
        dmz2.hC(ldv2);
        return dmz2;
    }
}

