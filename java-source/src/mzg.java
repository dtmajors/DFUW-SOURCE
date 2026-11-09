/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class mzg {
    private lju paq = new lju(0, 1);
    private jzc par = new jzc();
    private jta oQa = new jta();

    public void w(Set<ldv> set) {
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/worldbuilder/used_os_guids.xml");
        Document document = this.par.dSD();
        Element element = this.par.a(document, "SFOSGUIDUsedList", this.paq);
        Element element2 = null;
        document.appendChild(element);
        for (ldv ldv2 : set) {
            element2 = this.oQa.a(document, ldv2.enw(), "OSGUID");
            element.appendChild(element2);
        }
        lfn.b(0, this.getClass().getName(), "The Filename is: " + jrw2);
        Object object = null;
        object = jrw2.getAbsolutePath();
        jrw2 = new jrw((String)object);
        jsz.a(document, jrw2);
    }
}

