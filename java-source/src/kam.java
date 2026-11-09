/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class kam {
    public static final lju eM = kae.eM;
    private jta oQa = new jta();
    private les ResourceTree = lea.enW();

    public void vU(String string) {
    }

    private void a(Document document, ctt ctt2, Element element) {
        assert (ctt2 != null);
        ctm[] ctmArray = ctt2.Ingredients;
        assert (ctmArray != null);
        assert (ctmArray.length > 0);
        int n = ctmArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            element.appendChild(this.a(document, ctmArray[i2]));
        }
    }

    private Element a(Document document, ctu ctu2) {
        assert (ctu2 != null);
        Element element = document.createElement("SFRecipe");
        element.setAttribute("ResourceName", ctu2.pa());
        element.setAttribute("Quantity", Float.toString(ctu2.vf()));
        element.setAttribute("Difficulty", Float.toString(ctu2.bbF()));
        element.setAttribute("DurationMultiplier", Float.toString(ctu2.bbG()));
        element.setAttribute("RequiredResourceName", ctu2.DF());
        this.a(document, ctu2, element);
        if (ctu2.bbI() != null) {
            ctz[] ctzArray = ctu2.bbI();
            assert (ctzArray.length > 0);
            int n = ctzArray.length;
            for (int i2 = 0; i2 < n; ++i2) {
                element.appendChild(this.a(document, ctzArray[i2]));
            }
        }
        return element;
    }

    private Element a(Document document, ctm ctm2) {
        assert (ctm2 != null);
        Element element = document.createElement("SFIngredient");
        element.setAttribute("ResourceName", ctm2.pa());
        element.setAttribute("Quantity", Float.toString(ctm2.asi));
        element.setAttribute("FractionLoss", Float.toString(ctm2.fgb));
        return element;
    }

    private Element a(Document document, ctz ctz2) {
        assert (ctz2 != null);
        Element element = document.createElement("SFRequiredSkill");
        element.setAttribute("SkillName", ctz2.Bu());
        element.setAttribute("SkillLevel", Float.toString(ctz2.SkillLevel));
        element.setAttribute("InheritancePortion", Float.toString(ctz2.fgs));
        element.setAttribute("UseInCraftingCheck", Boolean.toString(ctz2.fgt));
        return element;
    }
}

