/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ig {
    private final Map<ldv, Map<ldv, aht>> afo;
    private final Map<ldv, Map<ldv, ahl>> afp;
    private Map<ldv, List<ldv>> afq = lcn.emw();
    private Map<ldv, List<ldv>> afr = lcn.emw();

    public ig() {
        this.afo = lcn.emw();
        this.afp = lcn.emw();
    }

    public final Map<ldv, Map<ldv, aht>> nd() {
        return this.afo;
    }

    public final void bb(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFStateObjectManager", "dumpStateObjectState() ObjectGUID is null.");
            return;
        }
        aht aht2 = this.bd(ldv2);
        if (aht2 == null) {
            lfn.b(5, "SFStateObjectManager", "dumpStateObjectState() Could not find stateobject " + ldv2);
            return;
        }
        lfn.b(3, "SFStateObjectManager", "dumpStateObjectState() #####################################");
        lfn.b(3, "SFStateObjectManager", "dumpStateObjectState()           STATEOBJECT STATE          ");
        lfn.b(3, "SFStateObjectManager", "dumpStateObjectState() #####################################");
        aht2.gt();
        lfn.b(3, "SFStateObjectManager", "dumpStateObjectState() ");
        lfn.b(3, "SFStateObjectManager", "dumpStateObjectState() ########    DUMP FINISHED    ########");
    }

    public final void ne() {
        lfn.b(3, "SFStateObjectManager", "dumpStateObjectsWithSuppressedPropertyIDs() #######################################");
        lfn.b(3, "SFStateObjectManager", "dumpStateObjectsWithSuppressedPropertyIDs()      SUPPRESSED UPDATE PROPERTYIDS     ");
        lfn.b(3, "SFStateObjectManager", "dumpStateObjectsWithSuppressedPropertyIDs() #######################################");
        Iterator<Map<ldv, aht>> iterator = this.afo.values().iterator();
        while (iterator.hasNext()) {
            this.a(a.aft, iterator.next());
        }
        lfn.b(3, "SFStateObjectManager", "dumpStateObjectsWithSuppressedPropertyIDs() ########    DUMP FINISHED    ########");
    }

    private void a(a a2, Map<ldv, aht> map) {
        assert (a2 != null);
        assert (map != null);
        switch (a2) {
            case aft: {
                for (aht aht2 : map.values()) {
                    if (aht2.BB() == null) continue;
                    lfn.b(1, "", "  Suppressed update propertyIDs for " + aht2.getGUID() + " of type " + (Object)((Object)aht2.Bx()));
                    int n = 0;
                    for (int n2 : aht2.BB()) {
                        lfn.b(0, "", "(" + n + ") " + aht2.eB(n2) + " PropertyID=" + n2);
                        ++n;
                    }
                }
                break;
            }
            default: {
                lfn.b(5, "SFStateObjectManager", "dump() Invalid dumptype provided: " + (Object)((Object)a2));
                return;
            }
        }
    }

    public final boolean a(aht aht2) {
        if (aht2 == null) {
            lfn.b(5, "SFStateObjectManager", "addStateObject() StateObject is null.");
            return false;
        }
        assert (!(aht2 instanceof ahl));
        ldv ldv2 = aht2.getGUID().bFk();
        Map<ldv, aht> map = this.afo.get(ldv2);
        if (map == null) {
            map = lcn.emw();
            this.afo.put(ldv2, map);
        } else if (map.containsKey(aht2.getGUID())) {
            lfn.b(5, "SFStateObjectManager", "addStateObject() StateObject " + aht2.getGUID() + " already exists.");
            return false;
        }
        map.put(aht2.getGUID(), aht2);
        return true;
    }

    public final boolean bc(ldv ldv2) {
        return this.bd(ldv2) != null;
    }

    public final aht bd(ldv ldv2) {
        Map<ldv, aht> map = this.be(ldv2);
        if (map == null) {
            return null;
        }
        return map.get(ldv2);
    }

    public final Map<ldv, aht> be(ldv ldv2) {
        if (ldv2.enx() == 0) {
            return this.afo.get(ldv2);
        }
        return this.afo.get(ldv2.bFk());
    }

    public final aht bf(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFStateObjectManager", "removeStateObject() ObjectGUID is null.");
            return null;
        }
        ldv ldv3 = ldv2.bFk();
        Map<ldv, aht> map = this.afo.get(ldv3);
        if (map == null) {
            lfn.b(5, "SFStateObjectManager", "removeStateObject() Could not find stateobjectmap for " + ldv2);
            return null;
        }
        aht aht2 = map.remove(ldv2);
        if (aht2 == null) {
            lfn.b(5, "SFStateObjectManager", "removeStateObject() Could not find stateobject " + ldv2);
            return null;
        }
        if (map.isEmpty()) {
            this.afo.remove(ldv3);
        }
        return aht2;
    }

    public final boolean a(ahl ahl2) {
        List<ldv> list;
        if (ahl2 == null) {
            lfn.b(5, "SFStateObjectManager", "addRelationStateObject() StateObject is null.");
            return false;
        }
        ldv ldv2 = ahl2.getGUID().bFk();
        Map<ldv, ahl> map = this.afp.get(ldv2);
        if (map == null) {
            map = lcn.emw();
            this.afp.put(ldv2, map);
        } else if (map.containsKey(ahl2.getGUID())) {
            lfn.b(5, "SFStateObjectManager", "addRelationStateObject() StateObject " + ahl2.getGUID() + " already exists.");
            return false;
        }
        List<ldv> list2 = this.bk(ahl2.Bq());
        if (list2 != null) {
            if (list2.contains(ahl2.getGUID())) {
                lfn.b(5, "SFStateObjectManager", "addRelationStateObject() RelationGUID " + ahl2.getGUID() + " already exists in startpoint relationlist.");
                return false;
            }
        } else {
            list2 = lcn.abH(2);
            this.afq.put(ahl2.Bq(), list2);
        }
        if ((list = this.bh(ahl2.Br())) != null) {
            if (list.contains(ahl2.getGUID())) {
                lfn.b(5, "SFStateObjectManager", "addRelationStateObject() RelationGUID " + ahl2.getGUID() + " already exists in endpoint relationlist.");
                return false;
            }
        } else {
            list = lcn.abH(2);
            this.afr.put(ahl2.Br(), list);
        }
        map.put(ahl2.getGUID(), ahl2);
        list2.add(ahl2.getGUID());
        list.add(ahl2.getGUID());
        return true;
    }

    public final boolean bg(ldv ldv2) {
        return this.bi(ldv2) != null;
    }

    public final List<ldv> bh(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFStateObjectManager", "getEndPointRelations() ObjectGUID is null.");
            return null;
        }
        return this.afr.get(ldv2);
    }

    public final ahl bi(ldv ldv2) {
        Map<ldv, ahl> map = this.bj(ldv2);
        if (map == null) {
            return null;
        }
        return map.get(ldv2);
    }

    public final Map<ldv, ahl> bj(ldv ldv2) {
        if (ldv2.enx() == 0) {
            return this.afp.get(ldv2);
        }
        return this.afp.get(ldv2.bFk());
    }

    public final List<ldv> bk(ldv ldv2) {
        if (ldv2 == null) {
            lfn.b(5, "SFStateObjectManager", "getStartPointRelations() ObjectGUID is null.");
            return null;
        }
        return this.afq.get(ldv2);
    }

    public final void b(ahl ahl2) {
        Object object;
        if (ahl2 == null) {
            lfn.b(5, "SFStateObjectManager", "removeRelationStateObject() StateObject is null.");
            return;
        }
        ldv ldv2 = ahl2.getGUID().bFk();
        Map<ldv, ahl> map = this.afp.get(ldv2);
        if (map == null) {
            lfn.b(5, "SFStateObjectManager", "removeRelationStateObject() Could not find stateobjectmap for " + ahl2.getGUID());
        } else {
            object = map.remove(ahl2.getGUID());
            if (object == null) {
                lfn.b(5, "SFStateObjectManager", "removeRelationStateObject() Could not find stateobject " + ahl2.getGUID());
            }
            if (map.isEmpty()) {
                this.afp.remove(ldv2);
            }
        }
        object = this.bk(ahl2.Bq());
        if (object == null) {
            lfn.b(5, "SFStateObjectManager", "removeRelationStateObject() Could not find startpoint relationlist for " + ahl2);
        } else {
            if (!object.remove(ahl2.getGUID())) {
                lfn.b(5, "SFStateObjectManager", "removeRelationStateObject() Could not find relation " + ahl2.getGUID() + " in startpoint relationlist for " + ahl2);
            }
            if (object.isEmpty()) {
                this.afq.remove(ahl2.Bq());
            }
        }
        object = this.bh(ahl2.Br());
        if (object == null) {
            lfn.b(5, "SFStateObjectManager", "removeRelationStateObject() Could not find endpoint relationlist for " + ahl2);
        } else {
            if (!object.remove(ahl2.getGUID())) {
                lfn.b(5, "SFStateObjectManager", "removeRelationStateObject() Could not find relation " + ahl2.getGUID() + " in endpoint relationlist for " + ahl2);
            }
            if (object.isEmpty()) {
                this.afr.remove(ahl2.Br());
            }
        }
    }
}

