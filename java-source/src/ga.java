/*
 * Decompiled with CFR.
 */
public class ga
extends fz
implements bto {
    public final ldv Ui;
    private ldv Uj = null;
    private bvd Uk = null;

    public ga(ldv ldv2, float f2) {
        super(f2);
        this.Ui = ldv2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.Uk = (bvd)this.MessageDelegator.bzx().bzt().d(this.Ui);
        this.Active = true;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.Uk == null) {
            this.Active = false;
            return;
        }
        if (this.Uj == null && this.Uk.isReadyToRun()) {
            this.Active = false;
            this.Uj = this.Uk.axa();
            this.an(this.Uj);
        }
    }
}

