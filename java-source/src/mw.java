/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.TreeMap;

public class mw
extends my {
    private sa aBw;
    private ru aBx;
    private rk aBy;
    private ps[] aBz;
    private boolean aBA;
    private fzp aBB = null;
    private fzp aBC = null;
    private fyj aBD = null;
    private double aBE = -1.0;
    private fzp aBF = null;
    private fyj aBG = null;
    private int aBH = 0;
    private boolean aBI = false;

    public mw() {
        this.setGUID(lcr.qAV);
    }

    public void a(gr[] grArray) {
        assert (this.aBz == null);
        TreeMap<Integer, ps> treeMap = lcn.emG();
        for (gr gr2 : grArray) {
            ps ps2 = new ps();
            ps2.Wy = gr2;
            ps2.aHR = ps2.sH();
            treeMap.put(ps2.sJ(), ps2);
        }
        for (int i = 0; i < treeMap.size(); ++i) {
            if (treeMap.containsKey(i)) continue;
            this.fatalError("Gamelogic server node IDs are not consecutive - no server with NodeID " + (i + 300));
            return;
        }
        this.aBz = treeMap.values().toArray(new ps[treeMap.size()]);
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        if (pt.aHU && ldz2.rgz >= this.aBE + pt.aHT) {
            this.aBE = ldz2.rgz;
            if (this.aBF != null) {
                lfn.b(4, "SFGLDPersistenceManager", "doTick: Periodic save already in progress - skipping save that should start now");
                return;
            }
            this.aBF = (fzp)this.MessageDelegator.h(7172, this.getGUID(), this.getGUID());
            this.aBF.jbR = true;
            this.MessageDelegator.F(this.aBF);
            lfn.b(2, "SFGLDPersistenceManager", "doTick: Starting periodic save");
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aBE = this.MessageDelegator.arc().rgz;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7172: {
                this.a((fzp)dxq2);
                break;
            }
            case 7173: {
                this.b((fzq)dxq2);
                break;
            }
            case 7197: {
                this.g((fze)dxq2);
                break;
            }
            case 7195: {
                this.a((fyr)dxq2);
                break;
            }
            case 7193: {
                this.a((fzt)dxq2);
                break;
            }
            case 7182: {
                this.a((fzj)dxq2);
                break;
            }
            case 7199: {
                this.a((fyj)dxq2);
                break;
            }
            case 7200: {
                this.a((fyk)dxq2);
                break;
            }
            case 7186: {
                this.a((fzl)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public int sf() {
        int n = -1;
        int n2 = 10000;
        for (int i = 0; i < this.aBz.length; ++i) {
            ps ps2 = this.aBz[i];
            int n3 = ps2.aAD.size() + ps2.aHS;
            if (n3 >= n2) continue;
            n2 = n3;
            n = i;
        }
        if (n == -1) {
            lfn.b(5, "SFGLDPersistenceManager", "getNodeIDForNewCharacter: No more free character IDs");
            assert (false);
            return 0;
        }
        ps ps3 = this.aBz[n];
        ++ps3.aHS;
        return ps3.Wy.di;
    }

    public void sg() {
        this.aBw = this.f(new sa(this));
        this.aBw.start();
    }

    public boolean rO() {
        return this.aBA;
    }

    @Override
    public boolean isReadyToRun() {
        return this.rO();
    }

    @Override
    public boolean isReadyToShutdown() {
        if (this.aBI) {
            if (this.aBF == null) {
                return true;
            }
        } else if (this.aBF == null) {
            this.aBI = true;
            this.aBF = (fzp)this.MessageDelegator.h(7172, this.getGUID(), this.getGUID());
            this.aBF.jbR = true;
            this.MessageDelegator.F(this.aBF);
            lfn.b(3, "SFGLDPersistenceManager", "isReadyToShutdown: Starting shutdown save");
        }
        return false;
    }

    private void b(fzq fzq2) {
        if (this.aBF == null) {
            lfn.b(5, "SFGLDPersistenceManager", "handlePersistenceManagerSaveAllResponse: No pending save all request");
            assert (false);
            return;
        }
        this.aBF = null;
        if (this.aBI) {
            if (fzq2.eo) {
                lfn.b(3, "SFGLDPersistenceManager", "handlePersistenceManagerSaveAllResponse: Shutdown save completed");
            } else {
                lfn.b(5, "SFGLDPersistenceManager", "handlePersistenceManagerSaveAllResponse: Shutdown save failed");
            }
        } else {
            if (fzq2.eo) {
                lfn.b(2, "SFGLDPersistenceManager", "handlePersistenceManagerSaveAllResponse: Periodic save completed");
            } else {
                lfn.b(5, "SFGLDPersistenceManager", "handlePersistenceManagerSaveAllResponse: Periodic save failed");
            }
            this.aBG = (fyj)this.MessageDelegator.h(7199, this.getGUID(), this.getGUID());
            this.MessageDelegator.F(this.aBG);
        }
    }

    private void a(fyk fyk2) {
        if (this.aBG == null) {
            lfn.b(5, "SFGLDPersistenceManager", "handlePersistenceManagerExpireAllResponse: No pending expire all request");
            assert (false);
            return;
        }
        if (fyk2.eo) {
            lfn.b(2, "SFGLDPersistenceManager", "handlePersistenceManagerExpireAllResponse: Periodic expiry completed");
        } else {
            lfn.b(5, "SFGLDPersistenceManager", "handlePersistenceManagerExpireAllResponse: Periodic expiry failed");
        }
        this.aBG = null;
    }

    private void a(fzp fzp2) {
        if (!this.rO()) {
            lfn.b(5, "SFGLDPersistenceManager", "handlePersistenceManagerSaveAllRequest: Got save all request from " + fzp2.aO().enz() + " before loading completed");
            fzq fzq2 = (fzq)this.MessageDelegator.h(7173, this.getGUID(), fzp2.aO());
            this.MessageDelegator.b(fzp2, fzq2);
            fzq2.eo = false;
            fzq2.aMH = "Load isn't yet completed";
            this.MessageDelegator.E(fzq2);
            return;
        }
        if (this.aBB != null) {
            if (!fzp2.jbS) {
                lfn.b(3, "SFGLDPersistenceManager", "handlePersistenceManagerSaveAllRequest: Failing save all request, a save is already running");
                this.aBx.b(3, "SFGLDPersistenceManager", 1, true);
                fzq fzq3 = (fzq)this.MessageDelegator.h(7173, this.getGUID(), fzp2.aO());
                this.MessageDelegator.b(fzp2, fzq3);
                fzq3.eo = false;
                fzq3.aMH = "Save already in progress";
                this.MessageDelegator.E(fzq3);
                return;
            }
            if (this.aBD != null) {
                lfn.b(5, "SFGLDPersistenceManager", "handlePersistenceManagerSaveAllRequest: Failing save all request, expiry is running");
                fzq fzq4 = (fzq)this.MessageDelegator.h(7173, this.getGUID(), fzp2.aO());
                this.MessageDelegator.b(fzp2, fzq4);
                fzq4.eo = false;
                fzq4.aMH = "Expiry in progress";
                this.MessageDelegator.E(fzq4);
                return;
            }
            if (this.aBC != null) {
                lfn.b(3, "SFGLDPersistenceManager", "handlePersistenceManagerSaveAllRequest: Already canceling a a running save. Failing previous Force save all request");
                fzq fzq5 = (fzq)this.MessageDelegator.h(7173, this.getGUID(), this.aBC.aO());
                this.MessageDelegator.b(this.aBC, fzq5);
                fzq5.eo = false;
                fzq5.aMH = "Save and cancel in progress, and a new save all request arrived";
                this.MessageDelegator.E(fzq5);
                this.aBC = fzp2;
                return;
            }
            lfn.b(3, "SFGLDPersistenceManager", "handlePersistenceManagerSaveAllRequest: Got a Force save request, canceling existing save all");
            this.aBC = fzp2;
            this.aBx.b(3, "SFGLDPersistenceManager", 1, true);
            this.aBx.tM();
            return;
        }
        lfn.b(3, "SFGLDPersistenceManager", "handlePersistenceManagerSaveAllRequest: Save all requested by " + fzp2.aO().enz());
        this.aBB = fzp2;
        this.aBx = this.f(new ru(this));
        this.aBx.start();
    }

    private void a(fyj fyj2) {
        if (!this.rO()) {
            lfn.b(5, "SFGLDPersistenceManager", "handlePersistenceManagerExpireAllRequest: Got save all request from " + fyj2.aO().enz() + " before loading completed");
            fyk fyk2 = (fyk)this.MessageDelegator.h(7200, this.getGUID(), fyj2.aO());
            this.MessageDelegator.b(fyj2, fyk2);
            fyk2.eo = false;
            fyk2.aMH = "Load isn't yet completed";
            this.MessageDelegator.E(fyk2);
            return;
        }
        if (this.aBB != null) {
            lfn.b(5, "SFGLDPersistenceManager", "handlePersistenceManagerExpireAllRequest: Save all running - failing expiry request");
            fyk fyk3 = (fyk)this.MessageDelegator.h(7200, this.getGUID(), fyj2.aO());
            this.MessageDelegator.b(fyj2, fyk3);
            fyk3.eo = false;
            fyk3.aMH = "Save all running";
            this.MessageDelegator.E(fyk3);
            return;
        }
        if (this.aBD != null) {
            lfn.b(5, "SFGLDPersistenceManager", "handlePersistenceManagerExpireAllRequest: Expire all running - failing expiry request");
            fyk fyk4 = (fyk)this.MessageDelegator.h(7200, this.getGUID(), fyj2.aO());
            this.MessageDelegator.b(fyj2, fyk4);
            fyk4.eo = false;
            fyk4.aMH = "Expire all running";
            this.MessageDelegator.E(fyk4);
            return;
        }
        this.aBD = fyj2;
        this.aBy = this.f(new rk(this));
        this.aBy.start();
        lfn.b(3, "SFGLDPersistenceManager", "handlePersistenceManagerSaveAllRequest: Expire all requested by " + fyj2.aO().enz());
    }

    private void g(fze fze2) {
        switch (fze2.uk()) {
            default: 
        }
        lfn.b(5, "SFGLDPersistenceManager", "handlePersistenceManagerOperationRequestMessage: Unhandled operation " + (Object)((Object)fze2.uk()));
        fzf fzf2 = (fzf)this.MessageDelegator.h(7198, this.getGUID(), fze2.aO());
        this.MessageDelegator.b(fze2, fzf2);
        fzf2.a(fze2.uk());
        fzf2.kP(fze2.bSR());
        fzf2.aMH = "Unhandled operation";
        this.MessageDelegator.E(fzf2);
    }

    public final ps[] sh() {
        return this.aBz;
    }

    @Override
    public void c(qe qe2) {
        super.c(qe2);
        if (qe2 == this.aBw) {
            if (this.aBw.sS()) {
                this.fatalError("Startup failed: " + this.aBw.getErrorMessage());
                return;
            }
            this.aBH = this.aBw.tN();
            this.aBA = true;
            this.e(this.aBw);
            this.aBw = null;
            for (ps ps2 : this.aBz) {
                ps2.aAD = lcn.emH();
                ps2.aAD.addAll(ps2.aHP);
                ps2.aAD.addAll(ps2.aHQ);
                ps2.aHR = ps2.sH();
                while (ps2.aAD.contains(ps2.aHR)) {
                    ++ps2.aHR;
                }
            }
        } else if (qe2 == this.aBx) {
            fzq fzq2 = (fzq)this.MessageDelegator.h(7173, this.getGUID(), this.aBB.aO());
            this.MessageDelegator.b(this.aBB, fzq2);
            fzq2.eo = !this.aBx.sS();
            fzq2.aMH = this.aBx.getErrorMessage();
            if (!fzq2.eo) {
                lfn.b(5, "SFGLDPersistenceManager", "notifyChildCompleted: Save All failed: " + fzq2.aMH);
            }
            this.MessageDelegator.E(fzq2);
            this.aBB = null;
            this.e(this.aBx);
            this.aBx = null;
            if (this.aBC != null) {
                this.a(this.aBC);
                this.aBC = null;
            }
        } else if (qe2 == this.aBy) {
            fyk fyk2 = (fyk)this.MessageDelegator.h(7200, this.getGUID(), this.aBD.aO());
            this.MessageDelegator.b(this.aBD, fyk2);
            fyk2.eo = !this.aBy.sS();
            fyk2.aMH = this.aBy.getErrorMessage();
            if (!fyk2.eo) {
                lfn.b(5, "SFGLDPersistenceManager", "notifyChildCompleted: Expire All failed: " + fyk2.aMH);
            }
            this.MessageDelegator.E(fyk2);
            this.aBD = null;
            this.e(this.aBy);
            this.aBy = null;
        }
    }

    private void a(fyr fyr2) {
        fys fys2 = (fys)this.MessageDelegator.h(7196, this.getGUID(), fyr2.aO());
        this.MessageDelegator.b(fyr2, fys2);
        this.a(fys2);
        fys2.kV &= fyr2.kV;
        this.MessageDelegator.E(fys2);
    }

    private void a(fzt fzt2) {
        fzu fzu2 = (fzu)this.MessageDelegator.h(7194, this.getGUID(), fzt2.aO());
        this.MessageDelegator.b(fzt2, fzu2);
        if ((fzt2.kV & 0x8000) != 0) {
            pt.aHU = fzt2.aHU;
            lfn.b(3, "SFGLDPersistenceManager", "handlePersistenceManagerSetPropertyRequestMessage: Periodic Saving is now " + pt.aHU);
        }
        if ((fzt2.kV & 0x10000) != 0) {
            pt.aHT = fzt2.aHT;
            lfn.b(3, "SFGLDPersistenceManager", "handlePersistenceManagerSetPropertyRequestMessage: Periodic Saving Interval is now " + pt.aHT);
        }
        this.a(fzu2);
        fzu2.kV &= fzt2.kV;
        this.MessageDelegator.E(fzu2);
    }

    private void a(fzg fzg2) {
        fzg2.kV = 98304;
        fzg2.aHU = pt.aHU;
        fzg2.aHT = pt.aHT;
    }

    private void a(fzj fzj2) {
        fzk fzk2 = (fzk)this.MessageDelegator.h(7183, this.getGUID(), fzj2.aO());
        this.MessageDelegator.b(fzj2, fzk2);
        fzk2.aMI = this.aBH++;
        this.MessageDelegator.E(fzk2);
    }

    private void a(fzl fzl2) {
        fzl2.on(lcr.ak((ldv)lcr.qAW, (int)this.sf()));
        this.MessageDelegator.E(fzl2);
    }
}

