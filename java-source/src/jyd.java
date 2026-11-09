/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jyd {
    lju fzk = new lju(0, 1);

    public Map<String, List<lkp>> uH(String string) {
        Document document = null;
        try {
            document = jsy.tJ("xml-files/object/animation/effects/" + string);
        }
        catch (bo bo2) {
            return null;
        }
        return this.a(document, jry.tn(string));
    }

    private Map<String, List<lkp>> a(Document document, String string) {
        Map<String, List<lkp>> map = null;
        Node node = jsy.a("SFAnimationEffects", (Node)document);
        if (node == null) {
            assert (false);
            return null;
        }
        lju lju2 = jsy.c(document);
        if (lju2.equals(this.fzk)) {
            map = this.cq(node);
        }
        return map;
    }

    private Map<String, List<lkp>> cq(Node node) {
        Map<String, List<lkp>> map = lcn.emw();
        Node node2 = null;
        node2 = jsy.a("EffectList", node);
        NodeList nodeList = node2.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            node2 = nodeList.item(i2);
            if (!node2.getNodeName().equals("AnimationState")) continue;
            NamedNodeMap namedNodeMap = node2.getAttributes();
            Node node3 = namedNodeMap.getNamedItem("StateName");
            if (node3 == null) {
                assert (false);
                return map;
            }
            String string = node3.getNodeValue();
            List<Node> list = jsy.c("Effect", node2);
            ArrayList<lkp> arrayList = lcn.emv();
            for (Node node4 : list) {
                lkp lkp2 = this.cr(node4);
                if (lkp2 == null) continue;
                arrayList.add(lkp2);
            }
            if (arrayList.isEmpty()) continue;
            map.put(string, arrayList);
        }
        return map;
    }

    private lkp cr(Node node) {
        Object object;
        lkp lkp2 = new lkp();
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node2 = namedNodeMap.getNamedItem("EffectName");
        if (node2 != null) {
            object = node2.getNodeValue();
            int n = del.dr((String)object);
            assert (n > 0) : "Invalid EffectID for effect " + (String)object;
            lkp2.ade(n);
        }
        if ((node2 = namedNodeMap.getNamedItem("StartTime")) != null) {
            lkp2.setStartTime(Float.parseFloat(node2.getNodeValue()));
        }
        if ((node2 = namedNodeMap.getNamedItem("BoneName")) != null) {
            lkp2.yX(node2.getNodeValue());
        }
        if ((object = jsy.w(node2 = jsy.a("Offset", node))) != null) {
            lkp2.setOffset((ljq)object);
        } else {
            lkp2.setOffset(new ljq());
        }
        return lkp2;
    }

    public void a(String string, lkp lkp2, String string2) {
        assert (string != null && !string.equals(""));
        assert (string2 != null && !string2.equals(""));
        assert (lkp2 != null);
        Map<String, List<lkp>> map = this.uH(string2);
        assert (map != null);
        jzf jzf2 = new jzf();
        List<lkp> list = map.get(string);
        if (list == null) {
            list = lcn.emv();
        }
        list.clear();
        list.add(lkp2);
        map.put(string, list);
        if (!map.isEmpty()) {
            jzf2.e(map, string2);
        }
    }
}

