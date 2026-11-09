/*
 * Decompiled with CFR.
 */
public class cza {
    private final cyu fYg;
    private ldz nx = new ldz();
    private a fZo = null;
    private les aqN = lea.enZ();

    public cza(cyu cyu2, ldz ldz2) {
        this.fYg = cyu2;
        this.nx = ldz2;
    }

    public void doTick(ldz ldz2) {
        this.nx = ldz2;
        if (this.fZo == null) {
            return;
        }
        this.fZo.nh();
        if (this.fZo.bhn()) {
            this.a(this.fZo);
            this.fZo = null;
        }
    }

    public boolean bhm() {
        return this.fZo != null;
    }

    public void zf(int n2) {
        if (this.fZo == null) {
            return;
        }
        if (this.fZo.SkillType != n2) {
            return;
        }
        if (this.fZo.fZq == null) {
            return;
        }
        if (this.fZo.fZq.gee == null) {
            return;
        }
        for (dde dde2 : this.fZo.fZq.gee) {
            if (dde2.bjR() != cxd.r.fSt && dde2.bjR() != cxd.r.fSu) continue;
            ddd ddd2 = (ddd)dde2;
            dzw dzw2 = (dzw)this.fYg.bgQ().getMessageDelegator().h(7426, this.fYg.bgQ().getGUID(), this.fYg.bgQ().KY());
            dzw2.ijH = 0;
            this.fYg.bgQ().getMessageDelegator().F(dzw2);
        }
    }

    public void a(ddf ddf2, int n2, cxd.p p2, float f2) {
        if (ddf2 == null) {
            return;
        }
        if (n2 <= 0) {
            return;
        }
        if ((double)f2 <= 0.0) {
            return;
        }
        if (this.fZo != null) {
            this.a(this.fZo);
        }
        this.fZo = new a(this, n2, p2, ddf2, f2);
    }

    public void zg(int n2) {
        if (n2 <= 0) {
            return;
        }
        if (this.fZo == null) {
            return;
        }
        if (this.fZo.SkillType != n2) {
            return;
        }
        this.a(this.fZo);
        this.fZo = null;
    }

    private void a(a a2) {
        assert (a2 != null);
        dde[] ddeArray = a2.fZq.gee;
        int n2 = ddeArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ddg ddg2;
            if (!(ddeArray[i2] instanceof ddg) || (ddg2 = (ddg)ddeArray[i2]).bjZ() == null) continue;
            this.jW(ddg2.bjZ());
            ddg2.my(null);
        }
    }

    private void a(int n2, ddg ddg2) {
        assert (n2 > 0);
        assert (ddg2 != null);
        assert (ddg2.bjY() != null);
        ldv ldv2 = this.fYg.bgS().a(n2, ddg2.bjY(), null);
        if (ldv2 == null) {
            return;
        }
        ddg2.my(ldv2);
    }

    private void jW(ldv ldv2) {
        assert (ldv2 != null);
        this.fYg.bgS().mo(ldv2);
    }

    private void b(dbo dbo2, float f2) {
        assert (dbo2 != null);
        assert (dbo2.biW() != null);
        if (this.fYg.bgQ() == null) {
            return;
        }
        if (dbo2.biW() == cxd.t.fSK) {
            this.fYg.a(dbo2, f2);
            return;
        }
        ldv ldv2 = this.fYg.b(dbo2.biW());
        if (ldv2 == null) {
            return;
        }
        dzv dzv2 = (dzv)this.fYg.bgQ().getMessageDelegator().h(7425, this.fYg.bgQ().getGUID(), ldv2);
        dzv2.dTs = dbo2.aDI();
        dzv2.aWf = f2;
        this.fYg.bgQ().getMessageDelegator().F(dzv2);
    }

    static /* synthetic */ ldz a(cza cza2) {
        return cza2.nx;
    }

    static /* synthetic */ void a(cza cza2, dbo dbo2, float f2) {
        cza2.b(dbo2, f2);
    }

    static /* synthetic */ void a(cza cza2, int n2, ddg ddg2) {
        cza2.a(n2, ddg2);
    }

    static /* synthetic */ cyu b(cza cza2) {
        return cza2.fYg;
    }
}

