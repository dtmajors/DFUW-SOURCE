/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lkv
 */
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kbh {
    public void wm(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        Document document = jsy.tJ(string);
        try {
            NodeList nodeList = document.getElementsByTagName("SFSiegeEngineInfo");
            if (nodeList.getLength() == 0) {
                return;
            }
            Map<Integer, amj> map = lea.eoP();
            amj amj2 = null;
            String string2 = null;
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                amj2 = null;
                try {
                    amj2 = this.eK(nodeList.item(i2));
                    if (map.containsKey(new Integer(amj2.FY()))) {
                        throw new bg("A siege engine already exists.");
                    }
                    amj2.update();
                    map.put(new Integer(amj2.FY()), amj2);
                    continue;
                }
                catch (bg bg2) {
                    if (amj2 != null && string2 != null) {
                        throw new bg("Parsing of LandVehicle With ResourceName'" + string2 + "' failed.", bg2);
                    }
                    throw new bg("Parsing of LandVehicle " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private amj eK(Node node) {
        Object object;
        Object object2;
        amj amj2 = new amj();
        String string = this.e(node, "SFResourceName", true);
        int n = lea.enW().getType(string);
        if (n < 0) {
            assert (false);
            return null;
        }
        amj2.gN(n);
        amj2.cR(this.e(node, "SFSiegeEngineInfoStartSpawningSpecialEffect", true));
        amj2.db(this.e(node, "SFSiegeEngineInfoUnspawnSpecialEffect", true));
        amj2.cP(this.e(node, "SFSiegeEngineInfoDamageSpecialEffect", true));
        amj2.dc(this.e(node, "SFSiegeEngineInfoPreKillSpecialEffect", true));
        amj2.cQ(this.e(node, "SFSiegeEngineInfoKillSpecialEffect", true));
        amj2.de(this.e(node, "SFIdleUnusedAudioName", false));
        amj2.dd(this.e(node, "SFIdleAudioName", false));
        amj2.dg(this.e(node, "SFStartAudioName", false));
        amj2.di(this.e(node, "SFStopAudioName", false));
        amj2.dh(this.e(node, "SFStartMovingAudioName", false));
        amj2.dj(this.e(node, "SFStopMovingAudioName", false));
        amj2.df(this.e(node, "SFMovingAudioName", false));
        amj2.aQ(this.s(node, "SFSiegeEngineTurnRadius"));
        amj2.aR(this.s(node, "SFSiegeEngineAccelerationRate"));
        amj2.aS(this.s(node, "SFSiegeEngineDecelerationRate"));
        amj2.aT(this.s(node, "SFSiegeEngineRollToRestDecelerationRate"));
        amj2.aU(this.s(node, "SFSiegeEngineBackwardSpeedMultiplier"));
        amj2.aV(this.s(node, "SFSiegeEngineVelocityMultiplierThresholdAngle"));
        amj2.aW(this.s(node, "SFSiegeEngineVelocityMultiplierBoostFactor"));
        amj2.aX(this.s(node, "SFSiegeEngineMaxPitchRockAngle"));
        amj2.aY(this.s(node, "SFSiegeEngineMaxRollRockAngle"));
        amj2.bc(this.s(node, "SFSiegeEngineMaxContactVelocity"));
        amj2.aZ(this.s(node, "SFSiegeEngineMinObjectCollisionRadius"));
        amj2.ba(this.s(node, "SFSiegeEngineTurnAccelerationRate"));
        amj2.bb(this.s(node, "SFSiegeEngineTurnDecelerationRate"));
        amj2.av(this.s(node, "SFKillDamageMagnitude"));
        amj2.at(this.s(node, "SFKillExplosionRadius"));
        amj2.au(this.s(node, "SFKillExplosionForce"));
        amj2.bd(this.s(node, "SFMissileDelayTime"));
        List<Node> list2 = jsy.c("SFSiegeEngineInfoSpawnable", node);
        for (Node list3 : list2) {
            object2 = new amk();
            ((amk)object2).ResourceType = lea.enW().getType(list3.getAttributes().getNamedItem("ResourceType").getNodeValue());
            ((amk)object2).byk = list3.getAttributes().getNamedItem("AttachPoint").getNodeValue();
            Node node2 = list3.getAttributes().getNamedItem("SpawnableType");
            if (node2 != null) {
                ((amk)object2).byl = amk.a.valueOf(node2.getNodeValue());
            }
            amj2.Gn().add((amk)object2);
        }
        List<Node> list4 = jsy.c("SFSiegeEngineInfoWheel", node);
        Iterator iterator = list4.iterator();
        while (iterator.hasNext()) {
            object2 = (Node)iterator.next();
            String string2 = object2.getAttributes().getNamedItem("Mesh").getNodeValue();
            object = object2.getAttributes().getNamedItem("AttachPoint").getNodeValue();
            amj2.Go().put((String)object, string2);
        }
        List<Node> list = jsy.c("SFSiegeEngineInfoAnimationState", node);
        for (Node node3 : list) {
            object = new amj.a(amj2);
            ((amj.a)object).bxZ = node3.getAttributes().getNamedItem("AttachPoint").getNodeValue();
            ((amj.a)object).bya = lkv.AG((String)node3.getAttributes().getNamedItem("Idle").getNodeValue());
            ((amj.a)object).byb = lkv.AG((String)node3.getAttributes().getNamedItem("Moving").getNodeValue());
            amj2.Gp().add((amj.a)object);
        }
        object2 = jsy.c("SFSiegeEngineInfoSkill", node);
        Iterator iterator2 = object2.iterator();
        while (iterator2.hasNext()) {
            object = (Node)iterator2.next();
            amj.b b2 = new amj.b(amj2);
            b2.SkillType = lea.enZ().getType(object.getAttributes().getNamedItem("SkillName").getNodeValue());
            b2.byd = lea.enW().getType(object.getAttributes().getNamedItem("CannonInfoResourceType").getNodeValue());
            b2.bye = object.getAttributes().getNamedItem("ChargingSpecialEffect").getNodeValue();
            b2.byg = Float.valueOf(object.getAttributes().getNamedItem("ChargingSpecialEffectDelay").getNodeValue()).floatValue();
            b2.byi = Float.valueOf(object.getAttributes().getNamedItem("LaunchDamageMagnitude").getNodeValue()).floatValue();
            b2.byj = Float.valueOf(object.getAttributes().getNamedItem("LaunchDamageRadius").getNodeValue()).floatValue();
            b2.byh = lea.enT().getType(object.getAttributes().getNamedItem("LaunchDamageType").getNodeValue());
            amj2.Gq().put(b2.SkillType, b2);
        }
        return amj2;
    }

    private String e(Node node, String string, boolean bl) {
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

    private float s(Node node, String string) {
        Node node2 = jsy.d(string, node);
        float f2 = jsy.o(node2);
        return f2;
    }

    private int t(Node node, String string) {
        Node node2 = jsy.d(string, node);
        int n = jsy.r(node2);
        return n;
    }
}

