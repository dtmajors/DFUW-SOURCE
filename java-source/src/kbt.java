/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.Iterator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class kbt {
    public static final String pdJ = lcw.qLb + "xml-files/gamelogicinfo/" + "watervesselinfolist.xml";
    public static final lju oRy = kbj.oRy;
    private jta oQa = new jta();

    public void dVb() {
        Document document = this.oQa.dSD();
        Element element = this.oQa.a(document, "SFXML", oRy);
        document.appendChild(element);
        Iterator<Integer> iterator = lea.eoQ().keySet().iterator();
        amn amn2 = null;
        while (iterator.hasNext()) {
            Integer n = iterator.next();
            amn2 = lea.eoQ().get(n);
            element.appendChild(this.a(document, amn2));
        }
        jsz.a(document, new jrw(pdJ));
    }

    private Element a(Document document, amn amn2) {
        assert (false) : "NOT SUPPORTED ANYMORE!";
        return null;
    }
}

