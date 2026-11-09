/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class juy {
    public static final String TC = "SFSkillConfigurationParser";

    public void eL(String string) {
        Object object;
        Object object2;
        Node node;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Map<Integer, jva> map = lea.epy();
        Document document = jsy.tJ(string);
        if (document == null) {
            lfn.b(5, TC, "parseFile() Invalid Document: [" + string + "]");
            assert (false);
            return;
        }
        Node node2 = jsy.a("Skills", (Node)document);
        if (node2 == null) {
            throw new bn("Skills");
        }
        Node node3 = jsy.a("Relations", node2);
        if (node3 == null) {
            throw new bn("Relations");
        }
        List<Node> list3 = jsy.c("SFSkillRelationSet", node3);
        if (list3 == null || list3.isEmpty()) {
            throw new bn("SFSkillRelationSet");
        }
        for (Node list22 : list3) {
            object6 = jsy.a("SkillName", list22);
            if (object6 == null) {
                throw new bn("SkillName");
            }
            String string2 = jsy.i((Node)object6, "Value");
            if (string2 == null || string2.isEmpty()) {
                throw new bj("Value");
            }
            int n = lea.enZ().getType(string2);
            if (n == -1) {
                throw new bj("Value");
            }
            List<Node> list = jsy.c("SFSkillRelation", list22);
            if (list == null || list.isEmpty()) {
                throw new bn("SFSkillRelation");
            }
            int node11 = 0;
            dcv[] list7 = new dcv[list.size()];
            for (Node node4 : list) {
                object5 = jsy.i(node4, "SFRelationName");
                if (object5 == null || ((String)object5).isEmpty()) {
                    throw new bj("SFRelationName");
                }
                object4 = cxd.l.getRelationType((String)object5);
                if (object4 == null) {
                    throw new bj("RelationName '" + (String)object5 + "' is invalid.");
                }
                String string3 = jsy.i(node4, "Value");
                if (string3 == null || string3.isEmpty()) {
                    throw new bj("Value");
                }
                int n2 = lea.enZ().getType(string3);
                if (n2 <= 0) {
                    throw new bj("RelatedSkillType is invalid.");
                }
                list7[node11] = new dcv((cxd.l)((Object)object4), n2);
                ++node11;
            }
            object3 = new dcw(n, list7);
            if (cxj.yp(((dcw)object3).SkillType)) {
                throw new bg("A skillrelationset already exists for skill '" + lea.enZ().getName(((dcw)object3).SkillType) + "'");
            }
            cxj.a(((dcw)object3).SkillType, (dcw)object3);
        }
        Node node4 = jsy.a("Connections", node2);
        if (node4 == null) {
            throw new bn("Connections");
        }
        List<Node> list = jsy.c("Connection", node4);
        if (list == null || list.isEmpty()) {
            throw new bn("Connection");
        }
        for (Node node5 : list) {
            String string4 = jsy.i(node5, "WeaponName");
            if (string4 == null || string4.isEmpty()) {
                throw new bj("WeaponName");
            }
            int n = lea.enW().getType(string4);
            if (n == -1) {
                throw new bj(string4);
            }
            String string5 = jsy.i(node5, "SkillName");
            if (string5 == null || string5.isEmpty()) {
                throw new bj("SkillName");
            }
            int n3 = lea.enZ().getType(string5);
            if (n3 == -1) {
                throw new bj(string5);
            }
            cxj.bz(n, n3);
        }
        object6 = jsy.a("RadialMenuConnections", node2);
        if (object6 == null) {
            throw new bn("RadialMenuConnections");
        }
        List<Node> list2 = jsy.c("Skill", (Node)object6);
        if (list2 != null && !list2.isEmpty()) {
            for (Node node6 : list2) {
                String string6 = jsy.i(node6, "Name");
                if (string6 == null || string6.isEmpty()) {
                    assert (false) : "Invalid SkillName : " + string6;
                    continue;
                }
                int n = lea.enZ().getType(string6);
                if (n == -1) {
                    assert (false) : "Invalid SkillName : " + string6;
                    continue;
                }
                object3 = jsy.c("WeaponName", node6);
                if (object3 == null || object3.isEmpty()) continue;
                Iterator<Object> iterator = object3.iterator();
                while (iterator.hasNext()) {
                    object5 = (Node)iterator.next();
                    object4 = jsy.i((Node)object5, "Value");
                    int n4 = lea.enW().getType((String)object4);
                    if (n4 == -1) {
                        assert (false) : "Invalid WeaponType : " + n4;
                        continue;
                    }
                    String string7 = jsy.i((Node)object5, "SkillName");
                    int n5 = lea.enZ().getType(string7);
                    if (n5 == -1) {
                        assert (false) : "Invalid Skill Type : " + n5;
                        continue;
                    }
                    cxj.q(n, n4, n5);
                }
            }
        }
        if ((node = jsy.a("Constraints", node2)) == null) {
            throw new bn("Skills");
        }
        List<Node> list4 = jsy.c("Skill", node);
        if (list4 == null || list4.isEmpty()) {
            throw new bn("Skill");
        }
        for (Node node7 : list4) {
            int n;
            int n6;
            Object object7;
            object3 = jsy.a("Name", node7);
            if (object3 == null) {
                throw new bn("Name");
            }
            String string8 = jsy.i(object3, "Value");
            if (string8 == null || string8.isEmpty()) {
                throw new bj("Value");
            }
            int n7 = lea.enZ().getType(string8);
            if (n7 == -1) {
                assert (false) : "SkillName : " + string8;
                throw new bj("Value");
            }
            object4 = null;
            boolean bl = false;
            Node node8 = jsy.a("Weapons", node7);
            if (node8 != null) {
                object7 = jsy.c("WeaponName", node8);
                if (object7 != null && !object7.isEmpty()) {
                    object4 = lcn.abH(object7.size());
                    Iterator iterator = object7.iterator();
                    while (iterator.hasNext()) {
                        Node node9 = (Node)iterator.next();
                        object2 = jsy.i(node9, "Value");
                        n6 = lea.enW().getType((String)object2);
                        if (n6 == -1) {
                            assert (false) : "Invalid WeaponType : " + n6;
                            continue;
                        }
                        ((ArrayList)object4).add(n6);
                    }
                }
            } else {
                object7 = jsy.a("WeaponName", node7);
                if (object7 != null) {
                    String string9 = jsy.i((Node)object7, "Value");
                    n = lea.enW().getType(string9);
                    if (n == -1) {
                        assert (false) : "Invalid WeaponType : " + n;
                        continue;
                    }
                    object4 = lcn.abH(1);
                    ((ArrayList)object4).add(n);
                    bl = Boolean.parseBoolean(jsy.i((Node)object7, "Relational"));
                }
            }
            boolean bl2 = (object7 = jsy.a("Attached", node7)) != null ? Boolean.parseBoolean(jsy.i((Node)object7, "Value")) : false;
            n = object7 != null ? (int)(Boolean.parseBoolean(jsy.i((Node)object7, "Optional")) ? 1 : 0) : 1;
            object2 = jsy.a("Mounted", node7);
            if (object2 == null) {
                throw new bn("Mounted");
            }
            n6 = Boolean.parseBoolean(jsy.i((Node)object2, "Value"));
            boolean bl3 = Boolean.parseBoolean(jsy.i((Node)object2, "Optional"));
            object = jsy.a("Swimming", node7);
            boolean bl4 = object != null ? Boolean.parseBoolean(jsy.i((Node)object, "Value")) : false;
            boolean bl5 = object != null ? Boolean.parseBoolean(jsy.i((Node)object, "Optional")) : true;
            Node node10 = jsy.a("Submerged", node7);
            if (node10 == null) {
                throw new bn("Submerged");
            }
            boolean bl6 = Boolean.parseBoolean(jsy.i(node10, "Value"));
            boolean bl7 = Boolean.parseBoolean(jsy.i(node10, "Optional"));
            boolean bl8 = false;
            Node node11 = jsy.a("Blockable", node7);
            if (node11 != null) {
                bl8 = Boolean.parseBoolean(jsy.i(node11, "Value"));
            }
            if (map.containsKey(n7)) {
                assert (false) : "Dublicate Skill In Map : " + string8;
                continue;
            }
            map.put(n7, new jva(n7, (ArrayList<Integer>)object4, new cgc(bl2, n != 0), new cgc(n6 != 0, bl3), new cgc(bl4, bl5), new cgc(bl6, bl7), bl, bl8));
        }
        Node node12 = jsy.a("Targeting", node2);
        if (node12 == null) {
            throw new bn("Targeting");
        }
        List<Node> list5 = jsy.c("Skill", node12);
        if (list5 == null || list4.isEmpty()) {
            throw new bn("Skill");
        }
        object3 = lea.epI();
        for (Node node13 : list5) {
            object4 = jsy.i(node13, "Value");
            if (object4 == null || ((String)object4).isEmpty()) {
                throw new bj("Value");
            }
            int n = lea.enZ().getType((String)object4);
            if (n == -1) {
                assert (false) : "SkillName : " + (String)object4;
                throw new bj("Value");
            }
            object3.add(n);
        }
        Node node14 = jsy.a("HideLayers", node2);
        if (node14 == null) {
            throw new bn("HideLayers");
        }
        List<Node> list6 = jsy.c("Attribute", node14);
        if (list6 == null || list6.isEmpty()) {
            throw new bn("Attribute");
        }
        object4 = cxj.bfT();
        for (Node node15 : list6) {
            String string10 = jsy.i(node15, "Value");
            if (string10 == null) {
                throw new bj("Value");
            }
            int n = ep.as((String)string10);
            if (n == -1) {
                throw new bj(string10);
            }
            List<Node> list7 = jsy.c("SFLayer", node15);
            if (list7 == null || list7.isEmpty()) {
                throw new bn("SFLayer");
            }
            object2 = lcn.emv();
            for (Node node16 : list7) {
                object = jsy.i(node16, "Value");
                if (object == null) {
                    throw new bj("Value");
                }
                cak.c c2 = cak.c.findLayerType((String)object);
                if (c2 == null) {
                    throw new bj((String)object);
                }
                object2.add(c2);
            }
            object4.put(n, object2);
        }
    }
}

