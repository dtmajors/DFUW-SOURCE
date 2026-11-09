/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kaw {
    public static final lju oRy = new lju(0, 1, 0);
    private kax pbg = new kax(true);
    private les aqN = lea.enZ();

    public void vW(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, oRy);
            NodeList nodeList = document.getElementsByTagName("Mapping");
            if (nodeList.getLength() == 0) {
                lfn.b(2, "SFCommonConstraintMappingParser", "parseCommonConstraintMappings() No 'Mapping' nodes found.");
                return;
            }
            int n = nodeList.getLength();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    dbs dbs2 = this.dz(nodeList.item(i2));
                    if (cxj.ye(dbs2.SkillType)) {
                        throw new bg("A mapping for skill '" + dbs2.Bu() + "' already exists.");
                    }
                    cxj.a(dbs2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of mapping " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private dbs dz(Node node) {
        String string = jsy.c(node, "SkillName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'SkillName' has invalid value.");
        }
        int n = this.aqN.getType(string);
        if (n <= 0) {
            throw new bj("SkillName '" + string + "' is invalid.");
        }
        List<Node> list = jsy.c("SFConstraint", node);
        if (list.isEmpty()) {
            throw new bj("No 'SFConstraint' nodes found.");
        }
        aja[] ajaArray = new aja[list.size()];
        int n2 = ajaArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            try {
                ajaArray[i2] = this.pbg.j(list.get(i2), false);
                continue;
            }
            catch (bg bg2) {
                throw new bg("Constraint " + i2 + " could not be parsed for skill '" + this.aqN.getName(n) + "'", bg2);
            }
        }
        ArrayList<Integer> arrayList = null;
        List<Node> list2 = jsy.c("SFException", node);
        if (list2 != null) {
            arrayList = lcn.abH(list2.size());
            for (Node node2 : list2) {
                String string2 = jsy.c(node2, "SkillName");
                if (string2 == null) continue;
                int n3 = this.aqN.getType(string2);
                if (n3 <= 0) {
                    throw new bj("SkillName '" + string2 + "' is invalid.");
                }
                arrayList.add(n3);
            }
        }
        return new dbs(n, ajaArray, arrayList);
    }
}

