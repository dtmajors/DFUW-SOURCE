/*
 * Decompiled with CFR.
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class jyv {
    private lju oZi = new lju(0, 3);
    private Node oYC;
    private Document cn = null;

    public void vF(String string) {
        if (string != null && !string.equals("")) {
            jta jta2 = new jta();
            this.cn = jta2.dSD();
            Element element = jta2.a(this.cn, "SFInteractionInventory", this.oZi);
            this.cn.appendChild(element);
            jsz.a(this.cn, new jrw(string));
        }
    }

    public void x(String string, List<String> list) {
        if (this.L(new jrw(string))) {
            jta jta2 = new jta();
            this.cn = jta2.dSD();
            Element element = jta2.a(this.cn, "SFInteractionInventory", this.oZi);
            this.cn.appendChild(element);
            for (int i2 = 0; i2 < list.size(); ++i2) {
                String string2 = list.get(i2);
                Element element2 = this.cn.createElement("SFItemRepresentation");
                Element element3 = jta2.a(this.cn, string2, "SFResourceName");
                element2.appendChild(element3);
                element.appendChild(element2);
            }
            jsz.a(this.cn, new jrw(string));
        }
    }

    private boolean L(jrw jrw2) {
        try {
            this.cn = jsy.n(jrw2);
            this.oYC = jsy.a("SFInteractionInventory", (Node)this.cn);
            if (this.oYC != null) {
                return true;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return false;
    }
}

