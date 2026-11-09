/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  ep
 *  kah
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class kbn {
    public static final lju oRy = new lju(0, 1, 0);
    private les ResourceTree = lea.enW();
    private float pdE = 1.0f;

    public float dUY() {
        return this.pdE;
    }

    public Map<String, cur> dUZ() {
        try {
            String string = "xml-files/gamelogicinfo/weaponpropertylist.xml";
            return this.ws(string);
        }
        catch (bg bg2) {
            lfn.log("SFWeaponPropertyParser", bg2);
            throw bg2;
        }
    }

    public Map<String, cur> ws(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        try {
            cur cur2;
            float f2;
            Node node;
            Node node2 = jsy.d("SFWeaponReachFile", document);
            Map<String, cur> map = lea.eos();
            Node node3 = jsy.d("SFUnitPerMeter", node2);
            this.pdE = jsy.o(node3);
            if (this.pdE <= 0.0f) {
                throw new bj("Node 'SFUnitPerMeter' has invalid value.");
            }
            List<Node> list = jsy.c("SFMeleeWeapon", node2);
            int n = list.size();
            for (int i2 = 0; i2 < n; ++i2) {
                Node node4 = list.get(i2);
                node = jsy.a("SFResourceName", node4);
                int n2 = kah.dv((Node)node);
                if (n2 <= 0) {
                    throw new bj("Node 'SFResourceName' has invalid value.");
                }
                node = jsy.a("SFWeaponAngle", node4);
                float f3 = jsy.o(node);
                if (f3 <= 0.0f) {
                    throw new bj("Node 'SFWeaponAngle' has invalid value.");
                }
                node = jsy.a("SFWeaponRank", node4);
                float f4 = jsy.o(node);
                if (f4 < 0.0f || f4 > 80.0f) {
                    throw new bj("Node 'SFWeaponRank' has invalid value.");
                }
                node = jsy.a("SFWeaponReach", node4);
                float f5 = jsy.o(node);
                if (f5 <= 0.0f) {
                    throw new bj("Node 'SFWeaponReach' has invalid value.");
                }
                if (lea.enW().isDescendant(n2, cug.fiy)) {
                    int n3 = 0;
                    ++n3;
                }
                Node node5 = jsy.a("SFPrerequisiteAttributeType", node4);
                int n4 = -1;
                if (node5 != null) {
                    n4 = ep.as((String)jsy.m(node5));
                }
                node = jsy.a("SFPrerequisiteAttributeTypeAlt", node4);
                int n5 = -1;
                if (node != null) {
                    n5 = ep.as((String)jsy.m(node));
                }
                node = jsy.a("SFPrerequisiteAttributeValue", node4);
                f2 = 0.0f;
                if (node != null) {
                    f2 = jsy.o(node);
                }
                node = jsy.a("SFPrerequisiteAttributeValueAlt", node4);
                float f6 = 0.0f;
                if (node != null) {
                    f6 = jsy.o(node);
                }
                cur2 = new cur(n2, f3, f4, f5, n4, f2, n5, f6);
                map.put(this.ResourceTree.getName(n2), cur2);
            }
            List<Node> list2 = jsy.c("SFShield", node2);
            int n6 = list2.size();
            for (n = 0; n < n6; ++n) {
                node = list2.get(n);
                Node node6 = jsy.a("SFResourceName", node);
                int n7 = kah.dv((Node)node6);
                if (n7 <= 0) {
                    throw new bj("Node 'SFResourceName' has invalid value.");
                }
                node6 = jsy.a("SFPrerequisiteAttributeType", node);
                int n8 = -1;
                if (node6 != null) {
                    n8 = ep.as((String)jsy.m(node6));
                }
                node6 = jsy.a("SFPrerequisiteAttributeTypeAlt", node);
                int n9 = -1;
                if (node6 != null) {
                    n9 = ep.as((String)jsy.m(node6));
                }
                node6 = jsy.a("SFPrerequisiteAttributeValue", node);
                float f7 = 0.0f;
                if (node6 != null) {
                    f7 = jsy.o(node6);
                }
                node6 = jsy.a("SFPrerequisiteAttributeValueAlt", node);
                float f8 = 0.0f;
                if (node6 != null) {
                    f8 = jsy.o(node6);
                }
                cur cur3 = new cur(n7, 0.0f, 0.0f, 0.0f, n8, f7, n9, f8);
                map.put(this.ResourceTree.getName(n7), cur3);
            }
            List<Node> list3 = jsy.c("SFMageStaff", node2);
            int n10 = list3.size();
            for (n6 = 0; n6 < n10; ++n6) {
                Node node7 = list3.get(n6);
                Node node8 = jsy.a("SFResourceName", node7);
                int n11 = kah.dv((Node)node8);
                if (n11 <= 0) {
                    throw new bj("Node 'SFResourceName' has invalid value.");
                }
                node8 = jsy.a("SFWeaponRank", node7);
                float f9 = jsy.o(node8);
                if (f9 < 0.0f || f9 > 80.0f) {
                    throw new bj("Node 'SFWeaponRank' has invalid value.");
                }
                node8 = jsy.a("SFPrerequisiteAttributeType", node7);
                int n12 = -1;
                if (node8 != null) {
                    n12 = ep.as((String)jsy.m(node8));
                }
                node8 = jsy.a("SFPrerequisiteAttributeTypeAlt", node7);
                int n13 = -1;
                if (node8 != null) {
                    n13 = ep.as((String)jsy.m(node8));
                }
                node8 = jsy.a("SFPrerequisiteAttributeValue", node7);
                float f10 = 0.0f;
                if (node8 != null) {
                    f10 = jsy.o(node8);
                }
                node8 = jsy.a("SFPrerequisiteAttributeValueAlt", node7);
                f2 = 0.0f;
                if (node8 != null) {
                    f2 = jsy.o(node8);
                }
                cur cur4 = new cur(n11, 0.0f, f9, 0.0f, n12, f10, n13, f2);
                map.put(this.ResourceTree.getName(n11), cur4);
            }
            List<Node> list4 = jsy.c("SFRangedWeapon", node2);
            int n14 = list4.size();
            for (n10 = 0; n10 < n14; ++n10) {
                Node node9 = list4.get(n10);
                Node node10 = jsy.a("SFResourceName", node9);
                int n15 = kah.dv((Node)node10);
                if (n15 <= 0) {
                    throw new bj("Node 'SFResourceName' has invalid value.");
                }
                node10 = jsy.a("SFWeaponRank", node9);
                float f11 = jsy.o(node10);
                if (f11 < 0.0f || f11 > 80.0f) {
                    throw new bj("Node 'SFWeaponRank' has invalid value.");
                }
                node10 = jsy.a("SFPrerequisiteAttributeType", node9);
                int n16 = -1;
                if (node10 != null) {
                    n16 = ep.as((String)jsy.m(node10));
                }
                node10 = jsy.a("SFPrerequisiteAttributeTypeAlt", node9);
                int n17 = -1;
                if (node10 != null) {
                    n17 = ep.as((String)jsy.m(node10));
                }
                node10 = jsy.a("SFPrerequisiteAttributeValue", node9);
                f2 = 0.0f;
                if (node10 != null) {
                    f2 = jsy.o(node10);
                }
                node10 = jsy.a("SFPrerequisiteAttributeValueAlt", node9);
                float f12 = 0.0f;
                if (node10 != null) {
                    f12 = jsy.o(node10);
                }
                cur2 = new cur(n15, 0.0f, f11, 0.0f, n16, f2, n17, f12);
                map.put(this.ResourceTree.getName(n15), cur2);
            }
            List<Node> list5 = jsy.c("SFArmor", node2);
            int n18 = list5.size();
            for (n14 = 0; n14 < n18; ++n14) {
                Node node11 = list5.get(n14);
                Node node12 = jsy.a("SFResourceName", node11);
                int n19 = kah.dv((Node)node12);
                if (n19 <= 0) {
                    throw new bj("Node 'SFResourceName' has invalid value.");
                }
                node12 = jsy.a("SFPrerequisiteAttributeType", node11);
                int n20 = -1;
                if (node12 != null) {
                    n20 = ep.as((String)jsy.m(node12));
                }
                node12 = jsy.a("SFPrerequisiteAttributeTypeAlt", node11);
                int n21 = -1;
                if (node12 != null) {
                    n21 = ep.as((String)jsy.m(node12));
                }
                node12 = jsy.a("SFPrerequisiteAttributeValue", node11);
                f2 = 0.0f;
                if (node12 != null) {
                    f2 = jsy.o(node12);
                }
                node12 = jsy.a("SFPrerequisiteAttributeValueAlt", node11);
                float f13 = 0.0f;
                if (node12 != null) {
                    f13 = jsy.o(node12);
                }
                cur2 = new cur(n19, 0.0f, 0.0f, 0.0f, n20, f2, n21, f13);
                map.put(this.ResourceTree.getName(n19), cur2);
            }
            return map;
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }
}

