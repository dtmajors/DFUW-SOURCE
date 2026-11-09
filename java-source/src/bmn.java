/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  lcr
 *  lcw
 */
public class bmn
extends bke {
    private fda dvx = null;
    private cex dvy = null;
    private ldv Ts = null;
    private int RB = 0;
    private ldv atv = null;

    public bmn() {
        this.dsy = bkd.a.drT;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        assert (fdo2 != null);
        this.dvx = (fda)fdo2;
        this.dvy = (cex)this.d(fdo2.akX);
        if (this.dvy == null) {
            lfn.b(5, "SFRecallOfPlayerFO", "doFunction() TargetObject " + fdo2.akX + " was not found.");
            this.Vc();
            return;
        }
        if (lcw.enb()) {
            if (!ctg.feM) {
                lfn.b(5, "SFRecallOfPlayerFO", "doFunction() Admin commands are currently disabled in standalone.");
                this.Vc();
                return;
            }
            fux fux2 = (fux)this.MessageDelegator.h(5639, this.GUID, this.GUID);
            fux2.Ri = this.dvy.mA().getGUID();
            this.MessageDelegator.F(fux2);
            return;
        }
        fux fux3 = (fux)this.MessageDelegator.h(5639, this.GUID, lcr.hac);
        fux3.bc = this.dvx.YL;
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
            lfn.b(5, "SFRecallOfPlayerFO", "handleConfirmationResponse() TimerGUID is null.");
            return;
        }
        if (esv2.iBx == null) {
            lfn.b(5, "SFRecallOfPlayerFO", "handleConfirmationResponse() ConfirmationRespose is null.");
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
                    this.mQ();
                    break;
                }
                case dbu: {
                    break;
                }
                default: {
                    lfn.b(5, "SFRecallOfPlayerFO", "handleConfirmationResponse() Invalid buttontype provided: " + (Object)((Object)a2));
                    break;
                }
            }
        } else if (!(bdv2 instanceof bdx)) {
            lfn.b(5, "SFRecallOfPlayerFO", "handleConfirmationResponse() Invalid response received: " + bdv2);
        }
        this.Vc();
    }

    private void b(fuu fuu2) {
        if (fuu2.iXv == null) {
            lfn.b(5, "SFRecallOfPlayerFO", "handleObjectInfoGUIDResponseMessage() ClientPhysicalObjectGUID is null.");
            this.Vc();
            return;
        }
        double d2 = this.MessageDelegator.arc().rgz + 15.0;
        int n = fuu2.iXv.ib();
        ldv ldv2 = lcr.p((ldv)lcr.aTZ, (int)n, (int)this.Ts.enw());
        if (!lcw.qOR) {
            String string = "Would you like to be recalled by a game master.";
            String[] stringArray = bdp.dbk;
            bdr bdr2 = new bdr(this.GUID, d2, "Would you like to be recalled by a game master.", stringArray);
            bdr2.Title = "";
            est est2 = (est)this.MessageDelegator.h(18179, this.GUID, ldv2);
            est2.iBv = bdr2;
            this.MessageDelegator.F(est2);
        } else {
            bdt bdt2 = new bdt();
            bdt2.bsD = d2;
            bdt2.dbD = bds.dbB.ordinal();
            bdt2.ev = this.GUID;
            bdt2.dbE = lwq.tgh.bD(new Object[0]);
            bdt2.ed = bdu.dbJ.ordinal();
            bdt2.Ri = lcr.tQ((ldv)this.dvx.aYF);
            esu esu2 = (esu)this.MessageDelegator.h(18183, this.getGUID(), ldv2);
            esu2.iBw = bdt2;
            this.MessageDelegator.F(esu2);
        }
        this.l(15.0);
    }

    private void a(fux fux2) {
        if (fux2.Ri == null) {
            lfn.b(5, "SFRecallOfPlayerFO", "handleObjectInfoNameLookupMessage() PSOGUID is null.");
            this.Vc();
            return;
        }
        this.Ts = lcr.tP((ldv)fux2.Ri);
        if (this.dvx.iJI) {
            this.mQ();
        } else {
            fut fut2 = (fut)this.MessageDelegator.h(5635, this.GUID, fux2.Ri);
            fut2.iXt = 64;
            this.MessageDelegator.F(fut2);
        }
    }

    private void a(gvn gvn2) {
        assert (this.atv == null);
        if (gvn2.atv == null) {
            lfn.b(5, "SFRecallOfPlayerFO", "handleTimerCreateResponse() TimerGUID is null. Timer could not be created.");
            this.Vc();
            return;
        }
        this.atv = gvn2.atv;
    }

    private void a(gvt gvt2) {
        assert (this.atv != null);
        if (gvt2.atv == null) {
            lfn.b(5, "SFRecallOfPlayerFO", "handleTimerTimeoutMessage() TimerGUID is null.");
            this.Vc();
            return;
        }
        if (!this.atv.equals(gvt2.atv)) {
            lfn.b(5, "SFRecallOfPlayerFO", "handleTimerTimeoutMessage() TimerGUID is not equal to Message.TimerGUID.");
            lfn.b(5, "SFRecallOfPlayerFO", "handleTimerTimeoutMessage() TimerGUID=" + this.atv + " Message.TimerGUID=" + gvt2.atv);
            this.Vc();
            return;
        }
        this.atv = null;
        this.Vc();
    }

    private void mQ() {
        ljq ljq2 = this.dvy.aAG().av();
        gqt gqt2 = (gqt)this.MessageDelegator.h(11052, this.GUID, this.Ts);
        gqt2.a(hx.a.aeK);
        gqt2.Position = ljq2;
        gqt2.jpN = true;
        this.MessageDelegator.F(gqt2);
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

