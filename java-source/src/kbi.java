/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cwx
 *  cxd
 *  ep
 *  lkv
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public abstract class kbi {
    public static final lju paM = new lju(0, 2, 0);
    private boolean pal = false;
    protected static les DX = lea.enT();
    protected static les dqt = lea.enU();
    protected static les ResourceTree = lea.enW();
    protected static les aqN = lea.enZ();
    protected jzp oRz = new jzp();
    protected kax pbg = null;
    protected jzz paU = new jzz();

    public kbi(boolean bl) {
        this.pal = bl;
        this.pbg = new kax(this.pal);
    }

    public final cxc O(String string, boolean bl) {
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, paM);
            Node node = jsy.d("SFSkill", document);
            Node node2 = jsy.d("SFSkillClassName", node);
            String string2 = this.eL(node2);
            if (string2 == null || string2.trim().equals("")) {
                throw new bj("Node 'SFSkillClassName' has invalid value.");
            }
            if (!cxd.it((String)string2)) {
                throw new bj("SkillClassName '" + string2 + "' is invalid.");
            }
            cxc cxc2 = this.d(node, string2, bl);
            if (cxc2 instanceof cwx) {
                this.n((cwx)cxc2);
            }
            return cxc2;
        }
        catch (bg bg2) {
            assert (false) : "Couldn't load skill : " + string + " Exception : " + bg2;
            return null;
        }
    }

    protected cxc d(Node node, String string, boolean bl) {
        return null;
    }

    private void n(cwx cwx2) {
        dcy dcy2 = (dcy)cwx2.e(cxd.p.fSe);
        if (dcy2 != null) {
            dcx dcx2 = cwx2.e(cxd.p.fSf);
            if (dcx2 != null) {
                if (dcy2.beV()) {
                    throw new bg("EnterStatePostAttack is true for attacktimer while it has a performingtimer.");
                }
            } else if (!dcy2.beV()) {
                throw new bg("EnterStatePostAttack is false for attacktimer but it has no performingtimer.");
            }
        }
    }

    protected String eL(Node node) {
        assert (node != null) : "ClassNameNode is null!";
        String string = jsy.m(node);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node '" + node.getNodeName() + "' has invalid value.");
        }
        return string;
    }

    public static final int eM(Node node) {
        if (node == null) {
            throw new bi("NameNode is null.");
        }
        String string = jsy.m(node);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node '" + node.getNodeName() + "' has invalid value.");
        }
        if (string.equalsIgnoreCase("NULL")) {
            return 0;
        }
        int n = aqN.getType(string);
        if (n < 0) {
            throw new bj("SkillName '" + string + "' is invalid.");
        }
        return n;
    }

    public static final int eN(Node node) {
        if (node == null) {
            throw new bi("NameNode is null.");
        }
        String string = jsy.m(node);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node '" + node.getNodeName() + "' has invalid value.");
        }
        int n = dqt.getType(string);
        if (n < 0) {
            throw new bj("FunctionName '" + string + "' is invalid.");
        }
        return n;
    }

    public static final int eO(Node node) {
        if (node == null) {
            throw new bi("NameNode is null.");
        }
        String string = jsy.m(node);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node '" + node.getNodeName() + "' has invalid value.");
        }
        int n = byw.gM(string);
        if (n < 0) {
            throw new bj("Life Mode Name '" + string + "' is invalid.");
        }
        return n;
    }

    protected int O(Node node) {
        assert (node != null) : "NameNode is null!";
        String string = jsy.m(node);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node '" + node.getNodeName() + "' has invalid value.");
        }
        int n = DX.getType(string);
        if (n < 0) {
            throw new bj("EffectName '" + string + "' is invalid.");
        }
        return n;
    }

    protected aja[] k(Node node, boolean bl) {
        List<Node> list = jsy.c("SFConstraint", node);
        if (list.isEmpty()) {
            return null;
        }
        aja[] ajaArray = new aja[list.size()];
        aja aja2 = null;
        int n = list.size();
        for (int i2 = 0; i2 < n; ++i2) {
            try {
                aja2 = this.pbg.j(list.get(i2), bl);
                if (!this.pal && ajb.b.isPreventPerformingStateCheck(aja2.Cl())) {
                    aja2.a(ajb.a.bos);
                }
            }
            catch (bg bg2) {
                throw new bg("Parsing of constraint " + i2 + " failed.", bg2);
            }
            if (aja2 == null) {
                lfn.b(4, "SFSkillParser", "Parsing of constraint " + i2 + " failed.");
                continue;
            }
            ajaArray[i2] = aja2;
        }
        return ajaArray;
    }

    protected final dbo eP(Node node) {
        Node node2 = jsy.d("SFAnimationInfoName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFAnimationInfoName' has invalid value.");
        }
        cxd.a a2 = cxd.a.getAnimationInfoType(string);
        if (a2 == null) {
            throw new bj("AnimationInfoName '" + string + "' is invalid.");
        }
        switch (a2) {
            case fQf: {
                dbp dbp2 = new dbp();
                this.a(dbp2, node);
                return dbp2;
            }
            case fQg: {
                dbq dbq2 = new dbq();
                this.a(dbq2, node);
                return dbq2;
            }
        }
        throw new bj("AnimationInfoName '" + string + "' is invalid.");
    }

    private void a(dbo dbo2, Node node) {
        Node node2 = jsy.d("SFSkillPartName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFSkillPartName' has invalid value.");
        }
        cxd.p p2 = cxd.p.getSkillPartType(string);
        if (p2 == null) {
            throw new bj("SkillPartName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFTargetObjectName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFTargetObjectName' has invalid value.");
        }
        cxd.t t2 = cxd.t.getTargetObjectType(string2);
        if (t2 == null) {
            throw new bj("TargetObjectName '" + string2 + "' is invalid.");
        }
        node2 = jsy.d("SFOperationOnSkillPartExitName", node);
        String string3 = jsy.m(node2);
        if (string3 == null || string3.trim().equals("")) {
            throw new bj("Node 'SFOperationOnSkillPartExitName' has invalid value.");
        }
        cxd.i i2 = cxd.i.getOperationOnSkillPartExitType(string3);
        if (i2 == null) {
            throw new bj("OperationOnSkillPartExitName '" + string3 + "' is invalid.");
        }
        boolean bl = false;
        if (this.pal) {
            node2 = jsy.d("SFStartAnimationOnClient", node);
            bl = jsy.t(node2);
        }
        dbo2.j(p2);
        dbo2.c(t2);
        dbo2.a(i2);
        dbo2.hC(bl);
    }

    private void a(dbp dbp2, Node node) {
        this.a((dbo)dbp2, node);
        Node node2 = jsy.d("SFDynamicAnimationName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFDynamicAnimationName' has invalid value.");
        }
        cxd.e e2 = cxd.e.getDynamicAnimationType(string);
        if (e2 == null) {
            throw new bj("DynamicAnimationName '" + string + "' is invalid.");
        }
        dbp2.a(e2);
    }

    private void a(dbq dbq2, Node node) {
        this.a((dbo)dbq2, node);
        Node node2 = jsy.d("SFAnimationStateName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFAnimationStateName' has invalid value.");
        }
        int n = lkv.AG((String)string);
        if (n <= 0) {
            throw new bj("AnimationStateName '" + string + "' is invalid.");
        }
        dbq2.zC(n);
    }

    protected final dea eQ(Node node) {
        assert (node != null) : "XPHeirNode is null!";
        Node node2 = jsy.d("SFXPHeirName", node);
        String string = jsy.m(node2);
        if (string == null || string.equals("")) {
            throw new bj("Node 'SFName' has invalid value.");
        }
        node2 = jsy.d("SFInheritancePortion", node);
        float f2 = jsy.o(node2);
        if (f2 <= 0.0f) {
            throw new bj("Node 'SFInheritancePortion' has invalid value.");
        }
        if (string.equalsIgnoreCase("XPHeirAttribute")) {
            node2 = jsy.d("SFAttributeName", node);
            int n = this.cI(node2);
            if (n <= 0) {
                throw new bj("Node 'SFAttributeName' has invalid value.");
            }
            node2 = jsy.d("SFAdvancementRateAttributeName", node);
            int n2 = this.cI(node2);
            if (n2 <= 0) {
                throw new bj("Node 'SFAdvancementRateAttributeName' has invalid value.");
            }
            if (!ep.aT((int)n)) {
                throw new bg("Attribute '" + ep.aM((int)n) + "' is not a base attribute.");
            }
            if (!ep.aV((int)n2)) {
                throw new bg("Attribute '" + ep.aM((int)n2) + "' is not advancementrate attribute for a base attribute.");
            }
            deb deb2 = new deb();
            deb2.gh(f2);
            deb2.fC(n);
            deb2.zM(n2);
            return deb2;
        }
        if (string.equalsIgnoreCase("XPHeirSkill")) {
            node2 = jsy.d("SFSkillName", node);
            int n = kbi.eM(node2);
            if (n <= 0) {
                throw new bj("Node 'SFSkillName' has invalid value.");
            }
            dec dec2 = new dec();
            dec2.gh(f2);
            dec2.eI(n);
            return dec2;
        }
        throw new bj("XPHeirName '" + string + "' is invalid.");
    }

    protected int eR(Node node) {
        assert (node != null) : "SFTimerName node is null!";
        String string = jsy.m(node);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node '" + node.getNodeName() + "' has invalid value.");
        }
        int n = dxj.jH(string);
        if (n <= 0) {
            throw new bj("TimerName '" + string + "' is invalid.");
        }
        return n;
    }

    protected final int cI(Node node) {
        return this.oRz.cI(node);
    }

    protected dcu eS(Node node) {
        assert (node != null) : "SFSkillLevelTable node is null!";
        String string = jsy.m(jsy.a("SFTableName", node));
        assert (string != null) : "TableName is null!";
        lfn.b(0, "SFSkillParser", "parseSFSkillLevelTableNode() TableName=" + string);
        List<Node> list = jsy.c("SFSkillLevel", node);
        assert (list.size() < 12) : "Too few (" + list.size() + ") SFSkillLevel nodes found in SkillLevelTable " + string;
        Node node2 = null;
        int n = -1;
        float f2 = -1.0f;
        float[] fArray = new float[12];
        for (int i2 = 0; i2 < list.size(); ++i2) {
            node2 = list.get(i2);
            n = this.eT(node2);
            f2 = this.g("Value", node2);
            assert (n >= 0) : "Invalid SkillLevel found!";
            fArray[n] = f2;
            lfn.b(0, "SFSkillParser", "parseSFSkillLevelTableNode() Level=" + dcu.gdv[n] + " Value=" + f2);
        }
        dcu dcu2 = new dcu();
        dcu2.setTableName(string);
        dcu2.d(fArray);
        return dcu2;
    }

    protected int eT(Node node) {
        assert (node != null) : "SFSkillLevel node is null!";
        String string = this.j("Name", node);
        assert (string != null) : "SkillLevelName is null!";
        for (int i2 = 0; i2 < dcu.gdv.length; ++i2) {
            if (!dcu.gdv[i2].equalsIgnoreCase(string)) continue;
            return i2;
        }
        assert (false) : "SkillLevelName " + string + " is invalid!";
        return -1;
    }

    protected ddb eU(Node node) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        Node node2 = jsy.d("SFSkillPartName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFSkillPartName' has invalid value.");
        }
        cxd.p p2 = cxd.p.getSkillPartType(string);
        if (p2 == null) {
            throw new bj("SkillPartName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFTargetObjectName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFTargetObjectName' has invalid value.");
        }
        cxd.t t2 = cxd.t.getTargetObjectType(string2);
        if (t2 == null) {
            throw new bj("TargetObjectName '" + string2 + "' is invalid.");
        }
        node2 = jsy.d("SFSpecialEffectName", node);
        String string3 = jsy.m(node2);
        if (string3 == null || string3.trim().equals("")) {
            throw new bj("Node 'SFEffectName' has invalid value.");
        }
        int n = del.dr(string3);
        if (n <= 0 && !string3.equalsIgnoreCase("None")) {
            throw new bj("SpecialEffectName '" + string3 + "' is invalid.");
        }
        node2 = jsy.d("SFRelativeStartTime", node);
        double d2 = jsy.q(node2);
        if (d2 < 0.0) {
            throw new bj("Node 'SFRelativeStartTime' has invalid value.");
        }
        int n2 = 0;
        node2 = jsy.d("SFVisibilityName", node);
        String string4 = jsy.m(node2);
        if (string4 == null || string4.trim().equals("")) {
            throw new bj("Node 'SFVisibilityName' has invalid value.");
        }
        cxd.v v2 = cxd.v.getVisibilityType(string4);
        if (v2 == null) {
            throw new bj("VisibilityName '" + string4 + "' is invalid.");
        }
        switch (v2) {
            case fSU: {
                n2 |= 1;
                break;
            }
            case fSV: {
                n2 |= 2;
                break;
            }
            case fSW: {
                n2 |= 4;
                break;
            }
            case fSX: {
                n2 |= 8;
                break;
            }
            default: {
                throw new bj("VisibilityType " + (Object)((Object)v2) + " is invalid.");
            }
        }
        node2 = jsy.d("SFProvideSourceObjectGUID", node);
        boolean bl5 = jsy.t(node2);
        if (bl5) {
            n2 |= 0x10;
        }
        if (bl4 = jsy.t(node2 = jsy.d("SFProvideSourcePosition", node))) {
            n2 |= 0x20;
        }
        if (bl3 = jsy.t(node2 = jsy.d("SFProvideSourceRotation", node))) {
            n2 |= 0x40;
        }
        if (bl2 = jsy.t(node2 = jsy.d("SFProvideDuration", node))) {
            n2 |= 0x80;
        }
        if (bl = jsy.t(node2 = jsy.d("SFProvidePower", node))) {
            n2 |= 0x100;
        }
        ddb ddb2 = new ddb();
        ddb2.j(p2);
        ddb2.c(t2);
        ddb2.setSpecialEffectType(n);
        ddb2.bK(d2);
        ddb2.zI(n2);
        return ddb2;
    }

    protected dcm eV(Node node) {
        assert (node != null);
        Node node2 = jsy.d("SFSkillControllerName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFSkillControllerName' has invalid value.");
        }
        dcm.b b2 = dcm.b.getSkillControllerType(string);
        if (b2 == null) {
            throw new bj("SkillControllerName '" + string + "' is invalid.");
        }
        switch (b2) {
            case gdc: {
                dcn dcn2 = new dcn();
                this.a(dcn2, node);
                return dcn2;
            }
            case gdd: {
                dcm dcm2 = new dcm();
                this.a(dcm2, node);
                if (dcm2.gcV == dcm.a.gcY) {
                    throw new bg("To start charging a skill you need a SkillChargingController, not a simple SkillController.");
                }
                return dcm2;
            }
        }
        throw new bj("SkillControllerName '" + string + "' is invalid.");
    }

    private void a(dcm dcm2, Node node) {
        Node node2 = jsy.d("SFStartControllerOperationName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFStartControllerOperationName' has invalid value.");
        }
        dcm.a a2 = dcm.a.getControllerOperationType(string);
        if (a2 == null) {
            throw new bj("StartControllerOperationName '" + string + "' is invalid.");
        }
        if (a2 == dcm.a.gda) {
            throw new bg("You can't stop the skill on start.");
        }
        node2 = jsy.d("SFStopControllerOperationName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFStopControllerOperationName' has invalid value.");
        }
        dcm.a a3 = dcm.a.getControllerOperationType(string2);
        if (a3 == null) {
            throw new bj("StopControllerOperationName '" + string2 + "' is invalid.");
        }
        if (a3 == dcm.a.gcY) {
            throw new bg("You can't start charging the skill on stop.");
        }
        switch (a2) {
            case gcY: 
            case gcZ: {
                break;
            }
            default: {
                throw new bg("StartControllerOperationType is invalid.");
            }
        }
        switch (a3) {
            case gcX: {
                break;
            }
            case gcZ: 
            case gda: {
                break;
            }
            default: {
                throw new bg("StopControllerOperationType is invalid.");
            }
        }
        dcm2.gcV = a2;
        dcm2.gcW = a3;
    }

    private void a(dcn dcn2, Node node) {
        this.a((dcm)dcn2, node);
        Node node2 = jsy.d("SFMinimumChargingProgress", node);
        float f2 = jsy.o(node2);
        if (f2 < 0.0f) {
            throw new bj("Node 'SFMinimumChargingProgress' has invalid value.");
        }
        node2 = jsy.d("SFCancelChargingEnabled", node);
        boolean bl = jsy.t(node2);
        node2 = jsy.d("SFAutoStartSkillOnChargingTimerTimeout", node);
        boolean bl2 = jsy.t(node2);
        if (bl2 && dcn2.gcW == dcm.a.gcZ) {
            throw new bj("AutoStartSkillOnChargingTimerTimeout can't be true when StopControllerOperationType is 'Start Skill'");
        }
        if (!bl2 && dcn2.gcW != dcm.a.gcZ) {
            throw new bj("AutoStartSkillOnChargingTimerTimeout can't be false when StopControllerOperationType is not 'Start Skill'");
        }
        node2 = jsy.d("SFUseMovementSensor", node);
        boolean bl3 = jsy.t(node2);
        if (bl3 && !bl) {
            throw new bg("CancelChargingEnabled must be true when UseMovementSensor is true.");
        }
        dcn2.gdf = f2;
        dcn2.gdg = bl;
        dcn2.gdh = bl2;
        dcn2.fYn = bl3;
    }

    protected final dcx eW(Node node) {
        assert (node != null);
        Node node2 = jsy.d("SFSkillTimerName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFSkillTimerName' has invalid value.");
        }
        dcx.a a2 = dcx.a.getSkillTimerType(string);
        if (a2 == null) {
            throw new bj("SkillTimerName '" + string + "' is invalid.");
        }
        switch (a2) {
            case gdE: {
                dcx dcx2 = new dcx();
                this.a(node, dcx2);
                return dcx2;
            }
            case gdF: {
                dcy dcy2 = new dcy();
                this.a(node, dcy2);
                return dcy2;
            }
            case gdG: {
                dcz dcz2 = new dcz();
                this.a(node, dcz2);
                return dcz2;
            }
            case gdH: {
                dda dda2 = new dda();
                this.a(node, dda2);
                return dda2;
            }
        }
        throw new bj("SkillTimerName '" + string + "' is invalid.");
    }

    private void a(Node node, dcx dcx2) {
        int n;
        cxd.p p2;
        Node node2;
        block23: {
            String string;
            block22: {
                node2 = jsy.d("SFSkillPartName", node);
                string = jsy.m(node2);
                if (string == null || string.trim().equals("")) {
                    throw new bj("Node 'SFSkillPartName' has invalid value.");
                }
                p2 = cxd.p.getSkillPartType(string);
                if (p2 == null) {
                    throw new bj("SkillPartName '" + string + "' is invalid.");
                }
                switch (p2) {
                    case fSc: 
                    case fSe: 
                    case fSf: 
                    case fSh: {
                        break;
                    }
                    default: {
                        throw new bj("SkillPartName '" + string + "' is invalid.");
                    }
                }
                if (dcx2 instanceof dcy) {
                    if (p2 != cxd.p.fSe) {
                        throw new bj("SkillTimerAttack should only be used for skillpart '" + (Object)((Object)cxd.p.fSe) + "'");
                    }
                } else if (p2 == cxd.p.fSe) {
                    throw new bj("Skilltimers for skillpart '" + (Object)((Object)cxd.p.fSe) + "' must be a SkillTimerAttack.");
                }
                if (dcx2 instanceof dda) {
                    if (p2 != cxd.p.fSh) {
                        throw new bj("SkillTimerRestartBlocking should only be used for skillpart '" + (Object)((Object)cxd.p.fSh) + "'");
                    }
                } else if (p2 == cxd.p.fSh) {
                    throw new bj("Skilltimers for skillpart '" + (Object)((Object)cxd.p.fSh) + "' must be a SkillTimerRestartBlocking.");
                }
                node2 = jsy.d("SFTimerName", node);
                n = this.eR(node2);
                if (p2 != cxd.p.fSf) break block22;
                switch (n) {
                    case 2: 
                    case 3: 
                    case 4: {
                        break block23;
                    }
                    default: {
                        throw new bj("TimerType is invalid for skillpart '" + string + "': " + n);
                    }
                }
            }
            switch (n) {
                case 1: 
                case 2: {
                    break;
                }
                default: {
                    throw new bj("TimerType is invalid for skillpart '" + string + "': " + n);
                }
            }
        }
        node2 = jsy.d("SFGeneralSkillFunction", node);
        boolean bl = jsy.t(node2);
        node2 = jsy.d("SFTimerLengthSkillFunctionName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFTimerLengthSkillFunctionName' has invalid value.");
        }
        int n2 = cxh.ix(string);
        if (n2 <= 0) {
            throw new bj("TimerLengthSkillFunctionName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFRepeatCount", node);
        int n3 = jsy.r(node2);
        if (n3 < 0) {
            throw new bj("Node 'SFRepeatCount' has invalid value.");
        }
        dcx2.zE(n);
        dcx2.j(p2);
        dcx2.aW(bl);
        dcx2.zF(n2);
        dcx2.zG(n3);
    }

    private void a(Node node, dcy dcy2) {
        this.a(node, (dcx)dcy2);
        Node node2 = jsy.d("SFEnterStatePostAttack", node);
        boolean bl = jsy.t(node2);
        dcy2.hG(bl);
    }

    private void a(Node node, dcz dcz2) {
        this.a(node, (dcy)dcz2);
        Node node2 = jsy.d("SFTimerLengthAlternativeSkillFunctionName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFTimerLengthAlternativeSkillFunctionName' has invalid value.");
        }
        int n = cxh.ix(string);
        if (n <= 0) {
            throw new bj("TimerLengthAlternativeSkillFunctionName '" + string + "' is invalid.");
        }
        dcz2.zH(n);
    }

    private void a(Node node, dda dda2) {
        this.a(node, (dcx)dda2);
        Node node2 = jsy.d("SFBlockingGroupName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFBlockingGroupName' has invalid value.");
        }
        node2 = jsy.d("SFDelay", node);
        double d2 = jsy.q(node2);
        if (d2 < 0.0) {
            throw new bj("Node 'SFDelay' has invalid value.");
        }
        cxd.b b2 = cxd.b.getBlockingGroupType(string);
        if (b2 == null) {
            throw new bj("BlockingGroupName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFBlockingGroupTimerSkillFunctionName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFBlockingGroupTimerSkillFunctionName' has invalid value.");
        }
        int n = cxh.ix(string2);
        if (n <= 0) {
            throw new bj("BlockingGroupTimerSkillFunctionName '" + string2 + "' is invalid.");
        }
        dda2.gdN = d2;
        dda2.fYc = b2;
        dda2.gdM = n;
    }

    protected dbw eX(Node node) {
        assert (node != null);
        Node node2 = jsy.d("SFPerformingObjectName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFPerformingObjectName' has invalid value.");
        }
        cxd.j j2 = cxd.j.getPerformingObjectType(string);
        if (j2 == null) {
            throw new bj("PerformingObjectName '" + string + "' is invalid.");
        }
        switch (j2) {
            case fRu: {
                dbx dbx2 = new dbx();
                return dbx2;
            }
            case fRv: {
                dby dby2 = new dby();
                return dby2;
            }
            case fRw: {
                dbz dbz2 = new dbz();
                this.a(node, dbz2);
                return dbz2;
            }
            case fRx: {
                dca dca2 = new dca();
                this.a(node, dca2);
                return dca2;
            }
            case fRy: {
                dcb dcb2 = new dcb();
                return dcb2;
            }
            case fRz: {
                dcc dcc2 = new dcc();
                this.a(node, dcc2);
                return dcc2;
            }
            case fRA: {
                dce dce2 = new dce();
                return dce2;
            }
            case fRB: {
                dcf dcf2 = new dcf();
                this.a(node, dcf2);
                return dcf2;
            }
        }
        throw new bj("PerformingObjectName '" + string + "' is invalid.");
    }

    private void a(Node node, dbz dbz2) {
        Node node2 = jsy.d("SFBoostSkillName", node);
        int n = kbi.eM(node2);
        if (n <= 0) {
            throw new bj("Node 'SFBoostSkillName' has invalid value.");
        }
        dbz2.yC(n);
    }

    private void a(Node node, dca dca2) {
        Node node2 = jsy.d("SFProgressName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFProgressName' has invalid value.");
        }
        cxd.k k2 = cxd.k.getProgressType(string);
        if (k2 == null) {
            throw new bj("ProgressName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFGeneralSkillFunction", node);
        boolean bl = jsy.t(node2);
        node2 = jsy.d("SFSkillFunctionName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFSkillFunctionName' has invalid value.");
        }
        int n = cxh.ix(string2);
        if (n <= 0) {
            throw new bj("SkillFunctionName '" + string2 + "' is invalid.");
        }
        node2 = jsy.d("SFShowCancelButton", node);
        boolean bl2 = jsy.t(node2);
        dca2.b(k2);
        dca2.aW(bl);
        dca2.fD(n);
        dca2.hD(bl2);
    }

    private void a(Node node, dcc dcc2) {
        Node node2 = jsy.d("SFTeleportToSpawnPosition", node);
        boolean bl = jsy.t(node2);
        dcc2.hE(bl);
    }

    private void a(Node node, dcf dcf2) {
        Node node2 = jsy.d("SFSkillName", node);
        int n = kbi.eM(node2);
        if (n <= 0) {
            throw new bj("Node 'SFSkillName' has invalid value.");
        }
        dcf2.eI(n);
    }

    protected float g(String string, Node node) {
        String string2 = this.i(string, node);
        if (string2 != null) {
            return new Float(string2).floatValue();
        }
        return -1.0f;
    }

    protected String j(String string, Node node) {
        return this.i(string, node);
    }

    protected String i(String string, Node node) {
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node2 = namedNodeMap.getNamedItem(string);
        if (node2 != null) {
            return node2.getNodeValue();
        }
        return null;
    }
}

