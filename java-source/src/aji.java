/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mcs
 */
public class aji
extends ajf {
    private boolean bpH = false;
    private boolean bpI = false;
    private ljq bpJ = null;

    public aji() {
        this.bog = ajb.b.boH;
    }

    public boolean CB() {
        return this.bpH;
    }

    public void aZ(boolean bl) {
        this.bpH = bl;
    }

    @Override
    protected boolean BU() {
        assert (this.boj.aJz().bgQ().aAG() != null) : this.boj.aJz().bgQ().getGUID();
        if (this.bpI) {
            if (this.bpJ == null) {
                return false;
            }
            ljq ljq2 = this.boj.aJz().bgQ().aAG().av();
            return this.b(this.bpJ, ljq2);
        }
        ljq ljq3 = this.CC();
        if (ljq3 == null) {
            return false;
        }
        ljq ljq4 = this.boj.aJz().bgQ().aAG().av();
        return this.b(ljq3, ljq4);
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        aji aji2 = (aji)aja2;
        aji2.aZ(this.bpH);
    }

    private boolean b(ljq ljq2, ljq ljq3) {
        assert (ljq2 != null);
        assert (ljq3 != null);
        this.bok = null;
        float f2 = Math.abs(ljq3.ez(ljq2));
        if (f2 > this.bpE) {
            this.bok = mcs.uAw.bD(new Object[0]);
            return false;
        }
        if (f2 < this.aSc) {
            this.bok = mcs.uAv.bD(new Object[0]);
            return false;
        }
        return true;
    }

    private ljq CC() {
        if (this.bpH) {
            cvs cvs2 = (cvs)((cev)this.boj.aJz().bgQ()).aLV().b(cwf.b.fEA);
            if (cvs2 == null) {
                return null;
            }
            return cvs2.CC();
        }
        cvv cvv2 = (cvv)((cev)this.boj.aJz().bgQ()).aLV().b(cwf.b.fEB);
        if (cvv2 == null) {
            return null;
        }
        return cvv2.CC();
    }

    @Override
    public void Ch() {
        this.bpI = true;
        this.bpJ = this.CC();
    }

    @Override
    public void Ci() {
        this.bpI = false;
        this.bpJ = null;
    }
}

