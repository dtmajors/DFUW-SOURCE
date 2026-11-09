/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class jzx
extends jzy {
    private final lju fzk = new lju(0, 1);

    public void dUP() {
        this.vd(true);
    }

    public void dUQ() {
        this.vd(false);
    }

    public void vd(boolean bl) {
        String string = "xml-files/server/loottag/loottag.xml";
        Document document = jsy.tJ(string);
        jsy.a(document, this.fzk);
        try {
            Node node = jsy.a("SFLootTagFile", (Node)document);
            if (node == null) {
                lfn.b(3, this.getClass().getSimpleName(), "parseLootTags() No 'SFLootTagFile' node found. Exit");
                return;
            }
            Node node2 = jsy.a("SFLootTagSet", node);
            if (node2 == null) {
                lfn.b(3, this.getClass().getSimpleName(), "parseLootTags() No 'SFLootTagSet' node found. Exit");
                return;
            }
            List<Node> list = jsy.c("SFLootTag", node2);
            if (list.isEmpty()) {
                lfn.b(3, this.getClass().getSimpleName(), "parseLootTags() No 'SFLootTag' nodes found.");
                return;
            }
            for (Node list2 : list) {
                this.M((Element)list2);
            }
            Node node3 = jsy.a("SFSpawnpointLootTagSet", node);
            if (node3 != null) {
                List<Node> list2 = jsy.c("SFSpawnpointLootTag", node3);
                if (list2.isEmpty()) {
                    lfn.b(3, this.getClass().getSimpleName(), "parseLootTags() No 'SFSpawnpointLootTag' nodes found.");
                }
                for (Node node4 : list2) {
                    this.a((Element)node4, bl);
                }
            }
        }
        catch (bg bg2) {
            lfn.b(5, "SFLootTagParser", "parseLootTags: Failed to parse " + string + ": " + bg2);
            assert (false);
            return;
        }
    }

    private void M(Element element) {
        int n;
        Map<String, ctn> map = lea.eoK();
        String string = this.c(element, "LootTagName");
        int n2 = element.hasAttribute("MinRank") ? this.e(element, "MinRank") : -1;
        int n3 = n = element.hasAttribute("MaxRank") ? this.e(element, "MaxRank") : -1;
        if (n2 != -1 && n != -1 && n2 > n) {
            throw new bg("parseLootTags: MinRank > MaxRank for tag '" + string + "'");
        }
        if (map.containsKey(string)) {
            throw new bg("parseLootTags: Duplicate tag '" + string + "'");
        }
        ctn ctn2 = new ctn();
        ctn2.Name = string;
        ctn2.fgd = n2;
        ctn2.fge = n;
        ctn2.fgc = this.cU(element);
        if (ctn2.fgc == null) {
            throw new bg("parseLootTags: empty loot list for tag '" + string + "'");
        }
        map.put(string, ctn2);
    }

    private void a(Element element, boolean bl) {
        Map<String, kai> map = lea.eoL();
        String string = this.c(element, "SpawnPointName");
        if (!bl && map.containsKey(string)) {
            lfn.b(5, this.getClass().getSimpleName(), "parseSpawnpointLootTag: Duplicate loot tag entry for spawnpoint '" + string + "'");
            return;
        }
        List<Node> list = jsy.c("SFMonsterLootTag", element);
        if (list.isEmpty()) {
            lfn.b(5, this.getClass().getSimpleName(), "parseSpawnpointLootTag: Empty loot tag entry for spawnpoint '" + string + "'");
            assert (false);
            return;
        }
        Map<Integer, kab> map2 = lcn.abI(list.size());
        for (Node node : list) {
            if (!(node instanceof Element)) continue;
            String string2 = this.c((Element)node, "ResourceName");
            int n = lea.enW().getType(string2);
            List<Node> list2 = jsy.c("SFLootTag", node);
            if (list2 == null || list2.isEmpty()) {
                lfn.b(5, this.getClass().getSimpleName(), "parseSpawnpointLootTag: No loot tag entries for spawnpoint '" + string + "'");
                assert (false);
                return;
            }
            ArrayList<String> arrayList = lcn.abH(list2.size());
            for (Node node2 : list2) {
                if (!(node2 instanceof Element)) continue;
                String string3 = this.c((Element)node2, "LootTagName");
                boolean bl2 = lea.eoK().containsKey(string3);
                if (!bl2) {
                    lfn.b(5, this.getClass().getSimpleName(), "parseSpawnpointLootTag: Tag '" + string3 + " in spawnpoint : '" + string + "' is not valid.");
                    assert (false);
                    return;
                }
                arrayList.add(string3);
            }
            kab kab2 = new kab(n, arrayList);
            map2.put(n, kab2);
        }
        kai kai2 = new kai(string, map2);
        map.put(string, kai2);
    }

    private int e(Element element, String string) {
        try {
            return Integer.parseInt(this.c(element, string));
        }
        catch (NumberFormatException numberFormatException) {
            throw new bg("Element '" + element.getNodeName() + "' attribute '" + string + "' is not an int");
        }
    }

    private String c(Element element, String string) {
        if (!element.hasAttribute(string)) {
            throw new bg("Element '" + element.getNodeName() + "' without '" + string + "' attribute");
        }
        return element.getAttribute(string);
    }
}

