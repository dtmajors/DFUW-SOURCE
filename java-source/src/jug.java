/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class jug {
    private jta oQa = new jta();
    private kal oRX = new kal();

    public void a(les les2, String string) {
        if (les2.eql() != les.a.rjF) {
            return;
        }
        this.a(les2, string, new lju(0, 1, 0));
    }

    public void b(les les2, String string) {
        if (les2.eql() != les.a.rjG) {
            return;
        }
        this.a(les2, string, new lju(0, 1, 0));
    }

    public void c(les les2, String string) {
        if (les2.eql() != les.a.rjH) {
            return;
        }
        this.a(les2, string, new lju(0, 1, 0));
    }

    public void d(les les2, String string) {
        if (les2.eql() != les.a.rjI) {
            return;
        }
        this.a(les2, string, new lju(0, 1, 0));
    }

    public void e(les les2, String string) {
        if (les2.eql() != les.a.rjJ) {
            return;
        }
        this.a(les2, string, new lju(0, 1, 0));
    }

    public void f(les les2, String string) {
        if (les2.eql() != les.a.rjK) {
            return;
        }
        this.a(les2, string, new lju(0, 1, 0));
    }

    private void a(les les2, String string, lju lju2) {
        Document document = this.oQa.dSD();
        Element element = this.oQa.a(document, "SFListItems", lju2);
        document.appendChild(element);
        ler ler2 = les2.eqq();
        Element element2 = this.a(document, ler2);
        element.appendChild(element2);
        this.a(document, ler2, element2, les2);
        jsz.b(document, string);
    }

    private void a(Document document, ler ler2, Element element, les les2) {
        ler ler3 = les2.g(ler2);
        if (ler3 == null) {
            return;
        }
        Element element2 = null;
        while (ler3 != null) {
            element2 = this.a(document, ler3);
            element.appendChild(element2);
            this.a(document, ler3, element2, les2);
            ler3 = les2.h(ler3);
        }
    }

    private Element a(Document document, ler ler2) {
        if (ler2 instanceof lby) {
            return this.a(document, (lby)ler2);
        }
        if (ler2 instanceof ldi) {
            return this.a(document, (ldi)ler2);
        }
        if (ler2 instanceof ldu) {
            return this.a(document, (ldu)ler2);
        }
        if (ler2 instanceof lfl) {
            return this.a(document, (lfl)ler2);
        }
        if (ler2 instanceof lgw) {
            return this.a(document, (lgw)ler2);
        }
        if (ler2 instanceof lhg) {
            return this.a(document, (lhg)ler2);
        }
        if (ler2 instanceof lho) {
            return this.a(document, (lho)ler2);
        }
        assert (false);
        return null;
    }

    private Element a(Document document, lby lby2) {
        Element element = document.createElement("SFListItem");
        this.a(document, lby2, element);
        element.appendChild(this.oQa.a(document, lby2.emm(), "SFBooleanAction"));
        element.appendChild(this.oQa.a(document, lby2.emn(), "SFDefaultAxisValue"));
        element.appendChild(this.oQa.a(document, lby2.emo(), "SFTriggerOnActionStart"));
        element.appendChild(this.oQa.a(document, lby2.emp(), "SFTriggerOnActionStop"));
        element.appendChild(this.oQa.a(document, lby2.emq(), "SFInputTimerLength"));
        element.appendChild(this.oQa.a(document, lby2.emr(), "SFRepeatAction"));
        return element;
    }

    private Element a(Document document, ldi ldi2) {
        lce[] lceArray;
        Element element = document.createElement("SFListItem");
        String string = ep.aM((int)ldi2.getType());
        element.appendChild(this.oQa.a(document, string, "SFName"));
        element.appendChild(this.oQa.a(document, ldi2.eqk(), "SFChildOrder"));
        element.appendChild(this.oQa.a(document, ldi2.getDescription(), "SFDescription"));
        if (ldi2.enk() == 0) {
            element.appendChild(this.oQa.a(document, "NULL", "SFProtectionName"));
        } else {
            lceArray = ep.aM((int)ldi2.enk());
            element.appendChild(this.oQa.a(document, (String)lceArray, "SFProtectionName"));
        }
        if (ldi2.enn()) {
            lceArray = ldi2.enl();
            Element element2 = null;
            for (int i2 = 0; i2 < lceArray.length; ++i2) {
                element2 = document.createElement("SFAttributeAlteration");
                element2.appendChild(this.oQa.a(document, lceArray[i2].getAttributeName(), "SFAttributeName"));
                element2.appendChild(this.oQa.a(document, lceArray[i2].qvU, "SFMagnitudeFraction"));
                element.appendChild(element2);
            }
        }
        return element;
    }

    private Element a(Document document, ldu ldu2) {
        Element element = document.createElement("SFListItem");
        this.a(document, ldu2, element);
        return element;
    }

    private Element a(Document document, lfl lfl2) {
        Element element = document.createElement("SFListItem");
        this.a(document, lfl2, element);
        return element;
    }

    private Element a(Document document, lgw lgw2) {
        Element element = document.createElement("SFListItem");
        this.a(document, lgw2, element);
        if (lgw2.atw() == null || lgw2.atw().Name.trim().equals("")) {
            element.appendChild(this.oQa.a(document, "NULL", "SFIconFileName"));
        } else {
            element.appendChild(this.oQa.a(document, lgw2.atw().Name, "SFIconFileName"));
        }
        if (lgw2.bBt() == null || lgw2.bBt().trim().equals("")) {
            element.appendChild(this.oQa.a(document, "NULL", "SFMeshFileName"));
        } else {
            element.appendChild(this.oQa.a(document, lgw2.bBt(), "SFMeshFileName"));
        }
        element.appendChild(this.oQa.a(document, lgw2.erJ().name(), "SFActivatableActionName"));
        element.appendChild(this.oQa.a(document, lgw2.erK(), "SFHasResourceFile"));
        element.appendChild(this.oQa.a(document, lgw2.auW(), "SFStackable"));
        element.appendChild(this.oQa.a(document, lgw2.auO().name(), "SFLayerName"));
        return element;
    }

    private Element a(Document document, lhg lhg2) {
        Element element = document.createElement("SFListItem");
        this.a(document, lhg2, element);
        element.appendChild(this.oQa.a(document, lhg2.ceu(), "SFShowInGui"));
        element.appendChild(this.oQa.a(document, lhg2.atw().Name, "SFIconFileName"));
        element.appendChild(this.oQa.a(document, lhg2.atw().kLY, "SFIconDimension"));
        element.appendChild(this.oQa.a(document, lhg2.awQ(), "SFActivatable"));
        element.appendChild(this.oQa.a(document, lhg2.erU(), "SFDeselectAfterUse"));
        if (lhg2.erZ() != null) {
            dcg[] dcgArray = lhg2.erZ();
            Element element2 = null;
            for (int i2 = 0; i2 < dcgArray.length; ++i2) {
                if (dcgArray[i2] == null) continue;
                element2 = document.createElement("SFResistanceInfo");
                element2.appendChild(this.oQa.a(document, dcgArray[i2].bjp(), "SFResistanceName"));
                element2.appendChild(this.oQa.a(document, dcgArray[i2].SkillName, "SFResistanceSkillName"));
                element.appendChild(element2);
            }
        }
        return element;
    }

    private Element a(Document document, lho lho2) {
        Element element = document.createElement("SFListItem");
        this.a(document, lho2, element);
        element.appendChild(this.oQa.a(document, lho2.bft(), "SFSubSkill"));
        return element;
    }

    private void a(Document document, ler ler2, Element element) {
        element.appendChild(this.oQa.a(document, ler2.getName(), "SFName"));
        element.appendChild(this.oQa.a(document, ler2.getType(), "SFValue"));
        element.appendChild(this.oQa.a(document, ler2.eqk(), "SFChildOrder"));
        element.appendChild(this.oQa.a(document, ler2.getDescription(), "SFDescription"));
    }
}

