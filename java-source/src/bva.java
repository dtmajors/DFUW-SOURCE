/*
 * Decompiled with CFR.
 */
import java.util.LinkedList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class bva {
    public List<bux> ayX() {
        LinkedList<bux> linkedList = lcn.emA();
        String string = "xml-files/client/markers.xml";
        try {
            Document document = jsy.tJ(string);
            if (document == null) {
                lfn.b(5, "SFMarkerParser", "parseMarkers: Invalid Document: [" + string + "]");
                assert (false);
                return null;
            }
            NodeList nodeList = document.getElementsByTagName("Marker");
            int n = nodeList.getLength();
            for (int i = 0; i < n; ++i) {
                Element element = (Element)nodeList.item(i);
                bux bux2 = this.j(element);
                if (bux2 == null) continue;
                linkedList.add(bux2);
            }
        }
        catch (bg bg2) {
            lfn.b(5, "SFMarkerParser", "parseMarkers: Parsing of file '" + string + "' failed: " + bg2);
            return null;
        }
        return linkedList;
    }

    private bux j(Element element) {
        float f2;
        float f3;
        float f4;
        int n;
        if (!element.hasAttribute("MarkerType")) {
            lfn.b(5, "SFMarkerParser", "parseMarkerElement: Marker element without MarkerType attribute");
            return null;
        }
        bvb bvb2 = bvb.valueOf(element.getAttribute("MarkerType"));
        if (bvb2 == null) {
            lfn.b(5, "SFMarkerParser", "parseMarkerElement: MarkerType '" + element.getAttribute("MarkerType") + "'is invalid");
            return null;
        }
        if (!element.hasAttribute("ResourceName")) {
            lfn.b(5, "SFMarkerParser", "parseMarkerElement: Marker element without ResourceName attribute");
            return null;
        }
        lgw lgw2 = (lgw)lea.enW().zx(element.getAttribute("ResourceName"));
        if (lgw2 == null) {
            lfn.b(5, "SFMarkerParser", "parseMarkerElement: Marker element with invalid ResourceName '" + element.getAttribute("ResourceName") + "'");
            return null;
        }
        int n2 = lgw2.getType();
        if (!element.hasAttribute("Priority")) {
            lfn.b(5, "SFMarkerParser", "parseMarkerElement: Marker element without Priority attribute");
            return null;
        }
        try {
            n = Integer.parseInt(element.getAttribute("Priority"));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFMarkerParser", "parseMarkerElement: Priority is not an integer");
            return null;
        }
        if (!(element.hasAttribute("X") && element.hasAttribute("Y") && element.hasAttribute("Z"))) {
            lfn.b(5, "SFMarkerParser", "parseMarkerElement: Marker element without X, Y and Z attributes");
            return null;
        }
        try {
            f4 = Float.parseFloat(element.getAttribute("X"));
            f3 = Float.parseFloat(element.getAttribute("Y"));
            f2 = Float.parseFloat(element.getAttribute("Z"));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFMarkerParser", "parseMarkerElement: X, Y and/or Z is not a float");
            return null;
        }
        bux bux2 = new bux();
        bux2.a(bvb2);
        bux2.l(n2);
        bux2.c(new ljq(f4, f3, f2));
        bux2.setPriority(n);
        if (element.hasAttribute("Zone")) {
            bux2.gp(element.getAttribute("Zone"));
        }
        switch (bux2.ayR()) {
            case dQd: 
            case dQe: {
                if (!element.hasAttribute("IDCity")) {
                    lfn.b(5, "SFMarkerParser", "parseMarkerElement: " + (Object)((Object)bux2.ayR()) + " marker without IDCity attribute");
                    return null;
                }
                bux2.gq(element.getAttribute("IDCity"));
                break;
            }
            default: {
                lfn.b(5, "SFMarkerParser", "parseMarkerElement: Not handling " + (Object)((Object)bux2.ayR()));
                assert (false);
                return null;
            }
        }
        return bux2;
    }
}

