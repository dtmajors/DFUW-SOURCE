/*
 * Decompiled with CFR.
 */
public class dks
extends dkq {
    private dkp[] gEw = null;

    public dkp[] bnP() {
        return this.gEw;
    }

    public void a(dkp[] dkpArray) {
        this.gEw = dkpArray;
    }

    @Override
    public int bnM() {
        return this.gEw.length;
    }

    public final ljq gJ(float f) {
        float f2;
        int n;
        int n2;
        int n3 = this.bnM();
        assert (n3 > 0);
        if (n3 == 1) {
            return this.gEw[0].bny();
        }
        if (!this.bnC()) {
            if (f < 0.0f) {
                return this.gEw[0].bny();
            }
            if (f > this.getDuration()) {
                return this.gEw[n3 - 1].bny();
            }
        }
        if ((n2 = (n = this.gH(f2 = lew.z(f, 0.0f, this.getDuration()))) + 1) >= n3) {
            n2 = 0;
        }
        float f3 = this.b(n, this.gEw[n].bns(), this.gEw[n2].bnt(), f2);
        float f4 = f3 * f3;
        float f5 = f4 * f3;
        ljq ljq2 = this.gEw[n].bny();
        ljq ljq3 = this.gEw[n2].bny();
        ljq ljq4 = this.gEw[n].bnA();
        ljq ljq5 = this.gEw[n2].bnz();
        ljq ljq6 = null;
        ljq ljq7 = new ljq(ljq2);
        ljq7.nm(2.0f * f5 - 3.0f * f4 + 1.0f);
        ljq6 = new ljq(ljq4);
        ljq6.nm(f5 - 2.0f * f4 + f3);
        ljq7.es(ljq6);
        ljq6 = new ljq(ljq3);
        ljq6.nm(-2.0f * f5 + 3.0f * f4);
        ljq7.es(ljq6);
        ljq6 = new ljq(ljq5);
        ljq6.nm(f5 - f4);
        ljq7.es(ljq6);
        return ljq7;
    }

    @Override
    public final void bnK() {
        ljq ljq2;
        Object object;
        Object object2;
        dkp dkp2;
        int n = this.bnM();
        if (n < 2) {
            return;
        }
        if (n == 2) {
            dkp dkp3 = this.gEw[0];
            dkp dkp4 = this.gEw[1];
            ljq ljq3 = new ljq(dkp4.bny());
            ljq3.et(dkp3.bny());
            ljq3.nm(1.0f - dkp3.bnp());
            dkp3.bV(ljq3);
            ljq3 = new ljq(dkp4.bny());
            ljq3.et(dkp3.bny());
            ljq3.nm(1.0f - dkp4.bnp());
            dkp4.bU(ljq3);
            return;
        }
        for (int i = 1; i < n - 1; ++i) {
            dkp2 = this.gEw[i - 1];
            object2 = this.gEw[i];
            object = this.gEw[i + 1];
            ljq2 = new ljq(((dkp)object2).bny());
            ljq2.et(dkp2.bny());
            ljq2.nm(1.0f + ((dkn)object2).bnr());
            ljq ljq4 = new ljq(((dkp)object).bny());
            ljq4.et(((dkp)object2).bny());
            ljq4.nm(1.0f - ((dkn)object2).bnr());
            ljq ljq5 = new ljq(ljq4);
            ljq5.et(ljq2);
            ljq ljq6 = new ljq(ljq5);
            ljq6.nm(0.5f + 0.5f * ((dkn)object2).bnq());
            ljq6.es(ljq2);
            ljq6.nm(1.0f - ((dkn)object2).bnp());
            ((dkp)object2).bU(ljq6);
            ljq6 = new ljq(ljq5);
            ljq6.nm(0.5f - 0.5f * ((dkn)object2).bnq());
            ljq6.es(ljq2);
            ljq6.nm(1.0f - ((dkn)object2).bnp());
            ((dkp)object2).bV(ljq6);
        }
        dkp dkp5 = this.gEw[0];
        dkp2 = this.gEw[1];
        object2 = new ljq(dkp2.bny());
        ((ljq)object2).et(dkp5.bny());
        ((ljq)object2).nm(1.5f);
        object = new ljq(dkp2.bnz());
        ((ljq)object).nm(0.5f);
        ((ljq)object2).et((ljq)object);
        ((ljq)object2).nm(1.0f - dkp5.bnp());
        dkp5.bV((ljq)object2);
        int n2 = n - 1;
        dkp2 = this.gEw[n2];
        object2 = this.gEw[n2 - 1];
        object = new ljq(dkp2.bny());
        ((ljq)object).et(((dkp)object2).bny());
        ((ljq)object).nm(1.5f);
        ljq2 = new ljq(((dkp)object2).bnA());
        ljq2.nm(0.5f);
        ((ljq)object).et(ljq2);
        ((ljq)object).nm(1.0f - dkp2.bnp());
        dkp2.bU((ljq)object);
    }

    @Override
    public dkq bnL() {
        dks dks2 = new dks();
        this.a(dks2);
        return dks2;
    }

    @Override
    protected void a(dkq dkq2) {
        assert (this.gEw != null);
        super.a(dkq2);
        dks dks2 = (dks)dkq2;
        dkp[] dkpArray = new dkp[this.gEw.length];
        for (int i = 0; i < this.gEw.length; ++i) {
            dkpArray[i] = (dkp)this.gEw[i].bnu();
        }
        dks2.a(dkpArray);
    }
}

