/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class kao {
    private jta oQa = new jta();
    private kal oRX = new kal();
    private kbs pbd = null;

    public kao(kbs kbs2) {
        this.pbd = kbs2;
    }

    public Element a(Document document, alt alt2) {
        lfn.b(0, "SFModifierWriter", "createSFModifierElement() Creating element for modifier " + alt2);
        Element element = document.createElement("SFModifier");
        if (alt2 instanceof alr) {
            element.appendChild(this.oQa.a(document, "SFBooleanAttributeModifier", "SFModifierClassName"));
            this.a(document, (alr)alt2, element);
            return element;
        }
        if (alt2 instanceof als) {
            element.appendChild(this.oQa.a(document, "SFFloatAttributeModifier", "SFModifierClassName"));
            this.a(document, (als)alt2, element);
            return element;
        }
        lfn.b(5, "SFModifierWriter", "createSFModifierElement() Unhandled modifierclass: " + alt2.getClass().getName());
        assert (false);
        return null;
    }

    private void a(Document document, alt alt2, Element element) {
        element.appendChild(this.oQa.c(document, alt2.DZ()));
        element.appendChild(this.oQa.a(document, alt2.DV()));
        element.appendChild(this.c(document, alt2.DW()));
        element.appendChild(this.d(document, alt2.DX()));
        element.appendChild(this.oQa.a(document, alt2.DY(), "SFNumberOfTicks"));
        if (alt2.DZ() != null) {
            element.appendChild(this.oQa.b(document, alt2.DZ(), "SFCauseObjectGUID"));
            element.appendChild(this.pbd.d(document, alt2.Eb(), "SFCauseSkillName"));
            element.appendChild(this.oQa.a(document, alt2.Ec(), "SFSessionID"));
        }
    }

    private void a(Document document, alq alq2, Element element) {
        this.a(document, (alt)alq2, element);
        element.appendChild(this.oRX.b(document, alq2.BV()));
    }

    private void a(Document document, alr alr2, Element element) {
        this.a(document, (alq)alr2, element);
        element.appendChild(this.oQa.a(document, alr2.DR(), "SFModifierValue"));
    }

    private void a(Document document, als als2, Element element) {
        this.a(document, (alq)als2, element);
        element.appendChild(this.oQa.a(document, als2.DS(), "SFModifierValue"));
        element.appendChild(this.oQa.a(document, als2.DT(), "SFTickIncrease"));
    }

    public Element c(Document document, int n) {
        return this.oQa.a(document, alv.gk(n), "SFModifierLayerName");
    }

    public Element d(Document document, int n) {
        boolean bl = (n & 1) > 0;
        boolean bl2 = (n & 4) > 0;
        Element element = document.createElement("SFModifierConfigType");
        element.appendChild(this.oQa.a(document, bl, "SFConvertToPermanentModification"));
        element.appendChild(this.oQa.a(document, bl2, "SFTickToChangeValue"));
        return element;
    }
}

