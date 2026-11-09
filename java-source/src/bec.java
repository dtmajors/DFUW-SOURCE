/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 */
public abstract class bec
extends btk {
    private final int dcr;
    private final cdb aeg;
    private boolean dcs = false;
    private boolean dct = false;
    private boolean dcu = false;
    protected boolean bGn = false;
    protected boolean dcv = true;
    private ldv dcw = null;
    private ldv dcx = null;
    private ldv dcy = null;
    protected ljq Qe = null;
    protected float bzb = 0.0f;

    public bec(int n, cdb cdb2) {
        assert (n > 0);
        assert (cdb2 != null);
        this.dcr = n;
        this.aeg = cdb2;
    }

    public final int amM() {
        return this.dcr;
    }

    public final cdb amN() {
        return this.aeg;
    }

    public final boolean amO() {
        return this.dcs;
    }

    public final boolean amP() {
        return this.dct;
    }

    public final boolean HT() {
        return this.bGn;
    }

    public final void he(ldv ldv2) {
        this.dcx = ldv2;
    }

    public final ldv amQ() {
        return this.dcy;
    }

    public final void hf(ldv ldv2) {
        this.dcy = ldv2;
    }

    public final void amR() {
        assert (!this.aeg.isServerObject());
        assert (this.dcw == null);
        assert (this.dcy != null);
        ldv ldv2 = this.amU();
        assert (ldv2 != null);
        kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
        kmj2.Zf(8);
        kmj2.wD(true);
        kmj2.ts(this.GUID);
        kmj2.hC(ldv2);
        kmj2.tE(this.amQ());
        this.MessageDelegator.a(kmj2);
        this.dcw = kmj2.getGUID();
    }

    public abstract void amv();

    public final void amS() {
        assert (!this.aeg.isServerObject());
    }

    public final String amT() {
        return bed.kp(this.dcr);
    }

    public final ldv amU() {
        assert (this.aeg != null);
        if (this.aeg.aAG() == null) {
            return null;
        }
        return this.aeg.aAG().axa();
    }

    public final boolean amV() {
        if (this.amU() == null) {
            return false;
        }
        if (this.dcy == null) {
            return false;
        }
        return this.aeg.aAG().isReadyToRun();
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 5376: {
                this.a((kvl)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    public abstract void amK();

    protected final void a(kvl kvl2) {
        if (kvl2.dXg().equals(this.dcw)) {
            if (kvl2.getResult() != 0) {
                lfn.b(5, "SFController", "handlePhysicsResponse() Attaching controller failed: " + kvl2.getResult());
                lfn.b(5, "SFController", "handlePhysicsResponse() Controller='" + this.amT() + "'");
                this.dcw = null;
                return;
            }
            if (this.dcu) {
                this.dcw = null;
                this.dcu = false;
                return;
            }
            this.dcw = null;
            this.dcs = true;
            this.bGn = true;
            float f2 = this.aeg.aJD().aEO();
            boolean bl = this.aeg.aJD().aEP().aEB();
            this.c(f2, bl);
        } else if (kvl2.dXg().equals(this.dcx)) {
            assert (!this.dct);
            assert (kvl2.getResult() == 0);
            this.dcy = kvl2.axa();
            this.dcx = null;
            this.dct = true;
            this.amW();
        } else {
            lfn.b(5, "SFController", "handlePhysicsResponse() Unknown requestGUID received: " + kvl2.dXg());
            lfn.b(5, "SFController", "handlePhysicsResponse() '" + this.amT() + "'");
            lfn.b(0, "SFController", "handlePhysicsResponse() GUID=" + this.GUID + " EngineControllerGUID=" + this.dcy);
        }
    }

    public void amW() {
    }

    public void aK(ljq ljq2) {
        lfn.b(5, "SFController", "notifyDirectionVectorChanged() Nothing done in superclass of " + this.getClass().getName());
        assert (false);
    }

    public void amX() {
        lfn.b(5, "SFController", "notifyDoubleJumpTriggered() Nothing done in superclass of " + this.getClass().getName());
        assert (false);
    }

    public void a(ldg[] ldgArray) {
        lfn.b(5, "SFController", "notifyFlyingStatesChanged() Nothing done in superclass of " + this.getClass().getName());
        assert (false);
    }

    public void aL(ljq ljq2) {
        lfn.b(5, "SFController", "notifyImpulse() Nothing done in superclass of " + this.getClass().getName());
        assert (false);
    }

    public void amY() {
        lfn.b(5, "SFController", "notifyJumpSkillTriggered() Nothing done in superclass of " + this.getClass().getName());
        assert (false);
    }

    public void a(boolean[] blArray, float f2, float f3) {
        lfn.b(5, "SFController", "notifyEvadeSkillTriggered() Nothing done in superclass of " + this.getClass().getName());
        assert (false);
    }

    public void cG(float f2) {
    }

    public final void c(float f2, boolean bl) {
        this.bzb = f2;
        if (!this.bGn) {
            return;
        }
        ldv ldv2 = this.amU();
        assert (ldv2 != null);
        kmj kmj2 = (kmj)this.MessageDelegator.h(3329);
        kmj2.pNm = 2;
        kmj2.ec = this.GUID;
        kmj2.Rs = ldv2;
        kmj2.pNn = this.bzb;
        this.MessageDelegator.a(kmj2);
    }

    public final void aM(ljq ljq2) {
        this.Qe = ljq2;
    }

    public void cV(boolean bl) {
    }

    public void cW(boolean bl) {
        if (bl == this.dcv) {
            return;
        }
        this.cV(bl);
        this.dcv = bl;
    }

    public boolean amZ() {
        return this.dcv;
    }
}

