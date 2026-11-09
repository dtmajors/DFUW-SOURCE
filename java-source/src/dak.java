/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cex
 */
public class dak
extends czb {
    protected void beA() {
        assert (!this.fGZ);
        assert (this.fGh.gcx);
        assert (this.fGh.dph != null);
        assert (this.fGh.dpi != null);
        byv byv2 = this.emI.bgQ().aJD().aEP();
        if (!byv2.Uu()) {
            lfn.b(5, "SFFireGunSkill", "doAction() SkillOwner is not attached.");
            return;
        }
        ceh ceh2 = (ceh)this.emI.bgQ().aJM();
        if (!(ceh2.aKU() || ceh2.aKV() || ceh2.aKY())) {
            lfn.b(5, "SFFireGunSkill", "doAction() SkillOwner is not attached to a gun or a guntank.");
            return;
        }
        ldv ldv2 = ceh2.aKS();
        if (ldv2 == null) {
            lfn.b(5, "SFFireGunSkill", "doAction() ExternalObjectGUID is null.");
            return;
        }
        this.a(ldv2, this.fGh.dph, this.fGh.dpi, this.eTM);
    }

    private void a(ldv ldv2, ljq ljq2, lgl lgl2, float f2) {
        lfs<int[], int[]> lfs2;
        cex cex2;
        cih cih2;
        assert (ldv2 != null);
        assert (ljq2 != null);
        assert (lgl2 != null);
        fga fga2 = (fga)this.MessageDelegator.h(8452, this.GUID, ldv2);
        fga2.Position = ljq2;
        fga2.Rotation = lgl2;
        fga2.eTM = f2;
        fga2.SkillType = this.zg();
        fga2.fZQ = ayc.a((cbx)this.emI.bgQ(), 14032);
        lea.epN();
        if (cid.eAW && this.jk().bgQ() instanceof cex && (cih2 = (cih)(cex2 = (cex)this.jk().bgQ()).aLY()) != null && (lfs2 = cih2.aOT()) != null) {
            fga2.iJC = (int[])lfs2.reX;
            fga2.iJD = (int[])lfs2.reY;
        }
        this.MessageDelegator.F(fga2);
    }

    @Override
    protected void a(cwx.a a2, cwx.a a3) {
        if (a3.equals((Object)cwx.a.fGs) || a3.equals((Object)cwx.a.fGr)) {
            ceh ceh2 = (ceh)this.emI.bgQ().aJM();
            if (!(ceh2.aKU() || ceh2.aKV() || ceh2.aKY())) {
                lfn.b(5, "SFFireGunSkill", "doAction() SkillOwner is not attached to a gun or a guntank.");
                return;
            }
            ldv ldv2 = ceh2.aKS();
            if (ldv2 == null) {
                lfn.b(5, "SFFireGunSkill", "doAction() ExternalObjectGUID is null.");
                return;
            }
            if ((a2.equals((Object)cwx.a.fGs) || a2.equals((Object)cwx.a.fGu)) && a3.equals((Object)cwx.a.fGr)) {
                this.a(ldv2, this.fGh.dph, this.fGh.dpi, -3.0f);
            } else if (a3.equals((Object)cwx.a.fGs)) {
                this.a(ldv2, this.fGh.dph, this.fGh.dpi, -2.0f);
            }
        }
        super.a(a2, a3);
    }
}

