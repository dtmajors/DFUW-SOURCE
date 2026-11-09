/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.List;
import java.util.Map;

public class cul {
    private static les ResourceTree = lea.enW();

    public boolean b(lgw lgw2) {
        if (!lea.enW().isDescendant(lgw2.getType(), cug.fkd)) {
            return false;
        }
        if (!lgw2.erK()) {
            return false;
        }
        if (ResourceTree.isDescendant(lgw2.getType(), cug.fmT)) {
            return true;
        }
        if (ResourceTree.isDescendant(lgw2.getType(), cug.fjl)) {
            return this.c(lgw2);
        }
        if (ResourceTree.isDescendant(lgw2.getType(), cug.fjN)) {
            return this.c(lgw2);
        }
        if (ResourceTree.isDescendant(lgw2.getType(), cug.fnn)) {
            return true;
        }
        if (ResourceTree.isDescendant(lgw2.getType(), cug.fiD)) {
            return true;
        }
        if (ResourceTree.isDescendant(lgw2.getType(), cug.fiE)) {
            return true;
        }
        if (lgw2.auO() == cak.c.efE) {
            return true;
        }
        return !lgw2.bBt().equalsIgnoreCase("NULL");
    }

    public void a(String string, List<cte> list) {
        this.a(string, 0, list);
    }

    public void a(String string, int n, List<cte> list) {
        if (string == null || string.trim().equals("")) {
            lfn.b(5, "SFResourceTypeChecker", "checkPartialName() PartialName is invalid.");
            return;
        }
        if (n < 0) {
            lfn.b(5, "SFResourceTypeChecker", "checkPartialName() Quantity is invalid.");
            return;
        }
        if (list == null) {
            lfn.b(5, "SFResourceTypeChecker", "checkPartialName() EquipmentItems is null.");
            return;
        }
        ler ler2 = ResourceTree.eqq();
        if (ler2 == null) {
            lfn.b(5, "SFResourceTypeChecker", "checkPartialName() RootNode is null.");
            return;
        }
        this.a(ler2, string.toLowerCase(), n, list);
    }

    public void a(lgw lgw2, List<cte> list, int n, boolean bl, int n2) {
        assert (lgw2 != null);
        assert (list != null);
        assert (n >= 0);
        assert (n2 >= 0);
        lgw lgw3 = (lgw)ResourceTree.g(lgw2);
        while (lgw3 != null) {
            if (this.b(lgw3)) {
                cte cte2 = new cte();
                cte2.ResourceType = lgw3.getType();
                cte2.fex = bl;
                if (n > 0 && lgw3.auW()) {
                    cte2.asi = n;
                }
                if (!cte2.fex) {
                    cte2.fey = n2;
                }
                list.add(cte2);
                if (n > 0 && !lgw2.auW()) {
                    for (int i = 1; i < n; ++i) {
                        list.add(cte2.bbx());
                    }
                }
            }
            this.a(lgw3, list, n, bl, n2);
            lgw3 = (lgw)ResourceTree.h(lgw3);
        }
    }

    public void a(int n, int n2, boolean bl, List<cte> list) {
        this.a(n, n2, bl, 0, list);
    }

    public void a(int n, int n2, boolean bl, int n3, List<cte> list) {
        if (n <= 0) {
            lfn.b(5, "SFResourceTypeChecker", "checkResourceType() ResourceType is invalid.");
            return;
        }
        if (n2 < 0) {
            lfn.b(5, "SFResourceTypeChecker", "checkResourceType() Quantity is invalid.");
            return;
        }
        if (list == null) {
            lfn.b(5, "SFResourceTypeChecker", "checkResourceType() EquipmentItems list is null.");
            return;
        }
        boolean bl2 = false;
        bl2 = ResourceTree.isDescendant(n, cug.fkd);
        lgw lgw2 = (lgw)ResourceTree.acv(n);
        cte cte2 = null;
        if (bl2) {
            if (this.b(lgw2)) {
                cte2 = new cte();
                cte2.ResourceType = n;
                cte2.fex = bl;
                if (n2 > 0 && lgw2.auW()) {
                    cte2.asi = n2;
                }
                if (!cte2.fex) {
                    cte2.fey = n3;
                }
                list.add(cte2);
                if (n2 > 0 && !lgw2.auW()) {
                    for (int i = 1; i < n2; ++i) {
                        list.add(cte2.bbx());
                    }
                }
            }
            if (ResourceTree.g(lgw2) != null) {
                this.a(lgw2, list, n2, bl, n3);
            }
        } else {
            cte2 = new cte();
            cte2.ResourceType = n;
            cte2.fex = bl;
            if (n2 > 0 && lgw2.auW()) {
                cte2.asi = n2;
            }
            if (!cte2.fex) {
                cte2.fey = n3;
            }
            list.add(cte2);
            if (n2 > 0 && !lgw2.auW()) {
                for (int i = 1; i < n2; ++i) {
                    list.add(cte2.bbx());
                }
            }
        }
    }

    private void a(ler ler2, String string, int n, List<cte> list) {
        lgw lgw2 = (lgw)ResourceTree.g(ler2);
        while (lgw2 != null) {
            if (lgw2.getName().toLowerCase().indexOf(string) >= 0) {
                this.a(lgw2.getType(), n, false, list);
            }
            this.a(lgw2, string, n, list);
            lgw2 = (lgw)ResourceTree.h(lgw2);
        }
    }

    private boolean c(lgw lgw2) {
        Map<can, cam> map = lea.ack(cug.fhT);
        return map.containsKey(new can(lgw2.getType()));
    }
}

