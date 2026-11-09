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

public class jyx {
    private lju paq = new lju(0, 1);
    private jzc par = new jzc();
    private jta oQa = new jta();

    public void W(Map<String, List<ljq>> map) {
        assert (map != null) : "LevelManager is null!";
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/zones/zone_spawnpositions.xml");
        Document document = this.par.dSD();
        Element element = this.par.a(document, "SFSpawnPositionsMap", this.paq);
        document.appendChild(element);
        for (Map.Entry<String, List<ljq>> entry : map.entrySet()) {
            Element element2 = document.createElement("Tile");
            element2.setAttribute("Filename", entry.getKey());
            List<ljq> list = entry.getValue();
            for (ljq ljq2 : list) {
                element2.appendChild(this.oQa.a(document, ljq2, "SFPosition"));
            }
            element.appendChild(element2);
        }
        Object object = null;
        object = jrw2.getAbsolutePath();
        jrw2 = new jrw((String)object);
        jsz.a(document, jrw2);
    }
}

