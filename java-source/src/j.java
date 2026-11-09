/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 *  lcw
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class j {
    private jrw cm;
    private Document cn;

    public boolean v() {
        return this.b(lcw.qLb + "xml-files/server/persistence/" + "dflauncher df" + "/" + "character.xml");
    }

    public boolean b(String string) {
        this.cm = new jrw(string);
        try {
            this.cn = jsy.n(this.cm);
        }
        catch (bo bo2) {
            bo2.printStackTrace();
        }
        return this.cn != null;
    }

    public void c(String string) {
        if (this.cn == null || this.cm == null) assert (false) : "Document not parsed, or ConfigFile == null !";
        Node node = jsy.a("SFResource", (Node)this.cn);
        if (node == null) assert (false);
        Node node2 = jsy.a("SFResourceName", node);
        if (node2 != null) {
            if ((node2 = jry.g(node2)) == null) {
                assert (false);
                return;
            }
            node2.setNodeValue(string);
        }
    }

    public void d(String string) {
        if (this.cn == null || this.cm == null) assert (false) : "Document not parsed, or ConfigFile == null !";
        Node node = jsy.a("SFResource", (Node)this.cn);
        if (node == null) assert (false);
        List<Node> list = jsy.c("SFStringAttribute", node);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (Node node2 : list) {
            Node node3 = jsy.a("SFAttributeName", node2);
            if (node3 == null) {
                assert (false);
                continue;
            }
            if (!jry.g(node3).getNodeValue().equals(ep.aM((int)1328))) continue;
            node3 = jsy.a("SFValue", node2);
            if (node3 == null) {
                assert (false);
                continue;
            }
            if ((node3 = jry.g(node3)) == null) {
                assert (false);
                return;
            }
            node3.setNodeValue(string);
        }
    }

    public void a(float f2) {
        String string = ep.aM((int)352);
        this.a(f2, string, "SFValue");
        this.a(f2, string, "SFMaxValue");
    }

    public void b(float f2) {
        String string = ep.aM((int)384);
        this.a(f2, string, "SFValue");
        this.a(f2, string, "SFMaxValue");
    }

    public void c(float f2) {
        String string = ep.aM((int)400);
        this.a(f2, string, "SFValue");
        this.a(f2, string, "SFMaxValue");
    }

    private void a(float f2, String string, String string2) {
        if (this.cn == null || this.cm == null) assert (false) : "Document not parsed, or ConfigFile == null !";
        Node node = jsy.a("SFResource", (Node)this.cn);
        if (node == null) assert (false);
        List<Node> list = jsy.c("SFFloatAttribute", node);
        if (list == null || list.isEmpty()) {
            assert (false);
            return;
        }
        for (Node node2 : list) {
            Node node3 = jsy.a("SFAttributeName", node2);
            if (node3 == null) {
                assert (false);
                continue;
            }
            if (!jry.g(node3).getNodeValue().equals(string)) continue;
            node3 = jsy.a(string2, node2);
            if (node3 == null) {
                assert (false);
                continue;
            }
            if ((node3 = jry.j(node3)) == null) {
                assert (false);
                return;
            }
            node3.setNodeValue(Float.toString(f2));
        }
    }

    public void w() {
        if (this.cn == null || this.cm == null) assert (false) : "Document not parsed, or ConfigFile == null !";
        jsz.a(this.cn, this.cm);
    }
}

