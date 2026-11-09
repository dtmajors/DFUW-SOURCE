/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class muq {
    private lju paq = new lju(0, 3);
    private Node oYC;
    private NodeList EHp;
    private Node EHq;
    private Document cn = null;
    private String EHr = "";
    private List EGZ = lcn.emv();

    public List U(jrw jrw2) {
        this.EGZ.clear();
        try {
            this.cn = jsy.n(jrw2);
            this.oYC = jsy.a("Services", (Node)this.cn);
            if (this.oYC != null) {
                List<Node> list = jsy.c("ServiceTemplate", this.oYC);
                for (int i = 0; i < list.size(); ++i) {
                    Node node = list.get(i);
                    NodeList nodeList = node.getChildNodes();
                    ArrayList<String> arrayList = lcn.emv();
                    for (int j = 0; j < nodeList.getLength(); ++j) {
                        String string;
                        if (nodeList.item(j).getNodeName().equals("ServiceName")) {
                            string = jsy.m(nodeList.item(j));
                            arrayList.add(0, string);
                            continue;
                        }
                        if (nodeList.item(j).getNodeName().equals("ServiceTarget")) {
                            string = jsy.m(nodeList.item(j));
                            arrayList.add(1, string);
                            continue;
                        }
                        if (!nodeList.item(j).getNodeName().equals("ServiceCost")) continue;
                        string = jsy.m(nodeList.item(j));
                        arrayList.add(2, string);
                    }
                    this.EGZ.add(arrayList);
                }
            }
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Parse Error");
        }
        return this.EGZ;
    }
}

