/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jzs {
    public static final lju eM = new lju(0, 1, 0);
    private les ResourceTree = lea.enW();
    private les aqN = lea.enZ();
    private List paN = lcn.abH(5);

    public void vJ(String string) {
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, eM);
            NodeList nodeList = document.getElementsByTagName("FileName");
            if (nodeList.getLength() == 0) {
                return;
            }
            int n = nodeList.getLength();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    Node node = nodeList.item(i2);
                    String string2 = jsy.m(node);
                    if (string2 == null || string2.trim().equals("")) {
                        throw new bj("Node 'FileName' has invalid value.");
                    }
                    int n2 = cxd.fJW;
                    String string3 = jsy.h(node, "SkillName");
                    if (string3 != null && (n2 = this.aqN.getType(string3)) <= 0) {
                        throw new bj("SkillName '" + string3 + "' is invalid.");
                    }
                    String string4 = "xml-files/common/crafting/" + string2;
                    this.V(string4, n2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of recipecraftingfile " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private void V(String string, int n) {
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, eM);
            NodeList nodeList = document.getElementsByTagName("SFRecipe");
            if (nodeList.getLength() == 0) {
                return;
            }
            Map<Integer, ctu> map = cwy.xj(n);
            if (map == null) {
                throw new bg("No craftingrecipemap mapped to skill '" + this.aqN.getName(n) + "'");
            }
            int n2 = nodeList.getLength();
            for (int i2 = 0; i2 < n2; ++i2) {
                ctu ctu2 = this.cO(nodeList.item(i2));
                Integer n3 = new Integer(ctu2.az());
                if (map.containsKey(n3)) {
                    throw new bp("A crafting recipe for '" + ctu2.pa() + "' already exists.");
                }
                map.put(n3, ctu2);
            }
        }
        catch (bg bg2) {
            lfn.b(5, this.getClass().getSimpleName(), "error: " + bg2.getMessage());
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }

    private ctu cO(Node node) {
        String string = jsy.c(node, "ResourceName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'ResourceName' has invalid value.");
        }
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            throw new bj("ResourceName '" + string + "' is invalid.");
        }
        int n2 = jsy.d(node, "Quantity");
        if (n2 <= 0) {
            throw new bj("Attribute 'Quantity' has invalid value.");
        }
        float f = jsy.e(node, "Difficulty");
        if (f < -1.0f || f > 1.0f) {
            throw new bj("Attribute 'Difficulty' has invalid value.");
        }
        float f2 = jsy.e(node, "DurationMultiplier");
        if (f2 <= 0.0f) {
            throw new bj("Attribute 'DurationMultiplier' has invalid value.");
        }
        String string2 = jsy.c(node, "RequiredResourceName");
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Attribute 'RequiredResourceName' has invalid value.");
        }
        int n3 = this.ResourceTree.getType(string2);
        if (n3 <= 0) {
            throw new bj("RequiredResourceName '" + string2 + "' is invalid.");
        }
        if (!this.ResourceTree.isDescendant(n3, cug.fgE)) {
            throw new bj("RequiredResource '" + string2 + "' is not a '" + this.ResourceTree.getName(cug.fgE) + "'");
        }
        float f3 = 1.0f;
        try {
            f3 = jsy.e(node, "CraftingSkillLevelMin");
        }
        catch (bp bp2) {
            // empty catch block
        }
        float f4 = 100.0f;
        try {
            f4 = jsy.e(node, "CraftingSkillLevelMax");
        }
        catch (bp bp3) {
            // empty catch block
        }
        boolean bl = false;
        try {
            bl = jsy.f(node, "Lockable");
        }
        catch (Exception exception) {
            // empty catch block
        }
        boolean bl2 = true;
        try {
            bl2 = jsy.f(node, "Visible");
        }
        catch (Exception exception) {
            // empty catch block
        }
        ctu ctu2 = new ctu();
        ctu2.l(n);
        ctu2.do(n2);
        ctu2.eR(f);
        ctu2.eS(f2);
        ctu2.un(n3);
        ctu2.eT(f3);
        ctu2.eU(f4);
        ctu2.gY(bl);
        ctu2.setVisible(bl2);
        List<Node> list = jsy.c("SFRequiredSkill", node);
        if (list != null && !list.isEmpty()) {
            ctz[] ctzArray = new ctz[list.size()];
            boolean bl3 = false;
            int n4 = ctzArray.length;
            for (int i2 = 0; i2 < n4; ++i2) {
                try {
                    ctzArray[i2] = this.cR(list.get(i2));
                    if (!ctzArray[i2].fgt) continue;
                    if (bl3) {
                        throw new bj("More than one requiredskill has UseInCraftingCheck flag set to true.");
                    }
                    bl3 = true;
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("RequiredSkill " + i2 + " for resource '" + ctu2.pa() + "' could not be parsed.", bg2);
                }
            }
            ctu2.a(ctzArray);
        }
        this.b(node, ctu2);
        this.a(node, ctu2);
        return ctu2;
    }

    private void a(Node node, ctu ctu2) {
        List<Node> list = jsy.c("SFIngredient", node);
        if (list == null || list.isEmpty()) {
            throw new bp("No 'SFIngredient' nodes found.");
        }
        this.paN.clear();
        int n = list.size();
        for (int i2 = 0; i2 < n; ++i2) {
            try {
                ctm ctm2 = this.cP(list.get(i2));
                this.paN.add(ctm2);
                continue;
            }
            catch (bg bg2) {
                throw new bg("Ingredient " + i2 + " for resource '" + ctu2.pa() + "' could not be parsed.", bg2);
            }
        }
        Collections.sort(this.paN);
        ctm[] ctmArray = this.paN.toArray(new ctm[this.paN.size()]);
        ctu2.Ingredients = ctmArray;
    }

    private ctm cP(Node node) {
        String string = jsy.c(node, "ResourceName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'ResourceName' has invalid value.");
        }
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            throw new bj("ResourceName '" + string + "' is invalid.");
        }
        int n2 = jsy.d(node, "Quantity");
        if (n2 <= 0) {
            throw new bj("Attribute 'Quantity' has invalid value.");
        }
        float f = jsy.e(node, "FractionLoss");
        if (f < 0.0f || f > 10.0f) {
            throw new bj("Attribute 'FractionLoss' has invalid value.");
        }
        if (!cug.vQ((int)n)) {
            throw new bj("Resource '" + string + "' is not stackable.");
        }
        ctm ctm2 = new ctm();
        ctm2.ResourceType = n;
        ctm2.asi = n2;
        ctm2.fgb = f;
        return ctm2;
    }

    private void b(Node node, ctu ctu2) {
        List<Node> list = jsy.c("SFCraftingByProduct", node);
        if (list == null || list.isEmpty()) {
            ctu2.a(new ctc[0]);
            return;
        }
        ArrayList<ctc> arrayList = lcn.emv();
        for (Node node2 : list) {
            ctc ctc2 = this.cQ(node2);
            if (node2 == null) {
                throw new bj("Failed to Parse Crafting By-Product Node!");
            }
            arrayList.add(ctc2);
        }
        ctu2.a(arrayList.toArray(new ctc[arrayList.size()]));
    }

    private ctc cQ(Node node) {
        String string = jsy.c(node, "ResourceName");
        if (string == null || string.trim().isEmpty()) {
            throw new bj("Attribute 'ResourceName' has invalid value.");
        }
        float f = jsy.e(node, "Probability");
        int n = jsy.d(node, "Quantity");
        return new ctc(string, f, n);
    }

    private ctz cR(Node node) {
        String string = jsy.c(node, "SkillName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'SkillName' has invalid value.");
        }
        int n = this.aqN.getType(string);
        if (n <= 0) {
            throw new bj("SkillName '" + string + "' is invalid.");
        }
        float f = jsy.e(node, "SkillLevel");
        if (f <= 0.0f) {
            throw new bj("Attribute 'SkillLevel' has invalid value.");
        }
        float f2 = jsy.e(node, "InheritancePortion");
        if (f2 < 0.0f || f2 > 50.0f) {
            throw new bj("Attribute 'InheritancePortion' has invalid value.");
        }
        boolean bl = jsy.f(node, "UseInCraftingCheck");
        ctz ctz2 = new ctz();
        ctz2.SkillType = n;
        ctz2.SkillLevel = f;
        ctz2.fgs = f2;
        ctz2.fgt = bl;
        return ctz2;
    }
}

