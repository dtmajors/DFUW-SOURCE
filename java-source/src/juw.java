/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class juw {
    private static final String TC = "SFSelentineXMLParser";

    public void eL(String string) {
        if (string == null) {
            throw new bi("FileName is null.");
        }
        Document document = jsy.tJ(string);
        try {
            Node node = jsy.d("XML", document);
            this.ae(node);
            this.ag(node);
            this.ai(node);
            this.aj(node);
            this.ah(node);
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }

    private void ae(Node node) {
        Node node2 = jsy.d("SelentineItems", node);
        List<Node> list = jsy.c("Item", node2);
        for (Node node3 : list) {
            civ civ2 = this.af(node3);
            if (civ2 == null) continue;
            lea.epC().put(civ2.az(), civ2);
        }
    }

    private civ af(Node node) {
        String string = jsy.i(node, "Name");
        int n = lea.enW().getType(string);
        if (n == -1) {
            lfn.b(5, TC, "createSelentineItem() Resource Name : " + string + " does not have an entry in the resource tree.");
            assert (false);
            return null;
        }
        int n2 = 0;
        String string2 = jsy.i(node, "Duration");
        if (string2 != null) {
            n2 = this.ui(string2);
        }
        boolean bl = Boolean.parseBoolean(jsy.i(node, "Equip"));
        int n3 = Integer.parseInt(jsy.i(node, "Cost"));
        int n4 = -1;
        Node node2 = node.getAttributes().getNamedItem("EquipedResourceName");
        if (node2 != null) {
            n4 = lea.enW().getType(node2.getNodeValue());
        }
        int n5 = 0;
        Node node3 = node.getAttributes().getNamedItem("Quantity");
        if (node3 != null) {
            n5 = Integer.valueOf(node3.getNodeValue());
        }
        boolean bl2 = true;
        Node node4 = node.getAttributes().getNamedItem("Enabled");
        if (node4 != null) {
            bl2 = node4.getNodeValue().toLowerCase().equals("true");
        }
        boolean bl3 = false;
        Node node5 = node.getAttributes().getNamedItem("LimitedTime");
        if (node5 != null) {
            bl3 = node5.getNodeValue().toLowerCase().equals("true");
        }
        boolean bl4 = false;
        Node node6 = node.getAttributes().getNamedItem("NonTransferable");
        if (node6 != null) {
            bl4 = node6.getNodeValue().toLowerCase().equals("true");
        }
        boolean bl5 = false;
        Node node7 = node.getAttributes().getNamedItem("NonMarketable");
        if (node7 != null) {
            bl5 = node7.getNodeValue().toLowerCase().equals("true");
        }
        boolean bl6 = false;
        Node node8 = node.getAttributes().getNamedItem("NonLootable");
        if (node8 != null) {
            bl6 = node8.getNodeValue().toLowerCase().equals("true");
        }
        boolean bl7 = false;
        Node node9 = node.getAttributes().getNamedItem("NonDestructible");
        if (node9 != null) {
            bl7 = node9.getNodeValue().toLowerCase().equals("true");
        }
        boolean bl8 = false;
        Node node10 = node.getAttributes().getNamedItem("Unlockable");
        if (node10 != null) {
            bl8 = node10.getNodeValue().toLowerCase().equals("true");
        }
        civ civ2 = null;
        if (n == cug.fue) {
            Node node11 = jsy.d("ProwessGain", node);
            float f = Float.parseFloat(jsy.i(node11, "Value"));
            node11 = jsy.d("RecallTimers", node);
            float f2 = Float.parseFloat(jsy.i(node11, "Value"));
            node11 = jsy.d("InventoryMaxWeight", node);
            float f3 = Float.parseFloat(jsy.i(node11, "Value"));
            node11 = jsy.d("MountSpeed", node);
            float f4 = Float.parseFloat(jsy.i(node11, "Value"));
            node11 = jsy.d("Autoloot", node);
            boolean bl9 = Boolean.parseBoolean(jsy.i(node11, "Value"));
            node11 = jsy.d("Gold", node);
            float f5 = Float.parseFloat(jsy.i(node11, "Value"));
            node11 = jsy.d("SkinningRate", node);
            float f6 = Float.parseFloat(jsy.i(node11, "Value"));
            civ2 = new ciu(n, n3, bl, n2, f2, f, f3, f4, bl9, f5, f6);
        } else if (n == cug.fuf) {
            Node node12 = jsy.d("ProwessGain", node);
            float f = Float.parseFloat(jsy.i(node12, "Value"));
            node12 = jsy.d("RecallTimers", node);
            float f7 = Float.parseFloat(jsy.i(node12, "Value"));
            node12 = jsy.d("InventoryMaxWeight", node);
            float f8 = Float.parseFloat(jsy.i(node12, "Value"));
            node12 = jsy.d("MountSpeed", node);
            float f9 = Float.parseFloat(jsy.i(node12, "Value"));
            node12 = jsy.d("Autoloot", node);
            boolean bl10 = Boolean.parseBoolean(jsy.i(node12, "Value"));
            node12 = jsy.d("CraftingTimers", node);
            float f10 = Float.parseFloat(jsy.i(node12, "Value"));
            node12 = jsy.d("HarvestTimers", node);
            float f11 = Float.parseFloat(jsy.i(node12, "Value"));
            node12 = jsy.d("MarketTaxFee", node);
            float f12 = Float.parseFloat(jsy.i(node12, "Value"));
            node12 = jsy.d("CraftingSkillGain", node);
            float f13 = Float.parseFloat(jsy.i(node12, "Value"));
            civ2 = new cit(n, n3, bl, n2, f7, f, f8, f9, bl10, f10, f11, f12, f13);
        } else if (n == cug.fug) {
            Node node13 = jsy.d("ProwessGain", node);
            float f = Float.parseFloat(jsy.i(node13, "Value"));
            node13 = jsy.d("RecallTimers", node);
            float f14 = Float.parseFloat(jsy.i(node13, "Value"));
            node13 = jsy.d("HarvestTimers", node);
            float f15 = Float.parseFloat(jsy.i(node13, "Value"));
            node13 = jsy.d("MarketTaxFee", node);
            float f16 = Float.parseFloat(jsy.i(node13, "Value"));
            node13 = jsy.d("SkinningRate", node);
            float f17 = Float.parseFloat(jsy.i(node13, "Value"));
            civ2 = new cir(n, n3, bl, n2, f14, f, f16, f15, f17);
        } else if (bl8) {
            ain ain2 = ain.bnp;
            Node node14 = node.getAttributes().getNamedItem("Type");
            if (node14 != null) {
                ain2 = ain.getUnlockableTypeByName(node14.getNodeValue().toLowerCase());
            }
            switch (ain2) {
                case bnq: {
                    boolean bl11 = false;
                    Node node15 = node.getAttributes().getNamedItem("Emote");
                    if (node15 != null) {
                        bl11 = Boolean.parseBoolean(node15.getNodeValue().toLowerCase());
                    }
                    String string3 = jsy.i(node, "AnimationStateName");
                    civ2 = new cix(n, n3, bl, n2, n5, string3, bl11);
                    break;
                }
                case bnr: 
                case bns: 
                case bnt: 
                case bnu: 
                case bnv: 
                case bnw: 
                case bnx: 
                case bny: 
                case bnz: 
                case bnA: 
                case bnB: 
                case bnC: {
                    String string4 = jsy.i(node, "ReplaceResourceName");
                    int n6 = lea.enW().getType(string4);
                    civ2 = new ciy(n, n3, bl, n2, n5, ain2, n6);
                    break;
                }
                default: {
                    assert (false) : "UNIMPLEMENTED : " + (Object)((Object)ain2);
                    return null;
                }
            }
        } else {
            ArrayList<cip> arrayList = null;
            List<Node> list = jsy.c("Item", node);
            if (list != null && !list.isEmpty()) {
                arrayList = lcn.abH(list.size());
                for (Node node16 : list) {
                    String string5 = jsy.i(node16, "Name");
                    int n7 = lea.enW().getType(string5);
                    if (n7 == -1) {
                        lfn.b(5, TC, "createSelentineItem() Resource Name : " + string5 + " does not have an entry in the resource tree.");
                        assert (false);
                        return null;
                    }
                    int n8 = Integer.valueOf(jsy.i(node16, "Quantity"));
                    if (n8 <= 0) {
                        lfn.b(5, TC, "createSelentineItem() Invalid quantity for Resource Name : " + string5);
                        assert (false);
                        return null;
                    }
                    arrayList.add(new cip(n7, n8));
                }
            }
            if (n4 != -1) {
                if (arrayList == null) {
                    arrayList = lcn.emv();
                }
                arrayList.add(new cip(n4, n5));
            }
            civ2 = new civ(n, n3, bl, n2, arrayList, n5);
        }
        civ2.setEnabled(bl2);
        civ2.gb(bl3);
        civ2.gc(bl5);
        civ2.gd(bl4);
        civ2.ge(bl7);
        civ2.gf(bl6);
        return civ2;
    }

    private void ag(Node node) {
        Node node2 = jsy.d("SelentineSkills", node);
        List<Node> list = jsy.c("Skill", node2);
        for (Node node3 : list) {
            String string = jsy.i(node3, "Name");
            int n = lea.enZ().getType(string);
            if (n == -1) {
                throw new bj("Skill Name : " + string + " does not have an entry in the skill tree.");
            }
            float f = Float.parseFloat(jsy.i(node3, "Value"));
            lea.epE().put(n, Float.valueOf(f));
        }
    }

    private void ah(Node node) {
        Node node2 = jsy.d("CraftingSkillReduction", node);
        int n = Integer.parseInt(jsy.i(node2, "TimeReduction"));
        int n2 = Integer.parseInt(jsy.i(node2, "MinimumTime"));
        lea.acp(n);
        lea.acq(n2);
    }

    private void ai(Node node) {
        Node node2 = jsy.d("SelentineItemTransactions", node);
        List<Node> list = jsy.c("Transaction", node2);
        for (Node node3 : list) {
            String string = jsy.i(node3, "Name");
            cio cio2 = cio.getValueByName(string);
            int n = Integer.parseInt(jsy.i(node3, "Cost"));
            lea.epD().put(cio2.ordinal(), n);
        }
    }

    private int ui(String string) {
        int n = -1;
        int n2 = -1;
        int n3 = -1;
        int n4 = -1;
        String[] stringArray = string.split(":");
        if (stringArray == null || stringArray.length != 4) {
            assert (false);
            return -1;
        }
        n = Integer.parseInt(stringArray[0]);
        n2 = Integer.parseInt(stringArray[1]);
        n3 = Integer.parseInt(stringArray[2]);
        n4 = Integer.parseInt(stringArray[3]);
        return (int)((double)n * 86400.0 + (double)n2 * 3600.0 + (double)n3 * 60.0 + (double)n4 * 1.0);
    }

    private void aj(Node node) {
        Node node2 = jsy.e("SelentineShop", node);
        this.a(node2, null);
    }

    private void a(Node node, lgw lgw2) {
        Object object;
        String string = "";
        int n = -1;
        ler ler2 = null;
        if (lgw2 != null) {
            object = node.getAttributes().getNamedItem("Resource");
            string = object.getNodeValue();
            n = lea.enW().getType(string);
            if (n == -1) {
                assert (false) : "ResourceName : " + string;
                return;
            }
            ler2 = (lgw)lea.enW().acv(n);
        }
        object = new lgw();
        if (ler2 != null) {
            ((ler)object).setName(ler2.getName());
            ((ler)object).setType(ler2.getType());
        } else {
            ((ler)object).setName("Root");
            ((ler)object).setType(0);
        }
        lea.enY().a((ler)lgw2, (ler)object, null);
        List<Node> list = jsy.c("Item", node);
        for (Node node2 : list) {
            this.a(node2, (lgw)object);
        }
    }
}

