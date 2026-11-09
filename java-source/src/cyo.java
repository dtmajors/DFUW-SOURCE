/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
public class cyo {
    private final cyu fYg;
    private brf fYh;
    private gjt fYi = null;
    private ldv aCK = null;
    private ljq Position = null;
    private static les aqN = lea.enZ();

    public cyo(cyu cyu2) {
        this.fYg = cyu2;
    }

    public void doTick(ldz ldz2) {
        if (this.fYi == null) {
            return;
        }
        boolean bl = false;
        bqs bqs2 = this.fYh.avx();
        if (bqs2 == null) {
            bl = true;
        } else if (bqs2.AT()) {
            bl = true;
        } else if (!bqs2.getGUID().equals(this.aCK)) {
            lfn.b(5, "SFSkillAutoSheatheManager", "doTick() ItemGUID=" + this.aCK);
            lfn.b(5, "SFSkillAutoSheatheManager", "doTick() AttachedWeapon: " + bqs2);
            this.reset();
        }
        if (bl) {
            ljq ljq2 = this.fYg.bgQ().aAG().azb();
            if (this.Position.ez(ljq2) <= 11.0f) {
                this.fYg.e(this.fYi);
            }
            this.reset();
        }
    }

    public void d(gjt gjt2) {
        bqs bqs2;
        if (gjt2 == null) {
            lfn.b(5, "SFSkillAutoSheatheManager", "sheatheAndStartSkill() Message is null.");
            return;
        }
        if (this.fYh == null) {
            this.fYh = (brf)this.fYg.bgQ().aJC().asf();
        }
        if (this.fYi != null) {
            this.reset();
        }
        if ((bqs2 = this.fYh.avx()) == null || bqs2.AT()) {
            this.fYg.e(gjt2);
            return;
        }
        this.fYi = gjt2;
        this.aCK = bqs2.getGUID();
        this.Position = this.fYg.bgQ().aAG().av();
        this.E(bqs2);
    }

    private void reset() {
        this.fYi = null;
        this.aCK = null;
        this.Position = null;
    }

    private void E(bqs bqs2) {
        assert (bqs2 != null);
        dxr dxr2 = this.fYg.bgQ().getMessageDelegator();
        gjt gjt2 = (gjt)dxr2.h(4617, this.fYg.bgQ().getGUID(), this.fYg.bgQ().getGUID());
        gjt2.SkillType = cxd.fHg;
        this.fYg.e(gjt2);
    }
}

