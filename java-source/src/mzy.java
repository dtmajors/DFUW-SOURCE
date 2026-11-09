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
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class mzy {
    private lfn ga = lfn.eqw();
    private lju fzk = new lju(0, 2);
    private jzc paE = new jzc();

    public void cK(List list) {
        for (jrw jrw2 : list) {
            if (!jrw2.isDirectory()) continue;
            ArrayList<jrw> arrayList = lcn.emv();
            jry.a(jrw2, (FileFilter)new jsl("xml"), arrayList, false);
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                jrw jrw3 = (jrw)iterator.next();
                if (!jrw3.isDirectory()) continue;
                iterator.remove();
            }
            if (arrayList.isEmpty()) continue;
            this.h(arrayList, jrw2.getName());
        }
    }

    private void h(List list, String string) {
        String string2 = lcw.qLb + "xml-files/worlddata/";
        String string3 = lcw.qLb + "xml-files/objectspace/";
        string2 = string2.toLowerCase();
        string3 = string3.toLowerCase();
        jrw jrw2 = new jrw(string2 + "generated" + "/" + string);
        Document document = this.paE.dSD();
        Element element = this.paE.a(document, "SFWorldData", this.fzk);
        document.appendChild(element);
        String string4 = null;
        for (jrw jrw3 : list) {
            string4 = jrw3.getPath();
            if (!(string4 = string4.toLowerCase()).startsWith(string3)) continue;
            string4 = string4.substring(string3.length());
            element.appendChild(this.b(document, string4, false));
        }
        jsz.a(document, jrw2);
    }

    public Element b(Document document, String string, boolean bl) {
        Element element = null;
        Element element2 = null;
        element = document.createElement("SFObjectSpace");
        element2 = this.paE.a(document, string, "DescriptionFilename");
        element.appendChild(element2);
        return element;
    }
}

