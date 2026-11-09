/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jxt {
    public static Map<Integer, caz> dUF() {
        Object object;
        Object object2;
        Map<Integer, caz> map = lcn.emw();
        Document document = jsy.tK("xml-files/common/paperdoll/npc_outfits.xml");
        if (document == null) {
            lfn.b(5, "SFVendorOutfitParser", "parserVendorOutfitMap() :failed to parse ");
            return map;
        }
        Node node = document.getFirstChild();
        List<Node> list = jsy.c("SFNPCOutfit", node);
        Map map2 = lcn.emw();
        for (Node object32 : list) {
            object2 = new caz();
            object = jxt.a(object32, (caz)object2);
            map2.put(((lfs)object).reX, object2);
        }
        List<Node> list2 = jsy.c("SFNPCAppearance", node);
        Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            int n;
            object2 = (Node)iterator.next();
            object = new caz();
            lfs<String, String> lfs2 = jxt.a((Node)object2, (caz)object);
            caz caz2 = (caz)map2.get(lfs2.reY);
            if (caz2 != null) {
                for (Integer n2 : caz2.aHj()) {
                    ((caz)object).aHj().add(n2);
                }
            }
            if ((n = bqm.gc((String)lfs2.reX)) == -1) {
                n = bqm.gd((String)lfs2.reX);
            }
            map.put(n, (caz)object);
        }
        return map;
    }

    private static lcq vv(String string) {
        String[] stringArray = string.split(",");
        if (stringArray.length == 3) {
            int n = Integer.parseInt(stringArray[0]);
            int n2 = Integer.parseInt(stringArray[1]);
            int n3 = Integer.parseInt(stringArray[2]);
            return new lcq((float)n / 255.0f, (float)n2 / 255.0f, (float)n3 / 255.0f, 1.0f);
        }
        return lcq.BLACK;
    }

    private static lfs<String, String> a(Node node, caz caz2) {
        Node node2;
        Node node3;
        Node node4;
        String string = node.getAttributes().getNamedItem("Name").getNodeValue();
        String string2 = "";
        Node node5 = node.getAttributes().getNamedItem("Outfit");
        if (node5 != null) {
            string2 = node5.getNodeValue();
        }
        if ((node4 = node.getAttributes().getNamedItem("SkinColor")) != null) {
            caz2.a(jxt.vv(node4.getNodeValue()));
        }
        if ((node3 = node.getAttributes().getNamedItem("HairColor")) != null) {
            caz2.b(jxt.vv(node3.getNodeValue()));
        }
        if ((node2 = node.getAttributes().getNamedItem("Resource")) != null) {
            caz2.l(lea.enW().getType(node2.getNodeValue()));
        }
        List<Node> list = jsy.c("SFItem", node);
        for (Node node6 : list) {
            String string3 = node6.getAttributes().getNamedItem("Resource").getNodeValue();
            Integer n = lea.enW().getType(string3);
            if (n == null) continue;
            caz2.aHj().add(n);
        }
        return new lfs<String, String>(string, string2);
    }
}

