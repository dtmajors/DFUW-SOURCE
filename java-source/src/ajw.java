/*
 * Decompiled with CFR.
 */
public class ajw
extends ajt {
    private int bpZ = 0;

    public ajw() {
        this.bog = ajb.b.boW;
    }

    public int CU() {
        return this.bpZ;
    }

    public void fO(int n) {
        this.bpZ = n;
    }

    @Override
    protected boolean BU() {
        assert (this.bpZ > 0);
        this.bok = null;
        byv byv2 = this.boj.aJz().bgQ().aJD().aEP();
        boolean bl = this.b(byv2, this.bpZ);
        if (bl) {
            return true;
        }
        this.fL(this.bpZ);
        return false;
    }

    @Override
    protected boolean Cv() {
        assert (this.bpZ > 0);
        this.bok = null;
        byv byv2 = this.boj.aJz().bgQ().aJD().aEP();
        boolean bl = this.a(byv2, this.bpZ);
        if (bl) {
            return true;
        }
        this.fM(this.bpZ);
        return false;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        ajw ajw2 = (ajw)aja2;
        ajw2.fO(this.bpZ);
    }
}

