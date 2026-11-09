/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lqf
 */
public class ko
extends jk {
    private String aqA = null;

    @Override
    public void nU() {
        this.a(a.aqC.toString().toLowerCase(), hc.aaP, lqf.scq);
        this.a(a.aqD.toString().toLowerCase(), hc.aaP, lqf.scr);
        this.a(a.aqE.toString().toLowerCase(), hc.aaP, lqf.scs);
        this.a(a.aqF.toString().toLowerCase(), true, hc.aaP, lqf.sct, mhs.STRING);
        this.a(a.aqG.toString().toLowerCase(), true, hc.aaP, lqf.scu, mhs.STRING);
        this.a(a.aqH.toString().toLowerCase(), hc.aaP, lqf.scv, mhs.STRING);
        this.a(a.aqI.toString().toLowerCase(), hc.aaP, lqf.scw, mhs.STRING);
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bA(jj2.akV);
        if (a2 == null) {
            jj2.b(lqg.scy.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case aqC: {
                this.a(jj2, a2.ordinal(), 2);
                break;
            }
            case aqD: {
                this.a(jj2, a2.ordinal(), 1);
                break;
            }
            case aqE: {
                this.a(jj2, a2.ordinal(), 3);
                break;
            }
            case aqF: {
                this.a(jj2, a2.ordinal(), 4);
                break;
            }
            case aqG: {
                this.a(jj2, a2.ordinal(), 5);
                break;
            }
            case aqH: {
                String string = ((mhr)jj2.cA((int)0)).Value;
                hso.cxK().cxP().cyI().sn(string);
                break;
            }
            case aqI: {
                String string = ((mhr)jj2.cA((int)0)).Value;
                hso.cxK().cxP().cyI().so(string);
                break;
            }
        }
    }

    private a bA(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    private void a(jj jj2, int n, int n2) {
        if (hso.cxK().bAn() == null) {
            return;
        }
        if (hso.cxK().bAn().Tr == null) {
            return;
        }
        ldv ldv2 = hso.cxK().bAn().Tr;
        gcy gcy2 = (gcy)this.MessageDelegator.h(10257, this.getGUID(), ldv2);
        gcy2.sk(n);
        gcy2.IN(n2);
        if (jj2.getArgCount() == 1) {
            this.aqA = ((mhr)jj2.cA((int)0)).Value;
            gcy2.kT(this.aqA);
        }
        this.MessageDelegator.F(gcy2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        block0 : switch (dxq2.bEz()) {
            case 10258: {
                gcz gcz2 = (gcz)dxq2;
                egy egy2 = (egy)this.MessageDelegator.h(2305, this.getGUID(), lcr.qCM);
                egy2.b(aud.b.caO);
                egy2.ccR = 0;
                if (gcz2.aVk() > a.values().length || gcz2.aVk() < 0) {
                    assert (false);
                    return;
                }
                a a2 = a.values()[gcz2.aVk()];
                switch (a2) {
                    case aqC: {
                        egy2.ipJ = new lip[]{new ljg("Active Quests:")};
                        this.MessageDelegator.F(egy2);
                        if (gcz2.bTF() == null) break block0;
                        for (int i = 0; i < gcz2.bTF().length; ++i) {
                            egy2 = (egy)this.MessageDelegator.h(2305, this.getGUID(), lcr.qCM);
                            egy2.b(aud.b.caO);
                            egy2.ccR = 0;
                            egy2.ipJ = new lip[]{new ljg(gcz2.bTF()[i])};
                            this.MessageDelegator.F(egy2);
                        }
                        break block0;
                    }
                    case aqD: {
                        egy2.ipJ = new lip[]{new ljg("Solved Quests:")};
                        this.MessageDelegator.F(egy2);
                        if (gcz2.bTF() == null) break block0;
                        for (int i = 0; i < gcz2.bTF().length; ++i) {
                            egy2 = (egy)this.MessageDelegator.h(2305, this.getGUID(), lcr.qCM);
                            egy2.b(aud.b.caO);
                            egy2.ccR = 0;
                            egy2.ipJ = new lip[]{new ljg(gcz2.bTF()[i])};
                            this.MessageDelegator.F(egy2);
                        }
                        break block0;
                    }
                    case aqE: {
                        egy2.ipJ = new lip[]{new ljg("Active Vendors:")};
                        this.MessageDelegator.F(egy2);
                        if (gcz2.bTF() == null) break block0;
                        for (int i = 0; i < gcz2.bTF().length; ++i) {
                            egy2 = (egy)this.MessageDelegator.h(2305, this.getGUID(), lcr.qCM);
                            egy2.b(aud.b.caO);
                            egy2.ccR = 0;
                            egy2.ipJ = new lip[]{new ljg(gcz2.bTF()[i])};
                            this.MessageDelegator.F(egy2);
                        }
                        break block0;
                    }
                    case aqF: {
                        egy2.ipJ = new lip[]{new ljg("Quests on Vendor :" + this.aqA)};
                        this.MessageDelegator.F(egy2);
                        if (gcz2.bTF() == null) break block0;
                        for (int i = 0; i < gcz2.bTF().length; ++i) {
                            egy2 = (egy)this.MessageDelegator.h(2305, this.getGUID(), lcr.qCM);
                            egy2.b(aud.b.caO);
                            egy2.ccR = 0;
                            egy2.ipJ = new lip[]{new ljg(gcz2.bTF()[i])};
                            this.MessageDelegator.F(egy2);
                        }
                        break block0;
                    }
                    case aqG: {
                        egy2.ipJ = new lip[]{new ljg("Quest Details for :" + this.aqA)};
                        this.MessageDelegator.F(egy2);
                        egy2 = (egy)this.MessageDelegator.h(2305, this.getGUID(), lcr.qCM);
                        egy2.b(aud.b.caO);
                        egy2.ccR = 0;
                        egy2.ipJ = new lip[]{new ljg("VendorName: " + gcz2.getVendorName()), new ljg("QuestLevel: " + gcz2.getLevel())};
                        this.MessageDelegator.F(egy2);
                        break;
                    }
                    default: {
                        assert (false) : "Unknown";
                        break block0;
                    }
                }
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }
}

