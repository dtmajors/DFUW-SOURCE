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

public class jvw {
    private final lju oRy = new lju(0, 1, 0);
    private les ResourceTree = lea.enW();

    public void uB(String string) {
        if (string == null) {
            throw new bi("FileName is null.");
        }
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, this.oRy);
            NodeList nodeList = document.getElementsByTagName("SFWeaponMagnitudeModifier");
            if (nodeList.getLength() == 0) {
                return;
            }
            int n = nodeList.getLength();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    ddz ddz2 = this.aI(nodeList.item(i2));
                    if (cxj.yy(ddz2.ResourceType)) {
                        throw new bg("A weaponmagnitudemodifier for resource '" + ddz2.pa() + " already exists.");
                    }
                    cxj.a(ddz2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of weaponmagnitudemodifier " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bs("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private dbu aH(Node node) {
        Node node2 = jsy.d("SFSkillName", node);
        int n = kbi.eM(node2);
        if (n <= 0) {
            throw new bj("Node 'SFSkillName' has invalid value.");
        }
        node2 = jsy.d("SFModifierValue", node);
        float f = jsy.o(node2);
        if (f == 0.0f) {
            throw new bj("Node 'SFModifierValue' has invalid value.");
        }
        return new dbu(n, f);
    }

    private ddz aI(Node node) {
        Node node2 = jsy.d("SFResourceName", node);
        int n = kah.dv((Node)node2);
        if (n <= 0) {
            String string = jsy.m(node2);
            throw new bj("Node 'SFResourceName' has invalid value: '" + string + "'");
        }
        List<Node> list = jsy.c("SFMagnitudeModifier", node);
        if (list.isEmpty()) {
            throw new bj("No 'SFMagnitudeModifier' nodes found for resource '" + this.ResourceTree.getName(n) + "'");
        }
        dbu[] dbuArray = new dbu[list.size()];
        int n2 = dbuArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            try {
                dbuArray[i2] = this.aH(list.get(i2));
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of magnitudemodifier " + i2 + " failed for resource '" + this.ResourceTree.getName(n) + "'", bg2);
            }
        }
        return new ddz(n, dbuArray);
    }
}

