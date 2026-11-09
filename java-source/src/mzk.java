/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import java.util.Map;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class mzk {
    private lju paq = new lju(0, 1);
    private jzc par = new jzc();
    private jta oQa = new jta();

    public void V(Map<String, Set<String>> map) {
        assert (map != null);
        assert (!map.isEmpty());
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/worldbuilder/resource2mesh_map.xml");
        Document document = this.par.dSD();
        Element element = this.par.a(document, "Resource2meshMap", this.paq);
        document.appendChild(element);
        for (String string : map.keySet()) {
            Element element2 = document.createElement("SFResource");
            element2.setAttribute("name", string);
            element.appendChild(element2);
            Set<String> set = map.get(string);
            for (String string2 : set) {
                Element element3 = document.createElement("SFMesh");
                element3.setAttribute("name", string2);
                element2.appendChild(element3);
            }
        }
        lfn.b(0, this.getClass().getName(), "The Filename is: " + jrw2);
        Object object = null;
        object = jrw2.getAbsolutePath();
        jrw2 = new jrw((String)object);
        jsz.a(document, jrw2);
    }
}

