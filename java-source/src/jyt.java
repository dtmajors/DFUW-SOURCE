/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jyt {
    private lju paq = new lju(0, 1);
    private jzc par = new jzc();
    private jta oQa = new jta();

    public void a(List list, jrw jrw2) {
        if (list != null && !list.isEmpty() && jrw2 != null) {
            Document document = this.par.dSD();
            Element element = this.par.a(document, "SFObjectPalette", this.paq);
            Element element2 = null;
            document.appendChild(element);
            for (int i2 = 0; i2 < list.size(); ++i2) {
                element2 = this.oQa.a(document, list.get(i2).toString(), "PaletteFile");
                element.appendChild(element2);
            }
            Object var6_7 = null;
            jsz.a(document, jrw2);
        }
    }
}

