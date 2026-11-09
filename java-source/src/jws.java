/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jws {
    private static final String oYh = "Attack";
    private static final String oYi = "EffectName";
    private static final String oYj = "GlobalRateOfFire";
    private static final String oYk = "Magnitude";
    private static final lju oRy = new lju(0, 0, 1);
    private static final String oBN = "Race";
    private static final String oYl = "Radius";
    private static final String oYm = "RateOfFire";
    private static final String oYn = "SFGuardTowerInfo";
    private static final String oYo = "SFXName";
    private static final String TYPE = "TowerType";
    private static final String oYp = "WeaponsAndSpellsAttacks";
    private static final String oYq = "SuperChargeTime";
    private static final String oYr = "SuperChargeDamageMultiplier";
    private static final String oYs = "SuperChargeResource";

    public void uT(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        try {
            NodeList nodeList = document.getElementsByTagName(oYn);
            if (nodeList.getLength() == 0) {
                return;
            }
            Map<Integer, asb> map = lea.eoR();
            asb asb2 = null;
            String string2 = null;
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                asb2 = null;
                try {
                    asb2 = this.bg(nodeList.item(i2));
                    string2 = asb2.SN();
                    if (map.containsKey(new Integer(asb2.SO()))) {
                        throw new bg("A GuardTower with ResourceName='" + string2 + "' already exists.");
                    }
                    map.put(new Integer(asb2.SO()), asb2);
                    continue;
                }
                catch (bg bg2) {
                    if (asb2 != null && string2 != null) {
                        throw new bg("Parsing of GuardTower With ResourceName'" + string2 + "' failed.", bg2);
                    }
                    throw new bg("Parsing of GuardTower " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private float a(Node node, String string, boolean bl) {
        Node node2 = jsy.a(string, node);
        if (node2 == null) {
            if (bl) {
                throw new bj("Node '" + string + "' does not exist.");
            }
            return 0.0f;
        }
        float f = jsy.o(node2);
        if (f <= 0.0f) {
            if (bl) {
                throw new bj("Invalid Node Value: " + f);
            }
            f = 0.0f;
        }
        return f;
    }

    private String b(Node node, String string, boolean bl) {
        Node node2 = jsy.a(string, node);
        if (node2 == null) {
            if (bl) {
                throw new bj("Node '" + string + "' does not exist.");
            }
            return null;
        }
        String string2 = jsy.m(node2);
        if ((string2 == null || string2.trim().equals("")) && bl) {
            throw new bj("Node '" + string + "' has invalid value.");
        }
        return string2;
    }

    private asb bg(Node node) {
        String string = this.b(node, "SFResourceName", true);
        int n = lea.enW().getType(string);
        asb asb2 = new asb();
        asb2.hQ(n);
        String string2 = this.b(node, oBN, true);
        int n2 = lea.enW().getType(string2);
        asb2.P(n2);
        string2 = this.b(node, TYPE, true);
        if (asb.a.bTi.name().equalsIgnoreCase(string2)) {
            asb2.a(asb.a.bTi);
        } else if (asb.a.bTj.name().equalsIgnoreCase(string2)) {
            asb2.a(asb.a.bTj);
        } else {
            throw new bj("Invalid Node Value: " + string2);
        }
        asb2.setRadius(this.a(node, oYl, true));
        float f = this.a(node, oYj, true);
        asb2.bN(f);
        boolean bl = cug.wc((int)n);
        float f2 = this.a(node, oYq, bl);
        asb2.bO(f2);
        float f3 = this.a(node, oYr, bl);
        asb2.bP(f3);
        String string3 = this.b(node, oYs, bl);
        asb2.dS(string3);
        Node node2 = jsy.a(oYp, node);
        List<Node> list = jsy.c(oYh, node2);
        for (Node node3 : list) {
            String string4 = this.b(node3, oYi, true);
            String string5 = this.b(node3, oYo, true);
            float f4 = this.a(node3, oYk, true);
            float f5 = this.a(node3, oYm, false);
            f5 = f5 == 0.0f ? f : f5;
            asa asa2 = new asa(string4, string5, f4, f5);
            asb2.a(asa2);
        }
        return asb2;
    }
}

