/*
 * Decompiled with CFR.
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jtl {
    public void dSI() {
        Object object;
        Object object2;
        List<cfm> list = cfj.euw;
        Map<Integer, cfn> map = cfj.euv;
        Map<Object, Object> map2 = lcn.emw();
        Document document = jsy.tK("xml-files/gamelogicinfo/advisor.xml");
        Node node = jsy.e("Advisor", document);
        List<Node> list2 = jsy.c("AdvisorCategory", node);
        for (Node object32 : list2) {
            object2 = new cfm();
            object = object32.getAttributes().getNamedItem("Id").getNodeValue();
            lox n = lpd.rHs.BE("Advisor.Category" + (String)object);
            if (n == null) {
                lfn.b(5, "SFAdviorParser", "parseAdvisorFile() Category " + (String)object + " does not exist in code. You need to run localization tool!");
                continue;
            }
            ((cfm)object2).m(n.bD(new Object[0]));
            list.add((cfm)object2);
            map2.put(object, object2);
        }
        List<Node> list3 = jsy.c("AdvisorEntry", node);
        Iterator iterator = list3.iterator();
        while (iterator.hasNext()) {
            Object object3;
            Object object4;
            Object object5;
            String string;
            object2 = (Node)iterator.next();
            object = new cfn();
            int n = Integer.valueOf(object2.getAttributes().getNamedItem("Id").getNodeValue());
            map.put(n, (cfn)object);
            String string2 = object2.getAttributes().getNamedItem("InternalName").getNodeValue();
            lox lox2 = lpd.rHs.BE("Advisor.Entry" + string2);
            if (lox2 == null) {
                lfn.b(5, "SFAdvisorParser", "parseAdvisorFile() Entry " + string2 + " does not exist in code. You need to run localization tool!");
                continue;
            }
            ((cfn)object).n(lox2.bD(new Object[0]));
            String string3 = object2.getAttributes().getNamedItem("Category").getNodeValue();
            cfm cfm2 = (cfm)map2.get(string3);
            if (cfm2 == null) {
                lfn.b(5, "SFAdvisorParser", "parseAdvisorFile() invalid category " + string3 + " for entry " + string2);
                assert (false);
                continue;
            }
            cfm2.aNw().add(n);
            boolean bl = false;
            Node node2 = object2.getAttributes().getNamedItem("Forced");
            if (node2 != null && node2.getNodeValue().equalsIgnoreCase("true")) {
                bl = true;
            }
            ((cfn)object).fX(bl);
            List<Node> list4 = jsy.c("Trigger", (Node)object2);
            for (Node node3 : list4) {
                String[] stringArray;
                string = node3.getAttributes().getNamedItem("Type").getNodeValue();
                object5 = cfv.valueOf(string);
                if (object5 == null) {
                    lfn.b(5, "SFAdvisorParser", "parseAdvisorFile() invalid trigger type " + string + " for entry " + string2);
                    assert (false);
                    continue;
                }
                object4 = null;
                if (object5.equals((Object)cfv.PROXIMITY)) {
                    object4 = object3 = new cfs();
                    float string4 = Float.valueOf(node3.getAttributes().getNamedItem("Radius").getNodeValue()).floatValue();
                    stringArray = node3.getAttributes().getNamedItem("Resource").getNodeValue();
                    int n2 = lea.enW().getType((String)stringArray);
                    if (n2 == -1) {
                        lfn.b(5, "SFAdvisorParser", "parseAdvisorFile() invalid reosurce type for proximity trigger in entry " + string2);
                        assert (false);
                        continue;
                    }
                    ((cfs)object3).l(n2);
                    ((cfs)object3).setRadius(string4);
                } else if (object5.equals((Object)cfv.SPHERES)) {
                    object4 = object3 = new cft();
                    String cfo2 = node3.getAttributes().getNamedItem("SphereIds").getNodeValue();
                    for (String string4 : stringArray = cfo2.split(",")) {
                        ((cft)object3).aNE().add(Integer.valueOf(string4));
                    }
                } else {
                    object4 = new cfu();
                }
                ((cfu)object4).a((cfv)((Object)object5));
                ((cfn)object).aNx().add((cfu)object4);
            }
            List<Node> list5 = jsy.c("Page", (Node)object2);
            int node3 = 0;
            string = "Entry" + string2;
            object5 = list5.iterator();
            while (object5.hasNext()) {
                object4 = (Node)object5.next();
                object3 = "Page" + node3;
                cfo cfo2 = new cfo();
                cfo2.aNB()[0] = this.j(jsy.a("LeftPane", (Node)object4), string + (String)object3 + "LeftPane");
                cfo2.aNB()[1] = this.j(jsy.a("RightPane", (Node)object4), string + (String)object3 + "RightPane");
                ((cfn)object).aNz().add(cfo2);
                ++node3;
            }
        }
    }

    private cfp j(Node node, String string) {
        if (node == null) {
            return null;
        }
        cfp cfp2 = null;
        String string2 = node.getAttributes().getNamedItem("ContentType").getNodeValue();
        if (string2.equals("Image")) {
            cfq cfq2 = new cfq();
            cfq2.hi(node.getAttributes().getNamedItem("ImagePath").getNodeValue());
            cfp2 = cfq2;
        } else if (string2.equals("Text")) {
            cfr cfr2 = new cfr();
            lox lox2 = lpd.rHs.BE("Advisor." + string);
            if (lox2 == null) {
                lfn.b(5, "SFAdvisorParser", "parseAdvisorFile() Entry text " + string + " does not exist in code. You need to run localization tool!");
                return null;
            }
            cfr2.o(lox2.bD(new Object[0]));
            cfp2 = cfr2;
        }
        return cfp2;
    }
}

