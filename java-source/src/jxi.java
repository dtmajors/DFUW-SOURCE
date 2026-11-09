/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Vector;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jxi {
    private lju oZi = new lju(0, 3);
    private Node oYC;
    private NodeList oZj;
    private Node oZk;
    private Document cn = null;

    public Vector dUy() {
        String string = "xml-files/server/resource//races.xml";
        Vector<String> vector = new Vector<String>();
        try {
            this.cn = jsy.tJ(string);
            this.oYC = jsy.a("SFRaces", (Node)this.cn);
            if (this.oYC != null) {
                List<Node> list = jsy.c("SFResourceName", this.oYC);
                for (int i2 = 0; i2 < list.size(); ++i2) {
                    Node node = list.get(i2);
                    String string2 = jsy.m(node);
                    vector.add(string2);
                }
            }
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().toString(), "SFFile Parse Exception");
        }
        return vector;
    }
}

