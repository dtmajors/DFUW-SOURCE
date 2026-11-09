/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Node;

public class jzz {
    private jzp oRz = new jzp();

    public alt cV(Node node) {
        if (node == null) {
            throw new bi("ModifierNode is null.");
        }
        try {
            Node node2 = jsy.d("SFModifierClassName", node);
            String string = jsy.m(node2);
            if (string == null || string.trim().equals("")) {
                throw new bj("ModifierClassName is invalid.");
            }
            if (string.equalsIgnoreCase("SFFloatAttributeModifier")) {
                return this.a(node, new als());
            }
            if (string.equalsIgnoreCase("SFBooleanAttributeModifier")) {
                return this.a(node, new alr());
            }
            throw new bp("Invalid ModifierClassName found: " + string);
        }
        catch (bg bg2) {
            throw new bg("Parsing of modifiernode failed.", bg2);
        }
    }

    private alr a(Node node, alr alr2) {
        assert (node != null) : "ModifierNode is null!";
        assert (alr2 != null) : "Modifier is null!";
        this.a(node, (alq)alr2);
        Node node2 = jsy.d("SFModifierValue", node);
        boolean bl = jsy.t(node2);
        alr2.bc(bl);
        return alr2;
    }

    private als a(Node node, als als2) {
        assert (node != null) : "ModifierNode is null!";
        assert (als2 != null) : "Modifier is null!";
        this.a(node, (alq)als2);
        Node node2 = jsy.d("SFModifierValue", node);
        float f = jsy.o(node2);
        als2.aq(f);
        node2 = jsy.d("SFTickIncrease", node);
        float f2 = jsy.o(node2);
        als2.ar(f2);
        return als2;
    }

    private void a(Node node, alq alq2) {
        assert (node != null) : "ModifierNode is null!";
        assert (alq2 != null) : "Modifier is null!";
        this.b(node, alq2);
        Node node2 = jsy.d("SFAttributeName", node);
        int n = this.oRz.cI(node2);
        if (n <= 0) {
            throw new bj("AttributeType is invalid.");
        }
        alq2.fC(n);
    }

    private void b(Node node, alq alq2) {
        assert (node != null) : "ModifierNode is null!";
        assert (alq2 != null) : "Modifier is null!";
        Node node2 = jsy.a("SFGUID", node);
        if (node2 != null) {
            ldv ldv2 = jsy.D(node2);
            if (ldv2 == null) {
                throw new bj("Node 'SFGUID' has invalid value.");
            }
            alq2.setGUID(ldv2);
        } else {
            lfn.b(0, "SFModifierParser", "parseSFModifierNode() Modifier does not have a GUID.");
        }
        node2 = jsy.d("SFExpirationTime", node);
        double d2 = jsy.q(node2);
        if (d2 <= 0.0 && d2 != -3.0 && d2 != -2.0) {
            throw new bj("ExpirationTime is invalid.");
        }
        alq2.x(d2);
        node2 = jsy.d("SFModifierLayerName", node);
        int n = this.cW(node2);
        alq2.ga(n);
        node2 = jsy.d("SFModifierConfigType", node);
        int n2 = this.cX(node2);
        alq2.gb(n2);
        node2 = jsy.d("SFNumberOfTicks", node);
        int n3 = jsy.r(node2);
        if (n3 < 0) {
            throw new bj("NumberOfTicks is invalid.");
        }
        alq2.gc(n3);
        Node node3 = jsy.a("SFCauseObjectGUID", node);
        if (node3 != null) {
            ldv ldv3 = jsy.D(node3);
            if (ldv3 == null) {
                throw new bj("Node 'SFCauseObjectGUID' has invalid value.");
            }
            alq2.cP(ldv3);
            node2 = jsy.d("SFCauseSkillName", node);
            int n4 = kbi.eM(node2);
            if (n4 <= 0) {
                throw new bj("CauseSkillType is invalid.");
            }
            alq2.ge(n4);
            node2 = jsy.d("SFEffectName", node);
            int n5 = this.oRz.cI(node2);
            if (n5 <= 0) {
                throw new bj("EffectName is invalid.");
            }
            alq2.fJ(n5);
            node2 = jsy.d("SFSessionID", node);
            int n6 = jsy.r(node2);
            if (n6 <= 0) {
                throw new bj("SessionID is invalid.");
            }
            alq2.gf(n6);
        }
    }

    public int cW(Node node) {
        if (node == null) {
            throw new bi("LayerNode is null.");
        }
        String string = jsy.m(node);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node '" + node.getNodeName() + "' has invalid value.");
        }
        int n = alv.cN(string);
        if (n <= 0) {
            throw new bj("ModifierLayerName '" + string + "' is invalid.");
        }
        return n;
    }

    public int cX(Node node) {
        boolean bl;
        if (node == null) {
            throw new bi("ConfigNode is null.");
        }
        int n = 0;
        Node node2 = jsy.d("SFConvertToPermanentModification", node);
        boolean bl2 = jsy.t(node2);
        if (bl2) {
            n |= 1;
        }
        if (bl = jsy.t(node2 = jsy.d("SFTickToChangeValue", node))) {
            n |= 4;
        }
        return n;
    }
}

