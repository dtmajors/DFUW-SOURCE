/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jtm {
    public static final String TC = "SFAgonAreasParser";

    public void eL(String string) {
        Map<String, List<String>> map = lea.ept();
        try {
            Document document = jsy.tJ(string);
            if (document == null) {
                lfn.b(5, TC, "parseFile() Invalid Document: [" + string + "]");
                assert (false);
                return;
            }
            Node node = jsy.a("Agon", (Node)document);
            if (node == null) {
                throw new bn("Agon");
            }
            List<Node> list = jsy.c("Area", node);
            if (list == null || list.isEmpty()) {
                throw new bn("Area");
            }
            for (Node node2 : list) {
                String string2 = jsy.i(node2, "Name");
                if (string2 == null || string2.isEmpty()) {
                    throw new bn("Name");
                }
                String string3 = jsy.i(node2, "DisplayName");
                if (string3 == null || string3.isEmpty()) {
                    throw new bn("DisplayName");
                }
                List<Node> list2 = jsy.c("Tile", node2);
                if (list2 == null || list2.isEmpty()) {
                    throw new bn("Tile");
                }
                for (Node node3 : list2) {
                    String string4 = jsy.i(node3, "ID");
                    if (string4 == null || string4.isEmpty()) {
                        throw new bn("Name");
                    }
                    List<String> list3 = map.get(string2);
                    if (list3 == null) {
                        list3 = lcn.emv();
                        map.put(string2, list3);
                    }
                    list3.add(string4);
                }
            }
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }
}

