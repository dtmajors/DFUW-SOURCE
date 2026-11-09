/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  cbx
 *  cug
 *  ep
 *  ha
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class gy {
    public static final cxf Yw = new cxf(true);
    private static cuh Yx = new cuh(true);
    public static les ResourceTree = lea.enW();
    private static ej[] Yy = new ej[0];
    private static List<ej> Yz = lcn.emv();
    public static final long YA = 0L;
    public static final long YB = 1L;
    public static final long YC = 2L;
    public static final long YD = 3L;
    public static final long YE = 3L;

    public static final void a(btk btk2, bqk bqk2, List<nb> list) {
        LinkedList<brs> linkedList = lcn.emA();
        Map<ldv, bsf> map = bqk2.aun().avV();
        brs brs2 = bqk2.aun().awe();
        linkedList.add(brs2);
        while (!linkedList.isEmpty()) {
            brm brm2;
            brs2 = (brs)linkedList.pollFirst();
            List<brs> list2 = brs2.AY();
            if (list2 != null && !list2.isEmpty()) {
                linkedList.addAll(list2);
            }
            if ((brm2 = brs2.awo()) instanceof bqs) {
                bqs bqs2 = (bqs)brm2;
                nb nb2 = new nb();
                nb2.aCK = bqs2.getGUID();
                nb2.aCE = btk2.getGUID();
                nb2.aCH = bqk2.alX().ordinal();
                nb2.aCF = bqs2.AQ();
                nb2.aCG = brs2.awn() == null ? 0L : gy.a(brs2.awn());
                nb2.aCI = bqs2.pa();
                nb2.asi = bqs2.vf();
                nb2.aCJ = bqs2.AR();
                nb2.DR = gy.a(btk2.getMessageDelegator(), bqs2.getGUID());
                list.add(nb2);
                continue;
            }
            if (brm2 instanceof bpy) continue;
            lfn.b(5, "SFPersistenceHelperFunctions", "getAllSpawnableInventoryItems: Unsupported Item class " + brm2.getClass().getName());
        }
    }

    public static void b(ha ha2) {
        cte[] cteArray = null;
        if (ha2.jT() != null) {
            switch (ha2.jT()) {
                case aaP: 
                case aaA: 
                case aaB: 
                case aaC: 
                case aaD: 
                case aaE: 
                case aaF: 
                case aaG: 
                case aaH: 
                case aaI: 
                case aaJ: 
                case aaK: 
                case aaL: 
                case aaM: 
                case aaN: 
                case aaO: {
                    break;
                }
            }
            cteArray = lea.eoC().get("new_char");
        } else {
            cteArray = lea.eoC().get("new_char");
        }
        if (cteArray == null || cteArray.length <= 0) {
            lfn.b(5, "SFPersistenceHelperFunctions", "createDefaultInventory: Could not find starting equipment. EquipmentMap new_char is null or empty.");
            return;
        }
        hu hu2 = ha2.jf().aJP();
        hu2.a(cteArray, bqy.dFX);
    }

    private static long a(brs brs2) {
        if (brs2.awo() instanceof bqs) {
            return ((bqs)brs2.awo()).AQ();
        }
        if (brs2.awo() instanceof brz) {
            return 2L;
        }
        if (brs2.awo() instanceof bqe) {
            return 3L;
        }
        if (brs2.awo() instanceof bsb) {
            return 1L;
        }
        if (brs2.awo() instanceof bqd) {
            return 1L;
        }
        lfn.b(5, "SFPersistenceHelperFunctions", "getPersistentItemID: Unhandled class " + brs2.awo().getClass().getName());
        assert (false);
        return 1L;
    }

    public static final ej[] a(dxr dxr2, ldv ldv2) {
        if (ldv2.ib() != dxr2.getGUID().ib()) {
            return null;
        }
        amf amf2 = dxr2.bzx().bzt().d(ldv2);
        if (amf2 == null) {
            lfn.b(5, "SFPersistenceHelperFunctions", "getAttributesForItem: Object " + ldv2 + " does not exist");
            assert (false);
            return Yy;
        }
        if (!(amf2 instanceof cbx)) {
            lfn.b(5, "SFPersistenceHelperFunctions", "getAttributesForItem: Object " + ldv2 + " is not a SFPhysicalObject: " + amf2.getClass().getName());
            assert (false);
            return Yy;
        }
        cbx cbx2 = null;
        int n = ((cbx)amf2).az();
        if (n > 0) {
            cbx2 = cuh.fxD.wL(n);
        }
        Map<Integer, ej> map = ((cbx)amf2).fi().getAttributeMap();
        Yz.clear();
        ej[] ejArray = map.values().iterator();
        block3: while (ejArray.hasNext()) {
            ej ej2;
            ej ej3 = ej2 = ejArray.next();
            if (cbx2 != null) {
                ej ej4 = cbx2.jm().ae(ej2.getType());
                if (ej4 != null && ej4.equals(ej2)) continue;
                if (ep.bd((int)ej2.getType()) && ej4 != null) {
                    float f2 = ((et)ej4).fN();
                    float f3 = ((et)ej2).fN();
                    float f4 = (f3 - f2) / f2;
                    if (f2 == 0.0f) {
                        f4 = 0.0f;
                        lfn.b(5, "SFPersistenceHelperFunctions", "getAttributesForItem() TemplateValue is 0 for Resource=" + lea.enW().getName(n) + " Attribute= " + ej4.getName());
                    }
                    ej3 = ej2.fm();
                    ej3.setValue(Float.valueOf(f4));
                }
            }
            switch (ej2.getType()) {
                case 704: 
                case 1328: 
                case 1568: {
                    continue block3;
                }
            }
            Yz.add(ej3);
        }
        if (Yz.isEmpty()) {
            return Yy;
        }
        ejArray = Yz.toArray(new ej[Yz.size()]);
        Yz.clear();
        return ejArray;
    }

    public static void a(dxr dxr2, bqk bqk2, List<nb> list) {
        if (list == null || list.size() == 0) {
            if (bqk2.auk() == null) {
                lfn.b(5, "SFPersistenceHelperFunctions", "restoreInventoryItems: No items in persistence for inventory " + bqk2.getGUID());
            } else {
                lfn.b(5, "SFPersistenceHelperFunctions", "restoreInventoryItems: No items in persistence for inventory " + bqk2.getGUID() + " owner " + bqk2.auk().getGUID());
            }
            return;
        }
        Map<Long, nb> map = lcn.emw();
        Map<Long, brs> map2 = lcn.emw();
        for (nb nb2 : list) {
            if (nb2.aCH != bqk2.alX().ordinal()) continue;
            map.put(nb2.aCF, nb2);
        }
        while (!map.isEmpty()) {
            long l = (Long)map.keySet().iterator().next();
            gy.a(dxr2, bqk2, l, map, map2);
        }
    }

    private static void a(dxr dxr2, bqk bqk2, long l, Map<Long, nb> map, Map<Long, brs> map2) {
        Object object;
        ej[] ejArray;
        int n;
        nb nb2 = map.remove(l);
        if (nb2 == null) {
            lfn.b(5, "SFPersistenceHelperFunctions", "restoreInventoryItem: Couldn't find item with ID " + l + " in PendingItems - this shouldn't happen");
            assert (false);
            return;
        }
        brs brs2 = null;
        if (nb2.aCG > 3L) {
            brs2 = map2.get(nb2.aCG);
            if (brs2 == null) {
                gy.a(dxr2, bqk2, nb2.aCG, map, map2);
                brs2 = map2.get(nb2.aCG);
            }
        } else if (nb2.aCG == 1L) {
            brs2 = bqk2.aun().awe();
        } else if (nb2.aCG == 2L) {
            brs2 = bqk2.aun().awd();
        } else if (nb2.aCG == 3L) {
            brs2 = bqk2.aun().awb();
        }
        if (brs2 == null) {
            lfn.b(5, "SFPersistenceHelperFunctions", "restoreInventoryItem: Couldn't find parent node " + nb2.aCG + " for item " + nb2 + " - Adding to root container");
            nb2.aCG = 1L;
            brs2 = bqk2.aun().awe();
        }
        if ((n = ResourceTree.getType(nb2.aCI)) == -1) {
            lfn.b(5, "SFPersistenceHelperFunctions", "restoreInventoryItem: Resource type '" + nb2.aCI + "' not found, discarding item");
            assert (false);
            return;
        }
        lgw lgw2 = (lgw)ResourceTree.acv(n);
        if (lgw2 == null) {
            lfn.b(5, "SFPersistenceHelperFunctions", "restoreInventoryItem: Resource '" + nb2.aCI + "' (" + n + ") not found, discarding item");
            assert (false);
            return;
        }
        bqs bqs2 = new bqs();
        bqs2.fc(nb2.aCJ);
        bqs2.do(nb2.asi);
        bqs2.l(n);
        bqs2.aN(true);
        bqs2.setGUID(dxr2.bzv());
        bqs2.O(nb2.aCF);
        bqs2.b(lgw2.auO());
        cbx cbx2 = Yx.B(bqs2.az(), true);
        cbx2.setGUID(bqs2.getGUID());
        if (!cug.vF((int)lgw2.getType()) && (ejArray = nb2.DR) != null && ejArray.length > 0) {
            object = cbx2.fi().getAttributeMap();
            for (ej ej2 : ejArray) {
                ej ej3 = (ej)object.get(ej2.getType());
                if (ej3 == null) {
                    ej2.a((el)null);
                    if (ep.bd((int)ej2.getType())) assert (false);
                    cbx2.fi().b(ej2);
                } else {
                    if (ep.bd((int)ej2.getType())) {
                        float f2 = ((et)ej2).fN();
                        if (f2 > 1.0f || f2 < -1.0f) {
                            lfn.b(5, "SFPersistenceHelperFunctions", "restoreInventoryItem() Attribute Percentage out of range(>200%), PLEASE CHECK ItemID = " + nb2.aCF + " Attribute=" + ej2.getName() + " Percentage=" + f2);
                        }
                        float f3 = ((et)ej3).fN();
                        if (Float.isNaN(f2)) {
                            f2 = 0.0f;
                        }
                        ej2.setValue(Float.valueOf(f3 * (1.0f + f2)));
                    }
                    ej3.setValue(ej2.getValue());
                }
                if (ej2.getType() != 13216) continue;
                bqs2.ap(13216, ((ew)ej2).fQ());
            }
        }
        if (bqs2.vf() > 1) {
            cbx2.do(bqs2.vf());
            cbx2.aIt();
        }
        dxr2.a((amf)cbx2);
        boolean bl = bqk2.a((brm)bqs2, brs2);
        if (!bl) {
            lfn.b(5, "SFPersistenceHelperFunctions", "restoreInventoryItem: addItemForVerification for " + bqs2 + " failed");
        }
        object = bqs2.avT();
        map2.put(nb2.aCF, (brs)object);
    }
}

