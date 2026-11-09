/*
 * Decompiled with CFR.
 */
public class ala
extends akh {
    public ala() {
        this.bog = ajb.b.bpm;
    }

    @Override
    public void Dr() {
        if (this.bqx != null) {
            this.bqv = false;
            this.Dp();
        }
    }

    @Override
    public final void Ch() {
        assert (this.bqu != null);
        assert (this.boj.bfF());
        assert (!this.bqw);
        assert (this.bqv);
        this.bqx = this.boj.beo().akX;
        if (this.bqx == null) {
            lfn.b(5, "SFUnspawnableSensorConstraint", "startSession() InputParams.TargetObjectGUID is null for skill '" + this.boj.getName() + "'");
            this.bqv = false;
            return;
        }
        this.boj.jk().bhj().a(this, this.bqx);
        this.bqw = true;
    }
}

