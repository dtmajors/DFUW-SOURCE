/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  kah
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kay {
    private final lju oRy = kxm.oRy;
    private jzp oRz = new jzp();
    private les ResourceTree = lea.enW();

    public void vX(String string) {
        if (string == null) {
            throw new bi("FileName is null.");
        }
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, this.oRy);
            NodeList nodeList = document.getElementsByTagName("SFResourceAttributeInfo");
            if (nodeList.getLength() == 0) {
                return;
            }
            Map<Integer, cuf> map = lea.eov();
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                try {
                    cuf cuf2 = this.ey(nodeList.item(i2));
                    Integer n = new Integer(cuf2.ResourceType);
                    if (map.containsKey(n)) {
                        throw new bg("ResourceAttributeInfo for resource '" + cuf2.pa() + "' already exists in ResourceAttributeInfoMap.");
                    }
                    map.put(n, cuf2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of ResourceAttributeInfo " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bs("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    public void vY(String string) {
        if (string == null) {
            throw new bi("FileName is null.");
        }
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, this.oRy);
            NodeList nodeList = document.getElementsByTagName("ResourceVendorInfo");
            if (nodeList.getLength() == 0) {
                return;
            }
            Map<Integer, cum> map = lea.eow();
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                try {
                    cum cum2 = this.ez(nodeList.item(i2));
                    Integer n = new Integer(cum2.ResourceType);
                    if (map.containsKey(n)) {
                        throw new bg("ResourceVendorInfo for resource '" + cum2.pa() + "' already exists in ResourceVendorInfoMap.");
                    }
                    map.put(n, cum2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of ResourceVendorInfo " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bs("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    public void vZ(String string) {
        if (string == null) {
            throw new bi("FileName is null.");
        }
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, this.oRy);
            NodeList nodeList = document.getElementsByTagName("SFWorkStationInfo");
            if (nodeList.getLength() == 0) {
                return;
            }
            Map<cut, cus> map = lea.yq(false);
            int n = nodeList.getLength();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    cus cus2 = this.eA(nodeList.item(i2));
                    if (map.containsKey(cus2.fyh)) {
                        throw new bg("WorkStationInfo with Key=[" + cus2.fyh + "] already exists in WorkStationInfoMap.");
                    }
                    cut cut2 = cus2.fyh;
                    if (cwy.d(cut2.fyi, cut2.fyj, true) != null) {
                        throw new bg("WorkStationInfo with CraftingSkill='" + cut2.Bu() + "' and WorkStationResource'" + cut2.pa() + "' already exists in WorkStationInfoMap.");
                    }
                    map.put(cut2, cus2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of WorkStationInfo " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bs("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private cuf ey(Node node) {
        Node node2 = jsy.d("SFResourceName", node);
        int n = kah.dv((Node)node2);
        if (n <= 0) {
            String string = jsy.m(node2);
            throw new bj("Node 'SFResourceName' has invalid value: '" + string + "'");
        }
        try {
            List<ej> list = this.oRz.d(node, true);
            cuf cuf2 = new cuf(n);
            cuf2.f(list.toArray(new ej[list.size()]));
            return cuf2;
        }
        catch (bg bg2) {
            throw new bg("Parsing of attributes failed for resource '" + this.ResourceTree.getName(n) + "'", bg2);
        }
    }

    private cum ez(Node node) {
        String string = jsy.c(node, "ResourceName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'ResourceName' has invalid value.");
        }
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            throw new bj("ResourceName '" + string + "' is invalid.");
        }
        int n2 = jsy.d(node, "Quantity");
        if (n2 <= 0) {
            throw new bj("Attribute 'Quantity' has invalid value for '" + string + "'");
        }
        return new cum(n, n2);
    }

    private cus eA(Node node) {
        int n;
        Node node2 = jsy.d("SFCraftingSkillName", node);
        int n2 = kbi.eM(node2);
        if (n2 <= 0) {
            throw new bj("Node 'SFCraftingSkillName' has invalid value.");
        }
        node2 = jsy.d("SFWorkStationResourceName", node);
        int n3 = kah.dv((Node)node2);
        if (n3 <= 0) {
            throw new bj("Node 'SFWorkStationResourceName' has invalid value.");
        }
        cut cut2 = new cut(n2, n3);
        List<Node> list = jsy.c("SFRootResourceName", node);
        if (list.isEmpty()) {
            throw new bj("No 'SFRootResourceName' nodes found for Key=[" + cut2 + "]");
        }
        int[] nArray = new int[list.size()];
        for (n = 0; n < list.size(); ++n) {
            try {
                nArray[n] = kah.dv((Node)list.get(n));
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of rootresourcename " + n + " failed for Key=[" + cut2 + "]", bg2);
            }
        }
        n = 0;
        if (((Element)node).hasAttribute("ResourceAreaID")) {
            n = jsy.d(node, "ResourceAreaID");
        }
        return new cus(cut2, nArray, n);
    }
}

