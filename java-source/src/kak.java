/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class kak {
    private lju paq = new lju(0, 1, 0);
    private final String pbb = lcw.qLb + "xml-files/gamelogicinfo/" + "attachpoints.xml";
    protected jzc pbc = new jzc();

    public void X(Map<String, Map<String, eh>> map) {
        Document document = this.pbc.dSD();
        Element element = document.createElement("SFAttachpointFile");
        document.appendChild(element);
        element.appendChild(this.pbc.b(document, this.paq));
        for (Map.Entry<String, Map<String, eh>> entry : map.entrySet()) {
            String string = entry.getKey();
            Element element2 = document.createElement("SFAttachPointSet");
            element.appendChild(element2);
            Element element3 = this.pbc.a(document, string, "DescriptionFilename");
            element2.appendChild(element3);
            Map<String, eh> map2 = entry.getValue();
            for (Map.Entry<String, eh> entry2 : map2.entrySet()) {
                String string2 = entry2.getKey();
                eh eh2 = entry2.getValue();
                Element element4 = document.createElement("SFAttachPoint");
                element2.appendChild(element4);
                element3 = this.pbc.a(document, eh2.getName(), "SFAttachPointName");
                element4.appendChild(element3);
                element3 = this.pbc.a(document, eh2.getFrameName(), "SFFrameName");
                element4.appendChild(element3);
                element3 = this.pbc.a(document, eh2.fb(), "SFTranslation");
                element4.appendChild(element3);
                element3 = this.pbc.a(document, eh2.getRotation(), "SFRotation");
                element4.appendChild(element3);
                element3 = this.pbc.a(document, eh2.fa(), "SFAttachPointType");
                element4.appendChild(element3);
            }
        }
        jsz.b(document, this.pbb);
    }
}

