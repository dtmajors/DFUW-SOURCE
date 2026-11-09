/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  kah
 */
import org.w3c.dom.Node;

public class kax {
    private boolean pal = false;
    private jzp oRz = new jzp();
    private static les DX = lea.enT();
    private static les ResourceTree = lea.enW();

    public kax(boolean bl) {
        this.pal = bl;
    }

    public aja j(Node node, boolean bl) {
        if (node == null) {
            throw new bi("Constraint node is null.");
        }
        Node node2 = jsy.a("SFConstraintName", node);
        if (node2 == null) {
            throw new bn("Node 'SFConstraintName' was not found.");
        }
        ajb.b b2 = null;
        aja aja2 = null;
        try {
            b2 = this.ew(node2);
            switch (b2) {
                case bow: {
                    aja2 = this.dA(node);
                    break;
                }
                case box: {
                    aja2 = this.dB(node);
                    break;
                }
                case boy: {
                    aja2 = this.dC(node);
                    break;
                }
                case boz: {
                    aja2 = this.dD(node);
                    break;
                }
                case boA: {
                    aja2 = this.dE(node);
                    break;
                }
                case boB: {
                    aja2 = this.dF(node);
                    break;
                }
                case boC: {
                    aja2 = this.dG(node);
                    break;
                }
                case boD: {
                    aja2 = this.dH(node);
                    break;
                }
                case boE: {
                    aja2 = this.dI(node);
                    break;
                }
                case boF: {
                    aja2 = this.dK(node);
                    break;
                }
                case boG: {
                    aja2 = this.dM(node);
                    break;
                }
                case boI: {
                    aja2 = this.dN(node);
                    break;
                }
                case boH: {
                    aja2 = this.dO(node);
                    break;
                }
                case boL: {
                    aja2 = this.dP(node);
                    break;
                }
                case boM: {
                    aja2 = this.dQ(node);
                    break;
                }
                case boN: {
                    aja2 = this.dR(node);
                    break;
                }
                case boO: {
                    aja2 = this.dS(node);
                    break;
                }
                case boP: {
                    aja2 = this.dT(node);
                    break;
                }
                case boQ: {
                    aja2 = this.dU(node);
                    break;
                }
                case boR: {
                    aja2 = this.dV(node);
                    break;
                }
                case boS: {
                    aja2 = this.dW(node);
                    break;
                }
                case boT: {
                    aja2 = this.dX(node);
                    break;
                }
                case boU: {
                    aja2 = this.dY(node);
                    break;
                }
                case boV: {
                    aja2 = this.ea(node);
                    break;
                }
                case boW: {
                    aja2 = this.dZ(node);
                    break;
                }
                case boX: {
                    aja2 = this.eb(node);
                    break;
                }
                case boY: {
                    aja2 = this.ec(node);
                    break;
                }
                case boZ: {
                    aja2 = this.ed(node);
                    break;
                }
                case bpa: {
                    aja2 = this.ee(node);
                    break;
                }
                case bpb: {
                    aja2 = this.ef(node);
                    break;
                }
                case bpc: {
                    aja2 = this.ej(node);
                    break;
                }
                case bpd: {
                    aja2 = this.ek(node);
                    break;
                }
                case bpe: {
                    aja2 = this.el(node);
                    break;
                }
                case bpf: {
                    aja2 = this.em(node);
                    break;
                }
                case bpg: {
                    aja2 = this.en(node);
                    break;
                }
                case bph: {
                    aja2 = this.eo(node);
                    break;
                }
                case bpi: {
                    aja2 = this.eq(node);
                    break;
                }
                case bpj: {
                    aja2 = this.er(node);
                    break;
                }
                case bpk: {
                    aja2 = this.ep(node);
                    break;
                }
                case bpl: {
                    aja2 = this.es(node);
                    break;
                }
                case bpm: {
                    aja2 = this.et(node);
                    break;
                }
                case bpn: {
                    aja2 = this.eu(node);
                    break;
                }
                case bpo: {
                    aja2 = this.ev(node);
                    break;
                }
                case bpp: {
                    if (!bl) break;
                    aja2 = this.ef(node);
                    break;
                }
                case boK: {
                    aja2 = this.eg(node);
                    break;
                }
                case boJ: {
                    aja2 = this.ei(node);
                    break;
                }
                case bpq: {
                    aja2 = this.dJ(node);
                    break;
                }
                case bpr: {
                    aja2 = this.dL(node);
                    break;
                }
                case bps: {
                    aja2 = this.eh(node);
                    break;
                }
                default: {
                    lfn.b(5, "SFConstraintParser", "parseSFConstraintNode() Unhandled ConstraintType found: " + (Object)((Object)b2));
                    lfn.b(5, "SFConstraintParser", "parseSFConstraintNode() Missing case in SFConstraintParser!");
                    throw new bo("ConstraintType=" + (Object)((Object)b2) + " is invalid.");
                }
            }
        }
        catch (bg bg2) {
            if (b2 == null) {
                throw new bg("Parsing of node for constraint failed.", bg2);
            }
            throw new bg("Parsing of node for constraint '" + b2.name() + "' failed.", bg2);
        }
        return aja2;
    }

