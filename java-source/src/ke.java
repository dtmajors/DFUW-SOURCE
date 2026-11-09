/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  jps
 *  lcr
 *  lqf
 */
public class ke
extends jk {
    private static final String TC = "SFConsoleCommandHandlerCamera";

    @Override
    public void nU() {
        this.a(a.anK.toString().toLowerCase(), hc.aaP, lqf.rZi);
        this.a(a.anL.toString().toLowerCase(), hc.aaP, lqf.rZj);
        this.a(a.anM.toString().toLowerCase(), hc.aaS, lqf.rZk);
        this.a(a.anN.toString().toLowerCase(), hc.aaQ, lqf.rZl, mhs.BOOLEAN);
        this.a(a.anO.toString().toLowerCase(), hc.aaA, lqf.rZm, mhs.FLOAT);
        this.a(a.anP.toString().toLowerCase(), hc.aaA, lqf.rZn, mhs.FLOAT);
        this.a(a.anQ.toString().toLowerCase(), hc.aaA, lqf.rZo, mhs.FLOAT);
        this.a(a.anR.toString().toLowerCase(), hc.aaA, lqf.rZp, mhs.FLOAT);
        this.a(a.anS.toString().toLowerCase(), hc.aaQ, lqf.rZq, mhs.FLOAT);
        this.a(a.anT.toString().toLowerCase(), hc.aaP, lqf.rZr, mhs.BOOLEAN);
        this.a(a.anU.toString().toLowerCase(), hc.aaP, lqf.rZs, mhs.FLOAT, mhs.FLOAT);
        this.a(a.anV.toString().toLowerCase(), hc.aaP, lqf.rZt, mhs.FLOAT, mhs.FLOAT);
        this.a(a.anW.toString().toLowerCase(), hc.aaP, lqf.rZu, mhs.FLOAT, mhs.FLOAT, mhs.FLOAT);
    }

    @Override
    public void a(jj jj2) {
        a a2 = this.bq(jj2.akV);
        if (a2 == null) {
            jj2.b(lqd.rXd.bD(jj2.akV), true);
            return;
        }
        switch (a2) {
            case anK: {
                this.or();
                jj2.nT();
                break;
            }
            case anL: {
                this.os();
                jj2.nT();
                break;
            }
            case anM: {
                this.ot();
                jj2.nT();
                break;
            }
            case anN: {
                this.ag(jj2);
                break;
            }
            case anO: {
                this.ah(jj2);
                break;
            }
            case anP: {
                this.ai(jj2);
                break;
            }
            case anQ: {
                this.aj(jj2);
                break;
            }
            case anR: {
                this.ak(jj2);
                break;
            }
            case anS: {
                this.al(jj2);
                break;
            }
            case anT: {
                this.am(jj2);
                break;
            }
            case anU: {
                this.an(jj2);
                break;
            }
            case anV: {
                this.ao(jj2);
                break;
            }
            case anW: {
                this.ap(jj2);
                break;
            }
            default: {
                jj2.b(lqd.rXk.bD(jj2.akV), true);
            }
        }
    }

    private void or() {
        jps jps2 = (jps)this.MessageDelegator.bzx().bzt().d(lcr.qBR);
        if (jps2 != null) {
            jps2.or();
        }
    }

    private void os() {
        jps jps2 = (jps)this.MessageDelegator.bzx().bzt().d(lcr.qBR);
        if (jps2 != null) {
            jps2.os();
        }
    }

    private void ot() {
        ecz ecz2 = (ecz)this.MessageDelegator.h(2052, this.GUID, lcr.qBR);
        ecz2.aZF = 3;
        this.MessageDelegator.F(ecz2);
    }

    private void ag(jj jj2) {
        boolean bl;
        jqb.nRj = bl = ((mhl)jj2.cA((int)0)).Pp;
        jj2.nT();
    }

    private void ah(jj jj2) {
        float f = ((mhn)jj2.cA((int)0)).Pz;
        if (f < 0.0f) {
            f = 0.0f;
        }
        jqb.nRm = f;
        jj2.nT();
    }

    private void ai(jj jj2) {
        float f = ((mhn)jj2.cA((int)0)).Pz;
        if (f <= 0.0f) {
            f = 0.0f + jqb.nRh;
        }
        if (jqb.nRl > (jqb.nRf = f)) {
            jqb.nRl = jqb.nRf;
        }
        jj2.nT();
    }

    private void aj(jj jj2) {
        float f = ((mhn)jj2.cA((int)0)).Pz;
        if (f > jqb.nRf) {
            f = jqb.nRf;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        jqb.nRl = f;
        jj2.nT();
    }

    private void ak(jj jj2) {
        float f = ((mhn)jj2.cA((int)0)).Pz;
        if (f < 0.0f) {
            f = 0.0f;
        }
        jqb.nRk = f;
        jj2.nT();
    }

    private void al(jj jj2) {
        float f = ((mhn)jj2.cA((int)0)).Pz;
        if (f < 1.0f) {
            f = 1.0f;
        }
        jqb.nRh = f;
        jj2.nT();
    }

    private a bq(String string) {
        for (a a2 : a.values()) {
            if (!a2.toString().equalsIgnoreCase(string)) continue;
            return a2;
        }
        return null;
    }

    private void am(jj jj2) {
        cew cew2 = this.nY();
        if (cew2 == null) {
            return;
        }
        cfg cfg2 = cew2.aMq();
        cfg2.setEnabled(((mhl)jj2.cA((int)0)).Pp);
        jj2.nT();
    }

    private void an(jj jj2) {
        cew cew2 = this.nY();
        if (cew2 == null) {
            return;
        }
        cfg cfg2 = cew2.aMq();
        cfg.a a2 = cfg2.aNp();
        if (a2 != null) {
            a2.eun = ((mhn)jj2.cA((int)0)).Pz;
            a2.euo = ((mhn)jj2.cA((int)1)).Pz;
        }
        jj2.nT();
    }

    private void ao(jj jj2) {
        cew cew2 = this.nY();
        if (cew2 == null) {
            return;
        }
        cfg cfg2 = cew2.aMq();
        cfg.a a2 = cfg2.aNp();
        if (a2 != null) {
            a2.eus = ((mhn)jj2.cA((int)0)).Pz;
            a2.eut = ((mhn)jj2.cA((int)1)).Pz;
        }
        jj2.nT();
    }

    private void ap(jj jj2) {
        cew cew2 = this.nY();
        if (cew2 == null) {
            return;
        }
        cfg cfg2 = cew2.aMq();
        cfg.a a2 = cfg2.aNp();
        if (a2 != null) {
            a2.eup = ((mhn)jj2.cA((int)0)).Pz;
            a2.euq = ((mhn)jj2.cA((int)1)).Pz;
            a2.eur = ((mhn)jj2.cA((int)2)).Pz;
        }
        jj2.nT();
    }
}

