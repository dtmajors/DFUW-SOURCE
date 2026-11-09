/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  cug
 */
public class czy
extends czc {
    private int gaQ = 0;
    private bsa bqi = null;
    private boolean gaR = false;

    @Override
    protected void a(czc.a a2) {
        if (a2 == czc.a.fZG) {
            this.hw(true);
        } else if (a2 == czc.a.fZI) {
            this.hw(false);
            this.gaR = true;
        }
    }

    public void receiveMessage(dxq dxq2) {
        if (dxq2.bEz() == 34052) {
            this.a((giu)dxq2);
        } else {
            super.receiveMessage(dxq2);
        }
    }

    protected void a(giu giu2) {
        if (this.gaQ == 0) {
            if (!giu2.vA()) {
                this.beQ();
                return;
            }
            bri bri2 = (bri)this.jk().bgR().aJC().asf();
            bsa bsa2 = bri2.aup().a(cug.fnU, 1, bqm.c.dEV, true);
            if (bsa2 == null || bsa2.avX() == null || bsa2.avX().length == 0 || bsa2.awJ() == null || bsa2.awJ().length == 0) {
                this.beQ();
                return;
            }
            this.bqi = bsa2;
            this.gaQ = 1;
        } else if (this.gaQ == 1) {
            this.gaR = false;
            bri bri3 = (bri)this.jk().bgR().aJC().asf();
            if (!giu2.vA()) {
                bri3.auo().a(this.bqi.avX()[0].GUID, this.bqi.awJ()[0]);
                this.bqi = null;
                this.gaQ = 0;
                return;
            }
            fmv fmv2 = (fmv)this.MessageDelegator.h(7940, this.GUID, bri3.getGUID());
            fmv2.dIW = this.bqi.awJ()[0];
            fmv2.aCK = this.bqi.avX()[0].GUID;
            fmv2.iQA = true;
            fmv2.b(bqy.dHw);
            bri3.receiveMessage((dxq)fmv2);
            this.gaQ = 0;
            this.bqi = null;
        }
    }

    private void hw(boolean bl) {
        git git2 = (git)this.MessageDelegator.h(34051, this.GUID, this.fGh.akX);
        git2.c(this.jk().bgQ().aAG().av());
        git2.mf(bl);
        this.MessageDelegator.E(git2);
    }

    @Override
    public void bex() {
        super.bex();
    }

    public void beP() {
        super.beP();
        if (this.gaR) {
            return;
        }
        if (this.bqi != null) {
            bri bri2 = (bri)this.jk().bgR().aJC().asf();
            bri2.auo().a(this.bqi.avX()[0].GUID, this.bqi.awJ()[0]);
            this.bqi = null;
        }
        this.gaQ = 0;
    }
}

