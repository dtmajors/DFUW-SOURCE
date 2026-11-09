/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cwe
 *  lcr
 */
import java.util.Iterator;
import java.util.List;

public abstract class cwc
extends btk {
    protected List<cwg> fDM = lcn.emv();

    public final List<cwg> bdb() {
        return this.fDM;
    }

    public abstract cev aFh();

    public final boolean a(cwf.b b2) {
        if (b2 == null) {
            lfn.b(5, "SFPlayerSessionManager", "canStartSession() SessionType is null.");
            return false;
        }
        int n = this.fDM.size();
        for (int i = 0; i < n; ++i) {
            cwg cwg2 = this.fDM.get(i);
            if (cwg2.bdr() != b2) continue;
            return false;
        }
        return true;
    }

    public final boolean bdc() {
        int n = this.fDM.size();
        block4: for (int i = 0; i < n; ++i) {
            cwg cwg2 = this.fDM.get(i);
            switch (cwg2.fEJ) {
                case fEy: 
                case fEz: 
                case fEC: 
                case fED: 
                case fEE: 
                case fEF: 
                case fEH: {
                    continue block4;
                }
                case fEA: 
                case fEB: {
                    return true;
                }
                default: {
                    lfn.b(5, "SFPlayerSessionManager", "containsSkillBlockingSessions() Unhandled sessionhandler found: " + (Object)((Object)cwg2.bdr()));
                    assert (false);
                    continue block4;
                }
            }
        }
        return false;
    }

    public final cwg b(cwf.b b2) {
        if (b2 == null) {
            lfn.b(5, "SFPlayerSessionManager", "getSessionHandler() SessionType is null.");
            return null;
        }
        int n = this.fDM.size();
        for (int i = 0; i < n; ++i) {
            cwg cwg2 = this.fDM.get(i);
            if (cwg2.bdr() != b2) continue;
            return cwg2;
        }
        return null;
    }

    public final void a(cwg cwg2) {
        assert (cwg2 != null);
        cwg cwg3 = this.lT(cwg2.getGUID());
        if (cwg3 == null) {
            lfn.b(5, "SFPlayerSessionManager", "notifySessionStopped() Could not find handler " + cwg2);
            return;
        }
        this.lX(cwg2.getGUID());
        this.MessageDelegator.hd(cwg2.getGUID());
        if (cwg2 instanceof cvo && hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyJ() != null) {
            hso.cxK().cxP().cyJ().cHt();
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 1028: {
                this.a((ftz)dxq2);
                break;
            }
            case 11034: {
                this.handleSystemMessageSendingErrorMessage((gre)dxq2);
                break;
            }
            case 4865: {
                this.a((gam)dxq2);
                break;
            }
            case 4881: {
                this.a((gaq)dxq2);
                break;
            }
            case 4867: {
                this.a((gao)dxq2);
                break;
            }
            case 4868: {
                this.a((gap)dxq2);
                break;
            }
            case 4869: {
                break;
            }
            case 4870: {
                this.a((gat)dxq2);
                break;
            }
            case 4872: {
                this.a((gav)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public final void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 1026: {
                this.a((kuv)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    protected final cwg xa(int n) {
        if (n <= 0) {
            lfn.b(5, "SFPlayerSessionManager", "getSessionHandler() SessionID is invalid.");
            return null;
        }
        int n2 = this.fDM.size();
        for (int i = 0; i < n2; ++i) {
            cwg cwg2 = this.fDM.get(i);
            if (cwg2.Ec() != n) continue;
            return cwg2;
        }
        return null;
    }

    protected final cwg lT(ldv ldv2) {
        assert (ldv2 != null);
        int n = this.fDM.size();
        for (int i = 0; i < n; ++i) {
            cwg cwg2 = this.fDM.get(i);
            if (!cwg2.getGUID().equals(ldv2)) continue;
            return cwg2;
        }
        return null;
    }

    protected abstract void lU(ldv var1);

    protected abstract void bG(ljq var1);

    protected abstract void a(gam var1);

    protected abstract void a(gaq var1);

    protected abstract void a(gao var1);

    protected abstract void a(gap var1);

    protected abstract void a(gat var1);

    protected abstract void a(gav var1);

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        if (gre2.jqf == null) {
            lfn.b(5, "SFPlayerSessionManager", "handleSystemMessageSendingErrorMessage() FailedToGUID is null: " + gre2);
            return;
        }
        if (gre2.jqc == 1028) {
            this.lU(gre2.jqf);
        } else {
            super.handleSystemMessageSendingErrorMessage(gre2);
        }
    }

    protected final boolean xb(int n) {
        byv byv2 = this.aFh().aLU().aEP();
        if (byv2.vO() == 6) {
            return true;
        }
        if (byv2.vO() == 7) {
            return true;
        }
        if (n != iv.ahA) {
            this.a(mab.uaf.bD(new Object[0]));
        }
        return false;
    }

    protected final void lV(ldv ldv2) {
        assert (ldv2 != null);
        ftz ftz2 = (ftz)this.MessageDelegator.h(1028, this.GUID, ldv2);
        ftz2.jM(true);
        this.MessageDelegator.F(ftz2);
    }

    protected final void lW(ldv ldv2) {
        assert (ldv2 != null);
        kkz kkz2 = (kkz)this.MessageDelegator.h(1027);
        kkz2.iBr = true;
        kkz2.ec = this.GUID;
        kkz2.pHM = 1;
        kkz2.Rs = ldv2;
        this.MessageDelegator.a(kkz2);
    }

    private void a(ftz ftz2) {
        this.bG(ftz2.Position);
    }

    private void a(kuv kuv2) {
        if (kuv2.getResult() != 0) {
            if (kuv2.getResult() == -5) {
                lfn.b(5, "SFPlayerSessionManager", "handleObjectPositionInfoResponse() Could not find object.");
            } else {
                lfn.b(5, "SFPlayerSessionManager", "handleObjectPositionInfoResponse() Result=" + kuv2.getResult());
            }
        }
        this.bG(kuv2.av());
    }

    private void lX(ldv ldv2) {
        assert (ldv2 != null);
        Iterator<cwg> iterator = this.fDM.iterator();
        while (iterator.hasNext()) {
            cwg cwg2 = iterator.next();
            if (!cwg2.getGUID().equals(ldv2)) continue;
            iterator.remove();
            return;
        }
        lfn.b(5, "SFPlayerSessionManager", "removeSessionHandler() Could not find handler " + ldv2);
    }

    private void a(loz loz2) {
        if (this instanceof cwe) {
            ((cex)((cwe)this).aFh()).c(loz2);
        } else {
            fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, lcr.acL);
            fgs2.r(loz2);
            this.MessageDelegator.F(fgs2);
        }
    }
}

