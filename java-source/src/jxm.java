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

public class jxm {
    private final String oZo = "xml-files/gamelogicinfo/spawnpresets.xml";

    public void dUB() {
        Node node = this.getRootNode();
        if (node == null) {
            lfn.b(5, this.getClass().getSimpleName(), "Document 'xml-files/gamelogicinfo/spawnpresets.xml'  has null root");
            return;
        }
        List<Node> list = jsy.c("SFSpawnPreset", node);
        if (list == null || list.isEmpty()) {
            assert (false) : "No SFSpawnPreset nodes found in 'xml-files/gamelogicinfo/spawnpresets.xml'";
            lfn.b(5, this.getClass().getSimpleName(), "No SFSpawnPreset nodes found in 'xml-files/gamelogicinfo/spawnpresets.xml'");
            return;
        }
        try {
            Map<String, dlt> map = lea.epJ();
            for (Node node2 : list) {
                int n;
                int n2;
                Object object2;
                dlt dlt2 = new dlt();
                Object object3 = jsy.c(node2, "Name");
                if (map.containsKey(object3)) {
                    lfn.b(5, this.getClass().getSimpleName(), "Spawn preset '" + (String)object3 + "' already exists!!");
                    continue;
                }
                dlt2.Name = object3;
                object3 = jsy.a("SFDisplayName", node2);
                if (object3 != null) {
                    object2 = jsy.d("SFString", (Node)object3);
                    String string = jsy.c((Node)object2, "Value");
                    dlt2.DisplayName = string;
                }
                if ((object3 = jsy.a("SpawnPointBossMob", node2)) != null) {
                    object2 = jsy.c((Node)object3, "ResourceName");
                    float f = jsy.e((Node)object3, "MinSpawnTime");
                    float f2 = jsy.e((Node)object3, "MaxSpawnTime");
                    String string = jsy.c((Node)object3, "SpawnCondition");
                    n2 = jsy.d((Node)object3, "SpawnConditionValue");
                    dlt2.bQV = object2;
                    dlt2.gGU = f;
                    dlt2.gGV = f2;
                    dlt2.gGW = string;
                    dlt2.bQZ = n2;
                    this.vl((String)object2);
                }
                object3 = jsy.d("SpawnPointMOBSNumber", node2);
                dlt2.gGT = n = jsy.d((Node)object3, "Value");
                object3 = jsy.d("ResourceSpawnList", node2);
                List<Node> list2 = jsy.c("ResourceSpawn", (Node)object3);
                if (list2 == null || list2.size() < 1) {
                    throw new bp("ResourceSpawnList does not contain any ResourceSpawn Nodes for SFSpawnPreset '" + dlt2.Name + "'");
                }
                dlt2.gGX = lcn.emw();
                for (Node node3 : list2) {
                    String string = jsy.c(node3, "ResourceName");
                    n2 = jsy.d(node3, "Probability");
                    dlt2.gGX.put(string, n2);
                    this.vl(string);
                }
                object3 = jsy.d("RespawnDelay", node2);
                float f = jsy.e((Node)object3, "MinSpawnTime");
                float f3 = jsy.e((Node)object3, "MaxSpawnTime");
                dlt2.gGZ = f;
                dlt2.gGY = f3;
                object3 = jsy.a("RequiredMaterialList", node2);
                if (object3 != null) {
                    List<Node> list3 = jsy.c("RequiredMaterial", (Node)object3);
                    Map<String, Integer> map2 = lcn.emw();
                    for (Node node3 : list3) {
                        String string = jsy.c(node3, "ResourceName");
                        int n3 = jsy.d(node3, "Quantity");
                        if (map2.containsKey(string)) {
                            throw new bp("Duplicate required material '" + string + "' for Preset '" + dlt2.Name + "'");
                        }
                        map2.put(string, n3);
                    }
                    dlt2.gHa = map2;
                }
                map.put(dlt2.Name, dlt2);
            }
        }
        catch (bg bg2) {
            lfn.b(5, this.getClass().getSimpleName(), "Error loading spawn presets: " + bg2.getMessage() + " trace: " + bg2.getStackTrace());
        }
    }

    private void vl(String string) {
        if (!lea.eoz().containsKey(lea.enW().getType(string))) {
            try {
                kah.vl((String)string);
            }
            catch (bg bg2) {
                lfn.log(this.getClass().getName(), bg2);
            }
        }
    }

    private Node getRootNode() {
        Document document = jsy.tK("xml-files/gamelogicinfo/spawnpresets.xml");
        if (document == null) {
            lfn.b(4, this.getClass().getSimpleName(), "No spawn presets file found ('xml-files/gamelogicinfo/spawnpresets.xml')");
            return null;
        }
        Node node = jsy.a("SFSpawnPresets", (Node)document);
        return node;
    }
}

