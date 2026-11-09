/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jza {
    private static final String pau = lcw.qLb + "xml-files/zones/";
    private static lju paq = new lju(0, 1);
    private static jzc par = new jzc();

    public static void V(Map<String, a> map) {
        jrw jrw2 = new jrw(pau + lcw.qGM);
        jza.a(map, jrw2);
    }

    private static void a(Map<String, a> map, jrw jrw2) {
        Document document = par.dSD();
        Element element = par.a(document, "SFVoxelFile", paq);
        document.appendChild(element);
        Element element2 = document.createElement("VoxelList");
        for (Map.Entry<String, a> entry : map.entrySet()) {
            Element element3 = document.createElement("Level");
            element3.setAttribute("Name", entry.getKey());
            a a2 = entry.getValue();
            element3.setAttribute("CenterX", Float.toString(a2.mZ.x));
            element3.setAttribute("CenterY", Float.toString(a2.mZ.y));
            element3.setAttribute("CenterZ", Float.toString(a2.mZ.rlV));
            element3.setAttribute("SizeX", Float.toString(a2.pay.x));
            element3.setAttribute("SizeY", Float.toString(a2.pay.y));
            element3.setAttribute("SizeZ", Float.toString(a2.pay.rlV));
            element3.setAttribute("Resolution", Float.toString(a2.bUC));
            element3.setAttribute("HasAperture", Boolean.toString(a2.paA));
            element3.setAttribute("Oversized", Boolean.toString(a2.paz));
            element3.setAttribute("BlockSize", Float.toString(a2.paB));
            if (a2.paC != null) {
                for (int i2 = 0; i2 < a2.paC.length; ++i2) {
                    Element element4 = document.createElement("BOFF");
                    element4.setAttribute("X", Integer.toString(a2.paC[i2].cf));
                    element4.setAttribute("Y", Integer.toString(a2.paC[i2].cg));
                    element4.setAttribute("Z", Integer.toString(a2.paC[i2].riS));
                    element3.appendChild(element4);
                }
            }
            element2.appendChild(element3);
        }
        element.appendChild(element2);
        if (jrw2 == null) assert (false);
        jsz.a(document, jrw2);
    }
}

