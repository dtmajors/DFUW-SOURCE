/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jzr {
    private static final lju paM = new lju(0, 1, 0);

    public void vH(String string) {
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, paM);
            NodeList nodeList = document.getElementsByTagName("SFCollisionSchemeInfo");
            if (nodeList.getLength() == 0) {
                // empty if block
            }
            Map<String, csy> map = lea.eox();
            int n = nodeList.getLength();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    csy csy2 = this.cK(nodeList.item(i2));
                    if (map.containsKey(csy2.fem)) {
                        throw new bg("SFCollisionSchemeInfo for meshfile '" + csy2.fem + "' already exists in map.");
                    }
                    map.put(csy2.fem, csy2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of SFCollisionSchemeInfo " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    public void vI(String string) {
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, paM);
            NodeList nodeList = document.getElementsByTagName("SFCollisionSchemeInfo");
            if (nodeList.getLength() == 0) {
                // empty if block
            }
            Map<String, csz> map = lea.eoy();
            int n = nodeList.getLength();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    csz csz2 = this.cL(nodeList.item(i2));
                    if (map.containsKey(csz2.fem)) {
                        throw new bg("SFCollisionSchemeInfoMonster for meshfile '" + csz2.fem + "' already exists in map.");
                    }
                    map.put(csz2.fem, csz2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of SFCollisionSchemeInfoMonster " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private csy cK(Node node) {
        Node node2 = jsy.d("SFMeshFileName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFMeshFileName' has invalid value.");
        }
        csy csy2 = new csy();
        csy2.fem = string;
        List<Node> list = jsy.c("SFCollisionSchemeMapping", node);
        if (list.isEmpty()) {
            throw new bg("No 'SFCollisionSchemeMapping' nodes found for meshfile '" + string + "'");
        }
        cta[] ctaArray = new cta[list.size()];
        int n = list.size();
        for (int i2 = 0; i2 < n; ++i2) {
            try {
                cta cta2 = this.cN(list.get(i2));
                assert (ctaArray[cta2.bid] == null);
                ctaArray[cta2.bid] = cta2;
                if (!cta2.fet) continue;
                if (csy2.feq != null) {
                    throw new bg("CollisionSchemeInfo contains more than one default schemes.");
                }
                csy2.feq = cta2;
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of collisionschememapping " + i2 + " failed for meshfile '" + string + "'", bg2);
            }
        }
        if (csy2.feq == null) {
            throw new bg("CollisionSchemeInfo does not contain a default scheme.");
        }
        csy2.fen = ctaArray;
        return csy2;
    }

    private csz cL(Node node) {
        String string = jsy.c(node, "MeshFileName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'MeshFileName' has invalid value.");
        }
        csz csz2 = new csz();
        csz2.fem = string;
        List<Node> list = jsy.c("SFCollisionSchemeMapping", node);
        if (list.isEmpty()) {
            throw new bg("No 'SFCollisionSchemeMapping' nodes found for meshfile '" + string + "'");
        }
        ctb[] ctbArray = new ctb[list.size()];
        int n = list.size();
        for (int i2 = 0; i2 < n; ++i2) {
            try {
                ctbArray[i2] = this.cM(list.get(i2));
                if (!ctbArray[i2].fet) continue;
                if (csz2.fes != null) {
                    throw new bg("CollisionSchemeInfo contains more than one default schemes.");
                }
                csz2.fes = ctbArray[i2];
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of collisionschememappingmonster " + i2 + " failed for meshfile '" + string + "'", bg2);
            }
        }
        if (csz2.fes == null) {
            throw new bg("CollisionSchemeInfoMonster does not contain a default scheme.");
        }
        csz2.fer = ctbArray;
        return csz2;
    }

    private ctb cM(Node node) {
        boolean bl = jsy.f(node, "DefaultScheme");
        Node node2 = jsy.d("SFStaticCollisionSchemeName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFStaticCollisionSchemeName' has invalid value.");
        }
        node2 = jsy.d("SFDynamicCollisionSchemeName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFDynamicCollisionSchemeName' has invalid value.");
        }
        ctb ctb2 = new ctb();
        ctb2.fet = bl;
        ctb2.bid = ctb2.fet ? 1 : 2;
        ctb2.feu = string;
        ctb2.fev = string2;
        return ctb2;
    }

    private cta cN(Node node) {
        int n = jsy.d(node, "SchemeID");
        if (n < 0) {
            throw new bj("Node 'SFCollisionSchemeID' has invalid value.");
        }
        boolean bl = jsy.f(node, "DefaultScheme");
        Node node2 = jsy.d("SFModeName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFModeName' has invalid value.");
        }
        int n2 = byw.gJ(string);
        if (n2 <= 0) {
            throw new bj("ModeName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFModeValueName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFModeValueName' has invalid value.");
        }
        int n3 = byw.n(n2, string2);
        if (n3 <= 0) {
            throw new bj("ModeValueName '" + string2 + "' is invalid.");
        }
        node2 = jsy.d("SFStaticCollisionSchemeName", node);
        String string3 = jsy.m(node2);
        if (string3 == null || string3.trim().equals("")) {
            throw new bj("Node 'SFStaticCollisionSchemeName' has invalid value.");
        }
        node2 = jsy.d("SFDynamicCollisionSchemeName", node);
        String string4 = jsy.m(node2);
        if (string4 == null || string4.trim().equals("")) {
            throw new bj("Node 'SFDynamicCollisionSchemeName' has invalid value.");
        }
        cta cta2 = new cta();
        cta2.bid = n;
        cta2.fet = bl;
        cta2.bpX = n2;
        cta2.bpZ = n3;
        cta2.feu = string3;
        cta2.fev = string4;
        return cta2;
    }
}

