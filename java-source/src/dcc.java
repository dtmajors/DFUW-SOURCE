/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cex
 *  cim
 *  cug
 *  cwx
 *  cxd
 *  lcw
 *  mcs
 */
public class dcc
extends dbw {
    private boolean gcK = false;
    private double oV = 0.0;
    private double gcL = 0.0;

    public dcc() {
        super(cxd.j.fRz);
    }

    public void hE(boolean bl) {
        this.gcK = bl;
    }

    @Override
    public void gc(float f2) {
        this.gcL *= (double)f2;
    }

    @Override
    public void bjk() {
        double d2;
        assert (this.oV == 0.0);
        assert (this.gcL == 0.0);
        this.gcL = d2 = (double)this.boj.c(cxd.p.fSf);
        this.oV = this.boj.getMessageDelegator().arc().rgz;
    }

    @Override
    public void beQ() {
        double d2 = this.boj.getMessageDelegator().arc().rgz;
        cim cim2 = null;
        if (lcw.emW() && lcw.emX()) {
            cwx cwx2 = this.Co();
            Float f2 = lea.epE().get(cwx2.zg());
            if (f2 != null) {
                czc czc2;
                assert (cwx2 instanceof czc);
                if (cwx2 instanceof czc && (czc2 = (czc)cwx2).bhx()) {
                    cdb cdb2 = czc2.jk().bgQ();
                    assert (cdb2 instanceof cex);
                    if (cdb2 instanceof cex) {
                        cex cex2 = (cex)cdb2;
                        assert (cex2.aMK() != null);
                        if (cex2.aMK() != null) {
                            cim2 = cex2.aMK();
                        }
                    }
                }
            }
        }
        if (d2 >= this.oV + this.gcL - 0.01) {
            if (cim2 != null) {
                cim2.a((dbw)this, true);
            } else {
                this.hF(true);
            }
        } else if (cim2 != null) {
            cim2.a((dbw)this, false);
        }
        this.oV = 0.0;
        this.gcL = 0.0;
    }

    @Override
    protected void a(dbw dbw2) {
        super.a(dbw2);
        dcc dcc2 = (dcc)dbw2;
        dcc2.hE(this.gcK);
    }

    public void hF(boolean bl) {
        if (bl && !this.boj.bfg()) {
            this.boj.a(mcs.uzK.bD(new Object[0]));
            return;
        }
        ldv ldv2 = null;
        ldv2 = this.boj.bfF() ? this.boj.aJz().bgQ().getGUID() : this.boj.aJX().bhb();
        gsp gsp2 = (gsp)this.boj.getMessageDelegator().h(11048, this.boj.getGUID(), ldv2);
        gsp2.gcK = this.gcK;
        gsp2.jpN = true;
        this.boj.getMessageDelegator().F(gsp2);
        if (this.boj.zg() == cxd.fHc && this.boj.aJz().bgQ() instanceof cex && this.boj.aJz().bgQ().mA() != null) {
            fte fte2 = (fte)this.boj.getMessageDelegator().h(30209, this.boj.getGUID(), this.boj.aJz().bgQ().mA().getGUID());
            fte2.SkillType = this.boj.zg();
            fte2.ResourceType = cug.fgJ;
            this.boj.getMessageDelegator().I(fte2);
        }
    }
}

