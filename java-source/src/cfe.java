/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cxd
 */
import java.util.Map;

public class cfe {
    private final cew dLR;
    private Map<cdy, a> etV = lcn.emw();
    private les aqN = lea.enZ();

    public cfe(cew cew2) {
        this.dLR = cew2;
        this.etV.put(cdy.eod, new a(this));
        this.etV.put(cdy.eoe, new a(this));
        this.etV.put(cdy.eof, new a(this));
    }

    public cxo a(cdy cdy2) {
        a a2 = this.etV.get((Object)cdy2);
        return a2.etU;
    }

    public void b(cdy cdy2) {
        a a2 = this.etV.get((Object)cdy2);
        if (a2.etS == null) {
            return;
        }
        this.a(a2.etS, false, null);
    }

    public void c(cdy cdy2) {
        a a2 = this.etV.get((Object)cdy2);
        this.a(a2.etT, false, cdy2);
    }

    public void aNk() {
        for (Map.Entry<cdy, a> entry : this.etV.entrySet()) {
            cdy cdy2 = entry.getKey();
            a a2 = entry.getValue();
            if (a2.etT != null) {
                this.a(a2.etT, false, cdy2);
                continue;
            }
            if (a2.etS != null) {
                this.a(a2.etS, false, cdy2);
                continue;
            }
            this.a(null, false, cdy2);
        }
    }

    public void d(cdy cdy2) {
        a a2 = this.etV.get((Object)cdy2);
        if (a2.etT != null) {
            this.a(a2.etT, false, cdy2);
        } else if (a2.etS != null) {
            this.a(a2.etS, false, cdy2);
        } else {
            this.a(null, false, cdy2);
        }
    }

    public void a(cxo cxo2, cdy cdy2) {
        this.a(cxo2, true, cdy2);
    }

    private void a(cxo cxo2, boolean bl, cdy cdy2) {
        a a2 = this.etV.get((Object)cdy2);
        if (a2 == null) {
            lfn.b(5, "SFSkillSelectionManagerNew", "setSelectedSkill() There is no Skill TriggerDefined For ActionTrigger : " + (Object)((Object)cdy2));
            lfn.b(5, "SFSkillSelectionManagerNew", "setSelectedSkill() SelectedSkillMap.size()                            : " + this.etV.size());
            return;
        }
        if (cxo2 != null) {
            if (a2.etU != null && a2.etU.equals((Object)cxo2)) {
                return;
            }
            if (!this.b(cxo2, cdy2)) {
                return;
            }
        }
        a2.etT = bl ? a2.etU : null;
        a2.etU = cxo2;
        this.dLR.a(cbx.a.ekK);
    }

    private boolean b(cxo cxo2, cdy cdy2) {
        lhg lhg2;
        assert (cxo2 != null);
        a a2 = this.etV.get((Object)cdy2);
        if (a2 == null) {
            return false;
        }
        if (a2.etU != null) {
            lhg2 = (lhg)this.aqN.acv(a2.etU.zg());
            if (!lhg2.ceu()) {
                lfn.b(5, "SFSkillSelectionManagerNew", "canReplaceSelectedSkill() Selected skill should not be shown in the gui: '" + a2.etU.getName() + "'");
                return false;
            }
            if (!lhg2.awQ()) {
                lfn.b(5, "SFSkillSelectionManagerNew", "canReplaceSelectedSkill() Can't override a non-activatable selected skill: '" + a2.etU.getName() + "'");
                return false;
            }
        }
        if (!this.dLR.aJz().md(cxo2.getGUID())) {
            lfn.b(5, "SFSkillSelectionManagerNew", "canReplaceSelectedSkill() SkillManager does not contain skill: " + (Object)((Object)cxo2));
            return false;
        }
        if (!cxo2.isEnabled()) {
            return false;
        }
        lhg2 = (lhg)this.aqN.acv(cxo2.zg());
        if (!lhg2.ceu()) {
            lfn.b(5, "SFSkillSelectionManagerNew", "canReplaceSelectedSkill() Skill should not be shown in the gui: '" + cxo2.getName() + "'");
            return false;
        }
        if (a2.etU != null && a2.etU.isRunning()) {
            this.dLR.aJz().a(a2.etU.zg(), null);
        }
        return true;
    }

    public void c(cxo cxo2, cdy cdy2) {
        a a2 = this.etV.get((Object)cdy2);
        if (cxo2 == null) {
            a2.etS = null;
            a2.etT = null;
            a2.etU = null;
        } else {
            lhg lhg2 = (lhg)this.aqN.acv(cxo2.zg());
            if (!lhg2.ceu() && !this.aqN.isDescendant(cxo2.zg(), cxd.fIl)) {
                lfn.b(5, "SFSkillSelectionManagerNew", "setDefaultSkill() Skill should not be shown in the gui: '" + cxo2.getName() + "'");
                return;
            }
            a2.etS = cxo2;
            a2.etT = null;
            a2.etU = a2.etS;
        }
        this.dLR.a(cbx.a.ekK);
    }
}

