/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cew
 *  cwx
 *  cyt
 *  lcr
 */
public class cyu
extends cyt {
    private ldv fYN = null;
    private cyo fYO = null;
    private cyx fYP = null;
    private cza fYQ = null;
    protected double fYR = 0.0;

    public cyu(cdb cdb2) {
        super(cdb2);
    }

    public ldv bhb() {
        return this.fYN;
    }

    public void mj(ldv ldv2) {
        this.fYN = ldv2;
    }

    public cyx bhc() {
        return this.fYP;
    }

    public cza bhd() {
        return this.fYQ;
    }

    public boolean hR(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillManagerClient", "canSkillBeStarted() SkillType is invalid.");
            return false;
        }
        cwx cwx2 = this.yG(n2);
        if (cwx2 == null) {
            return false;
        }
        if (!cwx2.isEnabled()) {
            return false;
        }
        if (this.yL(n2)) {
            return false;
        }
        return cwx2.beI();
    }

    public boolean hS(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillManagerClient", "canSkillBeStopped() SkillType is invalid.");
            return false;
        }
        cwx cwx2 = this.yG(n2);
        if (cwx2 == null) {
            lfn.b(5, "SFSkillManagerClient", "canSkillBeStopped() Skill '" + aqN.getName(n2) + "' was not found.");
            return false;
        }
        if (!cwx2.bev()) {
            return false;
        }
        return cwx2.beJ();
    }

    public boolean hT(int n2) {
        if (n2 <= 0) {
            lfn.b(5, "SFSkillManagerClient", "canSkillBeUpdated() SkillType is invalid.");
            return false;
        }
        cwx cwx2 = this.yG(n2);
        if (cwx2 == null) {
            lfn.b(5, "SFSkillManagerClient", "canSkillBeUpdated() Skill '" + aqN.getName(n2) + "' was not found.");
            return false;
        }
        if (!cwx2.isEnabled()) {
            return false;
        }
        return cwx2.beK();
    }

    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.fYO != null) {
            this.fYO.doTick(ldz2);
        }
        if (this.fYP != null) {
            this.fYP.doTick(ldz2);
        }
        if (this.fYQ != null) {
            this.fYQ.doTick(ldz2);
        }
    }

    public int aso() {
        return this.fYN.ib();
    }

    public boolean isServerObject() {
        return false;
    }

    public final ldv b(cxd.t t2) {
        if (t2 == null) {
            lfn.b(5, "SFSkillManagerClient", "getTargetObjectGUID() TargetObjectType is null.");
            return null;
        }
        switch (t2) {
            case fSK: {
                lfn.b(5, "SFSkillManagerClient", "getTargetObjectGUID() TargetObject '" + t2.name() + "' should not be called this way.");
                return null;
            }
        }
        return super.b(t2);
    }

    public final lgl yT(int n2) {
        assert (this.fYB != null);
        assert (this.fYB.aAG() != null);
        lgl lgl2 = bum.jN(this.fYB.getGUID());
        assert (lgl2 != null);
        return lgl2;
    }

    public final void a(giy giy2) {
        if (giy2.aZF <= 0) {
            lfn.b(5, "SFSkillManagerClient", "handleSkillConfigMessage() ConfigType is invalid.");
            return;
        }
        switch (giy2.aZF) {
            case 10: {
                if (giy2.SkillType < 0) {
                    return;
                }
                if (giy2.jiU < 0.0f) {
                    return;
                }
                cxo cxo2 = (cxo)((Object)this.ht(giy2.SkillType));
                if (cxo2 == null) {
                    return;
                }
                ddf ddf2 = cxo2.bfX();
                if (ddf2 == null) {
                    return;
                }
                ddh ddh2 = ddf2.bjX();
                if (ddh2 == null) {
                    return;
                }
                ddh2.ge(giy2.jiU);
                break;
            }
            default: {
                super.a(giy2);
            }
        }
    }

    public final void a(gjr gjr2) {
        if (gjr2.SkillType <= 0) {
            return;
        }
        if (this.fYP == null) {
            return;
        }
        if (gjr2.dhr > 0) {
            this.fYP.c(gjr2.SkillType, gjr2.fZd, gjr2.fZe, gjr2.dhr);
        } else if (gjr2.fZd > 0) {
            this.fYP.a(gjr2.SkillType, gjr2.fZd, gjr2.fZe, gjr2.fZf, gjr2.fZg, gjr2.fZi);
        } else {
            this.fYP.zc(gjr2.SkillType);
        }
    }

    public final void a(gjs gjs2) {
        if (this.fYO == null) {
            return;
        }
        if (gjs2.fYi == null) {
            return;
        }
        this.fYO.d(gjs2.fYi);
    }

    public final boolean hU(int n2) {
        return this.yN(n2);
    }

    public void cg(cxc cxc2) {
    }

    public final void bgW() {
        super.bgW();
        if (this.fYB.aJI()) {
            if (!this.fYB.Ux()) {
                this.fYO = new cyo(this);
            }
            this.fYP = new cyx(this);
            this.fYQ = new cza(this, this.fYB.getMessageDelegator().arc());
            this.bhe();
        }
    }

    public final void yX(int n2) {
        assert (this.fYB != null);
        assert (this.fYB.isInitialized());
        this.a(cbx.a.ekM);
    }

    public final void yY(int n2) {
        assert (this.fYB != null);
        assert (this.fYB.isInitialized());
        this.a(cbx.a.ekM);
    }

    public void a(dbo dbo2, float f2) {
        assert (this.fYB != null);
        assert (this.fYB.isInitialized());
        assert (dbo2.biW() == cxd.t.fSK);
        if (this.fYB instanceof cew) {
            this.fYB.aJD().a(dbo2, f2);
        }
    }

    public void a(dbo dbo2) {
        assert (this.fYB != null);
        assert (this.fYB.isInitialized());
        assert (dbo2.biW() == cxd.t.fSK);
        if (this.fYB instanceof cew) {
            this.fYB.aJD().a(dbo2);
        }
    }

    protected final ldv bgZ() {
        return lcr.acL;
    }

    protected void a(cyg cyg2) {
        assert (cyg2 != null);
        if (cyg2 instanceof cyh) assert (((cyh)cyg2).fYc != cxd.b.fQi);
        buk buk2 = this.fYB.aJO();
        if (buk2 == null || !this.fYB.isInitialized()) {
            return;
        }
        for (cxc cxc2 : this.jl().values()) {
            lhg lhg2;
            if (cxc2 instanceof cxb || !(lhg2 = (lhg)aqN.acv(cxc2.zg())).ceu() || !cyg2.yF(cxc2.zg())) continue;
            cyg cyg3 = this.a(cyg2, cxc2.zg());
            if (cyg3 == null) {
                buk2.b(cxd.k.fRJ, cxc2.getGUID(), cyg2.aXq, cyg2.Up);
                continue;
            }
            if (cyg3.gu() || !(cyg2.Up > cyg3.Up)) continue;
            buk2.a(cxd.k.fRJ, cxc2.getGUID(), cyg3.Up);
            buk2.b(cxd.k.fRJ, cxc2.getGUID(), cyg2.aXq, cyg2.Up);
        }
    }

    protected void b(cyg cyg2) {
        assert (cyg2 != null);
        buk buk2 = this.fYB.aJO();
        if (buk2 == null) {
            return;
        }
        for (cxc cxc2 : this.jl().values()) {
            lhg lhg2;
            if (cxc2 instanceof cxb || !(lhg2 = (lhg)aqN.acv(cxc2.zg())).ceu() || !cyg2.yF(cxc2.zg())) continue;
            cyg cyg3 = this.a(cyg2, cxc2.zg());
            if (cyg3 == null) {
                buk2.a(cxd.k.fRJ, cxc2.getGUID(), cyg2.Up);
                continue;
            }
            if (cyg3.Up == cyg2.Up) continue;
            buk2.a(cxd.k.fRJ, cxc2.getGUID(), cyg2.Up);
            buk2.b(cxd.k.fRJ, cxc2.getGUID(), cyg3.aXq, cyg3.Up);
        }
    }

    protected final void cf(cxc cxc2) {
        this.cg(cxc2);
        this.b(cxc2, true);
    }

    private void b(cxc cxc2, boolean bl) {
        assert (cxc2 != null);
        assert (this.fYB.isInitialized());
        if (this.fYA.isEmpty()) {
            return;
        }
        if (cxc2 instanceof cxb) {
            return;
        }
        lhg lhg2 = (lhg)aqN.acv(cxc2.zg());
        if (!lhg2.ceu()) {
            return;
        }
        buk buk2 = this.fYB.aJO();
        assert (buk2 != null);
        cyg cyg2 = null;
        int n2 = this.fYA.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            cyg cyg3 = (cyg)this.fYA.get(i2);
            if (!cyg3.yF(cxc2.zg()) || cyg2 != null && !(cyg2.Up < cyg3.Up)) continue;
            cyg2 = cyg3;
        }
        if (cyg2 == null) {
            return;
        }
        if (bl) {
            buk2.a(cxd.k.fRJ, cxc2.getGUID(), cyg2.aXq, cyg2.Up);
        } else {
            buk2.b(cxd.k.fRJ, cxc2.getGUID(), cyg2.aXq, cyg2.Up);
        }
    }

    private void bhe() {
        for (cxc cxc2 : this.jl().values()) {
            if (cxc2 instanceof cxb) continue;
            this.b(cxc2, false);
        }
    }

    private void bhf() {
        bun bun2 = (bun)this.fYB.getMessageDelegator().bzx().bzt().d(lcr.qBP);
        bun2.ayu();
    }

    public final void a(gjn gjn2) {
        if (gjn2.SkillType <= 0) {
            return;
        }
        if (gjn2.aYH <= 0) {
            return;
        }
        cwx cwx2 = this.yG(gjn2.SkillType);
        if (cwx2 == null) {
            return;
        }
        if (!cwx2.bev()) {
            return;
        }
        if (cwx2.Ec() != gjn2.aYH) {
            return;
        }
        if (this.bhd() != null) {
            this.bhd().zf(cwx2.zg());
        }
        cwx2.beM();
    }

    public void bH(double d2) {
        this.fYR = d2;
    }

    public double bhg() {
        return this.fYR;
    }
}

