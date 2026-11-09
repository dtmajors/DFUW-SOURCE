/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.HashMap;
import java.util.Map;

public class jjn {
    public static final String npo = "texture/dds/gui/mapindicator/mm_marker_party_player.dds";
    public static final String npp = "texture/dds/gui/mapindicator/mm_marker_party_player_selected.dds";

    public static String Vd(int n) {
        String string = "";
        switch (n) {
            case 1: {
                string = lzc.tPp.bD(new Object[0]).exA();
                break;
            }
            case 2: {
                string = lzc.tPq.bD(new Object[0]).exA();
                break;
            }
            case 3: {
                string = lzc.tPr.bD(new Object[0]).exA();
                break;
            }
            case 4: {
                string = lzc.tPs.bD(new Object[0]).exA();
                break;
            }
            case 5: {
                string = lzc.tPt.bD(new Object[0]).exA();
                break;
            }
            case 6: {
                string = lzc.tPu.bD(new Object[0]).exA();
                break;
            }
            case 7: {
                string = lzc.tPv.bD(new Object[0]).exA();
                break;
            }
            case 8: {
                string = lzc.tPw.bD(new Object[0]).exA();
                break;
            }
            case 9: {
                string = lzc.tPx.bD(new Object[0]).exA();
                break;
            }
            case 10: {
                string = lzc.tPy.bD(new Object[0]).exA();
                break;
            }
            case 11: {
                string = lzc.tPz.bD(new Object[0]).exA();
            }
        }
        return string;
    }

    public static String I(jjh jjh2) {
        switch (jjh2.dJr()) {
            case noM: 
            case noh: 
            case noi: 
            case nnZ: {
                lgw lgw2 = (lgw)lea.enW().zx(jjh2.getAttribute("ResourceName"));
                return lzc.tod.bD(lgw2.getName()).exA().toUpperCase();
            }
            case noD: {
                String string = jjh2.getAttribute("Owner");
                if (string != null && string.length() > 0) {
                    return jjm.noD.dJw().bD(new Object[0]).exA().toUpperCase();
                }
                return lzc.tOP.bD(new Object[0]).exA().toUpperCase();
            }
            case noG: {
                return null;
            }
        }
        return jjh2.dJw().bD(new Object[0]).exA().toUpperCase();
    }

    public static String o(double d2, double d3) {
        return lvm.sXg.bD(new ljq(d2, 0.0, d3)).exA();
    }

