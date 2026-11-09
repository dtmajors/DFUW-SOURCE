/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class mzo {
    private lfn ga = lfn.eqw();
    private Map EUT = lcn.emw();
    private List EVc = lcn.emv();
    private int EUU = 0;
    private final String EVd = "aventurine/";

    public void eTy() {
        jrw jrw2 = new jrw(lcw.qLb + "/" + "xml-files/server/persistence/" + "aventurine/" + "ClientObject.xml");
        ljq ljq2 = mje.DBl;
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            // empty catch block
        }
        if (document != null) {
            this.a(document, "SFPosition", ljq2);
            jsz.a(document, jrw2);
        }
    }

    private void a(Document document, String string, ljq ljq2) {
        Node node;
        boolean bl = false;
        if (document != null && (node = jsy.a(string, document)) != null) {
            Node node2 = this.l(node);
            jzc jzc2 = new jzc();
            Element element = jzc2.a(document, ljq2);
            node.replaceChild(element, node2);
        }
    }

    public Node l(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            for (int i = 0; i < nodeList.getLength(); ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFVector3")) continue;
                return node2;
            }
        }
        return null;
    }
}

