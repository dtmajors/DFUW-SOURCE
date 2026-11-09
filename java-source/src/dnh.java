/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class dnh
extends btk {
    public void a(dpd dpd2, dnl dnl2, brv brv2) {
        if (dnl2 instanceof dnw) {
            dnw dnw2 = (dnw)dnl2;
            ldv ldv2 = lcr.tQ((ldv)dnw2.gLf);
            fti fti2 = (fti)this.MessageDelegator.h(30212, this.getGUID(), ldv2);
            fti2.gLc = dnw2.gLd;
            fti2.cZh = dnl2.gKS;
            fti2.dhr = dnl2.gKT;
            fti2.iVI = brv2;
            this.MessageDelegator.I(fti2);
        }
        this.a(dnl2, true);
        this.MessageDelegator.hd(dpd2.getGUID());
    }

    public void a(dpd dpd2, dnl dnl2) {
        this.a(dnl2, true);
        this.MessageDelegator.hd(dpd2.getGUID());
    }

    public void b(dpd dpd2, dnl dnl2) {
        lfn.b(5, "SFTransactionManager", "notifyTransactionFailed() Transaction " + dnl2.gKR + " failed.");
        lfn.b(5, "SFTransactionManager", "notifyTransactionFailed() " + dnl2.brB());
        this.a(dnl2, false);
        this.MessageDelegator.hd(dpd2.getGUID());
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11265: {
                this.a((gxx)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private dpd AX(int n) {
        dpd dpd2 = null;
        switch (n) {
            case 1: {
                dpd2 = new doq();
                break;
            }
            case 2: {
                dpd2 = new dos();
                break;
            }
            case 3: {
                dpd2 = new dov();
                break;
            }
            case 4: {
                dpd2 = new dou();
                break;
            }
            case 5: {
                dpd2 = new dow();
                break;
            }
            case 6: {
                dpd2 = new dox();
                break;
            }
            case 7: {
                dpd2 = new dpc();
                break;
            }
            case 8: {
                dpd2 = new doy();
                break;
            }
            case 9: {
                dpd2 = new dpa();
                break;
            }
            case 10: {
                dpd2 = new doz();
                break;
            }
            case 11: {
                dpd2 = new dpb();
                break;
            }
            case 12: {
                dpd2 = new dpf();
                break;
            }
            case 13: {
                dpd2 = new dpe();
                break;
            }
            case 14: {
                dpd2 = new dor();
                break;
            }
            case 15: {
                dpd2 = new dot();
                break;
            }
            default: {
                lfn.b(5, "SFTransactionManager", "createTransactionPerformer() Invalid TransactionType provided: " + n);
                return null;
            }
        }
        return dpd2;
    }

    private void a(gxx gxx2) {
        dnl dnl2 = gxx2.gMn;
        if (dnl2 == null) {
            lfn.b(5, "SFTransactionManager", "handleTransactionRequest() TransactionInfo is null.");
            return;
        }
        if (!dnl2.validate()) {
            lfn.b(5, "SFTransactionManager", "handleTransactionRequest() The content of TransactionInfo is invalid.");
            this.a(dnl2, false);
            return;
        }
        dpd dpd2 = this.AX(dnl2.brA());
        if (dpd2 == null) {
            lfn.b(5, "SFTransactionManager", "handleTransactionRequest() TransactionPerformer could not be created.");
            lfn.b(5, "SFTransactionManager", "handleTransactionRequest() TransactionType='" + dnl2.brC() + "'");
            this.a(dnl2, false);
            return;
        }
        dpd2.setGUID(this.MessageDelegator.bzv());
        dpd2.a(this);
        dpd2.b(dnl2);
        this.MessageDelegator.a(dpd2);
    }

    private void a(dnl dnl2, boolean bl) {
        assert (dnl2 != null);
        gxy gxy2 = (gxy)this.MessageDelegator.h(11266, this.GUID, dnl2.ec);
        gxy2.gKN = dnl2;
        gxy2.iPj = bl;
        this.MessageDelegator.E(gxy2);
    }
}

