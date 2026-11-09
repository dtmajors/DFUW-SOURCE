/*
 * Decompiled with CFR.
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jvk {
    public static final String TC = "SFSpawnpointsWithGatesParser";

    public void eL(String string) {
        List<String> list = lea.epG();
        Document document = jsy.tJ(string);
        if (document == null) {
            lfn.b(5, TC, "parseFile() Invalid Document: [" + string + "]");
            assert (false);
            return;
        }
        Node node = jsy.a("SFSpawnPoints", (Node)document);
        if (node == null) {
            throw new bn("SFSpawnPoints");
        }
        List<Node> list2 = jsy.c("SFSpawnPoint", node);
        if (list2 == null || list2.isEmpty()) {
            throw new bn("SFSpawnPoint");
        }
        for (Node node2 : list2) {
            String string2 = jsy.m(node2);
            list.add(string2.toLowerCase());
        }
    }
}

