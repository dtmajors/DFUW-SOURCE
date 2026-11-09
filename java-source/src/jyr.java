/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jyr {
    private lju paq = new lju(0, 1);
    private jzc par = new jzc();

    public void a(bdl bdl2, String string) {
        Document document = this.par.dSD();
        Element element = null;
        Element element2 = null;
        if (bdl2 instanceof bdn) {
            element = document.createElement("SFObjectModuleCollectionTemplate");
            document.appendChild(element);
            element.appendChild(this.par.b(document, this.paq));
            element2 = this.par.a(document, (bdn)bdl2, true);
        } else {
            element = this.par.a(document, "SFObjectCollectionTemplate", this.paq);
            document.appendChild(element);
            element2 = this.par.b(document, bdl2, true);
        }
        if (element2 == null) {
            lfn.b(5, this.getClass().getName(), "ObjectCollectionElement is null!");
            return;
        }
        element.appendChild(element2);
        lfn.b(0, this.getClass().getName(), "The Filename is: " + string);
        if (string == null) {
            assert (false) : "Filename is null!";
            return;
        }
        jrw jrw2 = new jrw(string);
        jsz.a(document, jrw2);
    }
}

