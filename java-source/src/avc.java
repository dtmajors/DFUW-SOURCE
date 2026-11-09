/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  lcr
 *  lcw
 */
import java.util.List;

public class avc
extends avv {
    private boolean Initialized = false;
    private ldv cdD = null;

    public avc() {
        super(new amd(avc.class, aul.cdc, "ChatProxyForInventory", new cqi[0], null));
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2321: {
                this.a((egk)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected final void b(int n, Object[] objectArray, String string) {
        if (this.cdD == null) {
            return;
        }
        a[] aArray = (a[])a.class.getEnumConstants();
        a a2 = aArray[n];
        switch (a2) {
            case cjm: {
                this.aC(objectArray);
                break;
            }
            case cjn: {
                this.aD(objectArray);
                break;
            }
            case cjo: {
                this.aE(objectArray);
                break;
            }
            case cjp: {
                this.aF(objectArray);
                break;
            }
            case cjq: {
                this.aG(objectArray);
                break;
            }
            case cja: {
                this.a(1, false, objectArray);
                break;
            }
            case cjb: {
                this.a(2, false, objectArray);
                break;
            }
            case cjc: {
                this.a(2, true, objectArray);
                break;
            }
            case cjd: {
                this.a(3, false, objectArray);
                break;
            }
            case cje: {
                this.a(3, true, objectArray);
                break;
            }
            case cjf: {
                this.a(1, true, objectArray);
                break;
            }
            case cjg: {
                this.b(1, false, objectArray);
                break;
            }
            case cjh: {
                this.b(1, true, objectArray);
                break;
            }
            case cjw: {
                this.aB(objectArray);
                break;
            }
            case cjx: {
                this.aH(objectArray);
                break;
            }
            case cjy: {
                this.aI(objectArray);
                break;
            }
            case cjz: {
                this.aL(objectArray);
                break;
            }
            case cji: {
                this.ow();
                break;
            }
            case cjj: {
                this.ox();
                break;
            }
            case cjr: {
                this.Wz();
                break;
            }
            case cjs: {
                this.WA();
                break;
            }
            case cjt: {
                this.WB();
                break;
            }
            case cjk: {
                this.aK(objectArray);
                break;
            }
            case cju: {
                this.aJ(objectArray);
                break;
            }
            case cjv: {
                this.WC();
                break;
            }
            case cjl: {
                this.oy();
                break;
            }
            default: {
                super.b(n, objectArray, string);
            }
        }
    }

    @Override
    protected final void FG() {
        assert (this.Initialized);
        this.We();
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaP, a.cjm, new ljk("creates the crafting ingredients for a specified resource using a specified craftingenchanting skill"), new egg[]{new egg("skill_name", egg.a.ipq, false, new ljk("the craftingenchanting skill to use")), new egg("resource_name", egg.a.ipq, false, new ljk("the resource specifying the crafting recipe to use"))});
        this.a(hc.aaP, a.cjn, new ljk("creates the crafting ingredients for a specified resource"), new egg[]{new egg("resource_name", egg.a.ipq, false, new ljk("the resource specifying the crafting recipe to use"))});
        this.a(hc.aaP, a.cjo, new ljk("creates a teleport rune with a specified position"), new egg[]{new egg("position", egg.a.ipq, false, new ljk("the position to set in the teleport rune"))});
        this.a(hc.aaP, a.cjp, new ljk("creates a teleport rune with the predefined position for a specified tile"), new egg[]{new egg("tile_name", egg.a.ipq, false, new ljk("name of the tile to use to get the position to set in the teleport rune"))});
        this.a(hc.aaP, a.cjq, new ljk("creates the ingredients needed to test a specified thaumaturgy recipe"), new egg[]{new egg("recipe_name", egg.a.ipq, false, new ljk("the name of the recipe to test"))});
        this.a(hc.aaQ, a.cja, new ljk("creates a specified set of equipment for a player"), new egg[]{new egg("equipment_list", egg.a.ipq, false, new ljk("the set of equipment to create"))});
        this.a(hc.aaV, a.cjb, new ljk("creates a specified set of equipment for a bank"), new egg[]{new egg("equipment_list", egg.a.ipq, false, new ljk("the set of equipment to create"))});
        this.a(hc.aaV, a.cjc, new ljk("creates a specified set of equipment put in a container for a bank"), new egg[]{new egg("equipment_list", egg.a.ipq, false, new ljk("the set of equipment to create"))});
        this.a(hc.aaP, a.cjd, new ljk("creates a specified set of equipment for a clan"), new egg[]{new egg("equipment_list", egg.a.ipq, false, new ljk("the set of equipment to create"))});
        this.a(hc.aaP, a.cje, new ljk("creates a specified set of equipment put in a container for a clan"), new egg[]{new egg("equipment_list", egg.a.ipq, false, new ljk("the set of equipment to create"))});
        this.a(hc.aaV, a.cjf, new ljk("creates a specified set of equipment put in a container for a player"), new egg[]{new egg("equipment_list", egg.a.ipq, false, new ljk("the set of equipment to create"))});
        this.a(hc.aaP, a.cjg, new ljk("creates a specified set of equipment for a player where the equipment exists in a remote objectspace"), new egg[]{new egg("equipment_list", egg.a.ipq, false, new ljk("the set of equipment to create"))});
        this.a(hc.aaP, a.cjh, new ljk("creates a specified set of equipment put in a container for a player where the equipment exists in a remote objectspace"), new egg[]{new egg("equipment_list", egg.a.ipq, false, new ljk("the set of equipment to create"))});
        this.a(hc.aaP, a.cjw, new ljk("adds a specified feature to your player"), new egg[]{new egg("resource_name", egg.a.ipq, false, new ljk("the resourcename of the feature to add"))});
        this.a(hc.aaP, a.cjx, new ljk("removes a specified feature from your player"), new egg[]{new egg("resource_name", egg.a.ipq, false, new ljk("the resourcename of the feature to remove"))});
        this.a(hc.aaP, a.cjy, new ljk("sets the haircolor of your player"), new egg[]{new egg("hair_color", egg.a.ipq, false, new ljk("the haircolor"))});
        this.a(hc.aaP, a.cjz, new ljk("sets the skincolor of your player"), new egg[]{new egg("skin_color", egg.a.ipq, false, new ljk("the skincolor"))});
        this.a(hc.aaU, a.cji, new ljk("removes all the items from the backpack"), new egg[0]);
        this.a(hc.aaU, a.cjj, new ljk("removes all the items from the inventory"), new egg[0]);
        this.a(hc.aaP, a.cjr, new ljk("prints the content of the client inventory"), new egg[0]);
        this.a(hc.aaP, a.cjs, new ljk("prints the content of the server inventory"), new egg[0]);
        this.a(hc.aaP, a.cjt, new ljk("prints the max weight of an inventory"), new egg[0]);
        this.a(hc.aaP, a.cjk, new ljk("sets the durability of all items in the backpack that are descendants of the specified resource"), new egg[]{new egg("resource_name", egg.a.ipq, false, new ljk("the resource name that specifies the items to select")), new egg("durability", egg.a.ipp, false, new ljk("the new durability of the items"))});
        this.a(hc.aaP, a.cju, new ljk("set the max weight of an inventory"), new egg[]{new egg("max_weight", egg.a.ipp, false, new ljk("the max weight of an inventory"))});
        this.a(hc.aaP, a.cjv, new ljk("validates all the items in a client inventory"), new egg[0]);
        this.a(hc.aaP, a.cjl, new ljk("detaches all the items in the paperdoll container"), new egg[0]);
    }

    private void a(egk egk2) {
        if (egk2.cdD == null) {
            lfn.b(5, "SFChatProxyForInventory", "handleChatGUIDInfoMessage() PlayerObjectServerGUID is null.");
            return;
        }
        this.cdD = egk2.cdD;
    }

    private int bb(String string) {
        try {
            int n = Integer.parseInt(string);
            if (n < 0) {
                lfn.b(5, "SFChatProxyForInventory", "parseQuantityString() QuantityString '" + string + "' is invalid.");
                return 0;
            }
            return n;
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFChatProxyForInventory", "parseQuantityString() " + numberFormatException);
            return 0;
        }
    }

    private void a(hc hc2, a a2, lip lip2, egg[] eggArray) {
        this.a(hc2, a2.ordinal(), a2.name().toLowerCase(), lip2, eggArray);
    }

    private void aB(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForInventory", "addFeature() ResourceName '" + string + "' is invalid.");
            return;
        }
        fdy fdy2 = (fdy)this.MessageDelegator.h(9241, this.GUID, this.cdD.bFk());
        fdy2.bst = bkd.dqL;
        fdy2.aZG = this.cdD;
        fdy2.akX = this.cdD;
        fdy2.ilu = 1;
        fdy2.ResourceType = n;
        this.d(this.cdD, fdy2);
    }

    private int in(int n) {
        ler ler2 = this.ResourceTree.acv(n);
        List<ler> list = this.ResourceTree.a(ler2, false, false);
        int n2 = (int)(lgp.erA().nextFloat() * (float)list.size());
        return list.get(n2).getType();
    }

    private void ow() {
        fmr fmr2 = (fmr)this.MessageDelegator.h(7976, this.GUID, this.cdD);
        fmr2.ilu = 1;
        this.d(this.cdD, fmr2);
    }

    private void ox() {
        fmr fmr2 = (fmr)this.MessageDelegator.h(7976, this.GUID, this.cdD);
        fmr2.ilu = 2;
        this.d(this.cdD, fmr2);
    }

    private void oy() {
        fmr fmr2 = (fmr)this.MessageDelegator.h(7976, this.GUID, this.cdD);
        fmr2.ilu = 3;
        this.d(this.cdD, fmr2);
    }

    private void aC(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = this.aqN.getType(string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForInventory", "createCraftingEnchantingIngredients() SkillName '" + string + "' is invalid.");
            return;
        }
        if (!this.aqN.isDescendant(n, cxd.fJj)) {
            lfn.b(5, "SFChatProxyForInventory", "createCraftingEnchantingIngredients() Skill '" + string + "' is not a crafting skill.");
            return;
        }
        String string2 = (String)objectArray[1];
        int n2 = this.ResourceTree.getType(string2);
        if (n2 <= 0) {
            lfn.b(5, "SFChatProxyForInventory", "createCraftingEnchantingIngredients() ResourceName '" + string2 + "' is invalid.");
            return;
        }
        ere ere2 = (ere)this.MessageDelegator.h(16658, this.GUID, this.cdD);
        ere2.ixI = 1;
        ere2.SkillType = n;
        ere2.ResourceType = n2;
        this.MessageDelegator.F(ere2);
    }

    private void aD(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForInventory", "createCraftingIngredients() ResourceName '" + string + "' is invalid.");
            return;
        }
        ctu ctu2 = cwy.bm(cxd.fJW, n);
        if (ctu2 == null) {
            lfn.b(5, "SFChatProxyForInventory", "createCraftingIngredients() Could not find crafting recipe for '" + string + "'");
            return;
        }
        ctm[] ctmArray = ctu2.Ingredients;
        cte[] cteArray = new cte[ctmArray.length];
        int n2 = ctmArray.length;
        for (int i = 0; i < n2; ++i) {
            cteArray[i] = new cte();
            cteArray[i].ResourceType = ctmArray[i].ResourceType;
            cteArray[i].asi = ctmArray[i].asi;
        }
        erm erm2 = (erm)this.MessageDelegator.h(16644, this.GUID, this.cdD);
        erm2.aZF = 1;
        erm2.dtP = cteArray;
        erm2.iyH = false;
        erm2.iyI = false;
        this.MessageDelegator.F(erm2);
    }

    private void a(int n, boolean bl, Object[] objectArray) {
        List<cte> list = this.ba((String)objectArray[0]);
        if (list.isEmpty()) {
            return;
        }
        cte[] cteArray = new cte[list.size()];
        list.toArray(cteArray);
        erm erm2 = (erm)this.MessageDelegator.h(16644, this.GUID, this.cdD);
        erm2.aZF = n;
        erm2.dtP = cteArray;
        erm2.iyH = bl;
        erm2.iyI = false;
        this.MessageDelegator.F(erm2);
    }

    private void b(int n, boolean bl, Object[] objectArray) {
        List<cte> list = this.ba((String)objectArray[0]);
        if (list.isEmpty()) {
            return;
        }
        cte[] cteArray = new cte[list.size()];
        list.toArray(cteArray);
        erm erm2 = (erm)this.MessageDelegator.h(16644, this.GUID, this.cdD);
        erm2.aZF = n;
        erm2.dtP = cteArray;
        erm2.iyH = bl;
        erm2.iyI = true;
        this.MessageDelegator.F(erm2);
    }

    private void aE(Object[] objectArray) {
        String string = (String)objectArray[0];
        ljq ljq2 = ljq.Aw(string);
        if (ljq2 == null) {
            lfn.b(5, "SFChatProxyForInventory", "createTeleportRuneAtPosition() Invalid position provided: '" + string + "'");
            return;
        }
        fh fh2 = new fh();
        fh2.setType(9648);
        fh2.L(ljq2);
        cte cte2 = new cte();
        cte2.ResourceType = cug.fpN;
        cte2.asi = 1;
        cte2.DR = new ej[]{fh2};
        erm erm2 = (erm)this.MessageDelegator.h(16644, this.GUID, this.cdD);
        erm2.aZF = 1;
        erm2.dtP = new cte[]{cte2};
        erm2.iyH = false;
        erm2.iyI = false;
        this.MessageDelegator.F(erm2);
    }

    private void aF(Object[] objectArray) {
        String string = (String)objectArray[0];
        ljq ljq2 = lcw.zh((String)string);
        if (ljq2 == null) {
            lfn.b(5, "SFChatProxyForInventory", "createTeleportRuneForTile() Invalid tilename provided: '" + string + "'");
            return;
        }
        ljq2.x += 480.0f;
        ljq2.y += 500.0f;
        ljq2.rlV += 480.0f;
        fh fh2 = new fh();
        fh2.setType(9648);
        fh2.L(ljq2);
        cte cte2 = new cte();
        cte2.ResourceType = cug.fpN;
        cte2.asi = 1;
        cte2.DR = new ej[]{fh2};
        erm erm2 = (erm)this.MessageDelegator.h(16644, this.GUID, this.cdD);
        erm2.aZF = 1;
        erm2.dtP = new cte[]{cte2};
        erm2.iyH = false;
        erm2.iyI = false;
        this.MessageDelegator.F(erm2);
    }

    private void aG(Object[] objectArray) {
        String string = (String)objectArray[0];
        if (string == null || string.trim().equals("")) {
            lfn.b(5, "SFChatProxyForInventory", "createThaumaturgyIngredients() RecipeName is null.");
            return;
        }
        ere ere2 = (ere)this.MessageDelegator.h(16658, this.GUID, this.cdD);
        ere2.ixI = 2;
        ere2.ixJ = string;
        this.MessageDelegator.F(ere2);
    }

    private void Wz() {
        ldv ldv2 = lcr.ak((ldv)this.cdD, (int)this.GUID.ib());
        fmr fmr2 = (fmr)this.MessageDelegator.h(7976, this.GUID, ldv2);
        fmr2.ilu = 4;
        this.MessageDelegator.F(fmr2);
    }

    private void WA() {
        fmr fmr2 = (fmr)this.MessageDelegator.h(7976, this.GUID, this.cdD);
        fmr2.ilu = 5;
        this.d(this.cdD, fmr2);
    }

    private void WB() {
        this.h(mce.usQ.bD(Float.valueOf(bqm.dDz)));
    }

    private void aH(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForInventory", "removeFeature() ResourceName '" + string + "' is invalid.");
            return;
        }
        fdy fdy2 = (fdy)this.MessageDelegator.h(9241, this.GUID, this.cdD.bFk());
        fdy2.bst = bkd.dqL;
        fdy2.aZG = this.cdD;
        fdy2.akX = this.cdD;
        fdy2.ilu = 2;
        fdy2.ResourceType = n;
        this.d(this.cdD, fdy2);
    }

    private void aI(Object[] objectArray) {
        String string = (String)objectArray[0];
        lcq lcq2 = null;
        try {
            lcq2 = lcq.ze(string);
            if (lcq2 == null) {
                lfn.b(5, "SFChatProxyForInventory", "setHairColor() '" + string + "' is invalid color.");
                return;
            }
            lcq2 = new lcq(lcq2.getColor());
        }
        catch (Exception exception) {
            lfn.b(5, "SFChatProxyForInventory", "setHairColor() Invalid colorstring provided: '" + string + "'");
            return;
        }
        fdy fdy2 = (fdy)this.MessageDelegator.h(9241, this.GUID, this.cdD.bFk());
        fdy2.bst = bkd.dqL;
        fdy2.aZG = this.cdD;
        fdy2.akX = this.cdD;
        fdy2.ilu = 3;
        fdy2.dMT = lcq2;
        this.d(this.cdD, fdy2);
    }

    private void aJ(Object[] objectArray) {
        float f2;
        bqm.dDz = f2 = ((ldq)objectArray[0]).floatValue();
        erw erw2 = (erw)this.MessageDelegator.h(16650, this.GUID, this.cdD);
        erw2.dVm = 2;
        erw2.iiT = f2;
        this.MessageDelegator.F(erw2);
    }

    private void aK(Object[] objectArray) {
        String string = (String)objectArray[0];
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            lfn.b(5, "SFChatProxyForInventory", "setItemDurability() ResourceName '" + string + "' is invalid.");
            return;
        }
        float f2 = ((ldq)objectArray[1]).floatValue();
        fmr fmr2 = (fmr)this.MessageDelegator.h(7976, this.GUID, this.cdD);
        fmr2.ilu = 6;
        fmr2.ResourceType = n;
        fmr2.iQv = f2;
        this.d(this.cdD, fmr2);
    }

    private void aL(Object[] objectArray) {
        String string = (String)objectArray[0];
        lcq lcq2 = lcq.ze(string);
        if (lcq2 == null) {
            lfn.b(5, "SFChatProxyForInventory", "setSkinColor() '" + string + "' is invalid color.");
            return;
        }
        lcq2 = new lcq(lcq2.getColor());
        fdy fdy2 = (fdy)this.MessageDelegator.h(9241, this.GUID, this.cdD.bFk());
        fdy2.bst = bkd.dqL;
        fdy2.aZG = this.cdD;
        fdy2.akX = this.cdD;
        fdy2.ilu = 4;
        fdy2.dMT = lcq2;
        this.d(this.cdD, fdy2);
    }

    private void WC() {
        ldv ldv2 = lcr.ak((ldv)this.cdD, (int)this.GUID.ib());
        fmr fmr2 = (fmr)this.MessageDelegator.h(7976, this.GUID, ldv2);
        fmr2.ilu = 7;
        this.MessageDelegator.F(fmr2);
    }
}