    public static void a(StringBuilder stringBuilder, jjh jjh2, int n) {
        jjh jjh3 = hso.cxK().cxT().dIU();
        HashMap<String, String> hashMap = jjn.b(jjh2, jjh3);
        String string = jjn.a(jjh2, jjh3);
        if (string.equalsIgnoreCase("Monster")) {
            return;
        }
        String string2 = jjn.I(jjh2);
        Object var7_7 = null;
        if (n > 0) {
            stringBuilder.append(";;");
        }
        stringBuilder.append(string);
        stringBuilder.append(";");
        stringBuilder.append(string2);
        if (!hashMap.isEmpty()) {
            HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null || !jji.sC(entry.getKey())) continue;
                String string3 = entry.getValue();
                boolean bl = true;
                switch (jjh2.dJr()) {
                    case noF: {
                        String[] stringArray = string3.split(";");
                        String string4 = lzc.tod.bD(stringArray[0]).exA().toUpperCase();
                        int n2 = Integer.valueOf(stringArray[1]);
                        Integer n3 = (Integer)hashMap2.get(string4);
                        if (n3 != null && n3 == n2) {
                            bl = false;
                            break;
                        }
                        String string5 = jjn.Vd(n2);
                        if (string5 == null || string5.isEmpty()) {
                            // empty if block
                        }
                        string3 = string4 + (n2 > 0 ? " (" + (string5 != null ? string5.toUpperCase() : "") + ")" : "");
                        hashMap2.put(string4, n2);
                        break;
                    }
                    case noz: 
                    case noA: 
                    case noB: 
                    case noC: {
                        if (!entry.getKey().equals("Text")) break;
                        Object object = (lgw)lea.enW().zx(jjh2.getAttribute("ResourceName"));
                        string3 = lxf.tod.bD(((ler)object).getType()).exA();
                        break;
                    }
                    case noH: 
                    case noI: {
                        if (!entry.getKey().equals("Text")) break;
                        string3 = lvm.sXg.bD(jjh2.av()).exA();
                        break;
                    }
                    case noM: 
                    case noN: {
                        if (!entry.getKey().equals("Text")) break;
                        string3 = lvm.sXg.bD(jjh2.av()).exA();
                        break;
                    }
                    case noD: {
                        if (!entry.getKey().equals("Name")) break;
                        Object object = hso.cxK().cxP().czd().ng(jjh2.oq());
                        string3 = object != null ? lvm.sWZ.bD(((bbh)object).getID()).exA() : "village not found";
                    }
                }
                if (!bl) continue;
                stringBuilder.append(";");
                stringBuilder.append(entry.getKey());
                stringBuilder.append("=");
                stringBuilder.append(string3.toUpperCase());
            }
        }
    }

    private static String a(jjh jjh2, jjh jjh3) {
        switch (jjh2.dJr()) {
            case nnR: 
            case noa: 
            case nnT: 
            case nnS: 
            case nnU: 
            case nog: {
                return "TrackedItem";
            }
        }
        return jjh2.dJv();
    }

    private static HashMap<String, String> b(jjh jjh2, jjh jjh3) {
        HashMap<String, String> hashMap;
        switch (jjh2.dJr()) {
            case nnR: {
                hashMap = new HashMap();
                hashMap.put("NameLabel", lzc.tNM.bD(new Object[0]).exA());
                hashMap.put("DistanceLabel", lzc.tNN.bD(new Object[0]).exA());
                String string = lvm.sXg.bD(jjh3.av()).exA().toUpperCase();
                hashMap.put("Name", string);
                hashMap.put("Distance", String.format("X:%d Y:%d", (int)jjh3.av().x, (int)jjh3.av().rlV));
                break;
            }
            case noa: {
                hashMap = jjn.a(jjh2, jjh3, jjh2.getAttribute("text", "not found"));
                break;
            }
            case nnS: {
                hashMap = jjn.a(jjh2, jjh3, lzc.tNO.bD(new Object[0]).exA());
                break;
            }
            case nnU: {
                hashMap = new HashMap();
                String string = lcw.ea((ljq)jjh2.av()).toUpperCase();
                double d2 = jjh2.av().x - jjh3.av().x;
                double d3 = -jjh2.av().rlV - -jjh3.av().rlV;
                double d4 = Math.sqrt(d2 * d2 + d3 * d3);
                String string2 = d4 <= 1000.0 ? (long)d4 + "  " + lzc.tNs.bD(new Object[0]).exA() : String.format("%.3f", d4 / 1000.0) + " " + lzc.tNt.bD(new Object[0]).exA();
                hashMap.put("NameLabel", lzc.tNM.bD(new Object[0]).exA());
                hashMap.put("DistanceLabel", lzc.tNr.bD(new Object[0]).exA());
                hashMap.put("Name", string);
                hashMap.put("Distance", string2);
                break;
            }
            case nnT: {
                lgw lgw2 = (lgw)lea.enW().zx(jjh2.getAttribute("ResourceName"));
                String string = lgw2 != null ? lzc.tod.bD(lgw2.getName()).exA() : lzc.tNQ.bD(new Object[0]).exA();
                hashMap = jjn.a(jjh2, jjh3, string);
                break;
            }
            case nog: {
                hashMap = jjn.a(jjh2, jjh3, jjh2.getAttribute("ClanMemberName", "not found"));
                break;
            }
            case noy: {
                hashMap = new HashMap();
                String string = jjh2.getAttribute("VendorID");
                hashMap.put("Name", lvm.sXk.bD(string).exA().toUpperCase());
                String string3 = lvm.sXl.bD(string).exA().toUpperCase();
                if (string3.contains(string.toUpperCase())) break;
                hashMap.put("Type", lvm.sXl.bD(string).exA().toUpperCase());
                break;
            }
            case npc: {
                hashMap = new HashMap();
                hashMap.put("Text", lvm.sXa.bD(jjh2.getAttribute("Text")).exA());
                break;
            }
            default: {
                hashMap = jjh2.dJx();
            }
        }
        return hashMap;
    }

    private static HashMap<String, String> a(jjh jjh2, jjh jjh3, String string) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        double d2 = jjh2.av().x - jjh3.av().x;
        double d3 = -jjh2.av().rlV - -jjh3.av().rlV;
        double d4 = Math.sqrt(d2 * d2 + d3 * d3);
        String string2 = d4 <= 1000.0 ? (long)d4 + "  " + lzc.tNs.bD(new Object[0]).exA() : String.format("%.3f", d4 / 1000.0) + " " + lzc.tNt.bD(new Object[0]).exA();
        hashMap.put("NameLabel", lzc.tNq.bD(new Object[0]).exA());
        hashMap.put("DistanceLabel", lzc.tNr.bD(new Object[0]).exA());
        hashMap.put("Name", string);
        hashMap.put("Distance", string2);
        return hashMap;
    }
}

