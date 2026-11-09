/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.util.Map;
import java.util.TreeMap;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class kbx
extends jzn {
    private Map pdS = lea.eoo();

    public void g(Map<Integer, dgj> map, String string) {
        if (map == null) {
            lfn.b(5, "SFSpecialEffectWriter", "writeSpecialEffects() SpecialEffectMap is null.");
            return;
        }
        if (string == null) {
            lfn.b(5, "SFSpecialEffectWriter", "writeSpecialEffects() FileName is null.");
            return;
        }
        Document document = this.oQa.dSD();
        Element element = this.oQa.a(document, "SFXML", kbw.oRy);
        document.appendChild(element);
        TreeMap<Integer, dgj> treeMap = lcn.emG();
        for (dgj object : map.values()) {
            treeMap.put(object.getSpecialEffectType(), object);
        }
        int n = 1;
        for (dgj dgj2 : treeMap.values()) {
            try {
                Element bg2 = null;
                if ((bg2 = this.a(document, dgj2, n++)) == null) continue;
                element.appendChild(bg2);
            }
            catch (bg bg2) {
                lfn.b(5, "SFSpecialEffectWriter", "writeSpecialEffects() Element for effect '" + dgj2.getEffectClassName() + "' could not be created.");
                lfn.log("SFSpecialEffectWriter", bg2);
                return;
            }
        }
        jsz.b(document, new jrw(string));
    }

    private Element a(Document document, dkw dkw2) {
        Element element = document.createElement("SFContainerManager");
        dgj[] dgjArray = dkw2.bnY();
        if (dgjArray == null || dgjArray.length == 0) {
            lfn.b(5, "SFSpecialEffectWriter", "createSFContainerManagerElements() SubEffects array is null or empty.");
            return null;
        }
        int n = dgjArray.length;
        for (int i = 0; i < n; ++i) {
            Element element2 = document.createElement("SFSpecialEffect");
            element2.appendChild(this.oQa.a(document, dgjArray[i].getEffectClassName(), "SFClassName"));
            duf duf2 = (duf)this.pdS.get(dgjArray[i].getEffectClassName());
            if (duf2 == null) {
                lfn.b(5, "SFSpecialEffectWriter", "createSFContainerManagerElements() A class for effectclass '" + dgjArray[i].getEffectClassName() + "' was not found.");
                return null;
            }
            try {
                this.a(document, duf2, dgjArray[i], element2);
                if (dgjArray[i].getContainerManager() != null && dgjArray[i].getContainerManager().bnY().length > 0) {
                    Element element3 = this.a(document, dgjArray[i].getContainerManager());
                    element2.appendChild(element3);
                }
                this.a(document, dgjArray[i], element2);
                element.appendChild(element2);
                continue;
            }
            catch (bg bg2) {
                throw new bg("Element for subeffect '" + duf2.bAZ() + "' could not be created.", bg2);
            }
        }
        return element;
    }

    private Element a(Document document, dgj dgj2, int n) {
        if (dgj2 == null) {
            lfn.b(5, "SFSpecialEffectWriter", "createSpecialEffectElement() Effect is null!");
            return null;
        }
        if (dgj2.getSpecialEffectName() == null || dgj2.getSpecialEffectName().equals("")) {
            lfn.b(5, "SFSpecialEffectWriter", "createSpecialEffectElement() SpecialEffectName is null or not set.");
            return null;
        }
        Element element = document.createElement("SFSpecialEffect");
        element = document.createElement("SFSpecialEffect");
        element.appendChild(this.oQa.a(document, dgj2.getEffectClassName(), "SFClassName"));
        element.appendChild(this.oQa.a(document, dgj2.getSpecialEffectName(), "SFName"));
        element.appendChild(this.oQa.a(document, n, "SFType"));
        duf duf2 = (duf)this.pdS.get(dgj2.getEffectClassName());
        if (duf2 == null) {
            lfn.b(5, "SFSpecialEffectWriter", "createSpecialEffectElement() A class for effectclass '" + dgj2.getEffectClassName() + "' was not found.");
            return null;
        }
        this.a(document, duf2, dgj2, element);
        if (dgj2.getContainerManager() != null && dgj2.getContainerManager().bnY().length > 0) {
            Element element2 = this.a(document, dgj2.getContainerManager());
            element.appendChild(element2);
        }
        this.a(document, dgj2, element);
        return element;
    }

    private void a(Document document, dgj dgj2, Element element) {
        if (dgj2.getComponents() != null) {
            Element element2 = document.createElement("SFSpecialEffectComponents");
            element.appendChild(element2);
            for (dgb dgb2 : dgj2.getComponents()) {
                String string = del.c(dgb2.getComponentType());
                duf duf2 = (duf)this.pdS.get(string);
                if (duf2 == null) {
                    lfn.b(5, this.getClass().getName(), "createSpecialEffectElement() : error loading special effect component " + string);
                    continue;
                }
                Element element3 = document.createElement("SFSpecialEffectComponent");
                element3.appendChild(this.oQa.a(document, string, "SFClassName"));
                try {
                    this.a(document, duf2, dgb2, element3);
                }
                catch (Exception exception) {
                    lfn.b(5, this.getClass().getName(), "createEffectComponentsElem() :" + exception);
                }
                element2.appendChild(element3);
            }
        }
    }
}

