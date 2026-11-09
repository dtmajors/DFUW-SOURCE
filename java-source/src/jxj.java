/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class jxj {
    private jsy nVr = null;
    private String[] oZl = new String[]{"rock", "pebble", "stone", "lava"};

    public void dUz() {
        String string = "worldbuilder/vegetation/region_material.xml";
        Document document = null;
        try {
            document = jsy.tJ(string);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
        }
        Node node = jsy.a("SFRegionMaterials", (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "SFFile [" + string + "] is invalid!");
            assert (false);
            return;
        }
        String string2 = "SFRegion";
        List<Node> list = jsy.c(string2, node);
        if (list == null) {
            lfn.b(5, this.getClass().getSimpleName(), "traverseDocument() : Error getting node [" + string2 + "]");
            assert (false);
            return;
        }
        Node node22 = null;
        for (Node node22 : list) {
            mgm mgm2 = this.b(document, node22);
            if (mgm2 != null) {
                mgn.a(mgm2);
                continue;
            }
            lfn.b(5, this.getClass().getSimpleName(), "traverseDocument() : RegionMaterial is null!!");
        }
        this.dUA();
    }

    private mgm b(Document document, Node node) {
        mgm mgm2 = new mgm();
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node2 = namedNodeMap.getNamedItem("ActiveMaterial");
        mgm2.BJ(node2.getNodeValue());
        node2 = namedNodeMap.getNamedItem("DetailTexture");
        mgm2.BK(node2.getNodeValue());
        node2 = namedNodeMap.getNamedItem("Id");
        mgm2.setId(Integer.parseInt(node2.getNodeValue()));
        node2 = namedNodeMap.getNamedItem("OriginalTexture");
        mgm2.BL(node2.getNodeValue());
        node2 = namedNodeMap.getNamedItem("PrettyName");
        mgm2.BM(node2.getNodeValue());
        node2 = namedNodeMap.getNamedItem("Priority");
        mgm2.setPriority(Integer.parseInt(node2.getNodeValue()));
        node2 = namedNodeMap.getNamedItem("SandwichMaterialId");
        mgm2.aef(Integer.parseInt(node2.getNodeValue()));
        node2 = namedNodeMap.getNamedItem("TextureMaterialId");
        mgm2.aeg(Integer.parseInt(node2.getNodeValue()));
        return mgm2;
    }

    public void dUA() {
        Set<Integer> set = lcn.emz();
        Map<Integer, mgm> map = mgn.DvR;
        for (mgm mgm2 : map.values()) {
            String string = mgm2.eyI();
            for (int i2 = 0; i2 < this.oZl.length; ++i2) {
                if (!string.contains(this.oZl[i2])) continue;
                set.add(mgm2.getId());
            }
        }
        mgn.u(set);
        lfn.b(0, this.getClass().getSimpleName(), "createExclusionList() : -- start---");
        lfn.b(0, this.getClass().getSimpleName(), "createExclusionList() : -- end--");
    }

    public Set vg(String string) {
        TreeSet<mgl> treeSet = lcn.emH();
        String string2 = "worldbuilder/vegetation/" + string;
        Document document = null;
        try {
            document = jsy.tJ(string2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
            return null;
        }
        Node node = jsy.a("SFTileMaterials", (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "SFFile [" + string2 + "] is invalid!");
            assert (false);
            return null;
        }
        Node node2 = jsy.a("SFFaceMaterials", node);
        if (node2 == null) {
            lfn.b(5, this.getClass().getName(), "SFFile [" + string2 + "] is invalid!");
            assert (false);
            return null;
        }
        String string3 = "SFMaterialRange";
        List<Node> list = jsy.c(string3, node2);
        if (list == null) {
            lfn.b(5, this.getClass().getSimpleName(), "traverseDocument() : Error getting node [" + string3 + "]");
            assert (false);
            return null;
        }
        Node node32 = null;
        for (Node node32 : list) {
            mgl mgl2 = this.cg(node32);
            if (mgl2 != null) {
                treeSet.add(mgl2);
                continue;
            }
            lfn.b(5, this.getClass().getSimpleName(), "traverseDocument() : MaterialRange is null!!");
        }
        return treeSet;
    }

    private mgl cg(Node node) {
        mgl mgl2 = new mgl();
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node2 = namedNodeMap.getNamedItem("FaceCount");
        mgl2.aec(Integer.parseInt(node2.getNodeValue()));
        node2 = namedNodeMap.getNamedItem("FaceStart");
        mgl2.aed(Integer.parseInt(node2.getNodeValue()));
        node2 = namedNodeMap.getNamedItem("MaterialId");
        mgl2.aee(Integer.parseInt(node2.getNodeValue()));
        return mgl2;
    }
}

