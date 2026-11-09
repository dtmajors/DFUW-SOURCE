/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Vector;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class jwz {
    private Node oYC;
    private Document cn = null;

    public Vector ai(String string, String string2) {
        jrw jrw2 = new jrw(string);
        Vector<lil<String, Integer, Integer>> vector = new Vector<lil<String, Integer, Integer>>();
        try {
            Node node;
            this.cn = jsy.n(jrw2);
            this.oYC = jsy.a(string2, (Node)this.cn);
            if (this.oYC != null && (node = jsy.a("ResourceList", this.oYC)) != null) {
                List<Node> list = jsy.c("ResourceItem", node);
                for (int i2 = 0; i2 < list.size(); ++i2) {
                    Node node2 = list.get(i2);
                    Node node3 = jsy.a("SFResourceName", node2);
                    String string3 = jsy.m(node3);
                    Node node4 = jsy.a("Number", node2);
                    int n = jsy.r(node4);
                    Node node5 = jsy.a("ChanceOfDrop", node2);
                    int n2 = new Float(jsy.o(node5) * 100.0f).intValue();
                    lil<String, Integer, Integer> lil2 = new lil<String, Integer, Integer>(string3, new Integer(n), new Integer(n2));
                    vector.add(lil2);
                }
            }
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
        }
        return vector;
    }

    public boolean c(jrw jrw2, String string) {
        try {
            this.cn = jsy.n(jrw2);
            this.oYC = jsy.a(string, (Node)this.cn);
            if (this.oYC != null) {
                return true;
            }
        }
        catch (Exception exception) {
            lfn.print(exception.getMessage());
        }
        return false;
    }
}

