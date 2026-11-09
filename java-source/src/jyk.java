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
import org.w3c.dom.Node;

public class jyk {
    private lju paq = new lju(0, 1);
    private jzc par = new jzc();
    private jta oQa = new jta();

    public void a(String string, axs axs2) {
        Object object;
        assert (axs2 != null);
        assert (string != null);
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/server/city/" + string);
        Document document = this.par.dSD();
        Element element = this.par.a(document, "SFCity", this.paq);
        document.appendChild(element);
        element.setAttribute("ID", axs2.getID());
        element.setAttribute("CityEnglishName", axs2.YH());
        element.setAttribute("Radius", Float.toString(axs2.Xu()));
        element.setAttribute("PowerLevel", Integer.toString(axs2.Xx()));
        element.setAttribute("Type", Integer.toString(axs2.YJ()));
        element.appendChild(this.oQa.a(document, axs2.Xv(), "SFPosition"));
        List<axq> list = axs2.YG();
        int n = 0;
        Element element2 = document.createElement("ElementInfoList");
        element.appendChild(element2);
        for (axq object2 : list) {
            Element element3 = this.a(document, (Node)element2, object2);
            element2.appendChild(element3);
            ++n;
        }
        if (axs2.YL() != null) {
            object = axs2.YL();
            Element element4 = this.a(document, (Node)element, (clq)object);
            element.appendChild(element4);
        }
        lfn.b(0, this.getClass().getName(), "The Filename is: " + jrw2);
        object = null;
        object = jrw2.getAbsolutePath();
        jrw2 = new jrw((String)object);
        jsz.a(document, jrw2);
    }

    private Element a(Document document, Node node, axq axq2) {
        Element element = document.createElement("ElementInfo");
        element.setAttribute("Category", axq2.Yn().name());
        element.setAttribute("ResourceTypeName", axq2.Yp());
        element.setAttribute("RacialReqs", Boolean.toString(axq2.Ys()));
        element.setAttribute("NPCName", axq2.Yq());
        element.appendChild(this.oQa.a(document, axq2.av(), "SFPosition"));
        element.appendChild(this.oQa.a(document, axq2.aw(), "SFRotation"));
        element.appendChild(this.oQa.b(document, axq2.YD(), "GUID"));
        List<lfs<String, Integer>> list = axq2.YA();
        Element element2 = document.createElement("PreReqList");
        element.appendChild(element2);
        if (list != null) {
            for (lfs<String, Integer> lfs2 : list) {
                Element element3 = document.createElement("SFPair");
                element2.appendChild(element3);
                element3.setAttribute("Resource", lfs2.getFirst());
                element3.setAttribute("Level", Integer.toString(lfs2.eqz()));
            }
        } else {
            lfn.b(0, this.getClass().getSimpleName(), "createCityElementInfo() : Element has not PreReq!! -> " + axq2.Yp());
        }
        return element;
    }

    private Element a(Document document, Node node, clq clq2) {
        Element element = document.createElement("LevyCollectorInfo");
        element.setAttribute("ResourceTypeName", lea.enW().getName(clq2.az()));
        element.appendChild(this.oQa.a(document, clq2.av(), "SFPosition"));
        element.appendChild(this.oQa.a(document, clq2.aw(), "SFRotation"));
        return element;
    }
}

