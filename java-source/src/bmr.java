/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cxd
 *  lcr
 *  lcw
 */
public class bmr
extends bke {
    private fdq dvA = null;
    private cex dvB = null;
    private ldv dvC = null;
    private ldv akX = null;
    private ldv atv = null;

    public bmr() {
        this.dsy = bkd.a.dsm;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        assert (fdo2 != null);
        this.dvA = (fdq)fdo2;
        this.dvB = (cex)this.d(fdo2.aZG);
        if (this.dvB == null) {
            lfn.b(5, "SFSummonPlayerFO", "doFunction() SourceObject " + fdo2.aZG + " was not found.");
            this.Vc();
            return;
        }
        if (lcw.enb()) {
            fux fux2 = (fux)this.MessageDelegator.h(5639, this.GUID, this.GUID);
            fux2.Ri = this.dvB.mA().getGUID();
            this.MessageDelegator.F(fux2);
            return;
        }
        fux fux3 = (fux)this.MessageDelegator.h(5639, this.GUID, lcr.hac);
        fux3.bc = this.dvA.iKc;
        this.MessageDelegator.F(fux3);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5636: {
                this.b((fuu)dxq2);
                break;
            }
            case 5639: {
                this.a((fux)dxq2);
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
            case 18180: {
                this.b((esv)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void b(esv esv2) {
        if (this.atv == null) {
            lfn.b(5, "SFSummonPlayerFO", "handleConfirmationResponse() TimerGUID is null.");
            return;
        }
        if (esv2.iBx == null) {
            lfn.b(5, "SFSummonPlayerFO", "handleConfirmationResponse() ConfirmationRespose is null.");
            this.Vc();
            return;
        }
        this.bJ(this.atv);
        this.atv = null;
        bdv bdv2 = esv2.iBx;
        if (bdv2 instanceof bdw) {
            int n = ((bdw)bdv2).dbU;
            bdp.a a2 = bdp.a.getRecallButtonType(n);
            switch (a2) {
                case dbt: {
                    this.arL();
                    break;
                }
                case dbu: {
                    break;
                }
                default: {
                    lfn.b(5, "SFSummonPlayerFO", "handleConfirmationResponse() Invalid buttontype provided: " + (Object)((Object)a2));
                    break;
                }
            }
        } else if (!(bdv2 instanceof bdx)) {
            lfn.b(5, "SFSummonPlayerFO", "handleConfirmationResponse() Invalid response received: " + bdv2);
        }
        this.Vc();
    }

    private void b(fuu fuu2) {
        if (fuu2.dtj == null) {
            lfn.b(5, "SFSummonPlayerFO", "handleObjectInfoGUIDResponseMessage() PhysicalObjectGUID is null.");
            this.Vc();
            return;
        }
        if (fuu2.iXv == null) {
            lfn.b(5, "SFSummonPlayerFO", "handleObjectInfoGUIDResponseMessage() ClientPhysicalObjectGUID is null.");
            this.Vc();
            return;
        }
        this.akX = lcr.ak((ldv)fuu2.dtj, (int)this.dvB.jk().jr());
        int n = fuu2.iXv.ib();
        double d2 = this.MessageDelegator.arc().rgz + 15.0;
        String string = "Would you like to be summoned by " + this.dvB.mA().iU();
        String[] stringArray = bdp.dbk;
        bdr bdr2 = new bdr(this.GUID, d2, string, stringArray);
        bdr2.Title = "";
        ldv ldv2 = lcr.p((ldv)lcr.aTZ, (int)n, (int)this.dvC.enw());
        est est2 = (est)this.MessageDelegator.h(18179, this.GUID, ldv2);
        est2.iBv = bdr2;
        this.MessageDelegator.F(est2);
        this.l(15.0);
    }

    private void a(fux fux2) {
        if (fux2.Ri == null) {
            lfn.b(5, "SFSummonPlayerFO", "handleObjectInfoNameLookupMessage() PSOGUID is null.");
            this.Vc();
            return;
        }
        this.dvC = fux2.Ri;
        fut fut2 = (fut)this.MessageDelegator.h(5635, this.GUID, fux2.Ri);
        fut2.iXt = 65;
        this.MessageDelegator.F(fut2);
    }

    private void a(gvn gvn2) {
        assert (this.atv == null);
        if (gvn2.atv == null) {
            lfn.b(5, "SFSummonPlayerFO", "handleTimerCreateResponse() TimerGUID is null. Timer could not be created.");
            this.Vc();
            return;
        }
        this.atv = gvn2.atv;
    }

    private void a(gvt gvt2) {
        assert (this.atv != null);
        if (gvt2.atv == null) {
            lfn.b(5, "SFSummonPlayerFO", "handleTimerTimeoutMessage() TimerGUID is null.");
            this.Vc();
            return;
        }
        if (!this.atv.equals(gvt2.atv)) {
            lfn.b(5, "SFSummonPlayerFO", "handleTimerTimeoutMessage() TimerGUID is not equal to Message.TimerGUID.");
            lfn.b(5, "SFSummonPlayerFO", "handleTimerTimeoutMessage() TimerGUID=" + this.atv + " Message.TimerGUID=" + gvt2.atv);
            this.Vc();
            return;
        }
        this.atv = null;
        this.Vc();
    }

    private void arL() {
        ldv ldv2 = this.dvB.jk().bhh();
        gjt gjt2 = (gjt)this.MessageDelegator.h(4617, this.GUID, ldv2);
        gjt2.SkillType = cxd.fHi;
        gjt2.aZF = 4;
        gjt2.akX = this.akX;
        this.MessageDelegator.F(gjt2);
    }

    private void l(double d2) {
        assert (d2 > 0.0);
        gvm gvm2 = (gvm)this.MessageDelegator.h(4353, this.GUID, this.MessageDelegator.getGUID());
        gvm2.gdA = 1;
        gvm2.Rs = this.GUID;
        gvm2.oV = 0.0;
        gvm2.eNV = d2;
        this.MessageDelegator.F(gvm2);
    }

    private void bJ(ldv ldv2) {
        assert (ldv2 != null);
        gvr gvr2 = (gvr)this.MessageDelegator.h(4355, this.GUID, this.MessageDelegator.getGUID());
        gvr2.gdA = 1;
        gvr2.atv = ldv2;
        gvr2.jsw = false;
        this.MessageDelegator.F(gvr2);
    }
}

