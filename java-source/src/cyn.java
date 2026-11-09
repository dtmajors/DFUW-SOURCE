/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
import java.util.Map;

public class cyn
extends btk {
    private final cyv fYe;
    private Map<Integer, cym> fYf = lcn.emw();
    private static les aqN = lea.enZ();

    public cyn(cyv cyv2) {
        this.fYe = cyv2;
    }

    public void a(ale ale2, float f2) {
        if (ale2 == null) {
            lfn.b(5, "SFSkillAmendmentManager", "createAmendment() Info is null.");
            return;
        }
        cym cym2 = this.fYf.get(ale2.SkillType);
        if (cym2 != null) {
            lfn.b(5, "SFSkillAmendmentManager", "createAmendment() SkillAmendment already exists for skill '" + ale2.Bu() + "'");
            lfn.b(5, "SFSkillAmendmentManager", "createAmendment() " + cym2);
            return;
        }
        cym2 = new cym(ale2.SkillType, ale2.aYG, f2);
        this.fYf.put(cym2.SkillType, cym2);
        ddy ddy2 = this.fYe.bgQ().aKa();
        if (ddy2 == null) {
            lfn.b(5, "SFSkillAmendmentManager", "createAmendment() No default weaponinfocache found.");
            return;
        }
        if (ddy2.geS != null && (ddy2.geS.aYG != cym2.aYG || ddy2.geS.Magnitude != cym2.Magnitude || ddy2.geS.SkillType != cym2.SkillType)) assert (false);
        ddy2.geS = cym2;
    }

    public void a(ale ale2) {
        if (ale2 == null) {
            lfn.b(5, "SFSkillAmendmentManager", "removeAmendment() Info is null.");
            return;
        }
        cym cym2 = this.fYf.remove(ale2.SkillType);
        if (cym2 == null) {
            lfn.b(5, "SFSkillAmendmentManager", "removeAmendment() Could not find skillamendment for skill '" + ale2.Bu() + "'");
            return;
        }
    }

    public void a(int n2, ddc ddc2, int n3) {
        if (aqN.isDescendant(n2, cxd.fKa)) {
            return;
        }
        ddy ddy2 = this.fYe.bgQ().pd(ddc2.aYH);
        if (ddy2 == null) {
            lfn.b(5, "SFSkillAmendmentManager", "triggerAmendments() No weaponinfocache found for sessionID " + ddc2.aYH);
            return;
        }
        cym cym2 = ddy2.geS;
        if (cym2 == null) {
            return;
        }
        if (!aqN.isDescendant(n2, cym2.SkillType)) {
            return;
        }
        if (n3 <= 0) {
            lfn.b(5, "SFSkillAmendmentManager", "triggerAmendments() TargetGroupType is invalid for skill '" + aqN.getName(n2) + "'");
            return;
        }
        ddi ddi2 = cxj.yt(n3);
        if (ddi2 == null) {
            lfn.b(5, "SFSkillAmendmentManager", "triggerAmendments() Could not find targetgroup " + cxj.fWR);
            return;
        }
        if (!ddi2.zJ(ddc2.dhr)) {
            return;
        }
        float f2 = cym2.Magnitude;
        fcw fcw2 = (fcw)this.MessageDelegator.h(9227, this.GUID, this.MessageDelegator.getGUID());
        fcw2.bst = bkd.dqy;
        fcw2.aZG = this.fYe.bgQ().getGUID();
        fcw2.akX = ddc2.akX;
        fcw2.aYF = fcw2.aZG;
        fcw2.bsG = this.fYe.bgQ().az();
        fcw2.aYC = ddc2.aYC;
        fcw2.Magnitude = f2;
        fcw2.eKm = ddc2.doT;
        fcw2.aSp = 0.0f;
        fcw2.a(ddc2.dur);
        fcw2.iV(ddc2.dus);
        fcw2.aYH = ddc2.aYH;
        fcw2.aYG = cym2.aYG;
        fcw2.bsE = 0;
        fcw2.bRD = 1;
        fcw2.gpI = -3.0;
        fcw2.dup = ddc2.dup;
        fcw2.aZH = ddc2.aZH;
        this.MessageDelegator.H(fcw2);
    }
}

