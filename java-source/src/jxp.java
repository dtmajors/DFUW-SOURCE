/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jxp {
    private final lju oRy = new lju(0, 1, 0);
    private jsa nWd = null;
    private Map<String, String> ctF = lea.eoS();

    public void a(jsa jsa2) {
        this.nWd = jsa2;
    }

    private void dUD() {
        String string = "xml-files/gamelogicinfo/tileinfomap.xml";
        String string2 = "[a-zA-Z][a-fA-F]{0,1}[0-9]{1}";
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, this.oRy);
            NodeList nodeList = document.getElementsByTagName("TileInfo");
            if (nodeList.getLength() == 0) {
                lfn.b(2, "SFTileInfoParser", "loadTileInfoMap() No 'TileInfo' nodes found.");
                return;
            }
            int n = nodeList.getLength();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    Node node;
                    Node node2 = nodeList.item(i2);
                    String string3 = jsy.c(node2, "Filename");
                    if (string3 == null || string3.trim().equals("")) {
                        throw new bj("Attribute 'Filename' has invalid value.");
                    }
                    String string4 = jsy.c(node2, "DisplayName");
                    if (string4 == null || string4.trim().equals("")) {
                        throw new bj("Attribute 'DisplayName' has invalid value.");
                    }
                    if (this.ctF.containsKey(string3 = string3.toLowerCase())) {
                        throw new bg("TileInfoMap already contains info about tile '" + string3 + "'");
                    }
                    if (!Pattern.matches(string2, string3)) continue;
                    lfn.b(0, this.getClass().getSimpleName(), "REPAIR() : Got a match for: " + string3);
                    NamedNodeMap namedNodeMap = node2.getAttributes();
                    Node node3 = node = namedNodeMap == null ? null : namedNodeMap.getNamedItem("Filename");
                    if (node == null) {
                        throw new bp("Node '" + node2.getNodeName() + "' does not contain attribute '" + "Filename" + "'");
                    }
                    String string5 = string3.substring(string3.length() - 1);
                    String string6 = string3.substring(0, string3.length() - 1);
                    String string7 = string6 + "0" + string5;
                    lfn.b(0, this.getClass().getSimpleName(), "REPAIR() : NewTileID = " + string7);
                    lfn.b(0, this.getClass().getSimpleName(), "REPAIR() : NewTileID = " + string7);
                    node.setNodeValue(string7);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of tileinfo " + i2 + " failed.", bg2);
                }
            }
            string = string + ".new";
            jrw jrw2 = new jrw(lcw.qLb + string);
            jsz.a(document, jrw2);
            lfn.b(0, this.getClass().getSimpleName(), "REPAIR() : DONE. Wrote file = " + string);
        }
        catch (bg bg3) {
            throw new bs("Parsing of file '" + string + "' failed.", bg3);
        }
    }

    public void vs(String string) {
        if (string == null) {
            throw new bi("FileName is null.");
        }
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, this.oRy);
            NodeList nodeList = document.getElementsByTagName("TileInfo");
            if (nodeList.getLength() == 0) {
                lfn.b(2, "SFTileInfoParser", "loadTileInfoMap() No 'TileInfo' nodes found.");
                return;
            }
            int n = nodeList.getLength();
            for (int i2 = 0; i2 < n; ++i2) {
                try {
                    Node node = nodeList.item(i2);
                    String string2 = jsy.c(node, "Filename");
                    if (string2 == null || string2.trim().equals("")) {
                        throw new bj("Attribute 'Filename' has invalid value.");
                    }
                    String string3 = jsy.c(node, "DisplayName");
                    if (string3 == null || string3.trim().equals("")) {
                        throw new bj("Attribute 'DisplayName' has invalid value.");
                    }
                    if (this.ctF.containsKey(string2 = string2.toLowerCase())) {
                        throw new bg("TileInfoMap already contains info about tile '" + string2 + "'");
                    }
                    this.ctF.put(string2, string3);
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
    }

    public fom a(fol fol2) {
        String string = lcw.f((lej)fol2.bQD());
        String string2 = this.ctF.get(string.toLowerCase());
        fom fom2 = (fom)this.nWd.d(11529);
        fom2.setDisplayName(string2);
        fom2.kG(string);
        fom2.a(fol2.bQD());
        fom2.on(fol2.aO());
        fom2.f(fol2.amk());
        return fom2;
    }

    public Map<String, List<ljq>> dUE() {
        Map<String, List<ljq>> map = lcn.emw();
        Document document = null;
        try {
            document = jsy.tJ("xml-files/zones/zone_spawnpositions.xml");
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
            return map;
        }
        if (document == null) {
            return map;
        }
        Node node = jsy.a("SFSpawnPositionsMap", (Node)document);
        if (node == null) {
            String string = "SFSpawnPositionsMap file is invalid!";
            lfn.b(5, this.getClass().getName(), "getZoneSpawnPositionMap() : " + string);
            assert (false) : string;
            return null;
        }
        lju lju2 = jsy.c(document);
        if (!this.oRy.b(lju2)) {
            String string = "TileInfoMap file is wrong version. Supported version = " + this.oRy + ", FileVersion = " + lju2;
            lfn.b(5, this.getClass().getName(), "getTilename() : " + string);
            assert (false) : string;
            return null;
        }
        List<Node> list = jsy.c("Tile", node);
        if (list == null) {
            String string = "TileInfo nodesnot found!";
            lfn.b(5, this.getClass().getName(), "getZoneSpawnPositionMap() : " + string);
            assert (false) : string;
            return null;
        }
        Node node2 = null;
        for (Node node3 : list) {
            List<ljq> list2 = this.ci(node3);
            String string = null;
            NamedNodeMap namedNodeMap = node3.getAttributes();
            node2 = namedNodeMap.getNamedItem("Filename");
            if (node2 == null) {
                String string2 = "TileInfo nodes not found!";
                lfn.b(5, this.getClass().getName(), "getZoneSpawnPositionMap() : " + string2);
                assert (false) : string2;
                return null;
            }
            string = node2.getNodeValue();
            map.put(string, list2);
        }
        return map;
    }

    private List<ljq> ci(Node node) {
        ArrayList<ljq> arrayList = lcn.emv();
        List<Node> list = jsy.c("SFPosition", node);
        if (list == null) {
            String string = "PositionsNodes nodes not found!";
            lfn.b(5, this.getClass().getName(), "getPositions() : " + string);
            assert (false) : string;
            return null;
        }
        for (Node node2 : list) {
            ljq ljq2 = jsy.w(node2);
            arrayList.add(ljq2);
        }
        return arrayList;
    }
}

