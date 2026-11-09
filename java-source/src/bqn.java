/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  brg
 *  cug
 *  cwx
 *  cxd
 */
public abstract class bqn {
    protected final bqv dEY;
    protected dxr MessageDelegator = null;
    protected double dEZ = 0.0;
    protected double dFa = 0.0;
    protected flz dFb = null;
    protected flz dFc = null;

    public bqn(bqv bqv2) {
        this.dEY = bqv2;
    }

    public final boolean h(bqs bqs2) {
        if (this.dEY.auk().Ux()) {
            return true;
        }
        if (this.dFb != null) {
            return false;
        }
        if (this.dFc != null) {
            return false;
        }
        byv byv2 = ((cev)((Object)this.dEY.auk())).aLU().aEP();
        if (!byv2.isAlive()) {
            return false;
        }
        double d2 = this.MessageDelegator.arc().rgz;
        return d2 >= this.dEZ;
    }

    public final boolean i(bqs bqs2) {
        if (this.dEY.auk().Ux()) {
            return true;
        }
        if (this.dFb != null) {
            return false;
        }
        if (this.dFc != null) {
            return false;
        }
        byv byv2 = ((cev)((Object)this.dEY.auk())).aLU().aEP();
        if (!byv2.isAlive()) {
            return false;
        }
        double d2 = this.MessageDelegator.arc().rgz;
        return d2 >= this.dFa;
    }

    public void cleanUp() {
    }

    public final void doTick(ldz ldz2) {
        if (this.dEZ > 0.0 && ldz2.rgz > this.dEZ) {
            this.auJ();
        }
        if (this.dFa > 0.0 && ldz2.rgz > this.dFa) {
            this.auL();
        }
    }

    public final void a(flz flz2, bqs bqs2) {
        assert (flz2 != null);
        assert (bqs2 != null);
        if (this.dFb != null) {
            lfn.b(5, "SFInventoryConstraintManager", "handleDelayedAttachMessage() DelayedMessage is already set.");
            return;
        }
        this.dFb = flz2;
        this.dEZ = this.MessageDelegator.arc().rgz + this.j(bqs2);
        this.auI();
    }

    public final void b(flz flz2, bqs bqs2) {
        assert (flz2 != null);
        assert (bqs2 != null);
        if (this.dFc != null) {
            lfn.b(5, "SFInventoryConstraintManager", "handleDelayedDetachMessage() DelayedMessage is already set.");
            return;
        }
        this.dFc = flz2;
        this.dFa = this.MessageDelegator.arc().rgz + this.k(bqs2);
        this.auK();
    }

    public void initialize() {
        this.MessageDelegator = this.dEY.getMessageDelegator();
    }

    public final void iS(ldv ldv2) {
        if (this.dFb != null && this.dFb.iPE.tW(ldv2)) {
            this.auM();
            return;
        }
        if (this.dFc != null && this.dFc.iPE.tW(ldv2)) {
            this.auM();
            return;
        }
    }

    public final void d(byv byv2) {
        if (this.dFb == null && this.dFc == null) {
            return;
        }
    }

    public final void b(cwx cwx2) {
        if (this.dFb == null && this.dFc == null) {
            return;
        }
        if (cxd.xA((int)cwx2.zg())) {
            return;
        }
        this.auM();
    }

    protected abstract void auI();

    protected void auJ() {
        this.dFb = null;
        this.dEZ = 0.0;
    }

    protected abstract void auK();

    protected void auL() {
        this.dFc = null;
        this.dFa = 0.0;
    }

    protected void auM() {
        this.dFb = null;
        this.dEZ = 0.0;
        this.dFc = null;
        this.dFa = 0.0;
    }

    private double j(bqs bqs2) {
        boolean bl2 = this.l(bqs2);
        double d2 = 1.0;
        if (!bl2) {
            d2 = 1.0;
        }
        if (lea.enW().isDescendant(bqs2.az(), cug.fjl)) {
            if (bqs2.auO() != null) {
                switch (bqs2.auO()) {
                    case efM: {
                        return 7.5 * d2;
                    }
                    case efY: {
                        return 10.0 * d2;
                    }
                }
                return 3.5 * d2;
            }
            return 3.5 * d2;
        }
        if (lea.enW().isDescendant(bqs2.az(), cug.fjr)) {
            return 20.0 * d2;
        }
        if (lea.enW().isDescendant(bqs2.az(), cug.fjN)) {
            if (bqs2.auO() != null) {
                switch (bqs2.auO()) {
                    case efM: {
                        return 7.5 * d2;
                    }
                    case efY: {
                        return 10.0 * d2;
                    }
                }
                return 3.0 * d2;
            }
            return 3.0 * d2;
        }
        return 5.0 * d2;
    }

    private double k(bqs bqs2) {
        if (lea.enW().isDescendant(bqs2.az(), cug.fjl)) {
            if (bqs2.auO() != null) {
                switch (bqs2.auO()) {
                    case efM: {
                        return 7.5;
                    }
                    case efY: {
                        return 10.0;
                    }
                }
                return 3.5;
            }
            return 3.5;
        }
        if (lea.enW().isDescendant(bqs2.az(), cug.fjr)) {
            return 20.0;
        }
        if (lea.enW().isDescendant(bqs2.az(), cug.fjN)) {
            return 3.0;
        }
        return 2.5;
    }

    private boolean l(bqs bqs2) {
        if (this.dEY.isServerObject()) {
            bqs bqs3 = ((brg)this.dEY.asf()).c(bqs2.auO());
            return bqs3 != null;
        }
        bqs bqs4 = ((brf)this.dEY.asf()).c(bqs2.auO());
        return bqs4 != null;
    }
}

