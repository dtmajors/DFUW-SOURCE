/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cph
 *  cug
 *  cxd
 *  mcs
 */
public class akq
extends aja {
    private static les ResourceTree = lea.enW();

    public akq() {
        this.bog = ajb.b.bpg;
    }

    @Override
    protected boolean BU() {
        this.bok = null;
        if (this.boj.zg() == cxd.fHm) {
            return this.Dv();
        }
        return this.Du();
    }

    private boolean Du() {
        if (this.boj.bfF()) {
            return true;
        }
        return true;
    }

    private boolean Dv() {
        dbt dbt2 = this.boj.beo();
        if (dbt2.akX == null) {
            lfn.b(5, "SFSpecialCheckConstraint", "doUseObjectSpecialCheck() TargetObjectGUID is null.");
            return false;
        }
        if (dbt2.dsL == null) {
            cev cev2;
            byv byv2 = this.boj.aJz().bgQ().aJD().aEP();
            if (byv2.Uv() && byv2.Ow()) {
                lfn.b(5, "SFSpecialCheckConstraint", "doUseObjectSpecialCheck() Player is mounted and moving.");
                this.bok = mcs.uBt.bD(new Object[0]);
                return false;
            }
            if (byv2.Uu() && !this.boj.bfF() && (cev2 = this.Co().aJz().bgR()) != null && cev2.aLX() != null && cev2.aLX().Wm() != null) {
                cpj cpj2;
                cph cph2 = cev2.aLX().Wm();
                if (cph2 instanceof coq) {
                    coq coq2 = (coq)cph2;
                    if (coq2.Ow()) {
                        lfn.b(5, "SFSpecialCheckConstraint", "doUseObjectSpecialCheck() Player is attached on a steering wheel and moving.");
                        this.bok = mcs.uBu.bD(new Object[0]);
                        return false;
                    }
                } else if (cph2 instanceof cpj && (cpj2 = (cpj)cph2).Ow()) {
                    this.bok = mcs.uBu.bD(new Object[0]);
                    return false;
                }
            }
            return true;
        }
        if (dbt2.dhr <= 0) {
            lfn.b(5, "SFSpecialCheckConstraint", "doUseObjectSpecialCheck() TargetResourceType is invalid.");
            return false;
        }
        int n = dbt2.dhr;
        if (ResourceTree.isDescendant(n, cug.fjJ)) {
            if (!cug.uC((int)n)) {
                return true;
            }
            int n2 = cug.uN((int)n);
            brh brh2 = this.boj.aJz().bgQ().aJC().asf().aup();
            bqs bqs2 = brh2.mn(n2);
            if (bqs2 == null) {
                lfn.b(5, "SFSpecialCheckConstraint", "doUseObjectSpecialCheck() Could not find key '" + ResourceTree.getName(n2) + "'");
                this.bok = mcs.uBs.bD(n2, n);
                return false;
            }
        } else if (ResourceTree.isDescendant(n, cug.fki) || ResourceTree.isDescendant(n, cug.frT)) {
            cex cex2;
            if (this.boj.bfF() && this.boj.aJz().bgQ() instanceof cex && (cex2 = (cex)this.boj.aJz().bgQ()).mA() != null && cex2.mA().kb().vs()) {
                this.bok = mcs.uBK.bD(new Object[0]);
                return false;
            }
        } else if (ResourceTree.isDescendant(n, cug.fnV)) {
            cex cex3;
            if (this.boj.bfF() && this.boj.aJz().bgQ() instanceof cex && (cex3 = (cex)this.boj.aJz().bgQ()).mA() != null && cex3.mA().kb().vs()) {
                this.bok = mcs.uBK.bD(new Object[0]);
                return false;
            }
        } else if (ResourceTree.isDescendant(n, cug.fnA)) {
            byv byv3 = this.boj.aJz().bgQ().aJD().aEP();
            if (byv3.Ow()) {
                lfn.b(5, "SFSpecialCheckConstraint", "doUseObjectSpecialCheck() SkillOwner is moving.");
                this.bok = mcs.uAM.bD(new Object[0]);
                return false;
            }
            if (byv3.vK() != 3) {
                lfn.b(5, "SFSpecialCheckConstraint", "doUseObjectSpecialCheck() SkillOwner is not grounded.");
                this.bok = mcs.uAL.bD(new Object[0]);
                return false;
            }
            if (byv3.vO() != 3 && byv3.vO() != 6) {
                lfn.b(5, "SFSpecialCheckConstraint", "doUseObjectSpecialCheck() SkillOwner is not staninding.");
                this.bok = mcs.uAR.bD("crouching", "standing");
                return false;
            }
        }
        return true;
    }
}

