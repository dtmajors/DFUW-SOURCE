/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import java.util.List;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class jzg {
    private final String pau = lcw.qLb + "xml-files/object/animation/parts/";
    private lju paq = new lju(0, 1);
    private jzc par = new jzc();
    private jta oQa = new jta();

    public void b(lkj lkj2) {
        jrw jrw2 = new jrw(this.pau + lkj2.bsl());
        this.a(lkj2, jrw2);
    }

    public void a(lkj lkj2, jrw jrw2) {
        Document document = this.par.dSD();
        Element element = this.par.a(document, "SFAnimationPartTemplate", this.paq);
        Element element2 = null;
        document.appendChild(element);
        lfn.b(0, this.getClass().getName(), "Creating SFAnimationPartTemplate Node :" + lkj2);
        element2 = this.oQa.a(document, lkj2.etC(), "NumberOfParts");
        element.appendChild(element2);
        element2 = this.oQa.a(document, lkj2.etE(), "AnimationFilename");
        element.appendChild(element2);
        element2 = this.oQa.a(document, lkj2.getName(), "Name");
        element.appendChild(element2);
        element2 = this.oQa.a(document, lkj2.getDirectory(), "Directory");
        element.appendChild(element2);
        String[] stringArray = lkj2.etD();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            element2 = this.oQa.a(document, stringArray[i2], "AnimationPart" + i2);
            element.appendChild(element2);
        }
        Element element3 = document.createElement("SFASFileList");
        element.appendChild(element3);
        Set set = lkj2.etF().keySet();
        for (String string : set) {
            List list = (List)lkj2.etF().get(string);
            element3.appendChild(this.a(document, string, list));
        }
        lfn.b(0, this.getClass().getName(), "The Filename is: " + jrw2);
        Object object = null;
        if (jrw2 == null) {
            object = this.pau + lkj2.bsl();
            jrw2 = new jrw((String)object);
        }
        jsz.a(document, jrw2);
    }

    private Node a(Document document, String string, List list) {
        Element element = document.createElement("SFASFile");
        Element element2 = this.oQa.a(document, string, "Filename");
        element.appendChild(element2);
        for (String string2 : list) {
            element2 = this.oQa.a(document, string2, "PSAFile");
            element.appendChild(element2);
        }
        return element;
    }
}

