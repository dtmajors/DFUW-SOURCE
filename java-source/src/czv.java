/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  cex
 */
public class czv
extends czc {
    @Override
    protected final void a(czc.a a2) {
        if (a2 != czc.a.fZI) {
            return;
        }
        if (!this.big()) {
            this.bhw();
            return;
        }
        if (this.fGe == null) {
            lfn.b(5, "SFPrayingSkill", "doPerform() No constraint found in skill '" + this.getName() + "'");
            this.bhw();
            return;
        }
        bri bri2 = (bri)this.emI.bgQ().aJC().asf();
        for (aja aja2 : this.fGe) {
            if (!(aja2 instanceof ake)) continue;
            bri2.a(((ake)aja2).Dc(), bqy.dHQ);
        }
        this.bhr();
    }

    @Override
    protected boolean b(cwx.a a2, cwx.a a3) {
        return super.b(a2, a3);
    }

    private boolean big() {
        cex cex2;
        if (this.aJz() == null) {
            lfn.b(5, "SFPrayingSkill", "checkPlayerState(): SkillManager is null for " + this);
            return false;
        }
        if (this.aJz().bgQ() == null) {
            lfn.b(5, "SFPrayingSkill", "checkPlayerState(): SkillOwner is null for " + this);
            return false;
        }
        if (!(this.aJz().bgQ() instanceof cex)) {
            lfn.b(5, "SFPrayingSkill", "checkPlayerState(): SkillOwner isn't a SFPlayerObjectServer for " + this);
        }
        if ((cex2 = (cex)this.aJz().bgQ()).aAG() == null) {
            lfn.b(5, "SFPrayingSkill", "checkPlayerState(): MeshObject is null for " + cex2);
            return false;
        }
        if (cex2.aJC() == null) {
            lfn.b(5, "SFPrayingSkill", "checkPlayerState(): InventoryManager is null for " + cex2);
            return false;
        }
        if (cex2.aJC().asf() == null) {
            lfn.b(5, "SFPrayingSkill", "checkPlayerState(): Inventory is null for " + cex2);
            return false;
        }
        return true;
    }
}

