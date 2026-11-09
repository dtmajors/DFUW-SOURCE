/*
 * Decompiled with CFR.
 */
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kbm {
    private static final String pde = "SFWaterVesselInfo";
    private static final String pdf = "SFWaterVesselInfoStartSpawningSpecialEffect";
    private static final String pdg = "SFWaterVesselInfoDamageSpecialEffect";
    private static final String pdh = "SFWaterVesselInfoKillSpecialEffect";
    private static final String pdi = "SFWaterVesselInfoUnspawnSpecialEffect";
    private static final String pdj = "SFWaterVesselInfoSinkSpecialEffect";
    private static final String pdk = "SFWaterVesselInfoPreKillSpecialEffect";
    private static final String pdl = "SFWaterVesselInfoShockChargerSpecialEffect";
    private static final String pdm = "SFWaterVesselInfoSailResourceName";
    private static final String pdn = "SFWaterVesselInfoFishnetResourceName";
    private static final String pdo = "SFWaterVesselInfoFishBoxResourceName";
    private static final String pdp = "SFWaterVesselInfoWaterBackFX";
    private static final String pdq = "SFWaterVesselInfoWaterSideFX";
    private static final String pdr = "SFWaterVesselInfoYawTurnRate";
    private static final String pds = "SFWaterVesselInfoMaxAcceleration";
    private static final String pdt = "SFWaterVesselInfoMaxVelocity";
    private static final String pdu = "SFWaterVesselInfoMaxBackwardVelocityPercentage";
    private static final String pdv = "SFWaterVesselInfoTurnAccelerationRate";
    private static final String pdw = "SFWaterVesselInfoTurnDeccelerationRate";
    private static final String pdx = "SFWaterVesselInfoZeroVelocityTurnFraction";
    private static final String pdy = "SFWaterVesselInfoSinkTime";
    private static final String pdz = "SFWaterVesselInfoCorpseTime";
    private static final String pdA = "SFWaterVesselInfoPreKillTime";
    private static final String pdB = "SFWaterVesselInfoSinkDistance";
    private static final String pdC = "SFWaterVesselInfoRammingDamageMultiplier";
    private static final String pdD = "SFWaterVesselInfoCameraRadius";
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
    public static final lju oRy = new lju(0, 1, 0);

    public void wr(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        try {
            NodeList nodeList = document.getElementsByTagName(pde);
            if (nodeList.getLength() == 0) {
                return;
            }
            Map<Integer, amn> map = lea.eoQ();
            amn amn2 = null;
            String string2 = null;
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                amn2 = null;
                try {
                    amn2 = this.fb(nodeList.item(i2));
                    string2 = amn2.GR();
                    if (map.containsKey(new Integer(amn2.GQ()))) {
                        throw new bg("A watervesselinfo with ResourceName='" + string2 + "' already exists.");
                    }
                    map.put(new Integer(amn2.GQ()), amn2);
                    continue;
                }
                catch (bg bg2) {
                    if (amn2 != null && string2 != null) {
                        throw new bg("Parsing of watervesselinfo With ResourceName'" + string2 + "' failed.", bg2);
                    }
                    throw new bg("Parsing of watervesselinfo " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
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

    private amn fb(Node node) {
        String string;
        String string2;
        Node node2 = jsy.d("SFResourceName", node);
        String string3 = jsy.m(node2);
        if (string3 == null || string3.trim().equals("")) {
            throw new bj("Node 'SFResourceName' has invalid value.");
        }
        int n = lea.enW().getType(string3);
        if (n < 0) {
            throw new bj("Node 'SFResourceName' has invalid value.");
        }
        node2 = jsy.d(pdf, node);
        String string4 = jsy.m(node2);
        if (string4 == null || string4.trim().equals("")) {
            throw new bj("Node 'SFWaterVesselInfoStartSpawningSpecialEffect' has invalid value.");
        }
        node2 = jsy.d(pdg, node);
        String string5 = jsy.m(node2);
        if (string5 == null || string5.trim().equals("")) {
            throw new bj("Node 'SFWaterVesselInfoDamageSpecialEffect' has invalid value.");
        }
        node2 = jsy.d(pdh, node);
        String string6 = jsy.m(node2);
        if (string6 == null || string6.trim().equals("")) {
            throw new bj("Node 'SFWaterVesselInfoKillSpecialEffect' has invalid value.");
        }
        node2 = jsy.d(pdk, node);
        String string7 = jsy.m(node2);
        if (string7 == null || string7.trim().equals("")) {
            throw new bj("Node 'SFWaterVesselInfoPreKillSpecialEffect' has invalid value.");
        }
        node2 = jsy.d(pdi, node);
        String string8 = jsy.m(node2);
        if (string8 == null || string8.trim().equals("")) {
            throw new bj("Node 'SFWaterVesselInfoUnspawnSpecialEffect' has invalid value.");
        }
        node2 = jsy.d(pdj, node);
        String string9 = jsy.m(node2);
        if (string9 == null || string9.trim().equals("")) {
            throw new bj("Node 'SFWaterVesselInfoSinkSpecialEffect' has invalid value.");
        }
        String string10 = "";
        node2 = jsy.a(pdl, node);
        if (node2 != null) {
            string10 = jsy.m(node2);
        }
        if ((string2 = jsy.m(node2 = jsy.d(pdm, node))) == null) {
            throw new bj("Node 'SFWaterVesselInfoSailResourceName' has invalid value.");
        }
        node2 = jsy.d(pdn, node);
        String string11 = jsy.m(node2);
        if (string11 == null) {
            throw new bj("Node 'SFWaterVesselInfoFishnetResourceName' has invalid value.");
        }
        String string12 = null;
        node2 = jsy.a(pdo, node);
        if (node2 != null) {
            string12 = jsy.m(node2);
            if (string11 == null) {
                throw new bj("Node 'SFWaterVesselInfoFishBoxResourceName' has invalid value.");
            }
        }
        if ((string = jsy.m(node2 = jsy.d(pdp, node))) == null) {
            throw new bj("Node 'SFWaterVesselInfoWaterBackFX' has invalid value.");
        }
        node2 = jsy.d(pdq, node);
        String string13 = jsy.m(node2);
        if (string13 == null) {
            throw new bj("Node 'SFWaterVesselInfoWaterSideFX' has invalid value.");
        }
        String string14 = this.e(node, pcj, false);
        String string15 = this.e(node, pck, true);
        String string16 = this.e(node, pcl, true);
        String string17 = this.e(node, pcm, true);
        String string18 = this.e(node, pcn, true);
        String string19 = this.e(node, pco, true);
        String string20 = this.e(node, pcp, true);
        node2 = jsy.d(pcq, node);
        float f2 = jsy.o(node2);
        node2 = jsy.d(pcr, node);
        float f3 = jsy.o(node2);
        node2 = jsy.d(pcs, node);
        float f4 = jsy.o(node2);
        node2 = jsy.d(pdr, node);
        float f5 = jsy.o(node2);
        node2 = jsy.d(pds, node);
        float f6 = jsy.o(node2);
        node2 = jsy.d(pdt, node);
        float f7 = jsy.o(node2);
        node2 = jsy.d(pdu, node);
        float f8 = jsy.o(node2) * f7;
        node2 = jsy.d(pdv, node);
        float f9 = jsy.o(node2);
        node2 = jsy.d(pdw, node);
        float f10 = jsy.o(node2);
        node2 = jsy.d(pdx, node);
        float f11 = jsy.o(node2);
        float f12 = this.s(node, pdy);
        float f13 = this.s(node, pdz);
        float f14 = this.s(node, pdA);
        float f15 = this.s(node, pdB);
        float f16 = this.s(node, pdC);
        float f17 = -1.0f;
        try {
            f17 = this.s(node, pdD);
        }
        catch (Exception exception) {
            // empty catch block
        }
        amn amn2 = new amn();
        amn2.bj(f12);
        amn2.bk(f13);
        amn2.bl(f14);
        amn2.bm(f15);
        amn2.hc(n);
        amn2.cR(string4);
        amn2.cP(string5);
        amn2.dc(string7);
        amn2.cQ(string6);
        amn2.db(string8);
        amn2.dt(string9);
        amn2.dw(string2);
        amn2.dx(string11);
        amn2.dz(string12);
        amn2.du(string);
        amn2.dv(string13);
        amn2.av(f4);
        amn2.au(f3);
        amn2.at(f2);
        amn2.dy(string10);
        amn2.de(string14);
        amn2.dd(string15);
        amn2.dg(string16);
        amn2.di(string17);
        amn2.dh(string18);
        amn2.dj(string19);
        amn2.df(string20);
        amn2.be(f5);
        amn2.bf(f6);
        amn2.setMaxVelocity(f7);
        amn2.bn(f8);
        amn2.bg(f9);
        amn2.bh(f10);
        amn2.bi(f11);
        amn2.bo(f16);
        amn2.bp(f17);
        amn2.EM();
        return amn2;
    }
}

