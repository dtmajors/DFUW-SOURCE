/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.CRC32;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class mzr {
    private lju paq = new lju(0, 1);
    private jzc par = new jzc();
    private jta oQa = new jta();

    public void V(Map<String, Set<String>> map) {
        assert (map != null);
        assert (!map.isEmpty());
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/worldbuilder/tile_mesh_map.xml");
        Document document = this.par.dSD();
        Element element = this.par.a(document, "TileMeshMap", this.paq);
        document.appendChild(element);
        for (String string : map.keySet()) {
            Element element2 = document.createElement("SFTile");
            element2.setAttribute("name", string);
            element.appendChild(element2);
            jrw jrw3 = new jrw(lcw.qLb + "xml-files/objectspace/built_tiles/" + string);
            if (!jrw3.exists()) continue;
            ArrayList<jrw> arrayList = lcn.emv();
            jry.a(jrw3, (FileFilter)new jsl("xml"), arrayList, false);
            Element element3 = document.createElement("OSFile");
            element2.appendChild(element3);
            for (jrw jrw4 : arrayList) {
                if (!jrw4.isFile() || !jrw4.exists()) continue;
                long l = llo.a(new CRC32(), jrw4);
                Element element4 = document.createElement("OSFile");
                element4.setAttribute("name", jrw4.getName());
                element4.setAttribute("checksum", Long.toString(l));
                element3.appendChild(element4);
            }
            Set<String> set = map.get(string);
            Iterator object2 = set.iterator();
            while (object2.hasNext()) {
                String string2 = (String)object2.next();
                Element element5 = document.createElement("SFMesh");
                element5.setAttribute("name", string2);
                element2.appendChild(element5);
            }
        }
        Object object = null;
        object = jrw2.getAbsolutePath();
        jrw2 = new jrw((String)object);
        jsz.a(document, jrw2);
    }
}

