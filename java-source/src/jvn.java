/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  kah
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jvn {
    private final lju oRy = new lju(0, 1, 0);

    public void uw(String string) {
        if (string == null) {
            throw new bi("FileName is null.");
        }
        try {
            int n;
            Document document = jsy.tJ(string);
            jsy.a(document, this.oRy);
            NodeList nodeList = document.getElementsByTagName("SFTargetGroup");
            if (nodeList.getLength() == 0) {
                lfn.b(2, "SFTargetGroupParser", "loadTargetGroupMap() No 'SFTargetGroup' nodes found.");
                return;
            }
            int n2 = nodeList.getLength();
            for (n = 0; n < n2; ++n) {
                try {
                    ddi ddi2 = this.aB(nodeList.item(n));
                    ddi2.geg = n + 1;
                    if (cxj.ys(ddi2.geg)) {
                        throw new bg("A targetgroup with grouptype=" + ddi2.geg + " already exists.");
                    }
                    if (cxj.iB(ddi2.aEN)) {
                        throw new bg("A targetgroup with groupname='" + ddi2.aEN + "' already exists.");
                    }
                    cxj.a(ddi2.geg, ddi2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of TargetGroup " + n + " failed.", bg2);
                }
            }
            n = cxj.iC("tg_Creatures And Structures");
            if (n <= 0) {
                throw new bg("Could not find targetgroup 'tg_Creatures And Structures'");
            }
            cxj.fWR = n;
        }
        catch (bg bg3) {
            throw new bs("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private ddi aB(Node node) {
        Node node2 = jsy.d("SFGroupName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFGroupName' has invalid value.");
        }
        List<Node> list = jsy.c("SFResourceName", node);
        if (list.isEmpty()) {
            throw new bj("No 'SFResourceName' nodes found for group '" + string + "'");
        }
        int[] nArray = new int[list.size()];
        int n = nArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            try {
                Node node3 = list.get(i2);
                nArray[i2] = kah.dv((Node)node3);
                if (nArray[i2] >= 0) continue;
                String string2 = jsy.m(node3);
                throw new bj("Node 'SFResourceName' has invalid value: '" + string2 + "'");
            }
            catch (bg bg2) {
                throw new bg("Parsing of resourcename " + i2 + " failed for group '" + string + "'", bg2);
            }
        }
        ddi ddi2 = new ddi();
        ddi2.aEN = string;
        ddi2.bqd = nArray;
        return ddi2;
    }
}

