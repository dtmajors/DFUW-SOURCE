/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcy
 */
public class avk
extends aul {
    private static final int ckR = 0;
    private static final int ckS = 1;
    private static final int ckT = 2;
    private static final int ckU = 3;
    private static final int ckV = 4;
    private static final int ckW = 5;
    private static final int cdu = 6;
    private static final egg[] ckX = new egg[0];
    private static final egg[] ckY = new egg[0];
    private static final egg[] ckZ = new egg[0];
    private static final egg[] cla = new egg[]{new egg("VendorName", egg.a.ipq, true, lcy.qRr)};
    private static final egg[] clb = new egg[]{new egg("QuestName", egg.a.ipq, true, lcy.qRr)};
    private static final egg[] clc = new egg[]{new egg("CheckRequirements", egg.a.ipq, true, lcy.qRr)};
    private static final cqi[] bui = new cqi[0];
    private boolean Initialized;
    public static final amd cld = new amd(avk.class, aul.cdc, "ChatProxyForQuest", bui, null);
    private String ayB = null;
    private String aGb = null;
    private String cle = null;

    public avk() {
        super(cld);
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaP, 0, "quest_list_active", lcy.qTl, ckX);
        this.a(hc.aaP, 1, "quest_list_solved", lcy.qTn, ckY);
        this.a(hc.aaP, 2, "quest_list_vendors", lcy.qTn, ckZ);
        this.a(hc.aaP, 3, "quest_list_quest_on_vendor", lcy.qTn, cla);
        this.a(hc.aaP, 5, "quest_list_quest_details", lcy.qTn, clb);
        this.a(hc.aaP, 4, "quest_set_quest_reqs_check", lcy.qTn, clc);
    }

    @Override
    protected final void FG() {
        assert (this.Initialized);
        this.We();
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected void b(int n, Object[] objectArray, String string) {
        assert (this.Initialized);
        switch (n) {
            case 0: {
                this.io(0);
                return;
            }
            case 1: {
                this.io(1);
                return;
            }
            case 2: {
                this.io(2);
                return;
            }
            case 3: {
                if (objectArray.length >= 1) {
                    this.ayB = (String)objectArray[0];
                }
                this.io(3);
                return;
            }
            case 5: {
                if (objectArray.length >= 1) {
                    this.aGb = (String)objectArray[0];
                }
                this.io(5);
                return;
            }
            case 4: {
                if (objectArray.length >= 1) {
                    this.cle = objectArray[0].toString();
                }
                this.io(4);
                return;
            }
        }
        super.b(n, objectArray, string);
    }

    private void io(int n) {
        gpq gpq2 = (gpq)this.e(11011, lcr.qzp);
        gpq2.sk(n);
        this.a(gpq2);
    }

    private void a(dsu dsu2) {
        assert (dsu2.Tr != null);
        gcy gcy2 = (gcy)this.MessageDelegator.h(10257, this.getGUID(), dsu2.Tr);
        gcy2.sk(0);
        gcy2.IN(2);
        this.MessageDelegator.F(gcy2);
    }

    private void b(dsu dsu2) {
        assert (dsu2.Tr != null);
        gcy gcy2 = (gcy)this.MessageDelegator.h(10257, this.getGUID(), dsu2.Tr);
        gcy2.sk(1);
        gcy2.IN(1);
        this.MessageDelegator.F(gcy2);
    }

    private void c(dsu dsu2) {
        assert (dsu2.Tr != null);
        gcy gcy2 = (gcy)this.MessageDelegator.h(10257, this.getGUID(), dsu2.Tr);
        gcy2.sk(2);
        gcy2.IN(3);
        this.MessageDelegator.F(gcy2);
    }

    private void d(dsu dsu2) {
        assert (dsu2.Tr != null);
        gcy gcy2 = (gcy)this.MessageDelegator.h(10257, this.getGUID(), dsu2.Tr);
        gcy2.sk(3);
        if (this.ayB != null) {
            gcy2.kT(this.ayB);
        }
        gcy2.IN(4);
        this.MessageDelegator.F(gcy2);
    }

    private void e(dsu dsu2) {
        assert (dsu2.Tr != null);
        gcy gcy2 = (gcy)this.MessageDelegator.h(10257, this.getGUID(), dsu2.Tr);
        gcy2.sk(5);
        if (this.aGb != null) {
            gcy2.kT(this.aGb);
        }
        gcy2.IN(5);
        this.MessageDelegator.F(gcy2);
    }

    private void f(dsu dsu2) {
        assert (dsu2.Tr != null);
        gcy gcy2 = (gcy)this.MessageDelegator.h(10257, this.getGUID(), dsu2.Tr);
        gcy2.sk(4);
        gcy2.kT(String.valueOf(this.cle));
        gcy2.IN(6);
        this.MessageDelegator.F(gcy2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        block0 : switch (dxq2.bEz()) {
            case 11012: {
                gpr gpr2 = (gpr)dxq2;
                switch (gpr2.aVk()) {
                    case 0: {
                        this.a(gpr2.alW);
                        break block0;
                    }
                    case 1: {
                        this.b(gpr2.alW);
                        break block0;
                    }
                    case 2: {
                        this.c(gpr2.alW);
                        break block0;
                    }
                    case 3: {
                        this.d(gpr2.alW);
                        break block0;
                    }
                    case 5: {
                        this.e(gpr2.alW);
                        break block0;
                    }
                    case 4: {
                        this.f(gpr2.alW);
                        break block0;
                    }
                }
                assert (false) : "Unknown Tag";
                break;
            }
            case 10258: {
                gcz gcz2 = (gcz)dxq2;
                egy egy2 = (egy)this.MessageDelegator.h(2305, this.getGUID(), lcr.qCM);
                egy2.b(aud.b.caO);
                egy2.ccR = 0;
                switch (gcz2.aVk()) {
                    case 0: {
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
                    case 1: {
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
                    case 2: {
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
                    case 3: {
                        egy2.ipJ = new lip[]{new ljg("Quests on Vendor :" + this.ayB)};
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
                    case 5: {
                        egy2.ipJ = new lip[]{new ljg("Quest Details for :" + this.aGb)};
                        this.MessageDelegator.F(egy2);
                        egy2 = (egy)this.MessageDelegator.h(2305, this.getGUID(), lcr.qCM);
                        egy2.b(aud.b.caO);
                        egy2.ccR = 0;
                        egy2.ipJ = new lip[]{new ljg("VendorName: " + gcz2.getVendorName()), new ljg("QuestLevel: " + gcz2.getLevel())};
                        this.MessageDelegator.F(egy2);
                        break;
                    }
                    case 4: {
                        egy2.ipJ = new lip[]{new ljg("Check Requirements :")};
                        this.MessageDelegator.F(egy2);
                        egy2 = (egy)this.MessageDelegator.h(2305, this.getGUID(), lcr.qCM);
                        egy2.b(aud.b.caO);
                        egy2.ccR = 0;
                        egy2.ipJ = new lip[]{new ljg(gcz2.bTF()[0])};
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

