/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cex
 *  cug
 *  ep
 */
public class bla {
    public void a(cex cex2, cbx cbx2, float f2, int n) {
        assert (cex2 != null);
        assert (cbx2 != null);
        assert (f2 > 0.0f);
        boolean bl2 = cug.we((int)n);
        csv csv2 = bl2 ? cwy.fGG : cwy.fGE;
        et et2 = cbx2.fi().ah(csv2.bnM);
        if (et2 != null) {
            this.a(et2, cbx2, csv2, f2);
            et et3 = cbx2.fi().ah(1232);
            float f3 = cer.a(cex2, cbx2.az(), et3.fN(), f2);
            if (f3 > 0.0f) {
                et2.n(f3);
            }
            et3.o(et2.fN());
        }
        csv2 = bl2 ? cwy.fGI : cwy.brh;
        et2 = cbx2.fi().ah(csv2.bnM);
        if (et2 != null) {
            this.a(et2, cbx2, csv2, f2);
        }
        this.a(cbx2, bl2 ? cwy.fGH : cwy.brg, f2);
        this.b(cbx2, bl2 ? cwy.fGJ : cwy.fGF, f2);
        cie.a(cex2, cbx2);
    }

    public void a(cbx cbx2, cbx cbx3, float f2) {
        assert (cbx2 != null);
        assert (cbx3 != null);
        assert (f2 >= 0.0f);
        if (cbx2.fi().ad(1232)) {
            this.a(cbx2, cbx3, 1232);
            this.a(cbx2, cbx3, 1234);
            this.a(cbx2, cbx3, 1236);
        }
        csv csv2 = alc.brh;
        et et2 = cbx3.fi().ah(csv2.bnM);
        if (et2 != null) {
            this.a(et2, cbx3, csv2, f2);
        }
        this.a(cbx3, alc.brg, f2);
    }

    private float a(float f2, float f3, csv csv2) {
        float f4 = (csv2.fdV - csv2.fdU) * f3 / 100.0f + csv2.fdU;
        float f5 = (csv2.fdX - csv2.fdW) * f3 / 100.0f + csv2.fdW;
        float f6 = f4 - f5;
        float f7 = lgp.erA().acI(1) * f6 + f5;
        return f2 + f7;
    }

    private float b(float f2, float f3, csv csv2) {
        float f4 = (csv2.fdV - csv2.fdU) * f3 / 100.0f + csv2.fdU + 1.0f;
        float f5 = (csv2.fdX - csv2.fdW) * f3 / 100.0f + csv2.fdW + 1.0f;
        float f6 = f4 - f5;
        float f7 = lgp.erA().acI(1) * f6 + f5;
        return f2 * f7;
    }

    private void a(cbx cbx2, csv csv2, float f2) {
        assert (cbx2 != null);
        assert (csv2 != null);
        assert (f2 >= 0.0f);
        for (ej ej2 : cbx2.fi().getAttributeMap().values()) {
            if (!ep.aY((int)ej2.getType())) continue;
            this.a((et)ej2, cbx2, csv2, f2);
        }
    }

    private void b(cbx cbx2, csv csv2, float f2) {
        assert (cbx2 != null);
        assert (csv2 != null);
        assert (f2 >= 0.0f);
        for (ej ej2 : cbx2.fi().getAttributeMap().values()) {
            if (!ep.aZ((int)ej2.getType())) continue;
            this.a((et)ej2, cbx2, csv2, f2);
        }
    }

    private void a(et et2, cbx cbx2, csv csv2, float f2) {
        assert (et2 != null);
        assert (cbx2 != null);
        assert (csv2 != null);
        assert (f2 >= 0.0f);
        float f3 = et2.fN();
        float f4 = 0.0f;
        f4 = csv2.fdT ? this.a(f3, f2, csv2) : this.b(f3, f2, csv2);
        if (ep.aR((int)et2.getType())) {
            float f5 = cbx2.fi().al(ep.k((int)et2.getType(), (int)2));
            if (f4 > f5) {
                return;
            }
            float f6 = cbx2.fi().al(ep.k((int)et2.getType(), (int)1));
            if (f4 < f6) {
                return;
            }
        }
        et2.o(f4);
    }

    private void a(cbx cbx2, cbx cbx3, int n) {
        et et2 = cbx2.fi().ah(n);
        et et3 = cbx3.fi().ah(n);
        float f2 = et2.fN();
        float f3 = et3.fN();
        float f4 = (f2 + f3) / 2.0f;
        et3.o(f4);
    }
}

