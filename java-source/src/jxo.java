/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class jxo {
    lfn ga = lfn.eqw();
    lju fzk = new lju(0, 1);

    public List dUC() {
        Document document = null;
        try {
            document = jsy.tJ("worldbuilder/wb_specialeffectlist.xml");
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
            return null;
        }
        return this.i(document, jry.tn("worldbuilder/wb_specialeffectlist.xml"));
    }

    private List i(Document document, String string) {
        List list = null;
        Node node = jsy.a("SpecialEffectListWorldbuilder", (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "SFANIMATIONPART_TEMPLATE [" + string + "] is invalid!");
            return list;
        }
        lju lju2 = jsy.c(document);
        if (!lju2.equals(this.fzk)) {
            lfn.b(5, this.getClass().getName(), "Cannot Load. Wrong Version: " + lju2);
            return list;
        }
        list = this.ch(node);
        return list;
    }

    private List ch(Node node) {
        ArrayList<msa> arrayList = lcn.emv();
        List<Node> list = jsy.c("SpecialEffect", node);
        for (Node node2 : list) {
            boolean bl;
            msa msa2 = new msa();
            NamedNodeMap namedNodeMap = node2.getAttributes();
            Node node3 = namedNodeMap.getNamedItem("Name");
            if (node3 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "getSpecialEffects() : Name is null for SFX Node!");
                continue;
            }
            msa2.setName(node3.getNodeValue());
            Node node4 = namedNodeMap.getNamedItem("NeedSource");
            if (node4 != null && (bl = Boolean.parseBoolean(node4.getNodeValue()))) {
                msa2.Ag(true);
                lfn.b(0, this.getClass().getSimpleName(), "getSpecialEffects() : SFX [" + msa2 + "] needs a target!");
            }
            arrayList.add(msa2);
        }
        return arrayList;
    }
}

