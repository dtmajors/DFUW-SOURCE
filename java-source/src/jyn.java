/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jyn {
    private jzc par = new jzc();
    private jta oQa = new jta();

    public void a(String string, bjr bjr2) {
        assert (string != null);
        assert (!string.isEmpty());
        assert (bjr2 != null);
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/server/fortresssystem/" + string);
        Document document = this.par.dSD();
        Element element = this.par.a(document, "SFFortressSystem", jwp.fzk);
        document.appendChild(element);
        element.setAttribute("Name", bjr2.aqd());
        element.setAttribute("Type", Integer.toString(bjr2.aqg().ordinal()));
        Element element2 = document.createElement("ObjectSpaceGuid");
        element2.appendChild(this.oQa.a(document, bjr2.aqf().enw()));
        element.appendChild(element2);
        element2 = document.createElement("Guid");
        element2.appendChild(this.oQa.a(document, bjr2.aqf().enx()));
        element.appendChild(element2);
        Element element3 = document.createElement("ElementInfoList");
        element.appendChild(element3);
        for (bjp bjp2 : bjr2.aqh()) {
            Element element4 = document.createElement("ElementInfo");
            element4.setAttribute("ResourceTypeName", lea.enW().getName(bjp2.az()));
            element2 = document.createElement("Guid");
            element2.appendChild(this.oQa.a(document, bjp2.oq().enx()));
            element4.appendChild(element2);
            element4.appendChild(this.oQa.a(document, bjp2.apU(), "SFPosition"));
            element4.appendChild(this.oQa.a(document, bjp2.apV(), "SFRotation"));
            element3.appendChild(element4);
        }
        Object object = null;
        object = jrw2.getAbsolutePath();
        jrw2 = new jrw((String)object);
        jsz.a(document, jrw2);
    }
}

