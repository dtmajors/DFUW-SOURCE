/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cex
 *  cxd
 *  ha
 *  lcr
 *  mcs
 */
public class cxb
extends cxc {
    public final void ff(float f2) {
        assert (this.emI != null);
        assert (this.emI instanceof cyv);
        if (this.bfE() && f2 >= this.bfx()) {
            return;
        }
        if (f2 > this.bfx()) {
            f2 = this.bfx();
        }
        float f3 = this.bfw();
        this.ag(f2);
        if (((cyv)this.emI).G(f3, this.bfw())) {
            cex cex2;
            ha ha2;
            cyv cyv2;
            cdb cdb2;
            gyw gyw2 = (gyw)this.MessageDelegator.h(12048, this.GUID, lcr.qAI);
            gyw2.ija = 1;
            gyw2.SkillLevel = this.bfw();
            this.MessageDelegator.E(gyw2);
            if (cxi.D(f3, f2) && (cdb2 = (cyv2 = (cyv)this.emI).bgQ()) != null && cdb2 instanceof cex && (ha2 = (cex2 = (cex)cdb2).mA()) != null) {
                ftd ftd2 = (ftd)this.MessageDelegator.h(30210, this.getGUID(), ha2.getGUID());
                ftd2.SkillType = this.zg();
                ftd2.SkillLevel = f2;
                this.MessageDelegator.I(ftd2);
            }
        }
        if (this.emI.bgQ() instanceof cex) {
            ((cex)this.emI.bgQ()).aMy().c(this);
        }
    }

    public final void bfs() {
        assert (this.emI != null);
        assert (this.emI instanceof cyv);
        this.ff(99.6f);
    }

    public final void fg(float f2) {
        assert (this.emI != null);
        assert (this.emI instanceof cyv);
        float f3 = this.Bt() + f2;
        this.ff(f3);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11033: {
                gsl gsl2 = (gsl)dxq2;
                uk[] ukArray = gsl2.joY;
                this.c(ukArray);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    protected void a(uk uk2) {
        switch (uk2.Uo) {
            case 1: {
                float f2 = this.Bt();
                float f3 = ((ue)uk2).Pz;
                this.ag(f3);
                if (!this.Initialized || this.emI == null) break;
                this.emI.a(cbx.a.ekM);
                ((cyu)this.emI).cg(this);
                if (cxi.fl(f3)) {
                    if (cxd.xH((int)this.zg())) {
                        this.a(mcs.uyB.bD(this.Bu()));
                        break;
                    }
                    this.a(mcs.uyA.bD(this.Bu()));
                    break;
                }
                if (!cxi.D(f2, f3)) break;
                this.a(mcs.uyz.bD(this.Bu()));
                break;
            }
            default: {
                lfn.b(5, "SFPassiveSkill", "handlePropertyUpdate() Invalid PropertyID provided: " + uk2.Uo);
            }
        }
    }

    private void c(uk[] ukArray) {
        int n2 = ukArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (ukArray[i2] == null) {
                lfn.b(5, "SFPassiveSkill", "handleSubscriptionEvent() GUID=" + this.GUID + " PropertyUpdate " + i2 + " is null.");
                assert (false);
                continue;
            }
            this.a(ukArray[i2]);
        }
    }
}

