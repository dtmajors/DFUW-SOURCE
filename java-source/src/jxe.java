/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jxe {
    lfn ga = lfn.eqw();
    lju fzk = new lju(0, 1);

    public List G(jrw jrw2) {
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
            return null;
        }
        return this.i(document, jrw2.getName());
    }

    private List i(Document document, String string) {
        List list = null;
        Node node = jsy.a("SFObjectPalette", (Node)document);
        if (node != null) {
            lju lju2 = jsy.c(document);
            if (lju2.equals(this.fzk)) {
                list = this.ce(node);
            } else {
                lfn.b(5, this.getClass().getName(), "Cannot Load. Wrong Version: " + lju2);
            }
        } else {
            lfn.b(5, this.getClass().getName(), "SFANIMATIONPART_TEMPLATE [" + string + "] is invalid!");
        }
        return list;
    }

    private List ce(Node node) {
        ArrayList<jrw> arrayList = lcn.emv();
        List<Node> list = jsy.c("PaletteFile", node);
        for (Node node2 : list) {
            String string = jsy.m(node2);
            if (string == null) continue;
            jrw jrw2 = new jrw(string);
            arrayList.add(jrw2);
        }
        return arrayList;
    }
}

