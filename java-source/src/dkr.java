/*
 * Decompiled with CFR.
 */
public class dkr
extends dkq {
    private dko[] gEv = null;

    public dko[] bnO() {
        return this.gEv;
    }

    public void a(dko[] dkoArray) {
        this.gEv = dkoArray;
    }

    @Override
    public int bnM() {
        return this.gEv.length;
    }

    public dko An(int n) {
        if (n < 0 || n >= this.gEv.length) {
            return null;
        }
        return this.gEv[n];
    }

    @Override
    public void bnK() {
        lgl lgl2;
        Object object;
        Object object2;
        dko dko2;
        int n = this.bnM();
        if (n < 2) {
            return;
        }
        if (n == 2) {
            dko dko3 = this.gEv[0];
            dko dko4 = this.gEv[1];
            lgl lgl3 = new lgl(dko4.bnv());
            lgl3.ab(dko3.bnv());
            lgl3.nm(1.0f - dko3.bnp());
            dko3.C(lgl3);
            lgl3 = new lgl(dko4.bnv());
            lgl3.ab(dko3.bnv());
            lgl3.nm(1.0f - dko4.bnp());
            dko4.B(lgl3);
            return;
        }
        for (int i = 1; i < n - 1; ++i) {
            dko2 = this.gEv[i - 1];
            object2 = this.gEv[i];
            object = this.gEv[i + 1];
            lgl2 = new lgl(((dko)object2).bnv());
            lgl2.ab(dko2.bnv());
            lgl2.nm(1.0f + ((dkn)object2).bnr());
            lgl lgl4 = new lgl(((dko)object).bnv());
            lgl4.ab(((dko)object2).bnv());
            lgl4.nm(1.0f - ((dkn)object2).bnr());
            lgl lgl5 = new lgl(lgl4);
            lgl5.ab(lgl2);
            lgl lgl6 = new lgl(lgl5);
            lgl6.nm(0.5f + 0.5f * ((dkn)object2).bnq());
            lgl6.aa(lgl2);
            lgl6.nm(1.0f - ((dkn)object2).bnp());
            ((dko)object2).B(lgl6);
            lgl6 = new lgl(lgl5);
            lgl6.nm(0.5f - 0.5f * ((dkn)object2).bnq());
            lgl6.aa(lgl2);
            lgl6.nm(1.0f - ((dkn)object2).bnp());
            ((dko)object2).C(lgl6);
        }
        dko dko5 = this.gEv[0];
        dko2 = this.gEv[1];
        object2 = new lgl(dko2.bnv());
        ((lgl)object2).ab(dko5.bnv());
        ((lgl)object2).nm(1.5f);
        object = new lgl(dko2.bnw());
        ((lgl)object).nm(0.5f);
        ((lgl)object2).ab((lgl)object);
        ((lgl)object2).nm(1.0f - dko5.bnp());
        dko5.C((lgl)object2);
        int n2 = n - 1;
        dko2 = this.gEv[n2];
        object2 = this.gEv[n2 - 1];
        object = new lgl(dko2.bnv());
        ((lgl)object).ab(((dko)object2).bnv());
        ((lgl)object).nm(1.5f);
        lgl2 = new lgl(((dko)object2).bnx());
        lgl2.nm(0.5f);
        ((lgl)object).ab(lgl2);
        ((lgl)object).nm(1.0f - dko2.bnp());
        dko2.B((lgl)object);
    }

    public lgl gI(float f) {
        float f2;
        int n;
        int n2;
        int n3 = this.bnM();
        assert (n3 > 0);
        if (n3 == 1) {
            return this.gEv[0].bnv();
        }
        if (!this.bnC()) {
            if (f < 0.0f) {
                return this.gEv[0].bnv();
            }
            if (f > this.getDuration()) {
                return this.gEv[n3 - 1].bnv();
            }
        }
        if ((n2 = (n = this.gH(f2 = lew.z(f, 0.0f, this.getDuration()))) + 1) >= n3) {
            n2 = 0;
        }
        float f3 = this.b(n, this.gEv[n].bns(), this.gEv[n2].bnt(), f2);
        float f4 = f3 * f3;
        float f5 = f4 * f3;
        lgl lgl2 = this.gEv[n].bnv();
        lgl lgl3 = this.gEv[n2].bnv();
        lgl lgl4 = this.gEv[n].bnx();
        lgl lgl5 = this.gEv[n2].bnw();
        lgl lgl6 = null;
        lgl lgl7 = new lgl(lgl2);
        lgl7.nm(2.0f * f5 - 3.0f * f4 + 1.0f);
        lgl6 = new lgl(lgl4);
        lgl6.nm(f5 - 2.0f * f4 + f3);
        lgl7.aa(lgl6);
        lgl6 = new lgl(lgl3);
        lgl6.nm(-2.0f * f5 + 3.0f * f4);
        lgl7.aa(lgl6);
        lgl6 = new lgl(lgl5);
        lgl6.nm(f5 - f4);
        lgl7.aa(lgl6);
        lgl.a(lgl7, lgl7);
        return lgl7;
    }

    @Override
    public dkq bnL() {
        dkr dkr2 = new dkr();
        this.a(dkr2);
        return dkr2;
    }

    @Override
    protected void a(dkq dkq2) {
        assert (this.gEv != null);
        super.a(dkq2);
        dkr dkr2 = (dkr)dkq2;
        dko[] dkoArray = new dko[this.gEv.length];
        for (int i = 0; i < this.gEv.length; ++i) {
            dkoArray[i] = (dko)this.gEv[i].bnu();
        }
        dkr2.a(dkoArray);
    }
}

