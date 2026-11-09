/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cex
 */
public class daj
extends daq {
    private int gbg = 0;
    private int dtZ = -1;

    @Override
    protected void bey() {
        assert (!this.gbo);
        assert (this.gbp == null);
        assert (this.fGi != null);
        ddi ddi2 = this.biz();
        if (ddi2 == null) {
            lfn.b(5, "SFDelayedModificationSkill", "beginPerforming() TargetGroup is null.");
            return;
        }
        if (!ddi2.zJ(this.fGi.dhr)) {
            return;
        }
        this.gbo = true;
        this.f(this.fGi);
    }

    @Override
    protected void beA() {
        assert (this.fGi != null);
        assert (!this.gbm);
        ddi ddi2 = this.biz();
        if (ddi2 == null) {
            lfn.b(5, "SFDelayedModificationSkill", "doAction() TargetGroup is null.");
            return;
        }
        if (!ddi2.zJ(this.fGi.dhr)) {
            return;
        }
        this.f(this.fGi);
    }

    private void f(ddc ddc2) {
        ldv ldv2 = this.emI.bgQ().getGUID();
        ldv ldv3 = ddc2.akX;
        lfs<Float, Float> lfs2 = this.biA();
        fcw fcw2 = (fcw)this.MessageDelegator.h(9227, this.GUID, this.MessageDelegator.getGUID());
        fcw2.dul = this.gbm ? 4 : 0;
        fcw2.bst = this.getFunctionType();
        fcw2.iKb = this.gbg;
        fcw2.dtZ = this.dtZ;
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
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        daj daj2 = (daj)((Object)cxc2);
        daj2.zs(this.gbg);
        daj2.zt(this.dtZ);
    }

    public int biq() {
        return this.gbg;
    }

    public void zs(int n2) {
        this.gbg = n2;
    }

    public int bir() {
        return this.dtZ;
    }

    public void zt(int n2) {
        this.dtZ = n2;
    }
}