    private void a(Node node, aja aja2) {
        Node node2 = jsy.d("SFCheckName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFCheckName' has invalid value.");
        }
        ajb.a a2 = ajb.a.getCheckType(string);
        if (a2 == null) {
            throw new bj("CheckName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFInvertCheck", node);
        boolean bl = jsy.t(node2);
        if (bl && !ajb.b.isSupportInvertingCheck(aja2.Cl())) {
            throw new bj("Constraint '" + (Object)((Object)aja2.Cl()) + "' does not support inverting the check.");
        }
        aja2.a(a2);
        aja2.aY(bl);
    }

    private air dA(Node node) {
        air air2 = new air();
        this.a(node, air2);
        Node node2 = jsy.d("SFRequiredAlignment", node);
        int n = jsy.r(node2);
        if (n > 10) {
            throw new bj("Node 'SFRequiredAlignment' has too high value.");
        }
        if (n < -10) {
            throw new bj("Node 'SFRequiredAlignment' has too low value.");
        }
        node2 = jsy.d("SFOperatorName", node);
        int n2 = this.ex(node2);
        if (n2 <= 0) {
            throw new bj("Node 'SFOperatorName' has invalid value.");
        }
        air2.fA(n);
        air2.fB(n2);
        return air2;
    }

    private ais dB(Node node) {
        ais ais2 = new ais();
        this.a(node, ais2);
        Node node2 = jsy.d("SFAttributeName", node);
        int n = this.oRz.cI(node2);
        if (n <= 0) {
            throw new bj("Node 'SFAttributeName' has invalid value: " + n);
        }
        node2 = jsy.d("SFRequiredAttributeValue", node);
        boolean bl = jsy.t(node2);
        ais2.fC(n);
        ais2.aV(bl);
        return ais2;
    }

    private void a(Node node, ait ait2) {
        this.a(node, (aja)ait2);
        Node node2 = jsy.d("SFAttributeName", node);
        int n = this.oRz.cI(node2);
        if (n <= 0) {
            throw new bj("Node 'SFAttributeName' has invalid value: " + n);
        }
        node2 = jsy.d("SFOperatorName", node);
        int n2 = this.ex(node2);
        if (n2 <= 0) {
            throw new bj("Node 'SFOperatorName' has invalid value");
        }
        node2 = jsy.d("SFCreateSkillConsume", node);
        boolean bl = jsy.t(node2);
        ait2.fC(n);
        ait2.fB(n2);
        if (bl && this.pal) {
            dbr dbr2 = new dbr();
            ait2.a(dbr2);
        }
    }

    private aiu dC(Node node) {
        aiu aiu2 = new aiu();
        this.a(node, aiu2);
        return aiu2;
    }

