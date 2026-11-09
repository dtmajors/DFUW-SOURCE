/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class jxg {
    public static final String oWL = "SFPlayerVillage";
    public static final String oZd = "EnglishName";
    public static final String oZe = "ID";
    public static final String oZf = "Type";
    public static final String oZg = "ElementInfoList";
    public static final String oZh = "ElementInfo";
    public static final String oWV = "ResourceTypeName";
    public static final lju fzk = new lju(0, 1);
    private int oXS = -1;

    private ldv Wl(int n) {
        assert (this.oXS != -1);
        assert (n != -1);
        return new ldv(0, this.oXS, n);
    }

    public cqd vf(String string) {
        if (!(string = string.toLowerCase()).endsWith(".xml")) {
            string = string + ".xml";
        }
        if (!jry.tj(string = "xml-files/server/playervillage/" + string)) {
            lfn.b(5, "SFPlayerVillageParser", "parsePlayerVillageInfo() This villagefile does not exist: " + string);
            return null;
        }
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            return null;
        }
        return this.o(document, jry.tn(string));
    }

    private cqd o(Document document, String string) {
        cqd cqd2 = new cqd();
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
        Node node2 = namedNodeMap.getNamedItem(oZf);
        if (node2 != null) {
            int n = Integer.parseInt(node2.getNodeValue());
            cqd2.a(cqe.getValueByOrdinal(n));
        } else assert (false);
        cqd2.hO(string);
        node2 = namedNodeMap.getNamedItem(oZd);
        if (node2 != null) {
            String string2 = node2.getNodeValue();
            cqd2.hN(string2);
        } else assert (false);
        node2 = namedNodeMap.getNamedItem(oZe);
        if (node2 != null) {
            String string3 = node2.getNodeValue();
            cqd2.setID(string3);
        }
        Node node3 = jsy.a("ObjectSpaceGuid", node);
        assert (node3 != null);
        this.oXS = jsy.r(node3);
        Node node4 = jsy.a("Guid", node);
        assert (node4 != null);
        ldv ldv2 = this.Wl(jsy.r(node4));
        cqd2.cl(ldv2);
        ArrayList<cqc> arrayList = lcn.emv();
        Node node5 = jsy.a(oZg, node);
        assert (node5 != null);
        List<Node> list = jsy.c(oZh, node5);
        for (Node node6 : list) {
            cqc cqc2 = this.cf(node6);
            assert (cqc2 != null);
            arrayList.add(cqc2);
        }
        cqd2.az(arrayList);
        return cqd2;
    }

    private cqc cf(Node node) {
        Object object;
        cqc cqc2 = new cqc();
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node2 = namedNodeMap.getNamedItem(oWV);
        if (node2 != null) {
            object = node2.getNodeValue();
            object = ((String)object).toLowerCase();
            cqc2.fK((String)object);
            cqc2.l(lea.enW().getType((String)object));
        } else assert (false);
        object = jsy.a("SFPosition", node);
        ljq ljq2 = jsy.w((Node)object);
        cqc2.aQ(ljq2);
        Node node3 = jsy.a("SFRotation", node);
        lgl lgl2 = jsy.E(node3);
        cqc2.d(lgl2);
        Node node4 = jsy.a("Guid", node);
        assert (node4 != null);
        ldv ldv2 = this.Wl(jsy.r(node4));
        cqc2.hC(ldv2);
        return cqc2;
    }
}

