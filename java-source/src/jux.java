/*
 * Decompiled with CFR.
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jux {
    private final lju oRy = new lju(0, 1, 0);

    public void up(String string) {
        if (string == null) {
            throw new bi("FileName is null.");
        }
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, this.oRy);
            NodeList nodeList = document.getElementsByTagName("SFBlockingGroup");
            if (nodeList.getLength() == 0) {
                return;
            }
            int n = nodeList.getLength();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    dcj dcj2 = this.ak(nodeList.item(i2));
                    if (cxj.a(dcj2.fYc)) {
                        throw new bg("A blockinggroup with blockinggrouptype " + (Object)((Object)dcj2.fYc) + " already exists.");
                    }
                    cxj.a(dcj2.fYc, dcj2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of blockinggroup " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bs("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private dcj ak(Node node) {
        Node node2 = jsy.d("SFGroupName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFGroupName' has invalid value.");
        }
        cxd.b b2 = cxd.b.getBlockingGroupType(string);
        if (b2 == null) {
            throw new bj("BlockingGroupName '" + string + "' is invalid.");
        }
        List<Node> list = jsy.c("SFSkillName", node);
        if (list.isEmpty()) {
            throw new bj("No 'SFSkillName' nodes found for blockinggroup '" + string + "'");
        }
        int[] nArray = new int[list.size()];
        int n = nArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            try {
                Node node3 = list.get(i2);
                nArray[i2] = kbi.eM(node3);
                if (nArray[i2] >= 0) continue;
                String string2 = jsy.m(node3);
                throw new bj("Node 'SFSkillName' has invalid value: '" + string2 + "'");
            }
            catch (bg bg2) {
                throw new bg("Parsing of skillname " + i2 + " failed for blockinggroup '" + string + "'", bg2);
            }
        }
        return new dcj(b2, nArray);
    }
}

