/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.Iterator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class kbo {
    private static final String pdF = lcw.qLb + "xml-files/gamelogicinfo/" + "cannoninfolist.xml";
    public static final lju oRy = kbe.oRy;
    private jta oQa = new jta();

    public void dVa() {
        Document document = this.oQa.dSD();
        Element element = this.oQa.a(document, "SFXML", oRy);
        document.appendChild(element);
        Iterator<Integer> iterator = lea.eok().keySet().iterator();
        bwm bwm2 = null;
        while (iterator.hasNext()) {
            Integer n = iterator.next();
            bwm2 = lea.eok().get(n);
            element.appendChild(this.a(document, bwm2));
        }
        jsz.a(document, new jrw(pdF));
    }

    private Element a(Document document, bwm bwm2) {
        assert (false) : "NOT UPDATED!";
        Element element = document.createElement("SFCannonInfo");
        String string = lea.enW().getName(bwm2.az());
        String string2 = bwm2.aBD();
        String string3 = lea.enT().getName(bwm2.aBA());
        String string4 = lea.enT().getName(bwm2.aBK());
        int n = bwm2.aBF();
        float f2 = bwm2.aBG();
        float f3 = bwm2.aBI();
        float f4 = bwm2.aBH();
        float f5 = bwm2.aBE();
        float f6 = bwm2.aBJ();
        String string5 = bwm2.aBN();
        String string6 = bwm2.aBL();
        String string7 = bwm2.aBM();
        String string8 = bwm2.aBO();
        element.appendChild(this.oQa.a(document, string, "SFResourceName"));
        element.appendChild(this.oQa.a(document, string2, "SFMissileInfoName"));
        element.appendChild(this.oQa.a(document, bwm2.aBB(), "SFMissileRadius"));
        element.appendChild(this.oQa.a(document, string3, "SFDamageName"));
        element.appendChild(this.oQa.a(document, string4, "SFDamageName2"));
        element.appendChild(this.oQa.a(document, bwm2.aou(), "SFDamage"));
        element.appendChild(this.oQa.a(document, n, "SFCannonInfoAmmo"));
        element.appendChild(this.oQa.a(document, f2, "SFCannonInfoMaxSpeed"));
        element.appendChild(this.oQa.a(document, f3, "SFCannonInfoYawTurnAngle"));
        element.appendChild(this.oQa.a(document, f4, "SFCannonInfoPitchTurnAngle"));
        element.appendChild(this.oQa.a(document, f5, "SFCannonInfoAccelerationTime"));
        element.appendChild(this.oQa.a(document, f6, "SFCannonInfoReloadTimer"));
        element.appendChild(this.oQa.a(document, string5, "SFCannonInfoSpawnEffect"));
        element.appendChild(this.oQa.a(document, string6, "SFCannonInfoDamageEffect"));
        element.appendChild(this.oQa.a(document, string7, "SFCannonInfoKillEffect"));
        element.appendChild(this.oQa.a(document, string8, "SFCannonInfoNoAmmoEffect"));
        return element;
    }
}

