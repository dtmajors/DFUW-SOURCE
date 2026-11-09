/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 *  lqf
 */
public class kh
extends jk {
    private static final String TC = "SFConsoleCommandHandlerGMCharacter";

    @Override
    public void a(jj jj2) {
        a a2 = this.bt(jj2.akV);
        if (a2 == null) {
            jj2.b(lqd.rXd.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case aos: {
                this.at(jj2);
                break;
            }
            case aon: {
                this.au(jj2);
                break;
            }
            case aoE: {
                this.av(jj2);
                break;
            }
            case aoA: {
                this.aw(jj2);
                break;
            }
            case aoB: {
                this.ax(jj2);
                break;
            }
            case aop: {
                this.az(jj2);
                break;
            }
            case aoq: {
                this.ay(jj2);
                break;
            }
            case aoC: {
                this.aA(jj2);
                break;
            }
            case aow: {
                this.aD(jj2);
                break;
            }
            case aox: {
                this.aE(jj2);
                break;
            }
            case aot: {
                this.aG(jj2);
                break;
            }
            case aou: {
                this.aH(jj2);
                break;
            }
            case aoo: {
                this.aF(jj2);
                break;
            }
            case aoD: {
                this.aI(jj2);
                break;
            }
            case aoy: {
                this.aJ(jj2);
                break;
            }
            case aov: {
                this.aK(jj2);
                break;
            }
            case aoz: {
                this.aB(jj2);
                break;
            }
            case aor: {
                this.aL(jj2);
                break;
            }
            case aoF: {
                this.aC(jj2);
                break;
            }
            case aoG: {
                this.as(jj2);
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }

    private void as(jj jj2) {
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.trim().equals("")) {
            lfn.b(5, this.getClass().getSimpleName(), "mutePlayer() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.trim().equals("")) {
            lfn.b(5, this.getClass().getSimpleName(), "mutePlayer() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        String string3 = string + " " + string2;
        int n = ((mho)jj2.cA((int)2)).PC;
        ehe ehe2 = (ehe)this.MessageDelegator.h(2351, this.GUID, lcr.qAL);
        ehe2.YL = string3;
        ehe2.ipT = n;
        this.MessageDelegator.F(ehe2);
        jj2.nT();
    }

    private void at(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        lej lej2 = this.bc(string);
        if (lej2 == null) {
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        ljq ljq2 = lcw.e((lej)lej2);
        if (ljq2 == null) {
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 29;
        ern2.Position = ljq2;
        ern2.izH = ((mhn)jj2.cA((int)1)).Pz;
        ern2.izF = ((mhr)jj2.cA((int)2)).Value;
        this.MessageDelegator.E(ern2);
        jj2.nT();
    }

    private void au(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.trim().equals("")) {
            lfn.b(5, TC, "setGodMode() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.trim().equals("")) {
            lfn.b(5, TC, "setGodMode() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        String string3 = string + " " + string2;
        boolean bl = ((mhl)jj2.cA((int)2)).Pp;
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 3;
        ern2.izI = bl;
        ern2.YL = string3;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void av(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.trim().equals("")) {
            lfn.b(5, TC, "setTrialAccountStatus() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.trim().equals("")) {
            lfn.b(5, TC, "setTrialAccountStatus() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        String string3 = string + " " + string2;
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = jj2.getArgCount() > 2 ? 46 : 47;
        ern2.izI = jj2.getArgCount() > 2 ? ((mhl)jj2.cA((int)2)).Pp : false;
        ern2.YL = string3;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void aw(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.trim().equals("")) {
            lfn.b(5, TC, "attachToPlayer() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.trim().equals("")) {
            lfn.b(5, TC, "attachToPlayer() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        String string3 = string + " " + string2;
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 21;
        ern2.YL = string3;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void ax(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 22;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void ay(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.trim().equals("")) {
            lfn.b(5, TC, "kickPlayer() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.trim().equals("")) {
            lfn.b(5, TC, "kickPlayer() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        String string3 = string + " " + string2;
        String string4 = ((mhr)jj2.cA((int)2)).Value;
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 7;
        ern2.YL = string3;
        ern2.izF = string4;
        ern2.izI = false;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void az(jj jj2) {
        int n;
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.trim().equals("")) {
            lfn.b(5, TC, "banPlayer() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.trim().equals("")) {
            lfn.b(5, TC, "banPlayer() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        String string3 = string + " " + string2;
        String string4 = ((mhr)jj2.cA((int)2)).Value;
        String string5 = ((mhr)jj2.cA((int)3)).Value;
        int n2 = 0;
        if (string5.length() >= 2) {
            n = 0;
            switch (string5.charAt(string5.length() - 1)) {
                case 'm': {
                    n = 1;
                    break;
                }
                case 'h': {
                    n = 60;
                    break;
                }
                case 'd': {
                    n = 1440;
                    break;
                }
                case 'w': {
                    n = 10080;
                    break;
                }
            }
            try {
                n2 = Integer.parseInt(string5.substring(0, string5.length() - 1));
                n2 *= n;
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        if (n2 <= 0) {
            jj2.b(lqd.rXj.bD(jj2.akV, string5), true);
            return;
        }
        n = hc.aaz.ordinal();
        if (this.aQ() != null) {
            n = this.aQ().jT().ordinal();
        }
        int n3 = 0;
        n3 = n >= hc.aaV.ordinal() ? Integer.MAX_VALUE : (n >= hc.aaU.ordinal() ? 10080 : (n >= hc.aaT.ordinal() ? 4320 : (n >= hc.aaS.ordinal() ? 1440 : 0)));
        if (n2 > n3) {
            jj2.b(lqd.rXj.bD(jj2.akV, string5), true);
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 7;
        ern2.YL = string3;
        ern2.izF = string4;
        ern2.izI = true;
        ern2.izG = n2;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void aA(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.trim().equals("")) {
            lfn.b(5, TC, "clearPlayerItems() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.trim().equals("")) {
            lfn.b(5, TC, "clearPlayerItems() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        String string3 = string + " " + string2;
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 23;
        ern2.YL = string3;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void aB(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.trim().equals("")) {
            lfn.b(5, TC, "popupTell() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.trim().equals("")) {
            lfn.b(5, TC, "popupTell() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        String string3 = string + " " + string2;
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 20;
        ern2.YL = string3;
        ern2.izF = ((mhr)jj2.cA((int)2)).Value;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void aC(jj jj2) {
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.trim().equals("")) {
            lfn.b(5, TC, "toggleNewbieProtection() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.trim().equals("")) {
            lfn.b(5, TC, "toggleNewbieProtection() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        String string3 = string + " " + string2;
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 79;
        ern2.YL = string3;
        ern2.izI = ((mhl)jj2.cA((int)2)).Pp;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void aD(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.trim().equals("")) {
            lfn.b(5, TC, "toggleNewbieProtection() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.trim().equals("")) {
            lfn.b(5, TC, "toggleNewbieProtection() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        String string3 = string + " " + string2;
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 17;
        ern2.YL = string3;
        ern2.izI = ((mhl)jj2.cA((int)2)).Pp;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void aE(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.trim().equals("")) {
            lfn.b(5, TC, "listPlayers() Name is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 18;
        ern2.YL = string;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void aF(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.trim().equals("")) {
            lfn.b(5, TC, "enableNotifications() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.trim().equals("")) {
            lfn.b(5, TC, "enableNotifications() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        String string3 = string + " " + string2;
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 28;
        ern2.YL = string3;
        ern2.izI = ((mhl)jj2.cA((int)2)).Pp;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void aG(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.trim().equals("")) {
            lfn.b(5, TC, "monitorToggle() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.trim().equals("")) {
            lfn.b(5, TC, "monitorToggle() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        String string3 = string + " " + string2;
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.YL = string3;
        ern2.izF = ((mhr)jj2.cA((int)2)).Value;
        ern2.ilu = ((mhl)jj2.cA((int)3)).Pp ? 10 : 11;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void aH(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 12;
        ern2.YL = jj2.getArgCount() > 0 ? ((mhr)jj2.cA((int)0)).Value : null;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void aI(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.trim().equals("")) {
            lfn.b(5, TC, "showPlayerBindstoneName() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.trim().equals("")) {
            lfn.b(5, TC, "showPlayerBindstoneName() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        String string3 = string + " " + string2;
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 37;
        ern2.YL = string3;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void aJ(jj jj2) {
        String string;
        if (!this.b(jj2)) {
            return;
        }
        String string2 = ((mhr)jj2.cA((int)0)).Value.trim();
        if (string2.isEmpty()) {
            lfn.b(5, TC, "changePlayerName() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV), true);
            return;
        }
        String string3 = ((mhr)jj2.cA((int)1)).Value.trim();
        if (string3.isEmpty()) {
            lfn.b(5, TC, "changePlayerName() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV), true);
            return;
        }
        String string4 = ((mhr)jj2.cA((int)2)).Value.trim();
        if (string4.isEmpty()) {
            lfn.b(5, TC, "changePlayerName() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV), true);
            return;
        }
        String string5 = ((mhr)jj2.cA((int)3)).Value.trim();
        if (string5.isEmpty()) {
            lfn.b(5, TC, "changePlayerName() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV), true);
            return;
        }
        String string6 = string2 + " " + string3;
        if (string6.equalsIgnoreCase(string = string4 + " " + string5)) {
            lfn.b(5, TC, "changePlayerName New name " + string6 + " old name " + string);
            jj2.b(lqd.rXj.bD(jj2.akV, string, string6), true);
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 26;
        ern2.YL = string6;
        ern2.izF = string;
        this.MessageDelegator.F(ern2);
    }

    private void aK(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.trim().equals("")) {
            lfn.b(5, TC, "playerMonitor() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.trim().equals("")) {
            lfn.b(5, TC, "playerMonitor() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        String string3 = string + " " + string2;
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, lcr.qCj);
        ern2.ilu = 13;
        ern2.YL = string3;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void aL(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.trim().equals("")) {
            lfn.b(5, TC, "resetCampFlag() FirstName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.trim().equals("")) {
            lfn.b(5, TC, "resetCampFlag() LastName is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        String string3 = string + " " + string2;
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 8;
        ern2.YL = string3;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private a bt(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    @Override
    public void nU() {
        this.a(a.aoo.toString().toLowerCase(), hc.aaS, lqf.rYb, mhs.STRING, mhs.STRING, mhs.BOOLEAN);
        this.a(a.aop.toString().toLowerCase(), hc.aaS, lqf.rYc, mhs.STRING, mhs.STRING, mhs.STRING, mhs.STRING);
        this.a(a.aoG.toString().toLowerCase(), hc.aaQ, lqf.rYd, mhs.STRING, mhs.STRING, mhs.INTEGER);
        this.a(a.aoq.toString().toLowerCase(), hc.aaR, lqf.rYe, mhs.STRING, mhs.STRING, mhs.STRING);
        this.a(a.aor.toString().toLowerCase(), hc.aaT, lqf.rYf, mhs.STRING, mhs.STRING);
        this.a(a.aos.toString().toLowerCase(), hc.aaP, lqf.rYg, mhs.STRING, mhs.FLOAT, mhs.STRING);
        this.a(a.aot.toString().toLowerCase(), hc.aaS, lqf.rYh, mhs.STRING, mhs.STRING, mhs.STRING, mhs.BOOLEAN);
        this.a(a.aou.toString().toLowerCase(), true, hc.aaS, lqf.rYi, mhs.STRING);
        this.a(a.aov.toString().toLowerCase(), hc.aaS, lqf.rYj, mhs.STRING, mhs.STRING);
        this.a(a.aow.toString().toLowerCase(), hc.aaV, lqf.rYk, mhs.STRING, mhs.STRING, mhs.BOOLEAN);
        this.a(a.aox.toString().toLowerCase(), hc.aaQ, lqf.rYm, mhs.STRING);
        this.a(a.aoz.toString().toLowerCase(), hc.aaQ, lqf.rYp, mhs.STRING, mhs.STRING, mhs.STRING);
        this.a(a.aoA.toString().toLowerCase(), hc.aaS, lqf.rYq, mhs.STRING, mhs.STRING);
        this.a(a.aoB.toString().toLowerCase(), hc.aaS, lqf.rYr);
        this.a(a.aoC.toString().toLowerCase(), hc.aaV, lqf.rYs, mhs.STRING, mhs.STRING);
        this.a(a.aoD.toString().toLowerCase(), hc.aaR, lqf.rYt, mhs.STRING, mhs.STRING);
        this.a(a.aoE.toString().toLowerCase(), true, hc.aaP, lqf.rYw, mhs.STRING, mhs.STRING, mhs.BOOLEAN);
        this.a(a.aoF.toString().toLowerCase(), hc.aaA, lqf.rYC, mhs.STRING, mhs.STRING, mhs.BOOLEAN);
    }
}

