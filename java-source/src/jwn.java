/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jwn {
    public static final String oWs = "AreaSettings";
    public static final String oXu = "Area";
    public static final String oXv = "Sunrise";
    public static final String oXw = "Midday";
    public static final String oXx = "Sunset";
    public static final String oXy = "Midnight";
    public static final String oXz = "Music";
    public static final String oXA = "Name";
    public static final String oXB = "RandomEffect";
    public static final String oXC = "Tiles";
    public static final String oXD = "File";
    public static final String oXE = "Probability";
    private static final boolean bC = true;
    private static final boolean oXF = true;
    private jxd oXG = new jxd();
    private final lju oRy = new lju(0, 1, 0);

    public List<dqt> dUp() {
        String string = "xml-files/zones/env_weather_settings.xml";
        return this.uL(string);
    }

    public List<dqt> dUq() {
        String string = "xml-files/zones/env_music_settings.xml";
        return this.uL(string);
    }

    private List<dqt> uL(String string) {
        ArrayList<dqt> arrayList = lcn.emv();
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, this.oRy);
            NodeList nodeList = document.getElementsByTagName(oXu);
            if (nodeList.getLength() == 0) {
                lfn.b(2, "SFEnvironmentAreaConfigParser", "loadTileInfoMap() No 'TileInfo' nodes found.");
                return null;
            }
            int n = nodeList.getLength();
            for (int i2 = 0; i2 < n; ++i2) {
                dqt dqt2 = new dqt();
                try {
                    String string2 = null;
                    Node node = nodeList.item(i2);
                    string2 = oXA;
                    NamedNodeMap namedNodeMap = node.getAttributes();
                    Node node2 = namedNodeMap.getNamedItem(string2);
                    if (node2 == null) {
                        throw new bj("Node '" + string2 + "' not found.");
                    }
                    dqt2.Name = node2.getNodeValue();
                    string2 = oXB;
                    node2 = namedNodeMap.getNamedItem(string2);
                    if (node2 != null) {
                        dqt2.gPz = Integer.parseInt(node2.getNodeValue());
                    }
                    if ((node2 = namedNodeMap.getNamedItem(string2 = oXC)) == null) {
                        throw new bj("Node '" + string2 + "' not found.");
                    }
                    ArrayList<String> arrayList2 = lcn.emv();
                    StringTokenizer stringTokenizer = new StringTokenizer(node2.getNodeValue(), ",");
                    while (stringTokenizer.hasMoreTokens()) {
                        arrayList2.add(stringTokenizer.nextToken());
                    }
                    dqt2.gPA = arrayList2;
                    string2 = oXv;
                    node2 = jsy.d(string2, node);
                    if (node2 == null) {
                        throw new bj("Node '" + string2 + "' not found.");
                    }
                    dqt2.dfG = this.bc(node2);
                    string2 = oXw;
                    node2 = jsy.d(string2, node);
                    if (node2 == null) {
                        throw new bj("Node '" + string2 + "' not found.");
                    }
                    dqt2.dfH = this.bc(node2);
                    string2 = oXx;
                    node2 = jsy.d(string2, node);
                    if (node2 == null) {
                        throw new bj("Node '" + string2 + "' not found.");
                    }
                    dqt2.dfI = this.bc(node2);
                    string2 = oXy;
                    node2 = jsy.d(string2, node);
                    if (node2 == null) {
                        throw new bj("Node '" + string2 + "' not found.");
                    }
                    dqt2.dfJ = this.bc(node2);
                    arrayList.add(dqt2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of tileinfo " + i2 + " failed.", bg2);
                }
            }
        }
        catch (bg bg3) {
            throw new bs("Parsing of file '" + string + "' failed.", bg3);
        }
        return arrayList;
    }

    private List<dqy> bc(Node node) {
        ArrayList<dqy> arrayList = lcn.emv();
        List<Node> list = jsy.c(oXz, node);
        for (Node node2 : list) {
            NamedNodeMap namedNodeMap = node2.getAttributes();
            if (namedNodeMap == null) continue;
            Node node3 = namedNodeMap.getNamedItem(oXD);
            if (node3 == null) {
                throw new bj("Attribute 'File' has invalid value.");
            }
            dqy dqy2 = new dqy(node3.getNodeValue());
            node3 = namedNodeMap.getNamedItem(oXE);
            if (node3 != null) {
                dqy2.ddW = Integer.parseInt(node3.getNodeValue());
            }
            arrayList.add(dqy2);
        }
        return arrayList;
    }

    private List<ber> a(String string, bfj bfj2) {
        Map<ldv, amf> map = this.uN(string);
        ber ber2 = new ber();
        ber2.db(true);
        for (amf amf2 : map.values()) {
            if (!(amf2 instanceof dqv)) continue;
            bfj2.a(ber2, (dqv)amf2, 259, 60);
            bfj2.a(ber2, (dqv)amf2, 360, 60);
            bfj2.a(ber2, (dqv)amf2, 1296, 60);
            bfj2.a(ber2, (dqv)amf2, 28, 60);
        }
        ArrayList arrayList = lcn.emv();
        arrayList.add(ber2);
        return arrayList;
    }

    private List<String> uM(String string) {
        ArrayList<String> arrayList = lcn.emv();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(lcw.qLb);
        stringBuilder.append("xml-files/objectspace/environment/weather/");
        jrw jrw2 = new jrw(stringBuilder.toString());
        assert (jrw2.exists());
        for (jrw jrw3 : jrw2.dRT()) {
            if (!jrw3.getName().contains(string)) continue;
            arrayList.add(jrw3.getName());
        }
        return arrayList;
    }

    public Map<Integer, List<ber>> dUr() {
        Object object;
        Map<Integer, List<ber>> map = lcn.emw();
        bfj bfj2 = new bfj();
        int n = -1 * lcw.g((lej)new lej(0, 0));
        int n2 = -1 * lcw.g((lej)new lej(lcw.fyk.rmN - 1, lcw.fyk.H - 1));
        Object object2 = "dungeon_lightsetting.xml";
        String string = "dungeon_lightsetting_";
        List<ber> list3 = this.a("dungeon_lightsetting.xml", bfj2);
        for (int i2 = n2; i2 <= n; ++i2) {
            object = i2;
            map.put((Integer)object, list3);
        }
        Iterator<String> iterator = this.uM("dungeon_lightsetting_");
        object = iterator.iterator();
        while (object.hasNext()) {
            String string2 = (String)object.next();
            String string3 = string2.substring(string2.indexOf(95) + 1);
            string3 = string3.substring(string3.indexOf(95) + 1);
            string3 = string3.substring(0, string3.indexOf(46));
            List<ber> list = this.a(string2, bfj2);
            int n3 = -1 * lcw.zi((String)string3);
            map.put(n3, list);
        }
        List<dqt> list2 = this.dUp();
        for (dqt dqt2 : list2) {
            object2 = lcn.emv();
            int n4 = 0;
            while (true) {
                iterator = new ber();
                int n5 = 0;
                if (dqt2.dfG.size() > n4) {
                    this.a(bfj2, (ber)((Object)iterator), dqt2.dfG.get(n4), 259);
                    ++n5;
                    ((ber)((Object)iterator)).kq(dqt2.dfG.get((int)n4).ddW);
                }
                if (dqt2.dfH.size() > n4) {
                    this.a(bfj2, (ber)((Object)iterator), dqt2.dfH.get(n4), 360);
                    ++n5;
                }
                if (dqt2.dfI.size() > n4) {
                    this.a(bfj2, (ber)((Object)iterator), dqt2.dfI.get(n4), 1296);
                    ++n5;
                }
                if (dqt2.dfJ.size() > n4) {
                    this.a(bfj2, (ber)((Object)iterator), dqt2.dfJ.get(n4), 28);
                    ++n5;
                }
                ((ber)((Object)iterator)).kz(dqt2.gPz);
                if (n5 == 0) {
                    if (object2.size() <= 1) break;
                    break;
                }
                object2.add(iterator);
                ++n4;
            }
            for (String string4 : dqt2.gPA) {
                int n6 = lcw.zi((String)string4.toLowerCase());
                if (string4.equals("u19")) {
                    // empty if block
                }
                if (map.get(n6) != null) assert (false) : "TileID already exists in map.";
                map.put(n6, (List<ber>)object2);
            }
        }
        assert (map.size() == 2048) : "WeatherSettings.size() = " + map.size();
        return map;
    }

    private void a(bfj bfj2, ber ber2, dqy dqy2, int n) {
        assert (dqy2 != null);
        Map<ldv, amf> map = this.uN(dqy2.FileName);
        if (map == null) {
            return;
        }
        for (amf amf2 : map.values()) {
            if (!(amf2 instanceof dqv)) continue;
            bfj2.a(ber2, (dqv)amf2, n, 2);
        }
    }

    private Map<ldv, amf> uN(String string) {
        bew.e(bfb.dfP);
        bew.e(bfb.dfR);
        bew.e(bfb.dga);
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/objectspace/environment/weather/" + string);
        Map<ldv, amf> map = this.oXG.c(jrw2, "environment/weather/" + string, false);
        return map;
    }

    public Map<Integer, bfa> dUs() {
        Map<Integer, bfa> map = lcn.emw();
        List<dqt> list = this.dUq();
        for (dqt dqt2 : list) {
            bfa bfa2 = new bfa();
            bfa2.dfH = dqt2.dfH;
            bfa2.dfJ = dqt2.dfJ;
            bfa2.dfG = dqt2.dfG;
            bfa2.dfI = dqt2.dfI;
            List<String> list2 = dqt2.gPA;
            for (String string : list2) {
                int n = lcw.zi((String)string.toLowerCase());
                if (string.equals("u19")) {
                    // empty if block
                }
                if (map.get(n) != null) assert (false) : "TileID already exists in map.";
                map.put(n, bfa2);
            }
        }
        assert (map.size() == 1024) : "WeatherSettings.size() = " + map.size();
        return map;
    }
}

