/*
 * Decompiled with CFR.
 */
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jta {
    protected lfn ga = lfn.eqw();

    public Document dSD() {
        try {
            return jtf.dSE().newDocument();
        }
        catch (ParserConfigurationException parserConfigurationException) {
            parserConfigurationException.printStackTrace();
            assert (false);
            return null;
        }
    }

    public Element a(Document document, String string, lju lju2) {
        Element element = document.createElement(string);
        element.appendChild(this.b(document, lju2));
        return element;
    }

    public Element c(Document document, String string) {
        Element element = document.createElement("SFString");
        element.setAttribute("Value", string);
        return element;
    }

    public Element a(Document document, String string, String string2) {
        Element element = document.createElement(string2);
        element.appendChild(this.c(document, string));
        return element;
    }

    public Element b(Document document, String string, String string2) {
        Element element = document.createElement(string2);
        element.setTextContent(string);
        return element;
    }

    public Element c(Document document, String string, String string2) {
        Element element = document.createElement(string2);
        element.appendChild(this.d(document, string));
        return element;
    }

    private CDATASection d(Document document, String string) {
        CDATASection cDATASection = document.createCDATASection("#cdata-section");
        cDATASection.setNodeValue(string);
        cDATASection.setTextContent(string);
        return cDATASection;
    }

    public Element a(Document document, float f) {
        Element element = document.createElement("SFFloat");
        element.setAttribute("Value", Float.toString(f));
        return element;
    }

    public Element a(Document document, float f, String string) {
        Element element = document.createElement(string);
        element.appendChild(this.a(document, f));
        return element;
    }

    public Element a(Document document, double d2) {
        Element element = document.createElement("SFDouble");
        element.setAttribute("Value", Double.toString(d2));
        return element;
    }

    public Element a(Document document, double d2, String string) {
        Element element = document.createElement(string);
        element.appendChild(this.a(document, d2));
        return element;
    }

    public Element a(Document document, int n) {
        Element element = document.createElement("SFInteger");
        element.setAttribute("Value", Integer.toString(n));
        return element;
    }

    public Element a(Document document, int n, String string) {
        Element element = document.createElement(string);
        element.appendChild(this.a(document, n));
        return element;
    }

    public Element a(Document document, boolean bl) {
        Element element = document.createElement("SFBool");
        if (bl) {
            element.setAttribute("Value", "TRUE");
        } else {
            element.setAttribute("Value", "FALSE");
        }
        return element;
    }

    public Element a(Document document, boolean bl, String string) {
        Element element = document.createElement(string);
        element.appendChild(this.a(document, bl));
        return element;
    }

    public Element a(Document document, long l) {
        Element element = document.createElement("SFLong");
        element.setAttribute("Value", Long.toString(l));
        return element;
    }

    public Element a(Document document, long l, String string) {
        Element element = document.createElement(string);
        element.appendChild(this.a(document, l));
        return element;
    }

    public Element a(Document document, ljr ljr2) {
        Element element = document.createElement("SFVector4");
        element.setAttribute("X", Float.toString(ljr2.x));
        element.setAttribute("Y", Float.toString(ljr2.y));
        element.setAttribute("Z", Float.toString(ljr2.rlV));
        element.setAttribute("W", Float.toString(ljr2.rlW));
        return element;
    }

    public Element a(Document document, ljq ljq2) {
        Element element = document.createElement("SFVector3");
        element.setAttribute("X", Float.toString(ljq2.x));
        element.setAttribute("Y", Float.toString(ljq2.y));
        element.setAttribute("Z", Float.toString(ljq2.rlV));
        return element;
    }

    public Element a(Document document, ljr ljr2, String string) {
        Element element = document.createElement(string);
        element.appendChild(this.a(document, ljr2));
        return element;
    }

    public Element a(Document document, ljq ljq2, String string) {
        Element element = document.createElement(string);
        element.appendChild(this.a(document, ljq2));
        return element;
    }

    public Element a(Document document, ljp ljp2) {
        Element element = document.createElement("SFVector2");
        element.setAttribute("X", Float.toString(ljp2.x));
        element.setAttribute("Y", Float.toString(ljp2.y));
        return element;
    }

    public Element a(Document document, ljp ljp2, String string) {
        Element element = document.createElement(string);
        element.appendChild(this.a(document, ljp2));
        return element;
    }

    public Element a(Document document, lej lej2) {
        Element element = document.createElement("SFInteger2");
        element.setAttribute("X", Integer.toString(lej2.getX()));
        element.setAttribute("Y", Integer.toString(lej2.getY()));
        return element;
    }

    public Element a(Document document, lej lej2, String string) {
        Element element = document.createElement(string);
        element.appendChild(this.a(document, lej2));
        return element;
    }

    public Element a(Document document, lek lek2) {
        Element element = document.createElement("SFInteger3");
        element.setAttribute("X", Integer.toString(lek2.cf));
        element.setAttribute("Y", Integer.toString(lek2.cg));
        element.setAttribute("Z", Integer.toString(lek2.riS));
        return element;
    }

    public Element a(Document document, lek lek2, String string) {
        Element element = document.createElement(string);
        element.appendChild(this.a(document, lek2));
        return element;
    }

    public Element a(Document document, lco lco2) {
        Element element = document.createElement("SFColor");
        element.setAttribute("B", Float.toString(lco2.qwm));
        element.setAttribute("G", Float.toString(lco2.qwl));
        element.setAttribute("R", Float.toString(lco2.qwk));
        return element;
    }

    public Element a(Document document, lco lco2, String string) {
        Element element = document.createElement(string);
        element.appendChild(this.a(document, lco2));
        return element;
    }

    public Element a(Document document, lcq lcq2) {
        Element element = document.createElement("SFColor");
        element.setAttribute("A", Float.toString(lcq2.a));
        element.setAttribute("B", Float.toString(lcq2.b));
        element.setAttribute("G", Float.toString(lcq2.g));
        element.setAttribute("R", Float.toString(lcq2.r));
        return element;
    }

    public Element a(Document document, lcq lcq2, String string) {
        Element element = document.createElement(string);
        element.appendChild(this.a(document, lcq2));
        return element;
    }

    public Element a(Document document, ldv ldv2) {
        return this.a(document, ldv2, "Guid");
    }

    public Element a(Document document, ldv ldv2, String string) {
        String string2;
        Element element = document.createElement(string);
        element.appendChild(this.a(document, ldv2.enx()));
        ldv ldv3 = mje.DCi.get(ldv2);
        if (ldv3 != null) {
            element.setAttribute("GroupOS", String.valueOf(ldv3.enw()));
            element.setAttribute("GroupID", String.valueOf(ldv3.enx()));
        }
        if ((string2 = mje.DCj.get(ldv2)) != null) {
            element.setAttribute("Category", string2);
        }
        return element;
    }

    public Element b(Document document, ldv ldv2) {
        Element element = document.createElement("ObjectSpaceGuid");
        element.appendChild(this.a(document, ldv2.enw()));
        return element;
    }

    public Element c(Document document, ldv ldv2) {
        return this.b(document, ldv2, "SFGUID");
    }

    public Element b(Document document, ldv ldv2, String string) {
        Element element = document.createElement(string);
        Element element2 = document.createElement("SFGUID");
        element2.setAttribute("NodeID", new Integer(ldv2.ib()).toString());
        element2.setAttribute("ObjectSpaceGuid", new Integer(ldv2.enw()).toString());
        element2.setAttribute("ObjectGuid", new Integer(ldv2.enx()).toString());
        element.appendChild(element2);
        return element;
    }

    public Element b(Document document, lju lju2) {
        Element element = document.createElement("VersionInformation");
        element.setAttribute("Incremental", Integer.toString(lju2.esU()));
        element.setAttribute("Minor", Integer.toString(lju2.getMinor()));
        element.setAttribute("Major", Integer.toString(lju2.getMajor()));
        return element;
    }

    public Element a(Document document, ldz ldz2) {
        return this.a(document, ldz2, "SFTime");
    }

    public Element a(Document document, ldz ldz2, String string) {
        Element element = document.createElement(string);
        Element element2 = document.createElement("SFTime");
        element2.setAttribute("TotalTime", Double.toString(ldz2.rgz));
        element2.setAttribute("FrameTime", Double.toString(ldz2.qwh));
        element2.setAttribute("TickCount", Integer.toString(ldz2.lpr));
        element.appendChild(element2);
        return element;
    }

    public Element a(Document document, lhf lhf2, String string) {
        Element element = document.createElement(string);
        element.appendChild(this.a(document, lhf2));
        return element;
    }

    public Element a(Document document, lhf lhf2) {
        Element element = document.createElement("SFDimension");
        element.setAttribute("Width", Integer.toString(lhf2.rmN));
        element.setAttribute("Height", Integer.toString(lhf2.H));
        return element;
    }

    public Element a(Document document, lgl lgl2) {
        return this.a(document, lgl2, "SFQuaternion");
    }

    public Element a(Document document, lgl lgl2, String string) {
        Element element = document.createElement(string);
        Element element2 = document.createElement("SFQuaternion");
        element2.setAttribute("X", Float.toString(lgl2.x));
        element2.setAttribute("Y", Float.toString(lgl2.y));
        element2.setAttribute("Z", Float.toString(lgl2.rlV));
        element2.setAttribute("W", Float.toString(lgl2.rlW));
        element.appendChild(element2);
        return element;
    }
}

