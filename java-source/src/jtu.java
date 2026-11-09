/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jtu {
    public static final lju eM = new lju(0, 1, 0);
    private les aqN = lea.enZ();

    public void tU(String string) {
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, eM);
            Node node = jsy.d("XML", document);
            List<Node> list = jsy.c("Skill", node);
            if (list.isEmpty()) {
                throw new bg("No 'Skill' nodes found.");
            }
            Set<Integer> set = lea.eoY();
            int n = list.size();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    String string2 = jsy.c(list.get(i2), "Name");
                    if (string2 == null || string2.trim().equals("")) {
                        throw new bj("Attribute 'Name' has invalid value.");
                    }
                    int n2 = this.aqN.getType(string2);
                    if (n2 <= 0) {
                        throw new bj("SkillName '" + string2 + "' is invalid.");
                    }
                    if (set.contains(n2)) {
                        throw new bp("Skill '" + string2 + "' already exists.");
                    }
                    set.add(n2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of node " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }
}

