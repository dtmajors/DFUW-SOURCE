/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class m {
    private jrw cm;
    private Document cn;

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

    public void j(String string) {
        if (this.cn == null || this.cm == null) assert (false) : "Document not parsed, or ConfigFile == null !";
        Node node = jsy.a("XML", (Node)this.cn);
        if (node == null) assert (false);
        Node node2 = jsy.a("Module", "Name", "Java", node);
        if ((node2 = jsy.a("JavaConfigurationFile", node2)) != null) {
            NamedNodeMap namedNodeMap = node2.getAttributes();
            if ((node2 = namedNodeMap.getNamedItem("Value")) == null) {
                assert (false);
                return;
            }
            node2.setNodeValue(string);
        }
    }

    public void b(String string, boolean bl) {
    }

    public void x() {
        if (this.cn == null || this.cm == null) {
            assert (false) : "Document not parsed, or config is null!";
            return;
        }
        jsz.a(this.cn, this.cm);
    }
}

