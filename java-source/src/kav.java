/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cwx
 *  cxd
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;

public class kav
extends kbi {
    private List pbf = lcn.abH(5);

    public kav() {
        super(false);
    }

    @Override
    protected cxc d(Node node, String string, boolean bl) {
        assert (!bl);
        try {
            if (string.equals("SFMovementDurationSkill")) {
                cya cya2 = new cya();
                this.a(cya2, node);
                return cya2;
            }
            if (string.equals("SFFlyingSkillClient")) {
                cxz cxz2 = new cxz();
                this.a(cxz2, node);
                return cxz2;
            }
            if (string.equals("SFJumpSkill")) {
                cyc cyc2 = new cyc();
                this.a(cyc2, node);
                return cyc2;
            }
            if (string.equals("SFEvadeSkill")) {
                cyb cyb2 = new cyb();
                this.a(cyb2, node);
                return cyb2;
            }
            if (string.equals("SFPassiveSkill")) {
                cxb cxb2 = new cxb();
                this.a(cxb2, node);
                return cxb2;
            }
            if (string.equals("SFClientSkill")) {
                cxo cxo2 = new cxo();
                this.a(cxo2, node);
                return cxo2;
            }
            if (string.equals("SFDurationSkillClient")) {
                cxv cxv2 = new cxv();
                this.a(cxv2, node);
                return cxv2;
            }
            if (string.equals("SFClientMeleeSkill")) {
                cxq cxq2 = new cxq();
                this.a(cxq2, node);
                return cxq2;
            }
            if (string.equals("SFClientMeleePowerSkill")) {
                cxp cxp2 = new cxp();
                this.a(cxp2, node);
                return cxp2;
            }
            if (string.equals("SFClientMissileSkill")) {
                cxr cxr2 = new cxr();
                this.a(cxr2, node);
                return cxr2;
            }
            if (string.equals("SFClientSpell")) {
                cxt cxt2 = new cxt();
                this.a(cxt2, node);
                return cxt2;
            }
            if (string.equals("SFClientMissileSpell")) {
                cxs cxs2 = new cxs();
                this.a(cxs2, node);
                return cxs2;
            }
            if (string.equals("SFClientThrowingSkill")) {
                cxu cxu2 = new cxu();
                this.a(cxu2, node);
                return cxu2;
            }
            if (string.equals("SFClientDurationSpell")) {
                cxw cxw2 = new cxw();
                this.a(cxw2, node);
                return cxw2;
            }
            if (string.equals("SFCraftingSkillClient")) {
                cxx cxx2 = new cxx();
                this.a(cxx2, node);
                return cxx2;
            }
            if (string.equals("SFSalvagingSkillClient")) {
                cxy cxy2 = new cxy();
                this.a(cxy2, node);
                return cxy2;
            }
            lfn.b(5, "SFClientSkillParser", "loadSkill() Undefined SkillClassName found: '" + string + "'");
            return null;
        }
        catch (Exception exception) {
            throw new bg("Parsing of skill '" + string + "' failed.", exception);
        }
    }

    private void a(cxc cxc2, Node node) {
        Node node2 = jsy.d("SFSkillName", node);
        int n = kav.eM(node2);
        cxc2.eI(n);
    }

    private void a(cwx cwx2, Node node) {
        int n;
        Object object;
        List<Node> list;
        this.a((cxc)cwx2, node);
        Node node2 = jsy.d("SFBlockingName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFBlockingName' has invalid value.");
        }
        cxd.c c2 = cxd.c.getBlockingType(string);
        if (c2 == null) {
            throw new bj("BlockingName '" + string + "' is invalid.");
        }
        if (c2 == cxd.c.fQA) {
            throw new bj("BlockingName '" + string + "' is invalid.");
        }
        cwx2.a(c2);
        node2 = jsy.d("SFReportName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFReportName' has invalid value.");
        }
        cxd.m m2 = cxd.m.getReportType(string2);
        if (m2 == null) {
            throw new bj("ReportName '" + string2 + "' is invalid.");
        }
        cwx2.a(m2);
        node2 = jsy.d("SFSpecialEffectDuration", node);
        float f2 = jsy.o(node2);
        if ((double)f2 < 0.0) {
            throw new bj("Node 'SFSpecialEffectDuration' has invalid value.");
        }
        cwx2.fc(f2);
        aja[] ajaArray = this.k(node, false);
        if (ajaArray != null) {
            cwx2.b(ajaArray);
        }
        if (!(list = jsy.c("SFAnimationInfo", node)).isEmpty()) {
            object = new dbo[list.size()];
            for (n = 0; n < ((dbo[])object).length; ++n) {
                try {
                    object[n] = this.eP(list.get(n));
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("'SFAnimationInfo' node " + n + " could not be parsed.", bg2);
                }
            }
            cwx2.a(object);
        }
        if ((node2 = jsy.a("SFSkillController", node)) != null) {
            object = this.eV(node2);
            cwx2.a((dcm)object);
        }
        if ((list = jsy.c("SFSkillTimer", node)).size() > 0) {
            object = new dcx[list.size()];
            for (n = 0; n < list.size(); ++n) {
                try {
                    object[n] = this.eW(list.get(n));
                    continue;
                }
                catch (bg bg3) {
                    throw new bg("Parsing of SkillTimer " + n + " failed.", bg3);
                }
            }
            cwx2.a((dcx[])object);
        }
        if ((list = jsy.c("SFSpecialEffectInfo", node)).size() > 0) {
            object = new ddb[list.size()];
            for (n = 0; n < list.size(); ++n) {
                try {
                    object[n] = this.eU(list.get(n));
                    continue;
                }
                catch (bg bg4) {
                    throw new bg("Parsing of SpecialEffectInfo " + n + " failed.", bg4);
                }
            }
            cwx2.a((ddb[])object);
        }
    }

    private void a(cxb cxb2, Node node) {
        this.a((cxc)cxb2, node);
    }

    private void a(cxo cxo2, Node node) {
        this.a((cwx)cxo2, node);
        Node node2 = jsy.d("SFClientParamName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFClientParamName' has invalid value.");
        }
        cxd.d d2 = cxd.d.getClientParamType(string);
        if (d2 == null) {
            throw new bj("ClientParamName '" + string + "' has invalid value.");
        }
        if (d2 == cxd.d.fQF && cxo2.bfY() == null) {
            throw new bj("No targetingconstraint found but clientparamtype is " + (Object)((Object)d2));
        }
        if (d2 == cxd.d.fQG && cxo2.bfY() == null) {
            throw new bj("No interferenceconstraint found but clientparamtype is " + (Object)((Object)d2));
        }
        cxo2.a(d2);
        List<Node> list = jsy.c("SFSynchronizedObject", node);
        if (list.size() > 0) {
            ddf ddf2 = this.bU(list);
            cxo2.a(ddf2);
        }
    }

    private void a(cyc cyc2, Node node) {
        this.a((cxo)cyc2, node);
        Node node2 = jsy.d("SFDirectionVector", node);
        ljq ljq2 = jsy.w(node2);
        if (ljq2 == null) {
            throw new bj("Node 'SFDirectionVector' has invalid value.");
        }
        cyc2.bH(ljq2);
    }

    private void a(cyb cyb2, Node node) {
        this.a((cxo)cyb2, node);
        Node node2 = jsy.d("SFSpeed", node);
        if (node2 == null) {
            throw new bn("SFSpeed", null);
        }
        float f2 = jsy.o(node2);
        if (f2 <= 0.0f) {
            throw new bj("Node 'SFSpeed' has invalid value.");
        }
        cyb2.setSpeed(f2);
        Node node3 = jsy.d("SFAngle", node);
        if (node3 == null) {
            throw new bn("SFAngle", null);
        }
        float f3 = jsy.o(node3);
        if (f3 <= 0.0f) {
            throw new bj("Node 'SFAngle' has invalid value.");
        }
        cyb2.fG(f3);
        Node node4 = jsy.d("SFBlockingTimerBase", node);
        float f4 = jsy.o(node4);
        cyb2.fn(f4);
    }

    private void a(cxv cxv2, Node node) {
        this.a((cxo)cxv2, node);
        List<Node> list = jsy.c("SFPerformingObject", node);
        if (!list.isEmpty()) {
            this.pbf.clear();
            int n = list.size();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    dbw dbw2 = this.eX(list.get(i2));
                    this.pbf.add(dbw2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of PerformingObject " + i2 + " failed.", bg2);
                }
            }
            dbw[] dbwArray = new dbw[this.pbf.size()];
            this.pbf.toArray(dbwArray);
            cxv2.a(dbwArray);
        }
    }

    private void a(cya cya2, Node node) {
        this.a((cxv)cya2, node);
        List<Node> list = jsy.c("SFMovementDirection", node);
        if (list.size() < 0) {
            throw new bg("No 'SFMovementDirection' nodes were found.");
        }
        ljq[] ljqArray = new ljq[6];
        Node node2 = null;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            node2 = list.get(i2);
            Node node3 = jsy.d("SFDirectionName", node2);
            String string = jsy.m(node3);
            if (string == null || string.trim().equals("")) {
                throw new bj("Node 'SFDirectionName' has invalid value.");
            }
            int n = cxd.iq((String)string);
            if (n < 0) {
                throw new bj("DirectionName '" + string + "' is invalid.");
            }
            node3 = jsy.d("SFDirectionVector", node2);
            ljq ljq2 = jsy.w(node3);
            if (ljq2 == null) {
                throw new bj("Node 'SFDirectionVector' has invalid value.");
            }
            ljqArray[n] = ljq2;
        }
        cya2.d(ljqArray);
        Node node4 = jsy.d("SFEnableBoost", node);
        boolean bl = jsy.t(node4);
        cya2.hn(bl);
        node4 = jsy.d("SFBoostSkillName", node);
        int n = kav.eM(node4);
        if (n < 0) {
            throw new bj("Node 'SFBoostSkillName' has invalid value.");
        }
        cya2.yC(n);
        node4 = jsy.d("SFMinimumStaminaValue", node);
        float f2 = jsy.o(node4);
        if (f2 < 0.0f) {
            throw new bj("Node 'SFMinimumStaminaValue' has invalid value.");
        }
        cya2.fE(f2);
        node4 = jsy.d("SFRechargingStaminaValue", node);
        float f3 = jsy.o(node4);
        if (f3 < 0.0f) {
            throw new bj("Node 'SFRechargingStaminaValue' has invalid value.");
        }
        cya2.fF(f3);
    }

    private void a(cxz cxz2, Node node) {
        this.a((cxv)cxz2, node);
    }

    private void a(cxq cxq2, Node node) {
        this.a((cxo)cxq2, node);
        Node node2 = jsy.d("SFBlockingTimerBase", node);
        float f2 = jsy.o(node2);
        cxq2.fn(f2);
        node2 = jsy.d("SFSkillTimerGeneral", node);
        float f3 = jsy.o(node2);
        cxq2.fp(f3);
        node2 = jsy.d("SFStaminaMultiplier", node);
        float f4 = jsy.o(node2);
        cxq2.fo(f4);
        node2 = jsy.d("SFManaCostMultiplier", node);
        float f5 = jsy.o(node2);
        cxq2.fq(f5);
        node2 = jsy.a("SFBaseManaCost", node);
        float f6 = jsy.o(node2);
        node2 = jsy.a("SFBaseStaminaCost", node);
        float f7 = jsy.o(node2);
        node2 = jsy.a("SFBaseHealthCost", node);
        float f8 = jsy.o(node2);
        node2 = jsy.a("SFBaseCooldown", node);
        float f9 = jsy.o(node2);
        node2 = jsy.a("SFCooldownMultiplier", node);
        float f10 = jsy.o(node2);
        node2 = jsy.a("SFHealthCostMultiplier", node);
        float f11 = jsy.o(node2);
        cxq2.fr(f6);
        cxq2.fs(f7);
        cxq2.ft(f8);
        cxq2.fu(f9);
        cxq2.fu(f9);
        cxq2.fw(f11);
    }

    private void a(cxp cxp2, Node node) {
        this.a((cxo)cxp2, node);
        Node node2 = jsy.d("SFBlockingTimerBase", node);
        float f2 = jsy.o(node2);
        node2 = jsy.d("SFStaminaMultiplier", node);
        float f3 = jsy.o(node2);
        node2 = jsy.d("SFManaCostMultiplier", node);
        float f4 = jsy.o(node2);
        node2 = jsy.d("SFSkillTimerGeneral", node);
        float f5 = jsy.o(node2);
        node2 = jsy.a("SFBaseManaCost", node);
        float f6 = jsy.o(node2);
        node2 = jsy.a("SFBaseStaminaCost", node);
        float f7 = jsy.o(node2);
        node2 = jsy.a("SFBaseHealthCost", node);
        float f8 = jsy.o(node2);
        node2 = jsy.a("SFBaseCooldown", node);
        float f9 = jsy.o(node2);
        node2 = jsy.a("SFCooldownMultiplier", node);
        float f10 = jsy.o(node2);
        node2 = jsy.a("SFHealthCostMultiplier", node);
        float f11 = jsy.o(node2);
        cxp2.fr(f6);
        cxp2.fs(f7);
        cxp2.ft(f8);
        cxp2.fu(f9);
        cxp2.fu(f9);
        cxp2.fw(f11);
        cxp2.fp(f5);
        cxp2.fn(f2);
        cxp2.fo(f3);
        cxp2.fq(f4);
    }

    private void a(cxr cxr2, Node node) {
        this.a((cxq)cxr2, node);
    }

    private void a(cxt cxt2, Node node) {
        this.a((cxo)cxt2, node);
        Node node2 = jsy.d("SFBlockingTimerBase", node);
        float f2 = jsy.o(node2);
        cxt2.fn(f2);
        node2 = jsy.d("SFDelayTimerBase", node);
        float f3 = jsy.o(node2);
        cxt2.fx(f3);
        node2 = jsy.d("SFManaCostMultiplier", node);
        float f4 = jsy.o(node2);
        cxt2.fq(f4);
        node2 = jsy.d("SFStaminaMultiplier", node);
        float f5 = jsy.o(node2);
        cxt2.fy(f5);
        node2 = jsy.a("SFBaseManaCost", node);
        float f6 = jsy.o(node2);
        node2 = jsy.a("SFBaseStaminaCost", node);
        float f7 = jsy.o(node2);
        node2 = jsy.a("SFBaseHealthCost", node);
        float f8 = jsy.o(node2);
        node2 = jsy.a("SFBaseCooldown", node);
        float f9 = jsy.o(node2);
        node2 = jsy.a("SFCooldownMultiplier", node);
        float f10 = jsy.o(node2);
        node2 = jsy.a("SFHealthCostMultiplier", node);
        float f11 = jsy.o(node2);
        cxt2.fr(f6);
        cxt2.fs(f7);
        cxt2.ft(f8);
        cxt2.fu(f9);
        cxt2.fu(f9);
        cxt2.fw(f11);
    }

    private void a(cxs cxs2, Node node) {
        this.a((cxt)cxs2, node);
    }

    private void a(cxu cxu2, Node node) {
        this.a((cxo)cxu2, node);
    }

    private void a(cxw cxw2, Node node) {
        this.a((cxv)cxw2, node);
        Node node2 = jsy.d("SFBlockingTimerBase", node);
        float f2 = jsy.o(node2);
        cxw2.fn(f2);
        node2 = jsy.d("SFDelayTimerBase", node);
        float f3 = jsy.o(node2);
        cxw2.fx(f3);
        node2 = jsy.d("SFManaCostMultiplier", node);
        float f4 = jsy.o(node2);
        cxw2.fq(f4);
        node2 = jsy.d("SFStaminaMultiplier", node);
        float f5 = jsy.o(node2);
        cxw2.fy(f5);
        node2 = jsy.a("SFBaseManaCost", node);
        float f6 = jsy.o(node2);
        node2 = jsy.a("SFBaseStaminaCost", node);
        float f7 = jsy.o(node2);
        node2 = jsy.a("SFBaseHealthCost", node);
        float f8 = jsy.o(node2);
        node2 = jsy.a("SFBaseCooldown", node);
        float f9 = jsy.o(node2);
        node2 = jsy.a("SFCooldownMultiplier", node);
        float f10 = jsy.o(node2);
        node2 = jsy.a("SFHealthCostMultiplier", node);
        float f11 = jsy.o(node2);
        cxw2.fr(f6);
        cxw2.fs(f7);
        cxw2.ft(f8);
        cxw2.fu(f9);
        cxw2.fu(f9);
        cxw2.fw(f11);
    }

    private void a(cxx cxx2, Node node) {
        this.a((cxv)cxx2, node);
        Node node2 = jsy.d("SFDurationSkillModifier", node);
        float f2 = jsy.o(node2);
        cxx2.fz(f2);
        node2 = jsy.d("SFDurationTimerBase", node);
        float f3 = jsy.o(node2);
        cxx2.fA(f3);
        node2 = jsy.d("SFSkillCheckAttributeModifier", node);
        float f4 = jsy.o(node2);
        cxx2.fB(f4);
        node2 = jsy.d("SFSkillCheckBase", node);
        float f5 = jsy.o(node2);
        cxx2.fC(f5);
        node2 = jsy.d("SFSkillCheckModifier", node);
        float f6 = jsy.o(node2);
        cxx2.fD(f6);
    }

    private void a(cxy cxy2, Node node) {
        this.a((cxv)cxy2, node);
        Node node2 = jsy.d("SFDurationSkillModifier", node);
        float f2 = jsy.o(node2);
        cxy2.fz(f2);
        node2 = jsy.d("SFDurationTimerBase", node);
        float f3 = jsy.o(node2);
        cxy2.fA(f3);
        node2 = jsy.d("SFSkillCheckAttributeModifier", node);
        float f4 = jsy.o(node2);
        cxy2.fB(f4);
        node2 = jsy.d("SFSkillCheckBase", node);
        float f5 = jsy.o(node2);
        cxy2.fC(f5);
        node2 = jsy.d("SFSkillCheckModifier", node);
        float f6 = jsy.o(node2);
        cxy2.fD(f6);
    }

    private void a(ddd ddd2, Node node) {
        this.a((dde)ddd2, node);
        Node node2 = jsy.d("SFMainAnimation", node);
        boolean bl = jsy.t(node2);
        ddd2.hI(bl);
        dbo dbo2 = this.eP(node);
        ddd2.e(dbo2);
        if ((double)ddd2.bjS() != 0.0) {
            throw new bg("OffsetStart should be 0.0 for a synchronized animation.");
        }
        if ((double)ddd2.bjT() != 1.0) {
            throw new bg("OffsetStop should be 1.0 for a synchronized animation.");
        }
    }

    private dde dy(Node node) {
        Node node2 = jsy.d("SFSynchronizedObjectName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFSynchronizedObjectName' has invalid value.");
        }
        cxd.r r2 = cxd.r.getSynchronizedObjectType(string);
        if (r2 == null) {
            throw new bj("SynchronizedObjectName '" + string + "' is invalid.");
        }
        switch (r2) {
            case fSt: 
            case fSu: {
                ddd ddd2 = new ddd();
                this.a(ddd2, node);
                return ddd2;
            }
            case fSv: {
                ddg ddg2 = new ddg();
                this.a(ddg2, node);
                return ddg2;
            }
            case fSw: {
                ddh ddh2 = new ddh();
                this.a(ddh2, node);
                return ddh2;
            }
        }
        throw new bj("SynchronizedObjectName '" + string + "' is invalid.");
    }

    private void a(dde dde2, Node node) {
        Node node2 = jsy.d("SFOffsetStart", node);
        float f2 = jsy.o(node2);
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new bj("Node 'SFOffsetStart' has invalid value.");
        }
        node2 = jsy.d("SFOffsetStop", node);
        float f3 = jsy.o(node2);
        if (f3 < 0.0f || f3 > 1.0f) {
            throw new bj("Node 'SFOffsetStop' has invalid value.");
        }
        if (f2 >= f3) {
            throw new bj("OffsetStart should be < OffsetStop.");
        }
        dde2.ge(f2);
        dde2.gf(f3);
    }

    private ddf bU(List list) {
        dde[] ddeArray;
        ArrayList<dde> arrayList = lcn.abH(list.size());
        for (int i2 = 0; i2 < list.size(); ++i2) {
            ddeArray = (dde[])list.get(i2);
            dde dde2 = this.dy((Node)ddeArray);
            if (arrayList.isEmpty()) {
                arrayList.add(dde2);
                continue;
            }
            if (dde2 instanceof ddd) {
                ddd ddd2 = (ddd)dde2;
                if (ddd2.bjP()) {
                    ddd ddd3;
                    if (arrayList.get(0) instanceof ddd && (ddd3 = (ddd)arrayList.get(0)).bjP()) {
                        throw new bg("A main synchronized animation has already been found for the group.");
                    }
                    arrayList.add(0, dde2);
                    continue;
                }
                arrayList.add(dde2);
                continue;
            }
            arrayList.add(dde2);
        }
        ddf ddf2 = new ddf();
        ddeArray = new dde[arrayList.size()];
        for (int i3 = 0; i3 < ddeArray.length; ++i3) {
            ddeArray[i3] = (dde)arrayList.get(i3);
        }
        if (!(ddeArray[0] instanceof ddd)) {
            throw new bg("No synchronized animation was found for the group.");
        }
        if (ddeArray.length == 1) {
            throw new bg("The group consists of only an animation. No need to define it as a synchronized object.");
        }
        ddf2.gee = ddeArray;
        return ddf2;
    }

    private void a(ddg ddg2, Node node) {
        this.a((dde)ddg2, node);
        ddb ddb2 = this.eU(node);
        ddg2.a(ddb2);
    }

    private void a(ddh ddh2, Node node) {
        this.a((dde)ddh2, node);
    }
}

