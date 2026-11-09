/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jzv {
    public static final lju eM = new lju(0, 1, 0);
    private les DX = lea.enT();
    private les ResourceTree = lea.enW();

    public void vL(String string) {
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, eM);
            Node node = jsy.d("XML", document);
            List<Node> list = jsy.c("HostileLiquid", node);
            if (list.isEmpty()) {
                return;
            }
            Map<Integer, ctl> map = lea.eoX();
            int n = list.size();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    ctl ctl2 = this.cS(list.get(i2));
                    if (map.containsKey(ctl2.ResourceType)) {
                        throw new bp("A hostileliquidinfo for resource '" + ctl2.pa() + "' already exists.");
                    }
                    map.put(ctl2.ResourceType, ctl2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of node " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private ctl cS(Node node) {
        assert (node != null);
        String string = jsy.c(node, "ResourceName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'ResourceName' has invalid value.");
        }
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            throw new bj("ResourceName '" + string + "' is invalid.");
        }
        float f = jsy.e(node, "DamageMagnitude");
        if (f >= 0.0f) {
            throw new bj("Attribute 'DamageMagnitude' has invalid value.");
        }
        String string2 = jsy.c(node, "EffectName");
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Attribute 'EffectName' has invalid value.");
        }
        int n2 = this.DX.getType(string2);
        if (n2 <= 0) {
            throw new bj("EffectName '" + string2 + "' is invalid.");
        }
        String string3 = jsy.c(node, "AttributeName");
        if (string3 == null || string3.trim().equals("")) {
            throw new bj("Attribute 'AttributeName' has invalid value.");
        }
        int n3 = ep.as((String)string3);
        if (n3 <= 0) {
            throw new bj("AttributeName '" + string3 + "' is invalid.");
        }
        String string4 = jsy.c(node, "SpecialEffectName");
        if (string4 == null || string4.trim().equals("")) {
            throw new bj("Attribute 'SpecialEffectName' has invalid value.");
        }
        int n4 = del.dr(string4);
        if (n4 <= 0) {
            throw new bj("SpecialEffectName '" + string4 + "' is invalid.");
        }
        return new ctl(n, f, n2, n3, n4);
    }
}

