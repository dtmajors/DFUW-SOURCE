/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 *  jzc
 *  lcw
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jzb {
    private final String pau = lcw.qLb + "xml-files/worlddata/";
    private Map paD = lcn.emw();
    private jzc paE = new jzc();
    private jys paF = new jys();
    private lju paq = new lju(0, 2);

    public void a(String string, Map<ldv, dta> map, boolean bl) {
        Object object;
        this.paF.vc(bl);
        Document document = this.paE.dSD();
        Element element = this.paE.a(document, "SFWorldData", this.paq);
        document.appendChild(element);
        Collection<dta> collection = map.values();
        Iterator<dta> iterator = collection.iterator();
        dta dta2 = null;
        while (iterator.hasNext()) {
            dta2 = iterator.next();
            if (!this.Wo(dta2.bzz())) continue;
            if (dta2.getObjectDescriptionFilename() == null || dta2.getObjectDescriptionFilename().equals("n/a")) {
                object = "OS" + new Long(dta2.getGUID().enw()).toString() + ".xml";
                lfn.b(3, this.getClass().getName(), "New ObjectSpace [" + dta2.getGUID() + "], has no objectName. Creating new name [" + (String)object + "]");
                dta2.setObjectDescriptionFilename((String)object);
            }
            if (bl) {
                assert (false);
                object = dta2.getObjectDescriptionFilename();
                int n = ((String)object).lastIndexOf(".");
                if (n > 0 && ((String)object).substring(n).equalsIgnoreCase(".xml")) {
                    object = ((String)object).substring(0, n);
                }
                if (!((String)object).startsWith("final")) {
                    object = "final/" + (String)object;
                    lfn.b(0, this.getClass().getName(), "writeWorldfile() : JALLA Filename = " + (String)object);
                }
                object = (String)object + ".xml";
                dta2.setObjectDescriptionFilename((String)object);
            }
            this.paF.a(dta2, true);
            element.appendChild(this.paE.a(document, dta2, false));
        }
        for (dta dta3 : map.values()) {
            if (!this.Wo(dta3.bzz())) continue;
            this.paF.h(dta3);
        }
        object = this.pau + string;
        jrw jrw2 = new jrw((String)object);
        jsz.a(document, jrw2);
        this.paD.clear();
    }

    public void a(String string, boolean bl, dta ... dtaArray) {
        this.paF.vc(bl);
        Document document = this.paE.dSD();
        Element element = this.paE.a(document, "SFWorldData", this.paq);
        document.appendChild(element);
        for (dta dta2 : dtaArray) {
            String string2;
            if (!this.Wo(dta2.bzz())) continue;
            if (dta2.getObjectDescriptionFilename() == null || dta2.getObjectDescriptionFilename().equals("n/a")) {
                string2 = "OS" + new Long(dta2.getGUID().enw()).toString() + ".xml";
                lfn.b(3, this.getClass().getName(), "New ObjectSpace [" + dta2.getGUID() + "], has no objectName. Creating new name [" + string2 + "]");
                dta2.setObjectDescriptionFilename(string2);
            }
            if (bl) {
                assert (false);
                string2 = dta2.getObjectDescriptionFilename();
                int n = string2.lastIndexOf(".");
                if (n > 0 && string2.substring(n).equalsIgnoreCase(".xml")) {
                    string2 = string2.substring(0, n);
                }
                if (!string2.startsWith("final")) {
                    string2 = "final/" + string2;
                    lfn.b(0, this.getClass().getName(), "writeWorldfile() : JALLA Filename = " + string2);
                }
                string2 = string2 + ".xml";
                dta2.setObjectDescriptionFilename(string2);
            }
            this.paF.g(dta2);
            element.appendChild(this.paE.a(document, dta2, false));
        }
        String string3 = this.pau + string;
        jrw jrw2 = new jrw(string3);
        jsz.a(document, jrw2);
        this.paD.clear();
    }

    private boolean Wo(int n) {
        boolean bl = true;
        switch (n) {
            case 2: 
            case 3: 
            case 4: 
            case 7: {
                bl = false;
                break;
            }
            default: {
                bl = true;
            }
        }
        return bl;
    }
}

