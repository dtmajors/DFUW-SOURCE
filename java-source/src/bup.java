/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class bup
extends btk {
    private Map<ldv, buo> dOF = lcn.emw();
    private bui dNL = null;
    private bun dMS = null;
    private btv dNU = null;
    private Map<btp, ldv> dOG = lcn.emw();

    public void a(bui bui2) {
        this.dNL = bui2;
    }

    public void a(bun bun2) {
        this.dMS = bun2;
    }

    public btv ayz() {
        return this.dNU;
    }

    public void a(btv btv2) {
        this.dNU = btv2;
    }

    public void a(ldv ldv2, uk[] ukArray) {
        if (ldv2 == null) {
            lfn.b(5, "SFTitleCollectionManager", "createTitleCollection() CollectionGUID is null.");
            return;
        }
        if (ukArray == null) {
            lfn.b(5, "SFTitleCollectionManager", "createTitleCollection() PropertyUpdates array is null.");
            return;
        }
        buo buo2 = this.dOF.get(ldv2);
        if (buo2 != null) {
            lfn.b(5, "SFTitleCollectionManager", "createTitleCollection() TitleCollection " + ldv2 + " already exists.");
            return;
        }
        buo2 = new buo();
        buo2.GUID = ldv2;
        buo2.Rr = buo2.GUID.bFk();
        buo2.a(ukArray);
        this.dOF.put(buo2.GUID, buo2);
        if (this.dNL != null) {
            this.dNL.b(buo2);
        }
        block4: for (uk uk2 : ukArray) {
            if (!(uk2 instanceof uo)) continue;
            uo uo2 = (uo)uk2;
            switch (uo2.Uo) {
                case 1: {
                    if (this.dOG.isEmpty()) continue block4;
                    for (Map.Entry<btp, ldv> entry : this.dOG.entrySet()) {
                        if (!entry.getValue().equals(buo2.GUID)) continue;
                        entry.getKey().axE();
                    }
                    continue block4;
                }
                case 2: {
                    if (this.dOG.isEmpty()) continue block4;
                    for (Map.Entry<btp, ldv> entry : this.dOG.entrySet()) {
                        if (!entry.getValue().equals(buo2.GUID)) continue;
                        entry.getKey().axE();
                    }
                    continue block4;
                }
            }
        }
    }

    public buo jU(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFTitleCollectionManager", "getTitleCollection() ObjectGUID is null.");
            return null;
        }
        for (buo buo2 : this.dOF.values()) {
            if (!buo2.Rr.tV(ldv2)) continue;
            return buo2;
        }
        lfn.b(5, "SFTitleCollectionManager", "getTitleCollection() Could not find titlecollection for objectGUID " + ldv2);
        return null;
    }

    public buo u(String string, String string2) {
        if (string == null || string.isEmpty() || string2 == null || string2.isEmpty()) {
            lfn.b(5, "SFTitleCollectionManager", "both first and last name must have values");
            return null;
        }
        for (buo buo2 : this.dOF.values()) {
            if (!buo2.FirstName.equals(string) || !buo2.LastName.equals(string2)) continue;
            return buo2;
        }
        lfn.b(5, "SFTitleCollectionManager", "getTitleCollection() Could not find titlecollection for firstName:" + string + " lastName:" + string2);
        return null;
    }

    public void jV(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFTitleCollectionManager", "removeTitleCollection() CollectionGUID is null.");
            return;
        }
        buo buo2 = this.dOF.remove(ldv2);
        if (buo2 == null) {
            lfn.b(5, "SFTitleCollectionManager", "removeTitleCollection() TitleCollection " + ldv2 + " was not found.");
            return;
        }
        if (this.dNL != null) {
            this.dNL.c(buo2);
        }
    }

    public void b(ldv ldv2, uk[] ukArray) {
        if (ldv2 == null) {
            lfn.b(5, "SFTitleCollectionManager", "updateTitleCollection() CollectionGUID is null.");
            return;
        }
        if (ukArray == null) {
            lfn.b(5, "SFTitleCollectionManager", "updateTitleCollection() PropertyUpdates array is null.");
            return;
        }
        buo buo2 = this.dOF.get(ldv2);
        if (buo2 == null) {
            lfn.b(5, "SFTitleCollectionManager", "updateTitleCollection() TitleCollection " + ldv2 + " was not found.");
            return;
        }
        buo2.a(ukArray);
        if (this.dNL != null) {
            this.dNL.d(buo2);
        }
        if (this.dMS != null) {
            this.dMS.d(buo2);
        }
        if (buo2.Rr.tV(this.dMS.ayp())) {
            // empty if block
        }
        block4: for (uk uk2 : ukArray) {
            if (!(uk2 instanceof uo)) continue;
            uo uo2 = (uo)uk2;
            switch (uo2.Uo) {
                case 1: {
                    if (this.dOG.isEmpty()) continue block4;
                    for (Map.Entry<btp, ldv> entry : this.dOG.entrySet()) {
                        if (!entry.getValue().tV(buo2.GUID)) continue;
                        entry.getKey().axE();
                    }
                    continue block4;
                }
                case 2: {
                    if (this.dOG.isEmpty()) continue block4;
                    for (Map.Entry<btp, ldv> entry : this.dOG.entrySet()) {
                        if (!entry.getValue().tV(buo2.GUID)) continue;
                        entry.getKey().axE();
                    }
                    continue block4;
                }
            }
        }
    }

    public void a(ldv ldv2, btp btp2) {
        this.dOG.put(btp2, ldv2);
        if (this.dOF.containsKey(ldv2)) {
            btp2.axE();
        }
    }

    public void a(btp btp2) {
        this.dOG.remove(btp2);
    }
}

