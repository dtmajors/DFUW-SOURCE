/*
 * Decompiled with CFR.
 */
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kbf {
    public static final lju oRy = new lju(0, 1, 0);
    private les ResourceTree = lea.enW();

    public void wl(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, oRy);
            NodeList nodeList = document.getElementsByTagName("Constraint");
            if (nodeList.getLength() == 0) {
                return;
            }
            Map<Integer, dbv> map = lea.eoW();
            int n = nodeList.getLength();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    dbv dbv2 = this.eI(nodeList.item(i2));
                    if (map.containsKey(dbv2.ResourceType)) {
                        throw new bg("A constraint for resource '" + dbv2.pa() + "' already exists.");
                    }
                    map.put(dbv2.ResourceType, dbv2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of constraint " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private dbv eI(Node node) {
        String string = jsy.c(node, "ResourceName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'ResourceName' has invalid value.");
        }
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            throw new bj("ResourceName '" + string + "' is invalid.");
        }
        float f2 = jsy.e(node, "RepairDistance");
        if (f2 <= 0.0f) {
            throw new bj("Attribute 'RepairDistance' has invalid value.");
        }
        float f3 = jsy.e(node, "UsableDistance");
        if (f3 <= 0.0f) {
            throw new bj("Attribute 'UsableDistance' has invalid value.");
        }
        return new dbv(n, f2, f3);
    }
}

