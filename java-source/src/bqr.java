/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bri
 *  dtc
 */
import java.util.Map;

public class bqr
extends btk
implements bto {
    private static final int dFh = 16;
    private static final int dFi = 5;
    protected double bcH = 0.0;
    protected bri dFj = null;
    protected Map<brm, Double> dFk = lcn.emw();

    public bqr(bri bri2) {
        this.dFj = bri2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.bcH = this.MessageDelegator.arc().rgz + Math.random() * 5.0;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (!this.isInitialized()) {
            return;
        }
        if (this.dFj == null) {
            return;
        }
        if (ldz2.rgz - this.bcH < 5.0) {
            return;
        }
        this.auN();
        this.bcH = ldz2.rgz;
    }

    protected void auN() {
        brn brn2 = this.dFj.aun();
        Map<ldv, brs> map = brn2.AN();
        dtc dtc2 = this.MessageDelegator.bzx().bzt();
        for (brs brs2 : map.values()) {
            brm brm2 = brs2.awo();
            if (!(brm2 instanceof bqs)) continue;
            if (brm2.getGUID().ib() == this.getGUID().ib()) {
                if (dtc2.d(brm2.getGUID()) != null) continue;
                this.b(brs2.awo());
                continue;
            }
            gqq gqq2 = (gqq)this.MessageDelegator.h(11116, this.getGUID(), brm2.getGUID());
            gqq2.jM(true);
            this.MessageDelegator.E(gqq2);
        }
    }

    protected void b(brm brm2) {
        Double d2 = this.dFk.get(brm2);
        if (d2 != null) {
            float f2 = (float)(this.MessageDelegator.arc().rgz - d2);
            if (f2 > 16.0f) {
                lfn.b(5, "SFInventoryDebugChecker", "handlePhysicalObjectNotFound() " + brm2.toString() + " InventoryGUID=" + this.dFj.getGUID() + " InventoryClass=" + this.dFj.getClass().getName() + " DifTime=" + f2);
                assert (false) : "ALERT: Physical Object for Item Not Found! Tell THANASIS";
            }
        } else {
            this.dFk.put(brm2, this.MessageDelegator.arc().rgz);
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        if (kcz2.getMessageType() == 270) {
            this.b((kcs)kcz2);
        } else {
            super.receiveMiddlewareMessage(kcz2);
        }
    }

    public void b(kcs kcs2) {
        brs brs2 = this.dFj.aun().iZ(kcs2.hsQ);
        if (brs2 == null) {
            return;
        }
        this.b(brs2.awo());
    }

    @Override
    public void handleSystemMessageSendingErrorMessage(gre gre2) {
        brs brs2 = this.dFj.aun().iZ(gre2.bWU());
        if (brs2 == null) {
            return;
        }
        this.b(brs2.awo());
    }
}

