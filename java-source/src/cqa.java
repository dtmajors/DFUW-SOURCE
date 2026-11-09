/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class cqa
extends cpy
implements bto {
    private bdo eUv = null;
    private bfv eUw = null;
    private hz eUx = null;
    private cqb eUy = null;
    private ldv eUz = null;
    private ldv eno = null;
    private lgj eoZ;

    public cqa() {
        super(true);
    }

    public void a(hz hz2) {
        this.eUx = hz2;
    }

    @Override
    public void doTick(ldz ldz2) {
        bvs bvs2;
        super.doTick(ldz2);
        this.eUw.doTick(ldz2);
        if (this.eUx.mR() && this.eUy == null && this.aAG().isReadyToRun()) {
            this.eUz = lcr.ak((ldv)this.GUID, (int)this.eUx.hk().ib());
            this.eUy = new cqb(this);
            this.eUy.setGUID(this.MessageDelegator.bzv());
            if (this.eUx.mS() > 0.0f) {
                this.eUy.eK(this.eUx.mS());
            }
            if (this.eUx.mT() > 0.0f) {
                this.eUy.setRadius(this.eUx.mT());
            }
            this.MessageDelegator.a(this.eUy);
        }
        if (this.eoZ != null && this.aAG() != null && this.aAG() instanceof bvs && (bvs2 = (bvs)this.aAG()).aAp() != null) {
            bvs2.aAp().e(this.eoZ);
        }
        this.eoZ = null;
    }

    public final bfq aIv() {
        return this.eUw;
    }

    public void f(et et2) {
        if (this.eUx == null) {
            lfn.b(5, "SFWildlifeObjectServer", "handleFloatAttributeBelowMin() WildlifeObject " + this.GUID + " does not have a sessionobject.");
            return;
        }
        if (et2.getType() == 352) {
            if (!this.aIs()) {
                return;
            }
            this.aYp();
        } else {
            super.f(et2);
        }
    }

    public void initialize() {
        super.initialize();
        this.eUw = new bfv(this);
        this.eUw.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.eUw);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bED()) {
            case 16640: {
                if (this.eUv == null) {
                    lfn.b(5, "SFWildlifeObjectServer", "receiveMessage() CommandManager is null.");
                    return;
                }
                this.eUv.a((erq)dxq2);
                return;
            }
        }
        switch (dxq2.bEz()) {
            case 4354: {
                this.a((gvn)dxq2);
                break;
            }
            case 4357: {
                this.a((gvt)dxq2);
                break;
            }
            case 20483: {
                this.a((fsj)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        if (this.eUv != null) {
            this.MessageDelegator.hd(this.eUv.getGUID());
        }
        this.MessageDelegator.hd(this.eUw.getGUID());
        if (this.eUy != null) {
            this.eUy.arj();
            this.eUy = null;
        }
    }

    @Override
    protected void a(dya dya2) {
        if (this.bno != 1) {
            return;
        }
        if (dya2.iiz) {
            this.nG(dya2.aWe);
        } else {
            this.aDk();
        }
    }

    private void a(dyr dyr2) {
        this.oM(dyr2.bbK);
    }

    @Override
    protected void b(dyk dyk2) {
        if (dyk2.bEz() == 13334) {
            this.a((dyr)dyk2);
            return;
        }
        ldv ldv2 = lcr.ak((ldv)this.GUID, (int)this.eUx.hk().ib());
        dyk2.f(this.GUID);
        dyk2.on(ldv2);
        this.MessageDelegator.F(dyk2);
    }

    private void a(fsj fsj2) {
        bvs bvs2;
        if (fsj2.dTY == null) {
            lfn.b(5, "SFWildlifeObjectServer", "handleMovementObjectMessage() PositionalData is null.");
            return;
        }
        if (this.isScheduledForRemoval()) {
            return;
        }
        if (this.aAG() == null) {
            lfn.b(5, "SFWildlifeObjectServer", "handleMovementObjectMessage() MeshObject is null.");
            return;
        }
        this.g(fsj2.dTY);
        ljq ljq2 = fsj2.dTY.eqI();
        lgl lgl2 = fsj2.dTY.eqK();
        if (this.eoZ != null) {
            this.eoZ = null;
        }
        if (this.aAG() instanceof bvs && (bvs2 = (bvs)this.aAG()).aAp() != null) {
            this.eoZ = fsj2.dTY;
        }
        this.aAG().aX(ljq2);
        this.aAG().h(lgl2);
    }

    private void a(gvn gvn2) {
        assert (this.eno == null);
        if (gvn2.atv == null) {
            lfn.b(5, "SFWildlifeObjectServer", "handleTimerCreateResponse() TimerGUID is null. LifeModeTimer could not be created.");
            this.aYo();
            return;
        }
        this.eno = gvn2.atv;
    }

    private void a(gvt gvt2) {
        ldv ldv2 = gvt2.atv;
        if (ldv2 == null) {
            lfn.b(5, "SFWildlifeObjectServer", "handleTimerTimeoutMessage() TimerGUID is null.");
            return;
        }
        if (!ldv2.equals(this.eno)) {
            lfn.b(5, "SFWildlifeObjectServer", "handleTimerTimeoutMessage() TimerGUID is not equal to LifeModeTimerGUID.");
            lfn.b(5, "SFWildlifeObjectServer", "handleTimerTimeoutMessage() TimerGUID=" + ldv2 + " LifeModeTimerGUID=" + this.eno);
            return;
        }
        this.eno = null;
        this.aYo();
    }

    private void aYo() {
        assert (this.bno == 3);
        this.sC(4);
        this.eUx.mU();
    }

    private void aYp() {
        assert (this.bno == 1);
        assert (this.eno == null);
        bfn bfn2 = this.eUw.aof();
        if (bfn2 == null) {
            lfn.b(5, "SFWildlifeObjectServer", "handleWildlifeObjectDying() LastEventOccured is null.");
            lfn.b(5, "SFWildlifeObjectServer", "handleWildlifeObjectDying() Either a bug or someone changed the health through a chatcommand.");
        } else if (bfn2 instanceof bfl) {
            bfl bfl2 = (bfl)bfn2;
            this.eUw.a(5, bfl2);
        } else {
            this.eUw.c(5, bfn2.aYF, bfn2.bsG);
        }
        this.sC(3);
        float f2 = 3.5f;
        if (f2 == 0.0f) {
            lfn.b(5, "SFWildlifeObjectServer", "handleWildlifeObjectDying() DeathAnimationTimerLength is invalid.");
            this.aYo();
            return;
        }
        this.dL(f2);
        this.eUx.mW();
    }

    private void dL(float f2) {
        assert (this.dwG);
        assert (f2 > 0.0f);
        gvm gvm2 = (gvm)this.MessageDelegator.h(4353, this.GUID, this.MessageDelegator.getGUID());
        gvm2.gdA = 1;
        gvm2.Rs = this.GUID;
        gvm2.oV = 0.0;
        gvm2.eNV = f2;
        this.MessageDelegator.F(gvm2);
    }

    public void k(ldv ldv2, ljq ljq2) {
        assert (this.eUz != null);
        assert (ldv2 != null);
        assert (ljq2 != null);
        dyp dyp2 = (dyp)this.MessageDelegator.h(13333, this.GUID, this.eUz);
        dyp2.iiU = true;
        dyp2.Ui = ldv2;
        dyp2.Position = ljq2;
        this.MessageDelegator.F(dyp2);
    }

    public void lJ(ldv ldv2) {
        assert (this.eUz != null);
        assert (ldv2 != null);
        dyp dyp2 = (dyp)this.MessageDelegator.h(13333, this.GUID, this.eUz);
        dyp2.iiU = false;
        dyp2.Ui = ldv2;
        this.MessageDelegator.F(dyp2);
    }
}

