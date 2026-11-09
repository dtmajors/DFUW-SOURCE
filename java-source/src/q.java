/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class q {
    private jrw cm;
    private Document cn;

    public void z() {
        this.n(lcw.qLb + "xml-files/config/" + "gamelogic_configuration_dflauncher.xml");
    }

    public void n(String string) {
        this.cm = new jrw(string);
        try {
            this.cn = jsy.n(this.cm);
        }
        catch (bo bo2) {
            bo2.printStackTrace();
        }
        if (this.cn == null) {
            return;
        }
    }

    public void d(boolean bl) {
        if (this.cn == null) assert (false) : "Document not parsed!";
        Node node = jsy.a("XML", (Node)this.cn);
        if (node == null) assert (false);
        Node node2 = jsy.a("EnableIdle", node);
        if (node2 != null) {
            if ((node2 = jry.h(node2)) == null) {
                assert (false);
                return;
            }
            node2.setNodeValue(Boolean.toString(bl));
        }
    }

    public void e(boolean bl) {
        if (this.cn == null) assert (false) : "Document not parsed!";
        Node node = jsy.a("XML", (Node)this.cn);
        if (node == null) assert (false);
        Node node2 = jsy.a("EnableGlobalSpawning", node);
        if (node2 != null) {
            if ((node2 = jry.h(node2)) == null) {
                assert (false);
                return;
            }
            node2.setNodeValue(Boolean.toString(bl));
        }
    }

    public void f(boolean bl) {
        if (this.cn == null) assert (false) : "Document not parsed!";
        Node node = jsy.a("XML", (Node)this.cn);
        if (node == null) assert (false);
        Node node2 = jsy.a("EnableBattleRoyal", node);
        if (node2 != null) {
            if ((node2 = jry.h(node2)) == null) {
                assert (false);
                return;
            }
            node2.setNodeValue(Boolean.toString(bl));
        }
    }

    public void a(String string, cte[] cteArray) {
        if (this.cn == null || this.cm == null) assert (false) : "Document not parsed, or ConfigFile == null !";
        Node node = jsy.a("XML", (Node)this.cn);
        if (node == null) {
            assert (false);
            return;
        }
        List<Node> list = jsy.c("SFUserEquipment", node);
        Node object2 = null;
        if (!list.isEmpty()) {
            for (Node object3 : list) {
                cte[] cteArray2 = jsy.a("SFUserName", object3);
                if (cteArray2 == null) {
                    assert (false) : "Invalid Document!";
                    return;
                }
                String string2 = jsy.m((Node)cteArray2);
                if (!string2.equalsIgnoreCase(string)) continue;
                object2 = object3;
                break;
            }
        }
        Element element = this.cn.createElement("SFUserEquipment");
        if (object2 != null) {
            node.replaceChild(element, object2);
        } else {
            node.appendChild(element);
        }
        jta jta2 = new jta();
        element.appendChild(jta2.a(this.cn, string, "SFUserName"));
        if (cteArray != null) {
            for (cte cte2 : cteArray) {
                Element element2 = jta2.a(this.cn, cte2.pa(), "SFResourceName");
                if (cte2.fex) {
                    Attr attr = this.cn.createAttribute("Attach");
                    attr.setNodeValue("true");
                    element2.setAttributeNode(attr);
                }
                element.appendChild(element2);
            }
        }
    }

    public void g(boolean bl) {
        if (this.cn == null || this.cm == null) assert (false) : "Document not parsed, or ConfigFile == null !";
        Node node = jsy.a("XML", (Node)this.cn);
        if (node == null) assert (false);
        Node node2 = jsy.a("EnableGlobalRegeneration", node);
        if (node2 != null) {
            if ((node2 = jry.h(node2)) == null) {
                assert (false);
                return;
            }
            node2.setNodeValue(Boolean.toString(bl));
        }
    }

    public void x() {
        if (this.cn == null || this.cm == null) {
            assert (false) : "Document not parsed, or config is null!";
            return;
        }
        jsz.a(this.cn, this.cm);
    }
}

