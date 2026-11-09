/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jwd {
    private lju fzk = new lju(0, 1);
    private String lEw = "feature_european/";

    public jwd(String string) {
        this.lEw = string;
    }

    public Map<String, List<String>> uH(String string) {
        String string2 = "xml-files/client/cc_config/" + this.lEw + string;
        Document document = null;
        Map<String, List<String>> map = null;
        try {
            document = jsy.tJ(string2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
            assert (false);
            return null;
        }
        try {
            map = this.a(document, jry.tn(string2));
        }
        catch (bp bp2) {
            throw new bo("Error Parsing SFFile [" + string2 + "]", bp2);
        }
        return map;
    }

    private Map<String, List<String>> a(Document document, String string) {
        Object object;
        Object object2;
        assert (document != null);
        Map<String, List<String>> map = lcn.emw();
        Node node = jsy.a("SFCharacterFeatureSetConfig", (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "SFFile [" + string + "] is invalid!");
            assert (false);
            throw new bp("Could noe parse file [" + string + "]. Rootnode is invalid");
        }
        lju lju2 = jsy.c(document);
        if (!lju2.equals(this.fzk)) {
            lfn.b(5, this.getClass().getName(), "Cannot Load. Wrong Version: " + lju2);
            assert (false);
            throw new bp("Could noe parse file [" + string + "]. Vrong Version [" + lju2 + "]. Supported Version = " + this.fzk);
        }
        String string2 = "ResourceList";
        List<Node> list = jsy.c(string2, node);
        if (list == null || list.isEmpty()) {
            lfn.b(5, this.getClass().getName(), "traverseDocument() : Error getting node [" + string2 + "]");
            assert (false);
            throw new bp("Could noe parse [" + string2 + "] Node");
        }
        for (Node object32 : list) {
            string2 = "Type";
            object2 = object32.getAttributes().getNamedItem(string2);
            if (object2 == null) {
                lfn.b(5, this.getClass().getName(), "traverseDocument() : Error getting node [" + string2 + "]");
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            object = object2.getNodeValue();
            string2 = "SFResourceName";
            List<Node> list2 = jsy.c(string2, object32);
            if (list2 == null) {
                lfn.b(5, this.getClass().getName(), "traverseDocument() : Error getting node [" + string2 + "]");
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            ArrayList<String> arrayList = lcn.emv();
            for (Node node2 : list2) {
                if (node2 != null) {
                    arrayList.add(jsy.m(node2));
                }
                map.put((String)object, arrayList);
            }
        }
        List<String> list3 = this.aL(node);
        map.put("DRESS_CLOTHES", list3);
        List<String> list4 = this.aM(node);
        map.put("DRESS_FEATURES", list4);
        object2 = this.n(node, "SkinColorList");
        map.put("SKIN_COLORS", (List<String>)object2);
        object = this.n(node, "HairColorList");
        map.put("HAIR_COLORS", (List<String>)object);
        return map;
    }

    private List<String> aL(Node node) {
        ArrayList<String> arrayList = lcn.emv();
        String string = "DressList";
        List<Node> list = jsy.c(string, node);
        if (list == null || list.isEmpty()) {
            lfn.b(5, this.getClass().getName(), "traverseDocument() : Error getting node [" + string + "]");
            assert (false);
            throw new bp("Could noe parse [" + string + "] Node");
        }
        Iterator<Node> iterator = list.iterator();
        while (iterator.hasNext()) {
            string = "SFResourceName";
            Node node2 = iterator.next();
            List<Node> list2 = jsy.c(string, node2);
            if (list2 == null) {
                lfn.b(5, this.getClass().getName(), "traverseDocument() : Error getting node [" + string + "]");
                assert (false);
                throw new bp("Could noe parse [" + string + "] Node");
            }
            for (Node node3 : list2) {
                if (node3 == null) continue;
                arrayList.add(jsy.m(node3));
            }
        }
        return arrayList;
    }

    private List<String> aM(Node node) {
        ArrayList<String> arrayList = lcn.emv();
        String string = "DressFeatureList";
        List<Node> list = jsy.c(string, node);
        if (list == null || list.isEmpty()) {
            lfn.b(4, this.getClass().getName(), "traverseDocument() : Error getting node [" + string + "]");
            return arrayList;
        }
        Iterator<Node> iterator = list.iterator();
        while (iterator.hasNext()) {
            string = "SFResourceName";
            Node node2 = iterator.next();
            List<Node> list2 = jsy.c(string, node2);
            if (list2 == null) {
                lfn.b(4, this.getClass().getName(), "traverseDocument() : Error getting node [" + string + "]");
                return arrayList;
            }
            Iterator<Node> iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                boolean bl = false;
                Node node3 = iterator2.next();
                if (node3 == null) continue;
                String string2 = jsy.m(node3);
                if (!string2.equals("")) {
                    int n = lea.enW().getType(string2);
                    if (n <= 0) {
                        String string3 = "ResourceType < 0 for ResourceName = " + string2;
                        assert (false) : string3;
                        throw new bp("Could noe parse [" + string + "] Node. Invalid ResourceName = " + string2);
                    }
                } else {
                    if (bl) {
                        assert (false) : "Empty resource string found more than once for this featureset. FIX PLEASE -> []";
                        continue;
                    }
                    bl = true;
                }
                arrayList.add(string2);
            }
        }
        return arrayList;
    }

    private List<String> n(Node node, String string) {
        ArrayList<String> arrayList = lcn.emv();
        List<Node> list = jsy.c(string, node);
        if (list == null || list.isEmpty()) {
            return arrayList;
        }
        for (Node node2 : list) {
            List<Node> list2 = jsy.c("ColorRange", node2);
            if (list2 == null || list2.isEmpty()) continue;
            for (Node node3 : list2) {
                List<Node> list3 = jsy.c("ColorValue", node3);
                if (list3 == null || list3.isEmpty()) continue;
                for (Node node4 : list3) {
                    if (node4 == null) continue;
                    lcq lcq2 = jsy.A(node4);
                    arrayList.add(String.valueOf(lcq2.getRGB()));
                }
            }
        }
        return arrayList;
    }
}

