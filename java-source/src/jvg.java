/*
 * Decompiled with CFR.
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jvg {
    public static final lju oRy = new lju(0, 1, 0);

    public void ut(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        try {
            Node node = jsy.d("XML", document);
            List<Node> list = jsy.c("SFSkillRelationSet", node);
            if (list.isEmpty()) {
                return;
            }
            for (int i2 = 0; i2 < list.size(); ++i2) {
                try {
                    Node node2 = list.get(i2);
                    dcw dcw2 = this.ap(node2);
                    if (cxj.yp(dcw2.SkillType)) {
                        throw new bg("A skillrelationset already exists for skill '" + lea.enZ().getName(dcw2.SkillType) + "'");
                    }
                    cxj.a(dcw2.SkillType, dcw2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of skillrelationset node " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private dcw ap(Node node) {
        Node node2 = jsy.d("SFSkillName", node);
        int n = kbi.eM(node2);
        if (n <= 0) {
            throw new bj("SkillType is invalid.");
        }
        List<Node> list = jsy.c("SFSkillRelation", node);
        if (list.isEmpty()) {
            throw new bg("No 'SFSkillRelation' nodes found.");
        }
        dcv[] dcvArray = new dcv[list.size()];
        for (int i2 = 0; i2 < list.size(); ++i2) {
            try {
                dcvArray[i2] = this.aq(list.get(i2));
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of skillrelation node " + i2 + " failed.", bg2);
            }
        }
        dcw dcw2 = new dcw(n, dcvArray);
        return dcw2;
    }

    private dcv aq(Node node) {
        Node node2 = jsy.d("SFRelationName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFRelationName' has invalid value.");
        }
        cxd.l l2 = cxd.l.getRelationType(string);
        if (l2 == null) {
            throw new bj("RelationName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFSkillName", node);
        int n = kbi.eM(node2);
        if (n <= 0) {
            throw new bj("RelatedSkillType is invalid.");
        }
        dcv dcv2 = new dcv(l2, n);
        return dcv2;
    }
}

