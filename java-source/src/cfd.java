/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cxd
 */
public class cfd {
    private final cew dLR;
    private cxo etS = null;
    private cxo etT = null;
    private cxo etU = null;
    private les aqN = lea.enZ();

    public cfd(cew cew2) {
        this.dLR = cew2;
    }

    public cxo aNg() {
        return this.etU;
    }

    public void aNh() {
        if (this.etS == null) {
            return;
        }
        this.a(this.etS, false);
    }

    public void aNi() {
        if (this.etT == null) {
            return;
        }
        this.a(this.etT, false);
    }

    public void aNj() {
        if (this.etT != null) {
            this.a(this.etT, false);
        } else if (this.etS != null) {
            this.a(this.etS, false);
        } else {
            this.a(null, false);
        }
    }

    public void b(cxo cxo2) {
        if (cxo2 == null) {
            this.etS = null;
            this.etT = null;
            this.etU = null;
        } else {
            lhg lhg2 = (lhg)this.aqN.acv(cxo2.zg());
            if (!lhg2.ceu() && !this.aqN.isDescendant(cxo2.zg(), cxd.fIl)) {
                lfn.b(5, "SFSkillSelectionManager", "setDefaultSkill() Skill should not be shown in the gui: '" + cxo2.getName() + "'");
                return;
            }
            this.etS = cxo2;
            this.etT = null;
            this.etU = this.etS;
        }
        this.dLR.a(cbx.a.ekK);
    }

    public void c(cxo cxo2) {
        this.a(cxo2, true);
    }

    private boolean d(cxo cxo2) {
        lhg lhg2;
        assert (cxo2 != null);
        if (this.etU != null) {
            lhg2 = (lhg)this.aqN.acv(this.etU.zg());
            if (!lhg2.ceu()) {
                lfn.b(5, "SFSkillSelectionManager", "canReplaceSelectedSkill() Selected skill should not be shown in the gui: '" + this.etU.getName() + "'");
                return false;
            }
            if (!lhg2.awQ()) {
                lfn.b(5, "SFSkillSelectionManager", "canReplaceSelectedSkill() Can't override a non-activatable selected skill: '" + this.etU.getName() + "'");
                return false;
            }
        }
        if (!this.dLR.aJz().md(cxo2.getGUID())) {
            lfn.b(5, "SFSkillSelectionManager", "canReplaceSelectedSkill() SkillManager does not contain skill: " + (Object)((Object)cxo2));
            return false;
        }
        if (!cxo2.isEnabled()) {
            return false;
        }
        lhg2 = (lhg)this.aqN.acv(cxo2.zg());
        if (!lhg2.ceu()) {
            lfn.b(5, "SFSkillSelectionManager", "canReplaceSelectedSkill() Skill should not be shown in the gui: '" + cxo2.getName() + "'");
            return false;
        }
        if (this.etU != null && this.etU.isRunning()) {
            this.dLR.aJz().a(this.etU.zg(), null);
        }
        return true;
    }

    private void a(cxo cxo2, boolean bl) {
        if (cxo2 != null) {
            if (this.etU != null && this.etU.equals((Object)cxo2)) {
                return;
            }
            if (!this.d(cxo2)) {
                return;
            }
        }
        this.etT = bl ? this.etU : null;
        this.etU = cxo2;
        this.dLR.a(cbx.a.ekK);
    }
}

