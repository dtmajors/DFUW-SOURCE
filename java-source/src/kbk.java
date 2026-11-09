/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  kah
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kbk {
    public static final lju oRy = new lju(0, 1, 0);

    public void wp(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, oRy);
            NodeList nodeList = document.getElementsByTagName("SFThrowableWeaponInfo");
            if (nodeList.getLength() == 0) {
                lfn.b(2, "SFThrowableWeaponInfoParser", "loadThrowableWeaponInfoMap() No 'SFThrowableWeaponInfo' nodes found.");
                return;
            }
            Map<Integer, ddv> map = lea.eoI();
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                try {
                    ddv ddv2 = this.eZ(nodeList.item(i2));
                    if (map.containsKey(ddv2.ResourceType)) {
                        throw new bg("A throwableweaponifo for resource '" + ddv2.pa() + "' already exists.");
                    }
                    map.put(ddv2.ResourceType, ddv2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of throwableweaponifo " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private ddv eZ(Node node) {
        Node node2 = jsy.d("SFResourceName", node);
        int n = kah.dv((Node)node2);
        if (n <= 0) {
            throw new bj("Node 'SFResourceName' has invalid value.");
        }
        node2 = jsy.d("SFAreaDuration", node);
        float f2 = jsy.o(node2);
        if (f2 < 0.0f) {
            throw new bj("Node 'SFAreaDuration' has invalid value.");
        }
        List<Node> list = jsy.c("SFSubSkillName", node);
        if (list.isEmpty()) {
            throw new bj("No 'SFSubSkillName' nodes found.");
        }
        int[] nArray = new int[list.size()];
        int n2 = nArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            try {
                nArray[i2] = kbi.eM(list.get(i2));
                if (nArray[i2] > 0) continue;
                throw new bj("Node '" + i2 + "' has invalid value.");
            }
            catch (bg bg2) {
                throw new bg("SubSkillType " + i2 + " could not be parsed for resource '" + lea.enW().getName(n) + "'", bg2);
            }
        }
        ddv ddv2 = new ddv();
        ddv2.ResourceType = n;
        ddv2.gew = f2;
        ddv2.gex = nArray;
        return ddv2;
    }
}

