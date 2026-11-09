/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jvb {
    public static final String TC = "SFSkillDynamicSpecialEffectsParser";

    public void eL(String string) {
        Map<Integer, dco> map = lea.epK();
        Document document = jsy.tJ(string);
        if (document == null) {
            lfn.b(5, TC, "parseFile() Invalid Document: [" + string + "]");
            assert (false);
            return;
        }
        Node node = jsy.a("SkillDynamicSpecialEffects", (Node)document);
        if (node == null) {
            throw new bn("SkillDynamicSpecialEffects");
        }
        List<Node> list = jsy.c("Skill", node);
        if (list == null || list.isEmpty()) {
            throw new bn("Skill");
        }
        for (Node node2 : list) {
            dco dco2 = new dco();
            String string2 = jsy.i(node2, "Value");
            if (string2 == null || string2.isEmpty()) {
                throw new bj("Value");
            }
            int n = lea.enZ().getType(string2);
            if (n == -1) {
                throw new bj(string2);
            }
            List<Node> list2 = jsy.c("SFSkillPartName", node2);
            if (list2 == null || list2.isEmpty()) {
                throw new bn("SFSkillPartName");
            }
            for (Node node3 : list2) {
                String string3 = jsy.i(node3, "Value");
                if (string3 == null || string3.isEmpty()) {
                    throw new bj("Value");
                }
                cxd.p p2 = cxd.p.getSkillPartType(string3);
                if (p2 == null) {
                    throw new bj(string3);
                }
                List<Node> list3 = jsy.c("SFTargetObjectName", node3);
                if (list3 == null || list3.isEmpty()) {
                    throw new bn("SFTargetObjectName");
                }
                for (Node node4 : list3) {
                    String string4 = jsy.i(node4, "Value");
                    if (string4 == null || string4.isEmpty()) {
                        throw new bj("Value");
                    }
                    cxd.t t2 = cxd.t.getTargetObjectType(string4);
                    if (t2 == null) {
                        throw new bj(string4);
                    }
                    List<Node> list4 = jsy.c("WeaponName", node4);
                    if (list4 == null || list4.isEmpty()) {
                        throw new bn("WeaponName");
                    }
                    for (Node node5 : list4) {
                        String string5 = jsy.i(node5, "Value");
                        if (string5 == null || string5.isEmpty()) {
                            throw new bj("Value");
                        }
                        int n2 = lea.enW().getType(string5);
                        if (n2 == -1) {
                            throw new bj(string5);
                        }
                        String string6 = jsy.i(node5, "SFSpecialEffect");
                        if (string6 == null || string6.isEmpty()) {
                            throw new bj("SFSpecialEffect");
                        }
                        Integer n3 = (Integer)lea.eoc().get(string6);
                        if (n3 == null) {
                            throw new bj(string6);
                        }
                        dco2.d(p2.ordinal(), t2.ordinal(), n2, n3);
                    }
                }
            }
            map.put(n, dco2);
        }
    }
}

