/*
 * Decompiled with CFR.
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jtk {
    private jta oQa = new jta();
    private les dqt = lea.enU();

    public void d(List list, String string) {
        Document document = this.oQa.dSD();
        Element element = this.oQa.a(document, "SFObjectFunctionMappings", new lju(0, 3, 0));
        document.appendChild(element);
        bkc bkc2 = null;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            bkc2 = (bkc)list.get(i2);
            Element element2 = this.a(document, bkc2.getObjectName(), bkc2.getFunctionName(), bkc2.ard(), bkc2.are());
            element.appendChild(element2);
        }
        jsz.b(document, string);
    }

    private Element a(Document document, String string, String string2, String string3, String string4) {
        Element element = document.createElement("SFMapping");
        element.appendChild(this.oQa.a(document, string, "SFObjectName"));
        element.appendChild(this.oQa.a(document, string2, "SFFunctionName"));
        element.appendChild(this.oQa.a(document, string3, "SFFunctionObjectName"));
        element.appendChild(this.oQa.a(document, string4, "SFReactionFunctionName"));
        return element;
    }
}

