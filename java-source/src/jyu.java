/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jyu {
    private jzc par = new jzc();
    private jta oQa = new jta();

    public void a(String string, cqd cqd2) {
        assert (string != null);
        assert (!string.isEmpty());
        assert (cqd2 != null);
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/server/playervillage/" + string);
        Document document = this.par.dSD();
        Element element = this.par.a(document, "SFPlayerVillage", jxg.fzk);
        document.appendChild(element);
        element.setAttribute("ID", cqd2.getID());
        element.setAttribute("EnglishName", cqd2.aYw());
        element.setAttribute("Type", Integer.toString(cqd2.aYz().ordinal()));
        Element element2 = document.createElement("ObjectSpaceGuid");
        element2.appendChild(this.oQa.a(document, cqd2.aYy().enw()));
        element.appendChild(element2);
        element2 = document.createElement("Guid");
        element2.appendChild(this.oQa.a(document, cqd2.aYy().enx()));
        element.appendChild(element2);
        Element element3 = document.createElement("ElementInfoList");
        element.appendChild(element3);
        for (cqc cqc2 : cqd2.aYA()) {
            Element element4 = document.createElement("ElementInfo");
            element4.setAttribute("ResourceTypeName", lea.enW().getName(cqc2.az()));
            element2 = document.createElement("Guid");
            element2.appendChild(this.oQa.a(document, cqc2.oq().enx()));
            element4.appendChild(element2);
            element4.appendChild(this.oQa.a(document, cqc2.apU(), "SFPosition"));
            element4.appendChild(this.oQa.a(document, cqc2.apV(), "SFRotation"));
            element3.appendChild(element4);
        }
        Object object = null;
        object = jrw2.getAbsolutePath();
        jrw2 = new jrw((String)object);
        jsz.a(document, jrw2);
    }
}

