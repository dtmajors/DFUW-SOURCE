/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class jyq {
    private lju paq = new lju(0, 1);
    private jzc par = new jzc();

    public void bR(List<dqt> list) {
        String string = "env_music_settings.xml";
        this.e(list, string);
    }

    public void bS(List<dqt> list) {
        String string = "env_weather_settings.xml";
        this.e(list, string);
    }

    private void e(List<dqt> list, String string) {
        assert (list != null);
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/zones/" + string);
        Document document = this.par.dSD();
        Element element = this.par.a(document, "AreaSettings", this.paq);
        document.appendChild(element);
        for (dqt dqt2 : list) {
            Element element2 = document.createElement("Area");
            element.appendChild(element2);
            element2.setAttribute("Name", dqt2.Name);
            element2.setAttribute("RandomEffect", Integer.toString(dqt2.gPz));
            String string2 = "";
            List<String> list2 = dqt2.gPA;
            Iterator<String> iterator = list2.iterator();
            while (iterator.hasNext()) {
                String string3 = iterator.next();
                string2 = string2 + string3;
                if (!iterator.hasNext()) continue;
                string2 = string2 + ",";
            }
            element2.setAttribute("Tiles", string2);
            element2.appendChild(this.a(document, dqt2.dfG, "Sunrise"));
            element2.appendChild(this.a(document, dqt2.dfH, "Midday"));
            element2.appendChild(this.a(document, dqt2.dfI, "Sunset"));
            element2.appendChild(this.a(document, dqt2.dfJ, "Midnight"));
        }
        Object object = null;
        object = jrw2.getAbsolutePath();
        jrw2 = new jrw((String)object);
        jsz.a(document, jrw2);
    }

    private Node a(Document document, List<dqy> list, String string) {
        Element element = document.createElement(string);
        for (dqy dqy2 : list) {
            Element element2 = document.createElement("Music");
            element2.setAttribute("File", dqy2.FileName);
            if (dqy2.ddW >= 0) {
                element2.setAttribute("Probability", Integer.toString(dqy2.ddW));
            }
            element.appendChild(element2);
        }
        return element;
    }
}

