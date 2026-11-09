/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cex
 *  cug
 *  cxg
 *  lcr
 */
public class dap
extends czb {
    private float gbi = 0.0f;
    private int bqK = 0;
    private int bRw = 0;
    private int gbj = 0;
    private cxi.a gbc = null;
    private boolean dtb = false;

    public float bit() {
        return this.gbi;
    }

    public void ga(float f2) {
        this.gbi = f2;
    }

    @Override
    public int DB() {
        return this.bqK;
    }

    public void fS(int n2) {
        this.bqK = n2;
    }

    public int aUR() {
        return this.bRw;
    }

    public void se(int n2) {
        this.bRw = n2;
    }

    public int biu() {
        return this.gbj;
    }

    public void zv(int n2) {
        this.gbj = n2;
    }

    public cxi.a bil() {
        return this.gbc;
    }

    public void a(cxi.a a2) {
        this.gbc = a2;
    }

    public boolean bin() {
        return this.dtb;
    }

    public void ds(boolean bl) {
        this.dtb = bl;
    }

    public final float fd(float f2) {
        assert (this.gbc != null);
        assert (f2 > 0.0f);
        return cxi.a(this.gbc, f2);
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        dap dap2 = (dap)((Object)cxc2);
        dap2.ga(this.gbi);
        dap2.fS(this.bqK);
        dap2.se(this.bRw);
        dap2.zv(this.gbj);
        dap2.a(this.gbc);
        dap2.ds(this.dtb);
    }

    protected void beA() {
        assert (this.fGi != null);
        assert (this.fGi.biq > 0);
        bwo bwo2 = (bwo)lea.eoj().get(this.fGi.biq);
        if (bwo2 == null) {
            lfn.b(5, "SFMissileModificationSkill", "doAction() No missileinfo mapped to missileinfotype " + this.fGi.biq);
            return;
        }
        if (bwo2.aCq() == null) {
            lfn.b(5, "SFMissileModificationSkill", "doAction() NaturalMissileInfo is null in missile: " + bwo2);
            return;
        }
        ddi ddi2 = null;
        ddi2 = this.yt(this.bqK);
        if (ddi2 == null) {
            lfn.b(5, "SFMissileModificationSkill", "doAction() TargetGroup is null.");
            return;
        }
        if (!ddi2.zJ(this.fGi.dhr)) {
            return;
        }
        if (bwo2.aCq().aCH()) {
            this.a(this.fGi, bwo2.aCq(), ddi2);
        } else {
            this.a(this.fGi, bwo2.aCq());
        }
    }

    private float bH(int n2, int n3) {
        assert (n2 > 0);
        assert (n3 > 0);
        return this.bn(n2, n3);
    }

    private float gb(float f2) {
        return f2 * this.gbi;
    }

    private float biv() {
        assert (this.bRw > 0);
        assert (this.fGi != null);
        if (this.bRw == 1) {
            return 0.0f;
        }
        cxc cxc2 = this.emI.ht(this.fGi.aYC);
        if (cxc2 == null) {
            lfn.b(5, "SFMissileModificationSkill", "computeForce() ContainerSkill '" + aqN.getName(this.fGi.aYC) + "' was not found.");
            assert (false);
            return 0.0f;
        }
        return cxg.d((cxc)cxc2, (int)this.gbj);
    }

    private ddi yt(int n2) {
        assert (n2 > 0);
        ddi ddi2 = cxj.yt(n2);
        if (ddi2 == null) {
            lfn.b(5, "SFMissileModificationSkill", "getTargetGroup() Could not find targetgroup " + n2);
            return null;
        }
        return ddi2;
    }

    private void a(ddc ddc2, bwu bwu2, ddi ddi2) {
        cex cex2;
        Object object;
        assert (ddc2 != null);
        assert (ddc2.akX != null);
        assert (bwu2 != null);
        assert (ddi2 != null);
        fcq fcq2 = (fcq)this.MessageDelegator.h(9224, this.GUID, this.MessageDelegator.getGUID());
        fcq2.bst = bkd.dqC;
        fcq2.aZG = this.emI.bgQ().getGUID();
        fcq2.akX = ddc2.akX;
        fcq2.aYF = fcq2.aZG;
        fcq2.bsG = this.emI.bgQ().az();
        fcq2.aYC = ddc2.aYC;
        fcq2.Magnitude = this.gb(ddc2.Magnitude);
        fcq2.eKm = ddc2.doT;
        fcq2.aSp = this.biv();
        fcq2.a(ddc2.dur);
        fcq2.iV(ddc2.dus);
        fcq2.aYH = ddc2.aYH;
        fcq2.aYG = bwu2.aYG;
        fcq2.bRD = 1;
        fcq2.aZH = ddc2.aZH;
        fcq2.Radius = this.fd(ddc2.biu);
        fcq2.Position = ddc2.aZD;
        fcq2.dta = ddi2.bqd;
        fcq2.gbe = bkd.dqy;
        fcq2.dtb = this.dtb;
        fcq2.dup = ddc2.dup;
        fcq2.iJl = amh.gM(ddc2.gdZ);
        ldv ldv2 = null;
        if (this.jk().bgQ() instanceof cex && (object = (cex2 = (cex)this.jk().bgQ()).mA()) != null) {
            ldv2 = object.jM();
        }
        fcq2.cRI = ldv2;
        if (!fcq2.akX.equals(lcr.qEk)) {
            fcq2.dsL = ddc2.dsL;
            fcq2.dhr = ddc2.dhr;
        }
        if (bwu2.Ei()) {
            fcq2.bsE = 1;
            fcq2.gpI = this.bH(this.fGi.aYC, 258);
        } else {
            fcq2.bsE = 5;
            fcq2.gpI = this.bH(this.fGi.aYC, 260);
        }
        this.MessageDelegator.H(fcq2);
        float f2 = fcq2.aSp;
        if (lew.ak(f2, 1.0E-6f)) {
            return;
        }
        if (!cug.uq((int)ddc2.dhr)) {
            return;
        }
        object = new ljq(ddc2.aZD);
        ((ljq)object).et(ddc2.aZH);
        if (this.bRw == 4) {
            ((ljq)object).y = (float)((double)((ljq)object).y + 1.2);
        }
        ((ljq)object).normalize();
        if (((ljq)object).isZero()) {
            object = new ljq(Math.random(), Math.random(), Math.random());
            ((ljq)object).normalize();
        }
        if (f2 < 0.0f) {
            ((ljq)object).esB();
            f2 = -f2;
        }
        gje gje2 = (gje)this.MessageDelegator.h(4622, this.GUID, lcr.qCt);
        gje2.Ui = ddc2.dsL;
        gje2.mx = object;
        gje2.gen = f2;
        gje2.jiZ = ddc2.aYF;
        this.MessageDelegator.F(gje2);
    }

    private void a(ddc ddc2, bwu bwu2) {
        cex cex2;
        assert (ddc2 != null);
        assert (ddc2.akX != null);
        assert (bwu2 != null);
        fcw fcw2 = (fcw)this.MessageDelegator.h(9227, this.GUID, this.MessageDelegator.getGUID());
        fcw2.bst = this.getFunctionType();
        fcw2.aZG = this.emI.bgQ().getGUID();
        fcw2.akX = ddc2.akX;
        fcw2.aYF = fcw2.aZG;
        fcw2.bsG = this.emI.bgQ().az();
        fcw2.aYC = ddc2.aYC;
        fcw2.Magnitude = this.gb(ddc2.Magnitude);
        fcw2.eKm = ddc2.doT;
        fcw2.aSp = this.biv();
        fcw2.bRw = this.bRw;
        fcw2.aYH = ddc2.aYH;
        fcw2.aYG = bwu2.aYG;
        fcw2.dup = ddc2.dup;
        fcw2.aZH = ddc2.aZH;
        fcw2.duq = ddc2.duq;
        fcw2.iJA = ayc.f((cbx)this.jk().bgQ());
        fcw2.iJB = ayc.a((cbx)this.jk().bgQ(), 13824);
        fcw2.bRD = 1;
        fcw2.a(ddc2.dur);
        fcw2.iV(ddc2.dus);
        if (this.jk().bgQ() instanceof cex && (cex2 = (cex)this.jk().bgQ()).fi() != null) {
            fcw2.iJy = cex2.fi().al(14144);
        }
        if (bwu2.Ei()) {
            fcw2.bsE = 1;
            fcw2.gpI = this.bH(this.fGi.aYC, 258);
        } else {
            fcw2.bsE = 5;
            fcw2.gpI = this.bH(this.fGi.aYC, 260);
        }
        this.MessageDelegator.H(fcw2);
        float f2 = fcw2.aSp;
        if (lew.ak(f2, 1.0E-6f)) {
            return;
        }
        if (!cug.uq((int)ddc2.dhr)) {
            return;
        }
        ljq ljq2 = new ljq(ddc2.aZD);
        ljq2.et(ddc2.aZH);
        if (this.bRw == 4) {
            ljq2.y = (float)((double)ljq2.y + 1.2);
        }
        ljq2.normalize();
        if (ljq2.isZero()) {
            ljq2 = new ljq(Math.random(), Math.random(), Math.random());
            ljq2.normalize();
        }
        if (f2 < 0.0f) {
            ljq2.esB();
            f2 = -f2;
        }
        gje gje2 = (gje)this.MessageDelegator.h(4622, this.GUID, lcr.qCt);
        gje2.Ui = ddc2.dsL;
        gje2.mx = ljq2;
        gje2.gen = f2;
        gje2.jiZ = ddc2.aYF;
        this.MessageDelegator.F(gje2);
    }
}

