/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jvz {
    private final String oWq = "xml-files/common/summoningritual/altars.xml";

    public void dTV() {
        try {
            Document document = jsy.tJ("xml-files/common/summoningritual/altars.xml");
            Node node = jsy.a("SFAltarList", (Node)document);
            if (node == null) {
                throw new bo("Document 'xml-files/common/summoningritual/altars.xml'  has null root");
            }
            List<Node> list = jsy.c("SFAltar", node);
            if (list == null || list.isEmpty()) {
                assert (false) : "No SFAltar nodes found in 'xml-files/common/summoningritual/altars.xml'";
                lfn.b(5, this.getClass().getSimpleName(), "No SFAltar nodes found in 'xml-files/common/summoningritual/altars.xml'");
                return;
            }
            Map<String, dls> map = lea.epP();
            Map<String, dlt> map2 = lea.epJ();
            for (Node node2 : list) {
                dls dls2 = new dls();
                List<Node> list2 = jsy.c(node2, "AltarCityID");
                if (map.containsKey(list2)) {
                    throw new bp("Altar '" + (String)((Object)list2) + "' already defined!!");
                }
                dls2.gGQ = list2;
                list2 = jsy.a("SFSpawnpointName", node2);
                if (list2 == null) {
                    throw new bp("No SFSpawnpointName node for altar '" + dls2.gGQ + "' defined");
                }
                Object object = jsy.d("SFString", (Node)((Object)list2));
                String string = jsy.c((Node)object, "Value");
                dls2.gGR = string;
                list2 = jsy.c("SFPreset", node2);
                if (list2 == null || list2.size() < 1) {
                    throw new bp("Altar node does not contain any SFPreset Nodes for altar '" + dls2.gGQ + "'");
                }
                object = lcn.emw();
                for (Node node3 : list2) {
                    String string2 = jsy.c(node3, "Name");
                    dlt dlt2 = map2.get(string2);
                    if (dlt2 == null) {
                        throw new bp("No preset '" + dlt2 + "' is defined (found in altar '" + dls2.gGQ + "'");
                    }
                    if (object.containsKey(string2)) {
                        throw new bp("Duplicate preset '" + string2 + "'definition in altar '" + dls2.gGQ + "'");
                    }
                    object.put(string2, dlt2);
                }
                dls2.gGS = object;
                map.put(dls2.gGQ, dls2);
            }
        }
        catch (bg bg2) {
            lfn.b(5, this.getClass().getSimpleName(), "Error loading altars: " + bg2.getMessage() + " trace: " + bg2.getStackTrace());
        }
    }
}

