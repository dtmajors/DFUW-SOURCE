/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  ep
 *  lcw
 */
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class kbu {
    public static final lju oRy = new lju(0, 1, 0);
    private final jta oQa = new jta();
    private final les ResourceTree = lea.enW();

    public void a(Map<String, cur> map, float f2) {
        String string = lcw.qLb + "xml-files/server/gamelogicinfo/" + "weaponpropertylist.xml";
        Document document = this.oQa.dSD();
        Element element = this.oQa.a(document, "SFWeaponReachFile", oRy);
        document.appendChild(element);
        Element element2 = this.oQa.a(document, f2, "SFUnitPerMeter");
        element.appendChild(element2);
        for (Map.Entry<String, cur> entry : map.entrySet()) {
            Object object;
            Object object2;
            Element element3;
            Element element4;
            String string2 = entry.getKey();
            cur cur2 = entry.getValue();
            if (this.ResourceTree.isDescendant(cur2.ResourceType, cug.fiC) || this.ResourceTree.isDescendant(cur2.ResourceType, cug.fiE)) {
                element4 = document.createElement("SFMeleeWeapon");
                element.appendChild(element4);
                element3 = this.oQa.a(document, string2, "SFResourceName");
                element4.appendChild(element3);
                object2 = this.oQa.a(document, cur2.fyb, "SFWeaponAngle");
                element4.appendChild((Node)object2);
                object = this.oQa.a(document, cur2.fyc, "SFWeaponRank");
                element4.appendChild((Node)object);
                Element element5 = this.oQa.a(document, cur2.bFz, "SFWeaponReach");
                element4.appendChild(element5);
                String string3 = ep.aM((int)cur2.fyd);
                if (string3 == null) continue;
                element4.appendChild(this.oQa.a(document, string3, "SFPrerequisiteAttributeType"));
                element4.appendChild(this.oQa.a(document, cur2.fye, "SFPrerequisiteAttributeValue"));
                continue;
            }
            if (this.ResourceTree.isDescendant(cur2.ResourceType, cug.fiu) || this.ResourceTree.isDescendant(cur2.ResourceType, cug.fiF)) {
                element4 = document.createElement("SFRangedWeapon");
                element.appendChild(element4);
                element3 = this.oQa.a(document, string2, "SFResourceName");
                element4.appendChild(element3);
                object2 = this.oQa.a(document, cur2.fyc, "SFWeaponRank");
                element4.appendChild((Node)object2);
                object = ep.aM((int)cur2.fyd);
                if (object == null) continue;
                element4.appendChild(this.oQa.a(document, (String)object, "SFPrerequisiteAttributeType"));
                element4.appendChild(this.oQa.a(document, cur2.fye, "SFPrerequisiteAttributeValue"));
                continue;
            }
            if (this.ResourceTree.isDescendant(cur2.ResourceType, cug.fiB) || this.ResourceTree.isDescendant(cur2.ResourceType, cug.fiD)) {
                element4 = document.createElement("SFMageStaff");
                element.appendChild(element4);
                element3 = this.oQa.a(document, string2, "SFResourceName");
                element4.appendChild(element3);
                object2 = this.oQa.a(document, cur2.fyc, "SFWeaponRank");
                element4.appendChild((Node)object2);
                object = ep.aM((int)cur2.fyd);
                if (object == null) continue;
                element4.appendChild(this.oQa.a(document, (String)object, "SFPrerequisiteAttributeType"));
                element4.appendChild(this.oQa.a(document, cur2.fye, "SFPrerequisiteAttributeValue"));
                continue;
            }
            if (!this.ResourceTree.isDescendant(cur2.ResourceType, cug.fjr) && !this.ResourceTree.isDescendant(cur2.ResourceType, cug.fjl)) continue;
            element4 = document.createElement("SFArmor");
            element.appendChild(element4);
            element3 = this.oQa.a(document, string2, "SFResourceName");
            element4.appendChild(element3);
            object2 = ep.aM((int)cur2.fyd);
            if (object2 == null) continue;
            element4.appendChild(this.oQa.a(document, (String)object2, "SFPrerequisiteAttributeType"));
            element4.appendChild(this.oQa.a(document, cur2.fye, "SFPrerequisiteAttributeValue"));
        }
        jsz.a(document, new jrw(string));
    }
}

