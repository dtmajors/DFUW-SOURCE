/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class kac {
    public static final lju oRy = new lju(0, 2, 0);
    private les ResourceTree = lea.enW();

    public void dUU() {
        String string = "xml-files/server/gamelogicinfo/movableobjectsresourceharvestinginfo.xml";
        if (!jry.tj("xml-files/server/gamelogicinfo/movableobjectsresourceharvestinginfo.xml")) {
            return;
        }
        try {
            Document document = jsy.tJ("xml-files/server/gamelogicinfo/movableobjectsresourceharvestinginfo.xml");
            jsy.a(document, oRy);
            Node node = jsy.d("XML", document);
            List<Node> list = jsy.c("SFMovableObjectResourceHarvestingInfo", node);
            for (Node node2 : list) {
                String string2 = jsy.c(node2, "ResourceName");
                int n = this.ResourceTree.getType(string2);
                if (n <= 0) {
                    throw new bj("Node 'ResourceName' has invalid value :" + string2);
                }
                ctr ctr2 = new ctr();
                ctr2.ResourceType = n;
                List<Node> list2 = jsy.c("DangerLevel", node2);
                if (list2.isEmpty()) {
                    assert (false);
                    continue;
                }
                for (Node node3 : list2) {
                    String string3 = jsy.c(node3, "SFValue");
                    lmf lmf2 = lmf.getValueByName(string3);
                    if (lmf2 == null) {
                        assert (false);
                        continue;
                    }
                    for (Node node4 = node3.getFirstChild(); node4 != null; node4 = node4.getNextSibling()) {
                        ArrayList<cto> arrayList = null;
                        if (node4.getNodeName().equals("SFRandomItem")) {
                            Node node5 = node4;
                            List<Node> list3 = jsy.c("SFItem", node5);
                            for (Node node6 : list3) {
                                cto cto2 = this.cY(node6);
                                List<List<cto>> list4 = ctr2.fgh.get((Object)lmf2);
                                if (list4 == null) {
                                    list4 = lcn.emv();
                                    ctr2.fgh.put(lmf2, list4);
                                }
                                if (arrayList == null) {
                                    arrayList = lcn.emv();
                                    list4.add(arrayList);
                                }
                                arrayList.add(cto2);
                            }
                        } else if (node4.getNodeName().equals("SFItem")) {
                            cto cto3 = this.cY(node4);
                            List<List<cto>> list5 = ctr2.fgh.get((Object)lmf2);
                            if (list5 == null) {
                                list5 = lcn.emv();
                                ctr2.fgh.put(lmf2, list5);
                            }
                            if (arrayList == null) {
                                arrayList = lcn.emv();
                                list5.add(arrayList);
                            }
                            arrayList.add(cto3);
                        }
                        if (arrayList == null) continue;
                        Collections.sort(arrayList, new ctp());
                        float f = 0.0f;
                        int n2 = arrayList.size();
                        for (int i2 = 0; i2 < n2; ++i2) {
                            cto cto3 = (cto)arrayList.get(i2);
                            f += cto3.Probability;
                        }
                        if ((double)f <= 0.0 || (double)f > 1.0000049999998737) {
                            throw new bg("ProbabilitySum is invalid: " + f);
                        }
                        if (!(f < 1.0f)) continue;
                    }
                }
                cxj.a(ctr2);
            }
        }
        catch (bg bg2) {
            throw new bg("Parsing of file 'xml-files/server/gamelogicinfo/movableobjectsresourceharvestinginfo.xml' failed.", bg2);
        }
    }

    private cto cY(Node node) {
        int n;
        String string = jsy.c(node, "ResourceName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'ResourceName' has invalid value.");
        }
        int n2 = this.ResourceTree.getType(string);
        if (n2 <= 0) {
            throw new bj("ResourceName '" + string + "' is invalid.");
        }
        cto cto2 = new cto();
        cto2.ResourceType = n2;
        if (jsy.g(node, "Quantity")) {
            n = jsy.d(node, "Quantity");
            if (n < 1) {
                throw new bj("Attribute 'Quantity' for resource '" + string + "' has invalid value.");
            }
            cto2.asi = n;
        } else if (jsy.g(node, "MaxQuantity")) {
            n = jsy.d(node, "MaxQuantity");
            if (n <= 0) {
                throw new bj("Attribute 'MaxQuantity' for resource '" + string + "' has invalid value.");
            }
            int n3 = jsy.d(node, "MinQuantity");
            if (n3 < 0) {
                throw new bj("Attribute 'MinQuantity' for resource '" + string + "' has invalid value.");
            }
            if (n3 > n) {
                throw new bj("MinQuantity > MaxQuantity.");
            }
            cto2.dpT = n;
            cto2.dpS = n3;
        }
        if (jsy.g(node, "Probability")) {
            float f = jsy.e(node, "Probability");
            if (f <= 0.0f || f > 1.0f) {
                throw new bj("Attribute 'Probability' for resource '" + string + "' has invalid value.");
            }
            cto2.Probability = f;
        }
        return cto2;
    }
}

