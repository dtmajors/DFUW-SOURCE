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

public class jym {
    private lju paq = new lju(0, 1);
    private jzc par = new jzc();

    public void a(String string, List<bes> list, ber.a a2) {
        assert (list != null);
        assert (string != null);
        jrw jrw2 = new jrw(lcw.qLb + "xml-files/object/environment/" + string);
        Document document = this.par.dSD();
        Element element = this.par.a(document, "EnvironmentConfig", this.paq);
        element.setAttribute("AllowedEffect", Integer.toString(a2.ordinal()));
        document.appendChild(element);
        for (bes bes2 : list) {
            Element element2 = document.createElement("EnvironmentOS");
            element2.setAttribute("File", bes2.Filename);
            element2.setAttribute("StartTime", Integer.toString(bes2.dec));
            element2.setAttribute("InterpolationTime", Integer.toString(bes2.ded));
            element.appendChild(element2);
        }
        lfn.b(0, this.getClass().getName(), "The Filename is: " + jrw2);
        Object object = null;
        object = jrw2.getAbsolutePath();
        jrw2 = new jrw((String)object);
        jsz.a(document, jrw2);
    }
}

