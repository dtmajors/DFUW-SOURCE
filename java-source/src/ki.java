/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 *  lqf
 */
public class ki
extends jk {
    private static final String TC = "SFConsoleCommandHandlerGMS";

    @Override
    public void nU() {
        this.a(a.aoJ.toString().toLowerCase(), hc.aaQ, lqf.rXS, mhs.BOOLEAN);
        this.a(a.aoK.toString().toLowerCase(), hc.aaA, lqf.rXT, mhs.BOOLEAN);
        this.a(a.aoN.toString().toLowerCase(), hc.aaQ, lqf.rXZ, mhs.BOOLEAN);
        this.a(a.aoL.toString().toLowerCase(), hc.aaA, lqf.rXU, mhs.STRING);
        this.a(a.aoM.toString().toLowerCase(), hc.aaA, lqf.rXV);
        this.a(a.aoO.toString().toLowerCase(), hc.aaP, lqf.sbw);
        this.a(a.aoQ.toString().toLowerCase(), true, hc.aaP, lqf.sbx, mhs.INTEGER, mhs.STRING);
        this.a(a.aoP.toString().toLowerCase(), true, hc.aaP, lqf.sby, mhs.STRING);
        this.a(a.aoR.toString().toLowerCase(), true, hc.aaP, lqf.sbz, mhs.STRING, mhs.STRING);
        this.a(a.aoS.toString().toLowerCase(), hc.aaP, lqf.sbA, mhs.BOOLEAN);
        this.a(a.aoT.toString().toLowerCase(), hc.aaE, lqf.sbJ, mhs.INTEGER, mhs.STRING, mhs.INTEGER, mhs.INTEGER);
        this.a(a.aoU.toString().toLowerCase(), hc.aaE, lqf.sbK, mhs.INTEGER);
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bu(jj2.akV);
        if (a2 == null) {
            jj2.b(lqd.rXd.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case aoJ: {
                this.au(jj2);
                break;
            }
            case aoK: {
                this.aQ(jj2);
                break;
            }
            case aoL: {
                this.aS(jj2);
                break;
            }
            case aoM: {
                this.aT(jj2);
                break;
            }
            case aoN: {
                this.aR(jj2);
                break;
            }
            case aoO: {
                this.aU(jj2);
                break;
            }
            case aoQ: {
                this.aO(jj2);
                break;
            }
            case aoP: {
                this.aM(jj2);
                break;
            }
            case aoR: {
                this.aN(jj2);
                break;
            }
            case aoS: {
                this.aP(jj2);
                break;
            }
            case aoT: {
                this.aV(jj2);
                break;
            }
            case aoU: {
                this.aW(jj2);
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }

    private void aM(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = jj2.getArgCount() == 2 ? ((mhr)jj2.cA((int)1)).Value : "";
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 61;
        ern2.YL = string;
        this.MessageDelegator.F(ern2);
    }

    private void aN(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        int n = jj2.getArgCount() == 2 ? cg.b.getValueByName(((mhr)jj2.cA((int)1)).Value).ordinal() : 0;
        fgo fgo2 = (fgo)this.MessageDelegator.h(29447, this.GUID, lcr.qAL);
        fgo2.r(lzj.tWx.bD(string));
        fgo2.GH(n);
        this.MessageDelegator.F(fgo2);
    }

    private void aO(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        int n = ((mho)jj2.cA((int)0)).PC;
        String string = jj2.getArgCount() == 2 ? ((mhr)jj2.cA((int)1)).Value : "";
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 62;
        ern2.YL = string;
        ern2.izG = n;
        this.MessageDelegator.F(ern2);
    }

    private void aP(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 64;
        ern2.izI = jj2.getArgCount() == 1 ? ((mhl)jj2.cA((int)0)).Pp : false;
        this.MessageDelegator.F(ern2);
    }

    private a bu(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    private void au(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 2;
        ern2.izI = ((mhl)jj2.cA((int)0)).Pp;
        ern2.YL = null;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void aQ(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 9;
        ern2.izI = ((mhl)jj2.cA((int)0)).Pp;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void aR(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 45;
        ern2.izI = ((mhl)jj2.cA((int)0)).Pp;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void aS(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        int n = this.ResourceTree.getType(string);
        if (n <= 0) {
            lfn.b(5, TC, "playMonster() ResourceName='" + string + "' is invalid.");
            jj2.b(lqd.rXo.bD(string), true);
            return;
        }
        if (!this.ResourceTree.isDescendant(n, cug.fgD)) {
            lfn.b(5, TC, "playMonster() ResourceName '" + string + "' is not a monster.");
            jj2.b(lqd.rXo.bD(string), true);
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 24;
        ern2.izG = n;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void aT(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 25;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void aU(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        gou gou2 = (gou)this.MessageDelegator.h(11062, this.GUID, this.nW().getGUID());
        this.MessageDelegator.F(gou2);
        jj2.nT();
    }

    private void aV(jj jj2) {
        int n = ((mho)jj2.cA((int)0)).PC;
        String string = ((mhr)jj2.cA((int)1)).Value;
        int n2 = ((mho)jj2.cA((int)2)).PC;
        int n3 = ((mho)jj2.cA((int)3)).PC;
        jjm jjm2 = null;
        try {
            jjm2 = jjm.valueOf(string.toUpperCase());
        }
        catch (Exception exception) {
            jj2.b(lqd.rXy.bD(" Marker Type " + string + " does not exist"), true);
            return;
        }
        bmy bmy2 = new bmy();
        bmy2.hG(n);
        bmy2.li(jjm2.ordinal());
        bmy2.c(new ljq(n2, 0.0f, n3));
        ffa ffa2 = (ffa)this.MessageDelegator.h(2582, this.GUID, lcr.qEF);
        ffa2.Eh(0);
        ffa2.a(new bmy[]{bmy2});
        this.MessageDelegator.E(ffa2);
        jj2.nT();
    }

    private void aW(jj jj2) {
        int n = ((mho)jj2.cA((int)0)).PC;
        bmy bmy2 = new bmy();
        bmy2.hG(n);
        ffa ffa2 = (ffa)this.MessageDelegator.h(2582, this.GUID, lcr.qEF);
        ffa2.Eh(1);
        ffa2.a(new bmy[]{bmy2});
        this.MessageDelegator.E(ffa2);
        jj2.nT();
    }
}

