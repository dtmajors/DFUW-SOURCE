/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  mcs
 */
public class aju
extends ajt {
    private int[] bpY = null;

    public aju() {
        this.bog = ajb.b.boU;
    }

    public int[] CT() {
        return this.bpY;
    }

    public void f(int[] nArray) {
        this.bpY = nArray;
    }

    @Override
    protected boolean BU() {
        assert (this.bpY != null);
        this.bok = null;
        byv byv2 = this.boj.aJz().bgQ().aJD().aEP();
        int n = this.bpY.length;
        for (int i = 0; i < n; ++i) {
            boolean bl = this.b(byv2, this.bpY[i]);
            if (!bl) continue;
            return true;
        }
        this.fL(this.bpY[0]);
        return false;
    }

    @Override
    protected boolean Cv() {
        assert (this.bpY != null);
        this.bok = null;
        byv byv2 = this.boj.aJz().bgQ().aJD().aEP();
        int n = this.bpY.length;
        for (int i = 0; i < n; ++i) {
            boolean bl = this.a(byv2, this.bpY[i]);
            if (!bl) continue;
            return true;
        }
        this.fM(this.bpY[0]);
        return false;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        aju aju2 = (aju)aja2;
        int[] nArray = new int[this.bpY.length];
        System.arraycopy(this.bpY, 0, nArray, 0, this.bpY.length);
        aju2.f(nArray);
    }

    @Override
    protected void fL(int n) {
        switch (this.CS()) {
            case 5: {
                switch (n) {
                    case 6: 
                    case 7: {
                        this.bok = mcs.uAR.bD(this.fN(this.bpY[0]), this.fN(this.bpY[1]));
                        return;
                    }
                }
            }
        }
        super.fL(n);
    }

    private String fN(int n) {
        switch (n) {
            case 6: {
                return "standing";
            }
            case 7: {
                return "swimming";
            }
        }
        return "in '" + byw.nV(n) + "'";
    }
}

