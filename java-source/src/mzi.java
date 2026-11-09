/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class mzi {
    private lfn ga = lfn.eqw();
    private lju fzk = new lju(0, 1);

    public List as(jrw jrw2) {
        ArrayList<moa> arrayList = lcn.emv();
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
            return null;
        }
        Node node = jsy.a("SFRegionMaterials", (Node)document);
        if (node != null) {
            List<Node> list = jsy.c("SFRegion", node);
            for (int i = 0; i < list.size(); ++i) {
                Node node2 = list.get(i);
                NamedNodeMap namedNodeMap = node2.getAttributes();
                Node node3 = namedNodeMap.getNamedItem("OriginalTexture");
                String string = node3.getNodeValue();
                node3 = namedNodeMap.getNamedItem("Id");
                int n2 = Integer.valueOf(node3.getNodeValue());
                node3 = namedNodeMap.getNamedItem("PrettyName");
                String string2 = node3.getNodeValue();
                moa moa2 = new moa();
                moa2.setTextureName(string);
                moa2.setId(n2);
                moa2.BM(string2);
                arrayList.add(moa2);
            }
        } else {
            lfn.b(5, this.getClass().getName(), "SFWB_REGIONMATERIALS [" + jrw2 + "] is invalid!");
        }
        return arrayList;
    }
}

