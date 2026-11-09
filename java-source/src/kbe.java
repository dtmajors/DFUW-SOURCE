/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  kah
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kbe {
    public static final lju oRy = new lju(0, 1, 0);

    public void wk(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, oRy);
            NodeList nodeList = document.getElementsByTagName("SFMissileInfo");
            if (nodeList.getLength() == 0) {
                return;
            }
            Map<bwp, bwo> map = lea.eoi();
            Map map2 = lea.eoj();
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                bwo bwo2 = null;
                try {
                    bwo2 = this.eF(nodeList.item(i2));
                    if (!bwo2.nz(3)) {
                        throw new bg("No specialeffect defined for missilestate '" + bwn.ny(3) + "'");
                    }
                    bwp bwp2 = new bwp(bwo2.zg(), bwo2.az());
                    if (map.containsKey(bwp2)) {
                        throw new bg("A missileinfo with missileinfokey " + bwp2 + " already exists.");
                    }
                    if (map2.containsKey(bwo2.getName())) {
                        throw new bg("A missileinfo with MissileInfoName='" + bwo2.getName() + "' already exists.");
                    }
                    Integer n = new Integer(bwo2.getType());
                    if (map2.containsKey(n)) {
                        throw new bg("A missileinfo with MissileInfoType=" + bwo2.getType() + " already exists.");
                    }
                    map.put(bwp2, bwo2);
                    map2.put(bwo2.getName(), bwo2);
                    map2.put(n, bwo2);
                    continue;
                }
                catch (bg bg2) {
                    if (bwo2 != null && bwo2.getName() != null) {
                        throw new bg("Parsing of missileinfo '" + bwo2.getName() + "' failed.", bg2);
                    }
                    throw new bg("Parsing of missileinfo " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private bwo eF(Node node) {
        Node node2 = jsy.d("SFName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFName' has invalid value.");
        }
        node2 = jsy.d("SFType", node);
        int n = jsy.r(node2);
        if (n <= 0) {
            throw new bj("Node 'SFType' has invalid value.");
        }
        try {
            bwt[] bwtArray;
            node2 = jsy.d("SFSkillName", node);
            int n2 = kbi.eM(node2);
            if (n2 < 0) {
                throw new bj("Node 'SFSkillName' has invalid value.");
            }
            node2 = jsy.d("SFResourceName", node);
            int n3 = kah.dv((Node)node2);
            if (n3 < 0) {
                throw new bj("Node 'SFResourceName' has invalid value.");
            }
            node2 = jsy.d("SFRotateObject", node);
            boolean bl = jsy.t(node2);
            node2 = jsy.d("SFUsePhysicsVelocityAutoTimer", node);
            boolean bl2 = jsy.t(node2);
            node2 = jsy.d("SFLineLength", node);
            float f2 = jsy.o(node2);
            if (f2 <= 0.0f) {
                throw new bj("Node 'SFLineLength' has invalid value.");
            }
            node2 = jsy.d("SFUnitAdvancePerSecond", node);
            float f3 = jsy.o(node2);
            if (f3 < 0.0f) {
                throw new bj("Node 'SFUnitAdvancePerSecond' has invalid value.");
            }
            if (!bl2 && f3 == 0.0f) {
                throw new bj("UnitAdvancePerSecond must be > 0.0f if not using PhysicsVelocityAutoTimer.");
            }
            node2 = jsy.d("SFMass", node);
            float f4 = jsy.o(node2);
            if (f4 < 0.0f) {
                throw new bj("Node 'SFMass' has invalid value.");
            }
            node2 = jsy.d("SFStartVelocity", node);
            float f5 = jsy.o(node2);
            if (f5 <= 0.0f) {
                throw new bj("Node 'SFStartVelocity' has invalid value.");
            }
            node2 = jsy.d("SFMaxVelocity", node);
            float f6 = jsy.o(node2);
            if (f6 <= 0.0f) {
                throw new bj("Node 'SFMaxVelocity' has invalid value.");
            }
            node2 = jsy.d("SFMaxDistanceTravel", node);
            float f7 = jsy.o(node2);
            if (f7 <= 0.0f) {
                throw new bj("Node 'SFMaxDistanceTravel' has invalid value.");
            }
            node2 = jsy.a("SFStopOnHittingSomething", node);
            boolean bl3 = node2 != null ? jsy.t(node2) : true;
            bwo bwo2 = new bwo();
            bwo2.setName(string);
            bwo2.setType(n);
            bwo2.eI(n2);
            bwo2.l(n3);
            bwo2.fa(bl);
            bwo2.fb(bl2);
            bwo2.dy(f2);
            bwo2.dC(f3);
            bwo2.dD(f4);
            bwo2.ac(f5);
            bwo2.setMaxVelocity(f6);
            bwo2.ab(f7);
            bwo2.fc(bl3);
            List<Node> list = jsy.c("SFMissileSpecialEffect", node);
            if (!list.isEmpty()) {
                bwtArray = new bwt[list.size()];
                for (int i2 = 0; i2 < bwtArray.length; ++i2) {
                    try {
                        bwtArray[i2] = this.eG(list.get(i2));
                        continue;
                    }
                    catch (bg bg2) {
                        throw new bg("MissileSpecialEffect " + i2 + " could not be parsed.", bg2);
                    }
                }
                bwo2.a(bwtArray);
            }
            if ((node2 = jsy.a("SFNaturalMissileInfo", node)) != null) {
                bwtArray = this.eH(node2);
                bwo2.a((bwu)bwtArray);
            }
            return bwo2;
        }
        catch (bg bg3) {
            throw new bg("Parsing of missileinfo '" + string + "' failed.", bg3);
        }
    }

    private bwt eG(Node node) {
        Node node2 = jsy.d("SFMissileStateName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFMissileStateName' has invalid value.");
        }
        int n = bwn.gE(string);
        if (n <= 0) {
            throw new bj("MissileStateName '" + string + "' is invalid.");
        }
        node2 = jsy.d("SFSpecialEffectName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFSpecialEffectName' has invalid value.");
        }
        int n2 = del.dr(string2);
        if (n2 <= 0) {
            throw new bj("SpecialEffectName '" + string2 + "' is invalid.");
        }
        return new bwt(n, n2);
    }

    private bwu eH(Node node) {
        String string = jsy.c(node, "Name");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'Name' has invalid value.");
        }
        bwu.a a2 = bwu.a.getNaturalMissileTypes(string);
        if (a2 == null) {
            throw new bj("Name '" + string + "' is invalid.");
        }
        String string2 = jsy.c(node, "EffectName");
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Attribute 'EffectName' has invalid value.");
        }
        int n = lea.enT().getType(string2);
        if (n <= 0) {
            throw new bj("EffectName '" + string2 + "' is invalid.");
        }
        bwu bwu2 = new bwu();
        bwu2.dWX = a2;
        bwu2.aYG = n;
        return bwu2;
    }
}

