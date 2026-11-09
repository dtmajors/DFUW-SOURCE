/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mcs
 */
public class ajh
extends ajf
implements dbk {
    private boolean bpF = false;
    private ljq bpG = null;

    public ajh() {
        this.bog = ajb.b.boG;
    }

    @Override
    protected boolean BU() {
        assert (this.boj.aJz().bgQ().aAG() != null);
        this.bok = null;
        if (!this.bpF) {
            return true;
        }
        assert (this.bpG != null);
        ljq ljq2 = this.boj.aJz().bgQ().aAG().av();
        float f2 = Math.abs(ljq2.ez(this.bpG));
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

    @Override
    public void Ch() {
    }

    @Override
    public void Ci() {
        this.bpF = false;
        this.bpG = null;
    }

    @Override
    public int zg() {
        return this.boj.zg();
    }

    @Override
    public void a(ddu ddu2) {
        assert (ddu2 != null);
        this.bpF = true;
        this.bpG = ddu2.dph;
    }

    @Override
    public void CA() {
        this.bpF = true;
        this.bpG = null;
    }
}

