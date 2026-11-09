/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
public class lj
extends btk {
    private ldv atu = null;
    private li ZI = null;
    private ldv atv = null;
    private fhk atw = null;

    public lj(li li2) {
        this.ZI = li2;
    }

    public void bH(ldv ldv2) {
        if (this.atu != null) {
            this.ZI.aQ().c(mcb.ury.bD(new Object[0]));
            return;
        }
        this.atu = ldv2;
        fhz fhz2 = (fhz)this.MessageDelegator.h(23837, this.getGUID(), this.ZI.oS());
        this.MessageDelegator.F(fhz2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 23838: {
                this.a((fia)dxq2);
                break;
            }
            case 23834: {
                this.a((fhl)dxq2);
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

    private void a(fia fia2) {
        assert (this.atu != null);
        if (fia2.iMJ >= fia2.iMK) {
            this.ZI.aQ().c(mcb.urz.bD(new Object[0]));
            this.atu = null;
            return;
        }
        if (!this.ZI.oO()) {
            this.ZI.aQ().c(mcb.urA.bD(new Object[0]));
            this.atu = null;
            return;
        }
        fhk fhk2 = (fhk)this.MessageDelegator.h(23833, this.getGUID(), this.atu);
        fhk2.aGQ = this.ZI.oS();
        fhk2.atd = this.ZI.oU();
        fhk2.YU = this.ZI.aQ().iP();
        fhk2.YV = this.ZI.aQ().iR();
        fhk2.diQ = this.ZI.aQ().getGUID();
        this.MessageDelegator.F(fhk2);
    }

    private void a(fhl fhl2) {
        assert (this.atu != null);
        switch (fhl2.ew) {
            case 1: {
                this.ZI.aQ().c(mcb.urB.bD(new Object[0]));
                break;
            }
            case 4: {
                this.ZI.aQ().c(mcb.urE.bD(new Object[0]));
                this.ZI.a(cgz.ezw);
                break;
            }
            case 3: {
                this.ZI.aQ().c(mcb.urC.bD(new Object[0]));
                break;
            }
            case 2: {
                this.ZI.aQ().c(mcb.urD.bD(new Object[0]));
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
        this.ZI.receiveMessage(fhl2);
        this.atu = null;
    }

    protected void a(fhk fhk2) {
        if (this.atw != null) {
            fhl fhl2 = (fhl)this.MessageDelegator.h(23834, this.getGUID(), fhk2.aO());
            this.MessageDelegator.b(fhk2, fhl2);
            fhl2.ew = 3;
            this.MessageDelegator.F(fhl2);
            return;
        }
        this.atw = fhk2;
        this.b(fhk2);
    }

    private void bJ(ldv ldv2) {
        assert (ldv2 != null);
        gvr gvr2 = (gvr)this.MessageDelegator.h(4355, this.GUID, this.MessageDelegator.getGUID());
        gvr2.gdA = 1;
        gvr2.atv = ldv2;
        gvr2.jsw = false;
        this.MessageDelegator.F(gvr2);
    }

    private void l(double d2) {
        gvm gvm2 = (gvm)this.MessageDelegator.h(4353, this.GUID, this.MessageDelegator.getGUID());
        gvm2.gdA = 1;
        gvm2.Rs = this.GUID;
        gvm2.oV = 0.0;
        gvm2.eNV = d2;
        this.MessageDelegator.F(gvm2);
    }

    private void a(gvn gvn2) {
        assert (this.atv == null);
        if (gvn2.atv == null) {
            return;
        }
        this.atv = gvn2.atv;
    }

    private void a(gvt gvt2) {
        assert (this.atv != null);
        if (gvt2.atv == null) {
            assert (false);
            return;
        }
        if (!this.atv.equals(gvt2.atv)) {
            assert (false);
            return;
        }
        if (this.atw == null) {
            return;
        }
        this.a(this.atw, 3);
        this.atv = null;
    }

    private void a(fhk fhk2, int n) {
        fhl fhl2 = (fhl)this.MessageDelegator.h(23834, this.ZI.getGUID(), fhk2.aO());
        this.MessageDelegator.b(fhk2, fhl2);
        fhl2.ew = n;
        this.MessageDelegator.F(fhl2);
        this.atw = null;
    }

    private void b(fhk fhk2) {
        double d2 = this.MessageDelegator.arc().rgz + 60.0;
        ldv ldv2 = lcr.p((ldv)lcr.aTZ, (int)this.ZI.aQ().jr(), (int)this.ZI.aQ().getGUID().enw());
        if (!lcw.qOR) {
            String[] stringArray = bdp.dbo;
            String string = fhk2.YU + " " + fhk2.YV + " invites you to live in his house located in " + fhk2.atd;
            bdr bdr2 = new bdr(this.GUID, d2, string, stringArray);
            bdr2.Title = "";
            est est2 = (est)this.MessageDelegator.h(18179, this.GUID, ldv2);
            est2.iBv = bdr2;
            this.MessageDelegator.F(est2);
        } else {
            bdt bdt2 = new bdt();
            bdt2.bsD = d2;
            bdt2.dbD = bds.dbB.ordinal();
            bdt2.ev = this.GUID;
            bdt2.dbE = lwq.tgb.bD(fhk2.YU + " " + fhk2.YV, fhk2.atd);
            bdt2.ed = bdu.dbH.ordinal();
            bdt2.Ri = fhk2.diQ;
            esu esu2 = (esu)this.MessageDelegator.h(18183, this.getGUID(), ldv2);
            esu2.iBw = bdt2;
            this.MessageDelegator.F(esu2);
        }
        this.l(60.0);
    }

    private void b(esv esv2) {
        if (esv2.iBx == null) {
            return;
        }
        if (this.atv == null) {
            return;
        }
        if (this.atw == null) {
            return;
        }
        this.bJ(this.atv);
        this.atv = null;
        bdv bdv2 = esv2.iBx;
        if (bdv2 instanceof bdw) {
            int n = ((bdw)bdv2).dbU;
            bdp.a a2 = bdp.a.getTenantAcceptanceButtonType(n);
            if (a2 == null) {
                a2 = bdp.a.dbu;
            }
            switch (a2) {
                case dbt: {
                    this.ZI.bI(this.atw.aGQ);
                    this.a(this.atw, 4);
                    return;
                }
                case dbu: {
                    this.a(this.atw, 3);
                    break;
                }
                case dbv: {
                    if (this.ZI.aQ() != null) {
                        this.ZI.aQ().c(this.atw.diQ, this.atw.YV + " " + this.atw.YU);
                    }
                    this.a(this.atw, 3);
                    break;
                }
                default: {
                    this.a(this.atw, 3);
                    break;
                }
            }
        } else if (bdv2 instanceof bdx) {
            this.a(this.atw, 3);
        } else {
            this.a(this.atw, 3);
        }
    }
}

