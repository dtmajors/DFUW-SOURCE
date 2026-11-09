/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mcs
 */
public class ajg
extends ajf {
    private ljq ath;

    public ajg() {
        this.bog = ajb.b.boI;
    }

    @Override
    public void Ch() {
        if (this.boj.aJz().bgQ().aAG() == null) {
            lfn.b(5, "SFDistanceToInitialPositionConstraint", "startSession(): No MeshObject");
            assert (false);
            return;
        }
        this.ath = this.boj.aJz().bgQ().aAG().av();
    }

    @Override
    public void Ci() {
        this.ath = null;
    }

    @Override
    protected boolean BU() {
        if (this.ath == null) {
            return true;
        }
        if (this.boj.aJz().bgQ().aAG() == null) {
            lfn.b(5, "SFDistanceToInitialPositionConstraint", "checkConstraint(): No MeshObject");
            this.bok = mcs.uAy.bD(new Object[0]);
            return false;
        }
        ljq ljq2 = this.boj.aJz().bgQ().aAG().av();
        if (this.ath == null || ljq2 == null) {
            lfn.b(5, "SFDistanceToInitialPositionConstraint", "checkConstraint(): Missing positions");
            assert (false);
            this.bok = mcs.uAy.bD(new Object[0]);
            return false;
        }
        float f2 = Math.abs(ljq2.ez(this.ath));
        if (f2 > this.bpE) {
            this.bok = mcs.uAy.bD(new Object[0]);
            return false;
        }
        if (f2 < this.aSc) {
            this.bok = mcs.uAx.bD(new Object[0]);
            return false;
        }
        return true;
    }
}

