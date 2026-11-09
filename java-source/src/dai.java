/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cex
 *  lcr
 */
public class dai
extends dag {
    private int gbg = 0;
    private int dtZ = -1;

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        dai dai2 = (dai)((Object)cxc2);
        dai2.zs(this.gbg);
        dai2.zt(this.dtZ);
    }

    private void e(ddc ddc2) {
        ddi ddi2;
        assert (ddc2.akX != null);
        lfs<Float, Float> lfs2 = this.biA();
        fcq fcq2 = (fcq)this.MessageDelegator.h(9224, this.GUID, this.MessageDelegator.getGUID());
        fcq2.dul = this.gbm ? 4 : fcq2.dul;
        fcq2.bst = this.getFunctionType();
        fcq2.iKb = this.gbg;
        fcq2.dtZ = this.dtZ;
        fcq2.aZG = this.emI.bgQ().getGUID();
        fcq2.akX = ddc2.akX;
        fcq2.aYF = fcq2.aZG;
        fcq2.bsG = this.emI.bgQ().az();
        fcq2.aYC = ddc2.aYC;
        fcq2.Magnitude = this.gb(ddc2.Magnitude);
        fcq2.dun = lfs2 != null ? ((Float)lfs2.reX).floatValue() : 0.0f;
        fcq2.dun = lfs2 != null ? ((Float)lfs2.reY).floatValue() : 0.0f;
        fcq2.eKm = ddc2.doT;
        fcq2.aSp = this.biv();
        fcq2.bRw = this.bRw;
        fcq2.aYH = ddc2.aYH;
        fcq2.aYG = this.aYG;
        fcq2.bsE = this.bsE;
        fcq2.bRD = this.bRD;
        fcq2.gpI = this.biy();
        fcq2.dup = ddc2.dup;
        fcq2.aZH = ddc2.aZH;
        fcq2.Radius = this.fd(ddc2.biu);
        fcq2.Position = ddc2.aZD;
        fcq2.iJl = amh.gM(ddc2.gdZ);
        fcq2.duq = ddc2.duq;
        fcq2.iJA = ayc.f((cbx)this.jk().bgQ());
        fcq2.iJB = ayc.a((cbx)this.jk().bgQ(), 13824);
        fcq2.dsD = this.aJz().bgQ().KY();
        fcq2.a(ddc2.dur);
        fcq2.iV(ddc2.dus);
        if (this.jk().bgQ() instanceof cex) {
            lfs<int[], int[]> lfs3;
            cih cih2;
            ddi2 = (cex)this.jk().bgQ();
            if (ddi2.fi() != null) {
                fcq2.iJy = ddi2.fi().al(14144);
            }
            lea.epN();
            if (cid.eAW && (cih2 = (cih)ddi2.aLY()) != null && (lfs3 = cih2.aOT()) != null) {
                fcq2.iJC = (int[])lfs3.reX;
                fcq2.iJD = (int[])lfs3.reY;
            }
        }
        if ((ddi2 = this.biz()) == null) {
            lfn.b(5, "SFDelayedAreaModificationSkill", "sendFunctionAreaEffectMessage() TargetGroup is null.");
            return;
        }
        fcq2.dta = ddi2.bqd;
        if (this.bim()) {
            fcq2.dsZ = this.aJz().bgQ().aAG().axa();
        }
        fcq2.gbe = this.bio();
        fcq2.dtb = this.bin();
        if (!fcq2.akX.equals(lcr.qEk)) {
            fcq2.dsL = ddc2.dsL;
            fcq2.dhr = ddc2.dhr;
        }
        if (fcq2.dtb && ddc2.gdY != null) {
            assert (fcq2.dsL != null);
            fcq2.gdY = ddc2.gdY;
        }
        this.MessageDelegator.H(fcq2);
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

