/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jzc
 *  lcw
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class kan {
    private final lju paq = new lju(0, 1, 0);
    final String Filename = lcw.qLb + "xml-files/server/loottag/" + "loottag.xml";
    protected final jzc pbc = new jzc();

    public void a(Map<String, ctn> map, Map<String, List<String>> map2, Map<String, List<String>> map3) {
        Document document = this.pbc.dSD();
        Element element = document.createElement("SFLootTagFile");
        element.appendChild(this.pbc.b(document, this.paq));
        document.appendChild(element);
        this.c(document, element, map);
        this.b(document, element, map2);
        this.a(document, element, map3);
        jsz.b(document, this.Filename);
    }

    private void a(Document document, Element element, Map<String, List<String>> map) {
        Element element2 = document.createElement("SFSpawnpointLootTagSet");
        TreeSet<String> treeSet = new TreeSet<String>(map.keySet());
        for (String string : treeSet) {
            List<String> list = map.get(string);
            Collections.sort(list);
            Element element3 = document.createElement("SFSpawnpointLootTag");
            element3.setAttribute("SpawnPointName", string);
            for (String string2 : list) {
                Element element4 = document.createElement("SFLootTag");
                element4.setAttribute("LootTagName", string2);
                element3.appendChild(element4);
            }
            element2.appendChild(element3);
        }
        element.appendChild(element2);
    }

    private void b(Document document, Element element, Map<String, List<String>> map) {
        Element element2 = document.createElement("SFMonsterLootTagSet");
        TreeSet<String> treeSet = new TreeSet<String>(map.keySet());
        for (String string : treeSet) {
            List<String> list = map.get(string);
            Collections.sort(list);
            Element element3 = document.createElement("SFMonsterLootTag");
            element3.setAttribute("ResourceName", string);
            for (String string2 : list) {
                Element element4 = document.createElement("SFLootTag");
                element4.setAttribute("LootTagName", string2);
                element3.appendChild(element4);
            }
            element2.appendChild(element3);
        }
        element.appendChild(element2);
    }

    private void c(Document document, Element element, Map<String, ctn> map) {
        Element element2 = document.createElement("SFLootTagSet");
        element.appendChild(element2);
        TreeSet<String> treeSet = new TreeSet<String>(map.keySet());
        for (String string : treeSet) {
            ctn ctn2 = map.get(string);
            Element element3 = document.createElement("SFLootTag");
            element3.setAttribute("LootTagName", ctn2.Name);
            if (ctn2.fgd >= 0 && ctn2.fgd <= 11) {
                element3.setAttribute("MinRank", "" + ctn2.fgd);
            }
            if (ctn2.fge >= 0 && ctn2.fge <= 11) {
                element3.setAttribute("MaxRank", "" + ctn2.fge);
            }
            for (Object e2 : ctn2.fgc) {
                Object object;
                if (e2 instanceof cto) {
                    object = (cto)e2;
                    Element element4 = this.a(document, (cto)object, false);
                    if (((cto)object).fgf != null) {
                        for (cto cto2 : ((cto)object).fgf) {
                            Element element5 = this.a(document, cto2, true);
                            element4.appendChild(element5);
                        }
                    }
                    element3.appendChild(element4);
                    continue;
                }
                if (e2 instanceof ArrayList) {
                    if (((ArrayList)e2).size() < 1) {
                        lfn.b(5, this.getClass().getSimpleName(), "Empty random item  for tag '" + ctn2.Name);
                        throw new bg(this.getClass().getSimpleName() + ": Empty random item  for tag '" + ctn2.Name);
                    }
                    object = document.createElement("SFRandomItem");
                    for (Object e3 : (ArrayList)e2) {
                        if (!(e3 instanceof cto)) continue;
                        Element element6 = this.a(document, (cto)e3, false);
                        object.appendChild(element6);
                    }
                    element3.appendChild((Node)object);
                    continue;
                }
                lfn.b(5, this.getClass().getSimpleName(), "Empty random item  for tag '" + ctn2.Name);
                throw new bg(this.getClass().getSimpleName() + ": Empty random item  for tag '" + ctn2.Name);
            }
            element2.appendChild(element3);
        }
    }

    private Element a(Document document, cto cto2, boolean bl) {
        assert (cto2 != null);
        Element element = document.createElement("SFItem");
        if (!bl) {
            assert (cto2.Probability > 0.0f) : "Invalid probability for item '" + cto2.pa();
            if (cto2.Probability > 0.0f) {
                element.setAttribute("Probability", String.valueOf(cto2.Probability));
            } else {
                lfn.b(5, this.getClass().getSimpleName(), "Invalid probability for item '" + cto2.pa());
                throw new bg(this.getClass().getSimpleName() + ": Invalid probability for item '" + cto2.pa());
            }
        }
        assert (cto2.asi > -1) : "Negative item '" + cto2.pa() + " quantity";
        if (cto2.asi > 0) {
            element.setAttribute("Quantity", String.valueOf(cto2.asi));
        } else if (cto2.asi == 0) {
            assert (cto2.dpS > -1) : "Negative item '" + cto2.pa() + " minquantity";
            if (cto2.dpS > 0) {
                element.setAttribute("MinQuantity", String.valueOf(cto2.dpS));
            }
            assert (cto2.dpT > -1) : "Negative item '" + cto2.pa() + " maxquantity";
            if (cto2.dpT > 0) {
                element.setAttribute("MaxQuantity", String.valueOf(cto2.dpT));
            }
        } else {
            lfn.b(5, this.getClass().getSimpleName(), "Negative item '" + cto2.pa() + " quantity");
            throw new bg(this.getClass().getSimpleName() + ": Negative item '" + cto2.pa() + " quantity");
        }
        element.setAttribute("ResourceName", cto2.pa());
        return element;
    }
}

