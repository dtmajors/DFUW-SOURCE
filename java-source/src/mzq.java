/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.CRC32;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class mzq {
    public static final String oWL = "TileMeshMap";
    public static final String EVe = "SFTile";
    public static final String EVb = "SFMesh";
    public static final String nXD = "name";
    public static final String EVf = "OSFiles";
    public static final String EVg = "OSFile";
    public static final String EVh = "checksum";
    private lju fzk = new lju(0, 1);
    private Document EVi = null;
    private Map<String, Map<String, Long>> EVj = lcn.emw();

    public Map<String, Set<String>> cMr() {
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/worldbuilder/tile_mesh_map.xml");
        try {
            this.EVi = jsy.n(jrw2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
            return null;
        }
        return this.a(this.EVi, jrw2.getName());
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
        List<Node> list = jsy.c(EVe, node);
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

    public boolean a(String string, jrw jrw2) {
        long l;
        long l2;
        boolean bl = false;
        if (this.EVi == null) {
            jrw jrw3 = new jrw(lcw.qLb + "xml-files/worldbuilder/tile_mesh_map.xml");
            try {
                this.EVi = jsy.n(jrw3);
            }
            catch (bo bo2) {
                lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
                return false;
            }
        }
        return (l2 = llo.a(new CRC32(), jrw2)) == (l = this.aW(string, jrw2.getName()));
    }

    private long aW(String string, String string2) {
        Map<String, Long> map;
        Long l;
        long l2 = -1L;
        if (this.EVi == null) {
            assert (false) : "Document is null!";
            return -1L;
        }
        if (this.EVj.isEmpty()) {
            this.eTz();
        }
        if ((l = (map = this.EVj.get(string)).get(string2)) == null) {
            return -1L;
        }
        return l2;
    }

    private void eTz() {
        if (this.EVi == null) {
            assert (false) : "Document is null!";
            return;
        }
        Node node = jsy.a(oWL, (Node)this.EVi);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "SFFile is invalid!");
            assert (false);
            return;
        }
        lju lju2 = jsy.c(this.EVi);
        if (!lju2.equals(this.fzk)) {
            lfn.b(5, this.getClass().getName(), "Cannot Load. Wrong Version: " + lju2);
            return;
        }
        List<Node> list = jsy.c(EVe, node);
        for (Node node2 : list) {
            NamedNodeMap namedNodeMap = node2.getAttributes();
            Node node3 = namedNodeMap.getNamedItem(nXD);
            assert (node3 != null);
            String string = node3.getNodeValue();
            Map<String, Long> map = lcn.emw();
            Node node4 = jsy.a(oWL, node2);
            List<Node> list2 = jsy.c(EVg, node4);
            for (Node node5 : list2) {
                namedNodeMap = node5.getAttributes();
                node3 = namedNodeMap.getNamedItem(nXD);
                assert (node3 != null);
                String string2 = node3.getNodeValue();
                node3 = namedNodeMap.getNamedItem(EVh);
                assert (node3 != null);
                Long l = Long.parseLong(node3.getNodeValue());
                map.put(string2, l);
            }
            this.EVj.put(string, map);
        }
    }
}

