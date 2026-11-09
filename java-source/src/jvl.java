/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jvl {
    public static final String TC = "SFStartingEquipmentParser";
    private cju oTP = lea.epr();

    public void eL(String string) {
        try {
            Document document = jsy.tJ(string);
            if (document == null) {
                lfn.b(5, TC, "parseFile() Invalid Document: [" + string + "]");
                assert (false);
                return;
            }
            Node node = jsy.a("StartingEquipment", (Node)document);
            if (node == null) {
                throw new bn("StartingEquipment");
            }
            List<Node> list = jsy.c("Role", node);
            if (list == null || list.isEmpty()) {
                throw new bn("Role");
            }
            for (Node node2 : list) {
                String string2 = jsy.i(node2, "Value");
                ckc ckc2 = ckc.getValueByName(string2);
                if (ckc2 == null) {
                    assert (false) : "Invalid role : " + string2;
                    throw new bj("ROLE : " + string2);
                }
                if (ckc2 == ckc.COMMONER && !lea.epx().aQH()) continue;
                Node node3 = jsy.a("Equipment", node2);
                if (node3 == null) {
                    throw new bn("Equipment");
                }
                List<Node> list2 = jsy.c("Container", node3);
                if (list2 == null || list2.isEmpty()) {
                    throw new bn("Container");
                }
                for (Node node4 : list2) {
                    String string3 = jsy.i(node4, "ContainerName");
                    String string4 = jsy.i(node4, "ContainerResourceName");
                    int n = lea.enW().getType(string4);
                    List<Node> list3 = jsy.c("Item", node4);
                    if (list3 == null || list3.isEmpty()) {
                        throw new bn("Item");
                    }
                    ArrayList<cjt> arrayList = lcn.abH(list3.size());
                    for (Node node5 : list3) {
                        cjt cjt2 = this.aw(node5);
                        arrayList.add(cjt2);
                    }
                    cjp cjp2 = new cjp(string3, n, arrayList);
                    this.oTP.a(ckc2.ordinal(), cjp2);
                }
            }
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }

    private cjt aw(Node node) {
        String string = jsy.i(node, "ResourceName");
        int n = Integer.parseInt(jsy.i(node, "Counter"));
        cjt cjt2 = new cjt();
        cjt2.ResourceType = cug.ih((String)string);
        cjt2.ayN = n;
        return cjt2;
    }
}

