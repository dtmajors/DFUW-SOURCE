/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class n {
    private jrw cm;
    private Document cn;

    public boolean v() {
        return this.b(lcw.qLb + "xml-files/server/persistence/" + "dflauncher" + "/" + "clientobject.xml");
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

    public void b(ljq ljq2) {
        if (this.cn == null || this.cm == null) assert (false) : "Document not parsed, or ConfigFile == null !";
        this.a(this.cn, "SFDefaultPosition", ljq2);
        jsz.a(this.cn, this.cm);
    }

    private void a(Document document, String string, ljq ljq2) {
        Node node;
        boolean bl = false;
        if (document != null && (node = jsy.a(string, document)) != null) {
            Node node2 = jry.l(node);
            jzc jzc2 = new jzc();
            Element element = jzc2.a(document, ljq2);
            node.replaceChild(element, node2);
        }
    }
}

