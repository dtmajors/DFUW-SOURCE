/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;

public class ctf {
    private static float feA = 1.0f;
    private static float feB = 0.5f;
    private static les ResourceTree = lea.enW();

    private static float bby() {
        switch (lcw.bcB) {
            case 2: {
                return feB;
            }
        }
        return feA;
    }

    public static cte[] a(csw csw2) {
        if (csw2 == null) {
            lfn.b(5, "SFEquipmentItemConstants", "createChestContent() InventoryInfo is null.");
            return null;
        }
        return ctf.a(csw2.fea, 0.0f, ctf.bby());
    }

    public static cte[] a(cup cup2) {
        if (cup2 == null) {
            lfn.b(5, "SFEquipmentItemConstants", "createTreasureMapContent() InventoryInfo is null.");
            return null;
        }
        return ctf.a(cup2.fxO, 0.0f);
    }

    public static es a(ctd ctd2) {
        if (ctd2 == null) {
            lfn.b(5, "SFEquipmentItemConstants", "createEnchantmentAttribute() AttributeInfo is null.");
            return null;
        }
        ctx ctx2 = ctd2.bbw();
        if (ctx2 == null) {
            lfn.b(5, "SFEquipmentItemConstants", "createEnchantmentAttribute() Could not find recipe to create attribute '" + ctd2.getAttributeName() + "'");
            return null;
        }
        es es2 = new es();
        es2.setType(ctd2.bnM);
        es2.m(ctd2.Pt);
        es2.a(ctx2.IngredientResourceTypes);
        if (ctx2 instanceof cty) {
            es2.bf(0);
        } else {
            es2.bf(((ctw)ctx2).Ps);
        }
        return es2;
    }

    public static cte[] c(int n, float f2, float f3) {
        if (n <= 0) {
            lfn.b(5, "SFEquipmentItemConstants", "createMonsterLoot() ResourceType is invalid.");
            return null;
        }
        ctq ctq2 = lea.eoJ().get(n);
        if (ctq2 == null) {
            lfn.b(5, "SFEquipmentItemConstants", "createMonsterLoot() No monsterinventoryinfo found for resource '" + lea.enW().getName(n) + "'");
            return null;
        }
        if (ctq2.fgc == null) {
            return null;
        }
        return ctf.a(ctq2.fgc, 0.0f, f2, ctf.bby() * f3);
    }

    public static cte[] a(int n, float f2, float f3, float f4) {
        if (n <= 0) {
            lfn.b(5, "SFEquipmentItemConstants", "createMonsterSkin() ResourceType is invalid.");
            return null;
        }
        ctq ctq2 = lea.eoJ().get(n);
        if (ctq2 == null) {
            lfn.b(5, "SFEquipmentItemConstants", "createMonsterSkin() No monsterinventoryinfo found for resource '" + lea.enW().getName(n) + "'");
            return null;
        }
        return ctf.a(ctq2.fgg, f2, f3, ctf.bby() * f4);
    }

    public static cte[] a(List list, float f2) {
        return ctf.a(list, f2, 1.0f, 1.0f);
    }

    public static cte[] a(List list, float f2, float f3) {
        return ctf.a(list, f2, 1.0f, f3);
    }

