/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  cug
 *  cxd
 *  ha
 *  lcr
 *  lcw
 *  mcs
 */
public class bmq
extends bke {
    private fdq dvA = null;
    private cex dvB = null;
    private ldv dvC = null;
    private ldv hA = null;

    public bmq() {
        this.dsy = bkd.a.dsn;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        assert (fdo2 != null);
        this.dvA = (fdq)fdo2;
        this.dvB = (cex)this.d(fdo2.aZG);
        if (this.dvB == null) {
            lfn.b(5, "SFSummonPlayerFO", "doFunction() SourceObject " + fdo2.aZG + " was not found.");
            this.y(fdo2.aO(), false);
            this.Vc();
            return;
        }
        ha ha2 = this.dvB.mA();
        if (ha2 == null || !ha2.iY()) {
            lfn.b(5, "SFSummonPlayerFO", "doFunction() SourceObject " + fdo2.aZG + " is not logged in.");
            this.y(fdo2.aO(), false);
            this.Vc();
            return;
        }
        this.hA = fdo2.aO();
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

    private void a(fux fux2) {
        if (fux2.Ri == null) {
            lfn.b(5, "SFSummonPlayerFO", "handleObjectInfoNameLookupMessage() PSOGUID is null.");
            efh efh2 = (efh)this.MessageDelegator.h(12837, this.getGUID(), this.getGUID());
            efh2.DR(5);
            this.MessageDelegator.I(efh2);
            this.y(this.hA, false);
            this.Vc();
            return;
        }
        if (this.dvB.mA() == null) {
            this.y(this.hA, false);
            this.Vc();
            return;
        }
        this.dvC = fux2.Ri;
        if (this.dvC.equals(this.dvB.mA().getGUID())) {
            efh efh3 = (efh)this.MessageDelegator.h(12837, this.getGUID(), this.getGUID());
            efh3.DR(8);
            this.MessageDelegator.I(efh3);
            this.y(this.hA, false);
            this.Vc();
            return;
        }
        if (this.dvA.aYC == cxd.fHh && !this.dvB.mA().kH().aM(this.dvC) && !this.dvB.mA().kH().aN(this.dvC)) {
            efh efh4 = (efh)this.MessageDelegator.h(12837, this.getGUID(), this.getGUID());
            efh4.DR(13);
            this.MessageDelegator.I(efh4);
            this.y(this.hA, false);
            this.Vc();
            return;
        }
        if (this.dvB.aAG() == null) {
            this.y(this.hA, false);
            this.Vc();
            return;
        }
        efg efg2 = (efg)this.MessageDelegator.h(12836, this.getGUID(), this.dvC);
        efg2.c(this.dvB.aAG().azb());
        efg2.fm(this.dvB.mA().iU());
        efg2.oH(this.dvB.mA().getGUID());
        this.MessageDelegator.F(efg2);
    }

    private void a(efh efh2) {
        ha ha2 = this.dvB.mA();
        int n = efh2.getResult();
        boolean bl2 = false;
        switch (n) {
            case 4: {
                this.dvB.c(mcs.uzx.bD(this.dvA.iKc));
                bl2 = true;
                break;
            }
            case 1: {
                this.dvB.c(mcs.uzy.bD(this.dvA.iKc));
                break;
            }
            case 3: {
                this.dvB.c(mcs.uzz.bD(this.dvA.iKc));
                break;
            }
            case 5: {
                this.dvB.c(mcs.uzA.bD(this.dvA.iKc));
                break;
            }
            case 0: {
                this.dvB.c(mcs.tDw.bD(this.dvA.iKc));
                break;
            }
            case 2: {
                this.dvB.c(mcs.uzB.bD(this.dvA.iKc));
                break;
            }
            case 6: {
                this.dvB.c(mcs.uzC.bD(this.dvA.iKc));
                break;
            }
            case 7: {
                this.dvB.c(mcs.uzD.bD(this.dvA.iKc));
                break;
            }
            case 8: {
                this.dvB.c(mcs.uzE.bD(this.dvA.iKc));
                break;
            }
            case 9: {
                this.dvB.c(mcs.uzF.bD(this.dvA.iKc));
                break;
            }
            case 10: {
                this.dvB.c(mcs.uzG.bD(this.dvA.iKc));
                break;
            }
            case 11: {
                this.dvB.c(mcs.uzG.bD(this.dvA.iKc));
                break;
            }
            case 12: {
                this.dvB.c(mcs.uzI.bD(this.dvA.iKc, cug.fww));
                break;
            }
            case 13: {
                this.dvB.c(mcs.uzA.bD(this.dvA.iKc));
                break;
            }
            default: {
                this.dvB.c(mcs.uzA.bD(this.dvA.iKc));
            }
        }
        this.y(this.hA, bl2);
        this.Vc();
    }

    private void y(ldv ldv2, boolean bl2) {
        fcs fcs2 = (fcs)this.MessageDelegator.h(9219, this.getGUID(), ldv2);
        fcs2.iJq = bl2;
        fcs2.bst = bkd.drf;
        this.MessageDelegator.F(fcs2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5639: {
                this.a((fux)dxq2);
                break;
            }
            case 12837: {
                this.a((efh)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}

