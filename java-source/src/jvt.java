/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.SortedMap;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class jvt {
    public static final lju eM = new lju(0, 0, 1);
    private jta oQa = new jta();

    public void uy(String string) {
        Document document = this.oQa.dSD();
        Element element = this.oQa.a(document, "Tasks", eM);
        document.appendChild(element);
        cju cju2 = lea.epr();
        if (cju2 != null) {
            String string2 = cju2.eEn;
            Element element2 = document.createElement("StarterAreaMessage");
            element2.setAttribute("Value", string2);
            element.appendChild(element2);
            SortedMap<Integer, cjr> sortedMap = cju2.aQi();
            if (sortedMap != null) {
                for (cjr cjr2 : sortedMap.values()) {
                    List<cjt> list;
                    Object object;
                    Object object2;
                    Element element3 = document.createElement("Task");
                    element3.setAttribute("Index", String.valueOf(cjr2.adk));
                    element3.setAttribute("Name", cjr2.Name);
                    element.appendChild(element3);
                    Element element4 = document.createElement("StartMessage");
                    element4.setAttribute("Value", cjr2.eEi);
                    element3.appendChild(element4);
                    Element element5 = document.createElement("SpecialEffectName");
                    element5.setAttribute("Value", cjr2.eEj);
                    element3.appendChild(element5);
                    cjf cjf2 = cjr2.eDE;
                    Element element6 = document.createElement("Trigger");
                    element6.setAttribute("Type", cjr2.eDE.aPY().name());
                    element3.appendChild(element6);
                    Element element7 = document.createElement("Counter");
                    element7.setAttribute("Value", String.valueOf(cjr2.eDE.ayN));
                    element6.appendChild(element7);
                    switch (cjf2.aPY()) {
                        case EQUIP_UNSHEATH: {
                            object2 = (cjh)cjr2.eDE;
                            object = lea.enW().getName(((cjh)object2).ResourceType);
                            Element element8 = document.createElement("ResourceName");
                            element8.setAttribute("Value", (String)object);
                            element6.appendChild(element8);
                            break;
                        }
                        case SKILL: {
                            object2 = (cjn)cjr2.eDE;
                            object = lea.enW().getName(((cjn)object2).ResourceType);
                            String string3 = lea.enZ().getName(((cjn)object2).SkillType);
                            boolean bl = ((cjn)object2).eAg;
                            list = document.createElement("ResourceName");
                            list.setAttribute("Value", (String)object);
                            element6.appendChild((Node)((Object)list));
                            Element element9 = document.createElement("SkillName");
                            element9.setAttribute("Value", string3);
                            element6.appendChild(element9);
                            Element element8 = document.createElement("Duration");
                            element8.setAttribute("Value", String.valueOf(bl));
                            element6.appendChild(element8);
                            break;
                        }
                        case KILL: {
                            object2 = (cjj)cjr2.eDE;
                            object = lea.enW().getName(((cjj)object2).ResourceType);
                            int n = ((cjj)object2).ayN;
                            Element element10 = document.createElement("ResourceName");
                            element10.setAttribute("Value", (String)object);
                            element6.appendChild(element10);
                            list = document.createElement("Counter");
                            list.setAttribute("Counter", String.valueOf(n));
                            element6.appendChild((Node)((Object)list));
                            break;
                        }
                    }
                    if ((object2 = cjr2.bhg) == null) continue;
                    object = object2.iterator();
                    while (object.hasNext()) {
                        cjs cjs2 = (cjs)object.next();
                        Element element11 = document.createElement("Reward");
                        element11.setAttribute("ContainerName", cjs2.eEa);
                        element3.appendChild(element11);
                        list = cjs2.aCN;
                        if (list == null) continue;
                        for (cjt cjt2 : list) {
                            String string3 = lea.enW().getName(cjt2.ResourceType);
                            Element element9 = document.createElement("Item");
                            element9.setAttribute("ResourceName", string3);
                            element9.setAttribute("Counter", String.valueOf(cjt2.ayN));
                            element11.appendChild(element9);
                        }
                    }
                }
            }
        }
        jsz.b(document, string);
    }
}

