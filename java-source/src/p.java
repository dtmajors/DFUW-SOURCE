/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class p {
    private jrw cm;
    private Document cn;

    public boolean v() {
        return this.b(lcw.qLb + "xml-files/worlddata/" + "worlddata_dflauncher.xml");
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

    public void m(String string) {
        if (this.cn == null || this.cm == null) assert (false) : "Document not parsed, or ConfigFile == null !";
        Node node = jsy.a("SFWorldData", (Node)this.cn);
        if (node == null) {
            assert (false);
            return;
        }
        Node node2 = jsy.a("SFObjectSpace", node);
        if (node2 == null) {
            return;
        }
        Element element = this.cn.createElement("SFObjectSpace");
        node.replaceChild(element, node2);
        jta jta2 = new jta();
        Element element2 = jta2.a(this.cn, string, "DescriptionFilename");
        element.appendChild(element2);
        jsz.a(this.cn, this.cm);
    }

    public void x() {
        if (this.cn == null || this.cm == null) {
            assert (false) : "Document not parsed, or config is null!";
            return;
        }
        jsz.a(this.cn, this.cm);
    }
}

