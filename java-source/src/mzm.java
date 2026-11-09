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

public class mzm {
    private lfn ga = lfn.eqw();
    private final String pau = lcw.qLb + "xml-files/object/spawnpoint/";
    private lju paq = new lju(0, 1);
    private jzc par = new jzc();

    public void a(moe moe2, jrw jrw2) {
        Object var3_3 = null;
        Document document = this.par.dSD();
        Element element = this.par.a(document, "SFScatterConfig", this.paq);
        document.appendChild(element);
        Element element2 = null;
        element2 = this.par.a(document, moe2.getDescription(), "ScatterDescription");
        element.appendChild(element2);
        element2 = this.par.a(document, moe2.bzs(), "NumberOfObjects");
        element.appendChild(element2);
        element2 = this.par.a(document, moe2.eHj(), "ScatterImageFilename");
        element.appendChild(element2);
        element2 = this.par.a(document, moe2.eHk(), "AreaSize");
        element.appendChild(element2);
        Element element3 = document.createElement("ScatterObjectList");
        element.appendChild(element3);
        List list = moe2.eHl();
        int n2 = list.size();
        for (int i = 0; i < n2; ++i) {
            element2 = this.a((mof)list.get(i), document);
            element3.appendChild(element2);
        }
        lfn.b(0, this.getClass().getName(), "The Filename is: " + jrw2);
        if (jrw2 != null) {
            jsz.a(document, jrw2);
        } else {
            lfn.b(0, "SFScatterConfigWriter", "WriteScatterConfig() : The Filename is null! Cannot save ScatterConfig");
        }
    }

    private Element a(mof mof2, Document document) {
        Element element = document.createElement("SFScatterObject");
        Element element2 = null;
        element2 = this.par.a(document, mof2.eHr(), "MinDistanceToNextObject");
        element.appendChild(element2);
        element2 = this.par.a(document, mof2.eHt(), "WeightingPercent");
        element.appendChild(element2);
        element2 = this.par.a(document, mof2.eHq(), "DescriptionFilename");
        element.appendChild(element2);
        element2 = this.par.a(document, new lco(mof2.eHs()), "TypeColor");
        element.appendChild(element2);
        return element;
    }
}

