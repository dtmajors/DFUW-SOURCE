/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jyj {
    private lju paq = new lju(0, 1);
    private jzc par = new jzc();

    public void bP(List<String> list) {
        this.e(list, "filtered_cities.xml");
    }

    public void bQ(List<String> list) {
        this.e(list, "cities.xml");
    }

    private void e(List<String> list, String string) {
        assert (list != null);
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/zones/" + string);
        Document document = this.par.dSD();
        Element element = this.par.a(document, "SFCityList", this.paq);
        document.appendChild(element);
        for (String string2 : list) {
            Element element2 = document.createElement("City");
            element.appendChild(element2);
            element2.setAttribute("Filename", string2.toLowerCase());
        }
        Object object = null;
        object = jrw2.getAbsolutePath();
        jrw2 = new jrw((String)object);
        jsz.a(document, jrw2);
    }

    public void vE(String string) {
        jwi jwi2 = new jwi();
        string = string.toLowerCase();
        List<String> list = jwi2.dUl();
        if (list == null) {
            lfn.b(5, this.getClass().getSimpleName(), "addCity() : Cities array is null! Could not parse list of cities.");
            return;
        }
        if (!list.contains(string)) {
            list.add(string);
            this.bQ(list);
        }
    }
}

