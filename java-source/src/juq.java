/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  ep
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class juq {
    public static final String TC = "SFPlayerRolesParser";

    public void eL(String string) {
        Object object;
        boolean bl;
        int n;
        String string2;
        Object object2;
        ckb ckb2 = lea.epx();
        Document document = jsy.tJ(string);
        if (document == null) {
            lfn.b(5, TC, "parseFile() Invalid Document: [" + string + "]");
            assert (false);
            return;
        }
        Node node = jsy.a("Roles", (Node)document);
        if (node == null) {
            throw new bn("Roles");
        }
        Node node2 = jsy.a("Cooldown", node);
        if (node2 == null) {
            throw new bn("Cooldown");
        }
        int n2 = Integer.parseInt(jsy.i(node2, "Value"));
        if (n2 <= 0) {
            throw new bj("Value");
        }
        Node node3 = jsy.a("Delay", node);
        if (node3 == null) {
            throw new bn("Delay");
        }
        int n3 = Integer.parseInt(jsy.i(node3, "Value"));
        if (n3 <= 0) {
            throw new bj("Value");
        }
        Node node4 = jsy.a("CombatTimer", node);
        if (node4 == null) {
            throw new bn("CombatTimer");
        }
        double d2 = Integer.parseInt(jsy.i(node4, "Value"));
        if (d2 <= 0.0) {
            throw new bj("Value");
        }
        Node node5 = jsy.a("CustomRolesEnabled", node);
        if (node5 == null) {
            throw new bn("CustomRolesEnabled");
        }
        boolean bl2 = Boolean.parseBoolean(jsy.i(node5, "Value"));
        Node node6 = jsy.a("NumberOfRoleSkills", node);
        if (node6 == null) {
            throw new bn("NumberOfRoleSkills");
        }
        int n4 = Integer.parseInt(jsy.i(node6, "Value"));
        Node node7 = jsy.a("NumberOfSkills", node);
        if (node7 == null) {
            throw new bn("NumberOfSkills");
        }
        int n5 = Integer.parseInt(jsy.i(node7, "Value"));
        Node node8 = jsy.a("NumberOfUltis", node);
        if (node8 == null) {
            throw new bn("NumberOfUltis");
        }
        int n6 = Integer.parseInt(jsy.i(node8, "Value"));
        Node node9 = jsy.a("Skills", node);
        if (node9 == null) {
            throw new bn("Skills");
        }
        List<Node> list = jsy.c("Skill", node9);
        if (list == null || list.isEmpty()) {
            throw new bn("Skill");
        }
        for (Node object3 : list) {
            String string3 = jsy.i(object3, "Value");
            if (string3 == null || string3.isEmpty()) {
                throw new bj("Value");
            }
            int n7 = lea.enZ().getType(string3);
            if (n7 == -1) {
                throw new bj("Value");
            }
            object2 = jsy.i(object3, "Disclude");
            if (object2 == null || object2.isEmpty()) {
                throw new bj("Disclude");
            }
            int n8 = lea.enZ().getType((String)object2);
            if (n8 == -1) {
                throw new bj("Disclude");
            }
            string2 = jsy.i(object3, "Ulti");
            if (string2 == null) {
                throw new bj("Ulti");
            }
            int n9 = lea.enZ().getType(string2);
            n = Integer.parseInt(jsy.i(object3, "Role"));
            if (n == -1) {
                throw new bj("Role");
            }
            bl = Boolean.parseBoolean(jsy.i(object3, "Active"));
            object = new ckf();
            ((ckf)object).rd(n7);
            ((ckf)object).re(n8);
            ((ckf)object).rc(n);
            ((ckf)object).setEnabled(bl);
            ckb2.a(n, (ckf)object);
            if (n9 == -1) continue;
            ckb2.aU(n7, n9);
        }
        List<Node> list2 = jsy.c("Role", node);
        if (list2 == null || list2.isEmpty()) {
            throw new bn("Role");
        }
        for (Node node10 : list2) {
            List<Node> list3;
            Object object3;
            String string4 = jsy.i(node10, "Name");
            if (string4 == null || string4.isEmpty()) {
                throw new bj("Name");
            }
            object2 = ckc.getValueByName(string4);
            if (object2 == null) {
                assert (false);
                continue;
            }
            if (object2 == ckc.COMMONER && !bl2) continue;
            cjx cjx2 = new cjx();
            cjx2.setName(string4);
            string2 = jsy.i(node10, "DisplayName");
            if (string2 == null || string2.isEmpty()) {
                throw new bj("DisplayName");
            }
            cjx2.setDisplayName(string2);
            String string5 = jsy.i(node10, "Description");
            if (string5 == null || string5.isEmpty()) {
                throw new bj("Description");
            }
            cjx2.setDescription(string5);
            n = Integer.parseInt(jsy.i(node10, "Index"));
            if (n < 0) {
                throw new bj("Index");
            }
            cjx2.setIndex(n);
            bl = bl2 && object2 != ckc.COMMONER ? false : Boolean.parseBoolean(jsy.i(node10, "Active"));
            cjx2.setEnabled(bl);
            object = jsy.i(node10, "ArmorParentResource");
            if (object == null || ((String)object).isEmpty()) {
                throw new bj("ArmorParentResource");
            }
            cjx2.ht((String)object);
            String string6 = jsy.i(node10, "ArmorType");
            cjv cjv2 = cjv.getValueByName(string6);
            if (cjv2 == null) {
                throw new bj("ArmorType");
            }
            cjx2.b(cjv2);
            Node node11 = jsy.a("BlockingList", node10);
            if (node11 == null) {
                throw new bn("BlockingList");
            }
            List<Node> list4 = jsy.c("Role", node11);
            if ((list4 == null || list4.isEmpty()) && cjx2.getIndex() != ckc.COMMONER.ordinal()) {
                throw new bn("Role");
            }
            if (list4 != null) {
                object3 = list4.iterator();
                while (object3.hasNext()) {
                    list3 = (Node)object3.next();
                    int n10 = Integer.parseInt(jsy.i((Node)((Object)list3), "Value"));
                    if (n10 == -1) {
                        throw new bj("Value");
                    }
                    cjx2.aQw().add(n10);
                }
            }
            if ((object3 = jsy.a("Specializations", node10)) == null && cjx2.getIndex() != ckc.COMMONER.ordinal()) {
                throw new bn("Specializations");
            }
            list3 = jsy.c("Specialization", (Node)object3);
            if ((list3 == null || list3.isEmpty()) && cjx2.getIndex() != ckc.COMMONER.ordinal()) {
                throw new bn("Specialization");
            }
            if (list3 != null) {
                Object object4;
                Node node12;
                Node node13;
                Node node14;
                Object object5;
                Node node15;
                Object object6;
                Object object7;
                Object object8;
                Object object9;
                List<Node> list5;
                Map<Integer, ckd> map = lcn.abI(list3.size());
                for (Node node16 : list3) {
                    int n11 = Integer.parseInt(jsy.i(node16, "Index"));
                    if (n11 < 0) {
                        throw new bj("Index");
                    }
                    list5 = jsy.i(node16, "Name");
                    if (list5 == null || ((String)((Object)list5)).isEmpty()) {
                        throw new bj("Name : " + (String)((Object)list5));
                    }
                    String string7 = jsy.i(node16, "DisplayName");
                    if (string7 == null || string7.isEmpty()) {
                        throw new bj("DisplayName : " + string7);
                    }
                    object9 = jsy.i(node16, "Primary");
                    if ((object9 == null || ((String)object9).isEmpty() || cxd.ip((String)object9) == -1) && object2 != ckc.COMMONER) {
                        throw new bj("Primary");
                    }
                    int n12 = lea.enZ().getType((String)object9);
                    if (n12 == -1 && object2 != ckc.COMMONER) {
                        throw new bj("Primary");
                    }
                    object8 = jsy.i(node16, "Secondary");
                    if ((object8 == null || ((String)object8).isEmpty() || cxd.ip((String)object8) == -1) && object2 != ckc.COMMONER) {
                        throw new bj("Secondary");
                    }
                    int n13 = lea.enZ().getType((String)object8);
                    if (n13 == -1 && object2 != ckc.COMMONER) {
                        throw new bj("Primary");
                    }
                    ckb2.g((String)((Object)list5), n12, n13);
                    object7 = new ckd();
                    ((ckd)object7).setIndex(n11);
                    ((ckd)object7).setName((String)((Object)list5));
                    ((ckd)object7).setDisplayName(string7);
                    ((ckd)object7).ra(n12);
                    ((ckd)object7).rb(n13);
                    map.put(((ckd)object7).getIndex(), (ckd)object7);
                    Node node17 = jsy.a("WobbleConfigurations", node10);
                    if (node17 == null) continue;
                    object6 = jsy.c("WobbleConfiguration", node17);
                    Iterator iterator = object6.iterator();
                    while (iterator.hasNext()) {
                        node15 = (Node)iterator.next();
                        String string8 = jsy.i(node15, "WeaponTypes");
                        object5 = bqm.d.valueOf(string8);
                        if (object5 == null) {
                            lfn.b(5, TC, "parse player roles invalid weapon type name " + string8);
                            assert (false);
                            continue;
                        }
                        cfg.a a2 = new cfg.a();
                        cjx2.aQz().put((bqm.d)((Object)object5), a2);
                        node14 = jsy.a("RadiusVelocityMultiplier", node15);
                        a2.eun = Float.valueOf(node14.getAttributes().getNamedItem("Value").getNodeValue()).floatValue();
                        Node node18 = jsy.a("RadiusVelocityExponent", node15);
                        a2.euo = Float.valueOf(node18.getAttributes().getNamedItem("Value").getNodeValue()).floatValue();
                        node13 = jsy.a("CursorSpeed", node15);
                        a2.eup = Float.valueOf(node13.getAttributes().getNamedItem("Value").getNodeValue()).floatValue();
                        Node node19 = jsy.a("CursorChasePerSecond", node15);
                        a2.euq = Float.valueOf(node19.getAttributes().getNamedItem("Value").getNodeValue()).floatValue();
                        node12 = jsy.a("StopTime", node15);
                        a2.eur = Float.valueOf(node12.getAttributes().getNamedItem("Value").getNodeValue()).floatValue();
                        Node node20 = jsy.a("VelocityChasePerSecondUp", node15);
                        a2.eus = Float.valueOf(node20.getAttributes().getNamedItem("Value").getNodeValue()).floatValue();
                        object4 = jsy.a("VelocityChasePerSecondDown", node15);
                        a2.eut = Float.valueOf(object4.getAttributes().getNamedItem("Value").getNodeValue()).floatValue();
                    }
                }
                Node node21 = jsy.a("TargetingDeviations", node10);
                if (node21 == null) {
                    throw new bn("TargetingDeviations");
                }
                List<Node> list6 = jsy.c("TargetingDeviation", node21);
                if ((list6 == null || list6.isEmpty()) && cjx2.getIndex() != ckc.COMMONER.ordinal()) {
                    throw new bn("TargetingDeviation");
                }
                if (list6 != null) {
                    TreeMap<bqm.d, ckg> treeMap = lcn.emG();
                    for (Node node22 : list6) {
                        object9 = jsy.i(node22, "WeaponTypes");
                        if (object9 == null || !((String)object9).equalsIgnoreCase(bqm.d.BOW.name()) && !((String)object9).equalsIgnoreCase(bqm.d.MAGIC_STAFF.name()) && !((String)object9).equalsIgnoreCase(bqm.d.THROWABLE_WEAPON.name())) {
                            throw new bj("WeaponTypes");
                        }
                        float f = Float.parseFloat(jsy.i(node22, "Time"));
                        if ((double)f <= 0.0) {
                            throw new bj("Time");
                        }
                        object8 = jsy.a("SmallSize", node22);
                        if (object8 == null) {
                            throw new bn("SmallSize");
                        }
                        float f2 = Float.parseFloat(jsy.i((Node)object8, "Value"));
                        object7 = jsy.a("MediumSize", node22);
                        if (object7 == null) {
                            throw new bn("MediumSize");
                        }
                        float f3 = Float.parseFloat(jsy.i((Node)object7, "Value"));
                        object6 = jsy.a("LargeSize", node22);
                        if (object6 == null) {
                            throw new bn("LargeSize");
                        }
                        float f4 = Float.parseFloat(jsy.i((Node)object6, "Value"));
                        node15 = jsy.a("SmallScale", node22);
                        if (node15 == null) {
                            throw new bn("SmallScale");
                        }
                        float f5 = Float.parseFloat(jsy.i((Node)object6, "Value"));
                        object5 = jsy.a("MediumScale", node22);
                        if (object5 == null) {
                            throw new bn("MediumScale");
                        }
                        float f6 = Float.parseFloat(jsy.i(object5, "Value"));
                        node14 = jsy.a("LargeScale", node22);
                        if (node14 == null) {
                            throw new bn("LargeScale");
                        }
                        float f7 = Float.parseFloat(jsy.i(node14, "Value"));
                        node13 = jsy.a("PerfectAimStartTime", node22);
                        if (node13 == null) {
                            throw new bn("PerfectAimStartTime");
                        }
                        float f8 = Float.parseFloat(jsy.i(node13, "Value"));
                        node12 = jsy.a("PerfectAimTime", node22);
                        if (node12 == null) {
                            throw new bn("PerfectAimTime");
                        }
                        float f9 = Float.parseFloat(jsy.i(node12, "Value"));
                        object4 = new ckg();
                        ((ckg)object4).eGt = f7;
                        ((ckg)object4).eGq = f4;
                        ((ckg)object4).eGs = f6;
                        ((ckg)object4).eGp = f3;
                        ((ckg)object4).eGr = f5;
                        ((ckg)object4).eGo = f2;
                        ((ckg)object4).eGu = f;
                        ((ckg)object4).eGv = f8;
                        ((ckg)object4).eGw = f9;
                        treeMap.put(bqm.d.valueOf((String)object9), (ckg)object4);
                    }
                    cjx2.aQy().putAll(treeMap);
                }
                cjx2.A(map);
                Node node23 = jsy.a("Pools", node10);
                if (node23 == null) {
                    throw new bn("Pools");
                }
                list5 = jsy.c("Pool", node23);
                if ((list5 == null || list5.isEmpty()) && cjx2.getIndex() != ckc.COMMONER.ordinal()) {
                    throw new bn("Pool");
                }
                if (list5 != null) {
                    Map<Integer, Float> map2 = lcn.abI(list5.size());
                    for (Node node24 : list5) {
                        object8 = jsy.i(node24, "Value");
                        int n14 = ep.as((String)object8);
                        if (n14 == -1) {
                            assert (false) : "Invalid attribute name : " + (String)object8 + " for Role : " + cjx2.getDisplayName();
                            continue;
                        }
                        float f = Float.parseFloat(jsy.i(node24, "Percentage"));
                        if (f <= 0.0f) {
                            assert (false) : "Invalid Percentage : " + f + " for Attribute Name " + (String)object8 + " for Role : " + cjx2.getDisplayName();
                            continue;
                        }
                        map2.put(n14, Float.valueOf(f));
                    }
                    cjx2.B(map2);
                }
            }
            ckb2.a(cjx2);
        }
        ckb2.qW(n2);
        ckb2.setDelay(n3);
        ckb2.bt(d2);
        ckb2.gi(bl2);
        ckb2.qZ(n4);
        ckb2.qX(n5);
        ckb2.qY(n6);
    }
}

