/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jup {
    public static final String TC = "SFPlayerPointsRewardsParser";

    public void eL(String string) {
        Map<Integer, cgx> map = lea.epz();
        try {
            Document document = jsy.tJ(string);
            if (document == null) {
                lfn.b(5, TC, "parseFile() Invalid Document: [" + string + "]");
                assert (false);
                return;
            }
            Node node = jsy.a("PlayerPointsRewards", (Node)document);
            if (node == null) {
                throw new bn("PlayerPointsRewards");
            }
            List<Node> list = jsy.c("Rewards", node);
            assert (list != null);
            for (Node node2 : list) {
                cgx cgx2 = this.ad(node2);
                int n = cgx2.ezo;
                map.put(n, cgx2);
            }
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }

    private cgx ad(Node node) {
        String string = jsy.h(node, "Points");
        int n = string != null ? Integer.parseInt(string) : 0;
        ArrayList<cgw> arrayList = lcn.emv();
        List<Node> list = jsy.c("Item", node);
        if (list != null) {
            for (Node node2 : list) {
                cgw cgw2 = this.T(node2);
                arrayList.add(cgw2);
            }
        }
        cgx cgx2 = new cgx();
        cgx2.aCN = arrayList;
        cgx2.ezo = n;
        return cgx2;
    }

    private cgw T(Node node) {
        String string = jsy.i(node, "Type");
        cgl cgl2 = cgl.getRewardTypes(string);
        if (cgl2 == null) {
            throw new bg("Invalid reward Type : " + string);
        }
        String string2 = jsy.i(node, "Name");
        cgw cgw2 = new cgw();
        cgw2.ezl = string2;
        cgw2.ezk = cgl2;
        return cgw2;
    }
}

