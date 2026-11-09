/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class mza {
    private lju fzk = new lju(0, 1);

    public List ao(jrw jrw2) {
        lju lju2;
        ArrayList<jrw> arrayList = lcn.emv();
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            return null;
        }
        Node node = jsy.a("SFFileDumpList", (Node)document);
        if (node != null && (lju2 = jsy.c(document)).equals(this.fzk)) {
            List<Node> list = jsy.c("SFFile", node);
            for (int i = 0; i < list.size(); ++i) {
                Node node2 = list.get(i);
                jrw jrw3 = new jrw(lcw.qLb + jsy.m(node2));
                if (!jrw3.exists()) continue;
                arrayList.add(jrw3);
            }
        }
        return arrayList;
    }
}

