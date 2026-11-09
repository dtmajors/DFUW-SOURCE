/*
 * Decompiled with CFR.
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class mut {
    private Document cn = null;
    private String EHA = "";
    private String ayB = "";
    private String EHB = "";
    private ljq Position;
    private String EHC = "";
    private String EHD = "";
    private List<String> EHE = lcn.emv();
    private List<String> EHF = lcn.emv();
    private List<String> dxJ = lcn.emv();
    private int EHG = 0;
    private List<String> EHH = lcn.emv();

    private void eQa() {
        this.EHA = "";
        this.ayB = "";
        this.EHC = "";
        this.EHD = "";
        this.EHE.clear();
        this.EHF.clear();
        this.dxJ.clear();
        this.EHH.clear();
    }

    public String DB(String string) {
        block5: {
            try {
                this.cn = jsy.tJ(string);
                Node node = jsy.a("SFInteractionTemplate", (Node)this.cn);
                if (node == null) {
                    assert (false);
                    return "No name";
                }
                Node node2 = jsy.a("SFInteraction", node);
                if (node2 != null) {
                    Node node3 = jsy.a("InteractionName", node2);
                    return jsy.m(node3);
                }
            }
            catch (bo bo2) {
                if ($assertionsDisabled) break block5;
                throw new AssertionError((Object)bo2.getMessage());
            }
        }
        return "No name";
    }

    public void V(jrw jrw2) {
        try {
            this.eQa();
            this.cn = jsy.n(jrw2);
            Node node = jsy.a("SFInteractionTemplate", (Node)this.cn);
            if (node == null) {
                String string = "rootNode = null. Interaction file invalid!";
                assert (false) : string;
                return;
            }
            Node node2 = jsy.a("SFInteraction", node);
            if (node2 != null) {
                String string;
                int n;
                Node node3 = jsy.a("InteractionResourceFile", node2);
                this.EHA = jsy.m(node3);
                node3 = jsy.a("InteractionType", node2);
                this.EHG = jsy.r(node3);
                node3 = jsy.a("InteractionName", node2);
                this.ayB = jsy.m(node3);
                node3 = jsy.a("NPCTypeName", node2);
                this.EHB = jsy.m(node3);
                node3 = jsy.a("InteractionSellAdjustValue", node2);
                this.EHC = String.valueOf(jsy.o(node3));
                node3 = jsy.a("InteractionBuyAdjustValue", node2);
                this.EHD = String.valueOf(jsy.o(node3));
                Node node4 = jsy.a("VendorBehaviorList", node2);
                List<Node> list = jsy.c("VendorBehaviorTemplate", node4);
                for (n = 0; n < list.size(); ++n) {
                    if (!list.get(n).getNodeName().equals("VendorBehaviorTemplate")) continue;
                    string = jsy.m(list.get(n));
                    this.EHH.add(string);
                }
                node4 = jsy.a("InteractionBuySellInventoryList", node2);
                list = jsy.c("InteractionBuySellInventoryFile", node4);
                for (n = 0; n < list.size(); ++n) {
                    if (!list.get(n).getNodeName().equals("InteractionBuySellInventoryFile")) continue;
                    string = jsy.m(list.get(n));
                    this.EHE.add(string);
                }
                node4 = jsy.a("TrainingList", node2);
                list = jsy.c("TrainingItem", node4);
                for (n = 0; n < list.size(); ++n) {
                    if (!list.get(n).getNodeName().equals("TrainingItem")) continue;
                    string = jsy.m(list.get(n));
                    this.EHF.add(string);
                }
                node4 = jsy.a("InteractionQuestList", node2);
                list = jsy.c("InteractionQuestFile", node4);
                for (n = 0; n < list.size(); ++n) {
                    if (!list.get(n).getNodeName().equals("InteractionQuestFile")) continue;
                    string = jsy.m(list.get(n));
                    this.dxJ.add(string);
                }
            }
        }
        catch (bo bo2) {
            // empty catch block
        }
    }

    public String eQb() {
        return this.EHA;
    }

    public String getVendorName() {
        return this.ayB;
    }

    public ljq eQc() {
        return this.Position;
    }

    public String eQd() {
        return this.EHC;
    }

    public String eQe() {
        return this.EHD;
    }

    public List eQf() {
        return this.EHE;
    }

    public List eQg() {
        return this.EHH;
    }

    public List eQh() {
        return this.EHF;
    }

    public List<String> eQi() {
        return this.dxJ;
    }

    public String eQj() {
        return this.EHB;
    }

    public void DC(String string) {
        this.EHB = string;
    }

    public int eQk() {
        return this.EHG;
    }
}

