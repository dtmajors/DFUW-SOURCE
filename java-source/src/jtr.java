/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  fo
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jtr {
    public static final String TC = "SFChatServerBlackListParser";

    public void eL(String string) {
        ArrayList<String> arrayList = lcn.emv();
        try {
            Document document = jsy.tJ(string);
            if (document == null) {
                lfn.b(5, TC, "parseFile() Invalid Document: [" + string + "]");
                assert (false);
                return;
            }
            Node node = jsy.a("XML", (Node)document);
            if (node == null) {
                throw new bn("XML");
            }
            Node node2 = jsy.a("Entries", node);
            if (node2 == null) {
                throw new bn("Entries");
            }
            List<Node> list = jsy.c("Entry", node2);
            if (list == null || list.isEmpty()) {
                throw new bn("Entry");
            }
            for (Node node3 : list) {
                String string2 = jsy.i(node3, "Value");
                if (string2 == null || string2.trim().isEmpty()) continue;
                arrayList.add(string2.toLowerCase());
            }
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
        fo.c((String[])arrayList.toArray(new String[arrayList.size()]));
    }
}

