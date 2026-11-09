/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jvi {
    public static final String TC = "SFPlayerFunctionConstantsParser";
    private Map<Integer, Float> fYY = lea.epB();

    public void eL(String string) {
        try {
            Document document = jsy.tJ(string);
            if (document == null) {
                lfn.b(5, TC, "parseFile() Invalid Document: [" + string + "]");
                assert (false);
                return;
            }
            Node node = jsy.a("Skills", (Node)document);
            if (node == null) {
                throw new bn("Skills");
            }
            List<Node> list = jsy.c("Skill", node);
            if (list == null || list.isEmpty()) {
                throw new bn("Skill");
            }
            for (Node node2 : list) {
                String string2 = jsy.i(node2, "Name");
                int n = cxd.ip((String)string2);
                if (n == -1) {
                    throw new bj(string2);
                }
                float f = Float.parseFloat(jsy.i(node2, "Level"));
                this.fYY.put(n, Float.valueOf(f));
            }
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }
}

