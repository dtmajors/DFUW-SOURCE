/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  bri
 *  cug
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class brh {
    private final bqk dFo;
    private static les ResourceTree = lea.enW();

    public brh(bqk bqk2) {
        this.dFo = bqk2;
    }

    public final bsa mm(int n) {
        if (n <= 0) {
            lfn.b(5, "SFInventoryQueryManager", "findAllResources() ResourceType is invalid.");
            return null;
        }
        bsa bsa2 = new bsa();
        bsa2.js(this.dFo.getGUID());
        bsa2.l(n);
        int n2 = 0;
        for (brs brs2 : this.dFo.aun().AN().values()) {
            assert (brs2.awo() != null);
            assert (brs2.awo().getGUID() != null);
            if (!(brs2.awo() instanceof bqs)) continue;
            bqs bqs2 = (bqs)brs2.awo();
            assert (bqs2.vf() > 0);
            if (bqs2.Uu() || !ResourceTree.isDescendant(bqs2.az(), bsa2.az()) || this.dFo.isServerObject() && !this.dFo.auo().iU(bqs2.getGUID())) continue;
            bsa2.e(bqs2.auS());
            n2 += bqs2.vf();
        }
        bsa2.do(n2);
        return bsa2;
    }

    public final boolean a(int n, int n2, bqy bqy2) {
        if (n <= 0) {
            lfn.b(5, "SFInventoryQueryManager", "findAndRemoveResource() ResourceType is invalid.");
            return false;
        }
        if (n2 <= 0) {
            lfn.b(5, "SFInventoryQueryManager", "findAndRemoveResource() Quantity is invalid.");
            return false;
        }
        bsa bsa2 = this.a(n, n2, bqm.c.dEV, false);
        if (bsa2 == null) {
            return false;
        }
        assert (bsa2.vf() >= n2);
        assert (bsa2.avX() != null);
        bri bri2 = (bri)this.dFo;
        brp[] brpArray = bsa2.avX();
        int n3 = brpArray.length;
        for (int i = 0; i < n3; ++i) {
            if (cug.vQ((int)bsa2.az())) {
                if (n2 > brpArray[i].asi) {
                    bri2.a(brpArray[i].GUID, brpArray[i].asi, bqy2);
                    n2 -= brpArray[i].asi;
                    continue;
                }
                bri2.a(brpArray[i].GUID, n2, bqy2);
                n2 -= n2;
                continue;
            }
            assert (brpArray[i].asi == 1);
            boolean bl2 = bri2.a(brpArray[i].GUID, bqy2);
            assert (bl2) : brpArray[i];
            n2 -= brpArray[i].asi;
        }
        assert (n2 == 0);
        return true;
    }

    public final bqs mn(int n) {
        assert (n > 0);
        for (brs brs2 : this.dFo.aun().AN().values()) {
            bqs bqs2;
            if (!(brs2.awo() instanceof bqs) || (bqs2 = (bqs)brs2.awo()).az() != n || bqs2.Uu() || this.dFo.auo() != null && !this.dFo.auo().iU(bqs2.getGUID())) continue;
            return bqs2;
        }
        return null;
    }

    public final bqs K(ldv ldv2, int n) {
        assert (ldv2 != null);
        assert (n > 0);
        brs brs2 = this.dFo.aun().iZ(ldv2);
        if (brs2 == null) {
            lfn.b(5, "SFInventoryQueryManager", "findInventoryItemInContainer() Could not find containeritem " + ldv2);
            return null;
        }
        if (brs2.Ba()) {
            for (brs brs3 : brs2.AY()) {
                bqs bqs2;
                if (!(brs3.awo() instanceof bqs) || (bqs2 = (bqs)brs3.awo()).az() != n || bqs2.Uu() && bqs2.auO() != cak.c.efF && bqs2.auO() != cak.c.efZ || this.dFo.auo() != null && !this.dFo.auo().iU(bqs2.getGUID())) continue;
                return bqs2;
            }
        }
        return null;
    }

    public final int g(cak.c c2) {
        brz brz2 = this.dFo.aun().awc();
        if (brz2 == null) {
            lfn.b(5, "SFInventoryQueryManager", "getAttachedItemResourceType() PaperdollContainer was not found in inventory " + this.dFo.getGUID());
            return -1;
        }
        assert (brz2.avT() != null);
        if (brz2.avT().Ba()) {
            List<brs> list = brz2.avT().AY();
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                brs brs2 = list.get(i);
                assert (brs2.awo() != null);
                assert (brs2.awo() instanceof bqs);
                bqs bqs2 = (bqs)brs2.awo();
                if (!bqs2.Uu() || bqs2.auO() != c2) continue;
                return bqs2.az();
            }
        }
        return -1;
    }

    public final int mo(int n) {
        if (n <= 0) {
            lfn.b(5, "SFInventoryQueryManager", "getResourceInstanceCount() ResourceType is invalid.");
            return 0;
        }
        int n2 = 0;
        for (brs brs2 : this.dFo.aun().AN().values()) {
            bqs bqs2;
            assert (brs2.awo() != null);
            assert (brs2.awo().getGUID() != null);
            if (!(brs2.awo() instanceof bqs) || (bqs2 = (bqs)brs2.awo()).az() != n) continue;
            ++n2;
        }
        return n2;
    }

    public final int jg(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFInventoryQueryManager", "getResourceCount() ItemGUID is null.");
            return 0;
        }
        bqs bqs2 = null;
        bqs2 = this.dFo instanceof bql ? ((bql)this.dFo).iK(ldv2) : ((bri)this.dFo).iK(ldv2);
        if (bqs2 == null) {
            lfn.b(5, "SFInventoryQueryManager", "getResourceCount() Could not find item " + ldv2);
            return 0;
        }
        return this.mo(bqs2.az());
    }

    public final int mp(int n) {
        if (n <= 0) {
            lfn.b(5, "SFInventoryQueryManager", "getResourceCount() ResourceType is invalid.");
            return 0;
        }
        return this.o(n, false);
    }

    public final int o(int n, boolean bl2) {
        if (n <= 0) {
            lfn.b(5, "SFInventoryQueryManager", "getResourceQuantityCount() ResourceType is invalid.");
            return 0;
        }
        int n2 = 0;
        for (brs brs2 : this.dFo.aun().AN().values()) {
            assert (brs2.awo() != null);
            assert (brs2.awo().getGUID() != null);
            if (!(brs2.awo() instanceof bqs)) continue;
            bqs bqs2 = (bqs)brs2.awo();
            assert (bqs2.vf() > 0);
            if (bl2) {
                if (!ResourceTree.isDescendant(bqs2.az(), n)) continue;
                n2 += bqs2.vf();
                continue;
            }
            if (bqs2.az() != n) continue;
            n2 += bqs2.vf();
        }
        return n2;
    }

    public final int avN() {
        int n = 0;
        for (brs brs2 : this.dFo.aun().AN().values()) {
            assert (brs2.awo() != null);
            assert (brs2.awo().getGUID() != null);
            if (!(brs2.awo() instanceof bqs)) continue;
            bqs bqs2 = (bqs)brs2.awo();
            assert (bqs2.vf() > 0);
            n += bqs2.vf();
        }
        return n;
    }

    public final bsa[] a(ctm[] ctmArray, bqm.c c2, boolean bl2) {
        if (ctmArray == null || ctmArray.length == 0) {
            lfn.b(5, "SFInventoryQueryManager", "performIngredientQueries() Ingredients array is null or empty.");
            return null;
        }
        if (c2 == null) {
            lfn.b(5, "SFInventoryQueryManager", "performIngredientQueries() ItemStateType is null.");
            return null;
        }
        bsa[] bsaArray = new bsa[ctmArray.length];
        ArrayList<ldv> arrayList = lcn.emv();
        boolean bl3 = false;
        int n = ctmArray.length;
        for (int i = 0; i < n; ++i) {
            bsaArray[i] = this.a(ctmArray[i].ResourceType, ctmArray[i].asi, c2, arrayList);
            if (bsaArray[i] == null) {
                bl3 = true;
                continue;
            }
            brp[] brpArray = bsaArray[i].avX();
            int n2 = brpArray.length;
            for (int j = 0; j < n2; ++j) {
                arrayList.add(brpArray[j].GUID);
            }
        }
        if (bl2) {
            if (bl3) {
                lfn.b(5, "SFInventoryQueryManager", "performIngredientQueries() Items can't be locked because one or more queries failed.");
            } else if (!this.a(bsaArray)) {
                lfn.b(5, "SFInventoryQueryManager", "performIngredientQueries() Failed to lock all items.");
            }
        }
        return bsaArray;
    }

    public final bsa[] a(int[] nArray, int[] nArray2, bqm.c c2, boolean bl2) {
        if (nArray == null || nArray.length == 0) {
            lfn.b(5, "SFInventoryQueryManager", "performResourceQueries() ResourceTypes array is null or empty.");
            return null;
        }
        if (nArray2 == null || nArray2.length == 0) {
            lfn.b(5, "SFInventoryQueryManager", "performResourceQueries() Quantities array is null or empty.");
            return null;
        }
        if (nArray.length != nArray2.length) {
            lfn.b(5, "SFInventoryQueryManager", "performResourceQueries() ResourceTypes array and Quantities array have different length.");
            return null;
        }
        if (c2 == null) {
            lfn.b(5, "SFInventoryQueryManager", "performResourceQueries() ItemStateType is null.");
            return null;
        }
        bsa[] bsaArray = new bsa[nArray.length];
        ArrayList<ldv> arrayList = lcn.emv();
        boolean bl3 = false;
        int n = nArray.length;
        for (int i = 0; i < n; ++i) {
            bsaArray[i] = this.a(nArray[i], nArray2[i], c2, arrayList);
            if (bsaArray[i] == null) {
                bl3 = true;
                continue;
            }
            brp[] brpArray = bsaArray[i].avX();
            for (int j = 0; j < brpArray.length; ++j) {
                arrayList.add(brpArray[j].GUID);
            }
        }
        if (bl2 && !bl3 && !this.a(bsaArray)) {
            lfn.b(5, "SFInventoryQueryManager", "performResourceQueries() Failed to lock all items.");
        }
        return bsaArray;
    }

    public final bsa a(int n, int n2, bqm.c c2, boolean bl2) {
        if (n <= 0) {
            lfn.b(5, "SFInventoryQueryManager", "performResourceQuery() ResourceType is invalid.");
            return null;
        }
        if (n2 <= 0) {
            lfn.b(5, "SFInventoryQueryManager", "performResourceQuery() Quantity is invalid.");
            return null;
        }
        if (c2 == null) {
            lfn.b(5, "SFInventoryQueryManager", "performResourceQuery() ItemStateType is null.");
            return null;
        }
        ArrayList<ldv> arrayList = lcn.abH(0);
        bsa bsa2 = this.a(n, n2, c2, arrayList);
        if (bsa2 == null) {
            return null;
        }
        if (bl2 && !this.c(bsa2)) {
            lfn.b(5, "SFInventoryQueryManager", "performResourceQuery() Failed to lock all items.");
            this.a(bsa2);
        }
        return bsa2;
    }

    public final boolean x(Map<Integer, Integer> map) {
        if (!(this.dFo instanceof bri)) {
            return false;
        }
        if (this.dFo.aun().AN().isEmpty()) {
            return true;
        }
        bri bri2 = (bri)this.dFo;
        Integer n = null;
        Integer n2 = null;
        int n3 = -1;
        Map<Integer, Integer> map2 = lcn.emw();
        ArrayList<Integer> arrayList = lcn.emv();
        for (brs object : this.dFo.aun().AN().values()) {
            if (object == null || object.awo() == null || object.awo().getGUID() == null) {
                assert (false) : "ItemNode is NULL";
                continue;
            }
            if (!(object.awo() instanceof bqs)) continue;
            bqs bqs2 = (bqs)object.awo();
            int n4 = bqs2.vf();
            if (n4 <= 0) {
                assert (false) : "Quantity for " + bqs2.getDisplayName() + " is " + n4;
                continue;
            }
            if (!ResourceTree.isDescendant(bqs2.az(), cug.fks) || arrayList.contains(bqs2.az())) continue;
            n = bqs2.az();
            n2 = map.get(n);
            n3 = bri2.aup().mp(n);
            if (n3 <= 0) {
                assert (false) : "Quantity for " + bqs2.getDisplayName() + " is " + n3;
                continue;
            }
            arrayList.add(bqs2.az());
            if (n2 == null) {
                lfn.b(5, "SFInventoryQueryManager", "removeInvalidQuestItems() Quest Item " + n + " Is Invalid.Adding for removal " + bqs2.getGUID());
                map2.put(n, n3);
                continue;
            }
            if (n3 <= n2) continue;
            map2.put(n, n3 - n2);
        }
        for (Map.Entry entry : map2.entrySet()) {
            lfn.b(5, "SFInventoryQueryManager", "removeInvalidQuestItems() Removing item " + entry);
            boolean bl2 = this.a((Integer)entry.getKey(), (Integer)entry.getValue(), bqy.dHI);
            assert (bl2);
        }
        return true;
    }

    private boolean a(bsa[] bsaArray) {
        assert (bsaArray != null);
        assert (bsaArray.length > 0);
        int n = bsaArray.length;
        for (int i = 0; i < n; ++i) {
            if (this.c(bsaArray[i])) continue;
            lfn.b(5, "SFInventoryQueryManager", "lockItems() Could not lock all items in the resourcequeryinfo.");
            lfn.b(5, "SFInventoryQueryManager", "lockItems() " + bsaArray[i]);
            int n2 = bsaArray.length;
            for (int j = 0; j < n2; ++j) {
                this.a(bsaArray[j]);
            }
            return false;
        }
        return true;
    }

    private boolean c(bsa bsa2) {
        assert (bsa2 != null);
        assert (bsa2.avX() != null);
        assert (bsa2.avX().length > 0);
        brp[] brpArray = bsa2.avX();
        int n = brpArray.length;
        for (int i = 0; i < n; ++i) {
            lef lef2 = this.dFo.auo().iX(brpArray[i].GUID);
            if (lef2 == null) {
                lfn.b(5, "SFInventoryQueryManager", "lockItemsInQueryInfo() Item " + brpArray[i].GUID + " could not be locked.");
                return false;
            }
            bsa2.a(lef2);
        }
        return true;
    }

    private bsa a(int n, int n2, bqm.c c2, List<ldv> list) {
        assert (n > 0);
        assert (n2 > 0);
        assert (c2 != null);
        assert (list != null);
        bsa bsa2 = new bsa();
        bsa2.js(this.dFo.getGUID());
        bsa2.l(n);
        bsa2.do(n2);
        int n3 = 0;
        for (brs brs2 : this.dFo.aun().AN().values()) {
            assert (brs2.awo() != null);
            assert (brs2.awo().getGUID() != null);
            if (!(brs2.awo() instanceof bqs)) continue;
            bqs bqs2 = (bqs)brs2.awo();
            assert (bqs2.vf() > 0);
            boolean bl2 = false;
            switch (c2) {
                case dEU: {
                    bl2 = !bqs2.Uu() || !bqs2.AT();
                    break;
                }
                case dEV: {
                    bl2 = bqs2.Uu();
                    break;
                }
                case dEW: {
                    bl2 = bqs2.AT();
                    break;
                }
                default: {
                    lfn.b(5, "SFInventoryQueryManager", "performQuery() Unhandled itemstatetype provided: '" + c2.name() + "'");
                    bl2 = true;
                }
            }
            if (bl2 || list.contains(bqs2.getGUID()) || !ResourceTree.isDescendant(bqs2.az(), bsa2.az()) || this.dFo.isServerObject() && !this.dFo.auo().iU(bqs2.getGUID())) continue;
            bsa2.e(bqs2.auS());
            if ((n3 += bqs2.vf()) < bsa2.vf()) continue;
            return bsa2;
        }
        return null;
    }

    private void a(bsa bsa2) {
        assert (bsa2 != null);
        assert (bsa2.avX() != null);
        assert (bsa2.avX().length > 0);
        if (bsa2.awJ() == null || bsa2.awJ().length == 0) {
            lfn.b(5, "SFInventoryQueryManager", "releaseItemLocks() ItemLockIDs array is null or empty.");
            return;
        }
        brp[] brpArray = bsa2.avX();
        lef[] lefArray = bsa2.awJ();
        int n = brpArray.length;
        for (int i = 0; i < n; ++i) {
            this.dFo.auo().a(brpArray[i].GUID, lefArray[i]);
        }
    }
}

