/*
 * Decompiled with CFR.
 */
public abstract class ip
extends btk
implements bto {
    private double agr = 0.02;
    private boolean ags = false;
    private double agt = 0.0;
    private double agu = 0.0;
    protected int agv = 1;

    @Override
    public void doTick(ldz ldz2) {
        if (ldz2.rgz >= this.agt) {
            this.nh();
            if (this.ags) {
                this.agu = ldz2.rgz;
                this.agt = this.agu + this.agr;
            } else {
                this.agu = this.agt;
                double d2 = Math.floor((ldz2.rgz - this.agu) / this.agr);
                this.agt += (d2 + 1.0) * this.agr;
            }
            ++this.agv;
            this.nn();
        }
    }

    protected abstract void nh();

    protected void a(gsn gsn2) {
        if ((gsn2.bWY() & 1) > 0) {
            double d2 = gsn2.bWZ();
            if (d2 <= 0.0 || d2 > 1.0) {
                lfn.b(5, "SFSubscriptionManager", "handleSubscriptionManagerConfigureMessage() NewTimeSliceLength is invalid.");
                return;
            }
            this.agr = gsn2.bWZ();
            lfn.b(2, "SFSubscriptionManager", "handleSubscriptionManagerConfigureMessage() TimeSliceLength was set to " + this.agr);
        }
        if ((gsn2.bWY() & 2) > 0) {
            this.ags = gsn2.bXa();
            lfn.b(2, "SFSubscriptionManager", "handleSubscriptionManagerConfigureMessage() AdditiveUpdateCheck was set to " + this.ags);
        }
    }

    protected void nn() {
    }
}

