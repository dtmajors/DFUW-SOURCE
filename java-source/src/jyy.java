/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jyy {
    private jzc par = new jzc();
    private jta oQa = new jta();

    public void a(String string, dna dna2) {
        assert (string != null);
        assert (!string.isEmpty());
        assert (dna2 != null);
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/server/traderoutesystem/" + string);
        Document document = this.par.dSD();
        Element element = this.par.a(document, "SFTradeRouteSystem", jxq.fzk);
        document.appendChild(element);
        element.setAttribute("Name", dna2.bqX());
        element.setAttribute("Type", Integer.toString(dna2.bqT().ordinal()));
        Element element2 = document.createElement("ObjectSpaceGuid");
        element2.appendChild(this.oQa.a(document, dna2.bqW().enw()));
        element.appendChild(element2);
        element2 = document.createElement("Guid");
        element2.appendChild(this.oQa.a(document, dna2.bqW().enx()));
        element.appendChild(element2);
        Element element3 = document.createElement("ElementInfoList");
        element.appendChild(element3);
        for (dmz dmz2 : dna2.bqU()) {
            Element element4 = document.createElement("ElementInfo");
            element4.setAttribute("ResourceTypeName", lea.enW().getName(dmz2.az()));
            element2 = document.createElement("Guid");
            element2.appendChild(this.oQa.a(document, dmz2.oq().enx()));
            element4.appendChild(element2);
            element4.appendChild(this.oQa.a(document, dmz2.apU(), "SFPosition"));
            element4.appendChild(this.oQa.a(document, dmz2.apV(), "SFRotation"));
            element3.appendChild(element4);
        }
        Object object = null;
        object = jrw2.getAbsolutePath();
        jrw2 = new jrw((String)object);
        jsz.a(document, jrw2);
    }
}

