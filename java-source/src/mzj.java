/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class mzj {
    public static final String oWL = "Resource2meshMap";
    public static final String EVa = "SFResource";
    public static final String EVb = "SFMesh";
    public static final String nXD = "name";
    lju fzk = new lju(0, 1);

    public Map<String, Set<String>> cMr() {
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/worldbuilder/resource2mesh_map.xml");
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
            return null;
        }
        return this.a(document, jrw2.getName());
    }

    private Map<String, Set<String>> a(Document document, String string) {
        Map<String, Set<String>> map = lcn.emw();
        Node node = jsy.a(oWL, (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "SFFile [" + string + "] is invalid!");
            assert (false);
            return null;
        }
        lju lju2 = jsy.c(document);
        if (!lju2.equals(this.fzk)) {
            lfn.b(5, this.getClass().getName(), "Cannot Load. Wrong Version: " + lju2);
            return map;
        }
        List<Node> list = jsy.c(EVa, node);
        for (Node node2 : list) {
            NamedNodeMap namedNodeMap = node2.getAttributes();
            Node node3 = namedNodeMap.getNamedItem(nXD);
            assert (node3 != null);
            String string2 = node3.getNodeValue();
            Set<String> set = this.fs(node2);
            map.put(string2, set);
        }
        return map;
    }

    private Set<String> fs(Node node) {
        Set<String> set = lcn.emx();
        List<Node> list = jsy.c(EVb, node);
        for (Node node2 : list) {
            NamedNodeMap namedNodeMap = node2.getAttributes();
            Node node3 = namedNodeMap.getNamedItem(nXD);
            assert (node3 != null);
            String string = node3.getNodeValue();
            set.add(string);
        }
        return set;
    }
}

