/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 */
public class cvh
extends cvj {
    private static final float fzD = 1.0f;
    private bvd fzE = null;
    private ljq fzF = null;

    public cvh(cvk.a a2) {
        super(a2);
    }

    @Override
    public void doTick(ldz ldz2) {
        assert (this.fzE != null);
        if (this.fzE.isScheduledForRemoval()) {
            this.Dq();
            this.Active = false;
        } else {
            this.bcu();
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        amf amf2 = this.MessageDelegator.d(this.fzI);
        if (amf2 instanceof cex) {
            cex cex2 = (cex)amf2;
            this.fzE = cex2.aAG();
        } else if (amf2 instanceof bvd) {
            this.fzE = (bvd)this.MessageDelegator.d(this.fzI);
        }
        if (this.fzE == null) {
            lfn.b(5, "SFObjectPositionSensor", "initialize() Could not find object " + this.fzI);
            this.Dq();
            this.Active = false;
            return;
        }
        this.bcu();
    }

    private void bcu() {
        float f2;
        assert (this.fzE != null);
        ljq ljq2 = this.fzE.av();
        if (this.fzF != null && (f2 = Math.abs(this.fzF.ez(ljq2))) < 1.0f) {
            return;
        }
        this.bE(ljq2);
        this.fzF = ljq2;
    }

    private void bE(ljq ljq2) {
        assert (this.Xe != null);
        assert (this.fzI != null);
        assert (ljq2 != null);
        gho gho2 = (gho)this.MessageDelegator.h(518, this.GUID, this.Xe);
        gho2.Position = ljq2;
        this.MessageDelegator.F(gho2);
    }
}

