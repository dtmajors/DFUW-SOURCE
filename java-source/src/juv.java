/*
 * Decompiled with CFR.
 */
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class juv {
    public static final lju eM = new lju(0, 1, 0);
    private les ResourceTree = lea.enW();

    public void uo(String string) {
        if (string == null) {
            throw new bi("FileName is null.");
        }
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, eM);
            NodeList nodeList = document.getElementsByTagName("SFMapping");
            if (nodeList.getLength() == 0) {
                return;
            }
            Map<Integer, Integer> map = lea.eoV();
            int n = nodeList.getLength();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    Node node = nodeList.item(i2);
                    String string2 = jsy.c(node, "ResourceName");
                    if (string2 == null || string2.trim().equals("")) {
                        throw new bj("Attribute 'ResourceName' has invalid value.");
                    }
                    int n2 = this.ResourceTree.getType(string2);
                    if (n2 <= 0) {
                        throw new bj("ResourceName '" + string2 + "' is invalid.");
                    }
                    String string3 = jsy.c(node, "SpecialEffectName");
                    if (string3 == null || string3.trim().equals("")) {
                        throw new bj("Attribute 'SpecialEffectName' has invalid value for resource'" + string2 + "'");
                    }
                    int n3 = del.dr(string3);
                    if (n3 <= 0) {
                        throw new bj("SpecialEffectName '" + string3 + "' is invalid for resource'" + string2 + "'");
                    }
                    if (map.containsKey(n2)) {
                        throw new bp("A mapping for resource '" + string2 + "' already exists in the ResourceToSpecialEffectMap.");
                    }
                    map.put(n2, n3);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of mappingnode " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }
}

