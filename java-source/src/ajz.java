/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  mcs
 */
public class ajz
extends aja {
    public ajz() {
        this.bog = ajb.b.boQ;
    }

    @Override
    protected boolean BU() {
        ljq ljq2;
        lmf lmf2;
        cdb cdb2;
        this.bok = null;
        if (this.boj.aJz().bgQ() instanceof cdb && (cdb2 = this.boj.aJz().bgQ()).aAG() != null && (lmf2 = lea.eg(ljq2 = cdb2.aAG().azb())) != null && lmf2 == lmf.rEz) {
            this.bok = mcs.uAS.bD(this.boj.Bu());
            return false;
        }
        return true;
    }

    @Override
    protected boolean Cv() {
        ljq ljq2;
        lmf lmf2;
        cdb cdb2;
        this.bok = null;
        if (this.boj.aJz().bgQ() instanceof cdb && (cdb2 = this.boj.aJz().bgQ()).aAG() != null && ((lmf2 = lea.eg(ljq2 = cdb2.aAG().azb())) == null || lmf2 != lmf.rEz)) {
            this.bok = mcs.uAT.bD(this.boj.Bu());
            return false;
        }
        return true;
    }
}

