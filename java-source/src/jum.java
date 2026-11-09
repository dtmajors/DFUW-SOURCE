/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jum {
    public static final String TC = "SFPlayerBoosterParser";

    public void eL(String string) {
        ckn ckn2 = lea.epw();
        Document document = jsy.tJ(string);
        if (document == null) {
            lfn.b(5, TC, "parseFile() Invalid Document: [" + string + "]");
            assert (false);
            return;
        }
        Node node = jsy.a("Boosters", (Node)document);
        if (node == null) {
            throw new bn("Boosters");
        }
        Node node2 = jsy.a("BaseCost", node);
        if (node2 == null) {
            throw new bn("BaseCost");
        }
        float f = Float.parseFloat(jsy.i(node2, "Value"));
        ckn2.ex(f);
        float f2 = Float.parseFloat(jsy.i(node2, "FirstCategoryMultiplier"));
        ckn2.ey(f2);
        float f3 = Float.parseFloat(jsy.i(node2, "SecondCategoryMultiplier"));
        ckn2.ez(f3);
        float f4 = Float.parseFloat(jsy.i(node2, "ThirdCategoryMultiplier"));
        ckn2.eA(f4);
        float f5 = Float.parseFloat(jsy.i(node2, "FourthCategoryMultiplier"));
        ckn2.eB(f5);
        List<Node> list = jsy.c("Group", node);
        if (list == null || list.isEmpty()) {
            throw new bn("Group");
        }
        for (Node node3 : list) {
            int n = Integer.parseInt(jsy.i(node3, "ID"));
            if (n < 0) {
                throw new bn("ID");
            }
            String string2 = jsy.i(node3, "DisplayName");
            if (string2 == null || string2.isEmpty()) {
                throw new bn("DisplayName");
            }
            List<Node> list2 = jsy.c("Booster", node3);
            if (list2 == null || list2.isEmpty()) {
                throw new bn("Booster");
            }
            for (Node node4 : list2) {
                ckk ckk2 = new ckk();
                int n2 = Integer.parseInt(jsy.i(node4, "Index"));
                if (n2 < 0) {
                    throw new bn("Index");
                }
                int n3 = Integer.parseInt(jsy.i(node4, "ID"));
                if (n3 < 0) {
                    throw new bn("ID");
                }
                String string3 = jsy.i(node4, "Name");
                if (string3 == null || string3.isEmpty()) {
                    throw new bn("Name");
                }
                String string4 = jsy.i(node4, "DisplayName");
                if (string4 == null || string4.isEmpty()) {
                    throw new bn("DisplayName");
                }
                String string5 = jsy.i(node4, "SpecialEffectName");
                if (string5 == null || string5.isEmpty()) {
                    throw new bn("SpecialEffectName");
                }
                Node node5 = jsy.a("Attributes", node4);
                if (node5 == null) {
                    throw new bn("Attributes");
                }
                List<Node> list3 = jsy.c("Attribute", node5);
                if (list3 == null || list3.isEmpty()) {
                    throw new bn("Attribute");
                }
                Map<Integer, cki> map = lcn.abI(list3.size());
                for (Node node6 : list3) {
                    String string6 = jsy.i(node6, "Name");
                    if (string6 == null || string6.isEmpty()) {
                        throw new bn("Name");
                    }
                    int n4 = ep.as((String)string6);
                    if (n4 == -1) {
                        throw new bj(string6);
                    }
                    float f6 = Float.parseFloat(jsy.i(node6, "Dynamic"));
                    if (f6 < 0.0f) {
                        throw new bn("Dynamic");
                    }
                    float f7 = Float.parseFloat(jsy.i(node6, "Static"));
                    if (f7 < 0.0f) {
                        throw new bn("Static");
                    }
                    cki cki2 = new cki();
                    cki2.fC(n4);
                    cki2.ev(f6);
                    cki2.ew(f7);
                    map.put(n4, cki2);
                }
                Object object = ckj.getValueByName(string2);
                assert (object != null);
                ckk2.a((ckj)((Object)object));
                ckk2.setIndex(n2);
                ckk2.hG(n3);
                ckk2.setName(string3);
                ckk2.setDisplayName(string4);
                ckk2.hy(string5);
                ckk2.C(map);
                ckn2.a(ckk2.getID(), ckk2);
            }
        }
    }
}

