/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class o {
    public static final String co = "gamelogic_test_spawnpoint01.xml";
    private jrw cm;
    private Document cn;

    public boolean y() {
        return this.k(lcw.qLb + "xml-files/object/spawnpoint/" + "/" + co);
    }

    public boolean k(String string) {
        this.cm = new jrw(string);
        try {
            this.cn = jsy.n(this.cm);
        }
        catch (bo bo2) {
            bo2.printStackTrace();
        }
        return this.cn != null;
    }

    public void l(String string) {
        if (this.cn == null || this.cm == null) assert (false) : "Document not parsed, or ConfigFile == null !";
        jta jta2 = new jta();
        Node node = jsy.a("SFResourceName", this.cn);
        if (node != null) {
            node = jsy.a("SFString", node);
            assert (node != null);
            NamedNodeMap namedNodeMap = node.getAttributes();
            if ((node = namedNodeMap.getNamedItem("Value")) == null) {
                assert (false);
                return;
            }
            node.setNodeValue(string);
        }
        jsz.a(this.cn, this.cm);
    }
}

