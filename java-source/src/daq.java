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
public class daq
extends czb {
    private czj gbk = null;
    protected int bqK = 0;
    protected int aYG = 0;
    protected int bsE = 0;
    protected int bRD = 0;
    protected int bRw = 0;
    private int gam = 0;
    private int gbl = 0;
    private int gbj = 0;
    private float gbi = 0.0f;
    protected boolean gbm = false;
    protected boolean gbn = true;
    protected boolean gbo = false;
    protected ldv gbp = null;

    @Override
    public int DB() {
        return this.bqK;
    }

    public void fS(int n2) {
        this.bqK = n2;
    }

    public int CD() {
        return this.aYG;
    }

    public void fJ(int n2) {
        this.aYG = n2;
    }

    public int DX() {
        return this.bsE;
    }

    public void gb(int n2) {
        this.bsE = n2;
    }

    public int aUT() {
        return this.bRD;
    }

    public void sg(int n2) {
        this.bRD = n2;
    }

    public int aUR() {
        return this.bRw;
    }

    public void se(int n2) {
        this.bRw = n2;
    }

    public int bhY() {
        return this.gam;
    }

    public void zm(int n2) {
        this.gam = n2;
    }

    public int biw() {
        return this.gbl;
    }

    public void zw(int n2) {
        this.gbl = n2;
    }

    public int biu() {
        return this.gbj;
    }

    public void zv(int n2) {
        this.gbj = n2;
    }

    public float bit() {
        return this.gbi;
    }

    public void ga(float f2) {
        this.gbi = f2;
    }

    public boolean bix() {
        return this.gbm;
    }

    public void hy(boolean bl) {
        this.gbm = bl;
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 9221: {
                this.a((fdh)dxq2);
                break;
            }
            case 9219: {
                if (this.gbk == null || !this.gbk.bev()) break;
                this.gbk.hr(true);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    protected void bey() {
        assert (!this.gbo);
        assert (this.gbp == null);
        assert (this.fGi != null);
        ddi ddi2 = this.biz();
        if (ddi2 == null) {
            lfn.b(5, "SFModificationSkill", "beginPerforming() TargetGroup is null.");
            return;
        }
        if (!ddi2.zJ(this.fGi.dhr)) {
            return;
        }
        this.gbo = true;
        this.f(this.fGi);
    }

    public final float biy() {
        assert (this.gbl > 0);
        assert (this.fGi != null);
        assert (this.fGi.aYC > 0);
        return this.bn(this.fGi.aYC, this.gbl);
    }

    protected final float gb(float f2) {
        return f2 * this.gbi;
    }

    protected final float biv() {
        assert (this.bRw > 0);
        assert (this.fGi != null);
        if (this.bRw == 1) {
            return 0.0f;
        }
        cxc cxc2 = this.emI.ht(this.fGi.aYC);
        if (cxc2 == null) {
            lfn.b(5, "SFModificationSkill", "computeForce() ContainerSkill '" + aqN.getName(this.fGi.aYC) + "' was not found.");
            assert (false);
            return 0.0f;
        }
        return cxg.d((cxc)cxc2, (int)this.gbj);
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        daq daq2 = (daq)((Object)cxc2);
        daq2.fS(this.bqK);
        daq2.fJ(this.aYG);
        daq2.gb(this.bsE);
        daq2.sg(this.bRD);
        daq2.se(this.bRw);
        daq2.zm(this.gam);
        daq2.zw(this.gbl);
        daq2.zv(this.gbj);
        daq2.ga(this.gbi);
        daq2.hy(this.gbm);
        daq2.b(this.gbk);
    }

    protected void beA() {
        assert (this.fGi != null);
        assert (!this.gbm);
        ddi ddi2 = this.biz();
        if (ddi2 == null) {
            lfn.b(5, "SFModificationSkill", "doAction() TargetGroup is null.");
            return;
        }
        if (!ddi2.zJ(this.fGi.dhr)) {
            return;
        }
        this.f(this.fGi);
    }

    protected final void beC() {
        this.gbo = false;
        if (this.gbp != null) {
            this.hR(this.gbp);
            this.gbp = null;
        }
    }

    protected final void beD() {
        this.gbo = false;
        if (this.gbp != null) {
            this.hR(this.gbp);
            this.gbp = null;
        }
    }

    protected final ddi biz() {
        assert (this.bqK > 0);
        ddi ddi2 = cxj.yt(this.bqK);
        if (ddi2 == null) {
            lfn.b(5, "SFModificationSkill", "getTargetGroup() Could not find targetgroup " + this.bqK);
            return null;
        }
        return ddi2;
    }

    private void a(fdh fdh2) {
        if (fdh2.gbp == null) {
            lfn.b(5, "SFModificationSkill", "handleFunctionObjectGUIDMessage() FunctionObjectGUID is null.");
            return;
        }
        if (this.gbo) {
            this.gbp = fdh2.gbp;
        } else {
            assert (this.gbp == null);
            this.hR(fdh2.gbp);
        }
    }

    private void f(ddc ddc2) {
        ldv ldv2 = this.emI.bgQ().getGUID();
        ldv ldv3 = ddc2.akX;
        if (this.getFunctionType() == bkd.dqA) {
            this.h(ddc2);
            return;
        }
        if (this.getFunctionType() == bkd.drg || this.getFunctionType() == bkd.drh) {
            ldv2 = ddc2.akX;
            ldv3 = this.emI.bgQ().getGUID();
        }
        lfs<Float, Float> lfs2 = this.biA();
        fcw fcw2 = (fcw)this.MessageDelegator.h(9227, this.GUID, this.MessageDelegator.getGUID());
        fcw2.dul = this.gbm ? 4 : 0;
        fcw2.bst = this.getFunctionType();
        fcw2.aZG = ldv2;
        fcw2.akX = ldv3;
        fcw2.dsL = ddc2.dsL;
        fcw2.dum = ddc2.bpU;
        fcw2.aYF = fcw2.aZG;
        fcw2.bsG = this.emI.bgQ().az();
        fcw2.aYC = ddc2.aYC;
        fcw2.Magnitude = this.gb(ddc2.Magnitude);
        fcw2.dun = lfs2 != null ? ((Float)lfs2.reX).floatValue() : 0.0f;
        fcw2.dun = lfs2 != null ? ((Float)lfs2.reY).floatValue() : 0.0f;
        fcw2.eKm = ddc2.doT;
        fcw2.aSp = this.biv();
        fcw2.bRw = this.bRw;
        fcw2.aYH = ddc2.aYH;
        fcw2.aYG = this.aYG;
        fcw2.bsE = this.bsE;
        fcw2.bRD = this.bRD;
        fcw2.gpI = this.biy();
        fcw2.dup = ddc2.dup;
        fcw2.duq = ddc2.duq;
        fcw2.iJA = ayc.f((cbx)this.jk().bgQ());
        fcw2.iJB = ayc.a((cbx)this.jk().bgQ(), 13824);
        fcw2.aZH = ddc2.aZH;
        fcw2.dhr = ddc2.dhr;
        fcw2.aZD = ddc2.aZD;
        fcw2.a(ddc2.dur);
        fcw2.iV(ddc2.dus);
        if (this.jk().bgQ() instanceof cex) {
            lfs<int[], int[]> lfs3;
            cih cih2;
            cex cex2 = (cex)this.jk().bgQ();
            if (cex2.fi() != null) {
                fcw2.iJy = cex2.fi().al(14144);
            }
            lea.epN();
            if (cid.eAW && (cih2 = (cih)cex2.aLY()) != null && (lfs3 = cih2.aOT()) != null) {
                fcw2.iJC = (int[])lfs3.reX;
                fcw2.iJD = (int[])lfs3.reY;
            }
        }
        this.MessageDelegator.H(fcw2);
        this.a(ddc2, fcw2.aSp, fcw2.cRI);
    }

    protected lfs<Float, Float> biA() {
        if (!this.gbn) {
            return null;
        }
        if (!(this.aJz().bgQ() instanceof cex)) {
            return null;
        }
        cex cex2 = (cex)this.aJz().bgQ();
        if (cex2.jm() == null) {
            return null;
        }
        ler ler2 = lea.enT().acv(this.aYG);
        if (!(ler2 instanceof ldi)) {
            return null;
        }
        ldi ldi2 = (ldi)ler2;
        lce[] lceArray = ldi2.enl();
        if (lceArray == null || lceArray.length == 0) {
            return null;
        }
        for (lce lce2 : lceArray) {
            switch (lce2.bnM) {
                case 352: 
                case 400: {
                    float f2 = cex2.jm().al(12240);
                    float f3 = cex2.jm().al(12224);
                    return new lfs<Float, Float>(Float.valueOf(f2), Float.valueOf(f3));
                }
            }
        }
        return null;
    }

    private void h(ddc ddc2) {
        fdk fdk2 = (fdk)this.MessageDelegator.h(9247, this.GUID, this.MessageDelegator.getGUID());
        fdk2.dul = 8;
        fdk2.bst = this.getFunctionType();
        fdk2.aZG = this.emI.bgQ().getGUID();
        fdk2.akX = ddc2.akX;
        fdk2.aYF = fdk2.aZG;
        fdk2.bsG = this.emI.bgQ().az();
        fdk2.aYC = ddc2.aYC;
        fdk2.SkillLevel = 1.0f;
        fdk2.iGw = this.gb(ddc2.Magnitude);
        this.MessageDelegator.F(fdk2);
    }

    private void a(ddc ddc2, float f2, ldv ldv2) {
        if (this.bRw == 1) {
            return;
        }
        if (lew.ak(f2, 1.0E-6f)) {
            return;
        }
        if (!cug.uq((int)ddc2.dhr)) {
            return;
        }
        boolean bl = this.jk().bgQ().km(ddc2.akX);
        boolean bl2 = ddc2.dup;
        boolean bl3 = this.jk().bgQ().aIq();
        if ((bl2 || bl3) && !bl) {
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

    public final void b(czj czj2) {
        this.gbk = czj2;
    }
}

