/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jwa {
    public static final String FILENAME = "barber_resource_list.xml";
    public static final String oWr = "EMPTY";
    public static final String oWs = "SFBarberResourceList";
    public static final String oWt = "Race";
    public static final String oWu = "Value";
    public static final String oWv = "ResourceList";
    public static final String oWw = "Type";
    public static final String oWx = "Resources";
    private lju fzk = new lju(0, 1);

    public Map<String, List<ldp>> dTW() {
        String string = "xml-files/client/resource/barber_resource_list.xml";
        Map<String, List<ldp>> map = lcn.emw();
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
            assert (false);
            return null;
        }
        try {
            map = this.f(document, jry.tn(string));
        }
        catch (bp bp2) {
            throw new bo("Error Parsing SFFile [" + string + "]", bp2);
        }
        return map;
    }

    public List<ldp> uC(String string) {
        String string2 = "xml-files/client/resource/barber_resource_list.xml";
        return this.ah(string2, string);
    }

    private List<ldp> ah(String string, String string2) {
        Document document = null;
        List<ldp> list = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
            assert (false);
            return null;
        }
        try {
            list = this.d(document, jry.tn(string), string2);
        }
        catch (bp bp2) {
            throw new bo("Error Parsing SFFile [" + string + "]", bp2);
        }
        return list;
    }

    private List<ldp> d(Document document, String string, String string2) {
        assert (document != null);
        List<ldp> list = lcn.emv();
        Node node = jsy.a(oWs, (Node)document);
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
        String string3 = oWt;
        List<Node> list2 = jsy.c(string3, node);
        if (list2 == null || list2.isEmpty()) {
            lfn.b(5, this.getClass().getName(), "traverseDocument() : Error getting node [" + string3 + "]");
            assert (false);
            throw new bp("Could noe parse [" + string3 + "] Node");
        }
        for (Node node2 : list2) {
            string3 = oWu;
            Node node3 = node2.getAttributes().getNamedItem(string3);
            if (node3 == null) {
                lfn.b(5, this.getClass().getName(), "traverseDocument() : Error getting node [" + string3 + "]");
                assert (false);
                throw new bp("Could noe parse [" + string3 + "] Node");
            }
            if (!node3.getNodeValue().equalsIgnoreCase(string2)) continue;
            list = this.aJ(node2);
            break;
        }
        return list;
    }

    private Map<String, List<ldp>> f(Document document, String string) {
        assert (document != null);
        Map<String, List<ldp>> map = lcn.emw();
        Node node = jsy.a(oWs, (Node)document);
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
        String string2 = oWt;
        List<Node> list = jsy.c(string2, node);
        if (list == null || list.isEmpty()) {
            lfn.b(5, this.getClass().getName(), "traverseDocument() : Error getting node [" + string2 + "]");
            assert (false);
            throw new bp("Could noe parse [" + string2 + "] Node");
        }
        for (Node node2 : list) {
            string2 = oWu;
            Node node3 = node2.getAttributes().getNamedItem(string2);
            if (node3 == null) {
                lfn.b(5, this.getClass().getName(), "traverseDocument() : Error getting node [" + string2 + "]");
                assert (false);
                throw new bp("Could noe parse [" + string2 + "] Node");
            }
            String string3 = node3.getNodeValue();
            map.put(string3, this.aJ(node2));
        }
        return map;
    }

    private List<ldp> aJ(Node node) {
        ArrayList<ldp> arrayList = lcn.emv();
        String string = oWv;
        List<Node> list = jsy.c(string, node);
        if (list == null || list.isEmpty()) {
            lfn.b(5, this.getClass().getName(), "traverseDocument() : Error getting node [" + string + "]");
            assert (false);
            throw new bp("Could noe parse [" + string + "] Node");
        }
        for (Node node2 : list) {
            String[] stringArray;
            string = oWw;
            Node node3 = node2.getAttributes().getNamedItem(string);
            if (node3 == null) {
                lfn.b(5, this.getClass().getName(), "traverseDocument() : Error getting node [" + string + "]");
                assert (false);
                throw new bp("Could noe parse [" + string + "] Node");
            }
            String string2 = node3.getNodeValue();
            string = oWx;
            Node node4 = node2.getAttributes().getNamedItem(string);
            if (node4 == null) {
                lfn.b(5, this.getClass().getName(), "traverseDocument() : Error getting node [" + string + "]");
                assert (false);
                throw new bp("Could noe parse [" + string + "] Node");
            }
            ArrayList<String[]> arrayList2 = lcn.emv();
            StringTokenizer stringTokenizer = new StringTokenizer(node4.getNodeValue(), ",");
            while (stringTokenizer.hasMoreElements()) {
                stringArray = stringTokenizer.nextToken();
                if (stringArray.equals(oWr)) {
                    stringArray = "";
                }
                arrayList2.add(stringArray);
            }
            stringArray = arrayList2.toArray(new String[arrayList2.size()]);
            ldp ldp2 = new ldp(stringArray, 0, string2);
            arrayList.add(ldp2);
        }
        return arrayList;
    }

    public Map<Integer, ldp> uD(String string) {
        String string2 = "xml-files/client/resource/barber_resource_list.xml";
        Map<Integer, ldp> map = lcn.emw();
        List<ldp> list = this.ah(string2, string);
        for (ldp ldp2 : list) {
            String[] stringArray = ldp2.reW;
            if (stringArray == null || stringArray.length <= 0) continue;
            int n = lea.enW().getType(stringArray[1]);
            int n2 = this.getLayerType(n).ordinal();
            map.put(n2, ldp2);
        }
        return map;
    }

    private cak.c getLayerType(int n) {
        lgw lgw2 = (lgw)lea.enW().acv(n);
        if (lgw2 == null) {
            return null;
        }
        return lgw2.auO();
    }
}