    public static cte[] a(List list, float f2, float f3, float f4) {
        assert (list != null);
        assert (f2 >= 0.0f);
        ArrayList<cte> arrayList = lcn.abH(5);
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            Object e2 = list.get(i);
            if (e2 instanceof cto) {
                cto cto2 = (cto)e2;
                float f5 = cto2.Probability;
                if (f2 > 0.0f) {
                    f5 = f2 * cto2.Probability;
                }
                if (!ctf.cS(f5 *= f3)) continue;
                ctf.a(cto2, arrayList, f4);
                continue;
            }
            if (e2 instanceof List) {
                ctf.a((List<cto>)((List)e2), arrayList, f3, f4);
                continue;
            }
            lfn.b(5, "SFEquipmentItemConstants", "createEquipmentItems() Unhandled object found: " + e2.getClass().getName());
        }
        cte[] cteArray = new cte[arrayList.size()];
        arrayList.toArray(cteArray);
        return cteArray;
    }

    public static void a(List<cto> list, List<cte> list2) {
        ctf.a(list, list2, 1.0f, 1.0f);
    }

    public static void a(List<cto> list, List<cte> list2, float f2, float f3) {
        assert (list != null);
        assert (list2 != null);
        float f4 = lgp.erA().nextFloat();
        float f5 = 0.0f;
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            cto cto2 = list.get(i);
            if (f5 + cto2.Probability > f4) {
                ctf.a(cto2, list2, f3);
                return;
            }
            f5 += cto2.Probability;
        }
    }

    public static void a(cto[] ctoArray, List<cte> list, float f2, float f3) {
        assert (ctoArray != null);
        assert (list != null);
        float f4 = lgp.erA().nextFloat();
        float f5 = 0.0f;
        for (cto cto2 : ctoArray) {
            if (f5 + cto2.Probability > f4) {
                ctf.a(cto2, list, f3);
                return;
            }
            f5 += cto2.Probability;
        }
    }

    public static void a(cto cto2, List<cte> list) {
        ctf.a(cto2, list, 1.0f);
    }

    public static void a(cto cto2, List<cte> list, float f2) {
        int n;
        int n2;
        assert (cto2 != null);
        assert (list != null);
        if (cto2.bcB != 0 && cto2.bcB != lcw.bcB) {
            return;
        }
        cte cte2 = new cte();
        cte2.ResourceType = cto2.ResourceType;
        if (cto2.asi > 0) {
            cte2.asi = cto2.asi;
        } else {
            assert (cto2.dpT > 0);
            assert (cto2.dpS >= 0);
            assert (cto2.dpT > cto2.dpS);
            int n3 = Math.round(lgp.erA().nextFloat() * (float)(cto2.dpT - cto2.dpS));
            cte2.asi = cto2.dpS + n3;
        }
        if (cte2.ResourceType == cug.fkb) {
            cte2.asi = (int)((float)cte2.asi * f2);
        }
        cte2.fex = false;
        list.add(cte2);
        ej[] ejArray = null;
        if (cto2.DR != null) {
            ejArray = new ej[cto2.DR.length];
            n2 = cto2.DR.length;
            for (int i = 0; i < n2; ++i) {
                ejArray[i] = cto2.DR[i].fm();
            }
        }
        es[] esArray = null;
        if (cto2.ffQ != null) {
            esArray = new es[cto2.ffQ.length];
            n = cto2.ffQ.length;
            for (n2 = 0; n2 < n; ++n2) {
                esArray[n2] = ctf.a(cto2.ffQ[n2]);
                if (esArray[n2] != null) continue;
                lfn.b(5, "SFEquipmentItemConstants", "createEquipmentItem() Could not create enchantment attribute for '" + cto2.pa() + "'");
                lfn.b(5, "SFEquipmentItemConstants", "createEquipmentItem() AttributeName='" + cto2.ffQ[n2].getAttributeName() + "'");
            }
        }
        if (ejArray != null && esArray != null) {
            ej[] ejArray2 = new ej[ejArray.length + esArray.length];
            for (ej ejArray2[n] : ejArray) {
            }
            n = ejArray.length;
            for (ej ejArray2[var8_12 + n] : esArray) {
            }
            cte2.DR = ejArray2;
        } else if (ejArray != null) {
            cte2.DR = ejArray;
        } else if (esArray != null) {
            cte2.DR = esArray;
        }
        cte2.fez = cto2.fez;
        if (cto2.fgf != null) {
            n = cto2.fgf.length;
            for (int i = 0; i < n; ++i) {
                ctf.a(cto2.fgf[i], list, f2);
            }
        }
    }

    private static boolean cS(float f2) {
        float f3 = lgp.erA().nextFloat();
        return f3 <= f2;
    }
}

