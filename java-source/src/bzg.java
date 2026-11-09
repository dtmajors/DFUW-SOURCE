/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bvf
 *  cew
 */
public class bzg
extends bzf {
    private static final boolean dtQ = false;
    private cea[] edG = null;
    private boolean edH = false;
    private bzc dYn = null;
    private bzc dYo = null;
    private float bxG = 0.0f;
    private float edI = 0.5f;
    private static final float edJ = 0.2f;
    private int edK = 0;

    public bzg(cew cew2) {
        super((cev)cew2);
        this.ecW = new byu(this);
    }

    public final cea[] aFj() {
        return this.edG;
    }

    public final void a(cea[] ceaArray) {
        this.edG = ceaArray;
    }

    @Override
    public final bzc aDe() {
        return this.dYn;
    }

    public final void c(bzc bzc2) {
        this.dYn = bzc2;
        this.dYo = bzc2;
    }

    public final void s(int n, boolean bl) {
        if (this.edG == null || this.edG.length == 0) {
            return;
        }
        switch (n) {
            case 1: {
                if (this.edG[0] == null) break;
                this.edG[0].fJ(bl);
                break;
            }
            case 2: {
                if (this.edG[1] == null) break;
                this.edG[1].fK(bl);
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public void aDZ() {
        assert (!this.isServerObject());
        float f2 = this.aEO();
        if (this.bxG == f2) {
            return;
        }
        this.bxG = f2;
        boolean bl = this.ecS.aEP().aEB();
        this.bnF.aJN().c(this.bxG, bl);
        if (this.edH && this.edG != null) {
            int n = this.edG.length;
            for (int i2 = 0; i2 < n; ++i2) {
                if (!this.edG[i2].aKE()) continue;
                this.edG[i2].dN(this.bxG);
            }
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (this.edG != null && this.edH) {
            int n = this.edG.length;
            for (int i2 = 0; i2 < n; ++i2) {
                this.MessageDelegator.hd(this.edG[i2].getGUID());
            }
        }
    }

    @Override
    public void b(byx byx2) {
        super.b(byx2);
        if (this.edG != null) {
            cea[] ceaArray = new cea[this.edG.length];
            int n = this.edG.length;
            for (int i2 = 0; i2 < n; ++i2) {
                ceaArray[i2] = this.edG[i2].aKA();
            }
            ((bzg)byx2).a(ceaArray);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.ecW.aEa()) {
            assert (this.bnF.aAG() != null);
            assert (this.ecW != null);
            this.ecW.aEh();
        }
        if (this.edG != null) {
            if (this.edH) {
                int n = this.edG.length;
                for (int i2 = 0; i2 < n; ++i2) {
                    if (!this.edG[i2].aKE()) continue;
                    this.edG[i2].doTick(ldz2);
                }
            } else if (this.bnF.aJC() != null && this.bnF.aJC().asf() != null && this.bnF.aAG() != null) {
                this.edH = true;
                int n = this.edG.length;
                for (int i3 = 0; i3 < n; ++i3) {
                    this.edG[i3].setGUID(this.MessageDelegator.bzv());
                    this.edG[i3].a(this);
                    this.MessageDelegator.a(this.edG[i3]);
                }
            }
        }
        this.aFn();
    }

    public cei aFk() {
        if (this.edG != null) {
            int n = this.edG.length;
            for (int i2 = 0; i2 < n; ++i2) {
                if (!(this.edG[i2] instanceof cei)) continue;
                return (cei)this.edG[i2];
            }
        }
        return null;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dYn = new bzc();
    }

    public final void a(eq eq2) {
        if (this.edH && this.edG != null) {
            int n = this.edG.length;
            for (int i2 = 0; i2 < n; ++i2) {
                if (!this.edG[i2].aKE()) continue;
                this.edG[i2].a(eq2);
            }
        }
    }

    public final void c(et et2, float f2) {
        if (this.edH && this.edG != null) {
            int n = this.edG.length;
            for (int i2 = 0; i2 < n; ++i2) {
                if (!this.edG[i2].aKE()) continue;
                this.edG[i2].c(et2, f2);
            }
        }
    }

    public final void b(ew ew2, int n) {
        if (this.edH && this.edG != null) {
            int n2 = this.edG.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!this.edG[i2].aKE()) continue;
                this.edG[i2].b(ew2, n);
            }
        }
    }

    public final void aFl() {
        if (this.edH && this.edG != null) {
            int n = this.edG.length;
            for (int i2 = 0; i2 < n; ++i2) {
                if (!this.edG[i2].aKE()) continue;
                this.edG[i2].aFl();
            }
        }
    }

    public final void P(ldv ldv2, int n) {
        if (this.edH && this.edG != null) {
            int n2 = this.edG.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!this.edG[i2].aKE()) continue;
                this.edG[i2].P(ldv2, n);
            }
        }
    }

    @Override
    public final void amY() {
        super.amY();
        if (this.aEP().Uv() && !this.isServerObject()) {
            cpe cpe2 = (cpe)this.bnF.aLX().Wm();
            cpe2.aWW().amY();
        }
    }

    @Override
    public final void aEi() {
        super.aEi();
    }

    public void aFm() {
        assert (!this.isServerObject());
        assert (this.ecW != null);
        if (this.ecW.aEa()) {
            this.ecW.resetProperties();
        }
    }

    public void dF(float f2) {
        assert (!this.isServerObject());
        assert (this.ecW != null);
        this.ecW.dF(f2);
    }

    @Override
    public void a(byv byv2, boolean bl) {
        super.a(byv2, bl);
        this.bnF.aJz().a(cbx.a.ekM);
        if (this.aEP().Uv() && this.dYn.aFc()) {
            this.oe(0);
        }
    }

    @Override
    public final void b(bzc bzc2) {
        assert (bzc2 != null);
        if (this.aEP().Uu()) {
            if (this.dYn.edn != this.dYo.edn && !this.dYo.edn) {
                this.b(byw.c.ebY);
            }
            return;
        }
        if (this.dYn.equals(bzc2)) {
            return;
        }
        boolean bl = this.dYo == null;
        this.dYo = this.dYn;
        this.dYn = bzc2;
        if (this.dYo.edp != this.dYn.edp) {
            switch (this.dYn.edp) {
                case 0: {
                    this.b(byw.c.ecx);
                    break;
                }
                case 1: {
                    this.b(byw.c.ecy);
                    break;
                }
                case 2: {
                    this.b(byw.c.ecz);
                    break;
                }
                case 3: {
                    this.b(byw.c.ecA);
                    break;
                }
                default: {
                    lfn.b(5, "SFPlayerStateManagerClient", "notifyPhysicsStateChanged() Invalid watercontactstate provided: " + this.dYn.edp);
                    assert (false);
                    return;
                }
            }
        }
        boolean bl2 = this.dYn.aFc();
        boolean bl3 = this.dYo.aFc();
        if (bl3 != bl2 || bl) {
            this.oe(this.dYn.edq);
        }
        if (this.dYn.edl != this.dYo.edl) {
            if (this.dYn.edl) {
                this.b(byw.c.ebZ);
            } else {
                this.b(byw.c.eca);
            }
        }
        if (this.dYn.edm != this.dYo.edm) {
            if (this.dYn.edm) {
                this.b(byw.c.ebV);
            } else {
                this.b(byw.c.ebW);
            }
        }
        if (this.dYn.edn != this.dYo.edn && !this.dYo.edn) {
            this.b(byw.c.ebY);
        }
    }

    public final void fo(boolean bl) {
        assert (this.bnF != null);
        if (this.edH && this.edG != null) {
            int n = this.edG.length;
            for (int i2 = 0; i2 < n; ++i2) {
                if (!this.edG[i2].aKE()) continue;
                this.edG[i2].fo(bl);
            }
        }
    }

    @Override
    public void zO() {
        super.zO();
        this.dYn = new bzc();
    }

    public final void dJ(float f2) {
        ldv ldv2 = this.bnF.aJX().bhb();
        if (ldv2 == null) {
            return;
        }
        efm efm2 = (efm)this.MessageDelegator.h(12821, this.GUID, ldv2);
        efm2.ioI = (byte)(lew.A(f2, 0.0f, 1.0f) * 255.0f - 128.0f);
        this.MessageDelegator.F(efm2);
    }

    @Override
    public final void d(boolean[] blArray) {
        assert (this.ecU != null);
        assert (blArray != null);
        super.d(blArray);
        if (this.aEP().Uv() && !this.isServerObject()) {
            cpe cpe2 = (cpe)this.bnF.aLX().Wm();
            cpe2.aWW().d(blArray);
        }
    }

    @Override
    public final void a(dbo dbo2, float f2) {
        assert (this.bnF != null);
        if (this.edH && this.edG != null) {
            int n = this.edG.length;
            for (int i2 = 0; i2 < n; ++i2) {
                if (!this.edG[i2].aKE()) continue;
                this.edG[i2].a(dbo2, f2);
            }
        }
    }

    @Override
    public final void a(dbo dbo2) {
        assert (this.bnF != null);
        if (this.edH && this.edG != null) {
            int n = this.edG.length;
            for (int i2 = 0; i2 < n; ++i2) {
                if (!this.edG[i2].aKE()) continue;
                this.edG[i2].a(dbo2);
            }
        }
    }

    private void aFn() {
        bvf bvf2 = (bvf)this.bnF.aAG();
        if (bvf2 == null) {
            return;
        }
        if (!bvf2.azB()) {
            return;
        }
        if (this.edK == this.MessageDelegator.arc().enO()) {
            return;
        }
        this.edK = this.MessageDelegator.arc().enO();
        if (bvf2.azC() == this.edI) {
            return;
        }
        if (Math.abs(this.edI - bvf2.azC()) < 0.2f) {
            return;
        }
        this.edI = bvf2.azC();
        if (((cew)this.bnF).aJI()) {
            this.dJ(this.edI);
        }
    }

    @Override
    protected void a(byz byz2) {
        assert (this.ecW != null);
        if (!this.aEP().isAlive()) {
            return;
        }
        this.ecW.ay(byz2.ecZ, byz2.eda);
        this.h(byz2.bpX, byz2.ecZ, byz2.eda);
    }

    @Override
    protected void a(byw.d d2, byz byz2) {
        switch (d2) {
            case ecI: {
                buk buk2;
                super.a(d2, byz2);
                if (byz2.ecZ == 1 && (buk2 = ((cew)this.bnF).aJO()).ayh() != null) {
                    buk2.ayk();
                }
                if (!this.edH || this.edG == null) break;
                int n = this.edG.length;
                for (int i2 = 0; i2 < n; ++i2) {
                    if (!this.edG[i2].aKE()) continue;
                    this.edG[i2].oU(byz2.eda);
                }
                break;
            }
            case ecK: {
                this.h(byz2.bpX, byz2.ecZ, byz2.eda);
                break;
            }
            case ecM: {
                if (!this.edH || this.edG == null) break;
                this.h(byz2);
                break;
            }
            default: {
                super.a(d2, byz2);
            }
        }
    }

    @Override
    protected void b(int n, String string, String string2) {
    }

    private void h(byz byz2) {
        switch (byz2.bpX) {
            case 4: {
                int n = this.edG.length;
                for (int i2 = 0; i2 < n; ++i2) {
                    if (!this.edG[i2].aKE()) continue;
                    this.edG[i2].pk(byz2.eda);
                }
                break;
            }
            case 5: {
                int n = this.edG.length;
                for (int i3 = 0; i3 < n; ++i3) {
                    if (!this.edG[i3].aKE()) continue;
                    this.edG[i3].oV(byz2.eda);
                }
                break;
            }
            default: {
                return;
            }
        }
    }
}

