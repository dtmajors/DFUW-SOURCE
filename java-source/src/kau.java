/*
 * Decompiled with CFR.
 */
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kau {
    public static final lju oRy = new lju(0, 1, 0);

    public void vV(String string) {
        if (string == null) {
            throw new bi("FilePath is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        try {
            NodeList nodeList = document.getElementsByTagName("SFCannonInfo");
            if (nodeList.getLength() == 0) {
                return;
            }
            Map<Integer, bwm> map = lea.eok();
            bwm bwm2 = null;
            String string2 = null;
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                bwm2 = null;
                try {
                    bwm2 = this.dx(nodeList.item(i2));
                    int n = bwm2.az();
                    string2 = lea.enW().getName(n);
                    if (map.containsKey(new Integer(bwm2.az()))) {
                        throw new bg("A cannoninfo with ResourceName='" + string2 + "' already exists.");
                    }
                    map.put(new Integer(n), bwm2);
                    continue;
                }
                catch (bg bg2) {
                    if (bwm2 != null && string2 != null) {
                        throw new bg("Parsing of cannoninfo With ResourceName'" + string2 + "' failed.", bg2);
                    }
                    throw new bg("Parsing of cannoninfo " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bg("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    private bwm dx(Node node) {
        Node node2 = jsy.d("SFResourceName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFResourceName' has invalid value.");
        }
        node2 = jsy.d("SFCannonInfoGunType", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFCannonInfoGunType' has invalid value.");
        }
        String string3 = "";
        node2 = jsy.a("SFCannonInfoLineFireEffect", node);
        if (node2 != null && ((string3 = jsy.m(node2)) == null || string3.trim().equals(""))) {
            throw new bj("Node 'SFCannonInfoLineFireEffect' has invalid value.");
        }
        node2 = jsy.d("SFMissileInfoName", node);
        String string4 = jsy.m(node2);
        if (string4 == null || string4.trim().equals("")) {
            throw new bj("Node 'SFMissileInfoName' has invalid value.");
        }
        bwo bwo2 = (bwo)lea.eoj().get(string4);
        if (bwo2 == null) {
            throw new bj("MissileInfoName '" + string4 + "' is Invalid.");
        }
        node2 = jsy.d("SFMissileRadius", node);
        float f2 = jsy.o(node2);
        if (f2 < 0.0f) {
            throw new bj("Node 'SFMissileRadius' has invalid value.");
        }
        float f3 = 0.0f;
        node2 = jsy.a("SFCannonInfoLineLength", node);
        if (node2 != null && (f3 = jsy.o(node2)) < 0.0f) {
            throw new bj("Node 'SFCannonInfoLineLength' has invalid value.");
        }
        node2 = jsy.d("SFDamage", node);
        float f4 = jsy.o(node2);
        node2 = jsy.d("SFDamageName", node);
        String string5 = jsy.m(node2);
        if (string5 == null || string5.trim().equals("")) {
            throw new bj("Node 'SFDamageName' has invalid value.");
        }
        int n = lea.enT().getType(string5);
        if (n < 0) {
            throw new bj("Damage Effect '" + string5 + "' doesn't exist in effect tree.");
        }
        node2 = jsy.d("SFDamageName2", node);
        String string6 = jsy.m(node2);
        if (string6 == null) {
            throw new bj("Node 'SFDamageName2' has invalid value.");
        }
        int n2 = -1;
        if (!string6.trim().equals("") && (n2 = lea.enT().getType(string6)) < 0) {
            throw new bj("Damage Effect '" + string6 + "' doesn't exist in effect tree.");
        }
        int n3 = lea.enW().getType(string);
        if (n3 < 0) {
            throw new bj("ResourceName '" + string + "' doesn't exist in resource tree.");
        }
        node2 = jsy.d("SFCannonInfoAmmo", node);
        int n4 = jsy.r(node2);
        if (n4 < -1 || n4 > 1000) {
            throw new bj("Node 'SFCannonInfoAmmo' has invalid value.");
        }
        node2 = jsy.d("SFCannonInfoMainGun", node);
        boolean bl = jsy.t(node2);
        node2 = jsy.d("SFCannonInfoMaxSpeed", node);
        float f5 = jsy.o(node2);
        if (f5 < 0.0f || f5 > 4.0f) {
            throw new bj("Node 'SFCannonInfoMaxSpeed' has invalid value.");
        }
        node2 = jsy.d("SFCannonInfoYawTurnAngle", node);
        float f6 = jsy.o(node2);
        if (f6 < 0.0f || (double)f6 > Math.PI) {
            throw new bj("Node 'SFCannonInfoYawTurnAngle' has invalid value.");
        }
        node2 = jsy.d("SFCannonInfoPitchTurnAngle", node);
        float f7 = jsy.o(node2);
        if (f7 < 0.0f || (double)f7 > Math.PI) {
            throw new bj("Node 'SFCannonInfoPitchTurnAngle' has invalid value.");
        }
        node2 = jsy.d("SFCannonInfoAccelerationTime", node);
        float f8 = jsy.o(node2);
        if (f8 < 0.0f || f8 > 5.0f) {
            throw new bj("Node 'SFCannonInfoAccelerationTime' has invalid value.");
        }
        node2 = jsy.d("SFCannonInfoReloadTimer", node);
        float f9 = jsy.o(node2);
        if (f9 < 0.0f || f9 > 100.0f) {
            throw new bj("Node 'SFCannonInfoReloadTimer' has invalid value.");
        }
        node2 = jsy.d("SFCannonInfoSpawnEffect", node);
        String string7 = jsy.m(node2);
        if (string7 == null || string7.trim().equals("")) {
            throw new bj("Node 'SFCannonInfoSpawnEffect' has invalid value.");
        }
        node2 = jsy.d("SFCannonInfoDamageEffect", node);
        String string8 = jsy.m(node2);
        if (string8 == null || string8.trim().equals("")) {
            throw new bj("Node 'SFCannonInfoDamageEffect' has invalid value.");
        }
        node2 = jsy.d("SFCannonInfoKillEffect", node);
        String string9 = jsy.m(node2);
        if (string9 == null || string9.trim().equals("")) {
            throw new bj("Node 'SFCannonInfoKillEffect' has invalid value.");
        }
        node2 = jsy.d("SFCannonInfoNoAmmoEffect", node);
        String string10 = jsy.m(node2);
        if (string10 == null || string10.trim().equals("")) {
            throw new bj("Node 'SFCannonInfoNoAmmoEffect' has invalid value.");
        }
        node2 = jsy.d("SFCannonInfoExplosionEffectNormal", node);
        String string11 = jsy.m(node2);
        if (string11 == null || string11.trim().equals("")) {
            throw new bj("Node 'SFCannonInfoExplosionEffectNormal' has invalid value.");
        }
        node2 = jsy.d("SFCannonInfoExplosionEffectWater", node);
        String string12 = jsy.m(node2);
        if (string12 == null || string12.trim().equals("")) {
            throw new bj("Node 'SFCannonInfoExplosionEffectWater' has invalid value.");
        }
        String string13 = "";
        node2 = jsy.e("SFCannonInfoRelationSFX", node);
        if (node2 != null && ((string13 = jsy.m(node2)) == null || string13.trim().equals(""))) {
            throw new bj("Node 'SFCannonInfoRelationSFX' has invalid value.");
        }
        node2 = jsy.d("SFCannonInfoPrepareToKillEffect", node);
        String string14 = jsy.m(node2);
        if (string14 == null || string14.trim().equals("")) {
            throw new bj("Node 'SFCannonInfoPrepareToKillEffect' has invalid value.");
        }
        node2 = jsy.d("SFCannonInfoCannonKillExplosionRadius", node);
        float f10 = jsy.o(node2);
        if (f10 < 0.0f || f9 > 50.0f) {
            throw new bj("Node 'SFCannonInfoCannonKillExplosionRadius' has invalid value.");
        }
        node2 = jsy.d("SFCannonInfoCannonKillExplosionForce", node);
        float f11 = jsy.o(node2);
        if (f11 < 0.0f || f9 > 10.0f) {
            throw new bj("Node 'SFCannonInfoCannonKillExplosionForce' has invalid value.");
        }
        node2 = jsy.d("SFCannonInfoCannonKillDamageMagnitude", node);
        float f12 = jsy.o(node2);
        if (f11 < 0.0f || f9 > 50.0f) {
            throw new bj("Node 'SFCannonInfoCannonKillDamageMagnitude' has invalid value.");
        }
        bwm bwm2 = new bwm();
        bwm2.cN(f4);
        bwm2.nt(n);
        bwm2.nw(n2);
        bwm2.gt(string4);
        bwm2.ds(f2);
        bwm2.nu(bwo2.getType());
        bwm2.l(n3);
        bwm2.gA(string2);
        bwm2.eZ(bl);
        bwm2.gB(string3);
        bwm2.dy(f3);
        bwm2.nv(n4);
        bwm2.du(f5);
        bwm2.dw(f6);
        bwm2.dv(f7);
        bwm2.dt(f8);
        bwm2.dx(f9);
        bwm2.gw(string7);
        bwm2.gu(string8);
        bwm2.gv(string9);
        bwm2.gx(string10);
        bwm2.gy(string11);
        bwm2.gz(string12);
        bwm2.gC(string14);
        bwm2.dA(f11);
        bwm2.dz(f10);
        bwm2.dB(f12);
        bwm2.gD(string13);
        bwm2.EM();
        return bwm2;
    }
}

