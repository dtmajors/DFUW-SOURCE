/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  kah
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class kae {
    public static final lju eM = new lju(0, 3, 0);
    private les ResourceTree = lea.enW();
    private List<String> paT = lcn.emv();

    public void vP(String string) {
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, eM);
            NodeList nodeList = document.getElementsByTagName("SFPaperdollFile");
            if (nodeList.getLength() == 0) {
                return;
            }
            Map map = lea.eot();
            Node node = null;
            Node node2 = null;
            Map<can, cam> map2 = null;
            int n = nodeList.getLength();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    node = nodeList.item(i2);
                    node2 = jsy.a("SFResourceName", node);
                    int n2 = kah.dv((Node)node2);
                    if (n2 <= 0) {
                        throw new bj("Node 'SFResourceName' has invalid value.");
                    }
                    node2 = jsy.a("SFFileName", node);
                    String string2 = jsy.m(node2);
                    if (string2 == null || string2.trim().equals("")) {
                        throw new bj("Node 'SFFileName' has invalid value.");
                    }
                    map2 = lea.ack(n2);
                    if (map2 == null) {
                        throw new bj("PaperdollItemMap is null for resource '" + this.ResourceTree.getName(n2) + "'");
                    }
                    String string3 = "xml-files/common/paperdoll/" + string2;
                    if (this.ResourceTree.k(n2, cug.fia, false)) {
                        this.g(string3, map2);
                    } else {
                        this.f(string3, map2);
                    }
                    Integer n3 = new Integer(n2);
                    map.put(n3, string2);
                    map.put(string2, n3);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of paperdollfile " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    public void f(String string, Map map) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        if (map == null) {
            throw new bi("PaperdollItemMap is null.");
        }
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, eM);
            NodeList nodeList = document.getElementsByTagName("SFPaperdollItem");
            if (nodeList.getLength() == 0) {
                return;
            }
            cam cam2 = null;
            int n = nodeList.getLength();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    cam2 = this.dj(nodeList.item(i2));
                }
                catch (bg bg2) {
                    throw new bg("Parsing of paperdollitem " + i2 + " failed.", bg2);
                }
                can can2 = cam2.aGl();
                if (map.containsKey(can2)) {
                    throw new bp("A paperdollitem for resource '" + can2.pa() + "' already exists in the PaperdollItemMap.");
                }
                map.put(can2, cam2);
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    public void g(String string, Map map) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        if (map == null) {
            throw new bi("PaperdollItemMap is null.");
        }
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, eM);
            NodeList nodeList = document.getElementsByTagName("SFPaperdollItemNPC");
            if (nodeList.getLength() == 0) {
                return;
            }
            cao cao2 = null;
            int n = nodeList.getLength();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    cao2 = this.dk(nodeList.item(i2));
                }
                catch (bg bg2) {
                    throw new bg("Parsing of paperdollitemnpc " + i2 + " failed.", bg2);
                }
                cap cap2 = (cap)cao2.aGl();
                if (map.containsKey(cap2)) {
                    throw new bp("A paperdollitemnpc is already mapped to key: " + cap2);
                }
                map.put(cap2, cao2);
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private cam dj(Node node) {
        assert (node != null);
        String string = jsy.c(node, "ResourceName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'ResourceName' has invalid value.");
        }
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            throw new bj("ResourceName '" + string + "' is invalid.");
        }
        List<Node> list = jsy.c("SFMeshItem", node);
        if (list.isEmpty()) {
            throw new bg("No 'SFMeshItem' nodes found.");
        }
        cai[] caiArray = new cai[list.size()];
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            try {
                Node node2 = list.get(i2);
                caiArray[i2] = this.dl(node2);
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of meshitem " + i2 + " for resource '" + this.ResourceTree.getName(n) + "' failed.", bg2);
            }
        }
        cam cam2 = new cam();
        cam2.l(n);
        cam2.a(caiArray);
        return cam2;
    }

    private cao dk(Node node) {
        assert (node != null);
        String string = jsy.c(node, "ResourceName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'ResourceName' has invalid value.");
        }
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            throw new bj("ResourceName '" + string + "' is invalid.");
        }
        String string2 = jsy.c(node, "NPCName");
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Attribute 'NPCName' has invalid value.");
        }
        int n2 = bqm.gc(string2);
        if (n2 <= 0) {
            throw new bj("NPCName '" + string2 + "' is invalid.");
        }
        List<Node> list = jsy.c("SFMeshItem", node);
        if (list.isEmpty()) {
            throw new bg("No 'SFMeshItem' nodes found.");
        }
        cai[] caiArray = new cai[list.size()];
        int n3 = list.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            try {
                Node node2 = list.get(i2);
                caiArray[i2] = this.dl(node2);
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of meshitem " + i2 + " for resource '" + this.ResourceTree.getName(n) + "' failed.", bg2);
            }
        }
        cao cao2 = new cao();
        cao2.l(n);
        cao2.fx(n2);
        cao2.a(caiArray);
        return cao2;
    }

    private cai dl(Node node) {
        String string = jsy.c(node, "MeshItemName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'MeshItemName' has invalid value.");
        }
        cai.a a2 = cai.a.getMeshItemType(string);
        if (a2 == null) {
            throw new bj("MeshItemName '" + string + "' is invalid.");
        }
        switch (a2) {
            case eeL: {
                return this.dm(node);
            }
            case eeM: {
                return this.dn(node);
            }
            case eeN: {
                return this.do(node);
            }
        }
        throw new bj("MeshItemName '" + string + "' is invalid.");
    }

    private bzu dm(Node node) {
        bzu bzu2 = new bzu();
        this.a(node, bzu2);
        String string = jsy.c(node, "PriorityLevelName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'PriorityLevelName' has invalid value.");
        }
        cak.a a2 = cak.a.getAttachedMeshPriorityLevel(string);
        if (a2 == null) {
            throw new bj("AttachedMeshPriorityLevel '" + string + "' is invalid.");
        }
        String string2 = jsy.c(node, "AttachPointName");
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Attribute 'AttachPointName' has invalid value.");
        }
        String string3 = jsy.c(node, "FileName");
        if (string3 == null || string3.trim().equals("")) {
            throw new bj("Attribute 'FileName' has invalid value.");
        }
        bzu2.a(a2);
        bzu2.setAttachPointName(string2);
        bzu2.setFileName(string3);
        return bzu2;
    }

    private caa dn(Node node) {
        caa caa2 = new caa();
        this.a(node, caa2);
        String string = jsy.c(node, "PriorityLevelName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'PriorityLevelName' has invalid value.");
        }
        cak.b b2 = cak.b.getDummyMeshPriorityLevel(string);
        if (b2 == null) {
            throw new bj("DummyMeshPriorityLevel '" + string + "' is invalid.");
        }
        caa2.a(b2);
        return caa2;
    }

    private cax do(Node node) {
        cax cax2 = new cax();
        this.a(node, cax2);
        String string = jsy.c(node, "PriorityLevelName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'PriorityLevelName' has invalid value.");
        }
        cak.g g2 = cak.g.getSubsetMeshPriorityLevel(string);
        if (g2 == null) {
            throw new bj("SubsetMeshPriorityLevel '" + string + "' is invalid.");
        }
        String string2 = jsy.c(node, "FileName");
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Attribute 'FileName' has invalid value.");
        }
        cax2.a(g2);
        cax2.setFileName(string2);
        return cax2;
    }

    private void a(Node node, cai cai2) {
        String string = jsy.c(node, "SubsetName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'SubsetName' has invalid value.");
        }
        int n = cak.gV(string);
        if (n < 0) {
            throw new bj("SubsetName '" + string + "' is invalid.");
        }
        List<Node> list = jsy.c("SFMaterialShaderPair", node);
        if (list.isEmpty()) {
            throw new bg("No 'SFMaterialShaderPair' nodes found.");
        }
        cah[] cahArray = new cah[list.size()];
        int n2 = cahArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            try {
                cahArray[i2] = this.dp(list.get(i2));
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of materialshaderpair " + i2 + " for subset '" + string + "' failed.", bg2);
            }
        }
        cai2.eA(n);
        cai2.a(cahArray);
    }

    private cah dp(Node node) {
        assert (node != null);
        int n = jsy.d(node, "MaterialID");
        if (n < 0 || n >= 8) {
            throw new bj("Attribute 'MaterialID' has invalid value.");
        }
        String string = jsy.c(node, "PriorityLevelName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'PriorityLevelName' has invalid value.");
        }
        cak.d d2 = cak.d.getMaterialPriorityLevel(string);
        if (d2 == null) {
            throw new bj("MaterialPriorityLevel '" + string + "' is invalid.");
        }
        Node node2 = jsy.d("SFMaterialItem", node);
        cag cag2 = this.dq(node2);
        cag2.oo(n);
        node2 = jsy.d("SFShaderItem", node);
        cav cav2 = this.dr(node2);
        cav2.oo(n);
        cah cah2 = new cah();
        cah2.a(d2);
        cah2.b(cag2);
        cah2.a(cav2);
        return cah2;
    }

    private cag dq(Node node) {
        Object object;
        assert (node != null);
        this.paT.clear();
        for (int i2 = 0; i2 < 1; ++i2) {
            object = null;
            object = i2 == 0 ? "TextureName" : "TextureName" + (i2 + 1);
            try {
                String string = jsy.c(node, (String)object);
                if (string == null || string.trim().equals("")) {
                    throw new bj("Attribute '" + (String)object + "' has invalid value.");
                }
                this.paT.add(string);
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of texturename " + i2 + " failed.", bg2);
            }
        }
        String[] stringArray = new String[this.paT.size()];
        this.paT.toArray(stringArray);
        object = new cag();
        ((cag)object).j(stringArray);
        return object;
    }

    private cav dr(Node node) {
        assert (node != null);
        String string = jsy.c(node, "ShaderName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'ShaderName' has invalid value.");
        }
        cav cav2 = new cav();
        cav2.fv(false);
        cav2.gW(string);
        return cav2;
    }
}

