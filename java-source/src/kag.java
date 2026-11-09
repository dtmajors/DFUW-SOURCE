/*
 * Decompiled with CFR.
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class kag {
    public static final lju oRy = new lju(0, 1, 0);
    private les ResourceTree = lea.enW();

    public void vR(String string) {
        if (string == null) {
            throw new bi("FileName is null.");
        }
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, oRy);
            Node node = jsy.d("XML", document);
            List<Node> list = jsy.c("SFResourceHarvestingInfo", node);
            if (list.isEmpty()) {
                return;
            }
            int n = list.size();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    cuj cuj2 = this.dt(list.get(i2));
                    if (cxj.bt(cuj2.az(), cuj2.FW())) {
                        throw new bg("ResourceHarvestingInfo for resource '" + cuj2.pa() + "', with area '" + cuj2.FW() + "', already exists.");
                    }
                    cxj.a(cuj2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of resourceharvestinginfo " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            lfn.b(5, this.getClass().getSimpleName(), "loadResourceHarvestingInfoMap: " + bg3.getMessage());
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private ctk ds(Node node) {
        String string = jsy.c(node, "ResourceName");
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            throw new bj("Attribute 'SFResourceName' has invalid value.");
        }
        int n2 = jsy.d(node, "Quantity");
        if (n2 < 1) {
            throw new bj("Attribute 'Quantity' has invalid value.");
        }
        float f2 = jsy.e(node, "Probability");
        if (f2 <= 0.0f || f2 > 1.0f) {
            throw new bj("Attribute 'Probability' has invalid value.");
        }
        String string2 = jsy.c(node, "Mult");
        lmc lmc2 = lmc.getValueByName(string2);
        if (lmc2 == null) {
            throw new bj("Attribute 'Mult' has invalid value.");
        }
        ctk ctk2 = new ctk();
        ctk2.ResourceType = n;
        ctk2.asi = n2;
        ctk2.Probability = f2;
        ctk2.ffZ = lmc2;
        return ctk2;
    }

    private cuj dt(Node node) {
        List<Node> list;
        String string = jsy.c(node, "ResourceName");
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            throw new bj("Attribute 'SFResourceName' has invalid value.");
        }
        int n2 = jsy.d(node, "NumberOfStartResources");
        int n3 = jsy.d(node, "TimeToReplenishOne");
        lmc lmc2 = lmc.getValueByName(jsy.c(node, "NumberOfStartResourcesMult"));
        lmc lmc3 = lmc.getValueByName(jsy.c(node, "TimeToReplenishOneMult"));
        int n4 = 0;
        if (((Element)node).hasAttribute("ResourceAreaID")) {
            n4 = jsy.d(node, "ResourceAreaID");
        }
        if ((list = jsy.c("SFHarvestingItem", node)).isEmpty()) {
            throw new bj("No 'SFHarvestingItem' nodes found for resource '" + string + "'");
        }
        ctk[] ctkArray = new ctk[list.size()];
        int n5 = list.size();
        for (int i2 = 0; i2 < n5; ++i2) {
            try {
                ctkArray[i2] = this.ds(list.get(i2));
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of harvestingitem " + i2 + " for resource '" + string + "' failed.", bg2);
            }
        }
        float f2 = 0.0f;
        int n6 = ctkArray.length;
        for (n5 = 0; n5 < n6; ++n5) {
            f2 += ctkArray[n5].Probability;
        }
        if (f2 < 0.999995f) {
            throw new bg("TotalProbability < 1.0");
        }
        if (f2 > 1.000005f) {
            throw new bg("TotalProbability > 1.0");
        }
        cuj cuj2 = new cuj(n, ctkArray);
        cuj2.wP(n2);
        cuj2.wQ(n3);
        cuj2.a(lmc2);
        cuj2.b(lmc3);
        cuj2.gJ(n4);
        return cuj2;
    }
}

