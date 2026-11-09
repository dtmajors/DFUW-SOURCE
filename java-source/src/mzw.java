/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class mzw {
    private lju paq = new lju(0, 1);
    private jzc par = new jzc();
    private jta oQa = new jta();

    public void eTA() {
        jrw jrw2 = new jrw(lcw.qLb + "worldbuilder/" + "worldbuilder_configuration.xml");
        Document document = this.par.dSD();
        Element element = this.par.a(document, "SFConfiguration", this.paq);
        Element element2 = null;
        document.appendChild(element);
        lfn.b(0, this.getClass().getName(), "Writing Worldbuilder Config file: " + jrw2);
        element2 = this.oQa.a(document, mje.DAX, "OneClickObjectSelect");
        element.appendChild(element2);
        element2 = this.oQa.a(document, mje.DAY, "ShowThumbNails");
        element.appendChild(element2);
        element2 = this.oQa.a(document, mje.DAZ, "SelectFromAll");
        element.appendChild(element2);
        element2 = this.oQa.a(document, mje.DBa, "OptimizeMeshForFullPreprocess");
        element.appendChild(element2);
        element2 = this.oQa.a(document, mje.DBb, "ShowPreProcessMessages");
        element.appendChild(element2);
        element2 = this.oQa.a(document, mje.DBc, "SetShaderOnSelect");
        element.appendChild(element2);
        element2 = this.oQa.a(document, mje.DBd, "SetLastLoadedObjectSelected");
        element.appendChild(element2);
        element2 = this.oQa.a(document, mje.DBj, "OnlyOneInstance");
        element.appendChild(element2);
        element2 = this.oQa.a(document, mje.DBk, "PowerUser");
        element.appendChild(element2);
        element2 = this.oQa.a(document, mje.DBf, "MouseWheelSensitivity");
        element.appendChild(element2);
        element2 = this.oQa.a(document, (int)mje.DBe, "FrameDelay");
        element.appendChild(element2);
        element2 = this.oQa.a(document, mje.DBh, "RandomRotateNatureObjects");
        element.appendChild(element2);
        lfn.b(0, this.getClass().getName(), "The Filename is: " + jrw2);
        jsz.a(document, jrw2);
    }
}

