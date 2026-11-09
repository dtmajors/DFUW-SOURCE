/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lqf
 */
public class kc
extends jk {
    private static final String TC = "SFConsoleCommandHandlerAction";

    @Override
    public void nU() {
        this.a(a.anl.toString().toLowerCase(), hc.aaP, lqf.rYN);
        this.a(a.anm.toString().toLowerCase(), hc.aaP, lqf.rYO);
        this.a(a.ann.toString().toLowerCase(), hc.aaP, lqf.rYP);
        this.a(a.ano.toString().toLowerCase(), hc.aaP, lqf.rYQ);
        this.a(a.anp.toString().toLowerCase(), hc.aaP, lqf.rYR);
        this.a(a.anq.toString().toLowerCase(), hc.aaP, lqf.rYS, mhs.STRING, mhs.FLOAT, mhs.FLOAT);
        this.a(a.anr.toString().toLowerCase(), hc.aaP, lqf.rYT);
        this.a(a.ans.toString().toLowerCase(), hc.aaP, lqf.rYU);
        this.a(a.ant.toString().toLowerCase(), hc.aaP, lqf.rYV);
        this.a(a.anu.toString().toLowerCase(), hc.aaP, lqf.rYW);
        this.a(a.anv.toString().toLowerCase(), hc.aaP, lqf.rYX, mhs.STRING);
        this.a(a.anw.toString().toLowerCase(), hc.aaP, lqf.rYY, mhs.STRING);
        this.a(a.anx.toString().toLowerCase(), hc.aaP, lqf.rYZ, mhs.STRING, mhs.STRING);
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bo(jj2.akV);
        if (a2 == null) {
            jj2.b(lqg.scy.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case anl: {
                this.a(1, jj2);
                break;
            }
            case anm: {
                this.a(3, jj2);
                break;
            }
            case ann: {
                this.a(2, jj2);
                break;
            }
            case ano: {
                this.a(4, jj2);
                break;
            }
            case anp: {
                this.a(5, jj2);
                break;
            }
            case anq: {
                this.ab(jj2);
                break;
            }
            case anr: {
                this.a(7, jj2);
                break;
            }
            case ans: {
                this.a(8, jj2);
                break;
            }
            case ant: {
                this.a(9, jj2);
                break;
            }
            case anu: {
                this.a(10, jj2);
                break;
            }
            case anv: {
                this.ac(jj2);
                break;
            }
            case anw: {
                this.ad(jj2);
                break;
            }
            case anx: {
                this.ae(jj2);
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }

    private a bo(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    private void a(int n, jj jj2) {
        assert (n > 0);
        ldv ldv2 = jj2.getTargetObjectGUID();
        if (ldv2 == null) {
            jj2.nT();
            return;
        }
        erc erc2 = (erc)this.MessageDelegator.h(16641, this.GUID, ldv2);
        erc2.ixE = n;
        this.MessageDelegator.F(erc2);
        jj2.nT();
    }

    private void ab(jj jj2) {
        String string = ((mhr)jj2.cA((int)0)).Value;
        int n = lea.enT().getType(string);
        if (n <= 0) {
            jj2.nT();
            return;
        }
        float f = ((mhn)jj2.cA((int)1)).Pz;
        if (f <= 0.0f) {
            jj2.nT();
            return;
        }
        float f2 = ((mhn)jj2.cA((int)2)).Pz;
        erc erc2 = (erc)this.MessageDelegator.h(16641, this.GUID, jj2.getTargetObjectGUID());
        erc2.ixE = 6;
        erc2.aYG = n;
        erc2.doT = f;
        erc2.Magnitude = f2;
        this.MessageDelegator.E(erc2);
        jj2.nT();
    }

    private void ac(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        ljq ljq2 = ljq.Aw("[" + string + "]");
        if (ljq2 == null) {
            jj2.nT();
            return;
        }
        ftz ftz2 = (ftz)this.MessageDelegator.h(1028, this.GUID, this.aQ().getGUID());
        ftz2.Position = ljq2;
        ftz2.Rotation = new lgl();
        this.MessageDelegator.F(ftz2);
        jj2.nT();
    }

    private void ad(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.equals("")) {
            jj2.b(lqd.rXg.bD(jj2.akV), true);
            return;
        }
        this.a(string, hc.aaA);
        jj2.nT();
    }

    private void ae(jj jj2) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.equals("")) {
            jj2.b(lqd.rXg.bD(jj2.akV), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.equals("")) {
            jj2.b(lqd.rXg.bD(jj2.akV), true);
            return;
        }
        hc hc2 = hc.getAccessLevelType(string2);
        if (hc2 == null) {
            lfn.b(5, TC, "setPlayerAccessLevel() AccessLevelName '" + string2 + "' is invalid.");
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        this.a(string, hc2);
        jj2.nT();
    }

    private void a(String string, hc hc2) {
        erd erd2 = (erd)this.MessageDelegator.h(16642, this.GUID, this.nW().getGUID());
        erd2.ilu = 1;
        erd2.YL = string;
        erd2.ff = hc2.ordinal();
        this.MessageDelegator.F(erd2);
    }
}

