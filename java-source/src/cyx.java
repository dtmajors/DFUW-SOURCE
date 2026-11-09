/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cwx
 *  lcr
 */
public class cyx {
    private final cyu fYg;
    private int fZc = 0;
    private int fZd = 0;
    private int fZe = 0;
    private int fZf = 0;
    private boolean fZg = false;
    private int dhr = 0;
    private boolean fZh = false;
    private ldv fZi = null;
    private int fZj = 0;
    private static les aqN = lea.enZ();

    public cyx(cyu cyu2) {
        this.fYg = cyu2;
    }

    public void a(int n2, int n3, int n4, int n5, boolean bl, ldv ldv2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillRestartManager", "autoRestartCraftingSkill() SkillType is invalid.");
            return;
        }
        if (n3 <= 0) {
            lfn.b(5, "SFSkillRestartManager", "autoRestartCraftingSkill() CraftingResourceType is invalid.");
            return;
        }
        if (n4 < 0 || n4 > 100) {
            lfn.b(5, "SFSkillRestartManager", "autoRestartCraftingSkill() CraftingRestartCount is invalid.");
            if (hso.cxK().cxP() != null && hso.cxK().cxP().cyJ() != null && hso.cxK().cxP().cyJ().cHQ() != null) {
                hso.cxK().cxP().cyJ().cHQ().cQU();
            }
            return;
        }
        cwx cwx2 = this.fYg.yG(n2);
        if (cwx2 == null) {
            lfn.b(5, "SFSkillRestartManager", "autoRestartCraftingSkill() Skill '" + aqN.getName(n2) + "' was not found.");
            return;
        }
        this.fZc = n2;
        this.fZd = n3;
        this.fZe = n4;
        this.fZf = n5;
        this.fZh = cwx2.beI();
        this.fZg = bl;
        this.fZi = ldv2;
        if (hso.cxK().cxP() != null && hso.cxK().cxP().cyJ() != null && hso.cxK().cxP().cyJ().cHQ() != null) {
            hso.cxK().cxP().cyJ().cHQ().Qs(n4 + 1);
        }
    }

    public void c(int n2, int n3, int n4, int n5) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillRestartManager", "autoRestartSalvagingSkill() SkillType is invalid.");
            return;
        }
        if (n3 <= 0) {
            lfn.b(5, "SFSkillRestartManager", "autoRestartSalvagingSkill() CraftingResourceType is invalid.");
            return;
        }
        if (n4 < 0 || n4 > 100) {
            lfn.b(5, "SFSkillRestartManager", "autoRestartSalvagingSkill() CraftingRestartCount is invalid.");
            return;
        }
        if (n5 <= 0) {
            lfn.b(5, "SFSkillRestartManager", "autoRestartSalvagingSkill() targetResourceType is invalid.");
            return;
        }
        cwx cwx2 = this.fYg.yG(n2);
        if (cwx2 == null) {
            lfn.b(5, "SFSkillRestartManager", "autoRestartSalvagingSkill() Skill '" + aqN.getName(n2) + "' was not found.");
            return;
        }
        this.fZc = n2;
        this.fZd = n3;
        this.fZe = n4;
        this.dhr = n5;
        this.fZh = cwx2.beI();
        this.fZj = 20;
    }

    public void zc(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillRestartManager", "autoRestartSkill() SkillType is invalid.");
            return;
        }
        cwx cwx2 = this.fYg.yG(n2);
        if (cwx2 == null) {
            lfn.b(5, "SFSkillRestartManager", "autoRestartSkill() Skill '" + aqN.getName(n2) + "' was not found.");
            return;
        }
        this.fZc = n2;
        this.fZh = cwx2.beI();
    }

    public void doTick(ldz ldz2) {
        if (!this.fZh) {
            return;
        }
        if (this.fZj > 0) {
            --this.fZj;
            return;
        }
        gjt gjt2 = null;
        if (this.dhr > 0) {
            dxr dxr2 = this.fYg.bgQ().getMessageDelegator();
            gjt2 = (gjt)dxr2.h(4617, this.fYg.bgQ().getGUID(), this.fYg.bgQ().getGUID());
            gjt2.SkillType = this.fZc;
            gjt2.aZF = 20;
            gjt2.akX = lcr.qAC;
            gjt2.dhr = this.dhr;
            gjt2.fZd = this.fZd;
            gjt2.fZe = this.fZe;
            gjt2.fZf = this.fZf;
        } else if (this.fZd > 0) {
            dxr dxr3 = this.fYg.bgQ().getMessageDelegator();
            gjt2 = (gjt)dxr3.h(4617, this.fYg.bgQ().getGUID(), this.fYg.bgQ().getGUID());
            gjt2.SkillType = this.fZc;
            gjt2.aZF = 16;
            gjt2.fZd = this.fZd;
            gjt2.fZe = this.fZe;
            gjt2.fZf = this.fZf;
            gjt2.fZg = this.fZg;
            gjt2.gcw = this.fZi;
        }
        this.fYg.a(this.fZc, gjt2);
        this.fZc = 0;
        this.fZd = 0;
        this.fZe = 0;
        this.fZf = 0;
        this.dhr = 0;
        this.fZh = false;
    }

    public void zd(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillRestartManager", "handleSkillFinished() SkillType is invalid.");
            return;
        }
        if (this.fZc <= 0 || this.fZc != n2) {
            return;
        }
        this.fZh = true;
        if (this.fZj < 5) {
            this.fZj = 5;
        }
    }
}

