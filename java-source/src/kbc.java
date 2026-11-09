/*
 * Decompiled with CFR.
 */
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kbc {
    private static final String oPl = "SFLandVehicleInfo";
    private static final String pbG = "SFLandVehicleInfoStartSpawningSpecialEffect";
    private static final String pbH = "SFLandVehicleInfoPreKillSpecialEffect";
    private static final String pbI = "SFLandVehicleInfoKillSpecialEffect";
    private static final String pbJ = "SFLandVehicleInfoUnspawnSpecialEffect";
    private static final String pbK = "SFLandVehicleInfoDamageSpecialEffect";
    private static final String pbL = "SFTankMainCannonInfoResourceName";
    private static final String pbM = "SFTankCannon2InfoResourceName";
    private static final String pbN = "SFTankCannon3InfoResourceName";
    private static final String pbO = "SFTankCannon4InfoResourceName";
    private static final String pbP = "SFTankCannon5InfoResourceName";
    private static final String pbQ = "SFTankCannon6InfoResourceName";
    private static final String pbR = "SFTankCannon7InfoResourceName";
    private static final String pbS = "SFTankCannon8InfoResourceName";
    private static final String pbT = "SFTankCannon9InfoResourceName";
    private static final String pbU = "SFTankTurnRadius";
    private static final String pbV = "SFTankAccelerationRate";
    private static final String pbW = "SFTankDecelerationRate";
    private static final String pbX = "SFTankRollToRestDecelerationRate";
    private static final String pbY = "SFTankBackwardSpeedMultiplier";
    private static final String pbZ = "SFTankVelocityMultiplierThresholdAngle";
    private static final String pca = "SFTankVelocityMultiplierBoostFactor";
    private static final String pcb = "SFTankMaxPitchRockAngle";
    private static final String pcc = "SFTankMaxRollRockAngle";
    private static final String pcd = "SFTankMinObjectCollisionRadius";
    private static final String pce = "SFTankTurnAccelerationRate";
    private static final String pcf = "SFTankTurnDecelerationRate";
    private static final String pcg = "SFTankSpecialEffect";
    private static final String pch = "SFTankMaxContactVelocity";
    private static final String pci = "TankLadderResourceName";
    private static final String pcj = "SFIdleUnusedAudioName";
    private static final String pck = "SFIdleAudioName";
    private static final String pcl = "SFStartAudioName";
    private static final String pcm = "SFStopAudioName";
    private static final String pcn = "SFStartMovingAudioName";
    private static final String pco = "SFStopMovingAudioName";
    private static final String pcp = "SFMovingAudioName";
    private static final String pcq = "SFKillExplosionRadius";
    private static final String pcr = "SFKillExplosionForce";
    private static final String pcs = "SFKillDamageMagnitude";
    private static final lju oRy = new lju(0, 1, 0);

    public void wh(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        try {
            NodeList nodeList = document.getElementsByTagName(oPl);
            if (nodeList.getLength() == 0) {
                lfn.b(2, "SFLandVehicleInfoParser", "loadLandVehicleInfo() No 'SFLandVehicleInfo' nodes found.");
                return;
            }
            Map<Integer, amb> map = lea.eoO();
            amb amb2 = null;
            String string2 = null;
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                amb2 = null;
                try {
                    amb2 = this.eD(nodeList.item(i2));
                    string2 = amb2.Ew();
                    if (map.containsKey(new Integer(amb2.EL()))) {
                        throw new bg("A LandVehicle with ResourceName='" + string2 + "' already exists.");
                    }
                    map.put(new Integer(amb2.EL()), amb2);
                    continue;
                }
                catch (bg bg2) {
                    if (amb2 != null && string2 != null) {
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

    private amb eD(Node node) {
        String string;
        String string2;
        String string3 = this.e(node, "SFResourceName", true);
        int n = lea.enW().getType(string3);
        if (n < 0) {
            throw new bj("Node 'SFResourceName' has invalid value.");
        }
        amb amb2 = new amb();
        String string4 = this.e(node, pbG, true);
        String string5 = this.e(node, pbH, true);
        String string6 = this.e(node, pbI, true);
        String string7 = this.e(node, pbJ, true);
        String string8 = this.e(node, pbK, true);
        String string9 = this.e(node, pbL, false);
        String string10 = this.e(node, pbM, false);
        String string11 = this.e(node, pbN, false);
        String string12 = this.e(node, pbO, false);
        String string13 = this.e(node, pbP, false);
        String string14 = this.e(node, pbQ, false);
        String string15 = this.e(node, pbR, false);
        String string16 = this.e(node, pbS, false);
        String string17 = this.e(node, pbT, false);
        String string18 = this.e(node, pci, false);
        String string19 = this.e(node, pcj, false);
        String string20 = this.e(node, pck, true);
        String string21 = this.e(node, pcl, true);
        String string22 = this.e(node, pcm, true);
        String string23 = this.e(node, pcn, true);
        String string24 = this.e(node, pco, true);
        String string25 = this.e(node, pcp, true);
        float f2 = this.s(node, pcq);
        float f3 = this.s(node, pcr);
        float f4 = this.s(node, pcs);
        float f5 = this.s(node, pch);
        float f6 = this.s(node, pbU);
        float f7 = this.s(node, pbV);
        float f8 = this.s(node, pbW);
        float f9 = this.s(node, pbX);
        float f10 = this.s(node, pbY);
        float f11 = this.s(node, pbZ);
        float f12 = this.s(node, pca);
        float f13 = this.s(node, pcb);
        float f14 = this.s(node, pcc);
        float f15 = this.s(node, pcd);
        float f16 = this.s(node, pce);
        float f17 = this.s(node, pcf);
        for (int i2 = 0; i2 < 20 && (string2 = this.e(node, string = pcg + i2, false)) != null; ++i2) {
            amb2.cO(string2);
        }
        amb2.at(f2);
        amb2.av(f4);
        amb2.au(f3);
        amb2.de(string19);
        amb2.dd(string20);
        amb2.dg(string21);
        amb2.di(string22);
        amb2.dh(string23);
        amb2.dj(string24);
        amb2.df(string25);
        amb2.aw(f5);
        amb2.go(n);
        amb2.cR(string4);
        amb2.dc(string5);
        amb2.cQ(string6);
        amb2.db(string7);
        amb2.cP(string8);
        amb2.da(string9);
        amb2.cS(string10);
        amb2.cT(string11);
        amb2.cU(string12);
        amb2.cV(string13);
        amb2.cW(string14);
        amb2.cX(string15);
        amb2.cY(string16);
        amb2.cZ(string17);
        amb2.dk(string18);
        amb2.ax(f6);
        amb2.ay(f7);
        amb2.az(f8);
        amb2.aA(f9);
        amb2.aB(f10);
        amb2.aC(f11);
        amb2.aD(f12);
        amb2.aE(f13);
        amb2.aF(f14);
        amb2.aG(f15);
        amb2.aH(f16);
        amb2.aI(f17);
        amb2.EM();
        return amb2;
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

