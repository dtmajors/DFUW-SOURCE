/*
 * Decompiled with CFR.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class kbr {
    public static final lju oRy = kbe.oRy;
    private jta oQa = new jta();

    public void wt(String string) {
        Document document = this.oQa.dSD();
        Element element = this.oQa.a(document, "SFXML", oRy);
        document.appendChild(element);
        for (Object k2 : lea.eoj().keySet()) {
            if (!(k2 instanceof String)) continue;
            bwo bwo2 = (bwo)lea.eoj().get(k2);
            element.appendChild(this.a(document, bwo2));
        }
        jsz.a(document, new jrw(string));
    }

    private Element a(Document document, bwo bwo2) {
        Element element = document.createElement("SFMissileInfo");
        element.appendChild(this.oQa.a(document, bwo2.getName(), "SFName"));
        element.appendChild(this.oQa.a(document, bwo2.getType(), "SFType"));
        if (bwo2.zg() > 0) {
            element.appendChild(this.oQa.a(document, bwo2.Bu(), "SFSkillName"));
        } else {
            element.appendChild(this.oQa.a(document, "NULL", "SFSkillName"));
        }
        if (bwo2.az() > 0) {
            element.appendChild(this.oQa.a(document, bwo2.pa(), "SFResourceName"));
        } else {
            element.appendChild(this.oQa.a(document, "NULL", "SFResourceName"));
        }
        element.appendChild(this.oQa.a(document, bwo2.aCj(), "SFRotateObject"));
        element.appendChild(this.oQa.a(document, bwo2.aCk(), "SFUsePhysicsVelocityAutoTimer"));
        element.appendChild(this.oQa.a(document, bwo2.aCu(), "SFStopOnHittingSomething"));
        element.appendChild(this.oQa.a(document, bwo2.aCc(), "SFLineLength"));
        element.appendChild(this.oQa.a(document, bwo2.aCl(), "SFUnitAdvancePerSecond"));
        element.appendChild(this.oQa.a(document, bwo2.aCm(), "SFMass"));
        element.appendChild(this.oQa.a(document, bwo2.aCo(), "SFStartVelocity"));
        element.appendChild(this.oQa.a(document, bwo2.getMaxVelocity(), "SFMaxVelocity"));
        element.appendChild(this.oQa.a(document, bwo2.aCn(), "SFMaxDistanceTravel"));
        if (bwo2.aCp() != null) {
            bwt[] bwtArray = bwo2.aCp();
            for (int i2 = 0; i2 < bwtArray.length; ++i2) {
                element.appendChild(this.a(document, bwtArray[i2]));
            }
        }
        if (bwo2.aCq() != null) {
            element.appendChild(this.a(document, bwo2.aCq()));
        }
        return element;
    }

    private Element a(Document document, bwt bwt2) {
        Element element = document.createElement("SFMissileSpecialEffect");
        element.appendChild(this.oQa.a(document, bwt2.aCF(), "SFMissileStateName"));
        element.appendChild(this.oQa.a(document, bwt2.getSpecialEffectName(), "SFSpecialEffectName"));
        return element;
    }

    private Element a(Document document, bwu bwu2) {
        Element element = document.createElement("SFNaturalMissileInfo");
        element.setAttribute("Name", bwu2.dWX.name());
        element.setAttribute("EffectName", bwu2.CE());
        return element;
    }
}

