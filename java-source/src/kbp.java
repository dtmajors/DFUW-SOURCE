/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class kbp {
    private jta oQa = new jta();
    private kal oRX = new kal();
    private kbs pbd = null;

    public kbp(kbs kbs2) {
        this.pbd = kbs2;
    }

    public Element a(Document document, aja aja2) {
        Element element = document.createElement("SFConstraint");
        this.a(document, aja2, element);
        return element;
    }

    public Element b(Document document, aja aja2) {
        Element element = document.createElement("SFBreakableConstraint");
        this.a(document, aja2, element);
        return element;
    }

    private void a(Document document, aja aja2, Element element) {
        element.appendChild(this.oQa.a(document, aja2.Cl().name(), "SFConstraintName"));
        switch (aja2.Cl()) {
            case boC: {
                this.a(document, (aiy)aja2, element);
                break;
            }
            case boy: {
                this.a(document, (aiu)aja2, element);
                break;
            }
            case boG: {
                this.a(document, (ajh)aja2, element);
                break;
            }
            case boI: {
                this.a(document, (ajg)aja2, element);
                break;
            }
            case boL: {
                this.a(document, (ajk)aja2, element);
                break;
            }
            case boN: {
                this.a(document, (ajm)aja2, element);
                break;
            }
            case boR: {
                this.a(document, (ajp)aja2, element);
                break;
            }
            case boY: {
                this.a(document, (ajy)aja2, element);
                break;
            }
            case bpa: {
                this.a(document, (akd)aja2, element);
                break;
            }
            case bpb: {
                this.a(document, (ake)aja2, element);
                break;
            }
            case bpe: {
                this.a(document, (akm)aja2, element);
                break;
            }
            case bpd: {
                this.a(document, (akl)aja2, element);
                break;
            }
            case bpc: {
                this.a(document, (akj)aja2, element);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void b(Document document, aja aja2, Element element) {
        element.appendChild(this.oQa.a(document, aja2.Cn(), "SFInvertCheck"));
    }

    private void a(Document document, ait ait2, Element element) {
        this.b(document, ait2, element);
        element.appendChild(this.oRX.b(document, ait2.BV()));
        element.appendChild(this.g(document, ait2.BS()));
    }

    private void a(Document document, aiu aiu2, Element element) {
        this.a(document, (ait)aiu2, element);
        element.appendChild(this.oQa.a(document, aiu2.Cb(), "SFGeneralSkillFunction"));
        element.appendChild(this.oQa.a(document, aiu2.Cd(), "SFSkillFunctionName"));
    }

    private void a(Document document, aiy aiy2, Element element) {
        this.a(document, (ait)aiy2, element);
        element.appendChild(this.oQa.a(document, aiy2.Ck(), "SFLimitValue"));
    }

    private void a(Document document, ajf ajf2, Element element) {
        this.b(document, ajf2, element);
        element.appendChild(this.oQa.a(document, ajf2.getMaxDistance(), "SFMaxDistance"));
        element.appendChild(this.oQa.a(document, ajf2.getMinDistance(), "SFMinDistance"));
    }

    private void a(Document document, ajh ajh2, Element element) {
        this.a(document, (ajf)ajh2, element);
    }

    private void a(Document document, ajg ajg2, Element element) {
        this.a(document, (ajf)ajg2, element);
    }

    private void a(Document document, ajk ajk2, Element element) {
        this.a(document, (ajm)ajk2, element);
        element.appendChild(this.oQa.a(document, ajk2.CE(), "SFEffectName"));
        element.appendChild(this.g(document, ajk2.BS()));
        element.appendChild(this.oQa.a(document, ajk2.uO(), "SFMagnitude"));
    }

    private void a(Document document, ajm ajm2, Element element) {
        this.b(document, ajm2, element);
        element.appendChild(this.h(document, ajm2.getEventType()));
    }

    private void a(Document document, ajp ajp2, Element element) {
        this.b(document, ajp2, element);
    }

    private void a(Document document, ajy ajy2, Element element) {
        this.b(document, ajy2, element);
        element.appendChild(this.oQa.a(document, ajy2.Cb(), "SFGeneralSkillFunction"));
        element.appendChild(this.oQa.a(document, cxh.fH(ajy2.Cc()), "SFSkillFunctionName"));
    }

    private void a(Document document, akc akc2, Element element) {
        this.b(document, akc2, element);
        element.appendChild(this.oQa.a(document, akc2.pa(), "SFResourceName"));
    }

    private void a(Document document, akd akd2, Element element) {
        this.b(document, akd2, element);
        element.appendChild(this.oQa.a(document, akd2.Cb(), "SFGeneralSkillFunction"));
        element.appendChild(this.oQa.a(document, akd2.Cd(), "SFSkillFunctionName"));
    }

    private void a(Document document, ake ake2, Element element) {
        this.a(document, (akc)ake2, element);
        element.appendChild(this.oQa.a(document, (float)ake2.vf(), "SFQuantity"));
    }

    private void a(Document document, akk akk2, Element element) {
        this.b(document, akk2, element);
        element.appendChild(this.pbd.f(document, akk2.zg()));
        element.appendChild(this.g(document, akk2.BS()));
    }

    private void a(Document document, akm akm2, Element element) {
        this.a(document, (akk)akm2, element);
        element.appendChild(this.oQa.a(document, akm2.Ck(), "SFLimitValue"));
    }

    private void a(Document document, akl akl2, Element element) {
        this.a(document, (akk)akl2, element);
        element.appendChild(this.oQa.a(document, akl2.Cd(), "SFSkillFunctionName"));
    }

    private void a(Document document, akj akj2, Element element) {
        this.a(document, (ajm)akj2, element);
        element.appendChild(this.oQa.a(document, akj2.Cd(), "SFSkillFunctionName"));
        element.appendChild(this.pbd.f(document, akj2.zg()));
    }

    private Element g(Document document, int n) {
        return this.oQa.a(document, ajb.fI(n), "SFOperatorName");
    }

    private Element h(Document document, int n) {
        return this.oQa.a(document, bfo.eV(n), "SFEventName");
    }
}

