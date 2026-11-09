/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  brg
 *  cug
 */
import java.util.Iterator;

public class cdv
extends cdt {
    private ccw enk = new ccw(this);
    private final cdp enO = new cdp(this);
    private bqx enm = new bqx();
    private cat dIx = new cat();
    private hu enn = null;
    private ldv eno = null;
    private boolean enp = false;
    private boolean enq = false;

    public cdv() {
        super(true);
    }

    public final ccw aJL() {
        return this.enk;
    }

    public final ccx aJM() {
        return this.enO;
    }

    public final cdp aKv() {
        return this.enO;
    }

    public final bqv aJC() {
        return this.enm;
    }

    public final void b(bqv bqv2) {
        this.enm = (bqx)bqv2;
    }

    @Override
    public final caq aKu() {
        return this.dIx;
    }

    @Override
    public final void a(caq caq2) {
        this.dIx = (cat)caq2;
    }

    public final hu aJP() {
        return this.enn;
    }

    public final void a(hu hu2) {
        this.enn = hu2;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (this.enk != null) {
            this.enk.doTick(ldz2);
        }
    }

    public final ddj aKw() {
        if (this.enn == null) {
            return null;
        }
        return ((hw)this.enn).ms();
    }

    @Override
    public void initialize() {
        super.initialize();
        assert (this.enm.auk() == null);
        assert (this.enm.asf().auk() == null);
        if (ResourceTree.isDescendant(this.az(), cug.fgE)) {
            this.enk.bl(this.MessageDelegator.arc().rgz);
            this.enk.aC(352, 416);
            if (this.fi().ad(384)) {
                this.enk.aC(384, 448);
            }
            if (this.fi().ad(400)) {
                this.enk.aC(400, 464);
            }
            if (this.fi().ad(1504)) {
                this.enk.aJo();
            }
        }
        ((brg)this.enm.asf()).b(this.dIx);
        this.enm.a((brb)((Object)this));
        this.enm.setObjectType(118);
        this.MessageDelegator.a(this.enm);
        this.g(1032, this.GUID, this.enm.getGUID());
        this.dIx.setGUID(this.MessageDelegator.bzv());
        this.dIx.a(this);
        this.MessageDelegator.a(this.dIx);
        this.g(1034, this.GUID, this.dIx.getGUID());
        Iterator iterator = this.emI.jl().values().iterator();
        while (iterator.hasNext()) {
            this.MessageDelegator.a((amf)iterator.next());
        }
        this.enO.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.enO);
    }

    private void a(dyr dyr2) {
        this.oM(dyr2.bbK);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bED()) {
            case 13312: {
                switch (dxq2.bEz()) {
                    case 13332: {
                        this.a((dya)dxq2);
                        break;
                    }
                    case 13334: {
                        this.a((dyr)dxq2);
                        break;
                    }
                    default: {
                        this.b((dyk)dxq2);
                    }
                }
                return;
            }
            case 20480: {
                this.enO.receiveMessage(dxq2);
                return;
            }
        }
        switch (dxq2.bEz()) {
            case 11010: {
                this.a((grl)dxq2);
                break;
            }
            case 4354: {
                this.a((gvn)dxq2);
                break;
            }
            case 4357: {
                this.a((gvt)dxq2);
                break;
            }
            case 5123: {
                this.enO.receiveMessage(dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public final void setScheduledForRemoval() {
        super.setScheduledForRemoval();
        this.MessageDelegator.hd(this.enO.getGUID());
        if (this.aJC() != null) {
            this.MessageDelegator.hd(this.enm.getGUID());
        }
        if (this.dIx != null) {
            this.MessageDelegator.hd(this.dIx.getGUID());
        }
    }

    private void a(dya dya2) {
        if (!this.enL.aEP().isAlive()) {
            return;
        }
        if (dya2.iiz) {
            this.enL.aDc().nG(dya2.aWe);
        } else {
            this.enL.aDc().aDk();
        }
    }

    private void b(dyk dyk2) {
        dyk2.f(this.GUID);
        dyk2.on(this.jk().bhh());
        this.MessageDelegator.F(dyk2);
    }

    private void a(grl grl2) {
        byv byv2 = grl2.edV;
        if (byv2 == null) {
            lfn.b(5, "SFGroundedMonsterServer", "handleObjectStateUpdateMessage() ObjectState received from client " + grl2.aO() + " is null.");
            return;
        }
        if (grl2.ecU == null) {
            lfn.b(5, "SFGroundedMonsterServer", "handleObjectStateUpdateMessage() ActiveDirections array received from client " + grl2.aO() + " is null.");
            return;
        }
        this.enL.d(grl2.ecU);
        this.enL.aEK().a(byv2, true, false);
    }

    public void f(et et2) {
        if (this.enn == null) {
            lfn.b(5, "SFGroundedMonsterServer", "handleFloatAttributeBelowMin() Object " + this.GUID + " does not have a sessionobject.");
            return;
        }
        if (et2.getType() == 352) {
            if (!this.aIs()) {
                return;
            }
            this.h(et2);
        } else {
            super.f(et2);
        }
    }

    @Override
    public final void aKl() {
        super.aKl();
        if (this.enL.aEa()) {
            assert (!this.enp);
            this.enp = true;
        } else {
            this.enn.mf();
        }
    }

    @Override
    public final void fH(boolean bl) {
        assert (this.eno == null);
        super.fH(bl);
        float f2 = 3.5f;
        if (f2 == 0.0f) {
            lfn.b(5, "SFGroundedMonsterServer", "handleMonsterObjectDying() DeathAnimationTimerLength is invalid.");
            this.enL.a(byw.c.ech);
            return;
        }
        if (!this.enL.aEa() && this.enO != null) {
            this.enO.aKq();
        }
        this.dL(f2);
        this.enn.S(bl);
    }

    public void aKm() {
        assert (this.enp);
        this.enn.mf();
        this.enp = false;
        this.enq = false;
        if (this.enO != null) {
            this.enO.aKq();
        }
    }

    private void h(et et2) {
        assert (et2 != null);
        assert (et2.getType() == 352);
        bfn bfn2 = this.enP.aof();
        if (bfn2 == null) {
            lfn.b(5, "SFGroundedMonsterServer", "checkLifeModeStatus() LastEventOccured is null. IMPOSSIBLE!");
            this.enL.a(byw.c.eci);
            return;
        }
        if (bfn2 instanceof bfl) {
            bfl bfl2 = (bfl)bfn2;
            this.enP.a(5, bfl2);
            this.enL.a(byw.c.eci);
        } else {
            this.enP.c(5, bfn2.aYF, bfn2.bsG);
            this.enL.a(byw.c.eci);
        }
    }

    private void a(gvn gvn2) {
        if (gvn2.atv == null) {
            lfn.b(5, "SFGroundedMonsterServer", "handleTimerCreateResponse() TimerGUID is null. LifeModeTimer could not be created.");
            this.enL.a(byw.c.ech);
            this.eno = null;
            return;
        }
        this.eno = gvn2.atv;
    }

    private void a(gvt gvt2) {
        ldv ldv2 = gvt2.atv;
        if (ldv2 == null) {
            lfn.b(5, "SFGroundedMonsterServer", "handleTimerTimeoutMessage() TimerGUID is null.");
            return;
        }
        if (!ldv2.equals(this.eno)) {
            lfn.b(5, "SFGroundedMonsterServer", "handleTimerTimeoutMessage() TimerGUID is not equal to LifeModeTimerGUID.");
            lfn.b(5, "SFGroundedMonsterServer", "handleTimerTimeoutMessage() TimerGUID=" + ldv2 + " LifeModeTimerGUID=" + this.eno);
            return;
        }
        this.eno = null;
        byv byv2 = this.enL.aEP();
        switch (byv2.vM()) {
            case 2: {
                this.enL.a(byw.c.eci);
                break;
            }
            case 3: {
                this.enL.a(byw.c.ech);
                break;
            }
            default: {
                lfn.b(5, "SFGroundedMonsterServer", "sendTimerCreateMessage() Unhandled lifemode provided: '" + byv2.aEo() + "'");
                return;
            }
        }
    }
}

