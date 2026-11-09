/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jzd {
    private final String pau = lcw.qLb + "xml-files/zones/";
    private lju paq = new lju(0, 1);
    private jzc par = new jzc();

    public void V(Map<String, btg> map) {
        jrw jrw2 = new jrw(this.pau + lcw.qGL);
        this.b(map, jrw2);
    }

    private void b(Map<String, btg> map, jrw jrw2) {
        Document document = this.par.dSD();
        Element element = this.par.a(document, "SFZoneFile", this.paq);
        document.appendChild(element);
        Element element2 = document.createElement("ZoneList");
        for (btg btg2 : map.values()) {
            Element element3 = document.createElement("Zone");
            element3.setAttribute("Name", btg2.axz());
            element2.appendChild(element3);
            Element element4 = document.createElement("LevelList");
            List<bst> list = btg2.axy();
            for (bst bst2 : list) {
                String string = bst2.axf();
                Element element5 = document.createElement("Level");
                element5.setAttribute("Filename", string);
                element5.setAttribute("LevelID", Integer.toString(bst2.axg()));
                if (bst2.axh() != null) {
                    bss bss2 = bst2.axh();
                    element5.setAttribute("MinBBoxX", Float.toString(bss2.dJw));
                    element5.setAttribute("MinBBoxY", Float.toString(bss2.dJx));
                    element5.setAttribute("MinBBoxZ", Float.toString(bss2.dJy));
                    element5.setAttribute("MaxBBoxX", Float.toString(bss2.dJz));
                    element5.setAttribute("MaxBBoxY", Float.toString(bss2.dJA));
                    element5.setAttribute("MaxBBoxZ", Float.toString(bss2.dJB));
                }
                element4.appendChild(element5);
            }
            element3.appendChild(element4);
        }
        element.appendChild(element2);
        if (jrw2 == null) assert (false);
        jsz.a(document, jrw2);
    }
}

