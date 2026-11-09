/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  jps
 *  lcr
 *  lcw
 *  lqf
 */
public class kt
extends jk {
    private static final String TC = "SFConsoleCommandHandlerTeleport";

    @Override
    public void nU() {
        this.a(a.arB.toString().toLowerCase(), hc.aaR, lqf.rZN, mhs.STRING, mhs.STRING);
        this.a(a.arC.toString().toLowerCase(), hc.aaS, lqf.rZO, mhs.STRING, mhs.STRING);
        this.a(a.arD.toString().toLowerCase(), hc.aaR, lqf.rZP, mhs.STRING);
        this.a(a.arE.toString().toLowerCase(), hc.aaS, lqf.rZQ, mhs.STRING);
        this.a(a.arF.toString().toLowerCase(), hc.aaR, lqf.rZR, mhs.STRING);
        this.a(a.arG.toString().toLowerCase(), hc.aaS, lqf.rZS, mhs.STRING);
        this.a(a.arH.toString().toLowerCase(), hc.aaR, lqf.rZT, mhs.STRING);
        this.a(a.arI.toString().toLowerCase(), hc.aaS, lqf.rZU, mhs.STRING);
        this.a(a.arL.toString().toLowerCase(), true, hc.aaP, lqf.rZX, mhs.STRING, mhs.STRING, mhs.BOOLEAN);
        this.a(a.arM.toString().toLowerCase(), true, hc.aaP, lqf.rZY, mhs.STRING, mhs.STRING, mhs.BOOLEAN);
        this.a(a.arN.toString().toLowerCase(), true, hc.aaP, lqf.rZZ, mhs.STRING, mhs.STRING, mhs.BOOLEAN);
        this.a(a.arO.toString().toLowerCase(), true, hc.aaP, lqf.saa, mhs.STRING, mhs.STRING, mhs.BOOLEAN);
        this.a(a.arQ.toString().toLowerCase(), hc.aaR, lqf.sac, mhs.STRING, mhs.STRING);
        this.a(a.arS.toString().toLowerCase(), hc.aaT, lqf.sad, mhs.STRING, mhs.STRING);
        this.a(a.arR.toString().toLowerCase(), hc.aaS, lqf.sae, mhs.FLOAT);
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bG(jj2.akV);
        if (a2 == null) {
            jj2.b(lqd.rXd.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case arB: 
            case arC: {
                this.b(jj2, a2 == a.arC);
                break;
            }
            case arD: 
            case arE: {
                this.c(jj2, a2 == a.arE);
                break;
            }
            case arF: 
            case arG: {
                this.e(jj2, a2 == a.arG);
                break;
            }
            case arH: 
            case arI: {
                this.f(jj2, a2 == a.arI);
                break;
            }
            case arJ: 
            case arK: {
                this.d(jj2, a2 == a.arK);
                break;
            }
            case arL: 
            case arM: 
            case arN: 
            case arO: 
            case arP: {
                this.a(jj2, a2);
                break;
            }
            case arS: 
            case arQ: {
                this.g(jj2, a2 == a.arS);
                break;
            }
            case arR: {
                this.bz(jj2);
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }

    private void b(jj jj2, boolean bl) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.equals("")) {
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.equals("")) {
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 4;
        ern2.YL = string + " " + string2;
        ern2.izI = bl;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void c(jj jj2, boolean bl) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        ljq ljq2 = ljq.Aw(string);
        if (ljq2 == null) {
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 6;
        ern2.izI = bl;
        ern2.Position = ljq2;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void d(jj jj2, boolean bl) {
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
        ljq2.y += 500.0f;
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 6;
        ern2.izI = bl;
        ern2.Position = ljq2;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void a(jj jj2, a a2) {
        if (!this.b(jj2)) {
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.YL = ((mhr)jj2.cA((int)0)).Value;
        ern2.izI = jj2.getArgCount() > 2 ? ((mhl)jj2.cA((int)2)).Pp : false;
        switch (a2) {
            case arL: {
                ern2.ilu = 48;
                ern2.izF = ((mhr)jj2.cA((int)1)).Value;
                break;
            }
            case arM: {
                ern2.ilu = 49;
                ern2.Position = ljq.Aw(((mhr)jj2.cA((int)1)).Value);
                if (ern2.Position != null) break;
                jj2.b(lqd.rXj.bD(jj2.akV, ((mhr)jj2.cA((int)1)).Value), true);
                return;
            }
            case arN: {
                ern2.ilu = 49;
                String string = ((mhr)jj2.cA((int)1)).Value;
                ern2.Position = lcw.zh((String)string);
                if (ern2.Position == null) {
                    jj2.b(lqd.rXj.bD(jj2.akV, string), true);
                    return;
                }
                ern2.Position.x += 480.0f;
                ern2.Position.y += 500.0f;
                ern2.Position.rlV += 480.0f;
                break;
            }
            case arO: {
                ern2.ilu = 50;
                ern2.izF = ((mhr)jj2.cA((int)1)).Value;
                break;
            }
            case arP: {
                ern2.ilu = 49;
                String string = ((mhr)jj2.cA((int)1)).Value;
                lej lej2 = this.bc(string);
                if (lej2 == null) {
                    jj2.b(lqd.rXj.bD(jj2.akV, string), true);
                    return;
                }
                ern2.Position = lcw.e((lej)lej2);
                if (ern2.Position == null) {
                    jj2.b(lqd.rXj.bD(jj2.akV, string), true);
                    return;
                }
                ern2.Position.y += 500.0f;
                break;
            }
        }
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void e(jj jj2, boolean bl) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        ljq ljq2 = lcw.zh((String)string);
        if (ljq2 == null || ljq2.x == 0.0f && ljq2.y == 0.0f && ljq2.rlV == 0.0f) {
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        ljq2.x += 480.0f;
        ljq2.y += 500.0f;
        ljq2.rlV += 480.0f;
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 6;
        ern2.izI = bl;
        ern2.Position = ljq2;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void f(jj jj2, boolean bl) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.trim().equals("")) {
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 5;
        ern2.izF = string;
        ern2.izI = bl;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void g(jj jj2, boolean bl) {
        if (!this.b(jj2)) {
            return;
        }
        String string = ((mhr)jj2.cA((int)0)).Value;
        if (string.equals("")) {
            jj2.b(lqd.rXj.bD(jj2.akV, string), true);
            return;
        }
        String string2 = ((mhr)jj2.cA((int)1)).Value;
        if (string2.equals("")) {
            jj2.b(lqd.rXj.bD(jj2.akV, string2), true);
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 1;
        ern2.YL = string + " " + string2;
        ern2.izI = bl;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private void bz(jj jj2) {
        jps jps2;
        if (!this.b(jj2)) {
            return;
        }
        float f = ((mhn)jj2.cA((int)0)).Pz;
        if (f <= 0.0f) {
            jj2.b(lqd.rXj.bD(jj2.akV, "" + f), true);
            return;
        }
        if (f > 1000.0f) {
            f = 1000.0f;
        }
        if ((jps2 = (jps)this.MessageDelegator.bzx().bzt().d(lcr.qBR)) == null) {
            assert (false);
            return;
        }
        ern ern2 = (ern)this.MessageDelegator.h(16645, this.GUID, this.nW().getGUID());
        ern2.ilu = 27;
        ern2.Position = jps2.getCameraPosition();
        ern2.izF = jps2.bPR().toString();
        ern2.izH = f;
        this.MessageDelegator.F(ern2);
        jj2.nT();
    }

    private a bG(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }
}

