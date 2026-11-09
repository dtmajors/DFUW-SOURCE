/*
 * Decompiled with CFR.
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class jyp {
    private lju oZi = new lju(0, 3);
    private Node oYC;
    private Document cn = null;

    public void a(String string, String string2, List<lil> list) {
        jta jta2 = new jta();
        this.cn = jta2.dSD();
        this.oYC = jta2.a(this.cn, string2, this.oZi);
        this.cn.appendChild(this.oYC);
        Element element = this.cn.createElement("ResourceList");
        this.oYC.appendChild(element);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            lil lil2 = list.get(i2);
            Element element2 = this.cn.createElement("ResourceItem");
            element.appendChild(element2);
            String string3 = (String)lil2.getFirst();
            int n = (Integer)lil2.eqz();
            float f = ((Integer)lil2.esw()).floatValue();
            element2.appendChild(jta2.a(this.cn, string3, "SFResourceName"));
            element2.appendChild(jta2.a(this.cn, n, "Number"));
            element2.appendChild(jta2.a(this.cn, f / 100.0f, "ChanceOfDrop"));
        }
        jsz.a(this.cn, new jrw(string));
    }
}