    private void a(Node node, aiu aiu2) {
        this.a(node, (ait)aiu2);
        Node node2 = jsy.d("SFGeneralSkillFunction", node);
        boolean bl = jsy.t(node2);
        node2 = jsy.d("SFSkillFunctionName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFSkillFunctionName' has invalid value.");
        }
        int n = cxh.ix(string);
        if (n <= 0) {
            throw new bj("SkillFunctionName '" + string + "' is invalid.");
        }
        aiu2.aW(bl);
        aiu2.fD(n);
    }

    private aiv dD(Node node) {
        aiv aiv2 = new aiv();
        this.a(node, aiv2);
        Node node2 = jsy.d("SFAttributeName", node);
        int n = this.oRz.cI(node2);
        if (n <= 0) {
            throw new bj("Node 'SFAttributeName' has invalid value: " + n);
        }
        node2 = jsy.d("SFModificationName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFModificationName' has invalid value.");
        }
        ajb.d d2 = ajb.d.getModificationType(string);
        if (d2 == null) {
            throw new bj("ModificationName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFMaxValue", node);
        float f2 = jsy.o(node2);
        if (f2 < 0.0f) {
            throw new bj("Node 'SFMaxValue' has invalid value.");
        }
        node2 = jsy.d("SFMinValue", node);
        float f3 = jsy.o(node2);
        if (f3 < 0.0f) {
            throw new bj("Node 'SFMinValue' has invalid value.");
        }
        aiv2.fC(n);
        aiv2.a(d2);
        aiv2.ah(f2);
        aiv2.ai(f3);
        return aiv2;
    }

    private aiw dE(Node node) {
        aiw aiw2 = new aiw();
        this.a(node, aiw2);
        Node node2 = jsy.d("SFAttributeName", node);
        int n = this.oRz.cI(node2);
        if (n <= 0) {
            throw new bj("Node 'SFAttributeName' has invalid value: " + n);
        }
        node2 = jsy.d("SFLargeSkillFunctionName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFLargeSkillFunctionName' has invalid value.");
        }
        int n2 = cxh.ix(string);
        if (n2 <= 0) {
            throw new bj("LargeSkillFunctionName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFSmallSkillFunctionName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFSmallSkillFunctionName' has invalid value.");
        }
        int n3 = cxh.ix(string2);
        if (n3 <= 0) {
            throw new bj("SmallSkillFunctionName '" + string2 + "' is invalid.");
        }
        aiw2.fC(n);
        aiw2.fE(n2);
        aiw2.fF(n3);
        return aiw2;
    }

    private aix dF(Node node) {
        aix aix2 = new aix();
        this.a(node, aix2);
        Node node2 = jsy.d("SFInactivateRegeneration", node);
        boolean bl = jsy.t(node2);
        aix2.aX(bl);
        return aix2;
    }

    private aiy dG(Node node) {
        aiy aiy2 = new aiy();
        this.a(node, aiy2);
        Node node2 = jsy.d("SFLimitValue", node);
        aiy2.aj(jsy.o(node2));
        return aiy2;
    }

    private aiz dH(Node node) {
        aiz aiz2 = new aiz();
        this.a(node, aiz2);
        return aiz2;
    }

    private ajd dI(Node node) {
        ajd ajd2 = new ajd();
        this.a(node, ajd2);
        return ajd2;
    }

    private akf dJ(Node node) {
        akf akf2 = new akf();
        this.a(node, akf2);
        return akf2;
    }

    private aje dK(Node node) {
        aje aje2 = new aje();
        this.a(node, aje2);
        return aje2;
    }

    private akg dL(Node node) {
        akg akg2 = new akg();
        this.a(node, akg2);
        return akg2;
    }

    private void a(Node node, ajf ajf2) {
        this.a(node, (aja)ajf2);
        Node node2 = jsy.d("SFMaxDistance", node);
        float f2 = jsy.o(node2);
        if (f2 <= 0.0f) {
            throw new bj("Node 'SFMaxDistance' has invalid value.");
        }
        node2 = jsy.d("SFMinDistance", node);
        float f3 = jsy.o(node2);
        if (f3 < 0.0f) {
            throw new bj("Node 'SFMinDistance' has invalid value.");
        }
        if (f2 < f3) {
            throw new bj("MaxDistance < MinDistance.");
        }
        ajf2.setMaxDistance(f2);
        ajf2.setMinDistance(f3);
    }

    private ajh dM(Node node) {
        ajh ajh2 = new ajh();
        this.a(node, ajh2);
        return ajh2;
    }

    private ajg dN(Node node) {
        ajg ajg2 = new ajg();
        this.a(node, ajg2);
        return ajg2;
    }

    private aji dO(Node node) {
        aji aji2 = new aji();
        this.a(node, aji2);
        Node node2 = jsy.d("SFCraftingWorkStation", node);
        boolean bl = jsy.t(node2);
        aji2.aZ(bl);
        return aji2;
    }

    private ajk dP(Node node) {
        ajk ajk2 = new ajk();
        this.a(node, ajk2);
        return ajk2;
    }

    private void a(Node node, ajk ajk2) {
        this.a(node, (ajm)ajk2);
        Node node2 = jsy.d("SFEffectName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFEffectName' has invalid value.");
        }
        int n = DX.getType(string);
        if (n <= 0) {
            throw new bj("EffectName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFOperatorName", node);
        int n2 = this.ex(node2);
        if (n2 <= 0) {
            throw new bj("Node 'SFOperatorName' has invalid value");
        }
        node2 = jsy.d("SFMagnitude", node);
        float f2 = jsy.o(node2);
        if (f2 <= 0.0f) {
            throw new bj("Node 'SFMagnitude' has invalid value");
        }
        ajk2.fJ(n);
        ajk2.fB(n2);
        ajk2.N(f2);
    }

    private ajl dQ(Node node) {
        ajl ajl2 = new ajl();
        this.a(node, ajl2);
        return ajl2;
    }

    private ajm dR(Node node) {
        ajm ajm2 = new ajm();
        this.a(node, ajm2);
        return ajm2;
    }

    private void a(Node node, ajm ajm2) {
        this.a(node, (aja)ajm2);
        Node node2 = jsy.d("SFEventName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFEventName' has invalid value.");
        }
        int n = bfo.ft(string);
        if (n <= 0) {
            throw new bj("EventName '" + string + "' is invalid.");
        }
        ajm2.setEventType(n);
    }

    private ajn dS(Node node) {
        ajn ajn2 = new ajn();
        this.a(node, ajn2);
        return ajn2;
    }

    private ajj dT(Node node) {
        ajj ajj2 = new ajj();
        this.a(node, ajj2);
        return ajj2;
    }

    private ajz dU(Node node) {
        ajz ajz2 = new ajz();
        this.a(node, ajz2);
        return ajz2;
    }

    private ajp dV(Node node) {
        ajp ajp2 = new ajp();
        this.a(node, ajp2);
        return ajp2;
    }

    private ajq dW(Node node) {
        ajq ajq2 = new ajq();
        this.a(node, ajq2);
        Node node2 = jsy.d("SFLayerName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFLayerName' has invalid value.");
        }
        cak.c c2 = cak.c.findLayerType(string);
        if (c2 == null) {
            throw new bj("LayerName '" + string + "' is invalid.");
        }
        ajq2.b(c2);
        return ajq2;
    }

    private ajr dX(Node node) {
        ajr ajr2 = new ajr();
        this.a(node, ajr2);
        return ajr2;
    }

    private void a(Node node, ajt ajt2) {
        this.a(node, (aja)ajt2);
        Node node2 = jsy.d("SFModeName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFModeName' has invalid value.");
        }
        int n = byw.gJ(string);
        if (n <= 0) {
            throw new bj("ModeName '" + string + "' is invalid.");
        }
        ajt2.fK(n);
    }

    private aju dY(Node node) {
        aju aju2 = new aju();
        this.a(node, aju2);
        Node node2 = jsy.d("SFModeValueName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFModeValueName' has invalid value.");
        }
        int n = byw.n(aju2.CS(), string);
        if (n <= 0) {
            throw new bj("ModeValueName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFModeValueName2", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFModeValueName2' has invalid value.");
        }
        int n2 = byw.n(aju2.CS(), string2);
        if (n2 <= 0) {
            throw new bj("ModeValueName2 '" + string2 + "' is invalid.");
        }
        aju2.f(new int[]{n, n2});
        return aju2;
    }

    private ajw dZ(Node node) {
        ajw ajw2 = new ajw();
        this.a(node, ajw2);
        Node node2 = jsy.d("SFModeValueName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFModeValueName' has invalid value.");
        }
        int n = byw.n(ajw2.CS(), string);
        if (n <= 0) {
            throw new bj("ModeValueName '" + string + "' is invalid.");
        }
        ajw2.fO(n);
        return ajw2;
    }

    private void a(Node node, akh akh2) {
        this.a(node, (aja)akh2);
        Node node2 = jsy.d("SFSensorName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFSensorName' has invalid value.");
        }
        cvk.a a2 = cvk.a.getSensorType(string);
        if (a2 == null) {
            throw new bj("SensorName '" + string + "' is invalid.");
        }
        akh2.a(a2);
    }

    private ajv ea(Node node) {
        ajv ajv2 = new ajv();
        this.a(node, ajv2);
        int n = cvk.a.getModeType(ajv2.Do());
        if (n <= 0) {
            throw new bj("ModeType is invalid for sensorname '" + ajv2.Do().name() + "'");
        }
        Node node2 = jsy.d("SFModeValueName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFModeValueName' has invalid value.");
        }
        int n2 = byw.n(n, string);
        if (n2 <= 0) {
            throw new bj("ModeValueName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFTriggerOnChangeFromModeValue", node);
        boolean bl = jsy.t(node2);
        ajv2.fO(n2);
        ajv2.ba(bl);
        return ajv2;
    }

    private ajx eb(Node node) {
        ajx ajx2 = new ajx();
        this.a(node, ajx2);
        Node node2 = jsy.d("SFVelocity", node);
        float f2 = jsy.o(node2);
        if (f2 < 0.0f) {
            throw new bj("Node 'SFVelocity' has invalid value.");
        }
        ajx2.setVelocity(f2);
        return ajx2;
    }

    private ajy ec(Node node) {
        ajy ajy2 = new ajy();
        this.a(node, ajy2);
        Node node2 = jsy.d("SFGeneralSkillFunction", node);
        boolean bl = jsy.t(node2);
        node2 = jsy.d("SFSkillFunctionName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFTimerLengthSkillFunctionName' has invalid value.");
        }
        int n = cxh.ix(string);
        if (n <= 0) {
            throw new bj("SkillFunctionName '" + string + "' is invalid.");
        }
        ajy2.aW(bl);
        ajy2.fD(n);
        return ajy2;
    }

    private void a(Node node, aka aka2) {
        this.a(node, (aja)aka2);
        int[] nArray = new int[2];
        Node node2 = jsy.d("SFResourceName", node);
        nArray[0] = kah.dv((Node)node2);
        if (nArray[0] <= 0) {
            throw new bj("Node 'SFResourceName' has invalid value.");
        }
        node2 = jsy.d("SFResourceName2", node);
        nArray[1] = kah.dv((Node)node2);
        if (nArray[1] <= 0) {
            throw new bj("Node 'SFResourceName2' has invalid value.");
        }
        node2 = jsy.d("SFItemStateName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFItemStateName' has invalid value.");
        }
        bqm.c c2 = bqm.c.getItemStateType(string);
        if (c2 == null) {
            throw new bj("ItemStateName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFLockConfigName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFLockConfigName' has invalid value.");
        }
        ajb.c c3 = ajb.c.getLockConfigType(string2);
        if (c3 == null) {
            throw new bj("LockConfigName '" + string2 + "' is invalid.");
        }
        aka2.g(nArray);
        aka2.a(c2);
        aka2.a(c3);
        if (this.pal && c3 == ajb.c.bpw) {
            if (!aka2.Cs()) {
                throw new bg("Constraint should have a consume but is not checking in performing state.");
            }
            dch dch2 = new dch();
            aka2.a(dch2);
        }
    }

    private akb ed(Node node) {
        akb akb2 = new akb();
        this.a(node, akb2);
        Node node2 = jsy.d("SFQuantity", node);
        int n = (int)jsy.o(node2);
        if (n < 0) {
            throw new bj("Node 'SFQuantity' has invalid value.");
        }
        if (akb2.CY() == bqm.c.dEW && (float)n != 1.0f) {
            throw new bg("ItemStateType=" + (Object)((Object)akb2.CY()) + " but required quantity is invalid: " + n);
        }
        akb2.do(n);
        return akb2;
    }

    private void a(Node node, akc akc2) {
        this.a(node, (aja)akc2);
        Node node2 = jsy.d("SFResourceName", node);
        int n = kah.dv((Node)node2);
        if (n <= 0) {
            throw new bj("Node 'SFResourceName' has invalid value.");
        }
        node2 = jsy.d("SFItemStateName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFItemStateName' has invalid value.");
        }
        bqm.c c2 = bqm.c.getItemStateType(string);
        if (c2 == null) {
            throw new bj("ItemStateName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFLockConfigName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFLockConfigName' has invalid value.");
        }
        ajb.c c3 = ajb.c.getLockConfigType(string2);
        if (c3 == null) {
            throw new bj("LockConfigName '" + string2 + "' is invalid.");
        }
        akc2.l(n);
        akc2.a(c2);
        akc2.a(c3);
        if (this.pal && c3 == ajb.c.bpw) {
            if (!akc2.Cs()) {
                throw new bg("Constraint should have a consume but is not checking in performing state.");
            }
            dci dci2 = new dci();
            akc2.a(dci2);
        }
    }

    private akd ee(Node node) {
        akd akd2 = new akd();
        this.a(node, akd2);
        Node node2 = jsy.d("SFGeneralSkillFunction", node);
        boolean bl = jsy.t(node2);
        node2 = jsy.d("SFSkillFunctionName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFSkillFunctionName' has invalid value.");
        }
        int n = cxh.ix(string);
        if (n <= 0) {
            throw new bj("SkillFunctionName '" + string + "' is invalid.");
        }
        akd2.aW(bl);
        akd2.fD(n);
        return akd2;
    }

    private ake ef(Node node) {
        ake ake2 = new ake();
        this.a(node, ake2);
        Node node2 = jsy.d("SFQuantity", node);
        int n = (int)jsy.o(node2);
        if (n < 0) {
            throw new bj("Node 'SFQuantity' has invalid value.");
        }
        if (ake2.CY() == bqm.c.dEW && (float)n != 1.0f) {
            throw new bg("ItemStateType=" + (Object)((Object)ake2.CY()) + " but required quantity is invalid: " + n);
        }
        ake2.do(n);
        return ake2;
    }

    private ajo eg(Node node) {
        ajo ajo2 = new ajo();
        this.a(node, ajo2);
        Node node2 = jsy.d("SFTargetGroupName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFTargetGroupName' has invalid value.");
        }
        int n = cxj.iC(string);
        if (n < 0) {
            throw new bj("TargetGroupName '" + string + "' is invalid.");
        }
        ajo2.fS(n);
        node2 = jsy.d("SFMaxDistance", node);
        float f2 = jsy.o(node2);
        if (f2 <= 0.0f) {
            throw new bj("Node 'SFMaxDistance' has invalid value.");
        }
        ajo2.al(f2);
        return ajo2;
    }

    private aks eh(Node node) {
        aks aks2 = new aks();
        this.a(node, aks2);
        Node node2 = jsy.d("SFTargetGroupName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFTargetGroupName' has invalid value.");
        }
        int n = cxj.iC(string);
        if (n < 0) {
            throw new bj("TargetGroupName '" + string + "' is invalid.");
        }
        aks2.fS(n);
        node2 = jsy.d("SFThreshold", node);
        float f2 = jsy.o(node2);
        aks2.am(f2);
        node2 = jsy.d("SFMaxConsectiveFailures", node);
        int n2 = jsy.r(node2);
        aks2.fR(n2);
        node2 = jsy.d("SFRecheckDelay", node);
        double d2 = jsy.q(node2);
        aks2.w(d2);
        return aks2;
    }

    private ajs ei(Node node) {
        ajs ajs2 = new ajs();
        this.a(node, ajs2);
        Node node2 = jsy.d("SFTargetGroupName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFTargetGroupName' has invalid value.");
        }
        int n = cxj.iC(string);
        if (n < 0) {
            throw new bj("TargetGroupName '" + string + "' is invalid.");
        }
        ajs2.fS(n);
        node2 = jsy.d("SFMaxDistance", node);
        float f2 = jsy.o(node2);
        if (f2 <= 0.0f) {
            throw new bj("Node 'SFMaxDistance' has invalid value.");
        }
        ajs2.al(f2);
        return ajs2;
    }

    private akj ej(Node node) {
        akj akj2 = new akj();
        this.a(node, akj2);
        Node node2 = jsy.d("SFSkillFunctionName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFSkillFunctionName' has invalid value.");
        }
        int n = cxh.ix(string);
        if (n <= 0) {
            throw new bj("SkillFunctionName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFSkillName", node);
        int n2 = kbi.eM(node2);
        if (n2 <= 0) {
            throw new bj("Node 'SFSkillName' has invalid value.");
        }
        akj2.fD(n);
        akj2.eI(n2);
        return akj2;
    }

    private void a(Node node, akk akk2) {
        this.a(node, (aja)akk2);
        Node node2 = jsy.d("SFSkillName", node);
        int n = kbi.eM(node2);
        if (n <= 0) {
            throw new bj("Node 'SFSkillName' has invalid value.");
        }
        node2 = jsy.d("SFOperatorName", node);
        int n2 = this.ex(node2);
        if (n2 <= 0) {
            throw new bj("Node 'SFOperatorName' has invalid value.");
        }
        akk2.eI(n);
        akk2.fB(n2);
    }

    private akl ek(Node node) {
        akl akl2 = new akl();
        this.a(node, akl2);
        Node node2 = jsy.d("SFGeneralSkillFunction", node);
        boolean bl = jsy.t(node2);
        node2 = jsy.d("SFSkillFunctionName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFSkillFunctionName' has invalid value.");
        }
        int n = cxh.ix(string);
        if (n <= 0) {
            throw new bj("SkillFunctionName '" + string + "' is invalid.");
        }
        akl2.aW(bl);
        akl2.fD(n);
        return akl2;
    }

    private akm el(Node node) {
        akm akm2 = new akm();
        this.a(node, akm2);
        Node node2 = jsy.d("SFLimitValue", node);
        float f2 = jsy.o(node2);
        if (f2 <= 0.0f) {
            throw new bj("Node 'SFLimitValue' has invalid value.");
        }
        akm2.aj(f2);
        return akm2;
    }

    private akn em(Node node) {
        akn akn2 = new akn();
        this.a(node, akn2);
        return akn2;
    }

    private akq en(Node node) {
        akq akq2 = new akq();
        this.a(node, akq2);
        return akq2;
    }

    private akr eo(Node node) {
        akr akr2 = new akr();
        this.a(node, akr2);
        return akr2;
    }

    private aky ep(Node node) {
        aky aky2 = new aky();
        this.a(node, aky2);
        return aky2;
    }

    private akt eq(Node node) {
        akt akt2 = new akt();
        this.a(node, akt2);
        Node node2 = jsy.d("SFTargetGroupName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFTargetGroupName' has invalid value.");
        }
        int n = cxj.iC(string);
        if (n < 0) {
            throw new bj("TargetGroupName '" + string + "' is invalid.");
        }
        akt2.fS(n);
        return akt2;
    }

    private akv er(Node node) {
        akv akv2 = new akv();
        this.a(node, akv2);
        Node node2 = jsy.d("SFTargetGroupName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFTargetGroupName' has invalid value.");
        }
        int n = cxj.iC(string);
        if (n < 0) {
            throw new bj("TargetGroupName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFMaxDistance", node);
        float f2 = jsy.o(node2);
        if (f2 <= 0.0f) {
            throw new bj("Node 'SFMaxDistance' has invalid value.");
        }
        akv2.fS(n);
        akv2.setMaxDistance(f2);
        return akv2;
    }

    private akz es(Node node) {
        akz akz2 = new akz();
        this.a(node, akz2);
        return akz2;
    }

    private ala et(Node node) {
        ala ala2 = new ala();
        this.a(node, ala2);
        return ala2;
    }

    private alb eu(Node node) {
        alb alb2 = new alb();
        this.a(node, alb2);
        return alb2;
    }

    private akx ev(Node node) {
        akx akx2 = new akx();
        this.a(node, akx2);
        Node node2 = jsy.d("SFMinValue", node);
        float f2 = jsy.o(node2);
        akx2.an(f2);
        return akx2;
    }

    private ajb.b ew(Node node) {
        String string = jsy.m(node);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node '" + node.getNodeName() + "' has invalid value.");
        }
        ajb.b b2 = ajb.b.getConstraintType(string);
        if (b2 == null) {
            throw new bj("ConstraintName '" + string + "' is invalid.");
        }
        return b2;
    }

    private int ex(Node node) {
        String string = jsy.m(node);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node '" + node.getNodeName() + "' has invalid value.");
        }
        int n = ajb.cG(string);
        if (n <= 0) {
            throw new bj("OperatorName '" + string + "' is invalid.");
        }
        return n;
    }
}

