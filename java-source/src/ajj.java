/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  mcs
 */
public class ajj
extends aja {
    public ajj() {
        this.bog = ajb.b.boP;
    }

    @Override
    protected boolean BU() {
        this.bok = null;
        boolean bl = false;
        if (this.boj.aJz().bgQ() instanceof cdb) {
            cdb cdb2 = this.boj.aJz().bgQ();
            if (cdb2.aAG() != null && cdb2.aAG().azb() != null) {
                boolean bl2 = bl = cdb2.aAG().azb().y <= -1000.0f;
            }
            if (!bl) {
                this.bok = mcs.uAB.bD(new Object[0]);
                return false;
            }
        }
        return true;
    }

    @Override
    protected boolean Cv() {
        this.bok = null;
        boolean bl = false;
        if (this.boj.aJz().bgQ() instanceof cdb) {
            cdb cdb2 = this.boj.aJz().bgQ();
            if (cdb2.aAG() != null && cdb2.aAG().azb() != null) {
                boolean bl2 = bl = cdb2.aAG().azb().y <= -1000.0f;
            }
            if (bl) {
                this.bok = mcs.uAA.bD(new Object[0]);
                return false;
            }
        }
        return true;
    }
}

