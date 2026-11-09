/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class mux {
    private static final String pEh = lcw.qLb + "/" + "xml-files/server/vendor/";
    private lju paq = new lju(0, 3);
    private NodeList EHp;

    public void a(String string, String string2, String string3, String string4, List list, List list2, List list3, List list4, String string5, String string6, boolean bl) {
        Element element;
        int n;
        int n2 = 0;
        jta jta2 = new jta();
        Document document = jta2.dSD();
        Element element2 = jta2.a(document, "SFInteractionTemplate", this.paq);
        document.appendChild(element2);
        Element element3 = document.createElement("SFInteraction");
        element2.appendChild(element3);
        string = jry.tu(string);
        Element element4 = jta2.a(document, string, "InteractionResourceFile");
        element3.appendChild(element4);
        element4 = jta2.a(document, string2, "InteractionName");
        element3.appendChild(element4);
        element4 = jta2.a(document, string6, "NPCTypeName");
        element3.appendChild(element4);
        if (!string3.equals("")) {
            element4 = jta2.a(document, Float.parseFloat(string3), "InteractionSellAdjustValue");
            element3.appendChild(element4);
        }
        if (!string4.equals("")) {
            element4 = jta2.a(document, Float.parseFloat(string4), "InteractionBuyAdjustValue");
            element3.appendChild(element4);
        }
        if (bl) {
            n2 |= 1;
        }
        element4 = document.createElement("VendorBehaviorList");
        element3.appendChild(element4);
        for (n = 0; n < list4.size(); ++n) {
            element = jta2.a(document, list4.get(n).toString(), "VendorBehaviorTemplate");
            element4.appendChild(element);
        }
        element4 = document.createElement("InteractionBuySellInventoryList");
        element3.appendChild(element4);
        for (n = 0; n < list.size(); ++n) {
            element = jta2.a(document, list.get(n).toString(), "InteractionBuySellInventoryFile");
            element4.appendChild(element);
            n2 |= 2;
        }
        element4 = document.createElement("TrainingList");
        element3.appendChild(element4);
        for (n = 0; n < list2.size(); ++n) {
            element = jta2.a(document, list2.get(n).toString(), "TrainingItem");
            element4.appendChild(element);
            n2 |= 8;
        }
        element4 = document.createElement("InteractionQuestList");
        element3.appendChild(element4);
        for (n = 0; n < list3.size(); ++n) {
            element = jta2.a(document, list3.get(n).toString(), "InteractionQuestFile");
            element4.appendChild(element);
            n2 |= 4;
        }
        element4 = jta2.a(document, n2, "InteractionType");
        element3.appendChild(element4);
        jsz.a(document, new jrw(pEh + "vendors/" + string5));
    }
}

