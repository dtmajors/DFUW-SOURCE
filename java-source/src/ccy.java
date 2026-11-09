/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 */
public abstract class ccy
extends ccx
implements bto {
    protected bec emv = null;
    protected bec emw = null;

    public ccy(cdb cdb2) {
        super(cdb2);
    }

    public void oW(int n) {
        lfn.b(5, "SFControllerManagerClient", "changeController() Nothing done in superclass of " + this.getClass().getName());
        assert (false);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.emw == null) {
            return;
        }
        if (this.emv != null && this.emv.amM() == this.emw.amM() && this.emv.amO()) {
            this.emw = null;
            return;
        }
        if (!this.emw.amV()) {
            return;
        }
        if (this.emv != null) {
            this.emv.amS();
        }
        this.emv = this.emw;
        this.emv.amR();
        this.emw = null;
    }

    @Override
    public final void initialize() {
        super.initialize();
        if (this.aeg.aJI()) {
            this.aJs();
        }
    }

    public boolean aEv() {
        return false;
    }

    public void aK(ljq ljq2) {
        if (this.aEv()) {
            return;
        }
        if (this.emv == null) {
            if (this.emw == null) {
                lfn.b(5, "SFControllerManagerClient", "notifyDirectionVectorChanged() ControllerToAttachInEngine is null for " + this.aeg);
            }
            return;
        }
        if (this.emw != null) {
            return;
        }
        this.emv.aK(ljq2);
    }

    public final void amX() {
        if (this.aEv()) {
            return;
        }
        if (this.emv == null) {
            if (this.emw == null) {
                lfn.b(5, "SFControllerManagerClient", "notifyDoubleJumpTriggered() ControllerToAttachInEngine is null for " + this.aeg);
            }
            return;
        }
        if (this.emw != null) {
            return;
        }
        this.emv.amX();
    }

    public final void a(ldg[] ldgArray) {
        if (this.aEv()) {
            return;
        }
        if (this.emv == null) {
            if (this.emw == null) {
                lfn.b(5, "SFControllerManagerClient", "notifyFlyingStatesChanged() ControllerToAttachInEngine is null for " + this.aeg);
                assert (false);
            }
            return;
        }
        if (this.emw != null) {
            return;
        }
        this.emv.a(ldgArray);
    }

    public void aL(ljq ljq2) {
        if (this.aEv()) {
            return;
        }
        if (this.emv == null) {
            if (this.emw == null) {
                lfn.b(5, "SFControllerManagerClient", "notifyImpulse() ControllerToAttachInEngine is null for " + this.aeg);
                assert (false);
            }
            return;
        }
        if (this.emw != null) {
            return;
        }
        this.emv.aL(ljq2);
    }

    public void amY() {
        if (this.aEv()) {
            return;
        }
        if (this.emv == null) {
            if (this.emw == null) {
                lfn.b(5, "SFControllerManagerClient", "notifyJumpSkillTriggered() ControllerToAttachInEngine is null for " + this.aeg);
                assert (false);
            }
            return;
        }
        if (this.emw != null) {
            return;
        }
        this.emv.amY();
    }

    public void a(boolean[] blArray, float f2, float f3) {
        if (this.aEv()) {
            return;
        }
        if (this.emv == null) {
            if (this.emw == null) {
                lfn.b(5, "SFControllerManagerClient", "notifyEvadeSkillTriggered() ControllerToAttachInEngine is null for " + this.aeg);
                assert (false);
            }
            return;
        }
        if (this.emw != null) {
            return;
        }
        this.emv.a(blArray, f2, f3);
    }

    public final void c(float f2, boolean bl) {
        if (this.aEv()) {
            return;
        }
        if (this.emv == null) {
            if (this.emw == null) {
                lfn.b(5, "SFControllerManagerClient", "notifyMaxVelocityChanged() ControllerToAttachInEngine is null for " + this.aeg);
            }
            return;
        }
        if (this.emw != null) {
            return;
        }
        this.emv.c(f2, bl);
    }

    @Override
    public final void aFm() {
        if (this.emv == null) {
            lfn.b(5, "SFControllerManagerClient", "notifyMeshObjectBeingRemoved() Controller is null.");
            return;
        }
        this.emv.amS();
    }

    public abstract void h(lgj var1);

    public void b(ljq ljq2, ljq ljq3, ljq ljq4) {
        assert (ljq2 != null);
        assert (ljq3 != null);
        if (this.emv == null) {
            lfn.b(5, "SFControllerManagerClient", "notifyRotationChanged() Controller is null.");
            return;
        }
        if (this.aEv()) {
            lfn.b(5, "SFControllerManagerClient", "notifyRotationChanged() Controlling external object.");
            return;
        }
        switch (this.emv.amM()) {
            case 1: {
                this.aeg.aJD().a(ljq2, ljq3, ljq4);
                break;
            }
            case 3: {
                this.aeg.aJD().a(ljq2, ljq3, ljq4);
                break;
            }
            case 5: {
                this.aeg.aJD().a(ljq2, ljq3, ljq4);
                break;
            }
            default: {
                lfn.b(5, "SFControllerManagerClient", "notifyRotationChanged() Rotation received for unhandled controller: '" + this.emv.amT() + "'");
                return;
            }
        }
    }

    public final void aM(ljq ljq2) {
        if (this.aEv()) {
            return;
        }
        if (this.emv == null) {
            if (this.emw == null) {
                lfn.b(5, "SFControllerManagerClient", "notifyVelocityChanged() ControllerToAttachInEngine is null for " + this.aeg);
                assert (false);
            }
            return;
        }
        if (this.emw != null) {
            return;
        }
        this.emv.aM(ljq2);
    }

    public void cG(float f2) {
        if (this.emv != null) {
            this.emv.cG(f2);
        }
    }

    @Override
    public void setScheduledForRemoval() {
        if (this.aeg.aJI() && !this.ScheduledForRemoval) {
            this.aJt();
        }
        super.setScheduledForRemoval();
    }

    protected abstract void aJs();

    protected abstract void aJt();
}

